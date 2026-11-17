package hg;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zynmafqrjb extends pmvmpeiblj {
    public static void pmvmpeiblj(List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void zynmafqrjb(List list, Comparator comparator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(list, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
