package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzbj extends zzbk {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbk zzc;

    zzbj(zzbk zzbkVar, int i13, int i14) {
        this.zzc = zzbkVar;
        this.zza = i13;
        this.zzb = i14;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzx.zza(i13, this.zzb, "index");
        return this.zzc.get(i13 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i13, int i14) {
        return subList(i13, i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk
    /* JADX INFO: renamed from: zzf */
    public final zzbk subList(int i13, int i14) {
        zzx.zzc(i13, i14, this.zzb);
        int i15 = this.zza;
        return this.zzc.subList(i13 + i15, i14 + i15);
    }
}
