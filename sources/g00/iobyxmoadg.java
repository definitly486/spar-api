package g00;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.services.crash_logger.api.CrashlyticsKey;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements o30.iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C0806iobyxmoadg f35774zoijcleaow = new C0806iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SimpleDateFormat f35775iobyxmoadg = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

    /* JADX INFO: renamed from: g00.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0806iobyxmoadg {
        public /* synthetic */ C0806iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0806iobyxmoadg() {
        }
    }

    private final Date ppxfxbqfkf(String str) {
        try {
            Date date = this.f35775iobyxmoadg.parse(str);
            return date == null ? new Date() : date;
        } catch (ParseException e13) {
            rs.wkgbmnqykc.f83693iobyxmoadg.gxszxtbevo(e13, new CrashlyticsKey[0]);
            return new Date();
        }
    }

    private final int wkgbmnqykc(Date date, Date date2) {
        Calendar calendarZoijcleaow = zoijcleaow(date);
        Calendar calendarZoijcleaow2 = zoijcleaow(date2);
        int i13 = calendarZoijcleaow2.get(1) - calendarZoijcleaow.get(1);
        return (calendarZoijcleaow.get(2) > calendarZoijcleaow2.get(2) || (calendarZoijcleaow.get(2) == calendarZoijcleaow2.get(2) && calendarZoijcleaow.get(5) > calendarZoijcleaow2.get(5))) ? i13 - 1 : i13;
    }

    private final Calendar zoijcleaow(Date date) {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(date);
        zdlpuopuiu.lqeggnwhkg(calendar);
        return calendar;
    }

    @Override // o30.iobyxmoadg
    public boolean iobyxmoadg(String birthDateString) {
        zdlpuopuiu.btonecajqb(birthDateString, "birthDateString");
        return wkgbmnqykc(ppxfxbqfkf(birthDateString), new Date()) >= 14;
    }
}
