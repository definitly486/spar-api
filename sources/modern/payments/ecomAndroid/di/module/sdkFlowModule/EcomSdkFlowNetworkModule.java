package modern.payments.ecomAndroid.di.module.sdkFlowModule;

import bl.ppxfxbqfkf;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.istkbnxepw;
import lk.iwizpuwonk;
import lk.lereixgezr;
import lk.zynmafqrjb;
import mj.wkgbmnqykc;
import modern.payments.ecomAndroid.data.api.UnsafeCallEcomApi;
import modern.payments.ecomAndroid.di.module.sdkFlowModule.EcomSdkFlowNetworkModule;
import modern.payments.ecomAndroid.di.qualifier.sslInteractor.UnsafeSslInteractor;
import modern.payments.ecomAndroid.di.scope.SdkFlowScope;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.ResourceManager;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.ResponseExtensionKt;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandlerImpl;
import modern.payments.ecomAndroid.util.headersHandler.HttpHeadersHandler;
import modern.payments.ecomAndroid.util.headersHandler.HttpHeadersHandlerImpl;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.B3HeaderBuilder;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.XPodStickyHandler;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.XPodStickyHandlerImpl;
import modern.payments.ecomAndroid.util.interceptor.HostSelectionInterceptor;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import modern.payments.ecomAndroid.util.logging.CustomHttpLoggerImpl;
import modern.payments.ecomAndroid.util.ssl.SSLInteractor;
import modern.payments.ecomAndroid.util.ssl.UnsafeSslInteractorImpl;
import modern.payments.tracker.ITracker;
import modern.payments.tracker.util.contract.LoggingContract;
import zk.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 O2\u00020\u0001:\u0001OB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010&\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020$H\u0007¢\u0006\u0004\b,\u0010-JG\u0010<\u001a\u00020(2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020 2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020.H\u0007¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u000202H\u0007¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u000208H\u0007¢\u0006\u0004\bF\u0010GJ\u001f\u0010K\u001a\u00020>2\u0006\u0010H\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0007¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\"H\u0007¢\u0006\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/sdkFlowModule/EcomSdkFlowNetworkModule;", "", "<init>", "()V", "Llk/zynmafqrjb;", "request", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lgg/wwaezpbzkn;", "readAndLogRequest", "(Llk/zynmafqrjb;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Llk/cdpycssgdh;", "response", "readAndLogResponse", "(Llk/cdpycssgdh;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Llm/zdlpuopuiu;", "retrofit", "Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "provideUnsafeEcomApi", "(Llm/zdlpuopuiu;)Lmodern/payments/ecomAndroid/data/api/UnsafeCallEcomApi;", "Llk/lereixgezr;", "okHttpClient", "provideRetrofit", "(Llk/lereixgezr;)Llm/zdlpuopuiu;", "Llk/lereixgezr$iobyxmoadg;", "okHttpBuilder", "provideOkHttpClient", "(Llk/lereixgezr$iobyxmoadg;)Llk/lereixgezr;", "Llk/iwizpuwonk;", "interceptor", "Lzk/iobyxmoadg;", "loggingInterceptor", "Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "sslInteractor", "Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;", "hostSelectionInterceptor", "provideNoSslPinningOkHttpBuilder", "(Llk/iwizpuwonk;Lzk/iobyxmoadg;Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;)Llk/lereixgezr$iobyxmoadg;", "Lmodern/payments/ecomAndroid/util/headersHandler/HttpHeadersHandler;", "httpHeadersHandler", "provideInterceptor", "(Lmodern/payments/ecomAndroid/util/headersHandler/HttpHeadersHandler;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)Llk/iwizpuwonk;", "provideHostSelectionInterceptor", "()Lmodern/payments/ecomAndroid/util/interceptor/HostSelectionInterceptor;", "Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/B3HeaderBuilder;", "b3HeaderBuilder", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "resourceManager", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "setCookieHandler", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;", "xPodStickyHandler", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "ipAddressProvider", "provideHttpHeadersHandler", "(Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/B3HeaderBuilder;Lmodern/payments/ecomAndroid/util/ResourceManager;Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;)Lmodern/payments/ecomAndroid/util/headersHandler/HttpHeadersHandler;", "Lzk/iobyxmoadg$zoijcleaow;", "customHttpLoggerImpl", "provideLoggingInterceptor", "(Lzk/iobyxmoadg$zoijcleaow;)Lzk/iobyxmoadg;", "provideB3HeaderBuilder", "()Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/B3HeaderBuilder;", "provideSetCookieHandler", "()Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "provideXPodStickyHandler", "()Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;", "ecomSdkOptionsRepository", "Lmodern/payments/tracker/util/contract/LoggingContract;", "loggingContract", "provideCustomHttpLogger", "(Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/tracker/util/contract/LoggingContract;)Lzk/iobyxmoadg$zoijcleaow;", "provideUnsafeSslInteractor", "()Lmodern/payments/ecomAndroid/util/ssl/SSLInteractor;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomSdkFlowNetworkModule {
    public static final String DEFAULT_BASE_URL = "https:\\localhost";

    /* JADX INFO: Access modifiers changed from: private */
    public static final cdpycssgdh provideInterceptor$lambda$0(HttpHeadersHandler httpHeadersHandler, EcomSdkFlowNetworkModule this$0, ITracker tracker, EcomSdkOptionsRepository optionsRepository, iwizpuwonk.iobyxmoadg chain) {
        zdlpuopuiu.btonecajqb(httpHeadersHandler, "$httpHeadersHandler");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        zdlpuopuiu.btonecajqb(tracker, "$tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "$optionsRepository");
        zdlpuopuiu.btonecajqb(chain, "chain");
        zynmafqrjb zynmafqrjbVarAddHeaders = httpHeadersHandler.addHeaders(chain.dxjokdxxww());
        this$0.readAndLogRequest(zynmafqrjbVarAddHeaders, tracker, optionsRepository);
        cdpycssgdh cdpycssgdhVarZoijcleaow = chain.zoijcleaow(zynmafqrjbVarAddHeaders);
        httpHeadersHandler.processHeadersData(cdpycssgdhVarZoijcleaow);
        this$0.readAndLogResponse(cdpycssgdhVarZoijcleaow, tracker, optionsRepository);
        return cdpycssgdhVarZoijcleaow;
    }

    private final void readAndLogRequest(zynmafqrjb request, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
            istkbnxepw istkbnxepwVarIobyxmoadg = request.iobyxmoadg();
            if (istkbnxepwVarIobyxmoadg != null) {
                istkbnxepwVarIobyxmoadg.dxjokdxxww(ppxfxbqfkfVar);
            }
            FeatureExtensionsKt.track$default(tracker, optionsRepository, request.eablkybsjg() + "\nBody: " + StringExtensionsKt.toJsonView(ppxfxbqfkfVar.F(wkgbmnqykc.f67326zoijcleaow)), null, ITracker.Priority.INFO, "REQUEST : " + request.gtknphoqwx(), 4, null);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            FeatureExtensionsKt.track$default(tracker, optionsRepository, String.valueOf(thDxjokdxxww), null, ITracker.Priority.ERROR, "READ BODY EXCEPTION", 4, null);
        }
    }

    private final void readAndLogResponse(cdpycssgdh response, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            FeatureExtensionsKt.track$default(tracker, optionsRepository, response.kcexrzcfyt() + "\nBody: " + StringExtensionsKt.toJsonView(ResponseExtensionKt.responseBodyCopy(response).agtfadlqog()), null, ITracker.Priority.INFO, "RESPONSE --> " + response.btonecajqb() + " : " + response.cdpycssgdh().gtknphoqwx(), 4, null);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            FeatureExtensionsKt.track$default(tracker, optionsRepository, String.valueOf(thDxjokdxxww), null, ITracker.Priority.ERROR, "READ BODY EXCEPTION", 4, null);
        }
    }

    @SdkFlowScope
    public final B3HeaderBuilder provideB3HeaderBuilder() {
        return new B3HeaderBuilder();
    }

    @SdkFlowScope
    public final iobyxmoadg.zoijcleaow provideCustomHttpLogger(EcomSdkOptionsRepository ecomSdkOptionsRepository, LoggingContract loggingContract) {
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        zdlpuopuiu.btonecajqb(loggingContract, "loggingContract");
        return new CustomHttpLoggerImpl(loggingContract, ecomSdkOptionsRepository);
    }

    @SdkFlowScope
    public final HostSelectionInterceptor provideHostSelectionInterceptor() {
        return new HostSelectionInterceptorImpl();
    }

    @SdkFlowScope
    public final HttpHeadersHandler provideHttpHeadersHandler(B3HeaderBuilder b3HeaderBuilder, ResourceManager resourceManager, SetCookieHandler setCookieHandler, MerchantDataProvider merchantDataProvider, AppDataRepository appDataRepository, XPodStickyHandler xPodStickyHandler, IpAddressProvider ipAddressProvider) {
        zdlpuopuiu.btonecajqb(b3HeaderBuilder, "b3HeaderBuilder");
        zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(xPodStickyHandler, "xPodStickyHandler");
        zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        return new HttpHeadersHandlerImpl(b3HeaderBuilder, resourceManager, setCookieHandler, merchantDataProvider, appDataRepository, xPodStickyHandler, ipAddressProvider);
    }

    @SdkFlowScope
    public final iwizpuwonk provideInterceptor(final HttpHeadersHandler httpHeadersHandler, final ITracker tracker, final EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(httpHeadersHandler, "httpHeadersHandler");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        return new iwizpuwonk() { // from class: jk.iobyxmoadg
            @Override // lk.iwizpuwonk
            public final cdpycssgdh intercept(iwizpuwonk.iobyxmoadg iobyxmoadgVar) {
                return EcomSdkFlowNetworkModule.provideInterceptor$lambda$0(httpHeadersHandler, this, tracker, optionsRepository, iobyxmoadgVar);
            }
        };
    }

    @SdkFlowScope
    public final iobyxmoadg provideLoggingInterceptor(iobyxmoadg.zoijcleaow customHttpLoggerImpl) {
        zdlpuopuiu.btonecajqb(customHttpLoggerImpl, "customHttpLoggerImpl");
        return new iobyxmoadg(customHttpLoggerImpl).eablkybsjg(iobyxmoadg.EnumC3324iobyxmoadg.BODY);
    }

    @SdkFlowScope
    public final lereixgezr.iobyxmoadg provideNoSslPinningOkHttpBuilder(iwizpuwonk interceptor, iobyxmoadg loggingInterceptor, @UnsafeSslInteractor SSLInteractor sslInteractor, HostSelectionInterceptor hostSelectionInterceptor) {
        zdlpuopuiu.btonecajqb(interceptor, "interceptor");
        zdlpuopuiu.btonecajqb(loggingInterceptor, "loggingInterceptor");
        zdlpuopuiu.btonecajqb(sslInteractor, "sslInteractor");
        zdlpuopuiu.btonecajqb(hostSelectionInterceptor, "hostSelectionInterceptor");
        lereixgezr.iobyxmoadg iobyxmoadgVarWypolnanlu = new lereixgezr().lereixgezr().zoijcleaow(loggingInterceptor).iobyxmoadg(interceptor).iobyxmoadg(hostSelectionInterceptor).wypolnanlu(20000L, TimeUnit.MILLISECONDS);
        SSLSocketFactory socketFactory = sslInteractor.getCustomSSLContext().getSocketFactory();
        zdlpuopuiu.dxjokdxxww(socketFactory, "getSocketFactory(...)");
        return iobyxmoadgVarWypolnanlu.kegysxyocb(socketFactory, sslInteractor.getCustomX509TrustManager()).dsvhmnatus(sslInteractor.getHostnameVerifier());
    }

    @SdkFlowScope
    public final lereixgezr provideOkHttpClient(lereixgezr.iobyxmoadg okHttpBuilder) {
        zdlpuopuiu.btonecajqb(okHttpBuilder, "okHttpBuilder");
        return okHttpBuilder.ppxfxbqfkf();
    }

    @SdkFlowScope
    public final lm.zdlpuopuiu provideRetrofit(lereixgezr okHttpClient) {
        zdlpuopuiu.btonecajqb(okHttpClient, "okHttpClient");
        lm.zdlpuopuiu zdlpuopuiuVarWkgbmnqykc = new lm.zdlpuopuiu.zoijcleaow().zoijcleaow(DEFAULT_BASE_URL).gxszxtbevo(okHttpClient).iobyxmoadg(mm.iobyxmoadg.gxszxtbevo()).wkgbmnqykc();
        zdlpuopuiu.dxjokdxxww(zdlpuopuiuVarWkgbmnqykc, "build(...)");
        return zdlpuopuiuVarWkgbmnqykc;
    }

    @SdkFlowScope
    public final SetCookieHandler provideSetCookieHandler() {
        return new SetCookieHandlerImpl();
    }

    @SdkFlowScope
    public final UnsafeCallEcomApi provideUnsafeEcomApi(lm.zdlpuopuiu retrofit) {
        zdlpuopuiu.btonecajqb(retrofit, "retrofit");
        Object objZoijcleaow = retrofit.zoijcleaow(UnsafeCallEcomApi.class);
        zdlpuopuiu.dxjokdxxww(objZoijcleaow, "create(...)");
        return (UnsafeCallEcomApi) objZoijcleaow;
    }

    @SdkFlowScope
    @UnsafeSslInteractor
    public final SSLInteractor provideUnsafeSslInteractor() {
        return new UnsafeSslInteractorImpl();
    }

    @SdkFlowScope
    public final XPodStickyHandler provideXPodStickyHandler() {
        return new XPodStickyHandlerImpl();
    }
}
