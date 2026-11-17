package ea;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f31024eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long f31025iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private TimeInterpolator f31026ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f31027wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f31028zoijcleaow;

    public lqeggnwhkg(long j13, long j14) {
        this.f31026ppxfxbqfkf = null;
        this.f31027wkgbmnqykc = 0;
        this.f31024eablkybsjg = 1;
        this.f31025iobyxmoadg = j13;
        this.f31028zoijcleaow = j14;
    }

    private static TimeInterpolator gxszxtbevo(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return iobyxmoadg.f31023zoijcleaow;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return iobyxmoadg.f31021ppxfxbqfkf;
        }
        return interpolator instanceof DecelerateInterpolator ? iobyxmoadg.f31022wkgbmnqykc : interpolator;
    }

    static lqeggnwhkg zoijcleaow(ValueAnimator valueAnimator) {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(valueAnimator.getStartDelay(), valueAnimator.getDuration(), gxszxtbevo(valueAnimator));
        lqeggnwhkgVar.f31027wkgbmnqykc = valueAnimator.getRepeatCount();
        lqeggnwhkgVar.f31024eablkybsjg = valueAnimator.getRepeatMode();
        return lqeggnwhkgVar;
    }

    public TimeInterpolator eablkybsjg() {
        TimeInterpolator timeInterpolator = this.f31026ppxfxbqfkf;
        return timeInterpolator != null ? timeInterpolator : iobyxmoadg.f31023zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        if (ppxfxbqfkf() == lqeggnwhkgVar.ppxfxbqfkf() && wkgbmnqykc() == lqeggnwhkgVar.wkgbmnqykc() && lqeggnwhkg() == lqeggnwhkgVar.lqeggnwhkg() && nufgyqmvbu() == lqeggnwhkgVar.nufgyqmvbu()) {
            return eablkybsjg().getClass().equals(lqeggnwhkgVar.eablkybsjg().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (ppxfxbqfkf() ^ (ppxfxbqfkf() >>> 32))) * 31) + ((int) (wkgbmnqykc() ^ (wkgbmnqykc() >>> 32)))) * 31) + eablkybsjg().getClass().hashCode()) * 31) + lqeggnwhkg()) * 31) + nufgyqmvbu();
    }

    public void iobyxmoadg(Animator animator) {
        animator.setStartDelay(ppxfxbqfkf());
        animator.setDuration(wkgbmnqykc());
        animator.setInterpolator(eablkybsjg());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(lqeggnwhkg());
            valueAnimator.setRepeatMode(nufgyqmvbu());
        }
    }

    public int lqeggnwhkg() {
        return this.f31027wkgbmnqykc;
    }

    public int nufgyqmvbu() {
        return this.f31024eablkybsjg;
    }

    public long ppxfxbqfkf() {
        return this.f31025iobyxmoadg;
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + ppxfxbqfkf() + " duration: " + wkgbmnqykc() + " interpolator: " + eablkybsjg().getClass() + " repeatCount: " + lqeggnwhkg() + " repeatMode: " + nufgyqmvbu() + "}\n";
    }

    public long wkgbmnqykc() {
        return this.f31028zoijcleaow;
    }

    public lqeggnwhkg(long j13, long j14, TimeInterpolator timeInterpolator) {
        this.f31027wkgbmnqykc = 0;
        this.f31024eablkybsjg = 1;
        this.f31025iobyxmoadg = j13;
        this.f31028zoijcleaow = j14;
        this.f31026ppxfxbqfkf = timeInterpolator;
    }
}
