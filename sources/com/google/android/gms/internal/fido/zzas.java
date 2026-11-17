package com.google.android.gms.internal.fido;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzas extends zzat {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzat zzc;

    zzas(zzat zzatVar, int i13, int i14) {
        this.zzc = zzatVar;
        this.zza = i13;
        this.zzb = i14;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzam.zza(i13, this.zzb, "index");
        return this.zzc.get(i13 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzat, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i13, int i14) {
        return subList(i13, i14);
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzat
    /* JADX INFO: renamed from: zzf */
    public final zzat subList(int i13, int i14) {
        zzam.zze(i13, i14, this.zzb);
        zzat zzatVar = this.zzc;
        int i15 = this.zza;
        return zzatVar.subList(i13 + i15, i14 + i15);
    }
}
