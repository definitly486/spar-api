package v1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class yfnezrywwk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final WeakReference f115242iobyxmoadg;

    class iobyxmoadg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ ydmasvzmpa f115243iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ View f115245zoijcleaow;

        iobyxmoadg(ydmasvzmpa ydmasvzmpaVar, View view) {
            this.f115243iobyxmoadg = ydmasvzmpaVar;
            this.f115245zoijcleaow = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f115243iobyxmoadg.iobyxmoadg(this.f115245zoijcleaow);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f115243iobyxmoadg.zoijcleaow(this.f115245zoijcleaow);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f115243iobyxmoadg.ppxfxbqfkf(this.f115245zoijcleaow);
        }
    }

    yfnezrywwk(View view) {
        this.f115242iobyxmoadg = new WeakReference(view);
    }

    private void dxjokdxxww(View view, ydmasvzmpa ydmasvzmpaVar) {
        if (ydmasvzmpaVar != null) {
            view.animate().setListener(new iobyxmoadg(ydmasvzmpaVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public yfnezrywwk btonecajqb(long j13) {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().setStartDelay(j13);
        }
        return this;
    }

    public void draadjrbmk() {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public yfnezrywwk gtknphoqwx(final zfvoamnweg zfvoamnwegVar) {
        final View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().setUpdateListener(zfvoamnwegVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: v1.uwvvkdfqfp
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    zfvoamnwegVar.iobyxmoadg(view);
                }
            } : null);
        }
        return this;
    }

    public yfnezrywwk gxszxtbevo(long j13) {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().setDuration(j13);
        }
        return this;
    }

    public yfnezrywwk lqeggnwhkg(Interpolator interpolator) {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public yfnezrywwk nufgyqmvbu(ydmasvzmpa ydmasvzmpaVar) {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            dxjokdxxww(view, ydmasvzmpaVar);
        }
        return this;
    }

    public void ppxfxbqfkf() {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public yfnezrywwk wflxmlrfwp(float f13) {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().translationY(f13);
        }
        return this;
    }

    public long wkgbmnqykc() {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public yfnezrywwk zoijcleaow(float f13) {
        View view = (View) this.f115242iobyxmoadg.get();
        if (view != null) {
            view.animate().alpha(f13);
        }
        return this;
    }
}
