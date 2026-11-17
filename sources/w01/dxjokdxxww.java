package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f118315ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118316zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118317iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f118318zoijcleaow;

        public iobyxmoadg(String orderId, List commentsGroupList) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(commentsGroupList, "commentsGroupList");
            this.f118317iobyxmoadg = orderId;
            this.f118318zoijcleaow = commentsGroupList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118317iobyxmoadg, iobyxmoadgVar.f118317iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118318zoijcleaow, iobyxmoadgVar.f118318zoijcleaow);
        }

        public int hashCode() {
            return (this.f118317iobyxmoadg.hashCode() * 31) + this.f118318zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f118318zoijcleaow;
        }

        public String toString() {
            return "Params(orderId=" + this.f118317iobyxmoadg + ", commentsGroupList=" + this.f118318zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f118317iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118319cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118321jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118322yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118323zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118321jyumaefscl = obj;
            this.f118319cqumvgiudr |= Integer.MIN_VALUE;
            return dxjokdxxww.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(k01.nufgyqmvbu orderLocalSource, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118316zoijcleaow = orderLocalSource;
        this.f118315ppxfxbqfkf = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        dxjokdxxww dxjokdxxwwVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118319cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118319cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f118321jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118319cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f118322yggfygwlhe;
                dxjokdxxwwVar = (dxjokdxxww) zoijcleaowVar.f118323zdlpuopuiu;
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
        gtknphoqwx gtknphoqwxVar = this.f118315ppxfxbqfkf;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar3 = new gtknphoqwx.iobyxmoadg(iobyxmoadgVar.zoijcleaow());
        zoijcleaowVar.f118323zdlpuopuiu = this;
        zoijcleaowVar.f118322yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f118319cqumvgiudr = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        dxjokdxxwwVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        uz0.iobyxmoadg iobyxmoadgVar4 = (uz0.iobyxmoadg) objZoijcleaow;
        uz0.nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar4.agtfadlqog();
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f114831lqeggnwhkg : nufgyqmvbuVarAgtfadlqog.iobyxmoadg((497 & 1) != 0 ? nufgyqmvbuVarAgtfadlqog.f114845iobyxmoadg : null, (497 & 2) != 0 ? nufgyqmvbuVarAgtfadlqog.f114850zoijcleaow : null, (497 & 4) != 0 ? nufgyqmvbuVarAgtfadlqog.f114848ppxfxbqfkf : null, (497 & 8) != 0 ? nufgyqmvbuVarAgtfadlqog.f114849wkgbmnqykc : null, (497 & 16) != 0 ? nufgyqmvbuVarAgtfadlqog.f114843eablkybsjg : null, (497 & 32) != 0 ? nufgyqmvbuVarAgtfadlqog.f114844gxszxtbevo : null, (497 & 64) != 0 ? nufgyqmvbuVarAgtfadlqog.f114846lqeggnwhkg : null, (497 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarAgtfadlqog.f114847nufgyqmvbu : null, (497 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarAgtfadlqog.f114842dxjokdxxww : iobyxmoadgVar2.iobyxmoadg()), (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f114824btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f114825draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVar4.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f114836vdvldrhtss : null);
        k01.nufgyqmvbu nufgyqmvbuVar = dxjokdxxwwVar.f118316zoijcleaow;
        zoijcleaowVar.f118323zdlpuopuiu = null;
        zoijcleaowVar.f118322yggfygwlhe = null;
        zoijcleaowVar.f118319cqumvgiudr = 2;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
