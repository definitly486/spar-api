package iwizpuwonk;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import istkbnxepw.oipsdeybqn;

/* JADX INFO: loaded from: classes.dex */
public class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ExtraCroppingQuirk f49813iobyxmoadg;

    public gtknphoqwx() {
        this((ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(ExtraCroppingQuirk.class));
    }

    public Size iobyxmoadg(Size size) {
        Size sizePpxfxbqfkf;
        ExtraCroppingQuirk extraCroppingQuirk = this.f49813iobyxmoadg;
        return (extraCroppingQuirk == null || (sizePpxfxbqfkf = extraCroppingQuirk.ppxfxbqfkf(oipsdeybqn.zoijcleaow.PRIV)) == null || sizePpxfxbqfkf.getWidth() * sizePpxfxbqfkf.getHeight() <= size.getWidth() * size.getHeight()) ? size : sizePpxfxbqfkf;
    }

    gtknphoqwx(ExtraCroppingQuirk extraCroppingQuirk) {
        this.f49813iobyxmoadg = extraCroppingQuirk;
    }
}
