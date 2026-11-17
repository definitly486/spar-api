package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class agtfadlqog extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f71568ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f71569wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71570zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71571iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f71572zoijcleaow;

        public iobyxmoadg(String orderId, String promo) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(promo, "promo");
            this.f71571iobyxmoadg = orderId;
            this.f71572zoijcleaow = promo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f71571iobyxmoadg, iobyxmoadgVar.f71571iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71572zoijcleaow, iobyxmoadgVar.f71572zoijcleaow);
        }

        public int hashCode() {
            return (this.f71571iobyxmoadg.hashCode() * 31) + this.f71572zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71571iobyxmoadg;
        }

        public String toString() {
            return "Params(orderId=" + this.f71571iobyxmoadg + ", promo=" + this.f71572zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f71572zoijcleaow;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f71574esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f71575iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f71576jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71577yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71578zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71575iwizpuwonk = obj;
            this.f71574esjtqupxsv |= Integer.MIN_VALUE;
            return agtfadlqog.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtfadlqog(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71570zoijcleaow = orderLocalSource;
        this.f71568ppxfxbqfkf = orderRemoteSource;
        this.f71569wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        agtfadlqog agtfadlqogVar;
        Object obj;
        iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        agtfadlqog agtfadlqogVar2;
        e10.iobyxmoadg iobyxmoadgVar4;
        e10.iobyxmoadg iobyxmoadgVar5;
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        w10.nufgyqmvbu nufgyqmvbuVar;
        e10.iobyxmoadg iobyxmoadgVar6;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f71574esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f71574esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj2 = zoijcleaowVar.f71575iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f71574esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadg iobyxmoadgVar7 = (iobyxmoadg) zoijcleaowVar.f71577yggfygwlhe;
                agtfadlqog agtfadlqogVar3 = (agtfadlqog) zoijcleaowVar.f71578zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
                agtfadlqogVar = agtfadlqogVar3;
                obj = obj2;
                iobyxmoadgVar2 = iobyxmoadgVar7;
            } else if (i14 == 2) {
                e10.iobyxmoadg iobyxmoadgVar8 = (e10.iobyxmoadg) zoijcleaowVar.f71576jyumaefscl;
                iobyxmoadgVar3 = (iobyxmoadg) zoijcleaowVar.f71577yggfygwlhe;
                agtfadlqogVar2 = (agtfadlqog) zoijcleaowVar.f71578zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
                iobyxmoadgVar4 = iobyxmoadgVar8;
                iobyxmoadgVar5 = (e10.iobyxmoadg) obj2;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f30182nufgyqmvbu : iobyxmoadgVar5.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f30174btonecajqb : iobyxmoadgVar4.wflxmlrfwp().iobyxmoadg(iobyxmoadgVar3.zoijcleaow(), iobyxmoadgVar5.wflxmlrfwp().wkgbmnqykc()), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f30175draadjrbmk : iobyxmoadgVar5.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar4.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f30186vdvldrhtss : null);
                nufgyqmvbuVar = agtfadlqogVar2.f71570zoijcleaow;
                zoijcleaowVar.f71578zdlpuopuiu = iobyxmoadgVar5;
                zoijcleaowVar.f71577yggfygwlhe = null;
                zoijcleaowVar.f71576jyumaefscl = null;
                zoijcleaowVar.f71574esjtqupxsv = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar6 = iobyxmoadgVar5;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar6 = (e10.iobyxmoadg) zoijcleaowVar.f71578zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj2);
            }
            return iobyxmoadgVar6.oxmwwwfdhm();
        }
        gg.zdlpuopuiu.zoijcleaow(obj2);
        btonecajqb btonecajqbVar = this.f71569wkgbmnqykc;
        btonecajqb.iobyxmoadg iobyxmoadgVar9 = new btonecajqb.iobyxmoadg(iobyxmoadgVar.iobyxmoadg());
        zoijcleaowVar.f71578zdlpuopuiu = this;
        zoijcleaowVar.f71577yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar.f71574esjtqupxsv = 1;
        Object objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar9, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        agtfadlqogVar = this;
        obj = objZoijcleaow;
        iobyxmoadgVar2 = iobyxmoadgVar;
        e10.iobyxmoadg iobyxmoadgVar10 = (e10.iobyxmoadg) obj;
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVar10.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar10.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar10.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar10.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar10.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar10.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar10.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar10.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar10.f30182nufgyqmvbu : null, (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar10.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar10.f30174btonecajqb : e10.lqeggnwhkg.zoijcleaow(iobyxmoadgVar10.wflxmlrfwp(), iobyxmoadgVar2.zoijcleaow(), false, 2, null), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar10.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar10.f30175draadjrbmk : null, (131007 & 4096) != 0 ? iobyxmoadgVar10.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar10.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar10.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar10.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar10.f30186vdvldrhtss : null);
        w10.dxjokdxxww dxjokdxxwwVar = agtfadlqogVar.f71568ppxfxbqfkf;
        String strIobyxmoadg = iobyxmoadgVar2.iobyxmoadg();
        e10.zoijcleaow zoijcleaowVar2 = e10.zoijcleaow.CONTINUE;
        zoijcleaowVar.f71578zdlpuopuiu = agtfadlqogVar;
        zoijcleaowVar.f71577yggfygwlhe = iobyxmoadgVar2;
        zoijcleaowVar.f71576jyumaefscl = iobyxmoadgVar10;
        zoijcleaowVar.f71574esjtqupxsv = 2;
        Object objGtknphoqwx = w10.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, strIobyxmoadg, iobyxmoadgVarIobyxmoadg2, null, zoijcleaowVar2, zoijcleaowVar, 4, null);
        if (objGtknphoqwx == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar3 = iobyxmoadgVar2;
        obj2 = objGtknphoqwx;
        agtfadlqogVar2 = agtfadlqogVar;
        iobyxmoadgVar4 = iobyxmoadgVar10;
        iobyxmoadgVar5 = (e10.iobyxmoadg) obj2;
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f30182nufgyqmvbu : iobyxmoadgVar5.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f30174btonecajqb : iobyxmoadgVar4.wflxmlrfwp().iobyxmoadg(iobyxmoadgVar3.zoijcleaow(), iobyxmoadgVar5.wflxmlrfwp().wkgbmnqykc()), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f30175draadjrbmk : iobyxmoadgVar5.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar4.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar4.f30186vdvldrhtss : null);
        nufgyqmvbuVar = agtfadlqogVar2.f71570zoijcleaow;
        zoijcleaowVar.f71578zdlpuopuiu = iobyxmoadgVar5;
        zoijcleaowVar.f71577yggfygwlhe = null;
        zoijcleaowVar.f71576jyumaefscl = null;
        zoijcleaowVar.f71574esjtqupxsv = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar6 = iobyxmoadgVar5;
        return iobyxmoadgVar6.oxmwwwfdhm();
    }
}
