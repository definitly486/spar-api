package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzdv extends zzdr implements RandomAccess, zzez, zzge {
    private static final zzdv zza = new zzdv(new boolean[0], 0, false);
    private boolean[] zzb;
    private int zzc;

    zzdv() {
        this(new boolean[10], 0, true);
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
    public final /* synthetic */ void add(int i13, Object obj) {
        int i14;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i13));
        }
        boolean[] zArr = this.zzb;
        if (i14 < zArr.length) {
            System.arraycopy(zArr, i13, zArr, i13 + 1, i14 - i13);
        } else {
            boolean[] zArr2 = new boolean[((i14 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i13);
            System.arraycopy(this.zzb, i13, zArr2, i13 + 1, this.zzc - i13);
            this.zzb = zArr2;
        }
        this.zzb[i13] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzdv)) {
            return super.addAll(collection);
        }
        zzdv zzdvVar = (zzdv) collection;
        int i13 = zzdvVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        boolean[] zArr = this.zzb;
        if (i15 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i15);
        }
        System.arraycopy(zzdvVar.zzb, 0, this.zzb, this.zzc, zzdvVar.zzc);
        this.zzc = i15;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdv)) {
            return super.equals(obj);
        }
        zzdv zzdvVar = (zzdv) obj;
        if (this.zzc != zzdvVar.zzc) {
            return false;
        }
        boolean[] zArr = zzdvVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (this.zzb[i13] != zArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzg(i13);
        return Boolean.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            iZza = (iZza * 31) + zzfa.zza(this.zzb[i13]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == zBooleanValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzg(i13);
        boolean[] zArr = this.zzb;
        boolean z13 = zArr[i13];
        int i14 = this.zzc;
        if (i13 < i14 - 1) {
            System.arraycopy(zArr, i13 + 1, zArr, i13, (i14 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z13);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i14, zArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i13);
        boolean[] zArr = this.zzb;
        boolean z13 = zArr[i13];
        zArr[i13] = zBooleanValue;
        return Boolean.valueOf(z13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzdv(Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z13) {
        zza();
        int i13 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i13 == zArr.length) {
            boolean[] zArr2 = new boolean[((i13 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i13);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        zArr3[i14] = z13;
    }

    private zzdv(boolean[] zArr, int i13, boolean z13) {
        super(z13);
        this.zzb = zArr;
        this.zzc = i13;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
