package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f22040iobyxmoadg = {R.attr.stateListAnimator};

    static void iobyxmoadg(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void ppxfxbqfkf(View view, AttributeSet attributeSet, int i13, int i14) {
        Context context = view.getContext();
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context, attributeSet, f22040iobyxmoadg, i13, i14, new int[0]);
        try {
            if (typedArrayDxjokdxxww.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayDxjokdxxww.getResourceId(0, 0)));
            }
        } finally {
            typedArrayDxjokdxxww.recycle();
        }
    }

    static void zoijcleaow(View view, float f13) {
        int integer = view.getResources().getInteger(da.lqeggnwhkg.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j13 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, da.zoijcleaow.state_liftable, -da.zoijcleaow.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j13));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f13).setDuration(j13));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
