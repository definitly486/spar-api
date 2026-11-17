package istkbnxepw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f49329iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f49330zoijcleaow = new HashMap();

    public static oxmwwwfdhm iobyxmoadg(Object obj) {
        oxmwwwfdhm oxmwwwfdhmVar;
        synchronized (f49329iobyxmoadg) {
            oxmwwwfdhmVar = (oxmwwwfdhm) f49330zoijcleaow.get(obj);
        }
        return oxmwwwfdhmVar == null ? oxmwwwfdhm.f49400iobyxmoadg : oxmwwwfdhmVar;
    }
}
