package oa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.mbcevpiqjq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    public static boolean dxjokdxxww(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static float eablkybsjg(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    static int gxszxtbevo(TypedArray typedArray, int i13, int i14) {
        return typedArray.hasValue(i13) ? i13 : i14;
    }

    public static ColorStateList iobyxmoadg(Context context, TypedArray typedArray, int i13) {
        int resourceId;
        ColorStateList colorStateListIobyxmoadg;
        return (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0 || (colorStateListIobyxmoadg = nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, resourceId)) == null) ? typedArray.getColorStateList(i13) : colorStateListIobyxmoadg;
    }

    public static wkgbmnqykc lqeggnwhkg(Context context, TypedArray typedArray, int i13) {
        int resourceId;
        if (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0) {
            return null;
        }
        return new wkgbmnqykc(context, resourceId);
    }

    public static boolean nufgyqmvbu(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static int ppxfxbqfkf(Context context, TypedArray typedArray, int i13, int i14) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i13, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i13, i14);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i14);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable wkgbmnqykc(Context context, TypedArray typedArray, int i13) {
        int resourceId;
        Drawable drawableZoijcleaow;
        return (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0 || (drawableZoijcleaow = nufgyqmvbu.iobyxmoadg.zoijcleaow(context, resourceId)) == null) ? typedArray.getDrawable(i13) : drawableZoijcleaow;
    }

    public static ColorStateList zoijcleaow(Context context, mbcevpiqjq mbcevpiqjqVar, int i13) {
        int iAgtfadlqog;
        ColorStateList colorStateListIobyxmoadg;
        return (!mbcevpiqjqVar.kcexrzcfyt(i13) || (iAgtfadlqog = mbcevpiqjqVar.agtfadlqog(i13, 0)) == 0 || (colorStateListIobyxmoadg = nufgyqmvbu.iobyxmoadg.iobyxmoadg(context, iAgtfadlqog)) == null) ? mbcevpiqjqVar.ppxfxbqfkf(i13) : colorStateListIobyxmoadg;
    }
}
