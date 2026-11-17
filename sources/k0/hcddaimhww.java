package k0;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final boolean f53305iobyxmoadg = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence eablkybsjg(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        if (!dsvhmnatus.iobyxmoadg(spanned, CharacterStyle.class) || (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) == null || characterStyleArr.length == 0) {
            return charSequence;
        }
        Iterator itIobyxmoadg = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(characterStyleArr);
        SpannableString spannableString = null;
        while (itIobyxmoadg.hasNext()) {
            CharacterStyle characterStyle = (CharacterStyle) itIobyxmoadg.next();
            if (!(characterStyle instanceof MetricAffectingSpan)) {
                if (spannableString == null) {
                    spannableString = new SpannableString(charSequence);
                }
                spannableString.removeSpan(characterStyle);
            }
        }
        return spannableString != null ? spannableString : charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final boolean wkgbmnqykc(float f13, CharSequence charSequence, TextPaint textPaint) {
        if (f13 != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!dsvhmnatus.iobyxmoadg(spanned, m0.gxszxtbevo.class) && !dsvhmnatus.iobyxmoadg(spanned, m0.eablkybsjg.class)) {
                    if (textPaint.getLetterSpacing() == 0.0f) {
                    }
                }
            } else if (textPaint.getLetterSpacing() == 0.0f) {
            }
            return true;
        }
        return false;
    }
}
