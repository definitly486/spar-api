package n91;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final ColorsUiModel.Hex iobyxmoadg(ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(colorsModel, "<this>");
        return new ColorsUiModel.Hex(zoijcleaow(colorsModel.getLight()), zoijcleaow(colorsModel.getDark()));
    }

    private static final ColorsUiModel.Hex.Tints zoijcleaow(ColorsModel.TintsModel tintsModel) {
        return new ColorsUiModel.Hex.Tints(tintsModel.getPrimary(), tintsModel.getPrimaryDisabled(), tintsModel.getOnPrimary(), tintsModel.getSecondary(), tintsModel.getSecondaryDisabled(), tintsModel.getFeedTitle(), tintsModel.getFeedBackground());
    }
}
