package dq0;

import k21.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f29316eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f29317iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f29318ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ojitshcjhn f29319wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f29320zoijcleaow;

    public iobyxmoadg(String id2, String title, String image, ojitshcjhn navlink, String reference) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(image, "image");
        zdlpuopuiu.btonecajqb(navlink, "navlink");
        zdlpuopuiu.btonecajqb(reference, "reference");
        this.f29317iobyxmoadg = id2;
        this.f29320zoijcleaow = title;
        this.f29318ppxfxbqfkf = image;
        this.f29319wkgbmnqykc = navlink;
        this.f29316eablkybsjg = reference;
    }

    public final String eablkybsjg() {
        return this.f29320zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f29317iobyxmoadg, iobyxmoadgVar.f29317iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f29320zoijcleaow, iobyxmoadgVar.f29320zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f29318ppxfxbqfkf, iobyxmoadgVar.f29318ppxfxbqfkf) && this.f29319wkgbmnqykc == iobyxmoadgVar.f29319wkgbmnqykc && zdlpuopuiu.eablkybsjg(this.f29316eablkybsjg, iobyxmoadgVar.f29316eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f29317iobyxmoadg.hashCode() * 31) + this.f29320zoijcleaow.hashCode()) * 31) + this.f29318ppxfxbqfkf.hashCode()) * 31) + this.f29319wkgbmnqykc.hashCode()) * 31) + this.f29316eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f29317iobyxmoadg;
    }

    public final ojitshcjhn ppxfxbqfkf() {
        return this.f29319wkgbmnqykc;
    }

    public String toString() {
        return "SearchFeatureUiModel(id=" + this.f29317iobyxmoadg + ", title=" + this.f29320zoijcleaow + ", image=" + this.f29318ppxfxbqfkf + ", navlink=" + this.f29319wkgbmnqykc + ", reference=" + this.f29316eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f29316eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f29318ppxfxbqfkf;
    }
}
