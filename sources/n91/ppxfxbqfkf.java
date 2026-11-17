package n91;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements draadjrbmk {
    private final kt0.iobyxmoadg iobyxmoadg(ComboSet comboSet, ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2) {
        String id2 = comboSet.getId();
        String name = comboSet.getName();
        double price = comboSet.getPrice();
        kt0.wkgbmnqykc wkgbmnqykcVar = new kt0.wkgbmnqykc(comboSetProduct, comboSetProduct2);
        return new kt0.iobyxmoadg(id2, name, price, comboSet.getSubtitle(), comboSet.getDescription(), comboSet.getIsSelectable(), comboSet.getBackgroundColorHex(), comboSet.getDiscountHintColorHex(), comboSet.getHint(), wkgbmnqykcVar, comboSet.getProductsFirst(), comboSet.getProductsFirstHint(), comboSet.getProductsSecond(), comboSet.getProductsSecondHint());
    }

    public final ComboSet ppxfxbqfkf(kt0.iobyxmoadg comboSetUiModel) {
        zdlpuopuiu.btonecajqb(comboSetUiModel, "comboSetUiModel");
        return new ComboSet(comboSetUiModel.nufgyqmvbu(), comboSetUiModel.vdvldrhtss(), comboSetUiModel.btonecajqb(), comboSetUiModel.rgvfuqvkyq(), comboSetUiModel.wkgbmnqykc(), comboSetUiModel.ppxfxbqfkf(), comboSetUiModel.oxmwwwfdhm(), comboSetUiModel.gxszxtbevo(), comboSetUiModel.lqeggnwhkg(), comboSetUiModel.draadjrbmk(), comboSetUiModel.gtknphoqwx(), comboSetUiModel.ojitshcjhn(), comboSetUiModel.agtfadlqog());
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public List invoke(List comboList) {
        zdlpuopuiu.btonecajqb(comboList, "comboList");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(comboList, 10));
        Iterator it = comboList.iterator();
        while (it.hasNext()) {
            ComboSet comboSet = (ComboSet) it.next();
            arrayList.add(iobyxmoadg(comboSet, comboSet.getProductFirstForDisplay(), comboSet.getProductSecondForDisplay()));
        }
        return arrayList;
    }
}
