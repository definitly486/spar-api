package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzcr extends zzcs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzcs zzc;

    zzcr(zzcs zzcsVar, int i13, int i14) {
        this.zzc = zzcsVar;
        this.zza = i13;
        this.zzb = i14;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzaz.zza(i13, this.zzb, "index");
        return this.zzc.get(i13 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i13, int i14) {
        return subList(i13, i14);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs
    /* JADX INFO: renamed from: zzf */
    public final zzcs subList(int i13, int i14) {
        zzaz.zze(i13, i14, this.zzb);
        int i15 = this.zza;
        return this.zzc.subList(i13 + i15, i14 + i15);
    }
}
