package kcexrzcfyt;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f55013eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f55014gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f55015iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    boolean f55016lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f55017ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Executor f55018wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.lifecycle.pmvmpeiblj f55019zoijcleaow;

    u(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, Executor executor) {
        this.f55015iobyxmoadg = zdlpuopuiuVar;
        this.f55018wkgbmnqykc = executor;
        Objects.requireNonNull(pmvmpeibljVar);
        this.f55017ppxfxbqfkf = iwizpuwonk.lqeggnwhkg.iobyxmoadg(new stevsuqkhv(pmvmpeibljVar));
        this.f55019zoijcleaow = new androidx.lifecycle.pmvmpeiblj(0);
        zdlpuopuiuVar.oxmwwwfdhm(new zdlpuopuiu.ppxfxbqfkf() { // from class: kcexrzcfyt.t
            @Override // kcexrzcfyt.zdlpuopuiu.ppxfxbqfkf
            public final boolean iobyxmoadg(TotalCaptureResult totalCaptureResult) {
                return this.f54989iobyxmoadg.dxjokdxxww(totalCaptureResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean dxjokdxxww(TotalCaptureResult totalCaptureResult) {
        if (this.f55014gxszxtbevo != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.f55016lqeggnwhkg) {
                this.f55014gxszxtbevo.ppxfxbqfkf(null);
                this.f55014gxszxtbevo = null;
            }
        }
        return false;
    }

    private void gtknphoqwx(androidx.lifecycle.pmvmpeiblj pmvmpeibljVar, Object obj) {
        if (cdpycssgdh.rgvfuqvkyq.ppxfxbqfkf()) {
            pmvmpeibljVar.ojitshcjhn(obj);
        } else {
            pmvmpeibljVar.wflxmlrfwp(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object nufgyqmvbu(final boolean z13, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f55018wkgbmnqykc.execute(new Runnable() { // from class: kcexrzcfyt.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f54965zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar, z13);
            }
        });
        return "enableTorch: " + z13;
    }

    void btonecajqb(boolean z13) {
        if (this.f55013eablkybsjg == z13) {
            return;
        }
        this.f55013eablkybsjg = z13;
        if (z13) {
            return;
        }
        if (this.f55016lqeggnwhkg) {
            this.f55016lqeggnwhkg = false;
            this.f55015iobyxmoadg.yggfygwlhe(false);
            gtknphoqwx(this.f55019zoijcleaow, 0);
        }
        androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = this.f55014gxszxtbevo;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f55014gxszxtbevo = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public void lqeggnwhkg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar, boolean z13) {
        if (!this.f55017ppxfxbqfkf) {
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.gxszxtbevo(new IllegalStateException("No flash unit"));
            }
        } else {
            if (!this.f55013eablkybsjg) {
                gtknphoqwx(this.f55019zoijcleaow, 0);
                if (iobyxmoadgVar != null) {
                    iobyxmoadgVar.gxszxtbevo(new CameraControl.OperationCanceledException("Camera is not active."));
                    return;
                }
                return;
            }
            this.f55016lqeggnwhkg = z13;
            this.f55015iobyxmoadg.yggfygwlhe(z13);
            gtknphoqwx(this.f55019zoijcleaow, Integer.valueOf(z13 ? 1 : 0));
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2 = this.f55014gxszxtbevo;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.gxszxtbevo(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f55014gxszxtbevo = iobyxmoadgVar;
        }
    }

    androidx.lifecycle.cqumvgiudr gxszxtbevo() {
        return this.f55019zoijcleaow;
    }

    com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykc(final boolean z13) {
        if (this.f55017ppxfxbqfkf) {
            gtknphoqwx(this.f55019zoijcleaow, Integer.valueOf(z13 ? 1 : 0));
            return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: kcexrzcfyt.s
                @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
                public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                    return this.f54982iobyxmoadg.nufgyqmvbu(z13, iobyxmoadgVar);
                }
            });
        }
        lereixgezr.sopmlzcsov.iobyxmoadg("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return iozdgvuglv.gtknphoqwx.btonecajqb(new IllegalStateException("No flash unit"));
    }
}
