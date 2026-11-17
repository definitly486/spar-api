package om1;

import gg.pmvmpeiblj;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f73168eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f73169iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f73170ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tzroggbefp f73171wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f73172zoijcleaow;

    public /* synthetic */ ppxfxbqfkf(String str, String str2, int i13, tzroggbefp tzroggbefpVar, boolean z13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, i13, tzroggbefpVar, z13);
    }

    public final boolean eablkybsjg() {
        return this.f73168eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f73169iobyxmoadg, ppxfxbqfkfVar.f73169iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f73172zoijcleaow, ppxfxbqfkfVar.f73172zoijcleaow) && this.f73170ppxfxbqfkf == ppxfxbqfkfVar.f73170ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f73171wkgbmnqykc, ppxfxbqfkfVar.f73171wkgbmnqykc) && this.f73168eablkybsjg == ppxfxbqfkfVar.f73168eablkybsjg;
    }

    public int hashCode() {
        return (((((((this.f73169iobyxmoadg.hashCode() * 31) + this.f73172zoijcleaow.hashCode()) * 31) + pmvmpeiblj.wkgbmnqykc(this.f73170ppxfxbqfkf)) * 31) + this.f73171wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f73168eablkybsjg);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f73171wkgbmnqykc;
    }

    public final String ppxfxbqfkf() {
        return this.f73169iobyxmoadg;
    }

    public String toString() {
        return "RateProductUiModel(productName=" + this.f73169iobyxmoadg + ", imageUrl=" + this.f73172zoijcleaow + ", rating=" + pmvmpeiblj.eablkybsjg(this.f73170ppxfxbqfkf) + ", comment=" + this.f73171wkgbmnqykc + ", isEnabled=" + this.f73168eablkybsjg + ")";
    }

    public final int wkgbmnqykc() {
        return this.f73170ppxfxbqfkf;
    }

    public final String zoijcleaow() {
        return this.f73172zoijcleaow;
    }

    private ppxfxbqfkf(String productName, String imageUrl, int i13, tzroggbefp comment, boolean z13) {
        zdlpuopuiu.btonecajqb(productName, "productName");
        zdlpuopuiu.btonecajqb(imageUrl, "imageUrl");
        zdlpuopuiu.btonecajqb(comment, "comment");
        this.f73169iobyxmoadg = productName;
        this.f73172zoijcleaow = imageUrl;
        this.f73170ppxfxbqfkf = i13;
        this.f73171wkgbmnqykc = comment;
        this.f73168eablkybsjg = z13;
    }
}
