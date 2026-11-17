package yggfygwlhe;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import lereixgezr.iwizpuwonk;
import zdlpuopuiu.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iobyxmoadg f124988iobyxmoadg;

    interface iobyxmoadg {
        DynamicRangeProfiles iobyxmoadg();

        Set ppxfxbqfkf(iwizpuwonk iwizpuwonkVar);

        Set zoijcleaow();
    }

    lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        this.f124988iobyxmoadg = iobyxmoadgVar;
    }

    public static lqeggnwhkg eablkybsjg(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        u1.nufgyqmvbu.dxjokdxxww(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new lqeggnwhkg(new nufgyqmvbu(dynamicRangeProfiles));
    }

    public static lqeggnwhkg iobyxmoadg(pmvmpeiblj pmvmpeibljVar) {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = Build.VERSION.SDK_INT >= 33 ? eablkybsjg(gxszxtbevo.iobyxmoadg(pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return lqeggnwhkgVarEablkybsjg == null ? dxjokdxxww.f124985iobyxmoadg : lqeggnwhkgVarEablkybsjg;
    }

    public Set ppxfxbqfkf() {
        return this.f124988iobyxmoadg.zoijcleaow();
    }

    public DynamicRangeProfiles wkgbmnqykc() {
        u1.nufgyqmvbu.dxjokdxxww(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f124988iobyxmoadg.iobyxmoadg();
    }

    public Set zoijcleaow(iwizpuwonk iwizpuwonkVar) {
        return this.f124988iobyxmoadg.ppxfxbqfkf(iwizpuwonkVar);
    }
}
