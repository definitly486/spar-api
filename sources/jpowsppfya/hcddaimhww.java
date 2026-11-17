package jpowsppfya;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import lereixgezr.sopmlzcsov;
import lereixgezr.ydmasvzmpa;

/* JADX INFO: loaded from: classes.dex */
final class hcddaimhww implements ydmasvzmpa {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final float[] f51959cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Size f51960cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final ydmasvzmpa.iobyxmoadg f51961esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private Matrix f51962hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private Executor f51963iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final float[] f51964istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f51965iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f51966jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ydmasvzmpa.iobyxmoadg f51967lereixgezr;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg f51969pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final float[] f51970pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private u1.iobyxmoadg f51972yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Surface f51973yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final com.google.common.util.concurrent.wkgbmnqykc f51974ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final float[] f51976zynmafqrjb;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f51975zdlpuopuiu = new Object();

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f51968lmojexxdyd = false;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f51971wwaezpbzkn = false;

    hcddaimhww(Surface surface, int i13, int i14, Size size, ydmasvzmpa.iobyxmoadg iobyxmoadgVar, ydmasvzmpa.iobyxmoadg iobyxmoadgVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f51970pmvmpeiblj = fArr;
        float[] fArr2 = new float[16];
        this.f51976zynmafqrjb = fArr2;
        float[] fArr3 = new float[16];
        this.f51964istkbnxepw = fArr3;
        float[] fArr4 = new float[16];
        this.f51959cdpycssgdh = fArr4;
        this.f51973yggfygwlhe = surface;
        this.f51966jyumaefscl = i13;
        this.f51965iwizpuwonk = i14;
        this.f51960cqumvgiudr = size;
        this.f51961esjtqupxsv = iobyxmoadgVar;
        this.f51967lereixgezr = iobyxmoadgVar2;
        this.f51962hcddaimhww = matrix;
        lqeggnwhkg(fArr, fArr3, iobyxmoadgVar);
        lqeggnwhkg(fArr2, fArr4, iobyxmoadgVar2);
        this.f51974ylkuphrtab = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: jpowsppfya.ylkuphrtab
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar3) {
                return this.f52048iobyxmoadg.btonecajqb(iobyxmoadgVar3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object btonecajqb(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f51969pkzmftpjix = iobyxmoadgVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(AtomicReference atomicReference) {
        ((u1.iobyxmoadg) atomicReference.get()).accept(ydmasvzmpa.zoijcleaow.ppxfxbqfkf(0, this));
    }

    private static void lqeggnwhkg(float[] fArr, float[] fArr2, ydmasvzmpa.iobyxmoadg iobyxmoadgVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (iobyxmoadgVar == null) {
            return;
        }
        cdpycssgdh.wflxmlrfwp.wkgbmnqykc(fArr, 0.5f);
        cdpycssgdh.wflxmlrfwp.ppxfxbqfkf(fArr, iobyxmoadgVar.eablkybsjg(), 0.5f, 0.5f);
        if (iobyxmoadgVar.wkgbmnqykc()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeOjitshcjhn = cdpycssgdh.vdvldrhtss.ojitshcjhn(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.eablkybsjg());
        Matrix matrixEablkybsjg = cdpycssgdh.vdvldrhtss.eablkybsjg(cdpycssgdh.vdvldrhtss.oxmwwwfdhm(iobyxmoadgVar.ppxfxbqfkf()), cdpycssgdh.vdvldrhtss.oxmwwwfdhm(sizeOjitshcjhn), iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.wkgbmnqykc());
        RectF rectF = new RectF(iobyxmoadgVar.zoijcleaow());
        matrixEablkybsjg.mapRect(rectF);
        float width = rectF.left / sizeOjitshcjhn.getWidth();
        float height = ((sizeOjitshcjhn.getHeight() - rectF.height()) - rectF.top) / sizeOjitshcjhn.getHeight();
        float fWidth = rectF.width() / sizeOjitshcjhn.getWidth();
        float fHeight = rectF.height() / sizeOjitshcjhn.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        nufgyqmvbu(fArr2, iobyxmoadgVar.iobyxmoadg());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void nufgyqmvbu(float[] fArr, istkbnxepw.iwizpuwonk iwizpuwonkVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        cdpycssgdh.wflxmlrfwp.wkgbmnqykc(fArr, 0.5f);
        if (iwizpuwonkVar != null) {
            u1.nufgyqmvbu.dxjokdxxww(iwizpuwonkVar.vdvldrhtss(), "Camera has no transform.");
            cdpycssgdh.wflxmlrfwp.ppxfxbqfkf(fArr, iwizpuwonkVar.zoijcleaow().iobyxmoadg(), 0.5f, 0.5f);
            if (iwizpuwonkVar.agtfadlqog()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    public void agtfadlqog() {
        Executor executor;
        u1.iobyxmoadg iobyxmoadgVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f51975zdlpuopuiu) {
            try {
                if (this.f51963iozdgvuglv == null || (iobyxmoadgVar = this.f51972yadqdtsiqt) == null) {
                    this.f51968lmojexxdyd = true;
                } else if (!this.f51971wwaezpbzkn) {
                    atomicReference.set(iobyxmoadgVar);
                    executor = this.f51963iozdgvuglv;
                    this.f51968lmojexxdyd = false;
                }
                executor = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: jpowsppfya.pkzmftpjix
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51998zdlpuopuiu.draadjrbmk(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e13) {
                sopmlzcsov.zoijcleaow("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e13);
            }
        }
    }

    @Override // lereixgezr.ydmasvzmpa, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f51975zdlpuopuiu) {
            try {
                if (!this.f51971wwaezpbzkn) {
                    this.f51971wwaezpbzkn = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f51969pkzmftpjix.ppxfxbqfkf(null);
    }

    @Override // lereixgezr.ydmasvzmpa
    public Surface dvvnrvtcbc(Executor executor, u1.iobyxmoadg iobyxmoadgVar) {
        boolean z13;
        synchronized (this.f51975zdlpuopuiu) {
            this.f51963iozdgvuglv = executor;
            this.f51972yadqdtsiqt = iobyxmoadgVar;
            z13 = this.f51968lmojexxdyd;
        }
        if (z13) {
            agtfadlqog();
        }
        return this.f51973yggfygwlhe;
    }

    public com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww() {
        return this.f51974ylkuphrtab;
    }

    @Override // lereixgezr.ydmasvzmpa
    public int getFormat() {
        return this.f51965iwizpuwonk;
    }

    @Override // lereixgezr.ydmasvzmpa
    public Size getSize() {
        return this.f51960cqumvgiudr;
    }

    @Override // lereixgezr.ydmasvzmpa
    public void h(float[] fArr, float[] fArr2) {
        ylkuphrtab(fArr, fArr2, true);
    }

    @Override // lereixgezr.ydmasvzmpa
    public void ylkuphrtab(float[] fArr, float[] fArr2, boolean z13) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z13 ? this.f51970pmvmpeiblj : this.f51976zynmafqrjb, 0);
    }
}
