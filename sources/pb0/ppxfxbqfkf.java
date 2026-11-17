package pb0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f76304iobyxmoadg;

    public ppxfxbqfkf(zoijcleaow productUiModelMapper) {
        zdlpuopuiu.btonecajqb(productUiModelMapper, "productUiModelMapper");
        this.f76304iobyxmoadg = productUiModelMapper;
    }

    public final List iobyxmoadg(List list, List list2, DeliveryCode deliveryCode, boolean z13, boolean z14, boolean z15, rgvfuqvkyq getStringRes) {
        ArrayList arrayList;
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        if (list != null) {
            arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f76304iobyxmoadg.ppxfxbqfkf((Product) it.next(), list2, deliveryCode, z13, z14, z15, (64 & 64) != 0 ? null : null, getStringRes));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? jyumaefscl.wflxmlrfwp() : arrayList;
    }
}
