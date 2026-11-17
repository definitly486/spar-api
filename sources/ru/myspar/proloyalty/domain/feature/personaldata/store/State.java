package ru.myspar.proloyalty.domain.feature.personaldata.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lr0.zoijcleaow;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.InputError;

/* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.personaldata.store.PersonalDataStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 J¬\u0001\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001aH×\u0001¢\u0006\u0004\b&\u0010 J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H×\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010%R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b2\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\b.\u0010BR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bF\u0010HR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\b7\u0010HR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bJ\u0010HR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bI\u0010H¨\u0006L"}, d2 = {"ru/myspar/proloyalty/domain/feature/personaldata/store/PersonalDataStore$State", "Landroid/os/Parcelable;", "", "currentEmail", "phone", "birthDate", "cardNumber", "Llr0/zoijcleaow;", "gender", "Lp0/tzroggbefp;", "firstName", "lastName", Scopes.EMAIL, "Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;", "firstNameError", "lastNameError", "emailError", "", "isEmailVerified", "isEmailConfirmed", "isSavingDataLoading", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llr0/zoijcleaow;Lp0/tzroggbefp;Lp0/tzroggbefp;Lp0/tzroggbefp;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;ZZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/domain/feature/personaldata/store/PersonalDataStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llr0/zoijcleaow;Lp0/tzroggbefp;Lp0/tzroggbefp;Lp0/tzroggbefp;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;ZZZZ)Lru/myspar/proloyalty/domain/feature/personaldata/store/PersonalDataStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "iwizpuwonk", "jyumaefscl", "eablkybsjg", "gxszxtbevo", "cqumvgiudr", "Llr0/zoijcleaow;", "wflxmlrfwp", "()Llr0/zoijcleaow;", "esjtqupxsv", "Lp0/tzroggbefp;", "btonecajqb", "()Lp0/tzroggbefp;", "lereixgezr", "oxmwwwfdhm", "pmvmpeiblj", "nufgyqmvbu", "zynmafqrjb", "Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;", "gtknphoqwx", "()Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;", "istkbnxepw", "cdpycssgdh", "dxjokdxxww", "yadqdtsiqt", "Z", "()Z", "iozdgvuglv", "lmojexxdyd", "wwaezpbzkn", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputError emailError;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow gender;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp firstName;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailConfirmed;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputError lastNameError;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthDate;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp lastName;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSavingDataLoading;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp email;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailVerified;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currentEmail;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputError firstNameError;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f95526ylkuphrtab = InputError.f95345zdlpuopuiu;
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.personaldata.store.PersonalDataStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            zoijcleaow zoijcleaowVarValueOf = zoijcleaow.valueOf(parcel.readString());
            yr0.iobyxmoadg iobyxmoadgVar = yr0.iobyxmoadg.f126300iobyxmoadg;
            return new State(string, string2, string3, string4, zoijcleaowVarValueOf, iobyxmoadgVar.iobyxmoadg(parcel), iobyxmoadgVar.iobyxmoadg(parcel), iobyxmoadgVar.iobyxmoadg(parcel), (InputError) parcel.readParcelable(State.class.getClassLoader()), (InputError) parcel.readParcelable(State.class.getClassLoader()), (InputError) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String currentEmail, String phone, String birthDate, String cardNumber, zoijcleaow gender, tzroggbefp firstName, tzroggbefp lastName, tzroggbefp email, InputError inputError, InputError inputError2, InputError inputError3, boolean z13, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(currentEmail, "currentEmail");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(birthDate, "birthDate");
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(email, "email");
        this.currentEmail = currentEmail;
        this.phone = phone;
        this.birthDate = birthDate;
        this.cardNumber = cardNumber;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.firstNameError = inputError;
        this.lastNameError = inputError2;
        this.emailError = inputError3;
        this.isEmailVerified = z13;
        this.isEmailConfirmed = z14;
        this.isSavingDataLoading = z15;
        this.isLoading = z16;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final tzroggbefp getFirstName() {
        return this.firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final InputError getEmailError() {
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
        return zdlpuopuiu.eablkybsjg(this.currentEmail, state.currentEmail) && zdlpuopuiu.eablkybsjg(this.phone, state.phone) && zdlpuopuiu.eablkybsjg(this.birthDate, state.birthDate) && zdlpuopuiu.eablkybsjg(this.cardNumber, state.cardNumber) && this.gender == state.gender && zdlpuopuiu.eablkybsjg(this.firstName, state.firstName) && zdlpuopuiu.eablkybsjg(this.lastName, state.lastName) && zdlpuopuiu.eablkybsjg(this.email, state.email) && zdlpuopuiu.eablkybsjg(this.firstNameError, state.firstNameError) && zdlpuopuiu.eablkybsjg(this.lastNameError, state.lastNameError) && zdlpuopuiu.eablkybsjg(this.emailError, state.emailError) && this.isEmailVerified == state.isEmailVerified && this.isEmailConfirmed == state.isEmailConfirmed && this.isSavingDataLoading == state.isSavingDataLoading && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsEmailConfirmed() {
        return this.isEmailConfirmed;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final InputError getFirstNameError() {
        return this.firstNameError;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.currentEmail.hashCode() * 31) + this.phone.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31;
        InputError inputError = this.firstNameError;
        int iHashCode2 = (iHashCode + (inputError == null ? 0 : inputError.hashCode())) * 31;
        InputError inputError2 = this.lastNameError;
        int iHashCode3 = (iHashCode2 + (inputError2 == null ? 0 : inputError2.hashCode())) * 31;
        InputError inputError3 = this.emailError;
        return ((((((((iHashCode3 + (inputError3 != null ? inputError3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEmailVerified)) * 31) + Boolean.hashCode(this.isEmailConfirmed)) * 31) + Boolean.hashCode(this.isSavingDataLoading)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final boolean getIsSavingDataLoading() {
        return this.isSavingDataLoading;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getCurrentEmail() {
        return this.currentEmail;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final tzroggbefp getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final tzroggbefp getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "State(currentEmail=" + this.currentEmail + ", phone=" + this.phone + ", birthDate=" + this.birthDate + ", cardNumber=" + this.cardNumber + ", gender=" + this.gender + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", firstNameError=" + this.firstNameError + ", lastNameError=" + this.lastNameError + ", emailError=" + this.emailError + ", isEmailVerified=" + this.isEmailVerified + ", isEmailConfirmed=" + this.isEmailConfirmed + ", isSavingDataLoading=" + this.isSavingDataLoading + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final zoijcleaow getGender() {
        return this.gender;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.currentEmail);
        dest.writeString(this.phone);
        dest.writeString(this.birthDate);
        dest.writeString(this.cardNumber);
        dest.writeString(this.gender.name());
        yr0.iobyxmoadg iobyxmoadgVar = yr0.iobyxmoadg.f126300iobyxmoadg;
        iobyxmoadgVar.zoijcleaow(this.firstName, dest, flags);
        iobyxmoadgVar.zoijcleaow(this.lastName, dest, flags);
        iobyxmoadgVar.zoijcleaow(this.email, dest, flags);
        dest.writeParcelable(this.firstNameError, flags);
        dest.writeParcelable(this.lastNameError, flags);
        dest.writeParcelable(this.emailError, flags);
        dest.writeInt(this.isEmailVerified ? 1 : 0);
        dest.writeInt(this.isEmailConfirmed ? 1 : 0);
        dest.writeInt(this.isSavingDataLoading ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final InputError getLastNameError() {
        return this.lastNameError;
    }

    public final State zoijcleaow(String currentEmail, String phone, String birthDate, String cardNumber, zoijcleaow gender, tzroggbefp firstName, tzroggbefp lastName, tzroggbefp email, InputError firstNameError, InputError lastNameError, InputError emailError, boolean isEmailVerified, boolean isEmailConfirmed, boolean isSavingDataLoading, boolean isLoading) {
        zdlpuopuiu.btonecajqb(currentEmail, "currentEmail");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(birthDate, "birthDate");
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(email, "email");
        return new State(currentEmail, phone, birthDate, cardNumber, gender, firstName, lastName, email, firstNameError, lastNameError, emailError, isEmailVerified, isEmailConfirmed, isSavingDataLoading, isLoading);
    }

    public /* synthetic */ State(String str, String str2, String str3, String str4, zoijcleaow zoijcleaowVar, tzroggbefp tzroggbefpVar, tzroggbefp tzroggbefpVar2, tzroggbefp tzroggbefpVar3, InputError inputError, InputError inputError2, InputError inputError3, boolean z13, boolean z14, boolean z15, boolean z16, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) == 0 ? str4 : "", (i13 & 16) != 0 ? zoijcleaow.NONE : zoijcleaowVar, (i13 & 32) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 64) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar3, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : inputError, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : inputError2, (i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? inputError3 : null, (i13 & 2048) != 0 ? true : z13, (i13 & 4096) != 0 ? false : z14, (i13 & 8192) != 0 ? false : z15, (i13 & 16384) == 0 ? z16 : false);
    }
}
