package ru.myspar.evropolis.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/evropolis/api/model/EvropolisGiftArgs;", "Landroid/os/Parcelable;", "Lru/myspar/evropolis/api/model/EvropolisGift;", "gift", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "<init>", "(Lru/myspar/evropolis/api/model/EvropolisGift;Lru/myspar/core/models/delivery/DeliveryCode;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/evropolis/api/model/EvropolisGift;", "ppxfxbqfkf", "()Lru/myspar/evropolis/api/model/EvropolisGift;", "yggfygwlhe", "Lru/myspar/core/models/delivery/DeliveryCode;", "zoijcleaow", "()Lru/myspar/core/models/delivery/DeliveryCode;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EvropolisGiftArgs implements Parcelable {
    public static final Parcelable.Creator<EvropolisGiftArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode deliveryCode;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final EvropolisGift gift;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final EvropolisGiftArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new EvropolisGiftArgs(EvropolisGift.CREATOR.createFromParcel(parcel), (DeliveryCode) parcel.readParcelable(EvropolisGiftArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final EvropolisGiftArgs[] newArray(int i13) {
            return new EvropolisGiftArgs[i13];
        }
    }

    public EvropolisGiftArgs(EvropolisGift gift, DeliveryCode deliveryCode) {
        zdlpuopuiu.btonecajqb(gift, "gift");
        this.gift = gift;
        this.deliveryCode = deliveryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvropolisGiftArgs)) {
            return false;
        }
        EvropolisGiftArgs evropolisGiftArgs = (EvropolisGiftArgs) other;
        return zdlpuopuiu.eablkybsjg(this.gift, evropolisGiftArgs.gift) && this.deliveryCode == evropolisGiftArgs.deliveryCode;
    }

    public int hashCode() {
        int iHashCode = this.gift.hashCode() * 31;
        DeliveryCode deliveryCode = this.deliveryCode;
        return iHashCode + (deliveryCode == null ? 0 : deliveryCode.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final EvropolisGift getGift() {
        return this.gift;
    }

    public String toString() {
        return "EvropolisGiftArgs(gift=" + this.gift + ", deliveryCode=" + this.deliveryCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.gift.writeToParcel(dest, flags);
        dest.writeParcelable(this.deliveryCode, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final DeliveryCode getDeliveryCode() {
        return this.deliveryCode;
    }
}
