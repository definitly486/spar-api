package py;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jz.CardDto;
import jz.CardListDto;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.core.domain.models.savedcards.Card;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final List iobyxmoadg(CardListDto cardListDto) {
        zdlpuopuiu.btonecajqb(cardListDto, "<this>");
        List items = cardListDto.getItems();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(zoijcleaow((CardDto) it.next()));
        }
        return arrayList;
    }

    public static final Card zoijcleaow(CardDto cardDto) {
        zdlpuopuiu.btonecajqb(cardDto, "<this>");
        String id2 = cardDto.getId();
        String strHcddaimhww = kcexrzcfyt.hcddaimhww(cardDto.getCardNumberMask(), "X", "", false, 4, null);
        String date = cardDto.getDate();
        String icon = cardDto.getIcon();
        if (icon == null) {
            icon = "";
        }
        return new Card(id2, strHcddaimhww, date, icon);
    }
}
