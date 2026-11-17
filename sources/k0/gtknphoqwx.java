package k0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gtknphoqwx f53303iobyxmoadg = new gtknphoqwx();

    private gtknphoqwx() {
    }

    public final BoringLayout iobyxmoadg(CharSequence charSequence, TextPaint textPaint, int i13, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z13, boolean z14, TextUtils.TruncateAt truncateAt, int i14) {
        if (!(i13 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("negative width");
        }
        if (!(i14 >= 0)) {
            q0.iobyxmoadg.iobyxmoadg("negative ellipsized width");
        }
        return Build.VERSION.SDK_INT >= 33 ? btonecajqb.iobyxmoadg(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, metrics, z13, z14, truncateAt, i14) : draadjrbmk.iobyxmoadg(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, metrics, z13, truncateAt, i14);
    }

    public final BoringLayout.Metrics ppxfxbqfkf(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return Build.VERSION.SDK_INT >= 33 ? btonecajqb.zoijcleaow(charSequence, textPaint, textDirectionHeuristic) : draadjrbmk.zoijcleaow(charSequence, textPaint, textDirectionHeuristic);
    }

    public final boolean zoijcleaow(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return btonecajqb.ppxfxbqfkf(boringLayout);
        }
        return false;
    }
}
