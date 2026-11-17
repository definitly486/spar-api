package gw;

import ew.ppxfxbqfkf;
import hg.jyumaefscl;
import hw.GetOrderPaymentInfoResponse;
import hw.PaymentInfoSbpDto;
import hw.PaymentInfoSdkDto;
import hw.PaymentInfoWebViewDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import yz.SbpRecurringBankDto;

/* JADX INFO: loaded from: classes4.dex */
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
            arrayList.add(ry.iobyxmoadg.iobyxmoadg((SbpRecurringBankDto) it.next()));
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
        return ppxfxbqfkfVarZoijcleaow == null ? ppxfxbqfkf.C0695ppxfxbqfkf.f32232iobyxmoadg : ppxfxbqfkfVarZoijcleaow;
    }
}
