package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST = new FloatArrayList(new float[0], 0, false);
    private float[] array;
    private int size;

    FloatArrayList() {
        this(new float[10], 0, true);
    }

    public static FloatArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i13) {
        if (i13 < 0 || i13 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i13) {
        return "Index:" + i13 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i13 = floatArrayList.size;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.size;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        float[] fArr = this.array;
        if (i15 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i15);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float f13) {
        ensureIsMutable();
        int i13 = this.size;
        float[] fArr = this.array;
        if (i13 == fArr.length) {
            float[] fArr2 = new float[((i13 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i13);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i14 = this.size;
        this.size = i14 + 1;
        fArr3[i14] = f13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i13 = 0; i13 < this.size; i13++) {
            if (Float.floatToIntBits(this.array[i13]) != Float.floatToIntBits(fArr[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int i13) {
        ensureIndexInRange(i13);
        return this.array[i13];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i13 = 0; i13 < this.size; i13++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i13]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (this.array[i13] == fFloatValue) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i13, int i14) {
        ensureIsMutable();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.array;
        System.arraycopy(fArr, i14, fArr, i13, this.size - i14);
        this.size -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int i13, float f13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        float[] fArr = this.array;
        float f14 = fArr[i13];
        fArr[i13] = f13;
        return f14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] fArr, int i13, boolean z13) {
        super(z13);
        this.array = fArr;
        this.size = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i13) {
        return Float.valueOf(getFloat(i13));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i13) {
        if (i13 >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, i13), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int i13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        float[] fArr = this.array;
        float f13 = fArr[i13];
        int i14 = this.size;
        if (i13 < i14 - 1) {
            System.arraycopy(fArr, i13 + 1, fArr, i13, (i14 - i13) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f13);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int i13, Float f13) {
        return Float.valueOf(setFloat(i13, f13.floatValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f13) {
        addFloat(f13.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i13, Float f13) {
        addFloat(i13, f13.floatValue());
    }

    private void addFloat(int i13, float f13) {
        int i14;
        ensureIsMutable();
        if (i13 >= 0 && i13 <= (i14 = this.size)) {
            float[] fArr = this.array;
            if (i14 < fArr.length) {
                System.arraycopy(fArr, i13, fArr, i13 + 1, i14 - i13);
            } else {
                float[] fArr2 = new float[((i14 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i13);
                System.arraycopy(this.array, i13, fArr2, i13 + 1, this.size - i13);
                this.array = fArr2;
            }
            this.array[i13] = f13;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
    }
}
