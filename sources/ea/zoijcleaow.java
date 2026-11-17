package ea;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static void iobyxmoadg(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Animator animator = (Animator) list.get(i13);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }
}
