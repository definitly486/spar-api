package bz;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class c extends metgxyhuhe {
    c() {
        super(kc2.lqeggnwhkg.TimeZone);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        return Long.toString(TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault()).getTimeInMillis())));
    }
}
