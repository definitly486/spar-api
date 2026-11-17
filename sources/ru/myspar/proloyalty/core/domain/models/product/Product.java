package ru.myspar.proloyalty.core.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.core.domain.models.BaseProduct;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.Sticker;
import ru.myspar.proloyalty.core.domain.models.VideoProduct;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\bd\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0002\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0013\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u0006\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u001d\u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\t¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bI\u0010JJ®\u0004\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00022\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010!\u001a\u00020\u000b2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00132\b\b\u0002\u0010$\u001a\u00020\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020\u00022\b\b\u0002\u00104\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00022\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00132\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010>\u001a\u00020\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bO\u0010JJ\u001a\u0010R\u001a\u00020\u000b2\b\u0010Q\u001a\u0004\u0018\u00010PHÖ\u0003¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010NR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010U\u001a\u0004\bX\u0010NR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010U\u001a\u0004\bZ\u0010NR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bc\u0010eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bn\u0010`\u001a\u0004\bo\u0010bR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bp\u0010g\u001a\u0004\bq\u0010iR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\br\u0010g\u001a\u0004\bs\u0010iR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bt\u0010g\u001a\u0004\bu\u0010iR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00138\u0006¢\u0006\f\n\u0004\bz\u0010w\u001a\u0004\b{\u0010yR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b|\u0010U\u001a\u0004\b}\u0010NR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\b~\u0010w\u001a\u0004\b\u007f\u0010yR\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010`\u001a\u0004\bt\u0010bR\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\r\n\u0005\b\u0081\u0001\u0010`\u001a\u0004\bv\u0010bR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010`\u001a\u0005\b\u0083\u0001\u0010bR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010`\u001a\u0005\b\u0085\u0001\u0010bR&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001d8\u0006¢\u0006\u000f\n\u0005\bl\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\r\n\u0005\b\u0089\u0001\u0010U\u001a\u0004\b[\u0010NR\u001b\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010U\u001a\u0005\b\u008b\u0001\u0010NR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\ba\u0010g\u001a\u0004\b|\u0010iR\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00138\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010w\u001a\u0005\b\u0080\u0001\u0010yR\u0017\u0010$\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b}\u0010g\u001a\u0004\b~\u0010iR\u001b\u0010%\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010`\u001a\u0005\b\u008d\u0001\u0010bR\u001a\u0010&\u001a\u00020\t8\u0006¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010JR\u0019\u0010'\u001a\u00020\u000b8\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010g\u001a\u0005\b\u0092\u0001\u0010iR\u001a\u0010)\u001a\u00020(8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010,\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b]\u0010U\u001a\u0005\b\u009a\u0001\u0010NR\u0018\u0010-\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b{\u0010U\u001a\u0005\b\u009b\u0001\u0010NR\u0019\u0010.\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010U\u001a\u0005\b\u009d\u0001\u0010NR\u0019\u0010/\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010U\u001a\u0005\b\u009e\u0001\u0010NR\u0019\u00100\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010U\u001a\u0005\b\u0081\u0001\u0010NR\u0018\u00101\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b \u0001\u0010U\u001a\u0004\bz\u0010NR\u0019\u00102\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010U\u001a\u0005\b¡\u0001\u0010NR\u0019\u00103\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010U\u001a\u0005\b£\u0001\u0010NR\u0019\u00104\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010U\u001a\u0005\b¤\u0001\u0010NR\u0019\u00105\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010U\u001a\u0005\b¦\u0001\u0010NR\u001d\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00138\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010w\u001a\u0005\b\u0082\u0001\u0010yR\u001d\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001d\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010¯\u0001\u001a\u0006\b\u009c\u0001\u0010°\u0001R\u0019\u0010>\u001a\u00020\u00068\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010\\\u001a\u0005\b\u009f\u0001\u0010^R\u001c\u0010@\u001a\u0004\u0018\u00010?8\u0006¢\u0006\u000f\n\u0006\b±\u0001\u0010²\u0001\u001a\u0005\bW\u0010³\u0001¨\u0006´\u0001"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/product/Product;", "Lru/myspar/proloyalty/core/domain/models/BaseProduct;", "", "id", ExternalMetricsManagerImpl.NAME, "article", "", "price", "oldPrice", "", "discount", "", "isDispPer100", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "avgWeight", "isFavorite", "isAvailable", "isAvailableToBuy", "", "productPropertyNames", "Lru/myspar/proloyalty/core/domain/models/Sticker;", "productProperties", "photoUrl", "photoUrls", "energy", "fats", "carbs", "protein", "", "params", "description", "chemical", "hasDiscount", "Lru/myspar/proloyalty/catalog/api/hint/model/Hint;", "hints", "hidePrice", "rating", "reviews", "isPmProduct", "Lru/myspar/proloyalty/core/domain/models/VideoProduct;", "video", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorsModel", "country", "region", "countryFlagEmoji", "type", "kind", "grape", "standart", "countryMapIcon", "tasting", "styling", "Lru/myspar/proloyalty/core/domain/models/product/Button;", "button", "Lru/myspar/proloyalty/core/domain/models/product/ProductLimit;", "limits", "Lru/myspar/proloyalty/core/domain/models/product/VivinoRating;", "vivino", "Lru/myspar/proloyalty/core/domain/models/product/ProductVariants;", "productVariants", "quantity", "Lru/myspar/proloyalty/core/domain/models/product/ProductDeclarations;", "declarations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;ZZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLjava/lang/Double;IZLru/myspar/proloyalty/core/domain/models/VideoProduct;Lru/myspar/proloyalty/core/domain/models/ColorsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/product/Button;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/product/VivinoRating;Lru/myspar/proloyalty/core/domain/models/product/ProductVariants;DLru/myspar/proloyalty/core/domain/models/product/ProductDeclarations;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/Integer;ZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;ZZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLjava/lang/Double;IZLru/myspar/proloyalty/core/domain/models/VideoProduct;Lru/myspar/proloyalty/core/domain/models/ColorsModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/product/Button;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/product/VivinoRating;Lru/myspar/proloyalty/core/domain/models/product/ProductVariants;DLru/myspar/proloyalty/core/domain/models/product/ProductDeclarations;)Lru/myspar/proloyalty/core/domain/models/product/Product;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "D", "jlmebxxoox", "()D", "cqumvgiudr", "Ljava/lang/Double;", "stevsuqkhv", "()Ljava/lang/Double;", "esjtqupxsv", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "lereixgezr", "Z", "iwxlajgraz", "()Z", "pmvmpeiblj", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "cllcsxoeiz", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "zynmafqrjb", "gxszxtbevo", "istkbnxepw", "dvvnrvtcbc", "cdpycssgdh", "roivzttewh", "yadqdtsiqt", "auzgnhcxok", "iozdgvuglv", "Ljava/util/List;", "getProductPropertyNames", "()Ljava/util/List;", "lmojexxdyd", "ribwqtqdhb", "wwaezpbzkn", "tzroggbefp", "ylkuphrtab", "sopmlzcsov", "pkzmftpjix", "hcddaimhww", "jpowsppfya", "nufgyqmvbu", "hkdspvbjdz", "jhduphickx", "Ljava/util/Map;", "kegysxyocb", "()Ljava/util/Map;", "dsvhmnatus", "wypolnanlu", "dxjokdxxww", "mbcevpiqjq", "jztzpxfvev", "ntlheqmsrt", "I", "uwvvkdfqfp", "ulzqkzuiru", "skhdrjzrfn", "Lru/myspar/proloyalty/core/domain/models/VideoProduct;", "lrnfpwlwnk", "()Lru/myspar/proloyalty/core/domain/models/VideoProduct;", "crxdokpmqz", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "btonecajqb", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "gtknphoqwx", "metgxyhuhe", "vipkmwdibw", "wflxmlrfwp", "bfopjjpdmp", "ikoacuggdj", "okpsazkaxt", "ydmasvzmpa", "xrmfcynszj", "oxmwwwfdhm", "oipsdeybqn", "rlfsiqarku", "sflfametgt", "czzsidtyhn", "Lru/myspar/proloyalty/core/domain/models/product/Button;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/domain/models/product/Button;", "yfnezrywwk", "Lru/myspar/proloyalty/core/domain/models/product/VivinoRating;", "zeieaojujs", "()Lru/myspar/proloyalty/core/domain/models/product/VivinoRating;", "Lru/myspar/proloyalty/core/domain/models/product/ProductVariants;", "()Lru/myspar/proloyalty/core/domain/models/product/ProductVariants;", "zfvoamnweg", "Lru/myspar/proloyalty/core/domain/models/product/ProductDeclarations;", "()Lru/myspar/proloyalty/core/domain/models/product/ProductDeclarations;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Product implements BaseProduct {
    public static final Parcelable.Creator<Product> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map params;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name and from kotlin metadata and from toString */
    private final Button button;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer discount;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double fats;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double protein;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String kind;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productPropertyNames;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double carbs;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name and from kotlin metadata and from toString */
    private final String standart;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hints;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final List productProperties;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tasting;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviews;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grape;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double energy;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name and from kotlin metadata and from toString */
    private final String styling;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name and from kotlin metadata and from toString */
    private final VideoProduct video;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasDiscount;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hidePrice;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPmProduct;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name and from kotlin metadata and from toString */
    private final List limits;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photoUrl;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String chemical;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryMapIcon;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailableToBuy;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductVariants productVariants;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name and from kotlin metadata and from toString */
    private final VivinoRating vivino;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final List photoUrls;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductDeclarations declarations;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double avgWeight;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Product createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            double d13 = parcel.readDouble();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z13 = parcel.readInt() != 0;
            MeasureTypeModel measureTypeModel = (MeasureTypeModel) parcel.readParcelable(Product.class.getClassLoader());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i13 = parcel.readInt();
            boolean z17 = z14;
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(Sticker.CREATOR.createFromParcel(parcel));
            }
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i15 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
            int i16 = 0;
            while (i16 != i15) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                i16++;
                i15 = i15;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z18 = parcel.readInt() != 0;
            int i17 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList3.add(parcel.readParcelable(Product.class.getClassLoader()));
                i18++;
                i17 = i17;
            }
            boolean z19 = parcel.readInt() != 0;
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i19 = parcel.readInt();
            boolean z23 = parcel.readInt() != 0;
            VideoProduct videoProductCreateFromParcel = VideoProduct.CREATOR.createFromParcel(parcel);
            ColorsModel colorsModelCreateFromParcel = parcel.readInt() == 0 ? null : ColorsModel.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            Button buttonCreateFromParcel = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            int i23 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i23);
            int i24 = 0;
            while (i24 != i23) {
                arrayList4.add(ProductLimit.CREATOR.createFromParcel(parcel));
                i24++;
                i23 = i23;
            }
            return new Product(string, string2, string3, d13, dValueOf, numValueOf, z13, measureTypeModel, dValueOf2, z17, z15, z16, arrayListCreateStringArrayList, arrayList2, string4, arrayListCreateStringArrayList2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, linkedHashMap, string5, string6, z18, arrayList3, z19, dValueOf7, i19, z23, videoProductCreateFromParcel, colorsModelCreateFromParcel, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, buttonCreateFromParcel, arrayList4, parcel.readInt() == 0 ? null : VivinoRating.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProductVariants.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readInt() == 0 ? null : ProductDeclarations.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Product[] newArray(int i13) {
            return new Product[i13];
        }
    }

    public Product(String id2, String name, String article, double d13, Double d14, Integer num, boolean z13, MeasureTypeModel measureTypeModel, Double d15, boolean z14, boolean z15, boolean z16, List productPropertyNames, List productProperties, String photoUrl, List photoUrls, Double d16, Double d17, Double d18, Double d19, Map params, String str, String str2, boolean z17, List hints, boolean z18, Double d23, int i13, boolean z19, VideoProduct video, ColorsModel colorsModel, String country, String region, String countryFlagEmoji, String type, String kind, String grape, String standart, String countryMapIcon, String tasting, String styling, Button button, List limits, VivinoRating vivinoRating, ProductVariants productVariants, double d24, ProductDeclarations productDeclarations) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(productPropertyNames, "productPropertyNames");
        zdlpuopuiu.btonecajqb(productProperties, "productProperties");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(photoUrls, "photoUrls");
        zdlpuopuiu.btonecajqb(params, "params");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(video, "video");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(countryFlagEmoji, "countryFlagEmoji");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(grape, "grape");
        zdlpuopuiu.btonecajqb(standart, "standart");
        zdlpuopuiu.btonecajqb(countryMapIcon, "countryMapIcon");
        zdlpuopuiu.btonecajqb(tasting, "tasting");
        zdlpuopuiu.btonecajqb(styling, "styling");
        zdlpuopuiu.btonecajqb(limits, "limits");
        this.id = id2;
        this.name = name;
        this.article = article;
        this.price = d13;
        this.oldPrice = d14;
        this.discount = num;
        this.isDispPer100 = z13;
        this.measureTypeModel = measureTypeModel;
        this.avgWeight = d15;
        this.isFavorite = z14;
        this.isAvailable = z15;
        this.isAvailableToBuy = z16;
        this.productPropertyNames = productPropertyNames;
        this.productProperties = productProperties;
        this.photoUrl = photoUrl;
        this.photoUrls = photoUrls;
        this.energy = d16;
        this.fats = d17;
        this.carbs = d18;
        this.protein = d19;
        this.params = params;
        this.description = str;
        this.chemical = str2;
        this.hasDiscount = z17;
        this.hints = hints;
        this.hidePrice = z18;
        this.rating = d23;
        this.reviews = i13;
        this.isPmProduct = z19;
        this.video = video;
        this.colorsModel = colorsModel;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = countryFlagEmoji;
        this.type = type;
        this.kind = kind;
        this.grape = grape;
        this.standart = standart;
        this.countryMapIcon = countryMapIcon;
        this.tasting = tasting;
        this.styling = styling;
        this.button = button;
        this.limits = limits;
        this.vivino = vivinoRating;
        this.productVariants = productVariants;
        this.quantity = d24;
        this.declarations = productDeclarations;
    }

    /* JADX INFO: renamed from: auzgnhcxok, reason: from getter */
    public final boolean getIsAvailableToBuy() {
        return this.isAvailableToBuy;
    }

    /* JADX INFO: renamed from: bfopjjpdmp, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public final MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getChemical() {
        return this.chemical;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return zdlpuopuiu.eablkybsjg(this.id, product.id) && zdlpuopuiu.eablkybsjg(this.name, product.name) && zdlpuopuiu.eablkybsjg(this.article, product.article) && Double.compare(this.price, product.price) == 0 && zdlpuopuiu.eablkybsjg(this.oldPrice, product.oldPrice) && zdlpuopuiu.eablkybsjg(this.discount, product.discount) && this.isDispPer100 == product.isDispPer100 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, product.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.avgWeight, product.avgWeight) && this.isFavorite == product.isFavorite && this.isAvailable == product.isAvailable && this.isAvailableToBuy == product.isAvailableToBuy && zdlpuopuiu.eablkybsjg(this.productPropertyNames, product.productPropertyNames) && zdlpuopuiu.eablkybsjg(this.productProperties, product.productProperties) && zdlpuopuiu.eablkybsjg(this.photoUrl, product.photoUrl) && zdlpuopuiu.eablkybsjg(this.photoUrls, product.photoUrls) && zdlpuopuiu.eablkybsjg(this.energy, product.energy) && zdlpuopuiu.eablkybsjg(this.fats, product.fats) && zdlpuopuiu.eablkybsjg(this.carbs, product.carbs) && zdlpuopuiu.eablkybsjg(this.protein, product.protein) && zdlpuopuiu.eablkybsjg(this.params, product.params) && zdlpuopuiu.eablkybsjg(this.description, product.description) && zdlpuopuiu.eablkybsjg(this.chemical, product.chemical) && this.hasDiscount == product.hasDiscount && zdlpuopuiu.eablkybsjg(this.hints, product.hints) && this.hidePrice == product.hidePrice && zdlpuopuiu.eablkybsjg(this.rating, product.rating) && this.reviews == product.reviews && this.isPmProduct == product.isPmProduct && zdlpuopuiu.eablkybsjg(this.video, product.video) && zdlpuopuiu.eablkybsjg(this.colorsModel, product.colorsModel) && zdlpuopuiu.eablkybsjg(this.country, product.country) && zdlpuopuiu.eablkybsjg(this.region, product.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, product.countryFlagEmoji) && zdlpuopuiu.eablkybsjg(this.type, product.type) && zdlpuopuiu.eablkybsjg(this.kind, product.kind) && zdlpuopuiu.eablkybsjg(this.grape, product.grape) && zdlpuopuiu.eablkybsjg(this.standart, product.standart) && zdlpuopuiu.eablkybsjg(this.countryMapIcon, product.countryMapIcon) && zdlpuopuiu.eablkybsjg(this.tasting, product.tasting) && zdlpuopuiu.eablkybsjg(this.styling, product.styling) && zdlpuopuiu.eablkybsjg(this.button, product.button) && zdlpuopuiu.eablkybsjg(this.limits, product.limits) && zdlpuopuiu.eablkybsjg(this.vivino, product.vivino) && zdlpuopuiu.eablkybsjg(this.productVariants, product.productVariants) && Double.compare(this.quantity, product.quantity) == 0 && zdlpuopuiu.eablkybsjg(this.declarations, product.declarations);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final Integer getDiscount() {
        return this.discount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Double getAvgWeight() {
        return this.avgWeight;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.article.hashCode()) * 31) + Double.hashCode(this.price)) * 31;
        Double d13 = this.oldPrice;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num = this.discount;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + this.measureTypeModel.hashCode()) * 31;
        Double d14 = this.avgWeight;
        int iHashCode4 = (((((((((((((((iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + Boolean.hashCode(this.isAvailableToBuy)) * 31) + this.productPropertyNames.hashCode()) * 31) + this.productProperties.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + this.photoUrls.hashCode()) * 31;
        Double d15 = this.energy;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.fats;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.carbs;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.protein;
        int iHashCode8 = (((iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31) + this.params.hashCode()) * 31;
        String str = this.description;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.chemical;
        int iHashCode10 = (((((((iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.hasDiscount)) * 31) + this.hints.hashCode()) * 31) + Boolean.hashCode(this.hidePrice)) * 31;
        Double d19 = this.rating;
        int iHashCode11 = (((((((iHashCode10 + (d19 == null ? 0 : d19.hashCode())) * 31) + Integer.hashCode(this.reviews)) * 31) + Boolean.hashCode(this.isPmProduct)) * 31) + this.video.hashCode()) * 31;
        ColorsModel colorsModel = this.colorsModel;
        int iHashCode12 = (((((((((((((((((((((iHashCode11 + (colorsModel == null ? 0 : colorsModel.hashCode())) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31) + this.countryFlagEmoji.hashCode()) * 31) + this.type.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.grape.hashCode()) * 31) + this.standart.hashCode()) * 31) + this.countryMapIcon.hashCode()) * 31) + this.tasting.hashCode()) * 31) + this.styling.hashCode()) * 31;
        Button button = this.button;
        int iHashCode13 = (((iHashCode12 + (button == null ? 0 : button.hashCode())) * 31) + this.limits.hashCode()) * 31;
        VivinoRating vivinoRating = this.vivino;
        int iHashCode14 = (iHashCode13 + (vivinoRating == null ? 0 : vivinoRating.hashCode())) * 31;
        ProductVariants productVariants = this.productVariants;
        int iHashCode15 = (((iHashCode14 + (productVariants == null ? 0 : productVariants.hashCode())) * 31) + Double.hashCode(this.quantity)) * 31;
        ProductDeclarations productDeclarations = this.declarations;
        return iHashCode15 + (productDeclarations != null ? productDeclarations.hashCode() : 0);
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: ikoacuggdj, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final Double getFats() {
        return this.fats;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: iwxlajgraz, reason: from getter */
    public final boolean getIsDispPer100() {
        return this.isDispPer100;
    }

    /* JADX INFO: renamed from: jhduphickx, reason: from getter */
    public final Double getProtein() {
        return this.protein;
    }

    /* JADX INFO: renamed from: jlmebxxoox, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: jztzpxfvev, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: kegysxyocb, reason: from getter */
    public final Map getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final String getGrape() {
        return this.grape;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: from getter */
    public final VideoProduct getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: metgxyhuhe, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final Double getCarbs() {
        return this.carbs;
    }

    /* JADX INFO: renamed from: oipsdeybqn, reason: from getter */
    public final String getTasting() {
        return this.tasting;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getCountryMapIcon() {
        return this.countryMapIcon;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: ribwqtqdhb, reason: from getter */
    public final List getProductProperties() {
        return this.productProperties;
    }

    /* JADX INFO: renamed from: roivzttewh, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* JADX INFO: renamed from: sflfametgt, reason: from getter */
    public final String getStyling() {
        return this.styling;
    }

    /* JADX INFO: renamed from: skhdrjzrfn, reason: from getter */
    public final boolean getIsPmProduct() {
        return this.isPmProduct;
    }

    /* JADX INFO: renamed from: sopmlzcsov, reason: from getter */
    public final List getPhotoUrls() {
        return this.photoUrls;
    }

    /* JADX INFO: renamed from: stevsuqkhv, reason: from getter */
    public final Double getOldPrice() {
        return this.oldPrice;
    }

    public String toString() {
        return "Product(id=" + this.id + ", name=" + this.name + ", article=" + this.article + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", discount=" + this.discount + ", isDispPer100=" + this.isDispPer100 + ", measureTypeModel=" + this.measureTypeModel + ", avgWeight=" + this.avgWeight + ", isFavorite=" + this.isFavorite + ", isAvailable=" + this.isAvailable + ", isAvailableToBuy=" + this.isAvailableToBuy + ", productPropertyNames=" + this.productPropertyNames + ", productProperties=" + this.productProperties + ", photoUrl=" + this.photoUrl + ", photoUrls=" + this.photoUrls + ", energy=" + this.energy + ", fats=" + this.fats + ", carbs=" + this.carbs + ", protein=" + this.protein + ", params=" + this.params + ", description=" + this.description + ", chemical=" + this.chemical + ", hasDiscount=" + this.hasDiscount + ", hints=" + this.hints + ", hidePrice=" + this.hidePrice + ", rating=" + this.rating + ", reviews=" + this.reviews + ", isPmProduct=" + this.isPmProduct + ", video=" + this.video + ", colorsModel=" + this.colorsModel + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ", type=" + this.type + ", kind=" + this.kind + ", grape=" + this.grape + ", standart=" + this.standart + ", countryMapIcon=" + this.countryMapIcon + ", tasting=" + this.tasting + ", styling=" + this.styling + ", button=" + this.button + ", limits=" + this.limits + ", vivino=" + this.vivino + ", productVariants=" + this.productVariants + ", quantity=" + this.quantity + ", declarations=" + this.declarations + ")";
    }

    /* JADX INFO: renamed from: tzroggbefp, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: from getter */
    public final int getReviews() {
        return this.reviews;
    }

    /* JADX INFO: renamed from: vipkmwdibw, reason: from getter */
    public final ProductVariants getProductVariants() {
        return this.productVariants;
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getCountryFlagEmoji() {
        return this.countryFlagEmoji;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.article);
        dest.writeDouble(this.price);
        Double d13 = this.oldPrice;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Integer num = this.discount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeInt(this.isDispPer100 ? 1 : 0);
        dest.writeParcelable(this.measureTypeModel, flags);
        Double d14 = this.avgWeight;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        dest.writeInt(this.isFavorite ? 1 : 0);
        dest.writeInt(this.isAvailable ? 1 : 0);
        dest.writeInt(this.isAvailableToBuy ? 1 : 0);
        dest.writeStringList(this.productPropertyNames);
        List list = this.productProperties;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Sticker) it.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.photoUrl);
        dest.writeStringList(this.photoUrls);
        Double d15 = this.energy;
        if (d15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d15.doubleValue());
        }
        Double d16 = this.fats;
        if (d16 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d16.doubleValue());
        }
        Double d17 = this.carbs;
        if (d17 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d17.doubleValue());
        }
        Double d18 = this.protein;
        if (d18 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d18.doubleValue());
        }
        Map map = this.params;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
        dest.writeString(this.description);
        dest.writeString(this.chemical);
        dest.writeInt(this.hasDiscount ? 1 : 0);
        List list2 = this.hints;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeInt(this.hidePrice ? 1 : 0);
        Double d19 = this.rating;
        if (d19 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d19.doubleValue());
        }
        dest.writeInt(this.reviews);
        dest.writeInt(this.isPmProduct ? 1 : 0);
        this.video.writeToParcel(dest, flags);
        ColorsModel colorsModel = this.colorsModel;
        if (colorsModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            colorsModel.writeToParcel(dest, flags);
        }
        dest.writeString(this.country);
        dest.writeString(this.region);
        dest.writeString(this.countryFlagEmoji);
        dest.writeString(this.type);
        dest.writeString(this.kind);
        dest.writeString(this.grape);
        dest.writeString(this.standart);
        dest.writeString(this.countryMapIcon);
        dest.writeString(this.tasting);
        dest.writeString(this.styling);
        Button button = this.button;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, flags);
        }
        List list3 = this.limits;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ((ProductLimit) it3.next()).writeToParcel(dest, flags);
        }
        VivinoRating vivinoRating = this.vivino;
        if (vivinoRating == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            vivinoRating.writeToParcel(dest, flags);
        }
        ProductVariants productVariants = this.productVariants;
        if (productVariants == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productVariants.writeToParcel(dest, flags);
        }
        dest.writeDouble(this.quantity);
        ProductDeclarations productDeclarations = this.declarations;
        if (productDeclarations == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productDeclarations.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final boolean getHasDiscount() {
        return this.hasDiscount;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final Double getEnergy() {
        return this.energy;
    }

    /* JADX INFO: renamed from: ydmasvzmpa, reason: from getter */
    public final String getStandart() {
        return this.standart;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final ProductDeclarations getDeclarations() {
        return this.declarations;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final boolean getHidePrice() {
        return this.hidePrice;
    }

    /* JADX INFO: renamed from: zeieaojujs, reason: from getter */
    public final VivinoRating getVivino() {
        return this.vivino;
    }

    public final Product zoijcleaow(String id2, String name, String article, double price, Double oldPrice, Integer discount, boolean isDispPer100, MeasureTypeModel measureTypeModel, Double avgWeight, boolean isFavorite, boolean isAvailable, boolean isAvailableToBuy, List productPropertyNames, List productProperties, String photoUrl, List photoUrls, Double energy, Double fats, Double carbs, Double protein, Map params, String description, String chemical, boolean hasDiscount, List hints, boolean hidePrice, Double rating, int reviews, boolean isPmProduct, VideoProduct video, ColorsModel colorsModel, String country, String region, String countryFlagEmoji, String type, String kind, String grape, String standart, String countryMapIcon, String tasting, String styling, Button button, List limits, VivinoRating vivino, ProductVariants productVariants, double quantity, ProductDeclarations declarations) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(productPropertyNames, "productPropertyNames");
        zdlpuopuiu.btonecajqb(productProperties, "productProperties");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(photoUrls, "photoUrls");
        zdlpuopuiu.btonecajqb(params, "params");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(video, "video");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(countryFlagEmoji, "countryFlagEmoji");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(grape, "grape");
        zdlpuopuiu.btonecajqb(standart, "standart");
        zdlpuopuiu.btonecajqb(countryMapIcon, "countryMapIcon");
        zdlpuopuiu.btonecajqb(tasting, "tasting");
        zdlpuopuiu.btonecajqb(styling, "styling");
        zdlpuopuiu.btonecajqb(limits, "limits");
        return new Product(id2, name, article, price, oldPrice, discount, isDispPer100, measureTypeModel, avgWeight, isFavorite, isAvailable, isAvailableToBuy, productPropertyNames, productProperties, photoUrl, photoUrls, energy, fats, carbs, protein, params, description, chemical, hasDiscount, hints, hidePrice, rating, reviews, isPmProduct, video, colorsModel, country, region, countryFlagEmoji, type, kind, grape, standart, countryMapIcon, tasting, styling, button, limits, vivino, productVariants, quantity, declarations);
    }

    public /* synthetic */ Product(String str, String str2, String str3, double d13, Double d14, Integer num, boolean z13, MeasureTypeModel measureTypeModel, Double d15, boolean z14, boolean z15, boolean z16, List list, List list2, String str4, List list3, Double d16, Double d17, Double d18, Double d19, Map map, String str5, String str6, boolean z17, List list4, boolean z18, Double d23, int i13, boolean z19, VideoProduct videoProduct, ColorsModel colorsModel, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Button button, List list5, VivinoRating vivinoRating, ProductVariants productVariants, double d24, ProductDeclarations productDeclarations, int i14, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? "" : str3, (i14 & 8) != 0 ? 0.0d : d13, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? false : z13, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? MeasureTypeModel.INSTANCE.iobyxmoadg() : measureTypeModel, (i14 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : d15, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z14, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z15, (i14 & 2048) != 0 ? false : z16, (i14 & 4096) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i14 & 8192) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i14 & 16384) != 0 ? "" : str4, (i14 & 32768) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i14 & 65536) != 0 ? null : d16, (i14 & 131072) != 0 ? null : d17, (i14 & 262144) != 0 ? null : d18, (i14 & 524288) != 0 ? null : d19, (i14 & 1048576) != 0 ? tzroggbefp.dxjokdxxww() : map, (i14 & 2097152) != 0 ? null : str5, (i14 & 4194304) != 0 ? null : str6, (i14 & 8388608) != 0 ? false : z17, (i14 & 16777216) != 0 ? jyumaefscl.wflxmlrfwp() : list4, (i14 & 33554432) != 0 ? false : z18, (i14 & 67108864) != 0 ? null : d23, (i14 & 134217728) != 0 ? 0 : i13, (i14 & 268435456) != 0 ? false : z19, (i14 & 536870912) != 0 ? new VideoProduct(null, null, null, 7, null) : videoProduct, (i14 & 1073741824) != 0 ? null : colorsModel, (i14 & Integer.MIN_VALUE) != 0 ? "" : str7, (i15 & 1) != 0 ? "" : str8, (i15 & 2) != 0 ? "" : str9, (i15 & 4) != 0 ? "" : str10, (i15 & 8) != 0 ? "" : str11, (i15 & 16) != 0 ? "" : str12, (i15 & 32) != 0 ? "" : str13, (i15 & 64) != 0 ? "" : str14, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str15, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str16, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : button, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jyumaefscl.wflxmlrfwp() : list5, (i15 & 2048) != 0 ? null : vivinoRating, (i15 & 4096) != 0 ? null : productVariants, (i15 & 8192) != 0 ? MeasureTypeModel.INSTANCE.iobyxmoadg().getOriginalMeasure().getBasketDefault() : d24, (i15 & 16384) != 0 ? null : productDeclarations);
    }
}
