package jd;

import hd.lqeggnwhkg;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Pattern f51116iobyxmoadg = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static Long iobyxmoadg(HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
            return null;
        } catch (NumberFormatException unused) {
            gd.iobyxmoadg.eablkybsjg().iobyxmoadg("The content-length value is not a valid number");
            return null;
        }
    }

    public static boolean ppxfxbqfkf(String str) {
        return str == null || !f51116iobyxmoadg.matcher(str).matches();
    }

    public static void wkgbmnqykc(lqeggnwhkg lqeggnwhkgVar) {
        if (!lqeggnwhkgVar.nufgyqmvbu()) {
            lqeggnwhkgVar.yggfygwlhe();
        }
        lqeggnwhkgVar.ppxfxbqfkf();
    }

    public static String zoijcleaow(HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }
}
