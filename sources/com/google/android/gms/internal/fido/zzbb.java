package com.google.android.gms.internal.fido;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzbb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzbb(String str, char[] cArr) {
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        Arrays.fill(bArr, (byte) -1);
        for (int i13 = 0; i13 < cArr.length; i13++) {
            char c13 = cArr[i13];
            boolean z13 = true;
            zzam.zzd(c13 < 128, "Non-ASCII character: %s", c13);
            if (bArr[c13] != -1) {
                z13 = false;
            }
            zzam.zzd(z13, "Duplicate character: %s", c13);
            bArr[c13] = (byte) i13;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbb) {
            zzbb zzbbVar = (zzbb) obj;
            boolean z13 = zzbbVar.zzh;
            if (Arrays.equals(this.zzf, zzbbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 1237;
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i13) {
        return this.zzf[i13];
    }

    public final boolean zzb(char c13) {
        return this.zzg[61] != -1;
    }

    private zzbb(String str, char[] cArr, byte[] bArr, boolean z13) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzbh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i13 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i13;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i13];
            for (int i14 = 0; i14 < this.zzd; i14++) {
                zArr[zzbh.zza(i14 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = false;
        } catch (ArithmeticException e13) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e13);
        }
    }
}
