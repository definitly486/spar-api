package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class gtknphoqwx extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final iobyxmoadg f71624eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f71625ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f71626wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71627zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71628cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71630jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71631yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71632zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71630jyumaefscl = obj;
            this.f71628cqumvgiudr |= Integer.MIN_VALUE;
            return gtknphoqwx.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71633iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f71634zoijcleaow;

        public zoijcleaow(String orderId, String productId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f71633iobyxmoadg = orderId;
            this.f71634zoijcleaow = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f71633iobyxmoadg, zoijcleaowVar.f71633iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71634zoijcleaow, zoijcleaowVar.f71634zoijcleaow);
        }

        public int hashCode() {
            return (this.f71633iobyxmoadg.hashCode() * 31) + this.f71634zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71633iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71633iobyxmoadg + ", productId=" + this.f71634zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f71634zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtknphoqwx(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71627zoijcleaow = orderLocalSource;
        this.f71625ppxfxbqfkf = orderRemoteSource;
        this.f71626wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:35:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        gtknphoqwx gtknphoqwxVar;
        zoijcleaow zoijcleaowVar2;
        gtknphoqwx gtknphoqwxVar2;
        e10.iobyxmoadg iobyxmoadgVar;
        e10.iobyxmoadg iobyxmoadgVar2;
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        w10.nufgyqmvbu nufgyqmvbuVar;
        e10.iobyxmoadg iobyxmoadgVar3;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f71628cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f71628cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f71630jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f71628cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar2 = (zoijcleaow) ppxfxbqfkfVar.f71631yggfygwlhe;
                gtknphoqwx gtknphoqwxVar3 = (gtknphoqwx) ppxfxbqfkfVar.f71632zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                gtknphoqwxVar = gtknphoqwxVar3;
            } else if (i14 == 2) {
                e10.iobyxmoadg iobyxmoadgVar4 = (e10.iobyxmoadg) ppxfxbqfkfVar.f71631yggfygwlhe;
                gtknphoqwxVar2 = (gtknphoqwx) ppxfxbqfkfVar.f71632zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar = iobyxmoadgVar4;
                iobyxmoadgVar2 = (e10.iobyxmoadg) objZoijcleaow;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f30182nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar.f30174btonecajqb : iobyxmoadgVar2.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar.f30175draadjrbmk : iobyxmoadgVar2.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar.f30186vdvldrhtss : null);
                nufgyqmvbuVar = gtknphoqwxVar2.f71627zoijcleaow;
                ppxfxbqfkfVar.f71632zdlpuopuiu = iobyxmoadgVar2;
                ppxfxbqfkfVar.f71631yggfygwlhe = null;
                ppxfxbqfkfVar.f71628cqumvgiudr = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar3 = iobyxmoadgVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar3 = (e10.iobyxmoadg) ppxfxbqfkfVar.f71632zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return iobyxmoadgVar3.oxmwwwfdhm();
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        btonecajqb btonecajqbVar = this.f71626wkgbmnqykc;
        btonecajqb.iobyxmoadg iobyxmoadgVar5 = new btonecajqb.iobyxmoadg(zoijcleaowVar.iobyxmoadg());
        ppxfxbqfkfVar.f71632zdlpuopuiu = this;
        ppxfxbqfkfVar.f71631yggfygwlhe = zoijcleaowVar;
        ppxfxbqfkfVar.f71628cqumvgiudr = 1;
        objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar5, ppxfxbqfkfVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gtknphoqwxVar = this;
        zoijcleaowVar2 = zoijcleaowVar;
        e10.iobyxmoadg iobyxmoadgVar6 = (e10.iobyxmoadg) objZoijcleaow;
        List<e10.eablkybsjg> listPpxfxbqfkf = iobyxmoadgVar6.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        for (e10.eablkybsjg eablkybsjgVarZoijcleaow : listPpxfxbqfkf) {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarZoijcleaow.nufgyqmvbu(), zoijcleaowVar2.zoijcleaow())) {
                eablkybsjgVarZoijcleaow = e10.eablkybsjg.zoijcleaow(eablkybsjgVarZoijcleaow, null, null, false, null, 0.0d, null, 0, null, null, 0, null, null, null, 0.0d, false, null, null, null, 0.0d, false, null, 1835007, null);
            }
            arrayList.add(eablkybsjgVarZoijcleaow);
        }
        w10.dxjokdxxww dxjokdxxwwVar = gtknphoqwxVar.f71625ppxfxbqfkf;
        String strIobyxmoadg = zoijcleaowVar2.iobyxmoadg();
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar6.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar6.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar6.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar6.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar6.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar6.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar6.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar6.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar6.f30182nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar6.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar6.f30174btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar6.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar6.f30175draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar6.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar6.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar6.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar6.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar6.f30186vdvldrhtss : null);
        e10.zoijcleaow zoijcleaowVar3 = e10.zoijcleaow.CONTINUE;
        ppxfxbqfkfVar.f71632zdlpuopuiu = gtknphoqwxVar;
        ppxfxbqfkfVar.f71631yggfygwlhe = iobyxmoadgVar6;
        ppxfxbqfkfVar.f71628cqumvgiudr = 2;
        Object objGtknphoqwx = w10.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, strIobyxmoadg, iobyxmoadgVarIobyxmoadg2, null, zoijcleaowVar3, ppxfxbqfkfVar, 4, null);
        if (objGtknphoqwx == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gtknphoqwxVar2 = gtknphoqwxVar;
        iobyxmoadgVar = iobyxmoadgVar6;
        objZoijcleaow = objGtknphoqwx;
        iobyxmoadgVar2 = (e10.iobyxmoadg) objZoijcleaow;
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f30182nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar.f30174btonecajqb : iobyxmoadgVar2.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar.f30175draadjrbmk : iobyxmoadgVar2.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar.f30186vdvldrhtss : null);
        nufgyqmvbuVar = gtknphoqwxVar2.f71627zoijcleaow;
        ppxfxbqfkfVar.f71632zdlpuopuiu = iobyxmoadgVar2;
        ppxfxbqfkfVar.f71631yggfygwlhe = null;
        ppxfxbqfkfVar.f71628cqumvgiudr = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar3 = iobyxmoadgVar2;
        return iobyxmoadgVar3.oxmwwwfdhm();
    }
}
