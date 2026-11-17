package uz0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final double f114851dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final double f114852eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final double f114853gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final double f114854iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f114855lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final double f114856nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final double f114857ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final double f114858wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f114859zoijcleaow;

    public ppxfxbqfkf(double d13, double d14, double d15, double d16, double d17, double d18, int i13, double d19, double d23) {
        this.f114854iobyxmoadg = d13;
        this.f114859zoijcleaow = d14;
        this.f114857ppxfxbqfkf = d15;
        this.f114858wkgbmnqykc = d16;
        this.f114852eablkybsjg = d17;
        this.f114853gxszxtbevo = d18;
        this.f114855lqeggnwhkg = i13;
        this.f114856nufgyqmvbu = d19;
        this.f114851dxjokdxxww = d23;
    }

    public final double dxjokdxxww() {
        return this.f114852eablkybsjg;
    }

    public final double eablkybsjg() {
        return this.f114859zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return Double.compare(this.f114854iobyxmoadg, ppxfxbqfkfVar.f114854iobyxmoadg) == 0 && Double.compare(this.f114859zoijcleaow, ppxfxbqfkfVar.f114859zoijcleaow) == 0 && Double.compare(this.f114857ppxfxbqfkf, ppxfxbqfkfVar.f114857ppxfxbqfkf) == 0 && Double.compare(this.f114858wkgbmnqykc, ppxfxbqfkfVar.f114858wkgbmnqykc) == 0 && Double.compare(this.f114852eablkybsjg, ppxfxbqfkfVar.f114852eablkybsjg) == 0 && Double.compare(this.f114853gxszxtbevo, ppxfxbqfkfVar.f114853gxszxtbevo) == 0 && this.f114855lqeggnwhkg == ppxfxbqfkfVar.f114855lqeggnwhkg && Double.compare(this.f114856nufgyqmvbu, ppxfxbqfkfVar.f114856nufgyqmvbu) == 0 && Double.compare(this.f114851dxjokdxxww, ppxfxbqfkfVar.f114851dxjokdxxww) == 0;
    }

    public final double gxszxtbevo() {
        return this.f114856nufgyqmvbu;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.f114854iobyxmoadg) * 31) + Double.hashCode(this.f114859zoijcleaow)) * 31) + Double.hashCode(this.f114857ppxfxbqfkf)) * 31) + Double.hashCode(this.f114858wkgbmnqykc)) * 31) + Double.hashCode(this.f114852eablkybsjg)) * 31) + Double.hashCode(this.f114853gxszxtbevo)) * 31) + Integer.hashCode(this.f114855lqeggnwhkg)) * 31) + Double.hashCode(this.f114856nufgyqmvbu)) * 31) + Double.hashCode(this.f114851dxjokdxxww);
    }

    public final double iobyxmoadg() {
        return this.f114854iobyxmoadg;
    }

    public final double lqeggnwhkg() {
        return this.f114858wkgbmnqykc;
    }

    public final double nufgyqmvbu() {
        return this.f114853gxszxtbevo;
    }

    public final double ppxfxbqfkf() {
        return this.f114857ppxfxbqfkf;
    }

    public String toString() {
        return "OrderEditCartSum(basket=" + this.f114854iobyxmoadg + ", discount=" + this.f114859zoijcleaow + ", delivery=" + this.f114857ppxfxbqfkf + ", overweight=" + this.f114858wkgbmnqykc + ", weight=" + this.f114852eablkybsjg + ", total=" + this.f114853gxszxtbevo + ", count=" + this.f114855lqeggnwhkg + ", oldTotal=" + this.f114856nufgyqmvbu + ", diffTotal=" + this.f114851dxjokdxxww + ")";
    }

    public final double wkgbmnqykc() {
        return this.f114851dxjokdxxww;
    }

    public final int zoijcleaow() {
        return this.f114855lqeggnwhkg;
    }

    public /* synthetic */ ppxfxbqfkf(double d13, double d14, double d15, double d16, double d17, double d18, int i13, double d19, double d23, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0.0d : d13, (i14 & 2) != 0 ? 0.0d : d14, (i14 & 4) != 0 ? 0.0d : d15, (i14 & 8) != 0 ? 0.0d : d16, (i14 & 16) != 0 ? 0.0d : d17, (i14 & 32) != 0 ? 0.0d : d18, (i14 & 64) != 0 ? 0 : i13, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0.0d : d19, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 0.0d : d23);
    }
}
