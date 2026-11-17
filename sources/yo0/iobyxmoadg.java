package yo0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.hint.model.Hint;
import zo0.HintDto;
import zo0.HintEntity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final List btonecajqb(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(dxjokdxxww((Hint) it.next()));
        }
        return arrayList;
    }

    private static final HintEntity dxjokdxxww(Hint hint) {
        String id2 = hint.getId();
        String code = hint.getCode();
        String name = hint.getName();
        String color = hint.getColor();
        String colorText = hint.getColorText();
        String pic = hint.getPic();
        String picCode = hint.getPicCode();
        String navlink = hint.getNavlink();
        String reference = hint.getReference();
        Hint.BottomSheetInfo bottomSheetInfo = hint.getBottomSheetInfo();
        return new HintEntity(id2, code, name, color, colorText, pic, picCode, navlink, reference, bottomSheetInfo != null ? ppxfxbqfkf(bottomSheetInfo) : null);
    }

    public static final List eablkybsjg(List list, List productHintCodeList) {
        Object next;
        zdlpuopuiu.btonecajqb(list, "<this>");
        zdlpuopuiu.btonecajqb(productHintCodeList, "productHintCodeList");
        if (productHintCodeList.isEmpty()) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = productHintCodeList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!zdlpuopuiu.eablkybsjg(((HintDto) next).getCode(), str));
            HintDto hintDto = (HintDto) next;
            Hint hintGxszxtbevo = hintDto != null ? gxszxtbevo(hintDto) : null;
            if (hintGxszxtbevo != null) {
                arrayList.add(hintGxszxtbevo);
            }
        }
        return arrayList;
    }

    public static final Hint gxszxtbevo(HintDto hintDto) {
        zdlpuopuiu.btonecajqb(hintDto, "<this>");
        String id2 = hintDto.getId();
        String code = hintDto.getCode();
        String name = hintDto.getName();
        String color = hintDto.getColor();
        String colorText = hintDto.getColorText();
        if (colorText == null) {
            colorText = "";
        }
        String str = colorText;
        String pic = hintDto.getPic();
        String picCode = hintDto.getPicCode();
        String navlink = hintDto.getNavlink();
        String reference = hintDto.getReference();
        HintDto.BottomSheetInfo bottomSheetInfo = hintDto.getBottomSheetInfo();
        return new Hint(id2, code, name, color, str, pic, picCode, navlink, reference, bottomSheetInfo != null ? iobyxmoadg(bottomSheetInfo) : null);
    }

    private static final Hint.BottomSheetInfo iobyxmoadg(HintDto.BottomSheetInfo bottomSheetInfo) {
        String title = bottomSheetInfo.getTitle();
        if (title == null) {
            title = "";
        }
        String description = bottomSheetInfo.getDescription();
        if (description == null) {
            description = "";
        }
        String buttonTitle = bottomSheetInfo.getButtonTitle();
        return new Hint.BottomSheetInfo(title, description, buttonTitle != null ? buttonTitle : "");
    }

    private static final Hint lqeggnwhkg(HintEntity hintEntity) {
        String id2 = hintEntity.getId();
        String code = hintEntity.getCode();
        String name = hintEntity.getName();
        String color = hintEntity.getColor();
        String colorText = hintEntity.getColorText();
        String pic = hintEntity.getPic();
        String picCode = hintEntity.getPicCode();
        String navlink = hintEntity.getNavlink();
        String reference = hintEntity.getReference();
        HintEntity.BottomSheetInfo bottomSheetInfo = hintEntity.getBottomSheetInfo();
        return new Hint(id2, code, name, color, colorText, pic, picCode, navlink, reference, bottomSheetInfo != null ? zoijcleaow(bottomSheetInfo) : null);
    }

    public static final List nufgyqmvbu(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg((HintEntity) it.next()));
        }
        return arrayList;
    }

    private static final HintEntity.BottomSheetInfo ppxfxbqfkf(Hint.BottomSheetInfo bottomSheetInfo) {
        return new HintEntity.BottomSheetInfo(bottomSheetInfo.getTitle(), bottomSheetInfo.getDescription(), bottomSheetInfo.getButtonTitle());
    }

    public static final List wkgbmnqykc(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(gxszxtbevo((HintDto) it.next()));
        }
        return arrayList;
    }

    private static final Hint.BottomSheetInfo zoijcleaow(HintEntity.BottomSheetInfo bottomSheetInfo) {
        return new Hint.BottomSheetInfo(bottomSheetInfo.getTitle(), bottomSheetInfo.getDescription(), bottomSheetInfo.getButtonTitle());
    }
}
