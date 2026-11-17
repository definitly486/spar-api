package av0;

import bv0.GetOrderPaymentInfoResponse;
import bv0.PaymentInfoSbpDto;
import bv0.PaymentInfoSdkDto;
import bv0.PaymentInfoWebViewDto;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import qy0.SbpRecurringBankDto;
import tg.draadjrbmk;
import yu0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements draadjrbmk {
    private final ppxfxbqfkf.wkgbmnqykc eablkybsjg(PaymentInfoWebViewDto paymentInfoWebViewDto) {
        return new ppxfxbqfkf.wkgbmnqykc(paymentInfoWebViewDto.getUrl());
    }

    private final ppxfxbqfkf.zoijcleaow ppxfxbqfkf(PaymentInfoSdkDto paymentInfoSdkDto) {
        return new ppxfxbqfkf.zoijcleaow(paymentInfoSdkDto.getMerchantLogin(), paymentInfoSdkDto.getApiKey(), paymentInfoSdkDto.getOrderNumber(), paymentInfoSdkDto.getBankInvoiceId());
    }

    private final ppxfxbqfkf.iobyxmoadg zoijcleaow(PaymentInfoSbpDto paymentInfoSbpDto) {
        String url = paymentInfoSbpDto.getUrl();
        boolean addAccount = paymentInfoSbpDto.getAddAccount();
        List banks = paymentInfoSbpDto.getBanks();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(banks, 10));
        Iterator it = banks.iterator();
        while (it.hasNext()) {
            arrayList.add(mx0.iobyxmoadg.iobyxmoadg((SbpRecurringBankDto) it.next()));
        }
        return new ppxfxbqfkf.iobyxmoadg(url, addAccount, arrayList);
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public ppxfxbqfkf invoke(GetOrderPaymentInfoResponse response) {
        PaymentInfoSbpDto sbp;
        PaymentInfoSdkDto sdk;
        PaymentInfoWebViewDto webView;
        zdlpuopuiu.btonecajqb(response, "response");
        String type = response.getType();
        int iHashCode = type.hashCode();
        ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = null;
        if (iHashCode != 113665) {
            if (iHashCode != 113722) {
                if (iHashCode == 1224424441 && type.equals("webview") && (webView = response.getWebView()) != null) {
                    ppxfxbqfkfVarZoijcleaow = eablkybsjg(webView);
                }
            } else if (type.equals("sdk") && (sdk = response.getSdk()) != null) {
                ppxfxbqfkfVarZoijcleaow = ppxfxbqfkf(sdk);
            }
        } else if (type.equals("sbp") && (sbp = response.getSbp()) != null) {
            ppxfxbqfkfVarZoijcleaow = zoijcleaow(sbp);
        }
        return ppxfxbqfkfVarZoijcleaow == null ? ppxfxbqfkf.C3229ppxfxbqfkf.f126675iobyxmoadg : ppxfxbqfkfVarZoijcleaow;
    }
}
