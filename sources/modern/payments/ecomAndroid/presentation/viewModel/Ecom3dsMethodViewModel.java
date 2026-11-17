package modern.payments.ecomAndroid.presentation.viewModel;

import android.os.CountDownTimer;
import android.webkit.WebResourceError;
import androidx.lifecycle.ulzqkzuiru;
import com.google.android.gms.common.internal.ImagesContract;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
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
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.Ecom3DsMethodAnalytic;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.WebViewAction;
import modern.payments.ecomAndroid.util.event.Event;
import ng.iobyxmoadg;
import ng.zoijcleaow;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import pj.ikoacuggdj;
import sj.dxjokdxxww;
import sj.jpowsppfya;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.wypolnanlu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001(\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0$8\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "screenState", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;)V", "", ImagesContract.URL, "Lgg/wwaezpbzkn;", "proceedUrl", "(Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "error", "proceedError", "(Landroid/webkit/WebResourceError;Ljava/lang/String;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "event", "handleAnalyticalEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;)V", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodEvent;)V", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "", "isWebViewRedirectHandled", "Z", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentOrderResponseBody;", "challengeScreenState", "Lsj/wypolnanlu;", "modern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$timer$1", "timer", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$timer$1;", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$ChallengeUrlData;", "urlData", "getUrlData", "()Lsj/wypolnanlu;", "ChallengeUrlData", "UrlParamName", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Ecom3dsMethodViewModel extends BaseViewModel<Ecom3dsMethodEvent> {
    private final wypolnanlu challengeScreenState;
    private final EcomMetricUtil ecomMetricUtil;
    private boolean isWebViewRedirectHandled;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final Reducer reducer;
    private final Ecom3dsMethodViewModel$timer$1 timer;
    private final wypolnanlu urlData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$UrlParamName;", "", "param", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getParam", "()Ljava/lang/String;", "THREEDSMETHOD", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum UrlParamName {
        THREEDSMETHOD("threeDSMethodData");

        private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
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

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$handleAnalyticalEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$handleAnalyticalEvent$1", f = "Ecom3dsMethodViewModel.kt", l = {104}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ MerchantAnalyticalEvent $event;
        int label;
        final /* synthetic */ Ecom3dsMethodViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MerchantAnalyticalEvent merchantAnalyticalEvent, Ecom3dsMethodViewModel ecom3dsMethodViewModel, lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$event = merchantAnalyticalEvent;
            this.this$0 = ecom3dsMethodViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass1(this.$event, this.this$0, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticalEvent merchantAnalyticalEvent = this.$event;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(merchantAnalyticalEvent, "null cannot be cast to non-null type modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.Ecom3DsMethodAnalytic");
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg((Ecom3DsMethodAnalytic) merchantAnalyticalEvent, Ecom3DsMethodAnalytic.On3DsViewShow.INSTANCE)) {
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
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$handleEvent$1", f = "Ecom3dsMethodViewModel.kt", l = {114, BuildConfig.API_LEVEL}, m = "invokeSuspend")
    static final class C40751 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ Ecom3dsMethodEvent $event;
        int label;
        final /* synthetic */ Ecom3dsMethodViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40751(Ecom3dsMethodEvent ecom3dsMethodEvent, Ecom3dsMethodViewModel ecom3dsMethodViewModel, lg.gxszxtbevo<? super C40751> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$event = ecom3dsMethodEvent;
            this.this$0 = ecom3dsMethodViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new C40751(this.$event, this.this$0, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (((Ecom3dsMethodEvent.ProcessUrl) this.$event).getError() == null) {
                    MerchantAnalyticRepository merchantAnalyticRepository = this.this$0.merchantAnalyticRepository;
                    this.label = 1;
                    if (merchantAnalyticRepository.on3dsViewReady(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    MerchantAnalyticRepository merchantAnalyticRepository2 = this.this$0.merchantAnalyticRepository;
                    this.label = 2;
                    if (merchantAnalyticRepository2.on3dsViewTimeout(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40751) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v3, types: [modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$timer$1] */
    public Ecom3dsMethodViewModel(StateHandler screenState, Reducer reducer, ConfigRepository configRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository) {
        super(configRepository, reducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(screenState, "screenState");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        this.reducer = reducer;
        this.ecomMetricUtil = ecomMetricUtil;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        final wypolnanlu state = screenState.getState();
        final lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$1$2", f = "Ecom3dsMethodViewModel.kt", l = {223}, m = "emit")
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
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
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
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        final lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$filterIsInstance$1$2", f = "Ecom3dsMethodViewModel.kt", l = {223}, m = "emit")
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
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        if (obj instanceof State.ThreeDSMethodWebView) {
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
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        lqeggnwhkg lqeggnwhkgVar3 = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$2$2", f = "Ecom3dsMethodViewModel.kt", l = {223}, m = "emit")
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
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        PaymentOrderResponseBody paymentOrderResponseBody = ((State.ThreeDSMethodWebView) obj).getPaymentOrderResponseBody();
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
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = ulzqkzuiru.iobyxmoadg(this);
        jpowsppfya.iobyxmoadg iobyxmoadgVar = jpowsppfya.f106926iobyxmoadg;
        final wypolnanlu wypolnanluVarRibwqtqdhb = dxjokdxxww.ribwqtqdhb(lqeggnwhkgVar3, cllcsxoeizVarIobyxmoadg, jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.challengeScreenState = wypolnanluVarRibwqtqdhb;
        this.timer = new CountDownTimer() { // from class: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$timer$1
            {
                super(60000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.this$0.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(WebViewAction.TIMER_TIMEOUT, Views.WEB_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
                Reducer reducer2 = this.this$0.reducer;
                PaymentOrderResponseBody paymentOrderResponseBody = (PaymentOrderResponseBody) this.this$0.challengeScreenState.getValue();
                String threeDSServerTransId = paymentOrderResponseBody != null ? paymentOrderResponseBody.getThreeDSServerTransId() : null;
                if (threeDSServerTransId == null) {
                    threeDSServerTransId = "";
                }
                reducer2.invoke(new Action.Handle3dsMethodRedirect(false, threeDSServerTransId));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long p13) {
            }
        };
        this.urlData = dxjokdxxww.ribwqtqdhb(new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModel$special$$inlined$map$3$2", f = "Ecom3dsMethodViewModel.kt", l = {223}, m = "emit")
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

                /* JADX WARN: Code duplicated, block: B:46:0x009e  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    AnonymousClass1 anonymousClass1;
                    Ecom3dsMethodViewModel.ChallengeUrlData challengeUrlData;
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
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        PaymentOrderResponseBody paymentOrderResponseBody = (PaymentOrderResponseBody) obj;
                        if (EcomStagingConfig.INSTANCE.isLocalMocksMode()) {
                            challengeUrlData = new Ecom3dsMethodViewModel.ChallengeUrlData("", Ecom3dsMethodViewModel.UrlParamName.THREEDSMETHOD, "eyJ0aHJlZURTU2VydmVyVHJhbnNJRCI6Ijk3MjU1Y2M3LTk2ODMtNDc4ZS1hOGY5LTcyZjA2YWUwMTU5OCIsImFjc1RyYW5zSUQiOiITFmZWFjZjYwYmM0YWE0OTQ2NmU4NzUxM2YxN2RjMyIsImNoYWxsZW5nZVdpbmRvd1NpemUiOiIwNSIsIm1lc3NhZ2VUeXBlIjoiQ1JlcSsIm1lc3NhZ2VWZXJzaW9uIjoiMi4xLjAifQ==");
                        } else {
                            String threeDSMethodData = paymentOrderResponseBody != null ? paymentOrderResponseBody.getThreeDSMethodData() : null;
                            if (threeDSMethodData == null || threeDSMethodData.length() == 0) {
                                challengeUrlData = null;
                            } else {
                                String threeDSServerTransId = paymentOrderResponseBody != null ? paymentOrderResponseBody.getThreeDSServerTransId() : null;
                                if (threeDSServerTransId == null || threeDSServerTransId.length() == 0) {
                                    challengeUrlData = null;
                                } else {
                                    String threeDSMethodNotificationUrl = paymentOrderResponseBody != null ? paymentOrderResponseBody.getThreeDSMethodNotificationUrl() : null;
                                    if (threeDSMethodNotificationUrl == null || threeDSMethodNotificationUrl.length() == 0) {
                                        challengeUrlData = null;
                                    } else {
                                        String threeDSMethodUrl = paymentOrderResponseBody != null ? paymentOrderResponseBody.getThreeDSMethodUrl() : null;
                                        String str = threeDSMethodUrl != null ? threeDSMethodUrl : "";
                                        Ecom3dsMethodViewModel.UrlParamName urlParamName = Ecom3dsMethodViewModel.UrlParamName.THREEDSMETHOD;
                                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(paymentOrderResponseBody);
                                        String threeDSMethodData2 = paymentOrderResponseBody.getThreeDSMethodData();
                                        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(threeDSMethodData2);
                                        challengeUrlData = new Ecom3dsMethodViewModel.ChallengeUrlData(str, urlParamName, threeDSMethodData2);
                                    }
                                }
                            }
                        }
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(challengeUrlData, anonymousClass1) == objGxszxtbevo) {
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
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, ulzqkzuiru.iobyxmoadg(this), jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
    }

    private final void proceedError(WebResourceError error, String url) {
        if (error != null) {
            int errorCode = error.getErrorCode();
            if (url == null || !kcexrzcfyt.sopmlzcsov(url, Ecom3dsMethodViewModelKt.THREE_DS_METHOD_NOTIFICATION_URL, false, 2, null)) {
                Reducer reducer = this.reducer;
                String strValueOf = String.valueOf(errorCode);
                CharSequence description = error.getDescription();
                reducer.invoke(new Action.HandleException(new State.Error.DefaultException.WhilePayment(new ErrorEntity.HttpError.WebError(strValueOf, description != null ? description.toString() : null), false)));
            }
        }
    }

    private final void proceedUrl(String url) {
        String threeDSMethodNotificationUrl;
        PaymentOrderResponseBody paymentOrderResponseBody = (PaymentOrderResponseBody) this.challengeScreenState.getValue();
        if (paymentOrderResponseBody == null || (threeDSMethodNotificationUrl = paymentOrderResponseBody.getThreeDSMethodNotificationUrl()) == null || url == null) {
            return;
        }
        if (kcexrzcfyt.sopmlzcsov(url, threeDSMethodNotificationUrl, false, 2, null)) {
            this.isWebViewRedirectHandled = true;
            cancel();
            Reducer reducer = this.reducer;
            PaymentOrderResponseBody paymentOrderResponseBody2 = (PaymentOrderResponseBody) this.challengeScreenState.getValue();
            String threeDSServerTransId = paymentOrderResponseBody2 != null ? paymentOrderResponseBody2.getThreeDSServerTransId() : null;
            if (threeDSServerTransId == null) {
                threeDSServerTransId = "";
            }
            reducer.invoke(new Action.Handle3dsMethodRedirect(true, threeDSServerTransId));
        }
    }

    public final wypolnanlu getUrlData() {
        return this.urlData;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleAnalyticalEvent(MerchantAnalyticalEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new AnonymousClass1(event, this, null), 2, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(Ecom3dsMethodEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (!(event instanceof Ecom3dsMethodEvent.ProcessUrl)) {
            if (event instanceof Ecom3dsMethodEvent.StartTimer) {
                start();
            }
        } else {
            if (this.isWebViewRedirectHandled) {
                return;
            }
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40751(event, this, null), 2, null);
            Ecom3dsMethodEvent.ProcessUrl processUrl = (Ecom3dsMethodEvent.ProcessUrl) event;
            if (processUrl.getError() == null) {
                proceedUrl(processUrl.getUrl());
            } else {
                proceedError(processUrl.getError(), processUrl.getUrl());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$ChallengeUrlData;", "", ImagesContract.URL, "", "paramName", "Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$UrlParamName;", "paramData", "(Ljava/lang/String;Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$UrlParamName;Ljava/lang/String;)V", "getParamData", "()Ljava/lang/String;", "getParamName", "()Lmodern/payments/ecomAndroid/presentation/viewModel/Ecom3dsMethodViewModel$UrlParamName;", "getUrl", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChallengeUrlData {
        private final String paramData;
        private final UrlParamName paramName;
        private final String url;

        public ChallengeUrlData(String url, UrlParamName paramName, String paramData) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paramName, "paramName");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(paramData, "paramData");
            this.url = url;
            this.paramName = paramName;
            this.paramData = paramData;
        }

        public final String getParamData() {
            return this.paramData;
        }

        public final UrlParamName getParamName() {
            return this.paramName;
        }

        public final String getUrl() {
            return this.url;
        }

        public /* synthetic */ ChallengeUrlData(String str, UrlParamName urlParamName, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? "" : str, urlParamName, str2);
        }
    }
}
