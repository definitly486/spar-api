package o20;

import gg.kcexrzcfyt;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.error_handler.exceptions.DomainException;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f71579ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71580zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71581iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f71581iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71581iobyxmoadg, ((iobyxmoadg) obj).f71581iobyxmoadg);
        }

        public int hashCode() {
            return this.f71581iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71581iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71581iobyxmoadg + ")";
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f71582iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f71584yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71585zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71584yggfygwlhe = obj;
            this.f71582iwizpuwonk |= Integer.MIN_VALUE;
            return btonecajqb.this.eablkybsjg(null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71586cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71588jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71589yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71590zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71588jyumaefscl = obj;
            this.f71586cqumvgiudr |= Integer.MIN_VALUE;
            return btonecajqb.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btonecajqb(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71580zoijcleaow = orderLocalSource;
        this.f71579ppxfxbqfkf = orderRemoteSource;
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
        btonecajqb btonecajqbVar;
        e10.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f71582iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f71582iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objGtknphoqwx = ppxfxbqfkfVar.f71584yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f71582iwizpuwonk;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    btonecajqbVar = (btonecajqb) ppxfxbqfkfVar.f71585zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iobyxmoadgVar = (e10.iobyxmoadg) ppxfxbqfkfVar.f71585zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objGtknphoqwx);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(iobyxmoadgVar);
                thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
                if (thDxjokdxxww == null) {
                    return objWkgbmnqykc;
                }
                if (!xx.iobyxmoadg.f123319iobyxmoadg.cllcsxoeiz()) {
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
            w10.dxjokdxxww dxjokdxxwwVar = this.f71579ppxfxbqfkf;
            e10.zoijcleaow zoijcleaowVar = e10.zoijcleaow.START;
            ppxfxbqfkfVar.f71585zdlpuopuiu = this;
            ppxfxbqfkfVar.f71582iwizpuwonk = 1;
            objGtknphoqwx = w10.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, str, null, null, zoijcleaowVar, ppxfxbqfkfVar, 6, null);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            btonecajqbVar = this;
            e10.iobyxmoadg iobyxmoadgVar3 = (e10.iobyxmoadg) objGtknphoqwx;
            w10.nufgyqmvbu nufgyqmvbuVar = btonecajqbVar.f71580zoijcleaow;
            ppxfxbqfkfVar.f71585zdlpuopuiu = iobyxmoadgVar3;
            ppxfxbqfkfVar.f71582iwizpuwonk = 2;
            if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVar3, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = iobyxmoadgVar3;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(iobyxmoadgVar);
            thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww == null) {
                return objWkgbmnqykc;
            }
            if (!xx.iobyxmoadg.f123319iobyxmoadg.cllcsxoeiz()) {
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
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) throws DomainException {
        zoijcleaow zoijcleaowVar;
        btonecajqb btonecajqbVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f71586cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f71586cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objWkgbmnqykc = zoijcleaowVar.f71588jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f71586cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar.f71589yggfygwlhe;
                btonecajqbVar = (btonecajqb) zoijcleaowVar.f71590zdlpuopuiu;
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
        w10.nufgyqmvbu nufgyqmvbuVar = this.f71580zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        zoijcleaowVar.f71590zdlpuopuiu = this;
        zoijcleaowVar.f71589yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f71586cqumvgiudr = 1;
        objWkgbmnqykc = nufgyqmvbuVar.wkgbmnqykc(strIobyxmoadg, zoijcleaowVar);
        if (objWkgbmnqykc == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        btonecajqbVar = this;
        objWkgbmnqykc = (e10.iobyxmoadg) objWkgbmnqykc;
        if (objWkgbmnqykc == null) {
            String strIobyxmoadg2 = iobyxmoadgVar.iobyxmoadg();
            zoijcleaowVar.f71590zdlpuopuiu = null;
            zoijcleaowVar.f71589yggfygwlhe = null;
            zoijcleaowVar.f71586cqumvgiudr = 2;
            objWkgbmnqykc = btonecajqbVar.eablkybsjg(strIobyxmoadg2, zoijcleaowVar);
            if (objWkgbmnqykc == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        return objWkgbmnqykc;
    }
}
