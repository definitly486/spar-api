package ru.myspar.common.view.product.model.cart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH×\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/myspar/common/view/product/model/cart/AvailableIntervalUiModel;", "Landroid/os/Parcelable;", "", "fromTime", "toTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "yggfygwlhe", "ppxfxbqfkf", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AvailableIntervalUiModel implements Parcelable {
    public static final Parcelable.Creator<AvailableIntervalUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String toTime;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fromTime;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AvailableIntervalUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AvailableIntervalUiModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AvailableIntervalUiModel[] newArray(int i13) {
            return new AvailableIntervalUiModel[i13];
        }
    }

    public AvailableIntervalUiModel(String fromTime, String toTime) {
        zdlpuopuiu.btonecajqb(fromTime, "fromTime");
        zdlpuopuiu.btonecajqb(toTime, "toTime");
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableIntervalUiModel)) {
            return false;
        }
        AvailableIntervalUiModel availableIntervalUiModel = (AvailableIntervalUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.fromTime, availableIntervalUiModel.fromTime) && zdlpuopuiu.eablkybsjg(this.toTime, availableIntervalUiModel.toTime);
    }

    public int hashCode() {
        return (this.fromTime.hashCode() * 31) + this.toTime.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getToTime() {
        return this.toTime;
    }

    public String toString() {
        return "AvailableIntervalUiModel(fromTime=" + this.fromTime + ", toTime=" + this.toTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.fromTime);
        dest.writeString(this.toTime);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getFromTime() {
        return this.fromTime;
    }
}
