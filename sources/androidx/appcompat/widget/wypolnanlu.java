package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class wypolnanlu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ThreadLocal f3429iobyxmoadg = new ThreadLocal();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final int[] f3434zoijcleaow = {-16842910};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    static final int[] f3432ppxfxbqfkf = {R.attr.state_focused};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final int[] f3433wkgbmnqykc = {R.attr.state_activated};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final int[] f3427eablkybsjg = {R.attr.state_pressed};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final int[] f3428gxszxtbevo = {R.attr.state_checked};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static final int[] f3430lqeggnwhkg = {R.attr.state_selected};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    static final int[] f3431nufgyqmvbu = {-16842919, -16842908};

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static final int[] f3426dxjokdxxww = new int[0];

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int[] f3425btonecajqb = new int[1];

    public static ColorStateList eablkybsjg(Context context, int i13) {
        int[] iArr = f3425btonecajqb;
        iArr[0] = i13;
        mbcevpiqjq mbcevpiqjqVarYggfygwlhe = mbcevpiqjq.yggfygwlhe(context, null, iArr);
        try {
            return mbcevpiqjqVarYggfygwlhe.ppxfxbqfkf(0);
        } finally {
            mbcevpiqjqVarYggfygwlhe.cqumvgiudr();
        }
    }

    private static TypedValue gxszxtbevo() {
        ThreadLocal threadLocal = f3429iobyxmoadg;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static void iobyxmoadg(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(lqeggnwhkg.btonecajqb.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int ppxfxbqfkf(Context context, int i13) {
        int[] iArr = f3425btonecajqb;
        iArr[0] = i13;
        mbcevpiqjq mbcevpiqjqVarYggfygwlhe = mbcevpiqjq.yggfygwlhe(context, null, iArr);
        try {
            return mbcevpiqjqVarYggfygwlhe.zoijcleaow(0, 0);
        } finally {
            mbcevpiqjqVarYggfygwlhe.cqumvgiudr();
        }
    }

    static int wkgbmnqykc(Context context, int i13, float f13) {
        int iPpxfxbqfkf = ppxfxbqfkf(context, i13);
        return j1.ppxfxbqfkf.gtknphoqwx(iPpxfxbqfkf, Math.round(Color.alpha(iPpxfxbqfkf) * f13));
    }

    public static int zoijcleaow(Context context, int i13) {
        ColorStateList colorStateListEablkybsjg = eablkybsjg(context, i13);
        if (colorStateListEablkybsjg != null && colorStateListEablkybsjg.isStateful()) {
            return colorStateListEablkybsjg.getColorForState(f3434zoijcleaow, colorStateListEablkybsjg.getDefaultColor());
        }
        TypedValue typedValueGxszxtbevo = gxszxtbevo();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueGxszxtbevo, true);
        return wkgbmnqykc(context, i13, typedValueGxszxtbevo.getFloat());
    }
}
