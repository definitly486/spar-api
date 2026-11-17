package modern.payments.ecomAndroid.presentation.fragment.paymentMode;

import android.app.Activity;
import androidx.lifecycle.ulzqkzuiru;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.common.Constants;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.EcomBindingInfo;
import modern.payments.ecomAndroid.domain.model.OrderInfo;
import modern.payments.ecomAndroid.domain.model.feature.EcomFeatureParam;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBodyKt;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.UIPreferencesRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.base.BaseViewModel;
import modern.payments.ecomAndroid.presentation.fragment.MerchantAnalyticalEvent;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeBindingCardItem;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeItem;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeNewCardItem;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeSPayItem;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeSbpItem;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomPaymentMethodAnalytic;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.PayViewAction;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.PaymentMethodViewAction;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.MappingExtensionsKt;
import modern.payments.ecomAndroid.util.holder.StringHolder;
import pj.cllcsxoeiz;
import sj.dxjokdxxww;
import sj.jpowsppfya;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.wypolnanlu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GBA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d06058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000209058\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010<R+\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001f0=8\u0006¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020D0=8\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bF\u0010A¨\u0006H"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "metricFacade", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "uiPreferencesRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "item", "Landroid/app/Activity;", "context", "Lgg/wwaezpbzkn;", "handlePayModeClickAction", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;Landroid/app/Activity;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "deactivateBindingPayMode", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;)V", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "sessionIdResponse", "", "collectPaymentMethods", "(Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;)Ljava/util/List;", "event", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/PaymentModeEvent;)V", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "handleAnalyticalEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;)V", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;", "handleViewState", "(Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel$LifecycleEvent;)V", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lmodern/payments/ecomAndroid/domain/repository/UIPreferencesRepository;", "", "sPaySdkAvailability", "Z", "Lsj/lqeggnwhkg;", "Lmodern/payments/ecomAndroid/data/api/ContentResponse$Success;", "sessionIdSuccessFlow", "Lsj/lqeggnwhkg;", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo;", "orderInfo", "getOrderInfo", "()Lsj/lqeggnwhkg;", "Lsj/wypolnanlu;", "paymentMethods", "Lsj/wypolnanlu;", "getPaymentMethods", "()Lsj/wypolnanlu;", "getPaymentMethods$annotations", "()V", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeViewModel$PaymentMethodScreenState;", "state", "getState", "PaymentMethodScreenState", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomPaymentModeViewModel extends BaseViewModel<PaymentModeEvent> {
    private final AppDataRepository appDataRepository;
    private final ConfigRepository configRepository;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final EcomMetricUtil metricFacade;
    private final EcomSdkOptionsRepository optionsRepository;
    private final lqeggnwhkg orderInfo;
    private final wypolnanlu paymentMethods;
    private final Reducer reducer;
    private boolean sPaySdkAvailability;
    private final lqeggnwhkg sessionIdSuccessFlow;
    private final wypolnanlu state;
    private final UIPreferencesRepository uiPreferencesRepository;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeViewModel$PaymentMethodScreenState;", "", "merchantName", "", "merchantLogoUrl", "orderAmount", "Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "paymentMethods", "", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "(Ljava/lang/String;Ljava/lang/String;Lmodern/payments/ecomAndroid/util/holder/StringHolder;Ljava/util/List;)V", "getMerchantLogoUrl", "()Ljava/lang/String;", "getMerchantName", "getOrderAmount", "()Lmodern/payments/ecomAndroid/util/holder/StringHolder;", "getPaymentMethods", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentMethodScreenState {
        private final String merchantLogoUrl;
        private final String merchantName;
        private final StringHolder orderAmount;
        private final List<PayModeItem> paymentMethods;

        public PaymentMethodScreenState() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodScreenState copy$default(PaymentMethodScreenState paymentMethodScreenState, String str, String str2, StringHolder stringHolder, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = paymentMethodScreenState.merchantName;
            }
            if ((i13 & 2) != 0) {
                str2 = paymentMethodScreenState.merchantLogoUrl;
            }
            if ((i13 & 4) != 0) {
                stringHolder = paymentMethodScreenState.orderAmount;
            }
            if ((i13 & 8) != 0) {
                list = paymentMethodScreenState.paymentMethods;
            }
            return paymentMethodScreenState.copy(str, str2, stringHolder, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final StringHolder getOrderAmount() {
            return this.orderAmount;
        }

        public final List<PayModeItem> component4() {
            return this.paymentMethods;
        }

        public final PaymentMethodScreenState copy(String merchantName, String merchantLogoUrl, StringHolder orderAmount, List<? extends PayModeItem> paymentMethods) {
            zdlpuopuiu.btonecajqb(paymentMethods, "paymentMethods");
            return new PaymentMethodScreenState(merchantName, merchantLogoUrl, orderAmount, paymentMethods);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentMethodScreenState)) {
                return false;
            }
            PaymentMethodScreenState paymentMethodScreenState = (PaymentMethodScreenState) other;
            return zdlpuopuiu.eablkybsjg(this.merchantName, paymentMethodScreenState.merchantName) && zdlpuopuiu.eablkybsjg(this.merchantLogoUrl, paymentMethodScreenState.merchantLogoUrl) && zdlpuopuiu.eablkybsjg(this.orderAmount, paymentMethodScreenState.orderAmount) && zdlpuopuiu.eablkybsjg(this.paymentMethods, paymentMethodScreenState.paymentMethods);
        }

        public final String getMerchantLogoUrl() {
            return this.merchantLogoUrl;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final StringHolder getOrderAmount() {
            return this.orderAmount;
        }

        public final List<PayModeItem> getPaymentMethods() {
            return this.paymentMethods;
        }

        public int hashCode() {
            String str = this.merchantName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.merchantLogoUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            StringHolder stringHolder = this.orderAmount;
            return ((iHashCode2 + (stringHolder != null ? stringHolder.hashCode() : 0)) * 31) + this.paymentMethods.hashCode();
        }

        public String toString() {
            return "PaymentMethodScreenState(merchantName=" + this.merchantName + ", merchantLogoUrl=" + this.merchantLogoUrl + ", orderAmount=" + this.orderAmount + ", paymentMethods=" + this.paymentMethods + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentMethodScreenState(String str, String str2, StringHolder stringHolder, List<? extends PayModeItem> paymentMethods) {
            zdlpuopuiu.btonecajqb(paymentMethods, "paymentMethods");
            this.merchantName = str;
            this.merchantLogoUrl = str2;
            this.orderAmount = stringHolder;
            this.paymentMethods = paymentMethods;
        }

        public /* synthetic */ PaymentMethodScreenState(String str, String str2, StringHolder stringHolder, List list, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : stringHolder, (i13 & 8) != 0 ? jyumaefscl.wflxmlrfwp() : list);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$handleAnalyticalEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$handleAnalyticalEvent$1", f = "EcomPaymentModeViewModel.kt", l = {158, 159, 160, 161, 162, 163, 164}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ MerchantAnalyticalEvent $event;
        int label;
        final /* synthetic */ EcomPaymentModeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MerchantAnalyticalEvent merchantAnalyticalEvent, EcomPaymentModeViewModel ecomPaymentModeViewModel, lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$event = merchantAnalyticalEvent;
            this.this$0 = ecomPaymentModeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return new AnonymousClass1(this.$event, this.this$0, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            switch (this.label) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    MerchantAnalyticalEvent merchantAnalyticalEvent = this.$event;
                    zdlpuopuiu.nufgyqmvbu(merchantAnalyticalEvent, "null cannot be cast to non-null type modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomPaymentMethodAnalytic");
                    EcomPaymentMethodAnalytic ecomPaymentMethodAnalytic = (EcomPaymentMethodAnalytic) merchantAnalyticalEvent;
                    if (zdlpuopuiu.eablkybsjg(ecomPaymentMethodAnalytic, EcomPaymentMethodAnalytic.OnBindingClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository = this.this$0.merchantAnalyticRepository;
                        this.label = 1;
                        if (merchantAnalyticRepository.onTouchBinding(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomPaymentMethodAnalytic, EcomPaymentMethodAnalytic.OnCloseClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository2 = this.this$0.merchantAnalyticRepository;
                        this.label = 2;
                        if (merchantAnalyticRepository2.onPaymentMethodTouchClose(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomPaymentMethodAnalytic, EcomPaymentMethodAnalytic.OnDeleteBindingClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository3 = this.this$0.merchantAnalyticRepository;
                        this.label = 3;
                        if (merchantAnalyticRepository3.onTouchDeleteBinding(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomPaymentMethodAnalytic, EcomPaymentMethodAnalytic.OnNewCardClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository4 = this.this$0.merchantAnalyticRepository;
                        this.label = 4;
                        if (merchantAnalyticRepository4.onTouchNewCard(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomPaymentMethodAnalytic, EcomPaymentMethodAnalytic.OnPaymentMethodViewAppeared.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository5 = this.this$0.merchantAnalyticRepository;
                        this.label = 5;
                        if (merchantAnalyticRepository5.onPaymentMethodViewShow(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomPaymentMethodAnalytic, EcomPaymentMethodAnalytic.OnSbpClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository6 = this.this$0.merchantAnalyticRepository;
                        this.label = 6;
                        if (merchantAnalyticRepository6.onTouchSBP(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomPaymentMethodAnalytic, EcomPaymentMethodAnalytic.OnSpayClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository7 = this.this$0.merchantAnalyticRepository;
                        this.label = 7;
                        if (merchantAnalyticRepository7.onTouchSPay(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass1) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcomPaymentModeViewModel(Reducer reducer, ConfigRepository configRepository, AppDataRepository appDataRepository, EcomSdkOptionsRepository optionsRepository, EcomMetricUtil metricFacade, MerchantAnalyticRepository merchantAnalyticRepository, UIPreferencesRepository uiPreferencesRepository) {
        super(configRepository, reducer);
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        zdlpuopuiu.btonecajqb(uiPreferencesRepository, "uiPreferencesRepository");
        this.reducer = reducer;
        this.configRepository = configRepository;
        this.appDataRepository = appDataRepository;
        this.optionsRepository = optionsRepository;
        this.metricFacade = metricFacade;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        this.uiPreferencesRepository = uiPreferencesRepository;
        final wypolnanlu sessionIdResponse = appDataRepository.getSessionIdResponse();
        final lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$filterIsInstance$1$2", f = "EcomPaymentModeViewModel.kt", l = {223}, m = "emit")
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
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        if (obj instanceof ContentResponse.Success) {
                            anonymousClass1.label = 1;
                            if (nufgyqmvbuVar.emit(obj, anonymousClass1) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = sessionIdResponse.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        this.sessionIdSuccessFlow = lqeggnwhkgVar;
        this.orderInfo = dxjokdxxww.lereixgezr(new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$special$$inlined$map$1$2", f = "EcomPaymentModeViewModel.kt", l = {223}, m = "emit")
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
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                        nufgyqmvbu nufgyqmvbuVar = this.$this_unsafeFlow;
                        OrderInfo orderInfo = ((SessionIdResponseBody) ((ContentResponse.Success) obj).getData()).getOrderInfo();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(orderInfo, anonymousClass1) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj2);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            @Override // sj.lqeggnwhkg
            public Object collect(nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objCollect = lqeggnwhkgVar.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        });
        lqeggnwhkg lqeggnwhkgVarCllcsxoeiz = dxjokdxxww.cllcsxoeiz(lqeggnwhkgVar, new EcomPaymentModeViewModel$paymentMethods$1(this, null));
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = ulzqkzuiru.iobyxmoadg(this);
        jpowsppfya.iobyxmoadg iobyxmoadgVar = jpowsppfya.f106926iobyxmoadg;
        wypolnanlu wypolnanluVarRibwqtqdhb = dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarCllcsxoeiz, cllcsxoeizVarIobyxmoadg, jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), null);
        this.paymentMethods = wypolnanluVarRibwqtqdhb;
        String str = null;
        String str2 = null;
        StringHolder stringHolder = null;
        List list = null;
        this.state = dxjokdxxww.ribwqtqdhb(dxjokdxxww.wflxmlrfwp(dxjokdxxww.lereixgezr(wypolnanluVarRibwqtqdhb), dxjokdxxww.lereixgezr(lqeggnwhkgVar), new EcomPaymentModeViewModel$state$1(this, null)), ulzqkzuiru.iobyxmoadg(this), jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, 0L, 0L, 3, null), new PaymentMethodScreenState(str, str2, stringHolder, list, 15, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PayModeItem> collectPaymentMethods(SessionIdResponseBody sessionIdResponse) {
        List listWflxmlrfwp;
        List<EcomBindingInfo> bindings = sessionIdResponse.getBindings();
        PayModeSbpItem payModeSbpItem = null;
        if (bindings != null) {
            listWflxmlrfwp = new ArrayList(jyumaefscl.cqumvgiudr(bindings, 10));
            Iterator<T> it = bindings.iterator();
            while (it.hasNext()) {
                listWflxmlrfwp.add(MappingExtensionsKt.toBindingPayModeItem((EcomBindingInfo) it.next()));
            }
        } else {
            listWflxmlrfwp = null;
        }
        if (listWflxmlrfwp == null) {
            listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        }
        PayModeSbpItem payModeSbpItem2 = PayModeSbpItem.INSTANCE;
        String sbpPayload = sessionIdResponse.getSbpPayload();
        if (sbpPayload != null && sbpPayload.length() != 0 && this.optionsRepository.isFeatureEnabledBy(Constants.FeatureName.SBP, EcomFeatureParam.ENABLED_BY_MERCHANT)) {
            payModeSbpItem = payModeSbpItem2;
        }
        ArrayList arrayList = new ArrayList();
        if (FeatureExtensionsKt.isNewCardEnable(this.optionsRepository)) {
            arrayList.add(PayModeNewCardItem.INSTANCE);
        }
        if (FeatureExtensionsKt.isSpayEnable(this.optionsRepository)) {
            arrayList.add(PayModeSPayItem.INSTANCE);
        }
        if (FeatureExtensionsKt.isBindingEnable(this.optionsRepository) && SessionIdResponseBodyKt.bindingNotEmpty(sessionIdResponse)) {
            arrayList.addAll(listWflxmlrfwp);
        }
        if (FeatureExtensionsKt.isSbpEnabled(this.optionsRepository) && SessionIdResponseBodyKt.payloadNotEmpty(sessionIdResponse) && this.configRepository.getSbpConfig().getValue() != null) {
            arrayList.addAll(jyumaefscl.vdvldrhtss(payModeSbpItem));
        }
        return arrayList;
    }

    private final void deactivateBindingPayMode(PayModeBindingCardItem item) {
        handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnDeleteBindingClick.INSTANCE);
        this.reducer.invoke(new Action.HandleDeactivateBinding(item.getBindingId()));
    }

    public static /* synthetic */ void getPaymentMethods$annotations() {
    }

    private final void handlePayModeClickAction(PayModeItem item, Activity context) {
        if (item instanceof PayModeBindingCardItem) {
            handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnBindingClick.INSTANCE);
            this.appDataRepository.setPaymentMode(AppDataRepository.PaymentMode.BindingCardPaymentMode.INSTANCE);
            this.metricFacade.report(new EcomMetricUtil.MetricEvent(PayViewAction.BINDING, Views.PAYMENT_METHOD, ActionType.TOUCH, null, null, null, null, null, 248, null));
            this.reducer.invoke(new Action.HandleStartPayment.BindingCard(((PayModeBindingCardItem) item).getBindingId(), ulzqkzuiru.iobyxmoadg(this)));
            return;
        }
        if (item instanceof PayModeNewCardItem) {
            handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnNewCardClick.INSTANCE);
            this.appDataRepository.setPaymentMode(AppDataRepository.PaymentMode.NewCardPaymentMode.INSTANCE);
            this.metricFacade.report(new EcomMetricUtil.MetricEvent(PayViewAction.NEW_CARD, Views.PAYMENT_METHOD, ActionType.TOUCH, null, null, null, null, null, 248, null));
            this.reducer.invoke(Action.HandleAddNewCard.INSTANCE);
            return;
        }
        if (item instanceof PayModeSPayItem) {
            handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnSpayClick.INSTANCE);
            this.appDataRepository.setPaymentMode(AppDataRepository.PaymentMode.SPayPaymentMode.INSTANCE);
            this.metricFacade.report(new EcomMetricUtil.MetricEvent(PayViewAction.SPAY, Views.PAYMENT_METHOD, ActionType.TOUCH, null, null, null, null, null, 248, null));
            if (context != null) {
                this.reducer.invoke(Action.HandleStartPayment.SPay.INSTANCE);
                return;
            }
            return;
        }
        if (item instanceof PayModeSbpItem) {
            handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnSbpClick.INSTANCE);
            this.appDataRepository.setPaymentMode(AppDataRepository.PaymentMode.SbpPaymentMode.INSTANCE);
            this.metricFacade.report(new EcomMetricUtil.MetricEvent(PayViewAction.SBP, Views.PAYMENT_METHOD, ActionType.TOUCH, null, null, null, null, null, 248, null));
            this.reducer.invoke(Action.HandleSbpPay.INSTANCE);
        }
    }

    public final lqeggnwhkg getOrderInfo() {
        return this.orderInfo;
    }

    public final wypolnanlu getPaymentMethods() {
        return this.paymentMethods;
    }

    public final wypolnanlu getState() {
        return this.state;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleAnalyticalEvent(MerchantAnalyticalEvent event) {
        zdlpuopuiu.btonecajqb(event, "event");
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new AnonymousClass1(event, this, null), 3, null);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleViewState(BaseViewModel.LifecycleEvent event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, BaseViewModel.LifecycleEvent.OnStop.INSTANCE)) {
            this.metricFacade.report(new EcomMetricUtil.MetricEvent(PaymentMethodViewAction.PAYMENT_METHOD_VIEW_DISAPPEARED, Views.PAYMENT_METHOD, ActionType.LC, null, null, null, null, null, 248, null));
        } else if (zdlpuopuiu.eablkybsjg(event, BaseViewModel.LifecycleEvent.OnStart.INSTANCE)) {
            handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnPaymentMethodViewAppeared.INSTANCE);
            this.metricFacade.report(new EcomMetricUtil.MetricEvent(PaymentMethodViewAction.PAYMENT_METHOD_VIEW_APPEARED, Views.PAYMENT_METHOD, ActionType.LC, null, null, null, null, null, 248, null));
        }
        super.handleViewState(event);
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(PaymentModeEvent event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (event instanceof PaymentModeEvent.ItemClickedEvent) {
            PaymentModeEvent.ItemClickedEvent itemClickedEvent = (PaymentModeEvent.ItemClickedEvent) event;
            handlePayModeClickAction(itemClickedEvent.getItem(), itemClickedEvent.getContext());
        } else if (event instanceof PaymentModeEvent.CloseEvent) {
            handleAnalyticalEvent(EcomPaymentMethodAnalytic.OnCloseClick.INSTANCE);
            closeSdk();
        } else if (event instanceof PaymentModeEvent.DeleteBindingClickedEvent) {
            deactivateBindingPayMode(((PaymentModeEvent.DeleteBindingClickedEvent) event).getItem());
        }
    }
}
