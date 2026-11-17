package ru.myspar.orders.impl.screens.specific.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.order.OrderPayment;
import ru.myspar.core.domain.models.order.OrderPickupStatus;
import ru.myspar.core.domain.models.order.OrderStatus;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.SpecificOrderStore$State, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\ba\b\u0087\b\u0018\u00002\u00020\u0001:\u0004°\u0001±\u0001Bõ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020\b\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020\b\u0012\b\b\u0002\u0010/\u001a\u00020\b\u0012\b\b\u0002\u00100\u001a\u00020\b\u0012\b\b\u0002\u00101\u001a\u00020\u0004\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\b\b\u0002\u00103\u001a\u00020\u001e\u0012\b\b\u0002\u00104\u001a\u00020\b\u0012\b\b\u0002\u00105\u001a\u00020\b\u0012\b\b\u0002\u00106\u001a\u00020\b\u0012\b\b\u0002\u00107\u001a\u00020\u0004\u0012\b\b\u0002\u00108\u001a\u00020\b\u0012\b\b\u0002\u00109\u001a\u00020\u0004\u0012\b\b\u0002\u0010:\u001a\u00020\b\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;0(\u0012\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020=0(\u0012\b\b\u0002\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u001f\u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u001eH\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001eH\u0007¢\u0006\u0004\bI\u0010JJ\u0084\u0004\u0010L\u001a\u00020K2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u001e2\b\b\u0002\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\b2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;0(2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020=0(2\b\b\u0002\u0010@\u001a\u00020?HÇ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0004H×\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u001eH×\u0001¢\u0006\u0004\bP\u0010JJ\u001a\u0010S\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010QH×\u0003¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010Y\u001a\u0004\bZ\u0010OR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010OR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010Y\u001a\u0004\bf\u0010OR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010Y\u001a\u0004\bh\u0010OR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010Y\u001a\u0004\be\u0010OR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bj\u0010Y\u001a\u0004\bk\u0010OR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bl\u0010Y\u001a\u0004\bm\u0010OR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bn\u0010Y\u001a\u0004\bo\u0010OR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bp\u0010Y\u001a\u0004\bq\u0010OR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b]\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010Y\u001a\u0004\bv\u0010OR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bk\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bo\u0010z\u001a\u0004\bu\u0010{R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010Y\u001a\u0004\b|\u0010OR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b}\u0010Y\u001a\u0004\b~\u0010OR\u001a\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010`\u001a\u0005\b\u0084\u0001\u0010bR\u001a\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010JR\u0019\u0010 \u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010`\u001a\u0005\b\u0089\u0001\u0010bR\u0019\u0010!\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010`\u001a\u0005\b\u008b\u0001\u0010bR\u0019\u0010\"\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010`\u001a\u0005\b\u008d\u0001\u0010bR\u0018\u0010#\u001a\u00020\b8\u0006¢\u0006\r\n\u0005\b\u008e\u0001\u0010`\u001a\u0004\b}\u0010bR\u0018\u0010$\u001a\u00020\b8\u0006¢\u0006\r\n\u0005\b\u008f\u0001\u0010`\u001a\u0004\b_\u0010bR\u0019\u0010%\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010`\u001a\u0005\b\u0091\u0001\u0010bR\u0019\u0010&\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010`\u001a\u0005\b\u0093\u0001\u0010bR\u0019\u0010'\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010`\u001a\u0005\b\u0095\u0001\u0010bR!\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0096\u0001\u001a\u0006\b\u008f\u0001\u0010\u0097\u0001R\u001b\u0010,\u001a\u00020+8\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u008c\u0001\u0010\u009a\u0001R\u0018\u0010-\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bd\u0010`\u001a\u0005\b\u009b\u0001\u0010bR\u0018\u0010.\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\bf\u0010`\u001a\u0005\b\u009c\u0001\u0010bR\u0019\u0010/\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010`\u001a\u0005\b\u009e\u0001\u0010bR\u0019\u00100\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010`\u001a\u0005\b\u009f\u0001\u0010bR\u0019\u00101\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010Y\u001a\u0005\b¡\u0001\u0010OR\u0019\u00102\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010Y\u001a\u0005\b£\u0001\u0010OR\u0019\u00103\u001a\u00020\u001e8\u0006¢\u0006\u000e\n\u0005\b|\u0010\u0086\u0001\u001a\u0005\b\u009d\u0001\u0010JR\u0019\u00104\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010`\u001a\u0005\b¥\u0001\u0010bR\u0019\u00105\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010`\u001a\u0005\b§\u0001\u0010bR\u0019\u00106\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010`\u001a\u0005\b©\u0001\u0010bR\u0018\u00107\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\bª\u0001\u0010Y\u001a\u0004\bp\u0010OR\u0019\u00108\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010`\u001a\u0005\b«\u0001\u0010bR\u0019\u00109\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010Y\u001a\u0005\b\u008e\u0001\u0010OR\u0018\u0010:\u001a\u00020\b8\u0006¢\u0006\r\n\u0004\b~\u0010`\u001a\u0005\b \u0001\u0010bR!\u0010<\u001a\b\u0012\u0004\u0012\u00020;0(8\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0096\u0001\u001a\u0006\b¦\u0001\u0010\u0097\u0001R!\u0010>\u001a\b\u0012\u0004\u0012\u00020=0(8\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0096\u0001\u001a\u0006\b\u0085\u0001\u0010\u0097\u0001R\u001a\u0010@\u001a\u00020?8\u0006¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010®\u0001\u001a\u0005\b\u007f\u0010¯\u0001¨\u0006²\u0001"}, d2 = {"ru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State", "Landroid/os/Parcelable;", "Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DomainData;", "domainData", "", "id", "Lc10/gxszxtbevo;", "orderServerStatus", "", "isNeededOpenPaymentScreen", "receiver", "recipientPhone", "deliveryPhone", Scopes.EMAIL, "partnerCode", "partnerType", "partnerName", "deliveryMethod", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "address", "Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DeliveryTime;", "deliveryTime", "Lru/myspar/core/domain/models/order/OrderStatus;", "orderStatus", "totalDiscount", "totalWeight", "", "totalPrice", "canRate", "", "rating", "isRatedOrder", "cancelOrderButtonIsVisible", "callButtonIsVisible", "payButtonsIsEnabled", "editOrderIsVisible", "isOrderBlockedForEdit", "trackingButtonIsVisible", "repeatOrderIsVisible", "", "Lru/myspar/core/domain/models/order/productreplacement/ProductReplaceModel;", "products", "Lru/myspar/core/domain/models/order/OrderPickupStatus;", "pickupStatus", "isProductsClickable", "isPartnerInfoVisible", "isLoading", "isPickupStatusButtonFeatureEnabled", "currentTime", "waitTime", "remainTime", "isOneProductReplacement", "isOneProductUnavailable", "isOneProductAvailableWithoutReplacement", "message", "confirmBtnEnabled", "postamatCode", "tipsAvailable", "Lru/myspar/core/domain/models/order/OrderTotalInfoItem;", "totalInfo", "Lru/myspar/components/payment/api/models/PaymentModel;", "payments", "Lru/myspar/core/domain/models/order/OrderPayment;", "payment", "<init>", "(Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DomainData;Ljava/lang/String;Lc10/gxszxtbevo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DeliveryTime;Lru/myspar/core/domain/models/order/OrderStatus;Ljava/lang/String;Ljava/lang/String;DZIZZZZZZZZLjava/util/List;Lru/myspar/core/domain/models/order/OrderPickupStatus;ZZZZLjava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;ZLjava/lang/String;ZLjava/util/List;Ljava/util/List;Lru/myspar/core/domain/models/order/OrderPayment;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State;", "zoijcleaow", "(Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DomainData;Ljava/lang/String;Lc10/gxszxtbevo;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DeliveryTime;Lru/myspar/core/domain/models/order/OrderStatus;Ljava/lang/String;Ljava/lang/String;DZIZZZZZZZZLjava/util/List;Lru/myspar/core/domain/models/order/OrderPickupStatus;ZZZZLjava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;ZLjava/lang/String;ZLjava/util/List;Ljava/util/List;Lru/myspar/core/domain/models/order/OrderPayment;)Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DomainData;", "yggfygwlhe", "()Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DomainData;", "Ljava/lang/String;", "getId", "jyumaefscl", "Lc10/gxszxtbevo;", "iozdgvuglv", "()Lc10/gxszxtbevo;", "iwizpuwonk", "Z", "bfopjjpdmp", "()Z", "cqumvgiudr", "jlmebxxoox", "esjtqupxsv", "ribwqtqdhb", "lereixgezr", "wflxmlrfwp", "pmvmpeiblj", "zynmafqrjb", "wwaezpbzkn", "istkbnxepw", "pkzmftpjix", "cdpycssgdh", "ylkuphrtab", "yadqdtsiqt", "gtknphoqwx", "Lru/myspar/core/models/delivery/DeliveryCode;", "btonecajqb", "()Lru/myspar/core/models/delivery/DeliveryCode;", "lmojexxdyd", "eablkybsjg", "Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DeliveryTime;", "oxmwwwfdhm", "()Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DeliveryTime;", "Lru/myspar/core/domain/models/order/OrderStatus;", "()Lru/myspar/core/domain/models/order/OrderStatus;", "jztzpxfvev", "hcddaimhww", "ydmasvzmpa", "jpowsppfya", "D", "uwvvkdfqfp", "()D", "hkdspvbjdz", "lqeggnwhkg", "cllcsxoeiz", "I", "sopmlzcsov", "dsvhmnatus", "igdgnonuha", "wypolnanlu", "nufgyqmvbu", "stevsuqkhv", "gxszxtbevo", "kegysxyocb", "tzroggbefp", "mbcevpiqjq", "auzgnhcxok", "ntlheqmsrt", "sflfametgt", "ulzqkzuiru", "jhduphickx", "Ljava/util/List;", "()Ljava/util/List;", "crxdokpmqz", "Lru/myspar/core/domain/models/order/OrderPickupStatus;", "()Lru/myspar/core/domain/models/order/OrderPickupStatus;", "skhdrjzrfn", "iwxlajgraz", "vipkmwdibw", "oipsdeybqn", "dvvnrvtcbc", "ikoacuggdj", "getCurrentTime", "okpsazkaxt", "getWaitTime", "xrmfcynszj", "zeieaojujs", "metgxyhuhe", "roivzttewh", "rlfsiqarku", "lrnfpwlwnk", "czzsidtyhn", "dxjokdxxww", "yfnezrywwk", "zfvoamnweg", "Lru/myspar/core/domain/models/order/OrderPayment;", "()Lru/myspar/core/domain/models/order/OrderPayment;", "DomainData", "DeliveryTime", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerName;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String receiver;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderPickupStatus pickupStatus;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRatedOrder;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String recipientPhone;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalWeight;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canRate;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentTime;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerType;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeededOpenPaymentScreen;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPickupStatusButtonFeatureEnabled;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProductsClickable;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalPrice;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final c10.gxszxtbevo orderServerStatus;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name and from kotlin metadata and from toString */
    private final int remainTime;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean payButtonsIsEnabled;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryPhone;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderBlockedForEdit;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOneProductUnavailable;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean trackingButtonIsVisible;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderPayment payment;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String waitTime;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalDiscount;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPartnerInfoVisible;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOneProductAvailableWithoutReplacement;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name and from kotlin metadata and from toString */
    private final List totalInfo;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name and from kotlin metadata and from toString */
    private final List products;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean callButtonIsVisible;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean editOrderIsVisible;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean repeatOrderIsVisible;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean confirmBtnEnabled;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryTime deliveryTime;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cancelOrderButtonIsVisible;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOneProductReplacement;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryMethod;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipsAvailable;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postamatCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderStatus orderStatus;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final DomainData domainData;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List payments;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCode;

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.SpecificOrderStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            DomainData domainDataCreateFromParcel = DomainData.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            c10.gxszxtbevo gxszxtbevoVarValueOf = c10.gxszxtbevo.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(State.class.getClassLoader());
            String string10 = parcel.readString();
            DeliveryTime deliveryTimeCreateFromParcel = DeliveryTime.CREATOR.createFromParcel(parcel);
            OrderStatus orderStatus = (OrderStatus) parcel.readParcelable(State.class.getClassLoader());
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            double d13 = parcel.readDouble();
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            boolean z19 = parcel.readInt() != 0;
            boolean z23 = parcel.readInt() != 0;
            boolean z24 = parcel.readInt() != 0;
            boolean z25 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int i15 = 0;
            while (i15 != i14) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
                i15++;
                i14 = i14;
            }
            OrderPickupStatus orderPickupStatus = (OrderPickupStatus) parcel.readParcelable(State.class.getClassLoader());
            boolean z26 = parcel.readInt() != 0;
            boolean z27 = parcel.readInt() != 0;
            boolean z28 = parcel.readInt() != 0;
            boolean z29 = parcel.readInt() != 0;
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            int i16 = parcel.readInt();
            boolean z33 = parcel.readInt() != 0;
            boolean z34 = parcel.readInt() != 0;
            boolean z35 = parcel.readInt() != 0;
            String string15 = parcel.readString();
            boolean z36 = parcel.readInt() != 0;
            String string16 = parcel.readString();
            boolean z37 = parcel.readInt() != 0;
            int i17 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
                i18++;
                i17 = i17;
            }
            int i19 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i19);
            int i23 = 0;
            while (i23 != i19) {
                arrayList3.add(parcel.readParcelable(State.class.getClassLoader()));
                i23++;
                i19 = i19;
            }
            return new State(domainDataCreateFromParcel, string, gxszxtbevoVarValueOf, z13, string2, string3, string4, string5, string6, string7, string8, string9, deliveryCode, string10, deliveryTimeCreateFromParcel, orderStatus, string11, string12, d13, z14, i13, z15, z16, z17, z18, z19, z23, z24, z25, arrayList, orderPickupStatus, z26, z27, z28, z29, string13, string14, i16, z33, z34, z35, string15, z36, string16, z37, arrayList2, arrayList3, (OrderPayment) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(DomainData domainData, String id2, c10.gxszxtbevo orderServerStatus, boolean z13, String receiver, String recipientPhone, String deliveryPhone, String email, String partnerCode, String partnerType, String partnerName, String deliveryMethod, DeliveryCode deliveryCode, String address, DeliveryTime deliveryTime, OrderStatus orderStatus, String totalDiscount, String totalWeight, double d13, boolean z14, int i13, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, List products, OrderPickupStatus pickupStatus, boolean z26, boolean z27, boolean z28, boolean z29, String currentTime, String waitTime, int i14, boolean z33, boolean z34, boolean z35, String message, boolean z36, String postamatCode, boolean z37, List totalInfo, List payments, OrderPayment payment) {
        zdlpuopuiu.btonecajqb(domainData, "domainData");
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(orderServerStatus, "orderServerStatus");
        zdlpuopuiu.btonecajqb(receiver, "receiver");
        zdlpuopuiu.btonecajqb(recipientPhone, "recipientPhone");
        zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
        zdlpuopuiu.btonecajqb(partnerType, "partnerType");
        zdlpuopuiu.btonecajqb(partnerName, "partnerName");
        zdlpuopuiu.btonecajqb(deliveryMethod, "deliveryMethod");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
        zdlpuopuiu.btonecajqb(orderStatus, "orderStatus");
        zdlpuopuiu.btonecajqb(totalDiscount, "totalDiscount");
        zdlpuopuiu.btonecajqb(totalWeight, "totalWeight");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(pickupStatus, "pickupStatus");
        zdlpuopuiu.btonecajqb(currentTime, "currentTime");
        zdlpuopuiu.btonecajqb(waitTime, "waitTime");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(postamatCode, "postamatCode");
        zdlpuopuiu.btonecajqb(totalInfo, "totalInfo");
        zdlpuopuiu.btonecajqb(payments, "payments");
        zdlpuopuiu.btonecajqb(payment, "payment");
        this.domainData = domainData;
        this.id = id2;
        this.orderServerStatus = orderServerStatus;
        this.isNeededOpenPaymentScreen = z13;
        this.receiver = receiver;
        this.recipientPhone = recipientPhone;
        this.deliveryPhone = deliveryPhone;
        this.email = email;
        this.partnerCode = partnerCode;
        this.partnerType = partnerType;
        this.partnerName = partnerName;
        this.deliveryMethod = deliveryMethod;
        this.deliveryCode = deliveryCode;
        this.address = address;
        this.deliveryTime = deliveryTime;
        this.orderStatus = orderStatus;
        this.totalDiscount = totalDiscount;
        this.totalWeight = totalWeight;
        this.totalPrice = d13;
        this.canRate = z14;
        this.rating = i13;
        this.isRatedOrder = z15;
        this.cancelOrderButtonIsVisible = z16;
        this.callButtonIsVisible = z17;
        this.payButtonsIsEnabled = z18;
        this.editOrderIsVisible = z19;
        this.isOrderBlockedForEdit = z23;
        this.trackingButtonIsVisible = z24;
        this.repeatOrderIsVisible = z25;
        this.products = products;
        this.pickupStatus = pickupStatus;
        this.isProductsClickable = z26;
        this.isPartnerInfoVisible = z27;
        this.isLoading = z28;
        this.isPickupStatusButtonFeatureEnabled = z29;
        this.currentTime = currentTime;
        this.waitTime = waitTime;
        this.remainTime = i14;
        this.isOneProductReplacement = z33;
        this.isOneProductUnavailable = z34;
        this.isOneProductAvailableWithoutReplacement = z35;
        this.message = message;
        this.confirmBtnEnabled = z36;
        this.postamatCode = postamatCode;
        this.tipsAvailable = z37;
        this.totalInfo = totalInfo;
        this.payments = payments;
        this.payment = payment;
    }

    /* JADX INFO: renamed from: auzgnhcxok, reason: from getter */
    public final boolean getIsOrderBlockedForEdit() {
        return this.isOrderBlockedForEdit;
    }

    /* JADX INFO: renamed from: bfopjjpdmp, reason: from getter */
    public final boolean getIsNeededOpenPaymentScreen() {
        return this.isNeededOpenPaymentScreen;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: from getter */
    public final boolean getIsPickupStatusButtonFeatureEnabled() {
        return this.isPickupStatusButtonFeatureEnabled;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getConfirmBtnEnabled() {
        return this.confirmBtnEnabled;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.domainData, state.domainData) && zdlpuopuiu.eablkybsjg(this.id, state.id) && this.orderServerStatus == state.orderServerStatus && this.isNeededOpenPaymentScreen == state.isNeededOpenPaymentScreen && zdlpuopuiu.eablkybsjg(this.receiver, state.receiver) && zdlpuopuiu.eablkybsjg(this.recipientPhone, state.recipientPhone) && zdlpuopuiu.eablkybsjg(this.deliveryPhone, state.deliveryPhone) && zdlpuopuiu.eablkybsjg(this.email, state.email) && zdlpuopuiu.eablkybsjg(this.partnerCode, state.partnerCode) && zdlpuopuiu.eablkybsjg(this.partnerType, state.partnerType) && zdlpuopuiu.eablkybsjg(this.partnerName, state.partnerName) && zdlpuopuiu.eablkybsjg(this.deliveryMethod, state.deliveryMethod) && this.deliveryCode == state.deliveryCode && zdlpuopuiu.eablkybsjg(this.address, state.address) && zdlpuopuiu.eablkybsjg(this.deliveryTime, state.deliveryTime) && this.orderStatus == state.orderStatus && zdlpuopuiu.eablkybsjg(this.totalDiscount, state.totalDiscount) && zdlpuopuiu.eablkybsjg(this.totalWeight, state.totalWeight) && Double.compare(this.totalPrice, state.totalPrice) == 0 && this.canRate == state.canRate && this.rating == state.rating && this.isRatedOrder == state.isRatedOrder && this.cancelOrderButtonIsVisible == state.cancelOrderButtonIsVisible && this.callButtonIsVisible == state.callButtonIsVisible && this.payButtonsIsEnabled == state.payButtonsIsEnabled && this.editOrderIsVisible == state.editOrderIsVisible && this.isOrderBlockedForEdit == state.isOrderBlockedForEdit && this.trackingButtonIsVisible == state.trackingButtonIsVisible && this.repeatOrderIsVisible == state.repeatOrderIsVisible && zdlpuopuiu.eablkybsjg(this.products, state.products) && this.pickupStatus == state.pickupStatus && this.isProductsClickable == state.isProductsClickable && this.isPartnerInfoVisible == state.isPartnerInfoVisible && this.isLoading == state.isLoading && this.isPickupStatusButtonFeatureEnabled == state.isPickupStatusButtonFeatureEnabled && zdlpuopuiu.eablkybsjg(this.currentTime, state.currentTime) && zdlpuopuiu.eablkybsjg(this.waitTime, state.waitTime) && this.remainTime == state.remainTime && this.isOneProductReplacement == state.isOneProductReplacement && this.isOneProductUnavailable == state.isOneProductUnavailable && this.isOneProductAvailableWithoutReplacement == state.isOneProductAvailableWithoutReplacement && zdlpuopuiu.eablkybsjg(this.message, state.message) && this.confirmBtnEnabled == state.confirmBtnEnabled && zdlpuopuiu.eablkybsjg(this.postamatCode, state.postamatCode) && this.tipsAvailable == state.tipsAvailable && zdlpuopuiu.eablkybsjg(this.totalInfo, state.totalInfo) && zdlpuopuiu.eablkybsjg(this.payments, state.payments) && zdlpuopuiu.eablkybsjg(this.payment, state.payment);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getCallButtonIsVisible() {
        return this.callButtonIsVisible;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.domainData.hashCode() * 31) + this.id.hashCode()) * 31) + this.orderServerStatus.hashCode()) * 31) + Boolean.hashCode(this.isNeededOpenPaymentScreen)) * 31) + this.receiver.hashCode()) * 31) + this.recipientPhone.hashCode()) * 31) + this.deliveryPhone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.partnerCode.hashCode()) * 31) + this.partnerType.hashCode()) * 31) + this.partnerName.hashCode()) * 31) + this.deliveryMethod.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.address.hashCode()) * 31) + this.deliveryTime.hashCode()) * 31) + this.orderStatus.hashCode()) * 31) + this.totalDiscount.hashCode()) * 31) + this.totalWeight.hashCode()) * 31) + Double.hashCode(this.totalPrice)) * 31) + Boolean.hashCode(this.canRate)) * 31) + Integer.hashCode(this.rating)) * 31) + Boolean.hashCode(this.isRatedOrder)) * 31) + Boolean.hashCode(this.cancelOrderButtonIsVisible)) * 31) + Boolean.hashCode(this.callButtonIsVisible)) * 31) + Boolean.hashCode(this.payButtonsIsEnabled)) * 31) + Boolean.hashCode(this.editOrderIsVisible)) * 31) + Boolean.hashCode(this.isOrderBlockedForEdit)) * 31) + Boolean.hashCode(this.trackingButtonIsVisible)) * 31) + Boolean.hashCode(this.repeatOrderIsVisible)) * 31) + this.products.hashCode()) * 31) + this.pickupStatus.hashCode()) * 31) + Boolean.hashCode(this.isProductsClickable)) * 31) + Boolean.hashCode(this.isPartnerInfoVisible)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isPickupStatusButtonFeatureEnabled)) * 31) + this.currentTime.hashCode()) * 31) + this.waitTime.hashCode()) * 31) + Integer.hashCode(this.remainTime)) * 31) + Boolean.hashCode(this.isOneProductReplacement)) * 31) + Boolean.hashCode(this.isOneProductUnavailable)) * 31) + Boolean.hashCode(this.isOneProductAvailableWithoutReplacement)) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.confirmBtnEnabled)) * 31) + this.postamatCode.hashCode()) * 31) + Boolean.hashCode(this.tipsAvailable)) * 31) + this.totalInfo.hashCode()) * 31) + this.payments.hashCode()) * 31) + this.payment.hashCode();
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final boolean getPayButtonsIsEnabled() {
        return this.payButtonsIsEnabled;
    }

    /* JADX INFO: renamed from: igdgnonuha, reason: from getter */
    public final boolean getIsRatedOrder() {
        return this.isRatedOrder;
    }

    /* JADX INFO: renamed from: ikoacuggdj, reason: from getter */
    public final boolean getTipsAvailable() {
        return this.tipsAvailable;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final c10.gxszxtbevo getOrderServerStatus() {
        return this.orderServerStatus;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getEditOrderIsVisible() {
        return this.editOrderIsVisible;
    }

    /* JADX INFO: renamed from: iwxlajgraz, reason: from getter */
    public final boolean getIsPartnerInfoVisible() {
        return this.isPartnerInfoVisible;
    }

    /* JADX INFO: renamed from: jhduphickx, reason: from getter */
    public final boolean getRepeatOrderIsVisible() {
        return this.repeatOrderIsVisible;
    }

    /* JADX INFO: renamed from: jlmebxxoox, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final OrderPayment getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: jztzpxfvev, reason: from getter */
    public final String getTotalDiscount() {
        return this.totalDiscount;
    }

    /* JADX INFO: renamed from: kegysxyocb, reason: from getter */
    public final String getPostamatCode() {
        return this.postamatCode;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final OrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getCanRate() {
        return this.canRate;
    }

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: from getter */
    public final boolean getIsOneProductAvailableWithoutReplacement() {
        return this.isOneProductAvailableWithoutReplacement;
    }

    /* JADX INFO: renamed from: metgxyhuhe, reason: from getter */
    public final List getTotalInfo() {
        return this.totalInfo;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getCancelOrderButtonIsVisible() {
        return this.cancelOrderButtonIsVisible;
    }

    /* JADX INFO: renamed from: oipsdeybqn, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final DeliveryTime getDeliveryTime() {
        return this.deliveryTime;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final String getPartnerType() {
        return this.partnerType;
    }

    /* JADX INFO: renamed from: ribwqtqdhb, reason: from getter */
    public final String getRecipientPhone() {
        return this.recipientPhone;
    }

    /* JADX INFO: renamed from: roivzttewh, reason: from getter */
    public final boolean getIsOneProductUnavailable() {
        return this.isOneProductUnavailable;
    }

    /* JADX INFO: renamed from: sflfametgt, reason: from getter */
    public final boolean getTrackingButtonIsVisible() {
        return this.trackingButtonIsVisible;
    }

    /* JADX INFO: renamed from: skhdrjzrfn, reason: from getter */
    public final boolean getIsProductsClickable() {
        return this.isProductsClickable;
    }

    /* JADX INFO: renamed from: sopmlzcsov, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: stevsuqkhv, reason: from getter */
    public final OrderPickupStatus getPickupStatus() {
        return this.pickupStatus;
    }

    public String toString() {
        return "State(domainData=" + this.domainData + ", id=" + this.id + ", orderServerStatus=" + this.orderServerStatus + ", isNeededOpenPaymentScreen=" + this.isNeededOpenPaymentScreen + ", receiver=" + this.receiver + ", recipientPhone=" + this.recipientPhone + ", deliveryPhone=" + this.deliveryPhone + ", email=" + this.email + ", partnerCode=" + this.partnerCode + ", partnerType=" + this.partnerType + ", partnerName=" + this.partnerName + ", deliveryMethod=" + this.deliveryMethod + ", deliveryCode=" + this.deliveryCode + ", address=" + this.address + ", deliveryTime=" + this.deliveryTime + ", orderStatus=" + this.orderStatus + ", totalDiscount=" + this.totalDiscount + ", totalWeight=" + this.totalWeight + ", totalPrice=" + this.totalPrice + ", canRate=" + this.canRate + ", rating=" + this.rating + ", isRatedOrder=" + this.isRatedOrder + ", cancelOrderButtonIsVisible=" + this.cancelOrderButtonIsVisible + ", callButtonIsVisible=" + this.callButtonIsVisible + ", payButtonsIsEnabled=" + this.payButtonsIsEnabled + ", editOrderIsVisible=" + this.editOrderIsVisible + ", isOrderBlockedForEdit=" + this.isOrderBlockedForEdit + ", trackingButtonIsVisible=" + this.trackingButtonIsVisible + ", repeatOrderIsVisible=" + this.repeatOrderIsVisible + ", products=" + this.products + ", pickupStatus=" + this.pickupStatus + ", isProductsClickable=" + this.isProductsClickable + ", isPartnerInfoVisible=" + this.isPartnerInfoVisible + ", isLoading=" + this.isLoading + ", isPickupStatusButtonFeatureEnabled=" + this.isPickupStatusButtonFeatureEnabled + ", currentTime=" + this.currentTime + ", waitTime=" + this.waitTime + ", remainTime=" + this.remainTime + ", isOneProductReplacement=" + this.isOneProductReplacement + ", isOneProductUnavailable=" + this.isOneProductUnavailable + ", isOneProductAvailableWithoutReplacement=" + this.isOneProductAvailableWithoutReplacement + ", message=" + this.message + ", confirmBtnEnabled=" + this.confirmBtnEnabled + ", postamatCode=" + this.postamatCode + ", tipsAvailable=" + this.tipsAvailable + ", totalInfo=" + this.totalInfo + ", payments=" + this.payments + ", payment=" + this.payment + ")";
    }

    /* JADX INFO: renamed from: tzroggbefp, reason: from getter */
    public final List getProducts() {
        return this.products;
    }

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: from getter */
    public final double getTotalPrice() {
        return this.totalPrice;
    }

    /* JADX INFO: renamed from: vipkmwdibw, reason: from getter */
    public final int getRemainTime() {
        return this.remainTime;
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getDeliveryPhone() {
        return this.deliveryPhone;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.domainData.writeToParcel(dest, flags);
        dest.writeString(this.id);
        dest.writeString(this.orderServerStatus.name());
        dest.writeInt(this.isNeededOpenPaymentScreen ? 1 : 0);
        dest.writeString(this.receiver);
        dest.writeString(this.recipientPhone);
        dest.writeString(this.deliveryPhone);
        dest.writeString(this.email);
        dest.writeString(this.partnerCode);
        dest.writeString(this.partnerType);
        dest.writeString(this.partnerName);
        dest.writeString(this.deliveryMethod);
        dest.writeParcelable(this.deliveryCode, flags);
        dest.writeString(this.address);
        this.deliveryTime.writeToParcel(dest, flags);
        dest.writeParcelable(this.orderStatus, flags);
        dest.writeString(this.totalDiscount);
        dest.writeString(this.totalWeight);
        dest.writeDouble(this.totalPrice);
        dest.writeInt(this.canRate ? 1 : 0);
        dest.writeInt(this.rating);
        dest.writeInt(this.isRatedOrder ? 1 : 0);
        dest.writeInt(this.cancelOrderButtonIsVisible ? 1 : 0);
        dest.writeInt(this.callButtonIsVisible ? 1 : 0);
        dest.writeInt(this.payButtonsIsEnabled ? 1 : 0);
        dest.writeInt(this.editOrderIsVisible ? 1 : 0);
        dest.writeInt(this.isOrderBlockedForEdit ? 1 : 0);
        dest.writeInt(this.trackingButtonIsVisible ? 1 : 0);
        dest.writeInt(this.repeatOrderIsVisible ? 1 : 0);
        List list = this.products;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeParcelable(this.pickupStatus, flags);
        dest.writeInt(this.isProductsClickable ? 1 : 0);
        dest.writeInt(this.isPartnerInfoVisible ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isPickupStatusButtonFeatureEnabled ? 1 : 0);
        dest.writeString(this.currentTime);
        dest.writeString(this.waitTime);
        dest.writeInt(this.remainTime);
        dest.writeInt(this.isOneProductReplacement ? 1 : 0);
        dest.writeInt(this.isOneProductUnavailable ? 1 : 0);
        dest.writeInt(this.isOneProductAvailableWithoutReplacement ? 1 : 0);
        dest.writeString(this.message);
        dest.writeInt(this.confirmBtnEnabled ? 1 : 0);
        dest.writeString(this.postamatCode);
        dest.writeInt(this.tipsAvailable ? 1 : 0);
        List list2 = this.totalInfo;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        List list3 = this.payments;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
        dest.writeParcelable(this.payment, flags);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: ydmasvzmpa, reason: from getter */
    public final String getTotalWeight() {
        return this.totalWeight;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final DomainData getDomainData() {
        return this.domainData;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    /* JADX INFO: renamed from: zeieaojujs, reason: from getter */
    public final boolean getIsOneProductReplacement() {
        return this.isOneProductReplacement;
    }

    public final State zoijcleaow(DomainData domainData, String id2, c10.gxszxtbevo orderServerStatus, boolean isNeededOpenPaymentScreen, String receiver, String recipientPhone, String deliveryPhone, String email, String partnerCode, String partnerType, String partnerName, String deliveryMethod, DeliveryCode deliveryCode, String address, DeliveryTime deliveryTime, OrderStatus orderStatus, String totalDiscount, String totalWeight, double totalPrice, boolean canRate, int rating, boolean isRatedOrder, boolean cancelOrderButtonIsVisible, boolean callButtonIsVisible, boolean payButtonsIsEnabled, boolean editOrderIsVisible, boolean isOrderBlockedForEdit, boolean trackingButtonIsVisible, boolean repeatOrderIsVisible, List products, OrderPickupStatus pickupStatus, boolean isProductsClickable, boolean isPartnerInfoVisible, boolean isLoading, boolean isPickupStatusButtonFeatureEnabled, String currentTime, String waitTime, int remainTime, boolean isOneProductReplacement, boolean isOneProductUnavailable, boolean isOneProductAvailableWithoutReplacement, String message, boolean confirmBtnEnabled, String postamatCode, boolean tipsAvailable, List totalInfo, List payments, OrderPayment payment) {
        zdlpuopuiu.btonecajqb(domainData, "domainData");
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(orderServerStatus, "orderServerStatus");
        zdlpuopuiu.btonecajqb(receiver, "receiver");
        zdlpuopuiu.btonecajqb(recipientPhone, "recipientPhone");
        zdlpuopuiu.btonecajqb(deliveryPhone, "deliveryPhone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
        zdlpuopuiu.btonecajqb(partnerType, "partnerType");
        zdlpuopuiu.btonecajqb(partnerName, "partnerName");
        zdlpuopuiu.btonecajqb(deliveryMethod, "deliveryMethod");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(deliveryTime, "deliveryTime");
        zdlpuopuiu.btonecajqb(orderStatus, "orderStatus");
        zdlpuopuiu.btonecajqb(totalDiscount, "totalDiscount");
        zdlpuopuiu.btonecajqb(totalWeight, "totalWeight");
        zdlpuopuiu.btonecajqb(products, "products");
        zdlpuopuiu.btonecajqb(pickupStatus, "pickupStatus");
        zdlpuopuiu.btonecajqb(currentTime, "currentTime");
        zdlpuopuiu.btonecajqb(waitTime, "waitTime");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(postamatCode, "postamatCode");
        zdlpuopuiu.btonecajqb(totalInfo, "totalInfo");
        zdlpuopuiu.btonecajqb(payments, "payments");
        zdlpuopuiu.btonecajqb(payment, "payment");
        return new State(domainData, id2, orderServerStatus, isNeededOpenPaymentScreen, receiver, recipientPhone, deliveryPhone, email, partnerCode, partnerType, partnerName, deliveryMethod, deliveryCode, address, deliveryTime, orderStatus, totalDiscount, totalWeight, totalPrice, canRate, rating, isRatedOrder, cancelOrderButtonIsVisible, callButtonIsVisible, payButtonsIsEnabled, editOrderIsVisible, isOrderBlockedForEdit, trackingButtonIsVisible, repeatOrderIsVisible, products, pickupStatus, isProductsClickable, isPartnerInfoVisible, isLoading, isPickupStatusButtonFeatureEnabled, currentTime, waitTime, remainTime, isOneProductReplacement, isOneProductUnavailable, isOneProductAvailableWithoutReplacement, message, confirmBtnEnabled, postamatCode, tipsAvailable, totalInfo, payments, payment);
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.SpecificOrderStore$State$DeliveryTime, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DeliveryTime;", "Landroid/os/Parcelable;", "", "deliveryDate", "deliveryHours", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "ppxfxbqfkf", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryTime implements Parcelable {
        public static final Parcelable.Creator<DeliveryTime> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deliveryHours;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deliveryDate;

        /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.SpecificOrderStore$State$DeliveryTime$iobyxmoadg */
        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final DeliveryTime createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new DeliveryTime(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final DeliveryTime[] newArray(int i13) {
                return new DeliveryTime[i13];
            }
        }

        public DeliveryTime(String deliveryDate, String deliveryHours) {
            zdlpuopuiu.btonecajqb(deliveryDate, "deliveryDate");
            zdlpuopuiu.btonecajqb(deliveryHours, "deliveryHours");
            this.deliveryDate = deliveryDate;
            this.deliveryHours = deliveryHours;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryTime)) {
                return false;
            }
            DeliveryTime deliveryTime = (DeliveryTime) other;
            return zdlpuopuiu.eablkybsjg(this.deliveryDate, deliveryTime.deliveryDate) && zdlpuopuiu.eablkybsjg(this.deliveryHours, deliveryTime.deliveryHours);
        }

        public int hashCode() {
            return (this.deliveryDate.hashCode() * 31) + this.deliveryHours.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final String getDeliveryHours() {
            return this.deliveryHours;
        }

        public String toString() {
            return "DeliveryTime(deliveryDate=" + this.deliveryDate + ", deliveryHours=" + this.deliveryHours + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.deliveryDate);
            dest.writeString(this.deliveryHours);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getDeliveryDate() {
            return this.deliveryDate;
        }

        public /* synthetic */ DeliveryTime(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.SpecificOrderStore$State$DomainData, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018¨\u0006,"}, d2 = {"Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DomainData;", "Landroid/os/Parcelable;", "", "isSubscription", "", "price", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "", "cartPartnerCode", "<init>", "(ZDLru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(ZDLru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;)Lru/myspar/orders/impl/screens/specific/domain/store/SpecificOrderStore$State$DomainData;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "()Z", "yggfygwlhe", "D", "getPrice", "()D", "jyumaefscl", "Lru/myspar/core/models/delivery/DeliveryCode;", "eablkybsjg", "()Lru/myspar/core/models/delivery/DeliveryCode;", "iwizpuwonk", "Ljava/lang/String;", "getCartPartnerCode", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DomainData implements Parcelable {
        public static final Parcelable.Creator<DomainData> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cartPartnerCode;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeliveryCode deliveryCode;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final double price;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSubscription;

        /* JADX INFO: renamed from: ru.myspar.orders.impl.screens.specific.domain.store.SpecificOrderStore$State$DomainData$iobyxmoadg */
        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final DomainData createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new DomainData(parcel.readInt() != 0, parcel.readDouble(), (DeliveryCode) parcel.readParcelable(DomainData.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final DomainData[] newArray(int i13) {
                return new DomainData[i13];
            }
        }

        public DomainData(boolean z13, double d13, DeliveryCode deliveryCode, String str) {
            this.isSubscription = z13;
            this.price = d13;
            this.deliveryCode = deliveryCode;
            this.cartPartnerCode = str;
        }

        public static /* synthetic */ DomainData ppxfxbqfkf(DomainData domainData, boolean z13, double d13, DeliveryCode deliveryCode, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = domainData.isSubscription;
            }
            if ((i13 & 2) != 0) {
                d13 = domainData.price;
            }
            double d14 = d13;
            if ((i13 & 4) != 0) {
                deliveryCode = domainData.deliveryCode;
            }
            DeliveryCode deliveryCode2 = deliveryCode;
            if ((i13 & 8) != 0) {
                str = domainData.cartPartnerCode;
            }
            return domainData.zoijcleaow(z13, d14, deliveryCode2, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final DeliveryCode getDeliveryCode() {
            return this.deliveryCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DomainData)) {
                return false;
            }
            DomainData domainData = (DomainData) other;
            return this.isSubscription == domainData.isSubscription && Double.compare(this.price, domainData.price) == 0 && this.deliveryCode == domainData.deliveryCode && zdlpuopuiu.eablkybsjg(this.cartPartnerCode, domainData.cartPartnerCode);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isSubscription) * 31) + Double.hashCode(this.price)) * 31;
            DeliveryCode deliveryCode = this.deliveryCode;
            int iHashCode2 = (iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
            String str = this.cartPartnerCode;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "DomainData(isSubscription=" + this.isSubscription + ", price=" + this.price + ", deliveryCode=" + this.deliveryCode + ", cartPartnerCode=" + this.cartPartnerCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeInt(this.isSubscription ? 1 : 0);
            dest.writeDouble(this.price);
            dest.writeParcelable(this.deliveryCode, flags);
            dest.writeString(this.cartPartnerCode);
        }

        public final DomainData zoijcleaow(boolean isSubscription, double price, DeliveryCode deliveryCode, String cartPartnerCode) {
            return new DomainData(isSubscription, price, deliveryCode, cartPartnerCode);
        }

        public /* synthetic */ DomainData(boolean z13, double d13, DeliveryCode deliveryCode, String str, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? 0.0d : d13, (i13 & 4) != 0 ? null : deliveryCode, (i13 & 8) != 0 ? null : str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ State(DomainData domainData, String str, c10.gxszxtbevo gxszxtbevoVar, boolean z13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, DeliveryCode deliveryCode, String str10, DeliveryTime deliveryTime, OrderStatus orderStatus, String str11, String str12, double d13, boolean z14, int i13, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, List list, OrderPickupStatus orderPickupStatus, boolean z26, boolean z27, boolean z28, boolean z29, String str13, String str14, int i14, boolean z33, boolean z34, boolean z35, String str15, boolean z36, String str16, boolean z37, List list2, List list3, OrderPayment orderPayment, int i15, int i16, gtknphoqwx gtknphoqwxVar) {
        DeliveryTime deliveryTime2;
        DomainData domainData2 = (i15 & 1) != 0 ? new DomainData(false, 0.0d, null, null, 15, null) : domainData;
        String str17 = (i15 & 16) != 0 ? "" : str2;
        String str18 = (i15 & 32) != 0 ? "" : str3;
        String str19 = (i15 & 64) != 0 ? "" : str4;
        String str20 = (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str5;
        String str21 = (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str6;
        String str22 = (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : str7;
        String str23 = (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str8;
        String str24 = (i15 & 2048) != 0 ? "" : str9;
        String str25 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        DeliveryCode deliveryCode2 = (i15 & 4096) != 0 ? null : deliveryCode;
        String str26 = (i15 & 8192) != 0 ? "" : str10;
        if ((i15 & 16384) != 0) {
            deliveryTime2 = new DeliveryTime(str25, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            deliveryTime2 = deliveryTime;
        }
        this(domainData2, str, gxszxtbevoVar, z13, str17, str18, str19, str20, str21, str22, str23, str24, deliveryCode2, str26, deliveryTime2, (i15 & 32768) != 0 ? OrderStatus.UNDEFINED : orderStatus, (65536 & i15) != 0 ? "" : str11, (131072 & i15) != 0 ? "" : str12, (262144 & i15) != 0 ? 0.0d : d13, (524288 & i15) != 0 ? false : z14, (1048576 & i15) != 0 ? 0 : i13, (2097152 & i15) != 0 ? false : z15, (4194304 & i15) != 0 ? false : z16, (8388608 & i15) != 0 ? false : z17, (16777216 & i15) != 0 ? true : z18, (33554432 & i15) != 0 ? false : z19, (67108864 & i15) != 0 ? false : z23, (134217728 & i15) != 0 ? false : z24, (268435456 & i15) != 0 ? false : z25, (536870912 & i15) != 0 ? jyumaefscl.wflxmlrfwp() : list, (1073741824 & i15) != 0 ? OrderPickupStatus.NONE : orderPickupStatus, (i15 & Integer.MIN_VALUE) != 0 ? false : z26, (i16 & 1) != 0 ? false : z27, (i16 & 2) != 0 ? false : z28, (i16 & 4) != 0 ? false : z29, (i16 & 8) != 0 ? "" : str13, (i16 & 16) != 0 ? "" : str14, (i16 & 32) != 0 ? 0 : i14, (i16 & 64) != 0 ? false : z33, (i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z34, (i16 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? true : z35, (i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : str15, (i16 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z36, (i16 & 2048) != 0 ? "" : str16, (i16 & 4096) != 0 ? false : z37, (i16 & 8192) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i16 & 16384) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i16 & 32768) != 0 ? new OrderPayment(null, null, false, false, false, null, 63, null) : orderPayment);
    }
}
