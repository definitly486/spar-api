package kcexrzcfyt;

import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
class ulzqkzuiru {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Executor f55026eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ScheduledExecutorService f55027gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f55028iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f55029lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f55030nufgyqmvbu = 1;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f55031ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final istkbnxepw.jztzpxfvev f55032wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwizpuwonk.lereixgezr f55033zoijcleaow;

    ulzqkzuiru(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, istkbnxepw.jztzpxfvev jztzpxfvevVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f55028iobyxmoadg = zdlpuopuiuVar;
        Integer num = (Integer) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f55029lqeggnwhkg = num != null && num.intValue() == 2;
        this.f55026eablkybsjg = executor;
        this.f55027gxszxtbevo = scheduledExecutorService;
        this.f55032wkgbmnqykc = jztzpxfvevVar;
        this.f55033zoijcleaow = new iwizpuwonk.lereixgezr(jztzpxfvevVar);
        this.f55031ppxfxbqfkf = iwizpuwonk.lqeggnwhkg.iobyxmoadg(new stevsuqkhv(pmvmpeibljVar));
    }

    public void iobyxmoadg(int i13) {
        this.f55030nufgyqmvbu = i13;
    }
}
