package lr0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public class iobyxmoadg extends MetricAffectingSpan {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Typeface f63917zdlpuopuiu;

    public iobyxmoadg(Typeface typeface) {
        this.f63917zdlpuopuiu = typeface;
    }

    private final void iobyxmoadg(TextPaint textPaint) {
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface(Typeface.create(this.f63917zdlpuopuiu, typeface != null ? typeface.getStyle() : 0));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        zdlpuopuiu.btonecajqb(textPaint, "textPaint");
        iobyxmoadg(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        zdlpuopuiu.btonecajqb(textPaint, "textPaint");
        iobyxmoadg(textPaint);
    }
}
