package k41;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f53767iobyxmoadg;

    public iobyxmoadg(Map styles) {
        zdlpuopuiu.btonecajqb(styles, "styles");
        this.f53767iobyxmoadg = styles;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f53767iobyxmoadg, ((iobyxmoadg) obj).f53767iobyxmoadg);
    }

    public int hashCode() {
        return this.f53767iobyxmoadg.hashCode();
    }

    public final Map iobyxmoadg() {
        return this.f53767iobyxmoadg;
    }

    public String toString() {
        return "CustomTextStyles(styles=" + this.f53767iobyxmoadg + ")";
    }
}
