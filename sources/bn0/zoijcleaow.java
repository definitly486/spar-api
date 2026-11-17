package bn0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pn0.lqeggnwhkg;
import ru.myspar.proloyalty.auth.api.model.EmailVerifyDialogArgs;
import ru.myspar.proloyalty.auth.impl.presentation.deleteaccountfinish.DeleteAccountFinishFragment;
import ru.myspar.proloyalty.auth.impl.presentation.emailverify.EmailVerifyDialogFragment;
import ru.myspar.proloyalty.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements an0.iobyxmoadg {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment lqeggnwhkg(jyumaefscl it) {
        zdlpuopuiu.btonecajqb(it, "it");
        return DeleteAccountFinishFragment.INSTANCE.iobyxmoadg();
    }

    @Override // an0.iobyxmoadg
    public m9.wkgbmnqykc eablkybsjg() {
        return ru.myspar.proloyalty.auth.impl.presentation.authorization.zoijcleaow.zoijcleaow();
    }

    @Override // an0.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg() {
        return ru.myspar.proloyalty.auth.impl.presentation.deleteaccount.zoijcleaow.zoijcleaow();
    }

    @Override // an0.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf() {
        return m9.wkgbmnqykc.iobyxmoadg.zoijcleaow(m9.wkgbmnqykc.f66572zoijcleaow, null, false, new m9.ppxfxbqfkf() { // from class: bn0.iobyxmoadg
            @Override // m9.ppxfxbqfkf
            public final Object iobyxmoadg(Object obj) {
                return zoijcleaow.lqeggnwhkg((jyumaefscl) obj);
            }
        }, 3, null);
    }

    @Override // an0.iobyxmoadg
    public BaseBottomSheetDialogFragment wkgbmnqykc(EmailVerifyDialogArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return EmailVerifyDialogFragment.INSTANCE.iobyxmoadg(args);
    }

    @Override // an0.iobyxmoadg
    public xr0.iobyxmoadg zoijcleaow(Context context, tg.iobyxmoadg onDelete) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onDelete, "onDelete");
        return new lqeggnwhkg(context, onDelete);
    }
}
