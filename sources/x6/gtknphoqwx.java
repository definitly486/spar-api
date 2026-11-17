package x6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gtknphoqwx f121211iobyxmoadg = new gtknphoqwx();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Paint f121212zoijcleaow = new Paint(3);

    private gtknphoqwx() {
    }

    public final nufgyqmvbu iobyxmoadg(String str, bl.eablkybsjg eablkybsjgVar, btonecajqb btonecajqbVar) {
        if (!draadjrbmk.ppxfxbqfkf(btonecajqbVar, str)) {
            return nufgyqmvbu.f121223wkgbmnqykc;
        }
        androidx.exifinterface.media.iobyxmoadg iobyxmoadgVar = new androidx.exifinterface.media.iobyxmoadg(new dxjokdxxww(eablkybsjgVar.peek().j0()));
        return new nufgyqmvbu(iobyxmoadgVar.esjtqupxsv(), iobyxmoadgVar.rgvfuqvkyq());
    }

    public final Bitmap zoijcleaow(Bitmap bitmap, nufgyqmvbu nufgyqmvbuVar) {
        Bitmap bitmapCreateBitmap;
        if (!nufgyqmvbuVar.zoijcleaow() && !draadjrbmk.iobyxmoadg(nufgyqmvbuVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (nufgyqmvbuVar.zoijcleaow()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (draadjrbmk.iobyxmoadg(nufgyqmvbuVar)) {
            matrix.postRotate(nufgyqmvbuVar.iobyxmoadg(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f13 = rectF.left;
        if (f13 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f13, -rectF.top);
        }
        if (draadjrbmk.zoijcleaow(nufgyqmvbuVar)) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), i7.iobyxmoadg.ppxfxbqfkf(bitmap));
            zdlpuopuiu.dxjokdxxww(bitmapCreateBitmap, "createBitmap(width, height, config)");
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), i7.iobyxmoadg.ppxfxbqfkf(bitmap));
            zdlpuopuiu.dxjokdxxww(bitmapCreateBitmap, "createBitmap(width, height, config)");
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, f121212zoijcleaow);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }
}
