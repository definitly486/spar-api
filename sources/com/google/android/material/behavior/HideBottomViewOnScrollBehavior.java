package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.yggfygwlhe;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import da.zoijcleaow;
import java.util.Iterator;
import java.util.LinkedHashSet;
import na.nufgyqmvbu;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.ppxfxbqfkf {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private TimeInterpolator f22120cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f22121esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private TimeInterpolator f22122iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f22123jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f22124lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f22125pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f22126yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final LinkedHashSet f22127zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private ViewPropertyAnimator f22128zynmafqrjb;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final int f22118istkbnxepw = zoijcleaow.motionDurationLong2;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final int f22117cdpycssgdh = zoijcleaow.motionDurationMedium4;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final int f22119yadqdtsiqt = zoijcleaow.motionEasingEmphasizedInterpolator;

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f22128zynmafqrjb = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f22127zdlpuopuiu = new LinkedHashSet();
        this.f22121esjtqupxsv = 0;
        this.f22124lereixgezr = 2;
        this.f22125pmvmpeiblj = 0;
    }

    private void pkzmftpjix(View view, int i13, long j13, TimeInterpolator timeInterpolator) {
        this.f22128zynmafqrjb = view.animate().translationY(i13).setInterpolator(timeInterpolator).setDuration(j13).setListener(new iobyxmoadg());
    }

    private void stevsuqkhv(View view, int i13) {
        this.f22124lereixgezr = i13;
        Iterator it = this.f22127zdlpuopuiu.iterator();
        if (it.hasNext()) {
            yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
    }

    public void cllcsxoeiz(View view, boolean z13) {
        if (hcddaimhww()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22128zynmafqrjb;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        stevsuqkhv(view, 1);
        int i13 = this.f22121esjtqupxsv + this.f22125pmvmpeiblj;
        if (z13) {
            pkzmftpjix(view, i13, this.f22123jyumaefscl, this.f22120cqumvgiudr);
        } else {
            view.setTranslationY(i13);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void cqumvgiudr(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (i14 > 0) {
            hkdspvbjdz(view);
        } else if (i14 < 0) {
            dsvhmnatus(view);
        }
    }

    public void dsvhmnatus(View view) {
        wypolnanlu(view, true);
    }

    public boolean hcddaimhww() {
        return this.f22124lereixgezr == 1;
    }

    public void hkdspvbjdz(View view) {
        cllcsxoeiz(view, true);
    }

    public boolean jpowsppfya() {
        return this.f22124lereixgezr == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
        this.f22121esjtqupxsv = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f22126yggfygwlhe = nufgyqmvbu.gxszxtbevo(view.getContext(), f22118istkbnxepw, 225);
        this.f22123jyumaefscl = nufgyqmvbu.gxszxtbevo(view.getContext(), f22117cdpycssgdh, 175);
        Context context = view.getContext();
        int i14 = f22119yadqdtsiqt;
        this.f22122iwizpuwonk = nufgyqmvbu.lqeggnwhkg(context, i14, ea.iobyxmoadg.f31022wkgbmnqykc);
        this.f22120cqumvgiudr = nufgyqmvbu.lqeggnwhkg(view.getContext(), i14, ea.iobyxmoadg.f31021ppxfxbqfkf);
        return super.rgvfuqvkyq(coordinatorLayout, view, i13);
    }

    public void wypolnanlu(View view, boolean z13) {
        if (jpowsppfya()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f22128zynmafqrjb;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        stevsuqkhv(view, 2);
        if (z13) {
            pkzmftpjix(view, 0, this.f22126yggfygwlhe, this.f22122iwizpuwonk);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean yadqdtsiqt(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
        return i13 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22127zdlpuopuiu = new LinkedHashSet();
        this.f22121esjtqupxsv = 0;
        this.f22124lereixgezr = 2;
        this.f22125pmvmpeiblj = 0;
    }
}
