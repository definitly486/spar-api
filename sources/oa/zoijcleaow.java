package oa;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static TypedValue eablkybsjg(Context context, int i13, String str) {
        TypedValue typedValueIobyxmoadg = iobyxmoadg(context, i13);
        if (typedValueIobyxmoadg != null) {
            return typedValueIobyxmoadg;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i13)));
    }

    public static TypedValue gxszxtbevo(View view, int i13) {
        return eablkybsjg(view.getContext(), i13, view.getClass().getCanonicalName());
    }

    public static TypedValue iobyxmoadg(Context context, int i13) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i13, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int ppxfxbqfkf(Context context, int i13, int i14) {
        TypedValue typedValueIobyxmoadg = iobyxmoadg(context, i13);
        return (typedValueIobyxmoadg == null || typedValueIobyxmoadg.type != 16) ? i14 : typedValueIobyxmoadg.data;
    }

    public static int wkgbmnqykc(Context context, int i13, String str) {
        return eablkybsjg(context, i13, str).data;
    }

    public static boolean zoijcleaow(Context context, int i13, boolean z13) {
        TypedValue typedValueIobyxmoadg = iobyxmoadg(context, i13);
        if (typedValueIobyxmoadg == null || typedValueIobyxmoadg.type != 18) {
            return z13;
        }
        return typedValueIobyxmoadg.data != 0;
    }
}
