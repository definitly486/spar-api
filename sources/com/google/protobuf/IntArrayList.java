package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST = new IntArrayList(new int[0], 0, false);
    private int[] array;
    private int size;

    IntArrayList() {
        this(new int[10], 0, true);
    }

    public static IntArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i13 = intArrayList.size;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.size;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        int[] iArr = this.array;
        if (i15 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i15);
        }
        System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i13) {
        ensureIsMutable();
        int i14 = this.size;
        int[] iArr = this.array;
        if (i14 == iArr.length) {
            int[] iArr2 = new int[((i14 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i15 = this.size;
        this.size = i15 + 1;
        iArr3[i15] = i13;
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
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i13 = 0; i13 < this.size; i13++) {
            if (this.array[i13] != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i13) {
        ensureIndexInRange(i13);
        return this.array[i13];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.size; i14++) {
            i13 = (i13 * 31) + this.array[i14];
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (this.array[i13] == iIntValue) {
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
        int[] iArr = this.array;
        System.arraycopy(iArr, i14, iArr, i13, this.size - i14);
        this.size -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i13, int i14) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        int[] iArr = this.array;
        int i15 = iArr[i13];
        iArr[i13] = i14;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i13, boolean z13) {
        super(z13);
        this.array = iArr;
        this.size = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i13) {
        return Integer.valueOf(getInt(i13));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i13) {
        if (i13 >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, i13), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        int[] iArr = this.array;
        int i14 = iArr[i13];
        int i15 = this.size;
        if (i13 < i15 - 1) {
            System.arraycopy(iArr, i13 + 1, iArr, i13, (i15 - i13) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i14);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i13, Integer num) {
        return Integer.valueOf(setInt(i13, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i13, Integer num) {
        addInt(i13, num.intValue());
    }

    private void addInt(int i13, int i14) {
        int i15;
        ensureIsMutable();
        if (i13 >= 0 && i13 <= (i15 = this.size)) {
            int[] iArr = this.array;
            if (i15 < iArr.length) {
                System.arraycopy(iArr, i13, iArr, i13 + 1, i15 - i13);
            } else {
                int[] iArr2 = new int[((i15 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i13);
                System.arraycopy(this.array, i13, iArr2, i13 + 1, this.size - i13);
                this.array = iArr2;
            }
            this.array[i13] = i14;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
    }
}
