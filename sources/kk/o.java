package kk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Transition {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final String[] f57869yggfygwlhe = {"heightTransition:height", "heightTransition:viewType"};

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final long f57870zdlpuopuiu;

    public o(long j13) {
        this.f57870zdlpuopuiu = j13;
    }

    public static final void zoijcleaow(View container, ValueAnimator animation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(container, "$container");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animation, "animation");
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        container.setLayoutParams(layoutParams);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transitionValues, "transitionValues");
        Map map = transitionValues.values;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(map, "transitionValues.values");
        Object parent = transitionValues.view.getParent();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        Point point = new Point();
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        int dimensionPixelSize = 0;
        view.measure(View.MeasureSpec.makeMeasureSpec(point.x, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        Point point2 = new Point();
        Object systemService2 = view.getContext().getSystemService("window");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService2).getDefaultDisplay().getSize(point2);
        int i13 = point2.y;
        Context context = view.getContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "view.context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        Integer numValueOf = Integer.valueOf(identifier);
        if (identifier <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(numValueOf.intValue());
        }
        map.put("heightTransition:height", Integer.valueOf(zg.gtknphoqwx.btonecajqb(measuredHeight, i13 - dimensionPixelSize)));
        Map map2 = transitionValues.values;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(map2, "transitionValues.values");
        map2.put("heightTransition:viewType", "end");
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transitionValues, "transitionValues");
        Map map = transitionValues.values;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(map, "transitionValues.values");
        map.put("heightTransition:height", Integer.valueOf(transitionValues.view.getHeight()));
        Map map2 = transitionValues.values;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(map2, "transitionValues.values");
        map2.put("heightTransition:viewType", "start");
        Object parent = transitionValues.view.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = view.getHeight();
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup sceneRoot, TransitionValues transitionValues, TransitionValues transitionValues2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sceneRoot, "sceneRoot");
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.view;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view, "endValues.view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(this.f57870zdlpuopuiu);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objectAnimatorOfFloat, "ofFloat(view, View.ALPHA…eInterpolator()\n        }");
        Object obj = transitionValues.values.get("heightTransition:height");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = transitionValues2.values.get("heightTransition:height");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj2).intValue();
        View view2 = transitionValues2.view;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(view2, "endValues.view");
        ValueAnimator valueAnimatorIobyxmoadg = iobyxmoadg(iIntValue, iIntValue2, view2);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(valueAnimatorIobyxmoadg, "prepareHeightAnimator(\n …Values.view\n            )");
        List listRgvfuqvkyq = hg.jyumaefscl.rgvfuqvkyq(objectAnimatorOfFloat, valueAnimatorIobyxmoadg);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listRgvfuqvkyq);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return f57869yggfygwlhe;
    }

    public final ValueAnimator iobyxmoadg(int i13, int i14, View view) {
        ValueAnimator prepareHeightAnimator$lambda$10 = ValueAnimator.ofInt(i13, i14);
        Object parent = view.getParent();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(parent, "null cannot be cast to non-null type android.view.View");
        final View view2 = (View) parent;
        prepareHeightAnimator$lambda$10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kk.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o.zoijcleaow(view2, valueAnimator);
            }
        });
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(prepareHeightAnimator$lambda$10, "prepareHeightAnimator$lambda$10");
        prepareHeightAnimator$lambda$10.addListener(new fiwbwshyhd(view2));
        prepareHeightAnimator$lambda$10.setStartDelay(this.f57870zdlpuopuiu / ((long) 3));
        prepareHeightAnimator$lambda$10.setDuration(this.f57870zdlpuopuiu / ((long) 2));
        prepareHeightAnimator$lambda$10.setInterpolator(new AccelerateInterpolator());
        return prepareHeightAnimator$lambda$10;
    }
}
