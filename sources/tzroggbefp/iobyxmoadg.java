package tzroggbefp;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg extends ppxfxbqfkf.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vdvldrhtss f112361iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CameraUseCaseAdapter.iobyxmoadg f112362zoijcleaow;

    iobyxmoadg(vdvldrhtss vdvldrhtssVar, CameraUseCaseAdapter.iobyxmoadg iobyxmoadgVar) {
        if (vdvldrhtssVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f112361iobyxmoadg = vdvldrhtssVar;
        if (iobyxmoadgVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f112362zoijcleaow = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf.iobyxmoadg)) {
            return false;
        }
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (ppxfxbqfkf.iobyxmoadg) obj;
        return this.f112361iobyxmoadg.equals(iobyxmoadgVar.ppxfxbqfkf()) && this.f112362zoijcleaow.equals(iobyxmoadgVar.zoijcleaow());
    }

    public int hashCode() {
        return ((this.f112361iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f112362zoijcleaow.hashCode();
    }

    @Override // tzroggbefp.ppxfxbqfkf.iobyxmoadg
    public vdvldrhtss ppxfxbqfkf() {
        return this.f112361iobyxmoadg;
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f112361iobyxmoadg + ", cameraId=" + this.f112362zoijcleaow + "}";
    }

    @Override // tzroggbefp.ppxfxbqfkf.iobyxmoadg
    public CameraUseCaseAdapter.iobyxmoadg zoijcleaow() {
        return this.f112362zoijcleaow;
    }
}
