package ha2;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f39987iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f39988ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f39989wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f39990zoijcleaow;

    public wkgbmnqykc(String email, String name, String lastName, String gender) {
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(gender, "gender");
        this.f39987iobyxmoadg = email;
        this.f39990zoijcleaow = name;
        this.f39988ppxfxbqfkf = lastName;
        this.f39989wkgbmnqykc = gender;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f39987iobyxmoadg, wkgbmnqykcVar.f39987iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39990zoijcleaow, wkgbmnqykcVar.f39990zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39988ppxfxbqfkf, wkgbmnqykcVar.f39988ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39989wkgbmnqykc, wkgbmnqykcVar.f39989wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f39987iobyxmoadg.hashCode() * 31) + this.f39990zoijcleaow.hashCode()) * 31) + this.f39988ppxfxbqfkf.hashCode()) * 31) + this.f39989wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f39987iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f39988ppxfxbqfkf;
    }

    public String toString() {
        return "UserInfoParams(email=" + this.f39987iobyxmoadg + ", name=" + this.f39990zoijcleaow + ", lastName=" + this.f39988ppxfxbqfkf + ", gender=" + this.f39989wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f39990zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f39989wkgbmnqykc;
    }
}
