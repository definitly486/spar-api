package q71;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78178iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f78179ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f78180wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f78181zoijcleaow;

    public gxszxtbevo(String email, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(email, "email");
        this.f78178iobyxmoadg = email;
        this.f78181zoijcleaow = z13;
        this.f78179ppxfxbqfkf = z14;
        this.f78180wkgbmnqykc = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f78178iobyxmoadg, gxszxtbevoVar.f78178iobyxmoadg) && this.f78181zoijcleaow == gxszxtbevoVar.f78181zoijcleaow && this.f78179ppxfxbqfkf == gxszxtbevoVar.f78179ppxfxbqfkf && this.f78180wkgbmnqykc == gxszxtbevoVar.f78180wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f78178iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f78181zoijcleaow)) * 31) + Boolean.hashCode(this.f78179ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f78180wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f78178iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f78179ppxfxbqfkf;
    }

    public String toString() {
        return "Model(email=" + this.f78178iobyxmoadg + ", isLoading=" + this.f78181zoijcleaow + ", isEmailEnabled=" + this.f78179ppxfxbqfkf + ", isCheckedButton=" + this.f78180wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f78181zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f78180wkgbmnqykc;
    }
}
