package dt;

import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.kcexrzcfyt;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg implements dt.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final int f29466btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final zoijcleaow f29467dxjokdxxww;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final iobyxmoadg f29464gtknphoqwx = new iobyxmoadg(null);

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final int f29463draadjrbmk = 8;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private static final Locale f29465wflxmlrfwp = new Locale("ru", "RU");

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SimpleDateFormat f29470iobyxmoadg = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SimpleDateFormat f29475zoijcleaow = new SimpleDateFormat("EEEE", Locale.getDefault());

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SimpleDateFormat f29473ppxfxbqfkf = new SimpleDateFormat("dd.MM", Locale.getDefault());

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final DateTimeFormatter f29474wkgbmnqykc = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final DateTimeFormatter f29468eablkybsjg = DateTimeFormatter.ofPattern("HH:mm");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final DateTimeFormatter f29469gxszxtbevo = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gtknphoqwx f29471lqeggnwhkg = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: dt.ppxfxbqfkf
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return eablkybsjg.agtfadlqog();
        }
    });

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final gtknphoqwx f29472nufgyqmvbu = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: dt.wkgbmnqykc
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return eablkybsjg.oxmwwwfdhm();
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
        public static final /* synthetic */ int[] f29476iobyxmoadg;

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
            f29476iobyxmoadg = iArr;
        }
    }

    public enum zoijcleaow {
        MORNING,
        DAY,
        EVENING,
        NIGHT;


        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f29478esjtqupxsv = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public eablkybsjg() {
        int i13;
        int i14 = Calendar.getInstance().get(11);
        zoijcleaow zoijcleaowVar = (4 > i14 || i14 >= 12) ? (12 > i14 || i14 >= 16) ? (16 > i14 || i14 >= 23) ? zoijcleaow.NIGHT : zoijcleaow.EVENING : zoijcleaow.DAY : zoijcleaow.MORNING;
        this.f29467dxjokdxxww = zoijcleaowVar;
        int i15 = ppxfxbqfkf.f29476iobyxmoadg[zoijcleaowVar.ordinal()];
        if (i15 == 1) {
            i13 = bt.iobyxmoadg.morning_greeting_without_name;
        } else if (i15 == 2) {
            i13 = bt.iobyxmoadg.day_greeting_without_name;
        } else if (i15 == 3) {
            i13 = bt.iobyxmoadg.evening_greeting_without_name;
        } else {
            if (i15 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = bt.iobyxmoadg.night_greeting_without_name;
        }
        this.f29466btonecajqb = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZoneId agtfadlqog() {
        return ZoneId.of("Europe/Moscow");
    }

    private final Calendar draadjrbmk(Date date) {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(date);
        zdlpuopuiu.lqeggnwhkg(calendar);
        return calendar;
    }

    private final LocalDate ojitshcjhn(String str, DateTimeFormatter dateTimeFormatter) {
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
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        return (LocalDate) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter oxmwwwfdhm() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
    }

    private final LocalDateTime rgvfuqvkyq(String str, DateTimeFormatter dateTimeFormatter, LocalDateTime localDateTime) {
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
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
            obj = localDateTime;
        }
        return (LocalDateTime) obj;
    }

    static /* synthetic */ LocalDateTime vdvldrhtss(eablkybsjg eablkybsjgVar, String str, DateTimeFormatter dateTimeFormatter, LocalDateTime localDateTime, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            localDateTime = null;
        }
        return eablkybsjgVar.rgvfuqvkyq(str, dateTimeFormatter, localDateTime);
    }

    private final ZoneId wflxmlrfwp() {
        return (ZoneId) this.f29471lqeggnwhkg.getValue();
    }

    @Override // dt.zoijcleaow
    public long dxjokdxxww(LocalDateTime date) {
        zdlpuopuiu.btonecajqb(date, "date");
        return Duration.between(LocalDateTime.now(wflxmlrfwp()), date).toMillis() / 1000;
    }

    @Override // dt.zoijcleaow
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
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(thDxjokdxxww, new CrashlyticsKey[0]);
        }
        return (String) obj;
    }

    @Override // dt.zoijcleaow
    public LocalDateTime gxszxtbevo(String dateTimeString) {
        zdlpuopuiu.btonecajqb(dateTimeString, "dateTimeString");
        DateTimeFormatter localDateTimeFormat = this.f29469gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(localDateTimeFormat, "localDateTimeFormat");
        LocalDateTime localDateTimeVdvldrhtss = vdvldrhtss(this, dateTimeString, localDateTimeFormat, null, 4, null);
        if (localDateTimeVdvldrhtss != null) {
            return localDateTimeVdvldrhtss;
        }
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        zdlpuopuiu.dxjokdxxww(localDateTimeNow, "now(...)");
        return localDateTimeNow;
    }

    @Override // dt.zoijcleaow
    public LocalDate iobyxmoadg(String date) {
        zdlpuopuiu.btonecajqb(date, "date");
        DateTimeFormatter dateFormatter = this.f29474wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(dateFormatter, "dateFormatter");
        return ojitshcjhn(date, dateFormatter);
    }

    @Override // dt.zoijcleaow
    public Date lqeggnwhkg() {
        Calendar calendarDraadjrbmk = draadjrbmk(new Date());
        calendarDraadjrbmk.add(1, -100);
        Date time = calendarDraadjrbmk.getTime();
        zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        return time;
    }

    @Override // dt.zoijcleaow
    public LocalDateTime nufgyqmvbu() {
        LocalDateTime localDateTimeNow = LocalDateTime.now(wflxmlrfwp());
        zdlpuopuiu.dxjokdxxww(localDateTimeNow, "now(...)");
        return localDateTimeNow;
    }

    @Override // dt.zoijcleaow
    public LocalDateTime ppxfxbqfkf(String dateTime, DateTimeFormatter formatter) {
        zdlpuopuiu.btonecajqb(dateTime, "dateTime");
        zdlpuopuiu.btonecajqb(formatter, "formatter");
        return vdvldrhtss(this, dateTime, formatter, null, 4, null);
    }

    @Override // dt.zoijcleaow
    public Date wkgbmnqykc() {
        Calendar calendarDraadjrbmk = draadjrbmk(new Date());
        calendarDraadjrbmk.add(1, -14);
        Date time = calendarDraadjrbmk.getTime();
        zdlpuopuiu.dxjokdxxww(time, "getTime(...)");
        return time;
    }

    @Override // dt.zoijcleaow
    public int zoijcleaow() {
        return this.f29466btonecajqb;
    }
}
