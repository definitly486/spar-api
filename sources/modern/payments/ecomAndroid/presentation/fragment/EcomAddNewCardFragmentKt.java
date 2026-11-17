package modern.payments.ecomAndroid.presentation.fragment;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.OrderInfo;
import modern.payments.ecomAndroid.util.extension.NumeralExtensionsKt;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.ecomAndroid.util.holder.StringHolderKt;
import modern.payments.p003ecomandroid.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"getAmountText", "", "Lmodern/payments/ecomAndroid/domain/model/OrderInfo$OrderAmount;", "context", "Landroid/content/Context;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EcomAddNewCardFragmentKt {
    public static final String getAmountText(OrderInfo.OrderAmount orderAmount, Context context) {
        String currency;
        zdlpuopuiu.btonecajqb(context, "context");
        int i13 = R.string.ecom_currency_pattern;
        String strIso4217ToSymbol = null;
        String toStringAmount = NumeralExtensionsKt.formatToStringAmount(NumeralExtensionsKt.orZero(orderAmount != null ? Long.valueOf(orderAmount.getAmount()) : null));
        if (orderAmount != null && (currency = orderAmount.getCurrency()) != null) {
            strIso4217ToSymbol = StringExtensionsKt.iso4217ToSymbol(currency);
        }
        if (strIso4217ToSymbol == null) {
            strIso4217ToSymbol = "";
        }
        return StringHolderKt.getText(StringHolderKt.StringHolder(i13, toStringAmount, strIso4217ToSymbol), context);
    }
}
