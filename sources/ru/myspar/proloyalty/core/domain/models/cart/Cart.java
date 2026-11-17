package ru.myspar.proloyalty.core.domain.models.cart;

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
import ru.myspar.proloyalty.core.domain.models.LoadInfo;
import ru.myspar.proloyalty.core.domain.models.OrderProperties;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.promocode.Promocode;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u0011\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0011\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b/\u00100J\u001d\u00106\u001a\u0002052\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u000203¢\u0006\u0004\b8\u00109J¸\u0002\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00112\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00112\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020*2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00112\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000203HÖ\u0001¢\u0006\u0004\b>\u00109J\u001a\u0010A\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bR\u0010P\u001a\u0004\bS\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bO\u0010^R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\b\u0015\u0010eR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010n\u001a\u0004\bo\u0010pR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bS\u0010q\u001a\u0004\bG\u0010rR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bZ\u0010{\u001a\u0004\bw\u0010|R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\by\u0010`\u001a\u0004\b}\u0010bR\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b~\u0010`\u001a\u0004\b~\u0010bR\u0019\u0010(\u001a\u00020'8\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0005\bT\u0010\u0081\u0001R\u0018\u0010)\u001a\u00020\b8\u0006¢\u0006\r\n\u0005\b\u0082\u0001\u0010P\u001a\u0004\bj\u0010=R\u001b\u0010+\u001a\u00020*8\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00118\u0006¢\u0006\r\n\u0005\b\u0087\u0001\u0010`\u001a\u0004\bs\u0010bR\u001a\u0010.\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\r\n\u0004\bV\u0010P\u001a\u0005\b\u0088\u0001\u0010=R\u0017\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u00018F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010=R\u0013\u0010\u008f\u0001\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010iR\u0013\u0010\u0091\u0001\u001a\u00020\u00148F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010i¨\u0006\u0092\u0001"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/cart/Cart;", "Landroid/os/Parcelable;", "", "id", "Lru/myspar/proloyalty/core/domain/models/cart/DeliveryInfo;", "deliveryInfo", "Lru/myspar/proloyalty/core/domain/models/cart/IntervalInfo;", "intervalInfo", "", "partnerCode", "payment", "Lru/myspar/proloyalty/core/domain/models/cart/CartSum;", "sum", "Lru/myspar/proloyalty/core/models/promocode/Promocode;", "promocode", "Lru/myspar/proloyalty/core/domain/models/OrderProperties;", "orderProperties", "", "Lru/myspar/proloyalty/core/domain/models/cart/CartProduct;", "basket", "", "isWalletPayNeedVerify", "isMappedValid", "Lru/myspar/proloyalty/core/models/Warning;", "warning", "Lru/myspar/proloyalty/core/domain/models/cart/CartEvropolis;", "evropolis", "Lru/myspar/proloyalty/core/domain/models/LoadInfo;", "loadInfo", "Lru/myspar/proloyalty/core/domain/models/cart/CartBonuses;", "cartBonuses", "Lru/myspar/proloyalty/core/domain/models/cart/CartReceiver;", "receiver", "Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBar;", "progressBar", "Lru/myspar/proloyalty/core/domain/models/cart/CartInfoItem;", "cartInfoList", "Lru/myspar/proloyalty/core/domain/models/cart/CommentReferences;", "selectedComments", "", "orderSum", "orderSumNoDiscounts", "Lru/myspar/proloyalty/core/domain/models/cart/CartUnavailableOrderReason;", "unavailableOrderReason", "Lru/myspar/proloyalty/components/payment/api/models/PaymentModel;", "payments", "change", "<init>", "(JLru/myspar/proloyalty/core/domain/models/cart/DeliveryInfo;Lru/myspar/proloyalty/core/domain/models/cart/IntervalInfo;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/cart/CartSum;Lru/myspar/proloyalty/core/models/promocode/Promocode;Lru/myspar/proloyalty/core/domain/models/OrderProperties;Ljava/util/List;Ljava/lang/Boolean;ZLru/myspar/proloyalty/core/models/Warning;Lru/myspar/proloyalty/core/domain/models/cart/CartEvropolis;Lru/myspar/proloyalty/core/domain/models/LoadInfo;Lru/myspar/proloyalty/core/domain/models/cart/CartBonuses;Lru/myspar/proloyalty/core/domain/models/cart/CartReceiver;Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBar;Ljava/util/List;Ljava/util/List;DLjava/lang/String;Lru/myspar/proloyalty/core/domain/models/cart/CartUnavailableOrderReason;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(JLru/myspar/proloyalty/core/domain/models/cart/DeliveryInfo;Lru/myspar/proloyalty/core/domain/models/cart/IntervalInfo;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/cart/CartSum;Lru/myspar/proloyalty/core/models/promocode/Promocode;Lru/myspar/proloyalty/core/domain/models/OrderProperties;Ljava/util/List;Ljava/lang/Boolean;ZLru/myspar/proloyalty/core/models/Warning;Lru/myspar/proloyalty/core/domain/models/cart/CartEvropolis;Lru/myspar/proloyalty/core/domain/models/LoadInfo;Lru/myspar/proloyalty/core/domain/models/cart/CartBonuses;Lru/myspar/proloyalty/core/domain/models/cart/CartReceiver;Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBar;Ljava/util/List;Ljava/util/List;DLjava/lang/String;Lru/myspar/proloyalty/core/domain/models/cart/CartUnavailableOrderReason;Ljava/util/List;Ljava/lang/String;)Lru/myspar/proloyalty/core/domain/models/cart/Cart;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "J", "wflxmlrfwp", "()J", "yggfygwlhe", "Lru/myspar/proloyalty/core/domain/models/cart/DeliveryInfo;", "btonecajqb", "()Lru/myspar/proloyalty/core/domain/models/cart/DeliveryInfo;", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/cart/IntervalInfo;", "oxmwwwfdhm", "()Lru/myspar/proloyalty/core/domain/models/cart/IntervalInfo;", "iwizpuwonk", "Ljava/lang/String;", "iozdgvuglv", "cqumvgiudr", "lmojexxdyd", "esjtqupxsv", "Lru/myspar/proloyalty/core/domain/models/cart/CartSum;", "stevsuqkhv", "()Lru/myspar/proloyalty/core/domain/models/cart/CartSum;", "lereixgezr", "Lru/myspar/proloyalty/core/models/promocode/Promocode;", "pkzmftpjix", "()Lru/myspar/proloyalty/core/models/promocode/Promocode;", "pmvmpeiblj", "Lru/myspar/proloyalty/core/domain/models/OrderProperties;", "()Lru/myspar/proloyalty/core/domain/models/OrderProperties;", "zynmafqrjb", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "istkbnxepw", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "cdpycssgdh", "Z", "sopmlzcsov", "()Z", "yadqdtsiqt", "Lru/myspar/proloyalty/core/models/Warning;", "tzroggbefp", "()Lru/myspar/proloyalty/core/models/Warning;", "Lru/myspar/proloyalty/core/domain/models/cart/CartEvropolis;", "gtknphoqwx", "()Lru/myspar/proloyalty/core/domain/models/cart/CartEvropolis;", "Lru/myspar/proloyalty/core/domain/models/LoadInfo;", "()Lru/myspar/proloyalty/core/domain/models/LoadInfo;", "wwaezpbzkn", "Lru/myspar/proloyalty/core/domain/models/cart/CartBonuses;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/domain/models/cart/CartBonuses;", "ylkuphrtab", "Lru/myspar/proloyalty/core/domain/models/cart/CartReceiver;", "hcddaimhww", "()Lru/myspar/proloyalty/core/domain/models/cart/CartReceiver;", "Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBar;", "()Lru/myspar/proloyalty/core/domain/models/cart/CartProgressBar;", "lqeggnwhkg", "jpowsppfya", "hkdspvbjdz", "D", "()D", "cllcsxoeiz", "dsvhmnatus", "Lru/myspar/proloyalty/core/domain/models/cart/CartUnavailableOrderReason;", "kegysxyocb", "()Lru/myspar/proloyalty/core/domain/models/cart/CartUnavailableOrderReason;", "wypolnanlu", "nufgyqmvbu", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "dxjokdxxww", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "delivery", "shopId", "jlmebxxoox", "isPartnerCart", "ribwqtqdhb", "isPayBonuses", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Cart implements Parcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMappedValid;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderSumNoDiscounts;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String payment;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartUnavailableOrderReason unavailableOrderReason;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartSum sum;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final List cartInfoList;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final double orderSum;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartEvropolis evropolis;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isWalletPayNeedVerify;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCode;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final List selectedComments;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final IntervalInfo intervalInfo;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Promocode promocode;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final LoadInfo loadInfo;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartProgressBar progressBar;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final OrderProperties orderProperties;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String change;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartBonuses cartBonuses;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final List payments;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final Warning warning;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryInfo deliveryInfo;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartReceiver receiver;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List basket;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Cart createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            long j13 = parcel.readLong();
            DeliveryInfo deliveryInfoCreateFromParcel = DeliveryInfo.CREATOR.createFromParcel(parcel);
            IntervalInfo intervalInfoCreateFromParcel = parcel.readInt() == 0 ? null : IntervalInfo.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            CartSum cartSumCreateFromParcel = parcel.readInt() == 0 ? null : CartSum.CREATOR.createFromParcel(parcel);
            Promocode promocode = (Promocode) parcel.readParcelable(Cart.class.getClassLoader());
            OrderProperties orderPropertiesCreateFromParcel = parcel.readInt() == 0 ? null : OrderProperties.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList4.add(CartProduct.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            boolean z13 = parcel.readInt() != 0;
            Warning warning = (Warning) parcel.readParcelable(Cart.class.getClassLoader());
            CartEvropolis cartEvropolisCreateFromParcel = parcel.readInt() == 0 ? null : CartEvropolis.CREATOR.createFromParcel(parcel);
            LoadInfo loadInfoCreateFromParcel = parcel.readInt() == 0 ? null : LoadInfo.CREATOR.createFromParcel(parcel);
            CartBonuses cartBonusesCreateFromParcel = parcel.readInt() == 0 ? null : CartBonuses.CREATOR.createFromParcel(parcel);
            CartReceiver cartReceiverCreateFromParcel = parcel.readInt() == 0 ? null : CartReceiver.CREATOR.createFromParcel(parcel);
            CartProgressBar cartProgressBarCreateFromParcel = parcel.readInt() == 0 ? null : CartProgressBar.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i15);
                int i16 = 0;
                while (i16 != i15) {
                    arrayList5.add(CartInfoItem.CREATOR.createFromParcel(parcel));
                    i16++;
                    i15 = i15;
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i17);
                int i18 = 0;
                while (i18 != i17) {
                    arrayList6.add(CommentReferences.CREATOR.createFromParcel(parcel));
                    i18++;
                    i17 = i17;
                }
                arrayList3 = arrayList6;
            }
            double d13 = parcel.readDouble();
            String string3 = parcel.readString();
            CartUnavailableOrderReason cartUnavailableOrderReasonCreateFromParcel = CartUnavailableOrderReason.CREATOR.createFromParcel(parcel);
            int i19 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i19);
            int i23 = 0;
            while (i23 != i19) {
                arrayList7.add(parcel.readParcelable(Cart.class.getClassLoader()));
                i23++;
                i19 = i19;
            }
            return new Cart(j13, deliveryInfoCreateFromParcel, intervalInfoCreateFromParcel, string, string2, cartSumCreateFromParcel, promocode, orderPropertiesCreateFromParcel, arrayList, boolValueOf, z13, warning, cartEvropolisCreateFromParcel, loadInfoCreateFromParcel, cartBonusesCreateFromParcel, cartReceiverCreateFromParcel, cartProgressBarCreateFromParcel, arrayList2, arrayList3, d13, string3, cartUnavailableOrderReasonCreateFromParcel, arrayList7, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Cart[] newArray(int i13) {
            return new Cart[i13];
        }
    }

    public Cart(long j13, DeliveryInfo deliveryInfo, IntervalInfo intervalInfo, String str, String str2, CartSum cartSum, Promocode promocode, OrderProperties orderProperties, List list, Boolean bool, boolean z13, Warning warning, CartEvropolis cartEvropolis, LoadInfo loadInfo, CartBonuses cartBonuses, CartReceiver cartReceiver, CartProgressBar cartProgressBar, List list2, List list3, double d13, String orderSumNoDiscounts, CartUnavailableOrderReason unavailableOrderReason, List payments, String str3) {
        zdlpuopuiu.btonecajqb(deliveryInfo, "deliveryInfo");
        zdlpuopuiu.btonecajqb(warning, "warning");
        zdlpuopuiu.btonecajqb(orderSumNoDiscounts, "orderSumNoDiscounts");
        zdlpuopuiu.btonecajqb(unavailableOrderReason, "unavailableOrderReason");
        zdlpuopuiu.btonecajqb(payments, "payments");
        this.id = j13;
        this.deliveryInfo = deliveryInfo;
        this.intervalInfo = intervalInfo;
        this.partnerCode = str;
        this.payment = str2;
        this.sum = cartSum;
        this.promocode = promocode;
        this.orderProperties = orderProperties;
        this.basket = list;
        this.isWalletPayNeedVerify = bool;
        this.isMappedValid = z13;
        this.warning = warning;
        this.evropolis = cartEvropolis;
        this.loadInfo = loadInfo;
        this.cartBonuses = cartBonuses;
        this.receiver = cartReceiver;
        this.progressBar = cartProgressBar;
        this.cartInfoList = list2;
        this.selectedComments = list3;
        this.orderSum = d13;
        this.orderSumNoDiscounts = orderSumNoDiscounts;
        this.unavailableOrderReason = unavailableOrderReason;
        this.payments = payments;
        this.change = str3;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final DeliveryInfo getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final String cllcsxoeiz() {
        return this.deliveryInfo.getShopId();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DeliveryCode dxjokdxxww() {
        return this.deliveryInfo.getDeliveryType();
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getBasket() {
        return this.basket;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) other;
        return this.id == cart.id && zdlpuopuiu.eablkybsjg(this.deliveryInfo, cart.deliveryInfo) && zdlpuopuiu.eablkybsjg(this.intervalInfo, cart.intervalInfo) && zdlpuopuiu.eablkybsjg(this.partnerCode, cart.partnerCode) && zdlpuopuiu.eablkybsjg(this.payment, cart.payment) && zdlpuopuiu.eablkybsjg(this.sum, cart.sum) && zdlpuopuiu.eablkybsjg(this.promocode, cart.promocode) && zdlpuopuiu.eablkybsjg(this.orderProperties, cart.orderProperties) && zdlpuopuiu.eablkybsjg(this.basket, cart.basket) && zdlpuopuiu.eablkybsjg(this.isWalletPayNeedVerify, cart.isWalletPayNeedVerify) && this.isMappedValid == cart.isMappedValid && zdlpuopuiu.eablkybsjg(this.warning, cart.warning) && zdlpuopuiu.eablkybsjg(this.evropolis, cart.evropolis) && zdlpuopuiu.eablkybsjg(this.loadInfo, cart.loadInfo) && zdlpuopuiu.eablkybsjg(this.cartBonuses, cart.cartBonuses) && zdlpuopuiu.eablkybsjg(this.receiver, cart.receiver) && zdlpuopuiu.eablkybsjg(this.progressBar, cart.progressBar) && zdlpuopuiu.eablkybsjg(this.cartInfoList, cart.cartInfoList) && zdlpuopuiu.eablkybsjg(this.selectedComments, cart.selectedComments) && Double.compare(this.orderSum, cart.orderSum) == 0 && zdlpuopuiu.eablkybsjg(this.orderSumNoDiscounts, cart.orderSumNoDiscounts) && zdlpuopuiu.eablkybsjg(this.unavailableOrderReason, cart.unavailableOrderReason) && zdlpuopuiu.eablkybsjg(this.payments, cart.payments) && zdlpuopuiu.eablkybsjg(this.change, cart.change);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final double getOrderSum() {
        return this.orderSum;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final CartEvropolis getEvropolis() {
        return this.evropolis;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final CartBonuses getCartBonuses() {
        return this.cartBonuses;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.id) * 31) + this.deliveryInfo.hashCode()) * 31;
        IntervalInfo intervalInfo = this.intervalInfo;
        int iHashCode2 = (iHashCode + (intervalInfo == null ? 0 : intervalInfo.hashCode())) * 31;
        String str = this.partnerCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payment;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CartSum cartSum = this.sum;
        int iHashCode5 = (iHashCode4 + (cartSum == null ? 0 : cartSum.hashCode())) * 31;
        Promocode promocode = this.promocode;
        int iHashCode6 = (iHashCode5 + (promocode == null ? 0 : promocode.hashCode())) * 31;
        OrderProperties orderProperties = this.orderProperties;
        int iHashCode7 = (iHashCode6 + (orderProperties == null ? 0 : orderProperties.hashCode())) * 31;
        List list = this.basket;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isWalletPayNeedVerify;
        int iHashCode9 = (((((iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isMappedValid)) * 31) + this.warning.hashCode()) * 31;
        CartEvropolis cartEvropolis = this.evropolis;
        int iHashCode10 = (iHashCode9 + (cartEvropolis == null ? 0 : cartEvropolis.hashCode())) * 31;
        LoadInfo loadInfo = this.loadInfo;
        int iHashCode11 = (iHashCode10 + (loadInfo == null ? 0 : loadInfo.hashCode())) * 31;
        CartBonuses cartBonuses = this.cartBonuses;
        int iHashCode12 = (iHashCode11 + (cartBonuses == null ? 0 : cartBonuses.hashCode())) * 31;
        CartReceiver cartReceiver = this.receiver;
        int iHashCode13 = (iHashCode12 + (cartReceiver == null ? 0 : cartReceiver.hashCode())) * 31;
        CartProgressBar cartProgressBar = this.progressBar;
        int iHashCode14 = (iHashCode13 + (cartProgressBar == null ? 0 : cartProgressBar.hashCode())) * 31;
        List list2 = this.cartInfoList;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.selectedComments;
        int iHashCode16 = (((((((((iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31) + Double.hashCode(this.orderSum)) * 31) + this.orderSumNoDiscounts.hashCode()) * 31) + this.unavailableOrderReason.hashCode()) * 31) + this.payments.hashCode()) * 31;
        String str3 = this.change;
        return iHashCode16 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final CartReceiver getReceiver() {
        return this.receiver;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final OrderProperties getOrderProperties() {
        return this.orderProperties;
    }

    public final boolean jlmebxxoox() {
        String str = this.partnerCode;
        return !(str == null || str.length() == 0);
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final List getSelectedComments() {
        return this.selectedComments;
    }

    /* JADX INFO: renamed from: kegysxyocb, reason: from getter */
    public final CartUnavailableOrderReason getUnavailableOrderReason() {
        return this.unavailableOrderReason;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final String getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final List getCartInfoList() {
        return this.cartInfoList;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getChange() {
        return this.change;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final IntervalInfo getIntervalInfo() {
        return this.intervalInfo;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final Promocode getPromocode() {
        return this.promocode;
    }

    public final boolean ribwqtqdhb() {
        return (dxjokdxxww() == DeliveryCode.PICKUP && jlmebxxoox()) ? false : true;
    }

    /* JADX INFO: renamed from: sopmlzcsov, reason: from getter */
    public final boolean getIsMappedValid() {
        return this.isMappedValid;
    }

    /* JADX INFO: renamed from: stevsuqkhv, reason: from getter */
    public final CartSum getSum() {
        return this.sum;
    }

    public String toString() {
        return "Cart(id=" + this.id + ", deliveryInfo=" + this.deliveryInfo + ", intervalInfo=" + this.intervalInfo + ", partnerCode=" + this.partnerCode + ", payment=" + this.payment + ", sum=" + this.sum + ", promocode=" + this.promocode + ", orderProperties=" + this.orderProperties + ", basket=" + this.basket + ", isWalletPayNeedVerify=" + this.isWalletPayNeedVerify + ", isMappedValid=" + this.isMappedValid + ", warning=" + this.warning + ", evropolis=" + this.evropolis + ", loadInfo=" + this.loadInfo + ", cartBonuses=" + this.cartBonuses + ", receiver=" + this.receiver + ", progressBar=" + this.progressBar + ", cartInfoList=" + this.cartInfoList + ", selectedComments=" + this.selectedComments + ", orderSum=" + this.orderSum + ", orderSumNoDiscounts=" + this.orderSumNoDiscounts + ", unavailableOrderReason=" + this.unavailableOrderReason + ", payments=" + this.payments + ", change=" + this.change + ")";
    }

    /* JADX INFO: renamed from: tzroggbefp, reason: from getter */
    public final Warning getWarning() {
        return this.warning;
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeLong(this.id);
        this.deliveryInfo.writeToParcel(dest, flags);
        IntervalInfo intervalInfo = this.intervalInfo;
        if (intervalInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            intervalInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.partnerCode);
        dest.writeString(this.payment);
        CartSum cartSum = this.sum;
        if (cartSum == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cartSum.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.promocode, flags);
        OrderProperties orderProperties = this.orderProperties;
        if (orderProperties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            orderProperties.writeToParcel(dest, flags);
        }
        List list = this.basket;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((CartProduct) it.next()).writeToParcel(dest, flags);
            }
        }
        Boolean bool = this.isWalletPayNeedVerify;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.isMappedValid ? 1 : 0);
        dest.writeParcelable(this.warning, flags);
        CartEvropolis cartEvropolis = this.evropolis;
        if (cartEvropolis == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cartEvropolis.writeToParcel(dest, flags);
        }
        LoadInfo loadInfo = this.loadInfo;
        if (loadInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loadInfo.writeToParcel(dest, flags);
        }
        CartBonuses cartBonuses = this.cartBonuses;
        if (cartBonuses == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cartBonuses.writeToParcel(dest, flags);
        }
        CartReceiver cartReceiver = this.receiver;
        if (cartReceiver == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cartReceiver.writeToParcel(dest, flags);
        }
        CartProgressBar cartProgressBar = this.progressBar;
        if (cartProgressBar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cartProgressBar.writeToParcel(dest, flags);
        }
        List list2 = this.cartInfoList;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ((CartInfoItem) it2.next()).writeToParcel(dest, flags);
            }
        }
        List list3 = this.selectedComments;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((CommentReferences) it3.next()).writeToParcel(dest, flags);
            }
        }
        dest.writeDouble(this.orderSum);
        dest.writeString(this.orderSumNoDiscounts);
        this.unavailableOrderReason.writeToParcel(dest, flags);
        List list4 = this.payments;
        dest.writeInt(list4.size());
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            dest.writeParcelable((Parcelable) it4.next(), flags);
        }
        dest.writeString(this.change);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final String getOrderSumNoDiscounts() {
        return this.orderSumNoDiscounts;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final LoadInfo getLoadInfo() {
        return this.loadInfo;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final CartProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final Cart zoijcleaow(long id2, DeliveryInfo deliveryInfo, IntervalInfo intervalInfo, String partnerCode, String payment, CartSum sum, Promocode promocode, OrderProperties orderProperties, List basket, Boolean isWalletPayNeedVerify, boolean isMappedValid, Warning warning, CartEvropolis evropolis, LoadInfo loadInfo, CartBonuses cartBonuses, CartReceiver receiver, CartProgressBar progressBar, List cartInfoList, List selectedComments, double orderSum, String orderSumNoDiscounts, CartUnavailableOrderReason unavailableOrderReason, List payments, String change) {
        zdlpuopuiu.btonecajqb(deliveryInfo, "deliveryInfo");
        zdlpuopuiu.btonecajqb(warning, "warning");
        zdlpuopuiu.btonecajqb(orderSumNoDiscounts, "orderSumNoDiscounts");
        zdlpuopuiu.btonecajqb(unavailableOrderReason, "unavailableOrderReason");
        zdlpuopuiu.btonecajqb(payments, "payments");
        return new Cart(id2, deliveryInfo, intervalInfo, partnerCode, payment, sum, promocode, orderProperties, basket, isWalletPayNeedVerify, isMappedValid, warning, evropolis, loadInfo, cartBonuses, receiver, progressBar, cartInfoList, selectedComments, orderSum, orderSumNoDiscounts, unavailableOrderReason, payments, change);
    }

    public /* synthetic */ Cart(long j13, DeliveryInfo deliveryInfo, IntervalInfo intervalInfo, String str, String str2, CartSum cartSum, Promocode promocode, OrderProperties orderProperties, List list, Boolean bool, boolean z13, Warning warning, CartEvropolis cartEvropolis, LoadInfo loadInfo, CartBonuses cartBonuses, CartReceiver cartReceiver, CartProgressBar cartProgressBar, List list2, List list3, double d13, String str3, CartUnavailableOrderReason cartUnavailableOrderReason, List list4, String str4, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 0L : j13, (i13 & 2) != 0 ? DeliveryInfo.INSTANCE.iobyxmoadg() : deliveryInfo, (i13 & 4) != 0 ? null : intervalInfo, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : cartSum, (i13 & 64) != 0 ? null : promocode, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : orderProperties, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : list, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z13, (i13 & 2048) != 0 ? Warning.Empty.f95255jyumaefscl : warning, (i13 & 4096) != 0 ? null : cartEvropolis, (i13 & 8192) != 0 ? null : loadInfo, (i13 & 16384) != 0 ? null : cartBonuses, (i13 & 32768) != 0 ? null : cartReceiver, (i13 & 65536) != 0 ? null : cartProgressBar, (i13 & 131072) != 0 ? null : list2, (i13 & 262144) != 0 ? null : list3, (i13 & 524288) != 0 ? 0.0d : d13, (i13 & 1048576) != 0 ? "" : str3, (i13 & 2097152) != 0 ? CartUnavailableOrderReason.INSTANCE.iobyxmoadg() : cartUnavailableOrderReason, (i13 & 4194304) != 0 ? jyumaefscl.wflxmlrfwp() : list4, (i13 & 8388608) != 0 ? null : str4);
    }
}
