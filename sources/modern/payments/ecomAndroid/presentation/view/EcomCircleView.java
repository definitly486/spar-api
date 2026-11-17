package modern.payments.ecomAndroid.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010$R\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/EcomCircleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "circleRadius", "circleColor", "", "isAntiAlias", "(Landroid/content/Context;IIZ)V", "Lgg/wwaezpbzkn;", "initValues", "()V", "drawOnlyStroke", "strokeWidth", "initialize", "(IIZI)V", "initAttributes", "(Landroid/util/AttributeSet;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "color", "setCircleColor", "(I)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/content/Context;", "I", "getStrokeWidth", "()I", "setStrokeWidth", "Z", "", "xyCordinates", "F", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomCircleView extends View {
    private int circleColor;
    private int circleRadius;
    private final Context context;
    private boolean drawOnlyStroke;
    private boolean isAntiAlias;
    private final Paint paint;
    private int strokeWidth;
    private float xyCordinates;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomCircleView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void initValues() {
        this.paint.setAntiAlias(this.isAntiAlias);
        if (this.drawOnlyStroke) {
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(this.strokeWidth);
        } else {
            this.paint.setStyle(Paint.Style.FILL);
        }
        this.paint.setColor(this.circleColor);
        this.xyCordinates = this.circleRadius + (this.strokeWidth / 2);
    }

    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    public final void initAttributes(AttributeSet attrs) {
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = this.context.obtainStyledAttributes(attrs, R.styleable.EcomCircleView, 0, 0);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EcomCircleView_ecom_circle_radius, 10);
        this.circleColor = typedArrayObtainStyledAttributes.getColor(R.styleable.EcomCircleView_ecom_circle_color, 0);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.EcomCircleView_ecom_circle_draw_only_stroke, false);
        this.drawOnlyStroke = z13;
        if (z13) {
            this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EcomCircleView_ecom_circle_stroke_width, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void initialize(int circleRadius, int circleColor, boolean drawOnlyStroke, int strokeWidth) {
        this.circleRadius = circleRadius;
        this.circleColor = circleColor;
        this.drawOnlyStroke = drawOnlyStroke;
        this.strokeWidth = strokeWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        zdlpuopuiu.btonecajqb(canvas, "canvas");
        super.onDraw(canvas);
        float f13 = this.xyCordinates;
        canvas.drawCircle(f13, f13, this.circleRadius, this.paint);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i13 = (this.circleRadius * 2) + this.strokeWidth;
        setMeasuredDimension(i13, i13);
    }

    public final void setCircleColor(int color) {
        this.circleColor = color;
        this.paint.setColor(color);
    }

    public final void setStrokeWidth(int i13) {
        this.strokeWidth = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ EcomCircleView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomCircleView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
        this.circleRadius = 10;
        this.isAntiAlias = true;
        this.paint = new Paint();
        if (attributeSet != null) {
            initAttributes(attributeSet);
        }
        initValues();
    }

    public /* synthetic */ EcomCircleView(Context context, int i13, int i14, boolean z13, int i15, gtknphoqwx gtknphoqwxVar) {
        this(context, i13, i14, (i15 & 8) != 0 ? true : z13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomCircleView(Context context, int i13, int i14, boolean z13) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
        this.circleRadius = i13;
        this.circleColor = i14;
        this.isAntiAlias = z13;
        initValues();
    }
}
