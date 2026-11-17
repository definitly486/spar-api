package ye1;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.components.special_products.api.models.Action;
import ru.myspar.proloyalty.core.domain.models.product.Product;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f124654zoijcleaow = o91.zoijcleaow.f72372eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o91.zoijcleaow f124655iobyxmoadg;

    public lqeggnwhkg(o91.zoijcleaow productToUiModelMapper) {
        zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        this.f124655iobyxmoadg = productToUiModelMapper;
    }

    public final bf1.zoijcleaow iobyxmoadg(String reference, String title, Action action, List specialProducts, bf1.zoijcleaow.iobyxmoadg type, String externalCode, List list, DeliveryCode deliveryCode, boolean z13, boolean z14, boolean z15, rgvfuqvkyq getStringRes) {
        zdlpuopuiu.btonecajqb(reference, "reference");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(action, "action");
        zdlpuopuiu.btonecajqb(specialProducts, "specialProducts");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(externalCode, "externalCode");
        zdlpuopuiu.btonecajqb(getStringRes, "getStringRes");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(specialProducts, 10));
        Iterator it = specialProducts.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f124655iobyxmoadg.ppxfxbqfkf((Product) it.next(), list, deliveryCode, z13, z14, z15, (64 & 64) != 0 ? null : null, getStringRes));
        }
        return new bf1.zoijcleaow(title, reference, arrayList, type, action, externalCode);
    }
}
