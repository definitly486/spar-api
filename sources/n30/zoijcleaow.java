package n30;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements InputFilter {
    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
        if (charSequence == null) {
            return null;
        }
        while (i13 < i14) {
            if (Character.isWhitespace(charSequence.charAt(i13))) {
                return "";
            }
            i13++;
        }
        return null;
    }
}
