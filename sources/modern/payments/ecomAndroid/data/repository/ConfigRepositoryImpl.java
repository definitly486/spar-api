package modern.payments.ecomAndroid.data.repository;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.gson.Gson;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfigKt;
import modern.payments.ecomAndroid.api.EcomSdkSetupConfig;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.domain.configService.ConfigService;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.storage.CustomSharedPreferences;
import modern.payments.ecomAndroid.util.exception.EcomInternalException;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.OrderIdExtensionsKt;
import modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor;
import modern.payments.tracker.ITracker;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010.R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010/R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00100R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lmodern/payments/ecomAndroid/data/repository/ConfigRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "Lmodern/payments/ecomAndroid/domain/configService/ConfigService;", "configService", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "unsafeEcomApiRepository", "Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "customSharedPreferences", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;", "hostSelectionInterceptor", "<init>", "(Lmodern/payments/ecomAndroid/domain/configService/ConfigService;Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;)V", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "getConfigFromSharedPreferences", "()Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "ecomSdkConfig", "Lgg/wwaezpbzkn;", "saveConfigToSharedPreferences", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;)V", "requestConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "requestSbpConfig", "getEcomSdkConfig", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "getEcomSdkMerchantOptions", "()Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "setEcomSdkConfig", "ecomSdkMerchantOptionsConfig", "setEcomSdkMerchantOptionsConfig", "(Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;)V", "Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "getEcomSdkSetupConfig", "()Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "ecomSdkSetupConfig", "setEcomSdkSetupConfig", "(Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;)V", "Lmodern/payments/ecomAndroid/domain/configService/ConfigService;", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/storage/CustomSharedPreferences;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig;", "Lmodern/payments/ecomAndroid/api/EcomSdkSetupConfig;", "Lsj/zynmafqrjb;", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig;", "_sbpConfig", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "sbpConfig", "Lsj/wypolnanlu;", "getSbpConfig", "()Lsj/wypolnanlu;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConfigRepositoryImpl implements ConfigRepository {
    public static final String CONFIG_FROM_SHARED_PREFERENCES = "CONFIG_FROM_SHARED_PREFERENCES : ";
    private static final String ECOM_SDK_CONFIG = "ECOM_SDK_CONFIG";
    private final zynmafqrjb _sbpConfig;
    private final ConfigService configService;
    private final CustomSharedPreferences customSharedPreferences;
    private EcomSdkConfig ecomSdkConfig;
    private EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private EcomSdkSetupConfig ecomSdkSetupConfig;
    private final HostSelectionInterceptor hostSelectionInterceptor;
    private final wypolnanlu sbpConfig;
    private final ITracker tracker;
    private final UnsafeEcomApiRepository unsafeEcomApiRepository;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.ConfigRepositoryImpl$requestConfig$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.ConfigRepositoryImpl", f = "ConfigRepositoryImpl.kt", l = {55}, m = "requestConfig")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigRepositoryImpl.this.requestConfig(this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.repository.ConfigRepositoryImpl$requestSbpConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.repository.ConfigRepositoryImpl", f = "ConfigRepositoryImpl.kt", l = {67}, m = "requestSbpConfig")
    static final class C40551 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40551(lg.gxszxtbevo<? super C40551> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfigRepositoryImpl.this.requestSbpConfig(this);
        }
    }

    public ConfigRepositoryImpl(ConfigService configService, UnsafeEcomApiRepository unsafeEcomApiRepository, CustomSharedPreferences customSharedPreferences, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository, HostSelectionInterceptor hostSelectionInterceptor) {
        zdlpuopuiu.btonecajqb(configService, "configService");
        zdlpuopuiu.btonecajqb(unsafeEcomApiRepository, "unsafeEcomApiRepository");
        zdlpuopuiu.btonecajqb(customSharedPreferences, "customSharedPreferences");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        zdlpuopuiu.btonecajqb(hostSelectionInterceptor, "hostSelectionInterceptor");
        this.configService = configService;
        this.unsafeEcomApiRepository = unsafeEcomApiRepository;
        this.customSharedPreferences = customSharedPreferences;
        this.tracker = tracker;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
        this.hostSelectionInterceptor = hostSelectionInterceptor;
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(null);
        this._sbpConfig = zynmafqrjbVarIobyxmoadg;
        this.sbpConfig = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
    }

    private final EcomSdkConfig getConfigFromSharedPreferences() {
        EcomSdkConfig ecomSdkConfig;
        try {
            ecomSdkConfig = (EcomSdkConfig) new Gson().gtknphoqwx((String) this.customSharedPreferences.getData(ECOM_SDK_CONFIG, ""), EcomSdkConfig.class);
        } catch (Exception e13) {
            Log.i("CATCH BLOCK EXCEPTION", e13.toString());
            ecomSdkConfig = null;
        }
        FeatureExtensionsKt.track$default(this.tracker, this.ecomSdkOptionsRepository, CONFIG_FROM_SHARED_PREFERENCES + ecomSdkConfig, null, ITracker.Priority.INFO, null, 20, null);
        return ecomSdkConfig;
    }

    private final void saveConfigToSharedPreferences(EcomSdkConfig ecomSdkConfig) {
        String strZdlpuopuiu = new Gson().zdlpuopuiu(ecomSdkConfig);
        if (strZdlpuopuiu != null) {
            this.customSharedPreferences.putData(ECOM_SDK_CONFIG, strZdlpuopuiu);
        }
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public EcomSdkConfig getEcomSdkConfig() {
        EcomSdkConfig ecomSdkConfig = this.ecomSdkConfig;
        if (ecomSdkConfig != null) {
            return ecomSdkConfig;
        }
        throw EcomInternalException.EcomSdkConfigIsNull.INSTANCE;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public EcomSdkMerchantOptionsConfig getEcomSdkMerchantOptions() {
        EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig = this.ecomSdkMerchantOptionsConfig;
        if (ecomSdkMerchantOptionsConfig != null) {
            return ecomSdkMerchantOptionsConfig;
        }
        throw EcomInternalException.EcomMerchantOptionsConfigIsNull.INSTANCE;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public EcomSdkSetupConfig getEcomSdkSetupConfig() {
        EcomSdkSetupConfig ecomSdkSetupConfig = this.ecomSdkSetupConfig;
        if (ecomSdkSetupConfig != null) {
            return ecomSdkSetupConfig;
        }
        throw EcomInternalException.EcomSdkSetupConfigIsNull.INSTANCE;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public wypolnanlu getSbpConfig() {
        return this.sbpConfig;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public Object requestConfig(lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        ConfigRepositoryImpl configRepositoryImpl;
        ConfigRepositoryImpl configRepositoryImpl2;
        EcomSdkConfig configFromAssets;
        EcomSdkConfig ecomSdkConfig;
        if (gxszxtbevoVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
            int i13 = anonymousClass1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i13 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
        }
        Object remoteConfig = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(remoteConfig);
            ConfigService configService = this.configService;
            if (EcomStagingConfig.INSTANCE.getUseLocalConfig()) {
                configFromAssets = configService.getConfigFromAssets();
                configRepositoryImpl = this;
                configRepositoryImpl2 = configRepositoryImpl;
            } else {
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = configService;
                anonymousClass1.L$2 = this;
                anonymousClass1.label = 1;
                remoteConfig = configService.getRemoteConfig(anonymousClass1);
                if (remoteConfig == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                configRepositoryImpl = this;
                configRepositoryImpl2 = configRepositoryImpl;
            }
            configRepositoryImpl2.ecomSdkConfig = configFromAssets;
            ecomSdkConfig = configRepositoryImpl.ecomSdkConfig;
            if (ecomSdkConfig != null) {
                configRepositoryImpl.setEcomSdkConfig(ecomSdkConfig);
                configRepositoryImpl.saveConfigToSharedPreferences(ecomSdkConfig);
                configRepositoryImpl.ecomSdkOptionsRepository.setRemoteSdkOptions(ecomSdkConfig);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        configRepositoryImpl2 = (ConfigRepositoryImpl) anonymousClass1.L$2;
        configRepositoryImpl = (ConfigRepositoryImpl) anonymousClass1.L$0;
        gg.zdlpuopuiu.zoijcleaow(remoteConfig);
        configFromAssets = (EcomSdkConfig) remoteConfig;
        if (configFromAssets == null) {
            configFromAssets = configRepositoryImpl.getConfigFromSharedPreferences();
        }
        configRepositoryImpl2.ecomSdkConfig = configFromAssets;
        ecomSdkConfig = configRepositoryImpl.ecomSdkConfig;
        if (ecomSdkConfig != null) {
            configRepositoryImpl.setEcomSdkConfig(ecomSdkConfig);
            configRepositoryImpl.saveConfigToSharedPreferences(ecomSdkConfig);
            configRepositoryImpl.ecomSdkOptionsRepository.setRemoteSdkOptions(ecomSdkConfig);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public Object requestSbpConfig(lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        C40551 c40551;
        zynmafqrjb zynmafqrjbVar;
        if (gxszxtbevoVar instanceof C40551) {
            c40551 = (C40551) gxszxtbevoVar;
            int i13 = c40551.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40551.label = i13 - Integer.MIN_VALUE;
            } else {
                c40551 = new C40551(gxszxtbevoVar);
            }
        } else {
            c40551 = new C40551(gxszxtbevoVar);
        }
        Object obj = c40551.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40551.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            zynmafqrjb zynmafqrjbVar2 = this._sbpConfig;
            UnsafeEcomApiRepository unsafeEcomApiRepository = this.unsafeEcomApiRepository;
            c40551.L$0 = zynmafqrjbVar2;
            c40551.label = 1;
            Object sbpConfig = unsafeEcomApiRepository.getSbpConfig(c40551);
            if (sbpConfig == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zynmafqrjbVar = zynmafqrjbVar2;
            obj = sbpConfig;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zynmafqrjbVar = (zynmafqrjb) c40551.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        ContentResponse.Success success = obj instanceof ContentResponse.Success ? (ContentResponse.Success) obj : null;
        zynmafqrjbVar.setValue(success != null ? (EcomSbpConfig) success.getData() : null);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public void setEcomSdkConfig(EcomSdkConfig ecomSdkConfig) {
        this.ecomSdkConfig = ecomSdkConfig;
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public void setEcomSdkMerchantOptionsConfig(EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfig) {
        EcomSdkMerchantOptionsConfig ecomSdkMerchantOptionsConfigCopy;
        zdlpuopuiu.btonecajqb(ecomSdkMerchantOptionsConfig, "ecomSdkMerchantOptionsConfig");
        if (EcomSdkMerchantOptionsConfigKt.isValid(ecomSdkMerchantOptionsConfig) && OrderIdExtensionsKt.isLongOrderId(ecomSdkMerchantOptionsConfig.getBankInvoiceId())) {
            ecomSdkMerchantOptionsConfigCopy = ecomSdkMerchantOptionsConfig;
        } else {
            if (!EcomSdkMerchantOptionsConfigKt.isValid(ecomSdkMerchantOptionsConfig) || !OrderIdExtensionsKt.isShortOrderId(ecomSdkMerchantOptionsConfig.getBankInvoiceId())) {
                throw EcomInternalException.EcomSdkInitConfigIncorrectBankInvoiceId.INSTANCE;
            }
            String toLongOrderId = OrderIdExtensionsKt.formatToLongOrderId(ecomSdkMerchantOptionsConfig.getBankInvoiceId());
            if (toLongOrderId == null) {
                throw EcomInternalException.EcomSdkInitConfigIncorrectBankInvoiceId.INSTANCE;
            }
            ecomSdkMerchantOptionsConfigCopy = ecomSdkMerchantOptionsConfig.copy((253 & 1) != 0 ? ecomSdkMerchantOptionsConfig.context : null, (253 & 2) != 0 ? ecomSdkMerchantOptionsConfig.bankInvoiceId : toLongOrderId, (253 & 4) != 0 ? ecomSdkMerchantOptionsConfig.apiKey : null, (253 & 8) != 0 ? ecomSdkMerchantOptionsConfig.merchantLogin : null, (253 & 16) != 0 ? ecomSdkMerchantOptionsConfig.orderNumber : null, (253 & 32) != 0 ? ecomSdkMerchantOptionsConfig.appPackageName : null, (253 & 64) != 0 ? ecomSdkMerchantOptionsConfig.preferredSPayMethod : null, (253 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? ecomSdkMerchantOptionsConfig.callback : null);
        }
        this.ecomSdkMerchantOptionsConfig = ecomSdkMerchantOptionsConfigCopy;
        this.ecomSdkOptionsRepository.setMerchantOptionsConfig(ecomSdkMerchantOptionsConfig);
    }

    @Override // modern.payments.ecomAndroid.domain.repository.ConfigRepository
    public void setEcomSdkSetupConfig(EcomSdkSetupConfig ecomSdkSetupConfig) {
        zdlpuopuiu.btonecajqb(ecomSdkSetupConfig, "ecomSdkSetupConfig");
        this.ecomSdkSetupConfig = ecomSdkSetupConfig;
        this.hostSelectionInterceptor.setHostBaseUrl();
        this.ecomSdkOptionsRepository.processMerchantConfigFeatures(ecomSdkSetupConfig.getDisabledFeatures());
        this.ecomSdkOptionsRepository.setMerchantSdkOptions(ecomSdkSetupConfig);
    }
}
