package ml1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f67450eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f67451gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f67452iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f67453lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f67454nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f67455ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f67456wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f67457zoijcleaow;

    public btonecajqb(String phone, String userName, String reason, String str, boolean z13, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(userName, "userName");
        zdlpuopuiu.btonecajqb(reason, "reason");
        this.f67452iobyxmoadg = phone;
        this.f67457zoijcleaow = userName;
        this.f67455ppxfxbqfkf = reason;
        this.f67456wkgbmnqykc = str;
        this.f67450eablkybsjg = z13;
        this.f67451gxszxtbevo = z14;
        this.f67453lqeggnwhkg = z15;
        this.f67454nufgyqmvbu = z16;
    }

    public final String eablkybsjg() {
        return this.f67455ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f67452iobyxmoadg, btonecajqbVar.f67452iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f67457zoijcleaow, btonecajqbVar.f67457zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f67455ppxfxbqfkf, btonecajqbVar.f67455ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f67456wkgbmnqykc, btonecajqbVar.f67456wkgbmnqykc) && this.f67450eablkybsjg == btonecajqbVar.f67450eablkybsjg && this.f67451gxszxtbevo == btonecajqbVar.f67451gxszxtbevo && this.f67453lqeggnwhkg == btonecajqbVar.f67453lqeggnwhkg && this.f67454nufgyqmvbu == btonecajqbVar.f67454nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f67454nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f67452iobyxmoadg.hashCode() * 31) + this.f67457zoijcleaow.hashCode()) * 31) + this.f67455ppxfxbqfkf.hashCode()) * 31;
        String str = this.f67456wkgbmnqykc;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f67450eablkybsjg)) * 31) + Boolean.hashCode(this.f67451gxszxtbevo)) * 31) + Boolean.hashCode(this.f67453lqeggnwhkg)) * 31) + Boolean.hashCode(this.f67454nufgyqmvbu);
    }

    public final boolean iobyxmoadg() {
        return this.f67450eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f67453lqeggnwhkg;
    }

    public String toString() {
        return "Model(phone=" + this.f67452iobyxmoadg + ", userName=" + this.f67457zoijcleaow + ", reason=" + this.f67455ppxfxbqfkf + ", fileName=" + this.f67456wkgbmnqykc + ", emptyReasonError=" + this.f67450eablkybsjg + ", phoneError=" + this.f67451gxszxtbevo + ", noAuthFormIsVisible=" + this.f67453lqeggnwhkg + ", isLoading=" + this.f67454nufgyqmvbu + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f67451gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f67456wkgbmnqykc;
    }
}
