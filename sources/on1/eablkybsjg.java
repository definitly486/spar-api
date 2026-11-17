package on1;

import android.content.Context;
import eo1.gxszxtbevo;
import eo1.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class eablkybsjg implements mn1.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lqeggnwhkg f73261eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final eo1.eablkybsjg f73262iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final eo1.wkgbmnqykc f73263ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final gxszxtbevo f73264wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final eo1.ppxfxbqfkf f73265zoijcleaow;

    public eablkybsjg(eo1.eablkybsjg clearCartAndFinishSessionScanGoUseCase, eo1.ppxfxbqfkf checkFirstScanGoLaunchUseCase, eo1.wkgbmnqykc checkScanGoSessionExpiredUseCase, gxszxtbevo isScanGoAvailableUseCase, lqeggnwhkg isScanGoSessionRunningUseCase) {
        zdlpuopuiu.btonecajqb(clearCartAndFinishSessionScanGoUseCase, "clearCartAndFinishSessionScanGoUseCase");
        zdlpuopuiu.btonecajqb(checkFirstScanGoLaunchUseCase, "checkFirstScanGoLaunchUseCase");
        zdlpuopuiu.btonecajqb(checkScanGoSessionExpiredUseCase, "checkScanGoSessionExpiredUseCase");
        zdlpuopuiu.btonecajqb(isScanGoAvailableUseCase, "isScanGoAvailableUseCase");
        zdlpuopuiu.btonecajqb(isScanGoSessionRunningUseCase, "isScanGoSessionRunningUseCase");
        this.f73262iobyxmoadg = clearCartAndFinishSessionScanGoUseCase;
        this.f73265zoijcleaow = checkFirstScanGoLaunchUseCase;
        this.f73263ppxfxbqfkf = checkScanGoSessionExpiredUseCase;
        this.f73264wkgbmnqykc = isScanGoAvailableUseCase;
        this.f73261eablkybsjg = isScanGoSessionRunningUseCase;
    }

    @Override // mn1.iobyxmoadg
    public xr0.iobyxmoadg iobyxmoadg(Context context, tg.iobyxmoadg onPositiveButton, tg.iobyxmoadg onNegativeButton) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(onPositiveButton, "onPositiveButton");
        zdlpuopuiu.btonecajqb(onNegativeButton, "onNegativeButton");
        return ho1.iobyxmoadg.iobyxmoadg(context, onPositiveButton, onNegativeButton);
    }

    @Override // mn1.iobyxmoadg
    public m9.wkgbmnqykc ppxfxbqfkf() {
        eo1.ppxfxbqfkf ppxfxbqfkfVar = this.f73265zoijcleaow;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (((Boolean) ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            return ru.myspar.proloyalty.scango.impl.screens.onboarding.presentation.iobyxmoadg.zoijcleaow();
        }
        return ((Boolean) this.f73263ppxfxbqfkf.zoijcleaow(wwaezpbzknVar)).booleanValue() ? ru.myspar.proloyalty.scango.impl.screens.scan.shop.presentation.zoijcleaow.zoijcleaow() : ru.myspar.proloyalty.scango.impl.screens.cart.presentation.zoijcleaow.zoijcleaow();
    }

    @Override // mn1.iobyxmoadg
    public Object zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
        return this.f73264wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg, gxszxtbevoVar);
    }
}
