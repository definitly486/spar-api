package androidx.camera.extensions.internal;

import android.util.Size;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface btonecajqb {
    List getSupportedCaptureResultKeys();

    Map getSupportedPostviewResolutions(Size size);

    default boolean isCurrentExtensionModeAvailable() {
        return false;
    }

    boolean isExtensionStrengthAvailable();

    boolean isPostviewAvailable();

    default boolean willReceiveOnCaptureCompleted() {
        gtknphoqwx gtknphoqwxVar = gtknphoqwx.f3996jyumaefscl;
        if (eablkybsjg.ppxfxbqfkf(gtknphoqwxVar) || gxszxtbevo.gxszxtbevo(gtknphoqwxVar)) {
            return false;
        }
        return !getSupportedCaptureResultKeys().isEmpty();
    }
}
