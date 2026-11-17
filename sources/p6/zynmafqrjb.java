package p6;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface zynmafqrjb {
    List iobyxmoadg(String str);

    void ppxfxbqfkf(String str);

    default void wkgbmnqykc(String id2, Set tags) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(id2, "id");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            zoijcleaow(new pmvmpeiblj((String) it.next(), id2));
        }
    }

    void zoijcleaow(pmvmpeiblj pmvmpeibljVar);
}
