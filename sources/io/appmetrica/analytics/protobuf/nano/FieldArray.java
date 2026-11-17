package io.appmetrica.analytics.protobuf.nano;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldArray implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (iArr[i14] != iArr2[i14]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i13) {
        int i14 = this.mSize - 1;
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) >>> 1;
            int i17 = this.mFieldNumbers[i16];
            if (i17 < i13) {
                i15 = i16 + 1;
            } else {
                if (i17 <= i13) {
                    return i16;
                }
                i14 = i16 - 1;
            }
        }
        return ~i15;
    }

    private void gc() {
        int i13 = this.mSize;
        int[] iArr = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            FieldData fieldData = fieldDataArr[i15];
            if (fieldData != DELETED) {
                if (i15 != i14) {
                    iArr[i14] = iArr[i15];
                    fieldDataArr[i14] = fieldData;
                    fieldDataArr[i15] = null;
                }
                i14++;
            }
        }
        this.mGarbage = false;
        this.mSize = i14;
    }

    private int idealByteArraySize(int i13) {
        for (int i14 = 4; i14 < 32; i14++) {
            int i15 = (1 << i14) - 12;
            if (i13 <= i15) {
                return i15;
            }
        }
        return i13;
    }

    private int idealIntArraySize(int i13) {
        return idealByteArraySize(i13 * 4) / 4;
    }

    FieldData dataAt(int i13) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i13];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray) obj;
        if (size() != fieldArray.size()) {
            return false;
        }
        return arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    FieldData get(int i13) {
        FieldData fieldData;
        int iBinarySearch = binarySearch(i13);
        if (iBinarySearch < 0 || (fieldData = this.mData[iBinarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int iHashCode = 17;
        for (int i13 = 0; i13 < this.mSize; i13++) {
            iHashCode = (((iHashCode * 31) + this.mFieldNumbers[i13]) * 31) + this.mData[i13].hashCode();
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    void put(int i13, FieldData fieldData) {
        int iBinarySearch = binarySearch(i13);
        if (iBinarySearch >= 0) {
            this.mData[iBinarySearch] = fieldData;
            return;
        }
        int i14 = ~iBinarySearch;
        int i15 = this.mSize;
        if (i14 < i15) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i14] == DELETED) {
                this.mFieldNumbers[i14] = i13;
                fieldDataArr[i14] = fieldData;
                return;
            }
        }
        if (this.mGarbage && i15 >= this.mFieldNumbers.length) {
            gc();
            i14 = ~binarySearch(i13);
        }
        int i16 = this.mSize;
        if (i16 >= this.mFieldNumbers.length) {
            int iIdealIntArraySize = idealIntArraySize(i16 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            FieldData[] fieldDataArr2 = new FieldData[iIdealIntArraySize];
            int[] iArr2 = this.mFieldNumbers;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            FieldData[] fieldDataArr3 = this.mData;
            System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr2;
        }
        int i17 = this.mSize - i14;
        if (i17 != 0) {
            int[] iArr3 = this.mFieldNumbers;
            int i18 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i18, i17);
            FieldData[] fieldDataArr4 = this.mData;
            System.arraycopy(fieldDataArr4, i14, fieldDataArr4, i18, this.mSize - i14);
        }
        this.mFieldNumbers[i14] = i13;
        this.mData[i14] = fieldData;
        this.mSize++;
    }

    void remove(int i13) {
        int iBinarySearch = binarySearch(i13);
        if (iBinarySearch >= 0) {
            FieldData[] fieldDataArr = this.mData;
            FieldData fieldData = fieldDataArr[iBinarySearch];
            FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[iBinarySearch] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    FieldArray(int i13) {
        this.mGarbage = false;
        int iIdealIntArraySize = idealIntArraySize(i13);
        this.mFieldNumbers = new int[iIdealIntArraySize];
        this.mData = new FieldData[iIdealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (!fieldDataArr[i14].equals(fieldDataArr2[i14])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final FieldArray m8clone() {
        int size = size();
        FieldArray fieldArray = new FieldArray(size);
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        for (int i13 = 0; i13 < size; i13++) {
            FieldData fieldData = this.mData[i13];
            if (fieldData != null) {
                fieldArray.mData[i13] = fieldData.m9clone();
            }
        }
        fieldArray.mSize = size;
        return fieldArray;
    }
}
