package r01;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {
    static /* synthetic */ void wflxmlrfwp(iobyxmoadg iobyxmoadgVar, ChangeProductParams changeProductParams, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onChangeProductParams");
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        iobyxmoadgVar.istkbnxepw(changeProductParams, z13);
    }

    void hcddaimhww(ChangeProductParams changeProductParams);

    default void istkbnxepw(ChangeProductParams params, boolean z13) {
        zdlpuopuiu.btonecajqb(params, "params");
        if (!((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            zoijcleaow();
            return;
        }
        if (!params.getIsProductAvailableToBuy()) {
            yadqdtsiqt(params);
        } else if (z13) {
            hcddaimhww(params);
        } else {
            ppxfxbqfkf(null);
            hcddaimhww(params);
        }
    }

    void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar);

    esjtqupxsv wkgbmnqykc();

    void yadqdtsiqt(ChangeProductParams changeProductParams);

    void zoijcleaow();
}
