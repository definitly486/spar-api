package cl1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f20013eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f20014iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f20015ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f20016wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f20017zoijcleaow;

    public iobyxmoadg(String phone, String str, String message, String str2, String str3) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(message, "message");
        this.f20014iobyxmoadg = phone;
        this.f20017zoijcleaow = str;
        this.f20015ppxfxbqfkf = message;
        this.f20016wkgbmnqykc = str2;
        this.f20013eablkybsjg = str3;
    }

    public final String eablkybsjg() {
        return this.f20017zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f20014iobyxmoadg, iobyxmoadgVar.f20014iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f20017zoijcleaow, iobyxmoadgVar.f20017zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f20015ppxfxbqfkf, iobyxmoadgVar.f20015ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f20016wkgbmnqykc, iobyxmoadgVar.f20016wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f20013eablkybsjg, iobyxmoadgVar.f20013eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = this.f20014iobyxmoadg.hashCode() * 31;
        String str = this.f20017zoijcleaow;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f20015ppxfxbqfkf.hashCode()) * 31;
        String str2 = this.f20016wkgbmnqykc;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20013eablkybsjg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f20013eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f20015ppxfxbqfkf;
    }

    public String toString() {
        return "Feedback(phone=" + this.f20014iobyxmoadg + ", userName=" + this.f20017zoijcleaow + ", message=" + this.f20015ppxfxbqfkf + ", filename=" + this.f20016wkgbmnqykc + ", file=" + this.f20013eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f20014iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f20016wkgbmnqykc;
    }
}
