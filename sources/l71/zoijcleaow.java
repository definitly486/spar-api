package l71;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.echecks.impl.dialog.presentation.EchecksDialogFragment;
import ru.myspar.proloyalty.echecks.impl.screen.presentation.EchecksFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements k71.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment wkgbmnqykc(jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return EchecksFragment.INSTANCE.iobyxmoadg();
    }

    @Override // k71.iobyxmoadg
    public BaseMviBottomSheetDialogFragment iobyxmoadg() {
        return EchecksDialogFragment.INSTANCE.iobyxmoadg();
    }

    @Override // k71.iobyxmoadg
    public m9.wkgbmnqykc zoijcleaow() {
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: l71.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.wkgbmnqykc((jyumaefscl) obj);
            }
        }, 3, null);
    }
}
