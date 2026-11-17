package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.components.payment.api.models.PaymentCode;
import ru.myspar.proloyalty.core.models.Warning;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.nufgyqmvbu f118396ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f118397wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.dxjokdxxww f118398zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118399iobyxmoadg;

        public iobyxmoadg(String orderId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            this.f118399iobyxmoadg = orderId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118399iobyxmoadg, ((iobyxmoadg) obj).f118399iobyxmoadg);
        }

        public int hashCode() {
            return this.f118399iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118399iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118399iobyxmoadg + ")";
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118400cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118402jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118403yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118404zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118402jyumaefscl = obj;
            this.f118400cqumvgiudr |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(k01.dxjokdxxww orderRemoteSource, k01.nufgyqmvbu orderLocalSource, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118398zoijcleaow = orderRemoteSource;
        this.f118396ppxfxbqfkf = orderLocalSource;
        this.f118397wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:31:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        wflxmlrfwp wflxmlrfwpVar;
        iobyxmoadg iobyxmoadgVar2;
        wflxmlrfwp wflxmlrfwpVar2;
        Warning warning;
        k01.nufgyqmvbu nufgyqmvbuVar;
        String strIobyxmoadg;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118400cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118400cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f118402jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118400cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f118403yggfygwlhe;
                wflxmlrfwpVar = (wflxmlrfwp) zoijcleaowVar.f118404zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Warning warning2 = (Warning) zoijcleaowVar.f118404zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                    return warning2;
                }
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f118403yggfygwlhe;
                wflxmlrfwpVar2 = (wflxmlrfwp) zoijcleaowVar.f118404zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            warning = (Warning) objZoijcleaow;
            nufgyqmvbuVar = wflxmlrfwpVar2.f118396ppxfxbqfkf;
            strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
            zoijcleaowVar.f118404zdlpuopuiu = warning;
            zoijcleaowVar.f118403yggfygwlhe = null;
            zoijcleaowVar.f118400cqumvgiudr = 3;
            if (nufgyqmvbuVar.iobyxmoadg(strIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return warning;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        gtknphoqwx.iobyxmoadg iobyxmoadgVar3 = new gtknphoqwx.iobyxmoadg(iobyxmoadgVar.iobyxmoadg());
        gtknphoqwx gtknphoqwxVar = this.f118397wkgbmnqykc;
        zoijcleaowVar.f118404zdlpuopuiu = this;
        zoijcleaowVar.f118403yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f118400cqumvgiudr = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wflxmlrfwpVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg = (uz0.iobyxmoadg) objZoijcleaow;
        if (iobyxmoadgVarIobyxmoadg.gtknphoqwx() != PaymentCode.CASH) {
            uz0.nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVarIobyxmoadg.agtfadlqog();
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVarIobyxmoadg.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVarIobyxmoadg.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVarIobyxmoadg.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVarIobyxmoadg.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVarIobyxmoadg.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVarIobyxmoadg.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVarIobyxmoadg.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVarIobyxmoadg.f114831lqeggnwhkg : nufgyqmvbuVarAgtfadlqog.iobyxmoadg((497 & 1) != 0 ? nufgyqmvbuVarAgtfadlqog.f114845iobyxmoadg : null, (497 & 2) != 0 ? nufgyqmvbuVarAgtfadlqog.f114850zoijcleaow : null, (497 & 4) != 0 ? nufgyqmvbuVarAgtfadlqog.f114848ppxfxbqfkf : null, (497 & 8) != 0 ? nufgyqmvbuVarAgtfadlqog.f114849wkgbmnqykc : null, (497 & 16) != 0 ? nufgyqmvbuVarAgtfadlqog.f114843eablkybsjg : null, (497 & 32) != 0 ? nufgyqmvbuVarAgtfadlqog.f114844gxszxtbevo : null, (497 & 64) != 0 ? nufgyqmvbuVarAgtfadlqog.f114846lqeggnwhkg : null, (497 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarAgtfadlqog.f114847nufgyqmvbu : "", (497 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarAgtfadlqog.f114842dxjokdxxww : null), (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVarIobyxmoadg.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVarIobyxmoadg.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVarIobyxmoadg.f114824btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVarIobyxmoadg.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVarIobyxmoadg.f114825draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVarIobyxmoadg.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVarIobyxmoadg.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVarIobyxmoadg.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVarIobyxmoadg.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVarIobyxmoadg.f114836vdvldrhtss : null);
        }
        k01.dxjokdxxww dxjokdxxwwVar = wflxmlrfwpVar.f118398zoijcleaow;
        String strIobyxmoadg2 = iobyxmoadgVar2.iobyxmoadg();
        uz0.zoijcleaow zoijcleaowVar2 = uz0.zoijcleaow.SAVE;
        zoijcleaowVar.f118404zdlpuopuiu = wflxmlrfwpVar;
        zoijcleaowVar.f118403yggfygwlhe = iobyxmoadgVar2;
        zoijcleaowVar.f118400cqumvgiudr = 2;
        objZoijcleaow = dxjokdxxwwVar.wflxmlrfwp(strIobyxmoadg2, iobyxmoadgVarIobyxmoadg, zoijcleaowVar2, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wflxmlrfwpVar2 = wflxmlrfwpVar;
        warning = (Warning) objZoijcleaow;
        nufgyqmvbuVar = wflxmlrfwpVar2.f118396ppxfxbqfkf;
        strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        zoijcleaowVar.f118404zdlpuopuiu = warning;
        zoijcleaowVar.f118403yggfygwlhe = null;
        zoijcleaowVar.f118400cqumvgiudr = 3;
        if (nufgyqmvbuVar.iobyxmoadg(strIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return warning;
    }
}
