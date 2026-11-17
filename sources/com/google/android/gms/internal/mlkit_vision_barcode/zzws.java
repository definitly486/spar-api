package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import oc.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzws implements zzwe {
    private final zzrd zza;
    private zzvb zzb = new zzvb();
    private final int zzc;

    private zzws(zzrd zzrdVar, int i13) {
        this.zza = zzrdVar;
        zzxb.zza();
        this.zzc = i13;
    }

    public static zzwe zzf(zzrd zzrdVar) {
        return new zzws(zzrdVar, 0);
    }

    public static zzwe zzg(zzrd zzrdVar, int i13) {
        return new zzws(zzrdVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzb(zzrc zzrcVar) {
        this.zza.zzf(zzrcVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzc(zzvb zzvbVar) {
        this.zzb = zzvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final String zzd() {
        zzvd zzvdVarZzg = this.zza.zzk().zzg();
        return (zzvdVarZzg == null || zzba.zzc(zzvdVarZzg.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzvdVarZzg.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final byte[] zze(int i13, boolean z13) {
        this.zzb.zzf(Boolean.valueOf(1 == (i13 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzxb.zza();
            if (i13 == 0) {
                return new wkgbmnqykc().dxjokdxxww(zzox.zza).btonecajqb(true).nufgyqmvbu().zoijcleaow(this.zza.zzk()).getBytes("utf-8");
            }
            zzrf zzrfVarZzk = this.zza.zzk();
            zzfi zzfiVar = new zzfi();
            zzox.zza.configure(zzfiVar);
            return zzfiVar.zza().zza(zzrfVarZzk);
        } catch (UnsupportedEncodingException e13) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e13);
        }
    }
}
