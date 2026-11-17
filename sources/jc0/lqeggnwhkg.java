package jc0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f51089eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f51090gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51091iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f51092lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f51093nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f51094ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f51095wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f51096zoijcleaow;

    public lqeggnwhkg(String firstName, boolean z13, String lastName, boolean z14, String phone, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.f51091iobyxmoadg = firstName;
        this.f51096zoijcleaow = z13;
        this.f51094ppxfxbqfkf = lastName;
        this.f51095wkgbmnqykc = z14;
        this.f51089eablkybsjg = phone;
        this.f51090gxszxtbevo = z15;
        this.f51092lqeggnwhkg = z16;
        this.f51093nufgyqmvbu = z17;
    }

    public final String eablkybsjg() {
        return this.f51089eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f51091iobyxmoadg, lqeggnwhkgVar.f51091iobyxmoadg) && this.f51096zoijcleaow == lqeggnwhkgVar.f51096zoijcleaow && zdlpuopuiu.eablkybsjg(this.f51094ppxfxbqfkf, lqeggnwhkgVar.f51094ppxfxbqfkf) && this.f51095wkgbmnqykc == lqeggnwhkgVar.f51095wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f51089eablkybsjg, lqeggnwhkgVar.f51089eablkybsjg) && this.f51090gxszxtbevo == lqeggnwhkgVar.f51090gxszxtbevo && this.f51092lqeggnwhkg == lqeggnwhkgVar.f51092lqeggnwhkg && this.f51093nufgyqmvbu == lqeggnwhkgVar.f51093nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f51090gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((((((this.f51091iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f51096zoijcleaow)) * 31) + this.f51094ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f51095wkgbmnqykc)) * 31) + this.f51089eablkybsjg.hashCode()) * 31) + Boolean.hashCode(this.f51090gxszxtbevo)) * 31) + Boolean.hashCode(this.f51092lqeggnwhkg)) * 31) + Boolean.hashCode(this.f51093nufgyqmvbu);
    }

    public final String iobyxmoadg() {
        return this.f51091iobyxmoadg;
    }

    public final boolean lqeggnwhkg() {
        return this.f51092lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f51094ppxfxbqfkf;
    }

    public String toString() {
        return "Model(firstName=" + this.f51091iobyxmoadg + ", firstNameError=" + this.f51096zoijcleaow + ", lastName=" + this.f51094ppxfxbqfkf + ", lastNameError=" + this.f51095wkgbmnqykc + ", phone=" + this.f51089eablkybsjg + ", phoneError=" + this.f51090gxszxtbevo + ", saveIsVisible=" + this.f51092lqeggnwhkg + ", isLoading=" + this.f51093nufgyqmvbu + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f51095wkgbmnqykc;
    }

    public final boolean zoijcleaow() {
        return this.f51096zoijcleaow;
    }
}
