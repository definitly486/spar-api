package kegysxyocb;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    boolean f55354iobyxmoadg;

    public iobyxmoadg() {
        this.f55354iobyxmoadg = androidx.camera.extensions.internal.compat.quirk.iobyxmoadg.zoijcleaow(GetAvailableKeysNeedsOnInit.class) != null;
    }

    public List iobyxmoadg(ImageCaptureExtenderImpl imageCaptureExtenderImpl, String str, CameraCharacteristics cameraCharacteristics, Context context) {
        if (this.f55354iobyxmoadg) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (this.f55354iobyxmoadg) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }
}
