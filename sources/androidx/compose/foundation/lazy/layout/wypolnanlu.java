package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wypolnanlu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Comparator f5242iobyxmoadg = new Comparator() { // from class: androidx.compose.foundation.lazy.layout.dsvhmnatus
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return wypolnanlu.zoijcleaow((cllcsxoeiz) obj, (cllcsxoeiz) obj2);
        }
    };

    public static final List ppxfxbqfkf(int i13, int i14, List list, List list2) {
        if (list.isEmpty()) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        List listP = hg.jyumaefscl.p(list2);
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) list.get(i15);
            int index = cllcsxoeizVar.getIndex();
            if (i13 <= index && index <= i14) {
                listP.add(cllcsxoeizVar);
            }
        }
        hg.jyumaefscl.zynmafqrjb(listP, f5242iobyxmoadg);
        return listP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zoijcleaow(cllcsxoeiz cllcsxoeizVar, cllcsxoeiz cllcsxoeizVar2) {
        return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(cllcsxoeizVar.getIndex(), cllcsxoeizVar2.getIndex());
    }
}
