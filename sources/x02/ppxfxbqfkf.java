package x02;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f120906eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f120907iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f120908ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tzroggbefp f120909wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f120910zoijcleaow;

    public /* synthetic */ ppxfxbqfkf(String str, String str2, int i13, tzroggbefp tzroggbefpVar, boolean z13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, i13, tzroggbefpVar, z13);
    }

    public final boolean eablkybsjg() {
        return this.f120906eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f120907iobyxmoadg, ppxfxbqfkfVar.f120907iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f120910zoijcleaow, ppxfxbqfkfVar.f120910zoijcleaow) && this.f120908ppxfxbqfkf == ppxfxbqfkfVar.f120908ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f120909wkgbmnqykc, ppxfxbqfkfVar.f120909wkgbmnqykc) && this.f120906eablkybsjg == ppxfxbqfkfVar.f120906eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f120907iobyxmoadg.hashCode() * 31) + this.f120910zoijcleaow.hashCode()) * 31) + pmvmpeiblj.wkgbmnqykc(this.f120908ppxfxbqfkf)) * 31) + this.f120909wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f120906eablkybsjg);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f120909wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f120907iobyxmoadg;
    }

    public String toString() {
        return "RateProductUiModel(productName=" + this.f120907iobyxmoadg + ", imageUrl=" + this.f120910zoijcleaow + ", rating=" + pmvmpeiblj.eablkybsjg(this.f120908ppxfxbqfkf) + ", comment=" + this.f120909wkgbmnqykc + ", isEnabled=" + this.f120906eablkybsjg + ")";
    }

    public final int wkgbmnqykc() {
        return this.f120908ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f120910zoijcleaow;
    }

    private ppxfxbqfkf(String productName, String imageUrl, int i13, tzroggbefp comment, boolean z13) {
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.f120907iobyxmoadg = productName;
        this.f120910zoijcleaow = imageUrl;
        this.f120908ppxfxbqfkf = i13;
        this.f120909wkgbmnqykc = comment;
        this.f120906eablkybsjg = z13;
    }
}
