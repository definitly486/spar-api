package v7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import k7.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ThreadLocal f116246iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ThreadLocal f116249zoijcleaow = new zoijcleaow();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final ThreadLocal f116247ppxfxbqfkf = new ppxfxbqfkf();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ThreadLocal f116248wkgbmnqykc = new wkgbmnqykc();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final float f116245eablkybsjg = (float) (Math.sqrt(2.0d) / 2.0d);

    class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    class ppxfxbqfkf extends ThreadLocal {
        ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    class wkgbmnqykc extends ThreadLocal {
        wkgbmnqykc() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    class zoijcleaow extends ThreadLocal {
        zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    public static void agtfadlqog(Canvas canvas, RectF rectF, Paint paint, int i13) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("Utils#saveLayer");
    }

    public static boolean btonecajqb(int i13, int i14, int i15, int i16, int i17, int i18) {
        if (i13 < i16) {
            return false;
        }
        if (i13 > i16) {
            return true;
        }
        if (i14 < i17) {
            return false;
        }
        return i14 > i17 || i15 >= i18;
    }

    public static Bitmap draadjrbmk(Bitmap bitmap, int i13, int i14) {
        if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i13, i14, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static int dxjokdxxww(float f13, float f14, float f15, float f16) {
        int i13 = f13 != 0.0f ? (int) (527 * f13) : 17;
        if (f14 != 0.0f) {
            i13 = (int) (i13 * 31 * f14);
        }
        if (f15 != 0.0f) {
            i13 = (int) (i13 * 31 * f15);
        }
        return f16 != 0.0f ? (int) (i13 * 31 * f16) : i13;
    }

    public static float eablkybsjg() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static boolean gtknphoqwx(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static float gxszxtbevo(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static void iobyxmoadg(Path path, float f13, float f14, float f15) {
        com.airbnb.lottie.eablkybsjg.zoijcleaow("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = (PathMeasure) f116246iobyxmoadg.get();
        Path path2 = (Path) f116249zoijcleaow.get();
        Path path3 = (Path) f116247ppxfxbqfkf.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f13 == 1.0f && f14 == 0.0f) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f14 - f13) - 1.0f) < 0.01d) {
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("applyTrimPathIfNeeded");
            return;
        }
        float f16 = f13 * length;
        float f17 = f14 * length;
        float f18 = f15 * length;
        float fMin = Math.min(f16, f17) + f18;
        float fMax = Math.max(f16, f17) + f18;
        if (fMin >= length && fMax >= length) {
            fMin = dxjokdxxww.gxszxtbevo(fMin, length);
            fMax = dxjokdxxww.gxszxtbevo(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = dxjokdxxww.gxszxtbevo(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = dxjokdxxww.gxszxtbevo(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.airbnb.lottie.eablkybsjg.ppxfxbqfkf("applyTrimPathIfNeeded");
    }

    public static float lqeggnwhkg(Matrix matrix) {
        float[] fArr = (float[]) f116248wkgbmnqykc.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f13 = f116245eablkybsjg;
        fArr[2] = f13;
        fArr[3] = f13;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean nufgyqmvbu(Matrix matrix) {
        float[] fArr = (float[]) f116248wkgbmnqykc.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void ppxfxbqfkf(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception unused) {
            }
        }
    }

    public static void wflxmlrfwp(Canvas canvas, RectF rectF, Paint paint) {
        agtfadlqog(canvas, rectF, paint, 31);
    }

    public static Path wkgbmnqykc(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f13 = pointF3.x + pointF.x;
            float f14 = pointF.y + pointF3.y;
            float f15 = pointF2.x;
            float f16 = f15 + pointF4.x;
            float f17 = pointF2.y;
            path.cubicTo(f13, f14, f16, f17 + pointF4.y, f15, f17);
        }
        return path;
    }

    public static void zoijcleaow(Path path, yggfygwlhe yggfygwlheVar) {
        if (yggfygwlheVar == null || yggfygwlheVar.draadjrbmk()) {
            return;
        }
        iobyxmoadg(path, ((l7.wkgbmnqykc) yggfygwlheVar.btonecajqb()).vdvldrhtss() / 100.0f, ((l7.wkgbmnqykc) yggfygwlheVar.lqeggnwhkg()).vdvldrhtss() / 100.0f, ((l7.wkgbmnqykc) yggfygwlheVar.nufgyqmvbu()).vdvldrhtss() / 360.0f);
    }
}
