package m0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class agtfadlqog extends CharacterStyle {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f64808iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f64809zoijcleaow;

    public agtfadlqog(boolean z13, boolean z14) {
        this.f64808iobyxmoadg = z13;
        this.f64809zoijcleaow = z14;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f64808iobyxmoadg);
        textPaint.setStrikeThruText(this.f64809zoijcleaow);
    }
}
