package wo0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww implements gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pt0.iobyxmoadg f120308iobyxmoadg;

    public dxjokdxxww(pt0.iobyxmoadg state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this.f120308iobyxmoadg = state;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxjokdxxww) && zdlpuopuiu.eablkybsjg(this.f120308iobyxmoadg, ((dxjokdxxww) obj).f120308iobyxmoadg);
    }

    @Override // wo0.gtknphoqwx
    public Object getId() {
        return "CartPromoCodeUiModel";
    }

    @Override // wo0.gtknphoqwx
    public draadjrbmk getType() {
        return draadjrbmk.PROMOCODE;
    }

    public int hashCode() {
        return this.f120308iobyxmoadg.hashCode();
    }

    public final pt0.iobyxmoadg iobyxmoadg() {
        return this.f120308iobyxmoadg;
    }

    public String toString() {
        return "CartPromoCodeUiModel(state=" + this.f120308iobyxmoadg + ")";
    }
}
