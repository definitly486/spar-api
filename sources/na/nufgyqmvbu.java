package na;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu {
    private static boolean eablkybsjg(String str, String str2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("(");
        return str.startsWith(sb3.toString()) && str.endsWith(")");
    }

    public static int gxszxtbevo(Context context, int i13, int i14) {
        return oa.zoijcleaow.ppxfxbqfkf(context, i13, i14);
    }

    private static float iobyxmoadg(String[] strArr, int i13) {
        float f13 = Float.parseFloat(strArr[i13]);
        if (f13 >= 0.0f && f13 <= 1.0f) {
            return f13;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f13);
    }

    public static TimeInterpolator lqeggnwhkg(Context context, int i13, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i13, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return wkgbmnqykc(strValueOf) ? ppxfxbqfkf(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    private static TimeInterpolator ppxfxbqfkf(String str) {
        if (!eablkybsjg(str, "cubic-bezier")) {
            if (eablkybsjg(str, "path")) {
                return x1.iobyxmoadg.zoijcleaow(j1.gxszxtbevo.eablkybsjg(zoijcleaow(str, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = zoijcleaow(str, "cubic-bezier").split(StringUtils.COMMA);
        if (strArrSplit.length == 4) {
            return x1.iobyxmoadg.iobyxmoadg(iobyxmoadg(strArrSplit, 0), iobyxmoadg(strArrSplit, 1), iobyxmoadg(strArrSplit, 2), iobyxmoadg(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    private static boolean wkgbmnqykc(String str) {
        return eablkybsjg(str, "cubic-bezier") || eablkybsjg(str, "path");
    }

    private static String zoijcleaow(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }
}
