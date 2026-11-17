package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    protected zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i13 = this.zze;
        while (true) {
            int i14 = this.zze;
            if (i14 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i14);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i13) {
                int i15 = iZzc + 1;
                this.zze = i15;
                if (i15 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i13 < iZzd) {
                    this.zzb.charAt(i13);
                }
                if (i13 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i13 != iZzd) {
                    int i16 = this.zzf;
                    if (i16 == 1) {
                        iZzd = this.zzb.length();
                        this.zze = -1;
                        if (iZzd > i13) {
                            this.zzb.charAt(iZzd - 1);
                        }
                    } else {
                        this.zzf = i16 - 1;
                    }
                    return this.zzb.subSequence(i13, iZzd).toString();
                }
                i13 = this.zze;
            }
        }
    }

    abstract int zzc(int i13);

    abstract int zzd(int i13);
}
