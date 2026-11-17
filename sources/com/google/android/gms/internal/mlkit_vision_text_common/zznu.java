package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes2.dex */
public final class zznu {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zznu zza(Long l13) {
        this.zzc = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzb(Long l13) {
        this.zzd = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzc(Long l13) {
        this.zza = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzd(Long l13) {
        this.zze = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zze(Long l13) {
        this.zzb = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzf(Long l13) {
        this.zzf = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznw zzg() {
        return new zznw(this, null);
    }
}
