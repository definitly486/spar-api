package modern.payments.ecomAndroid.presentation.fragment.paymentSbp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.ulzqkzuiru;
import com.google.android.gms.actions.SearchIntents;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.response.EcomSbpConfig;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.base.BaseFragmentWithKeyboardListenerViewModel;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.presentation.fragment.MerchantAnalyticalEvent;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomSbpAnalytic;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.StatusType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.SbpViewAction;
import modern.payments.ecomAndroid.util.event.Event;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;
import modern.payments.ecomAndroid.util.search.LevenshteinKt;
import pj.cllcsxoeiz;
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
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e*\b\u0012\u0004\u0012\u00020\u00110\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e*\b\u0012\u0004\u0012\u00020\u00110\u001e2\u0006\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00142\u0006\u0010%\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010.\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001e088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010C\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020B\u0018\u00010A058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00107R%\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020B\u0018\u00010A0;8\u0006¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@R\u0016\u0010H\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\u0004\u0018\u00010\u0017*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010N\u001a\u00020-*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragmentWithKeyboardListenerViewModel;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Landroid/content/Context;", "appContext", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Landroid/content/Context;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;)V", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;", "bank", "context", "Lgg/wwaezpbzkn;", "openBank", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;Landroid/content/Context;)V", "", "uri", "tryToOpenNativeBankApp", "(Ljava/lang/String;Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;)V", "tryToOpenNspkBankUri", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;)V", "tryToOpenBankWebApp", "", "filterAvailable", "(Ljava/util/List;)Ljava/util/List;", SearchIntents.EXTRA_QUERY, "search", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "event", "handleAnalyticalEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;)V", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenEvent;)V", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "handleViewState", "(Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;)V", "", "checkBankAppIsNotInstalled", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Landroid/content/Context;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lsj/zynmafqrjb;", "searchInput", "Lsj/zynmafqrjb;", "Lsj/lqeggnwhkg;", "banksDictionary", "Lsj/lqeggnwhkg;", "Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpScreenState;", "screenState", "Lsj/wypolnanlu;", "getScreenState", "()Lsj/wypolnanlu;", "Lmodern/payments/ecomAndroid/util/event/Event;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/SbpFragmentViewAction;", "mViewAction", "viewAction", "getViewAction", "getSbpPayload", "()Ljava/lang/String;", "sbpPayload", "getSbpAppUri", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;)Ljava/lang/String;", "sbpAppUri", "getAvailableForWeb", "(Lmodern/payments/ecomAndroid/domain/model/response/EcomSbpConfig$SbpBankInfo;)Z", "availableForWeb", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomSbpViewModel extends BaseFragmentWithKeyboardListenerViewModel<SbpScreenEvent> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String HTTPS_PATTERN = "https://";

    @Deprecated
    public static final String NSPK_PATTERN = "https://qr.nspk.ru/";

    @Deprecated
    public static final String SCHEMA_DIVIDER = "://";
    private final Context appContext;
    private final AppDataRepository appDataRepository;
    private final lqeggnwhkg banksDictionary;
    private final EcomMetricUtil ecomMetricUtil;
    private final zynmafqrjb mViewAction;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final Reducer reducer;
    private final wypolnanlu screenState;
    private final zynmafqrjb searchInput;
    private final wypolnanlu viewAction;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentSbp/EcomSbpViewModel$Companion;", "", "()V", "HTTPS_PATTERN", "", "NSPK_PATTERN", "SCHEMA_DIVIDER", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$handleAnalyticalEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$handleAnalyticalEvent$1", f = "EcomSbpViewModel.kt", l = {77, 78, 79, 80}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ MerchantAnalyticalEvent $event;
        int label;
        final /* synthetic */ EcomSbpViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MerchantAnalyticalEvent merchantAnalyticalEvent, EcomSbpViewModel ecomSbpViewModel, lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$event = merchantAnalyticalEvent;
            this.this$0 = ecomSbpViewModel;
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
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(merchantAnalyticalEvent, "null cannot be cast to non-null type modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomSbpAnalytic");
                EcomSbpAnalytic ecomSbpAnalytic = (EcomSbpAnalytic) merchantAnalyticalEvent;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ecomSbpAnalytic, EcomSbpAnalytic.OnSbpViewReady.INSTANCE)) {
                    MerchantAnalyticRepository merchantAnalyticRepository = this.this$0.merchantAnalyticRepository;
                    this.label = 1;
                    if (merchantAnalyticRepository.onSbpViewReady(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ecomSbpAnalytic, EcomSbpAnalytic.OnSbpViewShow.INSTANCE)) {
                    MerchantAnalyticRepository merchantAnalyticRepository2 = this.this$0.merchantAnalyticRepository;
                    this.label = 2;
                    if (merchantAnalyticRepository2.onSbpViewShow(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ecomSbpAnalytic, EcomSbpAnalytic.OnTouchBankApp.INSTANCE)) {
                    MerchantAnalyticRepository merchantAnalyticRepository3 = this.this$0.merchantAnalyticRepository;
                    this.label = 3;
                    if (merchantAnalyticRepository3.onTouchBankApp(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ecomSbpAnalytic, EcomSbpAnalytic.OnTouchSearchView.INSTANCE)) {
                    MerchantAnalyticRepository merchantAnalyticRepository4 = this.this$0.merchantAnalyticRepository;
                    this.label = 4;
                    if (merchantAnalyticRepository4.onTouchSearchView(this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
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

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$handleEvent$1", f = "EcomSbpViewModel.kt", l = {122}, m = "invokeSuspend")
    static final class C40681 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40681(lg.gxszxtbevo<? super C40681> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new C40681(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.onFailRedirectToBankApp(this) == objGxszxtbevo) {
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
            return ((C40681) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$handleEvent$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$handleEvent$2", f = "EcomSbpViewModel.kt", l = {136}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass2(lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new AnonymousClass2(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.onFailRedirectToBankWebApp(this) == objGxszxtbevo) {
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

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenBankWebApp$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenBankWebApp$1", f = "EcomSbpViewModel.kt", l = {235}, m = "invokeSuspend")
    static final class C40691 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40691(lg.gxszxtbevo<? super C40691> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new C40691(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.onGoodRedirectToBankApp(this) == objGxszxtbevo) {
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
            return ((C40691) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenBankWebApp$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenBankWebApp$2", f = "EcomSbpViewModel.kt", l = {254}, m = "invokeSuspend")
    static final class C40702 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40702(lg.gxszxtbevo<? super C40702> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new C40702(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.onSbpInProgressEnd(this) == objGxszxtbevo) {
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
            return ((C40702) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNativeBankApp$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNativeBankApp$1", f = "EcomSbpViewModel.kt", l = {174}, m = "invokeSuspend")
    static final class C40711 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40711(lg.gxszxtbevo<? super C40711> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new C40711(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.onGoodRedirectToBankApp(this) == objGxszxtbevo) {
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
            return ((C40711) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNativeBankApp$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNativeBankApp$2", f = "EcomSbpViewModel.kt", l = {193}, m = "invokeSuspend")
    static final class C40722 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40722(lg.gxszxtbevo<? super C40722> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new C40722(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.onSbpInProgressEnd(this) == objGxszxtbevo) {
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
            return ((C40722) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNspkBankUri$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNspkBankUri$1", f = "EcomSbpViewModel.kt", l = {OrderServiceErrorHandlerImpl.PAYMENT_TOKEN_EXPIRED, OrderServiceErrorHandlerImpl.ORDER_LOCKED}, m = "invokeSuspend")
    static final class C40731 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40731(lg.gxszxtbevo<? super C40731> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new C40731(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
            this.label = 1;
            if (merchantAnalyticRepository.onFailRedirectToBankWebApp(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            MerchantAnalyticRepository merchantAnalyticRepository2 = EcomSbpViewModel.this.merchantAnalyticRepository;
            this.label = 2;
            if (merchantAnalyticRepository2.onGoodRedirectToBankWebApp(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40731) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNspkBankUri$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$tryToOpenNspkBankUri$2", f = "EcomSbpViewModel.kt", l = {222}, m = "invokeSuspend")
    static final class C40742 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40742(lg.gxszxtbevo<? super C40742> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomSbpViewModel.this.new C40742(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                MerchantAnalyticRepository merchantAnalyticRepository = EcomSbpViewModel.this.merchantAnalyticRepository;
                this.label = 1;
                if (merchantAnalyticRepository.onSbpInProgressEnd(this) == objGxszxtbevo) {
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
            return ((C40742) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomSbpViewModel(ConfigRepository configRepository, Reducer reducer, AppDataRepository appDataRepository, Context appContext, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository) {
        super(configRepository, reducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appContext, "appContext");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        this.reducer = reducer;
        this.appDataRepository = appDataRepository;
        this.appContext = appContext;
        this.ecomMetricUtil = ecomMetricUtil;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        final zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg("");
        this.searchInput = zynmafqrjbVarIobyxmoadg;
        final lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(configRepository.getSbpConfig());
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$1$2", f = "EcomSbpViewModel.kt", l = {223}, m = "emit")
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
                        List<EcomSbpConfig.SbpBankInfo> dictionary = ((EcomSbpConfig) obj).getDictionary();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(dictionary, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = lqeggnwhkgVarLereixgezr.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        this.banksDictionary = lqeggnwhkgVar;
        lqeggnwhkg lqeggnwhkgVarWflxmlrfwp = dxjokdxxww.wflxmlrfwp(new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$special$$inlined$map$2$2", f = "EcomSbpViewModel.kt", l = {223}, m = "emit")
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
                        String string = kcexrzcfyt.p((String) obj).toString();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(string, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == mg.zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, lqeggnwhkgVar, new EcomSbpViewModel$screenState$2(this, null));
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = ulzqkzuiru.iobyxmoadg(this);
        jpowsppfya.iobyxmoadg iobyxmoadgVar = jpowsppfya.f106926iobyxmoadg;
        this.screenState = dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarWflxmlrfwp, cllcsxoeizVarIobyxmoadg, jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), new SbpScreenState(null, null, 3, null));
        zynmafqrjb zynmafqrjbVarIobyxmoadg2 = kegysxyocb.iobyxmoadg(null);
        this.mViewAction = zynmafqrjbVarIobyxmoadg2;
        this.viewAction = dxjokdxxww.ribwqtqdhb(zynmafqrjbVarIobyxmoadg2, ulzqkzuiru.iobyxmoadg(this), jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<EcomSbpConfig.SbpBankInfo> filterAvailable(List<EcomSbpConfig.SbpBankInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            EcomSbpConfig.SbpBankInfo sbpBankInfo = (EcomSbpConfig.SbpBankInfo) obj;
            String sbpAppUri = getSbpAppUri(sbpBankInfo);
            if ((sbpAppUri != null && !checkBankAppIsNotInstalled(this.appContext, sbpAppUri)) || getAvailableForWeb(sbpBankInfo)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean getAvailableForWeb(EcomSbpConfig.SbpBankInfo sbpBankInfo) {
        String webClientUrl;
        return (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(sbpBankInfo.isWebClientActive(), Boolean.TRUE) || (webClientUrl = sbpBankInfo.getWebClientUrl()) == null || webClientUrl.length() == 0) ? false : true;
    }

    private final String getSbpAppUri(EcomSbpConfig.SbpBankInfo sbpBankInfo) {
        String sbpPayload = getSbpPayload();
        if (sbpPayload == null) {
            return null;
        }
        return sbpBankInfo.getSchema() + SCHEMA_DIVIDER + kcexrzcfyt.hcddaimhww(sbpPayload, HTTPS_PATTERN, "", false, 4, null);
    }

    private final String getSbpPayload() {
        SessionIdResponseBody sessionIdResponseBody;
        Object value = this.appDataRepository.getSessionIdResponse().getValue();
        ContentResponse.Success success = value instanceof ContentResponse.Success ? (ContentResponse.Success) value : null;
        if (success == null || (sessionIdResponseBody = (SessionIdResponseBody) success.getData()) == null) {
            return null;
        }
        return sessionIdResponseBody.getSbpPayload();
    }

    private final void openBank(EcomSbpConfig.SbpBankInfo bank, Context context) {
        String sbpAppUri = getSbpAppUri(bank);
        if (sbpAppUri == null) {
            return;
        }
        if (getAvailableForWeb(bank)) {
            tryToOpenNspkBankUri(bank);
        } else if (checkBankAppIsNotInstalled(context, sbpAppUri)) {
            tryToOpenBankWebApp(bank);
        } else {
            tryToOpenNativeBankApp(sbpAppUri, bank);
        }
        this.reducer.invoke(new Action.HandlePaymentResult(null, true));
        closeSdk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    public final List<EcomSbpConfig.SbpBankInfo> search(List<EcomSbpConfig.SbpBankInfo> list, String str) {
        Object next;
        double dDoubleValue;
        Double dValueOf;
        String lowerCase;
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase2, "toLowerCase(...)");
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            lowerCase = ((EcomSbpConfig.SbpBankInfo) next).getBankName().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lowerCase, lowerCase2));
        EcomSbpConfig.SbpBankInfo sbpBankInfo = (EcomSbpConfig.SbpBankInfo) next;
        if (sbpBankInfo != null) {
            return jyumaefscl.eablkybsjg(sbpBankInfo);
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        for (EcomSbpConfig.SbpBankInfo sbpBankInfo2 : list) {
            double dLevenshteinDistance = LevenshteinKt.levenshteinDistance(lowerCase2, sbpBankInfo2.getBankName());
            List<String> wordList = sbpBankInfo2.getWordList();
            if (wordList.size() <= 1) {
                wordList = null;
            }
            if (wordList != null) {
                Iterator<T> it2 = wordList.iterator();
                if (it2.hasNext()) {
                    double dLevenshteinDistance2 = LevenshteinKt.levenshteinDistance(lowerCase2, (String) it2.next());
                    while (it2.hasNext()) {
                        dLevenshteinDistance2 = Math.min(dLevenshteinDistance2, LevenshteinKt.levenshteinDistance(lowerCase2, (String) it2.next()));
                    }
                    dValueOf = Double.valueOf(dLevenshteinDistance2);
                } else {
                    dValueOf = null;
                }
                if (dValueOf != null) {
                    dDoubleValue = dValueOf.doubleValue();
                } else {
                    dDoubleValue = 1.0d;
                }
            } else {
                dDoubleValue = 1.0d;
            }
            arrayList.add(cqumvgiudr.iobyxmoadg(Double.valueOf(Math.min(dLevenshteinDistance, dDoubleValue)), sbpBankInfo2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) ((vdvldrhtss) obj).iobyxmoadg()).doubleValue() < 0.3d) {
                arrayList2.add(obj);
            }
        }
        List listD = jyumaefscl.d(arrayList2, new Comparator() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel$search$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t13, T t14) {
                return kg.iobyxmoadg.wkgbmnqykc(Double.valueOf(((Number) ((vdvldrhtss) t13).iobyxmoadg()).doubleValue()), Double.valueOf(((Number) ((vdvldrhtss) t14).iobyxmoadg()).doubleValue()));
            }
        });
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(listD, 10));
        Iterator it3 = listD.iterator();
        while (it3.hasNext()) {
            arrayList3.add((EcomSbpConfig.SbpBankInfo) ((vdvldrhtss) it3.next()).wkgbmnqykc());
        }
        return jyumaefscl.m(arrayList3);
    }

    private final void tryToOpenBankWebApp(EcomSbpConfig.SbpBankInfo bank) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40691(null), 2, null);
        zynmafqrjb zynmafqrjbVar = this.mViewAction;
        String webClientUrl = bank.getWebClientUrl();
        if (webClientUrl == null) {
            webClientUrl = "";
        }
        zynmafqrjbVar.setValue(new Event(new SbpFragmentViewAction.TryToOpenBankWebApp(webClientUrl)));
        EcomMetricUtil ecomMetricUtil = this.ecomMetricUtil;
        SbpViewAction sbpViewAction = SbpViewAction.REDIRECT_TO_BANK_WEB_APP;
        ActionType actionType = ActionType.LC;
        ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(sbpViewAction, Views.SBP_VIEW, actionType, StatusType.GOOD, null, null, null, null, 240, null));
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.SBP_IN_PROGRESS_END, null, actionType, null, null, null, null, null, 250, null));
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40702(null), 2, null);
    }

    private final void tryToOpenNativeBankApp(String uri, EcomSbpConfig.SbpBankInfo bank) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40711(null), 2, null);
        this.mViewAction.setValue(new Event(new SbpFragmentViewAction.TryToOpenBankApp(uri, bank.getPackageName())));
        EcomMetricUtil ecomMetricUtil = this.ecomMetricUtil;
        SbpViewAction sbpViewAction = SbpViewAction.REDIRECT_TO_BANK_APP;
        ActionType actionType = ActionType.LC;
        ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(sbpViewAction, Views.SBP_VIEW, actionType, StatusType.GOOD, null, null, null, null, 240, null));
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.SBP_IN_PROGRESS_END, null, actionType, null, null, null, null, null, 250, null));
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40722(null), 2, null);
    }

    private final void tryToOpenNspkBankUri(EcomSbpConfig.SbpBankInfo bank) {
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40731(null), 2, null);
        String sbpPayload = getSbpPayload();
        this.mViewAction.setValue(new Event(new SbpFragmentViewAction.TryToOpenNspkBankUri(bank.getWebClientUrl() + '/' + (sbpPayload != null ? kcexrzcfyt.hcddaimhww(sbpPayload, NSPK_PATTERN, "", false, 4, null) : null))));
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.REDIRECT_TO_BANK_WEB_APP, Views.SBP_VIEW, ActionType.LC, StatusType.GOOD, null, null, null, null, 240, null));
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40742(null), 2, null);
    }

    public final boolean checkBankAppIsNotInstalled(Context context, String uri) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uri, "uri");
        return new Intent("android.intent.action.VIEW", Uri.parse(uri)).resolveActivity(context.getPackageManager()) == null;
    }

    public final wypolnanlu getScreenState() {
        return this.screenState;
    }

    public final wypolnanlu getViewAction() {
        return this.viewAction;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleAnalyticalEvent(MerchantAnalyticalEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new AnonymousClass1(event, this, null), 2, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleViewState(BaseViewModel.LifecycleEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        super.handleViewState(event);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, BaseViewModel.LifecycleEvent.OnStart.INSTANCE)) {
            this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.SBP_APPEARED, Views.SBP_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, BaseViewModel.LifecycleEvent.OnStop.INSTANCE)) {
            this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.SBP_DISAPPEARED, Views.SBP_VIEW, ActionType.LC, null, null, null, null, null, 248, null));
        }
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(SbpScreenEvent event) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof SbpScreenEvent.BankItemClickEvent) {
            this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.BANK_APP, Views.SBP_VIEW, ActionType.TOUCH, null, null, null, null, null, 248, null));
            SbpScreenEvent.BankItemClickEvent bankItemClickEvent = (SbpScreenEvent.BankItemClickEvent) event;
            openBank(bankItemClickEvent.getBank(), bankItemClickEvent.getContext());
            return;
        }
        if (event instanceof SbpScreenEvent.SearchInputChangeEvent) {
            this.searchInput.setValue(((SbpScreenEvent.SearchInputChangeEvent) event).getText());
            return;
        }
        if (event instanceof SbpScreenEvent.SearchInputFocusChanged) {
            if (((SbpScreenEvent.SearchInputFocusChanged) event).getHasFocus()) {
                this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.SEARCH_VIEW, Views.SBP_VIEW, ActionType.TOUCH, null, null, null, null, null, 248, null));
                return;
            }
            return;
        }
        if (event instanceof SbpScreenEvent.TryToOpenBankAppFailedEvent) {
            this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.REDIRECT_TO_BANK_APP, Views.SBP_VIEW, ActionType.LC, StatusType.FAIL, null, null, null, null, 240, null));
            pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new C40681(null), 2, null);
            return;
        }
        if (!(event instanceof SbpScreenEvent.TryToOpenBankWebAppFailedEvent)) {
            boolean z13 = event instanceof SbpScreenEvent.TryToOpenNspkBankUriFailedEvent;
            return;
        }
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(SbpViewAction.REDIRECT_TO_BANK_WEB_APP, Views.SBP_VIEW, ActionType.LC, StatusType.FAIL, null, null, null, null, 240, null));
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), ikoacuggdj.zoijcleaow(), null, new AnonymousClass2(null), 2, null);
    }
}
