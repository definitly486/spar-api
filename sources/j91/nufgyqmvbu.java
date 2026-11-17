package j91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f50908eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f50909iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f50910ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f50911wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f50912zoijcleaow;

    public nufgyqmvbu(String title, String subtitle, String text, String str, String image) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(image, "image");
        this.f50909iobyxmoadg = title;
        this.f50912zoijcleaow = subtitle;
        this.f50910ppxfxbqfkf = text;
        this.f50911wkgbmnqykc = str;
        this.f50908eablkybsjg = image;
    }

    public final String eablkybsjg() {
        return this.f50909iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f50909iobyxmoadg, nufgyqmvbuVar.f50909iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50912zoijcleaow, nufgyqmvbuVar.f50912zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f50910ppxfxbqfkf, nufgyqmvbuVar.f50910ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f50911wkgbmnqykc, nufgyqmvbuVar.f50911wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f50908eablkybsjg, nufgyqmvbuVar.f50908eablkybsjg);
    }

    public int hashCode() {
        int iHashCode = ((((this.f50909iobyxmoadg.hashCode() * 31) + this.f50912zoijcleaow.hashCode()) * 31) + this.f50910ppxfxbqfkf.hashCode()) * 31;
        String str = this.f50911wkgbmnqykc;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f50908eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50911wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f50912zoijcleaow;
    }

    public String toString() {
        return "Model(title=" + this.f50909iobyxmoadg + ", subtitle=" + this.f50912zoijcleaow + ", text=" + this.f50910ppxfxbqfkf + ", buttonText=" + this.f50911wkgbmnqykc + ", image=" + this.f50908eablkybsjg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f50910ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f50908eablkybsjg;
    }
}
