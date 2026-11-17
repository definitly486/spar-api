package ru.myspar.proloyalty.legacy.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import b31.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.legacy.presentation.view.CircleProgressBar;
import tg.draadjrbmk;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001c\b\u0007\u0018\u0000 82\u00020\u0001:\u00019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010*\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R$\u0010.\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b+\u0010\u0014\"\u0004\b,\u0010-R*\u00103\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u00101\"\u0004\b2\u0010-R*\u00107\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0014\u001a\u0004\b5\u00101\"\u0004\b6\u0010-¨\u0006:"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/CircleProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lgg/wwaezpbzkn;", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "zdlpuopuiu", "I", "startAngle", "Landroid/graphics/RectF;", "yggfygwlhe", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/Paint;", "jyumaefscl", "Landroid/graphics/Paint;", "paint", "", "value", "iwizpuwonk", "F", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "strokeWidth", "cqumvgiudr", "getProgress", "setProgress", "progress", "esjtqupxsv", "setMin", "(I)V", "min", "lereixgezr", "getMax", "()I", "setMax", "max", "pmvmpeiblj", "getForegroundStrokeColor", "setForegroundStrokeColor", "foregroundStrokeColor", "zynmafqrjb", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CircleProgressBar extends View {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata */
    private float progress;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private int min;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private float strokeWidth;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private int max;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private int foregroundStrokeColor;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final RectF rectF;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final int startAngle;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f97556istkbnxepw = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void setMin(int i13) {
        this.min = i13;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(CircleProgressBar circleProgressBar, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        circleProgressBar.setStrokeWidth(use.getDimension(ojitshcjhn.CircleProgressBar_progressBarThickness, circleProgressBar.strokeWidth));
        circleProgressBar.setProgress(use.getFloat(ojitshcjhn.CircleProgressBar_progress, 0.0f));
        circleProgressBar.setForegroundStrokeColor(use.getInt(ojitshcjhn.CircleProgressBar_progressbarColor, 0));
        circleProgressBar.setMin(use.getInt(ojitshcjhn.CircleProgressBar_min, circleProgressBar.min));
        circleProgressBar.setMax(use.getInt(ojitshcjhn.CircleProgressBar_max, circleProgressBar.max));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final int getForegroundStrokeColor() {
        return this.foregroundStrokeColor;
    }

    public final int getMax() {
        return this.max;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        zdlpuopuiu.btonecajqb(canvas, "canvas");
        int i13 = this.max;
        canvas.drawArc(this.rectF, this.startAngle, -((360 * (i13 - this.progress)) / i13), false, this.paint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iBtonecajqb = gtknphoqwx.btonecajqb(View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec));
        setMeasuredDimension(iBtonecajqb, iBtonecajqb);
        RectF rectF = this.rectF;
        float f13 = 0;
        float f14 = this.strokeWidth;
        float f15 = 2;
        float f16 = iBtonecajqb;
        rectF.set((f14 / f15) + f13, f13 + (f14 / f15), f16 - (f14 / f15), f16 - (f14 / f15));
    }

    public final void setForegroundStrokeColor(int i13) {
        this.foregroundStrokeColor = i13;
        this.paint.setColor(i13);
        invalidate();
        requestLayout();
    }

    public final void setMax(int i13) {
        this.max = i13;
        invalidate();
    }

    @Keep
    public final void setProgress(float f13) {
        this.progress = f13;
        invalidate();
    }

    public final void setStrokeWidth(float f13) {
        this.strokeWidth = f13;
        this.paint.setStrokeWidth(f13);
        invalidate();
        requestLayout();
    }

    public /* synthetic */ CircleProgressBar(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.startAngle = -90;
        this.rectF = new RectF();
        this.strokeWidth = 4.0f;
        this.max = 100;
        Paint paint = new Paint(1);
        paint.setColor(this.foregroundStrokeColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(paint.getStrokeWidth());
        this.paint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ojitshcjhn.CircleProgressBar, 0, 0);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        dxjokdxxww.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: bc1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return CircleProgressBar.zoijcleaow(this.f15762zdlpuopuiu, (TypedArray) obj);
            }
        });
    }
}
