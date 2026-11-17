package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import com.google.android.datatransport.cct.iobyxmoadg;
import o9.btonecajqb;
import o9.dxjokdxxww;
import o9.nufgyqmvbu;
import o9.ppxfxbqfkf;
import o9.wkgbmnqykc;
import q9.yggfygwlhe;
import tc.zoijcleaow;
import ub.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zzuk implements zzts {
    private zoijcleaow zza;
    private final zoijcleaow zzb;
    private final zztu zzc;

    public zzuk(Context context, zztu zztuVar) {
        this.zzc = zztuVar;
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.f21803lqeggnwhkg;
        yggfygwlhe.gxszxtbevo(context);
        final btonecajqb btonecajqbVarLqeggnwhkg = yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(iobyxmoadgVar);
        if (iobyxmoadgVar.iobyxmoadg().contains(ppxfxbqfkf.zoijcleaow("json"))) {
            this.zza = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuh
                @Override // tc.zoijcleaow
                public final Object get() {
                    return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("json"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuj
                        @Override // o9.nufgyqmvbu
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzui
            @Override // tc.zoijcleaow
            public final Object get() {
                return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("proto"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzug
                    @Override // o9.nufgyqmvbu
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static wkgbmnqykc zzb(zztu zztuVar, zztr zztrVar) {
        int iZza = zztuVar.zza();
        return zztrVar.zza() != 0 ? wkgbmnqykc.gxszxtbevo(zztrVar.zze(iZza, false)) : wkgbmnqykc.nufgyqmvbu(zztrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        if (this.zzc.zza() != 0) {
            ((dxjokdxxww) this.zzb.get()).zoijcleaow(zzb(this.zzc, zztrVar));
            return;
        }
        zoijcleaow zoijcleaowVar = this.zza;
        if (zoijcleaowVar != null) {
            ((dxjokdxxww) zoijcleaowVar.get()).zoijcleaow(zzb(this.zzc, zztrVar));
        }
    }
}
