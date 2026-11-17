package k0;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* JADX INFO: loaded from: classes.dex */
final class istkbnxepw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final istkbnxepw f53314iobyxmoadg = new istkbnxepw();

    private istkbnxepw() {
    }

    public final void iobyxmoadg(Canvas canvas, int[] iArr, int i13, float[] fArr, int i14, int i15, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i13, fArr, i14, i15, font, paint);
    }

    public final void ppxfxbqfkf(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public final void zoijcleaow(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }
}
