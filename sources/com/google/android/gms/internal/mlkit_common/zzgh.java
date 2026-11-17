package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzgh implements ppxfxbqfkf {
    static final zzgh zza = new zzgh();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("modelType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzayVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("isDownloaded");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzayVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("modelName");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzayVar3.zzb()).iobyxmoadg();
    }

    private zzgh() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzmj zzmjVar = (zzmj) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzmjVar.zza());
        wkgbmnqykcVar.add(zzc, zzmjVar.zzb());
        wkgbmnqykcVar.add(zzd, (Object) null);
    }
}
