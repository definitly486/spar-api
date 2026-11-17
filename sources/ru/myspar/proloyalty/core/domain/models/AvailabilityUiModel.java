package ru.myspar.proloyalty.core.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0004\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000b¨\u0006%"}, d2 = {"Lru/myspar/proloyalty/core/domain/models/AvailabilityUiModel;", "Landroid/os/Parcelable;", "", "isAvailableToBuy", "isAvailable", "", "availableToBuyMessage", "notAvailableToBuyMessage", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "gxszxtbevo", "()Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "eablkybsjg", "()Z", "yggfygwlhe", "jyumaefscl", "Ljava/lang/String;", "zoijcleaow", "iwizpuwonk", "ppxfxbqfkf", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AvailabilityUiModel implements Parcelable {
    public static final Parcelable.Creator<AvailabilityUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String notAvailableToBuyMessage;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String availableToBuyMessage;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailable;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailableToBuy;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AvailabilityUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AvailabilityUiModel(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AvailabilityUiModel[] newArray(int i13) {
            return new AvailabilityUiModel[i13];
        }
    }

    public AvailabilityUiModel(boolean z13, boolean z14, String availableToBuyMessage, String notAvailableToBuyMessage) {
        zdlpuopuiu.btonecajqb(availableToBuyMessage, "availableToBuyMessage");
        zdlpuopuiu.btonecajqb(notAvailableToBuyMessage, "notAvailableToBuyMessage");
        this.isAvailableToBuy = z13;
        this.isAvailable = z14;
        this.availableToBuyMessage = availableToBuyMessage;
        this.notAvailableToBuyMessage = notAvailableToBuyMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsAvailableToBuy() {
        return this.isAvailableToBuy;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailabilityUiModel)) {
            return false;
        }
        AvailabilityUiModel availabilityUiModel = (AvailabilityUiModel) other;
        return this.isAvailableToBuy == availabilityUiModel.isAvailableToBuy && this.isAvailable == availabilityUiModel.isAvailable && zdlpuopuiu.eablkybsjg(this.availableToBuyMessage, availabilityUiModel.availableToBuyMessage) && zdlpuopuiu.eablkybsjg(this.notAvailableToBuyMessage, availabilityUiModel.notAvailableToBuyMessage);
    }

    public final String gxszxtbevo() {
        return this.isAvailableToBuy ? this.availableToBuyMessage : this.notAvailableToBuyMessage;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isAvailableToBuy) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + this.availableToBuyMessage.hashCode()) * 31) + this.notAvailableToBuyMessage.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getNotAvailableToBuyMessage() {
        return this.notAvailableToBuyMessage;
    }

    public String toString() {
        return "AvailabilityUiModel(isAvailableToBuy=" + this.isAvailableToBuy + ", isAvailable=" + this.isAvailable + ", availableToBuyMessage=" + this.availableToBuyMessage + ", notAvailableToBuyMessage=" + this.notAvailableToBuyMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isAvailableToBuy ? 1 : 0);
        dest.writeInt(this.isAvailable ? 1 : 0);
        dest.writeString(this.availableToBuyMessage);
        dest.writeString(this.notAvailableToBuyMessage);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAvailableToBuyMessage() {
        return this.availableToBuyMessage;
    }
}
