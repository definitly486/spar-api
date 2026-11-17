package com.google.android.gms.internal.mlkit_common;

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
public final class zzsp implements zzrz {
    private zoijcleaow zza;
    private final zoijcleaow zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        iobyxmoadg iobyxmoadgVar = iobyxmoadg.f21803lqeggnwhkg;
        yggfygwlhe.gxszxtbevo(context);
        final btonecajqb btonecajqbVarLqeggnwhkg = yggfygwlhe.ppxfxbqfkf().lqeggnwhkg(iobyxmoadgVar);
        if (iobyxmoadgVar.iobyxmoadg().contains(ppxfxbqfkf.zoijcleaow("json"))) {
            this.zza = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // tc.zoijcleaow
                public final Object get() {
                    return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("json"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // o9.nufgyqmvbu
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new zdlpuopuiu(new zoijcleaow() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // tc.zoijcleaow
            public final Object get() {
                return btonecajqbVarLqeggnwhkg.iobyxmoadg("FIREBASE_ML_SDK", byte[].class, ppxfxbqfkf.zoijcleaow("proto"), new nufgyqmvbu() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // o9.nufgyqmvbu
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static wkgbmnqykc zzb(zzsb zzsbVar, zzry zzryVar) {
        return wkgbmnqykc.nufgyqmvbu(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((dxjokdxxww) this.zzb.get()).zoijcleaow(zzb(this.zzc, zzryVar));
            return;
        }
        zoijcleaow zoijcleaowVar = this.zza;
        if (zoijcleaowVar != null) {
            ((dxjokdxxww) zoijcleaowVar.get()).zoijcleaow(zzb(this.zzc, zzryVar));
        }
    }
}
