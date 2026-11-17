package ru.myspar.proloyalty.common.view.product.model.cart;

import android.os.Parcel;
import android.os.Parcelable;
import b21.ppxfxbqfkf;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.VivinoRatingUiModel;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\bM\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B¥\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0019\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\u0006\u00100\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u001d\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0015¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0015¢\u0006\u0004\b9\u0010:Jâ\u0002\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00192\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b?\u0010:J\u001a\u0010B\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010>R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010E\u001a\u0004\bH\u0010>R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010>R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010E\u001a\u0004\bL\u0010>R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bU\u0010N\u001a\u0004\bV\u0010PR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bW\u0010E\u001a\u0004\bX\u0010>R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010TR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bG\u0010]R\u001a\u0010\u0011\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010\\\u001a\u0004\b_\u0010]R\u001a\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010]R\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010\\\u001a\u0004\bb\u0010]R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010N\u001a\u0004\bc\u0010PR\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bd\u0010:R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010\\\u001a\u0004\b\u0017\u0010]R\u001a\u0010\u0018\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010\\\u001a\u0004\bh\u0010]R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bK\u0010kR\u001a\u0010\u001c\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010E\u001a\u0004\bl\u0010>R\u001a\u0010\u001d\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010E\u001a\u0004\bn\u0010>R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010E\u001a\u0004\bo\u0010>R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\b`\u0010vR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010w\u001a\u0004\bx\u0010yR\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010z\u001a\u0004\b{\u0010|R\u001d\u0010(\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001f\u0010,\u001a\u0004\u0018\u00010+8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\bg\u0010\u0087\u0001R\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00198\u0006¢\u0006\r\n\u0005\b\u0088\u0001\u0010j\u001a\u0004\bQ\u0010kR\u0018\u0010/\u001a\u00020\u000f8\u0006¢\u0006\r\n\u0005\b\u0089\u0001\u0010\\\u001a\u0004\bi\u0010]R\u0018\u00100\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u008a\u0001\u0010E\u001a\u0004\bf\u0010>R\u0016\u0010\u008c\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010>¨\u0006\u008d\u0001"}, d2 = {"Lru/myspar/proloyalty/common/view/product/model/cart/CartProductUiModel;", "Lb21/ppxfxbqfkf;", "Lmt0/iobyxmoadg;", "Landroid/os/Parcelable;", "", "id", "article", ExternalMetricsManagerImpl.NAME, "photoUrl", "", "avgWeight", "price", "oldPrice", "discount", "quantity", "", "hasDiscount", "isRatingFeatureEnabled", "isPurchaseListsFeatureEnabled", "isProductWithZeroPrice", "rating", "", "reviewsCount", "isDispPer100", "isFavorite", "", "Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "hints", "country", "region", "countryFlagEmoji", "Lnr0/iobyxmoadg;", "changeState", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "colorsUiModel", "Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;", "availabilityModel", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "counterModel", "Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;", "vivino", "Lru/myspar/proloyalty/core/domain/models/product/ProductLimit;", "limits", "isAvailable", "unavailableReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/String;DZZZZLjava/lang/Double;IZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnr0/iobyxmoadg;Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Lru/myspar/proloyalty/common/view/counter/model/CounterModel;Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;Ljava/util/List;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "eablkybsjg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/String;DZZZZLjava/lang/Double;IZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnr0/iobyxmoadg;Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Lru/myspar/proloyalty/common/view/counter/model/CounterModel;Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;Ljava/util/List;ZLjava/lang/String;)Lru/myspar/proloyalty/common/view/product/model/cart/CartProductUiModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "nufgyqmvbu", "jyumaefscl", "getName", "iwizpuwonk", "iozdgvuglv", "cqumvgiudr", "Ljava/lang/Double;", "btonecajqb", "()Ljava/lang/Double;", "esjtqupxsv", "D", "getPrice", "()D", "lereixgezr", "getOldPrice", "pmvmpeiblj", "getDiscount", "zynmafqrjb", "getQuantity", "istkbnxepw", "Z", "()Z", "cdpycssgdh", "kegysxyocb", "yadqdtsiqt", "stevsuqkhv", "cllcsxoeiz", "lmojexxdyd", "wwaezpbzkn", "I", "ylkuphrtab", "pkzmftpjix", "jpowsppfya", "hcddaimhww", "Ljava/util/List;", "()Ljava/util/List;", "gxszxtbevo", "hkdspvbjdz", "getRegion", "zoijcleaow", "dsvhmnatus", "Lnr0/iobyxmoadg;", "getChangeState", "()Lnr0/iobyxmoadg;", "wypolnanlu", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "gtknphoqwx", "()Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;", "dxjokdxxww", "()Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;", "tzroggbefp", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "getDeliveryCode", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "mbcevpiqjq", "Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "wflxmlrfwp", "()Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "ntlheqmsrt", "Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;", "()Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;", "ulzqkzuiru", "sopmlzcsov", "crxdokpmqz", "oxmwwwfdhm", "discountString", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CartProductUiModel implements ppxfxbqfkf, mt0.iobyxmoadg, Parcelable {
    public static final Parcelable.Creator<CartProductUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRatingFeatureEnabled;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double avgWeight;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unavailableReason;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final nr0.iobyxmoadg changeState;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hints;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProductWithZeroPrice;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasDiscount;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photoUrl;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailabilityUiModel availabilityModel;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name and from kotlin metadata and from toString */
    private final CounterModel counterModel;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name and from kotlin metadata and from toString */
    private final VivinoRatingUiModel vivino;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String discount;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsUiModel colorsUiModel;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name and from kotlin metadata and from toString */
    private final List limits;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviewsCount;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchaseListsFeatureEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CartProductUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            double d13 = parcel.readDouble();
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string5 = parcel.readString();
            double d14 = parcel.readDouble();
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            Double dValueOf3 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            int i13 = parcel.readInt();
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int i15 = 0;
            while (i15 != i14) {
                arrayList.add(parcel.readParcelable(CartProductUiModel.class.getClassLoader()));
                i15++;
                i14 = i14;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            nr0.iobyxmoadg iobyxmoadgVarValueOf = nr0.iobyxmoadg.valueOf(parcel.readString());
            MeasureTypeModel measureTypeModel = (MeasureTypeModel) parcel.readParcelable(CartProductUiModel.class.getClassLoader());
            ColorsUiModel colorsUiModel = (ColorsUiModel) parcel.readParcelable(CartProductUiModel.class.getClassLoader());
            AvailabilityUiModel availabilityUiModel = (AvailabilityUiModel) parcel.readParcelable(CartProductUiModel.class.getClassLoader());
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(CartProductUiModel.class.getClassLoader());
            CounterModel counterModelCreateFromParcel = CounterModel.CREATOR.createFromParcel(parcel);
            VivinoRatingUiModel vivinoRatingUiModel = (VivinoRatingUiModel) parcel.readParcelable(CartProductUiModel.class.getClassLoader());
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            int i17 = 0;
            while (i17 != i16) {
                arrayList2.add(parcel.readParcelable(CartProductUiModel.class.getClassLoader()));
                i17++;
                i16 = i16;
            }
            return new CartProductUiModel(string, string2, string3, string4, dValueOf, d13, dValueOf2, string5, d14, z13, z14, z15, z16, dValueOf3, i13, z17, z18, arrayList, string6, string7, string8, iobyxmoadgVarValueOf, measureTypeModel, colorsUiModel, availabilityUiModel, deliveryCode, counterModelCreateFromParcel, vivinoRatingUiModel, arrayList2, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CartProductUiModel[] newArray(int i13) {
            return new CartProductUiModel[i13];
        }
    }

    public CartProductUiModel(String id2, String article, String name, String photoUrl, Double d13, double d14, Double d15, String str, double d16, boolean z13, boolean z14, boolean z15, boolean z16, Double d17, int i13, boolean z17, boolean z18, List hints, String country, String region, String str2, nr0.iobyxmoadg changeState, MeasureTypeModel measureTypeModel, ColorsUiModel colorsUiModel, AvailabilityUiModel availabilityModel, DeliveryCode deliveryCode, CounterModel counterModel, VivinoRatingUiModel vivinoRatingUiModel, List limits, boolean z19, String unavailableReason) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(changeState, "changeState");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(availabilityModel, "availabilityModel");
        zdlpuopuiu.btonecajqb(counterModel, "counterModel");
        zdlpuopuiu.btonecajqb(limits, "limits");
        zdlpuopuiu.btonecajqb(unavailableReason, "unavailableReason");
        this.id = id2;
        this.article = article;
        this.name = name;
        this.photoUrl = photoUrl;
        this.avgWeight = d13;
        this.price = d14;
        this.oldPrice = d15;
        this.discount = str;
        this.quantity = d16;
        this.hasDiscount = z13;
        this.isRatingFeatureEnabled = z14;
        this.isPurchaseListsFeatureEnabled = z15;
        this.isProductWithZeroPrice = z16;
        this.rating = d17;
        this.reviewsCount = i13;
        this.isDispPer100 = z17;
        this.isFavorite = z18;
        this.hints = hints;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = str2;
        this.changeState = changeState;
        this.measureTypeModel = measureTypeModel;
        this.colorsUiModel = colorsUiModel;
        this.availabilityModel = availabilityModel;
        this.deliveryCode = deliveryCode;
        this.counterModel = counterModel;
        this.vivino = vivinoRatingUiModel;
        this.limits = limits;
        this.isAvailable = z19;
        this.unavailableReason = unavailableReason;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final Double getAvgWeight() {
        return this.avgWeight;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public boolean getIsProductWithZeroPrice() {
        return this.isProductWithZeroPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public AvailabilityUiModel getAvailabilityModel() {
        return this.availabilityModel;
    }

    public final CartProductUiModel eablkybsjg(String id2, String article, String name, String photoUrl, Double avgWeight, double price, Double oldPrice, String discount, double quantity, boolean hasDiscount, boolean isRatingFeatureEnabled, boolean isPurchaseListsFeatureEnabled, boolean isProductWithZeroPrice, Double rating, int reviewsCount, boolean isDispPer100, boolean isFavorite, List hints, String country, String region, String countryFlagEmoji, nr0.iobyxmoadg changeState, MeasureTypeModel measureTypeModel, ColorsUiModel colorsUiModel, AvailabilityUiModel availabilityModel, DeliveryCode deliveryCode, CounterModel counterModel, VivinoRatingUiModel vivino, List limits, boolean isAvailable, String unavailableReason) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(changeState, "changeState");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(availabilityModel, "availabilityModel");
        zdlpuopuiu.btonecajqb(counterModel, "counterModel");
        zdlpuopuiu.btonecajqb(limits, "limits");
        zdlpuopuiu.btonecajqb(unavailableReason, "unavailableReason");
        return new CartProductUiModel(id2, article, name, photoUrl, avgWeight, price, oldPrice, discount, quantity, hasDiscount, isRatingFeatureEnabled, isPurchaseListsFeatureEnabled, isProductWithZeroPrice, rating, reviewsCount, isDispPer100, isFavorite, hints, country, region, countryFlagEmoji, changeState, measureTypeModel, colorsUiModel, availabilityModel, deliveryCode, counterModel, vivino, limits, isAvailable, unavailableReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartProductUiModel)) {
            return false;
        }
        CartProductUiModel cartProductUiModel = (CartProductUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.id, cartProductUiModel.id) && zdlpuopuiu.eablkybsjg(this.article, cartProductUiModel.article) && zdlpuopuiu.eablkybsjg(this.name, cartProductUiModel.name) && zdlpuopuiu.eablkybsjg(this.photoUrl, cartProductUiModel.photoUrl) && zdlpuopuiu.eablkybsjg(this.avgWeight, cartProductUiModel.avgWeight) && Double.compare(this.price, cartProductUiModel.price) == 0 && zdlpuopuiu.eablkybsjg(this.oldPrice, cartProductUiModel.oldPrice) && zdlpuopuiu.eablkybsjg(this.discount, cartProductUiModel.discount) && Double.compare(this.quantity, cartProductUiModel.quantity) == 0 && this.hasDiscount == cartProductUiModel.hasDiscount && this.isRatingFeatureEnabled == cartProductUiModel.isRatingFeatureEnabled && this.isPurchaseListsFeatureEnabled == cartProductUiModel.isPurchaseListsFeatureEnabled && this.isProductWithZeroPrice == cartProductUiModel.isProductWithZeroPrice && zdlpuopuiu.eablkybsjg(this.rating, cartProductUiModel.rating) && this.reviewsCount == cartProductUiModel.reviewsCount && this.isDispPer100 == cartProductUiModel.isDispPer100 && this.isFavorite == cartProductUiModel.isFavorite && zdlpuopuiu.eablkybsjg(this.hints, cartProductUiModel.hints) && zdlpuopuiu.eablkybsjg(this.country, cartProductUiModel.country) && zdlpuopuiu.eablkybsjg(this.region, cartProductUiModel.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, cartProductUiModel.countryFlagEmoji) && this.changeState == cartProductUiModel.changeState && zdlpuopuiu.eablkybsjg(this.measureTypeModel, cartProductUiModel.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.colorsUiModel, cartProductUiModel.colorsUiModel) && zdlpuopuiu.eablkybsjg(this.availabilityModel, cartProductUiModel.availabilityModel) && this.deliveryCode == cartProductUiModel.deliveryCode && zdlpuopuiu.eablkybsjg(this.counterModel, cartProductUiModel.counterModel) && zdlpuopuiu.eablkybsjg(this.vivino, cartProductUiModel.vivino) && zdlpuopuiu.eablkybsjg(this.limits, cartProductUiModel.limits) && this.isAvailable == cartProductUiModel.isAvailable && zdlpuopuiu.eablkybsjg(this.unavailableReason, cartProductUiModel.unavailableReason);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    @Override // mt0.iobyxmoadg
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public ColorsUiModel getColorsUiModel() {
        return this.colorsUiModel;
    }

    @Override // mt0.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public String getCountry() {
        return this.country;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.article.hashCode()) * 31) + this.name.hashCode()) * 31) + this.photoUrl.hashCode()) * 31;
        Double d13 = this.avgWeight;
        int iHashCode2 = (((iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31) + Double.hashCode(this.price)) * 31;
        Double d14 = this.oldPrice;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.discount;
        int iHashCode4 = (((((((((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.hasDiscount)) * 31) + Boolean.hashCode(this.isRatingFeatureEnabled)) * 31) + Boolean.hashCode(this.isPurchaseListsFeatureEnabled)) * 31) + Boolean.hashCode(this.isProductWithZeroPrice)) * 31;
        Double d15 = this.rating;
        int iHashCode5 = (((((((((((((iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31) + Integer.hashCode(this.reviewsCount)) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + this.hints.hashCode()) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31;
        String str2 = this.countryFlagEmoji;
        int iHashCode6 = (((((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.changeState.hashCode()) * 31) + this.measureTypeModel.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.colorsUiModel;
        int iHashCode7 = (((iHashCode6 + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.availabilityModel.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        int iHashCode8 = (((iHashCode7 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31) + this.counterModel.hashCode()) * 31;
        VivinoRatingUiModel vivinoRatingUiModel = this.vivino;
        return ((((((iHashCode8 + (vivinoRatingUiModel != null ? vivinoRatingUiModel.hashCode() : 0)) * 31) + this.limits.hashCode()) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + this.unavailableReason.hashCode();
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public String getPhotoUrl() {
        return this.photoUrl;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: kegysxyocb, reason: from getter */
    public boolean getIsRatingFeatureEnabled() {
        return this.isRatingFeatureEnabled;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public String oxmwwwfdhm() {
        String str = this.discount;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public VivinoRatingUiModel getVivino() {
        return this.vivino;
    }

    /* JADX INFO: renamed from: stevsuqkhv, reason: from getter */
    public boolean getIsPurchaseListsFeatureEnabled() {
        return this.isPurchaseListsFeatureEnabled;
    }

    public String toString() {
        return "CartProductUiModel(id=" + this.id + ", article=" + this.article + ", name=" + this.name + ", photoUrl=" + this.photoUrl + ", avgWeight=" + this.avgWeight + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", discount=" + this.discount + ", quantity=" + this.quantity + ", hasDiscount=" + this.hasDiscount + ", isRatingFeatureEnabled=" + this.isRatingFeatureEnabled + ", isPurchaseListsFeatureEnabled=" + this.isPurchaseListsFeatureEnabled + ", isProductWithZeroPrice=" + this.isProductWithZeroPrice + ", rating=" + this.rating + ", reviewsCount=" + this.reviewsCount + ", isDispPer100=" + this.isDispPer100 + ", isFavorite=" + this.isFavorite + ", hints=" + this.hints + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ", changeState=" + this.changeState + ", measureTypeModel=" + this.measureTypeModel + ", colorsUiModel=" + this.colorsUiModel + ", availabilityModel=" + this.availabilityModel + ", deliveryCode=" + this.deliveryCode + ", counterModel=" + this.counterModel + ", vivino=" + this.vivino + ", limits=" + this.limits + ", isAvailable=" + this.isAvailable + ", unavailableReason=" + this.unavailableReason + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public CounterModel getCounterModel() {
        return this.counterModel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.article);
        dest.writeString(this.name);
        dest.writeString(this.photoUrl);
        Double d13 = this.avgWeight;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        dest.writeDouble(this.price);
        Double d14 = this.oldPrice;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        dest.writeString(this.discount);
        dest.writeDouble(this.quantity);
        dest.writeInt(this.hasDiscount ? 1 : 0);
        dest.writeInt(this.isRatingFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isPurchaseListsFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isProductWithZeroPrice ? 1 : 0);
        Double d15 = this.rating;
        if (d15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d15.doubleValue());
        }
        dest.writeInt(this.reviewsCount);
        dest.writeInt(this.isDispPer100 ? 1 : 0);
        dest.writeInt(this.isFavorite ? 1 : 0);
        List list = this.hints;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeString(this.country);
        dest.writeString(this.region);
        dest.writeString(this.countryFlagEmoji);
        dest.writeString(this.changeState.name());
        dest.writeParcelable(this.measureTypeModel, flags);
        dest.writeParcelable(this.colorsUiModel, flags);
        dest.writeParcelable(this.availabilityModel, flags);
        dest.writeParcelable(this.deliveryCode, flags);
        this.counterModel.writeToParcel(dest, flags);
        dest.writeParcelable(this.vivino, flags);
        List list2 = this.limits;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeInt(this.isAvailable ? 1 : 0);
        dest.writeString(this.unavailableReason);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public int getReviewsCount() {
        return this.reviewsCount;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public boolean getHasDiscount() {
        return this.hasDiscount;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final String getUnavailableReason() {
        return this.unavailableReason;
    }

    @Override // mt0.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public String getCountryFlagEmoji() {
        return this.countryFlagEmoji;
    }

    public /* synthetic */ CartProductUiModel(String str, String str2, String str3, String str4, Double d13, double d14, Double d15, String str5, double d16, boolean z13, boolean z14, boolean z15, boolean z16, Double d17, int i13, boolean z17, boolean z18, List list, String str6, String str7, String str8, nr0.iobyxmoadg iobyxmoadgVar, MeasureTypeModel measureTypeModel, ColorsUiModel colorsUiModel, AvailabilityUiModel availabilityUiModel, DeliveryCode deliveryCode, CounterModel counterModel, VivinoRatingUiModel vivinoRatingUiModel, List list2, boolean z19, String str9, int i14, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, str4, d13, d14, d15, str5, d16, z13, z14, (i14 & 2048) != 0 ? false : z15, z16, d17, i13, z17, z18, (131072 & i14) != 0 ? jyumaefscl.wflxmlrfwp() : list, str6, str7, str8, iobyxmoadgVar, measureTypeModel, (8388608 & i14) != 0 ? null : colorsUiModel, availabilityUiModel, (33554432 & i14) != 0 ? null : deliveryCode, counterModel, (i14 & 134217728) != 0 ? null : vivinoRatingUiModel, list2, z19, str9);
    }
}
