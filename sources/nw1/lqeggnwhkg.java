package nw1;

import java.time.LocalDate;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final LocalDate f71291eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final lr0.zoijcleaow f71292gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f71293iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final String f71294lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f71295ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f71296wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f71297zoijcleaow;

    public lqeggnwhkg(boolean z13, boolean z14, String firstName, String str, LocalDate dateOfBirth, lr0.zoijcleaow gender, String email) {
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(dateOfBirth, "dateOfBirth");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(email, "email");
        this.f71293iobyxmoadg = z13;
        this.f71297zoijcleaow = z14;
        this.f71295ppxfxbqfkf = firstName;
        this.f71296wkgbmnqykc = str;
        this.f71291eablkybsjg = dateOfBirth;
        this.f71292gxszxtbevo = gender;
        this.f71294lqeggnwhkg = email;
    }

    public final String eablkybsjg() {
        return this.f71296wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f71293iobyxmoadg == lqeggnwhkgVar.f71293iobyxmoadg && this.f71297zoijcleaow == lqeggnwhkgVar.f71297zoijcleaow && zdlpuopuiu.eablkybsjg(this.f71295ppxfxbqfkf, lqeggnwhkgVar.f71295ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f71296wkgbmnqykc, lqeggnwhkgVar.f71296wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f71291eablkybsjg, lqeggnwhkgVar.f71291eablkybsjg) && this.f71292gxszxtbevo == lqeggnwhkgVar.f71292gxszxtbevo && zdlpuopuiu.eablkybsjg(this.f71294lqeggnwhkg, lqeggnwhkgVar.f71294lqeggnwhkg);
    }

    public final boolean gxszxtbevo() {
        return this.f71297zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f71293iobyxmoadg) * 31) + Boolean.hashCode(this.f71297zoijcleaow)) * 31) + this.f71295ppxfxbqfkf.hashCode()) * 31;
        String str = this.f71296wkgbmnqykc;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f71291eablkybsjg.hashCode()) * 31) + this.f71292gxszxtbevo.hashCode()) * 31) + this.f71294lqeggnwhkg.hashCode();
    }

    public final LocalDate iobyxmoadg() {
        return this.f71291eablkybsjg;
    }

    public final boolean lqeggnwhkg() {
        return this.f71293iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f71295ppxfxbqfkf;
    }

    public String toString() {
        return "UserRegistrationData(isPDPAccepted=" + this.f71293iobyxmoadg + ", isOfferAccepted=" + this.f71297zoijcleaow + ", firstName=" + this.f71295ppxfxbqfkf + ", lastName=" + this.f71296wkgbmnqykc + ", dateOfBirth=" + this.f71291eablkybsjg + ", gender=" + this.f71292gxszxtbevo + ", email=" + this.f71294lqeggnwhkg + ")";
    }

    public final lr0.zoijcleaow wkgbmnqykc() {
        return this.f71292gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f71294lqeggnwhkg;
    }
}
