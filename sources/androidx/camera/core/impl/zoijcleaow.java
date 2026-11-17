package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import istkbnxepw.oipsdeybqn;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f3879eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final btonecajqb f3880gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oipsdeybqn f3881iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Range f3882lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Size f3883ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lereixgezr.iwizpuwonk f3884wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f3885zoijcleaow;

    zoijcleaow(oipsdeybqn oipsdeybqnVar, int i13, Size size, lereixgezr.iwizpuwonk iwizpuwonkVar, List list, btonecajqb btonecajqbVar, Range range) {
        if (oipsdeybqnVar == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f3881iobyxmoadg = oipsdeybqnVar;
        this.f3885zoijcleaow = i13;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f3883ppxfxbqfkf = size;
        if (iwizpuwonkVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f3884wkgbmnqykc = iwizpuwonkVar;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f3879eablkybsjg = list;
        this.f3880gxszxtbevo = btonecajqbVar;
        this.f3882lqeggnwhkg = range;
    }

    @Override // androidx.camera.core.impl.iobyxmoadg
    public btonecajqb eablkybsjg() {
        return this.f3880gxszxtbevo;
    }

    public boolean equals(Object obj) {
        btonecajqb btonecajqbVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        if (this.f3881iobyxmoadg.equals(iobyxmoadgVar.lqeggnwhkg()) && this.f3885zoijcleaow == iobyxmoadgVar.wkgbmnqykc() && this.f3883ppxfxbqfkf.equals(iobyxmoadgVar.gxszxtbevo()) && this.f3884wkgbmnqykc.equals(iobyxmoadgVar.ppxfxbqfkf()) && this.f3879eablkybsjg.equals(iobyxmoadgVar.zoijcleaow()) && ((btonecajqbVar = this.f3880gxszxtbevo) != null ? btonecajqbVar.equals(iobyxmoadgVar.eablkybsjg()) : iobyxmoadgVar.eablkybsjg() == null)) {
            Range range = this.f3882lqeggnwhkg;
            if (range == null) {
                if (iobyxmoadgVar.nufgyqmvbu() == null) {
                    return true;
                }
            } else if (range.equals(iobyxmoadgVar.nufgyqmvbu())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.iobyxmoadg
    public Size gxszxtbevo() {
        return this.f3883ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = (((((((((this.f3881iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f3885zoijcleaow) * 1000003) ^ this.f3883ppxfxbqfkf.hashCode()) * 1000003) ^ this.f3884wkgbmnqykc.hashCode()) * 1000003) ^ this.f3879eablkybsjg.hashCode()) * 1000003;
        btonecajqb btonecajqbVar = this.f3880gxszxtbevo;
        int iHashCode2 = (iHashCode ^ (btonecajqbVar == null ? 0 : btonecajqbVar.hashCode())) * 1000003;
        Range range = this.f3882lqeggnwhkg;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    @Override // androidx.camera.core.impl.iobyxmoadg
    public oipsdeybqn lqeggnwhkg() {
        return this.f3881iobyxmoadg;
    }

    @Override // androidx.camera.core.impl.iobyxmoadg
    public Range nufgyqmvbu() {
        return this.f3882lqeggnwhkg;
    }

    @Override // androidx.camera.core.impl.iobyxmoadg
    public lereixgezr.iwizpuwonk ppxfxbqfkf() {
        return this.f3884wkgbmnqykc;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f3881iobyxmoadg + ", imageFormat=" + this.f3885zoijcleaow + ", size=" + this.f3883ppxfxbqfkf + ", dynamicRange=" + this.f3884wkgbmnqykc + ", captureTypes=" + this.f3879eablkybsjg + ", implementationOptions=" + this.f3880gxszxtbevo + ", targetFrameRate=" + this.f3882lqeggnwhkg + "}";
    }

    @Override // androidx.camera.core.impl.iobyxmoadg
    public int wkgbmnqykc() {
        return this.f3885zoijcleaow;
    }

    @Override // androidx.camera.core.impl.iobyxmoadg
    public List zoijcleaow() {
        return this.f3879eablkybsjg;
    }
}
