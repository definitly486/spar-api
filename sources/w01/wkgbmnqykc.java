package w01;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.ProductData;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gtknphoqwx f118405eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k01.dxjokdxxww f118406ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final w01.ppxfxbqfkf f118407wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.nufgyqmvbu f118408zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Warning f118409iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final uz0.iobyxmoadg f118410zoijcleaow;

        public iobyxmoadg(Warning warning, uz0.iobyxmoadg orderEdit) {
            zdlpuopuiu.btonecajqb(warning, "warning");
            zdlpuopuiu.btonecajqb(orderEdit, "orderEdit");
            this.f118409iobyxmoadg = warning;
            this.f118410zoijcleaow = orderEdit;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f118409iobyxmoadg, iobyxmoadgVar.f118409iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118410zoijcleaow, iobyxmoadgVar.f118410zoijcleaow);
        }

        public int hashCode() {
            return (this.f118409iobyxmoadg.hashCode() * 31) + this.f118410zoijcleaow.hashCode();
        }

        public final uz0.iobyxmoadg iobyxmoadg() {
            return this.f118410zoijcleaow;
        }

        public String toString() {
            return "EditOrderResult(warning=" + this.f118409iobyxmoadg + ", orderEdit=" + this.f118410zoijcleaow + ")";
        }

        public final Warning zoijcleaow() {
            return this.f118409iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f118412esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f118413iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f118414jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f118415yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f118416zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f118413iwizpuwonk = obj;
            this.f118412esjtqupxsv |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    public interface zoijcleaow {

        public static final class iobyxmoadg implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f118417iobyxmoadg;

            public iobyxmoadg(String orderId) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f118417iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118417iobyxmoadg, ((iobyxmoadg) obj).f118417iobyxmoadg);
            }

            public int hashCode() {
                return this.f118417iobyxmoadg.hashCode();
            }

            @Override // w01.wkgbmnqykc.zoijcleaow
            public String iobyxmoadg() {
                return this.f118417iobyxmoadg;
            }

            public String toString() {
                return "RefreshCachedOrder(orderId=" + this.f118417iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: w01.wkgbmnqykc$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C2944zoijcleaow implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f118418iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final List f118419zoijcleaow;

            public C2944zoijcleaow(String orderId, List products) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                zdlpuopuiu.btonecajqb(products, "products");
                this.f118418iobyxmoadg = orderId;
                this.f118419zoijcleaow = products;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2944zoijcleaow)) {
                    return false;
                }
                C2944zoijcleaow c2944zoijcleaow = (C2944zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f118418iobyxmoadg, c2944zoijcleaow.f118418iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118419zoijcleaow, c2944zoijcleaow.f118419zoijcleaow);
            }

            public int hashCode() {
                return (this.f118418iobyxmoadg.hashCode() * 31) + this.f118419zoijcleaow.hashCode();
            }

            @Override // w01.wkgbmnqykc.zoijcleaow
            public String iobyxmoadg() {
                return this.f118418iobyxmoadg;
            }

            public String toString() {
                return "UpdateProducts(orderId=" + this.f118418iobyxmoadg + ", products=" + this.f118419zoijcleaow + ")";
            }

            public final List zoijcleaow() {
                return this.f118419zoijcleaow;
            }
        }

        String iobyxmoadg();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(k01.nufgyqmvbu orderLocalSource, k01.dxjokdxxww orderRemoteSource, w01.ppxfxbqfkf changeOrderCompoundStateUseCase, gtknphoqwx getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(changeOrderCompoundStateUseCase, "changeOrderCompoundStateUseCase");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f118408zoijcleaow = orderLocalSource;
        this.f118406ppxfxbqfkf = orderRemoteSource;
        this.f118407wkgbmnqykc = changeOrderCompoundStateUseCase;
        this.f118405eablkybsjg = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:65:0x018f A[LOOP:0: B:63:0x0189->B:65:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar2;
        wkgbmnqykc wkgbmnqykcVar2;
        uz0.iobyxmoadg iobyxmoadgVar;
        Object next;
        String value;
        MeasureType measureType;
        uz0.iobyxmoadg iobyxmoadgVar2;
        ArrayList arrayList;
        Iterator it;
        uz0.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        k01.nufgyqmvbu nufgyqmvbuVar;
        wkgbmnqykc wkgbmnqykcVar3;
        uz0.iobyxmoadg iobyxmoadgVar3;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f118412esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f118412esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f118413iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f118412esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar2 = (zoijcleaow) ppxfxbqfkfVar.f118415yggfygwlhe;
                wkgbmnqykc wkgbmnqykcVar4 = (wkgbmnqykc) ppxfxbqfkfVar.f118416zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                wkgbmnqykcVar = wkgbmnqykcVar4;
            } else if (i14 == 2) {
                iobyxmoadgVar = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118415yggfygwlhe;
                wkgbmnqykcVar2 = (wkgbmnqykc) ppxfxbqfkfVar.f118416zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar2 = (uz0.iobyxmoadg) objZoijcleaow;
                uz0.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar;
                uz0.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp();
                List listPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf();
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
                it = listPpxfxbqfkf.iterator();
                while (it.hasNext()) {
                    arrayList.add(dz0.zoijcleaow.f30062rgvfuqvkyq.iobyxmoadg((uz0.eablkybsjg) it.next()));
                }
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f114832nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f114824btonecajqb : lqeggnwhkgVarWflxmlrfwp, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f114825draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar4.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f114835rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar4.f114836vdvldrhtss : null);
                nufgyqmvbuVar = wkgbmnqykcVar2.f118408zoijcleaow;
                ppxfxbqfkfVar.f118416zdlpuopuiu = wkgbmnqykcVar2;
                ppxfxbqfkfVar.f118415yggfygwlhe = iobyxmoadgVar2;
                ppxfxbqfkfVar.f118414jyumaefscl = iobyxmoadgVarIobyxmoadg;
                ppxfxbqfkfVar.f118412esjtqupxsv = 4;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                iobyxmoadgVar3 = iobyxmoadgVar2;
            } else if (i14 == 3) {
                iobyxmoadgVar = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118415yggfygwlhe;
                wkgbmnqykcVar2 = (wkgbmnqykc) ppxfxbqfkfVar.f118416zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar2 = (uz0.iobyxmoadg) objZoijcleaow;
                uz0.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar;
                uz0.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp2 = iobyxmoadgVar2.wflxmlrfwp();
                List listPpxfxbqfkf2 = iobyxmoadgVar2.ppxfxbqfkf();
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf2, 10));
                it = listPpxfxbqfkf2.iterator();
                while (it.hasNext()) {
                    arrayList.add(dz0.zoijcleaow.f30062rgvfuqvkyq.iobyxmoadg((uz0.eablkybsjg) it.next()));
                }
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar5.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar5.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar5.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar5.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar5.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar5.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar5.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar5.f114832nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar5.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar5.f114824btonecajqb : lqeggnwhkgVarWflxmlrfwp2, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar5.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar5.f114825draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar5.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar5.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar5.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar5.f114835rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar5.f114836vdvldrhtss : null);
                nufgyqmvbuVar = wkgbmnqykcVar2.f118408zoijcleaow;
                ppxfxbqfkfVar.f118416zdlpuopuiu = wkgbmnqykcVar2;
                ppxfxbqfkfVar.f118415yggfygwlhe = iobyxmoadgVar2;
                ppxfxbqfkfVar.f118414jyumaefscl = iobyxmoadgVarIobyxmoadg;
                ppxfxbqfkfVar.f118412esjtqupxsv = 4;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                iobyxmoadgVar3 = iobyxmoadgVar2;
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVarIobyxmoadg = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118414jyumaefscl;
                iobyxmoadgVar3 = (uz0.iobyxmoadg) ppxfxbqfkfVar.f118415yggfygwlhe;
                wkgbmnqykcVar3 = (wkgbmnqykc) ppxfxbqfkfVar.f118416zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            wkgbmnqykcVar3.f118407wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
            return new iobyxmoadg(iobyxmoadgVar3.oxmwwwfdhm(), iobyxmoadgVarIobyxmoadg);
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        gtknphoqwx gtknphoqwxVar = this.f118405eablkybsjg;
        gtknphoqwx.iobyxmoadg iobyxmoadgVar6 = new gtknphoqwx.iobyxmoadg(zoijcleaowVar.iobyxmoadg());
        ppxfxbqfkfVar.f118416zdlpuopuiu = this;
        ppxfxbqfkfVar.f118415yggfygwlhe = zoijcleaowVar;
        ppxfxbqfkfVar.f118412esjtqupxsv = 1;
        objZoijcleaow = gtknphoqwxVar.zoijcleaow(iobyxmoadgVar6, ppxfxbqfkfVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar = this;
        zoijcleaowVar2 = zoijcleaowVar;
        uz0.iobyxmoadg iobyxmoadgVar7 = (uz0.iobyxmoadg) objZoijcleaow;
        if (zoijcleaowVar2 instanceof zoijcleaow.iobyxmoadg) {
            k01.dxjokdxxww dxjokdxxwwVar = wkgbmnqykcVar.f118406ppxfxbqfkf;
            String strIobyxmoadg = ((zoijcleaow.iobyxmoadg) zoijcleaowVar2).iobyxmoadg();
            uz0.zoijcleaow zoijcleaowVar3 = uz0.zoijcleaow.CONTINUE;
            ppxfxbqfkfVar.f118416zdlpuopuiu = wkgbmnqykcVar;
            ppxfxbqfkfVar.f118415yggfygwlhe = iobyxmoadgVar7;
            ppxfxbqfkfVar.f118412esjtqupxsv = 2;
            Object objGtknphoqwx = k01.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, strIobyxmoadg, iobyxmoadgVar7, null, zoijcleaowVar3, ppxfxbqfkfVar, 4, null);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            iobyxmoadgVar = iobyxmoadgVar7;
            objZoijcleaow = objGtknphoqwx;
            iobyxmoadgVar2 = (uz0.iobyxmoadg) objZoijcleaow;
            uz0.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar;
            uz0.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp3 = iobyxmoadgVar2.wflxmlrfwp();
            List listPpxfxbqfkf3 = iobyxmoadgVar2.ppxfxbqfkf();
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf3, 10));
            it = listPpxfxbqfkf3.iterator();
            while (it.hasNext()) {
                arrayList.add(dz0.zoijcleaow.f30062rgvfuqvkyq.iobyxmoadg((uz0.eablkybsjg) it.next()));
            }
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar8.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar8.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar8.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar8.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar8.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar8.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar8.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar8.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar8.f114832nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar8.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar8.f114824btonecajqb : lqeggnwhkgVarWflxmlrfwp3, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar8.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar8.f114825draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar8.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar8.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar8.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar8.f114835rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar8.f114836vdvldrhtss : null);
            nufgyqmvbuVar = wkgbmnqykcVar2.f118408zoijcleaow;
            ppxfxbqfkfVar.f118416zdlpuopuiu = wkgbmnqykcVar2;
            ppxfxbqfkfVar.f118415yggfygwlhe = iobyxmoadgVar2;
            ppxfxbqfkfVar.f118414jyumaefscl = iobyxmoadgVarIobyxmoadg;
            ppxfxbqfkfVar.f118412esjtqupxsv = 4;
            if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            iobyxmoadgVar3 = iobyxmoadgVar2;
            wkgbmnqykcVar3.f118407wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
            return new iobyxmoadg(iobyxmoadgVar3.oxmwwwfdhm(), iobyxmoadgVarIobyxmoadg);
        }
        if (!(zoijcleaowVar2 instanceof zoijcleaow.C2944zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        k01.dxjokdxxww dxjokdxxwwVar2 = wkgbmnqykcVar.f118406ppxfxbqfkf;
        zoijcleaow.C2944zoijcleaow c2944zoijcleaow = (zoijcleaow.C2944zoijcleaow) zoijcleaowVar2;
        String strIobyxmoadg2 = c2944zoijcleaow.iobyxmoadg();
        List<uz0.eablkybsjg> listPpxfxbqfkf4 = iobyxmoadgVar7.ppxfxbqfkf();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf4, 10));
        for (uz0.eablkybsjg eablkybsjgVar : listPpxfxbqfkf4) {
            Iterator it2 = c2944zoijcleaow.zoijcleaow().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!zdlpuopuiu.eablkybsjg(((ProductData) next).getId(), eablkybsjgVar.nufgyqmvbu()));
            ProductData productData = (ProductData) next;
            String strNufgyqmvbu = eablkybsjgVar.nufgyqmvbu();
            if (productData == null || (measureType = productData.getMeasureType()) == null || (value = measureType.getValue()) == null) {
                value = eablkybsjgVar.btonecajqb().getCurrentMeasure().getValue();
            }
            double quantity = productData != null ? productData.getQuantity() : eablkybsjgVar.rgvfuqvkyq();
            k01.dxjokdxxww dxjokdxxwwVar3 = dxjokdxxwwVar2;
            arrayList2.add(new uz0.gxszxtbevo(strNufgyqmvbu, value, quantity));
            dxjokdxxwwVar2 = dxjokdxxwwVar3;
        }
        ppxfxbqfkfVar.f118416zdlpuopuiu = wkgbmnqykcVar;
        ppxfxbqfkfVar.f118415yggfygwlhe = iobyxmoadgVar7;
        ppxfxbqfkfVar.f118412esjtqupxsv = 3;
        Object objBtonecajqb = dxjokdxxwwVar2.btonecajqb(strIobyxmoadg2, iobyxmoadgVar7, arrayList2, false, ppxfxbqfkfVar);
        if (objBtonecajqb == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        iobyxmoadgVar = iobyxmoadgVar7;
        objZoijcleaow = objBtonecajqb;
        iobyxmoadgVar2 = (uz0.iobyxmoadg) objZoijcleaow;
        uz0.iobyxmoadg iobyxmoadgVar9 = iobyxmoadgVar;
        uz0.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp4 = iobyxmoadgVar2.wflxmlrfwp();
        List listPpxfxbqfkf5 = iobyxmoadgVar2.ppxfxbqfkf();
        arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf5, 10));
        it = listPpxfxbqfkf5.iterator();
        while (it.hasNext()) {
            arrayList.add(dz0.zoijcleaow.f30062rgvfuqvkyq.iobyxmoadg((uz0.eablkybsjg) it.next()));
        }
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar9.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar9.f114830iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar9.f114839zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar9.f114834ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar9.f114838wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar9.f114827eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar9.f114829gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar9.f114831lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar9.f114832nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar9.f114826dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar9.f114824btonecajqb : lqeggnwhkgVarWflxmlrfwp4, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar9.f114828gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar9.f114825draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar9.f114837wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar9.f114823agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar9.f114833ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar9.f114835rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar9.f114836vdvldrhtss : null);
        nufgyqmvbuVar = wkgbmnqykcVar2.f118408zoijcleaow;
        ppxfxbqfkfVar.f118416zdlpuopuiu = wkgbmnqykcVar2;
        ppxfxbqfkfVar.f118415yggfygwlhe = iobyxmoadgVar2;
        ppxfxbqfkfVar.f118414jyumaefscl = iobyxmoadgVarIobyxmoadg;
        ppxfxbqfkfVar.f118412esjtqupxsv = 4;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar3 = wkgbmnqykcVar2;
        iobyxmoadgVar3 = iobyxmoadgVar2;
        wkgbmnqykcVar3.f118407wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
        return new iobyxmoadg(iobyxmoadgVar3.oxmwwwfdhm(), iobyxmoadgVarIobyxmoadg);
    }
}
