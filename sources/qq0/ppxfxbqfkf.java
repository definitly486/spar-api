package qq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f80513eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final String f80514gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f80515iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f80516lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f80517ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f80518wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f80519zoijcleaow;

    public ppxfxbqfkf(String name, List imageUrls, List ratings, List stickers, List hints, String str, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(imageUrls, "imageUrls");
        zdlpuopuiu.btonecajqb(ratings, "ratings");
        zdlpuopuiu.btonecajqb(stickers, "stickers");
        zdlpuopuiu.btonecajqb(hints, "hints");
        this.f80515iobyxmoadg = name;
        this.f80519zoijcleaow = imageUrls;
        this.f80517ppxfxbqfkf = ratings;
        this.f80518wkgbmnqykc = stickers;
        this.f80513eablkybsjg = hints;
        this.f80514gxszxtbevo = str;
        this.f80516lqeggnwhkg = z13;
    }

    public final List eablkybsjg() {
        return this.f80517ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f80515iobyxmoadg, ppxfxbqfkfVar.f80515iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80519zoijcleaow, ppxfxbqfkfVar.f80519zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f80517ppxfxbqfkf, ppxfxbqfkfVar.f80517ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f80518wkgbmnqykc, ppxfxbqfkfVar.f80518wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f80513eablkybsjg, ppxfxbqfkfVar.f80513eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f80514gxszxtbevo, ppxfxbqfkfVar.f80514gxszxtbevo) && this.f80516lqeggnwhkg == ppxfxbqfkfVar.f80516lqeggnwhkg;
    }

    public final List gxszxtbevo() {
        return this.f80518wkgbmnqykc;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f80515iobyxmoadg.hashCode() * 31) + this.f80519zoijcleaow.hashCode()) * 31) + this.f80517ppxfxbqfkf.hashCode()) * 31) + this.f80518wkgbmnqykc.hashCode()) * 31) + this.f80513eablkybsjg.hashCode()) * 31;
        String str = this.f80514gxszxtbevo;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f80516lqeggnwhkg);
    }

    public final String iobyxmoadg() {
        return this.f80514gxszxtbevo;
    }

    public final boolean lqeggnwhkg() {
        return this.f80516lqeggnwhkg;
    }

    public final List ppxfxbqfkf() {
        return this.f80519zoijcleaow;
    }

    public String toString() {
        return "ProductInfoUiModel(name=" + this.f80515iobyxmoadg + ", imageUrls=" + this.f80519zoijcleaow + ", ratings=" + this.f80517ppxfxbqfkf + ", stickers=" + this.f80518wkgbmnqykc + ", hints=" + this.f80513eablkybsjg + ", discount=" + this.f80514gxszxtbevo + ", isFavorite=" + this.f80516lqeggnwhkg + ")";
    }

    public final String wkgbmnqykc() {
        return this.f80515iobyxmoadg;
    }

    public final List zoijcleaow() {
        return this.f80513eablkybsjg;
    }
}
