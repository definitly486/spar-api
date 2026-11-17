package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzlo implements ppxfxbqfkf {
    static final zzlo zza = new zzlo();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("languageOption");
        zzct zzctVar = new zzct();
        zzctVar.zza(3);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzctVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("isUsingLegacyApi");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(4);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzctVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("sdkVersion");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(5);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzctVar3.zzb()).iobyxmoadg();
    }

    private zzlo() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, ((zzsd) obj).zza());
        wkgbmnqykcVar.add(zzc, (Object) null);
        wkgbmnqykcVar.add(zzd, (Object) null);
    }
}
