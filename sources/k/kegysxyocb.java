package k;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import h.metgxyhuhe;
import h.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public final class kegysxyocb extends View {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final zoijcleaow f53200cdpycssgdh = new zoijcleaow(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final ViewOutlineProvider f53201yadqdtsiqt = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private Outline f53202cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f53203esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private ppxfxbqfkf f53204istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f53205iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final j.iobyxmoadg f53206jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private w0.wkgbmnqykc f53207lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private w0.zdlpuopuiu f53208pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final rlfsiqarku f53209yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final View f53210zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private tg.draadjrbmk f53211zynmafqrjb;

    public static final class iobyxmoadg extends ViewOutlineProvider {
        iobyxmoadg() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof kegysxyocb) || (outline2 = ((kegysxyocb) view).f53202cqumvgiudr) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public kegysxyocb(View view, rlfsiqarku rlfsiqarkuVar, j.iobyxmoadg iobyxmoadgVar) {
        super(view.getContext());
        this.f53210zdlpuopuiu = view;
        this.f53209yggfygwlhe = rlfsiqarkuVar;
        this.f53206jyumaefscl = iobyxmoadgVar;
        setOutlineProvider(f53201yadqdtsiqt);
        this.f53203esjtqupxsv = true;
        this.f53207lereixgezr = j.eablkybsjg.iobyxmoadg();
        this.f53208pmvmpeiblj = w0.zdlpuopuiu.Ltr;
        this.f53211zynmafqrjb = wkgbmnqykc.f53245iobyxmoadg.iobyxmoadg();
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        rlfsiqarku rlfsiqarkuVar = this.f53209yggfygwlhe;
        Canvas canvasIobyxmoadg = rlfsiqarkuVar.iobyxmoadg().iobyxmoadg();
        rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvas);
        h.cdpycssgdh cdpycssgdhVarIobyxmoadg = rlfsiqarkuVar.iobyxmoadg();
        j.iobyxmoadg iobyxmoadgVar = this.f53206jyumaefscl;
        w0.wkgbmnqykc wkgbmnqykcVar = this.f53207lereixgezr;
        w0.zdlpuopuiu zdlpuopuiuVar = this.f53208pmvmpeiblj;
        float width = getWidth();
        long jWkgbmnqykc = g.gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        ppxfxbqfkf ppxfxbqfkfVar = this.f53204istkbnxepw;
        tg.draadjrbmk draadjrbmkVar = this.f53211zynmafqrjb;
        w0.wkgbmnqykc density = iobyxmoadgVar.K().getDensity();
        w0.zdlpuopuiu layoutDirection = iobyxmoadgVar.K().getLayoutDirection();
        metgxyhuhe metgxyhuheVarGxszxtbevo = iobyxmoadgVar.K().gxszxtbevo();
        long jZoijcleaow = iobyxmoadgVar.K().zoijcleaow();
        ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = iobyxmoadgVar.K().dxjokdxxww();
        j.wkgbmnqykc wkgbmnqykcVarK = iobyxmoadgVar.K();
        wkgbmnqykcVarK.ppxfxbqfkf(wkgbmnqykcVar);
        wkgbmnqykcVarK.iobyxmoadg(zdlpuopuiuVar);
        wkgbmnqykcVarK.lqeggnwhkg(cdpycssgdhVarIobyxmoadg);
        wkgbmnqykcVarK.nufgyqmvbu(jWkgbmnqykc);
        wkgbmnqykcVarK.eablkybsjg(ppxfxbqfkfVar);
        cdpycssgdhVarIobyxmoadg.jyumaefscl();
        try {
            draadjrbmkVar.invoke(iobyxmoadgVar);
            cdpycssgdhVarIobyxmoadg.agtfadlqog();
            j.wkgbmnqykc wkgbmnqykcVarK2 = iobyxmoadgVar.K();
            wkgbmnqykcVarK2.ppxfxbqfkf(density);
            wkgbmnqykcVarK2.iobyxmoadg(layoutDirection);
            wkgbmnqykcVarK2.lqeggnwhkg(metgxyhuheVarGxszxtbevo);
            wkgbmnqykcVarK2.nufgyqmvbu(jZoijcleaow);
            wkgbmnqykcVarK2.eablkybsjg(ppxfxbqfkfVarDxjokdxxww);
            rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvasIobyxmoadg);
            this.f53205iwizpuwonk = false;
        } catch (Throwable th2) {
            cdpycssgdhVarIobyxmoadg.agtfadlqog();
            j.wkgbmnqykc wkgbmnqykcVarK3 = iobyxmoadgVar.K();
            wkgbmnqykcVarK3.ppxfxbqfkf(density);
            wkgbmnqykcVarK3.iobyxmoadg(layoutDirection);
            wkgbmnqykcVarK3.lqeggnwhkg(metgxyhuheVarGxszxtbevo);
            wkgbmnqykcVarK3.nufgyqmvbu(jZoijcleaow);
            wkgbmnqykcVarK3.eablkybsjg(ppxfxbqfkfVarDxjokdxxww);
            throw th2;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f53203esjtqupxsv;
    }

    public final rlfsiqarku getCanvasHolder() {
        return this.f53209yggfygwlhe;
    }

    public final View getOwnerView() {
        return this.f53210zdlpuopuiu;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f53203esjtqupxsv;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.f53205iwizpuwonk) {
            return;
        }
        this.f53205iwizpuwonk = true;
        super.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
    }

    public final boolean ppxfxbqfkf(Outline outline) {
        this.f53202cqumvgiudr = outline;
        return pkzmftpjix.f53213iobyxmoadg.iobyxmoadg(this);
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z13) {
        if (this.f53203esjtqupxsv != z13) {
            this.f53203esjtqupxsv = z13;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z13) {
        this.f53205iwizpuwonk = z13;
    }

    public final void zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar, ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar) {
        this.f53207lereixgezr = wkgbmnqykcVar;
        this.f53208pmvmpeiblj = zdlpuopuiuVar;
        this.f53211zynmafqrjb = draadjrbmkVar;
        this.f53204istkbnxepw = ppxfxbqfkfVar;
    }
}
