package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzgg extends zzdr implements RandomAccess {
    private static final zzgg zza = new zzgg(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    zzgg() {
        this(new Object[10], 0, true);
    }

    public static zzgg zze() {
        return zza;
    }

    private final String zzf(int i13) {
        return "Index:" + i13 + ", Size:" + this.zzc;
    }

    private final void zzg(int i13) {
        if (i13 < 0 || i13 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i13));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i13));
        }
        Object[] objArr = this.zzb;
        if (i14 < objArr.length) {
            System.arraycopy(objArr, i13, objArr, i13 + 1, i14 - i13);
        } else {
            Object[] objArr2 = new Object[((i14 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i13);
            System.arraycopy(this.zzb, i13, objArr2, i13 + 1, this.zzc - i13);
            this.zzb = objArr2;
        }
        this.zzb[i13] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        zzg(i13);
        return this.zzb[i13];
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        zza();
        zzg(i13);
        Object[] objArr = this.zzb;
        Object obj = objArr[i13];
        int i14 = this.zzc;
        if (i13 < i14 - 1) {
            System.arraycopy(objArr, i13 + 1, objArr, i13, (i14 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        zza();
        zzg(i13);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzgg(Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzgg(Object[] objArr, int i13, boolean z13) {
        super(z13);
        this.zzb = objArr;
        this.zzc = i13;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i13 = this.zzc;
        Object[] objArr = this.zzb;
        if (i13 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i13 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        objArr2[i14] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
