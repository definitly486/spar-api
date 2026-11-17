package ru.myspar.proloyalty.common.view.product.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jt0.ppxfxbqfkf;
import jt0.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.proloyalty.common.view.counter.model.CounterModel;
import ru.myspar.proloyalty.core.domain.models.AvailabilityUiModel;
import ru.myspar.proloyalty.core.domain.models.ButtonUiModel;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductVariantsUiModel;
import ru.myspar.proloyalty.core.domain.models.VideoUiModel;
import ru.myspar.proloyalty.core.domain.models.VivinoRatingUiModel;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureTypeModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\by\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B·\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001a\u0012\u0006\u0010)\u001a\u00020\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010+\u001a\u00020\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010-\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00100\u001a\u00020\t\u0012\u0006\u00101\u001a\u00020\t\u0012\b\b\u0002\u00102\u001a\u00020\u0005\u0012\b\b\u0002\u00103\u001a\u00020\u0005\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00105\u001a\u00020\u0005\u0012\b\b\u0002\u00106\u001a\u00020\u0005\u0012\b\b\u0002\u00107\u001a\u00020\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0005\u0012\b\b\u0002\u00109\u001a\u00020\u0005\u0012\b\b\u0002\u0010:\u001a\u00020\u0005\u0012\b\b\u0002\u0010;\u001a\u00020\u0005\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001a\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\u0006\u0010C\u001a\u00020B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001a\u0012\u0006\u0010K\u001a\u00020J\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bP\u0010QJ\u001d\u0010V\u001a\u00020U2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u000e¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u000e¢\u0006\u0004\bX\u0010YJ\u008e\u0005\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00052\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001a2\b\b\u0002\u0010)\u001a\u00020\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010+\u001a\u00020\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010-\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\t2\b\b\u0002\u00101\u001a\u00020\t2\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u00052\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001a2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010C\u001a\u00020B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F2\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001a2\b\b\u0002\u0010K\u001a\u00020J2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b^\u0010YJ\u001a\u0010a\u001a\u00020\t2\b\u0010`\u001a\u0004\u0018\u00010_HÖ\u0003¢\u0006\u0004\ba\u0010bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010]R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010d\u001a\u0004\bg\u0010]R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bh\u0010d\u001a\u0004\bi\u0010]R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010d\u001a\u0004\b{\u0010]R\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010k\u001a\u0004\b}\u0010mR\u001a\u0010\u0012\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b~\u0010k\u001a\u0004\b\u007f\u0010mR\u001e\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\r\n\u0004\bx\u0010s\u001a\u0005\b\u0084\u0001\u0010uR\u001b\u0010\u0016\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b{\u0010k\u001a\u0005\b\u0085\u0001\u0010mR\u0019\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010k\u001a\u0005\b\u0086\u0001\u0010mR\u0019\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010k\u001a\u0005\b\u0088\u0001\u0010mR\u001b\u0010\u0019\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\r\n\u0004\b}\u0010d\u001a\u0005\b\u0089\u0001\u0010]R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0006¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\r\n\u0005\b\u008e\u0001\u0010k\u001a\u0004\b\u001c\u0010mR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010s\u001a\u0005\b\u0090\u0001\u0010uR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010s\u001a\u0005\b\u0092\u0001\u0010uR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010s\u001a\u0005\b\u0093\u0001\u0010uR\u001b\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010s\u001a\u0005\b\u0095\u0001\u0010uR'\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!8\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010#\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bt\u0010d\u001a\u0004\br\u0010]R\u001b\u0010$\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010d\u001a\u0005\b\u009a\u0001\u0010]R\u001d\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R#\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001a8\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u008b\u0001\u001a\u0006\b\u009f\u0001\u0010\u008d\u0001R\u0019\u0010)\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b \u0001\u0010k\u001a\u0005\b¡\u0001\u0010mR\u001e\u0010*\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b¢\u0001\u0010s\u001a\u0005\b£\u0001\u0010uR\u001c\u0010+\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bp\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010YR\u001b\u0010,\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\u000e\n\u0005\b¦\u0001\u0010s\u001a\u0005\b§\u0001\u0010uR\u0019\u0010-\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010k\u001a\u0005\b©\u0001\u0010mR\u001b\u0010/\u001a\u00020.8\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u001c\u00100\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010k\u001a\u0005\b®\u0001\u0010mR\u001c\u00101\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b¥\u0001\u0010k\u001a\u0005\b¯\u0001\u0010mR\u001c\u00102\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b°\u0001\u0010d\u001a\u0005\b±\u0001\u0010]R\u001c\u00103\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b²\u0001\u0010d\u001a\u0005\b\u00ad\u0001\u0010]R\u001e\u00104\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010d\u001a\u0005\b³\u0001\u0010]R\u0019\u00105\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b´\u0001\u0010d\u001a\u0005\bµ\u0001\u0010]R\u0019\u00106\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010d\u001a\u0005\b\u008e\u0001\u0010]R\u0019\u00107\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010d\u001a\u0005\b\u0087\u0001\u0010]R\u0019\u00108\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b¸\u0001\u0010d\u001a\u0005\b°\u0001\u0010]R\u0019\u00109\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010d\u001a\u0005\bº\u0001\u0010]R\u0019\u0010:\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010d\u001a\u0005\b¹\u0001\u0010]R\u0019\u0010;\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010d\u001a\u0005\b¶\u0001\u0010]R\u001d\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R$\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u001a8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u008b\u0001\u001a\u0006\b\u008a\u0001\u0010\u008d\u0001R\u001f\u0010A\u001a\u0004\u0018\u00010@8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0005\bf\u0010Â\u0001R\u001c\u0010C\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u007f\u0010Ã\u0001\u001a\u0005\bj\u0010Ä\u0001R \u0010E\u001a\u0004\u0018\u00010D8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R \u0010G\u001a\u0004\u0018\u00010F8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bÀ\u0001\u0010Ë\u0001R!\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001a8\u0006¢\u0006\u0010\n\u0006\bÌ\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R\u001e\u0010K\u001a\u00020J8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001d\u0010M\u001a\u0004\u0018\u00010L8\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010Ð\u0001\u001a\u0006\b¨\u0001\u0010Ñ\u0001R\u001d\u0010N\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001b\u0010O\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÖ\u0001\u0010d\u001a\u0005\b×\u0001\u0010]¨\u0006Ø\u0001"}, d2 = {"Lru/myspar/proloyalty/common/view/product/model/product/ProductUiModel;", "Ljt0/zoijcleaow;", "Ljt0/ppxfxbqfkf;", "Lmt0/iobyxmoadg;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.NAME, "article", "", "isProductWithZeroPrice", "", "price", "oldPrice", "", "discount", "discountString", "hasDiscount", "isDispPer100", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "measureTypeModel", "avgWeight", "isFavorite", "favoriteEnabledState", "inCart", "photoUrl", "", "photoUrls", "isMultiPhotos", "fats", "carbs", "protein", "energy", "", "params", "description", "chemical", "Lgz0/zoijcleaow;", "buyState", "Lru/myspar/proloyalty/core/domain/models/StickerUiModel;", "stickers", "hidePrice", "rating", "reviewsCount", "basketQuantity", "isPmProduct", "Lru/myspar/proloyalty/core/domain/models/VideoUiModel;", "video", "isRatingFeatureEnabled", "isPurchaseListsFeatureEnabled", "country", "region", "countryFlagEmoji", "type", "kind", "grape", "standart", "countryMapIcon", "tasting", "styling", "Lru/myspar/proloyalty/core/domain/models/ButtonUiModel;", "button", "Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "hints", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "colorsUiModel", "Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "counterModel", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;", "vivino", "Lru/myspar/proloyalty/core/domain/models/product/ProductLimit;", "limits", "Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;", "availabilityModel", "Lru/myspar/proloyalty/core/domain/models/ProductVariantsUiModel;", "productVariants", "isSelected", "adv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;ZZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;ZZZLjava/lang/String;Ljava/util/List;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lgz0/zoijcleaow;Ljava/util/List;ZLjava/lang/Double;ILjava/lang/Double;ZLru/myspar/proloyalty/core/domain/models/VideoUiModel;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/ButtonUiModel;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;Lru/myspar/proloyalty/common/view/counter/model/CounterModel;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;Lru/myspar/proloyalty/core/domain/models/ProductVariantsUiModel;Ljava/lang/Boolean;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "lqeggnwhkg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;ZZLru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;Ljava/lang/Double;ZZZLjava/lang/String;Ljava/util/List;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lgz0/zoijcleaow;Ljava/util/List;ZLjava/lang/Double;ILjava/lang/Double;ZLru/myspar/proloyalty/core/domain/models/VideoUiModel;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/myspar/proloyalty/core/domain/models/ButtonUiModel;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;Lru/myspar/proloyalty/common/view/counter/model/CounterModel;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;Lru/myspar/proloyalty/core/domain/models/ProductVariantsUiModel;Ljava/lang/Boolean;Ljava/lang/String;)Lru/myspar/proloyalty/common/view/product/model/product/ProductUiModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "getName", "jyumaefscl", "btonecajqb", "iwizpuwonk", "Z", "roivzttewh", "()Z", "cqumvgiudr", "D", "sopmlzcsov", "()D", "esjtqupxsv", "Ljava/lang/Double;", "stevsuqkhv", "()Ljava/lang/Double;", "lereixgezr", "Ljava/lang/Integer;", "yadqdtsiqt", "()Ljava/lang/Integer;", "pmvmpeiblj", "iozdgvuglv", "zynmafqrjb", "ylkuphrtab", "istkbnxepw", "bfopjjpdmp", "cdpycssgdh", "Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "cllcsxoeiz", "()Lru/myspar/proloyalty/core/models/measure_type/MeasureTypeModel;", "wflxmlrfwp", "lrnfpwlwnk", "lmojexxdyd", "wwaezpbzkn", "getInCart", "kegysxyocb", "pkzmftpjix", "Ljava/util/List;", "tzroggbefp", "()Ljava/util/List;", "hcddaimhww", "jpowsppfya", "getFats", "hkdspvbjdz", "getCarbs", "getProtein", "dsvhmnatus", "getEnergy", "wypolnanlu", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getChemical", "Lgz0/zoijcleaow;", "getBuyState", "()Lgz0/zoijcleaow;", "mbcevpiqjq", "jztzpxfvev", "ntlheqmsrt", "getHidePrice", "ulzqkzuiru", "ribwqtqdhb", "I", "jhduphickx", "crxdokpmqz", "getBasketQuantity", "jlmebxxoox", "zeieaojujs", "Lru/myspar/proloyalty/core/domain/models/VideoUiModel;", "sflfametgt", "()Lru/myspar/proloyalty/core/domain/models/VideoUiModel;", "vipkmwdibw", "iwxlajgraz", "auzgnhcxok", "ikoacuggdj", "gxszxtbevo", "okpsazkaxt", "zoijcleaow", "xrmfcynszj", "ydmasvzmpa", "metgxyhuhe", "rlfsiqarku", "czzsidtyhn", "uwvvkdfqfp", "getCountryMapIcon", "yfnezrywwk", "Lru/myspar/proloyalty/core/domain/models/ButtonUiModel;", "oxmwwwfdhm", "()Lru/myspar/proloyalty/core/domain/models/ButtonUiModel;", "zfvoamnweg", "oipsdeybqn", "Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "()Lru/myspar/proloyalty/core/domain/models/ColorsUiModel;", "Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "()Lru/myspar/proloyalty/common/view/counter/model/CounterModel;", "opjhrmiecq", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "getDeliveryCode", "()Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "iyctptxqzt", "Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;", "()Lru/myspar/proloyalty/core/domain/models/VivinoRatingUiModel;", "weqkydbzbr", "Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;", "gtknphoqwx", "()Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;", "Lru/myspar/proloyalty/core/domain/models/ProductVariantsUiModel;", "()Lru/myspar/proloyalty/core/domain/models/ProductVariantsUiModel;", "nuxfzjnpeb", "Ljava/lang/Boolean;", "dvvnrvtcbc", "()Ljava/lang/Boolean;", "tbqsvytpvh", "dxjokdxxww", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductUiModel implements zoijcleaow, ppxfxbqfkf, mt0.iobyxmoadg, Parcelable {
    public static final Parcelable.Creator<ProductUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name and from kotlin metadata and from toString */
    private final CounterModel counterModel;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final MeasureTypeModel measureTypeModel;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double protein;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double basketQuantity;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name and from kotlin metadata and from toString */
    private final String standart;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double energy;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double oldPrice;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMultiPhotos;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double carbs;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavorite;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDispPer100;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isProductWithZeroPrice;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name and from kotlin metadata and from toString */
    private final VivinoRatingUiModel vivino;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchaseListsFeatureEnabled;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPmProduct;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double fats;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String article;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryFlagEmoji;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String chemical;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer discount;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean favoriteEnabledState;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailabilityUiModel availabilityModel;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name and from kotlin metadata and from toString */
    private final List stickers;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String kind;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hidePrice;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isSelected;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsUiModel colorsUiModel;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String region;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final List photoUrls;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String discountString;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name and from kotlin metadata and from toString */
    private final VideoUiModel video;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name and from kotlin metadata and from toString */
    private final String grape;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonUiModel button;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reviewsCount;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name and from kotlin metadata and from toString */
    private final gz0.zoijcleaow buyState;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double rating;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryMapIcon;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRatingFeatureEnabled;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List limits;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inCart;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map params;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double avgWeight;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name and from kotlin metadata and from toString */
    private final String styling;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tasting;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final String photoUrl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductVariantsUiModel productVariants;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List hints;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasDiscount;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            double d13 = parcel.readDouble();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string4 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            MeasureTypeModel measureTypeModel = (MeasureTypeModel) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z19 = parcel.readInt() != 0;
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i13 = parcel.readInt();
            boolean z23 = z15;
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            int i14 = 0;
            while (i14 != i13) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                i14++;
                i13 = i13;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            gz0.zoijcleaow zoijcleaowVarValueOf = parcel.readInt() == 0 ? null : gz0.zoijcleaow.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int i16 = 0;
                while (i16 != i15) {
                    arrayList2.add(parcel.readParcelable(ProductUiModel.class.getClassLoader()));
                    i16++;
                    i15 = i15;
                }
                arrayList = arrayList2;
            }
            boolean z24 = parcel.readInt() != 0;
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i17 = parcel.readInt();
            Double dValueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            boolean z25 = parcel.readInt() != 0;
            VideoUiModel videoUiModel = (VideoUiModel) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            boolean z26 = parcel.readInt() != 0;
            boolean z27 = parcel.readInt() != 0;
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            ButtonUiModel buttonUiModel = (ButtonUiModel) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            int i18 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i18);
            int i19 = 0;
            while (i19 != i18) {
                arrayList3.add(parcel.readParcelable(ProductUiModel.class.getClassLoader()));
                i19++;
                i18 = i18;
            }
            ColorsUiModel colorsUiModel = (ColorsUiModel) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            CounterModel counterModelCreateFromParcel = CounterModel.CREATOR.createFromParcel(parcel);
            DeliveryCode deliveryCode = (DeliveryCode) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            VivinoRatingUiModel vivinoRatingUiModel = (VivinoRatingUiModel) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            int i23 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i23);
            int i24 = 0;
            while (i24 != i23) {
                arrayList4.add(parcel.readParcelable(ProductUiModel.class.getClassLoader()));
                i24++;
                i23 = i23;
            }
            AvailabilityUiModel availabilityUiModel = (AvailabilityUiModel) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            ProductVariantsUiModel productVariantsUiModel = (ProductVariantsUiModel) parcel.readParcelable(ProductUiModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProductUiModel(string, string2, string3, z13, d13, dValueOf, numValueOf, string4, z14, z23, measureTypeModel, dValueOf2, z16, z17, z18, string5, arrayListCreateStringArrayList, z19, dValueOf3, dValueOf4, dValueOf5, dValueOf6, linkedHashMap, string6, string7, zoijcleaowVarValueOf, arrayList, z24, dValueOf7, i17, dValueOf8, z25, videoUiModel, z26, z27, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, buttonUiModel, arrayList3, colorsUiModel, counterModelCreateFromParcel, deliveryCode, vivinoRatingUiModel, arrayList4, availabilityUiModel, productVariantsUiModel, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductUiModel[] newArray(int i13) {
            return new ProductUiModel[i13];
        }
    }

    public ProductUiModel(String id2, String name, String article, boolean z13, double d13, Double d14, Integer num, String discountString, boolean z14, boolean z15, MeasureTypeModel measureTypeModel, Double d15, boolean z16, boolean z17, boolean z18, String photoUrl, List photoUrls, boolean z19, Double d16, Double d17, Double d18, Double d19, Map params, String str, String str2, gz0.zoijcleaow zoijcleaowVar, List list, boolean z23, Double d23, int i13, Double d24, boolean z24, VideoUiModel video, boolean z25, boolean z26, String country, String region, String str3, String type, String kind, String grape, String standart, String countryMapIcon, String tasting, String styling, ButtonUiModel buttonUiModel, List hints, ColorsUiModel colorsUiModel, CounterModel counterModel, DeliveryCode deliveryCode, VivinoRatingUiModel vivinoRatingUiModel, List limits, AvailabilityUiModel availabilityModel, ProductVariantsUiModel productVariantsUiModel, Boolean bool, String str4) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(discountString, "discountString");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(photoUrls, "photoUrls");
        zdlpuopuiu.btonecajqb(params, "params");
        zdlpuopuiu.btonecajqb(video, "video");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(grape, "grape");
        zdlpuopuiu.btonecajqb(standart, "standart");
        zdlpuopuiu.btonecajqb(countryMapIcon, "countryMapIcon");
        zdlpuopuiu.btonecajqb(tasting, "tasting");
        zdlpuopuiu.btonecajqb(styling, "styling");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(counterModel, "counterModel");
        zdlpuopuiu.btonecajqb(limits, "limits");
        zdlpuopuiu.btonecajqb(availabilityModel, "availabilityModel");
        this.id = id2;
        this.name = name;
        this.article = article;
        this.isProductWithZeroPrice = z13;
        this.price = d13;
        this.oldPrice = d14;
        this.discount = num;
        this.discountString = discountString;
        this.hasDiscount = z14;
        this.isDispPer100 = z15;
        this.measureTypeModel = measureTypeModel;
        this.avgWeight = d15;
        this.isFavorite = z16;
        this.favoriteEnabledState = z17;
        this.inCart = z18;
        this.photoUrl = photoUrl;
        this.photoUrls = photoUrls;
        this.isMultiPhotos = z19;
        this.fats = d16;
        this.carbs = d17;
        this.protein = d18;
        this.energy = d19;
        this.params = params;
        this.description = str;
        this.chemical = str2;
        this.buyState = zoijcleaowVar;
        this.stickers = list;
        this.hidePrice = z23;
        this.rating = d23;
        this.reviewsCount = i13;
        this.basketQuantity = d24;
        this.isPmProduct = z24;
        this.video = video;
        this.isRatingFeatureEnabled = z25;
        this.isPurchaseListsFeatureEnabled = z26;
        this.country = country;
        this.region = region;
        this.countryFlagEmoji = str3;
        this.type = type;
        this.kind = kind;
        this.grape = grape;
        this.standart = standart;
        this.countryMapIcon = countryMapIcon;
        this.tasting = tasting;
        this.styling = styling;
        this.button = buttonUiModel;
        this.hints = hints;
        this.colorsUiModel = colorsUiModel;
        this.counterModel = counterModel;
        this.deliveryCode = deliveryCode;
        this.vivino = vivinoRatingUiModel;
        this.limits = limits;
        this.availabilityModel = availabilityModel;
        this.productVariants = productVariantsUiModel;
        this.isSelected = bool;
        this.adv = str4;
    }

    /* JADX INFO: renamed from: auzgnhcxok, reason: from getter */
    public boolean getIsPurchaseListsFeatureEnabled() {
        return this.isPurchaseListsFeatureEnabled;
    }

    /* JADX INFO: renamed from: bfopjjpdmp, reason: from getter */
    public boolean getIsDispPer100() {
        return this.isDispPer100;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getArticle() {
        return this.article;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public MeasureTypeModel getMeasureTypeModel() {
        return this.measureTypeModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getAdv() {
        return this.adv;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductUiModel)) {
            return false;
        }
        ProductUiModel productUiModel = (ProductUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.id, productUiModel.id) && zdlpuopuiu.eablkybsjg(this.name, productUiModel.name) && zdlpuopuiu.eablkybsjg(this.article, productUiModel.article) && this.isProductWithZeroPrice == productUiModel.isProductWithZeroPrice && Double.compare(this.price, productUiModel.price) == 0 && zdlpuopuiu.eablkybsjg(this.oldPrice, productUiModel.oldPrice) && zdlpuopuiu.eablkybsjg(this.discount, productUiModel.discount) && zdlpuopuiu.eablkybsjg(this.discountString, productUiModel.discountString) && this.hasDiscount == productUiModel.hasDiscount && this.isDispPer100 == productUiModel.isDispPer100 && zdlpuopuiu.eablkybsjg(this.measureTypeModel, productUiModel.measureTypeModel) && zdlpuopuiu.eablkybsjg(this.avgWeight, productUiModel.avgWeight) && this.isFavorite == productUiModel.isFavorite && this.favoriteEnabledState == productUiModel.favoriteEnabledState && this.inCart == productUiModel.inCart && zdlpuopuiu.eablkybsjg(this.photoUrl, productUiModel.photoUrl) && zdlpuopuiu.eablkybsjg(this.photoUrls, productUiModel.photoUrls) && this.isMultiPhotos == productUiModel.isMultiPhotos && zdlpuopuiu.eablkybsjg(this.fats, productUiModel.fats) && zdlpuopuiu.eablkybsjg(this.carbs, productUiModel.carbs) && zdlpuopuiu.eablkybsjg(this.protein, productUiModel.protein) && zdlpuopuiu.eablkybsjg(this.energy, productUiModel.energy) && zdlpuopuiu.eablkybsjg(this.params, productUiModel.params) && zdlpuopuiu.eablkybsjg(this.description, productUiModel.description) && zdlpuopuiu.eablkybsjg(this.chemical, productUiModel.chemical) && this.buyState == productUiModel.buyState && zdlpuopuiu.eablkybsjg(this.stickers, productUiModel.stickers) && this.hidePrice == productUiModel.hidePrice && zdlpuopuiu.eablkybsjg(this.rating, productUiModel.rating) && this.reviewsCount == productUiModel.reviewsCount && zdlpuopuiu.eablkybsjg(this.basketQuantity, productUiModel.basketQuantity) && this.isPmProduct == productUiModel.isPmProduct && zdlpuopuiu.eablkybsjg(this.video, productUiModel.video) && this.isRatingFeatureEnabled == productUiModel.isRatingFeatureEnabled && this.isPurchaseListsFeatureEnabled == productUiModel.isPurchaseListsFeatureEnabled && zdlpuopuiu.eablkybsjg(this.country, productUiModel.country) && zdlpuopuiu.eablkybsjg(this.region, productUiModel.region) && zdlpuopuiu.eablkybsjg(this.countryFlagEmoji, productUiModel.countryFlagEmoji) && zdlpuopuiu.eablkybsjg(this.type, productUiModel.type) && zdlpuopuiu.eablkybsjg(this.kind, productUiModel.kind) && zdlpuopuiu.eablkybsjg(this.grape, productUiModel.grape) && zdlpuopuiu.eablkybsjg(this.standart, productUiModel.standart) && zdlpuopuiu.eablkybsjg(this.countryMapIcon, productUiModel.countryMapIcon) && zdlpuopuiu.eablkybsjg(this.tasting, productUiModel.tasting) && zdlpuopuiu.eablkybsjg(this.styling, productUiModel.styling) && zdlpuopuiu.eablkybsjg(this.button, productUiModel.button) && zdlpuopuiu.eablkybsjg(this.hints, productUiModel.hints) && zdlpuopuiu.eablkybsjg(this.colorsUiModel, productUiModel.colorsUiModel) && zdlpuopuiu.eablkybsjg(this.counterModel, productUiModel.counterModel) && this.deliveryCode == productUiModel.deliveryCode && zdlpuopuiu.eablkybsjg(this.vivino, productUiModel.vivino) && zdlpuopuiu.eablkybsjg(this.limits, productUiModel.limits) && zdlpuopuiu.eablkybsjg(this.availabilityModel, productUiModel.availabilityModel) && zdlpuopuiu.eablkybsjg(this.productVariants, productUiModel.productVariants) && zdlpuopuiu.eablkybsjg(this.isSelected, productUiModel.isSelected) && zdlpuopuiu.eablkybsjg(this.adv, productUiModel.adv);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Override // mt0.iobyxmoadg
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public AvailabilityUiModel getAvailabilityModel() {
        return this.availabilityModel;
    }

    @Override // mt0.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public String getCountry() {
        return this.country;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.article.hashCode()) * 31) + Boolean.hashCode(this.isProductWithZeroPrice)) * 31) + Double.hashCode(this.price)) * 31;
        Double d13 = this.oldPrice;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num = this.discount;
        int iHashCode3 = (((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.discountString.hashCode()) * 31) + Boolean.hashCode(this.hasDiscount)) * 31) + Boolean.hashCode(this.isDispPer100)) * 31) + this.measureTypeModel.hashCode()) * 31;
        Double d14 = this.avgWeight;
        int iHashCode4 = (((((((((((((iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + Boolean.hashCode(this.favoriteEnabledState)) * 31) + Boolean.hashCode(this.inCart)) * 31) + this.photoUrl.hashCode()) * 31) + this.photoUrls.hashCode()) * 31) + Boolean.hashCode(this.isMultiPhotos)) * 31;
        Double d15 = this.fats;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.carbs;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.protein;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.energy;
        int iHashCode8 = (((iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31) + this.params.hashCode()) * 31;
        String str = this.description;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.chemical;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        gz0.zoijcleaow zoijcleaowVar = this.buyState;
        int iHashCode11 = (iHashCode10 + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        List list = this.stickers;
        int iHashCode12 = (((iHashCode11 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.hidePrice)) * 31;
        Double d19 = this.rating;
        int iHashCode13 = (((iHashCode12 + (d19 == null ? 0 : d19.hashCode())) * 31) + Integer.hashCode(this.reviewsCount)) * 31;
        Double d23 = this.basketQuantity;
        int iHashCode14 = (((((((((((((iHashCode13 + (d23 == null ? 0 : d23.hashCode())) * 31) + Boolean.hashCode(this.isPmProduct)) * 31) + this.video.hashCode()) * 31) + Boolean.hashCode(this.isRatingFeatureEnabled)) * 31) + Boolean.hashCode(this.isPurchaseListsFeatureEnabled)) * 31) + this.country.hashCode()) * 31) + this.region.hashCode()) * 31;
        String str3 = this.countryFlagEmoji;
        int iHashCode15 = (((((((((((((((iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.type.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.grape.hashCode()) * 31) + this.standart.hashCode()) * 31) + this.countryMapIcon.hashCode()) * 31) + this.tasting.hashCode()) * 31) + this.styling.hashCode()) * 31;
        ButtonUiModel buttonUiModel = this.button;
        int iHashCode16 = (((iHashCode15 + (buttonUiModel == null ? 0 : buttonUiModel.hashCode())) * 31) + this.hints.hashCode()) * 31;
        ColorsUiModel colorsUiModel = this.colorsUiModel;
        int iHashCode17 = (((iHashCode16 + (colorsUiModel == null ? 0 : colorsUiModel.hashCode())) * 31) + this.counterModel.hashCode()) * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        int iHashCode18 = (iHashCode17 + (deliveryCode == null ? 0 : deliveryCode.hashCode())) * 31;
        VivinoRatingUiModel vivinoRatingUiModel = this.vivino;
        int iHashCode19 = (((((iHashCode18 + (vivinoRatingUiModel == null ? 0 : vivinoRatingUiModel.hashCode())) * 31) + this.limits.hashCode()) * 31) + this.availabilityModel.hashCode()) * 31;
        ProductVariantsUiModel productVariantsUiModel = this.productVariants;
        int iHashCode20 = (iHashCode19 + (productVariantsUiModel == null ? 0 : productVariantsUiModel.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int iHashCode21 = (iHashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.adv;
        return iHashCode21 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: ikoacuggdj, reason: from getter */
    public final String getStandart() {
        return this.standart;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public String getDiscountString() {
        return this.discountString;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public CounterModel getCounterModel() {
        return this.counterModel;
    }

    /* JADX INFO: renamed from: iwxlajgraz, reason: from getter */
    public boolean getIsRatingFeatureEnabled() {
        return this.isRatingFeatureEnabled;
    }

    /* JADX INFO: renamed from: jhduphickx, reason: from getter */
    public int getReviewsCount() {
        return this.reviewsCount;
    }

    /* JADX INFO: renamed from: jlmebxxoox, reason: from getter */
    public final ProductVariantsUiModel getProductVariants() {
        return this.productVariants;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: jztzpxfvev, reason: from getter */
    public final List getStickers() {
        return this.stickers;
    }

    /* JADX INFO: renamed from: kegysxyocb, reason: from getter */
    public String getPhotoUrl() {
        return this.photoUrl;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final boolean getFavoriteEnabledState() {
        return this.favoriteEnabledState;
    }

    public final ProductUiModel lqeggnwhkg(String id2, String name, String article, boolean isProductWithZeroPrice, double price, Double oldPrice, Integer discount, String discountString, boolean hasDiscount, boolean isDispPer100, MeasureTypeModel measureTypeModel, Double avgWeight, boolean isFavorite, boolean favoriteEnabledState, boolean inCart, String photoUrl, List photoUrls, boolean isMultiPhotos, Double fats, Double carbs, Double protein, Double energy, Map params, String description, String chemical, gz0.zoijcleaow buyState, List stickers, boolean hidePrice, Double rating, int reviewsCount, Double basketQuantity, boolean isPmProduct, VideoUiModel video, boolean isRatingFeatureEnabled, boolean isPurchaseListsFeatureEnabled, String country, String region, String countryFlagEmoji, String type, String kind, String grape, String standart, String countryMapIcon, String tasting, String styling, ButtonUiModel button, List hints, ColorsUiModel colorsUiModel, CounterModel counterModel, DeliveryCode deliveryCode, VivinoRatingUiModel vivino, List limits, AvailabilityUiModel availabilityModel, ProductVariantsUiModel productVariants, Boolean isSelected, String adv) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(article, "article");
        zdlpuopuiu.btonecajqb(discountString, "discountString");
        zdlpuopuiu.btonecajqb(measureTypeModel, "measureTypeModel");
        zdlpuopuiu.btonecajqb(photoUrl, "photoUrl");
        zdlpuopuiu.btonecajqb(photoUrls, "photoUrls");
        zdlpuopuiu.btonecajqb(params, "params");
        zdlpuopuiu.btonecajqb(video, "video");
        zdlpuopuiu.btonecajqb(country, "country");
        zdlpuopuiu.btonecajqb(region, "region");
        zdlpuopuiu.btonecajqb(type, "type");
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(grape, "grape");
        zdlpuopuiu.btonecajqb(standart, "standart");
        zdlpuopuiu.btonecajqb(countryMapIcon, "countryMapIcon");
        zdlpuopuiu.btonecajqb(tasting, "tasting");
        zdlpuopuiu.btonecajqb(styling, "styling");
        zdlpuopuiu.btonecajqb(hints, "hints");
        zdlpuopuiu.btonecajqb(counterModel, "counterModel");
        zdlpuopuiu.btonecajqb(limits, "limits");
        zdlpuopuiu.btonecajqb(availabilityModel, "availabilityModel");
        return new ProductUiModel(id2, name, article, isProductWithZeroPrice, price, oldPrice, discount, discountString, hasDiscount, isDispPer100, measureTypeModel, avgWeight, isFavorite, favoriteEnabledState, inCart, photoUrl, photoUrls, isMultiPhotos, fats, carbs, protein, energy, params, description, chemical, buyState, stickers, hidePrice, rating, reviewsCount, basketQuantity, isPmProduct, video, isRatingFeatureEnabled, isPurchaseListsFeatureEnabled, country, region, countryFlagEmoji, type, kind, grape, standart, countryMapIcon, tasting, styling, button, hints, colorsUiModel, counterModel, deliveryCode, vivino, limits, availabilityModel, productVariants, isSelected, adv);
    }

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: from getter */
    public boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: metgxyhuhe, reason: from getter */
    public final String getStyling() {
        return this.styling;
    }

    /* JADX INFO: renamed from: oipsdeybqn, reason: from getter */
    public VivinoRatingUiModel getVivino() {
        return this.vivino;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final ButtonUiModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public List getHints() {
        return this.hints;
    }

    /* JADX INFO: renamed from: ribwqtqdhb, reason: from getter */
    public Double getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: roivzttewh, reason: from getter */
    public boolean getIsProductWithZeroPrice() {
        return this.isProductWithZeroPrice;
    }

    /* JADX INFO: renamed from: sflfametgt, reason: from getter */
    public final VideoUiModel getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: sopmlzcsov, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: stevsuqkhv, reason: from getter */
    public final Double getOldPrice() {
        return this.oldPrice;
    }

    public String toString() {
        return "ProductUiModel(id=" + this.id + ", name=" + this.name + ", article=" + this.article + ", isProductWithZeroPrice=" + this.isProductWithZeroPrice + ", price=" + this.price + ", oldPrice=" + this.oldPrice + ", discount=" + this.discount + ", discountString=" + this.discountString + ", hasDiscount=" + this.hasDiscount + ", isDispPer100=" + this.isDispPer100 + ", measureTypeModel=" + this.measureTypeModel + ", avgWeight=" + this.avgWeight + ", isFavorite=" + this.isFavorite + ", favoriteEnabledState=" + this.favoriteEnabledState + ", inCart=" + this.inCart + ", photoUrl=" + this.photoUrl + ", photoUrls=" + this.photoUrls + ", isMultiPhotos=" + this.isMultiPhotos + ", fats=" + this.fats + ", carbs=" + this.carbs + ", protein=" + this.protein + ", energy=" + this.energy + ", params=" + this.params + ", description=" + this.description + ", chemical=" + this.chemical + ", buyState=" + this.buyState + ", stickers=" + this.stickers + ", hidePrice=" + this.hidePrice + ", rating=" + this.rating + ", reviewsCount=" + this.reviewsCount + ", basketQuantity=" + this.basketQuantity + ", isPmProduct=" + this.isPmProduct + ", video=" + this.video + ", isRatingFeatureEnabled=" + this.isRatingFeatureEnabled + ", isPurchaseListsFeatureEnabled=" + this.isPurchaseListsFeatureEnabled + ", country=" + this.country + ", region=" + this.region + ", countryFlagEmoji=" + this.countryFlagEmoji + ", type=" + this.type + ", kind=" + this.kind + ", grape=" + this.grape + ", standart=" + this.standart + ", countryMapIcon=" + this.countryMapIcon + ", tasting=" + this.tasting + ", styling=" + this.styling + ", button=" + this.button + ", hints=" + this.hints + ", colorsUiModel=" + this.colorsUiModel + ", counterModel=" + this.counterModel + ", deliveryCode=" + this.deliveryCode + ", vivino=" + this.vivino + ", limits=" + this.limits + ", availabilityModel=" + this.availabilityModel + ", productVariants=" + this.productVariants + ", isSelected=" + this.isSelected + ", adv=" + this.adv + ")";
    }

    /* JADX INFO: renamed from: tzroggbefp, reason: from getter */
    public final List getPhotoUrls() {
        return this.photoUrls;
    }

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: from getter */
    public final String getTasting() {
        return this.tasting;
    }

    /* JADX INFO: renamed from: vipkmwdibw, reason: from getter */
    public String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final Double getAvgWeight() {
        return this.avgWeight;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.article);
        dest.writeInt(this.isProductWithZeroPrice ? 1 : 0);
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
        dest.writeString(this.discountString);
        dest.writeInt(this.hasDiscount ? 1 : 0);
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
        dest.writeInt(this.favoriteEnabledState ? 1 : 0);
        dest.writeInt(this.inCart ? 1 : 0);
        dest.writeString(this.photoUrl);
        dest.writeStringList(this.photoUrls);
        dest.writeInt(this.isMultiPhotos ? 1 : 0);
        Double d15 = this.fats;
        if (d15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d15.doubleValue());
        }
        Double d16 = this.carbs;
        if (d16 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d16.doubleValue());
        }
        Double d17 = this.protein;
        if (d17 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d17.doubleValue());
        }
        Double d18 = this.energy;
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
        gz0.zoijcleaow zoijcleaowVar = this.buyState;
        if (zoijcleaowVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zoijcleaowVar.name());
        }
        List list = this.stickers;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), flags);
            }
        }
        dest.writeInt(this.hidePrice ? 1 : 0);
        Double d19 = this.rating;
        if (d19 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d19.doubleValue());
        }
        dest.writeInt(this.reviewsCount);
        Double d23 = this.basketQuantity;
        if (d23 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d23.doubleValue());
        }
        dest.writeInt(this.isPmProduct ? 1 : 0);
        dest.writeParcelable(this.video, flags);
        dest.writeInt(this.isRatingFeatureEnabled ? 1 : 0);
        dest.writeInt(this.isPurchaseListsFeatureEnabled ? 1 : 0);
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
        dest.writeParcelable(this.button, flags);
        List list2 = this.hints;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        dest.writeParcelable(this.colorsUiModel, flags);
        this.counterModel.writeToParcel(dest, flags);
        dest.writeParcelable(this.deliveryCode, flags);
        dest.writeParcelable(this.vivino, flags);
        List list3 = this.limits;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
        dest.writeParcelable(this.availabilityModel, flags);
        dest.writeParcelable(this.productVariants, flags);
        Boolean bool = this.isSelected;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.adv);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final String getGrape() {
        return this.grape;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final Integer getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: ydmasvzmpa, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public ColorsUiModel getColorsUiModel() {
        return this.colorsUiModel;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public boolean getHasDiscount() {
        return this.hasDiscount;
    }

    /* JADX INFO: renamed from: zeieaojujs, reason: from getter */
    public final boolean getIsPmProduct() {
        return this.isPmProduct;
    }

    @Override // mt0.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public String getCountryFlagEmoji() {
        return this.countryFlagEmoji;
    }

    public /* synthetic */ ProductUiModel(String str, String str2, String str3, boolean z13, double d13, Double d14, Integer num, String str4, boolean z14, boolean z15, MeasureTypeModel measureTypeModel, Double d15, boolean z16, boolean z17, boolean z18, String str5, List list, boolean z19, Double d16, Double d17, Double d18, Double d19, Map map, String str6, String str7, gz0.zoijcleaow zoijcleaowVar, List list2, boolean z23, Double d23, int i13, Double d24, boolean z24, VideoUiModel videoUiModel, boolean z25, boolean z26, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ButtonUiModel buttonUiModel, List list3, ColorsUiModel colorsUiModel, CounterModel counterModel, DeliveryCode deliveryCode, VivinoRatingUiModel vivinoRatingUiModel, List list4, AvailabilityUiModel availabilityUiModel, ProductVariantsUiModel productVariantsUiModel, Boolean bool, String str18, int i14, int i15, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, z13, d13, d14, num, str4, z14, z15, measureTypeModel, d15, z16, (i14 & 8192) != 0 ? true : z17, z18, str5, list, z19, d16, d17, d18, d19, map, str6, str7, zoijcleaowVar, list2, z23, d23, i13, (i14 & 1073741824) != 0 ? null : d24, z24, videoUiModel, z25, z26, (i15 & 8) != 0 ? "" : str8, (i15 & 16) != 0 ? "" : str9, str10, (i15 & 64) != 0 ? "" : str11, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str12, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str13, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : str14, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str15, (i15 & 2048) != 0 ? "" : str16, (i15 & 4096) != 0 ? "" : str17, (i15 & 8192) != 0 ? null : buttonUiModel, (i15 & 16384) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (32768 & i15) != 0 ? null : colorsUiModel, counterModel, (131072 & i15) != 0 ? null : deliveryCode, vivinoRatingUiModel, list4, availabilityUiModel, productVariantsUiModel, (4194304 & i15) != 0 ? null : bool, (8388608 & i15) != 0 ? null : str18);
    }
}
