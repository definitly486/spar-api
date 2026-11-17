package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzof implements ppxfxbqfkf {
    static final zzof zza = new zzof();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;
    private static final zoijcleaow zzf;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("xMin");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzfaVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("yMin");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzfaVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("xMax");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzfaVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("yMax");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzfaVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("confidenceScore");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzfaVar5.zzb()).iobyxmoadg();
    }

    private zzof() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zzur zzurVar = (zzur) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zzurVar.zzc());
        wkgbmnqykcVar.add(zzc, zzurVar.zze());
        wkgbmnqykcVar.add(zzd, zzurVar.zzb());
        wkgbmnqykcVar.add(zze, zzurVar.zzd());
        wkgbmnqykcVar.add(zzf, zzurVar.zza());
    }
}
