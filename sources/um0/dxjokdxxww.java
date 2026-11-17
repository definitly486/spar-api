package um0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f113945eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113946iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f113947ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f113948wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f113949zoijcleaow;

    public dxjokdxxww(String title, String subtitle, String subtitleText, String text, String str) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f113946iobyxmoadg = title;
        this.f113949zoijcleaow = subtitle;
        this.f113947ppxfxbqfkf = subtitleText;
        this.f113948wkgbmnqykc = text;
        this.f113945eablkybsjg = str;
    }

    public final String eablkybsjg() {
        return this.f113946iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f113946iobyxmoadg, dxjokdxxwwVar.f113946iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f113949zoijcleaow, dxjokdxxwwVar.f113949zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f113947ppxfxbqfkf, dxjokdxxwwVar.f113947ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f113948wkgbmnqykc, dxjokdxxwwVar.f113948wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f113945eablkybsjg, dxjokdxxwwVar.f113945eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f113946iobyxmoadg.hashCode() * 31) + this.f113949zoijcleaow.hashCode()) * 31) + this.f113947ppxfxbqfkf.hashCode()) * 31) + this.f113948wkgbmnqykc.hashCode()) * 31;
        String str = this.f113945eablkybsjg;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f113945eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f113947ppxfxbqfkf;
    }

    public String toString() {
        return "Model(title=" + this.f113946iobyxmoadg + ", subtitle=" + this.f113949zoijcleaow + ", subtitleText=" + this.f113947ppxfxbqfkf + ", text=" + this.f113948wkgbmnqykc + ", promoCode=" + this.f113945eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f113948wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f113949zoijcleaow;
    }
}
