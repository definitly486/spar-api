package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST = new LongArrayList(new long[0], 0, false);
    private long[] array;
    private int size;

    LongArrayList() {
        this(new long[10], 0, true);
    }

    public static LongArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i13 = longArrayList.size;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.size;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        long[] jArr = this.array;
        if (i15 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i15);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j13) {
        ensureIsMutable();
        int i13 = this.size;
        long[] jArr = this.array;
        if (i13 == jArr.length) {
            long[] jArr2 = new long[((i13 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i14 = this.size;
        this.size = i14 + 1;
        jArr3[i14] = j13;
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
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i13 = 0; i13 < this.size; i13++) {
            if (this.array[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i13) {
        ensureIndexInRange(i13);
        return this.array[i13];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i13 = 0; i13 < this.size; i13++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.array[i13]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (this.array[i13] == jLongValue) {
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
        long[] jArr = this.array;
        System.arraycopy(jArr, i14, jArr, i13, this.size - i14);
        this.size -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i13, long j13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        long[] jArr = this.array;
        long j14 = jArr[i13];
        jArr[i13] = j13;
        return j14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i13, boolean z13) {
        super(z13);
        this.array = jArr;
        this.size = i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i13) {
        return Long.valueOf(getLong(i13));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i13) {
        if (i13 >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i13), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        long[] jArr = this.array;
        long j13 = jArr[i13];
        int i14 = this.size;
        if (i13 < i14 - 1) {
            System.arraycopy(jArr, i13 + 1, jArr, i13, (i14 - i13) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j13);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i13, Long l13) {
        return Long.valueOf(setLong(i13, l13.longValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l13) {
        addLong(l13.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i13, Long l13) {
        addLong(i13, l13.longValue());
    }

    private void addLong(int i13, long j13) {
        int i14;
        ensureIsMutable();
        if (i13 >= 0 && i13 <= (i14 = this.size)) {
            long[] jArr = this.array;
            if (i14 < jArr.length) {
                System.arraycopy(jArr, i13, jArr, i13 + 1, i14 - i13);
            } else {
                long[] jArr2 = new long[((i14 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i13);
                System.arraycopy(this.array, i13, jArr2, i13 + 1, this.size - i13);
                this.array = jArr2;
            }
            this.array[i13] = j13;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
    }
}
