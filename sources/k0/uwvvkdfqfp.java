package k0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public abstract class uwvvkdfqfp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final metgxyhuhe f53368iobyxmoadg = new metgxyhuhe();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final long f53369zoijcleaow = iobyxmoadg(0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0.nufgyqmvbu[] btonecajqb(rlfsiqarku rlfsiqarkuVar) {
        if (!(rlfsiqarkuVar.lmojexxdyd() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceLmojexxdyd = rlfsiqarkuVar.lmojexxdyd();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(charSequenceLmojexxdyd, "null cannot be cast to non-null type android.text.Spanned");
        if (!dsvhmnatus.iobyxmoadg((Spanned) charSequenceLmojexxdyd, m0.nufgyqmvbu.class) && rlfsiqarkuVar.lmojexxdyd().length() > 0) {
            return null;
        }
        CharSequence charSequenceLmojexxdyd2 = rlfsiqarkuVar.lmojexxdyd();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(charSequenceLmojexxdyd2, "null cannot be cast to non-null type android.text.Spanned");
        return (m0.nufgyqmvbu[]) ((Spanned) charSequenceLmojexxdyd2).getSpans(0, rlfsiqarkuVar.lmojexxdyd().length(), m0.nufgyqmvbu.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long draadjrbmk(rlfsiqarku rlfsiqarkuVar) {
        if (rlfsiqarkuVar.nufgyqmvbu() || rlfsiqarkuVar.pkzmftpjix()) {
            return f53369zoijcleaow;
        }
        TextPaint paint = rlfsiqarkuVar.dxjokdxxww().getPaint();
        CharSequence text = rlfsiqarkuVar.dxjokdxxww().getText();
        Rect rectPpxfxbqfkf = cllcsxoeiz.ppxfxbqfkf(paint, text, rlfsiqarkuVar.dxjokdxxww().getLineStart(0), rlfsiqarkuVar.dxjokdxxww().getLineEnd(0));
        int lineAscent = rlfsiqarkuVar.dxjokdxxww().getLineAscent(0);
        int i13 = rectPpxfxbqfkf.top;
        int topPadding = i13 < lineAscent ? lineAscent - i13 : rlfsiqarkuVar.dxjokdxxww().getTopPadding();
        if (rlfsiqarkuVar.wflxmlrfwp() != 1) {
            int iWflxmlrfwp = rlfsiqarkuVar.wflxmlrfwp() - 1;
            rectPpxfxbqfkf = cllcsxoeiz.ppxfxbqfkf(paint, text, rlfsiqarkuVar.dxjokdxxww().getLineStart(iWflxmlrfwp), rlfsiqarkuVar.dxjokdxxww().getLineEnd(iWflxmlrfwp));
        }
        int lineDescent = rlfsiqarkuVar.dxjokdxxww().getLineDescent(rlfsiqarkuVar.wflxmlrfwp() - 1);
        int i14 = rectPpxfxbqfkf.bottom;
        int bottomPadding = i14 > lineDescent ? i14 - lineDescent : rlfsiqarkuVar.dxjokdxxww().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f53369zoijcleaow : iobyxmoadg(topPadding, bottomPadding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long dxjokdxxww(m0.nufgyqmvbu[] nufgyqmvbuVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (m0.nufgyqmvbu nufgyqmvbuVar : nufgyqmvbuVarArr) {
            if (nufgyqmvbuVar.ppxfxbqfkf() < 0) {
                iMax = Math.max(iMax, Math.abs(nufgyqmvbuVar.ppxfxbqfkf()));
            }
            if (nufgyqmvbuVar.wkgbmnqykc() < 0) {
                iMax2 = Math.max(iMax, Math.abs(nufgyqmvbuVar.wkgbmnqykc()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f53369zoijcleaow : iobyxmoadg(iMax, iMax2);
    }

    public static final TextDirectionHeuristic gtknphoqwx(int i13) {
        if (i13 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i13 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i13 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i13 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i13 != 4) {
            return i13 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    public static final long iobyxmoadg(int i13, int i14) {
        return yfnezrywwk.iobyxmoadg((((long) i14) & 4294967295L) | (((long) i13) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt nufgyqmvbu(rlfsiqarku rlfsiqarkuVar, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, m0.nufgyqmvbu[] nufgyqmvbuVarArr) {
        int iWflxmlrfwp = rlfsiqarkuVar.wflxmlrfwp() - 1;
        if (rlfsiqarkuVar.dxjokdxxww().getLineStart(iWflxmlrfwp) != rlfsiqarkuVar.dxjokdxxww().getLineEnd(iWflxmlrfwp) || nufgyqmvbuVarArr == null || nufgyqmvbuVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        m0.nufgyqmvbu nufgyqmvbuVar = (m0.nufgyqmvbu) hg.agtfadlqog.yfnezrywwk(nufgyqmvbuVarArr);
        spannableString.setSpan(nufgyqmvbuVar.zoijcleaow(0, spannableString.length(), (iWflxmlrfwp == 0 || !nufgyqmvbuVar.eablkybsjg()) ? nufgyqmvbuVar.eablkybsjg() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutIobyxmoadg = ikoacuggdj.f53307iobyxmoadg.iobyxmoadg(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? iozdgvuglv.f53310iobyxmoadg.zoijcleaow() : textDirectionHeuristic, (2072512 & 64) != 0 ? iozdgvuglv.f53310iobyxmoadg.iobyxmoadg() : null, (2072512 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Integer.MAX_VALUE : 0, (2072512 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : null, (2072512 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Integer.MAX_VALUE : 0, (2072512 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : rlfsiqarkuVar.nufgyqmvbu(), (2072512 & 16384) != 0 ? true : rlfsiqarkuVar.eablkybsjg(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutIobyxmoadg.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutIobyxmoadg.getLineDescent(0);
        fontMetricsInt.top = staticLayoutIobyxmoadg.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutIobyxmoadg.getLineBottom(0);
        return fontMetricsInt;
    }

    public static final boolean wflxmlrfwp(Layout layout, int i13) {
        return layout.getEllipsisCount(i13) > 0;
    }
}
