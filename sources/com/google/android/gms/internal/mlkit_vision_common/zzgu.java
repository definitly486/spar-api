package com.google.android.gms.internal.mlkit_vision_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzgu implements ppxfxbqfkf {
    static final zzgu zza = new zzgu();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzaeVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("appVersion");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzaeVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("firebaseProjectId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzaeVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("mlSdkVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzaeVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("tfliteSchemaVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzaeVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("gcmSenderId");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzaeVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("apiKey");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzaeVar7.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg8 = zoijcleaow.iobyxmoadg("languages");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = c1380zoijcleaowIobyxmoadg8.zoijcleaow(zzaeVar8.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg9 = zoijcleaow.iobyxmoadg("mlSdkInstanceId");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = c1380zoijcleaowIobyxmoadg9.zoijcleaow(zzaeVar9.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg10 = zoijcleaow.iobyxmoadg("isClearcutClient");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = c1380zoijcleaowIobyxmoadg10.zoijcleaow(zzaeVar10.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg11 = zoijcleaow.iobyxmoadg("isStandaloneMlkit");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = c1380zoijcleaowIobyxmoadg11.zoijcleaow(zzaeVar11.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg12 = zoijcleaow.iobyxmoadg("isJsonLogging");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = c1380zoijcleaowIobyxmoadg12.zoijcleaow(zzaeVar12.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg13 = zoijcleaow.iobyxmoadg("buildLevel");
        zzae zzaeVar13 = new zzae();
        zzaeVar13.zza(13);
        zzn = c1380zoijcleaowIobyxmoadg13.zoijcleaow(zzaeVar13.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg14 = zoijcleaow.iobyxmoadg("optionalModuleVersion");
        zzae zzaeVar14 = new zzae();
        zzaeVar14.zza(14);
        zzo = c1380zoijcleaowIobyxmoadg14.zoijcleaow(zzaeVar14.zzb()).iobyxmoadg();
    }

    private zzgu() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzla zzlaVar = (zzla) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzlaVar.zzg());
        wkgbmnqykcVar.add(zzc, zzlaVar.zzh());
        wkgbmnqykcVar.add(zzd, (Object) null);
        wkgbmnqykcVar.add(zze, zzlaVar.zzj());
        wkgbmnqykcVar.add(zzf, zzlaVar.zzk());
        wkgbmnqykcVar.add(zzg, (Object) null);
        wkgbmnqykcVar.add(zzh, (Object) null);
        wkgbmnqykcVar.add(zzi, zzlaVar.zza());
        wkgbmnqykcVar.add(zzj, zzlaVar.zzi());
        wkgbmnqykcVar.add(zzk, zzlaVar.zzb());
        wkgbmnqykcVar.add(zzl, zzlaVar.zzd());
        wkgbmnqykcVar.add(zzm, zzlaVar.zzc());
        wkgbmnqykcVar.add(zzn, zzlaVar.zze());
        wkgbmnqykcVar.add(zzo, zzlaVar.zzf());
    }
}
