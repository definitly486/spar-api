package si;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wflxmlrfwp {
    public static final Set iobyxmoadg(Iterable iterable) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setLqeggnwhkg = ((gtknphoqwx) it.next()).lqeggnwhkg();
            if (setLqeggnwhkg == null) {
                return null;
            }
            hg.jyumaefscl.istkbnxepw(hashSet, setLqeggnwhkg);
        }
        return hashSet;
    }
}
