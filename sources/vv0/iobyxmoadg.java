package vv0;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import uv0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements tv0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yv0.iobyxmoadg f118093iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final t81.iobyxmoadg f118094zoijcleaow;

    /* JADX INFO: renamed from: vv0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C2931iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f118096esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f118097iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f118098jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118099yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118100zdlpuopuiu;

        C2931iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118097iwizpuwonk = obj;
            this.f118096esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public iobyxmoadg(yv0.iobyxmoadg remoteSource, t81.iobyxmoadg featureManager) {
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        this.f118093iobyxmoadg = remoteSource;
        this.f118094zoijcleaow = featureManager;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // tv0.iobyxmoadg
    public Object iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        C2931iobyxmoadg c2931iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        Map map;
        boolean zBooleanValue;
        Object objPpxfxbqfkf;
        Map map2;
        boolean z13;
        if (gxszxtbevoVar instanceof C2931iobyxmoadg) {
            c2931iobyxmoadg = (C2931iobyxmoadg) gxszxtbevoVar;
            int i13 = c2931iobyxmoadg.f118096esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2931iobyxmoadg.f118096esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c2931iobyxmoadg = new C2931iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c2931iobyxmoadg = new C2931iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c2931iobyxmoadg.f118097iwizpuwonk;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c2931iobyxmoadg.f118096esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) c2931iobyxmoadg.f118100zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                iobyxmoadgVar = iobyxmoadgVar2;
            } else if (i14 == 2) {
                map = (Map) c2931iobyxmoadg.f118099yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) c2931iobyxmoadg.f118100zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                zBooleanValue = ((Boolean) objIobyxmoadg).booleanValue();
                t81.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f118094zoijcleaow;
                s81.iobyxmoadg iobyxmoadgVar4 = s81.iobyxmoadg.f105732jpowsppfya;
                c2931iobyxmoadg.f118100zdlpuopuiu = map;
                c2931iobyxmoadg.f118099yggfygwlhe = null;
                c2931iobyxmoadg.f118098jyumaefscl = zBooleanValue;
                c2931iobyxmoadg.f118096esjtqupxsv = 3;
                objPpxfxbqfkf = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar4, c2931iobyxmoadg);
                if (objPpxfxbqfkf == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                map2 = map;
                z13 = zBooleanValue;
                objIobyxmoadg = objPpxfxbqfkf;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = c2931iobyxmoadg.f118098jyumaefscl;
                map2 = (Map) c2931iobyxmoadg.f118100zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            return new uv0.zoijcleaow(map2, z13, ((Boolean) objIobyxmoadg).booleanValue());
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        yv0.iobyxmoadg iobyxmoadgVar5 = this.f118093iobyxmoadg;
        String strPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        DeliveryCode deliveryCodeIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        List listZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        c2931iobyxmoadg.f118100zdlpuopuiu = this;
        c2931iobyxmoadg.f118096esjtqupxsv = 1;
        objIobyxmoadg = iobyxmoadgVar5.iobyxmoadg(strPpxfxbqfkf, deliveryCodeIobyxmoadg, listZoijcleaow, c2931iobyxmoadg);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        Map map3 = (Map) objIobyxmoadg;
        t81.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar.f118094zoijcleaow;
        s81.iobyxmoadg iobyxmoadgVar7 = s81.iobyxmoadg.f105724esjtqupxsv;
        c2931iobyxmoadg.f118100zdlpuopuiu = iobyxmoadgVar;
        c2931iobyxmoadg.f118099yggfygwlhe = map3;
        c2931iobyxmoadg.f118096esjtqupxsv = 2;
        Object objPpxfxbqfkf2 = iobyxmoadgVar6.ppxfxbqfkf(iobyxmoadgVar7, c2931iobyxmoadg);
        if (objPpxfxbqfkf2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        objIobyxmoadg = objPpxfxbqfkf2;
        map = map3;
        zBooleanValue = ((Boolean) objIobyxmoadg).booleanValue();
        t81.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar.f118094zoijcleaow;
        s81.iobyxmoadg iobyxmoadgVar9 = s81.iobyxmoadg.f105732jpowsppfya;
        c2931iobyxmoadg.f118100zdlpuopuiu = map;
        c2931iobyxmoadg.f118099yggfygwlhe = null;
        c2931iobyxmoadg.f118098jyumaefscl = zBooleanValue;
        c2931iobyxmoadg.f118096esjtqupxsv = 3;
        objPpxfxbqfkf = iobyxmoadgVar8.ppxfxbqfkf(iobyxmoadgVar9, c2931iobyxmoadg);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        map2 = map;
        z13 = zBooleanValue;
        objIobyxmoadg = objPpxfxbqfkf;
        return new uv0.zoijcleaow(map2, z13, ((Boolean) objIobyxmoadg).booleanValue());
    }
}
