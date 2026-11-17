package y70;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.domain.feature.qrcode.store.QrCodeButton;
import ru.myspar.domain.feature.qrcode.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final void vipkmwdibw() {
        QrCodeButton button = ((State) jlmebxxoox()).getButton();
        if (button != null) {
            NavigationPayload navigationPayloadWkgbmnqykc = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(button.getNavLink()).wkgbmnqykc();
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : button.getReference(), (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : null, (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false));
        }
        crxdokpmqz(eablkybsjg.zoijcleaow.f124025iobyxmoadg);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f124029iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f124024iobyxmoadg);
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.zoijcleaow.f124030iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            vipkmwdibw();
        }
    }
}
