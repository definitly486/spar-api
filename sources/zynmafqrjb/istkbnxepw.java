package zynmafqrjb;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class istkbnxepw implements jpowsppfya.yggfygwlhe {
    istkbnxepw() {
    }

    private static Size eablkybsjg(int i13, Size size) {
        return cdpycssgdh.vdvldrhtss.dxjokdxxww(cdpycssgdh.vdvldrhtss.yggfygwlhe(i13)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private static Rect gxszxtbevo(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static Matrix lqeggnwhkg(Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = new Matrix(matrix);
        matrix3.postConcat(matrix2);
        return matrix3;
    }

    private static jpowsppfya.jyumaefscl ppxfxbqfkf(hkdspvbjdz hkdspvbjdzVar, cdpycssgdh.gxszxtbevo gxszxtbevoVar, androidx.camera.core.agtfadlqog agtfadlqogVar) {
        Size size = new Size(agtfadlqogVar.getWidth(), agtfadlqogVar.getHeight());
        int iGxszxtbevo = hkdspvbjdzVar.gxszxtbevo() - gxszxtbevoVar.agtfadlqog();
        Size sizeEablkybsjg = eablkybsjg(iGxszxtbevo, size);
        Matrix matrixWkgbmnqykc = cdpycssgdh.vdvldrhtss.wkgbmnqykc(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeEablkybsjg.getWidth(), sizeEablkybsjg.getHeight()), iGxszxtbevo);
        return jpowsppfya.jyumaefscl.draadjrbmk(agtfadlqogVar, gxszxtbevoVar, sizeEablkybsjg, gxszxtbevo(hkdspvbjdzVar.zoijcleaow(), matrixWkgbmnqykc), gxszxtbevoVar.agtfadlqog(), lqeggnwhkg(hkdspvbjdzVar.lqeggnwhkg(), matrixWkgbmnqykc), wkgbmnqykc(agtfadlqogVar));
    }

    private static istkbnxepw.ojitshcjhn wkgbmnqykc(androidx.camera.core.agtfadlqog agtfadlqogVar) {
        return agtfadlqogVar.K() instanceof lmojexxdyd.zoijcleaow ? ((lmojexxdyd.zoijcleaow) agtfadlqogVar.K()).wkgbmnqykc() : istkbnxepw.ojitshcjhn.iobyxmoadg.nufgyqmvbu();
    }

    private static jpowsppfya.jyumaefscl zoijcleaow(hkdspvbjdz hkdspvbjdzVar, cdpycssgdh.gxszxtbevo gxszxtbevoVar, androidx.camera.core.agtfadlqog agtfadlqogVar) {
        return jpowsppfya.jyumaefscl.gtknphoqwx(agtfadlqogVar, gxszxtbevoVar, hkdspvbjdzVar.zoijcleaow(), hkdspvbjdzVar.gxszxtbevo(), hkdspvbjdzVar.lqeggnwhkg(), wkgbmnqykc(agtfadlqogVar));
    }

    @Override // jpowsppfya.yggfygwlhe
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public jpowsppfya.jyumaefscl apply(jpowsppfya.zoijcleaow zoijcleaowVar) throws ImageCaptureException {
        cdpycssgdh.gxszxtbevo gxszxtbevoVarLqeggnwhkg;
        androidx.camera.core.agtfadlqog agtfadlqogVarIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        hkdspvbjdz hkdspvbjdzVarZoijcleaow = zoijcleaowVar.zoijcleaow();
        if (ImageUtil.lqeggnwhkg(agtfadlqogVarIobyxmoadg.getFormat())) {
            try {
                gxszxtbevoVarLqeggnwhkg = cdpycssgdh.gxszxtbevo.lqeggnwhkg(agtfadlqogVarIobyxmoadg);
                agtfadlqogVarIobyxmoadg.eslsurpljm()[0].zoijcleaow().rewind();
            } catch (IOException e13) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e13);
            }
        } else {
            gxszxtbevoVarLqeggnwhkg = null;
        }
        if (!jyumaefscl.f131638gxszxtbevo.zoijcleaow(agtfadlqogVarIobyxmoadg)) {
            return zoijcleaow(hkdspvbjdzVarZoijcleaow, gxszxtbevoVarLqeggnwhkg, agtfadlqogVarIobyxmoadg);
        }
        u1.nufgyqmvbu.lqeggnwhkg(gxszxtbevoVarLqeggnwhkg, "JPEG image must have exif.");
        return ppxfxbqfkf(hkdspvbjdzVarZoijcleaow, gxszxtbevoVarLqeggnwhkg, agtfadlqogVarIobyxmoadg);
    }
}
