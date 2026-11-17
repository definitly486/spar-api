package fo;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f34486eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f34487iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f34488ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f34489wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f34490zoijcleaow;

    public lqeggnwhkg(String title, String subtitle, String subtitleText, String text, String str) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f34487iobyxmoadg = title;
        this.f34490zoijcleaow = subtitle;
        this.f34488ppxfxbqfkf = subtitleText;
        this.f34489wkgbmnqykc = text;
        this.f34486eablkybsjg = str;
    }

    public final String eablkybsjg() {
        return this.f34487iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f34487iobyxmoadg, lqeggnwhkgVar.f34487iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f34490zoijcleaow, lqeggnwhkgVar.f34490zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f34488ppxfxbqfkf, lqeggnwhkgVar.f34488ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f34489wkgbmnqykc, lqeggnwhkgVar.f34489wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f34486eablkybsjg, lqeggnwhkgVar.f34486eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f34487iobyxmoadg.hashCode() * 31) + this.f34490zoijcleaow.hashCode()) * 31) + this.f34488ppxfxbqfkf.hashCode()) * 31) + this.f34489wkgbmnqykc.hashCode()) * 31;
        String str = this.f34486eablkybsjg;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f34486eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f34488ppxfxbqfkf;
    }

    public String toString() {
        return "Model(title=" + this.f34487iobyxmoadg + ", subtitle=" + this.f34490zoijcleaow + ", subtitleText=" + this.f34488ppxfxbqfkf + ", text=" + this.f34489wkgbmnqykc + ", buttonText=" + this.f34486eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f34489wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f34490zoijcleaow;
    }
}
