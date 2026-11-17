package istkbnxepw;

import android.util.Size;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg extends bfopjjpdmp {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Size f49366eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Map f49367gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Size f49368iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Map f49369lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Size f49370ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f49371wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f49372zoijcleaow;

    lqeggnwhkg(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f49368iobyxmoadg = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f49372zoijcleaow = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f49370ppxfxbqfkf = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f49371wkgbmnqykc = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f49366eablkybsjg = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f49367gxszxtbevo = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f49369lqeggnwhkg = map4;
    }

    @Override // istkbnxepw.bfopjjpdmp
    public Map btonecajqb() {
        return this.f49372zoijcleaow;
    }

    @Override // istkbnxepw.bfopjjpdmp
    public Map draadjrbmk() {
        return this.f49369lqeggnwhkg;
    }

    @Override // istkbnxepw.bfopjjpdmp
    public Size eablkybsjg() {
        return this.f49370ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bfopjjpdmp)) {
            return false;
        }
        bfopjjpdmp bfopjjpdmpVar = (bfopjjpdmp) obj;
        return this.f49368iobyxmoadg.equals(bfopjjpdmpVar.zoijcleaow()) && this.f49372zoijcleaow.equals(bfopjjpdmpVar.btonecajqb()) && this.f49370ppxfxbqfkf.equals(bfopjjpdmpVar.eablkybsjg()) && this.f49371wkgbmnqykc.equals(bfopjjpdmpVar.nufgyqmvbu()) && this.f49366eablkybsjg.equals(bfopjjpdmpVar.gxszxtbevo()) && this.f49367gxszxtbevo.equals(bfopjjpdmpVar.wkgbmnqykc()) && this.f49369lqeggnwhkg.equals(bfopjjpdmpVar.draadjrbmk());
    }

    @Override // istkbnxepw.bfopjjpdmp
    public Size gxszxtbevo() {
        return this.f49366eablkybsjg;
    }

    public int hashCode() {
        return ((((((((((((this.f49368iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f49372zoijcleaow.hashCode()) * 1000003) ^ this.f49370ppxfxbqfkf.hashCode()) * 1000003) ^ this.f49371wkgbmnqykc.hashCode()) * 1000003) ^ this.f49366eablkybsjg.hashCode()) * 1000003) ^ this.f49367gxszxtbevo.hashCode()) * 1000003) ^ this.f49369lqeggnwhkg.hashCode();
    }

    @Override // istkbnxepw.bfopjjpdmp
    public Map nufgyqmvbu() {
        return this.f49371wkgbmnqykc;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f49368iobyxmoadg + ", s720pSizeMap=" + this.f49372zoijcleaow + ", previewSize=" + this.f49370ppxfxbqfkf + ", s1440pSizeMap=" + this.f49371wkgbmnqykc + ", recordSize=" + this.f49366eablkybsjg + ", maximumSizeMap=" + this.f49367gxszxtbevo + ", ultraMaximumSizeMap=" + this.f49369lqeggnwhkg + "}";
    }

    @Override // istkbnxepw.bfopjjpdmp
    public Map wkgbmnqykc() {
        return this.f49367gxszxtbevo;
    }

    @Override // istkbnxepw.bfopjjpdmp
    public Size zoijcleaow() {
        return this.f49368iobyxmoadg;
    }
}
