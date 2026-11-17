package ru.myspar.proloyalty.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/order/OrderPickupStatus;", "Landroid/os/Parcelable;", "", "", "status", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zdlpuopuiu", "Ljava/lang/String;", "nufgyqmvbu", "()Ljava/lang/String;", "yggfygwlhe", "jyumaefscl", "iwizpuwonk", "cqumvgiudr", "esjtqupxsv", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum OrderPickupStatus implements Parcelable {
    NONE(DevicePublicKeyStringDef.NONE),
    READY("ready"),
    ON_MY_WAY("onWay"),
    IN_SHOP("inShop"),
    IN_CAR("inCar");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String status;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f94773pmvmpeiblj = zoijcleaow.iobyxmoadg(lqeggnwhkg());
    public static final Parcelable.Creator<OrderPickupStatus> CREATOR = new Parcelable.Creator() { // from class: ru.myspar.proloyalty.core.domain.models.order.OrderPickupStatus.iobyxmoadg
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final OrderPickupStatus createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return OrderPickupStatus.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final OrderPickupStatus[] newArray(int i13) {
            return new OrderPickupStatus[i13];
        }
    };

    OrderPickupStatus(String str) {
        this.status = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(name());
    }
}
