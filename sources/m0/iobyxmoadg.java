package m0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg extends MetricAffectingSpan {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f64828zdlpuopuiu;

    public iobyxmoadg(float f13) {
        this.f64828zdlpuopuiu = f13;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f64828zdlpuopuiu);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f64828zdlpuopuiu);
    }
}
