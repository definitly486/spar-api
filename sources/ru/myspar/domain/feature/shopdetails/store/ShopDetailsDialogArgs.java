package ru.myspar.domain.feature.shopdetails.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0012¨\u0006'"}, d2 = {"Lru/myspar/domain/feature/shopdetails/store/ShopDetailsDialogArgs;", "Landroid/os/Parcelable;", "", "dialogTitle", "", "shopType", "shopAddress", "shopOpeningHours", "btnAcceptText", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "I", "ppxfxbqfkf", "yggfygwlhe", "Ljava/lang/String;", "lqeggnwhkg", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "zoijcleaow", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShopDetailsDialogArgs implements Parcelable {
    public static final Parcelable.Creator<ShopDetailsDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int btnAcceptText;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopOpeningHours;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopAddress;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopType;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dialogTitle;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ShopDetailsDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ShopDetailsDialogArgs(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ShopDetailsDialogArgs[] newArray(int i13) {
            return new ShopDetailsDialogArgs[i13];
        }
    }

    public ShopDetailsDialogArgs(int i13, String str, String shopAddress, String shopOpeningHours, int i14) {
        zdlpuopuiu.btonecajqb(shopAddress, "shopAddress");
        zdlpuopuiu.btonecajqb(shopOpeningHours, "shopOpeningHours");
        this.dialogTitle = i13;
        this.shopType = str;
        this.shopAddress = shopAddress;
        this.shopOpeningHours = shopOpeningHours;
        this.btnAcceptText = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getShopAddress() {
        return this.shopAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopDetailsDialogArgs)) {
            return false;
        }
        ShopDetailsDialogArgs shopDetailsDialogArgs = (ShopDetailsDialogArgs) other;
        return this.dialogTitle == shopDetailsDialogArgs.dialogTitle && zdlpuopuiu.eablkybsjg(this.shopType, shopDetailsDialogArgs.shopType) && zdlpuopuiu.eablkybsjg(this.shopAddress, shopDetailsDialogArgs.shopAddress) && zdlpuopuiu.eablkybsjg(this.shopOpeningHours, shopDetailsDialogArgs.shopOpeningHours) && this.btnAcceptText == shopDetailsDialogArgs.btnAcceptText;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getShopOpeningHours() {
        return this.shopOpeningHours;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.dialogTitle) * 31;
        String str = this.shopType;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.shopAddress.hashCode()) * 31) + this.shopOpeningHours.hashCode()) * 31) + Integer.hashCode(this.btnAcceptText);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getShopType() {
        return this.shopType;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final int getDialogTitle() {
        return this.dialogTitle;
    }

    public String toString() {
        return "ShopDetailsDialogArgs(dialogTitle=" + this.dialogTitle + ", shopType=" + this.shopType + ", shopAddress=" + this.shopAddress + ", shopOpeningHours=" + this.shopOpeningHours + ", btnAcceptText=" + this.btnAcceptText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.dialogTitle);
        dest.writeString(this.shopType);
        dest.writeString(this.shopAddress);
        dest.writeString(this.shopOpeningHours);
        dest.writeInt(this.btnAcceptText);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final int getBtnAcceptText() {
        return this.btnAcceptText;
    }
}
