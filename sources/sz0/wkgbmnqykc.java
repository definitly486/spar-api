package sz0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.paging.Paging;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f109033iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f109034ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paging f109035zoijcleaow;

    public wkgbmnqykc(List orders, Paging paging, ppxfxbqfkf orderReferences) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        zdlpuopuiu.btonecajqb(paging, "paging");
        zdlpuopuiu.btonecajqb(orderReferences, "orderReferences");
        this.f109033iobyxmoadg = orders;
        this.f109035zoijcleaow = paging;
        this.f109034ppxfxbqfkf = orderReferences;
    }

    public final List iobyxmoadg() {
        return this.f109033iobyxmoadg;
    }

    public final Paging zoijcleaow() {
        return this.f109035zoijcleaow;
    }
}
