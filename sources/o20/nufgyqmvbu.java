package o20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.nufgyqmvbu f71658ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.dxjokdxxww f71659zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71660iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f71660iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71660iobyxmoadg, ((iobyxmoadg) obj).f71660iobyxmoadg);
        }

        public int hashCode() {
            return this.f71660iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71660iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71660iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71661cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71663jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71664yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71665zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71663jyumaefscl = obj;
            this.f71661cqumvgiudr |= Integer.MIN_VALUE;
            return nufgyqmvbu.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nufgyqmvbu(w10.dxjokdxxww orderRemoteSource, w10.nufgyqmvbu orderLocalSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71659zoijcleaow = orderRemoteSource;
        this.f71658ppxfxbqfkf = orderLocalSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        nufgyqmvbu nufgyqmvbuVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f71661cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f71661cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f71663jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f71661cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f71664yggfygwlhe;
                nufgyqmvbuVar = (nufgyqmvbu) zoijcleaowVar.f71665zdlpuopuiu;
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
        w10.dxjokdxxww dxjokdxxwwVar = this.f71659zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f71665zdlpuopuiu = this;
        zoijcleaowVar.f71664yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f71661cqumvgiudr = 1;
        if (dxjokdxxwwVar.zoijcleaow(strIobyxmoadg, null, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        nufgyqmvbuVar = this;
        w10.nufgyqmvbu nufgyqmvbuVar2 = nufgyqmvbuVar.f71658ppxfxbqfkf;
        String strIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f71665zdlpuopuiu = null;
        zoijcleaowVar.f71664yggfygwlhe = null;
        zoijcleaowVar.f71661cqumvgiudr = 2;
        if (nufgyqmvbuVar2.iobyxmoadg(strIobyxmoadg2, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
