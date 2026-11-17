package modern.payments.ecomAndroid.util.extension;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.data.api.SPayPaymentResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"mapToEcomSdkResult", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "Lmodern/payments/ecomAndroid/data/api/SPayPaymentResult;", "localSessionId", "", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SPayPaymentResultExtentionsKt {
    public static final EcomSdkMerchantOptionsConfig.EcomSdkResult mapToEcomSdkResult(SPayPaymentResult sPayPaymentResult, String str) {
        zdlpuopuiu.btonecajqb(sPayPaymentResult, "<this>");
        if (zdlpuopuiu.eablkybsjg(sPayPaymentResult, SPayPaymentResult.Canceled.INSTANCE)) {
            return new EcomSdkMerchantOptionsConfig.EcomSdkResult.Cancel(str);
        }
        if (zdlpuopuiu.eablkybsjg(sPayPaymentResult, SPayPaymentResult.Processing.INSTANCE)) {
            return new EcomSdkMerchantOptionsConfig.EcomSdkResult.Waiting(str, null, null, null, null, 30, null);
        }
        if (zdlpuopuiu.eablkybsjg(sPayPaymentResult, SPayPaymentResult.Success.INSTANCE)) {
            return new EcomSdkMerchantOptionsConfig.EcomSdkResult.Success(str);
        }
        if (sPayPaymentResult instanceof SPayPaymentResult.Error) {
            return new EcomSdkMerchantOptionsConfig.EcomSdkResult.Error(((SPayPaymentResult.Error) sPayPaymentResult).getError().getError().getDescription(), null, null, null, str, 14, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
