package f70;

import androidx.fragment.app.FragmentManager;
import g70.ppxfxbqfkf;
import g70.wkgbmnqykc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment;
import ru.myspar.core.base.api.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final void iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, FragmentManager fragmentManager) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C0822ppxfxbqfkf) {
            ((ppxfxbqfkf.C0822ppxfxbqfkf) ppxfxbqfkfVar).wkgbmnqykc().show();
        } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).wkgbmnqykc().wwaezpbzkn(fragmentManager);
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ppxfxbqfkf.iobyxmoadg) ppxfxbqfkfVar).wkgbmnqykc().ntlheqmsrt(fragmentManager);
        }
    }

    public static final void ppxfxbqfkf(FixedBottomSheetFragment fixedBottomSheetFragment, iobyxmoadg dialogManager, wkgbmnqykc screenKey) {
        zdlpuopuiu.btonecajqb(fixedBottomSheetFragment, "<this>");
        zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        zdlpuopuiu.btonecajqb(screenKey, "screenKey");
        dialogManager.iobyxmoadg(new g70.iobyxmoadg.zoijcleaow(screenKey, new ppxfxbqfkf.iobyxmoadg(fixedBottomSheetFragment)));
    }

    public static final void wkgbmnqykc(BaseDialogFragment baseDialogFragment, iobyxmoadg dialogManager, wkgbmnqykc screenKey) {
        zdlpuopuiu.btonecajqb(baseDialogFragment, "<this>");
        zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        zdlpuopuiu.btonecajqb(screenKey, "screenKey");
        dialogManager.iobyxmoadg(new g70.iobyxmoadg.zoijcleaow(screenKey, new ppxfxbqfkf.zoijcleaow(baseDialogFragment)));
    }

    public static final void zoijcleaow(dt.iobyxmoadg iobyxmoadgVar, iobyxmoadg dialogManager, wkgbmnqykc screenKey) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(dialogManager, "dialogManager");
        zdlpuopuiu.btonecajqb(screenKey, "screenKey");
        dialogManager.iobyxmoadg(new g70.iobyxmoadg.zoijcleaow(screenKey, new ppxfxbqfkf.C0822ppxfxbqfkf(iobyxmoadgVar)));
    }
}
