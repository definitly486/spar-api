package ru.myspar.domain.feature.personaldata.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.domain.feature.personaldata.store.PersonalDataStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ¦\u0001\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H×\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010#R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b,\u0010#R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010#R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\b2\u0010/R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\bA\u0010/R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bC\u0010/R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bB\u0010/R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bD\u0010/¨\u0006F"}, d2 = {"ru/myspar/domain/feature/personaldata/store/PersonalDataStore$State", "Landroid/os/Parcelable;", "", "currentEmail", "", "isEmailConfirmed", "phone", "birthDate", "cardNumber", "Lb10/iobyxmoadg;", "gender", "firstName", "lastName", Scopes.EMAIL, "firstNameError", "lastNameError", "emailError", "genderError", "isEmailVerified", "isLoading", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb10/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/personaldata/store/PersonalDataStore$State;", "zoijcleaow", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb10/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZ)Lru/myspar/domain/feature/personaldata/store/PersonalDataStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "Z", "yadqdtsiqt", "()Z", "jyumaefscl", "esjtqupxsv", "iwizpuwonk", "eablkybsjg", "cqumvgiudr", "gxszxtbevo", "Lb10/iobyxmoadg;", "wflxmlrfwp", "()Lb10/iobyxmoadg;", "lereixgezr", "btonecajqb", "pmvmpeiblj", "zynmafqrjb", "nufgyqmvbu", "istkbnxepw", "gtknphoqwx", "cdpycssgdh", "dxjokdxxww", "iozdgvuglv", "oxmwwwfdhm", "lmojexxdyd", "wwaezpbzkn", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean lastNameError;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final b10.iobyxmoadg gender;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean genderError;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean firstNameError;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthDate;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailVerified;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean emailError;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailConfirmed;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentEmail;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.personaldata.store.PersonalDataStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), b10.iobyxmoadg.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String currentEmail, boolean z13, String phone, String birthDate, String cardNumber, b10.iobyxmoadg gender, String firstName, String lastName, String email, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        zdlpuopuiu.btonecajqb(currentEmail, "currentEmail");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(birthDate, "birthDate");
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(email, "email");
        this.currentEmail = currentEmail;
        this.isEmailConfirmed = z13;
        this.phone = phone;
        this.birthDate = birthDate;
        this.cardNumber = cardNumber;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.firstNameError = z14;
        this.lastNameError = z15;
        this.emailError = z16;
        this.genderError = z17;
        this.isEmailVerified = z18;
        this.isLoading = z19;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getEmailError() {
        return this.emailError;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.currentEmail, state.currentEmail) && this.isEmailConfirmed == state.isEmailConfirmed && zdlpuopuiu.eablkybsjg(this.phone, state.phone) && zdlpuopuiu.eablkybsjg(this.birthDate, state.birthDate) && zdlpuopuiu.eablkybsjg(this.cardNumber, state.cardNumber) && this.gender == state.gender && zdlpuopuiu.eablkybsjg(this.firstName, state.firstName) && zdlpuopuiu.eablkybsjg(this.lastName, state.lastName) && zdlpuopuiu.eablkybsjg(this.email, state.email) && this.firstNameError == state.firstNameError && this.lastNameError == state.lastNameError && this.emailError == state.emailError && this.genderError == state.genderError && this.isEmailVerified == state.isEmailVerified && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getFirstNameError() {
        return this.firstNameError;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.currentEmail.hashCode() * 31) + Boolean.hashCode(this.isEmailConfirmed)) * 31) + this.phone.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + Boolean.hashCode(this.firstNameError)) * 31) + Boolean.hashCode(this.lastNameError)) * 31) + Boolean.hashCode(this.emailError)) * 31) + Boolean.hashCode(this.genderError)) * 31) + Boolean.hashCode(this.isEmailVerified)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getLastNameError() {
        return this.lastNameError;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getCurrentEmail() {
        return this.currentEmail;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getGenderError() {
        return this.genderError;
    }

    public String toString() {
        return "State(currentEmail=" + this.currentEmail + ", isEmailConfirmed=" + this.isEmailConfirmed + ", phone=" + this.phone + ", birthDate=" + this.birthDate + ", cardNumber=" + this.cardNumber + ", gender=" + this.gender + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", firstNameError=" + this.firstNameError + ", lastNameError=" + this.lastNameError + ", emailError=" + this.emailError + ", genderError=" + this.genderError + ", isEmailVerified=" + this.isEmailVerified + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final b10.iobyxmoadg getGender() {
        return this.gender;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.currentEmail);
        dest.writeInt(this.isEmailConfirmed ? 1 : 0);
        dest.writeString(this.phone);
        dest.writeString(this.birthDate);
        dest.writeString(this.cardNumber);
        dest.writeString(this.gender.name());
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.email);
        dest.writeInt(this.firstNameError ? 1 : 0);
        dest.writeInt(this.lastNameError ? 1 : 0);
        dest.writeInt(this.emailError ? 1 : 0);
        dest.writeInt(this.genderError ? 1 : 0);
        dest.writeInt(this.isEmailVerified ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final State zoijcleaow(String currentEmail, boolean isEmailConfirmed, String phone, String birthDate, String cardNumber, b10.iobyxmoadg gender, String firstName, String lastName, String email, boolean firstNameError, boolean lastNameError, boolean emailError, boolean genderError, boolean isEmailVerified, boolean isLoading) {
        zdlpuopuiu.btonecajqb(currentEmail, "currentEmail");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(birthDate, "birthDate");
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(email, "email");
        return new State(currentEmail, isEmailConfirmed, phone, birthDate, cardNumber, gender, firstName, lastName, email, firstNameError, lastNameError, emailError, genderError, isEmailVerified, isLoading);
    }

    public /* synthetic */ State(String str, boolean z13, String str2, String str3, String str4, b10.iobyxmoadg iobyxmoadgVar, String str5, String str6, String str7, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? "" : str4, (i13 & 32) != 0 ? b10.iobyxmoadg.NONE : iobyxmoadgVar, (i13 & 64) != 0 ? "" : str5, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str6, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str7 : "", (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z14, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z15, (i13 & 2048) != 0 ? false : z16, (i13 & 4096) != 0 ? false : z17, (i13 & 8192) != 0 ? true : z18, (i13 & 16384) == 0 ? z19 : false);
    }
}
