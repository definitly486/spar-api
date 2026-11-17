package gy1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f38797eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f38798gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f38799iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f38800lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f38801ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f38802wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final double f38803zoijcleaow;

    public btonecajqb(String listName, double d13, int i13, List products, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(listName, "listName");
        zdlpuopuiu.btonecajqb(products, "products");
        this.f38799iobyxmoadg = listName;
        this.f38803zoijcleaow = d13;
        this.f38801ppxfxbqfkf = i13;
        this.f38802wkgbmnqykc = products;
        this.f38797eablkybsjg = z13;
        this.f38798gxszxtbevo = z14;
        this.f38800lqeggnwhkg = z15;
    }

    public final double eablkybsjg() {
        return this.f38803zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btonecajqb)) {
            return false;
        }
        btonecajqb btonecajqbVar = (btonecajqb) obj;
        return zdlpuopuiu.eablkybsjg(this.f38799iobyxmoadg, btonecajqbVar.f38799iobyxmoadg) && Double.compare(this.f38803zoijcleaow, btonecajqbVar.f38803zoijcleaow) == 0 && this.f38801ppxfxbqfkf == btonecajqbVar.f38801ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f38802wkgbmnqykc, btonecajqbVar.f38802wkgbmnqykc) && this.f38797eablkybsjg == btonecajqbVar.f38797eablkybsjg && this.f38798gxszxtbevo == btonecajqbVar.f38798gxszxtbevo && this.f38800lqeggnwhkg == btonecajqbVar.f38800lqeggnwhkg;
    }

    public final boolean gxszxtbevo() {
        return this.f38800lqeggnwhkg;
    }

    public int hashCode() {
        return (((((((((((this.f38799iobyxmoadg.hashCode() * 31) + Double.hashCode(this.f38803zoijcleaow)) * 31) + Integer.hashCode(this.f38801ppxfxbqfkf)) * 31) + this.f38802wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f38797eablkybsjg)) * 31) + Boolean.hashCode(this.f38798gxszxtbevo)) * 31) + Boolean.hashCode(this.f38800lqeggnwhkg);
    }

    public final int iobyxmoadg() {
        return this.f38801ppxfxbqfkf;
    }

    public final boolean lqeggnwhkg() {
        return this.f38798gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f38799iobyxmoadg;
    }

    public String toString() {
        return "Model(listName=" + this.f38799iobyxmoadg + ", sum=" + this.f38803zoijcleaow + ", count=" + this.f38801ppxfxbqfkf + ", products=" + this.f38802wkgbmnqykc + ", emptyViewVisible=" + this.f38797eablkybsjg + ", isShareListFeatureEnabled=" + this.f38798gxszxtbevo + ", isLoading=" + this.f38800lqeggnwhkg + ")";
    }

    public final List wkgbmnqykc() {
        return this.f38802wkgbmnqykc;
    }

    public final boolean zoijcleaow() {
        return this.f38797eablkybsjg;
    }
}
