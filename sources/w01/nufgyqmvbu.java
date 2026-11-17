package w01;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.nufgyqmvbu f118374ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.dxjokdxxww f118375zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118376iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f118376iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118376iobyxmoadg, ((iobyxmoadg) obj).f118376iobyxmoadg);
        }

        public int hashCode() {
            return this.f118376iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118376iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118376iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118377cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118379jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118380yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118381zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118379jyumaefscl = obj;
            this.f118377cqumvgiudr |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(k01.dxjokdxxww orderRemoteSource, k01.nufgyqmvbu orderLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118375zoijcleaow = orderRemoteSource;
        this.f118374ppxfxbqfkf = orderLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118377cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118377cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f118379jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118377cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f118380yggfygwlhe;
                nufgyqmvbuVar = (nufgyqmvbu) zoijcleaowVar.f118381zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        k01.dxjokdxxww dxjokdxxwwVar = this.f118375zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f118381zdlpuopuiu = this;
        zoijcleaowVar.f118380yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f118377cqumvgiudr = 1;
        if (dxjokdxxwwVar.zoijcleaow(strIobyxmoadg, null, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        nufgyqmvbuVar = this;
        k01.nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbuVar.f118374ppxfxbqfkf;
        String strIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f118381zdlpuopuiu = null;
        zoijcleaowVar.f118380yggfygwlhe = null;
        zoijcleaowVar.f118377cqumvgiudr = 2;
        if (nufgyqmvbuVar2.iobyxmoadg(strIobyxmoadg2, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
