package m40;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.iwizpuwonk;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements iwizpuwonk {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f65143zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final l40.zoijcleaow f65144iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public wkgbmnqykc(l40.zoijcleaow apiEndPointsProvider) {
        zdlpuopuiu.btonecajqb(apiEndPointsProvider, "apiEndPointsProvider");
        this.f65144iobyxmoadg = apiEndPointsProvider;
    }

    private final zynmafqrjb.iobyxmoadg iobyxmoadg(zynmafqrjb.iobyxmoadg iobyxmoadgVar, zynmafqrjb zynmafqrjbVar) {
        String string = zynmafqrjbVar.gtknphoqwx().jyumaefscl().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        zynmafqrjb.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.sopmlzcsov(string, "jwt/create", false, 2, null) ? iobyxmoadgVar : null;
        return iobyxmoadgVar2 == null ? iobyxmoadgVar.iobyxmoadg("Bitrix", j40.iobyxmoadg.BITRIX_OLD.lqeggnwhkg()) : iobyxmoadgVar2;
    }

    private final String zoijcleaow() {
        return this.f65144iobyxmoadg.gxszxtbevo();
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        zdlpuopuiu.btonecajqb(chain, "chain");
        zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg = chain.dxjokdxxww().nufgyqmvbu().iobyxmoadg("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE).iobyxmoadg("Version", zoijcleaow());
        xx.iobyxmoadg iobyxmoadgVar = xx.iobyxmoadg.f123319iobyxmoadg;
        return chain.zoijcleaow(iobyxmoadg(iobyxmoadgVarIobyxmoadg.iobyxmoadg("User-Agent", iobyxmoadgVar.iwxlajgraz()).iobyxmoadg("Platform", iobyxmoadgVar.metgxyhuhe()), chain.dxjokdxxww()).zoijcleaow());
    }
}
