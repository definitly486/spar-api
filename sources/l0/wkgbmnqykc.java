package l0;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharSequence f61215iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TextPaint f61216zoijcleaow;

    public wkgbmnqykc(CharSequence charSequence, TextPaint textPaint) {
        this.f61215iobyxmoadg = charSequence;
        this.f61216zoijcleaow = textPaint;
    }

    @Override // l0.zoijcleaow
    public int eablkybsjg(int i13) {
        TextPaint textPaint = this.f61216zoijcleaow;
        CharSequence charSequence = this.f61215iobyxmoadg;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i13, 0);
    }

    @Override // l0.zoijcleaow
    public int gxszxtbevo(int i13) {
        TextPaint textPaint = this.f61216zoijcleaow;
        CharSequence charSequence = this.f61215iobyxmoadg;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i13, 2);
    }
}
