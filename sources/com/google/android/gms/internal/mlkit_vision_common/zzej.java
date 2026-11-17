package com.google.android.gms.internal.mlkit_vision_common;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.wkgbmnqykc;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzej implements ppxfxbqfkf {
    static final zzej zza = new zzej();
    private static final zoijcleaow zzb;
    private static final zoijcleaow zzc;
    private static final zoijcleaow zzd;
    private static final zoijcleaow zze;
    private static final zoijcleaow zzf;
    private static final zoijcleaow zzg;
    private static final zoijcleaow zzh;

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("durationMs");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = c1380zoijcleaowIobyxmoadg.zoijcleaow(zzaeVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("imageSource");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzaeVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("imageFormat");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzaeVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("imageByteSize");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzaeVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("imageWidth");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzaeVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("imageHeight");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzaeVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("rotationDegrees");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzaeVar7.zzb()).iobyxmoadg();
    }

    private zzej() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        zziq zziqVar = (zziq) obj;
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj2;
        wkgbmnqykcVar.add(zzb, zziqVar.zzg());
        wkgbmnqykcVar.add(zzc, zziqVar.zzb());
        wkgbmnqykcVar.add(zzd, zziqVar.zza());
        wkgbmnqykcVar.add(zze, zziqVar.zzc());
        wkgbmnqykcVar.add(zzf, zziqVar.zze());
        wkgbmnqykcVar.add(zzg, zziqVar.zzd());
        wkgbmnqykcVar.add(zzh, zziqVar.zzf());
    }
}
