package i7;

import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppxfxbqfkf {
    public static final List iobyxmoadg(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(hg.jyumaefscl.opjhrmiecq(list));
        }
        return hg.jyumaefscl.wflxmlrfwp();
    }

    public static final Map zoijcleaow(Map map) {
        int size = map.size();
        if (size == 0) {
            return tzroggbefp.dxjokdxxww();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) hg.jyumaefscl.bfopjjpdmp(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
