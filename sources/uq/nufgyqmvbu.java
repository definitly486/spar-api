package uq;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HintUiModel f114135iobyxmoadg;

    public nufgyqmvbu(HintUiModel hintUiModel) {
        zdlpuopuiu.btonecajqb(hintUiModel, "hintUiModel");
        this.f114135iobyxmoadg = hintUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f114135iobyxmoadg, ((nufgyqmvbu) obj).f114135iobyxmoadg);
    }

    public int hashCode() {
        return this.f114135iobyxmoadg.hashCode();
    }

    public final HintUiModel iobyxmoadg() {
        return this.f114135iobyxmoadg;
    }

    public String toString() {
        return "Model(hintUiModel=" + this.f114135iobyxmoadg + ")";
    }
}
