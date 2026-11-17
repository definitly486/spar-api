package na;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo extends na.iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final float f69386lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final float f69387nufgyqmvbu;

    class iobyxmoadg extends AnimatorListenerAdapter {
        iobyxmoadg() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gxszxtbevo.this.f69394zoijcleaow.setTranslationY(0.0f);
            gxszxtbevo.this.gtknphoqwx(0.0f);
        }
    }

    public gxszxtbevo(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f69386lqeggnwhkg = resources.getDimension(da.wkgbmnqykc.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f69387nufgyqmvbu = resources.getDimension(da.wkgbmnqykc.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator lqeggnwhkg() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f69394zoijcleaow, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f69394zoijcleaow, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f69394zoijcleaow;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i13), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new o2.zoijcleaow());
        return animatorSet;
    }

    public void btonecajqb(androidx.activity.zoijcleaow zoijcleaowVar) {
        super.wkgbmnqykc(zoijcleaowVar);
    }

    public void draadjrbmk(androidx.activity.zoijcleaow zoijcleaowVar) {
        if (super.eablkybsjg(zoijcleaowVar) == null) {
            return;
        }
        gtknphoqwx(zoijcleaowVar.iobyxmoadg());
    }

    public void dxjokdxxww(androidx.activity.zoijcleaow zoijcleaowVar, Animator.AnimatorListener animatorListener) {
        Animator animatorLqeggnwhkg = lqeggnwhkg();
        animatorLqeggnwhkg.setDuration(ea.iobyxmoadg.ppxfxbqfkf(this.f69392ppxfxbqfkf, this.f69393wkgbmnqykc, zoijcleaowVar.iobyxmoadg()));
        if (animatorListener != null) {
            animatorLqeggnwhkg.addListener(animatorListener);
        }
        animatorLqeggnwhkg.start();
    }

    public void gtknphoqwx(float f13) {
        float fIobyxmoadg = iobyxmoadg(f13);
        float width = this.f69394zoijcleaow.getWidth();
        float height = this.f69394zoijcleaow.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f14 = this.f69386lqeggnwhkg / width;
        float f15 = this.f69387nufgyqmvbu / height;
        float fIobyxmoadg2 = 1.0f - ea.iobyxmoadg.iobyxmoadg(0.0f, f14, fIobyxmoadg);
        float fIobyxmoadg3 = 1.0f - ea.iobyxmoadg.iobyxmoadg(0.0f, f15, fIobyxmoadg);
        this.f69394zoijcleaow.setScaleX(fIobyxmoadg2);
        this.f69394zoijcleaow.setPivotY(height);
        this.f69394zoijcleaow.setScaleY(fIobyxmoadg3);
        View view = this.f69394zoijcleaow;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fIobyxmoadg3 != 0.0f ? fIobyxmoadg2 / fIobyxmoadg3 : 1.0f);
            }
        }
    }

    public void gxszxtbevo() {
        if (super.zoijcleaow() == null) {
            return;
        }
        Animator animatorLqeggnwhkg = lqeggnwhkg();
        animatorLqeggnwhkg.setDuration(this.f69389eablkybsjg);
        animatorLqeggnwhkg.start();
    }

    public void nufgyqmvbu(androidx.activity.zoijcleaow zoijcleaowVar, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f69394zoijcleaow, (Property<View, Float>) View.TRANSLATION_Y, this.f69394zoijcleaow.getHeight() * this.f69394zoijcleaow.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new o2.zoijcleaow());
        objectAnimatorOfFloat.setDuration(ea.iobyxmoadg.ppxfxbqfkf(this.f69392ppxfxbqfkf, this.f69393wkgbmnqykc, zoijcleaowVar.iobyxmoadg()));
        objectAnimatorOfFloat.addListener(new iobyxmoadg());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }
}
