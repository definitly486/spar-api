package com.google.android.gms.internal.fido;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbc extends zzbe {
    final char[] zza;

    zzbc(String str, String str2) {
        zzbb zzbbVar = new zzbb("base16()", "0123456789ABCDEF".toCharArray());
        super(zzbbVar, null);
        this.zza = new char[UserVerificationMethods.USER_VERIFY_NONE];
        zzam.zzc(zzbbVar.zzf.length == 16);
        for (int i13 = 0; i13 < 256; i13++) {
            this.zza[i13] = zzbbVar.zza(i13 >>> 4);
            this.zza[i13 | UserVerificationMethods.USER_VERIFY_HANDPRINT] = zzbbVar.zza(i13 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(Appendable appendable, byte[] bArr, int i13, int i14) throws IOException {
        zzam.zze(0, i14, bArr.length);
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = bArr[i15] & 255;
            appendable.append(this.zza[i16]);
            appendable.append(this.zza[i16 | UserVerificationMethods.USER_VERIFY_HANDPRINT]);
        }
    }
}
