package l00;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductAnalyticParams;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lo.zoijcleaow f61290iobyxmoadg;

    public lqeggnwhkg(lo.zoijcleaow analyticsTracker) {
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f61290iobyxmoadg = analyticsTracker;
    }

    private final void zoijcleaow(m00.iobyxmoadg iobyxmoadgVar, List list) {
        Object next;
        mo.iobyxmoadg c1521ppxfxbqfkf;
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
        } while (!zdlpuopuiu.eablkybsjg(((u00.iobyxmoadg) next).iobyxmoadg(), iobyxmoadgVar.gxszxtbevo()));
        u00.iobyxmoadg iobyxmoadgVar2 = (u00.iobyxmoadg) next;
        no.iobyxmoadg iobyxmoadgVar3 = new no.iobyxmoadg(changeProductAnalyticParamsWkgbmnqykc.getAnalyticsPage(), changeProductAnalyticParamsWkgbmnqykc.getLocation(), new AnalyticElement.ChangeItemElement(iobyxmoadgVar.eablkybsjg(), changeProductAnalyticParamsWkgbmnqykc.getProductName(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.lqeggnwhkg().getValue()));
        if (iobyxmoadgVar2 == null) {
            c1521ppxfxbqfkf = new no.ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar3);
        } else {
            c1521ppxfxbqfkf = iobyxmoadgVar.nufgyqmvbu() == 0.0d ? new no.ppxfxbqfkf.C1521ppxfxbqfkf(iobyxmoadgVar3) : new no.ppxfxbqfkf.zoijcleaow(iobyxmoadgVar3);
        }
        this.f61290iobyxmoadg.ppxfxbqfkf(c1521ppxfxbqfkf);
    }

    public final void iobyxmoadg(List sendProducts, List cachedProducts) {
        zdlpuopuiu.btonecajqb(sendProducts, "sendProducts");
        zdlpuopuiu.btonecajqb(cachedProducts, "cachedProducts");
        Iterator it = sendProducts.iterator();
        while (it.hasNext()) {
            zoijcleaow((m00.iobyxmoadg) it.next(), cachedProducts);
        }
    }
}
