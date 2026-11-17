package ba;

import android.util.SparseArray;
import java.util.HashMap;
import o9.gxszxtbevo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static SparseArray f15579iobyxmoadg = new SparseArray();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static HashMap f15580zoijcleaow;

    static {
        HashMap map = new HashMap();
        f15580zoijcleaow = map;
        map.put(gxszxtbevo.DEFAULT, 0);
        f15580zoijcleaow.put(gxszxtbevo.VERY_LOW, 1);
        f15580zoijcleaow.put(gxszxtbevo.HIGHEST, 2);
        for (gxszxtbevo gxszxtbevoVar : f15580zoijcleaow.keySet()) {
            f15579iobyxmoadg.append(((Integer) f15580zoijcleaow.get(gxszxtbevoVar)).intValue(), gxszxtbevoVar);
        }
    }

    public static int iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        Integer num = (Integer) f15580zoijcleaow.get(gxszxtbevoVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + gxszxtbevoVar);
    }

    public static gxszxtbevo zoijcleaow(int i13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) f15579iobyxmoadg.get(i13);
        if (gxszxtbevoVar != null) {
            return gxszxtbevoVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i13);
    }
}
