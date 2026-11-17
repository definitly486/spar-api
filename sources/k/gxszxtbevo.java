package k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import h.bfopjjpdmp;
import h.krqnebusok;
import h.metgxyhuhe;
import h.oipsdeybqn;
import h.rlfsiqarku;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo implements wkgbmnqykc {

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static boolean f53162lmojexxdyd;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f53164agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private long f53165btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private boolean f53166cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f53167cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f53168draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f53169dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final RenderNode f53170eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private float f53171esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f53172gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f53173gxszxtbevo;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f53174istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f53175iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private long f53176jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private float f53177kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f53178lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Paint f53179lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private Matrix f53180nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f53181ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f53182oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private float f53183pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rlfsiqarku f53184ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private long f53185rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f53186vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private androidx.compose.ui.graphics.wkgbmnqykc f53187wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final j.iobyxmoadg f53188wkgbmnqykc;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private boolean f53189yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f53190yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private float f53191zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f53192zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f53193zynmafqrjb;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final iobyxmoadg f53161iozdgvuglv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final AtomicBoolean f53163wwaezpbzkn = new AtomicBoolean(true);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public gxszxtbevo(View view, long j13, rlfsiqarku rlfsiqarkuVar, j.iobyxmoadg iobyxmoadgVar) {
        this.f53192zoijcleaow = j13;
        this.f53184ppxfxbqfkf = rlfsiqarkuVar;
        this.f53188wkgbmnqykc = iobyxmoadgVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.f53170eablkybsjg = renderNodeCreate;
        w0.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar2 = w0.oxmwwwfdhm.f118270zoijcleaow;
        this.f53173gxszxtbevo = iobyxmoadgVar2.iobyxmoadg();
        this.f53165btonecajqb = iobyxmoadgVar2.iobyxmoadg();
        if (f53163wwaezpbzkn.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            jlmebxxoox(renderNodeCreate);
            mbcevpiqjq();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f53162lmojexxdyd) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        zoijcleaow.iobyxmoadg iobyxmoadgVar3 = zoijcleaow.f53290iobyxmoadg;
        tzroggbefp(iobyxmoadgVar3.iobyxmoadg());
        this.f53172gtknphoqwx = iobyxmoadgVar3.iobyxmoadg();
        this.f53168draadjrbmk = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb();
        this.f53164agtfadlqog = 1.0f;
        this.f53185rgvfuqvkyq = g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        this.f53186vdvldrhtss = 1.0f;
        this.f53182oxmwwwfdhm = 1.0f;
        oipsdeybqn.iobyxmoadg iobyxmoadgVar4 = oipsdeybqn.f38945zoijcleaow;
        this.f53176jyumaefscl = iobyxmoadgVar4.iobyxmoadg();
        this.f53175iwizpuwonk = iobyxmoadgVar4.iobyxmoadg();
        this.f53183pmvmpeiblj = 8.0f;
        this.f53189yadqdtsiqt = true;
    }

    private final void crxdokpmqz() {
        if (sopmlzcsov()) {
            tzroggbefp(zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf());
        } else {
            tzroggbefp(wflxmlrfwp());
        }
    }

    private final void jlmebxxoox(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            dsvhmnatus dsvhmnatusVar = dsvhmnatus.f53160iobyxmoadg;
            dsvhmnatusVar.ppxfxbqfkf(renderNode, dsvhmnatusVar.iobyxmoadg(renderNode));
            dsvhmnatusVar.wkgbmnqykc(renderNode, dsvhmnatusVar.zoijcleaow(renderNode));
        }
    }

    private final void kegysxyocb() {
        boolean z13 = false;
        boolean z14 = ntlheqmsrt() && !this.f53169dxjokdxxww;
        if (ntlheqmsrt() && this.f53169dxjokdxxww) {
            z13 = true;
        }
        if (z14 != this.f53174istkbnxepw) {
            this.f53174istkbnxepw = z14;
            this.f53170eablkybsjg.setClipToBounds(z14);
        }
        if (z13 != this.f53166cdpycssgdh) {
            this.f53166cdpycssgdh = z13;
            this.f53170eablkybsjg.setClipToOutline(z13);
        }
    }

    private final boolean sopmlzcsov() {
        return (!zoijcleaow.eablkybsjg(wflxmlrfwp(), zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf()) && androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(lqeggnwhkg(), androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb()) && gxszxtbevo() == null) ? false : true;
    }

    private final void tzroggbefp(int i13) {
        RenderNode renderNode = this.f53170eablkybsjg;
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaow.f53290iobyxmoadg;
        if (zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f53179lqeggnwhkg);
            renderNode.setHasOverlappingRendering(true);
        } else if (zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f53179lqeggnwhkg);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f53179lqeggnwhkg);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint ulzqkzuiru() {
        Paint paint = this.f53179lqeggnwhkg;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f53179lqeggnwhkg = paint2;
        return paint2;
    }

    @Override // k.wkgbmnqykc
    public void agtfadlqog(int i13, int i14, long j13) {
        int i15 = (int) (j13 >> 32);
        int i16 = (int) (4294967295L & j13);
        this.f53170eablkybsjg.setLeftTopRightBottom(i13, i14, i13 + i15, i14 + i16);
        if (w0.oxmwwwfdhm.eablkybsjg(this.f53173gxszxtbevo, j13)) {
            return;
        }
        if (this.f53181ojitshcjhn) {
            this.f53170eablkybsjg.setPivotX(i15 / 2.0f);
            this.f53170eablkybsjg.setPivotY(i16 / 2.0f);
        }
        this.f53173gxszxtbevo = j13;
    }

    @Override // k.wkgbmnqykc
    public float btonecajqb() {
        return this.f53178lereixgezr;
    }

    @Override // k.wkgbmnqykc
    public void cllcsxoeiz(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar, ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar) {
        Canvas canvasStart = this.f53170eablkybsjg.start(Math.max((int) (this.f53173gxszxtbevo >> 32), (int) (this.f53165btonecajqb >> 32)), Math.max((int) (this.f53173gxszxtbevo & 4294967295L), (int) (this.f53165btonecajqb & 4294967295L)));
        try {
            rlfsiqarku rlfsiqarkuVar = this.f53184ppxfxbqfkf;
            Canvas canvasIobyxmoadg = rlfsiqarkuVar.iobyxmoadg().iobyxmoadg();
            rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvasStart);
            h.cdpycssgdh cdpycssgdhVarIobyxmoadg = rlfsiqarkuVar.iobyxmoadg();
            j.iobyxmoadg iobyxmoadgVar = this.f53188wkgbmnqykc;
            long jWkgbmnqykc = w0.kcexrzcfyt.wkgbmnqykc(this.f53173gxszxtbevo);
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
                this.f53170eablkybsjg.end(canvasStart);
                yadqdtsiqt(false);
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
        } catch (Throwable th3) {
            this.f53170eablkybsjg.end(canvasStart);
            throw th3;
        }
    }

    @Override // k.wkgbmnqykc
    public float cqumvgiudr() {
        return this.f53186vdvldrhtss;
    }

    @Override // k.wkgbmnqykc
    public void draadjrbmk(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f53176jyumaefscl = j13;
            dsvhmnatus.f53160iobyxmoadg.ppxfxbqfkf(this.f53170eablkybsjg, bfopjjpdmp.nufgyqmvbu(j13));
        }
    }

    @Override // k.wkgbmnqykc
    public void dsvhmnatus(metgxyhuhe metgxyhuheVar) {
        DisplayListCanvas displayListCanvasWkgbmnqykc = h.yadqdtsiqt.wkgbmnqykc(metgxyhuheVar);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(displayListCanvasWkgbmnqykc, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasWkgbmnqykc.drawRenderNode(this.f53170eablkybsjg);
    }

    @Override // k.wkgbmnqykc
    public float dxjokdxxww() {
        return this.f53171esjtqupxsv;
    }

    @Override // k.wkgbmnqykc
    public void eablkybsjg(float f13) {
        this.f53164agtfadlqog = f13;
        this.f53170eablkybsjg.setAlpha(f13);
    }

    @Override // k.wkgbmnqykc
    public void esjtqupxsv(float f13) {
        this.f53190yggfygwlhe = f13;
        this.f53170eablkybsjg.setElevation(f13);
    }

    @Override // k.wkgbmnqykc
    public void gtknphoqwx() {
        mbcevpiqjq();
    }

    @Override // k.wkgbmnqykc
    public androidx.compose.ui.graphics.wkgbmnqykc gxszxtbevo() {
        return this.f53187wflxmlrfwp;
    }

    @Override // k.wkgbmnqykc
    public void hcddaimhww(krqnebusok krqnebusokVar) {
    }

    @Override // k.wkgbmnqykc
    public void hkdspvbjdz(long j13) {
        this.f53185rgvfuqvkyq = j13;
        if ((9223372034707292159L & j13) == 9205357640488583168L) {
            this.f53181ojitshcjhn = true;
            this.f53170eablkybsjg.setPivotX(((int) (this.f53173gxszxtbevo >> 32)) / 2.0f);
            this.f53170eablkybsjg.setPivotY(((int) (4294967295L & this.f53173gxszxtbevo)) / 2.0f);
        } else {
            this.f53181ojitshcjhn = false;
            this.f53170eablkybsjg.setPivotX(Float.intBitsToFloat((int) (j13 >> 32)));
            this.f53170eablkybsjg.setPivotY(Float.intBitsToFloat((int) (j13 & 4294967295L)));
        }
    }

    @Override // k.wkgbmnqykc
    public float iobyxmoadg() {
        return this.f53164agtfadlqog;
    }

    @Override // k.wkgbmnqykc
    public float iozdgvuglv() {
        return this.f53191zdlpuopuiu;
    }

    @Override // k.wkgbmnqykc
    public void istkbnxepw(float f13) {
        this.f53182oxmwwwfdhm = f13;
        this.f53170eablkybsjg.setScaleY(f13);
    }

    @Override // k.wkgbmnqykc
    public void iwizpuwonk(float f13) {
        this.f53171esjtqupxsv = f13;
        this.f53170eablkybsjg.setRotationY(f13);
    }

    @Override // k.wkgbmnqykc
    public float jpowsppfya() {
        return this.f53182oxmwwwfdhm;
    }

    @Override // k.wkgbmnqykc
    public void jyumaefscl(float f13) {
        this.f53167cqumvgiudr = f13;
        this.f53170eablkybsjg.setRotationX(f13);
    }

    @Override // k.wkgbmnqykc
    public void kcexrzcfyt(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f53175iwizpuwonk = j13;
            dsvhmnatus.f53160iobyxmoadg.wkgbmnqykc(this.f53170eablkybsjg, bfopjjpdmp.nufgyqmvbu(j13));
        }
    }

    @Override // k.wkgbmnqykc
    public void lereixgezr(float f13) {
        this.f53178lereixgezr = f13;
        this.f53170eablkybsjg.setRotation(f13);
    }

    @Override // k.wkgbmnqykc
    public void lmojexxdyd(Outline outline, long j13) {
        this.f53165btonecajqb = j13;
        this.f53170eablkybsjg.setOutline(outline);
        this.f53169dxjokdxxww = outline != null;
        kegysxyocb();
    }

    @Override // k.wkgbmnqykc
    public int lqeggnwhkg() {
        return this.f53168draadjrbmk;
    }

    public final void mbcevpiqjq() {
        cllcsxoeiz.f53158iobyxmoadg.iobyxmoadg(this.f53170eablkybsjg);
    }

    public boolean ntlheqmsrt() {
        return this.f53193zynmafqrjb;
    }

    @Override // k.wkgbmnqykc
    public void nufgyqmvbu(float f13) {
        this.f53191zdlpuopuiu = f13;
        this.f53170eablkybsjg.setTranslationY(f13);
    }

    @Override // k.wkgbmnqykc
    public void ojitshcjhn(float f13) {
        this.f53186vdvldrhtss = f13;
        this.f53170eablkybsjg.setScaleX(f13);
    }

    @Override // k.wkgbmnqykc
    public boolean oxmwwwfdhm() {
        return this.f53170eablkybsjg.isValid();
    }

    @Override // k.wkgbmnqykc
    public void pkzmftpjix(float f13) {
        this.f53177kcexrzcfyt = f13;
        this.f53170eablkybsjg.setTranslationX(f13);
    }

    @Override // k.wkgbmnqykc
    public long pmvmpeiblj() {
        return this.f53175iwizpuwonk;
    }

    @Override // k.wkgbmnqykc
    public void ppxfxbqfkf(int i13) {
        if (androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(this.f53168draadjrbmk, i13)) {
            return;
        }
        this.f53168draadjrbmk = i13;
        ulzqkzuiru().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.iobyxmoadg.zoijcleaow(i13)));
        crxdokpmqz();
    }

    @Override // k.wkgbmnqykc
    public float rgvfuqvkyq() {
        return this.f53183pmvmpeiblj;
    }

    @Override // k.wkgbmnqykc
    public float stevsuqkhv() {
        return this.f53190yggfygwlhe;
    }

    @Override // k.wkgbmnqykc
    public void vdvldrhtss(boolean z13) {
        this.f53193zynmafqrjb = z13;
        kegysxyocb();
    }

    @Override // k.wkgbmnqykc
    public int wflxmlrfwp() {
        return this.f53172gtknphoqwx;
    }

    @Override // k.wkgbmnqykc
    public void wkgbmnqykc(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f53187wflxmlrfwp = wkgbmnqykcVar;
        if (wkgbmnqykcVar == null) {
            crxdokpmqz();
            return;
        }
        tzroggbefp(zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf());
        RenderNode renderNode = this.f53170eablkybsjg;
        Paint paintUlzqkzuiru = ulzqkzuiru();
        paintUlzqkzuiru.setColorFilter(h.iozdgvuglv.zoijcleaow(wkgbmnqykcVar));
        renderNode.setLayerPaint(paintUlzqkzuiru);
    }

    @Override // k.wkgbmnqykc
    public float wwaezpbzkn() {
        return this.f53177kcexrzcfyt;
    }

    @Override // k.wkgbmnqykc
    public void wypolnanlu(int i13) {
        this.f53172gtknphoqwx = i13;
        crxdokpmqz();
    }

    @Override // k.wkgbmnqykc
    public void yadqdtsiqt(boolean z13) {
        this.f53189yadqdtsiqt = z13;
    }

    @Override // k.wkgbmnqykc
    public long yggfygwlhe() {
        return this.f53176jyumaefscl;
    }

    @Override // k.wkgbmnqykc
    public float ylkuphrtab() {
        return this.f53167cqumvgiudr;
    }

    @Override // k.wkgbmnqykc
    public void zdlpuopuiu(float f13) {
        this.f53183pmvmpeiblj = f13;
        this.f53170eablkybsjg.setCameraDistance(-f13);
    }

    @Override // k.wkgbmnqykc
    public krqnebusok zoijcleaow() {
        return null;
    }

    @Override // k.wkgbmnqykc
    public Matrix zynmafqrjb() {
        Matrix matrix = this.f53180nufgyqmvbu;
        if (matrix == null) {
            matrix = new Matrix();
            this.f53180nufgyqmvbu = matrix;
        }
        this.f53170eablkybsjg.getMatrix(matrix);
        return matrix;
    }

    public /* synthetic */ gxszxtbevo(View view, long j13, rlfsiqarku rlfsiqarkuVar, j.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(view, j13, (i13 & 4) != 0 ? new rlfsiqarku() : rlfsiqarkuVar, (i13 & 8) != 0 ? new j.iobyxmoadg() : iobyxmoadgVar);
    }
}
