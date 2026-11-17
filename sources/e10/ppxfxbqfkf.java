package e10;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final double f30201dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f30202eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f30203gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f30204iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f30205lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final double f30206nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f30207ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final double f30208wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f30209zoijcleaow;

    public ppxfxbqfkf(double d13, double d14, double d15, double d16, double d17, double d18, int i13, double d19, double d23) {
        this.f30204iobyxmoadg = d13;
        this.f30209zoijcleaow = d14;
        this.f30207ppxfxbqfkf = d15;
        this.f30208wkgbmnqykc = d16;
        this.f30202eablkybsjg = d17;
        this.f30203gxszxtbevo = d18;
        this.f30205lqeggnwhkg = i13;
        this.f30206nufgyqmvbu = d19;
        this.f30201dxjokdxxww = d23;
    }

    public final double dxjokdxxww() {
        return this.f30202eablkybsjg;
    }

    public final double eablkybsjg() {
        return this.f30209zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return Double.compare(this.f30204iobyxmoadg, ppxfxbqfkfVar.f30204iobyxmoadg) == 0 && Double.compare(this.f30209zoijcleaow, ppxfxbqfkfVar.f30209zoijcleaow) == 0 && Double.compare(this.f30207ppxfxbqfkf, ppxfxbqfkfVar.f30207ppxfxbqfkf) == 0 && Double.compare(this.f30208wkgbmnqykc, ppxfxbqfkfVar.f30208wkgbmnqykc) == 0 && Double.compare(this.f30202eablkybsjg, ppxfxbqfkfVar.f30202eablkybsjg) == 0 && Double.compare(this.f30203gxszxtbevo, ppxfxbqfkfVar.f30203gxszxtbevo) == 0 && this.f30205lqeggnwhkg == ppxfxbqfkfVar.f30205lqeggnwhkg && Double.compare(this.f30206nufgyqmvbu, ppxfxbqfkfVar.f30206nufgyqmvbu) == 0 && Double.compare(this.f30201dxjokdxxww, ppxfxbqfkfVar.f30201dxjokdxxww) == 0;
    }

    public final double gxszxtbevo() {
        return this.f30206nufgyqmvbu;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.f30204iobyxmoadg) * 31) + Double.hashCode(this.f30209zoijcleaow)) * 31) + Double.hashCode(this.f30207ppxfxbqfkf)) * 31) + Double.hashCode(this.f30208wkgbmnqykc)) * 31) + Double.hashCode(this.f30202eablkybsjg)) * 31) + Double.hashCode(this.f30203gxszxtbevo)) * 31) + Integer.hashCode(this.f30205lqeggnwhkg)) * 31) + Double.hashCode(this.f30206nufgyqmvbu)) * 31) + Double.hashCode(this.f30201dxjokdxxww);
    }

    public final double iobyxmoadg() {
        return this.f30204iobyxmoadg;
    }

    public final double lqeggnwhkg() {
        return this.f30208wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f30203gxszxtbevo;
    }

    public final double ppxfxbqfkf() {
        return this.f30207ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditCartSum(basket=" + this.f30204iobyxmoadg + ", discount=" + this.f30209zoijcleaow + ", delivery=" + this.f30207ppxfxbqfkf + ", overweight=" + this.f30208wkgbmnqykc + ", weight=" + this.f30202eablkybsjg + ", total=" + this.f30203gxszxtbevo + ", count=" + this.f30205lqeggnwhkg + ", oldTotal=" + this.f30206nufgyqmvbu + ", diffTotal=" + this.f30201dxjokdxxww + ")";
    }

    public final double wkgbmnqykc() {
        return this.f30201dxjokdxxww;
    }

    public final int zoijcleaow() {
        return this.f30205lqeggnwhkg;
    }

    public /* synthetic */ ppxfxbqfkf(double d13, double d14, double d15, double d16, double d17, double d18, int i13, double d19, double d23, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0.0d : d13, (i14 & 2) != 0 ? 0.0d : d14, (i14 & 4) != 0 ? 0.0d : d15, (i14 & 8) != 0 ? 0.0d : d16, (i14 & 16) != 0 ? 0.0d : d17, (i14 & 32) != 0 ? 0.0d : d18, (i14 & 64) != 0 ? 0 : i13, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0d : d19, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 0.0d : d23);
    }
}
