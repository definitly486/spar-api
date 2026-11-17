package c10;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.paging.Paging;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f18478iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f18479ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paging f18480zoijcleaow;

    public zoijcleaow(List orders, Paging paging, wkgbmnqykc orderReferences) {
        zdlpuopuiu.btonecajqb(orders, "orders");
        zdlpuopuiu.btonecajqb(paging, "paging");
        zdlpuopuiu.btonecajqb(orderReferences, "orderReferences");
        this.f18478iobyxmoadg = orders;
        this.f18480zoijcleaow = paging;
        this.f18479ppxfxbqfkf = orderReferences;
    }

    public final List iobyxmoadg() {
        return this.f18478iobyxmoadg;
    }

    public final Paging zoijcleaow() {
        return this.f18480zoijcleaow;
    }
}
