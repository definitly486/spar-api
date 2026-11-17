package j2;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements InputFilter {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f50560iobyxmoadg;

    wkgbmnqykc(TextView textView) {
        this.f50560iobyxmoadg = textView;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
        if (this.f50560iobyxmoadg.isInEditMode()) {
            return charSequence;
        }
        i2.iobyxmoadg.iobyxmoadg();
        throw null;
    }
}
