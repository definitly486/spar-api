package uo;

import android.content.Context;
import kotlin.jvm.internal.zdlpuopuiu;
import np.lqeggnwhkg;
import ru.myspar.auth.api.model.AuthorizationArgs;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.auth.api.model.RegistrationVerificationArgs;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements ro.iobyxmoadg {
    @Override // ro.iobyxmoadg
    public m9.wkgbmnqykc eablkybsjg(AuthorizationArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return ru.myspar.auth.impl.presentation.authorization.zoijcleaow.zoijcleaow(args);
    }

    @Override // ro.iobyxmoadg
    public m9.wkgbmnqykc gxszxtbevo(RegistrationVerificationArgs args) {
        zdlpuopuiu.btonecajqb(args, "args");
        return ru.myspar.auth.impl.presentation.registrationverification.zoijcleaow.zoijcleaow(args);
    }

    @Override // ro.iobyxmoadg
    public m9.wkgbmnqykc iobyxmoadg() {
        return ru.myspar.auth.impl.presentation.deleteaccount.zoijcleaow.zoijcleaow();
    }

    @Override // ro.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf(NonAuthorizedPayload ars) {
        zdlpuopuiu.btonecajqb(ars, "ars");
        return ru.myspar.auth.impl.presentation.nonauthorized.zoijcleaow.zoijcleaow(ars);
    }

    @Override // ro.iobyxmoadg
    public dt.iobyxmoadg zoijcleaow(Context context, tg.iobyxmoadg onDelete) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onDelete, "onDelete");
        return new lqeggnwhkg(context, onDelete);
    }
}
