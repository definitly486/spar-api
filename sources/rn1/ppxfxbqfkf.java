package rn1;

import kotlin.jvm.internal.zdlpuopuiu;
import q11.nufgyqmvbu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;
import vk0.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    public static final String iobyxmoadg(double d13, c21.iobyxmoadg measure, q41.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        return resourcesManager.getString(lqeggnwhkg.proloyalty_products_item_amount, measure == c21.iobyxmoadg.AMOUNT ? t11.iobyxmoadg.f109303iobyxmoadg.wflxmlrfwp(Double.valueOf(d13)) : t11.iobyxmoadg.f109303iobyxmoadg.draadjrbmk(d13), nufgyqmvbu.vdvldrhtss(measureTypeUtils, measure, false, 2, null));
    }

    public static final ScanGoProductUiModel ppxfxbqfkf(ScanGoProductModel scanGoProductModel, q41.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        zdlpuopuiu.btonecajqb(scanGoProductModel, "<this>");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        return new ScanGoProductUiModel(scanGoProductModel.getId(), scanGoProductModel.getArticle(), scanGoProductModel.getName(), scanGoProductModel.getPictureUrl(), iobyxmoadg(scanGoProductModel.getQuantity(), scanGoProductModel.getMeasure(), resourcesManager, measureTypeUtils), scanGoProductModel.getQuantity(), zoijcleaow(scanGoProductModel.getPrice(), resourcesManager), zoijcleaow(scanGoProductModel.getPrice() * scanGoProductModel.getQuantity(), resourcesManager), scanGoProductModel.getMeasure(), scanGoProductModel.getMarkCodes());
    }

    public static final String zoijcleaow(double d13, q41.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        return resourcesManager.getString(lqeggnwhkg.proloyalty_approximate_price_format, t11.iobyxmoadg.f109303iobyxmoadg.lqeggnwhkg(Double.valueOf(d13)));
    }
}
