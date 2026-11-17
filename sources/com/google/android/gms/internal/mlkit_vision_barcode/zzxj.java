package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes2.dex */
final class zzxj implements zzeh {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ float zzb;
    final /* synthetic */ zzxn zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzxk zze;

    zzxj(zzxk zzxkVar, zzrc zzrcVar, float f13, zzxn zzxnVar, float f14) {
        this.zza = zzrcVar;
        this.zzb = f13;
        this.zzc = zzxnVar;
        this.zzd = f14;
        this.zze = zzxkVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final void zza(Throwable th2) {
        zzxk.zzf.w("AutoZoom", "Unable to set zoom to " + this.zzd, th2);
        this.zze.zzg.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Float f13 = (Float) obj;
        if (f13.floatValue() >= 1.0f) {
            zzxk.zzg(this.zze, f13.floatValue());
            this.zze.zzq(this.zza, this.zzb, f13.floatValue(), this.zzc);
        }
        this.zze.zzg.set(false);
    }
}
