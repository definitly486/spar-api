package ta;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.wkgbmnqykc;
import da.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f110143iobyxmoadg = {R.attr.theme, zoijcleaow.theme};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f110144zoijcleaow = {zoijcleaow.materialThemeOverlay};

    private static int iobyxmoadg(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f110143iobyxmoadg);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static Context ppxfxbqfkf(Context context, AttributeSet attributeSet, int i13, int i14) {
        int iZoijcleaow = zoijcleaow(context, attributeSet, i13, i14);
        boolean z13 = (context instanceof wkgbmnqykc) && ((wkgbmnqykc) context).ppxfxbqfkf() == iZoijcleaow;
        if (iZoijcleaow == 0 || z13) {
            return context;
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(context, iZoijcleaow);
        int iIobyxmoadg = iobyxmoadg(context, attributeSet);
        if (iIobyxmoadg != 0) {
            wkgbmnqykcVar.getTheme().applyStyle(iIobyxmoadg, true);
        }
        return wkgbmnqykcVar;
    }

    private static int zoijcleaow(Context context, AttributeSet attributeSet, int i13, int i14) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f110144zoijcleaow, i13, i14);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
