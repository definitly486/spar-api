package x50;

import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f121169iobyxmoadg;

    public iobyxmoadg(Map styles) {
        zdlpuopuiu.btonecajqb(styles, "styles");
        this.f121169iobyxmoadg = styles;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f121169iobyxmoadg, ((iobyxmoadg) obj).f121169iobyxmoadg);
    }

    public int hashCode() {
        return this.f121169iobyxmoadg.hashCode();
    }

    public final Map iobyxmoadg() {
        return this.f121169iobyxmoadg;
    }

    public String toString() {
        return "CustomTextStyles(styles=" + this.f121169iobyxmoadg + ")";
    }
}
