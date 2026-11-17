package ru.myspar.options.impl.options.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import w30.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003H×\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)¨\u0006."}, d2 = {"Lru/myspar/options/impl/options/presentation/models/UserSubscriptionUiModel;", "Lw30/ppxfxbqfkf;", "Landroid/os/Parcelable;", "", "itemId", "subscriptionName", "expirationDate", "", "isSettingSelected", "autoRenewalEnabled", "isEnabledForChange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "eablkybsjg", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lru/myspar/options/impl/options/presentation/models/UserSubscriptionUiModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getItemId", "yggfygwlhe", "dxjokdxxww", "jyumaefscl", "getExpirationDate", "iwizpuwonk", "Z", "gtknphoqwx", "()Z", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "btonecajqb", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserSubscriptionUiModel implements ppxfxbqfkf, Parcelable {
    public static final Parcelable.Creator<UserSubscriptionUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoRenewalEnabled;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabledForChange;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSettingSelected;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionName;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserSubscriptionUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserSubscriptionUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserSubscriptionUiModel[] newArray(int i13) {
            return new UserSubscriptionUiModel[i13];
        }
    }

    public UserSubscriptionUiModel(String itemId, String subscriptionName, String expirationDate, boolean z13, boolean z14, boolean z15) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(subscriptionName, "subscriptionName");
        zdlpuopuiu.btonecajqb(expirationDate, "expirationDate");
        this.itemId = itemId;
        this.subscriptionName = subscriptionName;
        this.expirationDate = expirationDate;
        this.isSettingSelected = z13;
        this.autoRenewalEnabled = z14;
        this.isEnabledForChange = z15;
    }

    public static /* synthetic */ UserSubscriptionUiModel lqeggnwhkg(UserSubscriptionUiModel userSubscriptionUiModel, String str, String str2, String str3, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userSubscriptionUiModel.itemId;
        }
        if ((i13 & 2) != 0) {
            str2 = userSubscriptionUiModel.subscriptionName;
        }
        String str4 = str2;
        if ((i13 & 4) != 0) {
            str3 = userSubscriptionUiModel.expirationDate;
        }
        String str5 = str3;
        if ((i13 & 8) != 0) {
            z13 = userSubscriptionUiModel.isSettingSelected;
        }
        boolean z16 = z13;
        if ((i13 & 16) != 0) {
            z14 = userSubscriptionUiModel.autoRenewalEnabled;
        }
        boolean z17 = z14;
        if ((i13 & 32) != 0) {
            z15 = userSubscriptionUiModel.isEnabledForChange;
        }
        return userSubscriptionUiModel.eablkybsjg(str, str4, str5, z16, z17, z15);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsEnabledForChange() {
        return this.isEnabledForChange;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getSubscriptionName() {
        return this.subscriptionName;
    }

    public final UserSubscriptionUiModel eablkybsjg(String itemId, String subscriptionName, String expirationDate, boolean isSettingSelected, boolean autoRenewalEnabled, boolean isEnabledForChange) {
        zdlpuopuiu.btonecajqb(itemId, "itemId");
        zdlpuopuiu.btonecajqb(subscriptionName, "subscriptionName");
        zdlpuopuiu.btonecajqb(expirationDate, "expirationDate");
        return new UserSubscriptionUiModel(itemId, subscriptionName, expirationDate, isSettingSelected, autoRenewalEnabled, isEnabledForChange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSubscriptionUiModel)) {
            return false;
        }
        UserSubscriptionUiModel userSubscriptionUiModel = (UserSubscriptionUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.itemId, userSubscriptionUiModel.itemId) && zdlpuopuiu.eablkybsjg(this.subscriptionName, userSubscriptionUiModel.subscriptionName) && zdlpuopuiu.eablkybsjg(this.expirationDate, userSubscriptionUiModel.expirationDate) && this.isSettingSelected == userSubscriptionUiModel.isSettingSelected && this.autoRenewalEnabled == userSubscriptionUiModel.autoRenewalEnabled && this.isEnabledForChange == userSubscriptionUiModel.isEnabledForChange;
    }

    @Override // w30.ppxfxbqfkf
    public String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsSettingSelected() {
        return this.isSettingSelected;
    }

    public int hashCode() {
        return (((((((((this.itemId.hashCode() * 31) + this.subscriptionName.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + Boolean.hashCode(this.isSettingSelected)) * 31) + Boolean.hashCode(this.autoRenewalEnabled)) * 31) + Boolean.hashCode(this.isEnabledForChange);
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getAutoRenewalEnabled() {
        return this.autoRenewalEnabled;
    }

    public String toString() {
        return "UserSubscriptionUiModel(itemId=" + this.itemId + ", subscriptionName=" + this.subscriptionName + ", expirationDate=" + this.expirationDate + ", isSettingSelected=" + this.isSettingSelected + ", autoRenewalEnabled=" + this.autoRenewalEnabled + ", isEnabledForChange=" + this.isEnabledForChange + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.itemId);
        dest.writeString(this.subscriptionName);
        dest.writeString(this.expirationDate);
        dest.writeInt(this.isSettingSelected ? 1 : 0);
        dest.writeInt(this.autoRenewalEnabled ? 1 : 0);
        dest.writeInt(this.isEnabledForChange ? 1 : 0);
    }

    public /* synthetic */ UserSubscriptionUiModel(String str, String str2, String str3, boolean z13, boolean z14, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, z13, z14, (i13 & 32) != 0 ? true : z15);
    }
}
