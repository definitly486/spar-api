package kt0;

import hg.jyumaefscl;
import java.util.List;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboHint;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    private static final ComboHint iobyxmoadg() {
        return new ComboHint("select", "на выбор", "#15B742");
    }

    public static final iobyxmoadg ppxfxbqfkf() {
        ComboHint comboHintIobyxmoadg = iobyxmoadg();
        wkgbmnqykc wkgbmnqykcVarIobyxmoadg = eablkybsjg.iobyxmoadg();
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        for (int i13 = 0; i13 < 5; i13++) {
            listPpxfxbqfkf.add(nz0.iobyxmoadg.iobyxmoadg());
        }
        List listIobyxmoadg = jyumaefscl.iobyxmoadg(listPpxfxbqfkf);
        List listPpxfxbqfkf2 = jyumaefscl.ppxfxbqfkf();
        for (int i14 = 0; i14 < 5; i14++) {
            listPpxfxbqfkf2.add(nz0.iobyxmoadg.iobyxmoadg());
        }
        return new iobyxmoadg("", "Рыба + сыр", 44.0d, "Классическое сочетание к вину", "Идеальная закуска для вечера: нежная рыба и пикантный сыр", true, "#F3FFDE", "#DC3545", comboHintIobyxmoadg, wkgbmnqykcVarIobyxmoadg, listIobyxmoadg, iobyxmoadg(), jyumaefscl.iobyxmoadg(listPpxfxbqfkf2), zoijcleaow());
    }

    private static final ComboHint zoijcleaow() {
        return new ComboHint("single", "Уже в наборе", "#B327AC");
    }
}
