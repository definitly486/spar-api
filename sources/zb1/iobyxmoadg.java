package zb1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;
import ru.myspar.proloyalty.legacy.presentation.model.AddProductParams;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {
    void draadjrbmk(Runnable runnable);

    default void esjtqupxsv(AddProductParams params) {
        zdlpuopuiu.btonecajqb(params, "params");
        if (!((Boolean) wkgbmnqykc().zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            zoijcleaow();
        } else {
            draadjrbmk(null);
            mbcevpiqjq(params);
        }
    }

    void mbcevpiqjq(AddProductParams addProductParams);

    esjtqupxsv wkgbmnqykc();

    void zoijcleaow();
}
