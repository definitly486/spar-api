package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f118351ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118352zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118353iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f118354ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f118355wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118356zoijcleaow;

        public iobyxmoadg(String orderId, String firstName, String lastName, String phone) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(firstName, "firstName");
            zdlpuopuiu.btonecajqb(lastName, "lastName");
            zdlpuopuiu.btonecajqb(phone, "phone");
            this.f118353iobyxmoadg = orderId;
            this.f118356zoijcleaow = firstName;
            this.f118354ppxfxbqfkf = lastName;
            this.f118355wkgbmnqykc = phone;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118353iobyxmoadg, iobyxmoadgVar.f118353iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118356zoijcleaow, iobyxmoadgVar.f118356zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118354ppxfxbqfkf, iobyxmoadgVar.f118354ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f118355wkgbmnqykc, iobyxmoadgVar.f118355wkgbmnqykc);
        }

        public int hashCode() {
            return (((((this.f118353iobyxmoadg.hashCode() * 31) + this.f118356zoijcleaow.hashCode()) * 31) + this.f118354ppxfxbqfkf.hashCode()) * 31) + this.f118355wkgbmnqykc.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118356zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f118353iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118353iobyxmoadg + ", firstName=" + this.f118356zoijcleaow + ", lastName=" + this.f118354ppxfxbqfkf + ", phone=" + this.f118355wkgbmnqykc + ")";
        }

        public final String wkgbmnqykc() {
            return this.f118355wkgbmnqykc;
        }

        public final String zoijcleaow() {
            return this.f118354ppxfxbqfkf;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118357cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118359jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118360yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118361zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118359jyumaefscl = obj;
            this.f118357cqumvgiudr |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(k01.nufgyqmvbu orderLocalSource, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118352zoijcleaow = orderLocalSource;
        this.f118351ppxfxbqfkf = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        gxszxtbevo gxszxtbevoVar2;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118357cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118357cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f118359jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118357cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f118360yggfygwlhe;
                gxszxtbevoVar2 = (gxszxtbevo) zoijcleaowVar.f118361zdlpuopuiu;
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
        gtknphoqwx gtknphoqwxVar = this.f118351ppxfxbqfkf;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar3 = new gtknphoqwx.iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf());
        zoijcleaowVar.f118361zdlpuopuiu = this;
        zoijcleaowVar.f118360yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f118357cqumvgiudr = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gxszxtbevoVar2 = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        uz0.iobyxmoadg iobyxmoadgVar4 = (uz0.iobyxmoadg) objZoijcleaow;
        uz0.nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar4.agtfadlqog();
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f114831lqeggnwhkg : nufgyqmvbuVarAgtfadlqog.iobyxmoadg((497 & 1) != 0 ? nufgyqmvbuVarAgtfadlqog.f114845iobyxmoadg : null, (497 & 2) != 0 ? nufgyqmvbuVarAgtfadlqog.f114850zoijcleaow : iobyxmoadgVar2.iobyxmoadg(), (497 & 4) != 0 ? nufgyqmvbuVarAgtfadlqog.f114848ppxfxbqfkf : iobyxmoadgVar2.zoijcleaow(), (497 & 8) != 0 ? nufgyqmvbuVarAgtfadlqog.f114849wkgbmnqykc : iobyxmoadgVar2.wkgbmnqykc(), (497 & 16) != 0 ? nufgyqmvbuVarAgtfadlqog.f114843eablkybsjg : null, (497 & 32) != 0 ? nufgyqmvbuVarAgtfadlqog.f114844gxszxtbevo : null, (497 & 64) != 0 ? nufgyqmvbuVarAgtfadlqog.f114846lqeggnwhkg : null, (497 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarAgtfadlqog.f114847nufgyqmvbu : null, (497 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarAgtfadlqog.f114842dxjokdxxww : null), (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f114824btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f114825draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVar4.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f114836vdvldrhtss : null);
        k01.nufgyqmvbu nufgyqmvbuVar = gxszxtbevoVar2.f118352zoijcleaow;
        zoijcleaowVar.f118361zdlpuopuiu = null;
        zoijcleaowVar.f118360yggfygwlhe = null;
        zoijcleaowVar.f118357cqumvgiudr = 2;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
