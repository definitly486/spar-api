package ru.myspar.proloyalty.core.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/core/domain/MeasureParamsUiModel;", "Landroid/os/Parcelable;", "", "basketDefault", "minAvailable", "ratio", "<init>", "(DDD)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "D", "getBasketDefault", "()D", "yggfygwlhe", "getMinAvailable", "jyumaefscl", "getRatio", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MeasureParamsUiModel implements Parcelable {
    public static final Parcelable.Creator<MeasureParamsUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final double ratio;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final double minAvailable;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final double basketDefault;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final MeasureParamsUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new MeasureParamsUiModel(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final MeasureParamsUiModel[] newArray(int i13) {
            return new MeasureParamsUiModel[i13];
        }
    }

    public MeasureParamsUiModel(double d13, double d14, double d15) {
        this.basketDefault = d13;
        this.minAvailable = d14;
        this.ratio = d15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasureParamsUiModel)) {
            return false;
        }
        MeasureParamsUiModel measureParamsUiModel = (MeasureParamsUiModel) other;
        return Double.compare(this.basketDefault, measureParamsUiModel.basketDefault) == 0 && Double.compare(this.minAvailable, measureParamsUiModel.minAvailable) == 0 && Double.compare(this.ratio, measureParamsUiModel.ratio) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.basketDefault) * 31) + Double.hashCode(this.minAvailable)) * 31) + Double.hashCode(this.ratio);
    }

    public String toString() {
        return "MeasureParamsUiModel(basketDefault=" + this.basketDefault + ", minAvailable=" + this.minAvailable + ", ratio=" + this.ratio + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeDouble(this.basketDefault);
        dest.writeDouble(this.minAvailable);
        dest.writeDouble(this.ratio);
    }
}
