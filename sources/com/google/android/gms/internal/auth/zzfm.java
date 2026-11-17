package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzfm extends zzdr implements RandomAccess, zzez, zzge {
    private static final zzfm zza = new zzfm(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    zzfm() {
        this(new long[10], 0, true);
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
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i13));
        }
        long[] jArr = this.zzb;
        if (i14 < jArr.length) {
            System.arraycopy(jArr, i13, jArr, i13 + 1, i14 - i13);
        } else {
            long[] jArr2 = new long[((i14 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            System.arraycopy(this.zzb, i13, jArr2, i13 + 1, this.zzc - i13);
            this.zzb = jArr2;
        }
        this.zzb[i13] = jLongValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzfm)) {
            return super.addAll(collection);
        }
        zzfm zzfmVar = (zzfm) collection;
        int i13 = zzfmVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        long[] jArr = this.zzb;
        if (i15 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i15);
        }
        System.arraycopy(zzfmVar.zzb, 0, this.zzb, this.zzc, zzfmVar.zzc);
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
        if (!(obj instanceof zzfm)) {
            return super.equals(obj);
        }
        zzfm zzfmVar = (zzfm) obj;
        if (this.zzc != zzfmVar.zzc) {
            return false;
        }
        long[] jArr = zzfmVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (this.zzb[i13] != jArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzg(i13);
        return Long.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            long j13 = this.zzb[i14];
            byte[] bArr = zzfa.zzd;
            i13 = (i13 * 31) + ((int) (j13 ^ (j13 >>> 32)));
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == jLongValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzg(i13);
        long[] jArr = this.zzb;
        long j13 = jArr[i13];
        int i14 = this.zzc;
        if (i13 < i14 - 1) {
            System.arraycopy(jArr, i13 + 1, jArr, i13, (i14 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i14, jArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        zzg(i13);
        long[] jArr = this.zzb;
        long j13 = jArr[i13];
        jArr[i13] = jLongValue;
        return Long.valueOf(j13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzfm(Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(long j13) {
        zza();
        int i13 = this.zzc;
        long[] jArr = this.zzb;
        if (i13 == jArr.length) {
            long[] jArr2 = new long[((i13 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i13);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        jArr3[i14] = j13;
    }

    private zzfm(long[] jArr, int i13, boolean z13) {
        super(z13);
        this.zzb = jArr;
        this.zzc = i13;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Long) obj).longValue());
        return true;
    }
}
