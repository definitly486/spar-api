package iwizpuwonk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.nio.BufferUnderflowException;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    public static boolean iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar) {
        return zoijcleaow(false, ppxfxbqfkfVar);
    }

    public static boolean zoijcleaow(boolean z13, ppxfxbqfkf ppxfxbqfkfVar) {
        Boolean bool;
        try {
            bool = (Boolean) ppxfxbqfkfVar.zoijcleaow(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e13) {
            if (androidx.camera.camera2.internal.compat.quirk.zoijcleaow.zoijcleaow(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                sopmlzcsov.iobyxmoadg("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                sopmlzcsov.wkgbmnqykc("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e13);
            }
            if (z13) {
                throw e13;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            sopmlzcsov.draadjrbmk("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
