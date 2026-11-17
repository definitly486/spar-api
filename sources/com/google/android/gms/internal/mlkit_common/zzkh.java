package com.google.android.gms.internal.mlkit_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzkh implements ppxfxbqfkf {
    static final zzkh zza = new zzkh();
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
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzayVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("appVersion");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzayVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("firebaseProjectId");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzayVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("mlSdkVersion");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzayVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("tfliteSchemaVersion");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzayVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("gcmSenderId");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzayVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("apiKey");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzayVar7.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg8 = zoijcleaow.iobyxmoadg("languages");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = c1380zoijcleaowIobyxmoadg8.zoijcleaow(zzayVar8.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg9 = zoijcleaow.iobyxmoadg("mlSdkInstanceId");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = c1380zoijcleaowIobyxmoadg9.zoijcleaow(zzayVar9.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg10 = zoijcleaow.iobyxmoadg("isClearcutClient");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        zzk = c1380zoijcleaowIobyxmoadg10.zoijcleaow(zzayVar10.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg11 = zoijcleaow.iobyxmoadg("isStandaloneMlkit");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        zzl = c1380zoijcleaowIobyxmoadg11.zoijcleaow(zzayVar11.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg12 = zoijcleaow.iobyxmoadg("isJsonLogging");
        zzay zzayVar12 = new zzay();
        zzayVar12.zza(12);
        zzm = c1380zoijcleaowIobyxmoadg12.zoijcleaow(zzayVar12.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg13 = zoijcleaow.iobyxmoadg("buildLevel");
        zzay zzayVar13 = new zzay();
        zzayVar13.zza(13);
        zzn = c1380zoijcleaowIobyxmoadg13.zoijcleaow(zzayVar13.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg14 = zoijcleaow.iobyxmoadg("optionalModuleVersion");
        zzay zzayVar14 = new zzay();
        zzayVar14.zza(14);
        zzo = c1380zoijcleaowIobyxmoadg14.zoijcleaow(zzayVar14.zzb()).iobyxmoadg();
    }

    private zzkh() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzqv zzqvVar = (zzqv) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzqvVar.zzg());
        wkgbmnqykcVar.add(zzc, zzqvVar.zzh());
        wkgbmnqykcVar.add(zzd, (Object) null);
        wkgbmnqykcVar.add(zze, zzqvVar.zzj());
        wkgbmnqykcVar.add(zzf, zzqvVar.zzk());
        wkgbmnqykcVar.add(zzg, (Object) null);
        wkgbmnqykcVar.add(zzh, (Object) null);
        wkgbmnqykcVar.add(zzi, zzqvVar.zza());
        wkgbmnqykcVar.add(zzj, zzqvVar.zzi());
        wkgbmnqykcVar.add(zzk, zzqvVar.zzb());
        wkgbmnqykcVar.add(zzl, zzqvVar.zzd());
        wkgbmnqykcVar.add(zzm, zzqvVar.zzc());
        wkgbmnqykcVar.add(zzn, zzqvVar.zze());
        wkgbmnqykcVar.add(zzo, zzqvVar.zzf());
    }
}
