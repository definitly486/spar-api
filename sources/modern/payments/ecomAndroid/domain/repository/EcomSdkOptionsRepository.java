package modern.payments.ecomAndroid.domain.repository;

import java.util.List;
import kotlin.Metadata;
import modern.payments.ecomAndroid.api.EcomSdkFeature;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.api.EcomSdkSetupConfig;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.model.feature.EcomFeatureParam;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH&¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H&¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "", "Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "config", "Lgg/wwaezpbzkn;", "setMerchantSdkOptions", "(Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;)V", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "setRemoteSdkOptions", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;)V", "Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;", "featureName", "Lmodern/payments/ecomAndroid/domain/model/feature/EcomFeatureParam;", "activeBy", "", "isEnabled", "setIsFeatureEnabledBy", "(Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;Lmodern/payments/ecomAndroid/domain/model/feature/EcomFeatureParam;Z)V", "isFeatureEnabled", "(Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;)Z", "isFeatureEnabledBy", "(Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;Lmodern/payments/ecomAndroid/domain/model/feature/EcomFeatureParam;)Z", "Lmodern/payments/ecomAndroid/data/common/Constants$EcomService;", "service", "Lmodern/payments/ecomAndroid/data/common/Constants$EcomServiceParam;", "param", "", "getEcomSdkCfgSchemaParam", "(Lmodern/payments/ecomAndroid/data/common/Constants$EcomService;Lmodern/payments/ecomAndroid/data/common/Constants$EcomServiceParam;)Ljava/lang/String;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "setMerchantOptionsConfig", "(Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;)V", "getEcomSdkMerchantOptions", "()Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "", "Lmodern/payments/ecomAndroid/api/EcomSdkFeature;", "disabledFeatures", "processMerchantConfigFeatures", "(Ljava/util/List;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface EcomSdkOptionsRepository {
    String getEcomSdkCfgSchemaParam(Constants.EcomService service, Constants.EcomServiceParam param);

    EcomSdkMerchantOptionsConfig getEcomSdkMerchantOptions();

    boolean isFeatureEnabled(Constants.FeatureName featureName);

    boolean isFeatureEnabledBy(Constants.FeatureName featureName, EcomFeatureParam activeBy);

    void processMerchantConfigFeatures(List<? extends EcomSdkFeature> disabledFeatures);

    void setIsFeatureEnabledBy(Constants.FeatureName featureName, EcomFeatureParam activeBy, boolean isEnabled);

    void setMerchantOptionsConfig(EcomSdkMerchantOptionsConfig config);

    void setMerchantSdkOptions(EcomSdkSetupConfig config);

    void setRemoteSdkOptions(EcomSdkConfig config);
}
