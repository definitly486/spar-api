package fx0;

import gy0.ComboSetDto;
import gy0.ComboSetHintDto;
import gy0.ComboSetProductItemDto;
import gy0.GetComboSetResponse;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx0.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboHint;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final ComboSetProduct eablkybsjg(ComboSetProductItemDto comboSetProductItemDto, lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(comboSetProductItemDto, "<this>");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        return new ComboSetProduct(comboSetProductItemDto.getId(), comboSetProductItemDto.getArticle(), comboSetProductItemDto.getName(), comboSetProductItemDto.getPrice(), measureTypeModelMapper.iobyxmoadg(comboSetProductItemDto.getMeasure()), comboSetProductItemDto.getImageUrl());
    }

    private static final ComboHint iobyxmoadg(List list, String str) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (zdlpuopuiu.eablkybsjg(((ComboHint) next).getCode(), str)) {
                return (ComboHint) next;
            }
        }
        next = null;
        return (ComboHint) next;
    }

    private static final ComboHint ppxfxbqfkf(ComboSetHintDto comboSetHintDto) {
        String code = comboSetHintDto.getCode();
        String text = comboSetHintDto.getText();
        if (text == null) {
            text = "";
        }
        return new ComboHint(code, text, comboSetHintDto.getBackgroundColorHex());
    }

    private static final ComboSet wkgbmnqykc(ComboSetDto comboSetDto, lqeggnwhkg lqeggnwhkgVar, List list) {
        String id2 = comboSetDto.getId();
        String name = comboSetDto.getName();
        double price = comboSetDto.getPrice();
        String subtitle = comboSetDto.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        String description = comboSetDto.getDescription();
        if (description == null) {
            description = "";
        }
        String backgroundColorHex = comboSetDto.getBackgroundColorHex();
        if (backgroundColorHex == null) {
            backgroundColorHex = "#F3FFDE";
        }
        Boolean isSelectable = comboSetDto.getIsSelectable();
        boolean zBooleanValue = isSelectable != null ? isSelectable.booleanValue() : true;
        ComboHint comboHintIobyxmoadg = iobyxmoadg(list, "discount");
        String backgroundColorHex2 = comboHintIobyxmoadg != null ? comboHintIobyxmoadg.getBackgroundColorHex() : null;
        if (backgroundColorHex2 == null) {
            backgroundColorHex2 = "";
        }
        String hintCode = comboSetDto.getHintCode();
        ComboHint comboHintIobyxmoadg2 = hintCode != null ? iobyxmoadg(list, hintCode) : null;
        List items = comboSetDto.getProductsFirst().getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(eablkybsjg((ComboSetProductItemDto) it.next(), lqeggnwhkgVar));
        }
        String hintCode2 = comboSetDto.getProductsFirst().getHintCode();
        ComboHint comboHintIobyxmoadg3 = hintCode2 != null ? iobyxmoadg(list, hintCode2) : null;
        List items2 = comboSetDto.getProductsSecond().getItems();
        ComboHint comboHint = comboHintIobyxmoadg3;
        ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items2, 10));
        Iterator it2 = items2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(eablkybsjg((ComboSetProductItemDto) it2.next(), lqeggnwhkgVar));
        }
        String hintCode3 = comboSetDto.getProductsSecond().getHintCode();
        return new ComboSet(id2, name, price, subtitle, description, backgroundColorHex, zBooleanValue, backgroundColorHex2, comboHintIobyxmoadg2, arrayList, comboHint, arrayList2, hintCode3 != null ? iobyxmoadg(list, hintCode3) : null);
    }

    public static final List zoijcleaow(GetComboSetResponse getComboSetResponse, lqeggnwhkg measureTypeModelMapper) {
        zdlpuopuiu.btonecajqb(getComboSetResponse, "<this>");
        zdlpuopuiu.btonecajqb(measureTypeModelMapper, "measureTypeModelMapper");
        List<ComboSetDto> comboSetList = getComboSetResponse.getComboSetList();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(comboSetList, 10));
        for (ComboSetDto comboSetDto : comboSetList) {
            List hints = getComboSetResponse.getHints();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(hints, 10));
            Iterator it = hints.iterator();
            while (it.hasNext()) {
                arrayList2.add(ppxfxbqfkf((ComboSetHintDto) it.next()));
            }
            arrayList.add(wkgbmnqykc(comboSetDto, measureTypeModelMapper, arrayList2));
        }
        return arrayList;
    }
}
