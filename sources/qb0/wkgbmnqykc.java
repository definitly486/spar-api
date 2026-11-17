package qb0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f78408iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f78409ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f78410zoijcleaow;

    public wkgbmnqykc(List reviews, boolean z13, gxszxtbevo stubModel) {
        zdlpuopuiu.btonecajqb(reviews, "reviews");
        zdlpuopuiu.btonecajqb(stubModel, "stubModel");
        this.f78408iobyxmoadg = reviews;
        this.f78410zoijcleaow = z13;
        this.f78409ppxfxbqfkf = stubModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f78408iobyxmoadg, wkgbmnqykcVar.f78408iobyxmoadg) && this.f78410zoijcleaow == wkgbmnqykcVar.f78410zoijcleaow && zdlpuopuiu.eablkybsjg(this.f78409ppxfxbqfkf, wkgbmnqykcVar.f78409ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f78408iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f78410zoijcleaow)) * 31) + this.f78409ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f78408iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f78410zoijcleaow;
    }

    public String toString() {
        return "ReviewListUiModel(reviews=" + this.f78408iobyxmoadg + ", isVisible=" + this.f78410zoijcleaow + ", stubModel=" + this.f78409ppxfxbqfkf + ")";
    }

    public final gxszxtbevo zoijcleaow() {
        return this.f78409ppxfxbqfkf;
    }
}
