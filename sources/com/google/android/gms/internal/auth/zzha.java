package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzha {
    private static final zzha zza = new zzha(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzha(int i13, int[] iArr, Object[] objArr, boolean z13) {
        this.zzb = i13;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z13;
    }

    public static zzha zza() {
        return zza;
    }

    static zzha zzc(zzha zzhaVar, zzha zzhaVar2) {
        int i13 = zzhaVar.zzb + zzhaVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzhaVar.zzc, i13);
        System.arraycopy(zzhaVar2.zzc, 0, iArrCopyOf, zzhaVar.zzb, zzhaVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzhaVar.zzd, i13);
        System.arraycopy(zzhaVar2.zzd, 0, objArrCopyOf, zzhaVar.zzb, zzhaVar2.zzb);
        return new zzha(i13, iArrCopyOf, objArrCopyOf, true);
    }

    static zzha zzd() {
        return new zzha(0, new int[8], new Object[8], true);
    }

    private final void zzi(int i13) {
        int[] iArr = this.zzc;
        if (i13 > iArr.length) {
            int i14 = this.zzb;
            int i15 = i14 + (i14 / 2);
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i13);
            this.zzd = Arrays.copyOf(this.zzd, i13);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        int i13 = this.zzb;
        if (i13 == zzhaVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhaVar.zzc;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == iArr2[i14]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzhaVar.zzd;
            int i15 = this.zzb;
            for (int i16 = 0; i16 < i15; i16++) {
                if (objArr[i16].equals(objArr2[i16])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.zzb;
        int i14 = i13 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i15 = 17;
        for (int i16 = 0; i16 < i13; i16++) {
            i15 = (i15 * 31) + iArr[i16];
        }
        int i17 = (i14 * 31) + i15;
        Object[] objArr = this.zzd;
        int i18 = this.zzb;
        for (int i19 = 0; i19 < i18; i19++) {
            iHashCode = (iHashCode * 31) + objArr[i19].hashCode();
        }
        return (i17 * 31) + iHashCode;
    }

    final zzha zzb(zzha zzhaVar) {
        if (zzhaVar.equals(zza)) {
            return this;
        }
        zze();
        int i13 = this.zzb + zzhaVar.zzb;
        zzi(i13);
        System.arraycopy(zzhaVar.zzc, 0, this.zzc, this.zzb, zzhaVar.zzb);
        System.arraycopy(zzhaVar.zzd, 0, this.zzd, this.zzb, zzhaVar.zzb);
        this.zzb = i13;
        return this;
    }

    final void zze() {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf() {
        if (this.zze) {
            this.zze = false;
        }
    }

    final void zzg(StringBuilder sb3, int i13) {
        for (int i14 = 0; i14 < this.zzb; i14++) {
            zzfz.zzb(sb3, i13, String.valueOf(this.zzc[i14] >>> 3), this.zzd[i14]);
        }
    }

    final void zzh(int i13, Object obj) {
        zze();
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i14 = this.zzb;
        iArr[i14] = i13;
        this.zzd[i14] = obj;
        this.zzb = i14 + 1;
    }

    private zzha() {
        this(0, new int[8], new Object[8], true);
    }
}
