package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final PreviewView.wkgbmnqykc f4151dxjokdxxww = PreviewView.wkgbmnqykc.FILL_CENTER;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f4152eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f4153gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Size f4154iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f4155lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private PreviewView.wkgbmnqykc f4156nufgyqmvbu = f4151dxjokdxxww;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f4157ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Matrix f4158wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Rect f4159zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f4160iobyxmoadg;

        static {
            int[] iArr = new int[PreviewView.wkgbmnqykc.values().length];
            f4160iobyxmoadg = iArr;
            try {
                iArr[PreviewView.wkgbmnqykc.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4160iobyxmoadg[PreviewView.wkgbmnqykc.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4160iobyxmoadg[PreviewView.wkgbmnqykc.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4160iobyxmoadg[PreviewView.wkgbmnqykc.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4160iobyxmoadg[PreviewView.wkgbmnqykc.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4160iobyxmoadg[PreviewView.wkgbmnqykc.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    eablkybsjg() {
    }

    private RectF draadjrbmk(Size size, int i13) {
        u1.nufgyqmvbu.nufgyqmvbu(wflxmlrfwp());
        Matrix matrixBtonecajqb = btonecajqb(size, i13);
        RectF rectF = new RectF(0.0f, 0.0f, this.f4154iobyxmoadg.getWidth(), this.f4154iobyxmoadg.getHeight());
        matrixBtonecajqb.mapRect(rectF);
        return rectF;
    }

    private int eablkybsjg() {
        return !this.f4155lqeggnwhkg ? this.f4157ppxfxbqfkf : -cdpycssgdh.ppxfxbqfkf.zoijcleaow(this.f4152eablkybsjg);
    }

    private Size gxszxtbevo() {
        return cdpycssgdh.vdvldrhtss.dxjokdxxww(this.f4157ppxfxbqfkf) ? new Size(this.f4159zoijcleaow.height(), this.f4159zoijcleaow.width()) : new Size(this.f4159zoijcleaow.width(), this.f4159zoijcleaow.height());
    }

    private static void rgvfuqvkyq(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.wkgbmnqykc wkgbmnqykcVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (iobyxmoadg.f4160iobyxmoadg[wkgbmnqykcVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                sopmlzcsov.ppxfxbqfkf("PreviewTransform", "Unexpected crop rect: " + wkgbmnqykcVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (wkgbmnqykcVar == PreviewView.wkgbmnqykc.FIT_CENTER || wkgbmnqykcVar == PreviewView.wkgbmnqykc.FIT_START || wkgbmnqykcVar == PreviewView.wkgbmnqykc.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    private boolean wflxmlrfwp() {
        return (this.f4159zoijcleaow == null || this.f4154iobyxmoadg == null || !(!this.f4155lqeggnwhkg || this.f4152eablkybsjg != -1)) ? false : true;
    }

    private static RectF zoijcleaow(RectF rectF, float f13) {
        float f14 = f13 + f13;
        return new RectF(f14 - rectF.right, rectF.top, f14 - rectF.left, rectF.bottom);
    }

    boolean agtfadlqog(Size size) {
        return cdpycssgdh.vdvldrhtss.gtknphoqwx(size, true, gxszxtbevo(), false);
    }

    Matrix btonecajqb(Size size, int i13) {
        u1.nufgyqmvbu.nufgyqmvbu(wflxmlrfwp());
        Matrix matrixWkgbmnqykc = cdpycssgdh.vdvldrhtss.wkgbmnqykc(new RectF(this.f4159zoijcleaow), agtfadlqog(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : wkgbmnqykc(size, i13), this.f4157ppxfxbqfkf);
        if (this.f4153gxszxtbevo && this.f4155lqeggnwhkg) {
            if (cdpycssgdh.vdvldrhtss.dxjokdxxww(this.f4157ppxfxbqfkf)) {
                matrixWkgbmnqykc.preScale(1.0f, -1.0f, this.f4159zoijcleaow.centerX(), this.f4159zoijcleaow.centerY());
            } else {
                matrixWkgbmnqykc.preScale(-1.0f, 1.0f, this.f4159zoijcleaow.centerX(), this.f4159zoijcleaow.centerY());
            }
        }
        return matrixWkgbmnqykc;
    }

    Rect dxjokdxxww() {
        return this.f4159zoijcleaow;
    }

    Matrix gtknphoqwx() {
        u1.nufgyqmvbu.nufgyqmvbu(wflxmlrfwp());
        RectF rectF = new RectF(0.0f, 0.0f, this.f4154iobyxmoadg.getWidth(), this.f4154iobyxmoadg.getHeight());
        return cdpycssgdh.vdvldrhtss.wkgbmnqykc(rectF, rectF, eablkybsjg());
    }

    Bitmap iobyxmoadg(Bitmap bitmap, Size size, int i13) {
        if (!wflxmlrfwp()) {
            return bitmap;
        }
        Matrix matrixGtknphoqwx = gtknphoqwx();
        RectF rectFDraadjrbmk = draadjrbmk(size, i13);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixGtknphoqwx);
        matrix.postScale(rectFDraadjrbmk.width() / this.f4154iobyxmoadg.getWidth(), rectFDraadjrbmk.height() / this.f4154iobyxmoadg.getHeight());
        matrix.postTranslate(rectFDraadjrbmk.left, rectFDraadjrbmk.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    void kcexrzcfyt(Size size, int i13, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            sopmlzcsov.draadjrbmk("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (wflxmlrfwp()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(gtknphoqwx());
            } else {
                Display display = view.getDisplay();
                boolean z13 = false;
                boolean z14 = (!this.f4155lqeggnwhkg || display == null || display.getRotation() == this.f4152eablkybsjg) ? false : true;
                if (!this.f4155lqeggnwhkg && eablkybsjg() != 0) {
                    z13 = true;
                }
                if (z14 || z13) {
                    sopmlzcsov.ppxfxbqfkf("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF rectFDraadjrbmk = draadjrbmk(size, i13);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFDraadjrbmk.width() / this.f4154iobyxmoadg.getWidth());
            view.setScaleY(rectFDraadjrbmk.height() / this.f4154iobyxmoadg.getHeight());
            view.setTranslationX(rectFDraadjrbmk.left - view.getLeft());
            view.setTranslationY(rectFDraadjrbmk.top - view.getTop());
        }
    }

    PreviewView.wkgbmnqykc lqeggnwhkg() {
        return this.f4156nufgyqmvbu;
    }

    Matrix nufgyqmvbu(Size size, int i13) {
        if (!wflxmlrfwp()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f4158wkgbmnqykc);
        matrix.postConcat(btonecajqb(size, i13));
        return matrix;
    }

    void ojitshcjhn(int i13, int i14) {
        if (this.f4155lqeggnwhkg) {
            this.f4157ppxfxbqfkf = i13;
            this.f4152eablkybsjg = i14;
        }
    }

    void oxmwwwfdhm(tbqsvytpvh.nufgyqmvbu nufgyqmvbuVar, Size size, boolean z13) {
        sopmlzcsov.iobyxmoadg("PreviewTransform", "Transformation info set: " + nufgyqmvbuVar + " " + size + " " + z13);
        this.f4159zoijcleaow = nufgyqmvbuVar.iobyxmoadg();
        this.f4157ppxfxbqfkf = nufgyqmvbuVar.zoijcleaow();
        this.f4152eablkybsjg = nufgyqmvbuVar.wkgbmnqykc();
        this.f4154iobyxmoadg = size;
        this.f4153gxszxtbevo = z13;
        this.f4155lqeggnwhkg = nufgyqmvbuVar.eablkybsjg();
        this.f4158wkgbmnqykc = nufgyqmvbuVar.ppxfxbqfkf();
    }

    Matrix ppxfxbqfkf(Size size, int i13, Rect rect) {
        if (!wflxmlrfwp()) {
            return null;
        }
        Matrix matrix = new Matrix();
        nufgyqmvbu(size, i13).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    void vdvldrhtss(PreviewView.wkgbmnqykc wkgbmnqykcVar) {
        this.f4156nufgyqmvbu = wkgbmnqykcVar;
    }

    RectF wkgbmnqykc(Size size, int i13) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeGxszxtbevo = gxszxtbevo();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeGxszxtbevo.getWidth(), sizeGxszxtbevo.getHeight());
        Matrix matrix = new Matrix();
        rgvfuqvkyq(matrix, rectF2, rectF, this.f4156nufgyqmvbu);
        matrix.mapRect(rectF2);
        return i13 == 1 ? zoijcleaow(rectF2, size.getWidth() / 2.0f) : rectF2;
    }
}
