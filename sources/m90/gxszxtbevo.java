package m90;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66585iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f66586ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f66587wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f66588zoijcleaow;

    public gxszxtbevo(String email, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(email, "email");
        this.f66585iobyxmoadg = email;
        this.f66588zoijcleaow = z13;
        this.f66586ppxfxbqfkf = z14;
        this.f66587wkgbmnqykc = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f66585iobyxmoadg, gxszxtbevoVar.f66585iobyxmoadg) && this.f66588zoijcleaow == gxszxtbevoVar.f66588zoijcleaow && this.f66586ppxfxbqfkf == gxszxtbevoVar.f66586ppxfxbqfkf && this.f66587wkgbmnqykc == gxszxtbevoVar.f66587wkgbmnqykc;
    }

    public int hashCode() {
        return (((((this.f66585iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f66588zoijcleaow)) * 31) + Boolean.hashCode(this.f66586ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f66587wkgbmnqykc);
    }

    public final String iobyxmoadg() {
        return this.f66585iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f66586ppxfxbqfkf;
    }

    public String toString() {
        return "Model(email=" + this.f66585iobyxmoadg + ", isLoading=" + this.f66588zoijcleaow + ", isEmailEnabled=" + this.f66586ppxfxbqfkf + ", isCheckedButton=" + this.f66587wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f66588zoijcleaow;
    }

    public final boolean zoijcleaow() {
        return this.f66587wkgbmnqykc;
    }
}
