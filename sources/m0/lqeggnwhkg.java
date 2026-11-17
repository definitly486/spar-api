package m0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg implements LineHeightSpan {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f64829iobyxmoadg;

    public lqeggnwhkg(float f13) {
        this.f64829iobyxmoadg = f13;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i13, int i14, int i15, int i16, Paint.FontMetricsInt fontMetricsInt) {
        int iIobyxmoadg = dxjokdxxww.iobyxmoadg(fontMetricsInt);
        if (iIobyxmoadg <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f64829iobyxmoadg);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iIobyxmoadg)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
