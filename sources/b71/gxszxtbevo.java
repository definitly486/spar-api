package b71;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow f15438iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f15439zoijcleaow;

    public gxszxtbevo(ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow content, boolean z13) {
        zdlpuopuiu.btonecajqb(content, "content");
        this.f15438iobyxmoadg = content;
        this.f15439zoijcleaow = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f15438iobyxmoadg, gxszxtbevoVar.f15438iobyxmoadg) && this.f15439zoijcleaow == gxszxtbevoVar.f15439zoijcleaow;
    }

    public int hashCode() {
        return (this.f15438iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f15439zoijcleaow);
    }

    public final ru.myspar.proloyalty.dynamic_qr.impl.presentation.zoijcleaow iobyxmoadg() {
        return this.f15438iobyxmoadg;
    }

    public String toString() {
        return "Model(content=" + this.f15438iobyxmoadg + ", hasActiveDiscount=" + this.f15439zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f15439zoijcleaow;
    }
}
