package a60;

import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import h.bfopjjpdmp;
import j0.eablkybsjg;
import j0.jrbgnlbqoe;
import kotlin.jvm.internal.zdlpuopuiu;
import n0.lereixgezr;
import n0.yadqdtsiqt;
import v0.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final eablkybsjg iobyxmoadg(Spanned spanned) {
        zdlpuopuiu.btonecajqb(spanned, "<this>");
        eablkybsjg.zoijcleaow zoijcleaowVar = new eablkybsjg.zoijcleaow(0, 1, null);
        zoijcleaowVar.gtknphoqwx(spanned.toString());
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        zdlpuopuiu.dxjokdxxww(spans, "getSpans(...)");
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, yadqdtsiqt.f68367yggfygwlhe.iobyxmoadg(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), spanStart, spanEnd);
                } else if (style == 2) {
                    zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, lereixgezr.ppxfxbqfkf(lereixgezr.f68283zoijcleaow.iobyxmoadg()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), spanStart, spanEnd);
                } else if (style == 3) {
                    zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, yadqdtsiqt.f68367yggfygwlhe.iobyxmoadg(), lereixgezr.ppxfxbqfkf(lereixgezr.f68283zoijcleaow.iobyxmoadg()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, gtknphoqwx.f114956zoijcleaow.wkgbmnqykc(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(bfopjjpdmp.zoijcleaow(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), spanStart, spanEnd);
            } else if (obj instanceof BackgroundColorSpan) {
                zoijcleaowVar.eablkybsjg(new jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, null, null, null, bfopjjpdmp.zoijcleaow(((BackgroundColorSpan) obj).getBackgroundColor()), null, null, null, null, 63487, null), spanStart, spanEnd);
            }
        }
        return zoijcleaowVar.yggfygwlhe();
    }
}
