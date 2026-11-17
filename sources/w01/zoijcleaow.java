package w01;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.models.Warning;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.nufgyqmvbu f118420ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.dxjokdxxww f118421zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118422iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f118422iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118422iobyxmoadg, ((iobyxmoadg) obj).f118422iobyxmoadg);
        }

        public int hashCode() {
            return this.f118422iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118422iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118422iobyxmoadg + ")";
        }
    }

    /* JADX INFO: renamed from: w01.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C2945zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118423cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118425jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118426yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118427zdlpuopuiu;

        C2945zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118425jyumaefscl = obj;
            this.f118423cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(k01.dxjokdxxww orderRemoteSource, k01.nufgyqmvbu orderLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118421zoijcleaow = orderRemoteSource;
        this.f118420ppxfxbqfkf = orderLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        C2945zoijcleaow c2945zoijcleaow;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C2945zoijcleaow) {
            c2945zoijcleaow = (C2945zoijcleaow) gxszxtbevoVar;
            int i13 = c2945zoijcleaow.f118423cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2945zoijcleaow.f118423cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c2945zoijcleaow = new C2945zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c2945zoijcleaow = new C2945zoijcleaow(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = c2945zoijcleaow.f118425jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c2945zoijcleaow.f118423cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            k01.dxjokdxxww dxjokdxxwwVar = this.f118421zoijcleaow;
            String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            uz0.zoijcleaow zoijcleaowVar2 = uz0.zoijcleaow.CANCEL;
            c2945zoijcleaow.f118427zdlpuopuiu = this;
            c2945zoijcleaow.f118426yggfygwlhe = iobyxmoadgVar;
            c2945zoijcleaow.f118423cqumvgiudr = 1;
            objLqeggnwhkg = k01.dxjokdxxww.lqeggnwhkg(dxjokdxxwwVar, strIobyxmoadg, null, zoijcleaowVar2, c2945zoijcleaow, 2, null);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Warning warning = (Warning) c2945zoijcleaow.f118427zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
                return warning;
            }
            iobyxmoadgVar = (iobyxmoadg) c2945zoijcleaow.f118426yggfygwlhe;
            zoijcleaowVar = (zoijcleaow) c2945zoijcleaow.f118427zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        Warning warning2 = (Warning) objLqeggnwhkg;
        k01.nufgyqmvbu nufgyqmvbuVar = zoijcleaowVar.f118420ppxfxbqfkf;
        String strIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        c2945zoijcleaow.f118427zdlpuopuiu = warning2;
        c2945zoijcleaow.f118426yggfygwlhe = null;
        c2945zoijcleaow.f118423cqumvgiudr = 2;
        return nufgyqmvbuVar.iobyxmoadg(strIobyxmoadg2, c2945zoijcleaow) == objGxszxtbevo ? objGxszxtbevo : warning2;
    }
}
