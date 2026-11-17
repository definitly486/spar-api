package rhgxfdycjh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.mbcevpiqjq;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ppxfxbqfkf(tg.rgvfuqvkyq rgvfuqvkyqVar, lereixgezr lereixgezrVar, Object obj) {
        List list = (List) rgvfuqvkyqVar.invoke(lereixgezrVar, obj);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj2 = list.get(i13);
            if (obj2 != null && !lereixgezrVar.iobyxmoadg(obj2)) {
                throw new IllegalArgumentException(("item at index " + i13 + " can't be saved: " + obj2).toString());
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }

    public static final jyumaefscl zoijcleaow(final tg.rgvfuqvkyq rgvfuqvkyqVar, tg.draadjrbmk draadjrbmkVar) {
        tg.rgvfuqvkyq rgvfuqvkyqVar2 = new tg.rgvfuqvkyq() { // from class: rhgxfdycjh.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return zoijcleaow.ppxfxbqfkf(rgvfuqvkyqVar, (lereixgezr) obj, obj2);
            }
        };
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(draadjrbmkVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return esjtqupxsv.eablkybsjg(rgvfuqvkyqVar2, (tg.draadjrbmk) mbcevpiqjq.eablkybsjg(draadjrbmkVar, 1));
    }
}
