package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends cllcsxoeiz {

    private static class iobyxmoadg extends AnimatorListenerAdapter implements gtknphoqwx.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final View f13550iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f13551zoijcleaow = false;

        iobyxmoadg(View view) {
            this.f13550iobyxmoadg = view;
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void draadjrbmk(gtknphoqwx gtknphoqwxVar, boolean z13) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            this.f13550iobyxmoadg.setTag(nufgyqmvbu.transition_pause_alpha, Float.valueOf(this.f13550iobyxmoadg.getVisibility() == 0 ? zynmafqrjb.zoijcleaow(this.f13550iobyxmoadg) : 0.0f));
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this.f13550iobyxmoadg.setTag(nufgyqmvbu.transition_pause_alpha, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            zynmafqrjb.eablkybsjg(this.f13550iobyxmoadg, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f13550iobyxmoadg.hasOverlappingRendering() && this.f13550iobyxmoadg.getLayerType() == 0) {
                this.f13551zoijcleaow = true;
                this.f13550iobyxmoadg.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z13) {
            if (this.f13551zoijcleaow) {
                this.f13550iobyxmoadg.setLayerType(0, null);
            }
            if (z13) {
                return;
            }
            zynmafqrjb.eablkybsjg(this.f13550iobyxmoadg, 1.0f);
            zynmafqrjb.iobyxmoadg(this.f13550iobyxmoadg);
        }
    }

    public ppxfxbqfkf(int i13) {
        tbqsvytpvh(i13);
    }

    private Animator roivzttewh(View view, float f13, float f14) {
        if (f13 == f14) {
            return null;
        }
        zynmafqrjb.eablkybsjg(view, f13);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) zynmafqrjb.f13595zoijcleaow, f14);
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(view);
        objectAnimatorOfFloat.addListener(iobyxmoadgVar);
        zynmafqrjb().ppxfxbqfkf(iobyxmoadgVar);
        return objectAnimatorOfFloat;
    }

    private static float uawqvzlxes(cqumvgiudr cqumvgiudrVar, float f13) {
        Float f14;
        return (cqumvgiudrVar == null || (f14 = (Float) cqumvgiudrVar.f13437iobyxmoadg.get("android:fade:transitionAlpha")) == null) ? f13 : f14.floatValue();
    }

    @Override // androidx.transition.gtknphoqwx
    public boolean cllcsxoeiz() {
        return true;
    }

    @Override // androidx.transition.cllcsxoeiz
    public Animator weqkydbzbr(ViewGroup viewGroup, View view, cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        zynmafqrjb.ppxfxbqfkf(view);
        return roivzttewh(view, uawqvzlxes(cqumvgiudrVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.cllcsxoeiz, androidx.transition.gtknphoqwx
    public void wflxmlrfwp(cqumvgiudr cqumvgiudrVar) {
        super.wflxmlrfwp(cqumvgiudrVar);
        Float fValueOf = (Float) cqumvgiudrVar.f13439zoijcleaow.getTag(nufgyqmvbu.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = cqumvgiudrVar.f13439zoijcleaow.getVisibility() == 0 ? Float.valueOf(zynmafqrjb.zoijcleaow(cqumvgiudrVar.f13439zoijcleaow)) : Float.valueOf(0.0f);
        }
        cqumvgiudrVar.f13437iobyxmoadg.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.cllcsxoeiz
    public Animator zeieaojujs(ViewGroup viewGroup, View view, cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        zynmafqrjb.ppxfxbqfkf(view);
        Animator animatorRoivzttewh = roivzttewh(view, uawqvzlxes(cqumvgiudrVar, 1.0f), 0.0f);
        if (animatorRoivzttewh == null) {
            zynmafqrjb.eablkybsjg(view, uawqvzlxes(cqumvgiudrVar2, 1.0f));
        }
        return animatorRoivzttewh;
    }

    public ppxfxbqfkf() {
    }
}
