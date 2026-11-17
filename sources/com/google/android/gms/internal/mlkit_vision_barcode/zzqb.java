package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqb {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzqb zza(Long l13) {
        this.zzc = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzb(Long l13) {
        this.zzd = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzc(Long l13) {
        this.zza = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzd(Long l13) {
        this.zze = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zze(Long l13) {
        this.zzb = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqb zzf(Long l13) {
        this.zzf = Long.valueOf(l13.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqd zzg() {
        return new zzqd(this, null);
    }
}
