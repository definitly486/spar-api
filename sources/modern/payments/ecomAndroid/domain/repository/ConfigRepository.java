package modern.payments.ecomAndroid.domain.repository;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.api.EcomSdkSetupConfig;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "", "Lgg/wwaezpbzkn;", "requestConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "requestSbpConfig", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "getEcomSdkConfig", "()Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "ecomSdkConfig", "setEcomSdkConfig", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;)V", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "getEcomSdkMerchantOptions", "()Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "ecomSdkMerchantOptionsConfig", "setEcomSdkMerchantOptionsConfig", "(Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;)V", "Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "getEcomSdkSetupConfig", "()Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "ecomSdkSetupConfig", "setEcomSdkSetupConfig", "(Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;)V", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig;", "getSbpConfig", "()Lsj/wypolnanlu;", "sbpConfig", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ConfigRepository {
    EcomSdkConfig getEcomSdkConfig();

    EcomSdkMerchantOptionsConfig getEcomSdkMerchantOptions();

    EcomSdkSetupConfig getEcomSdkSetupConfig();

    wypolnanlu getSbpConfig();

    Object requestConfig(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    Object requestSbpConfig(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    void setEcomSdkConfig(EcomSdkConfig ecomSdkConfig);

    void setEcomSdkMerchantOptionsConfig(EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig);

    void setEcomSdkSetupConfig(EcomSdkSetupConfig ecomSdkSetupConfig);
}
