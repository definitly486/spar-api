package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class agtfadlqog extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f118293ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118294zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118295iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f118296ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118297zoijcleaow;

        public iobyxmoadg(String orderId, String dateReceipt, String interval) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
            zdlpuopuiu.btonecajqb(interval, "interval");
            this.f118295iobyxmoadg = orderId;
            this.f118297zoijcleaow = dateReceipt;
            this.f118296ppxfxbqfkf = interval;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118295iobyxmoadg, iobyxmoadgVar.f118295iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118297zoijcleaow, iobyxmoadgVar.f118297zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118296ppxfxbqfkf, iobyxmoadgVar.f118296ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f118295iobyxmoadg.hashCode() * 31) + this.f118297zoijcleaow.hashCode()) * 31) + this.f118296ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118297zoijcleaow;
        }

        public final String ppxfxbqfkf() {
            return this.f118295iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118295iobyxmoadg + ", dateReceipt=" + this.f118297zoijcleaow + ", interval=" + this.f118296ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f118296ppxfxbqfkf;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118298cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118300jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118301yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118302zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118300jyumaefscl = obj;
            this.f118298cqumvgiudr |= Integer.MIN_VALUE;
            return agtfadlqog.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtfadlqog(k01.nufgyqmvbu orderLocalSource, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118294zoijcleaow = orderLocalSource;
        this.f118293ppxfxbqfkf = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        agtfadlqog agtfadlqogVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118298cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118298cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f118300jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118298cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f118301yggfygwlhe;
                agtfadlqogVar = (agtfadlqog) zoijcleaowVar.f118302zdlpuopuiu;
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
        gtknphoqwx gtknphoqwxVar = this.f118293ppxfxbqfkf;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar3 = new gtknphoqwx.iobyxmoadg(iobyxmoadgVar.ppxfxbqfkf());
        zoijcleaowVar.f118302zdlpuopuiu = this;
        zoijcleaowVar.f118301yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f118298cqumvgiudr = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        agtfadlqogVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        uz0.iobyxmoadg iobyxmoadgVar4 = (uz0.iobyxmoadg) objZoijcleaow;
        uz0.nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar4.agtfadlqog();
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f114831lqeggnwhkg : nufgyqmvbuVarAgtfadlqog.iobyxmoadg((497 & 1) != 0 ? nufgyqmvbuVarAgtfadlqog.f114845iobyxmoadg : null, (497 & 2) != 0 ? nufgyqmvbuVarAgtfadlqog.f114850zoijcleaow : null, (497 & 4) != 0 ? nufgyqmvbuVarAgtfadlqog.f114848ppxfxbqfkf : null, (497 & 8) != 0 ? nufgyqmvbuVarAgtfadlqog.f114849wkgbmnqykc : null, (497 & 16) != 0 ? nufgyqmvbuVarAgtfadlqog.f114843eablkybsjg : null, (497 & 32) != 0 ? nufgyqmvbuVarAgtfadlqog.f114844gxszxtbevo : iobyxmoadgVar2.iobyxmoadg(), (497 & 64) != 0 ? nufgyqmvbuVarAgtfadlqog.f114846lqeggnwhkg : iobyxmoadgVar2.zoijcleaow(), (497 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarAgtfadlqog.f114847nufgyqmvbu : null, (497 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarAgtfadlqog.f114842dxjokdxxww : null), (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f114824btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f114825draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVar4.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f114836vdvldrhtss : null);
        k01.nufgyqmvbu nufgyqmvbuVar = agtfadlqogVar.f118294zoijcleaow;
        zoijcleaowVar.f118302zdlpuopuiu = null;
        zoijcleaowVar.f118301yggfygwlhe = null;
        zoijcleaowVar.f118298cqumvgiudr = 2;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
