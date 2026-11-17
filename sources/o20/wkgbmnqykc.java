package o20;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.ProductData;
import ru.myspar.core.models.Warning;
import ru.myspar.core.models.measure_type.MeasureType;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final btonecajqb f71679eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final w10.dxjokdxxww f71680ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final o20.ppxfxbqfkf f71681wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.nufgyqmvbu f71682zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Warning f71683iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final e10.iobyxmoadg f71684zoijcleaow;

        public iobyxmoadg(Warning warning, e10.iobyxmoadg orderEdit) {
            zdlpuopuiu.btonecajqb(warning, "warning");
            zdlpuopuiu.btonecajqb(orderEdit, "orderEdit");
            this.f71683iobyxmoadg = warning;
            this.f71684zoijcleaow = orderEdit;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f71683iobyxmoadg, iobyxmoadgVar.f71683iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71684zoijcleaow, iobyxmoadgVar.f71684zoijcleaow);
        }

        public int hashCode() {
            return (this.f71683iobyxmoadg.hashCode() * 31) + this.f71684zoijcleaow.hashCode();
        }

        public final e10.iobyxmoadg iobyxmoadg() {
            return this.f71684zoijcleaow;
        }

        public String toString() {
            return "EditOrderResult(warning=" + this.f71683iobyxmoadg + ", orderEdit=" + this.f71684zoijcleaow + ")";
        }

        public final Warning zoijcleaow() {
            return this.f71683iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f71686esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f71687iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f71688jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f71689yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f71690zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f71687iwizpuwonk = obj;
            this.f71686esjtqupxsv |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    public interface zoijcleaow {

        public static final class iobyxmoadg implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f71691iobyxmoadg;

            public iobyxmoadg(String orderId) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                this.f71691iobyxmoadg = orderId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71691iobyxmoadg, ((iobyxmoadg) obj).f71691iobyxmoadg);
            }

            public int hashCode() {
                return this.f71691iobyxmoadg.hashCode();
            }

            @Override // o20.wkgbmnqykc.zoijcleaow
            public String iobyxmoadg() {
                return this.f71691iobyxmoadg;
            }

            public String toString() {
                return "RefreshCachedOrder(orderId=" + this.f71691iobyxmoadg + ")";
            }
        }

        /* JADX INFO: renamed from: o20.wkgbmnqykc$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        public static final class C1550zoijcleaow implements zoijcleaow {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f71692iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final List f71693zoijcleaow;

            public C1550zoijcleaow(String orderId, List products) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                zdlpuopuiu.btonecajqb(products, "products");
                this.f71692iobyxmoadg = orderId;
                this.f71693zoijcleaow = products;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1550zoijcleaow)) {
                    return false;
                }
                C1550zoijcleaow c1550zoijcleaow = (C1550zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f71692iobyxmoadg, c1550zoijcleaow.f71692iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71693zoijcleaow, c1550zoijcleaow.f71693zoijcleaow);
            }

            public int hashCode() {
                return (this.f71692iobyxmoadg.hashCode() * 31) + this.f71693zoijcleaow.hashCode();
            }

            @Override // o20.wkgbmnqykc.zoijcleaow
            public String iobyxmoadg() {
                return this.f71692iobyxmoadg;
            }

            public String toString() {
                return "UpdateProducts(orderId=" + this.f71692iobyxmoadg + ", products=" + this.f71693zoijcleaow + ")";
            }

            public final List zoijcleaow() {
                return this.f71693zoijcleaow;
            }
        }

        String iobyxmoadg();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(w10.nufgyqmvbu orderLocalSource, w10.dxjokdxxww orderRemoteSource, o20.ppxfxbqfkf changeOrderCompoundStateUseCase, btonecajqb getEditOrderUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(orderLocalSource, "orderLocalSource");
        zdlpuopuiu.btonecajqb(orderRemoteSource, "orderRemoteSource");
        zdlpuopuiu.btonecajqb(changeOrderCompoundStateUseCase, "changeOrderCompoundStateUseCase");
        zdlpuopuiu.btonecajqb(getEditOrderUseCase, "getEditOrderUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f71682zoijcleaow = orderLocalSource;
        this.f71680ppxfxbqfkf = orderRemoteSource;
        this.f71681wkgbmnqykc = changeOrderCompoundStateUseCase;
        this.f71679eablkybsjg = getEditOrderUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:65:0x018f A[LOOP:0: B:63:0x0189->B:65:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        wkgbmnqykc wkgbmnqykcVar;
        zoijcleaow zoijcleaowVar2;
        wkgbmnqykc wkgbmnqykcVar2;
        e10.iobyxmoadg iobyxmoadgVar;
        Object next;
        String value;
        MeasureType measureType;
        e10.iobyxmoadg iobyxmoadgVar2;
        ArrayList arrayList;
        Iterator it;
        e10.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        w10.nufgyqmvbu nufgyqmvbuVar;
        wkgbmnqykc wkgbmnqykcVar3;
        e10.iobyxmoadg iobyxmoadgVar3;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f71686esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f71686esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f71687iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f71686esjtqupxsv;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar2 = (zoijcleaow) ppxfxbqfkfVar.f71689yggfygwlhe;
                wkgbmnqykc wkgbmnqykcVar4 = (wkgbmnqykc) ppxfxbqfkfVar.f71690zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                wkgbmnqykcVar = wkgbmnqykcVar4;
            } else if (i14 == 2) {
                iobyxmoadgVar = (e10.iobyxmoadg) ppxfxbqfkfVar.f71689yggfygwlhe;
                wkgbmnqykcVar2 = (wkgbmnqykc) ppxfxbqfkfVar.f71690zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar2 = (e10.iobyxmoadg) objZoijcleaow;
                e10.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar;
                e10.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp = iobyxmoadgVar2.wflxmlrfwp();
                List listPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf();
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf, 10));
                it = listPpxfxbqfkf.iterator();
                while (it.hasNext()) {
                    arrayList.add(l00.zoijcleaow.f61309rgvfuqvkyq.iobyxmoadg((e10.eablkybsjg) it.next()));
                }
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar4.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar4.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar4.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar4.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar4.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar4.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar4.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar4.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar4.f30182nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar4.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar4.f30174btonecajqb : lqeggnwhkgVarWflxmlrfwp, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar4.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar4.f30175draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar4.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar4.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar4.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar4.f30185rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar4.f30186vdvldrhtss : null);
                nufgyqmvbuVar = wkgbmnqykcVar2.f71682zoijcleaow;
                ppxfxbqfkfVar.f71690zdlpuopuiu = wkgbmnqykcVar2;
                ppxfxbqfkfVar.f71689yggfygwlhe = iobyxmoadgVar2;
                ppxfxbqfkfVar.f71688jyumaefscl = iobyxmoadgVarIobyxmoadg;
                ppxfxbqfkfVar.f71686esjtqupxsv = 4;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                iobyxmoadgVar3 = iobyxmoadgVar2;
            } else if (i14 == 3) {
                iobyxmoadgVar = (e10.iobyxmoadg) ppxfxbqfkfVar.f71689yggfygwlhe;
                wkgbmnqykcVar2 = (wkgbmnqykc) ppxfxbqfkfVar.f71690zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                iobyxmoadgVar2 = (e10.iobyxmoadg) objZoijcleaow;
                e10.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar;
                e10.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp2 = iobyxmoadgVar2.wflxmlrfwp();
                List listPpxfxbqfkf2 = iobyxmoadgVar2.ppxfxbqfkf();
                arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf2, 10));
                it = listPpxfxbqfkf2.iterator();
                while (it.hasNext()) {
                    arrayList.add(l00.zoijcleaow.f61309rgvfuqvkyq.iobyxmoadg((e10.eablkybsjg) it.next()));
                }
                iobyxmoadgVarIobyxmoadg = iobyxmoadgVar5.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar5.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar5.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar5.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar5.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar5.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar5.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar5.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar5.f30182nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar5.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar5.f30174btonecajqb : lqeggnwhkgVarWflxmlrfwp2, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar5.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar5.f30175draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar5.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar5.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar5.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar5.f30185rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar5.f30186vdvldrhtss : null);
                nufgyqmvbuVar = wkgbmnqykcVar2.f71682zoijcleaow;
                ppxfxbqfkfVar.f71690zdlpuopuiu = wkgbmnqykcVar2;
                ppxfxbqfkfVar.f71689yggfygwlhe = iobyxmoadgVar2;
                ppxfxbqfkfVar.f71688jyumaefscl = iobyxmoadgVarIobyxmoadg;
                ppxfxbqfkfVar.f71686esjtqupxsv = 4;
                if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                wkgbmnqykcVar3 = wkgbmnqykcVar2;
                iobyxmoadgVar3 = iobyxmoadgVar2;
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVarIobyxmoadg = (e10.iobyxmoadg) ppxfxbqfkfVar.f71688jyumaefscl;
                iobyxmoadgVar3 = (e10.iobyxmoadg) ppxfxbqfkfVar.f71689yggfygwlhe;
                wkgbmnqykcVar3 = (wkgbmnqykc) ppxfxbqfkfVar.f71690zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            wkgbmnqykcVar3.f71681wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
            return new iobyxmoadg(iobyxmoadgVar3.oxmwwwfdhm(), iobyxmoadgVarIobyxmoadg);
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        btonecajqb btonecajqbVar = this.f71679eablkybsjg;
        btonecajqb.iobyxmoadg iobyxmoadgVar6 = new btonecajqb.iobyxmoadg(zoijcleaowVar.iobyxmoadg());
        ppxfxbqfkfVar.f71690zdlpuopuiu = this;
        ppxfxbqfkfVar.f71689yggfygwlhe = zoijcleaowVar;
        ppxfxbqfkfVar.f71686esjtqupxsv = 1;
        objZoijcleaow = btonecajqbVar.zoijcleaow(iobyxmoadgVar6, ppxfxbqfkfVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar = this;
        zoijcleaowVar2 = zoijcleaowVar;
        e10.iobyxmoadg iobyxmoadgVar7 = (e10.iobyxmoadg) objZoijcleaow;
        if (zoijcleaowVar2 instanceof zoijcleaow.iobyxmoadg) {
            w10.dxjokdxxww dxjokdxxwwVar = wkgbmnqykcVar.f71680ppxfxbqfkf;
            String strIobyxmoadg = ((zoijcleaow.iobyxmoadg) zoijcleaowVar2).iobyxmoadg();
            e10.zoijcleaow zoijcleaowVar3 = e10.zoijcleaow.CONTINUE;
            ppxfxbqfkfVar.f71690zdlpuopuiu = wkgbmnqykcVar;
            ppxfxbqfkfVar.f71689yggfygwlhe = iobyxmoadgVar7;
            ppxfxbqfkfVar.f71686esjtqupxsv = 2;
            Object objGtknphoqwx = w10.dxjokdxxww.gtknphoqwx(dxjokdxxwwVar, strIobyxmoadg, iobyxmoadgVar7, null, zoijcleaowVar3, ppxfxbqfkfVar, 4, null);
            if (objGtknphoqwx == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            iobyxmoadgVar = iobyxmoadgVar7;
            objZoijcleaow = objGtknphoqwx;
            iobyxmoadgVar2 = (e10.iobyxmoadg) objZoijcleaow;
            e10.iobyxmoadg iobyxmoadgVar8 = iobyxmoadgVar;
            e10.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp3 = iobyxmoadgVar2.wflxmlrfwp();
            List listPpxfxbqfkf3 = iobyxmoadgVar2.ppxfxbqfkf();
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf3, 10));
            it = listPpxfxbqfkf3.iterator();
            while (it.hasNext()) {
                arrayList.add(l00.zoijcleaow.f61309rgvfuqvkyq.iobyxmoadg((e10.eablkybsjg) it.next()));
            }
            iobyxmoadgVarIobyxmoadg = iobyxmoadgVar8.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar8.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar8.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar8.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar8.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar8.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar8.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar8.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar8.f30182nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar8.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar8.f30174btonecajqb : lqeggnwhkgVarWflxmlrfwp3, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar8.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar8.f30175draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar8.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar8.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar8.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar8.f30185rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar8.f30186vdvldrhtss : null);
            nufgyqmvbuVar = wkgbmnqykcVar2.f71682zoijcleaow;
            ppxfxbqfkfVar.f71690zdlpuopuiu = wkgbmnqykcVar2;
            ppxfxbqfkfVar.f71689yggfygwlhe = iobyxmoadgVar2;
            ppxfxbqfkfVar.f71688jyumaefscl = iobyxmoadgVarIobyxmoadg;
            ppxfxbqfkfVar.f71686esjtqupxsv = 4;
            if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            iobyxmoadgVar3 = iobyxmoadgVar2;
            wkgbmnqykcVar3.f71681wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
            return new iobyxmoadg(iobyxmoadgVar3.oxmwwwfdhm(), iobyxmoadgVarIobyxmoadg);
        }
        if (!(zoijcleaowVar2 instanceof zoijcleaow.C1550zoijcleaow)) {
            throw new NoWhenBranchMatchedException();
        }
        w10.dxjokdxxww dxjokdxxwwVar2 = wkgbmnqykcVar.f71680ppxfxbqfkf;
        zoijcleaow.C1550zoijcleaow c1550zoijcleaow = (zoijcleaow.C1550zoijcleaow) zoijcleaowVar2;
        String strIobyxmoadg2 = c1550zoijcleaow.iobyxmoadg();
        List<e10.eablkybsjg> listPpxfxbqfkf4 = iobyxmoadgVar7.ppxfxbqfkf();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf4, 10));
        for (e10.eablkybsjg eablkybsjgVar : listPpxfxbqfkf4) {
            Iterator it2 = c1550zoijcleaow.zoijcleaow().iterator();
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
            w10.dxjokdxxww dxjokdxxwwVar3 = dxjokdxxwwVar2;
            arrayList2.add(new e10.gxszxtbevo(strNufgyqmvbu, value, quantity));
            dxjokdxxwwVar2 = dxjokdxxwwVar3;
        }
        ppxfxbqfkfVar.f71690zdlpuopuiu = wkgbmnqykcVar;
        ppxfxbqfkfVar.f71689yggfygwlhe = iobyxmoadgVar7;
        ppxfxbqfkfVar.f71686esjtqupxsv = 3;
        Object objLqeggnwhkg = dxjokdxxwwVar2.lqeggnwhkg(strIobyxmoadg2, iobyxmoadgVar7, arrayList2, false, ppxfxbqfkfVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar2 = wkgbmnqykcVar;
        iobyxmoadgVar = iobyxmoadgVar7;
        objZoijcleaow = objLqeggnwhkg;
        iobyxmoadgVar2 = (e10.iobyxmoadg) objZoijcleaow;
        e10.iobyxmoadg iobyxmoadgVar9 = iobyxmoadgVar;
        e10.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp4 = iobyxmoadgVar2.wflxmlrfwp();
        List listPpxfxbqfkf5 = iobyxmoadgVar2.ppxfxbqfkf();
        arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listPpxfxbqfkf5, 10));
        it = listPpxfxbqfkf5.iterator();
        while (it.hasNext()) {
            arrayList.add(l00.zoijcleaow.f61309rgvfuqvkyq.iobyxmoadg((e10.eablkybsjg) it.next()));
        }
        iobyxmoadgVarIobyxmoadg = iobyxmoadgVar9.iobyxmoadg((131007 & 1) != 0 ? iobyxmoadgVar9.f30180iobyxmoadg : null, (131007 & 2) != 0 ? iobyxmoadgVar9.f30189zoijcleaow : null, (131007 & 4) != 0 ? iobyxmoadgVar9.f30184ppxfxbqfkf : null, (131007 & 8) != 0 ? iobyxmoadgVar9.f30188wkgbmnqykc : null, (131007 & 16) != 0 ? iobyxmoadgVar9.f30177eablkybsjg : null, (131007 & 32) != 0 ? iobyxmoadgVar9.f30179gxszxtbevo : null, (131007 & 64) != 0 ? iobyxmoadgVar9.f30181lqeggnwhkg : null, (131007 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iobyxmoadgVar9.f30182nufgyqmvbu : iobyxmoadgVar2.rgvfuqvkyq(), (131007 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadgVar9.f30176dxjokdxxww : null, (131007 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iobyxmoadgVar9.f30174btonecajqb : lqeggnwhkgVarWflxmlrfwp4, (131007 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iobyxmoadgVar9.f30178gtknphoqwx : null, (131007 & 2048) != 0 ? iobyxmoadgVar9.f30175draadjrbmk : arrayList, (131007 & 4096) != 0 ? iobyxmoadgVar9.f30187wflxmlrfwp : null, (131007 & 8192) != 0 ? iobyxmoadgVar9.f30173agtfadlqog : null, (131007 & 16384) != 0 ? iobyxmoadgVar9.f30183ojitshcjhn : null, (131007 & 32768) != 0 ? iobyxmoadgVar9.f30185rgvfuqvkyq : iobyxmoadgVar2.vdvldrhtss(), (131007 & 65536) != 0 ? iobyxmoadgVar9.f30186vdvldrhtss : null);
        nufgyqmvbuVar = wkgbmnqykcVar2.f71682zoijcleaow;
        ppxfxbqfkfVar.f71690zdlpuopuiu = wkgbmnqykcVar2;
        ppxfxbqfkfVar.f71689yggfygwlhe = iobyxmoadgVar2;
        ppxfxbqfkfVar.f71688jyumaefscl = iobyxmoadgVarIobyxmoadg;
        ppxfxbqfkfVar.f71686esjtqupxsv = 4;
        if (nufgyqmvbuVar.lqeggnwhkg(iobyxmoadgVarIobyxmoadg, ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar3 = wkgbmnqykcVar2;
        iobyxmoadgVar3 = iobyxmoadgVar2;
        wkgbmnqykcVar3.f71681wkgbmnqykc.zoijcleaow(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
        return new iobyxmoadg(iobyxmoadgVar3.oxmwwwfdhm(), iobyxmoadgVarIobyxmoadg);
    }
}
