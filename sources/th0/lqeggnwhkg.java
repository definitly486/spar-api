package th0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.special_products.api.models.Action;
import ru.myspar.core.domain.models.product.Product;
import ru.myspar.core.models.delivery.DeliveryCode;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f110531zoijcleaow = pb0.zoijcleaow.f76305eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pb0.zoijcleaow f110532iobyxmoadg;

    public lqeggnwhkg(pb0.zoijcleaow productToUiModelMapper) {
        zdlpuopuiu.btonecajqb(productToUiModelMapper, "productToUiModelMapper");
        this.f110532iobyxmoadg = productToUiModelMapper;
    }

    public final wh0.wkgbmnqykc iobyxmoadg(String reference, String title, Action action, List specialProducts, wh0.wkgbmnqykc.iobyxmoadg type, String externalCode, List list, DeliveryCode deliveryCode, boolean z13, boolean z14, boolean z15, rgvfuqvkyq getStringRes) {
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
            arrayList.add(this.f110532iobyxmoadg.ppxfxbqfkf((Product) it.next(), list, deliveryCode, z13, z14, z15, (64 & 64) != 0 ? null : null, getStringRes));
        }
        return new wh0.wkgbmnqykc(title, reference, arrayList, type, action, externalCode);
    }
}
