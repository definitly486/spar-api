package dz0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final vm0.zoijcleaow f30043iobyxmoadg;

    public lqeggnwhkg(vm0.zoijcleaow analyticsTracker) {
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f30043iobyxmoadg = analyticsTracker;
    }

    private final void zoijcleaow(ez0.iobyxmoadg iobyxmoadgVar, List list) {
        Object next;
        wm0.iobyxmoadg c3094ppxfxbqfkf;
        ChangeProductAnalyticParams changeProductAnalyticParamsWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        if (changeProductAnalyticParamsWkgbmnqykc == null) {
            return;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((lz0.iobyxmoadg) next).iobyxmoadg(), iobyxmoadgVar.gxszxtbevo()));
        lz0.iobyxmoadg iobyxmoadgVar2 = (lz0.iobyxmoadg) next;
        xm0.iobyxmoadg iobyxmoadgVar3 = new xm0.iobyxmoadg(changeProductAnalyticParamsWkgbmnqykc.getAnalyticsPage(), changeProductAnalyticParamsWkgbmnqykc.getLocation(), new AnalyticElement.ChangeItemElement(iobyxmoadgVar.eablkybsjg(), changeProductAnalyticParamsWkgbmnqykc.getProductName(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.lqeggnwhkg().getValue()));
        if (iobyxmoadgVar2 == null) {
            c3094ppxfxbqfkf = new xm0.ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar3);
        } else {
            c3094ppxfxbqfkf = iobyxmoadgVar.nufgyqmvbu() == 0.0d ? new xm0.ppxfxbqfkf.C3094ppxfxbqfkf(iobyxmoadgVar3) : new xm0.ppxfxbqfkf.zoijcleaow(iobyxmoadgVar3);
        }
        this.f30043iobyxmoadg.wkgbmnqykc(c3094ppxfxbqfkf);
    }

    public final void iobyxmoadg(List sendProducts, List cachedProducts) {
        zdlpuopuiu.btonecajqb(sendProducts, "sendProducts");
        zdlpuopuiu.btonecajqb(cachedProducts, "cachedProducts");
        Iterator it = sendProducts.iterator();
        while (it.hasNext()) {
            zoijcleaow((ez0.iobyxmoadg) it.next(), cachedProducts);
        }
    }
}
