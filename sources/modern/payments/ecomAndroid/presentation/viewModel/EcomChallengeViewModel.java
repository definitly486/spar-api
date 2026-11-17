package modern.payments.ecomAndroid.presentation.viewModel;

import android.webkit.WebResourceError;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import mg.zoijcleaow;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.data.config.EcomStagingConfig;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.model.response.PaymentOrderResponseBody;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.presentation.fragment.MerchantAnalyticalEvent;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomChallengeAnalytic;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.WebViewAction;
import modern.payments.ecomAndroid.util.event.Event;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.ecomAndroid.util.htmlParser.HtmlFormParser;
import ng.iobyxmoadg;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import pj.ikoacuggdj;
import sj.dxjokdxxww;
import sj.jpowsppfya;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000256B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110(8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b-\u0010.R\u001f\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomChallengeViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "screenState", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser;", "htmlFormParser", "<init>", "(Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser;)V", "", "html", "Lgg/wwaezpbzkn;", "proceedHtml", "(Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "error", "proceedError", "(Landroid/webkit/WebResourceError;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "event", "handleAnalyticalEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;)V", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/viewModel/ChallengeEvent;)V", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lmodern/payments/ecomAndroid/util/htmlParser/HtmlFormParser;", "Lsj/zynmafqrjb;", "Lmodern/payments/ecomAndroid/presentation/viewModel/WebViewState;", "webViewState", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "challengeScreenState", "Lsj/wypolnanlu;", "htmlData", "getHtmlData", "()Lsj/wypolnanlu;", "Lsj/lqeggnwhkg;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil$MetricEvent;", "metricToSend", "Lsj/lqeggnwhkg;", "getMetricToSend", "()Lsj/lqeggnwhkg;", "Companion", "UrlParamName", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomChallengeViewModel extends BaseViewModel<ChallengeEvent> {
    private static final String HTML_FORM_CREQ = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"> \n<html> \n <head> \n  <title>Redirect to ACS</title> \n </head> \n <body bgcolor=\"#F2F2F2\" OnLoad=\"OnLoadEvent();\"> \n  <form name=\"downloadForm\" action=\"ACS_URL\" method=\"POST\"> \n   <input type=\"hidden\" name=\"creq\" value=\"CREQ_DATA\"> \n            <input type=\"hidden\" name=\"TermUrl\" value=\"TERM_URL_DATA\"> \n   <noscript> \n    <center>Please click the submit button below.<br> \n    <input type=\"submit\" name=\"submit\" value=\"Submit\"/> \n   </noscript> \n  </form> \n  <SCRIPT LANGUAGE=\"Javascript\"> \n    function OnLoadEvent() { document.downloadForm.submit(); } \n  </SCRIPT> \n </body> \n</html>";
    private static final String HTML_FORM_PAREQ = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"> \n<html> \n <head> \n  <title>Redirect to ACS</title> \n </head> \n <body bgcolor=\"#F2F2F2\" OnLoad=\"OnLoadEvent();\"> \n  <form name=\"downloadForm\" action=\"ACS_URL\" method=\"POST\"> \n   <input type=\"hidden\" name=\"PaReq\" value=\"PAREQ_DATA\"> \n            <input type=\"hidden\" name=\"TermUrl\" value=\"TERM_URL_DATA\"> \n            <input type=\"hidden\" name=\"MD\" value=\"MD\"> \n   <noscript> \n    <center>Please click the submit button below.<br> \n    <input type=\"submit\" name=\"submit\" value=\"Submit\"/> \n   </noscript> \n  </form> \n  <SCRIPT LANGUAGE=\"Javascript\"> \n    function OnLoadEvent() { document.downloadForm.submit(); } \n  </SCRIPT> \n </body> \n</html>";
    private static final String LOCAL_MOCK_PARAM_DATA = "eyJ0aHJlZURTU2VydmVyVHJhbnNJRCI6Ijk3MjU1Y2M3LTk2ODMtNDc4ZS1hOGY5LTcyZjA2YWUwMTU5OCIsImFjc1RyYW5zSUQiOiITFmZWFjZjYwYmM0YWE0OTQ2NmU4NzUxM2YxN2RjMyIsImNoYWxsZW5nZVdpbmRvd1NpemUiOiIwNSIsIm1lc3NhZ2VUeXBlIjoiQ1JlcSsIm1lc3NhZ2VWZXJzaW9uIjoiMi4xLjAifQ==";
    private static final String METHOD_METRIC = "method";
    private static final String PAYMENT_METRIC = "payment";
    public static final String PAYMENT_URL = "aHR0cHM6Ly9hY3MucGF5bWVudHMuc2JlcmJhbmsucnUvYWNzL2NyZXE=";
    private final wypolnanlu challengeScreenState;
    private final EcomMetricUtil ecomMetricUtil;
    private final wypolnanlu htmlData;
    private final HtmlFormParser htmlFormParser;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final lqeggnwhkg metricToSend;
    private final Reducer reducer;
    private final zynmafqrjb webViewState;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$1", f = "EcomChallengeViewModel.kt", l = {139}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomChallengeViewModel.this.new AnonymousClass1(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(EcomChallengeViewModel.this.getMetricToSend());
                final EcomChallengeViewModel ecomChallengeViewModel = EcomChallengeViewModel.this;
                nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel.1.1
                    @Override // sj.nufgyqmvbu
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, lg.gxszxtbevo gxszxtbevoVar) {
                        return emit((EcomMetricUtil.MetricEvent) obj2, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
                    }

                    public final Object emit(EcomMetricUtil.MetricEvent metricEvent, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
                        ecomChallengeViewModel.ecomMetricUtil.report(metricEvent);
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                };
                this.label = 1;
                if (lqeggnwhkgVarLereixgezr.collect(nufgyqmvbuVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomChallengeViewModel$UrlParamName;", "", "param", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getParam", "()Ljava/lang/String;", "CREQ", "PAREQ", "TERMURL", "MD", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum UrlParamName {
        CREQ("creq"),
        PAREQ("PaReq"),
        TERMURL("TermUrl"),
        MD("MD");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = ng.zoijcleaow.iobyxmoadg(values());
        private final String param;

        UrlParamName(String str) {
            this.param = str;
        }

        public static iobyxmoadg getEntries() {
            return $ENTRIES;
        }

        public final String getParam() {
            return this.param;
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleAnalyticalEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleAnalyticalEvent$1", f = "EcomChallengeViewModel.kt", l = {148}, m = "invokeSuspend")
    static final class C40881 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ MerchantAnalyticalEvent $event;
        int label;
        final /* synthetic */ EcomChallengeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40881(MerchantAnalyticalEvent merchantAnalyticalEvent, EcomChallengeViewModel ecomChallengeViewModel, lg.gxszxtbevo<? super C40881> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$event = merchantAnalyticalEvent;
            this.this$0 = ecomChallengeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new C40881(this.$event, this.this$0, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticalEvent merchantAnalyticalEvent = this.$event;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(merchantAnalyticalEvent, "null cannot be cast to non-null type modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomChallengeAnalytic");
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((EcomChallengeAnalytic) merchantAnalyticalEvent, EcomChallengeAnalytic.On3DsViewShow.INSTANCE)) {
                    MerchantAnalyticRepository merchantAnalyticRepository = this.this$0.merchantAnalyticRepository;
                    this.label = 1;
                    if (merchantAnalyticRepository.on3dsViewShow(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40881) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleEvent$1", f = "EcomChallengeViewModel.kt", l = {158}, m = "invokeSuspend")
    static final class C40891 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40891(lg.gxszxtbevo<? super C40891> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomChallengeViewModel.this.new C40891(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomChallengeViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.on3dsViewReady(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40891) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleEvent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleEvent$2", f = "EcomChallengeViewModel.kt", l = {168}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass2(lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomChallengeViewModel.this.new AnonymousClass2(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomChallengeViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.on3dsViewTimeout(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleEvent$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$handleEvent$3", f = "EcomChallengeViewModel.kt", l = {176}, m = "invokeSuspend")
    static final class AnonymousClass3 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass3(lg.gxszxtbevo<? super AnonymousClass3> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomChallengeViewModel.this.new AnonymousClass3(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomChallengeViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.on3dsViewReady(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass3) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomChallengeViewModel(StateHandler screenState, Reducer reducer, ConfigRepository configRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository, HtmlFormParser htmlFormParser) {
        super(configRepository, reducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screenState, "screenState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(htmlFormParser, "htmlFormParser");
        this.reducer = reducer;
        this.ecomMetricUtil = ecomMetricUtil;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        this.htmlFormParser = htmlFormParser;
        this.webViewState = kegysxyocb.iobyxmoadg(WebViewState.LoadingUrl.INSTANCE);
        final wypolnanlu state = screenState.getState();
        final lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$1$2", f = "EcomChallengeViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
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
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        Object objPeek = ((Event) obj).peek();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(objPeek, anonymousClass1) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = state.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        final lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$filterIsInstance$1$2", f = "EcomChallengeViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
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
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        if (obj instanceof State.ThreeDSWebViewChallenge) {
                            anonymousClass1.label = 1;
                            if (nufgyqmvbuVar.emit(obj, anonymousClass1) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = lqeggnwhkgVar.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        lqeggnwhkg lqeggnwhkgVar3 = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$2$2", f = "EcomChallengeViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
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
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        PaymentOrderResponseBody paymentOrderResponseBody = ((State.ThreeDSWebViewChallenge) obj).getPaymentOrderResponseBody();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(paymentOrderResponseBody, anonymousClass1) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = lqeggnwhkgVar2.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = ulzqkzuiru.iobyxmoadg(this);
        jpowsppfya.iobyxmoadg iobyxmoadgVar = jpowsppfya.f106926iobyxmoadg;
        final wypolnanlu wypolnanluVarRibwqtqdhb = dxjokdxxww.ribwqtqdhb(lqeggnwhkgVar3, cllcsxoeizVarIobyxmoadg, jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.challengeScreenState = wypolnanluVarRibwqtqdhb;
        wypolnanlu wypolnanluVarRibwqtqdhb2 = dxjokdxxww.ribwqtqdhb(new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomChallengeViewModel$special$$inlined$map$3$2", f = "EcomChallengeViewModel.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends wkgbmnqykc {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lg.gxszxtbevo gxszxtbevoVar) {
                        super(gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(nufgyqmvbu nufgyqmvbuVar) {
                    this.$this_unsafeFlow = nufgyqmvbuVar;
                }

                /* JADX WARN: Code duplicated, block: B:53:0x00d7 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:55:0x00de  */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Code duplicated, block: B:87:0x0142  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
                    String paReq;
                    String strHcddaimhww;
                    String acsUrl;
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
                    Object obj2 = anonymousClass1.result;
                    Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        PaymentOrderResponseBody paymentOrderResponseBody = (PaymentOrderResponseBody) obj;
                        if (EcomStagingConfig.INSTANCE.isLocalMocksMode()) {
                            strHcddaimhww = kcexrzcfyt.hcddaimhww(kcexrzcfyt.hcddaimhww("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"> \n<html> \n <head> \n  <title>Redirect to ACS</title> \n </head> \n <body bgcolor=\"#F2F2F2\" OnLoad=\"OnLoadEvent();\"> \n  <form name=\"downloadForm\" action=\"ACS_URL\" method=\"POST\"> \n   <input type=\"hidden\" name=\"creq\" value=\"CREQ_DATA\"> \n            <input type=\"hidden\" name=\"TermUrl\" value=\"TERM_URL_DATA\"> \n   <noscript> \n    <center>Please click the submit button below.<br> \n    <input type=\"submit\" name=\"submit\" value=\"Submit\"/> \n   </noscript> \n  </form> \n  <SCRIPT LANGUAGE=\"Javascript\"> \n    function OnLoadEvent() { document.downloadForm.submit(); } \n  </SCRIPT> \n </body> \n</html>", "CREQ_DATA", "eyJ0aHJlZURTU2VydmVyVHJhbnNJRCI6Ijk3MjU1Y2M3LTk2ODMtNDc4ZS1hOGY5LTcyZjA2YWUwMTU5OCIsImFjc1RyYW5zSUQiOiITFmZWFjZjYwYmM0YWE0OTQ2NmU4NzUxM2YxN2RjMyIsImNoYWxsZW5nZVdpbmRvd1NpemUiOiIwNSIsIm1lc3NhZ2VUeXBlIjoiQ1JlcSsIm1lc3NhZ2VWZXJzaW9uIjoiMi4xLjAifQ==", false, 4, null), "ACS_URL", StringExtensionsKt.decodeBase64(EcomChallengeViewModel.PAYMENT_URL), false, 4, null);
                        } else {
                            String cReq = paymentOrderResponseBody != null ? paymentOrderResponseBody.getCReq() : null;
                            if (cReq == null || cReq.length() == 0) {
                                if (paymentOrderResponseBody != null) {
                                    paReq = paymentOrderResponseBody.getPaReq();
                                } else {
                                    paReq = null;
                                }
                                if (paReq != null || paReq.length() == 0) {
                                    strHcddaimhww = null;
                                } else {
                                    String acsUrl2 = paymentOrderResponseBody != null ? paymentOrderResponseBody.getAcsUrl() : null;
                                    if (acsUrl2 == null || acsUrl2.length() == 0) {
                                        strHcddaimhww = null;
                                    } else {
                                        String paReq2 = paymentOrderResponseBody != null ? paymentOrderResponseBody.getPaReq() : null;
                                        String strHcddaimhww2 = kcexrzcfyt.hcddaimhww("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"> \n<html> \n <head> \n  <title>Redirect to ACS</title> \n </head> \n <body bgcolor=\"#F2F2F2\" OnLoad=\"OnLoadEvent();\"> \n  <form name=\"downloadForm\" action=\"ACS_URL\" method=\"POST\"> \n   <input type=\"hidden\" name=\"PaReq\" value=\"PAREQ_DATA\"> \n            <input type=\"hidden\" name=\"TermUrl\" value=\"TERM_URL_DATA\"> \n            <input type=\"hidden\" name=\"MD\" value=\"MD\"> \n   <noscript> \n    <center>Please click the submit button below.<br> \n    <input type=\"submit\" name=\"submit\" value=\"Submit\"/> \n   </noscript> \n  </form> \n  <SCRIPT LANGUAGE=\"Javascript\"> \n    function OnLoadEvent() { document.downloadForm.submit(); } \n  </SCRIPT> \n </body> \n</html>", "PAREQ_DATA", paReq2 == null ? "" : paReq2, false, 4, null);
                                        String termUrl = paymentOrderResponseBody != null ? paymentOrderResponseBody.getTermUrl() : null;
                                        String strHcddaimhww3 = kcexrzcfyt.hcddaimhww(strHcddaimhww2, "TERM_URL_DATA", termUrl == null ? "" : termUrl, false, 4, null);
                                        acsUrl = paymentOrderResponseBody != null ? paymentOrderResponseBody.getAcsUrl() : null;
                                        strHcddaimhww = kcexrzcfyt.hcddaimhww(strHcddaimhww3, "ACS_URL", acsUrl == null ? "" : acsUrl, false, 4, null);
                                    }
                                }
                            } else {
                                String acsUrl3 = paymentOrderResponseBody != null ? paymentOrderResponseBody.getAcsUrl() : null;
                                if (acsUrl3 == null || acsUrl3.length() == 0) {
                                    if (paymentOrderResponseBody != null) {
                                        paReq = paymentOrderResponseBody.getPaReq();
                                    } else {
                                        paReq = null;
                                    }
                                    if (paReq != null) {
                                        strHcddaimhww = null;
                                    } else {
                                        strHcddaimhww = null;
                                    }
                                } else {
                                    String cReq2 = paymentOrderResponseBody != null ? paymentOrderResponseBody.getCReq() : null;
                                    String strHcddaimhww4 = kcexrzcfyt.hcddaimhww("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"> \n<html> \n <head> \n  <title>Redirect to ACS</title> \n </head> \n <body bgcolor=\"#F2F2F2\" OnLoad=\"OnLoadEvent();\"> \n  <form name=\"downloadForm\" action=\"ACS_URL\" method=\"POST\"> \n   <input type=\"hidden\" name=\"creq\" value=\"CREQ_DATA\"> \n            <input type=\"hidden\" name=\"TermUrl\" value=\"TERM_URL_DATA\"> \n   <noscript> \n    <center>Please click the submit button below.<br> \n    <input type=\"submit\" name=\"submit\" value=\"Submit\"/> \n   </noscript> \n  </form> \n  <SCRIPT LANGUAGE=\"Javascript\"> \n    function OnLoadEvent() { document.downloadForm.submit(); } \n  </SCRIPT> \n </body> \n</html>", "CREQ_DATA", cReq2 == null ? "" : cReq2, false, 4, null);
                                    String termUrl2 = paymentOrderResponseBody != null ? paymentOrderResponseBody.getTermUrl() : null;
                                    String strHcddaimhww5 = kcexrzcfyt.hcddaimhww(strHcddaimhww4, "TERM_URL_DATA", termUrl2 == null ? "" : termUrl2, false, 4, null);
                                    acsUrl = paymentOrderResponseBody != null ? paymentOrderResponseBody.getAcsUrl() : null;
                                    strHcddaimhww = kcexrzcfyt.hcddaimhww(strHcddaimhww5, "ACS_URL", acsUrl == null ? "" : acsUrl, false, 4, null);
                                }
                            }
                        }
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(strHcddaimhww, anonymousClass1) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = wypolnanluVarRibwqtqdhb.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, ulzqkzuiru.iobyxmoadg(this), jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.htmlData = wypolnanluVarRibwqtqdhb2;
        this.metricToSend = dxjokdxxww.wflxmlrfwp(getViewState(), wypolnanluVarRibwqtqdhb2, new EcomChallengeViewModel$metricToSend$1(null));
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void proceedError(WebResourceError error) {
        if (error != null) {
            int errorCode = error.getErrorCode();
            Reducer reducer = this.reducer;
            String strValueOf = String.valueOf(errorCode);
            CharSequence description = error.getDescription();
            reducer.invoke(new Action.HandleException(new State.Error.DefaultException.WhilePayment(new ErrorEntity.HttpError.WebError(strValueOf, description != null ? description.toString() : null), false)));
        }
    }

    private final void proceedHtml(String html) {
        String paresValue;
        Object next;
        Object next2;
        String paresValue2;
        String cresValue;
        if (html != null) {
            List<HtmlFormParser.FormWithCRes> listExtractAllFormsWithCRes = this.htmlFormParser.extractAllFormsWithCRes(html);
            List<HtmlFormParser.FormWithPaRes> listExtractAllFormsWithPaRes = this.htmlFormParser.extractAllFormsWithPaRes(html);
            if (listExtractAllFormsWithCRes.isEmpty() || listExtractAllFormsWithPaRes.isEmpty()) {
                return;
            }
            Iterator<T> it = listExtractAllFormsWithCRes.iterator();
            do {
                paresValue = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    cresValue = ((HtmlFormParser.FormWithCRes) next).getCresValue();
                }
            } while (cresValue == null || kcexrzcfyt.zfvoamnweg(cresValue));
            HtmlFormParser.FormWithCRes formWithCRes = (HtmlFormParser.FormWithCRes) next;
            String cresValue2 = formWithCRes != null ? formWithCRes.getCresValue() : null;
            if (cresValue2 == null) {
                Iterator<T> it2 = listExtractAllFormsWithPaRes.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it2.next();
                        paresValue2 = ((HtmlFormParser.FormWithPaRes) next2).getParesValue();
                    }
                } while (paresValue2 == null || kcexrzcfyt.zfvoamnweg(paresValue2));
                HtmlFormParser.FormWithPaRes formWithPaRes = (HtmlFormParser.FormWithPaRes) next2;
                if (formWithPaRes != null) {
                    paresValue = formWithPaRes.getParesValue();
                }
            }
            this.reducer.invoke(new Action.HandleFinishChallenge(cresValue2, paresValue));
        }
    }

    public final wypolnanlu getHtmlData() {
        return this.htmlData;
    }

    public final lqeggnwhkg getMetricToSend() {
        return this.metricToSend;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleAnalyticalEvent(MerchantAnalyticalEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40881(event, this, null), 2, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(ChallengeEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof ChallengeEvent.ProcessHTML) {
            this.webViewState.setValue(WebViewState.PaymentViewOpened.INSTANCE);
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40891(null), 2, null);
            proceedHtml(((ChallengeEvent.ProcessHTML) event).getHtml());
            return;
        }
        if (event instanceof ChallengeEvent.ProcessError) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.webViewState.getValue(), WebViewState.PaymentViewOpened.INSTANCE) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.webViewState.getValue(), WebViewState.OTPViewOpened.INSTANCE)) {
                return;
            }
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new AnonymousClass2(null), 2, null);
            proceedError(((ChallengeEvent.ProcessError) event).getError());
            return;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ChallengeEvent.RedirectToTargetUrl.INSTANCE)) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, ChallengeEvent.LoadingUrl.INSTANCE)) {
                this.webViewState.setValue(WebViewState.LoadingUrl.INSTANCE);
            }
        } else {
            this.webViewState.setValue(WebViewState.OTPViewOpened.INSTANCE);
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new AnonymousClass3(null), 2, null);
            this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(WebViewAction.REDIRECT_TO_TARGET_URL, Views.WEB_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
        }
    }
}
