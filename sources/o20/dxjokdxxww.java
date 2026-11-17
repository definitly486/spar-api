package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final btonecajqb f71600ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71601zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71602iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f71603zoijcleaow;

        public iobyxmoadg(String orderId, List commentsGroupList) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(commentsGroupList, "commentsGroupList");
            this.f71602iobyxmoadg = orderId;
            this.f71603zoijcleaow = commentsGroupList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f71602iobyxmoadg, iobyxmoadgVar.f71602iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71603zoijcleaow, iobyxmoadgVar.f71603zoijcleaow);
        }

        public int hashCode() {
            return (this.f71602iobyxmoadg.hashCode() * 31) + this.f71603zoijcleaow.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f71603zoijcleaow;
        }

        public String toString() {
            return "Params(orderId=" + this.f71602iobyxmoadg + ", commentsGroupList=" + this.f71603zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f71602iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71604cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71606jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71607yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71608zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71606jyumaefscl = obj;
            this.f71604cqumvgiudr |= Integer.MIN_VALUE;
            return dxjokdxxww.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxjokdxxww(w10.nufgyqmvbu orderLocalSource, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71601zoijcleaow = orderLocalSource;
        this.f71600ppxfxbqfkf = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        dxjokdxxww dxjokdxxwwVar;
        iobyxmoadg iobyxmoadgVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f71604cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f71604cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f71606jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f71604cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f71607yggfygwlhe;
                dxjokdxxwwVar = (dxjokdxxww) zoijcleaowVar.f71608zdlpuopuiu;
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
        btonecajqb btonecajqbVar = this.f71600ppxfxbqfkf;
        btonecajqb.iobyxmoadg iobyxmoadgVar3 = new btonecajqb.iobyxmoadg(iobyxmoadgVar.zoijcleaow());
        zoijcleaowVar.f71608zdlpuopuiu = this;
        zoijcleaowVar.f71607yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f71604cqumvgiudr = 1;
        objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar3, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        dxjokdxxwwVar = this;
        iobyxmoadgVar2 = iobyxmoadgVar;
        e10.iobyxmoadg iobyxmoadgVar4 = (e10.iobyxmoadg) objZoijcleaow;
        e10.nufgyqmvbu nufgyqmvbuVarAgtfadlqog = iobyxmoadgVar4.agtfadlqog();
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f30181lqeggnwhkg : nufgyqmvbuVarAgtfadlqog.iobyxmoadg((497 & 1) != 0 ? nufgyqmvbuVarAgtfadlqog.f30195iobyxmoadg : null, (497 & 2) != 0 ? nufgyqmvbuVarAgtfadlqog.f30200zoijcleaow : null, (497 & 4) != 0 ? nufgyqmvbuVarAgtfadlqog.f30198ppxfxbqfkf : null, (497 & 8) != 0 ? nufgyqmvbuVarAgtfadlqog.f30199wkgbmnqykc : null, (497 & 16) != 0 ? nufgyqmvbuVarAgtfadlqog.f30193eablkybsjg : null, (497 & 32) != 0 ? nufgyqmvbuVarAgtfadlqog.f30194gxszxtbevo : null, (497 & 64) != 0 ? nufgyqmvbuVarAgtfadlqog.f30196lqeggnwhkg : null, (497 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nufgyqmvbuVarAgtfadlqog.f30197nufgyqmvbu : null, (497 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? nufgyqmvbuVarAgtfadlqog.f30192dxjokdxxww : iobyxmoadgVar2.iobyxmoadg()), (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f30182nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f30174btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f30175draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVar4.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f30186vdvldrhtss : null);
        w10.nufgyqmvbu nufgyqmvbuVar = dxjokdxxwwVar.f71601zoijcleaow;
        zoijcleaowVar.f71608zdlpuopuiu = null;
        zoijcleaowVar.f71607yggfygwlhe = null;
        zoijcleaowVar.f71604cqumvgiudr = 2;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
