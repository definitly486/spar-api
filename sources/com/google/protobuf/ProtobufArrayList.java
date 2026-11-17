package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST = new ProtobufArrayList<>(new Object[0], 0, false);
    private E[] array;
    private int size;

    ProtobufArrayList() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i13) {
        return (E[]) new Object[i13];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int i13) {
        if (i13 < 0 || i13 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i13) {
        return "Index:" + i13 + ", Size:" + this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e13) {
        ensureIsMutable();
        int i13 = this.size;
        E[] eArr = this.array;
        if (i13 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i13 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i14 = this.size;
        this.size = i14 + 1;
        eArr2[i14] = e13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i13) {
        ensureIndexInRange(i13);
        return this.array[i13];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        E[] eArr = this.array;
        E e13 = eArr[i13];
        int i14 = this.size;
        if (i13 < i14 - 1) {
            System.arraycopy(eArr, i13 + 1, eArr, i13, (i14 - i13) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e13;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i13, E e13) {
        ensureIsMutable();
        ensureIndexInRange(i13);
        E[] eArr = this.array;
        E e14 = eArr[i13];
        eArr[i13] = e13;
        ((AbstractList) this).modCount++;
        return e14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i13, boolean z13) {
        super(z13);
        this.array = eArr;
        this.size = i13;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int i13) {
        if (i13 >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, i13), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i13, E e13) {
        int i14;
        ensureIsMutable();
        if (i13 >= 0 && i13 <= (i14 = this.size)) {
            E[] eArr = this.array;
            if (i14 < eArr.length) {
                System.arraycopy(eArr, i13, eArr, i13 + 1, i14 - i13);
            } else {
                E[] eArr2 = (E[]) createArray(((i14 * 3) / 2) + 1);
                System.arraycopy(this.array, 0, eArr2, 0, i13);
                System.arraycopy(this.array, i13, eArr2, i13 + 1, this.size - i13);
                this.array = eArr2;
            }
            this.array[i13] = e13;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i13));
    }
}
