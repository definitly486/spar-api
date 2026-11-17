package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzt extends zzw {
    final /* synthetic */ zzu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzt(zzu zzuVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzc(int i13) {
        return i13 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    final int zzd(int i13) {
        CharSequence charSequence = ((zzw) this).zzb;
        int length = charSequence.length();
        zzs.zzb(i13, length, "index");
        while (i13 < length) {
            zzu zzuVar = this.zza;
            if (zzuVar.zza.zza(charSequence.charAt(i13))) {
                return i13;
            }
            i13++;
        }
        return -1;
    }
}
