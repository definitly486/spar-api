package ia1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f42251eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f42252gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f42253iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f42254lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f42255nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f42256ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f42257wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f42258zoijcleaow;

    public lqeggnwhkg(String firstName, boolean z13, String lastName, boolean z14, String phone, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.f42253iobyxmoadg = firstName;
        this.f42258zoijcleaow = z13;
        this.f42256ppxfxbqfkf = lastName;
        this.f42257wkgbmnqykc = z14;
        this.f42251eablkybsjg = phone;
        this.f42252gxszxtbevo = z15;
        this.f42254lqeggnwhkg = z16;
        this.f42255nufgyqmvbu = z17;
    }

    public final String eablkybsjg() {
        return this.f42251eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f42253iobyxmoadg, lqeggnwhkgVar.f42253iobyxmoadg) && this.f42258zoijcleaow == lqeggnwhkgVar.f42258zoijcleaow && zdlpuopuiu.eablkybsjg(this.f42256ppxfxbqfkf, lqeggnwhkgVar.f42256ppxfxbqfkf) && this.f42257wkgbmnqykc == lqeggnwhkgVar.f42257wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f42251eablkybsjg, lqeggnwhkgVar.f42251eablkybsjg) && this.f42252gxszxtbevo == lqeggnwhkgVar.f42252gxszxtbevo && this.f42254lqeggnwhkg == lqeggnwhkgVar.f42254lqeggnwhkg && this.f42255nufgyqmvbu == lqeggnwhkgVar.f42255nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f42252gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((((((this.f42253iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f42258zoijcleaow)) * 31) + this.f42256ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f42257wkgbmnqykc)) * 31) + this.f42251eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f42252gxszxtbevo)) * 31) + Boolean.hashCode(this.f42254lqeggnwhkg)) * 31) + Boolean.hashCode(this.f42255nufgyqmvbu);
    }

    public final String iobyxmoadg() {
        return this.f42253iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f42254lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f42256ppxfxbqfkf;
    }

    public String toString() {
        return "Model(firstName=" + this.f42253iobyxmoadg + ", firstNameError=" + this.f42258zoijcleaow + ", lastName=" + this.f42256ppxfxbqfkf + ", lastNameError=" + this.f42257wkgbmnqykc + ", phone=" + this.f42251eablkybsjg + ", phoneError=" + this.f42252gxszxtbevo + ", saveIsVisible=" + this.f42254lqeggnwhkg + ", isLoading=" + this.f42255nufgyqmvbu + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f42257wkgbmnqykc;
    }

    public final boolean zoijcleaow() {
        return this.f42258zoijcleaow;
    }
}
