package go;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f37985eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final io.iobyxmoadg f37986gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f37987iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f37988lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f37989ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f37990wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f37991zoijcleaow;

    public lqeggnwhkg(String title, String subtitle, String subtitleText, String text, String str, io.iobyxmoadg productDay, boolean z13) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(subtitle, "subtitle");
        zdlpuopuiu.btonecajqb(subtitleText, "subtitleText");
        zdlpuopuiu.btonecajqb(text, "text");
        zdlpuopuiu.btonecajqb(productDay, "productDay");
        this.f37987iobyxmoadg = title;
        this.f37991zoijcleaow = subtitle;
        this.f37989ppxfxbqfkf = subtitleText;
        this.f37990wkgbmnqykc = text;
        this.f37985eablkybsjg = str;
        this.f37986gxszxtbevo = productDay;
        this.f37988lqeggnwhkg = z13;
    }

    public final String eablkybsjg() {
        return this.f37990wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return zdlpuopuiu.eablkybsjg(this.f37987iobyxmoadg, lqeggnwhkgVar.f37987iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f37991zoijcleaow, lqeggnwhkgVar.f37991zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f37989ppxfxbqfkf, lqeggnwhkgVar.f37989ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f37990wkgbmnqykc, lqeggnwhkgVar.f37990wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f37985eablkybsjg, lqeggnwhkgVar.f37985eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f37986gxszxtbevo, lqeggnwhkgVar.f37986gxszxtbevo) && this.f37988lqeggnwhkg == lqeggnwhkgVar.f37988lqeggnwhkg;
    }

    public final String gxszxtbevo() {
        return this.f37987iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f37987iobyxmoadg.hashCode() * 31) + this.f37991zoijcleaow.hashCode()) * 31) + this.f37989ppxfxbqfkf.hashCode()) * 31) + this.f37990wkgbmnqykc.hashCode()) * 31;
        String str = this.f37985eablkybsjg;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f37986gxszxtbevo.hashCode()) * 31) + Boolean.hashCode(this.f37988lqeggnwhkg);
    }

    public final String iobyxmoadg() {
        return this.f37985eablkybsjg;
    }

    public final boolean lqeggnwhkg() {
        return this.f37988lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f37991zoijcleaow;
    }

    public String toString() {
        return "Model(title=" + this.f37987iobyxmoadg + ", subtitle=" + this.f37991zoijcleaow + ", subtitleText=" + this.f37989ppxfxbqfkf + ", text=" + this.f37990wkgbmnqykc + ", buttonText=" + this.f37985eablkybsjg + ", productDay=" + this.f37986gxszxtbevo + ", isCorrectData=" + this.f37988lqeggnwhkg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f37989ppxfxbqfkf;
    }

    public final io.iobyxmoadg zoijcleaow() {
        return this.f37986gxszxtbevo;
    }
}
