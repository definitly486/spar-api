package hd1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.main_activity.impl.models.PopupTypesUiModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    private static final PopupTypesUiModel.PurchaseRating iobyxmoadg(zz0.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return new PopupTypesUiModel.PurchaseRating(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg());
    }

    public static final PopupTypesUiModel zoijcleaow(zz0.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zz0.zoijcleaow.iobyxmoadg) {
            return iobyxmoadg((zz0.zoijcleaow.iobyxmoadg) zoijcleaowVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
