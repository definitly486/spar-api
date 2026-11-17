package modern.payments.ecomAndroid.presentation.fragment.paymentMode;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.api.EcomUiPreferences;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.domain.model.OrderInfo;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeItem;
import modern.payments.ecomAndroid.util.extension.NumeralExtensionsKt;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.ecomAndroid.util.holder.StringHolderKt;
import modern.payments.p003ecomandroid.R;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u008a@"}, d2 = {"<anonymous>", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/EcomPaymentModeViewModel$PaymentMethodScreenState;", "methods", "", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeItem;", "session", "Lmodern/payments/ecomAndroid/data/api/ContentResponse$Success;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@gxszxtbevo(c = "modern.payments.ecomAndroid.presentation.fragment.paymentMode.EcomPaymentModeViewModel$state$1", f = "EcomPaymentModeViewModel.kt", l = {}, m = "invokeSuspend")
final class EcomPaymentModeViewModel$state$1 extends draadjrbmk implements vdvldrhtss {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EcomPaymentModeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EcomPaymentModeViewModel$state$1(EcomPaymentModeViewModel ecomPaymentModeViewModel, lg.gxszxtbevo<? super EcomPaymentModeViewModel$state$1> gxszxtbevoVar) {
        super(3, gxszxtbevoVar);
        this.this$0 = ecomPaymentModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        String merchantLogoUrl;
        OrderInfo.MerchantInfo merchantInfo;
        OrderInfo.OrderAmount orderAmount;
        String currency;
        OrderInfo.OrderAmount orderAmount2;
        OrderInfo.MerchantInfo merchantInfo2;
        zoijcleaow.gxszxtbevo();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        zdlpuopuiu.zoijcleaow(obj);
        List list = (List) this.L$0;
        ContentResponse.Success success = (ContentResponse.Success) this.L$1;
        OrderInfo orderInfo = ((SessionIdResponseBody) success.getData()).getOrderInfo();
        String strIso4217ToSymbol = null;
        String merchantName = (orderInfo == null || (merchantInfo2 = orderInfo.getMerchantInfo()) == null) ? null : merchantInfo2.getMerchantName();
        if (merchantName == null) {
            merchantName = "";
        }
        EcomUiPreferences.EcomUIColorPreferences uIColorPreferences = this.this$0.uiPreferencesRepository.getUIColorPreferences();
        if (uIColorPreferences == null || (merchantLogoUrl = uIColorPreferences.getMerchantIcon()) == null) {
            OrderInfo orderInfo2 = ((SessionIdResponseBody) success.getData()).getOrderInfo();
            merchantLogoUrl = (orderInfo2 == null || (merchantInfo = orderInfo2.getMerchantInfo()) == null) ? null : merchantInfo.getMerchantLogoUrl();
        }
        int i13 = R.string.ecom_currency_pattern;
        OrderInfo orderInfo3 = ((SessionIdResponseBody) success.getData()).getOrderInfo();
        String toStringAmount = NumeralExtensionsKt.formatToStringAmount(NumeralExtensionsKt.orZero((orderInfo3 == null || (orderAmount2 = orderInfo3.getOrderAmount()) == null) ? null : kotlin.coroutines.jvm.internal.zoijcleaow.eablkybsjg(orderAmount2.getAmount())));
        OrderInfo orderInfo4 = ((SessionIdResponseBody) success.getData()).getOrderInfo();
        if (orderInfo4 != null && (orderAmount = orderInfo4.getOrderAmount()) != null && (currency = orderAmount.getCurrency()) != null) {
            strIso4217ToSymbol = StringExtensionsKt.iso4217ToSymbol(currency);
        }
        return new EcomPaymentModeViewModel.PaymentMethodScreenState(merchantName, merchantLogoUrl, StringHolderKt.StringHolder(i13, toStringAmount, strIso4217ToSymbol != null ? strIso4217ToSymbol : ""), list);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(List<? extends PayModeItem> list, ContentResponse.Success<SessionIdResponseBody> success, lg.gxszxtbevo<? super EcomPaymentModeViewModel.PaymentMethodScreenState> gxszxtbevoVar) {
        EcomPaymentModeViewModel$state$1 ecomPaymentModeViewModel$state$1 = new EcomPaymentModeViewModel$state$1(this.this$0, gxszxtbevoVar);
        ecomPaymentModeViewModel$state$1.L$0 = list;
        ecomPaymentModeViewModel$state$1.L$1 = success;
        return ecomPaymentModeViewModel$state$1.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
    }
}
