package hkdspvbjdz;

import java.util.List;
import jpowsppfya.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends oxmwwwfdhm.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wwaezpbzkn f40710iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f40711ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wwaezpbzkn f40712zoijcleaow;

    zoijcleaow(wwaezpbzkn wwaezpbzknVar, wwaezpbzkn wwaezpbzknVar2, List list) {
        if (wwaezpbzknVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f40710iobyxmoadg = wwaezpbzknVar;
        if (wwaezpbzknVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f40712zoijcleaow = wwaezpbzknVar2;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f40711ppxfxbqfkf = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oxmwwwfdhm.zoijcleaow)) {
            return false;
        }
        oxmwwwfdhm.zoijcleaow zoijcleaowVar = (oxmwwwfdhm.zoijcleaow) obj;
        return this.f40710iobyxmoadg.equals(zoijcleaowVar.zoijcleaow()) && this.f40712zoijcleaow.equals(zoijcleaowVar.ppxfxbqfkf()) && this.f40711ppxfxbqfkf.equals(zoijcleaowVar.iobyxmoadg());
    }

    public int hashCode() {
        return ((((this.f40710iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f40712zoijcleaow.hashCode()) * 1000003) ^ this.f40711ppxfxbqfkf.hashCode();
    }

    @Override // hkdspvbjdz.oxmwwwfdhm.zoijcleaow
    public List iobyxmoadg() {
        return this.f40711ppxfxbqfkf;
    }

    @Override // hkdspvbjdz.oxmwwwfdhm.zoijcleaow
    public wwaezpbzkn ppxfxbqfkf() {
        return this.f40712zoijcleaow;
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f40710iobyxmoadg + ", secondarySurfaceEdge=" + this.f40712zoijcleaow + ", outConfigs=" + this.f40711ppxfxbqfkf + "}";
    }

    @Override // hkdspvbjdz.oxmwwwfdhm.zoijcleaow
    public wwaezpbzkn zoijcleaow() {
        return this.f40710iobyxmoadg;
    }
}
