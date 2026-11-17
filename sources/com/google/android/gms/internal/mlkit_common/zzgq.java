package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzgq implements ppxfxbqfkf {
    static final zzgq zza = new zzgq();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;
    private static final zoijcleaow zzf;
    private static final zoijcleaow zzg;
    private static final zoijcleaow zzh;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzayVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("roughDownloadDurationMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzayVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("errorCode");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzayVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("exactDownloadDurationMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzayVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("downloadStatus");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzayVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("downloadFailureStatus");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzayVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("mddDownloadErrorCodes");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzayVar7.zzb()).iobyxmoadg();
    }

    private zzgq() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznc zzncVar = (zznc) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzncVar.zzc());
        wkgbmnqykcVar.add(zzc, zzncVar.zzf());
        wkgbmnqykcVar.add(zzd, zzncVar.zza());
        wkgbmnqykcVar.add(zze, zzncVar.zze());
        wkgbmnqykcVar.add(zzf, zzncVar.zzb());
        wkgbmnqykcVar.add(zzg, zzncVar.zzd());
        wkgbmnqykcVar.add(zzh, (Object) null);
    }
}
