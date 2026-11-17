package ko;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f59910eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f59911iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f59912ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f59913wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f59914zoijcleaow;

    public dxjokdxxww(String title, String subtitle, String subtitleText, String text, String str) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f59911iobyxmoadg = title;
        this.f59914zoijcleaow = subtitle;
        this.f59912ppxfxbqfkf = subtitleText;
        this.f59913wkgbmnqykc = text;
        this.f59910eablkybsjg = str;
    }

    public final String eablkybsjg() {
        return this.f59911iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f59911iobyxmoadg, dxjokdxxwwVar.f59911iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f59914zoijcleaow, dxjokdxxwwVar.f59914zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f59912ppxfxbqfkf, dxjokdxxwwVar.f59912ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f59913wkgbmnqykc, dxjokdxxwwVar.f59913wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f59910eablkybsjg, dxjokdxxwwVar.f59910eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f59911iobyxmoadg.hashCode() * 31) + this.f59914zoijcleaow.hashCode()) * 31) + this.f59912ppxfxbqfkf.hashCode()) * 31) + this.f59913wkgbmnqykc.hashCode()) * 31;
        String str = this.f59910eablkybsjg;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f59910eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f59912ppxfxbqfkf;
    }

    public String toString() {
        return "Model(title=" + this.f59911iobyxmoadg + ", subtitle=" + this.f59914zoijcleaow + ", subtitleText=" + this.f59912ppxfxbqfkf + ", text=" + this.f59913wkgbmnqykc + ", promoCode=" + this.f59910eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f59913wkgbmnqykc;
    }

    public final String zoijcleaow() {
        return this.f59914zoijcleaow;
    }
}
