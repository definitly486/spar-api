package lz1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f64599eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f64600iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f64601ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f64602wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f64603zoijcleaow;

    public iobyxmoadg(String phone, String str, String message, String str2, String str3) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(message, "message");
        this.f64600iobyxmoadg = phone;
        this.f64603zoijcleaow = str;
        this.f64601ppxfxbqfkf = message;
        this.f64602wkgbmnqykc = str2;
        this.f64599eablkybsjg = str3;
    }

    public final String eablkybsjg() {
        return this.f64603zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f64600iobyxmoadg, iobyxmoadgVar.f64600iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f64603zoijcleaow, iobyxmoadgVar.f64603zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f64601ppxfxbqfkf, iobyxmoadgVar.f64601ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f64602wkgbmnqykc, iobyxmoadgVar.f64602wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f64599eablkybsjg, iobyxmoadgVar.f64599eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = this.f64600iobyxmoadg.hashCode() * 31;
        String str = this.f64603zoijcleaow;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f64601ppxfxbqfkf.hashCode()) * 31;
        String str2 = this.f64602wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64599eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f64599eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f64601ppxfxbqfkf;
    }

    public String toString() {
        return "Feedback(phone=" + this.f64600iobyxmoadg + ", userName=" + this.f64603zoijcleaow + ", message=" + this.f64601ppxfxbqfkf + ", filename=" + this.f64602wkgbmnqykc + ", file=" + this.f64599eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f64600iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f64602wkgbmnqykc;
    }
}
