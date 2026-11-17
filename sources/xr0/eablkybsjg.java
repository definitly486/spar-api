package xr0;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.kcexrzcfyt;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg implements xr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f123114btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final zoijcleaow f123115dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final iobyxmoadg f123112gtknphoqwx = new iobyxmoadg(null);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final int f123111draadjrbmk = 8;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Locale f123113wflxmlrfwp = new Locale("ru", "RU");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SimpleDateFormat f123118iobyxmoadg = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SimpleDateFormat f123123zoijcleaow = new SimpleDateFormat("EEEE", Locale.getDefault());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SimpleDateFormat f123121ppxfxbqfkf = new SimpleDateFormat("dd.MM", Locale.getDefault());

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final DateTimeFormatter f123122wkgbmnqykc = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final DateTimeFormatter f123116eablkybsjg = DateTimeFormatter.ofPattern("HH:mm");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final DateTimeFormatter f123117gxszxtbevo = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gtknphoqwx f123119lqeggnwhkg = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xr0.ppxfxbqfkf
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return eablkybsjg.gtknphoqwx();
        }
    });

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final gtknphoqwx f123120nufgyqmvbu = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: xr0.wkgbmnqykc
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return eablkybsjg.ojitshcjhn();
        }
    });

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f123124iobyxmoadg;

        static {
            int[] iArr = new int[zoijcleaow.values().length];
            try {
                iArr[zoijcleaow.MORNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zoijcleaow.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zoijcleaow.EVENING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zoijcleaow.NIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f123124iobyxmoadg = iArr;
        }
    }

    public enum zoijcleaow {
        MORNING,
        DAY,
        EVENING,
        NIGHT;


        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f123126esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public eablkybsjg() {
        int i13;
        int i14 = Calendar.getInstance().get(11);
        zoijcleaow zoijcleaowVar = (4 > i14 || i14 >= 12) ? (12 > i14 || i14 >= 16) ? (16 > i14 || i14 >= 23) ? zoijcleaow.NIGHT : zoijcleaow.EVENING : zoijcleaow.DAY : zoijcleaow.MORNING;
        this.f123115dxjokdxxww = zoijcleaowVar;
        int i15 = ppxfxbqfkf.f123124iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i15 == 1) {
            i13 = vr0.iobyxmoadg.proloyalty_morning_greeting_without_name;
        } else if (i15 == 2) {
            i13 = vr0.iobyxmoadg.proloyalty_day_greeting_without_name;
        } else if (i15 == 3) {
            i13 = vr0.iobyxmoadg.proloyalty_evening_greeting_without_name;
        } else {
            if (i15 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = vr0.iobyxmoadg.proloyalty_night_greeting_without_name;
        }
        this.f123114btonecajqb = i13;
    }

    static /* synthetic */ LocalDateTime agtfadlqog(eablkybsjg eablkybsjgVar, String str, DateTimeFormatter dateTimeFormatter, LocalDateTime localDateTime, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            localDateTime = null;
        }
        return eablkybsjgVar.wflxmlrfwp(str, dateTimeFormatter, localDateTime);
    }

    private final Calendar btonecajqb(Date date) {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(date);
        zdlpuopuiu.lqeggnwhkg(calendar);
        return calendar;
    }

    private final LocalDate draadjrbmk(String str, DateTimeFormatter dateTimeFormatter) {
        Object objWkgbmnqykc;
        Object obj = null;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(LocalDate.parse(str, dateTimeFormatter));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            obj = objWkgbmnqykc;
        } else {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        return (LocalDate) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZoneId gtknphoqwx() {
        return ZoneId.of("Europe/Moscow");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter ojitshcjhn() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
    }

    private final LocalDateTime wflxmlrfwp(String str, DateTimeFormatter dateTimeFormatter, LocalDateTime localDateTime) {
        Object objWkgbmnqykc;
        Object obj;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(LocalDateTime.parse(str, dateTimeFormatter));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            obj = objWkgbmnqykc;
        } else {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
            obj = localDateTime;
        }
        return (LocalDateTime) obj;
    }

    @Override // xr0.zoijcleaow
    public String eablkybsjg(LocalDate localDate, String pattern) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(pattern, "pattern");
        Object obj = null;
        if (localDate == null) {
            return null;
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(DateTimeFormatter.ofPattern(pattern).format(localDate));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww == null) {
            obj = objWkgbmnqykc;
        } else {
            kr0.wkgbmnqykc.f60450iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        return (String) obj;
    }

    @Override // xr0.zoijcleaow
    public LocalDateTime gxszxtbevo(String dateTimeString) {
        zdlpuopuiu.btonecajqb(dateTimeString, "dateTimeString");
        DateTimeFormatter localDateTimeFormat = this.f123117gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(localDateTimeFormat, "localDateTimeFormat");
        LocalDateTime localDateTimeAgtfadlqog = agtfadlqog(this, dateTimeString, localDateTimeFormat, null, 4, null);
        if (localDateTimeAgtfadlqog != null) {
            return localDateTimeAgtfadlqog;
        }
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        zdlpuopuiu.dxjokdxxww(localDateTimeNow, "now(...)");
        return localDateTimeNow;
    }

    @Override // xr0.zoijcleaow
    public LocalDate iobyxmoadg(String date) {
        zdlpuopuiu.btonecajqb(date, "date");
        DateTimeFormatter dateFormatter = this.f123122wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(dateFormatter, "dateFormatter");
        return draadjrbmk(date, dateFormatter);
    }

    @Override // xr0.zoijcleaow
    public Date lqeggnwhkg() {
        Calendar calendarBtonecajqb = btonecajqb(new Date());
        calendarBtonecajqb.add(1, -99);
        Date time = calendarBtonecajqb.getTime();
        zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        return time;
    }

    @Override // xr0.zoijcleaow
    public LocalDateTime ppxfxbqfkf(String dateTime, DateTimeFormatter formatter) {
        zdlpuopuiu.btonecajqb(dateTime, "dateTime");
        zdlpuopuiu.btonecajqb(formatter, "formatter");
        return agtfadlqog(this, dateTime, formatter, null, 4, null);
    }

    @Override // xr0.zoijcleaow
    public Date wkgbmnqykc() {
        Calendar calendarBtonecajqb = btonecajqb(new Date());
        calendarBtonecajqb.add(1, -14);
        Date time = calendarBtonecajqb.getTime();
        zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        return time;
    }

    @Override // xr0.zoijcleaow
    public int zoijcleaow() {
        return this.f123114btonecajqb;
    }
}
