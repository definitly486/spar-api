package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzhl implements ppxfxbqfkf {
    static final zzhl zza = new zzhl();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;
    private static final zoijcleaow zzf;
    private static final zoijcleaow zzg;
    private static final zoijcleaow zzh;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("errorCode");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzfaVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("hasResult");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzfaVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("isColdCall");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzfaVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("imageInfo");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzfaVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("options");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzfaVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("detectedBarcodeFormats");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzfaVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("detectedBarcodeValueTypes");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzfaVar7.zzb()).iobyxmoadg();
    }

    private zzhl() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzft zzftVar = (zzft) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzftVar.zzc());
        wkgbmnqykcVar.add(zzc, (Object) null);
        wkgbmnqykcVar.add(zzd, zzftVar.zze());
        wkgbmnqykcVar.add(zze, (Object) null);
        wkgbmnqykcVar.add(zzf, zzftVar.zzd());
        wkgbmnqykcVar.add(zzg, zzftVar.zza());
        wkgbmnqykcVar.add(zzh, zzftVar.zzb());
    }
}
