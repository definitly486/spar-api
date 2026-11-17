package com.google.android.gms.internal.mlkit_common;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzap extends zzaf {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzap(Object[] objArr, int i13, int i14) {
        this.zza = objArr;
        this.zzb = i13;
        this.zzc = i14;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        zzt.zza(i13, this.zzc, "index");
        Object obj = this.zza[i13 + i13 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
