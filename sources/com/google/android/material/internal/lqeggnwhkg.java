package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ArrayList f22974iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private zoijcleaow f22977zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    ValueAnimator f22975ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Animator.AnimatorListener f22976wkgbmnqykc = new iobyxmoadg();

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
            if (lqeggnwhkgVar.f22975ppxfxbqfkf == animator) {
                lqeggnwhkgVar.f22975ppxfxbqfkf = null;
            }
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int[] f22979iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final ValueAnimator f22980zoijcleaow;

        zoijcleaow(int[] iArr, ValueAnimator valueAnimator) {
            this.f22979iobyxmoadg = iArr;
            this.f22980zoijcleaow = valueAnimator;
        }
    }

    public void iobyxmoadg(int[] iArr, ValueAnimator valueAnimator) {
        zoijcleaow zoijcleaowVar = new zoijcleaow(iArr, valueAnimator);
        valueAnimator.addListener(this.f22976wkgbmnqykc);
        this.f22974iobyxmoadg.add(zoijcleaowVar);
    }
}
