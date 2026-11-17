package k0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
final class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final agtfadlqog f53294iobyxmoadg = new agtfadlqog();

    private agtfadlqog() {
    }

    public final boolean eablkybsjg(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public final boolean iobyxmoadg(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean ppxfxbqfkf(Canvas canvas, int i13, int i14, int i15, int i16) {
        return canvas.clipOutRect(i13, i14, i15, i16);
    }

    public final boolean wkgbmnqykc(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean zoijcleaow(Canvas canvas, float f13, float f14, float f15, float f16) {
        return canvas.clipOutRect(f13, f14, f15, f16);
    }
}
