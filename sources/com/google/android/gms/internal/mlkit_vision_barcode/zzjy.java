package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzjy implements ppxfxbqfkf {
    static final zzjy zza = new zzjy();

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg("initialImageUriCount");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        c1380zoijcleaowIobyxmoadg.zoijcleaow(zzfaVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("defaultCaptureMode");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzfaVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("flashModeChangeAllowed");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzfaVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("galleryImportAllowed");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzfaVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("multiPageAllowed");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzfaVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("filterAllowed");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzfaVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("targetResolutionWidth");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzfaVar7.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg8 = zoijcleaow.iobyxmoadg("targetResolutionHeight");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        c1380zoijcleaowIobyxmoadg8.zoijcleaow(zzfaVar8.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg9 = zoijcleaow.iobyxmoadg("resultFormats");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        c1380zoijcleaowIobyxmoadg9.zoijcleaow(zzfaVar9.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg10 = zoijcleaow.iobyxmoadg("pageEditListenerSet");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        c1380zoijcleaowIobyxmoadg10.zoijcleaow(zzfaVar10.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg11 = zoijcleaow.iobyxmoadg("shadowRemovalAllowed");
        zzfa zzfaVar11 = new zzfa();
        zzfaVar11.zza(11);
        c1380zoijcleaowIobyxmoadg11.zoijcleaow(zzfaVar11.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg12 = zoijcleaow.iobyxmoadg("stainRemovalAllowed");
        zzfa zzfaVar12 = new zzfa();
        zzfaVar12.zza(12);
        c1380zoijcleaowIobyxmoadg12.zoijcleaow(zzfaVar12.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg13 = zoijcleaow.iobyxmoadg("enableAllNewFeaturesByDefault");
        zzfa zzfaVar13 = new zzfa();
        zzfaVar13.zza(13);
        c1380zoijcleaowIobyxmoadg13.zoijcleaow(zzfaVar13.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg14 = zoijcleaow.iobyxmoadg("pageLimitMax");
        zzfa zzfaVar14 = new zzfa();
        zzfaVar14.zza(14);
        c1380zoijcleaowIobyxmoadg14.zoijcleaow(zzfaVar14.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg15 = zoijcleaow.iobyxmoadg("enableGalleryImportAutoTransform");
        zzfa zzfaVar15 = new zzfa();
        zzfaVar15.zza(15);
        c1380zoijcleaowIobyxmoadg15.zoijcleaow(zzfaVar15.zzb()).iobyxmoadg();
    }

    private zzjy() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
