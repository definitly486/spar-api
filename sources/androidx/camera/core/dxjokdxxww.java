package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.core.os.OperationCanceledException;
import istkbnxepw.cllcsxoeiz;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import lereixgezr.ntlheqmsrt;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
abstract class dxjokdxxww implements cllcsxoeiz.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    ByteBuffer f3665agtfadlqog;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private ImageWriter f3668dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private volatile boolean f3669eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private volatile boolean f3671gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private gxszxtbevo.iobyxmoadg f3672iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private Executor f3674lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private vdvldrhtss f3675nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    ByteBuffer f3676ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile int f3678ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    ByteBuffer f3679rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    ByteBuffer f3680vdvldrhtss;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private volatile int f3683zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private volatile int f3682wkgbmnqykc = 1;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private Rect f3666btonecajqb = new Rect();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private Rect f3670gtknphoqwx = new Rect();

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private Matrix f3667draadjrbmk = new Matrix();

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private Matrix f3681wflxmlrfwp = new Matrix();

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private final Object f3677oxmwwwfdhm = new Object();

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    protected boolean f3673kcexrzcfyt = true;

    dxjokdxxww() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object agtfadlqog(Executor executor, final agtfadlqog agtfadlqogVar, final Matrix matrix, final agtfadlqog agtfadlqogVar2, final Rect rect, final gxszxtbevo.iobyxmoadg iobyxmoadgVar, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.nufgyqmvbu
            @Override // java.lang.Runnable
            public final void run() {
                this.f3948zdlpuopuiu.wflxmlrfwp(agtfadlqogVar, matrix, agtfadlqogVar2, rect, iobyxmoadgVar, iobyxmoadgVar2);
            }
        });
        return "analyzeImage";
    }

    static Rect draadjrbmk(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static vdvldrhtss dxjokdxxww(int i13, int i14, int i15, int i16, int i17) {
        boolean z13 = i15 == 90 || i15 == 270;
        int i18 = z13 ? i14 : i13;
        if (!z13) {
            i13 = i14;
        }
        return new vdvldrhtss(ojitshcjhn.iobyxmoadg(i18, i13, i16, i17));
    }

    static Matrix gtknphoqwx(int i13, int i14, int i15, int i16, int i17) {
        Matrix matrix = new Matrix();
        if (i17 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i13, i14), cdpycssgdh.vdvldrhtss.f19743iobyxmoadg, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i17);
            matrix.postConcat(cdpycssgdh.vdvldrhtss.ppxfxbqfkf(new RectF(0.0f, 0.0f, i15, i16)));
        }
        return matrix;
    }

    private void nufgyqmvbu(agtfadlqog agtfadlqogVar) {
        if (this.f3682wkgbmnqykc != 1) {
            if (this.f3682wkgbmnqykc == 2 && this.f3665agtfadlqog == null) {
                this.f3665agtfadlqog = ByteBuffer.allocateDirect(agtfadlqogVar.getWidth() * agtfadlqogVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f3676ojitshcjhn == null) {
            this.f3676ojitshcjhn = ByteBuffer.allocateDirect(agtfadlqogVar.getWidth() * agtfadlqogVar.getHeight());
        }
        this.f3676ojitshcjhn.position(0);
        if (this.f3679rgvfuqvkyq == null) {
            this.f3679rgvfuqvkyq = ByteBuffer.allocateDirect((agtfadlqogVar.getWidth() * agtfadlqogVar.getHeight()) / 4);
        }
        this.f3679rgvfuqvkyq.position(0);
        if (this.f3680vdvldrhtss == null) {
            this.f3680vdvldrhtss = ByteBuffer.allocateDirect((agtfadlqogVar.getWidth() * agtfadlqogVar.getHeight()) / 4);
        }
        this.f3680vdvldrhtss.position(0);
    }

    private void rgvfuqvkyq(int i13, int i14, int i15, int i16) {
        Matrix matrixGtknphoqwx = gtknphoqwx(i13, i14, i15, i16, this.f3683zoijcleaow);
        this.f3670gtknphoqwx = draadjrbmk(this.f3666btonecajqb, matrixGtknphoqwx);
        this.f3681wflxmlrfwp.setConcat(this.f3667draadjrbmk, matrixGtknphoqwx);
    }

    private void vdvldrhtss(agtfadlqog agtfadlqogVar, int i13) {
        vdvldrhtss vdvldrhtssVar = this.f3675nufgyqmvbu;
        if (vdvldrhtssVar == null) {
            return;
        }
        vdvldrhtssVar.wflxmlrfwp();
        this.f3675nufgyqmvbu = dxjokdxxww(agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight(), i13, this.f3675nufgyqmvbu.wkgbmnqykc(), this.f3675nufgyqmvbu.gxszxtbevo());
        if (this.f3682wkgbmnqykc == 1) {
            ImageWriter imageWriter = this.f3668dxjokdxxww;
            if (imageWriter != null) {
                wwaezpbzkn.iobyxmoadg.iobyxmoadg(imageWriter);
            }
            this.f3668dxjokdxxww = wwaezpbzkn.iobyxmoadg.ppxfxbqfkf(this.f3675nufgyqmvbu.iobyxmoadg(), this.f3675nufgyqmvbu.gxszxtbevo());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wflxmlrfwp(agtfadlqog agtfadlqogVar, Matrix matrix, agtfadlqog agtfadlqogVar2, Rect rect, gxszxtbevo.iobyxmoadg iobyxmoadgVar, androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2) {
        if (!this.f3673kcexrzcfyt) {
            iobyxmoadgVar2.gxszxtbevo(new OperationCanceledException("ImageAnalysis is detached"));
            return;
        }
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(agtfadlqogVar2, ntlheqmsrt.wkgbmnqykc(agtfadlqogVar.K().iobyxmoadg(), agtfadlqogVar.K().getTimestamp(), this.f3669eablkybsjg ? 0 : this.f3683zoijcleaow, matrix));
        if (!rect.isEmpty()) {
            oxmwwwfdhmVar.oipsdeybqn(rect);
        }
        iobyxmoadgVar.wkgbmnqykc(oxmwwwfdhmVar);
        iobyxmoadgVar2.ppxfxbqfkf(null);
    }

    void btonecajqb() {
        this.f3673kcexrzcfyt = false;
        lqeggnwhkg();
    }

    void cqumvgiudr(Matrix matrix) {
        synchronized (this.f3677oxmwwwfdhm) {
            this.f3667draadjrbmk = matrix;
            this.f3681wflxmlrfwp = new Matrix(this.f3667draadjrbmk);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    com.google.common.util.concurrent.wkgbmnqykc eablkybsjg(final agtfadlqog agtfadlqogVar) {
        final Executor executor;
        final gxszxtbevo.iobyxmoadg iobyxmoadgVar;
        boolean z13;
        vdvldrhtss vdvldrhtssVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        agtfadlqog agtfadlqogVarOjitshcjhn;
        int i13 = this.f3669eablkybsjg ? this.f3683zoijcleaow : 0;
        synchronized (this.f3677oxmwwwfdhm) {
            try {
                executor = this.f3674lqeggnwhkg;
                iobyxmoadgVar = this.f3672iobyxmoadg;
                z13 = this.f3669eablkybsjg && i13 != this.f3678ppxfxbqfkf;
                if (z13) {
                    vdvldrhtss(agtfadlqogVar, i13);
                }
                if (this.f3669eablkybsjg) {
                    nufgyqmvbu(agtfadlqogVar);
                }
                vdvldrhtssVar = this.f3675nufgyqmvbu;
                imageWriter = this.f3668dxjokdxxww;
                byteBuffer = this.f3665agtfadlqog;
                byteBuffer2 = this.f3676ojitshcjhn;
                byteBuffer3 = this.f3679rgvfuqvkyq;
                byteBuffer4 = this.f3680vdvldrhtss;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iobyxmoadgVar == null || executor == null || !this.f3673kcexrzcfyt) {
            return iozdgvuglv.gtknphoqwx.btonecajqb(new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (vdvldrhtssVar == null) {
            agtfadlqogVarOjitshcjhn = null;
        } else if (this.f3682wkgbmnqykc == 2) {
            agtfadlqogVarOjitshcjhn = ImageProcessingUtil.lqeggnwhkg(agtfadlqogVar, vdvldrhtssVar, byteBuffer, i13, this.f3671gxszxtbevo);
        } else if (this.f3682wkgbmnqykc != 1) {
            agtfadlqogVarOjitshcjhn = null;
        } else {
            if (this.f3671gxszxtbevo) {
                ImageProcessingUtil.ppxfxbqfkf(agtfadlqogVar);
            }
            if (imageWriter == null || byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null) {
                agtfadlqogVarOjitshcjhn = null;
            } else {
                agtfadlqogVarOjitshcjhn = ImageProcessingUtil.ojitshcjhn(agtfadlqogVar, vdvldrhtssVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i13);
            }
        }
        boolean z14 = agtfadlqogVarOjitshcjhn == null;
        final agtfadlqog agtfadlqogVar2 = z14 ? agtfadlqogVar : agtfadlqogVarOjitshcjhn;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f3677oxmwwwfdhm) {
            if (z13 && !z14) {
                try {
                    rgvfuqvkyq(agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight(), agtfadlqogVar2.getWidth(), agtfadlqogVar2.getHeight());
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f3678ppxfxbqfkf = i13;
            rect.set(this.f3670gtknphoqwx);
            matrix.set(this.f3681wflxmlrfwp);
        }
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: androidx.camera.core.lqeggnwhkg
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar2) {
                return this.f3937iobyxmoadg.agtfadlqog(executor, agtfadlqogVar, matrix, agtfadlqogVar2, rect, iobyxmoadgVar, iobyxmoadgVar2);
            }
        });
    }

    void esjtqupxsv(Rect rect) {
        synchronized (this.f3677oxmwwwfdhm) {
            this.f3666btonecajqb = rect;
            this.f3670gtknphoqwx = new Rect(this.f3666btonecajqb);
        }
    }

    void gxszxtbevo() {
        this.f3673kcexrzcfyt = true;
    }

    @Override // istkbnxepw.cllcsxoeiz.iobyxmoadg
    public void iobyxmoadg(cllcsxoeiz cllcsxoeizVar) {
        try {
            agtfadlqog agtfadlqogVarWkgbmnqykc = wkgbmnqykc(cllcsxoeizVar);
            if (agtfadlqogVarWkgbmnqykc != null) {
                ojitshcjhn(agtfadlqogVarWkgbmnqykc);
            }
        } catch (IllegalStateException e13) {
            sopmlzcsov.wkgbmnqykc("ImageAnalysisAnalyzer", "Failed to acquire image.", e13);
        }
    }

    void iwizpuwonk(int i13) {
        this.f3683zoijcleaow = i13;
    }

    void jyumaefscl(vdvldrhtss vdvldrhtssVar) {
        synchronized (this.f3677oxmwwwfdhm) {
            this.f3675nufgyqmvbu = vdvldrhtssVar;
        }
    }

    void kcexrzcfyt(boolean z13) {
        this.f3671gxszxtbevo = z13;
    }

    abstract void lqeggnwhkg();

    abstract void ojitshcjhn(agtfadlqog agtfadlqogVar);

    void oxmwwwfdhm(Executor executor, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            lqeggnwhkg();
        }
        synchronized (this.f3677oxmwwwfdhm) {
            this.f3672iobyxmoadg = iobyxmoadgVar;
            this.f3674lqeggnwhkg = executor;
        }
    }

    abstract agtfadlqog wkgbmnqykc(cllcsxoeiz cllcsxoeizVar);

    void yggfygwlhe(boolean z13) {
        this.f3669eablkybsjg = z13;
    }

    void zdlpuopuiu(int i13) {
        this.f3682wkgbmnqykc = i13;
    }
}
