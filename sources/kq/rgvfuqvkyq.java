package kq;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class rgvfuqvkyq implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f60382iobyxmoadg;

    public rgvfuqvkyq(List info) {
        zdlpuopuiu.btonecajqb(info, "info");
        this.f60382iobyxmoadg = info;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgvfuqvkyq) && zdlpuopuiu.eablkybsjg(this.f60382iobyxmoadg, ((rgvfuqvkyq) obj).f60382iobyxmoadg);
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return "OrderTotalInfoUiModel";
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.CART_INFO;
    }

    public int hashCode() {
        return this.f60382iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f60382iobyxmoadg;
    }

    public String toString() {
        return "OrderTotalInfoUiModel(info=" + this.f60382iobyxmoadg + ")";
    }
}
