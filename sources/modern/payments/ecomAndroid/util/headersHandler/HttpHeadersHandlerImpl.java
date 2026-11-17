package modern.payments.ecomAndroid.util.headersHandler;

import android.os.Build;
import cm.kcexrzcfyt;
import cm.rgvfuqvkyq;
import em.iobyxmoadg;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.zynmafqrjb;
import modern.payments.ecomAndroid.data.Utils;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.data.util.ApiImmutableConstantsKt;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.MerchantInitialData;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.util.ResourceManager;
import modern.payments.ecomAndroid.util.extension.RequestExtentionsKt;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import modern.payments.ecomAndroid.util.headerBuilder.SetCookieHandler;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.B3HeaderBuilder;
import modern.payments.ecomAndroid.util.headersHandler.headerBuilder.XPodStickyHandler;
import modern.payments.p003ecomandroid.BuildConfig;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J%\u0010\u001c\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101¨\u00063"}, d2 = {"Lmodern/payments/ecomAndroid/util/headersHandler/HttpHeadersHandlerImpl;", "Lmodern/payments/ecomAndroid/util/headersHandler/HttpHeadersHandler;", "Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/B3HeaderBuilder;", "b3HeaderBuilder", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "resourceManager", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "setCookieHandler", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;", "xPodStickyHandler", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "ipAddressProvider", "<init>", "(Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/B3HeaderBuilder;Lmodern/payments/ecomAndroid/util/ResourceManager;Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;)V", "Llk/zynmafqrjb$iobyxmoadg;", "", "useRefresh", "addCookieHeader", "(Llk/zynmafqrjb$iobyxmoadg;Z)Llk/zynmafqrjb$iobyxmoadg;", "needToAdd", "addXSystemIdHeader", "", ExternalMetricsManagerImpl.NAME, "value", "addHeaderIfNotEmpty", "(Llk/zynmafqrjb$iobyxmoadg;Ljava/lang/String;Ljava/lang/String;)Llk/zynmafqrjb$iobyxmoadg;", "getUserTime", "()Ljava/lang/String;", "getOsType", "getDeviceName", "Llk/zynmafqrjb;", "request", "addHeaders", "(Llk/zynmafqrjb;)Llk/zynmafqrjb;", "Llk/cdpycssgdh;", "response", "Lgg/wwaezpbzkn;", "processHeadersData", "(Llk/cdpycssgdh;)V", "Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/B3HeaderBuilder;", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/util/headersHandler/headerBuilder/XPodStickyHandler;", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HttpHeadersHandlerImpl implements HttpHeadersHandler {
    private static final String AUTH_END_POINT = "sdkAuth";
    private static final String DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd'T'HH:mm:ssXXX";
    private static final String PAYMENT_TOKEN_END_POINT = "paymentToken";
    private static final String RU = "RU";
    private static final String SESSION_ID_END_POINT = "sessionId";
    private final AppDataRepository appDataRepository;
    private final B3HeaderBuilder b3HeaderBuilder;
    private final IpAddressProvider ipAddressProvider;
    private final MerchantDataProvider merchantDataProvider;
    private final ResourceManager resourceManager;
    private final SetCookieHandler setCookieHandler;
    private final XPodStickyHandler xPodStickyHandler;

    public HttpHeadersHandlerImpl(B3HeaderBuilder b3HeaderBuilder, ResourceManager resourceManager, SetCookieHandler setCookieHandler, MerchantDataProvider merchantDataProvider, AppDataRepository appDataRepository, XPodStickyHandler xPodStickyHandler, IpAddressProvider ipAddressProvider) {
        zdlpuopuiu.btonecajqb(b3HeaderBuilder, "b3HeaderBuilder");
        zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(xPodStickyHandler, "xPodStickyHandler");
        zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        this.b3HeaderBuilder = b3HeaderBuilder;
        this.resourceManager = resourceManager;
        this.setCookieHandler = setCookieHandler;
        this.merchantDataProvider = merchantDataProvider;
        this.appDataRepository = appDataRepository;
        this.xPodStickyHandler = xPodStickyHandler;
        this.ipAddressProvider = ipAddressProvider;
    }

    private final zynmafqrjb.iobyxmoadg addCookieHeader(zynmafqrjb.iobyxmoadg iobyxmoadgVar, boolean z13) {
        return iobyxmoadgVar.iobyxmoadg("Cookie", this.setCookieHandler.getSetCookieData(z13));
    }

    private final zynmafqrjb.iobyxmoadg addHeaderIfNotEmpty(zynmafqrjb.iobyxmoadg iobyxmoadgVar, String str, String str2) {
        return (str2 == null || str2.length() == 0) ? iobyxmoadgVar : iobyxmoadgVar.iobyxmoadg(str, str2);
    }

    private final zynmafqrjb.iobyxmoadg addXSystemIdHeader(zynmafqrjb.iobyxmoadg iobyxmoadgVar, boolean z13) {
        return z13 ? iobyxmoadgVar.iobyxmoadg("X-System-Id", ApiImmutableConstantsKt.STATIC_SYSTEM_ID_HEADER) : iobyxmoadgVar;
    }

    private final String getDeviceName() {
        return Build.MANUFACTURER + ' ' + Build.MODEL;
    }

    private final String getOsType() {
        ResourceManager resourceManager = this.resourceManager;
        int i13 = R.string.ecomOsType;
        String RELEASE = Build.VERSION.RELEASE;
        zdlpuopuiu.dxjokdxxww(RELEASE, "RELEASE");
        return resourceManager.getString(i13, RELEASE);
    }

    private final String getUserTime() {
        String strKcexrzcfyt = kcexrzcfyt.wwaezpbzkn().jlmebxxoox(rgvfuqvkyq.cqumvgiudr("UTC")).kcexrzcfyt(iobyxmoadg.lqeggnwhkg(DATE_TIME_FORMAT_PATTERN));
        zdlpuopuiu.lqeggnwhkg(strKcexrzcfyt);
        if (!mj.kcexrzcfyt.ulzqkzuiru(strKcexrzcfyt, 'Z', false, 2, null)) {
            return strKcexrzcfyt;
        }
        return mj.kcexrzcfyt.y(strKcexrzcfyt, strKcexrzcfyt.length() - 1) + "+00:00";
    }

    @Override // modern.payments.ecomAndroid.util.headersHandler.HttpHeadersHandler
    public zynmafqrjb addHeaders(zynmafqrjb request) {
        zdlpuopuiu.btonecajqb(request, "request");
        boolean z13 = true;
        zynmafqrjb.iobyxmoadg iobyxmoadgVarAddCookieHeader = addCookieHeader(request.nufgyqmvbu(), zdlpuopuiu.eablkybsjg(RequestExtentionsKt.shortPath(request), SESSION_ID_END_POINT) || zdlpuopuiu.eablkybsjg(RequestExtentionsKt.shortPath(request), AUTH_END_POINT));
        if (!zdlpuopuiu.eablkybsjg(RequestExtentionsKt.shortPath(request), SESSION_ID_END_POINT) && !zdlpuopuiu.eablkybsjg(RequestExtentionsKt.shortPath(request), PAYMENT_TOKEN_END_POINT)) {
            z13 = false;
        }
        zynmafqrjb.iobyxmoadg iobyxmoadgVarAddXSystemIdHeader = addXSystemIdHeader(iobyxmoadgVarAddCookieHeader, z13);
        MerchantInitialData merchantInitialData = (MerchantInitialData) this.merchantDataProvider.getMerchantData().getValue();
        String authorization = merchantInitialData != null ? merchantInitialData.getAuthorization() : null;
        if (authorization == null) {
            authorization = "";
        }
        zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVarAddXSystemIdHeader.iobyxmoadg("Authorization", authorization).iobyxmoadg("RqUID", Utils.INSTANCE.generateRqUID32Sym()).iobyxmoadg("UserTm", getUserTime()).iobyxmoadg("Accept-Language", RU);
        MerchantInitialData merchantInitialData2 = (MerchantInitialData) this.merchantDataProvider.getMerchantData().getValue();
        String orderNumber = merchantInitialData2 != null ? merchantInitialData2.getOrderNumber() : null;
        if (orderNumber == null) {
            orderNumber = "";
        }
        zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = addHeaderIfNotEmpty(iobyxmoadgVarIobyxmoadg.iobyxmoadg("orderNumber", orderNumber).iobyxmoadg("x-b3-spanid", this.b3HeaderBuilder.getSpanId()).iobyxmoadg("x-b3-traceid", this.b3HeaderBuilder.getTraceId()), "x-pod-sticky", this.xPodStickyHandler.takeHeader()).iobyxmoadg("appName", Constants.DEFAULT_APP_NAME).iobyxmoadg("sdkVersion", BuildConfig.VERSION_NAME);
        String str = (String) this.ipAddressProvider.getIp().getValue();
        return addHeaderIfNotEmpty(iobyxmoadgVarIobyxmoadg2.iobyxmoadg("X-Net-Add-Sour", str != null ? str : "").iobyxmoadg("OS", getOsType()).iobyxmoadg("deviceName", getDeviceName()), "localSessionId", (String) this.appDataRepository.getLocalSessionId().getValue()).zoijcleaow();
    }

    @Override // modern.payments.ecomAndroid.util.headersHandler.HttpHeadersHandler
    public void processHeadersData(cdpycssgdh response) {
        zdlpuopuiu.btonecajqb(response, "response");
        this.setCookieHandler.saveSetCookieData(response);
        this.xPodStickyHandler.saveHeader(response);
    }
}
