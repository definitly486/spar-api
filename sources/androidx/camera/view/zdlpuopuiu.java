package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;

/* JADX INFO: loaded from: classes.dex */
final class zdlpuopuiu extends dxjokdxxww {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    SurfaceTexture f4198btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    dxjokdxxww.iobyxmoadg f4199draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    boolean f4200dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    TextureView f4201eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    AtomicReference f4202gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    SurfaceTexture f4203gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    com.google.common.util.concurrent.wkgbmnqykc f4204lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    tbqsvytpvh f4205nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    Executor f4206wflxmlrfwp;

    class iobyxmoadg implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: androidx.camera.view.zdlpuopuiu$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class C0074iobyxmoadg implements iozdgvuglv.ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ SurfaceTexture f4208iobyxmoadg;

            C0074iobyxmoadg(SurfaceTexture surfaceTexture) {
                this.f4208iobyxmoadg = surfaceTexture;
            }

            @Override // iozdgvuglv.ppxfxbqfkf
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public void onSuccess(tbqsvytpvh.lqeggnwhkg lqeggnwhkgVar) {
                u1.nufgyqmvbu.dxjokdxxww(lqeggnwhkgVar.iobyxmoadg() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                sopmlzcsov.iobyxmoadg("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f4208iobyxmoadg.release();
                zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
                if (zdlpuopuiuVar.f4198btonecajqb != null) {
                    zdlpuopuiuVar.f4198btonecajqb = null;
                }
            }

            @Override // iozdgvuglv.ppxfxbqfkf
            public void onFailure(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }
        }

        iobyxmoadg() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
            sopmlzcsov.iobyxmoadg("TextureViewImpl", "SurfaceTexture available. Size: " + i13 + "x" + i14);
            zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
            zdlpuopuiuVar.f4203gxszxtbevo = surfaceTexture;
            if (zdlpuopuiuVar.f4204lqeggnwhkg == null) {
                zdlpuopuiuVar.yggfygwlhe();
                return;
            }
            u1.nufgyqmvbu.gxszxtbevo(zdlpuopuiuVar.f4205nufgyqmvbu);
            sopmlzcsov.iobyxmoadg("TextureViewImpl", "Surface invalidated " + zdlpuopuiu.this.f4205nufgyqmvbu);
            zdlpuopuiu.this.f4205nufgyqmvbu.wflxmlrfwp().wkgbmnqykc();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            zdlpuopuiu zdlpuopuiuVar = zdlpuopuiu.this;
            zdlpuopuiuVar.f4203gxszxtbevo = null;
            com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar = zdlpuopuiuVar.f4204lqeggnwhkg;
            if (wkgbmnqykcVar == null) {
                sopmlzcsov.iobyxmoadg("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            iozdgvuglv.gtknphoqwx.lqeggnwhkg(wkgbmnqykcVar, new C0074iobyxmoadg(surfaceTexture), androidx.core.content.iobyxmoadg.getMainExecutor(zdlpuopuiu.this.f4201eablkybsjg.getContext()));
            zdlpuopuiu.this.f4198btonecajqb = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
            sopmlzcsov.iobyxmoadg("TextureViewImpl", "SurfaceTexture size changed: " + i13 + "x" + i14);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = (androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg) zdlpuopuiu.this.f4202gtknphoqwx.getAndSet(null);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.ppxfxbqfkf(null);
            }
            zdlpuopuiu.this.getClass();
            Executor executor = zdlpuopuiu.this.f4206wflxmlrfwp;
        }
    }

    zdlpuopuiu(FrameLayout frameLayout, eablkybsjg eablkybsjgVar) {
        super(frameLayout, eablkybsjgVar);
        this.f4200dxjokdxxww = false;
        this.f4202gtknphoqwx = new AtomicReference();
    }

