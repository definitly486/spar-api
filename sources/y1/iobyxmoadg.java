package y1;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String[] f123509iobyxmoadg = new String[0];

    /* JADX INFO: renamed from: y1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C3120iobyxmoadg {
        static void iobyxmoadg(EditorInfo editorInfo, CharSequence charSequence, int i13) {
            editorInfo.setInitialSurroundingSubText(charSequence, i13);
        }
    }

    private static class zoijcleaow {
        static void iobyxmoadg(EditorInfo editorInfo, boolean z13) {
            editorInfo.setStylusHandwritingEnabled(z13);
        }
    }

    public static void eablkybsjg(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3120iobyxmoadg.iobyxmoadg(editorInfo, charSequence, 0);
        } else {
            wkgbmnqykc(editorInfo, charSequence, 0);
        }
    }

    public static void gxszxtbevo(EditorInfo editorInfo, boolean z13) {
        if (q1.iobyxmoadg.ppxfxbqfkf()) {
            zoijcleaow.iobyxmoadg(editorInfo, z13);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z13);
    }

    private static boolean iobyxmoadg(CharSequence charSequence, int i13, int i14) {
        if (i14 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i13));
        }
        if (i14 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i13));
    }

    private static void lqeggnwhkg(EditorInfo editorInfo, CharSequence charSequence, int i13, int i14) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i13);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i14);
    }

    private static void nufgyqmvbu(EditorInfo editorInfo, CharSequence charSequence, int i13, int i14) {
        int i15 = i14 - i13;
        int i16 = i15 > 1024 ? 0 : i15;
        int i17 = 2048 - i16;
        int iMin = Math.min(charSequence.length() - i14, i17 - Math.min(i13, (int) (((double) i17) * 0.8d)));
        int iMin2 = Math.min(i13, i17 - iMin);
        int i18 = i13 - iMin2;
        if (iobyxmoadg(charSequence, i18, 0)) {
            i18++;
            iMin2--;
        }
        if (iobyxmoadg(charSequence, (i14 + iMin) - 1, 1)) {
            iMin--;
        }
        lqeggnwhkg(editorInfo, i16 != i15 ? TextUtils.concat(charSequence.subSequence(i18, i18 + iMin2), charSequence.subSequence(i14, iMin + i14)) : charSequence.subSequence(i18, iMin2 + i16 + iMin + i18), iMin2, i16 + iMin2);
    }

    public static void ppxfxbqfkf(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void wkgbmnqykc(EditorInfo editorInfo, CharSequence charSequence, int i13) {
        nufgyqmvbu.gxszxtbevo(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C3120iobyxmoadg.iobyxmoadg(editorInfo, charSequence, i13);
            return;
        }
        int i14 = editorInfo.initialSelStart;
        int i15 = editorInfo.initialSelEnd;
        int i16 = i14 > i15 ? i15 - i13 : i14 - i13;
        int i17 = i14 > i15 ? i14 - i13 : i15 - i13;
        int length = charSequence.length();
        if (i13 < 0 || i16 < 0 || i17 > length) {
            lqeggnwhkg(editorInfo, null, 0, 0);
            return;
        }
        if (zoijcleaow(editorInfo.inputType)) {
            lqeggnwhkg(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            lqeggnwhkg(editorInfo, charSequence, i16, i17);
        } else {
            nufgyqmvbu(editorInfo, charSequence, i16, i17);
        }
    }

    private static boolean zoijcleaow(int i13) {
        int i14 = i13 & 4095;
        return i14 == 129 || i14 == 225 || i14 == 18;
    }
}
