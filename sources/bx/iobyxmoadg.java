package bx;

import ax.ppxfxbqfkf;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements zw.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ex.iobyxmoadg f17221iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final na0.iobyxmoadg f17222zoijcleaow;

    /* JADX INFO: renamed from: bx.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0314iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f17224esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f17225iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f17226jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f17227yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f17228zdlpuopuiu;

        C0314iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f17225iwizpuwonk = obj;
            this.f17224esjtqupxsv |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public iobyxmoadg(ex.iobyxmoadg remoteSource, na0.iobyxmoadg featureManager) {
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        this.f17221iobyxmoadg = remoteSource;
        this.f17222zoijcleaow = featureManager;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zw.iobyxmoadg
    public Object iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        C0314iobyxmoadg c0314iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        Map map;
        boolean zBooleanValue;
        Object objVdvldrhtss;
        Map map2;
        boolean z13;
        if (gxszxtbevoVar instanceof C0314iobyxmoadg) {
            c0314iobyxmoadg = (C0314iobyxmoadg) gxszxtbevoVar;
            int i13 = c0314iobyxmoadg.f17224esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0314iobyxmoadg.f17224esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                c0314iobyxmoadg = new C0314iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0314iobyxmoadg = new C0314iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0314iobyxmoadg.f17225iwizpuwonk;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c0314iobyxmoadg.f17224esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) c0314iobyxmoadg.f17228zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                iobyxmoadgVar = iobyxmoadgVar2;
            } else if (i14 == 2) {
                map = (Map) c0314iobyxmoadg.f17227yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) c0314iobyxmoadg.f17228zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                zBooleanValue = ((Boolean) objIobyxmoadg).booleanValue();
                na0.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f17222zoijcleaow;
                c0314iobyxmoadg.f17228zdlpuopuiu = map;
                c0314iobyxmoadg.f17227yggfygwlhe = null;
                c0314iobyxmoadg.f17226jyumaefscl = zBooleanValue;
                c0314iobyxmoadg.f17224esjtqupxsv = 3;
                objVdvldrhtss = iobyxmoadgVar3.vdvldrhtss(c0314iobyxmoadg);
                if (objVdvldrhtss == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                map2 = map;
                z13 = zBooleanValue;
                objIobyxmoadg = objVdvldrhtss;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z13 = c0314iobyxmoadg.f17226jyumaefscl;
                map2 = (Map) c0314iobyxmoadg.f17228zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
            return new ax.zoijcleaow(map2, z13, ((Boolean) objIobyxmoadg).booleanValue());
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        ex.iobyxmoadg iobyxmoadgVar4 = this.f17221iobyxmoadg;
        String strPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
        DeliveryCode deliveryCodeIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
        List listZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        c0314iobyxmoadg.f17228zdlpuopuiu = this;
        c0314iobyxmoadg.f17224esjtqupxsv = 1;
        objIobyxmoadg = iobyxmoadgVar4.iobyxmoadg(strPpxfxbqfkf, deliveryCodeIobyxmoadg, listZoijcleaow, c0314iobyxmoadg);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        Map map3 = (Map) objIobyxmoadg;
        na0.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar.f17222zoijcleaow;
        c0314iobyxmoadg.f17228zdlpuopuiu = iobyxmoadgVar;
        c0314iobyxmoadg.f17227yggfygwlhe = map3;
        c0314iobyxmoadg.f17224esjtqupxsv = 2;
        Object objBtonecajqb = iobyxmoadgVar5.btonecajqb(c0314iobyxmoadg);
        if (objBtonecajqb == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        objIobyxmoadg = objBtonecajqb;
        map = map3;
        zBooleanValue = ((Boolean) objIobyxmoadg).booleanValue();
        na0.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar.f17222zoijcleaow;
        c0314iobyxmoadg.f17228zdlpuopuiu = map;
        c0314iobyxmoadg.f17227yggfygwlhe = null;
        c0314iobyxmoadg.f17226jyumaefscl = zBooleanValue;
        c0314iobyxmoadg.f17224esjtqupxsv = 3;
        objVdvldrhtss = iobyxmoadgVar6.vdvldrhtss(c0314iobyxmoadg);
        if (objVdvldrhtss == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        map2 = map;
        z13 = zBooleanValue;
        objIobyxmoadg = objVdvldrhtss;
        return new ax.zoijcleaow(map2, z13, ((Boolean) objIobyxmoadg).booleanValue());
    }
}
