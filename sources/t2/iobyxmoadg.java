package t2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C2684iobyxmoadg f109314zoijcleaow = new C2684iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f109315iobyxmoadg = new LinkedHashMap();

    /* JADX INFO: renamed from: t2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2684iobyxmoadg {
        public /* synthetic */ C2684iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2684iobyxmoadg() {
        }
    }

    public interface ppxfxbqfkf {
    }

    public static final class zoijcleaow extends iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final zoijcleaow f109316ppxfxbqfkf = new zoijcleaow();

        private zoijcleaow() {
        }

        @Override // t2.iobyxmoadg
        public Object iobyxmoadg(ppxfxbqfkf key) {
            zdlpuopuiu.btonecajqb(key, "key");
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109315iobyxmoadg, ((iobyxmoadg) obj).f109315iobyxmoadg);
    }

    public int hashCode() {
        return this.f109315iobyxmoadg.hashCode();
    }

    public abstract Object iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar);

    public String toString() {
        return "CreationExtras(extras=" + this.f109315iobyxmoadg + ')';
    }

    public final Map zoijcleaow() {
        return this.f109315iobyxmoadg;
    }
}
