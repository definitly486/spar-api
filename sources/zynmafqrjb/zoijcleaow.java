package zynmafqrjb;

import android.util.Size;
import lereixgezr.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends oxmwwwfdhm.ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final jpowsppfya.vdvldrhtss f131688btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f131689dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f131690eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final jpowsppfya.vdvldrhtss f131691gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final int f131692gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f131693lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Size f131694nufgyqmvbu;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Size f131695wkgbmnqykc;

    zoijcleaow(Size size, int i13, int i14, boolean z13, mbcevpiqjq mbcevpiqjqVar, Size size2, int i15, jpowsppfya.vdvldrhtss vdvldrhtssVar, jpowsppfya.vdvldrhtss vdvldrhtssVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f131695wkgbmnqykc = size;
        this.f131690eablkybsjg = i13;
        this.f131692gxszxtbevo = i14;
        this.f131693lqeggnwhkg = z13;
        this.f131694nufgyqmvbu = size2;
        this.f131689dxjokdxxww = i15;
        if (vdvldrhtssVar == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f131688btonecajqb = vdvldrhtssVar;
        if (vdvldrhtssVar2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f131691gtknphoqwx = vdvldrhtssVar2;
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    Size dxjokdxxww() {
        return this.f131695wkgbmnqykc;
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    int eablkybsjg() {
        return this.f131689dxjokdxxww;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oxmwwwfdhm.ppxfxbqfkf)) {
            return false;
        }
        oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkfVar = (oxmwwwfdhm.ppxfxbqfkf) obj;
        if (this.f131695wkgbmnqykc.equals(ppxfxbqfkfVar.dxjokdxxww()) && this.f131690eablkybsjg == ppxfxbqfkfVar.ppxfxbqfkf() && this.f131692gxszxtbevo == ppxfxbqfkfVar.wkgbmnqykc() && this.f131693lqeggnwhkg == ppxfxbqfkfVar.gtknphoqwx()) {
            ppxfxbqfkfVar.zoijcleaow();
            Size size = this.f131694nufgyqmvbu;
            if (size != null ? size.equals(ppxfxbqfkfVar.gxszxtbevo()) : ppxfxbqfkfVar.gxszxtbevo() == null) {
                if (this.f131689dxjokdxxww == ppxfxbqfkfVar.eablkybsjg() && this.f131688btonecajqb.equals(ppxfxbqfkfVar.nufgyqmvbu()) && this.f131691gtknphoqwx.equals(ppxfxbqfkfVar.iobyxmoadg())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    boolean gtknphoqwx() {
        return this.f131693lqeggnwhkg;
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    Size gxszxtbevo() {
        return this.f131694nufgyqmvbu;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f131695wkgbmnqykc.hashCode() ^ 1000003) * 1000003) ^ this.f131690eablkybsjg) * 1000003) ^ this.f131692gxszxtbevo) * 1000003) ^ (this.f131693lqeggnwhkg ? 1231 : 1237)) * (-721379959);
        Size size = this.f131694nufgyqmvbu;
        return ((((((iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.f131689dxjokdxxww) * 1000003) ^ this.f131688btonecajqb.hashCode()) * 1000003) ^ this.f131691gtknphoqwx.hashCode();
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    jpowsppfya.vdvldrhtss iobyxmoadg() {
        return this.f131691gtknphoqwx;
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    jpowsppfya.vdvldrhtss nufgyqmvbu() {
        return this.f131688btonecajqb;
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    int ppxfxbqfkf() {
        return this.f131690eablkybsjg;
    }

    public String toString() {
        return "In{size=" + this.f131695wkgbmnqykc + ", inputFormat=" + this.f131690eablkybsjg + ", outputFormat=" + this.f131692gxszxtbevo + ", virtualCamera=" + this.f131693lqeggnwhkg + ", imageReaderProxyProvider=" + ((Object) null) + ", postviewSize=" + this.f131694nufgyqmvbu + ", postviewImageFormat=" + this.f131689dxjokdxxww + ", requestEdge=" + this.f131688btonecajqb + ", errorEdge=" + this.f131691gtknphoqwx + "}";
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    int wkgbmnqykc() {
        return this.f131692gxszxtbevo;
    }

    @Override // zynmafqrjb.oxmwwwfdhm.ppxfxbqfkf
    mbcevpiqjq zoijcleaow() {
        return null;
    }
}
