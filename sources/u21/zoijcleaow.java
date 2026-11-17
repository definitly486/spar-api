package u21;

import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iwizpuwonk;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;

/* JADX INFO: loaded from: classes5.dex */
final class zoijcleaow implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final s21.iobyxmoadg f112528iobyxmoadg;

    public zoijcleaow(s21.iobyxmoadg apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        this.f112528iobyxmoadg = apiEndPointsProvider;
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        zdlpuopuiu.btonecajqb(chain, "chain");
        return chain.zoijcleaow(chain.dxjokdxxww().nufgyqmvbu().iobyxmoadg("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE).iobyxmoadg("Version", this.f112528iobyxmoadg.gxszxtbevo()).iobyxmoadg("User-Agent", uw0.ppxfxbqfkf.f114521iobyxmoadg.kegysxyocb()).iobyxmoadg("x-app-version", "2").iobyxmoadg("Bitrix", o21.iobyxmoadg.BITRIX_NEW.wkgbmnqykc()).zoijcleaow());
    }
}
