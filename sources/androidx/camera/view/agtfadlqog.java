package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;

/* JADX INFO: loaded from: classes.dex */
final class agtfadlqog extends dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    SurfaceView f4130eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final zoijcleaow f4131gxszxtbevo;

    private static class iobyxmoadg {
        static void iobyxmoadg(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    class zoijcleaow implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private Size f4132cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private dxjokdxxww.iobyxmoadg f4134iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private tbqsvytpvh f4135jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private tbqsvytpvh f4138yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Size f4139zdlpuopuiu;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private boolean f4133esjtqupxsv = false;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private boolean f4136lereixgezr = false;

        zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void eablkybsjg(dxjokdxxww.iobyxmoadg iobyxmoadgVar, tbqsvytpvh.lqeggnwhkg lqeggnwhkgVar) {
            sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Safe to release surface.");
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.iobyxmoadg();
            }
        }

        private boolean lqeggnwhkg() {
            Surface surface = agtfadlqog.this.f4130eablkybsjg.getHolder().getSurface();
            if (!zoijcleaow()) {
                return false;
            }
            sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Surface set on Preview.");
            final dxjokdxxww.iobyxmoadg iobyxmoadgVar = this.f4134iwizpuwonk;
            tbqsvytpvh tbqsvytpvhVar = this.f4138yggfygwlhe;
            Objects.requireNonNull(tbqsvytpvhVar);
            tbqsvytpvhVar.zynmafqrjb(surface, androidx.core.content.iobyxmoadg.getMainExecutor(agtfadlqog.this.f4130eablkybsjg.getContext()), new u1.iobyxmoadg() { // from class: androidx.camera.view.ojitshcjhn
                @Override // u1.iobyxmoadg
                public final void accept(Object obj) {
                    agtfadlqog.zoijcleaow.eablkybsjg(iobyxmoadgVar, (tbqsvytpvh.lqeggnwhkg) obj);
                }
            });
            this.f4133esjtqupxsv = true;
            agtfadlqog.this.gxszxtbevo();
            return true;
        }

        private void ppxfxbqfkf() {
            if (this.f4138yggfygwlhe != null) {
                sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Request canceled: " + this.f4138yggfygwlhe);
                this.f4138yggfygwlhe.yadqdtsiqt();
            }
        }

        private void wkgbmnqykc() {
            if (this.f4138yggfygwlhe != null) {
                sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Surface closed " + this.f4138yggfygwlhe);
                this.f4138yggfygwlhe.wflxmlrfwp().wkgbmnqykc();
            }
        }

        private boolean zoijcleaow() {
            return (this.f4133esjtqupxsv || this.f4138yggfygwlhe == null || !Objects.equals(this.f4139zdlpuopuiu, this.f4132cqumvgiudr)) ? false : true;
        }

        void gxszxtbevo(tbqsvytpvh tbqsvytpvhVar, dxjokdxxww.iobyxmoadg iobyxmoadgVar) {
            ppxfxbqfkf();
            if (this.f4136lereixgezr) {
                this.f4136lereixgezr = false;
                tbqsvytpvhVar.vdvldrhtss();
                return;
            }
            this.f4138yggfygwlhe = tbqsvytpvhVar;
            this.f4134iwizpuwonk = iobyxmoadgVar;
            Size sizeOjitshcjhn = tbqsvytpvhVar.ojitshcjhn();
            this.f4139zdlpuopuiu = sizeOjitshcjhn;
            this.f4133esjtqupxsv = false;
            if (lqeggnwhkg()) {
                return;
            }
            sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Wait for new Surface creation.");
            agtfadlqog.this.f4130eablkybsjg.getHolder().setFixedSize(sizeOjitshcjhn.getWidth(), sizeOjitshcjhn.getHeight());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i13, int i14, int i15) {
            sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Surface changed. Size: " + i14 + "x" + i15);
            this.f4132cqumvgiudr = new Size(i14, i15);
            lqeggnwhkg();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            tbqsvytpvh tbqsvytpvhVar;
            sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Surface created.");
            if (!this.f4136lereixgezr || (tbqsvytpvhVar = this.f4135jyumaefscl) == null) {
                return;
            }
            tbqsvytpvhVar.vdvldrhtss();
            this.f4135jyumaefscl = null;
            this.f4136lereixgezr = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "Surface destroyed.");
            if (this.f4133esjtqupxsv) {
                wkgbmnqykc();
            } else {
                ppxfxbqfkf();
            }
            this.f4136lereixgezr = true;
            tbqsvytpvh tbqsvytpvhVar = this.f4138yggfygwlhe;
            if (tbqsvytpvhVar != null) {
                this.f4135jyumaefscl = tbqsvytpvhVar;
            }
            this.f4133esjtqupxsv = false;
            this.f4138yggfygwlhe = null;
            this.f4134iwizpuwonk = null;
            this.f4132cqumvgiudr = null;
            this.f4139zdlpuopuiu = null;
        }
    }

    agtfadlqog(FrameLayout frameLayout, eablkybsjg eablkybsjgVar) {
        super(frameLayout, eablkybsjgVar);
        this.f4131gxszxtbevo = new zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void agtfadlqog(tbqsvytpvh tbqsvytpvhVar, dxjokdxxww.iobyxmoadg iobyxmoadgVar) {
        this.f4131gxszxtbevo.gxszxtbevo(tbqsvytpvhVar, iobyxmoadgVar);
    }

    private static boolean ojitshcjhn(SurfaceView surfaceView, Size size, tbqsvytpvh tbqsvytpvhVar) {
        return surfaceView != null && Objects.equals(size, tbqsvytpvhVar.ojitshcjhn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void wflxmlrfwp(Semaphore semaphore, int i13) {
        if (i13 == 0) {
            sopmlzcsov.iobyxmoadg("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            sopmlzcsov.ppxfxbqfkf("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i13);
        }
        semaphore.release();
    }

    void draadjrbmk() {
        u1.nufgyqmvbu.gxszxtbevo(this.f4150zoijcleaow);
        u1.nufgyqmvbu.gxszxtbevo(this.f4147iobyxmoadg);
        SurfaceView surfaceView = new SurfaceView(this.f4150zoijcleaow.getContext());
        this.f4130eablkybsjg = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f4147iobyxmoadg.getWidth(), this.f4147iobyxmoadg.getHeight()));
        this.f4150zoijcleaow.removeAllViews();
        this.f4150zoijcleaow.addView(this.f4130eablkybsjg);
        this.f4130eablkybsjg.getHolder().addCallback(this.f4131gxszxtbevo);
    }

    @Override // androidx.camera.view.dxjokdxxww
    com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww() {
        return iozdgvuglv.gtknphoqwx.draadjrbmk(null);
    }

    @Override // androidx.camera.view.dxjokdxxww
    void eablkybsjg() {
    }

    @Override // androidx.camera.view.dxjokdxxww
    void lqeggnwhkg(final tbqsvytpvh tbqsvytpvhVar, final dxjokdxxww.iobyxmoadg iobyxmoadgVar) {
        if (!ojitshcjhn(this.f4130eablkybsjg, this.f4147iobyxmoadg, tbqsvytpvhVar)) {
            this.f4147iobyxmoadg = tbqsvytpvhVar.ojitshcjhn();
            draadjrbmk();
        }
        if (iobyxmoadgVar != null) {
            tbqsvytpvhVar.btonecajqb(androidx.core.content.iobyxmoadg.getMainExecutor(this.f4130eablkybsjg.getContext()), new Runnable() { // from class: androidx.camera.view.gtknphoqwx
                @Override // java.lang.Runnable
                public final void run() {
                    iobyxmoadgVar.iobyxmoadg();
                }
            });
        }
        this.f4130eablkybsjg.post(new Runnable() { // from class: androidx.camera.view.draadjrbmk
            @Override // java.lang.Runnable
            public final void run() {
                this.f4146zdlpuopuiu.agtfadlqog(tbqsvytpvhVar, iobyxmoadgVar);
            }
        });
    }

    @Override // androidx.camera.view.dxjokdxxww
    Bitmap ppxfxbqfkf() {
        SurfaceView surfaceView = this.f4130eablkybsjg;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f4130eablkybsjg.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f4130eablkybsjg.getWidth(), this.f4130eablkybsjg.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        iobyxmoadg.iobyxmoadg(this.f4130eablkybsjg, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.wflxmlrfwp
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i13) {
                agtfadlqog.wflxmlrfwp(semaphore, i13);
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    sopmlzcsov.ppxfxbqfkf("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e13) {
                sopmlzcsov.wkgbmnqykc("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e13);
            }
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // androidx.camera.view.dxjokdxxww
    void wkgbmnqykc() {
    }

    @Override // androidx.camera.view.dxjokdxxww
    View zoijcleaow() {
        return this.f4130eablkybsjg;
    }
}
