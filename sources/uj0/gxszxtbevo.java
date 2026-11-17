package uj0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final PaymentModel f113690eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tzroggbefp f113691gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f113692iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f113693ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f113694wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Double f113695zoijcleaow;

    public gxszxtbevo(boolean z13, Double d13, List methods, boolean z14, PaymentModel paymentModel, tzroggbefp nominal) {
        zdlpuopuiu.btonecajqb(methods, "methods");
        zdlpuopuiu.btonecajqb(nominal, "nominal");
        this.f113692iobyxmoadg = z13;
        this.f113695zoijcleaow = d13;
        this.f113693ppxfxbqfkf = methods;
        this.f113694wkgbmnqykc = z14;
        this.f113690eablkybsjg = paymentModel;
        this.f113691gxszxtbevo = nominal;
    }

    public final boolean eablkybsjg() {
        return this.f113692iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f113692iobyxmoadg == gxszxtbevoVar.f113692iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f113695zoijcleaow, gxszxtbevoVar.f113695zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f113693ppxfxbqfkf, gxszxtbevoVar.f113693ppxfxbqfkf) && this.f113694wkgbmnqykc == gxszxtbevoVar.f113694wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f113690eablkybsjg, gxszxtbevoVar.f113690eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f113691gxszxtbevo, gxszxtbevoVar.f113691gxszxtbevo);
    }

    public final boolean gxszxtbevo() {
        return this.f113694wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f113692iobyxmoadg) * 31;
        Double d13 = this.f113695zoijcleaow;
        int iHashCode2 = (((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.f113693ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f113694wkgbmnqykc)) * 31;
        PaymentModel paymentModel = this.f113690eablkybsjg;
        return ((iHashCode2 + (paymentModel != null ? paymentModel.hashCode() : 0)) * 31) + this.f113691gxszxtbevo.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f113693ppxfxbqfkf;
    }

    public final Double ppxfxbqfkf() {
        return this.f113695zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f113692iobyxmoadg + ", price=" + this.f113695zoijcleaow + ", methods=" + this.f113693ppxfxbqfkf + ", isPaymentBonuses=" + this.f113694wkgbmnqykc + ", selectedMethod=" + this.f113690eablkybsjg + ", nominal=" + this.f113691gxszxtbevo + ")";
    }

    public final PaymentModel wkgbmnqykc() {
        return this.f113690eablkybsjg;
    }

    public final tzroggbefp zoijcleaow() {
        return this.f113691gxszxtbevo;
    }
}
