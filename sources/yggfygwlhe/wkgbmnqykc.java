package yggfygwlhe;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lereixgezr.iwizpuwonk;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Map f125003iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f125004zoijcleaow;

    static {
        HashMap map = new HashMap();
        f125003iobyxmoadg = map;
        HashMap map2 = new HashMap();
        f125004zoijcleaow = map2;
        iwizpuwonk iwizpuwonkVar = iwizpuwonk.f62292wkgbmnqykc;
        map.put(1L, iwizpuwonkVar);
        map2.put(iwizpuwonkVar, Collections.singletonList(1L));
        map.put(2L, iwizpuwonk.f62288gxszxtbevo);
        map2.put((iwizpuwonk) map.get(2L), Collections.singletonList(2L));
        iwizpuwonk iwizpuwonkVar2 = iwizpuwonk.f62289lqeggnwhkg;
        map.put(4L, iwizpuwonkVar2);
        map2.put(iwizpuwonkVar2, Collections.singletonList(4L));
        iwizpuwonk iwizpuwonkVar3 = iwizpuwonk.f62290nufgyqmvbu;
        map.put(8L, iwizpuwonkVar3);
        map2.put(iwizpuwonkVar3, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            f125003iobyxmoadg.put((Long) it.next(), iwizpuwonk.f62286dxjokdxxww);
        }
        f125004zoijcleaow.put(iwizpuwonk.f62286dxjokdxxww, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f125003iobyxmoadg.put((Long) it2.next(), iwizpuwonk.f62285btonecajqb);
        }
        f125004zoijcleaow.put(iwizpuwonk.f62285btonecajqb, listAsList2);
    }

    public static Long iobyxmoadg(iwizpuwonk iwizpuwonkVar, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f125004zoijcleaow.get(iwizpuwonkVar);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l13 : list) {
            if (supportedProfiles.contains(l13)) {
                return l13;
            }
        }
        return null;
    }

    public static iwizpuwonk zoijcleaow(long j13) {
        return (iwizpuwonk) f125003iobyxmoadg.get(Long.valueOf(j13));
    }
}
