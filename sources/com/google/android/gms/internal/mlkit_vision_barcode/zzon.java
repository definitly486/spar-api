package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzon implements ppxfxbqfkf {
    static final zzon zza = new zzon();
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
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzfaVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("appVersion");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzfaVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("firebaseProjectId");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzfaVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("mlSdkVersion");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzfaVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("tfliteSchemaVersion");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzfaVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("gcmSenderId");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzfaVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("apiKey");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzfaVar7.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg8 = zoijcleaow.iobyxmoadg("languages");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        zzi = c1380zoijcleaowIobyxmoadg8.zoijcleaow(zzfaVar8.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg9 = zoijcleaow.iobyxmoadg("mlSdkInstanceId");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        zzj = c1380zoijcleaowIobyxmoadg9.zoijcleaow(zzfaVar9.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg10 = zoijcleaow.iobyxmoadg("isClearcutClient");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        zzk = c1380zoijcleaowIobyxmoadg10.zoijcleaow(zzfaVar10.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg11 = zoijcleaow.iobyxmoadg("isStandaloneMlkit");
        zzfa zzfaVar11 = new zzfa();
        zzfaVar11.zza(11);
        zzl = c1380zoijcleaowIobyxmoadg11.zoijcleaow(zzfaVar11.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg12 = zoijcleaow.iobyxmoadg("isJsonLogging");
        zzfa zzfaVar12 = new zzfa();
        zzfaVar12.zza(12);
        zzm = c1380zoijcleaowIobyxmoadg12.zoijcleaow(zzfaVar12.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg13 = zoijcleaow.iobyxmoadg("buildLevel");
        zzfa zzfaVar13 = new zzfa();
        zzfaVar13.zza(13);
        zzn = c1380zoijcleaowIobyxmoadg13.zoijcleaow(zzfaVar13.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg14 = zoijcleaow.iobyxmoadg("optionalModuleVersion");
        zzfa zzfaVar14 = new zzfa();
        zzfaVar14.zza(14);
        zzo = c1380zoijcleaowIobyxmoadg14.zoijcleaow(zzfaVar14.zzb()).iobyxmoadg();
    }

    private zzon() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzvd zzvdVar = (zzvd) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzvdVar.zzg());
        wkgbmnqykcVar.add(zzc, zzvdVar.zzh());
        wkgbmnqykcVar.add(zzd, (Object) null);
        wkgbmnqykcVar.add(zze, zzvdVar.zzj());
        wkgbmnqykcVar.add(zzf, zzvdVar.zzk());
        wkgbmnqykcVar.add(zzg, (Object) null);
        wkgbmnqykcVar.add(zzh, (Object) null);
        wkgbmnqykcVar.add(zzi, zzvdVar.zza());
        wkgbmnqykcVar.add(zzj, zzvdVar.zzi());
        wkgbmnqykcVar.add(zzk, zzvdVar.zzb());
        wkgbmnqykcVar.add(zzl, zzvdVar.zzd());
        wkgbmnqykcVar.add(zzm, zzvdVar.zzc());
        wkgbmnqykcVar.add(zzn, zzvdVar.zze());
        wkgbmnqykcVar.add(zzo, zzvdVar.zzf());
    }
}
