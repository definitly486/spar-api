package v12;

import k30.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import pm.dxjokdxxww;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;
import ru.myspar.scango.impl.screens.amountproduct.partial.presentation.model.ScanGoProductUiModel;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ppxfxbqfkf {
    public static final String iobyxmoadg(double d13, x30.iobyxmoadg measure, d60.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        zdlpuopuiu.btonecajqb(measure, "measure");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        return resourcesManager.getString(dxjokdxxww.products_item_amount, measure == x30.iobyxmoadg.AMOUNT ? n30.iobyxmoadg.f68492iobyxmoadg.wflxmlrfwp(Double.valueOf(d13)) : n30.iobyxmoadg.f68492iobyxmoadg.draadjrbmk(d13), nufgyqmvbu.vdvldrhtss(measureTypeUtils, measure, false, 2, null));
    }

    public static final ScanGoProductUiModel ppxfxbqfkf(ScanGoProductModel scanGoProductModel, d60.iobyxmoadg resourcesManager, nufgyqmvbu measureTypeUtils) {
        zdlpuopuiu.btonecajqb(scanGoProductModel, "<this>");
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        return new ScanGoProductUiModel(scanGoProductModel.getId(), scanGoProductModel.getArticle(), scanGoProductModel.getName(), scanGoProductModel.getPictureUrl(), iobyxmoadg(scanGoProductModel.getQuantity(), scanGoProductModel.getMeasure(), resourcesManager, measureTypeUtils), scanGoProductModel.getQuantity(), zoijcleaow(scanGoProductModel.getPrice(), resourcesManager), zoijcleaow(scanGoProductModel.getPrice() * scanGoProductModel.getQuantity(), resourcesManager), scanGoProductModel.getMeasure(), scanGoProductModel.getMarkCodes());
    }

    public static final String zoijcleaow(double d13, d60.iobyxmoadg resourcesManager) {
        zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        return resourcesManager.getString(dxjokdxxww.approximate_price_format, n30.iobyxmoadg.f68492iobyxmoadg.lqeggnwhkg(Double.valueOf(d13)));
    }
}
