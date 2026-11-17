package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class gn implements i10 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final String f56722eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f56723iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f56724ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f56725wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f56726zoijcleaow;

    public gn(String header, String text, String deeplink, String iconUrl, String type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(header, "header");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deeplink, "deeplink");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        this.f56723iobyxmoadg = header;
        this.f56726zoijcleaow = text;
        this.f56724ppxfxbqfkf = deeplink;
        this.f56725wkgbmnqykc = iconUrl;
        this.f56722eablkybsjg = type;
    }

    @Override // kk.i10
    public final String a() {
        return this.f56724ppxfxbqfkf;
    }

    @Override // kk.i10
    public final String b() {
        return this.f56722eablkybsjg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56723iobyxmoadg, gnVar.f56723iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56726zoijcleaow, gnVar.f56726zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56724ppxfxbqfkf, gnVar.f56724ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56725wkgbmnqykc, gnVar.f56725wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56722eablkybsjg, gnVar.f56722eablkybsjg);
    }

    public final int hashCode() {
        return this.f56722eablkybsjg.hashCode() + xg.iobyxmoadg(this.f56725wkgbmnqykc, xg.iobyxmoadg(this.f56724ppxfxbqfkf, xg.iobyxmoadg(this.f56726zoijcleaow, this.f56723iobyxmoadg.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "MajorHelperBannerItem(header=" + this.f56723iobyxmoadg + ", text=" + this.f56726zoijcleaow + ", deeplink=" + this.f56724ppxfxbqfkf + ", iconUrl=" + this.f56725wkgbmnqykc + ", type=" + this.f56722eablkybsjg + ")";
    }
}
