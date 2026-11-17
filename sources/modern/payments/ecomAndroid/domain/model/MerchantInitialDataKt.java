package modern.payments.ecomAndroid.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.util.extension.OrderIdExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toMerchantData", "Lmodern/payments/ecomAndroid/domain/model/MerchantInitialData;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MerchantInitialDataKt {
    public static final MerchantInitialData toMerchantData(EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig) {
        String bankInvoiceId;
        zdlpuopuiu.btonecajqb(ecomSdkMerchantOptionsConfig, "<this>");
        String apiKey = ecomSdkMerchantOptionsConfig.getApiKey();
        String merchantLogin = ecomSdkMerchantOptionsConfig.getMerchantLogin();
        if (OrderIdExtensionsKt.isShortOrderId(ecomSdkMerchantOptionsConfig.getBankInvoiceId())) {
            bankInvoiceId = OrderIdExtensionsKt.formatToLongOrderId(ecomSdkMerchantOptionsConfig.getBankInvoiceId());
            if (bankInvoiceId == null) {
                bankInvoiceId = "";
            }
        } else {
            bankInvoiceId = ecomSdkMerchantOptionsConfig.getBankInvoiceId();
        }
        return new MerchantInitialData(apiKey, merchantLogin, bankInvoiceId, ecomSdkMerchantOptionsConfig.getOrderNumber());
    }
}
