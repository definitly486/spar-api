package m0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp extends MetricAffectingSpan {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f64844zdlpuopuiu;

    public wflxmlrfwp(float f13) {
        this.f64844zdlpuopuiu = f13;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f64844zdlpuopuiu + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.f64844zdlpuopuiu + textPaint.getTextSkewX());
    }
}
