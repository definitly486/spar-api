package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzlm implements ppxfxbqfkf {
    static final zzlm zza = new zzlm();
    private static final zoijcleaow zzb;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzctVar.zzb()).iobyxmoadg();
    }

    private zzlm() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((wkgbmnqykc) obj2).add(zzb, ((zzrw) obj).zza());
    }
}
