package ia;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import j1.ppxfxbqfkf;
import kotlin.KotlinVersion;
import oa.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {
    public static int btonecajqb(int i13, int i14, float f13) {
        return dxjokdxxww(i13, ppxfxbqfkf.gtknphoqwx(i14, Math.round(Color.alpha(i14) * f13)));
    }

    private static int draadjrbmk(Context context, TypedValue typedValue) {
        int i13 = typedValue.resourceId;
        return i13 != 0 ? androidx.core.content.iobyxmoadg.getColor(context, i13) : typedValue.data;
    }

    public static int dxjokdxxww(int i13, int i14) {
        return ppxfxbqfkf.lqeggnwhkg(i14, i13);
    }

    public static int eablkybsjg(View view, int i13, int i14) {
        return zoijcleaow(view.getContext(), i13, i14);
    }

    public static int gtknphoqwx(View view, int i13, int i14, float f13) {
        return btonecajqb(wkgbmnqykc(view, i13), wkgbmnqykc(view, i14), f13);
    }

    public static Integer gxszxtbevo(Context context, int i13) {
        TypedValue typedValueIobyxmoadg = zoijcleaow.iobyxmoadg(context, i13);
        if (typedValueIobyxmoadg != null) {
            return Integer.valueOf(draadjrbmk(context, typedValueIobyxmoadg));
        }
        return null;
    }

    public static int iobyxmoadg(int i13, int i14) {
        return ppxfxbqfkf.gtknphoqwx(i13, (Color.alpha(i13) * i14) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static ColorStateList lqeggnwhkg(Context context, int i13) {
        TypedValue typedValueIobyxmoadg = zoijcleaow.iobyxmoadg(context, i13);
        if (typedValueIobyxmoadg == null) {
            return null;
        }
        int i14 = typedValueIobyxmoadg.resourceId;
        if (i14 != 0) {
            return androidx.core.content.iobyxmoadg.getColorStateList(context, i14);
        }
        int i15 = typedValueIobyxmoadg.data;
        if (i15 != 0) {
            return ColorStateList.valueOf(i15);
        }
        return null;
    }

    public static boolean nufgyqmvbu(int i13) {
        return i13 != 0 && ppxfxbqfkf.wkgbmnqykc(i13) > 0.5d;
    }

    public static int ppxfxbqfkf(Context context, int i13, String str) {
        return draadjrbmk(context, zoijcleaow.eablkybsjg(context, i13, str));
    }

    public static int wkgbmnqykc(View view, int i13) {
        return draadjrbmk(view.getContext(), zoijcleaow.gxszxtbevo(view, i13));
    }

    public static int zoijcleaow(Context context, int i13, int i14) {
        Integer numGxszxtbevo = gxszxtbevo(context, i13);
        return numGxszxtbevo != null ? numGxszxtbevo.intValue() : i14;
    }
}
