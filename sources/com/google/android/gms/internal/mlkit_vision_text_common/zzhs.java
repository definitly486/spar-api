package com.google.android.gms.internal.mlkit_vision_text_common;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.IOException;
import mc.ppxfxbqfkf;
import mc.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zzhs implements ppxfxbqfkf {
    static final zzhs zza = new zzhs();

    static {
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg = zoijcleaow.iobyxmoadg(AdRevenueConstants.SOURCE_KEY);
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        c1380zoijcleaowIobyxmoadg.zoijcleaow(zzctVar.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg2 = zoijcleaow.iobyxmoadg("appliedFilter");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        c1380zoijcleaowIobyxmoadg2.zoijcleaow(zzctVar2.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg3 = zoijcleaow.iobyxmoadg("isAutoCaptureManuallyTriggered");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        c1380zoijcleaowIobyxmoadg3.zoijcleaow(zzctVar3.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg4 = zoijcleaow.iobyxmoadg("isRotated");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        c1380zoijcleaowIobyxmoadg4.zoijcleaow(zzctVar4.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg5 = zoijcleaow.iobyxmoadg("hasLowConfidenceProposedCorners");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        c1380zoijcleaowIobyxmoadg5.zoijcleaow(zzctVar5.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg6 = zoijcleaow.iobyxmoadg("autoCaptureTriggerLatencyMs");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        c1380zoijcleaowIobyxmoadg6.zoijcleaow(zzctVar6.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg7 = zoijcleaow.iobyxmoadg("galleryImportProcessingMs");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        c1380zoijcleaowIobyxmoadg7.zoijcleaow(zzctVar7.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg8 = zoijcleaow.iobyxmoadg("imageWidth");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        c1380zoijcleaowIobyxmoadg8.zoijcleaow(zzctVar8.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg9 = zoijcleaow.iobyxmoadg("imageHeight");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        c1380zoijcleaowIobyxmoadg9.zoijcleaow(zzctVar9.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg10 = zoijcleaow.iobyxmoadg("proposedCorners");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        c1380zoijcleaowIobyxmoadg10.zoijcleaow(zzctVar10.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg11 = zoijcleaow.iobyxmoadg("adjustedCorners");
        zzct zzctVar11 = new zzct();
        zzctVar11.zza(11);
        c1380zoijcleaowIobyxmoadg11.zoijcleaow(zzctVar11.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg12 = zoijcleaow.iobyxmoadg("isShadowRemoved");
        zzct zzctVar12 = new zzct();
        zzctVar12.zza(12);
        c1380zoijcleaowIobyxmoadg12.zoijcleaow(zzctVar12.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg13 = zoijcleaow.iobyxmoadg("numOfAppliedCleanUpStrokes");
        zzct zzctVar13 = new zzct();
        zzctVar13.zza(13);
        c1380zoijcleaowIobyxmoadg13.zoijcleaow(zzctVar13.zzb()).iobyxmoadg();
        zoijcleaow.C1380zoijcleaow c1380zoijcleaowIobyxmoadg14 = zoijcleaow.iobyxmoadg("numOfAttemptedCleanUpStrokes");
        zzct zzctVar14 = new zzct();
        zzctVar14.zza(14);
        c1380zoijcleaowIobyxmoadg14.zoijcleaow(zzctVar14.zzb()).iobyxmoadg();
    }

    private zzhs() {
    }

    @Override // mc.ppxfxbqfkf
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
