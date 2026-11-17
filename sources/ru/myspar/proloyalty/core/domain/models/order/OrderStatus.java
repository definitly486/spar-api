package ru.myspar.proloyalty.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.iobyxmoadg;
import zy0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/OrderStatus;", "Landroid/os/Parcelable;", "", "", "serverValue", "", "titleStringRes", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zdlpuopuiu", "Ljava/lang/String;", "nufgyqmvbu", "()Ljava/lang/String;", "yggfygwlhe", "I", "dxjokdxxww", "jyumaefscl", "iobyxmoadg", "iwizpuwonk", "cqumvgiudr", "esjtqupxsv", "lereixgezr", "pmvmpeiblj", "zynmafqrjb", "istkbnxepw", "cdpycssgdh", "yadqdtsiqt", "iozdgvuglv", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum OrderStatus implements Parcelable {
    NEW("N", ppxfxbqfkf.proloyalty_title_order_status_new),
    ACCEPT("P", ppxfxbqfkf.proloyalty_title_order_status_accept),
    PREPARE("W", ppxfxbqfkf.proloyalty_title_order_status_prepare),
    COLLECTING("B", ppxfxbqfkf.proloyalty_title_order_status_collecting),
    COLLECT("S", ppxfxbqfkf.proloyalty_title_order_status_collect),
    DELIVERY("D", ppxfxbqfkf.proloyalty_title_order_status_delivery),
    READY("G", ppxfxbqfkf.proloyalty_title_order_status_ready_go),
    COMPLETE("F", ppxfxbqfkf.proloyalty_title_order_status_complete),
    CANCEL("C", ppxfxbqfkf.proloyalty_title_order_status_cancel),
    UNDEFINED(StringUtils.UNDEFINED, ppxfxbqfkf.proloyalty_undefined);


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final int titleStringRes;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String serverValue;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final /* synthetic */ iobyxmoadg f94805wwaezpbzkn = ng.zoijcleaow.iobyxmoadg(lqeggnwhkg());

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<OrderStatus> CREATOR = new Parcelable.Creator() { // from class: ru.myspar.proloyalty.core.domain.models.order.OrderStatus.zoijcleaow
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final OrderStatus createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return OrderStatus.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final OrderStatus[] newArray(int i13) {
            return new OrderStatus[i13];
        }
    };

    /* JADX INFO: renamed from: ru.myspar.proloyalty.core.domain.models.order.OrderStatus$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        public final OrderStatus iobyxmoadg(String str) {
            for (OrderStatus orderStatus : OrderStatus.values()) {
                if (zdlpuopuiu.eablkybsjg(orderStatus.getServerValue(), str)) {
                    if (orderStatus == null) {
                        return OrderStatus.UNDEFINED;
                    }
                    return orderStatus;
                }
            }
            orderStatus = null;
            if (orderStatus == null) {
                return OrderStatus.UNDEFINED;
            }
            return orderStatus;
        }

        private Companion() {
        }
    }

    OrderStatus(String str, int i13) {
        this.serverValue = str;
        this.titleStringRes = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final int getTitleStringRes() {
        return this.titleStringRes;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getServerValue() {
        return this.serverValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(name());
    }
}
