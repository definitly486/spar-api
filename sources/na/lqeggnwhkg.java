package na;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import v1.jhduphickx;
import v1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg extends na.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final float f69395dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final float f69396lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final float f69397nufgyqmvbu;

    class iobyxmoadg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ boolean f69398iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f69400zoijcleaow;

        iobyxmoadg(boolean z13, int i13) {
            this.f69398iobyxmoadg = z13;
            this.f69400zoijcleaow = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            lqeggnwhkg.this.f69394zoijcleaow.setTranslationX(0.0f);
            lqeggnwhkg.this.gtknphoqwx(0.0f, this.f69398iobyxmoadg, this.f69400zoijcleaow);
        }
    }

    public lqeggnwhkg(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f69396lqeggnwhkg = resources.getDimension(da.wkgbmnqykc.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f69397nufgyqmvbu = resources.getDimension(da.wkgbmnqykc.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f69395dxjokdxxww = resources.getDimension(da.wkgbmnqykc.m3_back_progress_side_container_max_scale_y_distance);
    }

    private int dxjokdxxww(boolean z13) {
        ViewGroup.LayoutParams layoutParams = this.f69394zoijcleaow.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z13 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    private boolean lqeggnwhkg(int i13, int i14) {
        return (zdlpuopuiu.zoijcleaow(i13, jhduphickx.lereixgezr(this.f69394zoijcleaow)) & i14) == i14;
    }

    public void btonecajqb(androidx.activity.zoijcleaow zoijcleaowVar) {
        super.wkgbmnqykc(zoijcleaowVar);
    }

    public void draadjrbmk(androidx.activity.zoijcleaow zoijcleaowVar, int i13) {
        if (super.eablkybsjg(zoijcleaowVar) == null) {
            return;
        }
        gtknphoqwx(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow() == 0, i13);
    }

    public void gtknphoqwx(float f13, boolean z13, int i13) {
        float fIobyxmoadg = iobyxmoadg(f13);
        boolean zLqeggnwhkg = lqeggnwhkg(i13, 3);
        boolean z14 = z13 == zLqeggnwhkg;
        int width = this.f69394zoijcleaow.getWidth();
        int height = this.f69394zoijcleaow.getHeight();
        float f14 = width;
        if (f14 > 0.0f) {
            float f15 = height;
            if (f15 <= 0.0f) {
                return;
            }
            float f16 = this.f69396lqeggnwhkg / f14;
            float f17 = this.f69397nufgyqmvbu / f14;
            float f18 = this.f69395dxjokdxxww / f15;
            View view = this.f69394zoijcleaow;
            if (zLqeggnwhkg) {
                f14 = 0.0f;
            }
            view.setPivotX(f14);
            if (!z14) {
                f17 = -f16;
            }
            float fIobyxmoadg2 = ea.iobyxmoadg.iobyxmoadg(0.0f, f17, fIobyxmoadg);
            float f19 = fIobyxmoadg2 + 1.0f;
            this.f69394zoijcleaow.setScaleX(f19);
            float fIobyxmoadg3 = 1.0f - ea.iobyxmoadg.iobyxmoadg(0.0f, f18, fIobyxmoadg);
            this.f69394zoijcleaow.setScaleY(fIobyxmoadg3);
            View view2 = this.f69394zoijcleaow;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    childAt.setPivotX(zLqeggnwhkg ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f23 = z14 ? 1.0f - fIobyxmoadg2 : 1.0f;
                    float f24 = fIobyxmoadg3 != 0.0f ? (f19 / fIobyxmoadg3) * f23 : 1.0f;
                    childAt.setScaleX(f23);
                    childAt.setScaleY(f24);
                }
            }
        }
    }

    public void gxszxtbevo() {
        if (super.zoijcleaow() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f69394zoijcleaow, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f69394zoijcleaow, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f69394zoijcleaow;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i13), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f69389eablkybsjg);
        animatorSet.start();
    }

    public void nufgyqmvbu(androidx.activity.zoijcleaow zoijcleaowVar, int i13, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z13 = zoijcleaowVar.zoijcleaow() == 0;
        boolean zLqeggnwhkg = lqeggnwhkg(i13, 3);
        float width = (this.f69394zoijcleaow.getWidth() * this.f69394zoijcleaow.getScaleX()) + dxjokdxxww(zLqeggnwhkg);
        View view = this.f69394zoijcleaow;
        Property property = View.TRANSLATION_X;
        if (zLqeggnwhkg) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new o2.zoijcleaow());
        objectAnimatorOfFloat.setDuration(ea.iobyxmoadg.ppxfxbqfkf(this.f69392ppxfxbqfkf, this.f69393wkgbmnqykc, zoijcleaowVar.iobyxmoadg()));
        objectAnimatorOfFloat.addListener(new iobyxmoadg(z13, i13));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }
}
