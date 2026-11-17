package k0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final esjtqupxsv f53302iobyxmoadg = new esjtqupxsv();

    private esjtqupxsv() {
    }

    public final boolean iobyxmoadg(Canvas canvas, float f13, float f14, float f15, float f16) {
        return canvas.quickReject(f13, f14, f15, f16);
    }

    public final boolean ppxfxbqfkf(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public final boolean zoijcleaow(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }
}
