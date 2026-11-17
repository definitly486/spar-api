package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.mbcevpiqjq;

/* JADX INFO: loaded from: classes2.dex */
public abstract class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f22897iobyxmoadg = {da.zoijcleaow.colorPrimary};

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int[] f22898zoijcleaow = {da.zoijcleaow.colorPrimaryVariant};

    public static mbcevpiqjq btonecajqb(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        zoijcleaow(context, attributeSet, i13, i14);
        wkgbmnqykc(context, attributeSet, iArr, i13, i14, iArr2);
        return mbcevpiqjq.jyumaefscl(context, attributeSet, iArr, i13, i14);
    }

    public static TypedArray dxjokdxxww(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        zoijcleaow(context, attributeSet, i13, i14);
        wkgbmnqykc(context, attributeSet, iArr, i13, i14, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
    }

    private static void eablkybsjg(Context context, int[] iArr, String str) {
        if (nufgyqmvbu(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    private static boolean gxszxtbevo(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i13, i14);
        for (int i15 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i15, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static void iobyxmoadg(Context context) {
        eablkybsjg(context, f22897iobyxmoadg, "Theme.AppCompat");
    }

    public static boolean lqeggnwhkg(Context context) {
        return oa.zoijcleaow.zoijcleaow(context, da.zoijcleaow.isMaterial3Theme, false);
    }

    private static boolean nufgyqmvbu(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i13)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static void ppxfxbqfkf(Context context) {
        eablkybsjg(context, f22898zoijcleaow, "Theme.MaterialComponents");
    }

    private static void wkgbmnqykc(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14, int... iArr2) {
        boolean zGxszxtbevo;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.ThemeEnforcement, i13, i14);
        if (!typedArrayObtainStyledAttributes.getBoolean(da.draadjrbmk.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zGxszxtbevo = typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zGxszxtbevo = gxszxtbevo(context, attributeSet, iArr, i13, i14, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zGxszxtbevo) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void zoijcleaow(Context context, AttributeSet attributeSet, int i13, int i14) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, da.draadjrbmk.ThemeEnforcement, i13, i14);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(da.draadjrbmk.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z13) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(da.zoijcleaow.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                ppxfxbqfkf(context);
            }
        }
        iobyxmoadg(context);
    }
}
