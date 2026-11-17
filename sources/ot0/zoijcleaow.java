package ot0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f74705wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f74706iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f74707ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f74708zoijcleaow;

    public zoijcleaow(String recommendationBlockId, List products, String title) {
        zdlpuopuiu.btonecajqb(recommendationBlockId, "recommendationBlockId");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f74706iobyxmoadg = recommendationBlockId;
        this.f74708zoijcleaow = products;
        this.f74707ppxfxbqfkf = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f74706iobyxmoadg, zoijcleaowVar.f74706iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f74708zoijcleaow, zoijcleaowVar.f74708zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f74707ppxfxbqfkf, zoijcleaowVar.f74707ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f74706iobyxmoadg.hashCode() * 31) + this.f74708zoijcleaow.hashCode()) * 31) + this.f74707ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f74708zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f74707ppxfxbqfkf;
    }

    public String toString() {
        return "RecommendationsUiModel(recommendationBlockId=" + this.f74706iobyxmoadg + ", products=" + this.f74708zoijcleaow + ", title=" + this.f74707ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f74706iobyxmoadg;
    }
}
