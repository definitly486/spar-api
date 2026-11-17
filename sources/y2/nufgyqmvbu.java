package y2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class nufgyqmvbu {
    public static com.google.common.collect.zdlpuopuiu iobyxmoadg(xa.eablkybsjg eablkybsjgVar, List list) {
        com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = com.google.common.collect.zdlpuopuiu.kcexrzcfyt();
        for (int i13 = 0; i13 < list.size(); i13++) {
            iobyxmoadgVarKcexrzcfyt.iobyxmoadg(eablkybsjgVar.apply((Bundle) iobyxmoadg.eablkybsjg((Bundle) list.get(i13))));
        }
        return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
    }

    public static ArrayList zoijcleaow(Collection collection, xa.eablkybsjg eablkybsjgVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) eablkybsjgVar.apply(it.next()));
        }
        return arrayList;
    }
}
