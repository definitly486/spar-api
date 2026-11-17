package uj;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dxjokdxxww {
    public static Object iobyxmoadg(Object obj) {
        return obj;
    }

    public static final Object ppxfxbqfkf(Object obj, Object obj2) {
        if (obj == null) {
            return iobyxmoadg(obj2);
        }
        if (obj instanceof ArrayList) {
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(obj2);
            return iobyxmoadg(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return iobyxmoadg(arrayList);
    }

    public static /* synthetic */ Object zoijcleaow(Object obj, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 1) != 0) {
            obj = null;
        }
        return iobyxmoadg(obj);
    }
}
