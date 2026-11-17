package hi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {
    public static final List iobyxmoadg(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gi.iobyxmoadg.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (gi.iobyxmoadg.eablkybsjg.ppxfxbqfkf) it.next();
            int iPkzmftpjix = ppxfxbqfkfVar.pkzmftpjix();
            for (int i13 = 0; i13 < iPkzmftpjix; i13++) {
                arrayList.add(ppxfxbqfkfVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
