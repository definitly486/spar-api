package m0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends MetricAffectingSpan {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f64846zdlpuopuiu;

    public zoijcleaow(String str) {
        this.f64846zdlpuopuiu = str;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f64846zdlpuopuiu);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.f64846zdlpuopuiu);
    }
}
