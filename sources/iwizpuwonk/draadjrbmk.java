package iwizpuwonk;

import android.graphics.PointF;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import istkbnxepw.jztzpxfvev;
import lereixgezr.ribwqtqdhb;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jztzpxfvev f49807iobyxmoadg;

    public draadjrbmk(jztzpxfvev jztzpxfvevVar) {
        this.f49807iobyxmoadg = jztzpxfvevVar;
    }

    public PointF iobyxmoadg(ribwqtqdhb ribwqtqdhbVar, int i13) {
        return (i13 == 1 && this.f49807iobyxmoadg.iobyxmoadg(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - ribwqtqdhbVar.ppxfxbqfkf(), ribwqtqdhbVar.wkgbmnqykc()) : new PointF(ribwqtqdhbVar.ppxfxbqfkf(), ribwqtqdhbVar.wkgbmnqykc());
    }
}
