package kb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f54386eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f54387iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f54388ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f54389wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f54390zoijcleaow;

    public nufgyqmvbu(String title, String subtitle, String text, String str, String image) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(image, "image");
        this.f54387iobyxmoadg = title;
        this.f54390zoijcleaow = subtitle;
        this.f54388ppxfxbqfkf = text;
        this.f54389wkgbmnqykc = str;
        this.f54386eablkybsjg = image;
    }

    public final String eablkybsjg() {
        return this.f54387iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f54387iobyxmoadg, nufgyqmvbuVar.f54387iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f54390zoijcleaow, nufgyqmvbuVar.f54390zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f54388ppxfxbqfkf, nufgyqmvbuVar.f54388ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f54389wkgbmnqykc, nufgyqmvbuVar.f54389wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f54386eablkybsjg, nufgyqmvbuVar.f54386eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((this.f54387iobyxmoadg.hashCode() * 31) + this.f54390zoijcleaow.hashCode()) * 31) + this.f54388ppxfxbqfkf.hashCode()) * 31;
        String str = this.f54389wkgbmnqykc;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f54386eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f54389wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f54390zoijcleaow;
    }

    public String toString() {
        return "Model(title=" + this.f54387iobyxmoadg + ", subtitle=" + this.f54390zoijcleaow + ", text=" + this.f54388ppxfxbqfkf + ", buttonText=" + this.f54389wkgbmnqykc + ", image=" + this.f54386eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f54388ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f54386eablkybsjg;
    }
}
