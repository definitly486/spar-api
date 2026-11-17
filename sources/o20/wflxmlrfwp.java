package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class wflxmlrfwp extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f71669ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71670zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71671iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f71672ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f71673zoijcleaow;

        public iobyxmoadg(String orderId, String dateReceipt, String interval) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
            zdlpuopuiu.btonecajqb(interval, "interval");
            this.f71671iobyxmoadg = orderId;
            this.f71673zoijcleaow = dateReceipt;
            this.f71672ppxfxbqfkf = interval;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f71671iobyxmoadg, iobyxmoadgVar.f71671iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71673zoijcleaow, iobyxmoadgVar.f71673zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f71672ppxfxbqfkf, iobyxmoadgVar.f71672ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f71671iobyxmoadg.hashCode() * 31) + this.f71673zoijcleaow.hashCode()) * 31) + this.f71672ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71673zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f71671iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71671iobyxmoadg + ", dateReceipt=" + this.f71673zoijcleaow + ", interval=" + this.f71672ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f71672ppxfxbqfkf;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71674cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71676jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71677yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71678zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71676jyumaefscl = obj;
            this.f71674cqumvgiudr |= Integer.MIN_VALUE;
            return wflxmlrfwp.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wflxmlrfwp(w10.nufgyqmvbu orderLocalSource, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71670zoijcleaow = orderLocalSource;
        this.f71669ppxfxbqfkf = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        wflxmlrfwp wflxmlrfwpVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f71674cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f71674cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f71676jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f71674cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f71677yggfygwlhe;
                wflxmlrfwpVar = (wflxmlrfwp) zoijcleaowVar.f71678zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        btonecajqb btonecajqbVar = this.f71669ppxfxbqfkf;
        btonecajqb.iobyxmoadg iobyxmoadgVar3 = new btonecajqb.iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf());
        zoijcleaowVar.f71678zdlpuopuiu = this;
        zoijcleaowVar.f71677yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f71674cqumvgiudr = 1;
        objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wflxmlrfwpVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        e10.iobyxmoadg iobyxmoadgVar4 = (e10.iobyxmoadg) objZoijcleaow;
        e10.nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar4.agtfadlqog();
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f30181lqeggnwhkg : nufgyqmvbuVarAgtfadlqog.iobyxmoadg((497 & 1) != 0 ? nufgyqmvbuVarAgtfadlqog.f30195iobyxmoadg : null, (497 & 2) != 0 ? nufgyqmvbuVarAgtfadlqog.f30200zoijcleaow : null, (497 & 4) != 0 ? nufgyqmvbuVarAgtfadlqog.f30198ppxfxbqfkf : null, (497 & 8) != 0 ? nufgyqmvbuVarAgtfadlqog.f30199wkgbmnqykc : null, (497 & 16) != 0 ? nufgyqmvbuVarAgtfadlqog.f30193eablkybsjg : null, (497 & 32) != 0 ? nufgyqmvbuVarAgtfadlqog.f30194gxszxtbevo : iobyxmoadgVar2.iobyxmoadg(), (497 & 64) != 0 ? nufgyqmvbuVarAgtfadlqog.f30196lqeggnwhkg : iobyxmoadgVar2.zoijcleaow(), (497 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarAgtfadlqog.f30197nufgyqmvbu : null, (497 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarAgtfadlqog.f30192dxjokdxxww : null), (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f30182nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f30174btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f30175draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVar4.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f30186vdvldrhtss : null);
        w10.nufgyqmvbu nufgyqmvbuVar = wflxmlrfwpVar.f71670zoijcleaow;
        zoijcleaowVar.f71678zdlpuopuiu = null;
        zoijcleaowVar.f71677yggfygwlhe = null;
        zoijcleaowVar.f71674cqumvgiudr = 2;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
