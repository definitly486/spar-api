package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
class zzbe extends zzbf {
    final zzbb zzb;
    final Character zzc;

    zzbe(zzbb zzbbVar, Character ch2) {
        this.zzb = zzbbVar;
        if (ch2 != null && zzbbVar.zzb('=')) {
            throw new IllegalArgumentException(zzan.zza("Padding character %s was already in alphabet", ch2));
        }
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj;
            if (this.zzb.equals(zzbeVar.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzbeVar.zzc;
                if (ch2 == ch3) {
                    return true;
                }
                if (ch2 != null && ch2.equals(ch3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch2 = this.zzc;
        return iHashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BaseEncoding.");
        sb3.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb3.append(".omitPadding()");
            } else {
                sb3.append(".withPadChar('");
                sb3.append(this.zzc);
                sb3.append("')");
            }
        }
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    void zza(Appendable appendable, byte[] bArr, int i13, int i14) throws IOException {
        int i15 = 0;
        zzam.zze(0, i14, bArr.length);
        while (i15 < i14) {
            zzc(appendable, bArr, i15, Math.min(this.zzb.zzd, i14 - i15));
            i15 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    final int zzb(int i13) {
        zzbb zzbbVar = this.zzb;
        return zzbbVar.zzc * zzbh.zza(i13, zzbbVar.zzd, RoundingMode.CEILING);
    }

    final void zzc(Appendable appendable, byte[] bArr, int i13, int i14) throws IOException {
        zzam.zze(i13, i13 + i14, bArr.length);
        int i15 = 0;
        zzam.zzc(i14 <= this.zzb.zzd);
        long j13 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            j13 = (j13 | ((long) (bArr[i13 + i16] & 255))) << 8;
        }
        int i17 = ((i14 + 1) * 8) - this.zzb.zzb;
        while (i15 < i14 * 8) {
            zzbb zzbbVar = this.zzb;
            appendable.append(zzbbVar.zza(zzbbVar.zza & ((int) (j13 >>> (i17 - i15)))));
            i15 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i15 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i15 += this.zzb.zzb;
            }
        }
    }

    zzbe(String str, String str2, Character ch2) {
        this(new zzbb(str, str2.toCharArray()), ch2);
    }
}
