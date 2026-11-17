package yggfygwlhe;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f125005iobyxmoadg = new zoijcleaow();

    private zoijcleaow() {
    }

    public static final void iobyxmoadg(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg options, androidx.camera.core.impl.btonecajqb.ppxfxbqfkf priority) {
        zdlpuopuiu.btonecajqb(options, "options");
        zdlpuopuiu.btonecajqb(priority, "priority");
        if (Build.VERSION.SDK_INT >= 34) {
            options.lqeggnwhkg(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1, priority);
        }
    }
}
