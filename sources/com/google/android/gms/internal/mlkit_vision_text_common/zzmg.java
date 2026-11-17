package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzmg implements ppxfxbqfkf {
    static final zzmg zza = new zzmg();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;
    private static final zoijcleaow zzf;
    private static final zoijcleaow zzg;
    private static final zoijcleaow zzh;
    private static final zoijcleaow zzi;
    private static final zoijcleaow zzj;
    private static final zoijcleaow zzk;
    private static final zoijcleaow zzl;
    private static final zoijcleaow zzm;
    private static final zoijcleaow zzn;
    private static final zoijcleaow zzo;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("appId");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzctVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("appVersion");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzctVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("firebaseProjectId");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzctVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("mlSdkVersion");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzctVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("tfliteSchemaVersion");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzctVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("gcmSenderId");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzctVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("apiKey");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzctVar7.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg8 = zoijcleaow.iobyxmoadg("languages");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = c1380zoijcleaowIobyxmoadg8.zoijcleaow(zzctVar8.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg9 = zoijcleaow.iobyxmoadg("mlSdkInstanceId");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = c1380zoijcleaowIobyxmoadg9.zoijcleaow(zzctVar9.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg10 = zoijcleaow.iobyxmoadg("isClearcutClient");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = c1380zoijcleaowIobyxmoadg10.zoijcleaow(zzctVar10.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg11 = zoijcleaow.iobyxmoadg("isStandaloneMlkit");
        zzct zzctVar11 = new zzct();
        zzctVar11.zza(11);
        zzl = c1380zoijcleaowIobyxmoadg11.zoijcleaow(zzctVar11.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg12 = zoijcleaow.iobyxmoadg("isJsonLogging");
        zzct zzctVar12 = new zzct();
        zzctVar12.zza(12);
        zzm = c1380zoijcleaowIobyxmoadg12.zoijcleaow(zzctVar12.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg13 = zoijcleaow.iobyxmoadg("buildLevel");
        zzct zzctVar13 = new zzct();
        zzctVar13.zza(13);
        zzn = c1380zoijcleaowIobyxmoadg13.zoijcleaow(zzctVar13.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg14 = zoijcleaow.iobyxmoadg("optionalModuleVersion");
        zzct zzctVar14 = new zzct();
        zzctVar14.zza(14);
        zzo = c1380zoijcleaowIobyxmoadg14.zoijcleaow(zzctVar14.zzb()).iobyxmoadg();
    }

    private zzmg() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzst zzstVar = (zzst) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzstVar.zzg());
        wkgbmnqykcVar.add(zzc, zzstVar.zzh());
        wkgbmnqykcVar.add(zzd, (Object) null);
        wkgbmnqykcVar.add(zze, zzstVar.zzj());
        wkgbmnqykcVar.add(zzf, zzstVar.zzk());
        wkgbmnqykcVar.add(zzg, (Object) null);
        wkgbmnqykcVar.add(zzh, (Object) null);
        wkgbmnqykcVar.add(zzi, zzstVar.zza());
        wkgbmnqykcVar.add(zzj, zzstVar.zzi());
        wkgbmnqykcVar.add(zzk, zzstVar.zzb());
        wkgbmnqykcVar.add(zzl, zzstVar.zzd());
        wkgbmnqykcVar.add(zzm, zzstVar.zzc());
        wkgbmnqykcVar.add(zzn, zzstVar.zze());
        wkgbmnqykcVar.add(zzo, zzstVar.zzf());
    }
}
