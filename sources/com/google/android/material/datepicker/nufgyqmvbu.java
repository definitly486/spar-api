package com.google.android.material.datepicker;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
abstract class nufgyqmvbu {
    static String agtfadlqog(long j13, Locale locale) {
        return vdvldrhtss.ojitshcjhn(locale).format(new Date(j13));
    }

    static String btonecajqb(long j13) {
        return vdvldrhtss(j13) ? nufgyqmvbu(j13) : ojitshcjhn(j13);
    }

    static String draadjrbmk(long j13) {
        return vdvldrhtss.rgvfuqvkyq(Locale.getDefault()).format(new Date(j13));
    }

    static String dxjokdxxww(long j13, Locale locale) {
        return vdvldrhtss.nufgyqmvbu(locale).format(new Date(j13));
    }

    static String eablkybsjg(Context context, long j13, boolean z13, boolean z14, boolean z15) {
        String strBtonecajqb = btonecajqb(j13);
        if (z13) {
            strBtonecajqb = String.format(context.getString(da.btonecajqb.mtrl_picker_today_description), strBtonecajqb);
        }
        if (z14) {
            return String.format(context.getString(da.btonecajqb.mtrl_picker_start_date_description), strBtonecajqb);
        }
        return z15 ? String.format(context.getString(da.btonecajqb.mtrl_picker_end_date_description), strBtonecajqb) : strBtonecajqb;
    }

    static String gtknphoqwx(Context context, int i13) {
        return vdvldrhtss.gtknphoqwx().get(1) == i13 ? String.format(context.getString(da.btonecajqb.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i13)) : String.format(context.getString(da.btonecajqb.mtrl_picker_navigate_to_year_description), Integer.valueOf(i13));
    }

    static String gxszxtbevo(long j13) {
        return lqeggnwhkg(j13, Locale.getDefault());
    }

    static u1.ppxfxbqfkf iobyxmoadg(Long l13, Long l14) {
        return zoijcleaow(l13, l14, null);
    }

    static String lqeggnwhkg(long j13, Locale locale) {
        return vdvldrhtss.zoijcleaow(locale).format(new Date(j13));
    }

    static String nufgyqmvbu(long j13) {
        return dxjokdxxww(j13, Locale.getDefault());
    }

    static String ojitshcjhn(long j13) {
        return rgvfuqvkyq(j13, Locale.getDefault());
    }

    static String ppxfxbqfkf(long j13) {
        return wkgbmnqykc(j13, null);
    }

    static String rgvfuqvkyq(long j13, Locale locale) {
        return vdvldrhtss.vdvldrhtss(locale).format(new Date(j13));
    }

    private static boolean vdvldrhtss(long j13) {
        Calendar calendarGtknphoqwx = vdvldrhtss.gtknphoqwx();
        Calendar calendarWflxmlrfwp = vdvldrhtss.wflxmlrfwp();
        calendarWflxmlrfwp.setTimeInMillis(j13);
        return calendarGtknphoqwx.get(1) == calendarWflxmlrfwp.get(1);
    }

    static String wflxmlrfwp(long j13) {
        return agtfadlqog(j13, Locale.getDefault());
    }

    static String wkgbmnqykc(long j13, SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j13));
        }
        return vdvldrhtss(j13) ? gxszxtbevo(j13) : wflxmlrfwp(j13);
    }

    static u1.ppxfxbqfkf zoijcleaow(Long l13, Long l14, SimpleDateFormat simpleDateFormat) {
        if (l13 == null && l14 == null) {
            return u1.ppxfxbqfkf.iobyxmoadg(null, null);
        }
        if (l13 == null) {
            return u1.ppxfxbqfkf.iobyxmoadg(null, wkgbmnqykc(l14.longValue(), simpleDateFormat));
        }
        if (l14 == null) {
            return u1.ppxfxbqfkf.iobyxmoadg(wkgbmnqykc(l13.longValue(), simpleDateFormat), null);
        }
        Calendar calendarGtknphoqwx = vdvldrhtss.gtknphoqwx();
        Calendar calendarWflxmlrfwp = vdvldrhtss.wflxmlrfwp();
        calendarWflxmlrfwp.setTimeInMillis(l13.longValue());
        Calendar calendarWflxmlrfwp2 = vdvldrhtss.wflxmlrfwp();
        calendarWflxmlrfwp2.setTimeInMillis(l14.longValue());
        if (simpleDateFormat != null) {
            return u1.ppxfxbqfkf.iobyxmoadg(simpleDateFormat.format(new Date(l13.longValue())), simpleDateFormat.format(new Date(l14.longValue())));
        }
        if (calendarWflxmlrfwp.get(1) == calendarWflxmlrfwp2.get(1)) {
            return calendarWflxmlrfwp.get(1) == calendarGtknphoqwx.get(1) ? u1.ppxfxbqfkf.iobyxmoadg(lqeggnwhkg(l13.longValue(), Locale.getDefault()), lqeggnwhkg(l14.longValue(), Locale.getDefault())) : u1.ppxfxbqfkf.iobyxmoadg(lqeggnwhkg(l13.longValue(), Locale.getDefault()), agtfadlqog(l14.longValue(), Locale.getDefault()));
        }
        return u1.ppxfxbqfkf.iobyxmoadg(agtfadlqog(l13.longValue(), Locale.getDefault()), agtfadlqog(l14.longValue(), Locale.getDefault()));
    }
}
