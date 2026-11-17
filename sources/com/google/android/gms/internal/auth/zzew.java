package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzew extends zzdr implements RandomAccess, zzez, zzge {
    private static final zzew zza = new zzew(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    zzew() {
        this(new int[10], 0, true);
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
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i13 < 0 || i13 > (i14 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i13));
        }
        int[] iArr = this.zzb;
        if (i14 < iArr.length) {
            System.arraycopy(iArr, i13, iArr, i13 + 1, i14 - i13);
        } else {
            int[] iArr2 = new int[((i14 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            System.arraycopy(this.zzb, i13, iArr2, i13 + 1, this.zzc - i13);
            this.zzb = iArr2;
        }
        this.zzb[i13] = iIntValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzew)) {
            return super.addAll(collection);
        }
        zzew zzewVar = (zzew) collection;
        int i13 = zzewVar.zzc;
        if (i13 == 0) {
            return false;
        }
        int i14 = this.zzc;
        if (Integer.MAX_VALUE - i14 < i13) {
            throw new OutOfMemoryError();
        }
        int i15 = i14 + i13;
        int[] iArr = this.zzb;
        if (i15 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i15);
        }
        System.arraycopy(zzewVar.zzb, 0, this.zzb, this.zzc, zzewVar.zzc);
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
        if (!(obj instanceof zzew)) {
            return super.equals(obj);
        }
        zzew zzewVar = (zzew) obj;
        if (this.zzc != zzewVar.zzc) {
            return false;
        }
        int[] iArr = zzewVar.zzb;
        for (int i13 = 0; i13 < this.zzc; i13++) {
            if (this.zzb[i13] != iArr[i13]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i13) {
        zzg(i13);
        return Integer.valueOf(this.zzb[i13]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.zzc; i14++) {
            i13 = (i13 * 31) + this.zzb[i14];
        }
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i13 = this.zzc;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.zzb[i14] == iIntValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        zza();
        zzg(i13);
        int[] iArr = this.zzb;
        int i14 = iArr[i13];
        int i15 = this.zzc;
        if (i13 < i15 - 1) {
            System.arraycopy(iArr, i13 + 1, iArr, i13, (i15 - i13) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i13, int i14) {
        zza();
        if (i14 < i13) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i14, iArr, i13, this.zzc - i14);
        this.zzc -= i14 - i13;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        zzg(i13);
        int[] iArr = this.zzb;
        int i14 = iArr[i13];
        iArr[i13] = iIntValue;
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i13) {
        if (i13 >= this.zzc) {
            return new zzew(Arrays.copyOf(this.zzb, i13), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(int i13) {
        zza();
        int i14 = this.zzc;
        int[] iArr = this.zzb;
        if (i14 == iArr.length) {
            int[] iArr2 = new int[((i14 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i15 = this.zzc;
        this.zzc = i15 + 1;
        iArr3[i15] = i13;
    }

    private zzew(int[] iArr, int i13, boolean z13) {
        super(z13);
        this.zzb = iArr;
        this.zzc = i13;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Integer) obj).intValue());
        return true;
    }
}
