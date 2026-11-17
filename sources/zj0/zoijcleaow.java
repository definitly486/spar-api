package zj0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f130281iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f130282ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f130283wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f130284zoijcleaow;

    public zoijcleaow(String title, String str, boolean z13, List productList) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(productList, "productList");
        this.f130281iobyxmoadg = title;
        this.f130284zoijcleaow = str;
        this.f130282ppxfxbqfkf = z13;
        this.f130283wkgbmnqykc = productList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f130281iobyxmoadg, zoijcleaowVar.f130281iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f130284zoijcleaow, zoijcleaowVar.f130284zoijcleaow) && this.f130282ppxfxbqfkf == zoijcleaowVar.f130282ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f130283wkgbmnqykc, zoijcleaowVar.f130283wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = this.f130281iobyxmoadg.hashCode() * 31;
        String str = this.f130284zoijcleaow;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f130282ppxfxbqfkf)) * 31) + this.f130283wkgbmnqykc.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f130284zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f130281iobyxmoadg;
    }

    public String toString() {
        return "ProductsFromBanner(title=" + this.f130281iobyxmoadg + ", imageBannerUrl=" + this.f130284zoijcleaow + ", isChangeProductCountEnabled=" + this.f130282ppxfxbqfkf + ", productList=" + this.f130283wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f130282ppxfxbqfkf;
    }

    public final List zoijcleaow() {
        return this.f130283wkgbmnqykc;
    }
}
