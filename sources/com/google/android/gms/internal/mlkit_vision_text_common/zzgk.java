package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzgk implements ppxfxbqfkf {
    static final zzgk zza = new zzgk();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;
    private static final zoijcleaow zzf;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzctVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("hasResult");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzctVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzctVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("imageInfo");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzctVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("recognizerOptions");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzctVar5.zzb()).iobyxmoadg();
    }

    private zzgk() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzes zzesVar = (zzes) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzesVar.zza());
        wkgbmnqykcVar.add(zzc, (Object) null);
        wkgbmnqykcVar.add(zzd, zzesVar.zzc());
        wkgbmnqykcVar.add(zze, (Object) null);
        wkgbmnqykcVar.add(zzf, zzesVar.zzb());
    }
}
