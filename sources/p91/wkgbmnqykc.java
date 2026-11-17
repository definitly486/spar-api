package p91;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f76242iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f76243ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f76244zoijcleaow;

    public wkgbmnqykc(List reviews, boolean z13, gxszxtbevo stubModel) {
        zdlpuopuiu.btonecajqb(reviews, "reviews");
        zdlpuopuiu.btonecajqb(stubModel, "stubModel");
        this.f76242iobyxmoadg = reviews;
        this.f76244zoijcleaow = z13;
        this.f76243ppxfxbqfkf = stubModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f76242iobyxmoadg, wkgbmnqykcVar.f76242iobyxmoadg) && this.f76244zoijcleaow == wkgbmnqykcVar.f76244zoijcleaow && zdlpuopuiu.eablkybsjg(this.f76243ppxfxbqfkf, wkgbmnqykcVar.f76243ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f76242iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f76244zoijcleaow)) * 31) + this.f76243ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f76242iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f76244zoijcleaow;
    }

    public String toString() {
        return "ReviewListUiModel(reviews=" + this.f76242iobyxmoadg + ", isVisible=" + this.f76244zoijcleaow + ", stubModel=" + this.f76243ppxfxbqfkf + ")";
    }

    public final gxszxtbevo zoijcleaow() {
        return this.f76243ppxfxbqfkf;
    }
}
