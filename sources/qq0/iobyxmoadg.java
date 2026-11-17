package qq0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CounterModel f80505iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f80506ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AvailabilityUiModel f80507wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final MeasureTypeModel f80508zoijcleaow;

    public iobyxmoadg(CounterModel counterModel, MeasureTypeModel measureTypeModel, boolean z13, AvailabilityUiModel availability) {
        zdlpuopuiu.btonecajqb(counterModel, "counterModel");
        zdlpuopuiu.btonecajqb(availability, "availability");
        this.f80505iobyxmoadg = counterModel;
        this.f80508zoijcleaow = measureTypeModel;
        this.f80506ppxfxbqfkf = z13;
        this.f80507wkgbmnqykc = availability;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f80505iobyxmoadg, iobyxmoadgVar.f80505iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f80508zoijcleaow, iobyxmoadgVar.f80508zoijcleaow) && this.f80506ppxfxbqfkf == iobyxmoadgVar.f80506ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f80507wkgbmnqykc, iobyxmoadgVar.f80507wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = this.f80505iobyxmoadg.hashCode() * 31;
        MeasureTypeModel measureTypeModel = this.f80508zoijcleaow;
        return ((((iHashCode + (measureTypeModel == null ? 0 : measureTypeModel.hashCode())) * 31) + Boolean.hashCode(this.f80506ppxfxbqfkf)) * 31) + this.f80507wkgbmnqykc.hashCode();
    }

    public final AvailabilityUiModel iobyxmoadg() {
        return this.f80507wkgbmnqykc;
    }

    public final boolean ppxfxbqfkf() {
        return this.f80506ppxfxbqfkf;
    }

    public String toString() {
        return "BottomBarCounterUiModel(counterModel=" + this.f80505iobyxmoadg + ", measureType=" + this.f80508zoijcleaow + ", editButtonIsVisible=" + this.f80506ppxfxbqfkf + ", availability=" + this.f80507wkgbmnqykc + ")";
    }

    public final MeasureTypeModel wkgbmnqykc() {
        return this.f80508zoijcleaow;
    }

    public final CounterModel zoijcleaow() {
        return this.f80505iobyxmoadg;
    }
}
