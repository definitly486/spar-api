package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class istkbnxepw {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final Lock f21077eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Paint f21079ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final Set f21080wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Paint f21078iobyxmoadg = new Paint(6);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Paint f21081zoijcleaow = new Paint(7);

    class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ float f21082iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ float f21083ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ float f21084wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ float f21085zoijcleaow;

        iobyxmoadg(float f13, float f14, float f15, float f16) {
            this.f21082iobyxmoadg = f13;
            this.f21085zoijcleaow = f14;
            this.f21083ppxfxbqfkf = f15;
            this.f21084wkgbmnqykc = f16;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.istkbnxepw.zoijcleaow
        public void iobyxmoadg(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f13 = this.f21082iobyxmoadg;
            float f14 = this.f21085zoijcleaow;
            float f15 = this.f21083ppxfxbqfkf;
            float f16 = this.f21084wkgbmnqykc;
            path.addRoundRect(rectF, new float[]{f13, f13, f14, f14, f15, f15, f16, f16}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    private static final class ppxfxbqfkf implements Lock {
        ppxfxbqfkf() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j13, TimeUnit timeUnit) {
            return true;
        }
    }

    private interface zoijcleaow {
        void iobyxmoadg(Canvas canvas, Paint paint, RectF rectF);
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f21080wkgbmnqykc = hashSet;
        f21077eablkybsjg = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new ppxfxbqfkf();
        Paint paint = new Paint(7);
        f21079ppxfxbqfkf = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static Bitmap agtfadlqog(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, float f13, float f14, float f15, float f16) {
        return ojitshcjhn(wkgbmnqykcVar, bitmap, new iobyxmoadg(f13, f14, f15, f16));
    }

    private static Bitmap.Config btonecajqb(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static boolean draadjrbmk(int i13) {
        switch (i13) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static int dxjokdxxww(int i13) {
        switch (i13) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Bitmap eablkybsjg(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13, int i14) {
        if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i13 / bitmap.getWidth(), i14 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), btonecajqb(bitmap));
        rgvfuqvkyq(bitmap, bitmapWkgbmnqykc);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i13 + "x" + i14);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapWkgbmnqykc.getWidth() + "x" + bitmapWkgbmnqykc.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("minPct:   ");
            sb3.append(fMin);
            Log.v("TransformationUtils", sb3.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        iobyxmoadg(bitmap, bitmapWkgbmnqykc, matrix);
        return bitmapWkgbmnqykc;
    }

    static void gtknphoqwx(int i13, Matrix matrix) {
        switch (i13) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    private static Bitmap gxszxtbevo(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap) {
        Bitmap.Config configLqeggnwhkg = lqeggnwhkg(bitmap);
        if (configLqeggnwhkg.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(bitmap.getWidth(), bitmap.getHeight(), configLqeggnwhkg);
        new Canvas(bitmapWkgbmnqykc).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapWkgbmnqykc;
    }

    private static void iobyxmoadg(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f21077eablkybsjg.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f21078iobyxmoadg);
            wkgbmnqykc(canvas);
        } finally {
            f21077eablkybsjg.unlock();
        }
    }

    private static Bitmap.Config lqeggnwhkg(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        return config.equals(bitmap.getConfig()) ? config : Bitmap.Config.ARGB_8888;
    }

    public static Lock nufgyqmvbu() {
        return f21077eablkybsjg;
    }

    private static Bitmap ojitshcjhn(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, zoijcleaow zoijcleaowVar) {
        Bitmap.Config configLqeggnwhkg = lqeggnwhkg(bitmap);
        Bitmap bitmapGxszxtbevo = gxszxtbevo(wkgbmnqykcVar, bitmap);
        Bitmap bitmapWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(bitmapGxszxtbevo.getWidth(), bitmapGxszxtbevo.getHeight(), configLqeggnwhkg);
        bitmapWkgbmnqykc.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapGxszxtbevo, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapWkgbmnqykc.getWidth(), bitmapWkgbmnqykc.getHeight());
        Lock lock = f21077eablkybsjg;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapWkgbmnqykc);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            zoijcleaowVar.iobyxmoadg(canvas, paint, rectF);
            wkgbmnqykc(canvas);
            lock.unlock();
            if (!bitmapGxszxtbevo.equals(bitmap)) {
                wkgbmnqykcVar.ppxfxbqfkf(bitmapGxszxtbevo);
            }
            return bitmapWkgbmnqykc;
        } catch (Throwable th2) {
            f21077eablkybsjg.unlock();
            throw th2;
        }
    }

    public static Bitmap ppxfxbqfkf(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13, int i14) {
        if (bitmap.getWidth() > i13 || bitmap.getHeight() > i14) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return eablkybsjg(wkgbmnqykcVar, bitmap, i13, i14);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static void rgvfuqvkyq(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap wflxmlrfwp(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13) {
        if (!draadjrbmk(i13)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        gtknphoqwx(i13, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(Math.round(rectF.width()), Math.round(rectF.height()), btonecajqb(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapWkgbmnqykc.setHasAlpha(bitmap.hasAlpha());
        iobyxmoadg(bitmap, bitmapWkgbmnqykc, matrix);
        return bitmapWkgbmnqykc;
    }

    private static void wkgbmnqykc(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap zoijcleaow(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13, int i14) {
        float width;
        float height;
        if (bitmap.getWidth() == i13 && bitmap.getHeight() == i14) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i14 > bitmap.getHeight() * i13) {
            width = i14 / bitmap.getHeight();
            width2 = (i13 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i13 / bitmap.getWidth();
            height = (i14 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(i13, i14, btonecajqb(bitmap));
        rgvfuqvkyq(bitmap, bitmapWkgbmnqykc);
        iobyxmoadg(bitmap, bitmapWkgbmnqykc, matrix);
        return bitmapWkgbmnqykc;
    }
}
