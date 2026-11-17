package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.components.payment.api.models.PaymentCode;
import ru.myspar.core.models.Warning;

/* JADX INFO: loaded from: classes4.dex */
public final class draadjrbmk extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.nufgyqmvbu f71591ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f71592wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.dxjokdxxww f71593zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71594iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f71594iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71594iobyxmoadg, ((iobyxmoadg) obj).f71594iobyxmoadg);
        }

        public int hashCode() {
            return this.f71594iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71594iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71594iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71595cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71597jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71598yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71599zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71597jyumaefscl = obj;
            this.f71595cqumvgiudr |= Integer.MIN_VALUE;
            return draadjrbmk.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(w10.dxjokdxxww orderRemoteSource, w10.nufgyqmvbu orderLocalSource, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71593zoijcleaow = orderRemoteSource;
        this.f71591ppxfxbqfkf = orderLocalSource;
        this.f71592wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:31:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        draadjrbmk draadjrbmkVar;
        iobyxmoadg iobyxmoadgVar2;
        draadjrbmk draadjrbmkVar2;
        Warning warning;
        w10.nufgyqmvbu nufgyqmvbuVar;
        String strIobyxmoadg;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f71595cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f71595cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f71597jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f71595cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f71598yggfygwlhe;
                draadjrbmkVar = (draadjrbmk) zoijcleaowVar.f71599zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Warning warning2 = (Warning) zoijcleaowVar.f71599zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    return warning2;
                }
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f71598yggfygwlhe;
                draadjrbmkVar2 = (draadjrbmk) zoijcleaowVar.f71599zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            warning = (Warning) objZoijcleaow;
            nufgyqmvbuVar = draadjrbmkVar2.f71591ppxfxbqfkf;
            strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            zoijcleaowVar.f71599zdlpuopuiu = warning;
            zoijcleaowVar.f71598yggfygwlhe = null;
            zoijcleaowVar.f71595cqumvgiudr = 3;
            if (nufgyqmvbuVar.iobyxmoadg(strIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return warning;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        btonecajqb.iobyxmoadg iobyxmoadgVar3 = new btonecajqb.iobyxmoadg(iobyxmoadgVar.iobyxmoadg());
        btonecajqb btonecajqbVar = this.f71592wkgbmnqykc;
        zoijcleaowVar.f71599zdlpuopuiu = this;
        zoijcleaowVar.f71598yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f71595cqumvgiudr = 1;
        objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        draadjrbmkVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg = (e10.iobyxmoadg) objZoijcleaow;
        if (iobyxmoadgVarIobyxmoadg.gtknphoqwx() != PaymentCode.CASH) {
            e10.nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVarIobyxmoadg.agtfadlqog();
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f30181lqeggnwhkg : nufgyqmvbuVarAgtfadlqog.iobyxmoadg((497 & 1) != 0 ? nufgyqmvbuVarAgtfadlqog.f30195iobyxmoadg : null, (497 & 2) != 0 ? nufgyqmvbuVarAgtfadlqog.f30200zoijcleaow : null, (497 & 4) != 0 ? nufgyqmvbuVarAgtfadlqog.f30198ppxfxbqfkf : null, (497 & 8) != 0 ? nufgyqmvbuVarAgtfadlqog.f30199wkgbmnqykc : null, (497 & 16) != 0 ? nufgyqmvbuVarAgtfadlqog.f30193eablkybsjg : null, (497 & 32) != 0 ? nufgyqmvbuVarAgtfadlqog.f30194gxszxtbevo : null, (497 & 64) != 0 ? nufgyqmvbuVarAgtfadlqog.f30196lqeggnwhkg : null, (497 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarAgtfadlqog.f30197nufgyqmvbu : "", (497 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarAgtfadlqog.f30192dxjokdxxww : null), (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f30182nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f30174btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f30175draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVarIobyxmoadg.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVarIobyxmoadg.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVarIobyxmoadg.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVarIobyxmoadg.f30186vdvldrhtss : null);
        }
        w10.dxjokdxxww dxjokdxxwwVar = draadjrbmkVar.f71593zoijcleaow;
        String strIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
        e10.zoijcleaow zoijcleaowVar2 = e10.zoijcleaow.SAVE;
        zoijcleaowVar.f71599zdlpuopuiu = draadjrbmkVar;
        zoijcleaowVar.f71598yggfygwlhe = iobyxmoadgVar2;
        zoijcleaowVar.f71595cqumvgiudr = 2;
        objZoijcleaow = dxjokdxxwwVar.nufgyqmvbu(strIobyxmoadg2, iobyxmoadgVarIobyxmoadg, zoijcleaowVar2, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        draadjrbmkVar2 = draadjrbmkVar;
        warning = (Warning) objZoijcleaow;
        nufgyqmvbuVar = draadjrbmkVar2.f71591ppxfxbqfkf;
        strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        zoijcleaowVar.f71599zdlpuopuiu = warning;
        zoijcleaowVar.f71598yggfygwlhe = null;
        zoijcleaowVar.f71595cqumvgiudr = 3;
        if (nufgyqmvbuVar.iobyxmoadg(strIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return warning;
    }
}
