package kk;

import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import modern.payments.ecomAndroid.di.module.paymentFlowModule.PaymentFlowNetworkModuleKt;
import spay.seamlessAuth.core.data.network.request.ExchangeTokenRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class t30 implements b00 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final qj f58612iobyxmoadg;

    public t30(qj commonConnector) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(commonConnector, "commonConnector");
        this.f58612iobyxmoadg = commonConnector;
    }

    public final Object iobyxmoadg(ExchangeTokenRequest exchangeTokenRequest, z50 z50Var) {
        Object objWkgbmnqykc;
        lk.yadqdtsiqt yadqdtsiqtVarWkgbmnqykc;
        lk.yadqdtsiqt yadqdtsiqtVarWkgbmnqykc2;
        qj qjVar = this.f58612iobyxmoadg;
        String strIobyxmoadg = hv.iobyxmoadg();
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVar = new lk.zynmafqrjb.iobyxmoadg();
        lk.istkbnxepw.iobyxmoadg iobyxmoadgVar2 = lk.istkbnxepw.f63065iobyxmoadg;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(eo.f56445iobyxmoadg.zdlpuopuiu(exchangeTokenRequest));
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        String str = (String) (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc);
        if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) || str == null) {
            Log.w("PARSER", "Gson couldn't serialize " + Object.class + " - " + exchangeTokenRequest + " \nCause: " + gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc));
        }
        if (str == null) {
            str = "";
        }
        iobyxmoadgVar.draadjrbmk(lk.istkbnxepw.iobyxmoadg.dxjokdxxww(iobyxmoadgVar2, str, null, 1, null));
        qjVar.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        iobyxmoadgVar.iobyxmoadg("Accept", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
        iobyxmoadgVar.iobyxmoadg("Content-Type", PaymentFlowNetworkModuleKt.REQUEST_TYPE);
        iobyxmoadgVar.kcexrzcfyt(strIobyxmoadg);
        ((c00) qjVar.f58203zoijcleaow).zoijcleaow(iobyxmoadgVar.zoijcleaow());
        lk.zynmafqrjb zynmafqrjbVarZoijcleaow = ((c00) qjVar.f58203zoijcleaow).zoijcleaow(iobyxmoadgVar.zoijcleaow());
        rg0 rg0Var = qjVar.f58202iobyxmoadg;
        lg.draadjrbmk draadjrbmkVar = new lg.draadjrbmk(mg.zoijcleaow.ppxfxbqfkf(z50Var));
        kotlin.jvm.internal.hcddaimhww hcddaimhwwVar = new kotlin.jvm.internal.hcddaimhww();
        hcddaimhwwVar.f60014zdlpuopuiu = 7;
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        zy.iobyxmoadg(zynmafqrjbVarZoijcleaow);
        try {
            try {
                rg0Var.getClass();
                FirebasePerfOkHttpClient.enqueue(rg0.iobyxmoadg(rg0Var, new lk.lereixgezr.iobyxmoadg().zoijcleaow(rg0Var.f58333iobyxmoadg)).ppxfxbqfkf().iobyxmoadg(zynmafqrjbVarZoijcleaow), new n20(draadjrbmkVar, hcddaimhwwVar, hkdspvbjdzVar));
                lk.cdpycssgdh cdpycssgdhVar = (lk.cdpycssgdh) hkdspvbjdzVar.f60015zdlpuopuiu;
                if (cdpycssgdhVar != null && (yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc()) != null) {
                    yadqdtsiqtVarWkgbmnqykc.close();
                }
            } catch (Throwable th3) {
                lk.cdpycssgdh cdpycssgdhVar2 = (lk.cdpycssgdh) hkdspvbjdzVar.f60015zdlpuopuiu;
                if (cdpycssgdhVar2 != null && (yadqdtsiqtVarWkgbmnqykc2 = cdpycssgdhVar2.wkgbmnqykc()) != null) {
                    yadqdtsiqtVarWkgbmnqykc2.close();
                }
                throw th3;
            }
        } catch (IOException e13) {
            String message = e13.getMessage();
            if (message == null) {
                message = "Error message was empty";
            }
            draadjrbmkVar.resumeWith(gg.kcexrzcfyt.wkgbmnqykc(new ff(message)));
            lk.cdpycssgdh cdpycssgdhVar3 = (lk.cdpycssgdh) hkdspvbjdzVar.f60015zdlpuopuiu;
            if (cdpycssgdhVar3 != null && (yadqdtsiqtVarWkgbmnqykc = cdpycssgdhVar3.wkgbmnqykc()) != null) {
            }
        }
        Object objIobyxmoadg = draadjrbmkVar.iobyxmoadg();
        if (objIobyxmoadg == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(z50Var);
        }
        return objIobyxmoadg;
    }
}
