package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class ojitshcjhn extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f118382ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f118383wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118384zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118385iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118386zoijcleaow;

        public iobyxmoadg(String orderId, String promo) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(promo, "promo");
            this.f118385iobyxmoadg = orderId;
            this.f118386zoijcleaow = promo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118385iobyxmoadg, iobyxmoadgVar.f118385iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118386zoijcleaow, iobyxmoadgVar.f118386zoijcleaow);
        }

        public int hashCode() {
            return (this.f118385iobyxmoadg.hashCode() * 31) + this.f118386zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118385iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f118385iobyxmoadg + ", promo=" + this.f118386zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f118386zoijcleaow;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f118388esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f118389iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f118390jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118391yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118392zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118389iwizpuwonk = obj;
            this.f118388esjtqupxsv |= Integer.MIN_VALUE;
            return ojitshcjhn.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojitshcjhn(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118384zoijcleaow = orderLocalSource;
        this.f118382ppxfxbqfkf = orderRemoteSource;
        this.f118383wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ojitshcjhn ojitshcjhnVar;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        ojitshcjhn ojitshcjhnVar2;
        uz0.iobyxmoadg iobyxmoadgVar4;
        uz0.iobyxmoadg iobyxmoadgVar5;
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        k01.nufgyqmvbu nufgyqmvbuVar;
        uz0.iobyxmoadg iobyxmoadgVar6;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118388esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118388esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj2 = zoijcleaowVar.f118389iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118388esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadg iobyxmoadgVar7 = (iobyxmoadg) zoijcleaowVar.f118391yggfygwlhe;
                ojitshcjhn ojitshcjhnVar3 = (ojitshcjhn) zoijcleaowVar.f118392zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
                ojitshcjhnVar = ojitshcjhnVar3;
                obj = obj2;
                iobyxmoadgVar2 = iobyxmoadgVar7;
            } else if (i14 == 2) {
                uz0.iobyxmoadg iobyxmoadgVar8 = (uz0.iobyxmoadg) zoijcleaowVar.f118390jyumaefscl;
                iobyxmoadgVar3 = (iobyxmoadg) zoijcleaowVar.f118391yggfygwlhe;
                ojitshcjhnVar2 = (ojitshcjhn) zoijcleaowVar.f118392zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar4 = iobyxmoadgVar8;
                iobyxmoadgVar5 = (uz0.iobyxmoadg) obj2;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f114832nufgyqmvbu : iobyxmoadgVar5.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f114824btonecajqb : iobyxmoadgVar4.wflxmlrfwp().iobyxmoadg(iobyxmoadgVar3.zoijcleaow(), iobyxmoadgVar5.wflxmlrfwp().wkgbmnqykc()), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f114825draadjrbmk : iobyxmoadgVar5.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar4.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f114836vdvldrhtss : null);
                nufgyqmvbuVar = ojitshcjhnVar2.f118384zoijcleaow;
                zoijcleaowVar.f118392zdlpuopuiu = iobyxmoadgVar5;
                zoijcleaowVar.f118391yggfygwlhe = null;
                zoijcleaowVar.f118390jyumaefscl = null;
                zoijcleaowVar.f118388esjtqupxsv = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar6 = iobyxmoadgVar5;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar6 = (uz0.iobyxmoadg) zoijcleaowVar.f118392zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            return iobyxmoadgVar6.oxmwwwfdhm();
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        gtknphoqwx gtknphoqwxVar = this.f118383wkgbmnqykc;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar9 = new gtknphoqwx.iobyxmoadg(iobyxmoadgVar.iobyxmoadg());
        zoijcleaowVar.f118392zdlpuopuiu = this;
        zoijcleaowVar.f118391yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f118388esjtqupxsv = 1;
        Object objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar9, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ojitshcjhnVar = this;
        obj = objZoijcleaow;
        iobyxmoadgVar2 = iobyxmoadgVar;
        uz0.iobyxmoadg iobyxmoadgVar10 = (uz0.iobyxmoadg) obj;
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar10.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar10.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar10.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar10.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar10.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar10.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar10.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar10.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar10.f114832nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar10.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar10.f114824btonecajqb : uz0.lqeggnwhkg.zoijcleaow(iobyxmoadgVar10.wflxmlrfwp(), iobyxmoadgVar2.zoijcleaow(), false, 2, null), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar10.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar10.f114825draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVar10.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar10.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar10.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar10.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar10.f114836vdvldrhtss : null);
        k01.dxjokdxxww dxjokdxxwwVar = ojitshcjhnVar.f118382ppxfxbqfkf;
        String strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        uz0.zoijcleaow zoijcleaowVar2 = uz0.zoijcleaow.CONTINUE;
        zoijcleaowVar.f118392zdlpuopuiu = ojitshcjhnVar;
        zoijcleaowVar.f118391yggfygwlhe = iobyxmoadgVar2;
        zoijcleaowVar.f118390jyumaefscl = iobyxmoadgVar10;
        zoijcleaowVar.f118388esjtqupxsv = 2;
        Object objGtknphoqwx = k01.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, strIobyxmoadg, iobyxmoadgVarIobyxmoadg2, null, zoijcleaowVar2, zoijcleaowVar, 4, null);
        if (objGtknphoqwx == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar3 = iobyxmoadgVar2;
        obj2 = objGtknphoqwx;
        ojitshcjhnVar2 = ojitshcjhnVar;
        iobyxmoadgVar4 = iobyxmoadgVar10;
        iobyxmoadgVar5 = (uz0.iobyxmoadg) obj2;
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f114832nufgyqmvbu : iobyxmoadgVar5.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f114824btonecajqb : iobyxmoadgVar4.wflxmlrfwp().iobyxmoadg(iobyxmoadgVar3.zoijcleaow(), iobyxmoadgVar5.wflxmlrfwp().wkgbmnqykc()), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f114825draadjrbmk : iobyxmoadgVar5.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar4.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f114836vdvldrhtss : null);
        nufgyqmvbuVar = ojitshcjhnVar2.f118384zoijcleaow;
        zoijcleaowVar.f118392zdlpuopuiu = iobyxmoadgVar5;
        zoijcleaowVar.f118391yggfygwlhe = null;
        zoijcleaowVar.f118390jyumaefscl = null;
        zoijcleaowVar.f118388esjtqupxsv = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar6 = iobyxmoadgVar5;
        return iobyxmoadgVar6.oxmwwwfdhm();
    }
}
