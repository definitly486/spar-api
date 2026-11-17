package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    final iobyxmoadg f22715eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    final iobyxmoadg f22716gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final iobyxmoadg f22717iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final iobyxmoadg f22718lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    final Paint f22719nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final iobyxmoadg f22720ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    final iobyxmoadg f22721wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final iobyxmoadg f22722zoijcleaow;

    zoijcleaow(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(oa.zoijcleaow.wkgbmnqykc(context, da.zoijcleaow.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), da.draadjrbmk.MaterialCalendar);
        this.f22717iobyxmoadg = iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendar_dayStyle, 0));
        this.f22718lqeggnwhkg = iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendar_dayInvalidStyle, 0));
        this.f22722zoijcleaow = iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendar_daySelectedStyle, 0));
        this.f22720ppxfxbqfkf = iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListIobyxmoadg = oa.ppxfxbqfkf.iobyxmoadg(context, typedArrayObtainStyledAttributes, da.draadjrbmk.MaterialCalendar_rangeFillColor);
        this.f22721wkgbmnqykc = iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendar_yearStyle, 0));
        this.f22715eablkybsjg = iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendar_yearSelectedStyle, 0));
        this.f22716gxszxtbevo = iobyxmoadg.iobyxmoadg(context, typedArrayObtainStyledAttributes.getResourceId(da.draadjrbmk.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f22719nufgyqmvbu = paint;
        paint.setColor(colorStateListIobyxmoadg.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
