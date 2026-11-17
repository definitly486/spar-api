package kcexrzcfyt;

import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc extends jpowsppfya.gtknphoqwx {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Size f55047eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final androidx.camera.core.impl.iwizpuwonk f55048gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f55049iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f55050lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final androidx.camera.core.impl.jyumaefscl f55051ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.camera.core.impl.istkbnxepw f55052wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Class f55053zoijcleaow;

    wkgbmnqykc(String str, Class cls, androidx.camera.core.impl.jyumaefscl jyumaefsclVar, androidx.camera.core.impl.istkbnxepw istkbnxepwVar, Size size, androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, List list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f55049iobyxmoadg = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f55053zoijcleaow = cls;
        if (jyumaefsclVar == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f55051ppxfxbqfkf = jyumaefsclVar;
        if (istkbnxepwVar == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f55052wkgbmnqykc = istkbnxepwVar;
        this.f55047eablkybsjg = size;
        this.f55048gxszxtbevo = iwizpuwonkVar;
        this.f55050lqeggnwhkg = list;
    }

    @Override // kcexrzcfyt.jpowsppfya.gtknphoqwx
    Class dxjokdxxww() {
        return this.f55053zoijcleaow;
    }

    @Override // kcexrzcfyt.jpowsppfya.gtknphoqwx
    androidx.camera.core.impl.iwizpuwonk eablkybsjg() {
        return this.f55048gxszxtbevo;
    }

    public boolean equals(Object obj) {
        Size size;
        androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jpowsppfya.gtknphoqwx)) {
            return false;
        }
        jpowsppfya.gtknphoqwx gtknphoqwxVar = (jpowsppfya.gtknphoqwx) obj;
        if (this.f55049iobyxmoadg.equals(gtknphoqwxVar.nufgyqmvbu()) && this.f55053zoijcleaow.equals(gtknphoqwxVar.dxjokdxxww()) && this.f55051ppxfxbqfkf.equals(gtknphoqwxVar.wkgbmnqykc()) && this.f55052wkgbmnqykc.equals(gtknphoqwxVar.lqeggnwhkg()) && ((size = this.f55047eablkybsjg) != null ? size.equals(gtknphoqwxVar.gxszxtbevo()) : gtknphoqwxVar.gxszxtbevo() == null) && ((iwizpuwonkVar = this.f55048gxszxtbevo) != null ? iwizpuwonkVar.equals(gtknphoqwxVar.eablkybsjg()) : gtknphoqwxVar.eablkybsjg() == null)) {
            List list = this.f55050lqeggnwhkg;
            if (list == null) {
                if (gtknphoqwxVar.ppxfxbqfkf() == null) {
                    return true;
                }
            } else if (list.equals(gtknphoqwxVar.ppxfxbqfkf())) {
                return true;
            }
        }
        return false;
    }

    @Override // kcexrzcfyt.jpowsppfya.gtknphoqwx
    Size gxszxtbevo() {
        return this.f55047eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f55049iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f55053zoijcleaow.hashCode()) * 1000003) ^ this.f55051ppxfxbqfkf.hashCode()) * 1000003) ^ this.f55052wkgbmnqykc.hashCode()) * 1000003;
        Size size = this.f55047eablkybsjg;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar = this.f55048gxszxtbevo;
        int iHashCode3 = (iHashCode2 ^ (iwizpuwonkVar == null ? 0 : iwizpuwonkVar.hashCode())) * 1000003;
        List list = this.f55050lqeggnwhkg;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // kcexrzcfyt.jpowsppfya.gtknphoqwx
    androidx.camera.core.impl.istkbnxepw lqeggnwhkg() {
        return this.f55052wkgbmnqykc;
    }

    @Override // kcexrzcfyt.jpowsppfya.gtknphoqwx
    String nufgyqmvbu() {
        return this.f55049iobyxmoadg;
    }

    @Override // kcexrzcfyt.jpowsppfya.gtknphoqwx
    List ppxfxbqfkf() {
        return this.f55050lqeggnwhkg;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f55049iobyxmoadg + ", useCaseType=" + this.f55053zoijcleaow + ", sessionConfig=" + this.f55051ppxfxbqfkf + ", useCaseConfig=" + this.f55052wkgbmnqykc + ", surfaceResolution=" + this.f55047eablkybsjg + ", streamSpec=" + this.f55048gxszxtbevo + ", captureTypes=" + this.f55050lqeggnwhkg + "}";
    }

    @Override // kcexrzcfyt.jpowsppfya.gtknphoqwx
    androidx.camera.core.impl.jyumaefscl wkgbmnqykc() {
        return this.f55051ppxfxbqfkf;
    }
}
