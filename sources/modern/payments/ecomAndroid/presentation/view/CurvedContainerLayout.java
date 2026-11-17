package modern.payments.ecomAndroid.presentation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/CurvedContainerLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lgg/wwaezpbzkn;", "setCurvedViewBackground", "(I)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "leftArc", "Landroid/graphics/RectF;", "rightArc", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CurvedContainerLayout extends ConstraintLayout {
    private static final float X_AXIS_OFFSET = 80.0f;
    private static final float Y_AXIS_OFFSET = 80.0f;
    private final RectF leftArc;
    private final Paint mPaint;
    private final Path path;
    private final RectF rightArc;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurvedContainerLayout(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        zdlpuopuiu.btonecajqb(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.path, this.mPaint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w13, int h13, int oldw, int oldh) {
        super.onSizeChanged(w13, h13, oldw, oldh);
        this.leftArc.set(0.0f, 0.0f, 80.0f, 80.0f);
        this.path.addArc(this.leftArc, 180.0f, 90.0f);
        float f13 = w13;
        this.path.lineTo(f13 - 40.0f, 0.0f);
        this.rightArc.set(f13 - 80.0f, 0.0f, f13, 80.0f);
        this.path.addArc(this.rightArc, 270.0f, 90.0f);
        float f14 = h13;
        this.path.lineTo(f13, f14);
        this.path.lineTo(0.0f, f14);
        this.path.lineTo(0.0f, 40.0f);
        this.path.close();
    }

    public final void setCurvedViewBackground(int color) {
        this.mPaint.setColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurvedContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ CurvedContainerLayout(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurvedContainerLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        Paint paint = new Paint();
        this.mPaint = paint;
        this.path = new Path();
        this.leftArc = new RectF();
        this.rightArc = new RectF();
        setBackgroundColor(0);
        setLayerType(2, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAntiAlias(true);
        setClipChildren(true);
    }
}
