package ba2;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.payment.cards.model.PaymentList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f15592iobyxmoadg;

    /* JADX INFO: renamed from: ba2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0270iobyxmoadg extends iobyxmoadg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final PaymentList f15593zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0270iobyxmoadg(PaymentList paymentList) {
            super(pm.dxjokdxxww.payment_methods, null);
            zdlpuopuiu.btonecajqb(paymentList, "paymentList");
            this.f15593zoijcleaow = paymentList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0270iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f15593zoijcleaow, ((C0270iobyxmoadg) obj).f15593zoijcleaow);
        }

        public int hashCode() {
            return this.f15593zoijcleaow.hashCode();
        }

        public String toString() {
            return "PaymentMethodBlock(paymentList=" + this.f15593zoijcleaow + ")";
        }

        public final PaymentList zoijcleaow() {
            return this.f15593zoijcleaow;
        }
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final gxszxtbevo f15594eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f15595ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final dxjokdxxww f15596wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f15597zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(String purposeCode, String name, dxjokdxxww input, gxszxtbevo optionsList) {
            super(purposeCode.hashCode(), null);
            zdlpuopuiu.btonecajqb(purposeCode, "purposeCode");
            zdlpuopuiu.btonecajqb(name, "name");
            zdlpuopuiu.btonecajqb(input, "input");
            zdlpuopuiu.btonecajqb(optionsList, "optionsList");
            this.f15597zoijcleaow = purposeCode;
            this.f15595ppxfxbqfkf = name;
            this.f15596wkgbmnqykc = input;
            this.f15594eablkybsjg = optionsList;
        }

        public final String eablkybsjg() {
            return this.f15597zoijcleaow;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f15597zoijcleaow, zoijcleaowVar.f15597zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f15595ppxfxbqfkf, zoijcleaowVar.f15595ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f15596wkgbmnqykc, zoijcleaowVar.f15596wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f15594eablkybsjg, zoijcleaowVar.f15594eablkybsjg);
        }

        public int hashCode() {
            return (((((this.f15597zoijcleaow.hashCode() * 31) + this.f15595ppxfxbqfkf.hashCode()) * 31) + this.f15596wkgbmnqykc.hashCode()) * 31) + this.f15594eablkybsjg.hashCode();
        }

        public final String ppxfxbqfkf() {
            return this.f15595ppxfxbqfkf;
        }

        public String toString() {
            return "TipsEditBlock(purposeCode=" + this.f15597zoijcleaow + ", name=" + this.f15595ppxfxbqfkf + ", input=" + this.f15596wkgbmnqykc + ", optionsList=" + this.f15594eablkybsjg + ")";
        }

        public final gxszxtbevo wkgbmnqykc() {
            return this.f15594eablkybsjg;
        }

        public final dxjokdxxww zoijcleaow() {
            return this.f15596wkgbmnqykc;
        }
    }

    public /* synthetic */ iobyxmoadg(int i13, gtknphoqwx gtknphoqwxVar) {
        this(i13);
    }

    public final int iobyxmoadg() {
        return this.f15592iobyxmoadg;
    }

    private iobyxmoadg(int i13) {
        this.f15592iobyxmoadg = i13;
    }
}
