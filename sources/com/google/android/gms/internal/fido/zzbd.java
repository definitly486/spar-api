package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbd extends zzbe {
    zzbd(String str, String str2, Character ch2) {
        zzbb zzbbVar = new zzbb(str, str2.toCharArray());
        super(zzbbVar, ch2);
        zzam.zzc(zzbbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i13, int i14) throws IOException {
        int i15 = 0;
        zzam.zze(0, i14, bArr.length);
        for (int i16 = i14; i16 >= 3; i16 -= 3) {
            int i17 = bArr[i15] & 255;
            int i18 = ((bArr[i15 + 1] & 255) << 8) | (i17 << 16) | (bArr[i15 + 2] & 255);
            appendable.append(this.zzb.zza(i18 >>> 18));
            appendable.append(this.zzb.zza((i18 >>> 12) & 63));
            appendable.append(this.zzb.zza((i18 >>> 6) & 63));
            appendable.append(this.zzb.zza(i18 & 63));
            i15 += 3;
        }
        if (i15 < i14) {
            zzc(appendable, bArr, i15, i14 - i15);
        }
    }
}
