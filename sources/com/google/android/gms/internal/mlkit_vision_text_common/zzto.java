package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes2.dex */
final class zzto extends zztt {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    zzto() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zza(boolean z13) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zzb(int i13) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zztt zzc(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztu zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zztq(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.zza == null) {
            sb3.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb3.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb3.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
    }
}
