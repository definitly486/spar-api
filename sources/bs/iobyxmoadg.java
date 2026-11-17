package bs;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.counter.model.CounterModel;
import ru.myspar.core.domain.models.AvailabilityUiModel;
import ru.myspar.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f16972eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CounterModel f16973iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f16974ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final AvailabilityUiModel f16975wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final MeasureTypeModel f16976zoijcleaow;

    public iobyxmoadg(CounterModel counterModel, MeasureTypeModel measureTypeModel, boolean z13, AvailabilityUiModel availability, boolean z14) {
        zdlpuopuiu.btonecajqb(counterModel, "counterModel");
        zdlpuopuiu.btonecajqb(availability, "availability");
        this.f16973iobyxmoadg = counterModel;
        this.f16976zoijcleaow = measureTypeModel;
        this.f16974ppxfxbqfkf = z13;
        this.f16975wkgbmnqykc = availability;
        this.f16972eablkybsjg = z14;
    }

    public final boolean eablkybsjg() {
        return this.f16972eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f16973iobyxmoadg, iobyxmoadgVar.f16973iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f16976zoijcleaow, iobyxmoadgVar.f16976zoijcleaow) && this.f16974ppxfxbqfkf == iobyxmoadgVar.f16974ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f16975wkgbmnqykc, iobyxmoadgVar.f16975wkgbmnqykc) && this.f16972eablkybsjg == iobyxmoadgVar.f16972eablkybsjg;
    }

    public int hashCode() {
        int iHashCode = this.f16973iobyxmoadg.hashCode() * 31;
        MeasureTypeModel measureTypeModel = this.f16976zoijcleaow;
        return ((((((iHashCode + (measureTypeModel == null ? 0 : measureTypeModel.hashCode())) * 31) + Boolean.hashCode(this.f16974ppxfxbqfkf)) * 31) + this.f16975wkgbmnqykc.hashCode()) * 31) + Boolean.hashCode(this.f16972eablkybsjg);
    }

    public final AvailabilityUiModel iobyxmoadg() {
        return this.f16975wkgbmnqykc;
    }

    public final boolean ppxfxbqfkf() {
        return this.f16974ppxfxbqfkf;
    }

    public String toString() {
        return "BottomBarCounterUiModel(counterModel=" + this.f16973iobyxmoadg + ", measureType=" + this.f16976zoijcleaow + ", editButtonIsVisible=" + this.f16974ppxfxbqfkf + ", availability=" + this.f16975wkgbmnqykc + ", isOnlyPickup=" + this.f16972eablkybsjg + ")";
    }

    public final MeasureTypeModel wkgbmnqykc() {
        return this.f16976zoijcleaow;
    }

    public final CounterModel zoijcleaow() {
        return this.f16973iobyxmoadg;
    }
}
