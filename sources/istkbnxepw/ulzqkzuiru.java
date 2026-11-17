package istkbnxepw;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ulzqkzuiru extends opjhrmiecq {
    private ulzqkzuiru(Map map) {
        super(map);
    }

    public static ulzqkzuiru lqeggnwhkg() {
        return new ulzqkzuiru(new ArrayMap());
    }

    public static ulzqkzuiru nufgyqmvbu(opjhrmiecq opjhrmiecqVar) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : opjhrmiecqVar.eablkybsjg()) {
            arrayMap.put(str, opjhrmiecqVar.wkgbmnqykc(str));
        }
        return new ulzqkzuiru(arrayMap);
    }

    public void dxjokdxxww(String str, Object obj) {
        this.f49399iobyxmoadg.put(str, obj);
    }

    public void gxszxtbevo(opjhrmiecq opjhrmiecqVar) {
        Map map;
        Map map2 = this.f49399iobyxmoadg;
        if (map2 == null || (map = opjhrmiecqVar.f49399iobyxmoadg) == null) {
            return;
        }
        map2.putAll(map);
    }
}
