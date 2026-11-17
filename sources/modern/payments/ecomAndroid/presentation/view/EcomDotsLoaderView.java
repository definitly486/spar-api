package modern.payments.ecomAndroid.presentation.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010+\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001cR\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"Lmodern/payments/ecomAndroid/presentation/view/EcomDotsLoaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgg/wwaezpbzkn;", "initAttributes", "(Landroid/util/AttributeSet;)V", "initView", "()V", "startLoading", "Landroid/view/animation/TranslateAnimation;", "getTranslateAnim", "()Landroid/view/animation/TranslateAnimation;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "color", "setDotColor", "(I)V", "Landroid/content/Context;", "animDuration", "I", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/view/animation/Interpolator;", "dotsRadius", "dotsDist", "viewWidth", "viewHeight", "firstDotColor", "secondDotColor", "thirdDotColor", "Lmodern/payments/ecomAndroid/presentation/view/EcomCircleView;", "firstCircle", "Lmodern/payments/ecomAndroid/presentation/view/EcomCircleView;", "secondCircle", "thirdCircle", "firstDelayDuration", "secondDelayDuration", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomDotsLoaderView extends LinearLayout {
    private int animDuration;
    private final Context context;
    private int dotsDist;
    private int dotsRadius;
    private EcomCircleView firstCircle;
    private int firstDelayDuration;
    private int firstDotColor;
    private Interpolator interpolator;
    private EcomCircleView secondCircle;
    private int secondDelayDuration;
    private int secondDotColor;
    private EcomCircleView thirdCircle;
    private int thirdDotColor;
    private int viewHeight;
    private int viewWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomDotsLoaderView(Context context) {
        this(context, null, 0, 6, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final TranslateAnimation getTranslateAnim() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -(this.dotsRadius * 3));
        translateAnimation.setDuration(this.animDuration);
        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(1);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setInterpolator(translateAnimation.getInterpolator());
        return translateAnimation;
    }

    private final void initAttributes(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = this.context.obtainStyledAttributes(attrs, R.styleable.EcomDotsLoaderView, 0, 0);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.dotsRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EcomDotsLoaderView_ecom_loader_dots_radius, getResources().getDimensionPixelSize(R.dimen.ecom_loader_dot_size));
        this.dotsDist = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EcomDotsLoaderView_ecom_loader_dots_dist, getResources().getDimensionPixelSize(R.dimen.ecom_loader_dot_distance));
        this.firstDotColor = typedArrayObtainStyledAttributes.getColor(R.styleable.EcomDotsLoaderView_ecom_loader_first_dot_color, androidx.core.content.iobyxmoadg.getColor(this.context, R.color.ecom_loader_dot_default));
        this.secondDotColor = typedArrayObtainStyledAttributes.getColor(R.styleable.EcomDotsLoaderView_ecom_loader_second_dot_color, androidx.core.content.iobyxmoadg.getColor(this.context, R.color.ecom_loader_dot_default));
        this.thirdDotColor = typedArrayObtainStyledAttributes.getColor(R.styleable.EcomDotsLoaderView_ecom_loader_third_dot_color, androidx.core.content.iobyxmoadg.getColor(this.context, R.color.ecom_loader_dot_default));
        this.viewHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EcomDotsLoaderView_ecom_loader_dots_view_height, getResources().getDimensionPixelSize(R.dimen.ecom_loader_dots_view_height));
        this.viewWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.EcomDotsLoaderView_ecom_loader_dots_view_width, getResources().getDimensionPixelSize(R.dimen.ecom_loader_dots_view_width));
        this.animDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.EcomDotsLoaderView_ecom_loader_anim_duration, 500);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(this.context, typedArrayObtainStyledAttributes.getResourceId(R.styleable.EcomDotsLoaderView_ecom_loader_interpolator, android.R.anim.linear_interpolator));
        zdlpuopuiu.dxjokdxxww(interpolatorLoadInterpolator, "loadInterpolator(...)");
        this.interpolator = interpolatorLoadInterpolator;
        this.firstDelayDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.EcomDotsLoaderView_ecom_loader_first_delay_duration, 100);
        this.secondDelayDuration = typedArrayObtainStyledAttributes.getInt(R.styleable.EcomDotsLoaderView_ecom_loader_second_delay_duration, 200);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void initView() {
        removeAllViews();
        removeAllViewsInLayout();
        this.firstCircle = new EcomCircleView(this.context, this.dotsRadius, this.firstDotColor, false, 8, null);
        this.secondCircle = new EcomCircleView(this.context, this.dotsRadius, this.secondDotColor, false, 8, null);
        this.thirdCircle = new EcomCircleView(this.context, this.dotsRadius, this.thirdDotColor, false, 8, null);
        int i13 = this.dotsRadius;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13 * 2, i13 * 3);
        layoutParams.leftMargin = this.dotsDist;
        setVerticalGravity(17);
        setHorizontalGravity(17);
        View view = this.firstCircle;
        View view2 = null;
        if (view == null) {
            zdlpuopuiu.pmvmpeiblj("firstCircle");
            view = null;
        }
        addView(view);
        View view3 = this.secondCircle;
        if (view3 == null) {
            zdlpuopuiu.pmvmpeiblj("secondCircle");
            view3 = null;
        }
        addView(view3, layoutParams);
        View view4 = this.thirdCircle;
        if (view4 == null) {
            zdlpuopuiu.pmvmpeiblj("thirdCircle");
        } else {
            view2 = view4;
        }
        addView(view2, layoutParams);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: modern.payments.ecomAndroid.presentation.view.EcomDotsLoaderView.initView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                EcomDotsLoaderView.this.startLoading();
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLoading() {
        TranslateAnimation translateAnim = getTranslateAnim();
        EcomCircleView ecomCircleView = this.firstCircle;
        if (ecomCircleView == null) {
            zdlpuopuiu.pmvmpeiblj("firstCircle");
            ecomCircleView = null;
        }
        ecomCircleView.startAnimation(translateAnim);
        final TranslateAnimation translateAnim2 = getTranslateAnim();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: modern.payments.ecomAndroid.presentation.view.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                EcomDotsLoaderView.startLoading$lambda$1(this.f67706zdlpuopuiu, translateAnim2);
            }
        }, this.firstDelayDuration);
        final TranslateAnimation translateAnim3 = getTranslateAnim();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: modern.payments.ecomAndroid.presentation.view.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                EcomDotsLoaderView.startLoading$lambda$2(this.f67708zdlpuopuiu, translateAnim3);
            }
        }, this.secondDelayDuration);
        translateAnim3.setAnimationListener(new Animation.AnimationListener() { // from class: modern.payments.ecomAndroid.presentation.view.EcomDotsLoaderView.startLoading.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                EcomDotsLoaderView.this.startLoading();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                zdlpuopuiu.btonecajqb(animation, "animation");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLoading$lambda$1(EcomDotsLoaderView this$0, TranslateAnimation trans2Anim) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(trans2Anim, "$trans2Anim");
        EcomCircleView ecomCircleView = this$0.secondCircle;
        if (ecomCircleView == null) {
            zdlpuopuiu.pmvmpeiblj("secondCircle");
            ecomCircleView = null;
        }
        ecomCircleView.startAnimation(trans2Anim);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLoading$lambda$2(EcomDotsLoaderView this$0, TranslateAnimation trans3Anim) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(trans3Anim, "$trans3Anim");
        EcomCircleView ecomCircleView = this$0.thirdCircle;
        if (ecomCircleView == null) {
            zdlpuopuiu.pmvmpeiblj("thirdCircle");
            ecomCircleView = null;
        }
        ecomCircleView.startAnimation(trans3Anim);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i13 = this.dotsRadius;
        setMeasuredDimension(((i13 * 7) + (this.dotsDist * 2)) * 2, i13 * 14);
    }

    public final void setDotColor(int color) {
        EcomCircleView ecomCircleView = this.firstCircle;
        EcomCircleView ecomCircleView2 = null;
        if (ecomCircleView == null) {
            zdlpuopuiu.pmvmpeiblj("firstCircle");
            ecomCircleView = null;
        }
        ecomCircleView.setCircleColor(color);
        EcomCircleView ecomCircleView3 = this.secondCircle;
        if (ecomCircleView3 == null) {
            zdlpuopuiu.pmvmpeiblj("secondCircle");
            ecomCircleView3 = null;
        }
        ecomCircleView3.setCircleColor(color);
        EcomCircleView ecomCircleView4 = this.thirdCircle;
        if (ecomCircleView4 == null) {
            zdlpuopuiu.pmvmpeiblj("thirdCircle");
        } else {
            ecomCircleView2 = ecomCircleView4;
        }
        ecomCircleView2.setCircleColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcomDotsLoaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public /* synthetic */ EcomDotsLoaderView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomDotsLoaderView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.context = context;
        this.animDuration = 500;
        this.interpolator = new LinearInterpolator();
        this.firstDelayDuration = 100;
        this.secondDelayDuration = 200;
        if (attributeSet != null) {
            initAttributes(attributeSet);
        }
        initView();
    }
}
