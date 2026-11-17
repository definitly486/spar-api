package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.cqumvgiudr;
import androidx.lifecycle.pmvmpeiblj;
import istkbnxepw.iwizpuwonk;
import istkbnxepw.jyumaefscl;
import java.util.concurrent.atomic.AtomicReference;
import lereixgezr.cllcsxoeiz;
import lereixgezr.metgxyhuhe;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;
import lereixgezr.uawqvzlxes;
import lereixgezr.vipkmwdibw;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final ppxfxbqfkf f4098wwaezpbzkn = ppxfxbqfkf.PERFORMANCE;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private MotionEvent f4099cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    boolean f4100cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    final pmvmpeiblj f4101esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final View.OnLayoutChangeListener f4102iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    jyumaefscl f4103istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final androidx.camera.view.eablkybsjg f4104iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final mbcevpiqjq.gxszxtbevo f4105jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    final AtomicReference f4106lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    final metgxyhuhe.ppxfxbqfkf f4107lmojexxdyd;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    btonecajqb f4108pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final zoijcleaow f4109yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    dxjokdxxww f4110yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    ppxfxbqfkf f4111zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final ntlheqmsrt.iobyxmoadg f4112zynmafqrjb;

    public enum eablkybsjg {
        IDLE,
        STREAMING
    }

    class iobyxmoadg implements metgxyhuhe.ppxfxbqfkf {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void eablkybsjg(tbqsvytpvh tbqsvytpvhVar) {
            PreviewView.this.f4107lmojexxdyd.iobyxmoadg(tbqsvytpvhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void gxszxtbevo(iwizpuwonk iwizpuwonkVar, tbqsvytpvh tbqsvytpvhVar, tbqsvytpvh.nufgyqmvbu nufgyqmvbuVar) {
            PreviewView previewView;
            dxjokdxxww dxjokdxxwwVar;
            sopmlzcsov.iobyxmoadg("PreviewView", "Preview transformation info updated. " + nufgyqmvbuVar);
            PreviewView.this.f4104iwizpuwonk.oxmwwwfdhm(nufgyqmvbuVar, tbqsvytpvhVar.ojitshcjhn(), iwizpuwonkVar.wflxmlrfwp().ppxfxbqfkf() == 0);
            if (nufgyqmvbuVar.wkgbmnqykc() == -1 || ((dxjokdxxwwVar = (previewView = PreviewView.this).f4110yggfygwlhe) != null && (dxjokdxxwwVar instanceof agtfadlqog))) {
                PreviewView.this.f4100cqumvgiudr = true;
            } else {
                previewView.f4100cqumvgiudr = false;
            }
            PreviewView.this.eablkybsjg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lqeggnwhkg(androidx.camera.view.wkgbmnqykc wkgbmnqykcVar, iwizpuwonk iwizpuwonkVar) {
            if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(PreviewView.this.f4106lereixgezr, wkgbmnqykcVar, null)) {
                wkgbmnqykcVar.wflxmlrfwp(eablkybsjg.IDLE);
            }
            wkgbmnqykcVar.lqeggnwhkg();
            iwizpuwonkVar.rgvfuqvkyq().iobyxmoadg(wkgbmnqykcVar);
        }

        @Override // lereixgezr.metgxyhuhe.ppxfxbqfkf
        public void iobyxmoadg(final tbqsvytpvh tbqsvytpvhVar) {
            dxjokdxxww agtfadlqogVar;
            if (!cdpycssgdh.rgvfuqvkyq.ppxfxbqfkf()) {
                androidx.core.content.iobyxmoadg.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.gxszxtbevo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4163zdlpuopuiu.eablkybsjg(tbqsvytpvhVar);
                    }
                });
                return;
            }
            sopmlzcsov.iobyxmoadg("PreviewView", "Surface requested by Preview.");
            final iwizpuwonk iwizpuwonkVarDraadjrbmk = tbqsvytpvhVar.draadjrbmk();
            PreviewView.this.f4103istkbnxepw = iwizpuwonkVarDraadjrbmk.wflxmlrfwp();
            PreviewView.this.f4108pmvmpeiblj.lqeggnwhkg(iwizpuwonkVarDraadjrbmk.gxszxtbevo().zoijcleaow());
            tbqsvytpvhVar.istkbnxepw(androidx.core.content.iobyxmoadg.getMainExecutor(PreviewView.this.getContext()), new tbqsvytpvh.dxjokdxxww() { // from class: androidx.camera.view.lqeggnwhkg
                @Override // lereixgezr.tbqsvytpvh.dxjokdxxww
                public final void iobyxmoadg(tbqsvytpvh.nufgyqmvbu nufgyqmvbuVar) {
                    this.f4170iobyxmoadg.gxszxtbevo(iwizpuwonkVarDraadjrbmk, tbqsvytpvhVar, nufgyqmvbuVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.gxszxtbevo(previewView.f4110yggfygwlhe, tbqsvytpvhVar, previewView.f4111zdlpuopuiu)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.lqeggnwhkg(tbqsvytpvhVar, previewView2.f4111zdlpuopuiu)) {
                    PreviewView previewView3 = PreviewView.this;
                    agtfadlqogVar = new zdlpuopuiu(previewView3, previewView3.f4104iwizpuwonk);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    agtfadlqogVar = new agtfadlqog(previewView4, previewView4.f4104iwizpuwonk);
                }
                previewView2.f4110yggfygwlhe = agtfadlqogVar;
            }
            jyumaefscl jyumaefsclVarWflxmlrfwp = iwizpuwonkVarDraadjrbmk.wflxmlrfwp();
            PreviewView previewView5 = PreviewView.this;
            final androidx.camera.view.wkgbmnqykc wkgbmnqykcVar = new androidx.camera.view.wkgbmnqykc(jyumaefsclVarWflxmlrfwp, previewView5.f4101esjtqupxsv, previewView5.f4110yggfygwlhe);
            PreviewView.this.f4106lereixgezr.set(wkgbmnqykcVar);
            iwizpuwonkVarDraadjrbmk.rgvfuqvkyq().zoijcleaow(androidx.core.content.iobyxmoadg.getMainExecutor(PreviewView.this.getContext()), wkgbmnqykcVar);
            PreviewView.this.f4110yggfygwlhe.lqeggnwhkg(tbqsvytpvhVar, new dxjokdxxww.iobyxmoadg() { // from class: androidx.camera.view.nufgyqmvbu
                @Override // androidx.camera.view.dxjokdxxww.iobyxmoadg
                public final void iobyxmoadg() {
                    this.f4173iobyxmoadg.lqeggnwhkg(wkgbmnqykcVar, iwizpuwonkVarDraadjrbmk);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f4105jyumaefscl) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f4105jyumaefscl);
            }
            PreviewView.this.getClass();
        }
    }

    public enum ppxfxbqfkf {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f4120zdlpuopuiu;

        ppxfxbqfkf(int i13) {
            this.f4120zdlpuopuiu = i13;
        }

        static ppxfxbqfkf wkgbmnqykc(int i13) {
            for (ppxfxbqfkf ppxfxbqfkfVar : values()) {
                if (ppxfxbqfkfVar.f4120zdlpuopuiu == i13) {
                    return ppxfxbqfkfVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i13);
        }

        int lqeggnwhkg() {
            return this.f4120zdlpuopuiu;
        }
    }

    public enum wkgbmnqykc {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f4128zdlpuopuiu;

        wkgbmnqykc(int i13) {
            this.f4128zdlpuopuiu = i13;
        }

        static wkgbmnqykc wkgbmnqykc(int i13) {
            for (wkgbmnqykc wkgbmnqykcVar : values()) {
                if (wkgbmnqykcVar.f4128zdlpuopuiu == i13) {
                    return wkgbmnqykcVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i13);
        }

        int lqeggnwhkg() {
            return this.f4128zdlpuopuiu;
        }
    }

    class zoijcleaow implements DisplayManager.DisplayListener {
        zoijcleaow() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i13) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i13) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i13) {
                return;
            }
            PreviewView.this.eablkybsjg();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i13) {
        }
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void dxjokdxxww() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f4109yadqdtsiqt);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private cllcsxoeiz.gxszxtbevo getScreenFlashInternal() {
        return this.f4105jyumaefscl.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i13 = 1;
        if (iOrdinal != 1) {
            i13 = 2;
            if (iOrdinal != 2) {
                i13 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i13;
    }

    static boolean gxszxtbevo(dxjokdxxww dxjokdxxwwVar, tbqsvytpvh tbqsvytpvhVar, ppxfxbqfkf ppxfxbqfkfVar) {
        return (dxjokdxxwwVar instanceof agtfadlqog) && !lqeggnwhkg(tbqsvytpvhVar, ppxfxbqfkfVar);
    }

    static boolean lqeggnwhkg(tbqsvytpvh tbqsvytpvhVar, ppxfxbqfkf ppxfxbqfkfVar) {
        boolean zEquals = tbqsvytpvhVar.draadjrbmk().wflxmlrfwp().wflxmlrfwp().equals("androidx.camera.camera2.legacy");
        boolean z13 = (androidx.camera.view.internal.compat.quirk.iobyxmoadg.zoijcleaow(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.iobyxmoadg.zoijcleaow(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z13) {
            return true;
        }
        int iOrdinal = ppxfxbqfkfVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + ppxfxbqfkfVar);
    }

    private void nufgyqmvbu() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f4109yadqdtsiqt, new Handler(Looper.getMainLooper()));
    }

    private void setScreenFlashUiInfo(cllcsxoeiz.gxszxtbevo gxszxtbevoVar) {
        sopmlzcsov.iobyxmoadg("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wkgbmnqykc(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        if (i15 - i13 == i19 - i17 && i16 - i14 == i23 - i18) {
            return;
        }
        eablkybsjg();
        zoijcleaow(true);
    }

    private void zoijcleaow(boolean z13) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        getViewPort();
    }

    void btonecajqb() {
        Display display;
        jyumaefscl jyumaefsclVar;
        if (!this.f4100cqumvgiudr || (display = getDisplay()) == null || (jyumaefsclVar = this.f4103istkbnxepw) == null) {
            return;
        }
        this.f4104iwizpuwonk.ojitshcjhn(jyumaefsclVar.agtfadlqog(display.getRotation()), display.getRotation());
    }

    void eablkybsjg() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (this.f4110yggfygwlhe != null) {
            btonecajqb();
            this.f4110yggfygwlhe.nufgyqmvbu();
        }
        this.f4108pmvmpeiblj.gxszxtbevo(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        dxjokdxxww dxjokdxxwwVar = this.f4110yggfygwlhe;
        if (dxjokdxxwwVar == null) {
            return null;
        }
        return dxjokdxxwwVar.iobyxmoadg();
    }

    public mbcevpiqjq.iobyxmoadg getController() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        return null;
    }

    public ppxfxbqfkf getImplementationMode() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        return this.f4111zdlpuopuiu;
    }

    public vipkmwdibw getMeteringPointFactory() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        return this.f4108pmvmpeiblj;
    }

    public sopmlzcsov.iobyxmoadg getOutputTransform() {
        Matrix matrixBtonecajqb;
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        try {
            matrixBtonecajqb = this.f4104iwizpuwonk.btonecajqb(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixBtonecajqb = null;
        }
        Rect rectDxjokdxxww = this.f4104iwizpuwonk.dxjokdxxww();
        if (matrixBtonecajqb == null || rectDxjokdxxww == null) {
            sopmlzcsov.iobyxmoadg("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixBtonecajqb.preConcat(cdpycssgdh.vdvldrhtss.zoijcleaow(rectDxjokdxxww));
        if (this.f4110yggfygwlhe instanceof zdlpuopuiu) {
            matrixBtonecajqb.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            sopmlzcsov.draadjrbmk("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new sopmlzcsov.iobyxmoadg(matrixBtonecajqb, new Size(rectDxjokdxxww.width(), rectDxjokdxxww.height()));
    }

    public cqumvgiudr getPreviewStreamState() {
        return this.f4101esjtqupxsv;
    }

    public wkgbmnqykc getScaleType() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        return this.f4104iwizpuwonk.lqeggnwhkg();
    }

    public cllcsxoeiz.gxszxtbevo getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f4104iwizpuwonk.nufgyqmvbu(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public metgxyhuhe.ppxfxbqfkf getSurfaceProvider() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        return this.f4107lmojexxdyd;
    }

    public uawqvzlxes getViewPort() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (getDisplay() == null) {
            return null;
        }
        return ppxfxbqfkf(getDisplay().getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        nufgyqmvbu();
        addOnLayoutChangeListener(this.f4102iozdgvuglv);
        dxjokdxxww dxjokdxxwwVar = this.f4110yggfygwlhe;
        if (dxjokdxxwwVar != null) {
            dxjokdxxwwVar.wkgbmnqykc();
        }
        zoijcleaow(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f4102iozdgvuglv);
        dxjokdxxww dxjokdxxwwVar = this.f4110yggfygwlhe;
        if (dxjokdxxwwVar != null) {
            dxjokdxxwwVar.eablkybsjg();
        }
        dxjokdxxww();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f4099cdpycssgdh = null;
        return super.performClick();
    }

    public uawqvzlxes ppxfxbqfkf(int i13) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new uawqvzlxes.iobyxmoadg(new Rational(getWidth(), getHeight()), i13).ppxfxbqfkf(getViewPortScaleType()).zoijcleaow(getLayoutDirection()).iobyxmoadg();
    }

    public void setController(mbcevpiqjq.iobyxmoadg iobyxmoadgVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        zoijcleaow(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(ppxfxbqfkf ppxfxbqfkfVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f4111zdlpuopuiu = ppxfxbqfkfVar;
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkf.PERFORMANCE;
    }

    public void setScaleType(wkgbmnqykc wkgbmnqykcVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f4104iwizpuwonk.vdvldrhtss(wkgbmnqykcVar);
        eablkybsjg();
        zoijcleaow(false);
    }

    public void setScreenFlashOverlayColor(int i13) {
        this.f4105jyumaefscl.setBackgroundColor(i13);
    }

    public void setScreenFlashWindow(Window window) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        this.f4105jyumaefscl.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        ppxfxbqfkf ppxfxbqfkfVar = f4098wwaezpbzkn;
        this.f4111zdlpuopuiu = ppxfxbqfkfVar;
        androidx.camera.view.eablkybsjg eablkybsjgVar = new androidx.camera.view.eablkybsjg();
        this.f4104iwizpuwonk = eablkybsjgVar;
        this.f4100cqumvgiudr = true;
        this.f4101esjtqupxsv = new pmvmpeiblj(eablkybsjg.IDLE);
        this.f4106lereixgezr = new AtomicReference();
        this.f4108pmvmpeiblj = new btonecajqb(eablkybsjgVar);
        this.f4109yadqdtsiqt = new zoijcleaow();
        this.f4102iozdgvuglv = new View.OnLayoutChangeListener() { // from class: mbcevpiqjq.zoijcleaow
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i23, int i24, int i25) {
                this.f66787iobyxmoadg.wkgbmnqykc(view, i15, i16, i17, i18, i19, i23, i24, i25);
            }
        };
        this.f4107lmojexxdyd = new iobyxmoadg();
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, mbcevpiqjq.eablkybsjg.PreviewView, i13, i14);
        jhduphickx.sflfametgt(this, context, mbcevpiqjq.eablkybsjg.PreviewView, attributeSet, typedArrayObtainStyledAttributes, i13, i14);
        try {
            setScaleType(wkgbmnqykc.wkgbmnqykc(typedArrayObtainStyledAttributes.getInteger(mbcevpiqjq.eablkybsjg.PreviewView_scaleType, eablkybsjgVar.lqeggnwhkg().lqeggnwhkg())));
            setImplementationMode(ppxfxbqfkf.wkgbmnqykc(typedArrayObtainStyledAttributes.getInteger(mbcevpiqjq.eablkybsjg.PreviewView_implementationMode, ppxfxbqfkfVar.lqeggnwhkg())));
            typedArrayObtainStyledAttributes.recycle();
            this.f4112zynmafqrjb = new ntlheqmsrt.iobyxmoadg(context, new ntlheqmsrt.iobyxmoadg.zoijcleaow() { // from class: mbcevpiqjq.ppxfxbqfkf
            });
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.iobyxmoadg.getColor(getContext(), R.color.black));
            }
            mbcevpiqjq.gxszxtbevo gxszxtbevoVar = new mbcevpiqjq.gxszxtbevo(context);
            this.f4105jyumaefscl = gxszxtbevoVar;
            gxszxtbevoVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
