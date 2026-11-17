package cg0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.main_activity.impl.models.PopupTypesUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    private static final PopupTypesUiModel.PurchaseRating iobyxmoadg(j10.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        return new PopupTypesUiModel.PurchaseRating(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg());
    }

    public static final PopupTypesUiModel zoijcleaow(j10.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof j10.zoijcleaow.iobyxmoadg) {
            return iobyxmoadg((j10.zoijcleaow.iobyxmoadg) zoijcleaowVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
