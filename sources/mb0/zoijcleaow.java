package mb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f66752iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f66753ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f66754wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f66755zoijcleaow;

    public zoijcleaow(String title, String subtitle, String subtitleText, String text) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f66752iobyxmoadg = title;
        this.f66755zoijcleaow = subtitle;
        this.f66753ppxfxbqfkf = subtitleText;
        this.f66754wkgbmnqykc = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f66752iobyxmoadg, zoijcleaowVar.f66752iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f66755zoijcleaow, zoijcleaowVar.f66755zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f66753ppxfxbqfkf, zoijcleaowVar.f66753ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f66754wkgbmnqykc, zoijcleaowVar.f66754wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f66752iobyxmoadg.hashCode() * 31) + this.f66755zoijcleaow.hashCode()) * 31) + this.f66753ppxfxbqfkf.hashCode()) * 31) + this.f66754wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f66755zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f66754wkgbmnqykc;
    }

    public String toString() {
        return "PopupTitlesUiModel(title=" + this.f66752iobyxmoadg + ", subtitle=" + this.f66755zoijcleaow + ", subtitleText=" + this.f66753ppxfxbqfkf + ", text=" + this.f66754wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f66752iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f66753ppxfxbqfkf;
    }
}
