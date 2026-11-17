package iwizpuwonk;

import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;

/* JADX INFO: loaded from: classes.dex */
public abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Rational f49804iobyxmoadg = new Rational(16, 9);

    private static boolean iobyxmoadg(Size size, Rational rational) {
        return rational.equals(new Rational(size.getWidth(), size.getHeight()));
    }

    public static void zoijcleaow(Size size, androidx.camera.core.impl.jyumaefscl.zoijcleaow zoijcleaowVar) {
        if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(PreviewPixelHDRnetQuirk.class)) == null || iobyxmoadg(size, f49804iobyxmoadg)) {
            return;
        }
        oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg = new oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg();
        c1637iobyxmoadg.gxszxtbevo(CaptureRequest.TONEMAP_MODE, 2);
        zoijcleaowVar.lqeggnwhkg(c1637iobyxmoadg.zoijcleaow());
    }
}
