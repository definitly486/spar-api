package l81;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.favorites.impl.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f61901eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f61902gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f61903iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f61904lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f61905ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final State.zoijcleaow f61906wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f61907zoijcleaow;

    public nufgyqmvbu(List items, List filters, boolean z13, State.zoijcleaow warningState, boolean z14, boolean z15, int i13) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(filters, "filters");
        zdlpuopuiu.btonecajqb(warningState, "warningState");
        this.f61903iobyxmoadg = items;
        this.f61907zoijcleaow = filters;
        this.f61905ppxfxbqfkf = z13;
        this.f61906wkgbmnqykc = warningState;
        this.f61901eablkybsjg = z14;
        this.f61902gxszxtbevo = z15;
        this.f61904lqeggnwhkg = i13;
    }

    public final boolean eablkybsjg() {
        return this.f61905ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f61903iobyxmoadg, nufgyqmvbuVar.f61903iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61907zoijcleaow, nufgyqmvbuVar.f61907zoijcleaow) && this.f61905ppxfxbqfkf == nufgyqmvbuVar.f61905ppxfxbqfkf && this.f61906wkgbmnqykc == nufgyqmvbuVar.f61906wkgbmnqykc && this.f61901eablkybsjg == nufgyqmvbuVar.f61901eablkybsjg && this.f61902gxszxtbevo == nufgyqmvbuVar.f61902gxszxtbevo && this.f61904lqeggnwhkg == nufgyqmvbuVar.f61904lqeggnwhkg;
    }

    public final boolean gxszxtbevo() {
        return this.f61902gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((((this.f61903iobyxmoadg.hashCode() * 31) + this.f61907zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f61905ppxfxbqfkf)) * 31) + this.f61906wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f61901eablkybsjg)) * 31) + Boolean.hashCode(this.f61902gxszxtbevo)) * 31) + Integer.hashCode(this.f61904lqeggnwhkg);
    }

    public final int iobyxmoadg() {
        return this.f61904lqeggnwhkg;
    }

    public final boolean lqeggnwhkg() {
        return this.f61901eablkybsjg;
    }

    public final List ppxfxbqfkf() {
        return this.f61903iobyxmoadg;
    }

    public String toString() {
        return "Model(items=" + this.f61903iobyxmoadg + ", filters=" + this.f61907zoijcleaow + ", isFiltersVisible=" + this.f61905ppxfxbqfkf + ", warningState=" + this.f61906wkgbmnqykc + ", isRefreshLayoutLoading=" + this.f61901eablkybsjg + ", isFullScreenLoading=" + this.f61902gxszxtbevo + ", currentPage=" + this.f61904lqeggnwhkg + ")";
    }

    public final State.zoijcleaow wkgbmnqykc() {
        return this.f61906wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f61907zoijcleaow;
    }
}
