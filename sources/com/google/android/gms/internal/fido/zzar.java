package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
final class zzar extends zzao {
    private final zzat zza;

    zzar(zzat zzatVar, int i13) {
        super(zzatVar.size(), i13);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.fido.zzao
    protected final Object zza(int i13) {
        return this.zza.get(i13);
    }
}
