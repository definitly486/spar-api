package gp0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HintUiModel f38172iobyxmoadg;

    public nufgyqmvbu(HintUiModel hintUiModel) {
        zdlpuopuiu.btonecajqb(hintUiModel, "hintUiModel");
        this.f38172iobyxmoadg = hintUiModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f38172iobyxmoadg, ((nufgyqmvbu) obj).f38172iobyxmoadg);
    }

    public int hashCode() {
        return this.f38172iobyxmoadg.hashCode();
    }

    public final HintUiModel iobyxmoadg() {
        return this.f38172iobyxmoadg;
    }

    public String toString() {
        return "Model(hintUiModel=" + this.f38172iobyxmoadg + ")";
    }
}
