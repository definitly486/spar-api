package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzhz implements ppxfxbqfkf {
    static final zzhz zza = new zzhz();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("imageFormat");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzctVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("originalImageSize");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzctVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("compressedImageSize");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzctVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("isOdmlImage");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzctVar4.zzb()).iobyxmoadg();
    }

    private zzhz() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzod zzodVar = (zzod) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzodVar.zza());
        wkgbmnqykcVar.add(zzc, zzodVar.zzb());
        wkgbmnqykcVar.add(zzd, (Object) null);
        wkgbmnqykcVar.add(zze, (Object) null);
    }
}
