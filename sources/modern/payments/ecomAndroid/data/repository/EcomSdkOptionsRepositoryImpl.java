package modern.payments.ecomAndroid.data.repository;

import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.tzroggbefp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.api.EcomSdkFeature;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.api.EcomSdkSetupConfig;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.data.config.DataModes;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.domain.model.feature.EcomFeatureParam;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.util.exception.EcomInternalException;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u0015*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100/H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R,\u00105\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001504048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R>\u00107\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00130\u0013\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00108\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/EcomSdkOptionsRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;)V", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "config", "Lgg/wwaezpbzkn;", "processRemoteConfigFeaturesParameter", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;)V", "", "featureName", "processFeatureConfig", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;Ljava/lang/String;)V", "Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;", "Lmodern/payments/ecomAndroid/api/EcomSdkFeature;", "toEcomSdkFeature", "(Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;)Lmodern/payments/ecomAndroid/api/EcomSdkFeature;", "", "Lmodern/payments/ecomAndroid/domain/model/feature/EcomFeatureParam;", "", "getFeatureActiveFlag", "(Ljava/util/Map;)Z", "Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "setMerchantSdkOptions", "(Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;)V", "setRemoteSdkOptions", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "setMerchantOptionsConfig", "(Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;)V", "activeBy", "isEnabled", "setIsFeatureEnabledBy", "(Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;Lmodern/payments/ecomAndroid/domain/model/feature/EcomFeatureParam;Z)V", "isFeatureEnabled", "(Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;)Z", "isFeatureEnabledBy", "(Lmodern/payments/ecomAndroid/data/common/Constants$FeatureName;Lmodern/payments/ecomAndroid/domain/model/feature/EcomFeatureParam;)Z", "Lmodern/payments/ecomAndroid/data/common/Constants$EcomService;", "service", "Lmodern/payments/ecomAndroid/data/common/Constants$EcomServiceParam;", "param", "getEcomSdkCfgSchemaParam", "(Lmodern/payments/ecomAndroid/data/common/Constants$EcomService;Lmodern/payments/ecomAndroid/data/common/Constants$EcomServiceParam;)Ljava/lang/String;", "getEcomSdkMerchantOptions", "()Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "", "disabledFeatures", "processMerchantConfigFeatures", "(Ljava/util/List;)V", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "", "featuresMap", "Ljava/util/Map;", "schemas", "merchantOptionsConfig", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "FeatureParameters", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomSdkOptionsRepositoryImpl implements EcomSdkOptionsRepository {
    private final Map<Constants.FeatureName, Map<EcomFeatureParam, Boolean>> featuresMap;
    private EcomSdkMerchantOptionsConfig merchantOptionsConfig;
    private Map<String, ? extends Map<String, ? extends Map<String, String>>> schemas;
    private final UIPreferencesRepository uiPreferencesRepository;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/EcomSdkOptionsRepositoryImpl$FeatureParameters;", "", "enabledBySystem", "", "enabledByMerchant", "(ZZ)V", "getEnabledByMerchant", "()Z", "getEnabledBySystem", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FeatureParameters {
        private final boolean enabledByMerchant;
        private final boolean enabledBySystem;

        /* JADX WARN: Illegal instructions before constructor call */
        public FeatureParameters() {
            boolean z13 = false;
            this(z13, z13, 3, null);
        }

        public static /* synthetic */ FeatureParameters copy$default(FeatureParameters featureParameters, boolean z13, boolean z14, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = featureParameters.enabledBySystem;
            }
            if ((i13 & 2) != 0) {
                z14 = featureParameters.enabledByMerchant;
            }
            return featureParameters.copy(z13, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEnabledBySystem() {
            return this.enabledBySystem;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEnabledByMerchant() {
            return this.enabledByMerchant;
        }

        public final FeatureParameters copy(boolean enabledBySystem, boolean enabledByMerchant) {
            return new FeatureParameters(enabledBySystem, enabledByMerchant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeatureParameters)) {
                return false;
            }
            FeatureParameters featureParameters = (FeatureParameters) other;
            return this.enabledBySystem == featureParameters.enabledBySystem && this.enabledByMerchant == featureParameters.enabledByMerchant;
        }

        public final boolean getEnabledByMerchant() {
            return this.enabledByMerchant;
        }

        public final boolean getEnabledBySystem() {
            return this.enabledBySystem;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.enabledBySystem) * 31) + Boolean.hashCode(this.enabledByMerchant);
        }

        public String toString() {
            return "FeatureParameters(enabledBySystem=" + this.enabledBySystem + ", enabledByMerchant=" + this.enabledByMerchant + ')';
        }

        public FeatureParameters(boolean z13, boolean z14) {
            this.enabledBySystem = z13;
            this.enabledByMerchant = z14;
        }

        public /* synthetic */ FeatureParameters(boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Constants.FeatureName.values().length];
            try {
                iArr[Constants.FeatureName.RESULT_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Constants.FeatureName.SBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Constants.FeatureName.SPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Constants.FeatureName.BINDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Constants.FeatureName.NEW_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EcomSdkOptionsRepositoryImpl(UIPreferencesRepository uiPreferencesRepository) {
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        this.uiPreferencesRepository = uiPreferencesRepository;
        Constants.FeatureName featureName = Constants.FeatureName.SPAY;
        EcomFeatureParam ecomFeatureParam = EcomFeatureParam.ENABLED_BY_SYSTEM;
        Boolean bool = Boolean.FALSE;
        vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool);
        EcomFeatureParam ecomFeatureParam2 = EcomFeatureParam.ENABLED_BY_MERCHANT;
        this.featuresMap = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(featureName, tzroggbefp.wflxmlrfwp(vdvldrhtssVarIobyxmoadg, cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))), cqumvgiudr.iobyxmoadg(Constants.FeatureName.RESULT_VIEW, tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool), cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))), cqumvgiudr.iobyxmoadg(Constants.FeatureName.ENABLE_LOGGING, tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool), cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))), cqumvgiudr.iobyxmoadg(Constants.FeatureName.NEW_CARD, tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool), cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))), cqumvgiudr.iobyxmoadg(Constants.FeatureName.BINDING, tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool), cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))), cqumvgiudr.iobyxmoadg(Constants.FeatureName.SBP, tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool), cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))), cqumvgiudr.iobyxmoadg(Constants.FeatureName.CLICKSTREAM_METRICS, tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool), cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))), cqumvgiudr.iobyxmoadg(Constants.FeatureName.SSL, tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(ecomFeatureParam, bool), cqumvgiudr.iobyxmoadg(ecomFeatureParam2, bool))));
    }

    private final boolean getFeatureActiveFlag(Map<EcomFeatureParam, Boolean> map) {
        EcomFeatureParam ecomFeatureParam = EcomFeatureParam.ENABLED_BY_SYSTEM;
        Boolean bool = Boolean.FALSE;
        return map.getOrDefault(ecomFeatureParam, bool).booleanValue() && map.getOrDefault(EcomFeatureParam.ENABLED_BY_MERCHANT, bool).booleanValue();
    }

    private final void processFeatureConfig(EcomSdkConfig config, String featureName) {
        List<EcomSdkConfig.FeatureToggle> featuresToggle = config.getFeaturesToggle();
        Object obj = null;
        if (featuresToggle != null) {
            for (Object obj2 : featuresToggle) {
                if (zdlpuopuiu.eablkybsjg(((EcomSdkConfig.FeatureToggle) obj2).getName(), featureName)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (EcomSdkConfig.FeatureToggle) obj;
        }
        if (obj != null) {
            Constants.FeatureName featureName2 = Constants.FeatureName.SBP;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName2.getFeatureName())) {
                setIsFeatureEnabledBy(featureName2, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName3 = Constants.FeatureName.BINDING;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName3.getFeatureName())) {
                setIsFeatureEnabledBy(featureName3, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName4 = Constants.FeatureName.NEW_CARD;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName4.getFeatureName())) {
                setIsFeatureEnabledBy(featureName4, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName5 = Constants.FeatureName.CLICKSTREAM_METRICS;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName5.getFeatureName())) {
                setIsFeatureEnabledBy(featureName5, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName6 = Constants.FeatureName.SHOW_SAVE_BINDING;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName6.getFeatureName())) {
                setIsFeatureEnabledBy(featureName6, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName7 = Constants.FeatureName.SPAY;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName7.getFeatureName())) {
                setIsFeatureEnabledBy(featureName7, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName8 = Constants.FeatureName.RESULT_VIEW;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName8.getFeatureName())) {
                setIsFeatureEnabledBy(featureName8, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName9 = Constants.FeatureName.ENABLE_LOGGING;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName9.getFeatureName())) {
                setIsFeatureEnabledBy(featureName9, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
                return;
            }
            Constants.FeatureName featureName10 = Constants.FeatureName.SSL;
            if (zdlpuopuiu.eablkybsjg(featureName, featureName10.getFeatureName())) {
                setIsFeatureEnabledBy(featureName10, EcomFeatureParam.ENABLED_BY_SYSTEM, true);
            }
        }
    }

    private final void processRemoteConfigFeaturesParameter(EcomSdkConfig config) {
        Iterator<Constants.FeatureName> it = this.featuresMap.keySet().iterator();
        while (it.hasNext()) {
            processFeatureConfig(config, it.next().getFeatureName());
        }
    }

    private final EcomSdkFeature toEcomSdkFeature(Constants.FeatureName featureName) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[featureName.ordinal()];
        if (i13 == 1) {
            return EcomSdkFeature.RESULT_VIEW;
        }
        if (i13 == 2) {
            return EcomSdkFeature.PAY_BY_SBP;
        }
        if (i13 == 3) {
            return EcomSdkFeature.PAY_BY_SPAY;
        }
        if (i13 == 4) {
            return EcomSdkFeature.BINDING;
        }
        if (i13 != 5) {
            return null;
        }
        return EcomSdkFeature.NEW_CARD;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public String getEcomSdkCfgSchemaParam(Constants.EcomService service, Constants.EcomServiceParam param) {
        Map<String, ? extends Map<String, String>> map;
        String str;
        Map<String, ? extends Map<String, String>> map2;
        String str2;
        zdlpuopuiu.btonecajqb(service, "service");
        zdlpuopuiu.btonecajqb(param, "param");
        Map<String, ? extends Map<String, ? extends Map<String, String>>> map3 = this.schemas;
        String valueOrNull = null;
        if (map3 != null && (map2 = map3.get(EcomStagingConfig.INSTANCE.getDataMode().getKey())) != null) {
            Map<String, String> map4 = map2.get(service.getKey());
            String valueOrNull2 = StringExtensionsKt.getValueOrNull((map4 == null || (str2 = map4.get(param.getKey())) == null) ? null : StringExtensionsKt.decodeBase64(str2));
            if (valueOrNull2 != null) {
                return valueOrNull2;
            }
        }
        Map<String, ? extends Map<String, ? extends Map<String, String>>> map5 = this.schemas;
        if (map5 != null && (map = map5.get(DataModes.IFT_SERVER.getKey())) != null) {
            Map<String, String> map6 = map.get(service.getKey());
            if (map6 != null && (str = map6.get(param.getKey())) != null) {
                valueOrNull = StringExtensionsKt.decodeBase64(str);
            }
            valueOrNull = StringExtensionsKt.getValueOrNull(valueOrNull);
        }
        return valueOrNull == null ? "" : valueOrNull;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public EcomSdkMerchantOptionsConfig getEcomSdkMerchantOptions() {
        EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig = this.merchantOptionsConfig;
        if (ecomSdkMerchantOptionsConfig != null) {
            return ecomSdkMerchantOptionsConfig;
        }
        throw EcomInternalException.EcomMerchantOptionsConfigIsNull.INSTANCE;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public boolean isFeatureEnabled(Constants.FeatureName featureName) {
        zdlpuopuiu.btonecajqb(featureName, "featureName");
        Map<EcomFeatureParam, Boolean> map = this.featuresMap.get(featureName);
        if (!(map != null ? zdlpuopuiu.eablkybsjg(map.get(EcomFeatureParam.ENABLED_BY_SYSTEM), Boolean.TRUE) : false)) {
            return false;
        }
        Map<EcomFeatureParam, Boolean> map2 = this.featuresMap.get(featureName);
        return !(map2 != null ? zdlpuopuiu.eablkybsjg(map2.get(EcomFeatureParam.ENABLED_BY_MERCHANT), Boolean.FALSE) : false);
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public boolean isFeatureEnabledBy(Constants.FeatureName featureName, EcomFeatureParam activeBy) {
        zdlpuopuiu.btonecajqb(featureName, "featureName");
        zdlpuopuiu.btonecajqb(activeBy, "activeBy");
        Map<EcomFeatureParam, Boolean> map = this.featuresMap.get(featureName);
        if (map != null) {
            return zdlpuopuiu.eablkybsjg(map.get(activeBy), Boolean.TRUE);
        }
        return false;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public void processMerchantConfigFeatures(List<? extends EcomSdkFeature> disabledFeatures) {
        zdlpuopuiu.btonecajqb(disabledFeatures, "disabledFeatures");
        for (Constants.FeatureName featureName : this.featuresMap.keySet()) {
            EcomSdkFeature ecomSdkFeature = toEcomSdkFeature(featureName);
            if (ecomSdkFeature != null) {
                setIsFeatureEnabledBy(featureName, EcomFeatureParam.ENABLED_BY_MERCHANT, !disabledFeatures.contains(ecomSdkFeature));
            }
        }
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public void setIsFeatureEnabledBy(Constants.FeatureName featureName, EcomFeatureParam activeBy, boolean isEnabled) {
        zdlpuopuiu.btonecajqb(featureName, "featureName");
        zdlpuopuiu.btonecajqb(activeBy, "activeBy");
        Map<EcomFeatureParam, Boolean> map = this.featuresMap.get(featureName);
        if (map != null) {
            map.put(activeBy, Boolean.valueOf(isEnabled));
        }
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public void setMerchantOptionsConfig(EcomSdkMerchantOptionsConfig config) {
        zdlpuopuiu.btonecajqb(config, "config");
        this.merchantOptionsConfig = config;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public void setMerchantSdkOptions(EcomSdkSetupConfig config) {
        zdlpuopuiu.btonecajqb(config, "config");
        setIsFeatureEnabledBy(Constants.FeatureName.ENABLE_LOGGING, EcomFeatureParam.ENABLED_BY_MERCHANT, config.getEnableLogging());
        this.uiPreferencesRepository.setUIPreferences(config.getEcomUiPreferences());
    }

    @Override // modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository
    public void setRemoteSdkOptions(EcomSdkConfig config) {
        zdlpuopuiu.btonecajqb(config, "config");
        List<EcomSdkConfig.FeatureToggle> featuresToggle = config.getFeaturesToggle();
        if (featuresToggle != null && !featuresToggle.isEmpty()) {
            processRemoteConfigFeaturesParameter(config);
        }
        Map<String, Map<String, Map<String, String>>> schemas = config.getSchemas();
        if (schemas == null || schemas.isEmpty()) {
            return;
        }
        this.schemas = config.getSchemas();
    }
}
