package vk;

import android.util.Log;
import hg.tzroggbefp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.lereixgezr;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f117462ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final eablkybsjg f117461iobyxmoadg = new eablkybsjg();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final CopyOnWriteArraySet f117463zoijcleaow = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r13 = lereixgezr.class.getPackage();
        String name = r13 != null ? r13.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = lereixgezr.class.getName();
        zdlpuopuiu.dxjokdxxww(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = tk.wkgbmnqykc.class.getName();
        zdlpuopuiu.dxjokdxxww(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = pk.wkgbmnqykc.class.getName();
        zdlpuopuiu.dxjokdxxww(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f117462ppxfxbqfkf = tzroggbefp.yggfygwlhe(linkedHashMap);
    }

    private eablkybsjg() {
    }

    private final void ppxfxbqfkf(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f117463zoijcleaow.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(gxszxtbevo.f117466iobyxmoadg);
        }
    }

    private final String wkgbmnqykc(String str) {
        String str2 = (String) f117462ppxfxbqfkf.get(str);
        return str2 == null ? kcexrzcfyt.y(str, 23) : str2;
    }

    public final void iobyxmoadg(String loggerName, int i13, String message, Throwable th2) {
        int iMin;
        zdlpuopuiu.btonecajqb(loggerName, "loggerName");
        zdlpuopuiu.btonecajqb(message, "message");
        String strWkgbmnqykc = wkgbmnqykc(loggerName);
        if (Log.isLoggable(strWkgbmnqykc, i13)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            int length = message.length();
            int i14 = 0;
            while (i14 < length) {
                int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(message, '\n', i14, false, 4, null);
                if (iYfnezrywwk == -1) {
                    iYfnezrywwk = length;
                }
                while (true) {
                    iMin = Math.min(iYfnezrywwk, i14 + 4000);
                    String strSubstring = message.substring(i14, iMin);
                    zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i13, strWkgbmnqykc, strSubstring);
                    if (iMin >= iYfnezrywwk) {
                        break;
                    } else {
                        i14 = iMin;
                    }
                }
                i14 = iMin + 1;
            }
        }
    }

    public final void zoijcleaow() {
        for (Map.Entry entry : f117462ppxfxbqfkf.entrySet()) {
            ppxfxbqfkf((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
