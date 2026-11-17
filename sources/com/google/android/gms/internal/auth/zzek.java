package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzek extends zzdr implements RandomAccess, zzez, zzge {
    private static final zzek zza = new zzek(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    zzek() {
        this(new double[10], 0, true);
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
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i13));
        }
        double[] dArr = this.zzb;
        if (i14 < dArr.length) {
            System.arraycopy(dArr, i13, dArr, i13 + 1, i14 - i13);
        } else {
            double[] dArr2 = new double[((i14 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i13);
            System.arraycopy(this.zzb, i13, dArr2, i13 + 1, this.zzc - i13);
            this.zzb = dArr2;
        }
        this.zzb[i13] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzek)) {
            return super.addAll(collection);
        }
        zzek zzekVar = (zzek) collection;
        int i13 = zzekVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        double[] dArr = this.zzb;
        if (i15 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i15);
        }
        System.arraycopy(zzekVar.zzb, 0, this.zzb, this.zzc, zzekVar.zzc);
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
        if (!(obj instanceof zzek)) {
            return super.equals(obj);
        }
        zzek zzekVar = (zzek) obj;
        if (this.zzc != zzekVar.zzc) {
            return false;
        }
        double[] dArr = zzekVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (Double.doubleToLongBits(this.zzb[i13]) != Double.doubleToLongBits(dArr[i13])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzg(i13);
        return Double.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i14]);
            byte[] bArr = zzfa.zzd;
            i13 = (i13 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == dDoubleValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzg(i13);
        double[] dArr = this.zzb;
        double d13 = dArr[i13];
        int i14 = this.zzc;
        if (i13 < i14 - 1) {
            System.arraycopy(dArr, i13 + 1, dArr, i13, (i14 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d13);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i14, dArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzg(i13);
        double[] dArr = this.zzb;
        double d13 = dArr[i13];
        dArr[i13] = dDoubleValue;
        return Double.valueOf(d13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzek(Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d13) {
        zza();
        int i13 = this.zzc;
        double[] dArr = this.zzb;
        if (i13 == dArr.length) {
            double[] dArr2 = new double[((i13 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i13);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        dArr3[i14] = d13;
    }

    private zzek(double[] dArr, int i13, boolean z13) {
        super(z13);
        this.zzb = dArr;
        this.zzc = i13;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
