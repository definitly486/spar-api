package vg1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.proloyalty.components.payment.api.models.PaymentModel;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final PaymentModel f116733eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final tzroggbefp f116734gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f116735iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f116736ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f116737wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Double f116738zoijcleaow;

    public gxszxtbevo(boolean z13, Double d13, List methods, boolean z14, PaymentModel paymentModel, tzroggbefp nominal) {
        zdlpuopuiu.btonecajqb(methods, "methods");
        zdlpuopuiu.btonecajqb(nominal, "nominal");
        this.f116735iobyxmoadg = z13;
        this.f116738zoijcleaow = d13;
        this.f116736ppxfxbqfkf = methods;
        this.f116737wkgbmnqykc = z14;
        this.f116733eablkybsjg = paymentModel;
        this.f116734gxszxtbevo = nominal;
    }

    public final boolean eablkybsjg() {
        return this.f116735iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f116735iobyxmoadg == gxszxtbevoVar.f116735iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f116738zoijcleaow, gxszxtbevoVar.f116738zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f116736ppxfxbqfkf, gxszxtbevoVar.f116736ppxfxbqfkf) && this.f116737wkgbmnqykc == gxszxtbevoVar.f116737wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f116733eablkybsjg, gxszxtbevoVar.f116733eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f116734gxszxtbevo, gxszxtbevoVar.f116734gxszxtbevo);
    }

    public final boolean gxszxtbevo() {
        return this.f116737wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f116735iobyxmoadg) * 31;
        Double d13 = this.f116738zoijcleaow;
        int iHashCode2 = (((((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + this.f116736ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f116737wkgbmnqykc)) * 31;
        PaymentModel paymentModel = this.f116733eablkybsjg;
        return ((iHashCode2 + (paymentModel != null ? paymentModel.hashCode() : 0)) * 31) + this.f116734gxszxtbevo.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f116736ppxfxbqfkf;
    }

    public final Double ppxfxbqfkf() {
        return this.f116738zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f116735iobyxmoadg + ", price=" + this.f116738zoijcleaow + ", methods=" + this.f116736ppxfxbqfkf + ", isPaymentBonuses=" + this.f116737wkgbmnqykc + ", selectedMethod=" + this.f116733eablkybsjg + ", nominal=" + this.f116734gxszxtbevo + ")";
    }

    public final PaymentModel wkgbmnqykc() {
        return this.f116733eablkybsjg;
    }

    public final tzroggbefp zoijcleaow() {
        return this.f116734gxszxtbevo;
    }
}
