package kk0;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.core.models.delivery.DeliveryCode;
import yj0.wkgbmnqykc;
import zj0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f59639iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private zj0.zoijcleaow f59640ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private ppxfxbqfkf f59641zoijcleaow;

    /* JADX INFO: renamed from: kk0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1186iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f59642cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f59644jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f59645yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f59646zdlpuopuiu;

        C1186iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f59644jyumaefscl = obj;
            this.f59642cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.ppxfxbqfkf(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f59647jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f59649zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f59649zdlpuopuiu = obj;
            this.f59647jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.wkgbmnqykc(null, this);
        }
    }

    public iobyxmoadg(wkgbmnqykc remoteSource) {
        zdlpuopuiu.btonecajqb(remoteSource, "remoteSource");
        this.f59639iobyxmoadg = remoteSource;
    }

    private final void eablkybsjg() {
        this.f59641zoijcleaow = null;
        this.f59640ppxfxbqfkf = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        C1186iobyxmoadg c1186iobyxmoadg;
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1186iobyxmoadg) {
            c1186iobyxmoadg = (C1186iobyxmoadg) gxszxtbevoVar;
            int i13 = c1186iobyxmoadg.f59642cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1186iobyxmoadg.f59642cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c1186iobyxmoadg = new C1186iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            c1186iobyxmoadg = new C1186iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = c1186iobyxmoadg.f59644jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1186iobyxmoadg.f59642cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            wkgbmnqykc wkgbmnqykcVar = this.f59639iobyxmoadg;
            String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
            String strPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf();
            DeliveryCode deliveryCodeZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            String serverCode = deliveryCodeZoijcleaow != null ? deliveryCodeZoijcleaow.getServerCode() : null;
            c1186iobyxmoadg.f59646zdlpuopuiu = this;
            c1186iobyxmoadg.f59645yggfygwlhe = ppxfxbqfkfVar;
            c1186iobyxmoadg.f59642cqumvgiudr = 1;
            objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg(strIobyxmoadg, strPpxfxbqfkf, serverCode, c1186iobyxmoadg);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) c1186iobyxmoadg.f59645yggfygwlhe;
            iobyxmoadgVar = (iobyxmoadg) c1186iobyxmoadg.f59646zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        zj0.zoijcleaow zoijcleaowVar = (zj0.zoijcleaow) objIobyxmoadg;
        iobyxmoadgVar.f59641zoijcleaow = ppxfxbqfkfVar;
        iobyxmoadgVar.f59640ppxfxbqfkf = zoijcleaowVar;
        return zoijcleaowVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f59647jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f59647jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = zoijcleaowVar.f59649zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f59647jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            eablkybsjg();
            zoijcleaowVar.f59647jyumaefscl = 1;
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
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!((zj0.zoijcleaow) objPpxfxbqfkf).zoijcleaow().isEmpty());
    }

    public final Object zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo gxszxtbevoVar) {
        zj0.zoijcleaow zoijcleaowVar = this.f59640ppxfxbqfkf;
        return (!zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, this.f59641zoijcleaow) || zoijcleaowVar == null) ? ppxfxbqfkf(ppxfxbqfkfVar, gxszxtbevoVar) : zoijcleaowVar;
    }
}
