package istkbnxepw;

import androidx.camera.core.impl.CameraControlInternal;

/* JADX INFO: loaded from: classes.dex */
public class metgxyhuhe extends androidx.camera.core.impl.draadjrbmk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final CameraControlInternal f49380ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yfnezrywwk f49381wkgbmnqykc;

    public metgxyhuhe(CameraControlInternal cameraControlInternal, yfnezrywwk yfnezrywwkVar) {
        super(cameraControlInternal);
        this.f49380ppxfxbqfkf = cameraControlInternal;
        this.f49381wkgbmnqykc = yfnezrywwkVar;
    }

    @Override // androidx.camera.core.impl.draadjrbmk, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww(lereixgezr.esjtqupxsv esjtqupxsvVar) {
        lereixgezr.esjtqupxsv esjtqupxsvVarIobyxmoadg = cdpycssgdh.ojitshcjhn.iobyxmoadg(this.f49381wkgbmnqykc, esjtqupxsvVar);
        return esjtqupxsvVarIobyxmoadg == null ? iozdgvuglv.gtknphoqwx.btonecajqb(new IllegalStateException("FocusMetering is not supported")) : this.f49380ppxfxbqfkf.dxjokdxxww(esjtqupxsvVarIobyxmoadg);
    }

    @Override // androidx.camera.core.impl.draadjrbmk, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykc(boolean z13) {
        return !cdpycssgdh.ojitshcjhn.zoijcleaow(this.f49381wkgbmnqykc, 6) ? iozdgvuglv.gtknphoqwx.btonecajqb(new IllegalStateException("Torch is not supported")) : this.f49380ppxfxbqfkf.wkgbmnqykc(z13);
    }
}
