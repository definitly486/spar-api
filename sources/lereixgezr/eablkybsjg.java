package lereixgezr;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends ydmasvzmpa.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f62268eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Size f62269iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final istkbnxepw.iwizpuwonk f62270ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f62271wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Rect f62272zoijcleaow;

    eablkybsjg(Size size, Rect rect, istkbnxepw.iwizpuwonk iwizpuwonkVar, int i13, boolean z13) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f62269iobyxmoadg = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.f62272zoijcleaow = rect;
        this.f62270ppxfxbqfkf = iwizpuwonkVar;
        this.f62271wkgbmnqykc = i13;
        this.f62268eablkybsjg = z13;
    }

    @Override // lereixgezr.ydmasvzmpa.iobyxmoadg
    public int eablkybsjg() {
        return this.f62271wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        istkbnxepw.iwizpuwonk iwizpuwonkVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ydmasvzmpa.iobyxmoadg)) {
            return false;
        }
        ydmasvzmpa.iobyxmoadg iobyxmoadgVar = (ydmasvzmpa.iobyxmoadg) obj;
        return this.f62269iobyxmoadg.equals(iobyxmoadgVar.ppxfxbqfkf()) && this.f62272zoijcleaow.equals(iobyxmoadgVar.zoijcleaow()) && ((iwizpuwonkVar = this.f62270ppxfxbqfkf) != null ? iwizpuwonkVar.equals(iobyxmoadgVar.iobyxmoadg()) : iobyxmoadgVar.iobyxmoadg() == null) && this.f62271wkgbmnqykc == iobyxmoadgVar.eablkybsjg() && this.f62268eablkybsjg == iobyxmoadgVar.wkgbmnqykc();
    }

    public int hashCode() {
        int iHashCode = (((this.f62269iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f62272zoijcleaow.hashCode()) * 1000003;
        istkbnxepw.iwizpuwonk iwizpuwonkVar = this.f62270ppxfxbqfkf;
        return ((((iHashCode ^ (iwizpuwonkVar == null ? 0 : iwizpuwonkVar.hashCode())) * 1000003) ^ this.f62271wkgbmnqykc) * 1000003) ^ (this.f62268eablkybsjg ? 1231 : 1237);
    }

    @Override // lereixgezr.ydmasvzmpa.iobyxmoadg
    public istkbnxepw.iwizpuwonk iobyxmoadg() {
        return this.f62270ppxfxbqfkf;
    }

    @Override // lereixgezr.ydmasvzmpa.iobyxmoadg
    public Size ppxfxbqfkf() {
        return this.f62269iobyxmoadg;
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f62269iobyxmoadg + ", inputCropRect=" + this.f62272zoijcleaow + ", cameraInternal=" + this.f62270ppxfxbqfkf + ", rotationDegrees=" + this.f62271wkgbmnqykc + ", mirroring=" + this.f62268eablkybsjg + "}";
    }

    @Override // lereixgezr.ydmasvzmpa.iobyxmoadg
    public boolean wkgbmnqykc() {
        return this.f62268eablkybsjg;
    }

    @Override // lereixgezr.ydmasvzmpa.iobyxmoadg
    public Rect zoijcleaow() {
        return this.f62272zoijcleaow;
    }
}
