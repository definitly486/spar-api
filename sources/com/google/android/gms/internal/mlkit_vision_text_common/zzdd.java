package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import mc.gxszxtbevo;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzdd implements gxszxtbevo {
    private boolean zza = false;
    private boolean zzb = false;
    private zoijcleaow zzc;
    private final zzcz zzd;

    zzdd(zzcz zzczVar) {
        this.zzd = zzczVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    public final gxszxtbevo add(double d13) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d13, this.zzb);
        return this;
    }

    final void zza(zoijcleaow zoijcleaowVar, boolean z13) {
        this.zza = false;
        this.zzc = zoijcleaowVar;
        this.zzb = z13;
    }

    public final gxszxtbevo add(float f13) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f13, this.zzb);
        return this;
    }

    public final gxszxtbevo add(int i13) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i13, this.zzb);
        return this;
    }

    public final gxszxtbevo add(long j13) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j13, this.zzb);
        return this;
    }

    @Override // mc.gxszxtbevo
    public final gxszxtbevo add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // mc.gxszxtbevo
    public final gxszxtbevo add(boolean z13) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z13 ? 1 : 0, this.zzb);
        return this;
    }

    public final gxszxtbevo add(byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
