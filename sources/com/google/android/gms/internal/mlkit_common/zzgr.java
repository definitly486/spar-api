package com.google.android.gms.internal.mlkit_common;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
final class zzgr implements ppxfxbqfkf {
    static final zzgr zza = new zzgr();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;
    private static final zoijcleaow zzf;
    private static final zoijcleaow zzg;
    private static final zoijcleaow zzh;
    private static final zoijcleaow zzi;
    private static final zoijcleaow zzj;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg(ExternalMetricsManagerImpl.NAME);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzayVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("version");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzayVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg(AdRevenueConstants.SOURCE_KEY);
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzayVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("uri");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzayVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("hash");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzayVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("modelType");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzayVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("size");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzayVar7.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg8 = zoijcleaow.iobyxmoadg("hasLabelMap");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = c1380zoijcleaowIobyxmoadg8.zoijcleaow(zzayVar8.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg9 = zoijcleaow.iobyxmoadg("isManifestModel");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = c1380zoijcleaowIobyxmoadg9.zoijcleaow(zzayVar9.zzb()).iobyxmoadg();
    }

    private zzgr() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zznh zznhVar = (zznh) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zznhVar.zzd());
        wkgbmnqykcVar.add(zzc, (Object) null);
        wkgbmnqykcVar.add(zzd, zznhVar.zzb());
        wkgbmnqykcVar.add(zze, (Object) null);
        wkgbmnqykcVar.add(zzf, zznhVar.zzc());
        wkgbmnqykcVar.add(zzg, zznhVar.zza());
        wkgbmnqykcVar.add(zzh, (Object) null);
        wkgbmnqykcVar.add(zzi, (Object) null);
        wkgbmnqykcVar.add(zzj, (Object) null);
    }
}
