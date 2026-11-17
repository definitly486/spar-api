package k0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz {
    private static final void iobyxmoadg(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    public static final Rect ppxfxbqfkf(TextPaint textPaint, CharSequence charSequence, int i13, int i14) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (dsvhmnatus.zoijcleaow(spanned, MetricAffectingSpan.class, i13, i14)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i13 < i14) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i13, i14, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i13, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(metricAffectingSpanArr);
                    while (itIobyxmoadg.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) itIobyxmoadg.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    zoijcleaow(textPaint2, charSequence, i13, iNextSpanTransition, rect2);
                    iobyxmoadg(rect, rect2);
                    i13 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return wkgbmnqykc(textPaint, charSequence, i13, i14);
    }

    public static final Rect wkgbmnqykc(Paint paint, CharSequence charSequence, int i13, int i14) {
        Rect rect = new Rect();
        zoijcleaow(paint, charSequence, i13, i14, rect);
        return rect;
    }

    private static final void zoijcleaow(Paint paint, CharSequence charSequence, int i13, int i14, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            hkdspvbjdz.iobyxmoadg(paint, charSequence, i13, i14, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i13, i14, rect);
        }
    }
}
