package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzer extends zzdr implements RandomAccess, zzez, zzge {
    private static final zzer zza = new zzer(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    zzer() {
        this(new float[10], 0, true);
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
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i13));
        }
        float[] fArr = this.zzb;
        if (i14 < fArr.length) {
            System.arraycopy(fArr, i13, fArr, i13 + 1, i14 - i13);
        } else {
            float[] fArr2 = new float[((i14 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i13);
            System.arraycopy(this.zzb, i13, fArr2, i13 + 1, this.zzc - i13);
            this.zzb = fArr2;
        }
        this.zzb[i13] = fFloatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzerVar = (zzer) collection;
        int i13 = zzerVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        float[] fArr = this.zzb;
        if (i15 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i15);
        }
        System.arraycopy(zzerVar.zzb, 0, this.zzb, this.zzc, zzerVar.zzc);
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
        if (!(obj instanceof zzer)) {
            return super.equals(obj);
        }
        zzer zzerVar = (zzer) obj;
        if (this.zzc != zzerVar.zzc) {
            return false;
        }
        float[] fArr = zzerVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (Float.floatToIntBits(this.zzb[i13]) != Float.floatToIntBits(fArr[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzg(i13);
        return Float.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzb[i13]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == fFloatValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzg(i13);
        float[] fArr = this.zzb;
        float f13 = fArr[i13];
        int i14 = this.zzc;
        if (i13 < i14 - 1) {
            System.arraycopy(fArr, i13 + 1, fArr, i13, (i14 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f13);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i14, fArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        zzg(i13);
        float[] fArr = this.zzb;
        float f13 = fArr[i13];
        fArr[i13] = fFloatValue;
        return Float.valueOf(f13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzer(Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f13) {
        zza();
        int i13 = this.zzc;
        float[] fArr = this.zzb;
        if (i13 == fArr.length) {
            float[] fArr2 = new float[((i13 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i13);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        fArr3[i14] = f13;
    }

    private zzer(float[] fArr, int i13, boolean z13) {
        super(z13);
        this.zzb = fArr;
        this.zzc = i13;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
