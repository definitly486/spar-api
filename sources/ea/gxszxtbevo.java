package ea;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.collection.jztzpxfvev;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jztzpxfvev f31017iobyxmoadg = new jztzpxfvev();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jztzpxfvev f31018zoijcleaow = new jztzpxfvev();

    private static void iobyxmoadg(gxszxtbevo gxszxtbevoVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            gxszxtbevoVar.lqeggnwhkg(objectAnimator.getPropertyName(), objectAnimator.getValues());
            gxszxtbevoVar.nufgyqmvbu(objectAnimator.getPropertyName(), lqeggnwhkg.zoijcleaow(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static gxszxtbevo ppxfxbqfkf(Context context, int i13) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i13);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return wkgbmnqykc(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return wkgbmnqykc(arrayList);
        } catch (Exception e13) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i13), e13);
            return null;
        }
    }

    private static gxszxtbevo wkgbmnqykc(List list) {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo();
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            iobyxmoadg(gxszxtbevoVar, (Animator) list.get(i13));
        }
        return gxszxtbevoVar;
    }

    public static gxszxtbevo zoijcleaow(Context context, TypedArray typedArray, int i13) {
        int resourceId;
        if (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0) {
            return null;
        }
        return ppxfxbqfkf(context, resourceId);
    }

    public lqeggnwhkg eablkybsjg(String str) {
        if (gxszxtbevo(str)) {
            return (lqeggnwhkg) this.f31017iobyxmoadg.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gxszxtbevo) {
            return this.f31017iobyxmoadg.equals(((gxszxtbevo) obj).f31017iobyxmoadg);
        }
        return false;
    }

    public boolean gxszxtbevo(String str) {
        return this.f31017iobyxmoadg.get(str) != null;
    }

    public int hashCode() {
        return this.f31017iobyxmoadg.hashCode();
    }

    public void lqeggnwhkg(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f31018zoijcleaow.put(str, propertyValuesHolderArr);
    }

    public void nufgyqmvbu(String str, lqeggnwhkg lqeggnwhkgVar) {
        this.f31017iobyxmoadg.put(str, lqeggnwhkgVar);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f31017iobyxmoadg + "}\n";
    }
}
