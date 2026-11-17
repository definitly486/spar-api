package w01;

import gg.kcexrzcfyt;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;

/* JADX INFO: loaded from: classes5.dex */
public final class gtknphoqwx extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f118339ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118340zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118341iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f118341iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118341iobyxmoadg, ((iobyxmoadg) obj).f118341iobyxmoadg);
        }

        public int hashCode() {
            return this.f118341iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118341iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118341iobyxmoadg + ")";
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f118342iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f118344yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118345zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118344yggfygwlhe = obj;
            this.f118342iwizpuwonk |= Integer.MIN_VALUE;
            return gtknphoqwx.this.eablkybsjg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118346cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118348jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118349yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118350zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118348jyumaefscl = obj;
            this.f118346cqumvgiudr |= Integer.MIN_VALUE;
            return gtknphoqwx.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118340zoijcleaow = orderLocalSource;
        this.f118339ppxfxbqfkf = orderRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(String str, lg.gxszxtbevo gxszxtbevoVar) throws DomainException {
        ppxfxbqfkf ppxfxbqfkfVar;
        Object objWkgbmnqykc;
        Throwable thDxjokdxxww;
        Throwable cause;
        String string;
        gtknphoqwx gtknphoqwxVar;
        uz0.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f118342iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f118342iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objGtknphoqwx = ppxfxbqfkfVar.f118344yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f118342iwizpuwonk;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    gtknphoqwxVar = (gtknphoqwx) ppxfxbqfkfVar.f118345zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118345zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(iobyxmoadgVar);
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww == null) {
                    return objWkgbmnqykc;
                }
                if (!uw0.ppxfxbqfkf.f114521iobyxmoadg.cqumvgiudr()) {
                    throw new DomainException(thDxjokdxxww.getMessage(), null, 2, null);
                }
                cause = thDxjokdxxww.getCause();
                if (cause != null) {
                    string = cause.toString();
                } else {
                    string = null;
                }
                if (string == null) {
                    string = "";
                }
                throw new DomainException(string + " " + thDxjokdxxww.getMessage(), null, 2, null);
            }
            gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            k01.dxjokdxxww dxjokdxxwwVar = this.f118339ppxfxbqfkf;
            uz0.zoijcleaow zoijcleaowVar = uz0.zoijcleaow.START;
            ppxfxbqfkfVar.f118345zdlpuopuiu = this;
            ppxfxbqfkfVar.f118342iwizpuwonk = 1;
            objGtknphoqwx = k01.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, str, null, null, zoijcleaowVar, ppxfxbqfkfVar, 6, null);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gtknphoqwxVar = this;
            uz0.iobyxmoadg iobyxmoadgVar3 = (uz0.iobyxmoadg) objGtknphoqwx;
            k01.nufgyqmvbu nufgyqmvbuVar = gtknphoqwxVar.f118340zoijcleaow;
            ppxfxbqfkfVar.f118345zdlpuopuiu = iobyxmoadgVar3;
            ppxfxbqfkfVar.f118342iwizpuwonk = 2;
            if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVar3, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = iobyxmoadgVar3;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(iobyxmoadgVar);
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww == null) {
                return objWkgbmnqykc;
            }
            if (!uw0.ppxfxbqfkf.f114521iobyxmoadg.cqumvgiudr()) {
                throw new DomainException(thDxjokdxxww.getMessage(), null, 2, null);
            }
            cause = thDxjokdxxww.getCause();
            if (cause != null) {
                string = cause.toString();
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            throw new DomainException(string + " " + thDxjokdxxww.getMessage(), null, 2, null);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) throws DomainException {
        zoijcleaow zoijcleaowVar;
        gtknphoqwx gtknphoqwxVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118346cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118346cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f118348jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118346cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f118349yggfygwlhe;
                gtknphoqwxVar = (gtknphoqwx) zoijcleaowVar.f118350zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
            }
            return objWkgbmnqykc;
        }
        gg.zdlpuopuiu.zoijcleaow(objWkgbmnqykc);
        k01.nufgyqmvbu nufgyqmvbuVar = this.f118340zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f118350zdlpuopuiu = this;
        zoijcleaowVar.f118349yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f118346cqumvgiudr = 1;
        objWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc(strIobyxmoadg, zoijcleaowVar);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gtknphoqwxVar = this;
        objWkgbmnqykc = (uz0.iobyxmoadg) objWkgbmnqykc;
        if (objWkgbmnqykc == null) {
            String strIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
            zoijcleaowVar.f118350zdlpuopuiu = null;
            zoijcleaowVar.f118349yggfygwlhe = null;
            zoijcleaowVar.f118346cqumvgiudr = 2;
            objWkgbmnqykc = gtknphoqwxVar.eablkybsjg(strIobyxmoadg2, zoijcleaowVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return objWkgbmnqykc;
    }
}
