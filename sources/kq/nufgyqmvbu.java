package kq;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vu.iobyxmoadg f60380iobyxmoadg;

    public nufgyqmvbu(vu.iobyxmoadg state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this.f60380iobyxmoadg = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f60380iobyxmoadg, ((nufgyqmvbu) obj).f60380iobyxmoadg);
    }

    @Override // kq.btonecajqb
    public Object getId() {
        return "CartPromoCodeUiModel";
    }

    @Override // kq.btonecajqb
    public gtknphoqwx getType() {
        return gtknphoqwx.PROMOCODE;
    }

    public int hashCode() {
        return this.f60380iobyxmoadg.hashCode();
    }

    public final vu.iobyxmoadg iobyxmoadg() {
        return this.f60380iobyxmoadg;
    }

    public String toString() {
        return "CartPromoCodeUiModel(state=" + this.f60380iobyxmoadg + ")";
    }
}
