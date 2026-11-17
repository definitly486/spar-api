package k51;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.delivery.impl.interval.domain.models.IntervalInfo;
import w01.agtfadlqog;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final agtfadlqog f53866ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cz0.iobyxmoadg f53867zoijcleaow;

    /* JADX INFO: renamed from: k51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC1153iobyxmoadg {

        /* JADX INFO: renamed from: k51.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1154iobyxmoadg implements InterfaceC1153iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f53868iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final IntervalInfo f53869zoijcleaow;

            public C1154iobyxmoadg(String dateReceipt, IntervalInfo interval) {
                zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
                zdlpuopuiu.btonecajqb(interval, "interval");
                this.f53868iobyxmoadg = dateReceipt;
                this.f53869zoijcleaow = interval;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1154iobyxmoadg)) {
                    return false;
                }
                C1154iobyxmoadg c1154iobyxmoadg = (C1154iobyxmoadg) obj;
                return zdlpuopuiu.eablkybsjg(this.f53868iobyxmoadg, c1154iobyxmoadg.f53868iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f53869zoijcleaow, c1154iobyxmoadg.f53869zoijcleaow);
            }

            public int hashCode() {
                return (this.f53868iobyxmoadg.hashCode() * 31) + this.f53869zoijcleaow.hashCode();
            }

            public String iobyxmoadg() {
                return this.f53868iobyxmoadg;
            }

            public String toString() {
                return "ForCart(dateReceipt=" + this.f53868iobyxmoadg + ", interval=" + this.f53869zoijcleaow + ")";
            }

            public IntervalInfo zoijcleaow() {
                return this.f53869zoijcleaow;
            }
        }

        /* JADX INFO: renamed from: k51.iobyxmoadg$iobyxmoadg$zoijcleaow */
        public static final class zoijcleaow implements InterfaceC1153iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f53870iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final IntervalInfo f53871ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f53872zoijcleaow;

            public zoijcleaow(String orderId, String dateReceipt, IntervalInfo interval) {
                zdlpuopuiu.btonecajqb(orderId, "orderId");
                zdlpuopuiu.btonecajqb(dateReceipt, "dateReceipt");
                zdlpuopuiu.btonecajqb(interval, "interval");
                this.f53870iobyxmoadg = orderId;
                this.f53872zoijcleaow = dateReceipt;
                this.f53871ppxfxbqfkf = interval;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f53870iobyxmoadg, zoijcleaowVar.f53870iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f53872zoijcleaow, zoijcleaowVar.f53872zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f53871ppxfxbqfkf, zoijcleaowVar.f53871ppxfxbqfkf);
            }

            public int hashCode() {
                return (((this.f53870iobyxmoadg.hashCode() * 31) + this.f53872zoijcleaow.hashCode()) * 31) + this.f53871ppxfxbqfkf.hashCode();
            }

            public String iobyxmoadg() {
                return this.f53872zoijcleaow;
            }

            public String ppxfxbqfkf() {
                return this.f53870iobyxmoadg;
            }

            public String toString() {
                return "ForEditOrder(orderId=" + this.f53870iobyxmoadg + ", dateReceipt=" + this.f53872zoijcleaow + ", interval=" + this.f53871ppxfxbqfkf + ")";
            }

            public IntervalInfo zoijcleaow() {
                return this.f53871ppxfxbqfkf;
            }
        }
    }

    static final class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f53873jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f53875zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f53875zdlpuopuiu = obj;
            this.f53873jyumaefscl |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(cz0.iobyxmoadg cartInteractor, agtfadlqog setOrderEditIntervals, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(setOrderEditIntervals, "setOrderEditIntervals");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f53867zoijcleaow = cartInteractor;
        this.f53866ppxfxbqfkf = setOrderEditIntervals;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(InterfaceC1153iobyxmoadg interfaceC1153iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f53873jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f53873jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZdlpuopuiu = zoijcleaowVar.f53875zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f53873jyumaefscl;
        if (i14 != 0) {
            if (i14 == 1) {
                gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
                return ((Cart) objZdlpuopuiu).getWarning();
            }
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
            return Warning.Empty.f95255jyumaefscl;
        }
        gg.zdlpuopuiu.zoijcleaow(objZdlpuopuiu);
        if (!(interfaceC1153iobyxmoadg instanceof InterfaceC1153iobyxmoadg.C1154iobyxmoadg)) {
            if (!(interfaceC1153iobyxmoadg instanceof InterfaceC1153iobyxmoadg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC1153iobyxmoadg.zoijcleaow zoijcleaowVar2 = (InterfaceC1153iobyxmoadg.zoijcleaow) interfaceC1153iobyxmoadg;
            agtfadlqog.iobyxmoadg iobyxmoadgVar = new agtfadlqog.iobyxmoadg(zoijcleaowVar2.ppxfxbqfkf(), zoijcleaowVar2.iobyxmoadg(), zoijcleaowVar2.zoijcleaow().getValue());
            agtfadlqog agtfadlqogVar = this.f53866ppxfxbqfkf;
            zoijcleaowVar.f53873jyumaefscl = 2;
            if (agtfadlqogVar.zoijcleaow(iobyxmoadgVar, zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return Warning.Empty.f95255jyumaefscl;
        }
        cz0.iobyxmoadg iobyxmoadgVar2 = this.f53867zoijcleaow;
        InterfaceC1153iobyxmoadg.C1154iobyxmoadg c1154iobyxmoadg = (InterfaceC1153iobyxmoadg.C1154iobyxmoadg) interfaceC1153iobyxmoadg;
        String strIobyxmoadg = c1154iobyxmoadg.iobyxmoadg();
        String value = c1154iobyxmoadg.zoijcleaow().getValue();
        boolean isFastDelivery = c1154iobyxmoadg.zoijcleaow().getIsFastDelivery();
        zoijcleaowVar.f53873jyumaefscl = 1;
        objZdlpuopuiu = iobyxmoadgVar2.zdlpuopuiu(strIobyxmoadg, value, isFastDelivery, zoijcleaowVar);
        if (objZdlpuopuiu == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return ((Cart) objZdlpuopuiu).getWarning();
    }
}
