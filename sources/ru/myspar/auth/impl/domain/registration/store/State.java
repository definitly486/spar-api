package ru.myspar.auth.impl.domain.registration.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthorizationFlowResult;

/* JADX INFO: renamed from: ru.myspar.auth.impl.domain.registration.store.RegistrationStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\"H\u0007¢\u0006\u0004\b'\u0010(J\u008e\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\bHÇ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\"H×\u0001¢\u0006\u0004\b.\u0010(J\u001a\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H×\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b6\u0010-R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u0010-R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010-R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bE\u0010-R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u00104\u001a\u0004\bG\u0010-R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010-R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bL\u0010=\u001a\u0004\b9\u0010?R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\bM\u0010?R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bJ\u0010?R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bN\u0010=\u001a\u0004\bO\u0010?R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bP\u0010?R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bQ\u0010=\u001a\u0004\bR\u0010?R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\bS\u0010?R\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bT\u0010=\u001a\u0004\bU\u0010?R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\bV\u0010?R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bW\u0010=\u001a\u0004\bL\u0010?R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bX\u00104\u001a\u0004\bN\u0010-R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bK\u0010Y\u001a\u0004\bQ\u0010ZR\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b[\u0010?¨\u0006\\"}, d2 = {"ru/myspar/auth/impl/domain/registration/store/RegistrationStore$State", "Landroid/os/Parcelable;", "", "smsCode", "firstName", "lastName", "gender", "birthDate", "", "isCardActivateNeeded", "cardNumber", "isPolicyAccepted", "sharePromo", "phoneNumber", Scopes.EMAIL, "smsCodeError", "firstNameError", "lastNameError", "genderError", "birthDateError", "cardNumberError", "cardNumberIsVisible", "cardOptionsIsVisible", "cardExistCaptionIsVisible", "cardRegistrationCaptionIsVisible", "hasPromo", "loymaxToken", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "result", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZZLjava/lang/String;Lru/myspar/auth/api/model/AuthorizationFlowResult;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/auth/impl/domain/registration/store/RegistrationStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZZZLjava/lang/String;Lru/myspar/auth/api/model/AuthorizationFlowResult;Z)Lru/myspar/auth/impl/domain/registration/store/RegistrationStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "cllcsxoeiz", "yggfygwlhe", "jyumaefscl", "lmojexxdyd", "iwizpuwonk", "esjtqupxsv", "cqumvgiudr", "eablkybsjg", "Z", "kegysxyocb", "()Z", "lereixgezr", "nufgyqmvbu", "pmvmpeiblj", "sopmlzcsov", "zynmafqrjb", "jpowsppfya", "istkbnxepw", "pkzmftpjix", "cdpycssgdh", "oxmwwwfdhm", "yadqdtsiqt", "stevsuqkhv", "iozdgvuglv", "wwaezpbzkn", "ylkuphrtab", "gxszxtbevo", "dxjokdxxww", "hcddaimhww", "btonecajqb", "gtknphoqwx", "hkdspvbjdz", "lqeggnwhkg", "wflxmlrfwp", "dsvhmnatus", "wypolnanlu", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "()Lru/myspar/auth/api/model/AuthorizationFlowResult;", "tzroggbefp", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cardRegistrationCaptionIsVisible;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthDate;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasPromo;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCardActivateNeeded;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cardNumberIsVisible;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cardExistCaptionIsVisible;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean firstNameError;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gender;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cardOptionsIsVisible;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardNumber;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean lastNameError;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cardNumberError;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPolicyAccepted;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuthorizationFlowResult result;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean genderError;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String loymaxToken;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean smsCodeError;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean birthDateError;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String smsCode;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sharePromo;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.registration.store.RegistrationStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (AuthorizationFlowResult) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String smsCode, String firstName, String lastName, String gender, String birthDate, boolean z13, String cardNumber, boolean z14, String sharePromo, String phoneNumber, String email, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, String str, AuthorizationFlowResult authorizationFlowResult, boolean z29) {
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(birthDate, "birthDate");
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(sharePromo, "sharePromo");
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(email, "email");
        this.smsCode = smsCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.isCardActivateNeeded = z13;
        this.cardNumber = cardNumber;
        this.isPolicyAccepted = z14;
        this.sharePromo = sharePromo;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.smsCodeError = z15;
        this.firstNameError = z16;
        this.lastNameError = z17;
        this.genderError = z18;
        this.birthDateError = z19;
        this.cardNumberError = z23;
        this.cardNumberIsVisible = z24;
        this.cardOptionsIsVisible = z25;
        this.cardExistCaptionIsVisible = z26;
        this.cardRegistrationCaptionIsVisible = z27;
        this.hasPromo = z28;
        this.loymaxToken = str;
        this.result = authorizationFlowResult;
        this.isLoading = z29;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getCardNumberIsVisible() {
        return this.cardNumberIsVisible;
    }

    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public final String getSmsCode() {
        return this.smsCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getCardNumberError() {
        return this.cardNumberError;
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
        return zdlpuopuiu.eablkybsjg(this.smsCode, state.smsCode) && zdlpuopuiu.eablkybsjg(this.firstName, state.firstName) && zdlpuopuiu.eablkybsjg(this.lastName, state.lastName) && zdlpuopuiu.eablkybsjg(this.gender, state.gender) && zdlpuopuiu.eablkybsjg(this.birthDate, state.birthDate) && this.isCardActivateNeeded == state.isCardActivateNeeded && zdlpuopuiu.eablkybsjg(this.cardNumber, state.cardNumber) && this.isPolicyAccepted == state.isPolicyAccepted && zdlpuopuiu.eablkybsjg(this.sharePromo, state.sharePromo) && zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && zdlpuopuiu.eablkybsjg(this.email, state.email) && this.smsCodeError == state.smsCodeError && this.firstNameError == state.firstNameError && this.lastNameError == state.lastNameError && this.genderError == state.genderError && this.birthDateError == state.birthDateError && this.cardNumberError == state.cardNumberError && this.cardNumberIsVisible == state.cardNumberIsVisible && this.cardOptionsIsVisible == state.cardOptionsIsVisible && this.cardExistCaptionIsVisible == state.cardExistCaptionIsVisible && this.cardRegistrationCaptionIsVisible == state.cardRegistrationCaptionIsVisible && this.hasPromo == state.hasPromo && zdlpuopuiu.eablkybsjg(this.loymaxToken, state.loymaxToken) && zdlpuopuiu.eablkybsjg(this.result, state.result) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getCardOptionsIsVisible() {
        return this.cardOptionsIsVisible;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getBirthDateError() {
        return this.birthDateError;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((this.smsCode.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.birthDate.hashCode()) * 31) + Boolean.hashCode(this.isCardActivateNeeded)) * 31) + this.cardNumber.hashCode()) * 31) + Boolean.hashCode(this.isPolicyAccepted)) * 31) + this.sharePromo.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + Boolean.hashCode(this.smsCodeError)) * 31) + Boolean.hashCode(this.firstNameError)) * 31) + Boolean.hashCode(this.lastNameError)) * 31) + Boolean.hashCode(this.genderError)) * 31) + Boolean.hashCode(this.birthDateError)) * 31) + Boolean.hashCode(this.cardNumberError)) * 31) + Boolean.hashCode(this.cardNumberIsVisible)) * 31) + Boolean.hashCode(this.cardOptionsIsVisible)) * 31) + Boolean.hashCode(this.cardExistCaptionIsVisible)) * 31) + Boolean.hashCode(this.cardRegistrationCaptionIsVisible)) * 31) + Boolean.hashCode(this.hasPromo)) * 31;
        String str = this.loymaxToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AuthorizationFlowResult authorizationFlowResult = this.result;
        return ((iHashCode2 + (authorizationFlowResult != null ? authorizationFlowResult.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: hcddaimhww, reason: from getter */
    public final AuthorizationFlowResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final boolean getHasPromo() {
        return this.hasPromo;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final boolean getFirstNameError() {
        return this.firstNameError;
    }

    /* JADX INFO: renamed from: jpowsppfya, reason: from getter */
    public final String getSharePromo() {
        return this.sharePromo;
    }

    /* JADX INFO: renamed from: kegysxyocb, reason: from getter */
    public final boolean getIsCardActivateNeeded() {
        return this.isCardActivateNeeded;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getCardExistCaptionIsVisible() {
        return this.cardExistCaptionIsVisible;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: sopmlzcsov, reason: from getter */
    public final boolean getIsPolicyAccepted() {
        return this.isPolicyAccepted;
    }

    /* JADX INFO: renamed from: stevsuqkhv, reason: from getter */
    public final boolean getSmsCodeError() {
        return this.smsCodeError;
    }

    public String toString() {
        return "State(smsCode=" + this.smsCode + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", gender=" + this.gender + ", birthDate=" + this.birthDate + ", isCardActivateNeeded=" + this.isCardActivateNeeded + ", cardNumber=" + this.cardNumber + ", isPolicyAccepted=" + this.isPolicyAccepted + ", sharePromo=" + this.sharePromo + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", smsCodeError=" + this.smsCodeError + ", firstNameError=" + this.firstNameError + ", lastNameError=" + this.lastNameError + ", genderError=" + this.genderError + ", birthDateError=" + this.birthDateError + ", cardNumberError=" + this.cardNumberError + ", cardNumberIsVisible=" + this.cardNumberIsVisible + ", cardOptionsIsVisible=" + this.cardOptionsIsVisible + ", cardExistCaptionIsVisible=" + this.cardExistCaptionIsVisible + ", cardRegistrationCaptionIsVisible=" + this.cardRegistrationCaptionIsVisible + ", hasPromo=" + this.hasPromo + ", loymaxToken=" + this.loymaxToken + ", result=" + this.result + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: tzroggbefp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getCardRegistrationCaptionIsVisible() {
        return this.cardRegistrationCaptionIsVisible;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.smsCode);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.gender);
        dest.writeString(this.birthDate);
        dest.writeInt(this.isCardActivateNeeded ? 1 : 0);
        dest.writeString(this.cardNumber);
        dest.writeInt(this.isPolicyAccepted ? 1 : 0);
        dest.writeString(this.sharePromo);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.email);
        dest.writeInt(this.smsCodeError ? 1 : 0);
        dest.writeInt(this.firstNameError ? 1 : 0);
        dest.writeInt(this.lastNameError ? 1 : 0);
        dest.writeInt(this.genderError ? 1 : 0);
        dest.writeInt(this.birthDateError ? 1 : 0);
        dest.writeInt(this.cardNumberError ? 1 : 0);
        dest.writeInt(this.cardNumberIsVisible ? 1 : 0);
        dest.writeInt(this.cardOptionsIsVisible ? 1 : 0);
        dest.writeInt(this.cardExistCaptionIsVisible ? 1 : 0);
        dest.writeInt(this.cardRegistrationCaptionIsVisible ? 1 : 0);
        dest.writeInt(this.hasPromo ? 1 : 0);
        dest.writeString(this.loymaxToken);
        dest.writeParcelable(this.result, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final boolean getLastNameError() {
        return this.lastNameError;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getGenderError() {
        return this.genderError;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final String getLoymaxToken() {
        return this.loymaxToken;
    }

    public final State zoijcleaow(String smsCode, String firstName, String lastName, String gender, String birthDate, boolean isCardActivateNeeded, String cardNumber, boolean isPolicyAccepted, String sharePromo, String phoneNumber, String email, boolean smsCodeError, boolean firstNameError, boolean lastNameError, boolean genderError, boolean birthDateError, boolean cardNumberError, boolean cardNumberIsVisible, boolean cardOptionsIsVisible, boolean cardExistCaptionIsVisible, boolean cardRegistrationCaptionIsVisible, boolean hasPromo, String loymaxToken, AuthorizationFlowResult result, boolean isLoading) {
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(birthDate, "birthDate");
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        zdlpuopuiu.btonecajqb(sharePromo, "sharePromo");
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(email, "email");
        return new State(smsCode, firstName, lastName, gender, birthDate, isCardActivateNeeded, cardNumber, isPolicyAccepted, sharePromo, phoneNumber, email, smsCodeError, firstNameError, lastNameError, genderError, birthDateError, cardNumberError, cardNumberIsVisible, cardOptionsIsVisible, cardExistCaptionIsVisible, cardRegistrationCaptionIsVisible, hasPromo, loymaxToken, result, isLoading);
    }

    public /* synthetic */ State(String str, String str2, String str3, String str4, String str5, boolean z13, String str6, boolean z14, String str7, String str8, String str9, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, String str10, AuthorizationFlowResult authorizationFlowResult, boolean z29, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? "" : str6, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z14, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "" : str7, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? "" : str8, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str9, (i13 & 2048) != 0 ? false : z15, (i13 & 4096) != 0 ? false : z16, (i13 & 8192) != 0 ? false : z17, (i13 & 16384) != 0 ? false : z18, (32768 & i13) != 0 ? false : z19, (65536 & i13) != 0 ? false : z23, (131072 & i13) != 0 ? false : z24, (262144 & i13) != 0 ? false : z25, (524288 & i13) != 0 ? false : z26, (1048576 & i13) != 0 ? false : z27, (2097152 & i13) != 0 ? false : z28, (4194304 & i13) != 0 ? null : str10, authorizationFlowResult, (i13 & 16777216) != 0 ? false : z29);
    }
}
