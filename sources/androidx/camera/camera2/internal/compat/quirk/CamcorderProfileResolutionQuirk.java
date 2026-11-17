package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import istkbnxepw.vipkmwdibw;
import java.util.List;
import zdlpuopuiu.pmvmpeiblj;
import zdlpuopuiu.tzroggbefp;

/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tzroggbefp f3622iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f3623zoijcleaow = null;

    public CamcorderProfileResolutionQuirk(pmvmpeiblj pmvmpeibljVar) {
        this.f3622iobyxmoadg = pmvmpeibljVar.ppxfxbqfkf();
    }

    static boolean ppxfxbqfkf(pmvmpeiblj pmvmpeibljVar) {
        Integer num = (Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }
}
