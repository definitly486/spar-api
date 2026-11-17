package ru.myspar.proloyalty.domain.feature.rateorder.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0014¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/domain/feature/rateorder/model/RateOrderDialogArgs;", "Landroid/os/Parcelable;", "", "id", ExternalMetricsManagerImpl.DATE, "address", "totalPriceInt", "totalPriceFractional", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "ppxfxbqfkf", "jyumaefscl", "zoijcleaow", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "eablkybsjg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RateOrderDialogArgs implements Parcelable {
    public static final Parcelable.Creator<RateOrderDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceFractional;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String totalPriceInt;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final RateOrderDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new RateOrderDialogArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final RateOrderDialogArgs[] newArray(int i13) {
            return new RateOrderDialogArgs[i13];
        }
    }

    public RateOrderDialogArgs(String id2, String date, String address, String totalPriceInt, String totalPriceFractional) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(totalPriceInt, "totalPriceInt");
        zdlpuopuiu.btonecajqb(totalPriceFractional, "totalPriceFractional");
        this.id = id2;
        this.date = date;
        this.address = address;
        this.totalPriceInt = totalPriceInt;
        this.totalPriceFractional = totalPriceFractional;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getTotalPriceFractional() {
        return this.totalPriceFractional;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateOrderDialogArgs)) {
            return false;
        }
        RateOrderDialogArgs rateOrderDialogArgs = (RateOrderDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.id, rateOrderDialogArgs.id) && zdlpuopuiu.eablkybsjg(this.date, rateOrderDialogArgs.date) && zdlpuopuiu.eablkybsjg(this.address, rateOrderDialogArgs.address) && zdlpuopuiu.eablkybsjg(this.totalPriceInt, rateOrderDialogArgs.totalPriceInt) && zdlpuopuiu.eablkybsjg(this.totalPriceFractional, rateOrderDialogArgs.totalPriceFractional);
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getTotalPriceInt() {
        return this.totalPriceInt;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.date.hashCode()) * 31) + this.address.hashCode()) * 31) + this.totalPriceInt.hashCode()) * 31) + this.totalPriceFractional.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public String toString() {
        return "RateOrderDialogArgs(id=" + this.id + ", date=" + this.date + ", address=" + this.address + ", totalPriceInt=" + this.totalPriceInt + ", totalPriceFractional=" + this.totalPriceFractional + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.date);
        dest.writeString(this.address);
        dest.writeString(this.totalPriceInt);
        dest.writeString(this.totalPriceFractional);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAddress() {
        return this.address;
    }
}
