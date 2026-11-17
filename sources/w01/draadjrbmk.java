package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class draadjrbmk extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final iobyxmoadg f118304eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f118305ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f118306wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118307zoijcleaow;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118308cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118310jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118311yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118312zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118310jyumaefscl = obj;
            this.f118308cqumvgiudr |= Integer.MIN_VALUE;
            return draadjrbmk.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118313iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118314zoijcleaow;

        public zoijcleaow(String orderId, String productId) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(productId, "productId");
            this.f118313iobyxmoadg = orderId;
            this.f118314zoijcleaow = productId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f118313iobyxmoadg, zoijcleaowVar.f118313iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118314zoijcleaow, zoijcleaowVar.f118314zoijcleaow);
        }

        public int hashCode() {
            return (this.f118313iobyxmoadg.hashCode() * 31) + this.f118314zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118313iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118313iobyxmoadg + ", productId=" + this.f118314zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f118314zoijcleaow;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public draadjrbmk(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118307zoijcleaow = orderLocalSource;
        this.f118305ppxfxbqfkf = orderRemoteSource;
        this.f118306wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:35:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x016f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        draadjrbmk draadjrbmkVar;
        zoijcleaow zoijcleaowVar2;
        draadjrbmk draadjrbmkVar2;
        uz0.iobyxmoadg iobyxmoadgVar;
        uz0.iobyxmoadg iobyxmoadgVar2;
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        k01.nufgyqmvbu nufgyqmvbuVar;
        uz0.iobyxmoadg iobyxmoadgVar3;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f118308cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f118308cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f118310jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f118308cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar2 = (zoijcleaow) ppxfxbqfkfVar.f118311yggfygwlhe;
                draadjrbmk draadjrbmkVar3 = (draadjrbmk) ppxfxbqfkfVar.f118312zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                draadjrbmkVar = draadjrbmkVar3;
            } else if (i14 == 2) {
                uz0.iobyxmoadg iobyxmoadgVar4 = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118311yggfygwlhe;
                draadjrbmkVar2 = (draadjrbmk) ppxfxbqfkfVar.f118312zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar = iobyxmoadgVar4;
                iobyxmoadgVar2 = (uz0.iobyxmoadg) objZoijcleaow;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f114832nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar.f114824btonecajqb : iobyxmoadgVar2.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar.f114825draadjrbmk : iobyxmoadgVar2.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar.f114836vdvldrhtss : null);
                nufgyqmvbuVar = draadjrbmkVar2.f118307zoijcleaow;
                ppxfxbqfkfVar.f118312zdlpuopuiu = iobyxmoadgVar2;
                ppxfxbqfkfVar.f118311yggfygwlhe = null;
                ppxfxbqfkfVar.f118308cqumvgiudr = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar3 = iobyxmoadgVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar3 = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118312zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return iobyxmoadgVar3.oxmwwwfdhm();
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        gtknphoqwx gtknphoqwxVar = this.f118306wkgbmnqykc;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar5 = new gtknphoqwx.iobyxmoadg(zoijcleaowVar.iobyxmoadg());
        ppxfxbqfkfVar.f118312zdlpuopuiu = this;
        ppxfxbqfkfVar.f118311yggfygwlhe = zoijcleaowVar;
        ppxfxbqfkfVar.f118308cqumvgiudr = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar5, ppxfxbqfkfVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        draadjrbmkVar = this;
        zoijcleaowVar2 = zoijcleaowVar;
        uz0.iobyxmoadg iobyxmoadgVar6 = (uz0.iobyxmoadg) objZoijcleaow;
        List<uz0.eablkybsjg> listPpxfxbqfkf = iobyxmoadgVar6.ppxfxbqfkf();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
        for (uz0.eablkybsjg eablkybsjgVarZoijcleaow : listPpxfxbqfkf) {
            if (zdlpuopuiu.eablkybsjg(eablkybsjgVarZoijcleaow.nufgyqmvbu(), zoijcleaowVar2.zoijcleaow())) {
                eablkybsjgVarZoijcleaow = uz0.eablkybsjg.zoijcleaow(eablkybsjgVarZoijcleaow, null, null, false, null, 0.0d, null, 0, null, null, 0, null, null, null, 0.0d, false, null, null, null, 0.0d, false, null, 1835007, null);
            }
            arrayList.add(eablkybsjgVarZoijcleaow);
        }
        k01.dxjokdxxww dxjokdxxwwVar = draadjrbmkVar.f118305ppxfxbqfkf;
        String strIobyxmoadg = zoijcleaowVar2.iobyxmoadg();
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar6.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar6.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar6.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar6.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar6.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar6.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar6.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar6.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar6.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar6.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar6.f114824btonecajqb : null, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar6.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar6.f114825draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar6.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar6.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar6.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar6.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar6.f114836vdvldrhtss : null);
        uz0.zoijcleaow zoijcleaowVar3 = uz0.zoijcleaow.CONTINUE;
        ppxfxbqfkfVar.f118312zdlpuopuiu = draadjrbmkVar;
        ppxfxbqfkfVar.f118311yggfygwlhe = iobyxmoadgVar6;
        ppxfxbqfkfVar.f118308cqumvgiudr = 2;
        Object objGtknphoqwx = k01.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, strIobyxmoadg, iobyxmoadgVarIobyxmoadg2, null, zoijcleaowVar3, ppxfxbqfkfVar, 4, null);
        if (objGtknphoqwx == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        draadjrbmkVar2 = draadjrbmkVar;
        iobyxmoadgVar = iobyxmoadgVar6;
        objZoijcleaow = objGtknphoqwx;
        iobyxmoadgVar2 = (uz0.iobyxmoadg) objZoijcleaow;
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar.f114832nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar.f114824btonecajqb : iobyxmoadgVar2.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar.f114825draadjrbmk : iobyxmoadgVar2.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar.f114836vdvldrhtss : null);
        nufgyqmvbuVar = draadjrbmkVar2.f118307zoijcleaow;
        ppxfxbqfkfVar.f118312zdlpuopuiu = iobyxmoadgVar2;
        ppxfxbqfkfVar.f118311yggfygwlhe = null;
        ppxfxbqfkfVar.f118308cqumvgiudr = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar3 = iobyxmoadgVar2;
        return iobyxmoadgVar3.oxmwwwfdhm();
    }
}
