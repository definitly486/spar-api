package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes.dex */
abstract class iozdgvuglv {
    public static void eablkybsjg(x2.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.zoijcleaow();
        if (zoijcleaowVar.eablkybsjg() instanceof Spanned) {
            if (!(zoijcleaowVar.eablkybsjg() instanceof Spannable)) {
                zoijcleaowVar.ojitshcjhn(SpannableString.valueOf(zoijcleaowVar.eablkybsjg()));
            }
            lqeggnwhkg((Spannable) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg()), new xa.wflxmlrfwp() { // from class: androidx.media3.ui.cdpycssgdh
                @Override // xa.wflxmlrfwp
                public final boolean apply(Object obj) {
                    return iozdgvuglv.ppxfxbqfkf(obj);
                }
            });
        }
        gxszxtbevo(zoijcleaowVar);
    }

    public static void gxszxtbevo(x2.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.vdvldrhtss(-3.4028235E38f, Integer.MIN_VALUE);
        if (zoijcleaowVar.eablkybsjg() instanceof Spanned) {
            if (!(zoijcleaowVar.eablkybsjg() instanceof Spannable)) {
                zoijcleaowVar.ojitshcjhn(SpannableString.valueOf(zoijcleaowVar.eablkybsjg()));
            }
            lqeggnwhkg((Spannable) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.eablkybsjg()), new xa.wflxmlrfwp() { // from class: androidx.media3.ui.yadqdtsiqt
                @Override // xa.wflxmlrfwp
                public final boolean apply(Object obj) {
                    return iozdgvuglv.wkgbmnqykc(obj);
                }
            });
        }
    }

    private static void lqeggnwhkg(Spannable spannable, xa.wflxmlrfwp wflxmlrfwpVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (wflxmlrfwpVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float nufgyqmvbu(int i13, float f13, int i14, int i15) {
        float f14;
        if (f13 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i13 == 0) {
            f14 = i15;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    return -3.4028235E38f;
                }
                return f13;
            }
            f14 = i14;
        }
        return f13 * f14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean ppxfxbqfkf(Object obj) {
        return !(obj instanceof x2.eablkybsjg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean wkgbmnqykc(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }
}
