package pa;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import j1.ppxfxbqfkf;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final boolean f76259iobyxmoadg = true;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f76264zoijcleaow = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final int[] f76262ppxfxbqfkf = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f76263wkgbmnqykc = {R.attr.state_focused};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final int[] f76256eablkybsjg = {R.attr.state_hovered};

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final int[] f76258gxszxtbevo = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int[] f76260lqeggnwhkg = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int[] f76261nufgyqmvbu = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int[] f76255dxjokdxxww = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final int[] f76253btonecajqb = {R.attr.state_selected};

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final int[] f76257gtknphoqwx = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    static final String f76254draadjrbmk = zoijcleaow.class.getSimpleName();

    public static boolean eablkybsjg(int[] iArr) {
        boolean z13 = false;
        boolean z14 = false;
        for (int i13 : iArr) {
            if (i13 == 16842910) {
                z13 = true;
            } else if (i13 == 16842908 || i13 == 16842919 || i13 == 16843623) {
                z14 = true;
            }
        }
        return z13 && z14;
    }

    public static ColorStateList iobyxmoadg(ColorStateList colorStateList) {
        if (f76259iobyxmoadg) {
            int[] iArr = f76263wkgbmnqykc;
            return new ColorStateList(new int[][]{f76253btonecajqb, iArr, StateSet.NOTHING}, new int[]{ppxfxbqfkf(colorStateList, f76258gxszxtbevo), ppxfxbqfkf(colorStateList, iArr), ppxfxbqfkf(colorStateList, f76264zoijcleaow)});
        }
        int[] iArr2 = f76258gxszxtbevo;
        int[] iArr3 = f76260lqeggnwhkg;
        int[] iArr4 = f76261nufgyqmvbu;
        int[] iArr5 = f76255dxjokdxxww;
        int[] iArr6 = f76264zoijcleaow;
        int[] iArr7 = f76262ppxfxbqfkf;
        int[] iArr8 = f76263wkgbmnqykc;
        int[] iArr9 = f76256eablkybsjg;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f76253btonecajqb, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{ppxfxbqfkf(colorStateList, iArr2), ppxfxbqfkf(colorStateList, iArr3), ppxfxbqfkf(colorStateList, iArr4), ppxfxbqfkf(colorStateList, iArr5), 0, ppxfxbqfkf(colorStateList, iArr6), ppxfxbqfkf(colorStateList, iArr7), ppxfxbqfkf(colorStateList, iArr8), ppxfxbqfkf(colorStateList, iArr9), 0});
    }

    private static int ppxfxbqfkf(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f76259iobyxmoadg ? zoijcleaow(colorForState) : colorForState;
    }

    public static ColorStateList wkgbmnqykc(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f76257gtknphoqwx, 0)) != 0) {
            Log.w(f76254draadjrbmk, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    private static int zoijcleaow(int i13) {
        return ppxfxbqfkf.gtknphoqwx(i13, Math.min(Color.alpha(i13) * 2, KotlinVersion.MAX_COMPONENT_VALUE));
    }
}
