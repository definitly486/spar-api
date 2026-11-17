package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzae extends zzz {
    private final zzag zza;

    zzae(zzag zzagVar, int i13) {
        super(zzagVar.size(), i13);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final Object zza(int i13) {
        return this.zza.get(i13);
    }
}
