package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dc2.iobyxmoadg;
import dc2.zoijcleaow;
import gg.wwaezpbzkn;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.cqumvgiudr;
import lk.istkbnxepw;
import lk.lereixgezr;
import lk.zynmafqrjb;
import modern.payments.ecomAndroid.data.api.EcomApi;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.di.qualifier.sslInteractor.CustomSslInteractor;
import modern.payments.ecomAndroid.domain.model.feature.EcomFeatureParam;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.extension.CommonExtensionsKt;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;
import modern.payments.tracker.ITracker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0017\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/LazyNetworkModule;", "", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Llk/lereixgezr$iobyxmoadg;", "okHttpBuilder", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "sslInteractor", "Lmodern/payments/tracker/ITracker;", "tracker", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Llk/lereixgezr$iobyxmoadg;Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;Lmodern/payments/tracker/ITracker;)V", "Llk/lereixgezr;", "obtainOkHttpClient", "()Llk/lereixgezr;", "Llm/zdlpuopuiu;", "obtainRetrofit", "()Llm/zdlpuopuiu;", "Lmodern/payments/ecomAndroid/data/api/EcomApi;", "obtainEcomApi", "()Lmodern/payments/ecomAndroid/data/api/EcomApi;", "Ldc2/zoijcleaow;", "obtainNetworkClientBuilder", "()Ldc2/zoijcleaow;", "Lgg/wwaezpbzkn;", "init", "()V", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Llk/lereixgezr$iobyxmoadg;", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "Lmodern/payments/tracker/ITracker;", "ecomApi", "Lmodern/payments/ecomAndroid/data/api/EcomApi;", "getEcomApi", "setEcomApi", "(Lmodern/payments/ecomAndroid/data/api/EcomApi;)V", "networkClientBuilder", "Ldc2/zoijcleaow;", "getNetworkClientBuilder", "setNetworkClientBuilder", "(Ldc2/zoijcleaow;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyNetworkModule {
    public EcomApi ecomApi;
    public zoijcleaow networkClientBuilder;
    private final lereixgezr.iobyxmoadg okHttpBuilder;
    private final EcomSdkOptionsRepository optionsRepository;
    private final SSLInteractor sslInteractor;
    private final ITracker tracker;

    public LazyNetworkModule(EcomSdkOptionsRepository optionsRepository, lereixgezr.iobyxmoadg okHttpBuilder, @CustomSslInteractor SSLInteractor sslInteractor, ITracker tracker) {
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(okHttpBuilder, "okHttpBuilder");
        zdlpuopuiu.btonecajqb(sslInteractor, "sslInteractor");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        this.optionsRepository = optionsRepository;
        this.okHttpBuilder = okHttpBuilder;
        this.sslInteractor = sslInteractor;
        this.tracker = tracker;
    }

    private final EcomApi obtainEcomApi() {
        Object objZoijcleaow = obtainRetrofit().zoijcleaow(EcomApi.class);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "create(...)");
        return (EcomApi) objZoijcleaow;
    }

    private final zoijcleaow obtainNetworkClientBuilder() {
        return new zoijcleaow() { // from class: modern.payments.ecomAndroid.di.module.paymentFlowModule.LazyNetworkModule.obtainNetworkClientBuilder.1
            @Override // dc2.zoijcleaow
            public iobyxmoadg buildNetworkClient() {
                final LazyNetworkModule lazyNetworkModule = LazyNetworkModule.this;
                return new iobyxmoadg() { // from class: modern.payments.ecomAndroid.di.module.paymentFlowModule.LazyNetworkModule$obtainNetworkClientBuilder$1$buildNetworkClient$1
                    @Override // dc2.iobyxmoadg
                    public int sendToNetwork(String url, String requestBody) {
                        zdlpuopuiu.btonecajqb(url, "url");
                        zdlpuopuiu.btonecajqb(requestBody, "requestBody");
                        zynmafqrjb zynmafqrjbVarZoijcleaow = new zynmafqrjb.iobyxmoadg().kcexrzcfyt(url).draadjrbmk(istkbnxepw.f63065iobyxmoadg.zoijcleaow(requestBody, cqumvgiudr.f62887eablkybsjg.iobyxmoadg(PaymentFlowNetworkModuleKt.REQUEST_TYPE))).zoijcleaow();
                        int iBtonecajqb = -1;
                        try {
                            cdpycssgdh cdpycssgdhVarExecute = FirebasePerfOkHttpClient.execute(lazyNetworkModule.obtainOkHttpClient().iobyxmoadg(zynmafqrjbVarZoijcleaow));
                            try {
                                iBtonecajqb = cdpycssgdhVarExecute.btonecajqb();
                                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                                rg.zoijcleaow.iobyxmoadg(cdpycssgdhVarExecute, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    rg.zoijcleaow.iobyxmoadg(cdpycssgdhVarExecute, th2);
                                    throw th3;
                                }
                            }
                        } catch (Exception e13) {
                            FeatureExtensionsKt.track$default(lazyNetworkModule.tracker, lazyNetworkModule.optionsRepository, e13.toString(), null, ITracker.Priority.ERROR, PaymentFlowNetworkModuleKt.METRIC_SENT_EXCEPTION_TAG, 4, null);
                        }
                        return iBtonecajqb;
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lereixgezr obtainOkHttpClient() {
        if (!EcomStagingConfig.INSTANCE.getUseSslPinning() || !this.optionsRepository.isFeatureEnabledBy(Constants.FeatureName.SSL, EcomFeatureParam.ENABLED_BY_SYSTEM)) {
            return this.okHttpBuilder.ppxfxbqfkf();
        }
        lereixgezr.iobyxmoadg iobyxmoadgVar = this.okHttpBuilder;
        SSLSocketFactory socketFactory = this.sslInteractor.getCustomSSLContext().getSocketFactory();
        zdlpuopuiu.dxjokdxxww(socketFactory, "getSocketFactory(...)");
        return iobyxmoadgVar.kegysxyocb(socketFactory, this.sslInteractor.getCustomX509TrustManager()).dsvhmnatus(this.sslInteractor.getHostnameVerifier()).ppxfxbqfkf();
    }

    private final lm.zdlpuopuiu obtainRetrofit() {
        lm.zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = new lm.zdlpuopuiu.zoijcleaow().zoijcleaow(CommonExtensionsKt.getRetrofitBaseUrl()).gxszxtbevo(obtainOkHttpClient()).iobyxmoadg(mm.iobyxmoadg.gxszxtbevo()).wkgbmnqykc();
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarWkgbmnqykc, "build(...)");
        return zdlpuopuiuVarWkgbmnqykc;
    }

    public final EcomApi getEcomApi() {
        EcomApi ecomApi = this.ecomApi;
        if (ecomApi != null) {
            return ecomApi;
        }
        zdlpuopuiu.pmvmpeiblj("ecomApi");
        return null;
    }

    public final zoijcleaow getNetworkClientBuilder() {
        zoijcleaow zoijcleaowVar = this.networkClientBuilder;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("networkClientBuilder");
        return null;
    }

    public final void init() {
        setEcomApi(obtainEcomApi());
        setNetworkClientBuilder(obtainNetworkClientBuilder());
    }

    public final void setEcomApi(EcomApi ecomApi) {
        zdlpuopuiu.btonecajqb(ecomApi, "<set-?>");
        this.ecomApi = ecomApi;
    }

    public final void setNetworkClientBuilder(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<set-?>");
        this.networkClientBuilder = zoijcleaowVar;
    }
}
