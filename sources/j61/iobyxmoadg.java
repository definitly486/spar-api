package j61;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.domain.feature.qrcode.store.QrCodeButton;
import ru.myspar.proloyalty.domain.feature.qrcode.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final void vipkmwdibw() {
        QrCodeButton button = ((State) jlmebxxoox()).getButton();
        if (button != null) {
            NavigationPayload navigationPayloadLqeggnwhkg = ojitshcjhn.lqeggnwhkg(ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(button.getNavLink()), null, 1, null);
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadLqeggnwhkg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadLqeggnwhkg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadLqeggnwhkg.reference : button.getReference(), (191 & 4) != 0 ? navigationPayloadLqeggnwhkg.title : null, (191 & 8) != 0 ? navigationPayloadLqeggnwhkg.message : null, (191 & 16) != 0 ? navigationPayloadLqeggnwhkg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadLqeggnwhkg.deepLink : null, (191 & 64) != 0 ? navigationPayloadLqeggnwhkg.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadLqeggnwhkg.isPushPayload : false));
        }
        crxdokpmqz(eablkybsjg.zoijcleaow.f50807iobyxmoadg);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f50811iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f50806iobyxmoadg);
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f50812iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            vipkmwdibw();
        }
    }
}
