package c10;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f18457iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f18458ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paging f18459zoijcleaow;

    public eablkybsjg(List orders, Paging paging, wkgbmnqykc orderReferences) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        zdlpuopuiu.btonecajqb(paging, "paging");
        zdlpuopuiu.btonecajqb(orderReferences, "orderReferences");
        this.f18457iobyxmoadg = orders;
        this.f18459zoijcleaow = paging;
        this.f18458ppxfxbqfkf = orderReferences;
    }

    public final wkgbmnqykc iobyxmoadg() {
        return this.f18458ppxfxbqfkf;
    }

    public final Paging ppxfxbqfkf() {
        return this.f18459zoijcleaow;
    }

    public final List zoijcleaow() {
        return this.f18457iobyxmoadg;
    }
}
