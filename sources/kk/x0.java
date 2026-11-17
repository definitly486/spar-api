package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements i10 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final String f59225eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f59226iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f59227ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f59228wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f59229zoijcleaow;

    public x0(String header, String text, String deeplink, String iconUrl, String type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(header, "header");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deeplink, "deeplink");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        this.f59226iobyxmoadg = header;
        this.f59229zoijcleaow = text;
        this.f59227ppxfxbqfkf = deeplink;
        this.f59228wkgbmnqykc = iconUrl;
        this.f59225eablkybsjg = type;
    }

    @Override // kk.i10
    public final String a() {
        return this.f59227ppxfxbqfkf;
    }

    @Override // kk.i10
    public final String b() {
        return this.f59225eablkybsjg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59226iobyxmoadg, x0Var.f59226iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59229zoijcleaow, x0Var.f59229zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59227ppxfxbqfkf, x0Var.f59227ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59228wkgbmnqykc, x0Var.f59228wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59225eablkybsjg, x0Var.f59225eablkybsjg);
    }

    public final int hashCode() {
        return this.f59225eablkybsjg.hashCode() + xg.iobyxmoadg(this.f59228wkgbmnqykc, xg.iobyxmoadg(this.f59227ppxfxbqfkf, xg.iobyxmoadg(this.f59229zoijcleaow, this.f59226iobyxmoadg.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "HelperBannerItem(header=" + this.f59226iobyxmoadg + ", text=" + this.f59229zoijcleaow + ", deeplink=" + this.f59227ppxfxbqfkf + ", iconUrl=" + this.f59228wkgbmnqykc + ", type=" + this.f59225eablkybsjg + ")";
    }
}
