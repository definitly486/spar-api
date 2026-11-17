package com.yandex.runtime.bindings.internal;

import com.yandex.runtime.NativeObject;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
class Vector<E> extends AbstractList<E> implements RandomAccess {
    private ArrayList<E> list;
    private int listSize = sizeNative();
    private NativeObject nativeObject;

    public Vector(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // java.util.AbstractList, java.util.List
    public synchronized E get(int i13) {
        E e13;
        try {
            if (this.list == null) {
                this.list = new ArrayList<>(this.listSize);
                for (int i14 = 0; i14 != this.listSize; i14++) {
                    this.list.add(null);
                }
            }
            e13 = this.list.get(i13);
            if (e13 == null) {
                e13 = getNative(i13);
                this.list.set(i13, e13);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e13;
    }

    public native E getNative(int i13);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.listSize;
    }

    public native int sizeNative();
}
