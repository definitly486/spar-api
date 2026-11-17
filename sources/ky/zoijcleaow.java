package ky;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import oy.lqeggnwhkg;
import oz.ComboSetDto;
import oz.ComboSetProductItemDto;
import ru.myspar.core.domain.models.comboset.ComboSet;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final ComboSet iobyxmoadg(ComboSetDto comboSetDto, lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(comboSetDto, "<this>");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        String id2 = comboSetDto.getId();
        String name = comboSetDto.getName();
        double price = comboSetDto.getPrice();
        List items = comboSetDto.getProductsFirst().getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((ComboSetProductItemDto) it.next(), measureTypeModelMapper));
        }
        String message = comboSetDto.getProductsFirst().getMessage();
        List items2 = comboSetDto.getProductsSecond().getItems();
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items2, 10));
        Iterator it2 = items2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zoijcleaow((ComboSetProductItemDto) it2.next(), measureTypeModelMapper));
        }
        return new ComboSet(id2, name, price, arrayList, message, arrayList2, comboSetDto.getProductsSecond().getMessage());
    }

    public static final ComboSetProduct zoijcleaow(ComboSetProductItemDto comboSetProductItemDto, lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(comboSetProductItemDto, "<this>");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        return new ComboSetProduct(comboSetProductItemDto.getId(), comboSetProductItemDto.getArticle(), comboSetProductItemDto.getName(), comboSetProductItemDto.getPrice(), measureTypeModelMapper.iobyxmoadg(comboSetProductItemDto.getMeasure()), comboSetProductItemDto.getImageUrl());
    }
}
