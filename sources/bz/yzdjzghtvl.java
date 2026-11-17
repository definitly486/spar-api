package bz;

import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class yzdjzghtvl extends metgxyhuhe {
    yzdjzghtvl() {
        super(kc2.lqeggnwhkg.TimeZoneDSTOffset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        TimeZone timeZone = TimeZone.getDefault();
        return String.valueOf(timeZone.inDaylightTime(new Date()) ? TimeUnit.MILLISECONDS.toMinutes(timeZone.getDSTSavings()) : 0L);
    }
}
