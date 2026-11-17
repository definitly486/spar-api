package uu;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f114412wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f114413iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f114414ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f114415zoijcleaow;

    public zoijcleaow(String recommendationBlockId, List products, String title) {
        zdlpuopuiu.btonecajqb(recommendationBlockId, "recommendationBlockId");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(title, "title");
        this.f114413iobyxmoadg = recommendationBlockId;
        this.f114415zoijcleaow = products;
        this.f114414ppxfxbqfkf = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f114413iobyxmoadg, zoijcleaowVar.f114413iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f114415zoijcleaow, zoijcleaowVar.f114415zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f114414ppxfxbqfkf, zoijcleaowVar.f114414ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f114413iobyxmoadg.hashCode() * 31) + this.f114415zoijcleaow.hashCode()) * 31) + this.f114414ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f114415zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f114414ppxfxbqfkf;
    }

    public String toString() {
        return "RecommendationsUiModel(recommendationBlockId=" + this.f114413iobyxmoadg + ", products=" + this.f114415zoijcleaow + ", title=" + this.f114414ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f114413iobyxmoadg;
    }
}
