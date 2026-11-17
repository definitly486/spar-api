package ja;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.draadjrbmk;
import da.wkgbmnqykc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    public static Rect iobyxmoadg(Context context, int i13, int i14) {
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context, null, da.draadjrbmk.MaterialAlertDialog, i13, i14, new int[0]);
        int dimensionPixelSize = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(wkgbmnqykc.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(wkgbmnqykc.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(wkgbmnqykc.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(wkgbmnqykc.mtrl_alert_dialog_background_inset_bottom));
        typedArrayDxjokdxxww.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public static InsetDrawable zoijcleaow(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
