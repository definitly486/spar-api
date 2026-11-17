package com.yandex.mapkit.render.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.yandex.runtime.device.internal.DeviceInfo;
import com.yandex.runtime.image.ImageProvider;

/* JADX INFO: loaded from: classes3.dex */
public class TextualImageProvider extends ImageProvider {
    private static final float DELTA = 1.5f;
    private static final float FONT_SCALE = 1.0f;
    private static final SparseArray<Paint> map = new SparseArray<>();
    private final Bitmap bitmap;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f25456id;

    public TextualImageProvider(String str, int i13, boolean z13, int i14, int i15) {
        this.f25456id = "text:" + str + " fontSize:" + i13 + " isOutlined:" + z13;
        Paint paint = getPaint(i13);
        float fMeasureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (fMeasureText + 0.5f), (int) (Math.abs(fontMetrics.bottom) + Math.abs(fontMetrics.top) + 0.5f), Bitmap.Config.ARGB_8888);
        this.bitmap = bitmapCreateBitmap;
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float fAbs = Math.abs(fontMetrics.ascent);
        synchronized (map) {
            if (z13) {
                try {
                    paint.setColor(i15);
                    float f13 = fAbs - DELTA;
                    canvas.drawText(str, -1.5f, f13, paint);
                    canvas.drawText(str, DELTA, f13, paint);
                    float f14 = fAbs + DELTA;
                    canvas.drawText(str, DELTA, f14, paint);
                    canvas.drawText(str, -1.5f, f14, paint);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            paint.setColor(i14);
            canvas.drawText(str, 0.0f, fAbs, paint);
        }
    }

    public static int baseline(int i13) {
        return Math.round(Math.abs(getPaint(i13).getFontMetrics().ascent));
    }

    private static Paint getPaint(int i13) {
        Paint paint;
        SparseArray<Paint> sparseArray = map;
        synchronized (sparseArray) {
            try {
                paint = sparseArray.get(i13);
                if (paint == null) {
                    paint = new Paint();
                    paint.setTextSize(i13 * FONT_SCALE * DeviceInfo.pixelsPerPoint());
                    paint.setTextAlign(Paint.Align.LEFT);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                    sparseArray.put(i13, paint);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return paint;
    }

    public static Size measureText(String str, int i13) {
        Paint paint = getPaint(i13);
        float fMeasureText = paint.measureText(str);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new Size((int) (fMeasureText + 0.5f), (int) (Math.abs(fontMetrics.bottom) + Math.abs(fontMetrics.top) + 0.5f));
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public String getId() {
        return this.f25456id;
    }

    @Override // com.yandex.runtime.image.ImageProvider
    public Bitmap getImage() {
        return this.bitmap;
    }
}
