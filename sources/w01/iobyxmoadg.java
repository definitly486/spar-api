package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f118362ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gtknphoqwx f118363wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118364zoijcleaow;

    /* JADX INFO: renamed from: w01.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2943iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f118365iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ComboSetProduct f118366ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ComboSetProduct f118367zoijcleaow;

        public C2943iobyxmoadg(String orderId, ComboSetProduct productFirst, ComboSetProduct productSecond) {
            zdlpuopuiu.btonecajqb(orderId, "orderId");
            zdlpuopuiu.btonecajqb(productFirst, "productFirst");
            zdlpuopuiu.btonecajqb(productSecond, "productSecond");
            this.f118365iobyxmoadg = orderId;
            this.f118367zoijcleaow = productFirst;
            this.f118366ppxfxbqfkf = productSecond;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2943iobyxmoadg)) {
                return false;
            }
            C2943iobyxmoadg c2943iobyxmoadg = (C2943iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118365iobyxmoadg, c2943iobyxmoadg.f118365iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118367zoijcleaow, c2943iobyxmoadg.f118367zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118366ppxfxbqfkf, c2943iobyxmoadg.f118366ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f118365iobyxmoadg.hashCode() * 31) + this.f118367zoijcleaow.hashCode()) * 31) + this.f118366ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f118365iobyxmoadg;
        }

        public final ComboSetProduct ppxfxbqfkf() {
            return this.f118366ppxfxbqfkf;
        }

        public String toString() {
            return "Params(orderId=" + this.f118365iobyxmoadg + ", productFirst=" + this.f118367zoijcleaow + ", productSecond=" + this.f118366ppxfxbqfkf + ")";
        }

        public final ComboSetProduct zoijcleaow() {
            return this.f118367zoijcleaow;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f118368cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f118370jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118371yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118372zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118370jyumaefscl = obj;
            this.f118368cqumvgiudr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118364zoijcleaow = orderLocalSource;
        this.f118362ppxfxbqfkf = orderRemoteSource;
        this.f118363wkgbmnqykc = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:32:0x011d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2943iobyxmoadg c2943iobyxmoadg, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        C2943iobyxmoadg c2943iobyxmoadg2;
        iobyxmoadg iobyxmoadgVar2;
        uz0.iobyxmoadg iobyxmoadgVar3;
        uz0.iobyxmoadg iobyxmoadgVar4;
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        k01.nufgyqmvbu nufgyqmvbuVar;
        uz0.iobyxmoadg iobyxmoadgVar5;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f118368cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f118368cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f118370jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f118368cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                c2943iobyxmoadg2 = (C2943iobyxmoadg) zoijcleaowVar.f118371yggfygwlhe;
                iobyxmoadg iobyxmoadgVar6 = (iobyxmoadg) zoijcleaowVar.f118372zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar = iobyxmoadgVar6;
            } else if (i14 == 2) {
                uz0.iobyxmoadg iobyxmoadgVar7 = (uz0.iobyxmoadg) zoijcleaowVar.f118371yggfygwlhe;
                iobyxmoadgVar2 = (iobyxmoadg) zoijcleaowVar.f118372zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar3 = iobyxmoadgVar7;
                iobyxmoadgVar4 = (uz0.iobyxmoadg) objZoijcleaow;
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f114832nufgyqmvbu : iobyxmoadgVar4.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f114824btonecajqb : iobyxmoadgVar4.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f114825draadjrbmk : iobyxmoadgVar4.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar3.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f114836vdvldrhtss : null);
                nufgyqmvbuVar = iobyxmoadgVar2.f118364zoijcleaow;
                zoijcleaowVar.f118372zdlpuopuiu = iobyxmoadgVar4;
                zoijcleaowVar.f118371yggfygwlhe = null;
                zoijcleaowVar.f118368cqumvgiudr = 3;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar5 = iobyxmoadgVar4;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar5 = (uz0.iobyxmoadg) zoijcleaowVar.f118372zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return iobyxmoadgVar5.oxmwwwfdhm();
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        gtknphoqwx gtknphoqwxVar = this.f118363wkgbmnqykc;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar8 = new gtknphoqwx.iobyxmoadg(c2943iobyxmoadg.iobyxmoadg());
        zoijcleaowVar.f118372zdlpuopuiu = this;
        zoijcleaowVar.f118371yggfygwlhe = c2943iobyxmoadg;
        zoijcleaowVar.f118368cqumvgiudr = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar8, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar = this;
        c2943iobyxmoadg2 = c2943iobyxmoadg;
        uz0.iobyxmoadg iobyxmoadgVar9 = (uz0.iobyxmoadg) objZoijcleaow;
        k01.dxjokdxxww dxjokdxxwwVar = iobyxmoadgVar.f118362ppxfxbqfkf;
        String strIobyxmoadg = c2943iobyxmoadg2.iobyxmoadg();
        List<ComboSetProduct> listRgvfuqvkyq = jyumaefscl.rgvfuqvkyq(c2943iobyxmoadg2.zoijcleaow(), c2943iobyxmoadg2.ppxfxbqfkf());
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listRgvfuqvkyq, 10));
        for (ComboSetProduct comboSetProduct : listRgvfuqvkyq) {
            arrayList.add(new uz0.gxszxtbevo(comboSetProduct.getId(), comboSetProduct.getMeasure().getCurrentMeasure().getValue(), 1.0d));
        }
        zoijcleaowVar.f118372zdlpuopuiu = iobyxmoadgVar;
        zoijcleaowVar.f118371yggfygwlhe = iobyxmoadgVar9;
        zoijcleaowVar.f118368cqumvgiudr = 2;
        Object objBtonecajqb = dxjokdxxwwVar.btonecajqb(strIobyxmoadg, iobyxmoadgVar9, arrayList, true, zoijcleaowVar);
        if (objBtonecajqb == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        iobyxmoadgVar3 = iobyxmoadgVar9;
        objZoijcleaow = objBtonecajqb;
        iobyxmoadgVar4 = (uz0.iobyxmoadg) objZoijcleaow;
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar3.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar3.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar3.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar3.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar3.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar3.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar3.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar3.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar3.f114832nufgyqmvbu : iobyxmoadgVar4.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar3.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar3.f114824btonecajqb : iobyxmoadgVar4.wflxmlrfwp(), (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar3.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar3.f114825draadjrbmk : iobyxmoadgVar4.ppxfxbqfkf(), (131007 & 4096) != 0 ? iobyxmoadgVar3.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar3.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar3.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar3.f114835rgvfuqvkyq : null, (131007 & 65536) != 0 ? iobyxmoadgVar3.f114836vdvldrhtss : null);
        nufgyqmvbuVar = iobyxmoadgVar2.f118364zoijcleaow;
        zoijcleaowVar.f118372zdlpuopuiu = iobyxmoadgVar4;
        zoijcleaowVar.f118371yggfygwlhe = null;
        zoijcleaowVar.f118368cqumvgiudr = 3;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar5 = iobyxmoadgVar4;
        return iobyxmoadgVar5.oxmwwwfdhm();
    }
}
