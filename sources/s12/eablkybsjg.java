package s12;

import android.content.Context;
import gg.wwaezpbzkn;
import i22.gxszxtbevo;
import i22.lqeggnwhkg;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements q12.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lqeggnwhkg f105201eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final i22.eablkybsjg f105202iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final i22.wkgbmnqykc f105203ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f105204wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final i22.ppxfxbqfkf f105205zoijcleaow;

    public eablkybsjg(i22.eablkybsjg clearCartAndFinishSessionScanGoUseCase, i22.ppxfxbqfkf checkFirstScanGoLaunchUseCase, i22.wkgbmnqykc checkScanGoSessionExpiredUseCase, gxszxtbevo isScanGoAvailableUseCase, lqeggnwhkg isScanGoSessionRunningUseCase) {
        zdlpuopuiu.btonecajqb(clearCartAndFinishSessionScanGoUseCase, "clearCartAndFinishSessionScanGoUseCase");
        zdlpuopuiu.btonecajqb(checkFirstScanGoLaunchUseCase, "checkFirstScanGoLaunchUseCase");
        zdlpuopuiu.btonecajqb(checkScanGoSessionExpiredUseCase, "checkScanGoSessionExpiredUseCase");
        zdlpuopuiu.btonecajqb(isScanGoAvailableUseCase, "isScanGoAvailableUseCase");
        zdlpuopuiu.btonecajqb(isScanGoSessionRunningUseCase, "isScanGoSessionRunningUseCase");
        this.f105202iobyxmoadg = clearCartAndFinishSessionScanGoUseCase;
        this.f105205zoijcleaow = checkFirstScanGoLaunchUseCase;
        this.f105203ppxfxbqfkf = checkScanGoSessionExpiredUseCase;
        this.f105204wkgbmnqykc = isScanGoAvailableUseCase;
        this.f105201eablkybsjg = isScanGoSessionRunningUseCase;
    }

    @Override // q12.iobyxmoadg
    public dt.iobyxmoadg iobyxmoadg(Context context, tg.iobyxmoadg onPositiveButton, tg.iobyxmoadg onNegativeButton) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onPositiveButton, "onPositiveButton");
        zdlpuopuiu.btonecajqb(onNegativeButton, "onNegativeButton");
        return l22.iobyxmoadg.iobyxmoadg(context, onPositiveButton, onNegativeButton);
    }

    @Override // q12.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf() {
        i22.ppxfxbqfkf ppxfxbqfkfVar = this.f105205zoijcleaow;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (((Boolean) ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            return ru.myspar.scango.impl.screens.onboarding.presentation.iobyxmoadg.zoijcleaow();
        }
        return ((Boolean) this.f105203ppxfxbqfkf.zoijcleaow(wwaezpbzknVar)).booleanValue() ? ru.myspar.scango.impl.screens.scan.shop.presentation.zoijcleaow.zoijcleaow() : ru.myspar.scango.impl.screens.cart.presentation.zoijcleaow.zoijcleaow();
    }

    @Override // q12.iobyxmoadg
    public Object wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f105201eablkybsjg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg, gxszxtbevoVar);
    }

    @Override // q12.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f105204wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg, gxszxtbevoVar);
    }
}
