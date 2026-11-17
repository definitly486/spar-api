package kk;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class fiwbwshyhd implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ View f56573iobyxmoadg;

    public fiwbwshyhd(View view) {
        this.f56573iobyxmoadg = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animator, "animator");
        View view = this.f56573iobyxmoadg;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(animator, "animator");
    }
}
