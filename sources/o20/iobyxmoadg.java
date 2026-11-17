package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f71646ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final btonecajqb f71647wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71648zoijcleaow;

    /* JADX INFO: renamed from: o20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1549iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f71649iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ComboSetProduct f71650ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f71651zoijcleaow;

        public C1549iobyxmoadg(String orderId, ComboSetProduct productFirst, ComboSetProduct productSecond) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f71649iobyxmoadg = orderId;
            this.f71651zoijcleaow = productFirst;
            this.f71650ppxfxbqfkf = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1549iobyxmoadg)) {
                return false;
            }
            C1549iobyxmoadg c1549iobyxmoadg = (C1549iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f71649iobyxmoadg, c1549iobyxmoadg.f71649iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71651zoijcleaow, c1549iobyxmoadg.f71651zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f71650ppxfxbqfkf, c1549iobyxmoadg.f71650ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f71649iobyxmoadg.hashCode() * 31) + this.f71651zoijcleaow.hashCode()) * 31) + this.f71650ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f71649iobyxmoadg;
        }

        public final ComboSetProduct ppxfxbqfkf() {
            return this.f71650ppxfxbqfkf;
        }

        public String toString() {
            return "Params(orderId=" + this.f71649iobyxmoadg + ", productFirst=" + this.f71651zoijcleaow + ", productSecond=" + this.f71650ppxfxbqfkf + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f71651zoijcleaow;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f71652cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f71654jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71655yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71656zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71654jyumaefscl = obj;
            this.f71652cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71648zoijcleaow = orderLocalSource;
        this.f71646ppxfxbqfkf = orderRemoteSource;
        this.f71647wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:32:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1549iobyxmoadg c1549iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        C1549iobyxmoadg c1549iobyxmoadg2;
        iobyxmoadg iobyxmoadgVar2;
        e10.iobyxmoadg iobyxmoadgVar3;
        e10.iobyxmoadg iobyxmoadgVar4;
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        w10.nufgyqmvbu nufgyqmvbuVar;
        e10.iobyxmoadg iobyxmoadgVar5;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f71652cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f71652cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f71654jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f71652cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                c1549iobyxmoadg2 = (C1549iobyxmoadg) zoijcleaowVar.f71655yggfygwlhe;
                iobyxmoadg iobyxmoadgVar6 = (iobyxmoadg) zoijcleaowVar.f71656zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar = iobyxmoadgVar6;
            } else if (i14 == 2) {
                e10.iobyxmoadg iobyxmoadgVar7 = (e10.iobyxmoadg) zoijcleaowVar.f71655yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f71656zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar3 = iobyxmoadgVar7;
                iobyxmoadgVar4 = (e10.iobyxmoadg) objZoijcleaow;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f30182nufgyqmvbu : iobyxmoadgVar4.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f30174btonecajqb : iobyxmoadgVar4.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f30175draadjrbmk : iobyxmoadgVar4.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar3.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f30186vdvldrhtss : null);
                nufgyqmvbuVar = iobyxmoadgVar2.f71648zoijcleaow;
                zoijcleaowVar.f71656zdlpuopuiu = iobyxmoadgVar4;
                zoijcleaowVar.f71655yggfygwlhe = null;
                zoijcleaowVar.f71652cqumvgiudr = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar5 = iobyxmoadgVar4;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar5 = (e10.iobyxmoadg) zoijcleaowVar.f71656zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return iobyxmoadgVar5.oxmwwwfdhm();
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        btonecajqb btonecajqbVar = this.f71647wkgbmnqykc;
        btonecajqb.iobyxmoadg iobyxmoadgVar8 = new btonecajqb.iobyxmoadg(c1549iobyxmoadg.iobyxmoadg());
        zoijcleaowVar.f71656zdlpuopuiu = this;
        zoijcleaowVar.f71655yggfygwlhe = c1549iobyxmoadg;
        zoijcleaowVar.f71652cqumvgiudr = 1;
        objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar8, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        c1549iobyxmoadg2 = c1549iobyxmoadg;
        e10.iobyxmoadg iobyxmoadgVar9 = (e10.iobyxmoadg) objZoijcleaow;
        w10.dxjokdxxww dxjokdxxwwVar = iobyxmoadgVar.f71646ppxfxbqfkf;
        String strIobyxmoadg = c1549iobyxmoadg2.iobyxmoadg();
        List<ComboSetProduct> listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq(c1549iobyxmoadg2.zoijcleaow(), c1549iobyxmoadg2.ppxfxbqfkf());
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10));
        for (ComboSetProduct comboSetProduct : listRgvfuqvkyq) {
            arrayList.add(new e10.gxszxtbevo(comboSetProduct.getId(), comboSetProduct.getMeasure().getCurrentMeasure().getValue(), 1.0d));
        }
        zoijcleaowVar.f71656zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f71655yggfygwlhe = iobyxmoadgVar9;
        zoijcleaowVar.f71652cqumvgiudr = 2;
        Object objLqeggnwhkg = dxjokdxxwwVar.lqeggnwhkg(strIobyxmoadg, iobyxmoadgVar9, arrayList, true, zoijcleaowVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar3 = iobyxmoadgVar9;
        objZoijcleaow = objLqeggnwhkg;
        iobyxmoadgVar4 = (e10.iobyxmoadg) objZoijcleaow;
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f30182nufgyqmvbu : iobyxmoadgVar4.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f30174btonecajqb : iobyxmoadgVar4.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f30175draadjrbmk : iobyxmoadgVar4.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar3.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f30185rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f30186vdvldrhtss : null);
        nufgyqmvbuVar = iobyxmoadgVar2.f71648zoijcleaow;
        zoijcleaowVar.f71656zdlpuopuiu = iobyxmoadgVar4;
        zoijcleaowVar.f71655yggfygwlhe = null;
        zoijcleaowVar.f71652cqumvgiudr = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar5 = iobyxmoadgVar4;
        return iobyxmoadgVar5.oxmwwwfdhm();
    }
}
