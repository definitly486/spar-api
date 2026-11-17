package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.identity.zzeo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import n1.iobyxmoadg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak {
    public static final /* synthetic */ int zza = 0;
    private static final DecimalFormat zzb;
    private static final DecimalFormat zzc;
    private static final StringBuilder zzd;

    static {
        Locale locale = Locale.ROOT;
        zzb = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        zzc = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        zzd = new StringBuilder();
    }

    public static StringBuilder zza(Location location, StringBuilder sb3) {
        sb3.ensureCapacity(100);
        if (location == null) {
            sb3.append((String) null);
            return sb3;
        }
        sb3.append("{");
        sb3.append(location.getProvider());
        sb3.append(", ");
        if (iobyxmoadg.nufgyqmvbu(location)) {
            sb3.append("mock, ");
        }
        DecimalFormat decimalFormat = zzb;
        sb3.append(decimalFormat.format(location.getLatitude()));
        sb3.append(StringUtils.COMMA);
        sb3.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb3.append("±");
            sb3.append(zzc.format(location.getAccuracy()));
            sb3.append("m");
        }
        if (location.hasAltitude()) {
            sb3.append(", alt=");
            DecimalFormat decimalFormat2 = zzc;
            sb3.append(decimalFormat2.format(location.getAltitude()));
            if (iobyxmoadg.lqeggnwhkg(location)) {
                sb3.append("±");
                sb3.append(decimalFormat2.format(iobyxmoadg.wkgbmnqykc(location)));
            }
            sb3.append("m");
        }
        if (location.hasSpeed()) {
            sb3.append(", spd=");
            DecimalFormat decimalFormat3 = zzc;
            sb3.append(decimalFormat3.format(location.getSpeed()));
            if (iobyxmoadg.gxszxtbevo(location)) {
                sb3.append("±");
                sb3.append(decimalFormat3.format(iobyxmoadg.ppxfxbqfkf(location)));
            }
            sb3.append("m/s");
        }
        if (location.hasBearing()) {
            sb3.append(", brg=");
            DecimalFormat decimalFormat4 = zzc;
            sb3.append(decimalFormat4.format(location.getBearing()));
            if (iobyxmoadg.eablkybsjg(location)) {
                sb3.append("±");
                sb3.append(decimalFormat4.format(iobyxmoadg.iobyxmoadg(location)));
            }
            sb3.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb3.append(", fl=");
            sb3.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb3.append(", lv=");
            sb3.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb3.append(", ert=");
        sb3.append(zzeo.zza(iobyxmoadg.zoijcleaow(location) + jCurrentTimeMillis));
        sb3.append('}');
        return sb3;
    }
}
