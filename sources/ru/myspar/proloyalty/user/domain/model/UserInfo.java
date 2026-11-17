package ru.myspar.proloyalty.user.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lr0.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\"\u0010\u001fJ\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b*\u00104R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b.\u00104R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u00104R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\bC\u0010!R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010!R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010(\u001a\u0004\bG\u0010!R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\b2\u00104¨\u0006I"}, d2 = {"Lru/myspar/proloyalty/user/domain/model/UserInfo;", "Landroid/os/Parcelable;", "", "id", "phone", Scopes.EMAIL, "firstName", "lastName", "", "isActive", "isCardBlocked", "agreementAccepted", "Llr0/zoijcleaow;", "gender", "Ljava/time/LocalDate;", "dateBirth", "scangoAccess", "gameToken", "webviewToken", "cardNumber", "isEReceiptAccepted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLlr0/zoijcleaow;Ljava/time/LocalDate;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "gtknphoqwx", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "lqeggnwhkg", "cqumvgiudr", "btonecajqb", "esjtqupxsv", "Z", "()Z", "lereixgezr", "pmvmpeiblj", "zoijcleaow", "zynmafqrjb", "Llr0/zoijcleaow;", "dxjokdxxww", "()Llr0/zoijcleaow;", "istkbnxepw", "Ljava/time/LocalDate;", "eablkybsjg", "()Ljava/time/LocalDate;", "cdpycssgdh", "wflxmlrfwp", "yadqdtsiqt", "nufgyqmvbu", "iozdgvuglv", "oxmwwwfdhm", "lmojexxdyd", "ppxfxbqfkf", "wwaezpbzkn", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scangoAccess;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webviewToken;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate dateBirth;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCardBlocked;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean agreementAccepted;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEReceiptAccepted;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gameToken;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow gender;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final UserInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new UserInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, zoijcleaow.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final UserInfo[] newArray(int i13) {
            return new UserInfo[i13];
        }
    }

    public UserInfo(String id2, String phone, String email, String firstName, String lastName, boolean z13, boolean z14, boolean z15, zoijcleaow gender, LocalDate localDate, boolean z16, String gameToken, String webviewToken, String cardNumber, boolean z17) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(gameToken, "gameToken");
        zdlpuopuiu.btonecajqb(webviewToken, "webviewToken");
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        this.id = id2;
        this.phone = phone;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = z13;
        this.isCardBlocked = z14;
        this.agreementAccepted = z15;
        this.gender = gender;
        this.dateBirth = localDate;
        this.scangoAccess = z16;
        this.gameToken = gameToken;
        this.webviewToken = webviewToken;
        this.cardNumber = cardNumber;
        this.isEReceiptAccepted = z17;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final zoijcleaow getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final LocalDate getDateBirth() {
        return this.dateBirth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return zdlpuopuiu.eablkybsjg(this.id, userInfo.id) && zdlpuopuiu.eablkybsjg(this.phone, userInfo.phone) && zdlpuopuiu.eablkybsjg(this.email, userInfo.email) && zdlpuopuiu.eablkybsjg(this.firstName, userInfo.firstName) && zdlpuopuiu.eablkybsjg(this.lastName, userInfo.lastName) && this.isActive == userInfo.isActive && this.isCardBlocked == userInfo.isCardBlocked && this.agreementAccepted == userInfo.agreementAccepted && this.gender == userInfo.gender && zdlpuopuiu.eablkybsjg(this.dateBirth, userInfo.dateBirth) && this.scangoAccess == userInfo.scangoAccess && zdlpuopuiu.eablkybsjg(this.gameToken, userInfo.gameToken) && zdlpuopuiu.eablkybsjg(this.webviewToken, userInfo.webviewToken) && zdlpuopuiu.eablkybsjg(this.cardNumber, userInfo.cardNumber) && this.isEReceiptAccepted == userInfo.isEReceiptAccepted;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsEReceiptAccepted() {
        return this.isEReceiptAccepted;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.isCardBlocked)) * 31) + Boolean.hashCode(this.agreementAccepted)) * 31) + this.gender.hashCode()) * 31;
        LocalDate localDate = this.dateBirth;
        return ((((((((((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + Boolean.hashCode(this.scangoAccess)) * 31) + this.gameToken.hashCode()) * 31) + this.webviewToken.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + Boolean.hashCode(this.isEReceiptAccepted);
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getIsCardBlocked() {
        return this.isCardBlocked;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getGameToken() {
        return this.gameToken;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getWebviewToken() {
        return this.webviewToken;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public String toString() {
        return "UserInfo(id=" + this.id + ", phone=" + this.phone + ", email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", isActive=" + this.isActive + ", isCardBlocked=" + this.isCardBlocked + ", agreementAccepted=" + this.agreementAccepted + ", gender=" + this.gender + ", dateBirth=" + this.dateBirth + ", scangoAccess=" + this.scangoAccess + ", gameToken=" + this.gameToken + ", webviewToken=" + this.webviewToken + ", cardNumber=" + this.cardNumber + ", isEReceiptAccepted=" + this.isEReceiptAccepted + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getScangoAccess() {
        return this.scangoAccess;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.phone);
        dest.writeString(this.email);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeInt(this.isCardBlocked ? 1 : 0);
        dest.writeInt(this.agreementAccepted ? 1 : 0);
        dest.writeString(this.gender.name());
        dest.writeSerializable(this.dateBirth);
        dest.writeInt(this.scangoAccess ? 1 : 0);
        dest.writeString(this.gameToken);
        dest.writeString(this.webviewToken);
        dest.writeString(this.cardNumber);
        dest.writeInt(this.isEReceiptAccepted ? 1 : 0);
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getAgreementAccepted() {
        return this.agreementAccepted;
    }
}
