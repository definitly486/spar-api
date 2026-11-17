package spay.sdk.domain.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lspay/sdk/domain/model/response/UserInfo;", "Landroid/os/Parcelable;", "", "lastName", "firstName", "", "gender", "mobilePhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lspay/sdk/domain/model/response/UserInfo;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLastName", "getFirstName", "Ljava/lang/Integer;", "getGender", "getMobilePhone", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();
    private final String firstName;
    private final Integer gender;
    private final String lastName;
    private final String mobilePhone;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserInfo> {
        @Override // android.os.Parcelable.Creator
        public final UserInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserInfo[] newArray(int i13) {
            return new UserInfo[i13];
        }
    }

    public UserInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, Integer num, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userInfo.lastName;
        }
        if ((i13 & 2) != 0) {
            str2 = userInfo.firstName;
        }
        if ((i13 & 4) != 0) {
            num = userInfo.gender;
        }
        if ((i13 & 8) != 0) {
            str3 = userInfo.mobilePhone;
        }
        return userInfo.copy(str, str2, num, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public final UserInfo copy(String lastName, String firstName, Integer gender, String mobilePhone) {
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        return new UserInfo(lastName, firstName, gender, mobilePhone);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return zdlpuopuiu.eablkybsjg(this.lastName, userInfo.lastName) && zdlpuopuiu.eablkybsjg(this.firstName, userInfo.firstName) && zdlpuopuiu.eablkybsjg(this.gender, userInfo.gender) && zdlpuopuiu.eablkybsjg(this.mobilePhone, userInfo.mobilePhone);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public int hashCode() {
        int iIobyxmoadg = xg.iobyxmoadg(this.firstName, this.lastName.hashCode() * 31, 31);
        Integer num = this.gender;
        int iHashCode = (iIobyxmoadg + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.mobilePhone;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "UserInfo(lastName=" + this.lastName + ", firstName=" + this.firstName + ", gender=" + this.gender + ", mobilePhone=" + this.mobilePhone + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int iIntValue;
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.lastName);
        parcel.writeString(this.firstName);
        Integer num = this.gender;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.mobilePhone);
    }

    public UserInfo(String lastName, String firstName, Integer num, String str) {
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = num;
        this.mobilePhone = str;
    }

    public /* synthetic */ UserInfo(String str, String str2, Integer num, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "-1" : str, (i13 & 2) != 0 ? "-1" : str2, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : str3);
    }
}
