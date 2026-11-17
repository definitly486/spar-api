package k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import h.bfopjjpdmp;
import h.krqnebusok;
import h.metgxyhuhe;
import h.oipsdeybqn;
import h.rlfsiqarku;
import ikoacuggdj.wizcaqwiak;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh implements wkgbmnqykc {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private float f53130agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private float f53131btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private float f53132cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private androidx.compose.ui.graphics.wkgbmnqykc f53133draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f53134dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final RenderNode f53135eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f53136esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f53137gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f53138gxszxtbevo;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f53139istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f53140iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private float f53141jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private long f53142kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private boolean f53143lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Paint f53144lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private Matrix f53145nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private float f53146ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private float f53147oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private boolean f53148pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final rlfsiqarku f53149ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private float f53150rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private float f53151vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private long f53152wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final j.iobyxmoadg f53153wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private float f53154yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private long f53155zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f53156zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f53157zynmafqrjb;

    public cdpycssgdh(long j13, rlfsiqarku rlfsiqarkuVar, j.iobyxmoadg iobyxmoadgVar) {
        this.f53156zoijcleaow = j13;
        this.f53149ppxfxbqfkf = rlfsiqarkuVar;
        this.f53153wkgbmnqykc = iobyxmoadgVar;
        RenderNode renderNodeIobyxmoadg = wizcaqwiak.iobyxmoadg("graphicsLayer");
        this.f53135eablkybsjg = renderNodeIobyxmoadg;
        this.f53138gxszxtbevo = g.gtknphoqwx.f35588zoijcleaow.zoijcleaow();
        renderNodeIobyxmoadg.setClipToBounds(false);
        zoijcleaow.iobyxmoadg iobyxmoadgVar2 = zoijcleaow.f53290iobyxmoadg;
        tzroggbefp(renderNodeIobyxmoadg, iobyxmoadgVar2.iobyxmoadg());
        this.f53131btonecajqb = 1.0f;
        this.f53137gtknphoqwx = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb();
        this.f53152wflxmlrfwp = g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        this.f53130agtfadlqog = 1.0f;
        this.f53146ojitshcjhn = 1.0f;
        oipsdeybqn.iobyxmoadg iobyxmoadgVar3 = oipsdeybqn.f38945zoijcleaow;
        this.f53142kcexrzcfyt = iobyxmoadgVar3.iobyxmoadg();
        this.f53155zdlpuopuiu = iobyxmoadgVar3.iobyxmoadg();
        this.f53132cqumvgiudr = 8.0f;
        this.f53157zynmafqrjb = iobyxmoadgVar2.iobyxmoadg();
        this.f53139istkbnxepw = true;
    }

    private final void crxdokpmqz() {
        if (ulzqkzuiru()) {
            tzroggbefp(this.f53135eablkybsjg, zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf());
        } else {
            tzroggbefp(this.f53135eablkybsjg, wflxmlrfwp());
        }
    }

    private final void kegysxyocb() {
        boolean z13 = false;
        boolean z14 = mbcevpiqjq() && !this.f53134dxjokdxxww;
        if (mbcevpiqjq() && this.f53134dxjokdxxww) {
            z13 = true;
        }
        if (z14 != this.f53143lereixgezr) {
            this.f53143lereixgezr = z14;
            this.f53135eablkybsjg.setClipToBounds(z14);
        }
        if (z13 != this.f53148pmvmpeiblj) {
            this.f53148pmvmpeiblj = z13;
            this.f53135eablkybsjg.setClipToOutline(z13);
        }
    }

    private final Paint ntlheqmsrt() {
        Paint paint = this.f53144lqeggnwhkg;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f53144lqeggnwhkg = paint2;
        return paint2;
    }

    private final boolean sopmlzcsov() {
        return (androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(lqeggnwhkg(), androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb()) && gxszxtbevo() == null) ? false : true;
    }

    private final void tzroggbefp(RenderNode renderNode, int i13) {
        zoijcleaow.iobyxmoadg iobyxmoadgVar = zoijcleaow.f53290iobyxmoadg;
        if (zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            renderNode.setUseCompositingLayer(true, this.f53144lqeggnwhkg);
            renderNode.setHasOverlappingRendering(true);
        } else if (zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            renderNode.setUseCompositingLayer(false, this.f53144lqeggnwhkg);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f53144lqeggnwhkg);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean ulzqkzuiru() {
        if (zoijcleaow.eablkybsjg(wflxmlrfwp(), zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf()) || sopmlzcsov()) {
            return true;
        }
        zoijcleaow();
        return false;
    }

    @Override // k.wkgbmnqykc
    public void agtfadlqog(int i13, int i14, long j13) {
        this.f53135eablkybsjg.setPosition(i13, i14, ((int) (j13 >> 32)) + i13, ((int) (4294967295L & j13)) + i14);
        this.f53138gxszxtbevo = w0.kcexrzcfyt.wkgbmnqykc(j13);
    }

    @Override // k.wkgbmnqykc
    public float btonecajqb() {
        return this.f53140iwizpuwonk;
    }

    @Override // k.wkgbmnqykc
    public void cllcsxoeiz(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar, ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f53135eablkybsjg.beginRecording();
        try {
            rlfsiqarku rlfsiqarkuVar = this.f53149ppxfxbqfkf;
            Canvas canvasIobyxmoadg = rlfsiqarkuVar.iobyxmoadg().iobyxmoadg();
            rlfsiqarkuVar.iobyxmoadg().lereixgezr(recordingCanvasBeginRecording);
            h.cdpycssgdh cdpycssgdhVarIobyxmoadg = rlfsiqarkuVar.iobyxmoadg();
            j.wkgbmnqykc wkgbmnqykcVarK = this.f53153wkgbmnqykc.K();
            wkgbmnqykcVarK.ppxfxbqfkf(wkgbmnqykcVar);
            wkgbmnqykcVarK.iobyxmoadg(zdlpuopuiuVar);
            wkgbmnqykcVarK.eablkybsjg(ppxfxbqfkfVar);
            wkgbmnqykcVarK.nufgyqmvbu(this.f53138gxszxtbevo);
            wkgbmnqykcVarK.lqeggnwhkg(cdpycssgdhVarIobyxmoadg);
            draadjrbmkVar.invoke(this.f53153wkgbmnqykc);
            rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvasIobyxmoadg);
            this.f53135eablkybsjg.endRecording();
            yadqdtsiqt(false);
        } catch (Throwable th2) {
            this.f53135eablkybsjg.endRecording();
            throw th2;
        }
    }

    @Override // k.wkgbmnqykc
    public float cqumvgiudr() {
        return this.f53130agtfadlqog;
    }

    @Override // k.wkgbmnqykc
    public void draadjrbmk(long j13) {
        this.f53142kcexrzcfyt = j13;
        this.f53135eablkybsjg.setAmbientShadowColor(bfopjjpdmp.nufgyqmvbu(j13));
    }

    @Override // k.wkgbmnqykc
    public void dsvhmnatus(metgxyhuhe metgxyhuheVar) {
        h.yadqdtsiqt.wkgbmnqykc(metgxyhuheVar).drawRenderNode(this.f53135eablkybsjg);
    }

    @Override // k.wkgbmnqykc
    public float dxjokdxxww() {
        return this.f53141jyumaefscl;
    }

    @Override // k.wkgbmnqykc
    public void eablkybsjg(float f13) {
        this.f53131btonecajqb = f13;
        this.f53135eablkybsjg.setAlpha(f13);
    }

    @Override // k.wkgbmnqykc
    public void esjtqupxsv(float f13) {
        this.f53147oxmwwwfdhm = f13;
        this.f53135eablkybsjg.setElevation(f13);
    }

    @Override // k.wkgbmnqykc
    public void gtknphoqwx() {
        this.f53135eablkybsjg.discardDisplayList();
    }

    @Override // k.wkgbmnqykc
    public androidx.compose.ui.graphics.wkgbmnqykc gxszxtbevo() {
        return this.f53133draadjrbmk;
    }

    @Override // k.wkgbmnqykc
    public void hcddaimhww(krqnebusok krqnebusokVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            wypolnanlu.f53250iobyxmoadg.iobyxmoadg(this.f53135eablkybsjg, krqnebusokVar);
        }
    }

    @Override // k.wkgbmnqykc
    public void hkdspvbjdz(long j13) {
        this.f53152wflxmlrfwp = j13;
        if ((9223372034707292159L & j13) == 9205357640488583168L) {
            this.f53135eablkybsjg.resetPivot();
        } else {
            this.f53135eablkybsjg.setPivotX(Float.intBitsToFloat((int) (j13 >> 32)));
            this.f53135eablkybsjg.setPivotY(Float.intBitsToFloat((int) (j13 & 4294967295L)));
        }
    }

    @Override // k.wkgbmnqykc
    public float iobyxmoadg() {
        return this.f53131btonecajqb;
    }

    @Override // k.wkgbmnqykc
    public float iozdgvuglv() {
        return this.f53151vdvldrhtss;
    }

    @Override // k.wkgbmnqykc
    public void istkbnxepw(float f13) {
        this.f53146ojitshcjhn = f13;
        this.f53135eablkybsjg.setScaleY(f13);
    }

    @Override // k.wkgbmnqykc
    public void iwizpuwonk(float f13) {
        this.f53141jyumaefscl = f13;
        this.f53135eablkybsjg.setRotationY(f13);
    }

    @Override // k.wkgbmnqykc
    public float jpowsppfya() {
        return this.f53146ojitshcjhn;
    }

    @Override // k.wkgbmnqykc
    public void jyumaefscl(float f13) {
        this.f53154yggfygwlhe = f13;
        this.f53135eablkybsjg.setRotationX(f13);
    }

    @Override // k.wkgbmnqykc
    public void kcexrzcfyt(long j13) {
        this.f53155zdlpuopuiu = j13;
        this.f53135eablkybsjg.setSpotShadowColor(bfopjjpdmp.nufgyqmvbu(j13));
    }

    @Override // k.wkgbmnqykc
    public void lereixgezr(float f13) {
        this.f53140iwizpuwonk = f13;
        this.f53135eablkybsjg.setRotationZ(f13);
    }

    @Override // k.wkgbmnqykc
    public void lmojexxdyd(Outline outline, long j13) {
        this.f53135eablkybsjg.setOutline(outline);
        this.f53134dxjokdxxww = outline != null;
        kegysxyocb();
    }

    @Override // k.wkgbmnqykc
    public int lqeggnwhkg() {
        return this.f53137gtknphoqwx;
    }

    public boolean mbcevpiqjq() {
        return this.f53136esjtqupxsv;
    }

    @Override // k.wkgbmnqykc
    public void nufgyqmvbu(float f13) {
        this.f53151vdvldrhtss = f13;
        this.f53135eablkybsjg.setTranslationY(f13);
    }

    @Override // k.wkgbmnqykc
    public void ojitshcjhn(float f13) {
        this.f53130agtfadlqog = f13;
        this.f53135eablkybsjg.setScaleX(f13);
    }

    @Override // k.wkgbmnqykc
    public boolean oxmwwwfdhm() {
        return this.f53135eablkybsjg.hasDisplayList();
    }

    @Override // k.wkgbmnqykc
    public void pkzmftpjix(float f13) {
        this.f53150rgvfuqvkyq = f13;
        this.f53135eablkybsjg.setTranslationX(f13);
    }

    @Override // k.wkgbmnqykc
    public long pmvmpeiblj() {
        return this.f53155zdlpuopuiu;
    }

    @Override // k.wkgbmnqykc
    public void ppxfxbqfkf(int i13) {
        this.f53137gtknphoqwx = i13;
        ntlheqmsrt().setBlendMode(androidx.compose.ui.graphics.iobyxmoadg.iobyxmoadg(i13));
        crxdokpmqz();
    }

    @Override // k.wkgbmnqykc
    public float rgvfuqvkyq() {
        return this.f53132cqumvgiudr;
    }

    @Override // k.wkgbmnqykc
    public float stevsuqkhv() {
        return this.f53147oxmwwwfdhm;
    }

    @Override // k.wkgbmnqykc
    public void vdvldrhtss(boolean z13) {
        this.f53136esjtqupxsv = z13;
        kegysxyocb();
    }

    @Override // k.wkgbmnqykc
    public int wflxmlrfwp() {
        return this.f53157zynmafqrjb;
    }

    @Override // k.wkgbmnqykc
    public void wkgbmnqykc(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f53133draadjrbmk = wkgbmnqykcVar;
        ntlheqmsrt().setColorFilter(wkgbmnqykcVar != null ? h.iozdgvuglv.zoijcleaow(wkgbmnqykcVar) : null);
        crxdokpmqz();
    }

    @Override // k.wkgbmnqykc
    public float wwaezpbzkn() {
        return this.f53150rgvfuqvkyq;
    }

    @Override // k.wkgbmnqykc
    public void wypolnanlu(int i13) {
        this.f53157zynmafqrjb = i13;
        crxdokpmqz();
    }

    @Override // k.wkgbmnqykc
    public void yadqdtsiqt(boolean z13) {
        this.f53139istkbnxepw = z13;
    }

    @Override // k.wkgbmnqykc
    public long yggfygwlhe() {
        return this.f53142kcexrzcfyt;
    }

    @Override // k.wkgbmnqykc
    public float ylkuphrtab() {
        return this.f53154yggfygwlhe;
    }

    @Override // k.wkgbmnqykc
    public void zdlpuopuiu(float f13) {
        this.f53132cqumvgiudr = f13;
        this.f53135eablkybsjg.setCameraDistance(f13);
    }

    @Override // k.wkgbmnqykc
    public krqnebusok zoijcleaow() {
        return null;
    }

    @Override // k.wkgbmnqykc
    public Matrix zynmafqrjb() {
        Matrix matrix = this.f53145nufgyqmvbu;
        if (matrix == null) {
            matrix = new Matrix();
            this.f53145nufgyqmvbu = matrix;
        }
        this.f53135eablkybsjg.getMatrix(matrix);
        return matrix;
    }

    public /* synthetic */ cdpycssgdh(long j13, rlfsiqarku rlfsiqarkuVar, j.iobyxmoadg iobyxmoadgVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, (i13 & 2) != 0 ? new rlfsiqarku() : rlfsiqarkuVar, (i13 & 4) != 0 ? new j.iobyxmoadg() : iobyxmoadgVar);
    }
}
