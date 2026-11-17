package m0;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn extends MetricAffectingSpan {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Typeface f64843zdlpuopuiu;

    public ojitshcjhn(Typeface typeface) {
        this.f64843zdlpuopuiu = typeface;
    }

    private final void iobyxmoadg(Paint paint) {
        paint.setTypeface(this.f64843zdlpuopuiu);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        iobyxmoadg(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        iobyxmoadg(textPaint);
    }
}
