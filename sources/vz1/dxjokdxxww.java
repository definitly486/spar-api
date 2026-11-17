package vz1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f118216eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f118217gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f118218iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f118219lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f118220nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f118221ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f118222wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f118223zoijcleaow;

    public dxjokdxxww(String phone, String userName, String reason, String str, boolean z13, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(userName, "userName");
        zdlpuopuiu.btonecajqb(reason, "reason");
        this.f118218iobyxmoadg = phone;
        this.f118223zoijcleaow = userName;
        this.f118221ppxfxbqfkf = reason;
        this.f118222wkgbmnqykc = str;
        this.f118216eablkybsjg = z13;
        this.f118217gxszxtbevo = z14;
        this.f118219lqeggnwhkg = z15;
        this.f118220nufgyqmvbu = z16;
    }

    public final String eablkybsjg() {
        return this.f118221ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f118218iobyxmoadg, dxjokdxxwwVar.f118218iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f118223zoijcleaow, dxjokdxxwwVar.f118223zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f118221ppxfxbqfkf, dxjokdxxwwVar.f118221ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f118222wkgbmnqykc, dxjokdxxwwVar.f118222wkgbmnqykc) && this.f118216eablkybsjg == dxjokdxxwwVar.f118216eablkybsjg && this.f118217gxszxtbevo == dxjokdxxwwVar.f118217gxszxtbevo && this.f118219lqeggnwhkg == dxjokdxxwwVar.f118219lqeggnwhkg && this.f118220nufgyqmvbu == dxjokdxxwwVar.f118220nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f118220nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = ((((this.f118218iobyxmoadg.hashCode() * 31) + this.f118223zoijcleaow.hashCode()) * 31) + this.f118221ppxfxbqfkf.hashCode()) * 31;
        String str = this.f118222wkgbmnqykc;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f118216eablkybsjg)) * 31) + Boolean.hashCode(this.f118217gxszxtbevo)) * 31) + Boolean.hashCode(this.f118219lqeggnwhkg)) * 31) + Boolean.hashCode(this.f118220nufgyqmvbu);
    }

    public final boolean iobyxmoadg() {
        return this.f118216eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f118219lqeggnwhkg;
    }

    public String toString() {
        return "Model(phone=" + this.f118218iobyxmoadg + ", userName=" + this.f118223zoijcleaow + ", reason=" + this.f118221ppxfxbqfkf + ", fileName=" + this.f118222wkgbmnqykc + ", emptyReasonError=" + this.f118216eablkybsjg + ", phoneError=" + this.f118217gxszxtbevo + ", noAuthFormIsVisible=" + this.f118219lqeggnwhkg + ", isLoading=" + this.f118220nufgyqmvbu + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f118217gxszxtbevo;
    }

    public final String zoijcleaow() {
        return this.f118222wkgbmnqykc;
    }
}
