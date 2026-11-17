package sp;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final t10.ppxfxbqfkf f107794eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f107795iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f107796ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f107797wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f107798zoijcleaow;

    public dxjokdxxww(String phoneNumber, String email, boolean z13, boolean z14, t10.ppxfxbqfkf emailError) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(emailError, "emailError");
        this.f107795iobyxmoadg = phoneNumber;
        this.f107798zoijcleaow = email;
        this.f107796ppxfxbqfkf = z13;
        this.f107797wkgbmnqykc = z14;
        this.f107794eablkybsjg = emailError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f107795iobyxmoadg, dxjokdxxwwVar.f107795iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f107798zoijcleaow, dxjokdxxwwVar.f107798zoijcleaow) && this.f107796ppxfxbqfkf == dxjokdxxwwVar.f107796ppxfxbqfkf && this.f107797wkgbmnqykc == dxjokdxxwwVar.f107797wkgbmnqykc && this.f107794eablkybsjg == dxjokdxxwwVar.f107794eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f107795iobyxmoadg.hashCode() * 31) + this.f107798zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f107796ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f107797wkgbmnqykc)) * 31) + this.f107794eablkybsjg.hashCode();
    }

    public final t10.ppxfxbqfkf iobyxmoadg() {
        return this.f107794eablkybsjg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f107797wkgbmnqykc;
    }

    public String toString() {
        return "Model(phoneNumber=" + this.f107795iobyxmoadg + ", email=" + this.f107798zoijcleaow + ", isLoading=" + this.f107796ppxfxbqfkf + ", phoneNumberErrorIsVisible=" + this.f107797wkgbmnqykc + ", emailError=" + this.f107794eablkybsjg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f107796ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f107795iobyxmoadg;
    }

    public /* synthetic */ dxjokdxxww(String str, String str2, boolean z13, boolean z14, t10.ppxfxbqfkf ppxfxbqfkfVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) == 0 ? str2 : "", (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? t10.ppxfxbqfkf.NONE : ppxfxbqfkfVar);
    }
}
