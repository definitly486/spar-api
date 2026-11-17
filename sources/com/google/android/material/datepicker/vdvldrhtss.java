package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.icu.text.DisplayContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static AtomicReference f22712iobyxmoadg = new AtomicReference();

    static Calendar agtfadlqog(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(btonecajqb());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    private static TimeZone btonecajqb() {
        return TimeZone.getTimeZone("UTC");
    }

    private static android.icu.util.TimeZone draadjrbmk() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static rgvfuqvkyq dxjokdxxww() {
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) f22712iobyxmoadg.get();
        return rgvfuqvkyqVar == null ? rgvfuqvkyq.ppxfxbqfkf() : rgvfuqvkyqVar;
    }

    static Calendar eablkybsjg(Calendar calendar) {
        Calendar calendarAgtfadlqog = agtfadlqog(calendar);
        Calendar calendarWflxmlrfwp = wflxmlrfwp();
        calendarWflxmlrfwp.set(calendarAgtfadlqog.get(1), calendarAgtfadlqog.get(2), calendarAgtfadlqog.get(5));
        return calendarWflxmlrfwp;
    }

    static Calendar gtknphoqwx() {
        Calendar calendarIobyxmoadg = dxjokdxxww().iobyxmoadg();
        calendarIobyxmoadg.set(11, 0);
        calendarIobyxmoadg.set(12, 0);
        calendarIobyxmoadg.set(13, 0);
        calendarIobyxmoadg.set(14, 0);
        calendarIobyxmoadg.setTimeZone(btonecajqb());
        return calendarIobyxmoadg;
    }

    static SimpleDateFormat gxszxtbevo() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(wkgbmnqykc(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(btonecajqb());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static long iobyxmoadg(long j13) {
        Calendar calendarWflxmlrfwp = wflxmlrfwp();
        calendarWflxmlrfwp.setTimeInMillis(j13);
        return eablkybsjg(calendarWflxmlrfwp).getTimeInMillis();
    }

    static String lqeggnwhkg(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(da.btonecajqb.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(da.btonecajqb.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(da.btonecajqb.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    static android.icu.text.DateFormat nufgyqmvbu(Locale locale) {
        return ppxfxbqfkf("MMMMEEEEd", locale);
    }

    static android.icu.text.DateFormat ojitshcjhn(Locale locale) {
        return ppxfxbqfkf("yMMMd", locale);
    }

    private static android.icu.text.DateFormat ppxfxbqfkf(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(draadjrbmk());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static android.icu.text.DateFormat rgvfuqvkyq(Locale locale) {
        return ppxfxbqfkf("yMMMM", locale);
    }

    static android.icu.text.DateFormat vdvldrhtss(Locale locale) {
        return ppxfxbqfkf("yMMMMEEEEd", locale);
    }

    static Calendar wflxmlrfwp() {
        return agtfadlqog(null);
    }

    static String wkgbmnqykc(String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    static android.icu.text.DateFormat zoijcleaow(Locale locale) {
        return ppxfxbqfkf("MMMd", locale);
    }
}
