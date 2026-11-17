package aj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jh.iozdgvuglv;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iozdgvuglv f2068iobyxmoadg = new iozdgvuglv("KotlinTypeRefiner");

    public static final iozdgvuglv iobyxmoadg() {
        return f2068iobyxmoadg;
    }

    public static final List zoijcleaow(lqeggnwhkg lqeggnwhkgVar, Iterable types) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(types, "types");
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkgVar.iobyxmoadg((kegysxyocb) it.next()));
        }
        return arrayList;
    }
}
