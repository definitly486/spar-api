package modern.payments.tracker.util.logging;

import cm.gxszxtbevo;
import cm.rgvfuqvkyq;
import em.iobyxmoadg;
import gg.lqeggnwhkg;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.wkgbmnqykc;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lmodern/payments/tracker/util/logging/PrettyLogFormatter;", "", "()V", "BOTTOM_BORDER", "", "BOTTOM_LEFT_CORNER", "", "CHUNK_SIZE", "", "DATE_TIME_PATTERN", "DEFAULT_DOUBLE_DIVIDER", "DEFAULT_SINGLE_DIVIDER", "HORIZONTAL_LINE", "MIDDLE_BORDER", "MIDDLE_CORNER", "SHORT_DOUBLE_DIVIDER", "SHORT_SINGLE_DIVIDER", "TOP_BORDER", "TOP_LEFT_CORNER", "lineSeparator", "getActualDateTime", "makeContentLines", "", "chunk", "makeLine", "value", "makeLogLines", "tag", "message", "throwable", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PrettyLogFormatter {
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char BOTTOM_LEFT_CORNER = 9492;
    private static final int CHUNK_SIZE = 4000;
    private static final String DATE_TIME_PATTERN = "HH:mm:ss.SSS │ dd.MM.YYYY";
    public static final String DEFAULT_DOUBLE_DIVIDER = "────────────────────────────────────────────────────────";
    public static final String DEFAULT_SINGLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final char HORIZONTAL_LINE = 9474;
    public static final PrettyLogFormatter INSTANCE = new PrettyLogFormatter();
    private static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final char MIDDLE_CORNER = 9500;
    public static final String SHORT_DOUBLE_DIVIDER = "────────────────────";
    public static final String SHORT_SINGLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final char TOP_LEFT_CORNER = 9484;
    private static String lineSeparator;

    static {
        String strLineSeparator = System.lineSeparator();
        if (strLineSeparator == null) {
            strLineSeparator = "\n";
        }
        lineSeparator = strLineSeparator;
    }

    private PrettyLogFormatter() {
    }

    private final String getActualDateTime() {
        String strKcexrzcfyt = gxszxtbevo.dsvhmnatus(rgvfuqvkyq.pmvmpeiblj()).kcexrzcfyt(iobyxmoadg.lqeggnwhkg(DATE_TIME_PATTERN));
        zdlpuopuiu.dxjokdxxww(strKcexrzcfyt, "run(...)");
        return strKcexrzcfyt;
    }

    private final List<String> makeContentLines(String chunk) {
        List listKcexrzcfyt = new mj.rgvfuqvkyq(lineSeparator).kcexrzcfyt(chunk, 0);
        PrettyLogFormatter prettyLogFormatter = INSTANCE;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listKcexrzcfyt, 10));
        Iterator it = listKcexrzcfyt.iterator();
        while (it.hasNext()) {
            arrayList.add(prettyLogFormatter.makeLine((String) it.next()));
        }
        return arrayList;
    }

    private final String makeLine(String value) {
        String str = HORIZONTAL_LINE + ' ' + value;
        zdlpuopuiu.dxjokdxxww(str, "toString(...)");
        return str;
    }

    public final List<String> makeLogLines(String tag, String message, Throwable throwable) {
        zdlpuopuiu.btonecajqb(message, "message");
        ArrayList arrayList = new ArrayList();
        arrayList.add(TOP_BORDER);
        if (tag != null) {
            PrettyLogFormatter prettyLogFormatter = INSTANCE;
            arrayList.add(prettyLogFormatter.makeLine(tag));
            arrayList.add(prettyLogFormatter.makeLine(prettyLogFormatter.getActualDateTime()));
            arrayList.add(MIDDLE_BORDER);
        }
        byte[] bytes = message.getBytes(wkgbmnqykc.f67326zoijcleaow);
        zdlpuopuiu.dxjokdxxww(bytes, "getBytes(...)");
        int length = bytes.length;
        if (length <= CHUNK_SIZE) {
            arrayList.addAll(makeContentLines(message));
        } else {
            for (int i13 = 0; i13 < length; i13 += CHUNK_SIZE) {
                arrayList.addAll(makeContentLines(new String(bytes, i13, gtknphoqwx.btonecajqb(length - i13, CHUNK_SIZE), wkgbmnqykc.f67326zoijcleaow)));
            }
        }
        if (throwable != null) {
            arrayList.add(MIDDLE_BORDER);
            String localizedMessage = throwable.getLocalizedMessage();
            if (localizedMessage == null && (localizedMessage = throwable.getMessage()) == null) {
                localizedMessage = "";
            }
            arrayList.add(makeLine(localizedMessage));
            arrayList.addAll(makeContentLines(lqeggnwhkg.ppxfxbqfkf(throwable)));
        }
        arrayList.add(BOTTOM_BORDER);
        return jyumaefscl.m(arrayList);
    }
}
