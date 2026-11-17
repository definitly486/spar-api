package modern.payments.ecomAndroid.presentation.viewModel;

import androidx.lifecycle.ulzqkzuiru;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.domain.analytics.EcomMetricUtil;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.manager.CardDataManager;
import modern.payments.ecomAndroid.domain.model.OrderInfo;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.base.BaseFragmentWithKeyboardListenerViewModel;
import modern.payments.ecomAndroid.presentation.fragment.MerchantAnalyticalEvent;
import modern.payments.ecomAndroid.presentation.model.card.NewCardPresentationData;
import modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomAddNewCardAnalytic;
import modern.payments.ecomAndroid.util.analytics.metrics.ActionType;
import modern.payments.ecomAndroid.util.analytics.metrics.Views;
import modern.payments.ecomAndroid.util.analytics.metrics.actions.PayViewAction;
import pj.cllcsxoeiz;
import sj.dxjokdxxww;
import sj.jpowsppfya;
import sj.kegysxyocb;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import sj.wypolnanlu;
import sj.zynmafqrjb;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002IJB9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u00101\u001a\b\u0012\u0004\u0012\u0002000+8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010*R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160+8\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010/R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002000+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010-R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010-R\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020E048\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u00108R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u0002000+8\u0006¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bH\u0010/¨\u0006K"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomAddNewCardViewModel;", "Lmodern/payments/ecomAndroid/presentation/base/BaseFragmentWithKeyboardListenerViewModel;", "Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "cardDataManager", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "ecomMetricUtil", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;)V", "Lgg/wwaezpbzkn;", "onCloseButtonClickAction", "()V", "startPayment", "", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "getErrorOnMonth", "(Ljava/lang/String;)Lmodern/payments/ecomAndroid/presentation/viewModel/InputError;", "getErrorOnYear", "Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "getNextStep", "()Lmodern/payments/ecomAndroid/presentation/viewModel/CardInputMode;", "Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;", "event", "handleAnalyticalEvent", "(Lmodern/payments/ecomAndroid/presentation/fragment/MerchantAnalyticalEvent;)V", "handleEvent", "(Lmodern/payments/ecomAndroid/presentation/viewModel/AddNewCardFragmentEvent;)V", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/manager/CardDataManager;", "Lmodern/payments/ecomAndroid/domain/analytics/EcomMetricUtil;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lsj/zynmafqrjb;", "Lmodern/payments/ecomAndroid/presentation/model/card/NewCardPresentationData;", "_cardData", "Lsj/zynmafqrjb;", "Lsj/lqeggnwhkg;", "cardIcon", "Lsj/lqeggnwhkg;", "getCardIcon", "()Lsj/lqeggnwhkg;", "", "showCardIcon", "getShowCardIcon", "_step", "Lsj/wypolnanlu;", "step", "Lsj/wypolnanlu;", "getStep", "()Lsj/wypolnanlu;", "_modificationFinish", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortNumber;", "_errorCardNumber", "_errorDate", "Lmodern/payments/ecomAndroid/presentation/viewModel/InputError$ShortCvv;", "_errorCVV", "inputError", "getInputError", "_hasError", "Lmodern/payments/ecomAndroid/data/api/ContentResponse$Success;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "sessionIdSuccessFlow", "Lmodern/payments/ecomAndroid/presentation/viewModel/EcomAddNewCardViewModel$OrderPresentationState;", "orderData", "getOrderData", "isEnterDataComplete", "Companion", "OrderPresentationState", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EcomAddNewCardViewModel extends BaseFragmentWithKeyboardListenerViewModel<AddNewCardFragmentEvent> {
    public static final int CARD_EXPIRE_DATE_MAX_LENGTH = 2;
    public static final int CARD_NUMBER_MIN_MAX_LENGTH = 16;
    private final zynmafqrjb _cardData;
    private final wypolnanlu _errorCVV;
    private final wypolnanlu _errorCardNumber;
    private final wypolnanlu _errorDate;
    private final lqeggnwhkg _hasError;
    private final zynmafqrjb _modificationFinish;
    private final zynmafqrjb _step;
    private final CardDataManager cardDataManager;
    private final lqeggnwhkg cardIcon;
    private final EcomMetricUtil ecomMetricUtil;
    private final lqeggnwhkg inputError;
    private final lqeggnwhkg isEnterDataComplete;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final wypolnanlu orderData;
    private final Reducer reducer;
    private final lqeggnwhkg sessionIdSuccessFlow;
    private final lqeggnwhkg showCardIcon;
    private final wypolnanlu step;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/viewModel/EcomAddNewCardViewModel$OrderPresentationState;", "", "orderAmount", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "merchantInfo", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo$MerchantInfo;", "(Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;Lmodern/payments/ecomAndroid/domain/model/OrderInfo$MerchantInfo;)V", "getMerchantInfo", "()Lmodern/payments/ecomAndroid/domain/model/OrderInfo$MerchantInfo;", "getOrderAmount", "()Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderPresentationState {
        private final OrderInfo.MerchantInfo merchantInfo;
        private final OrderInfo.OrderAmount orderAmount;

        /* JADX WARN: Multi-variable type inference failed */
        public OrderPresentationState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ OrderPresentationState copy$default(OrderPresentationState orderPresentationState, OrderInfo.OrderAmount orderAmount, OrderInfo.MerchantInfo merchantInfo, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                orderAmount = orderPresentationState.orderAmount;
            }
            if ((i13 & 2) != 0) {
                merchantInfo = orderPresentationState.merchantInfo;
            }
            return orderPresentationState.copy(orderAmount, merchantInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OrderInfo.OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OrderInfo.MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        public final OrderPresentationState copy(OrderInfo.OrderAmount orderAmount, OrderInfo.MerchantInfo merchantInfo) {
            return new OrderPresentationState(orderAmount, merchantInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderPresentationState)) {
                return false;
            }
            OrderPresentationState orderPresentationState = (OrderPresentationState) other;
            return zdlpuopuiu.eablkybsjg(this.orderAmount, orderPresentationState.orderAmount) && zdlpuopuiu.eablkybsjg(this.merchantInfo, orderPresentationState.merchantInfo);
        }

        public final OrderInfo.MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        public final OrderInfo.OrderAmount getOrderAmount() {
            return this.orderAmount;
        }

        public int hashCode() {
            OrderInfo.OrderAmount orderAmount = this.orderAmount;
            int iHashCode = (orderAmount == null ? 0 : orderAmount.hashCode()) * 31;
            OrderInfo.MerchantInfo merchantInfo = this.merchantInfo;
            return iHashCode + (merchantInfo != null ? merchantInfo.hashCode() : 0);
        }

        public String toString() {
            return "OrderPresentationState(orderAmount=" + this.orderAmount + ", merchantInfo=" + this.merchantInfo + ')';
        }

        public OrderPresentationState(OrderInfo.OrderAmount orderAmount, OrderInfo.MerchantInfo merchantInfo) {
            this.orderAmount = orderAmount;
            this.merchantInfo = merchantInfo;
        }

        public /* synthetic */ OrderPresentationState(OrderInfo.OrderAmount orderAmount, OrderInfo.MerchantInfo merchantInfo, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? null : orderAmount, (i13 & 2) != 0 ? null : merchantInfo);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardInputMode.values().length];
            try {
                iArr[CardInputMode.CARD_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardInputMode.EXPIRED_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardInputMode.CVV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$handleAnalyticalEvent$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$handleAnalyticalEvent$1", f = "EcomAddNewCardViewModel.kt", l = {126, 127, UserVerificationMethods.USER_VERIFY_PATTERN, 129, 130, 131}, m = "invokeSuspend")
    static final class AnonymousClass1 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ MerchantAnalyticalEvent $event;
        int label;
        final /* synthetic */ EcomAddNewCardViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MerchantAnalyticalEvent merchantAnalyticalEvent, EcomAddNewCardViewModel ecomAddNewCardViewModel, lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$event = merchantAnalyticalEvent;
            this.this$0 = ecomAddNewCardViewModel;
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
                    zdlpuopuiu.nufgyqmvbu(merchantAnalyticalEvent, "null cannot be cast to non-null type modern.payments.ecomAndroid.presentation.viewAnalyticalEvent.EcomAddNewCardAnalytic");
                    EcomAddNewCardAnalytic ecomAddNewCardAnalytic = (EcomAddNewCardAnalytic) merchantAnalyticalEvent;
                    if (zdlpuopuiu.eablkybsjg(ecomAddNewCardAnalytic, EcomAddNewCardAnalytic.OnCancelClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository = this.this$0.merchantAnalyticRepository;
                        this.label = 1;
                        if (merchantAnalyticRepository.onPaymentTouchCancel(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomAddNewCardAnalytic, EcomAddNewCardAnalytic.OnCardNumberClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository2 = this.this$0.merchantAnalyticRepository;
                        this.label = 2;
                        if (merchantAnalyticRepository2.onTouchCardNumber(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomAddNewCardAnalytic, EcomAddNewCardAnalytic.OnCvcClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository3 = this.this$0.merchantAnalyticRepository;
                        this.label = 3;
                        if (merchantAnalyticRepository3.onTouchCvc(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomAddNewCardAnalytic, EcomAddNewCardAnalytic.OnExpiredDateFieldClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository4 = this.this$0.merchantAnalyticRepository;
                        this.label = 4;
                        if (merchantAnalyticRepository4.onTouchExpireDateField(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomAddNewCardAnalytic, EcomAddNewCardAnalytic.OnPayClick.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository5 = this.this$0.merchantAnalyticRepository;
                        this.label = 5;
                        if (merchantAnalyticRepository5.onTouchPay(this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    } else if (zdlpuopuiu.eablkybsjg(ecomAddNewCardAnalytic, EcomAddNewCardAnalytic.OnPaymentViewShow.INSTANCE)) {
                        MerchantAnalyticRepository merchantAnalyticRepository6 = this.this$0.merchantAnalyticRepository;
                        this.label = 6;
                        if (merchantAnalyticRepository6.onPaymentViewShow(this) == objGxszxtbevo) {
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

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$handleEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$handleEvent$1", f = "EcomAddNewCardViewModel.kt", l = {147}, m = "invokeSuspend")
    static final class C40761 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        C40761(lg.gxszxtbevo<? super C40761> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return EcomAddNewCardViewModel.this.new C40761(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            wwaezpbzkn wwaezpbzknVar;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                lqeggnwhkg lqeggnwhkgVar = EcomAddNewCardViewModel.this._hasError;
                this.label = 1;
                obj = dxjokdxxww.pmvmpeiblj(lqeggnwhkgVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            EcomAddNewCardViewModel.this._modificationFinish.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false));
            CardInputMode nextStep = EcomAddNewCardViewModel.this.getNextStep();
            if (nextStep != null) {
                EcomAddNewCardViewModel.this._step.setValue(nextStep);
                wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } else {
                wwaezpbzknVar = null;
            }
            if (wwaezpbzknVar == null) {
                EcomAddNewCardViewModel.this.startPayment();
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                EcomAddNewCardViewModel ecomAddNewCardViewModel = EcomAddNewCardViewModel.this;
                ecomAddNewCardViewModel.cardDataManager.saveCardData((NewCardPresentationData) ecomAddNewCardViewModel._cardData.getValue());
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((C40761) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EcomAddNewCardViewModel(Reducer reducer, AppDataRepository appDataRepository, CardDataManager cardDataManager, ConfigRepository configRepository, EcomMetricUtil ecomMetricUtil, MerchantAnalyticRepository merchantAnalyticRepository) {
        super(configRepository, reducer);
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        zdlpuopuiu.btonecajqb(cardDataManager, "cardDataManager");
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        zdlpuopuiu.btonecajqb(ecomMetricUtil, "ecomMetricUtil");
        zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        this.reducer = reducer;
        this.cardDataManager = cardDataManager;
        this.ecomMetricUtil = ecomMetricUtil;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        final zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(new NewCardPresentationData(null, null, null, null, 15, null));
        this._cardData = zynmafqrjbVarIobyxmoadg;
        this.cardIcon = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$1$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        String iconUrl = ((NewCardPresentationData) obj).getPaymentSystem().getIconUrl();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(iconUrl, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        this.showCardIcon = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$2

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$2$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(((NewCardPresentationData) obj).getCardNumber().length() >= 16);
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(boolIobyxmoadg, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
        zynmafqrjb zynmafqrjbVarIobyxmoadg2 = kegysxyocb.iobyxmoadg(CardInputMode.CARD_NUMBER);
        this._step = zynmafqrjbVarIobyxmoadg2;
        this.step = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
        zynmafqrjb zynmafqrjbVarIobyxmoadg3 = kegysxyocb.iobyxmoadg(Boolean.FALSE);
        this._modificationFinish = zynmafqrjbVarIobyxmoadg3;
        lqeggnwhkg lqeggnwhkgVarDraadjrbmk = dxjokdxxww.draadjrbmk(zynmafqrjbVarIobyxmoadg2, new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$3

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$3$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        String cardNumber = ((NewCardPresentationData) obj).getCardNumber();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(cardNumber, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, zynmafqrjbVarIobyxmoadg3, new EcomAddNewCardViewModel$_errorCardNumber$2(null));
        cllcsxoeiz cllcsxoeizVarIobyxmoadg = ulzqkzuiru.iobyxmoadg(this);
        jpowsppfya.iobyxmoadg iobyxmoadgVar = jpowsppfya.f106926iobyxmoadg;
        wypolnanlu wypolnanluVarRibwqtqdhb = dxjokdxxww.ribwqtqdhb(lqeggnwhkgVarDraadjrbmk, cllcsxoeizVarIobyxmoadg, iobyxmoadgVar.wkgbmnqykc(), null);
        this._errorCardNumber = wypolnanluVarRibwqtqdhb;
        wypolnanlu wypolnanluVarRibwqtqdhb2 = dxjokdxxww.ribwqtqdhb(dxjokdxxww.gtknphoqwx(zynmafqrjbVarIobyxmoadg2, new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$4

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$4$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$4$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        String expiryMonth = ((NewCardPresentationData) obj).getExpiryMonth();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(expiryMonth, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$5

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$5$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$5$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$5$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        String expiryYear = ((NewCardPresentationData) obj).getExpiryYear();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(expiryYear, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, zynmafqrjbVarIobyxmoadg3, new EcomAddNewCardViewModel$_errorDate$3(this, null)), ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.wkgbmnqykc(), null);
        this._errorDate = wypolnanluVarRibwqtqdhb2;
        wypolnanlu wypolnanluVarRibwqtqdhb3 = dxjokdxxww.ribwqtqdhb(dxjokdxxww.draadjrbmk(zynmafqrjbVarIobyxmoadg2, new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$6

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$6$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$6$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$6$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        String cvc = ((NewCardPresentationData) obj).getCvc();
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(cvc, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        }, zynmafqrjbVarIobyxmoadg3, new EcomAddNewCardViewModel$_errorCVV$2(null)), ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.wkgbmnqykc(), null);
        this._errorCVV = wypolnanluVarRibwqtqdhb3;
        this.inputError = dxjokdxxww.wypolnanlu(wypolnanluVarRibwqtqdhb, wypolnanluVarRibwqtqdhb2, wypolnanluVarRibwqtqdhb3);
        this._hasError = dxjokdxxww.draadjrbmk(wypolnanluVarRibwqtqdhb, wypolnanluVarRibwqtqdhb2, wypolnanluVarRibwqtqdhb3, new EcomAddNewCardViewModel$_hasError$1(null));
        final wypolnanlu sessionIdResponse = appDataRepository.getSessionIdResponse();
        final lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$filterIsInstance$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$filterIsInstance$1$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
        this.orderData = dxjokdxxww.ribwqtqdhb(new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$7

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$7$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$7$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$7$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        ContentResponse.Success success = (ContentResponse.Success) obj;
                        OrderInfo orderInfo = ((SessionIdResponseBody) success.getData()).getOrderInfo();
                        OrderInfo.OrderAmount orderAmount = orderInfo != null ? orderInfo.getOrderAmount() : null;
                        OrderInfo orderInfo2 = ((SessionIdResponseBody) success.getData()).getOrderInfo();
                        EcomAddNewCardViewModel.OrderPresentationState orderPresentationState = new EcomAddNewCardViewModel.OrderPresentationState(orderAmount, orderInfo2 != null ? orderInfo2.getMerchantInfo() : null);
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(orderPresentationState, anonymousClass1) == objGxszxtbevo) {
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
        }, ulzqkzuiru.iobyxmoadg(this), iobyxmoadgVar.ppxfxbqfkf(), new OrderPresentationState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this.isEnterDataComplete = new lqeggnwhkg() { // from class: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$8

            /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$8$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lgg/wwaezpbzkn;", "emit", "(Ljava/lang/Object;Llg/gxszxtbevo;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2<T> implements nufgyqmvbu {
                final /* synthetic */ nufgyqmvbu $this_unsafeFlow;

                /* JADX INFO: renamed from: modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$8$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.viewModel.EcomAddNewCardViewModel$special$$inlined$map$8$2", f = "EcomAddNewCardViewModel.kt", l = {223}, m = "emit")
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
                        NewCardPresentationData newCardPresentationData = (NewCardPresentationData) obj;
                        Boolean boolIobyxmoadg = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(newCardPresentationData.getCardNumber().length() > 0 && newCardPresentationData.getExpiryMonth().length() > 0 && newCardPresentationData.getExpiryYear().length() > 0 && newCardPresentationData.getCvc().length() > 0 && newCardPresentationData.getCvc().length() == 3);
                        anonymousClass1.label = 1;
                        if (nufgyqmvbuVar.emit(boolIobyxmoadg, anonymousClass1) == objGxszxtbevo) {
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
                Object objCollect = zynmafqrjbVarIobyxmoadg.collect(new AnonymousClass2(nufgyqmvbuVar), gxszxtbevoVar);
                return objCollect == zoijcleaow.gxszxtbevo() ? objCollect : wwaezpbzkn.f37140iobyxmoadg;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputError getErrorOnMonth(String str) {
        if (str.length() < 2) {
            return InputError.ShortDate.INSTANCE;
        }
        if (Integer.parseInt(str) > 12) {
            return InputError.IncorrectMonth.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputError getErrorOnYear(String str) {
        if (str.length() < 2) {
            return InputError.ShortDate.INSTANCE;
        }
        if (kcexrzcfyt.stevsuqkhv(str, CommonUrlParts.Values.FALSE_INTEGER, false, 2, null)) {
            return InputError.IncorrectYear.INSTANCE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardInputMode getNextStep() {
        int i13 = WhenMappings.$EnumSwitchMapping$0[((CardInputMode) this._step.getValue()).ordinal()];
        if (i13 == 1) {
            return CardInputMode.EXPIRED_DATE;
        }
        if (i13 == 2) {
            return CardInputMode.CVV;
        }
        if (i13 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void onCloseButtonClickAction() {
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(PayViewAction.CANCEL, Views.PAYMENT_VIEW, ActionType.TOUCH, null, null, null, null, null, 248, null));
        closeSdk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startPayment() {
        this.ecomMetricUtil.report(new EcomMetricUtil.MetricEvent(PayViewAction.PAY, Views.PAYMENT_VIEW, ActionType.TOUCH, null, null, null, null, null, 248, null));
        this.reducer.invoke(new Action.HandleStartPayment.NewCard(ulzqkzuiru.iobyxmoadg(this)));
    }

    public final lqeggnwhkg getCardIcon() {
        return this.cardIcon;
    }

    public final lqeggnwhkg getInputError() {
        return this.inputError;
    }

    public final wypolnanlu getOrderData() {
        return this.orderData;
    }

    public final lqeggnwhkg getShowCardIcon() {
        return this.showCardIcon;
    }

    public final wypolnanlu getStep() {
        return this.step;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleAnalyticalEvent(MerchantAnalyticalEvent event) {
        zdlpuopuiu.btonecajqb(event, "event");
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new AnonymousClass1(event, this, null), 3, null);
    }

    /* JADX INFO: renamed from: isEnterDataComplete, reason: from getter */
    public final lqeggnwhkg getIsEnterDataComplete() {
        return this.isEnterDataComplete;
    }

    @Override // modern.payments.ecomAndroid.presentation.base.BaseViewModel
    public void handleEvent(AddNewCardFragmentEvent event) {
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, AddNewCardFragmentEvent.OnCancelBntClickedEvent.INSTANCE)) {
            onCloseButtonClickAction();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(event, AddNewCardFragmentEvent.OnShortCardNumberClickedEvent.INSTANCE)) {
            this._modificationFinish.setValue(Boolean.FALSE);
            this._step.setValue(CardInputMode.CARD_NUMBER);
            return;
        }
        if (zdlpuopuiu.eablkybsjg(event, AddNewCardFragmentEvent.OnNextBtnClickedEvent.INSTANCE)) {
            this._modificationFinish.setValue(Boolean.TRUE);
            pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(this), null, null, new C40761(null), 3, null);
            return;
        }
        if (event instanceof AddNewCardFragmentEvent.OnCardNumberModifiedEvent) {
            this._modificationFinish.setValue(Boolean.FALSE);
            zynmafqrjb zynmafqrjbVar = this._cardData;
            zynmafqrjbVar.setValue(NewCardPresentationData.copy$default((NewCardPresentationData) zynmafqrjbVar.getValue(), ((AddNewCardFragmentEvent.OnCardNumberModifiedEvent) event).getText(), null, null, null, 14, null));
            if (((NewCardPresentationData) this._cardData.getValue()).getCardNumber().length() >= 16) {
                this._step.setValue(CardInputMode.EXPIRED_DATE);
                return;
            }
            return;
        }
        if (!(event instanceof AddNewCardFragmentEvent.OnDateModifiedEvent)) {
            if (event instanceof AddNewCardFragmentEvent.OnCVVModifiedEvent) {
                this._modificationFinish.setValue(Boolean.FALSE);
                zynmafqrjb zynmafqrjbVar2 = this._cardData;
                zynmafqrjbVar2.setValue(NewCardPresentationData.copy$default((NewCardPresentationData) zynmafqrjbVar2.getValue(), null, null, null, ((AddNewCardFragmentEvent.OnCVVModifiedEvent) event).getText(), 7, null));
                return;
            }
            return;
        }
        this._modificationFinish.setValue(Boolean.FALSE);
        zynmafqrjb zynmafqrjbVar3 = this._cardData;
        AddNewCardFragmentEvent.OnDateModifiedEvent onDateModifiedEvent = (AddNewCardFragmentEvent.OnDateModifiedEvent) event;
        zynmafqrjbVar3.setValue(NewCardPresentationData.copy$default((NewCardPresentationData) zynmafqrjbVar3.getValue(), null, onDateModifiedEvent.getMonth(), onDateModifiedEvent.getYear(), null, 9, null));
        if (((NewCardPresentationData) this._cardData.getValue()).getExpiryYear().length() < 2 || ((NewCardPresentationData) this._cardData.getValue()).getExpiryMonth().length() < 2) {
            return;
        }
        this._step.setValue(CardInputMode.CVV);
    }
}
