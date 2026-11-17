package oy;

import fz.RateVariantDto;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gtknphoqwx {
    public static final RateVariantDto iobyxmoadg(m10.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        String strWkgbmnqykc = iobyxmoadgVar.zoijcleaow().wkgbmnqykc();
        DeliveryCode deliveryCodeIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        return new RateVariantDto(strWkgbmnqykc, deliveryCodeIobyxmoadg != null ? deliveryCodeIobyxmoadg.getServerCode() : null);
    }
}
