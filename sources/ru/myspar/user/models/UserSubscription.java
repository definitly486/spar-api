package ru.myspar.user.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"Lru/myspar/user/models/UserSubscription;", "Landroid/os/Parcelable;", "", "subscriptionId", "subscriptionName", "expirationDate", "", "autoRenewal", "autoRenewalEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Z", "zoijcleaow", "()Z", "cqumvgiudr", "ppxfxbqfkf", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserSubscription implements Parcelable {
    public static final Parcelable.Creator<UserSubscription> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoRenewalEnabled;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoRenewal;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionName;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserSubscription createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserSubscription(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserSubscription[] newArray(int i13) {
            return new UserSubscription[i13];
        }
    }

    public UserSubscription(String subscriptionId, String subscriptionName, String expirationDate, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(subscriptionId, "subscriptionId");
        zdlpuopuiu.btonecajqb(subscriptionName, "subscriptionName");
        zdlpuopuiu.btonecajqb(expirationDate, "expirationDate");
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
        this.expirationDate = expirationDate;
        this.autoRenewal = z13;
        this.autoRenewalEnabled = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSubscription)) {
            return false;
        }
        UserSubscription userSubscription = (UserSubscription) other;
        return zdlpuopuiu.eablkybsjg(this.subscriptionId, userSubscription.subscriptionId) && zdlpuopuiu.eablkybsjg(this.subscriptionName, userSubscription.subscriptionName) && zdlpuopuiu.eablkybsjg(this.expirationDate, userSubscription.expirationDate) && this.autoRenewal == userSubscription.autoRenewal && this.autoRenewalEnabled == userSubscription.autoRenewalEnabled;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public int hashCode() {
        return (((((((this.subscriptionId.hashCode() * 31) + this.subscriptionName.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + Boolean.hashCode(this.autoRenewal)) * 31) + Boolean.hashCode(this.autoRenewalEnabled);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getSubscriptionName() {
        return this.subscriptionName;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final boolean getAutoRenewalEnabled() {
        return this.autoRenewalEnabled;
    }

    public String toString() {
        return "UserSubscription(subscriptionId=" + this.subscriptionId + ", subscriptionName=" + this.subscriptionName + ", expirationDate=" + this.expirationDate + ", autoRenewal=" + this.autoRenewal + ", autoRenewalEnabled=" + this.autoRenewalEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.subscriptionId);
        dest.writeString(this.subscriptionName);
        dest.writeString(this.expirationDate);
        dest.writeInt(this.autoRenewal ? 1 : 0);
        dest.writeInt(this.autoRenewalEnabled ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getAutoRenewal() {
        return this.autoRenewal;
    }
}
