package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST = new DoubleArrayList(new double[0], 0, false);
    private double[] array;
    private int size;

    DoubleArrayList() {
        this(new double[10], 0, true);
    }

    public static DoubleArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i13 = doubleArrayList.size;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.size;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        double[] dArr = this.array;
        if (i15 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i15);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double d13) {
        ensureIsMutable();
        int i13 = this.size;
        double[] dArr = this.array;
        if (i13 == dArr.length) {
            double[] dArr2 = new double[((i13 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i13);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i14 = this.size;
        this.size = i14 + 1;
        dArr3[i14] = d13;
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
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i13 = 0; i13 < this.size; i13++) {
            if (Double.doubleToLongBits(this.array[i13]) != Double.doubleToLongBits(dArr[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int i13) {
        ensureIndexInRange(i13);
        return this.array[i13];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i13 = 0; i13 < this.size; i13++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i13]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (this.array[i13] == dDoubleValue) {
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
        double[] dArr = this.array;
        System.arraycopy(dArr, i14, dArr, i13, this.size - i14);
        this.size -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int i13, double d13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        double[] dArr = this.array;
        double d14 = dArr[i13];
        dArr[i13] = d13;
        return d14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] dArr, int i13, boolean z13) {
        super(z13);
        this.array = dArr;
        this.size = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i13) {
        return Double.valueOf(getDouble(i13));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i13) {
        if (i13 >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, i13), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int i13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        double[] dArr = this.array;
        double d13 = dArr[i13];
        int i14 = this.size;
        if (i13 < i14 - 1) {
            System.arraycopy(dArr, i13 + 1, dArr, i13, (i14 - i13) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d13);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double set(int i13, Double d13) {
        return Double.valueOf(setDouble(i13, d13.doubleValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d13) {
        addDouble(d13.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i13, Double d13) {
        addDouble(i13, d13.doubleValue());
    }

    private void addDouble(int i13, double d13) {
        int i14;
        ensureIsMutable();
        if (i13 >= 0 && i13 <= (i14 = this.size)) {
            double[] dArr = this.array;
            if (i14 < dArr.length) {
                System.arraycopy(dArr, i13, dArr, i13 + 1, i14 - i13);
            } else {
                double[] dArr2 = new double[((i14 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i13);
                System.arraycopy(this.array, i13, dArr2, i13 + 1, this.size - i13);
                this.array = dArr2;
            }
            this.array[i13] = d13;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
    }
}