    private void kcexrzcfyt() {
        dxjokdxxww.iobyxmoadg iobyxmoadgVar = this.f4199draadjrbmk;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg();
            this.f4199draadjrbmk = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ojitshcjhn(tbqsvytpvh tbqsvytpvhVar) {
        tbqsvytpvh tbqsvytpvhVar2 = this.f4205nufgyqmvbu;
        if (tbqsvytpvhVar2 != null && tbqsvytpvhVar2 == tbqsvytpvhVar) {
            this.f4205nufgyqmvbu = null;
            this.f4204lqeggnwhkg = null;
        }
        kcexrzcfyt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object oxmwwwfdhm(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        this.f4202gtknphoqwx.set(iobyxmoadgVar);
        return "textureViewImpl_waitForNextFrame";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object rgvfuqvkyq(Surface surface, final androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        sopmlzcsov.iobyxmoadg("TextureViewImpl", "Surface set on Preview.");
        tbqsvytpvh tbqsvytpvhVar = this.f4205nufgyqmvbu;
        Executor executorIobyxmoadg = yadqdtsiqt.iobyxmoadg.iobyxmoadg();
        Objects.requireNonNull(iobyxmoadgVar);
        tbqsvytpvhVar.zynmafqrjb(surface, executorIobyxmoadg, new u1.iobyxmoadg() { // from class: mbcevpiqjq.lqeggnwhkg
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                iobyxmoadgVar.ppxfxbqfkf((tbqsvytpvh.lqeggnwhkg) obj);
            }
        });
        return "provideSurface[request=" + this.f4205nufgyqmvbu + " surface=" + surface + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vdvldrhtss(Surface surface, com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVar, tbqsvytpvh tbqsvytpvhVar) {
        sopmlzcsov.iobyxmoadg("TextureViewImpl", "Safe to release surface.");
        kcexrzcfyt();
        surface.release();
        if (this.f4204lqeggnwhkg == wkgbmnqykcVar) {
            this.f4204lqeggnwhkg = null;
        }
        if (this.f4205nufgyqmvbu == tbqsvytpvhVar) {
            this.f4205nufgyqmvbu = null;
        }
    }

    private void zdlpuopuiu() {
        if (!this.f4200dxjokdxxww || this.f4198btonecajqb == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f4201eablkybsjg.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f4198btonecajqb;
        if (surfaceTexture != surfaceTexture2) {
            this.f4201eablkybsjg.setSurfaceTexture(surfaceTexture2);
            this.f4198btonecajqb = null;
            this.f4200dxjokdxxww = false;
        }
    }

    public void agtfadlqog() {
        u1.nufgyqmvbu.gxszxtbevo(this.f4150zoijcleaow);
        u1.nufgyqmvbu.gxszxtbevo(this.f4147iobyxmoadg);
        TextureView textureView = new TextureView(this.f4150zoijcleaow.getContext());
        this.f4201eablkybsjg = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f4147iobyxmoadg.getWidth(), this.f4147iobyxmoadg.getHeight()));
        this.f4201eablkybsjg.setSurfaceTextureListener(new iobyxmoadg());
        this.f4150zoijcleaow.removeAllViews();
        this.f4150zoijcleaow.addView(this.f4201eablkybsjg);
    }

    @Override // androidx.camera.view.dxjokdxxww
    com.google.common.util.concurrent.wkgbmnqykc dxjokdxxww() {
        return androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: androidx.camera.view.rgvfuqvkyq
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f4182iobyxmoadg.oxmwwwfdhm(iobyxmoadgVar);
            }
        });
    }

    @Override // androidx.camera.view.dxjokdxxww
    void eablkybsjg() {
        this.f4200dxjokdxxww = true;
    }

    @Override // androidx.camera.view.dxjokdxxww
    void lqeggnwhkg(final tbqsvytpvh tbqsvytpvhVar, dxjokdxxww.iobyxmoadg iobyxmoadgVar) {
        this.f4147iobyxmoadg = tbqsvytpvhVar.ojitshcjhn();
        this.f4199draadjrbmk = iobyxmoadgVar;
        agtfadlqog();
        tbqsvytpvh tbqsvytpvhVar2 = this.f4205nufgyqmvbu;
        if (tbqsvytpvhVar2 != null) {
            tbqsvytpvhVar2.yadqdtsiqt();
        }
        this.f4205nufgyqmvbu = tbqsvytpvhVar;
        tbqsvytpvhVar.btonecajqb(androidx.core.content.iobyxmoadg.getMainExecutor(this.f4201eablkybsjg.getContext()), new Runnable() { // from class: androidx.camera.view.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                this.f4169zdlpuopuiu.ojitshcjhn(tbqsvytpvhVar);
            }
        });
        yggfygwlhe();
    }

    @Override // androidx.camera.view.dxjokdxxww
    Bitmap ppxfxbqfkf() {
        TextureView textureView = this.f4201eablkybsjg;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f4201eablkybsjg.getBitmap();
    }

    @Override // androidx.camera.view.dxjokdxxww
    void wkgbmnqykc() {
        zdlpuopuiu();
    }

    void yggfygwlhe() {
        SurfaceTexture surfaceTexture;
        Size size = this.f4147iobyxmoadg;
        if (size == null || (surfaceTexture = this.f4203gxszxtbevo) == null || this.f4205nufgyqmvbu == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f4147iobyxmoadg.getHeight());
        final Surface surface = new Surface(this.f4203gxszxtbevo);
        final tbqsvytpvh tbqsvytpvhVar = this.f4205nufgyqmvbu;
        final com.google.common.util.concurrent.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg(new androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf() { // from class: androidx.camera.view.vdvldrhtss
            @Override // androidx.concurrent.futures.ppxfxbqfkf.InterfaceC0128ppxfxbqfkf
            public final Object iobyxmoadg(androidx.concurrent.futures.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
                return this.f4183iobyxmoadg.rgvfuqvkyq(surface, iobyxmoadgVar);
            }
        });
        this.f4204lqeggnwhkg = wkgbmnqykcVarIobyxmoadg;
        wkgbmnqykcVarIobyxmoadg.iobyxmoadg(new Runnable() { // from class: androidx.camera.view.oxmwwwfdhm
            @Override // java.lang.Runnable
            public final void run() {
                this.f4180zdlpuopuiu.vdvldrhtss(surface, wkgbmnqykcVarIobyxmoadg, tbqsvytpvhVar);
            }
        }, androidx.core.content.iobyxmoadg.getMainExecutor(this.f4201eablkybsjg.getContext()));
        gxszxtbevo();
    }

    @Override // androidx.camera.view.dxjokdxxww
    View zoijcleaow() {
        return this.f4201eablkybsjg;
    }
}
