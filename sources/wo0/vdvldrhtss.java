package wo0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class vdvldrhtss implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f120331iobyxmoadg;

    public vdvldrhtss(List info) {
        zdlpuopuiu.btonecajqb(info, "info");
        this.f120331iobyxmoadg = info;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdvldrhtss) && zdlpuopuiu.eablkybsjg(this.f120331iobyxmoadg, ((vdvldrhtss) obj).f120331iobyxmoadg);
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return "OrderTotalInfoUiModel";
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.CART_INFO;
    }

    public int hashCode() {
        return this.f120331iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f120331iobyxmoadg;
    }

    public String toString() {
        return "OrderTotalInfoUiModel(info=" + this.f120331iobyxmoadg + ")";
    }
}
