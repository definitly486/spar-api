package b91;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.models.ComboSetSelectProductUiModel;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements rgvfuqvkyq {
    private final ComboSetSelectProductUiModel zoijcleaow(ComboSetProduct comboSetProduct, String str) {
        return new ComboSetSelectProductUiModel(comboSetProduct, zdlpuopuiu.eablkybsjg(comboSetProduct.getArticle(), str));
    }

    @Override // tg.rgvfuqvkyq
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public List invoke(String selectedProductArticle, List domainModelsList) {
        zdlpuopuiu.btonecajqb(selectedProductArticle, "selectedProductArticle");
        zdlpuopuiu.btonecajqb(domainModelsList, "domainModelsList");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(domainModelsList, 10));
        Iterator it = domainModelsList.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((ComboSetProduct) it.next(), selectedProductArticle));
        }
        return arrayList;
    }
}
