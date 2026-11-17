package spay.sdk.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import kk.kl;
import kk.rc;
import kk.ud;
import kk.v4;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;
import spay.sdk.view.SpayDotsLoaderView;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lspay/sdk/view/SpayDotsLoaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/animation/TranslateAnimation;", "getTranslateAnim", "()Landroid/view/animation/TranslateAnimation;", "d", "I", "getDotsColor", "()I", "setDotsColor", "(I)V", "dotsColor", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpayDotsLoaderView extends LinearLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f107877m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f107879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int dotsColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f107882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f107883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f107884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v4 f107885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v4 f107886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v4 f107887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f107888k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f107889l;

    public SpayDotsLoaderView(Context context) {
        super(context);
        this.f107878a = 500;
        new LinearInterpolator();
        Resources resources = getResources();
        zdlpuopuiu.dxjokdxxww(resources, "resources");
        this.dotsColor = kl.iobyxmoadg(resources, R.color.spay_loader_dot_default);
        this.f107888k = 100;
        this.f107889l = 200;
        a();
    }

    private final TranslateAnimation getTranslateAnim() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -(this.f107879b * 3));
        translateAnimation.setDuration(this.f107878a);
        translateAnimation.setFillAfter(true);
        translateAnimation.setRepeatCount(1);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setInterpolator(translateAnimation.getInterpolator());
        return translateAnimation;
    }

    public final void a(AttributeSet attrs) {
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.SpayDotsLoaderView, 0, 0);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…SpayDotsLoaderView, 0, 0)");
        this.f107879b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_radius, getResources().getDimensionPixelSize(R.dimen.spay_loader_dot_size));
        this.f107880c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_dist, getResources().getDimensionPixelSize(R.dimen.spay_loader_dot_distance));
        int i13 = R.styleable.SpayDotsLoaderView_spay_loader_first_dot_color;
        Resources resources = getResources();
        zdlpuopuiu.dxjokdxxww(resources, "resources");
        this.f107882e = typedArrayObtainStyledAttributes.getColor(i13, kl.iobyxmoadg(resources, R.color.spay_loader_dot_default));
        int i14 = R.styleable.SpayDotsLoaderView_spay_loader_second_dot_color;
        Resources resources2 = getResources();
        zdlpuopuiu.dxjokdxxww(resources2, "resources");
        this.f107883f = typedArrayObtainStyledAttributes.getColor(i14, kl.iobyxmoadg(resources2, R.color.spay_loader_dot_default));
        int i15 = R.styleable.SpayDotsLoaderView_spay_loader_third_dot_color;
        Resources resources3 = getResources();
        zdlpuopuiu.dxjokdxxww(resources3, "resources");
        this.f107884g = typedArrayObtainStyledAttributes.getColor(i15, kl.iobyxmoadg(resources3, R.color.spay_loader_dot_default));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_view_height, getResources().getDimensionPixelSize(R.dimen.spay_loader_dots_view_height));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SpayDotsLoaderView_spay_loader_dots_view_width, getResources().getDimensionPixelSize(R.dimen.spay_loader_dots_view_width));
        this.f107878a = typedArrayObtainStyledAttributes.getInt(R.styleable.SpayDotsLoaderView_spay_loader_anim_duration, 500);
        zdlpuopuiu.dxjokdxxww(AnimationUtils.loadInterpolator(getContext(), typedArrayObtainStyledAttributes.getResourceId(R.styleable.SpayDotsLoaderView_spay_loader_interpolator, android.R.anim.linear_interpolator)), "loadInterpolator(\n      …r\n            )\n        )");
        this.f107888k = typedArrayObtainStyledAttributes.getInt(R.styleable.SpayDotsLoaderView_spay_loader_first_delay_duration, 100);
        this.f107889l = typedArrayObtainStyledAttributes.getInt(R.styleable.SpayDotsLoaderView_spay_loader_second_delay_duration, 200);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b() {
        TranslateAnimation translateAnim = getTranslateAnim();
        v4 v4Var = this.f107885h;
        if (v4Var == null) {
            zdlpuopuiu.pmvmpeiblj("firstCircle");
            v4Var = null;
        }
        v4Var.startAnimation(translateAnim);
        final TranslateAnimation translateAnim2 = getTranslateAnim();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: hc2.ppxfxbqfkf
            @Override // java.lang.Runnable
            public final void run() {
                SpayDotsLoaderView.a(this.f40059zdlpuopuiu, translateAnim2);
            }
        }, this.f107888k);
        final TranslateAnimation translateAnim3 = getTranslateAnim();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: hc2.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                SpayDotsLoaderView.b(this.f40061zdlpuopuiu, translateAnim3);
            }
        }, this.f107889l);
        translateAnim3.setAnimationListener(new ud(this));
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int i15 = this.f107879b;
        setMeasuredDimension(((this.f107880c * 2) + (i15 * 7)) * 2, i15 * 14);
    }

    public final void setDotsColor(int i13) {
        this.dotsColor = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayDotsLoaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        this.f107878a = 500;
        new LinearInterpolator();
        Resources resources = getResources();
        zdlpuopuiu.dxjokdxxww(resources, "resources");
        this.dotsColor = kl.iobyxmoadg(resources, R.color.spay_loader_dot_default);
        this.f107888k = 100;
        this.f107889l = 200;
        a(attrs);
        a();
    }

    public static final void b(SpayDotsLoaderView this$0, TranslateAnimation trans3Anim) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(trans3Anim, "$trans3Anim");
        v4 v4Var = this$0.f107887j;
        if (v4Var == null) {
            zdlpuopuiu.pmvmpeiblj("thirdCircle");
            v4Var = null;
        }
        v4Var.startAnimation(trans3Anim);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayDotsLoaderView(Context context, AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        zdlpuopuiu.btonecajqb(attrs, "attrs");
        this.f107878a = 500;
        new LinearInterpolator();
        Resources resources = getResources();
        zdlpuopuiu.dxjokdxxww(resources, "resources");
        this.dotsColor = kl.iobyxmoadg(resources, R.color.spay_loader_dot_default);
        this.f107888k = 100;
        this.f107889l = 200;
        a(attrs);
        a();
    }

    public final void a() {
        removeAllViews();
        removeAllViewsInLayout();
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "context");
        this.f107885h = new v4(context, this.f107879b, this.f107882e);
        Context context2 = getContext();
        zdlpuopuiu.dxjokdxxww(context2, "context");
        this.f107886i = new v4(context2, this.f107879b, this.f107883f);
        Context context3 = getContext();
        zdlpuopuiu.dxjokdxxww(context3, "context");
        this.f107887j = new v4(context3, this.f107879b, this.f107884g);
        int i13 = this.f107879b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13 * 2, i13 * 3);
        layoutParams.leftMargin = this.f107880c;
        setVerticalGravity(80);
        View view = this.f107885h;
        View view2 = null;
        if (view == null) {
            zdlpuopuiu.pmvmpeiblj("firstCircle");
            view = null;
        }
        addView(view);
        View view3 = this.f107886i;
        if (view3 == null) {
            zdlpuopuiu.pmvmpeiblj("secondCircle");
            view3 = null;
        }
        addView(view3, layoutParams);
        View view4 = this.f107887j;
        if (view4 == null) {
            zdlpuopuiu.pmvmpeiblj("thirdCircle");
        } else {
            view2 = view4;
        }
        addView(view2, layoutParams);
        getViewTreeObserver().addOnGlobalLayoutListener(new rc(this, this));
    }

    public static final void a(SpayDotsLoaderView this$0, TranslateAnimation trans2Anim) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(trans2Anim, "$trans2Anim");
        v4 v4Var = this$0.f107886i;
        if (v4Var == null) {
            zdlpuopuiu.pmvmpeiblj("secondCircle");
            v4Var = null;
        }
        v4Var.startAnimation(trans2Anim);
    }
}
