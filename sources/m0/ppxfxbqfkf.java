package m0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import k0.uwvvkdfqfp;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z13, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i18)) != layout.getLineCount() - 1 || !uwvvkdfqfp.wflxmlrfwp(layout, lineForOffset)) {
            return;
        }
        float fIobyxmoadg = wkgbmnqykc.iobyxmoadg(layout, lineForOffset, paint) + wkgbmnqykc.ppxfxbqfkf(layout, lineForOffset, paint);
        if (fIobyxmoadg == 0.0f) {
            return;
        }
        zdlpuopuiu.lqeggnwhkg(canvas);
        canvas.translate(fIobyxmoadg, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z13) {
        return 0;
    }
}
