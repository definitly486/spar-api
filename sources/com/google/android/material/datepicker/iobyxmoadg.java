package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f22695eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ra.gtknphoqwx f22696gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Rect f22697iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ColorStateList f22698ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ColorStateList f22699wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ColorStateList f22700zoijcleaow;

    private iobyxmoadg(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i13, ra.gtknphoqwx gtknphoqwxVar, Rect rect) {
        u1.nufgyqmvbu.wkgbmnqykc(rect.left);
        u1.nufgyqmvbu.wkgbmnqykc(rect.top);
        u1.nufgyqmvbu.wkgbmnqykc(rect.right);
        u1.nufgyqmvbu.wkgbmnqykc(rect.bottom);
        this.f22697iobyxmoadg = rect;
        this.f22700zoijcleaow = colorStateList2;
        this.f22698ppxfxbqfkf = colorStateList;
        this.f22699wkgbmnqykc = colorStateList3;
        this.f22695eablkybsjg = i13;
        this.f22696gxszxtbevo = gtknphoqwxVar;
    }

    static iobyxmoadg iobyxmoadg(Context context, int i13) {
        u1.nufgyqmvbu.zoijcleaow(i13 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i13, da.draadjrbmk.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(da.draadjrbmk.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(da.draadjrbmk.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(da.draadjrbmk.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(da.draadjrbmk.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListIobyxmoadg = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, da.draadjrbmk.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListIobyxmoadg2 = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, da.draadjrbmk.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListIobyxmoadg3 = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, da.draadjrbmk.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(da.draadjrbmk.MaterialCalendarItem_itemStrokeWidth, 0);
        ra.gtknphoqwx gtknphoqwxVarWflxmlrfwp = ra.gtknphoqwx.zoijcleaow(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).wflxmlrfwp();
        typedArrayObtainStyledAttributes.recycle();
        return new iobyxmoadg(colorStateListIobyxmoadg, colorStateListIobyxmoadg2, colorStateListIobyxmoadg3, dimensionPixelSize, gtknphoqwxVarWflxmlrfwp, rect);
    }

    void eablkybsjg(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg();
        ra.lqeggnwhkg lqeggnwhkgVar2 = new ra.lqeggnwhkg();
        lqeggnwhkgVar.setShapeAppearanceModel(this.f22696gxszxtbevo);
        lqeggnwhkgVar2.setShapeAppearanceModel(this.f22696gxszxtbevo);
        if (colorStateList == null) {
            colorStateList = this.f22698ppxfxbqfkf;
        }
        lqeggnwhkgVar.crxdokpmqz(colorStateList);
        lqeggnwhkgVar.xrmfcynszj(this.f22695eablkybsjg, this.f22699wkgbmnqykc);
        if (colorStateList2 == null) {
            colorStateList2 = this.f22700zoijcleaow;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f22700zoijcleaow.withAlpha(30), lqeggnwhkgVar, lqeggnwhkgVar2);
        Rect rect = this.f22697iobyxmoadg;
        jhduphickx.weqkydbzbr(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    int ppxfxbqfkf() {
        return this.f22697iobyxmoadg.top;
    }

    void wkgbmnqykc(TextView textView) {
        eablkybsjg(textView, null, null);
    }

    int zoijcleaow() {
        return this.f22697iobyxmoadg.bottom;
    }
}
