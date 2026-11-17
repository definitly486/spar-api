package istkbnxepw;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class opjhrmiecq {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final opjhrmiecq f49398zoijcleaow = new opjhrmiecq(new ArrayMap());

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final Map f49399iobyxmoadg;

    protected opjhrmiecq(Map map) {
        this.f49399iobyxmoadg = map;
    }

    public static opjhrmiecq iobyxmoadg(Pair pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new opjhrmiecq(arrayMap);
    }

    public static opjhrmiecq ppxfxbqfkf(opjhrmiecq opjhrmiecqVar) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : opjhrmiecqVar.eablkybsjg()) {
            arrayMap.put(str, opjhrmiecqVar.wkgbmnqykc(str));
        }
        return new opjhrmiecq(arrayMap);
    }

    public static opjhrmiecq zoijcleaow() {
        return f49398zoijcleaow;
    }

    public Set eablkybsjg() {
        return this.f49399iobyxmoadg.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }

    public Object wkgbmnqykc(String str) {
        return this.f49399iobyxmoadg.get(str);
    }
}
