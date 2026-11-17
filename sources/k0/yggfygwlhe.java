package k0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
final class yggfygwlhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final yggfygwlhe f53386iobyxmoadg = new yggfygwlhe();

    private yggfygwlhe() {
    }

    public final void dxjokdxxww(Canvas canvas) {
        canvas.enableZ();
    }

    public final void eablkybsjg(Canvas canvas, RectF rectF, float f13, float f14, RectF rectF2, float f15, float f16, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f13, f14, rectF2, f15, f16, paint);
    }

    public final void gxszxtbevo(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void iobyxmoadg(Canvas canvas) {
        canvas.disableZ();
    }

    public final void lqeggnwhkg(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void nufgyqmvbu(Canvas canvas, MeasuredText measuredText, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, Paint paint) {
        canvas.drawTextRun(measuredText, i13, i14, i15, i16, f13, f14, z13, paint);
    }

    public final void ppxfxbqfkf(Canvas canvas, long j13) {
        canvas.drawColor(j13);
    }

    public final void wkgbmnqykc(Canvas canvas, long j13, BlendMode blendMode) {
        canvas.drawColor(j13, blendMode);
    }

    public final void zoijcleaow(Canvas canvas, int i13, BlendMode blendMode) {
        canvas.drawColor(i13, blendMode);
    }
}
