package bs;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f16981eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f16982gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f16983iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f16984lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f16985ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f16986wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f16987zoijcleaow;

    public ppxfxbqfkf(String name, List imageUrls, List ratings, List stickers, List hints, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(imageUrls, "imageUrls");
        zdlpuopuiu.btonecajqb(ratings, "ratings");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(hints, "hints");
        this.f16983iobyxmoadg = name;
        this.f16987zoijcleaow = imageUrls;
        this.f16985ppxfxbqfkf = ratings;
        this.f16986wkgbmnqykc = stickers;
        this.f16981eablkybsjg = hints;
        this.f16982gxszxtbevo = str;
        this.f16984lqeggnwhkg = z13;
    }

    public final List eablkybsjg() {
        return this.f16985ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f16983iobyxmoadg, ppxfxbqfkfVar.f16983iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16987zoijcleaow, ppxfxbqfkfVar.f16987zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f16985ppxfxbqfkf, ppxfxbqfkfVar.f16985ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f16986wkgbmnqykc, ppxfxbqfkfVar.f16986wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f16981eablkybsjg, ppxfxbqfkfVar.f16981eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f16982gxszxtbevo, ppxfxbqfkfVar.f16982gxszxtbevo) && this.f16984lqeggnwhkg == ppxfxbqfkfVar.f16984lqeggnwhkg;
    }

    public final List gxszxtbevo() {
        return this.f16986wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f16983iobyxmoadg.hashCode() * 31) + this.f16987zoijcleaow.hashCode()) * 31) + this.f16985ppxfxbqfkf.hashCode()) * 31) + this.f16986wkgbmnqykc.hashCode()) * 31) + this.f16981eablkybsjg.hashCode()) * 31;
        String str = this.f16982gxszxtbevo;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f16984lqeggnwhkg);
    }

    public final String iobyxmoadg() {
        return this.f16982gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f16984lqeggnwhkg;
    }

    public final List ppxfxbqfkf() {
        return this.f16987zoijcleaow;
    }

    public String toString() {
        return "ProductInfoUiModel(name=" + this.f16983iobyxmoadg + ", imageUrls=" + this.f16987zoijcleaow + ", ratings=" + this.f16985ppxfxbqfkf + ", stickers=" + this.f16986wkgbmnqykc + ", hints=" + this.f16981eablkybsjg + ", discount=" + this.f16982gxszxtbevo + ", isFavorite=" + this.f16984lqeggnwhkg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f16983iobyxmoadg;
    }

    public final List zoijcleaow() {
        return this.f16981eablkybsjg;
    }
}
