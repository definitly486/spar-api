package cdpycssgdh;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final RectF f19743iobyxmoadg = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Size agtfadlqog(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static boolean btonecajqb(Size size, Size size2) {
        return gtknphoqwx(size, false, size2, false);
    }

    public static boolean draadjrbmk(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return iobyxmoadg(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static boolean dxjokdxxww(int i13) {
        if (i13 == 90 || i13 == 270) {
            return true;
        }
        if (i13 == 0 || i13 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i13);
    }

    public static Matrix eablkybsjg(RectF rectF, RectF rectF2, int i13, boolean z13) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f19743iobyxmoadg, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i13);
        if (z13) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(ppxfxbqfkf(rectF2));
        return matrix;
    }

    public static boolean gtknphoqwx(Size size, boolean z13, Size size2, boolean z14) {
        float width;
        float width2;
        float width3;
        float f13;
        if (z13) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z14) {
            width3 = size2.getWidth() / size2.getHeight();
            f13 = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f13 = width4;
        }
        return width >= width3 && f13 >= width2;
    }

    public static Size gxszxtbevo(Rect rect, int i13) {
        return ojitshcjhn(wflxmlrfwp(rect), i13);
    }

    public static float iobyxmoadg(float f13, float f14, float f15, float f16) {
        float f17 = (f13 * f15) + (f14 * f16);
        float f18 = (f13 * f16) - (f14 * f15);
        double dSqrt = Math.sqrt((f13 * f13) + (f14 * f14)) * Math.sqrt((f15 * f15) + (f16 * f16));
        return (float) Math.toDegrees(Math.atan2(((double) f18) / dSqrt, ((double) f17) / dSqrt));
    }

    public static RectF kcexrzcfyt(Size size, int i13, int i14) {
        return new RectF(i13, i14, i13 + size.getWidth(), i14 + size.getHeight());
    }

    public static int lqeggnwhkg(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return yggfygwlhe((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static boolean nufgyqmvbu(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static Size ojitshcjhn(Size size, int i13) {
        u1.nufgyqmvbu.zoijcleaow(i13 % 90 == 0, "Invalid rotation degrees: " + i13);
        return dxjokdxxww(yggfygwlhe(i13)) ? agtfadlqog(size) : size;
    }

    public static RectF oxmwwwfdhm(Size size) {
        return kcexrzcfyt(size, 0, 0);
    }

    public static Matrix ppxfxbqfkf(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f19743iobyxmoadg, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Rect rgvfuqvkyq(Size size) {
        return vdvldrhtss(size, 0, 0);
    }

    public static Rect vdvldrhtss(Size size, int i13, int i14) {
        return new Rect(i13, i14, size.getWidth() + i13, size.getHeight() + i14);
    }

    public static Size wflxmlrfwp(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Matrix wkgbmnqykc(RectF rectF, RectF rectF2, int i13) {
        return eablkybsjg(rectF, rectF2, i13, false);
    }

    public static int yggfygwlhe(int i13) {
        return ((i13 % 360) + 360) % 360;
    }

    public static Matrix zdlpuopuiu(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static Matrix zoijcleaow(Rect rect) {
        return ppxfxbqfkf(new RectF(rect));
    }
}
