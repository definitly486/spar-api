package k0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final btonecajqb f53295iobyxmoadg = new btonecajqb();

    private btonecajqb() {
    }

    public static final BoringLayout iobyxmoadg(CharSequence charSequence, TextPaint textPaint, int i13, Layout.Alignment alignment, float f13, float f14, BoringLayout.Metrics metrics, boolean z13, boolean z14, TextUtils.TruncateAt truncateAt, int i14) {
        return lqeggnwhkg.iobyxmoadg(charSequence, textPaint, i13, alignment, f13, f14, metrics, z13, truncateAt, i14, z14);
    }

    public static final boolean ppxfxbqfkf(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final BoringLayout.Metrics zoijcleaow(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }
}
