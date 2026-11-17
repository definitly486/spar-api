package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST = new BooleanArrayList(new boolean[0], 0, false);
    private boolean[] array;
    private int size;

    BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    public static BooleanArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i13 = booleanArrayList.size;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.size;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        boolean[] zArr = this.array;
        if (i15 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i15);
        }
        System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
        this.size = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public void addBoolean(boolean z13) {
        ensureIsMutable();
        int i13 = this.size;
        boolean[] zArr = this.array;
        if (i13 == zArr.length) {
            boolean[] zArr2 = new boolean[((i13 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i13);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i14 = this.size;
        this.size = i14 + 1;
        zArr3[i14] = z13;
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
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i13 = 0; i13 < this.size; i13++) {
            if (this.array[i13] != zArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean getBoolean(int i13) {
        ensureIndexInRange(i13);
        return this.array[i13];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i13 = 0; i13 < this.size; i13++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.array[i13]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (this.array[i13] == zBooleanValue) {
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
        boolean[] zArr = this.array;
        System.arraycopy(zArr, i14, zArr, i13, this.size - i14);
        this.size -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean setBoolean(int i13, boolean z13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        boolean[] zArr = this.array;
        boolean z14 = zArr[i13];
        zArr[i13] = z13;
        return z14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private BooleanArrayList(boolean[] zArr, int i13, boolean z13) {
        super(z13);
        this.array = zArr;
        this.size = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i13) {
        return Boolean.valueOf(getBoolean(i13));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i13) {
        if (i13 >= this.size) {
            return new BooleanArrayList(Arrays.copyOf(this.array, i13), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int i13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        boolean[] zArr = this.array;
        boolean z13 = zArr[i13];
        int i14 = this.size;
        if (i13 < i14 - 1) {
            System.arraycopy(zArr, i13 + 1, zArr, i13, (i14 - i13) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z13);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean set(int i13, Boolean bool) {
        return Boolean.valueOf(setBoolean(i13, bool.booleanValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i13, Boolean bool) {
        addBoolean(i13, bool.booleanValue());
    }

    private void addBoolean(int i13, boolean z13) {
        int i14;
        ensureIsMutable();
        if (i13 >= 0 && i13 <= (i14 = this.size)) {
            boolean[] zArr = this.array;
            if (i14 < zArr.length) {
                System.arraycopy(zArr, i13, zArr, i13 + 1, i14 - i13);
            } else {
                boolean[] zArr2 = new boolean[((i14 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i13);
                System.arraycopy(this.array, i13, zArr2, i13 + 1, this.size - i13);
                this.array = zArr2;
            }
            this.array[i13] = z13;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
    }
}
