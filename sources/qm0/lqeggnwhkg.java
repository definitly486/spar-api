package qm0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f79180eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f79181gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f79182iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final sm0.iobyxmoadg f79183lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f79184nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f79185ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f79186wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f79187zoijcleaow;

    public lqeggnwhkg(boolean z13, String title, String subtitle, String subtitleText, String text, String str, sm0.iobyxmoadg productDay, boolean z14) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(productDay, "productDay");
        this.f79182iobyxmoadg = z13;
        this.f79187zoijcleaow = title;
        this.f79185ppxfxbqfkf = subtitle;
        this.f79186wkgbmnqykc = subtitleText;
        this.f79180eablkybsjg = text;
        this.f79181gxszxtbevo = str;
        this.f79183lqeggnwhkg = productDay;
        this.f79184nufgyqmvbu = z14;
    }

    public final String eablkybsjg() {
        return this.f79180eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f79182iobyxmoadg == lqeggnwhkgVar.f79182iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f79187zoijcleaow, lqeggnwhkgVar.f79187zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f79185ppxfxbqfkf, lqeggnwhkgVar.f79185ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f79186wkgbmnqykc, lqeggnwhkgVar.f79186wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f79180eablkybsjg, lqeggnwhkgVar.f79180eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f79181gxszxtbevo, lqeggnwhkgVar.f79181gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f79183lqeggnwhkg, lqeggnwhkgVar.f79183lqeggnwhkg) && this.f79184nufgyqmvbu == lqeggnwhkgVar.f79184nufgyqmvbu;
    }

    public final String gxszxtbevo() {
        return this.f79187zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.f79182iobyxmoadg) * 31) + this.f79187zoijcleaow.hashCode()) * 31) + this.f79185ppxfxbqfkf.hashCode()) * 31) + this.f79186wkgbmnqykc.hashCode()) * 31) + this.f79180eablkybsjg.hashCode()) * 31;
        String str = this.f79181gxszxtbevo;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f79183lqeggnwhkg.hashCode()) * 31) + Boolean.hashCode(this.f79184nufgyqmvbu);
    }

    public final String iobyxmoadg() {
        return this.f79181gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f79184nufgyqmvbu;
    }

    public final String ppxfxbqfkf() {
        return this.f79185ppxfxbqfkf;
    }

    public String toString() {
        return "Model(isLoading=" + this.f79182iobyxmoadg + ", title=" + this.f79187zoijcleaow + ", subtitle=" + this.f79185ppxfxbqfkf + ", subtitleText=" + this.f79186wkgbmnqykc + ", text=" + this.f79180eablkybsjg + ", buttonText=" + this.f79181gxszxtbevo + ", productDay=" + this.f79183lqeggnwhkg + ", isCorrectData=" + this.f79184nufgyqmvbu + ")";
    }

    public final String wkgbmnqykc() {
        return this.f79186wkgbmnqykc;
    }

    public final sm0.iobyxmoadg zoijcleaow() {
        return this.f79183lqeggnwhkg;
    }
}
