package v60;

import ft.ppxfxbqfkf;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import o20.wflxmlrfwp;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.models.Warning;
import ru.myspar.delivery.impl.interval.domain.models.IntervalInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wflxmlrfwp f116183ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k00.iobyxmoadg f116184zoijcleaow;

    /* JADX INFO: renamed from: v60.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC2886iobyxmoadg {

        /* JADX INFO: renamed from: v60.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2887iobyxmoadg implements InterfaceC2886iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f116185iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final IntervalInfo f116186zoijcleaow;

            public C2887iobyxmoadg(String dateReceipt, IntervalInfo interval) {
                zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
                zdlpuopuiu.btonecajqb(interval, "interval");
                this.f116185iobyxmoadg = dateReceipt;
                this.f116186zoijcleaow = interval;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2887iobyxmoadg)) {
                    return false;
                }
                C2887iobyxmoadg c2887iobyxmoadg = (C2887iobyxmoadg) obj;
                return zdlpuopuiu.eablkybsjg(this.f116185iobyxmoadg, c2887iobyxmoadg.f116185iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116186zoijcleaow, c2887iobyxmoadg.f116186zoijcleaow);
            }

            public int hashCode() {
                return (this.f116185iobyxmoadg.hashCode() * 31) + this.f116186zoijcleaow.hashCode();
            }

            public String iobyxmoadg() {
                return this.f116185iobyxmoadg;
            }

            public String toString() {
                return "ForCart(dateReceipt=" + this.f116185iobyxmoadg + ", interval=" + this.f116186zoijcleaow + ")";
            }

            public IntervalInfo zoijcleaow() {
                return this.f116186zoijcleaow;
            }
        }

        /* JADX INFO: renamed from: v60.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC2886iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f116187iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final IntervalInfo f116188ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f116189zoijcleaow;

            public zoijcleaow(String orderId, String dateReceipt, IntervalInfo interval) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
                zdlpuopuiu.btonecajqb(interval, "interval");
                this.f116187iobyxmoadg = orderId;
                this.f116189zoijcleaow = dateReceipt;
                this.f116188ppxfxbqfkf = interval;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f116187iobyxmoadg, zoijcleaowVar.f116187iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f116189zoijcleaow, zoijcleaowVar.f116189zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116188ppxfxbqfkf, zoijcleaowVar.f116188ppxfxbqfkf);
            }

            public int hashCode() {
                return (((this.f116187iobyxmoadg.hashCode() * 31) + this.f116189zoijcleaow.hashCode()) * 31) + this.f116188ppxfxbqfkf.hashCode();
            }

            public String iobyxmoadg() {
                return this.f116189zoijcleaow;
            }

            public String ppxfxbqfkf() {
                return this.f116187iobyxmoadg;
            }

            public String toString() {
                return "ForEditOrder(orderId=" + this.f116187iobyxmoadg + ", dateReceipt=" + this.f116189zoijcleaow + ", interval=" + this.f116188ppxfxbqfkf + ")";
            }

            public IntervalInfo zoijcleaow() {
                return this.f116188ppxfxbqfkf;
            }
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f116190jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f116192zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f116192zdlpuopuiu = obj;
            this.f116190jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k00.iobyxmoadg cartInteractor, wflxmlrfwp setOrderEditIntervals, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(setOrderEditIntervals, "setOrderEditIntervals");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f116184zoijcleaow = cartInteractor;
        this.f116183ppxfxbqfkf = setOrderEditIntervals;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(InterfaceC2886iobyxmoadg interfaceC2886iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f116190jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f116190jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objIwizpuwonk = zoijcleaowVar.f116192zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f116190jyumaefscl;
        if (i14 != 0) {
            if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(objIwizpuwonk);
                return ((Cart) objIwizpuwonk).getWarning();
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objIwizpuwonk);
            return Warning.Empty.f87479jyumaefscl;
        }
        gg.zdlpuopuiu.zoijcleaow(objIwizpuwonk);
        if (!(interfaceC2886iobyxmoadg instanceof InterfaceC2886iobyxmoadg.C2887iobyxmoadg)) {
            if (!(interfaceC2886iobyxmoadg instanceof InterfaceC2886iobyxmoadg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC2886iobyxmoadg.zoijcleaow zoijcleaowVar2 = (InterfaceC2886iobyxmoadg.zoijcleaow) interfaceC2886iobyxmoadg;
            wflxmlrfwp.iobyxmoadg iobyxmoadgVar = new wflxmlrfwp.iobyxmoadg(zoijcleaowVar2.ppxfxbqfkf(), zoijcleaowVar2.iobyxmoadg(), zoijcleaowVar2.zoijcleaow().getValue());
            wflxmlrfwp wflxmlrfwpVar = this.f116183ppxfxbqfkf;
            zoijcleaowVar.f116190jyumaefscl = 2;
            if (wflxmlrfwpVar.zoijcleaow(iobyxmoadgVar, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return Warning.Empty.f87479jyumaefscl;
        }
        k00.iobyxmoadg iobyxmoadgVar2 = this.f116184zoijcleaow;
        InterfaceC2886iobyxmoadg.C2887iobyxmoadg c2887iobyxmoadg = (InterfaceC2886iobyxmoadg.C2887iobyxmoadg) interfaceC2886iobyxmoadg;
        String strIobyxmoadg = c2887iobyxmoadg.iobyxmoadg();
        String value = c2887iobyxmoadg.zoijcleaow().getValue();
        boolean isFastDelivery = c2887iobyxmoadg.zoijcleaow().getIsFastDelivery();
        zoijcleaowVar.f116190jyumaefscl = 1;
        objIwizpuwonk = iobyxmoadgVar2.iwizpuwonk(strIobyxmoadg, value, isFastDelivery, zoijcleaowVar);
        if (objIwizpuwonk == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return ((Cart) objIwizpuwonk).getWarning();
    }
}
