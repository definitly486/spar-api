package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import zl.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        zoijcleaow zoijcleaowVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            zoijcleaowVar.add(arrayList.get(i13).freeze());
        }
        return zoijcleaowVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        zoijcleaow zoijcleaowVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            zoijcleaowVar.add(it.next().freeze());
        }
        return zoijcleaowVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        zoijcleaow zoijcleaowVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e13 : eArr) {
            zoijcleaowVar.add(e13.freeze());
        }
        return zoijcleaowVar;
    }
}
