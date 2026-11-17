package e7;

import hg.tzroggbefp;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f30744iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f30743zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final oxmwwwfdhm f30742ppxfxbqfkf = new oxmwwwfdhm(tzroggbefp.dxjokdxxww());

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final oxmwwwfdhm iobyxmoadg(Map map) {
            return new oxmwwwfdhm(i7.ppxfxbqfkf.zoijcleaow(map), null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ oxmwwwfdhm(Map map, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxmwwwfdhm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f30744iobyxmoadg, ((oxmwwwfdhm) obj).f30744iobyxmoadg);
    }

    public int hashCode() {
        return this.f30744iobyxmoadg.hashCode();
    }

    public final Map iobyxmoadg() {
        return this.f30744iobyxmoadg;
    }

    public String toString() {
        return "Tags(tags=" + this.f30744iobyxmoadg + ')';
    }

    private oxmwwwfdhm(Map map) {
        this.f30744iobyxmoadg = map;
    }
}
