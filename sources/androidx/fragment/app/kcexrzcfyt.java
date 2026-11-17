package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
abstract class kcexrzcfyt {
    private static int iobyxmoadg(Fragment fragment, boolean z13, boolean z14) {
        if (z14) {
            return z13 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        }
        return z13 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    private static int ppxfxbqfkf(Context context, int i13) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i13});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int wkgbmnqykc(Context context, int i13, boolean z13) {
        if (i13 == 4097) {
            return z13 ? k2.iobyxmoadg.fragment_open_enter : k2.iobyxmoadg.fragment_open_exit;
        }
        if (i13 == 8194) {
            return z13 ? k2.iobyxmoadg.fragment_close_enter : k2.iobyxmoadg.fragment_close_exit;
        }
        if (i13 == 8197) {
            return z13 ? ppxfxbqfkf(context, R.attr.activityCloseEnterAnimation) : ppxfxbqfkf(context, R.attr.activityCloseExitAnimation);
        }
        if (i13 == 4099) {
            return z13 ? k2.iobyxmoadg.fragment_fade_enter : k2.iobyxmoadg.fragment_fade_exit;
        }
        if (i13 != 4100) {
            return -1;
        }
        return z13 ? ppxfxbqfkf(context, R.attr.activityOpenEnterAnimation) : ppxfxbqfkf(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    static iobyxmoadg zoijcleaow(Context context, Fragment fragment, boolean z13, boolean z14) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int iIobyxmoadg = iobyxmoadg(fragment, z13, z14);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(k2.zoijcleaow.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(k2.zoijcleaow.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z13, iIobyxmoadg);
        if (animationOnCreateAnimation != null) {
            return new iobyxmoadg(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z13, iIobyxmoadg);
        if (animatorOnCreateAnimator != null) {
            return new iobyxmoadg(animatorOnCreateAnimator);
        }
        if (iIobyxmoadg == 0 && nextTransition != 0) {
            iIobyxmoadg = wkgbmnqykc(context, nextTransition, z13);
        }
        if (iIobyxmoadg != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iIobyxmoadg));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iIobyxmoadg);
                    if (animationLoadAnimation != null) {
                        return new iobyxmoadg(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e13) {
                    throw e13;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iIobyxmoadg);
                        if (animatorLoadAnimator != null) {
                            return new iobyxmoadg(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e14) {
                        if (zEquals) {
                            throw e14;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iIobyxmoadg);
                        if (animationLoadAnimation2 != null) {
                            return new iobyxmoadg(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iIobyxmoadg);
                if (animatorLoadAnimator != null) {
                    return new iobyxmoadg(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final Animation f9272iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final AnimatorSet f9273zoijcleaow;

        iobyxmoadg(Animation animation) {
            this.f9272iobyxmoadg = animation;
            this.f9273zoijcleaow = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        iobyxmoadg(Animator animator) {
            this.f9272iobyxmoadg = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f9273zoijcleaow = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class zoijcleaow extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private boolean f9274cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f9275iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f9276jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final View f9277yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ViewGroup f9278zdlpuopuiu;

        zoijcleaow(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f9274cqumvgiudr = true;
            this.f9278zdlpuopuiu = viewGroup;
            this.f9277yggfygwlhe = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j13, Transformation transformation) {
            this.f9274cqumvgiudr = true;
            if (this.f9276jyumaefscl) {
                return !this.f9275iwizpuwonk;
            }
            if (!super.getTransformation(j13, transformation)) {
                this.f9276jyumaefscl = true;
                v1.hkdspvbjdz.iobyxmoadg(this.f9278zdlpuopuiu, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9276jyumaefscl || !this.f9274cqumvgiudr) {
                this.f9278zdlpuopuiu.endViewTransition(this.f9277yggfygwlhe);
                this.f9275iwizpuwonk = true;
            } else {
                this.f9274cqumvgiudr = false;
                this.f9278zdlpuopuiu.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j13, Transformation transformation, float f13) {
            this.f9274cqumvgiudr = true;
            if (this.f9276jyumaefscl) {
                return !this.f9275iwizpuwonk;
            }
            if (!super.getTransformation(j13, transformation, f13)) {
                this.f9276jyumaefscl = true;
                v1.hkdspvbjdz.iobyxmoadg(this.f9278zdlpuopuiu, this);
            }
            return true;
        }
    }
}
