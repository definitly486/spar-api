package ro;

import android.content.Context;
import m9.wkgbmnqykc;
import ru.myspar.auth.api.model.AuthorizationArgs;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import ru.myspar.auth.api.model.RegistrationVerificationArgs;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {
    static /* synthetic */ wkgbmnqykc lqeggnwhkg(iobyxmoadg iobyxmoadgVar, RegistrationVerificationArgs registrationVerificationArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openRegistrationVerificationScreen");
        }
        if ((i13 & 1) != 0) {
            registrationVerificationArgs = new RegistrationVerificationArgs(null, null, 3, null);
        }
        return iobyxmoadgVar.gxszxtbevo(registrationVerificationArgs);
    }

    static /* synthetic */ wkgbmnqykc nufgyqmvbu(iobyxmoadg iobyxmoadgVar, AuthorizationArgs authorizationArgs, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAuthorizationScreen");
        }
        if ((i13 & 1) != 0) {
            authorizationArgs = new AuthorizationArgs(null, null, 3, null);
        }
        return iobyxmoadgVar.eablkybsjg(authorizationArgs);
    }

    static /* synthetic */ wkgbmnqykc wkgbmnqykc(iobyxmoadg iobyxmoadgVar, NonAuthorizedPayload nonAuthorizedPayload, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openNonAuthorizedScreen");
        }
        if ((i13 & 1) != 0) {
            nonAuthorizedPayload = new NonAuthorizedPayload(null, null, 3, null);
        }
        return iobyxmoadgVar.ppxfxbqfkf(nonAuthorizedPayload);
    }

    wkgbmnqykc eablkybsjg(AuthorizationArgs authorizationArgs);

    wkgbmnqykc gxszxtbevo(RegistrationVerificationArgs registrationVerificationArgs);

    wkgbmnqykc iobyxmoadg();

    wkgbmnqykc ppxfxbqfkf(NonAuthorizedPayload nonAuthorizedPayload);

    dt.iobyxmoadg zoijcleaow(Context context, tg.iobyxmoadg iobyxmoadgVar);
}
