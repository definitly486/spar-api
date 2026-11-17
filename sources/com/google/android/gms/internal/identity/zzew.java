package com.google.android.gms.internal.identity;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzew extends zzex {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzex zzc;

    zzew(zzex zzexVar, int i13, int i14) {
        this.zzc = zzexVar;
        this.zza = i13;
        this.zzb = i14;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzer.zzc(i13, this.zzb, "index");
        return this.zzc.get(i13 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzex, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i13, int i14) {
        return subList(i13, i14);
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.identity.zzex
    /* JADX INFO: renamed from: zzh */
    public final zzex subList(int i13, int i14) {
        zzer.zze(i13, i14, this.zzb);
        int i15 = this.zza;
        return this.zzc.subList(i13 + i15, i14 + i15);
    }
}
