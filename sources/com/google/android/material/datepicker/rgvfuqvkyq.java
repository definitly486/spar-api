package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
class rgvfuqvkyq {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final rgvfuqvkyq f22709ppxfxbqfkf = new rgvfuqvkyq(null, null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Long f22710iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TimeZone f22711zoijcleaow;

    private rgvfuqvkyq(Long l13, TimeZone timeZone) {
        this.f22710iobyxmoadg = l13;
        this.f22711zoijcleaow = timeZone;
    }

    static rgvfuqvkyq ppxfxbqfkf() {
        return f22709ppxfxbqfkf;
    }

    Calendar iobyxmoadg() {
        return zoijcleaow(this.f22711zoijcleaow);
    }

    Calendar zoijcleaow(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l13 = this.f22710iobyxmoadg;
        if (l13 != null) {
            calendar.setTimeInMillis(l13.longValue());
        }
        return calendar;
    }
}
