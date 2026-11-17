package k0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final draadjrbmk f53300iobyxmoadg = new draadjrbmk();

    private draadjrbmk() {
    }

    public static final BoringLayout iobyxmoadg(CharSequence charSequence, TextPaint textPaint, int i13, Layout.Alignment alignment, float f13, float f14, BoringLayout.Metrics metrics, boolean z13, TextUtils.TruncateAt truncateAt, int i14) {
        return new BoringLayout(charSequence, textPaint, i13, alignment, f13, f14, metrics, z13, truncateAt, i14);
    }

    public static final BoringLayout.Metrics zoijcleaow(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
