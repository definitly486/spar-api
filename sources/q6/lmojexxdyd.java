package q6;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f77950iobyxmoadg;

    static {
        String strDxjokdxxww = g6.yggfygwlhe.dxjokdxxww("WakeLocks");
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"WakeLocks\")");
        f77950iobyxmoadg = strDxjokdxxww;
    }

    public static final void iobyxmoadg() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f77973iobyxmoadg;
        synchronized (wwaezpbzknVar) {
            linkedHashMap.putAll(wwaezpbzknVar.iobyxmoadg());
            gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f77950iobyxmoadg, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock zoijcleaow(Context context, String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f77973iobyxmoadg;
        synchronized (wwaezpbzknVar) {
        }
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wakeLock, "wakeLock");
        return wakeLock;
    }
}
