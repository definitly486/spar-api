package u51;

import androidx.fragment.app.FragmentManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment;
import ru.myspar.proloyalty.core.base.api.dialog.BaseDialogFragment;
import v51.ppxfxbqfkf;
import v51.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, FragmentManager fragmentManager) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2881ppxfxbqfkf) {
            ((ppxfxbqfkf.C2881ppxfxbqfkf) ppxfxbqfkfVar).wkgbmnqykc().show();
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).wkgbmnqykc().wwaezpbzkn(fragmentManager);
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).wkgbmnqykc().ntlheqmsrt(fragmentManager);
        }
    }

    public static final void ppxfxbqfkf(BaseDialogFragment baseDialogFragment, iobyxmoadg dialogManager, wkgbmnqykc screenKey) {
        zdlpuopuiu.btonecajqb(baseDialogFragment, "<this>");
        zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        zdlpuopuiu.btonecajqb(screenKey, "screenKey");
        dialogManager.iobyxmoadg(new v51.iobyxmoadg.zoijcleaow(screenKey, new ppxfxbqfkf.zoijcleaow(baseDialogFragment)));
    }

    public static final void wkgbmnqykc(xr0.iobyxmoadg iobyxmoadgVar, iobyxmoadg dialogManager, wkgbmnqykc screenKey) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        zdlpuopuiu.btonecajqb(screenKey, "screenKey");
        dialogManager.iobyxmoadg(new v51.iobyxmoadg.zoijcleaow(screenKey, new ppxfxbqfkf.C2881ppxfxbqfkf(iobyxmoadgVar)));
    }

    public static final void zoijcleaow(FixedBottomSheetFragment fixedBottomSheetFragment, iobyxmoadg dialogManager, wkgbmnqykc screenKey) {
        zdlpuopuiu.btonecajqb(fixedBottomSheetFragment, "<this>");
        zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        zdlpuopuiu.btonecajqb(screenKey, "screenKey");
        dialogManager.iobyxmoadg(new v51.iobyxmoadg.zoijcleaow(screenKey, new ppxfxbqfkf.iobyxmoadg(fixedBottomSheetFragment)));
    }
}
