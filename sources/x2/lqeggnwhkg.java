package x2;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    public static void iobyxmoadg(Spannable spannable, float f13, int i13, int i14, int i15) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i13, i14, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i13 && spannable.getSpanEnd(relativeSizeSpan) >= i14) {
                f13 *= relativeSizeSpan.getSizeChange();
            }
            ppxfxbqfkf(spannable, relativeSizeSpan, i13, i14, i15);
        }
        spannable.setSpan(new RelativeSizeSpan(f13), i13, i14, i15);
    }

    private static void ppxfxbqfkf(Spannable spannable, Object obj, int i13, int i14, int i15) {
        if (spannable.getSpanStart(obj) == i13 && spannable.getSpanEnd(obj) == i14 && spannable.getSpanFlags(obj) == i15) {
            spannable.removeSpan(obj);
        }
    }

    public static void zoijcleaow(Spannable spannable, Object obj, int i13, int i14, int i15) {
        for (Object obj2 : spannable.getSpans(i13, i14, obj.getClass())) {
            ppxfxbqfkf(spannable, obj2, i13, i14, i15);
        }
        spannable.setSpan(obj, i13, i14, i15);
    }
}
