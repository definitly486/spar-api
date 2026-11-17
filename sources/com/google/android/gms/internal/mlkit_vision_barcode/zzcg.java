package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzcg extends zzbs {
    final /* synthetic */ zzci zza;
    private final Object zzb;
    private int zzc;

    zzcg(zzci zzciVar, int i13) {
        this.zza = zzciVar;
        this.zzb = zzci.zzg(zzciVar, i13);
        this.zzc = i13;
    }

    private final void zza() {
        int i13 = this.zzc;
        if (i13 == -1 || i13 >= this.zza.size() || !zzax.zza(this.zzb, zzci.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i13 = this.zzc;
        if (i13 == -1) {
            return null;
        }
        return zzci.zzj(this.zza, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbs, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i13 = this.zzc;
        if (i13 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzci zzciVar = this.zza;
        Object objZzj = zzci.zzj(zzciVar, i13);
        zzci.zzn(zzciVar, this.zzc, obj);
        return objZzj;
    }
}
