package ai1;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import oh1.wkgbmnqykc;
import ph1.ppxfxbqfkf;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f2031iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ph1.zoijcleaow f2032ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ppxfxbqfkf f2033zoijcleaow;

    /* JADX INFO: renamed from: ai1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0046iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f2034cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f2036jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f2037yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f2038zdlpuopuiu;

        C0046iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f2036jyumaefscl = obj;
            this.f2034cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f2039jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f2041zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f2041zdlpuopuiu = obj;
            this.f2039jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    public iobyxmoadg(wkgbmnqykc remoteSource) {
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        this.f2031iobyxmoadg = remoteSource;
    }

    private final void eablkybsjg() {
        this.f2033zoijcleaow = null;
        this.f2032ppxfxbqfkf = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        C0046iobyxmoadg c0046iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0046iobyxmoadg) {
            c0046iobyxmoadg = (C0046iobyxmoadg) gxszxtbevoVar;
            int i13 = c0046iobyxmoadg.f2034cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0046iobyxmoadg.f2034cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c0046iobyxmoadg = new C0046iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c0046iobyxmoadg = new C0046iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c0046iobyxmoadg.f2036jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0046iobyxmoadg.f2034cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            wkgbmnqykc wkgbmnqykcVar = this.f2031iobyxmoadg;
            String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
            String strPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
            DeliveryCode deliveryCodeZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            String serverCode = deliveryCodeZoijcleaow != null ? deliveryCodeZoijcleaow.getServerCode() : null;
            c0046iobyxmoadg.f2038zdlpuopuiu = this;
            c0046iobyxmoadg.f2037yggfygwlhe = ppxfxbqfkfVar;
            c0046iobyxmoadg.f2034cqumvgiudr = 1;
            objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(strIobyxmoadg, strPpxfxbqfkf, serverCode, c0046iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) c0046iobyxmoadg.f2037yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c0046iobyxmoadg.f2038zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        ph1.zoijcleaow zoijcleaowVar = (ph1.zoijcleaow) objIobyxmoadg;
        iobyxmoadgVar.f2033zoijcleaow = ppxfxbqfkfVar;
        iobyxmoadgVar.f2032ppxfxbqfkf = zoijcleaowVar;
        return zoijcleaowVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f2039jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f2039jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = zoijcleaowVar.f2041zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f2039jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            eablkybsjg();
            zoijcleaowVar.f2039jyumaefscl = 1;
            objPpxfxbqfkf = ppxfxbqfkf(ppxfxbqfkfVar, zoijcleaowVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!((ph1.zoijcleaow) objPpxfxbqfkf).zoijcleaow().isEmpty());
    }

    public final Object zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        ph1.zoijcleaow zoijcleaowVar = this.f2032ppxfxbqfkf;
        return (!zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, this.f2033zoijcleaow) || zoijcleaowVar == null) ? ppxfxbqfkf(ppxfxbqfkfVar, gxszxtbevoVar) : zoijcleaowVar;
    }
}
