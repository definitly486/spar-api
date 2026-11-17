package s0;

import android.text.TextPaint;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class btonecajqb {
    public static final void iobyxmoadg(TextPaint textPaint, float f13) {
        if (Float.isNaN(f13)) {
            return;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f13 * KotlinVersion.MAX_COMPONENT_VALUE));
    }
}
