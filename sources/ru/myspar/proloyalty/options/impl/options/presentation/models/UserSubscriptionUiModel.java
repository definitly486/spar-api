package ru.myspar.proloyalty.options.impl.options.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import b21.ppxfxbqfkf;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Lru/myspar/proloyalty/options/impl/options/presentation/models/UserSubscriptionUiModel;", "Lb21/ppxfxbqfkf;", "Landroid/os/Parcelable;", "", "itemId", "subscriptionName", "", "isSettingSelected", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "eablkybsjg", "(Ljava/lang/String;Ljava/lang/String;ZZ)Lru/myspar/proloyalty/options/impl/options/presentation/models/UserSubscriptionUiModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getItemId", "yggfygwlhe", "dxjokdxxww", "jyumaefscl", "Z", "btonecajqb", "()Z", "iwizpuwonk", "nufgyqmvbu", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserSubscriptionUiModel implements ppxfxbqfkf, Parcelable {
    public static final Parcelable.Creator<UserSubscriptionUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSettingSelected;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionName;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserSubscriptionUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserSubscriptionUiModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserSubscriptionUiModel[] newArray(int i13) {
            return new UserSubscriptionUiModel[i13];
        }
    }

    public UserSubscriptionUiModel(String itemId, String subscriptionName, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(subscriptionName, "subscriptionName");
        this.itemId = itemId;
        this.subscriptionName = subscriptionName;
        this.isSettingSelected = z13;
        this.enabled = z14;
    }

    public static /* synthetic */ UserSubscriptionUiModel lqeggnwhkg(UserSubscriptionUiModel userSubscriptionUiModel, String str, String str2, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userSubscriptionUiModel.itemId;
        }
        if ((i13 & 2) != 0) {
            str2 = userSubscriptionUiModel.subscriptionName;
        }
        if ((i13 & 4) != 0) {
            z13 = userSubscriptionUiModel.isSettingSelected;
        }
        if ((i13 & 8) != 0) {
            z14 = userSubscriptionUiModel.enabled;
        }
        return userSubscriptionUiModel.eablkybsjg(str, str2, z13, z14);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsSettingSelected() {
        return this.isSettingSelected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getSubscriptionName() {
        return this.subscriptionName;
    }

    public final UserSubscriptionUiModel eablkybsjg(String itemId, String subscriptionName, boolean isSettingSelected, boolean enabled) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(subscriptionName, "subscriptionName");
        return new UserSubscriptionUiModel(itemId, subscriptionName, isSettingSelected, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSubscriptionUiModel)) {
            return false;
        }
        UserSubscriptionUiModel userSubscriptionUiModel = (UserSubscriptionUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.itemId, userSubscriptionUiModel.itemId) && zdlpuopuiu.eablkybsjg(this.subscriptionName, userSubscriptionUiModel.subscriptionName) && this.isSettingSelected == userSubscriptionUiModel.isSettingSelected && this.enabled == userSubscriptionUiModel.enabled;
    }

    @Override // b21.ppxfxbqfkf
    public String getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        return (((((this.itemId.hashCode() * 31) + this.subscriptionName.hashCode()) * 31) + Boolean.hashCode(this.isSettingSelected)) * 31) + Boolean.hashCode(this.enabled);
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public String toString() {
        return "UserSubscriptionUiModel(itemId=" + this.itemId + ", subscriptionName=" + this.subscriptionName + ", isSettingSelected=" + this.isSettingSelected + ", enabled=" + this.enabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.itemId);
        dest.writeString(this.subscriptionName);
        dest.writeInt(this.isSettingSelected ? 1 : 0);
        dest.writeInt(this.enabled ? 1 : 0);
    }
}
