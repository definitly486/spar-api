package ru.myspar.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.delivery.Delivery;
import ru.myspar.core.domain.models.order.edit.OrderSum;
import ru.myspar.core.domain.models.recipient.Recipient;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0006\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001e\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u001e¢\u0006\u0004\b/\u00100J\u001d\u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0010¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u00108JÎ\u0002\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00062\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00062\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001e2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u001eHÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b=\u00108J\u001a\u0010@\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010<R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010<R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bI\u0010OR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010SR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bV\u0010J\u001a\u0004\bW\u0010LR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bY\u0010LR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010LR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u00108R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b_\u0010J\u001a\u0004\b`\u0010LR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\ba\u0010J\u001a\u0004\bb\u0010LR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bR\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b^\u0010f\u001a\u0004\bP\u0010gR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bh\u0010jR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bE\u0010mR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bk\u0010pR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bu\u0010J\u001a\u0004\b!\u0010LR\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bb\u0010J\u001a\u0004\bv\u0010LR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\ba\u0010yR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u0010C\u001a\u0004\b{\u0010<R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b|\u0010C\u001a\u0004\b}\u0010<R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010C\u001a\u0004\b|\u0010<R\u0017\u0010(\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bv\u0010J\u001a\u0004\b~\u0010LR\u0018\u0010)\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u007f\u0010C\u001a\u0005\b\u0080\u0001\u0010<R\u0018\u0010*\u001a\u00020\u00068\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010J\u001a\u0004\bn\u0010LR\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001e8\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010r\u001a\u0004\bq\u0010tR\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u001e8\u0006¢\u0006\r\n\u0005\b\u0083\u0001\u0010r\u001a\u0004\b_\u0010t¨\u0006\u0084\u0001"}, d2 = {"Lru/myspar/core/domain/models/order/Order;", "Landroid/os/Parcelable;", "", "id", "dateCreate", "blockingTime", "", "canRepeat", "Lru/myspar/core/domain/models/order/OrderStatus;", "ordersStatus", "", "price", "oldPrice", "canRate", "canChangePayment", "canEdit", "", "rating", "isMayBeCancelled", "trackingOrder", "Lru/myspar/core/domain/models/delivery/Delivery;", "delivery", "Lru/myspar/core/domain/models/order/OrderPayment;", "payment", "Lru/myspar/core/domain/models/recipient/Recipient;", "recipient", "Lru/myspar/core/domain/models/order/OrderPartner;", "orderPartner", "Lru/myspar/core/domain/models/order/edit/OrderSum;", "sum", "", "Lru/myspar/core/domain/models/order/OrderProduct;", "basket", "isNeedPassport", "isSubscription", "Lru/myspar/core/domain/models/order/OrderPickupStatus;", "pickupStatus", "partnerCode", "currentTime", "waitTime", "hasReplaces", "message", "tipsAvailable", "Lru/myspar/core/domain/models/order/OrderTotalInfoItem;", "totalInfo", "Lru/myspar/components/payment/api/models/PaymentModel;", "payments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/core/domain/models/order/OrderStatus;DDZZZIZZLru/myspar/core/domain/models/delivery/Delivery;Lru/myspar/core/domain/models/order/OrderPayment;Lru/myspar/core/domain/models/recipient/Recipient;Lru/myspar/core/domain/models/order/OrderPartner;Lru/myspar/core/domain/models/order/edit/OrderSum;Ljava/util/List;ZZLru/myspar/core/domain/models/order/OrderPickupStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/core/domain/models/order/OrderStatus;DDZZZIZZLru/myspar/core/domain/models/delivery/Delivery;Lru/myspar/core/domain/models/order/OrderPayment;Lru/myspar/core/domain/models/recipient/Recipient;Lru/myspar/core/domain/models/order/OrderPartner;Lru/myspar/core/domain/models/order/edit/OrderSum;Ljava/util/List;ZZLru/myspar/core/domain/models/order/OrderPickupStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/util/List;Ljava/util/List;)Lru/myspar/core/domain/models/order/Order;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getDateCreate", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Z", "dxjokdxxww", "()Z", "cqumvgiudr", "Lru/myspar/core/domain/models/order/OrderStatus;", "()Lru/myspar/core/domain/models/order/OrderStatus;", "esjtqupxsv", "D", "lmojexxdyd", "()D", "lereixgezr", "getOldPrice", "pmvmpeiblj", "nufgyqmvbu", "zynmafqrjb", "getCanChangePayment", "istkbnxepw", "lqeggnwhkg", "cdpycssgdh", "I", "wwaezpbzkn", "yadqdtsiqt", "kegysxyocb", "iozdgvuglv", "cllcsxoeiz", "Lru/myspar/core/domain/models/delivery/Delivery;", "gtknphoqwx", "()Lru/myspar/core/domain/models/delivery/Delivery;", "Lru/myspar/core/domain/models/order/OrderPayment;", "()Lru/myspar/core/domain/models/order/OrderPayment;", "ylkuphrtab", "Lru/myspar/core/domain/models/recipient/Recipient;", "()Lru/myspar/core/domain/models/recipient/Recipient;", "pkzmftpjix", "Lru/myspar/core/domain/models/order/OrderPartner;", "()Lru/myspar/core/domain/models/order/OrderPartner;", "hcddaimhww", "Lru/myspar/core/domain/models/order/edit/OrderSum;", "()Lru/myspar/core/domain/models/order/edit/OrderSum;", "jpowsppfya", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "hkdspvbjdz", "tzroggbefp", "dsvhmnatus", "Lru/myspar/core/domain/models/order/OrderPickupStatus;", "()Lru/myspar/core/domain/models/order/OrderPickupStatus;", "wypolnanlu", "getPartnerCode", "stevsuqkhv", "btonecajqb", "wflxmlrfwp", "mbcevpiqjq", "oxmwwwfdhm", "ntlheqmsrt", "ulzqkzuiru", "sopmlzcsov", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Order implements Parcelable {
    public static final Parcelable.Creator<Order> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscription;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderStatus ordersStatus;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderPickupStatus pickupStatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderSum sum;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedPassport;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean trackingOrder;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canEdit;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canRepeat;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final List basket;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blockingTime;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String waitTime;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double oldPrice;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final Delivery delivery;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipsAvailable;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderPartner orderPartner;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canRate;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name and from kotlin metadata and from toString */
    private final List payments;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentTime;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasReplaces;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name and from kotlin metadata and from toString */
    private final List totalInfo;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderPayment payment;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCode;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMayBeCancelled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateCreate;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final Recipient recipient;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canChangePayment;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Order createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            OrderStatus orderStatusCreateFromParcel = OrderStatus.CREATOR.createFromParcel(parcel);
            double d13 = parcel.readDouble();
            double d14 = parcel.readDouble();
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            Delivery deliveryCreateFromParcel = Delivery.CREATOR.createFromParcel(parcel);
            OrderPayment orderPaymentCreateFromParcel = OrderPayment.CREATOR.createFromParcel(parcel);
            Recipient recipientCreateFromParcel = Recipient.CREATOR.createFromParcel(parcel);
            OrderPartner orderPartnerCreateFromParcel = OrderPartner.CREATOR.createFromParcel(parcel);
            OrderSum orderSumCreateFromParcel = OrderSum.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int i15 = 0;
            while (i15 != i14) {
                arrayList.add(OrderProduct.CREATOR.createFromParcel(parcel));
                i15++;
                i14 = i14;
            }
            boolean z19 = parcel.readInt() != 0;
            boolean z23 = parcel.readInt() != 0;
            OrderPickupStatus orderPickupStatusCreateFromParcel = OrderPickupStatus.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z24 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            boolean z25 = parcel.readInt() != 0;
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            int i17 = 0;
            while (i17 != i16) {
                arrayList2.add(OrderTotalInfoItem.CREATOR.createFromParcel(parcel));
                i17++;
                i16 = i16;
            }
            int i18 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i18);
            int i19 = 0;
            while (i19 != i18) {
                arrayList3.add(parcel.readParcelable(Order.class.getClassLoader()));
                i19++;
                i18 = i18;
            }
            return new Order(string, string2, string3, z13, orderStatusCreateFromParcel, d13, d14, z14, z15, z16, i13, z17, z18, deliveryCreateFromParcel, orderPaymentCreateFromParcel, recipientCreateFromParcel, orderPartnerCreateFromParcel, orderSumCreateFromParcel, arrayList, z19, z23, orderPickupStatusCreateFromParcel, string4, string5, string6, z24, string7, z25, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Order[] newArray(int i13) {
            return new Order[i13];
        }
    }

    public Order(String id2, String dateCreate, String blockingTime, boolean z13, OrderStatus ordersStatus, double d13, double d14, boolean z14, boolean z15, boolean z16, int i13, boolean z17, boolean z18, Delivery delivery, OrderPayment payment, Recipient recipient, OrderPartner orderPartner, OrderSum sum, List basket, boolean z19, boolean z23, OrderPickupStatus pickupStatus, String partnerCode, String currentTime, String waitTime, boolean z24, String message, boolean z25, List totalInfo, List payments) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(dateCreate, "dateCreate");
        zdlpuopuiu.btonecajqb(blockingTime, "blockingTime");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        zdlpuopuiu.btonecajqb(delivery, "delivery");
        zdlpuopuiu.btonecajqb(payment, "payment");
        zdlpuopuiu.btonecajqb(recipient, "recipient");
        zdlpuopuiu.btonecajqb(orderPartner, "orderPartner");
        zdlpuopuiu.btonecajqb(sum, "sum");
        zdlpuopuiu.btonecajqb(basket, "basket");
        zdlpuopuiu.btonecajqb(pickupStatus, "pickupStatus");
        zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
        zdlpuopuiu.btonecajqb(currentTime, "currentTime");
        zdlpuopuiu.btonecajqb(waitTime, "waitTime");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(totalInfo, "totalInfo");
        zdlpuopuiu.btonecajqb(payments, "payments");
        this.id = id2;
        this.dateCreate = dateCreate;
        this.blockingTime = blockingTime;
        this.canRepeat = z13;
        this.ordersStatus = ordersStatus;
        this.price = d13;
        this.oldPrice = d14;
        this.canRate = z14;
        this.canChangePayment = z15;
        this.canEdit = z16;
        this.rating = i13;
        this.isMayBeCancelled = z17;
        this.trackingOrder = z18;
        this.delivery = delivery;
        this.payment = payment;
        this.recipient = recipient;
        this.orderPartner = orderPartner;
        this.sum = sum;
        this.basket = basket;
        this.isNeedPassport = z19;
        this.isSubscription = z23;
        this.pickupStatus = pickupStatus;
        this.partnerCode = partnerCode;
        this.currentTime = currentTime;
        this.waitTime = waitTime;
        this.hasReplaces = z24;
        this.message = message;
        this.tipsAvailable = z25;
        this.totalInfo = totalInfo;
        this.payments = payments;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public final boolean getTrackingOrder() {
        return this.trackingOrder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getCanRepeat() {
        return this.canRepeat;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getBasket() {
        return this.basket;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order order = (Order) other;
        return zdlpuopuiu.eablkybsjg(this.id, order.id) && zdlpuopuiu.eablkybsjg(this.dateCreate, order.dateCreate) && zdlpuopuiu.eablkybsjg(this.blockingTime, order.blockingTime) && this.canRepeat == order.canRepeat && this.ordersStatus == order.ordersStatus && Double.compare(this.price, order.price) == 0 && Double.compare(this.oldPrice, order.oldPrice) == 0 && this.canRate == order.canRate && this.canChangePayment == order.canChangePayment && this.canEdit == order.canEdit && this.rating == order.rating && this.isMayBeCancelled == order.isMayBeCancelled && this.trackingOrder == order.trackingOrder && zdlpuopuiu.eablkybsjg(this.delivery, order.delivery) && zdlpuopuiu.eablkybsjg(this.payment, order.payment) && zdlpuopuiu.eablkybsjg(this.recipient, order.recipient) && zdlpuopuiu.eablkybsjg(this.orderPartner, order.orderPartner) && zdlpuopuiu.eablkybsjg(this.sum, order.sum) && zdlpuopuiu.eablkybsjg(this.basket, order.basket) && this.isNeedPassport == order.isNeedPassport && this.isSubscription == order.isSubscription && this.pickupStatus == order.pickupStatus && zdlpuopuiu.eablkybsjg(this.partnerCode, order.partnerCode) && zdlpuopuiu.eablkybsjg(this.currentTime, order.currentTime) && zdlpuopuiu.eablkybsjg(this.waitTime, order.waitTime) && this.hasReplaces == order.hasReplaces && zdlpuopuiu.eablkybsjg(this.message, order.message) && this.tipsAvailable == order.tipsAvailable && zdlpuopuiu.eablkybsjg(this.totalInfo, order.totalInfo) && zdlpuopuiu.eablkybsjg(this.payments, order.payments);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final OrderPayment getPayment() {
        return this.payment;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final Delivery getDelivery() {
        return this.delivery;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getBlockingTime() {
        return this.blockingTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.dateCreate.hashCode()) * 31) + this.blockingTime.hashCode()) * 31) + Boolean.hashCode(this.canRepeat)) * 31) + this.ordersStatus.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.oldPrice)) * 31) + Boolean.hashCode(this.canRate)) * 31) + Boolean.hashCode(this.canChangePayment)) * 31) + Boolean.hashCode(this.canEdit)) * 31) + Integer.hashCode(this.rating)) * 31) + Boolean.hashCode(this.isMayBeCancelled)) * 31) + Boolean.hashCode(this.trackingOrder)) * 31) + this.delivery.hashCode()) * 31) + this.payment.hashCode()) * 31) + this.recipient.hashCode()) * 31) + this.orderPartner.hashCode()) * 31) + this.sum.hashCode()) * 31) + this.basket.hashCode()) * 31) + Boolean.hashCode(this.isNeedPassport)) * 31) + Boolean.hashCode(this.isSubscription)) * 31) + this.pickupStatus.hashCode()) * 31) + this.partnerCode.hashCode()) * 31) + this.currentTime.hashCode()) * 31) + this.waitTime.hashCode()) * 31) + Boolean.hashCode(this.hasReplaces)) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.tipsAvailable)) * 31) + this.totalInfo.hashCode()) * 31) + this.payments.hashCode();
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final boolean getTipsAvailable() {
        return this.tipsAvailable;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final OrderPickupStatus getPickupStatus() {
        return this.pickupStatus;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final OrderStatus getOrdersStatus() {
        return this.ordersStatus;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final List getTotalInfo() {
        return this.totalInfo;
    }

    /* JADX INFO: renamed from: kegysxyocb, reason: from getter */
    public final boolean getIsMayBeCancelled() {
        return this.isMayBeCancelled;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getCanEdit() {
        return this.canEdit;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getCanRate() {
        return this.canRate;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final OrderSum getSum() {
        return this.sum;
    }

    /* JADX INFO: renamed from: stevsuqkhv, reason: from getter */
    public final String getWaitTime() {
        return this.waitTime;
    }

    public String toString() {
        return "Order(id=" + this.id + ", dateCreate=" + this.dateCreate + ", blockingTime=" + this.blockingTime + ", canRepeat=" + this.canRepeat + ", ordersStatus=" + this.ordersStatus + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", canRate=" + this.canRate + ", canChangePayment=" + this.canChangePayment + ", canEdit=" + this.canEdit + ", rating=" + this.rating + ", isMayBeCancelled=" + this.isMayBeCancelled + ", trackingOrder=" + this.trackingOrder + ", delivery=" + this.delivery + ", payment=" + this.payment + ", recipient=" + this.recipient + ", orderPartner=" + this.orderPartner + ", sum=" + this.sum + ", basket=" + this.basket + ", isNeedPassport=" + this.isNeedPassport + ", isSubscription=" + this.isSubscription + ", pickupStatus=" + this.pickupStatus + ", partnerCode=" + this.partnerCode + ", currentTime=" + this.currentTime + ", waitTime=" + this.waitTime + ", hasReplaces=" + this.hasReplaces + ", message=" + this.message + ", tipsAvailable=" + this.tipsAvailable + ", totalInfo=" + this.totalInfo + ", payments=" + this.payments + ")";
    }

    /* JADX INFO: renamed from: tzroggbefp, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getHasReplaces() {
        return this.hasReplaces;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.dateCreate);
        dest.writeString(this.blockingTime);
        dest.writeInt(this.canRepeat ? 1 : 0);
        this.ordersStatus.writeToParcel(dest, flags);
        dest.writeDouble(this.price);
        dest.writeDouble(this.oldPrice);
        dest.writeInt(this.canRate ? 1 : 0);
        dest.writeInt(this.canChangePayment ? 1 : 0);
        dest.writeInt(this.canEdit ? 1 : 0);
        dest.writeInt(this.rating);
        dest.writeInt(this.isMayBeCancelled ? 1 : 0);
        dest.writeInt(this.trackingOrder ? 1 : 0);
        this.delivery.writeToParcel(dest, flags);
        this.payment.writeToParcel(dest, flags);
        this.recipient.writeToParcel(dest, flags);
        this.orderPartner.writeToParcel(dest, flags);
        this.sum.writeToParcel(dest, flags);
        List list = this.basket;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((OrderProduct) it.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.isNeedPassport ? 1 : 0);
        dest.writeInt(this.isSubscription ? 1 : 0);
        this.pickupStatus.writeToParcel(dest, flags);
        dest.writeString(this.partnerCode);
        dest.writeString(this.currentTime);
        dest.writeString(this.waitTime);
        dest.writeInt(this.hasReplaces ? 1 : 0);
        dest.writeString(this.message);
        dest.writeInt(this.tipsAvailable ? 1 : 0);
        List list2 = this.totalInfo;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((OrderTotalInfoItem) it2.next()).writeToParcel(dest, flags);
        }
        List list3 = this.payments;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final OrderPartner getOrderPartner() {
        return this.orderPartner;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final Recipient getRecipient() {
        return this.recipient;
    }

    public final Order zoijcleaow(String id2, String dateCreate, String blockingTime, boolean canRepeat, OrderStatus ordersStatus, double price, double oldPrice, boolean canRate, boolean canChangePayment, boolean canEdit, int rating, boolean isMayBeCancelled, boolean trackingOrder, Delivery delivery, OrderPayment payment, Recipient recipient, OrderPartner orderPartner, OrderSum sum, List basket, boolean isNeedPassport, boolean isSubscription, OrderPickupStatus pickupStatus, String partnerCode, String currentTime, String waitTime, boolean hasReplaces, String message, boolean tipsAvailable, List totalInfo, List payments) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(dateCreate, "dateCreate");
        zdlpuopuiu.btonecajqb(blockingTime, "blockingTime");
        zdlpuopuiu.btonecajqb(ordersStatus, "ordersStatus");
        zdlpuopuiu.btonecajqb(delivery, "delivery");
        zdlpuopuiu.btonecajqb(payment, "payment");
        zdlpuopuiu.btonecajqb(recipient, "recipient");
        zdlpuopuiu.btonecajqb(orderPartner, "orderPartner");
        zdlpuopuiu.btonecajqb(sum, "sum");
        zdlpuopuiu.btonecajqb(basket, "basket");
        zdlpuopuiu.btonecajqb(pickupStatus, "pickupStatus");
        zdlpuopuiu.btonecajqb(partnerCode, "partnerCode");
        zdlpuopuiu.btonecajqb(currentTime, "currentTime");
        zdlpuopuiu.btonecajqb(waitTime, "waitTime");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(totalInfo, "totalInfo");
        zdlpuopuiu.btonecajqb(payments, "payments");
        return new Order(id2, dateCreate, blockingTime, canRepeat, ordersStatus, price, oldPrice, canRate, canChangePayment, canEdit, rating, isMayBeCancelled, trackingOrder, delivery, payment, recipient, orderPartner, sum, basket, isNeedPassport, isSubscription, pickupStatus, partnerCode, currentTime, waitTime, hasReplaces, message, tipsAvailable, totalInfo, payments);
    }

    public /* synthetic */ Order(String str, String str2, String str3, boolean z13, OrderStatus orderStatus, double d13, double d14, boolean z14, boolean z15, boolean z16, int i13, boolean z17, boolean z18, Delivery delivery, OrderPayment orderPayment, Recipient recipient, OrderPartner orderPartner, OrderSum orderSum, List list, boolean z19, boolean z23, OrderPickupStatus orderPickupStatus, String str4, String str5, String str6, boolean z24, String str7, boolean z25, List list2, List list3, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? OrderStatus.UNDEFINED : orderStatus, (i14 & 32) != 0 ? 0.0d : d13, (i14 & 64) == 0 ? d14 : 0.0d, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z14, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z15, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z16, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 0 : i13, (i14 & 2048) != 0 ? false : z17, (i14 & 4096) != 0 ? false : z18, (i14 & 8192) != 0 ? new Delivery(null, null, null, null, null, null, null, 127, null) : delivery, (i14 & 16384) != 0 ? new OrderPayment(null, null, false, false, false, null, 63, null) : orderPayment, (i14 & 32768) != 0 ? new Recipient(null, null, null, 7, null) : recipient, (i14 & 65536) != 0 ? new OrderPartner(null, null, null, 7, null) : orderPartner, (i14 & 131072) != 0 ? new OrderSum(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 127, null) : orderSum, (i14 & 262144) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 524288) != 0 ? false : z19, (i14 & 1048576) != 0 ? false : z23, (i14 & 2097152) != 0 ? OrderPickupStatus.NONE : orderPickupStatus, (i14 & 4194304) != 0 ? "" : str4, (i14 & 8388608) != 0 ? "" : str5, (i14 & 16777216) != 0 ? "" : str6, (i14 & 33554432) != 0 ? false : z24, (i14 & 67108864) != 0 ? "" : str7, (i14 & 134217728) != 0 ? false : z25, (i14 & 268435456) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i14 & 536870912) != 0 ? jyumaefscl.wflxmlrfwp() : list3);
    }
}
