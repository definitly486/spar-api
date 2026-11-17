package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import o9.btonecajqb;
import o9.dxjokdxxww;
import o9.nufgyqmvbu;
import o9.ppxfxbqfkf;
import o9.wkgbmnqykc;
import q9.yggfygwlhe;
import tc.zoijcleaow;
import ub.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwx implements zzwf {
    private zoijcleaow zza;
    private final zoijcleaow zzb;
    private final zzwh zzc;

    public zzwx(Context context, zzwh zzwhVar) {
        this.zzc = zzwhVar;
        com.google.android.datatransport.cct.iobyxmoadg iobyxmoadgVar = com.google.android.datatransport.cct.iobyxmoadg.f21803lqeggnwhkg;
        yggfygwlhe.gxszxtbevo(context);
        final btonecajqb btonecajqbVarLqeggnwhkg = yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(iobyxmoadgVar);
        if (iobyxmoadgVar.iobyxmoadg().contains(ppxfxbqfkf.zoijcleaow("json"))) {
            this.zza = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // tc.zoijcleaow
                public final Object get() {
                    return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("json"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // o9.nufgyqmvbu
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // tc.zoijcleaow
            public final Object get() {
                return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("proto"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // o9.nufgyqmvbu
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static wkgbmnqykc zzb(zzwh zzwhVar, zzwe zzweVar) {
        int iZza = zzwhVar.zza();
        return zzweVar.zza() != 0 ? wkgbmnqykc.gxszxtbevo(zzweVar.zze(iZza, false)) : wkgbmnqykc.nufgyqmvbu(zzweVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        if (this.zzc.zza() != 0) {
            ((dxjokdxxww) this.zzb.get()).zoijcleaow(zzb(this.zzc, zzweVar));
            return;
        }
        zoijcleaow zoijcleaowVar = this.zza;
        if (zoijcleaowVar != null) {
            ((dxjokdxxww) zoijcleaowVar.get()).zoijcleaow(zzb(this.zzc, zzweVar));
        }
    }
}
