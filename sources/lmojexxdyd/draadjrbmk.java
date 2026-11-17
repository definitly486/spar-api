package lmojexxdyd;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.camera.core.impl.iwizpuwonk;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.HashMap;
import java.util.Map;
import lereixgezr.roivzttewh;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk {
    private static float eablkybsjg(float f13, float f14) {
        return (f14 + f14) - f13;
    }

    private static float gxszxtbevo(float f13, float f14) {
        return (f14 + f14) - f13;
    }

    public static Map iobyxmoadg(Rect rect, boolean z13, Rational rational, int i13, int i14, int i15, Map map) {
        u1.nufgyqmvbu.zoijcleaow(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((iwizpuwonk) entry.getValue()).eablkybsjg().getWidth(), ((iwizpuwonk) entry.getValue()).eablkybsjg().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((roivzttewh) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF rectFLqeggnwhkg = lqeggnwhkg(rectF2, ImageUtil.eablkybsjg(i13, rational), i14, z13, i15, i13);
        HashMap map3 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, rectFLqeggnwhkg);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            map3.put((roivzttewh) entry2.getKey(), rect2);
        }
        return map3;
    }

    public static RectF lqeggnwhkg(RectF rectF, Rational rational, int i13, boolean z13, int i14, int i15) {
        if (i13 == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i13 == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i13 == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else {
            if (i13 != 2) {
                throw new IllegalStateException("Unexpected scale type: " + i13);
            }
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return zoijcleaow(nufgyqmvbu(z13, i14), i15, rectF, rectF3);
    }

    private static boolean nufgyqmvbu(boolean z13, int i13) {
        return z13 ^ (i13 == 1);
    }

    private static RectF ppxfxbqfkf(RectF rectF, float f13) {
        return new RectF(eablkybsjg(rectF.right, f13), rectF.top, eablkybsjg(rectF.left, f13), rectF.bottom);
    }

    private static RectF wkgbmnqykc(RectF rectF, float f13) {
        return new RectF(rectF.left, gxszxtbevo(rectF.bottom, f13), rectF.right, gxszxtbevo(rectF.top, f13));
    }

    private static RectF zoijcleaow(boolean z13, int i13, RectF rectF, RectF rectF2) {
        boolean z14 = false;
        boolean z15 = i13 == 0 && !z13;
        boolean z16 = i13 == 90 && z13;
        if (z15 || z16) {
            return rectF2;
        }
        boolean z17 = i13 == 0 && z13;
        boolean z18 = i13 == 270 && !z13;
        if (z17 || z18) {
            return ppxfxbqfkf(rectF2, rectF.centerX());
        }
        boolean z19 = i13 == 90 && !z13;
        boolean z23 = i13 == 180 && z13;
        if (z19 || z23) {
            return wkgbmnqykc(rectF2, rectF.centerY());
        }
        boolean z24 = i13 == 180 && !z13;
        if (i13 == 270 && z13) {
            z14 = true;
        }
        if (z24 || z14) {
            return ppxfxbqfkf(wkgbmnqykc(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z13 + " rotation " + i13);
    }
}
