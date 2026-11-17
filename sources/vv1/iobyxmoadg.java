package vv1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.payment.cards.model.PaymentList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f118107iobyxmoadg;

    /* JADX INFO: renamed from: vv1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2932iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final PaymentList f118108zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2932iobyxmoadg(PaymentList paymentList) {
            super(vk0.lqeggnwhkg.proloyalty_payment_methods, null);
            zdlpuopuiu.btonecajqb(paymentList, "paymentList");
            this.f118108zoijcleaow = paymentList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2932iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118108zoijcleaow, ((C2932iobyxmoadg) obj).f118108zoijcleaow);
        }

        public int hashCode() {
            return this.f118108zoijcleaow.hashCode();
        }

        public String toString() {
            return "PaymentMethodBlock(paymentList=" + this.f118108zoijcleaow + ")";
        }

        public final PaymentList zoijcleaow() {
            return this.f118108zoijcleaow;
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final gxszxtbevo f118109eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f118110ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final dxjokdxxww f118111wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f118112zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String purposeCode, String name, dxjokdxxww input, gxszxtbevo optionsList) {
            super(purposeCode.hashCode(), null);
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(input, "input");
            zdlpuopuiu.btonecajqb(optionsList, "optionsList");
            this.f118112zoijcleaow = purposeCode;
            this.f118110ppxfxbqfkf = name;
            this.f118111wkgbmnqykc = input;
            this.f118109eablkybsjg = optionsList;
        }

        public final String eablkybsjg() {
            return this.f118112zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f118112zoijcleaow, zoijcleaowVar.f118112zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118110ppxfxbqfkf, zoijcleaowVar.f118110ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f118111wkgbmnqykc, zoijcleaowVar.f118111wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f118109eablkybsjg, zoijcleaowVar.f118109eablkybsjg);
        }

        public int hashCode() {
            return (((((this.f118112zoijcleaow.hashCode() * 31) + this.f118110ppxfxbqfkf.hashCode()) * 31) + this.f118111wkgbmnqykc.hashCode()) * 31) + this.f118109eablkybsjg.hashCode();
        }

        public final String ppxfxbqfkf() {
            return this.f118110ppxfxbqfkf;
        }

        public String toString() {
            return "TipsEditBlock(purposeCode=" + this.f118112zoijcleaow + ", name=" + this.f118110ppxfxbqfkf + ", input=" + this.f118111wkgbmnqykc + ", optionsList=" + this.f118109eablkybsjg + ")";
        }

        public final gxszxtbevo wkgbmnqykc() {
            return this.f118109eablkybsjg;
        }

        public final dxjokdxxww zoijcleaow() {
            return this.f118111wkgbmnqykc;
        }
    }

    public /* synthetic */ iobyxmoadg(int i13, gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    public final int iobyxmoadg() {
        return this.f118107iobyxmoadg;
    }

    private iobyxmoadg(int i13) {
        this.f118107iobyxmoadg = i13;
    }
}
