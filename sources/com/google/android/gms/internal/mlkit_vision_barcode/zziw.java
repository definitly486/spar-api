package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zziw implements ppxfxbqfkf {
    static final zziw zza = new zziw();
    private static final zoijcleaow zzb;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("format");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzfaVar.zzb()).iobyxmoadg();
    }

    private zziw() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((wkgbmnqykc) obj2).add(zzb, ((zzvz) obj).zza());
    }
}
