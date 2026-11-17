package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private AnimatorSet f23557yggfygwlhe;

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f23557yggfygwlhe = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    protected abstract AnimatorSet cllcsxoeiz(View view, View view2, boolean z13, boolean z14);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean jpowsppfya(View view, View view2, boolean z13, boolean z14) {
        AnimatorSet animatorSet = this.f23557yggfygwlhe;
        boolean z15 = animatorSet != null;
        if (z15) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetCllcsxoeiz = cllcsxoeiz(view, view2, z13, z15);
        this.f23557yggfygwlhe = animatorSetCllcsxoeiz;
        animatorSetCllcsxoeiz.addListener(new iobyxmoadg());
        this.f23557yggfygwlhe.start();
        if (!z14) {
            this.f23557yggfygwlhe.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
