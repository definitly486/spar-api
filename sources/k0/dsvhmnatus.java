package k0;

import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class dsvhmnatus {
    public static final boolean iobyxmoadg(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean zoijcleaow(Spanned spanned, Class cls, int i13, int i14) {
        return spanned.nextSpanTransition(i13 - 1, i14, cls) != i14;
    }
}
