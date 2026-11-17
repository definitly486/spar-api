package modern.payments.ecomAndroid.util.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.model.EcomBindingInfo;
import modern.payments.ecomAndroid.presentation.fragment.paymentMode.model.PayModeBindingCardItem;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toBindingPayModeItem", "Lmodern/payments/ecomAndroid/presentation/fragment/paymentMode/model/PayModeBindingCardItem;", "Lmodern/payments/ecomAndroid/domain/model/EcomBindingInfo;", "ecomAndroid_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MappingExtensionsKt {
    public static final PayModeBindingCardItem toBindingPayModeItem(EcomBindingInfo ecomBindingInfo) {
        zdlpuopuiu.btonecajqb(ecomBindingInfo, "<this>");
        return new PayModeBindingCardItem(ecomBindingInfo.getBindingId(), ecomBindingInfo.getMaskedPan(), ecomBindingInfo.getCardLogoUrl());
    }
}
