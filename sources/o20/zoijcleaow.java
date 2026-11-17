package o20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.models.Warning;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.nufgyqmvbu f71694ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.dxjokdxxww f71695zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71696iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f71696iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71696iobyxmoadg, ((iobyxmoadg) obj).f71696iobyxmoadg);
        }

        public int hashCode() {
            return this.f71696iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71696iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71696iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: o20.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C1551zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71697cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71699jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71700yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71701zdlpuopuiu;

        C1551zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71699jyumaefscl = obj;
            this.f71697cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(w10.dxjokdxxww orderRemoteSource, w10.nufgyqmvbu orderLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71695zoijcleaow = orderRemoteSource;
        this.f71694ppxfxbqfkf = orderLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C1551zoijcleaow c1551zoijcleaow;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C1551zoijcleaow) {
            c1551zoijcleaow = (C1551zoijcleaow) gxszxtbevoVar;
            int i13 = c1551zoijcleaow.f71697cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1551zoijcleaow.f71697cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c1551zoijcleaow = new C1551zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c1551zoijcleaow = new C1551zoijcleaow(gxszxtbevoVar);
        }
        Object objDraadjrbmk = c1551zoijcleaow.f71699jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1551zoijcleaow.f71697cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
            w10.dxjokdxxww dxjokdxxwwVar = this.f71695zoijcleaow;
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            e10.zoijcleaow zoijcleaowVar2 = e10.zoijcleaow.CANCEL;
            c1551zoijcleaow.f71701zdlpuopuiu = this;
            c1551zoijcleaow.f71700yggfygwlhe = iobyxmoadgVar;
            c1551zoijcleaow.f71697cqumvgiudr = 1;
            objDraadjrbmk = w10.dxjokdxxww.draadjrbmk(dxjokdxxwwVar, strIobyxmoadg, null, zoijcleaowVar2, c1551zoijcleaow, 2, null);
            if (objDraadjrbmk == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Warning warning = (Warning) c1551zoijcleaow.f71701zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
                return warning;
            }
            iobyxmoadgVar = (iobyxmoadg) c1551zoijcleaow.f71700yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) c1551zoijcleaow.f71701zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objDraadjrbmk);
        }
        Warning warning2 = (Warning) objDraadjrbmk;
        w10.nufgyqmvbu nufgyqmvbuVar = zoijcleaowVar.f71694ppxfxbqfkf;
        String strIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        c1551zoijcleaow.f71701zdlpuopuiu = warning2;
        c1551zoijcleaow.f71700yggfygwlhe = null;
        c1551zoijcleaow.f71697cqumvgiudr = 2;
        return nufgyqmvbuVar.iobyxmoadg(strIobyxmoadg2, c1551zoijcleaow) == objGxszxtbevo ? objGxszxtbevo : warning2;
    }
}
