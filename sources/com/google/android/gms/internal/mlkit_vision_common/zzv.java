package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i13) {
        zzf.zza(i13, this.zza.zzc, "index");
        zzw zzwVar = this.zza;
        int i14 = i13 + i13;
        Object obj = zzwVar.zzb[i14];
        obj.getClass();
        Object obj2 = zzwVar.zzb[i14 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
