package ph1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f76641iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f76642ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f76643wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f76644zoijcleaow;

    public zoijcleaow(String title, String str, boolean z13, List productList) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(productList, "productList");
        this.f76641iobyxmoadg = title;
        this.f76644zoijcleaow = str;
        this.f76642ppxfxbqfkf = z13;
        this.f76643wkgbmnqykc = productList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f76641iobyxmoadg, zoijcleaowVar.f76641iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f76644zoijcleaow, zoijcleaowVar.f76644zoijcleaow) && this.f76642ppxfxbqfkf == zoijcleaowVar.f76642ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f76643wkgbmnqykc, zoijcleaowVar.f76643wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = this.f76641iobyxmoadg.hashCode() * 31;
        String str = this.f76644zoijcleaow;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f76642ppxfxbqfkf)) * 31) + this.f76643wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f76644zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f76641iobyxmoadg;
    }

    public String toString() {
        return "ProductsFromBanner(title=" + this.f76641iobyxmoadg + ", imageBannerUrl=" + this.f76644zoijcleaow + ", isChangeProductCountEnabled=" + this.f76642ppxfxbqfkf + ", productList=" + this.f76643wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f76642ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f76643wkgbmnqykc;
    }
}
