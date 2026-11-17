package hg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class esjtqupxsv extends cqumvgiudr {
    public static int cqumvgiudr(Iterable iterable, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i13;
    }

    public static final Integer esjtqupxsv(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static List lereixgezr(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jyumaefscl.istkbnxepw(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
