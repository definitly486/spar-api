package k;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import h.bfopjjpdmp;
import h.krqnebusok;
import h.metgxyhuhe;
import h.oipsdeybqn;
import h.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt implements wkgbmnqykc {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private long f53254agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final j.iobyxmoadg f53255btonecajqb;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private float f53256cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f53257cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f53258draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Picture f53259dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final kegysxyocb f53260eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f53261esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final rlfsiqarku f53262gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Resources f53263gxszxtbevo;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private long f53264iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private float f53265istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private float f53266iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f53267jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private final long f53268kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f53269lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private float f53270lmojexxdyd;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Rect f53271lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private Paint f53272nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f53273ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f53274oxmwwwfdhm;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final boolean f53275pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private float f53276pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f53277ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f53278rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f53279vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f53280wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final rlfsiqarku f53281wkgbmnqykc;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private float f53282wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private long f53283yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private androidx.compose.ui.graphics.wkgbmnqykc f53284yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private float f53285ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f53286zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.compose.ui.graphics.layer.view.iobyxmoadg f53287zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private float f53288zynmafqrjb;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final zoijcleaow f53251hcddaimhww = new zoijcleaow(null);

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private static final boolean f53253jpowsppfya = !stevsuqkhv.f53243iobyxmoadg.iobyxmoadg();

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private static final Canvas f53252hkdspvbjdz = new iobyxmoadg();

    public static final class iobyxmoadg extends Canvas {
        iobyxmoadg() {
        }

        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public yadqdtsiqt(androidx.compose.ui.graphics.layer.view.iobyxmoadg iobyxmoadgVar, long j13, rlfsiqarku rlfsiqarkuVar, j.iobyxmoadg iobyxmoadgVar2) {
        this.f53287zoijcleaow = iobyxmoadgVar;
        this.f53277ppxfxbqfkf = j13;
        this.f53281wkgbmnqykc = rlfsiqarkuVar;
        kegysxyocb kegysxyocbVar = new kegysxyocb(iobyxmoadgVar, rlfsiqarkuVar, iobyxmoadgVar2);
        this.f53260eablkybsjg = kegysxyocbVar;
        this.f53263gxszxtbevo = iobyxmoadgVar.getResources();
        this.f53271lqeggnwhkg = new Rect();
        boolean z13 = f53253jpowsppfya;
        this.f53259dxjokdxxww = z13 ? new Picture() : null;
        this.f53255btonecajqb = z13 ? new j.iobyxmoadg() : null;
        this.f53262gtknphoqwx = z13 ? new rlfsiqarku() : null;
        iobyxmoadgVar.addView(kegysxyocbVar);
        kegysxyocbVar.setClipBounds(null);
        this.f53254agtfadlqog = w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
        this.f53278rgvfuqvkyq = true;
        this.f53268kcexrzcfyt = View.generateViewId();
        this.f53286zdlpuopuiu = androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb();
        this.f53267jyumaefscl = k.zoijcleaow.f53290iobyxmoadg.iobyxmoadg();
        this.f53266iwizpuwonk = 1.0f;
        this.f53261esjtqupxsv = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        this.f53269lereixgezr = 1.0f;
        this.f53276pmvmpeiblj = 1.0f;
        oipsdeybqn.iobyxmoadg iobyxmoadgVar3 = oipsdeybqn.f38945zoijcleaow;
        this.f53283yadqdtsiqt = iobyxmoadgVar3.iobyxmoadg();
        this.f53264iozdgvuglv = iobyxmoadgVar3.iobyxmoadg();
        this.f53275pkzmftpjix = z13;
    }

    private final void crxdokpmqz() {
        Rect rect;
        if (this.f53273ojitshcjhn) {
            kegysxyocb kegysxyocbVar = this.f53260eablkybsjg;
            if (!tzroggbefp() || this.f53279vdvldrhtss) {
                rect = null;
            } else {
                rect = this.f53271lqeggnwhkg;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f53260eablkybsjg.getWidth();
                rect.bottom = this.f53260eablkybsjg.getHeight();
            }
            kegysxyocbVar.setClipBounds(rect);
        }
    }

    private final void jlmebxxoox() {
        if (ulzqkzuiru()) {
            kegysxyocb(k.zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf());
        } else {
            kegysxyocb(wflxmlrfwp());
        }
    }

    private final void kegysxyocb(int i13) {
        kegysxyocb kegysxyocbVar = this.f53260eablkybsjg;
        k.zoijcleaow.iobyxmoadg iobyxmoadgVar = k.zoijcleaow.f53290iobyxmoadg;
        boolean z13 = true;
        if (k.zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            this.f53260eablkybsjg.setLayerType(2, this.f53272nufgyqmvbu);
        } else if (k.zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            this.f53260eablkybsjg.setLayerType(0, this.f53272nufgyqmvbu);
            z13 = false;
        } else {
            this.f53260eablkybsjg.setLayerType(0, this.f53272nufgyqmvbu);
        }
        kegysxyocbVar.setCanUseCompositingLayer$ui_graphics_release(z13);
    }

    private final Paint mbcevpiqjq() {
        Paint paint = this.f53272nufgyqmvbu;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.f53272nufgyqmvbu = paint2;
        return paint2;
    }

    private final void ntlheqmsrt() {
        try {
            rlfsiqarku rlfsiqarkuVar = this.f53281wkgbmnqykc;
            Canvas canvas = f53252hkdspvbjdz;
            Canvas canvasIobyxmoadg = rlfsiqarkuVar.iobyxmoadg().iobyxmoadg();
            rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvas);
            h.cdpycssgdh cdpycssgdhVarIobyxmoadg = rlfsiqarkuVar.iobyxmoadg();
            androidx.compose.ui.graphics.layer.view.iobyxmoadg iobyxmoadgVar = this.f53287zoijcleaow;
            kegysxyocb kegysxyocbVar = this.f53260eablkybsjg;
            iobyxmoadgVar.iobyxmoadg(cdpycssgdhVarIobyxmoadg, kegysxyocbVar, kegysxyocbVar.getDrawingTime());
            rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvasIobyxmoadg);
        } catch (ClassCastException unused) {
        }
    }

    private final boolean sopmlzcsov() {
        return (androidx.compose.ui.graphics.ppxfxbqfkf.yadqdtsiqt(lqeggnwhkg(), androidx.compose.ui.graphics.ppxfxbqfkf.f6357iobyxmoadg.zynmafqrjb()) && gxszxtbevo() == null) ? false : true;
    }

    private final boolean ulzqkzuiru() {
        return k.zoijcleaow.eablkybsjg(wflxmlrfwp(), k.zoijcleaow.f53290iobyxmoadg.ppxfxbqfkf()) || sopmlzcsov();
    }

    @Override // k.wkgbmnqykc
    public void agtfadlqog(int i13, int i14, long j13) {
        if (w0.oxmwwwfdhm.eablkybsjg(this.f53254agtfadlqog, j13)) {
            int i15 = this.f53258draadjrbmk;
            if (i15 != i13) {
                this.f53260eablkybsjg.offsetLeftAndRight(i13 - i15);
            }
            int i16 = this.f53280wflxmlrfwp;
            if (i16 != i14) {
                this.f53260eablkybsjg.offsetTopAndBottom(i14 - i16);
            }
        } else {
            if (tzroggbefp()) {
                this.f53273ojitshcjhn = true;
            }
            int i17 = (int) (j13 >> 32);
            int i18 = (int) (4294967295L & j13);
            this.f53260eablkybsjg.layout(i13, i14, i13 + i17, i14 + i18);
            this.f53254agtfadlqog = j13;
            if (this.f53257cqumvgiudr) {
                this.f53260eablkybsjg.setPivotX(i17 / 2.0f);
                this.f53260eablkybsjg.setPivotY(i18 / 2.0f);
            }
        }
        this.f53258draadjrbmk = i13;
        this.f53280wflxmlrfwp = i14;
    }

    @Override // k.wkgbmnqykc
    public float btonecajqb() {
        return this.f53285ylkuphrtab;
    }

    @Override // k.wkgbmnqykc
    public boolean cdpycssgdh() {
        return this.f53275pkzmftpjix;
    }

    @Override // k.wkgbmnqykc
    public void cllcsxoeiz(w0.wkgbmnqykc wkgbmnqykcVar, w0.zdlpuopuiu zdlpuopuiuVar, ppxfxbqfkf ppxfxbqfkfVar, tg.draadjrbmk draadjrbmkVar) {
        if (this.f53260eablkybsjg.getParent() == null) {
            this.f53287zoijcleaow.addView(this.f53260eablkybsjg);
        }
        this.f53260eablkybsjg.zoijcleaow(wkgbmnqykcVar, zdlpuopuiuVar, ppxfxbqfkfVar, draadjrbmkVar);
        if (this.f53260eablkybsjg.isAttachedToWindow()) {
            this.f53260eablkybsjg.setVisibility(4);
            this.f53260eablkybsjg.setVisibility(0);
            ntlheqmsrt();
            Picture picture = this.f53259dxjokdxxww;
            if (picture != null) {
                long j13 = this.f53254agtfadlqog;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j13 >> 32), (int) (j13 & 4294967295L));
                try {
                    rlfsiqarku rlfsiqarkuVar = this.f53262gtknphoqwx;
                    if (rlfsiqarkuVar != null) {
                        Canvas canvasIobyxmoadg = rlfsiqarkuVar.iobyxmoadg().iobyxmoadg();
                        rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvasBeginRecording);
                        h.cdpycssgdh cdpycssgdhVarIobyxmoadg = rlfsiqarkuVar.iobyxmoadg();
                        j.iobyxmoadg iobyxmoadgVar = this.f53255btonecajqb;
                        if (iobyxmoadgVar != null) {
                            long jWkgbmnqykc = w0.kcexrzcfyt.wkgbmnqykc(this.f53254agtfadlqog);
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
                        rlfsiqarkuVar.iobyxmoadg().lereixgezr(canvasIobyxmoadg);
                        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                    }
                    picture.endRecording();
                } catch (Throwable th3) {
                    picture.endRecording();
                    throw th3;
                }
            }
        }
    }

    @Override // k.wkgbmnqykc
    public float cqumvgiudr() {
        return this.f53269lereixgezr;
    }

    @Override // k.wkgbmnqykc
    public void draadjrbmk(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f53283yadqdtsiqt = j13;
            ulzqkzuiru.f53244iobyxmoadg.zoijcleaow(this.f53260eablkybsjg, bfopjjpdmp.nufgyqmvbu(j13));
        }
    }

    @Override // k.wkgbmnqykc
    public void dsvhmnatus(metgxyhuhe metgxyhuheVar) {
        crxdokpmqz();
        Canvas canvasWkgbmnqykc = h.yadqdtsiqt.wkgbmnqykc(metgxyhuheVar);
        if (canvasWkgbmnqykc.isHardwareAccelerated()) {
            androidx.compose.ui.graphics.layer.view.iobyxmoadg iobyxmoadgVar = this.f53287zoijcleaow;
            kegysxyocb kegysxyocbVar = this.f53260eablkybsjg;
            iobyxmoadgVar.iobyxmoadg(metgxyhuheVar, kegysxyocbVar, kegysxyocbVar.getDrawingTime());
        } else {
            Picture picture = this.f53259dxjokdxxww;
            if (picture != null) {
                canvasWkgbmnqykc.drawPicture(picture);
            }
        }
    }

    @Override // k.wkgbmnqykc
    public float dxjokdxxww() {
        return this.f53282wwaezpbzkn;
    }

    @Override // k.wkgbmnqykc
    public void eablkybsjg(float f13) {
        this.f53266iwizpuwonk = f13;
        this.f53260eablkybsjg.setAlpha(f13);
    }

    @Override // k.wkgbmnqykc
    public void esjtqupxsv(float f13) {
        this.f53256cdpycssgdh = f13;
        this.f53260eablkybsjg.setElevation(f13);
    }

    @Override // k.wkgbmnqykc
    public void gtknphoqwx() {
        this.f53287zoijcleaow.removeViewInLayout(this.f53260eablkybsjg);
    }

    @Override // k.wkgbmnqykc
    public androidx.compose.ui.graphics.wkgbmnqykc gxszxtbevo() {
        return this.f53284yggfygwlhe;
    }

    @Override // k.wkgbmnqykc
    public void hcddaimhww(krqnebusok krqnebusokVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            crxdokpmqz.f53159iobyxmoadg.iobyxmoadg(this.f53260eablkybsjg, krqnebusokVar);
        }
    }

    @Override // k.wkgbmnqykc
    public void hkdspvbjdz(long j13) {
        this.f53261esjtqupxsv = j13;
        if ((9223372034707292159L & j13) != 9205357640488583168L) {
            this.f53257cqumvgiudr = false;
            this.f53260eablkybsjg.setPivotX(Float.intBitsToFloat((int) (j13 >> 32)));
            this.f53260eablkybsjg.setPivotY(Float.intBitsToFloat((int) (j13 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ulzqkzuiru.f53244iobyxmoadg.iobyxmoadg(this.f53260eablkybsjg);
                return;
            }
            this.f53257cqumvgiudr = true;
            this.f53260eablkybsjg.setPivotX(((int) (this.f53254agtfadlqog >> 32)) / 2.0f);
            this.f53260eablkybsjg.setPivotY(((int) (4294967295L & this.f53254agtfadlqog)) / 2.0f);
        }
    }

    @Override // k.wkgbmnqykc
    public float iobyxmoadg() {
        return this.f53266iwizpuwonk;
    }

    @Override // k.wkgbmnqykc
    public float iozdgvuglv() {
        return this.f53265istkbnxepw;
    }

    @Override // k.wkgbmnqykc
    public void istkbnxepw(float f13) {
        this.f53276pmvmpeiblj = f13;
        this.f53260eablkybsjg.setScaleY(f13);
    }

    @Override // k.wkgbmnqykc
    public void iwizpuwonk(float f13) {
        this.f53282wwaezpbzkn = f13;
        this.f53260eablkybsjg.setRotationY(f13);
    }

    @Override // k.wkgbmnqykc
    public float jpowsppfya() {
        return this.f53276pmvmpeiblj;
    }

    @Override // k.wkgbmnqykc
    public void jyumaefscl(float f13) {
        this.f53270lmojexxdyd = f13;
        this.f53260eablkybsjg.setRotationX(f13);
    }

    @Override // k.wkgbmnqykc
    public void kcexrzcfyt(long j13) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f53264iozdgvuglv = j13;
            ulzqkzuiru.f53244iobyxmoadg.ppxfxbqfkf(this.f53260eablkybsjg, bfopjjpdmp.nufgyqmvbu(j13));
        }
    }

    @Override // k.wkgbmnqykc
    public void lereixgezr(float f13) {
        this.f53285ylkuphrtab = f13;
        this.f53260eablkybsjg.setRotation(f13);
    }

    @Override // k.wkgbmnqykc
    public void lmojexxdyd(Outline outline, long j13) {
        boolean zPpxfxbqfkf = this.f53260eablkybsjg.ppxfxbqfkf(outline);
        if (tzroggbefp() && outline != null) {
            this.f53260eablkybsjg.setClipToOutline(true);
            if (this.f53274oxmwwwfdhm) {
                this.f53274oxmwwwfdhm = false;
                this.f53273ojitshcjhn = true;
            }
        }
        this.f53279vdvldrhtss = outline != null;
        if (zPpxfxbqfkf) {
            return;
        }
        this.f53260eablkybsjg.invalidate();
        ntlheqmsrt();
    }

    @Override // k.wkgbmnqykc
    public int lqeggnwhkg() {
        return this.f53286zdlpuopuiu;
    }

    @Override // k.wkgbmnqykc
    public void nufgyqmvbu(float f13) {
        this.f53265istkbnxepw = f13;
        this.f53260eablkybsjg.setTranslationY(f13);
    }

    @Override // k.wkgbmnqykc
    public void ojitshcjhn(float f13) {
        this.f53269lereixgezr = f13;
        this.f53260eablkybsjg.setScaleX(f13);
    }

    @Override // k.wkgbmnqykc
    public void pkzmftpjix(float f13) {
        this.f53288zynmafqrjb = f13;
        this.f53260eablkybsjg.setTranslationX(f13);
    }

    @Override // k.wkgbmnqykc
    public long pmvmpeiblj() {
        return this.f53264iozdgvuglv;
    }

    @Override // k.wkgbmnqykc
    public void ppxfxbqfkf(int i13) {
        this.f53286zdlpuopuiu = i13;
        mbcevpiqjq().setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.iobyxmoadg.zoijcleaow(i13)));
        jlmebxxoox();
    }

    @Override // k.wkgbmnqykc
    public float rgvfuqvkyq() {
        return this.f53260eablkybsjg.getCameraDistance() / this.f53263gxszxtbevo.getDisplayMetrics().densityDpi;
    }

    @Override // k.wkgbmnqykc
    public float stevsuqkhv() {
        return this.f53256cdpycssgdh;
    }

    public boolean tzroggbefp() {
        return this.f53274oxmwwwfdhm || this.f53260eablkybsjg.getClipToOutline();
    }

    @Override // k.wkgbmnqykc
    public void vdvldrhtss(boolean z13) {
        boolean z14 = false;
        this.f53274oxmwwwfdhm = z13 && !this.f53279vdvldrhtss;
        this.f53273ojitshcjhn = true;
        kegysxyocb kegysxyocbVar = this.f53260eablkybsjg;
        if (z13 && this.f53279vdvldrhtss) {
            z14 = true;
        }
        kegysxyocbVar.setClipToOutline(z14);
    }

    @Override // k.wkgbmnqykc
    public int wflxmlrfwp() {
        return this.f53267jyumaefscl;
    }

    @Override // k.wkgbmnqykc
    public void wkgbmnqykc(androidx.compose.ui.graphics.wkgbmnqykc wkgbmnqykcVar) {
        this.f53284yggfygwlhe = wkgbmnqykcVar;
        mbcevpiqjq().setColorFilter(wkgbmnqykcVar != null ? h.iozdgvuglv.zoijcleaow(wkgbmnqykcVar) : null);
        jlmebxxoox();
    }

    @Override // k.wkgbmnqykc
    public float wwaezpbzkn() {
        return this.f53288zynmafqrjb;
    }

    @Override // k.wkgbmnqykc
    public void wypolnanlu(int i13) {
        this.f53267jyumaefscl = i13;
        jlmebxxoox();
    }

    @Override // k.wkgbmnqykc
    public void yadqdtsiqt(boolean z13) {
        this.f53278rgvfuqvkyq = z13;
    }

    @Override // k.wkgbmnqykc
    public long yggfygwlhe() {
        return this.f53283yadqdtsiqt;
    }

    @Override // k.wkgbmnqykc
    public float ylkuphrtab() {
        return this.f53270lmojexxdyd;
    }

    @Override // k.wkgbmnqykc
    public void zdlpuopuiu(float f13) {
        this.f53260eablkybsjg.setCameraDistance(f13 * this.f53263gxszxtbevo.getDisplayMetrics().densityDpi);
    }

    @Override // k.wkgbmnqykc
    public krqnebusok zoijcleaow() {
        return null;
    }

    @Override // k.wkgbmnqykc
    public Matrix zynmafqrjb() {
        return this.f53260eablkybsjg.getMatrix();
    }

    public /* synthetic */ yadqdtsiqt(androidx.compose.ui.graphics.layer.view.iobyxmoadg iobyxmoadgVar, long j13, rlfsiqarku rlfsiqarkuVar, j.iobyxmoadg iobyxmoadgVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(iobyxmoadgVar, j13, (i13 & 4) != 0 ? new rlfsiqarku() : rlfsiqarkuVar, (i13 & 8) != 0 ? new j.iobyxmoadg() : iobyxmoadgVar2);
    }
}
