package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import istkbnxepw.vipkmwdibw;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Range f3621iobyxmoadg;

    public AeFpsRangeLegacyQuirk(pmvmpeiblj pmvmpeibljVar) {
        this.f3621iobyxmoadg = gxszxtbevo((Range[]) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    static boolean eablkybsjg(pmvmpeiblj pmvmpeibljVar) {
        Integer num = (Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range gxszxtbevo(Range[] rangeArr) {
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range rangePpxfxbqfkf = ppxfxbqfkf(range2);
                if (((Integer) rangePpxfxbqfkf.getUpper()).intValue() == 30 && (range == null || ((Integer) rangePpxfxbqfkf.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangePpxfxbqfkf;
                }
            }
        }
        return range;
    }

    private Range ppxfxbqfkf(Range range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    public Range wkgbmnqykc() {
        return this.f3621iobyxmoadg;
    }
}
