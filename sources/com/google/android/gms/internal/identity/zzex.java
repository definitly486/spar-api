package com.google.android.gms.internal.identity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzex extends zzeu implements List, RandomAccess {
    private static final zzfa zza = new zzev(zzey.zza, 0);

    zzex() {
    }

    public static zzex zzi() {
        return zzey.zza;
    }

    public static zzex zzj(Collection collection) {
        if (collection instanceof zzeu) {
            zzex zzexVarZze = ((zzeu) collection).zze();
            if (!zzexVarZze.zzf()) {
                return zzexVarZze;
            }
            Object[] array = zzexVarZze.toArray();
            return zzk(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (array2[i13] == null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 9);
                sb3.append("at index ");
                sb3.append(i13);
                throw new NullPointerException(sb3.toString());
            }
        }
        return zzk(array2, length);
    }

    static zzex zzk(Object[] objArr, int i13) {
        return i13 == 0 ? zzey.zza : new zzey(objArr, i13);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i13 = 0; i13 < size; i13++) {
                        if (zzeq.zza(get(i13), list.get(i13))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && zzeq.zza(it.next(), it2.next())) {
                    }
                }
                if (!it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i13 = 0; i13 < size; i13++) {
            iHashCode = (iHashCode * 31) + get(i13).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (obj.equals(get(i13))) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.identity.zzeu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    /* JADX INFO: renamed from: zza */
    public final zzez iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    @Deprecated
    public final zzex zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    int zzg(Object[] objArr, int i13) {
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            objArr[i14] = get(i14);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzex subList(int i13, int i14) {
        zzer.zze(i13, i14, size());
        int i15 = i14 - i13;
        if (i15 == size()) {
            return this;
        }
        return i15 == 0 ? zzey.zza : new zzew(this, i13, i15);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzfa listIterator(int i13) {
        zzer.zzd(i13, size(), "index");
        return isEmpty() ? zza : new zzev(this, i13);
    }
}
