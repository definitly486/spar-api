package v7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg extends ValueAnimator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Set f116261zdlpuopuiu = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Set f116260yggfygwlhe = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Set f116259jyumaefscl = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f116260yggfygwlhe.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f116259jyumaefscl.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f116261zdlpuopuiu.add(animatorUpdateListener);
    }

    void eablkybsjg() {
        Iterator it = this.f116259jyumaefscl.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void gxszxtbevo(boolean z13) {
        Iterator it = this.f116260yggfygwlhe.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationStart(this, z13);
        }
    }

    void iobyxmoadg() {
        Iterator it = this.f116260yggfygwlhe.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
    }

    void lqeggnwhkg() {
        Iterator it = this.f116261zdlpuopuiu.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    void ppxfxbqfkf() {
        Iterator it = this.f116259jyumaefscl.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f116260yggfygwlhe.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f116261zdlpuopuiu.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f116260yggfygwlhe.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f116259jyumaefscl.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f116261zdlpuopuiu.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j13) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    void wkgbmnqykc() {
        Iterator it = this.f116260yggfygwlhe.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
        }
    }

    void zoijcleaow(boolean z13) {
        Iterator it = this.f116260yggfygwlhe.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z13);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j13) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
