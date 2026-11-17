package ru.myspar.proloyalty.user.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/user/domain/model/UserSubscriptionSetting;", "Landroid/os/Parcelable;", "", "id", "", "isActive", ExternalMetricsManagerImpl.NAME, "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;ZLjava/lang/String;)Lru/myspar/proloyalty/user/domain/model/UserSubscriptionSetting;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "Z", "eablkybsjg", "()Z", "jyumaefscl", "getName", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserSubscriptionSetting implements Parcelable {
    public static final Parcelable.Creator<UserSubscriptionSetting> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserSubscriptionSetting createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserSubscriptionSetting(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserSubscriptionSetting[] newArray(int i13) {
            return new UserSubscriptionSetting[i13];
        }
    }

    public UserSubscriptionSetting(String id2, boolean z13, String name) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        this.id = id2;
        this.isActive = z13;
        this.name = name;
    }

    public static /* synthetic */ UserSubscriptionSetting ppxfxbqfkf(UserSubscriptionSetting userSubscriptionSetting, String str, boolean z13, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userSubscriptionSetting.id;
        }
        if ((i13 & 2) != 0) {
            z13 = userSubscriptionSetting.isActive;
        }
        if ((i13 & 4) != 0) {
            str2 = userSubscriptionSetting.name;
        }
        return userSubscriptionSetting.zoijcleaow(str, z13, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSubscriptionSetting)) {
            return false;
        }
        UserSubscriptionSetting userSubscriptionSetting = (UserSubscriptionSetting) other;
        return zdlpuopuiu.eablkybsjg(this.id, userSubscriptionSetting.id) && this.isActive == userSubscriptionSetting.isActive && zdlpuopuiu.eablkybsjg(this.name, userSubscriptionSetting.name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "UserSubscriptionSetting(id=" + this.id + ", isActive=" + this.isActive + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeString(this.name);
    }

    public final UserSubscriptionSetting zoijcleaow(String id2, boolean isActive, String name) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(name, "name");
        return new UserSubscriptionSetting(id2, isActive, name);
    }
}
