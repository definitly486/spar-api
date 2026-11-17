package mbcevpiqjq;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import cdpycssgdh.rgvfuqvkyq;
import lereixgezr.cllcsxoeiz;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo extends View {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private cllcsxoeiz.gxszxtbevo f66780yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Window f66781zdlpuopuiu;

    class iobyxmoadg implements cllcsxoeiz.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private float f66782iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private ValueAnimator f66784zoijcleaow;

        iobyxmoadg() {
        }

        @Override // lereixgezr.cllcsxoeiz.gxszxtbevo
        public void clear() {
            sopmlzcsov.iobyxmoadg("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
            ValueAnimator valueAnimator = this.f66784zoijcleaow;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f66784zoijcleaow = null;
            }
            gxszxtbevo.this.setAlpha(0.0f);
            gxszxtbevo.this.setBrightness(this.f66782iobyxmoadg);
        }
    }

    public gxszxtbevo(Context context) {
        this(context, null);
    }

    private float getBrightness() {
        Window window = this.f66781zdlpuopuiu;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        sopmlzcsov.ppxfxbqfkf("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f13) {
        if (this.f66781zdlpuopuiu == null) {
            sopmlzcsov.ppxfxbqfkf("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f13)) {
            sopmlzcsov.ppxfxbqfkf("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f66781zdlpuopuiu.getAttributes();
        attributes.screenBrightness = f13;
        this.f66781zdlpuopuiu.setAttributes(attributes);
        sopmlzcsov.iobyxmoadg("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        sopmlzcsov.iobyxmoadg("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    private void zoijcleaow(Window window) {
        if (this.f66781zdlpuopuiu != window) {
            this.f66780yggfygwlhe = window == null ? null : new iobyxmoadg();
        }
    }

    public cllcsxoeiz.gxszxtbevo getScreenFlash() {
        return this.f66780yggfygwlhe;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(mbcevpiqjq.iobyxmoadg iobyxmoadgVar) {
        rgvfuqvkyq.iobyxmoadg();
    }

    public void setScreenFlashWindow(Window window) {
        rgvfuqvkyq.iobyxmoadg();
        zoijcleaow(window);
        this.f66781zdlpuopuiu = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public gxszxtbevo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public gxszxtbevo(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public gxszxtbevo(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
