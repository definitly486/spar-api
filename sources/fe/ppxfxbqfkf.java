package fe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f33532iobyxmoadg = new HashMap();

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f33533iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final tc.zoijcleaow f33534zoijcleaow;

        public iobyxmoadg(Class cls, tc.zoijcleaow zoijcleaowVar) {
            this.f33533iobyxmoadg = cls;
            this.f33534zoijcleaow = zoijcleaowVar;
        }

        final tc.zoijcleaow iobyxmoadg() {
            return this.f33534zoijcleaow;
        }

        final Class zoijcleaow() {
            return this.f33533iobyxmoadg;
        }
    }

    public ppxfxbqfkf(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) it.next();
            this.f33532iobyxmoadg.put(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
        }
    }
}
