package kcexrzcfyt;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final zoijcleaow f55056eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zdlpuopuiu f55058iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y f55060ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final androidx.lifecycle.pmvmpeiblj f55061wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f55062zoijcleaow;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f55057gxszxtbevo = false;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private zdlpuopuiu.ppxfxbqfkf f55059lqeggnwhkg = new iobyxmoadg();

    class iobyxmoadg implements zdlpuopuiu.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // kcexrzcfyt.zdlpuopuiu.ppxfxbqfkf
        public boolean iobyxmoadg(TotalCaptureResult totalCaptureResult) {
            x.this.f55056eablkybsjg.iobyxmoadg(totalCaptureResult);
            return false;
        }
    }

    interface zoijcleaow {
        float getMaxZoom();

        float getMinZoom();

        void iobyxmoadg(TotalCaptureResult totalCaptureResult);

        void ppxfxbqfkf();

        Rect wkgbmnqykc();

        void zoijcleaow(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg);
    }

    x(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu.pmvmpeiblj pmvmpeibljVar, Executor executor) {
        this.f55058iobyxmoadg = zdlpuopuiuVar;
        this.f55062zoijcleaow = executor;
        zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow(pmvmpeibljVar);
        this.f55056eablkybsjg = zoijcleaowVarZoijcleaow;
        y yVar = new y(zoijcleaowVarZoijcleaow.getMaxZoom(), zoijcleaowVarZoijcleaow.getMinZoom());
        this.f55060ppxfxbqfkf = yVar;
        yVar.gxszxtbevo(1.0f);
        this.f55061wkgbmnqykc = new androidx.lifecycle.pmvmpeiblj(lmojexxdyd.eablkybsjg.eablkybsjg(yVar));
        zdlpuopuiuVar.oxmwwwfdhm(this.f55059lqeggnwhkg);
    }

    static boolean gxszxtbevo(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        return Build.VERSION.SDK_INT >= 30 && wkgbmnqykc(pmvmpeibljVar) != null;
    }

    private void nufgyqmvbu(lereixgezr.auzgnhcxok auzgnhcxokVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f55061wkgbmnqykc.ojitshcjhn(auzgnhcxokVar);
        } else {
            this.f55061wkgbmnqykc.wflxmlrfwp(auzgnhcxokVar);
        }
    }

    private static Range wkgbmnqykc(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        try {
            return (Range) pmvmpeibljVar.iobyxmoadg(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e13) {
            lereixgezr.sopmlzcsov.wflxmlrfwp("ZoomControl", "AssertionError, fail to get camera characteristic.", e13);
            return null;
        }
    }

    private static zoijcleaow zoijcleaow(zdlpuopuiu.pmvmpeiblj pmvmpeibljVar) {
        return gxszxtbevo(pmvmpeibljVar) ? new ppxfxbqfkf(pmvmpeibljVar) : new nuxfzjnpeb(pmvmpeibljVar);
    }

    androidx.lifecycle.cqumvgiudr eablkybsjg() {
        return this.f55061wkgbmnqykc;
    }

    void iobyxmoadg(oxmwwwfdhm.iobyxmoadg.C1637iobyxmoadg c1637iobyxmoadg) {
        this.f55056eablkybsjg.zoijcleaow(c1637iobyxmoadg);
    }

    void lqeggnwhkg(boolean z13) {
        lereixgezr.auzgnhcxok auzgnhcxokVarEablkybsjg;
        if (this.f55057gxszxtbevo == z13) {
            return;
        }
        this.f55057gxszxtbevo = z13;
        if (z13) {
            return;
        }
        synchronized (this.f55060ppxfxbqfkf) {
            this.f55060ppxfxbqfkf.gxszxtbevo(1.0f);
            auzgnhcxokVarEablkybsjg = lmojexxdyd.eablkybsjg.eablkybsjg(this.f55060ppxfxbqfkf);
        }
        nufgyqmvbu(auzgnhcxokVarEablkybsjg);
        this.f55056eablkybsjg.ppxfxbqfkf();
        this.f55058iobyxmoadg.okpsazkaxt();
    }

    Rect ppxfxbqfkf() {
        return this.f55056eablkybsjg.wkgbmnqykc();
    }
}
