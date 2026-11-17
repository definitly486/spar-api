package l91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61980iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f61981ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f61982wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f61983zoijcleaow;

    public zoijcleaow(String title, String subtitle, String subtitleText, String text) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        this.f61980iobyxmoadg = title;
        this.f61983zoijcleaow = subtitle;
        this.f61981ppxfxbqfkf = subtitleText;
        this.f61982wkgbmnqykc = text;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f61980iobyxmoadg, zoijcleaowVar.f61980iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61983zoijcleaow, zoijcleaowVar.f61983zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f61981ppxfxbqfkf, zoijcleaowVar.f61981ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61982wkgbmnqykc, zoijcleaowVar.f61982wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f61980iobyxmoadg.hashCode() * 31) + this.f61983zoijcleaow.hashCode()) * 31) + this.f61981ppxfxbqfkf.hashCode()) * 31) + this.f61982wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f61983zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f61982wkgbmnqykc;
    }

    public String toString() {
        return "PopupTitlesUiModel(title=" + this.f61980iobyxmoadg + ", subtitle=" + this.f61983zoijcleaow + ", subtitleText=" + this.f61981ppxfxbqfkf + ", text=" + this.f61982wkgbmnqykc + ")";
    }

    public final String wkgbmnqykc() {
        return this.f61980iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f61981ppxfxbqfkf;
    }
}
