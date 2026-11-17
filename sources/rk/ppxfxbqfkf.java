package rk;

import gg.wwaezpbzkn;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f82968iobyxmoadg = new iobyxmoadg();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final DateFormat[] f82969ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final String[] f82970zoijcleaow;

    public static final class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(rgvfuqvkyq.f67374wkgbmnqykc);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f82970zoijcleaow = strArr;
        f82969ppxfxbqfkf = new DateFormat[strArr.length];
    }

    public static final Date iobyxmoadg(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f82968iobyxmoadg.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f82970zoijcleaow;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    DateFormat[] dateFormatArr = f82969ppxfxbqfkf;
                    DateFormat simpleDateFormat = dateFormatArr[i13];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f82970zoijcleaow[i13], Locale.US);
                        simpleDateFormat.setTimeZone(rgvfuqvkyq.f67374wkgbmnqykc);
                        dateFormatArr[i13] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final String zoijcleaow(Date date) {
        zdlpuopuiu.btonecajqb(date, "<this>");
        String str = ((DateFormat) f82968iobyxmoadg.get()).format(date);
        zdlpuopuiu.dxjokdxxww(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
