package kf0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f55365eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f55366iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f55367ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f55368wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f55369zoijcleaow;

    public lqeggnwhkg(String title, String subtitle, String imageUrl, String text, String buttonText) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        this.f55366iobyxmoadg = title;
        this.f55369zoijcleaow = subtitle;
        this.f55367ppxfxbqfkf = imageUrl;
        this.f55368wkgbmnqykc = text;
        this.f55365eablkybsjg = buttonText;
    }

    public final String eablkybsjg() {
        return this.f55366iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f55366iobyxmoadg, lqeggnwhkgVar.f55366iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f55369zoijcleaow, lqeggnwhkgVar.f55369zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f55367ppxfxbqfkf, lqeggnwhkgVar.f55367ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f55368wkgbmnqykc, lqeggnwhkgVar.f55368wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f55365eablkybsjg, lqeggnwhkgVar.f55365eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f55366iobyxmoadg.hashCode() * 31) + this.f55369zoijcleaow.hashCode()) * 31) + this.f55367ppxfxbqfkf.hashCode()) * 31) + this.f55368wkgbmnqykc.hashCode()) * 31) + this.f55365eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f55365eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f55369zoijcleaow;
    }

    public String toString() {
        return "Model(title=" + this.f55366iobyxmoadg + ", subtitle=" + this.f55369zoijcleaow + ", imageUrl=" + this.f55367ppxfxbqfkf + ", text=" + this.f55368wkgbmnqykc + ", buttonText=" + this.f55365eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f55368wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f55367ppxfxbqfkf;
    }
}
