package modern.payments.ecomAndroid.util.view;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lgg/vdvldrhtss;", "splitToMonthToYear", "(Ljava/lang/String;)Lgg/vdvldrhtss;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CardDateFormatTextWatcherKt {
    public static final vdvldrhtss splitToMonthToYear(String str) {
        zdlpuopuiu.btonecajqb(str, "<this>");
        if (str.length() <= 2) {
            return cqumvgiudr.iobyxmoadg(kcexrzcfyt.y(str, 2), "");
        }
        String strY = kcexrzcfyt.y(str, 2);
        String strSubstring = str.substring(2);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return cqumvgiudr.iobyxmoadg(strY, strSubstring);
    }
}
