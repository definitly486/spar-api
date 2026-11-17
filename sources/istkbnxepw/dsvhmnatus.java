package istkbnxepw;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus extends DeferrableSurface {

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final Surface f49313ojitshcjhn;

    public dsvhmnatus(Surface surface, Size size, int i13) {
        super(size, i13);
        this.f49313ojitshcjhn = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public com.google.common.util.concurrent.wkgbmnqykc oxmwwwfdhm() {
        return iozdgvuglv.gtknphoqwx.draadjrbmk(this.f49313ojitshcjhn);
    }

    public dsvhmnatus(Surface surface) {
        this.f49313ojitshcjhn = surface;
    }
}
