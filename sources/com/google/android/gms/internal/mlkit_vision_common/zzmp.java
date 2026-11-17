package com.google.android.gms.internal.mlkit_vision_common;

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
public final class zzmp implements zzmc {
    private zoijcleaow zza;
    private final zoijcleaow zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.zzc = zzmeVar;
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.f21803lqeggnwhkg;
        yggfygwlhe.gxszxtbevo(context);
        final btonecajqb btonecajqbVarLqeggnwhkg = yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(iobyxmoadgVar);
        if (iobyxmoadgVar.iobyxmoadg().contains(ppxfxbqfkf.zoijcleaow("json"))) {
            this.zza = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // tc.zoijcleaow
                public final Object get() {
                    return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("json"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // o9.nufgyqmvbu
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // tc.zoijcleaow
            public final Object get() {
                return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("proto"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // o9.nufgyqmvbu
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static wkgbmnqykc zzb(zzme zzmeVar, zzmb zzmbVar) {
        return wkgbmnqykc.nufgyqmvbu(zzmbVar.zzd(zzmeVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.zzc.zza() != 0) {
            ((dxjokdxxww) this.zzb.get()).zoijcleaow(zzb(this.zzc, zzmbVar));
            return;
        }
        zoijcleaow zoijcleaowVar = this.zza;
        if (zoijcleaowVar != null) {
            ((dxjokdxxww) zoijcleaowVar.get()).zoijcleaow(zzb(this.zzc, zzmbVar));
        }
    }
}
