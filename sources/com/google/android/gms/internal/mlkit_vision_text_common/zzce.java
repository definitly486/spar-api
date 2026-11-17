package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzce extends zzbk {
    static final zzbk zza = new zzce(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzce(Object[] objArr, int i13) {
        this.zzb = objArr;
        this.zzc = i13;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzx.zza(i13, this.zzc, "index");
        Object obj = this.zzb[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    final int zza(Object[] objArr, int i13) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    final Object[] zze() {
        return this.zzb;
    }
}
