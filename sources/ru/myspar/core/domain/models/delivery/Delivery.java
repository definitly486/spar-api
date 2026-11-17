package ru.myspar.core.domain.models.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import hg.agtfadlqog;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import ru.myspar.core.models.delivery.DeliveryCode;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010\u001a¨\u00061"}, d2 = {"Lru/myspar/core/domain/models/delivery/Delivery;", "Landroid/os/Parcelable;", "Lru/myspar/core/models/delivery/DeliveryCode;", "code", "", "title", ExternalMetricsManagerImpl.DATE, "hours", "phone", "address", "postamatCode", "<init>", "(Lru/myspar/core/models/delivery/DeliveryCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "btonecajqb", "()Z", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/models/delivery/DeliveryCode;", "ppxfxbqfkf", "()Lru/myspar/core/models/delivery/DeliveryCode;", "yggfygwlhe", "Ljava/lang/String;", "dxjokdxxww", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "lqeggnwhkg", "esjtqupxsv", "zoijcleaow", "lereixgezr", "nufgyqmvbu", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Delivery implements Parcelable {
    public static final Parcelable.Creator<Delivery> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hours;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postamatCode;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryCode code;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Delivery createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new Delivery((DeliveryCode) parcel.readParcelable(Delivery.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final Delivery[] newArray(int i13) {
            return new Delivery[i13];
        }
    }

    public Delivery(DeliveryCode deliveryCode, String title, String date, String hours, String phone, String address, String postamatCode) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(date, "date");
        zdlpuopuiu.btonecajqb(hours, "hours");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(address, "address");
        zdlpuopuiu.btonecajqb(postamatCode, "postamatCode");
        this.code = deliveryCode;
        this.title = title;
        this.date = date;
        this.hours = hours;
        this.phone = phone;
        this.address = address;
        this.postamatCode = postamatCode;
    }

    public final boolean btonecajqb() {
        return !agtfadlqog.okpsazkaxt(new DeliveryCode[]{DeliveryCode.SUBSCRIPTION}, this.code);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Delivery)) {
            return false;
        }
        Delivery delivery = (Delivery) other;
        return this.code == delivery.code && zdlpuopuiu.eablkybsjg(this.title, delivery.title) && zdlpuopuiu.eablkybsjg(this.date, delivery.date) && zdlpuopuiu.eablkybsjg(this.hours, delivery.hours) && zdlpuopuiu.eablkybsjg(this.phone, delivery.phone) && zdlpuopuiu.eablkybsjg(this.address, delivery.address) && zdlpuopuiu.eablkybsjg(this.postamatCode, delivery.postamatCode);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getHours() {
        return this.hours;
    }

    public int hashCode() {
        DeliveryCode deliveryCode = this.code;
        return ((((((((((((deliveryCode == null ? 0 : deliveryCode.hashCode()) * 31) + this.title.hashCode()) * 31) + this.date.hashCode()) * 31) + this.hours.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.address.hashCode()) * 31) + this.postamatCode.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getPostamatCode() {
        return this.postamatCode;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final DeliveryCode getCode() {
        return this.code;
    }

    public String toString() {
        return "Delivery(code=" + this.code + ", title=" + this.title + ", date=" + this.date + ", hours=" + this.hours + ", phone=" + this.phone + ", address=" + this.address + ", postamatCode=" + this.postamatCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.code, flags);
        dest.writeString(this.title);
        dest.writeString(this.date);
        dest.writeString(this.hours);
        dest.writeString(this.phone);
        dest.writeString(this.address);
        dest.writeString(this.postamatCode);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public /* synthetic */ Delivery(DeliveryCode deliveryCode, String str, String str2, String str3, String str4, String str5, String str6, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : deliveryCode, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? "" : str5, (i13 & 64) == 0 ? str6 : "");
    }
}
