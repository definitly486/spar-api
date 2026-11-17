package p0;

import android.view.inputmethod.ExtractedText;
import j0.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqumvgiudr {
    public static final ExtractedText iobyxmoadg(tzroggbefp tzroggbefpVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = tzroggbefpVar.draadjrbmk();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = tzroggbefpVar.draadjrbmk().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = l.draadjrbmk(tzroggbefpVar.gtknphoqwx());
        extractedText.selectionEnd = l.gtknphoqwx(tzroggbefpVar.gtknphoqwx());
        extractedText.flags = !mj.kcexrzcfyt.ulzqkzuiru(tzroggbefpVar.draadjrbmk(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
