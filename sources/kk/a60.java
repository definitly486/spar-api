package kk;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a60 implements dc2.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final /* synthetic */ g80 f55781iobyxmoadg;

    public a60(g80 g80Var) {
        this.f55781iobyxmoadg = g80Var;
    }

    @Override // dc2.iobyxmoadg
    public final int sendToNetwork(String url, String requestBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requestBody, "requestBody");
        lk.zynmafqrjb zynmafqrjbVarZoijcleaow = new lk.zynmafqrjb.iobyxmoadg().kcexrzcfyt(url).draadjrbmk(lk.istkbnxepw.f63065iobyxmoadg.zoijcleaow(requestBody, lk.cqumvgiudr.f62887eablkybsjg.iobyxmoadg(PaymentFlowNetworkModuleKt.REQUEST_TYPE))).zoijcleaow();
        int iBtonecajqb = -1;
        try {
            lk.lereixgezr lereixgezrVar = this.f55781iobyxmoadg.f56668gxszxtbevo;
            if (lereixgezrVar == null) {
                kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("okHttpClient");
                lereixgezrVar = null;
            }
            lk.cdpycssgdh cdpycssgdhVarExecute = FirebasePerfOkHttpClient.execute(lereixgezrVar.iobyxmoadg(zynmafqrjbVarZoijcleaow));
            try {
                iBtonecajqb = cdpycssgdhVarExecute.btonecajqb();
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                rg.zoijcleaow.iobyxmoadg(cdpycssgdhVarExecute, null);
                return iBtonecajqb;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(cdpycssgdhVarExecute, th2);
                    throw th3;
                }
            }
        } catch (Exception e13) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq(PaymentFlowNetworkModuleKt.METRIC_SENT_EXCEPTION_TAG).ppxfxbqfkf(e13);
            return iBtonecajqb;
        }
    }
}
