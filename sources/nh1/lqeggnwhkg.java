package nh1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f70081eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f70082iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f70083ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f70084wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f70085zoijcleaow;

    public lqeggnwhkg(String title, String subtitle, String imageUrl, String text, String buttonText) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(buttonText, "buttonText");
        this.f70082iobyxmoadg = title;
        this.f70085zoijcleaow = subtitle;
        this.f70083ppxfxbqfkf = imageUrl;
        this.f70084wkgbmnqykc = text;
        this.f70081eablkybsjg = buttonText;
    }

    public final String eablkybsjg() {
        return this.f70082iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f70082iobyxmoadg, lqeggnwhkgVar.f70082iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f70085zoijcleaow, lqeggnwhkgVar.f70085zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f70083ppxfxbqfkf, lqeggnwhkgVar.f70083ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f70084wkgbmnqykc, lqeggnwhkgVar.f70084wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f70081eablkybsjg, lqeggnwhkgVar.f70081eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f70082iobyxmoadg.hashCode() * 31) + this.f70085zoijcleaow.hashCode()) * 31) + this.f70083ppxfxbqfkf.hashCode()) * 31) + this.f70084wkgbmnqykc.hashCode()) * 31) + this.f70081eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f70081eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f70085zoijcleaow;
    }

    public String toString() {
        return "Model(title=" + this.f70082iobyxmoadg + ", subtitle=" + this.f70085zoijcleaow + ", imageUrl=" + this.f70083ppxfxbqfkf + ", text=" + this.f70084wkgbmnqykc + ", buttonText=" + this.f70081eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f70084wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f70083ppxfxbqfkf;
    }
}
