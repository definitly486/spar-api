package l0;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {
    public static final gxszxtbevo iobyxmoadg(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new wkgbmnqykc(charSequence, textPaint) : new eablkybsjg(charSequence);
    }
}
