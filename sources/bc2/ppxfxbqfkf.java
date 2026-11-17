package bc2;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ppxfxbqfkf f15777iobyxmoadg = new ppxfxbqfkf();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Locale f15778zoijcleaow = new Locale("RU");

    private ppxfxbqfkf() {
    }

    private final String iobyxmoadg(Date date) {
        StringBuilder sb3 = new StringBuilder(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", f15778zoijcleaow).format(date));
        sb3.insert(sb3.length() - 2, StringUtils.PROCESS_POSTFIX_DELIMITER);
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "builder.toString()");
        return string;
    }

    public final String zoijcleaow() {
        Date time = Calendar.getInstance().getTime();
        zdlpuopuiu.dxjokdxxww(time, "getInstance().time");
        return iobyxmoadg(time);
    }
}
