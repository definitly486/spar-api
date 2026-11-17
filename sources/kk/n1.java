package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements i10 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final String f57704eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f57705iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f57706ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f57707wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f57708zoijcleaow;

    public n1(String header, String text, String deeplink, String iconUrl, String type) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(header, "header");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(text, "text");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deeplink, "deeplink");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        this.f57705iobyxmoadg = header;
        this.f57708zoijcleaow = text;
        this.f57706ppxfxbqfkf = deeplink;
        this.f57707wkgbmnqykc = iconUrl;
        this.f57704eablkybsjg = type;
    }

    @Override // kk.i10
    public final String a() {
        return this.f57706ppxfxbqfkf;
    }

    @Override // kk.i10
    public final String b() {
        return this.f57704eablkybsjg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57705iobyxmoadg, n1Var.f57705iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57708zoijcleaow, n1Var.f57708zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57706ppxfxbqfkf, n1Var.f57706ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57707wkgbmnqykc, n1Var.f57707wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57704eablkybsjg, n1Var.f57704eablkybsjg);
    }

    public final int hashCode() {
        return this.f57704eablkybsjg.hashCode() + xg.iobyxmoadg(this.f57707wkgbmnqykc, xg.iobyxmoadg(this.f57706ppxfxbqfkf, xg.iobyxmoadg(this.f57708zoijcleaow, this.f57705iobyxmoadg.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "SingleHelperBannerItem(header=" + this.f57705iobyxmoadg + ", text=" + this.f57708zoijcleaow + ", deeplink=" + this.f57706ppxfxbqfkf + ", iconUrl=" + this.f57707wkgbmnqykc + ", type=" + this.f57704eablkybsjg + ")";
    }
}
