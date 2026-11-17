package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.di.scope.PaymentFlowScope;
import modern.payments.ecomAndroid.domain.repository.ThreeDSecureRepository;
import modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser;
import modern.payments.ecomAndroid.util.htmlParser.impl.HtmlFormParserImpl;
import modern.payments.ecomAndroid.util.jsonParamHelper.JsonParamHelperUtil;
import modern.payments.ecomAndroid.util.jsonParamHelper.impl.JsonParamHelperUtilImpl;
import modern.payments.ecomAndroid.util.shaker.ShakeDetector;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/di/module/paymentFlowModule/UtilModule;", "", "()V", "provideHtmlFormParser", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser;", "provideJsonParamHelper", "Lmodern/payments/ecomAndroid/util/jsonParamHelper/JsonParamHelperUtil;", "threeDSecureRepository", "Lmodern/payments/ecomAndroid/domain/repository/ThreeDSecureRepository;", "provideShakeDetector", "Lmodern/payments/ecomAndroid/util/shaker/ShakeDetector;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UtilModule {
    @PaymentFlowScope
    public final HtmlFormParser provideHtmlFormParser() {
        return new HtmlFormParserImpl();
    }

    @PaymentFlowScope
    public final JsonParamHelperUtil provideJsonParamHelper(ThreeDSecureRepository threeDSecureRepository) {
        zdlpuopuiu.btonecajqb(threeDSecureRepository, "threeDSecureRepository");
        return new JsonParamHelperUtilImpl(threeDSecureRepository);
    }

    public final ShakeDetector provideShakeDetector() {
        return new ShakeDetector();
    }
}
