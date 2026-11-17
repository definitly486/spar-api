package lb;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f62024zoijcleaow = iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f62025iobyxmoadg;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private HashMap f62026iobyxmoadg = new HashMap();

        public iobyxmoadg iobyxmoadg() {
            if (this.f62026iobyxmoadg == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(Collections.unmodifiableMap(this.f62026iobyxmoadg));
            this.f62026iobyxmoadg = null;
            return iobyxmoadgVar;
        }
    }

    public static zoijcleaow iobyxmoadg() {
        return new zoijcleaow();
    }

    public boolean equals(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return this.f62025iobyxmoadg.equals(((iobyxmoadg) obj).f62025iobyxmoadg);
        }
        return false;
    }

    public int hashCode() {
        return this.f62025iobyxmoadg.hashCode();
    }

    public String toString() {
        return this.f62025iobyxmoadg.toString();
    }

    public Map zoijcleaow() {
        return this.f62025iobyxmoadg;
    }

    private iobyxmoadg(Map map) {
        this.f62025iobyxmoadg = map;
    }
}
