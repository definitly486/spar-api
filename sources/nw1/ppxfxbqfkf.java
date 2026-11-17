package nw1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f71300iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f71301ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lr0.zoijcleaow f71302wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f71303zoijcleaow;

    public ppxfxbqfkf(String name, String str, String email, lr0.zoijcleaow gender) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(gender, "gender");
        this.f71300iobyxmoadg = name;
        this.f71303zoijcleaow = str;
        this.f71301ppxfxbqfkf = email;
        this.f71302wkgbmnqykc = gender;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f71300iobyxmoadg, ppxfxbqfkfVar.f71300iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71303zoijcleaow, ppxfxbqfkfVar.f71303zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f71301ppxfxbqfkf, ppxfxbqfkfVar.f71301ppxfxbqfkf) && this.f71302wkgbmnqykc == ppxfxbqfkfVar.f71302wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = this.f71300iobyxmoadg.hashCode() * 31;
        String str = this.f71303zoijcleaow;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f71301ppxfxbqfkf.hashCode()) * 31) + this.f71302wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f71301ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f71303zoijcleaow;
    }

    public String toString() {
        return "UserEditPersonalData(name=" + this.f71300iobyxmoadg + ", lastName=" + this.f71303zoijcleaow + ", email=" + this.f71301ppxfxbqfkf + ", gender=" + this.f71302wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f71300iobyxmoadg;
    }

    public final lr0.zoijcleaow zoijcleaow() {
        return this.f71302wkgbmnqykc;
    }
}
