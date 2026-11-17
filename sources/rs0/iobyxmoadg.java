package rs0;

import android.webkit.URLUtil;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import q11.dxjokdxxww;
import ru.myspar.proloyalty.catalog.api.hint.model.Hint;
import ru.myspar.proloyalty.common.view.hint.model.HintBottomSheetInfoUiModel;
import ru.myspar.proloyalty.common.view.hint.model.HintNavLink;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final List eablkybsjg(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(wkgbmnqykc((Hint) it.next()));
        }
        return arrayList;
    }

    private static final HintBottomSheetInfoUiModel gxszxtbevo(Hint.BottomSheetInfo bottomSheetInfo) {
        return new HintBottomSheetInfoUiModel(bottomSheetInfo.getTitle(), bottomSheetInfo.getDescription(), bottomSheetInfo.getButtonTitle());
    }

    private static final HintUiModel.Animation iobyxmoadg(ss0.iobyxmoadg iobyxmoadgVar, Hint hint) {
        String id2 = hint.getId();
        String color = hint.getColor();
        HintNavLink hintNavLinkZoijcleaow = zoijcleaow(hint);
        Hint.BottomSheetInfo bottomSheetInfo = hint.getBottomSheetInfo();
        return new HintUiModel.Animation(iobyxmoadgVar, color, id2, hintNavLinkZoijcleaow, bottomSheetInfo != null ? gxszxtbevo(bottomSheetInfo) : null, null, 32, null);
    }

    private static final HintUiModel.Picture ppxfxbqfkf(String str, Hint hint) {
        String id2 = hint.getId();
        String color = hint.getColor();
        HintNavLink hintNavLinkZoijcleaow = zoijcleaow(hint);
        Hint.BottomSheetInfo bottomSheetInfo = hint.getBottomSheetInfo();
        return new HintUiModel.Picture(str, color, id2, hintNavLinkZoijcleaow, bottomSheetInfo != null ? gxszxtbevo(bottomSheetInfo) : null, null, 32, null);
    }

    public static final HintUiModel wkgbmnqykc(Hint hint) {
        String strWkgbmnqykc;
        Object next;
        zdlpuopuiu.btonecajqb(hint, "<this>");
        String picCode = hint.getPicCode();
        if (picCode != null && (strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(picCode)) != null) {
            Iterator<E> it = ss0.iobyxmoadg.lqeggnwhkg().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((ss0.iobyxmoadg) next).wkgbmnqykc(), strWkgbmnqykc));
            ss0.iobyxmoadg iobyxmoadgVar = (ss0.iobyxmoadg) next;
            if (iobyxmoadgVar != null) {
                return iobyxmoadg(iobyxmoadgVar, hint);
            }
        }
        String pic = hint.getPic();
        if (pic != null) {
            if (kcexrzcfyt.zfvoamnweg(pic) || !URLUtil.isValidUrl(pic)) {
                pic = null;
            }
            if (pic != null) {
                return ppxfxbqfkf(pic, hint);
            }
        }
        String id2 = hint.getId();
        String name = hint.getName();
        String color = hint.getColor();
        String colorText = hint.getColorText();
        HintNavLink hintNavLinkZoijcleaow = zoijcleaow(hint);
        Hint.BottomSheetInfo bottomSheetInfo = hint.getBottomSheetInfo();
        return new HintUiModel.Text(id2, name, color, colorText, null, hintNavLinkZoijcleaow, bottomSheetInfo != null ? gxszxtbevo(bottomSheetInfo) : null, 16, null);
    }

    private static final HintNavLink zoijcleaow(Hint hint) {
        String strWkgbmnqykc;
        String navlink = hint.getNavlink();
        if (navlink == null || (strWkgbmnqykc = dxjokdxxww.wkgbmnqykc(navlink)) == null) {
            return null;
        }
        return new HintNavLink(strWkgbmnqykc, hint.getReference());
    }
}
