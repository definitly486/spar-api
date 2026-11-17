package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ea.lqeggnwhkg;
import ea.zoijcleaow;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final lqeggnwhkg f23571iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lqeggnwhkg f23572jyumaefscl;

    class iobyxmoadg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ boolean f23573iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ View f23575zoijcleaow;

        iobyxmoadg(boolean z13, View view) {
            this.f23573iobyxmoadg = z13;
            this.f23575zoijcleaow = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f23573iobyxmoadg) {
                return;
            }
            this.f23575zoijcleaow.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f23573iobyxmoadg) {
                this.f23575zoijcleaow.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f23572jyumaefscl = new lqeggnwhkg(75L, 150L);
        this.f23571iwizpuwonk = new lqeggnwhkg(0L, 150L);
    }

    private void dsvhmnatus(View view, boolean z13, boolean z14, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        lqeggnwhkg lqeggnwhkgVar = z13 ? this.f23572jyumaefscl : this.f23571iwizpuwonk;
        if (z13) {
            if (!z14) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        lqeggnwhkgVar.iobyxmoadg(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet cllcsxoeiz(View view, View view2, boolean z13, boolean z14) {
        ArrayList arrayList = new ArrayList();
        dsvhmnatus(view2, z13, z14, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        zoijcleaow.iobyxmoadg(animatorSet, arrayList);
        animatorSet.addListener(new iobyxmoadg(z13, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean dxjokdxxww(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean wwaezpbzkn(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.wwaezpbzkn(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23572jyumaefscl = new lqeggnwhkg(75L, 150L);
        this.f23571iwizpuwonk = new lqeggnwhkg(0L, 150L);
    }
}
