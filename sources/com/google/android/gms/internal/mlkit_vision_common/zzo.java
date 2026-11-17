package com.google.android.gms.internal.mlkit_vision_common;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzo extends zzp {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzp zzc;

    zzo(zzp zzpVar, int i13, int i14) {
        this.zzc = zzpVar;
        this.zza = i13;
        this.zzb = i14;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzf.zza(i13, this.zzb, "index");
        return this.zzc.get(i13 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i13, int i14) {
        return subList(i13, i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp
    /* JADX INFO: renamed from: zzf */
    public final zzp subList(int i13, int i14) {
        zzf.zzc(i13, i14, this.zzb);
        zzp zzpVar = this.zzc;
        int i15 = this.zza;
        return zzpVar.subList(i13 + i15, i14 + i15);
    }
}
