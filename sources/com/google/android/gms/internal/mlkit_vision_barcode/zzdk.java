package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdk extends zzcs {
    static final zzcs zza = new zzdk(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzdk(Object[] objArr, int i13) {
        this.zzb = objArr;
        this.zzc = i13;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzaz.zza(i13, this.zzc, "index");
        Object obj = this.zzb[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcs, com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zza(Object[] objArr, int i13) {
        System.arraycopy(this.zzb, 0, objArr, i13, this.zzc);
        return i13 + this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    final Object[] zze() {
        return this.zzb;
    }
}
