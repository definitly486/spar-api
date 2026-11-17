package ha0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.favorites.impl.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f39934eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f39935gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f39936iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f39937lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f39938ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final State.zoijcleaow f39939wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f39940zoijcleaow;

    public dxjokdxxww(List items, List filters, boolean z13, State.zoijcleaow warningState, boolean z14, boolean z15, int i13) {
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(filters, "filters");
        zdlpuopuiu.btonecajqb(warningState, "warningState");
        this.f39936iobyxmoadg = items;
        this.f39940zoijcleaow = filters;
        this.f39938ppxfxbqfkf = z13;
        this.f39939wkgbmnqykc = warningState;
        this.f39934eablkybsjg = z14;
        this.f39935gxszxtbevo = z15;
        this.f39937lqeggnwhkg = i13;
    }

    public final boolean eablkybsjg() {
        return this.f39938ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f39936iobyxmoadg, dxjokdxxwwVar.f39936iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39940zoijcleaow, dxjokdxxwwVar.f39940zoijcleaow) && this.f39938ppxfxbqfkf == dxjokdxxwwVar.f39938ppxfxbqfkf && this.f39939wkgbmnqykc == dxjokdxxwwVar.f39939wkgbmnqykc && this.f39934eablkybsjg == dxjokdxxwwVar.f39934eablkybsjg && this.f39935gxszxtbevo == dxjokdxxwwVar.f39935gxszxtbevo && this.f39937lqeggnwhkg == dxjokdxxwwVar.f39937lqeggnwhkg;
    }

    public final boolean gxszxtbevo() {
        return this.f39935gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((((this.f39936iobyxmoadg.hashCode() * 31) + this.f39940zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f39938ppxfxbqfkf)) * 31) + this.f39939wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f39934eablkybsjg)) * 31) + Boolean.hashCode(this.f39935gxszxtbevo)) * 31) + Integer.hashCode(this.f39937lqeggnwhkg);
    }

    public final int iobyxmoadg() {
        return this.f39937lqeggnwhkg;
    }

    public final boolean lqeggnwhkg() {
        return this.f39934eablkybsjg;
    }

    public final List ppxfxbqfkf() {
        return this.f39936iobyxmoadg;
    }

    public String toString() {
        return "Model(items=" + this.f39936iobyxmoadg + ", filters=" + this.f39940zoijcleaow + ", isFiltersVisible=" + this.f39938ppxfxbqfkf + ", warningState=" + this.f39939wkgbmnqykc + ", isRefreshLayoutLoading=" + this.f39934eablkybsjg + ", isFullScreenLoading=" + this.f39935gxszxtbevo + ", currentPage=" + this.f39937lqeggnwhkg + ")";
    }

    public final State.zoijcleaow wkgbmnqykc() {
        return this.f39939wkgbmnqykc;
    }

    public final List zoijcleaow() {
        return this.f39940zoijcleaow;
    }
}
