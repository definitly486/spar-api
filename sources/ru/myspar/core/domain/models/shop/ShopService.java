package ru.myspar.core.domain.models.shop;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/myspar/core/domain/models/shop/ShopService;", "Landroid/os/Parcelable;", "", ExternalMetricsManagerImpl.NAME, "icon", "pic", "", "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/myspar/core/domain/models/shop/ShopService;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getName", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "Z", "lqeggnwhkg", "()Z", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShopService implements Parcelable {
    public static final Parcelable.Creator<ShopService> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChecked;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pic;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String icon;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ShopService createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ShopService(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ShopService[] newArray(int i13) {
            return new ShopService[i13];
        }
    }

    public ShopService(String name, String icon, String pic, boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(pic, "pic");
        this.name = name;
        this.icon = icon;
        this.pic = pic;
        this.isChecked = z13;
    }

    public static /* synthetic */ ShopService ppxfxbqfkf(ShopService shopService, String str, String str2, String str3, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shopService.name;
        }
        if ((i13 & 2) != 0) {
            str2 = shopService.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = shopService.pic;
        }
        if ((i13 & 8) != 0) {
            z13 = shopService.isChecked;
        }
        return shopService.zoijcleaow(str, str2, str3, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopService)) {
            return false;
        }
        ShopService shopService = (ShopService) other;
        return zdlpuopuiu.eablkybsjg(this.name, shopService.name) && zdlpuopuiu.eablkybsjg(this.icon, shopService.icon) && zdlpuopuiu.eablkybsjg(this.pic, shopService.pic) && this.isChecked == shopService.isChecked;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.icon.hashCode()) * 31) + this.pic.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public String toString() {
        return "ShopService(name=" + this.name + ", icon=" + this.icon + ", pic=" + this.pic + ", isChecked=" + this.isChecked + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.icon);
        dest.writeString(this.pic);
        dest.writeInt(this.isChecked ? 1 : 0);
    }

    public final ShopService zoijcleaow(String name, String icon, String pic, boolean isChecked) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(icon, "icon");
        zdlpuopuiu.btonecajqb(pic, "pic");
        return new ShopService(name, icon, pic, isChecked);
    }

    public /* synthetic */ ShopService(String str, String str2, String str3, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z13);
    }
}
