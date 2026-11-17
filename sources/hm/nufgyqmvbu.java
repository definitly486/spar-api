package hm;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.bp.zone.ZoneRulesException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final CopyOnWriteArrayList f40783iobyxmoadg = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ConcurrentMap f40784zoijcleaow = new ConcurrentHashMap(UserVerificationMethods.USER_VERIFY_NONE, 0.75f, 2);

    static {
        lqeggnwhkg.iobyxmoadg();
    }

    protected nufgyqmvbu() {
    }

    public static void eablkybsjg(nufgyqmvbu nufgyqmvbuVar) {
        fm.ppxfxbqfkf.dxjokdxxww(nufgyqmvbuVar, "provider");
        gxszxtbevo(nufgyqmvbuVar);
        f40783iobyxmoadg.add(nufgyqmvbuVar);
    }

    private static void gxszxtbevo(nufgyqmvbu nufgyqmvbuVar) {
        for (String str : nufgyqmvbuVar.wkgbmnqykc()) {
            fm.ppxfxbqfkf.dxjokdxxww(str, "zoneId");
            if (((nufgyqmvbu) f40784zoijcleaow.putIfAbsent(str, nufgyqmvbuVar)) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + nufgyqmvbuVar);
            }
        }
    }

    private static nufgyqmvbu iobyxmoadg(String str) {
        ConcurrentMap concurrentMap = f40784zoijcleaow;
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) concurrentMap.get(str);
        if (nufgyqmvbuVar != null) {
            return nufgyqmvbuVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    public static gxszxtbevo zoijcleaow(String str, boolean z13) {
        fm.ppxfxbqfkf.dxjokdxxww(str, "zoneId");
        return iobyxmoadg(str).ppxfxbqfkf(str, z13);
    }

    protected abstract gxszxtbevo ppxfxbqfkf(String str, boolean z13);

    protected abstract Set wkgbmnqykc();
}
