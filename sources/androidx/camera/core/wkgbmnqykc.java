package androidx.camera.core;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import istkbnxepw.cllcsxoeiz;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class wkgbmnqykc implements cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ImageReader f3978iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f3980zoijcleaow = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f3979ppxfxbqfkf = true;

    wkgbmnqykc(ImageReader imageReader) {
        this.f3978iobyxmoadg = imageReader;
    }

    private boolean btonecajqb(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void draadjrbmk(Executor executor, final cllcsxoeiz.iobyxmoadg iobyxmoadgVar, ImageReader imageReader) {
        synchronized (this.f3980zoijcleaow) {
            try {
                if (!this.f3979ppxfxbqfkf) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.ppxfxbqfkf
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3955zdlpuopuiu.gtknphoqwx(iobyxmoadgVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gtknphoqwx(cllcsxoeiz.iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.iobyxmoadg(this);
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void close() {
        synchronized (this.f3980zoijcleaow) {
            this.f3978iobyxmoadg.close();
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void eablkybsjg() {
        synchronized (this.f3980zoijcleaow) {
            this.f3979ppxfxbqfkf = true;
            this.f3978iobyxmoadg.setOnImageAvailableListener(null, null);
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getHeight() {
        int height;
        synchronized (this.f3980zoijcleaow) {
            height = this.f3978iobyxmoadg.getHeight();
        }
        return height;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int getWidth() {
        int width;
        synchronized (this.f3980zoijcleaow) {
            width = this.f3978iobyxmoadg.getWidth();
        }
        return width;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int gxszxtbevo() {
        int maxImages;
        synchronized (this.f3980zoijcleaow) {
            maxImages = this.f3978iobyxmoadg.getMaxImages();
        }
        return maxImages;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public Surface iobyxmoadg() {
        Surface surface;
        synchronized (this.f3980zoijcleaow) {
            surface = this.f3978iobyxmoadg.getSurface();
        }
        return surface;
    }

    @Override // istkbnxepw.cllcsxoeiz
    public void lqeggnwhkg(final cllcsxoeiz.iobyxmoadg iobyxmoadgVar, final Executor executor) {
        synchronized (this.f3980zoijcleaow) {
            this.f3979ppxfxbqfkf = false;
            this.f3978iobyxmoadg.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.zoijcleaow
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    this.f3981iobyxmoadg.draadjrbmk(executor, iobyxmoadgVar, imageReader);
                }
            }, cdpycssgdh.draadjrbmk.iobyxmoadg());
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public agtfadlqog nufgyqmvbu() {
        Image imageAcquireNextImage;
        synchronized (this.f3980zoijcleaow) {
            try {
                imageAcquireNextImage = this.f3978iobyxmoadg.acquireNextImage();
            } catch (RuntimeException e13) {
                if (!btonecajqb(e13)) {
                    throw e13;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new iobyxmoadg(imageAcquireNextImage);
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public agtfadlqog ppxfxbqfkf() {
        Image imageAcquireLatestImage;
        synchronized (this.f3980zoijcleaow) {
            try {
                imageAcquireLatestImage = this.f3978iobyxmoadg.acquireLatestImage();
            } catch (RuntimeException e13) {
                if (!btonecajqb(e13)) {
                    throw e13;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new iobyxmoadg(imageAcquireLatestImage);
        }
    }

    @Override // istkbnxepw.cllcsxoeiz
    public int wkgbmnqykc() {
        int imageFormat;
        synchronized (this.f3980zoijcleaow) {
            imageFormat = this.f3978iobyxmoadg.getImageFormat();
        }
        return imageFormat;
    }
}
