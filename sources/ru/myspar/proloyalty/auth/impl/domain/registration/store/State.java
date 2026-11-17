package ru.myspar.proloyalty.auth.impl.domain.registration.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.l;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lr0.zoijcleaow;
import p0.tzroggbefp;
import ru.myspar.proloyalty.core.ui.compose.components.text_fields.text_field_with_error_state.InputError;
import ru.myspar.proloyalty.user.domain.model.TokenInfo;

/* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.registration.store.RegistrationStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u009a\u0001\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H×\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0019H×\u0001¢\u0006\u0004\b&\u0010\u001fJ\u001a\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'H×\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b/\u00106R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b3\u00106R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010DR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\b8\u0010DR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"ru/myspar/proloyalty/auth/impl/domain/registration/store/RegistrationStore$State", "Landroid/os/Parcelable;", "Lp0/tzroggbefp;", Scopes.EMAIL, "firstName", "lastName", "Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;", "emailError", "isFirstNameError", "isLastNameError", "Ljava/util/Date;", "birthDate", "Llr0/zoijcleaow;", "gender", "", "sharePromoChecked", "isPolicyAccepted", "showExitDialog", "isLoading", "Lru/myspar/proloyalty/user/domain/model/TokenInfo;", "tokenInfo", "<init>", "(Lp0/tzroggbefp;Lp0/tzroggbefp;Lp0/tzroggbefp;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Ljava/util/Date;Llr0/zoijcleaow;ZZZZLru/myspar/proloyalty/user/domain/model/TokenInfo;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/auth/impl/domain/registration/store/RegistrationStore$State;", "zoijcleaow", "(Lp0/tzroggbefp;Lp0/tzroggbefp;Lp0/tzroggbefp;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;Ljava/util/Date;Llr0/zoijcleaow;ZZZZLru/myspar/proloyalty/user/domain/model/TokenInfo;)Lru/myspar/proloyalty/auth/impl/domain/registration/store/RegistrationStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lp0/tzroggbefp;", "gxszxtbevo", "()Lp0/tzroggbefp;", "yggfygwlhe", "nufgyqmvbu", "jyumaefscl", "btonecajqb", "iwizpuwonk", "Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;", "lqeggnwhkg", "()Lru/myspar/proloyalty/core/ui/compose/components/text_fields/text_field_with_error_state/InputError;", "cqumvgiudr", "esjtqupxsv", "lereixgezr", "Ljava/util/Date;", "eablkybsjg", "()Ljava/util/Date;", "pmvmpeiblj", "Llr0/zoijcleaow;", "dxjokdxxww", "()Llr0/zoijcleaow;", "zynmafqrjb", "Z", "gtknphoqwx", "()Z", "istkbnxepw", "yadqdtsiqt", "cdpycssgdh", "wflxmlrfwp", "iozdgvuglv", "Lru/myspar/proloyalty/user/domain/model/TokenInfo;", "oxmwwwfdhm", "()Lru/myspar/proloyalty/user/domain/model/TokenInfo;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showExitDialog;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputError isFirstNameError;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputError isLastNameError;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final TokenInfo tokenInfo;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPolicyAccepted;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final InputError emailError;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp lastName;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date birthDate;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow gender;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp firstName;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp email;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sharePromoChecked;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.registration.store.RegistrationStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            yr0.iobyxmoadg iobyxmoadgVar = yr0.iobyxmoadg.f126300iobyxmoadg;
            return new State(iobyxmoadgVar.iobyxmoadg(parcel), iobyxmoadgVar.iobyxmoadg(parcel), iobyxmoadgVar.iobyxmoadg(parcel), (InputError) parcel.readParcelable(State.class.getClassLoader()), (InputError) parcel.readParcelable(State.class.getClassLoader()), (InputError) parcel.readParcelable(State.class.getClassLoader()), (Date) parcel.readSerializable(), zoijcleaow.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (TokenInfo) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(tzroggbefp email, tzroggbefp firstName, tzroggbefp lastName, InputError inputError, InputError inputError2, InputError inputError3, Date date, zoijcleaow gender, boolean z13, boolean z14, boolean z15, boolean z16, TokenInfo tokenInfo) {
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(tokenInfo, "tokenInfo");
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailError = inputError;
        this.isFirstNameError = inputError2;
        this.isLastNameError = inputError3;
        this.birthDate = date;
        this.gender = gender;
        this.sharePromoChecked = z13;
        this.isPolicyAccepted = z14;
        this.showExitDialog = z15;
        this.isLoading = z16;
        this.tokenInfo = tokenInfo;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final tzroggbefp getLastName() {
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
    public final Date getBirthDate() {
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
        return zdlpuopuiu.eablkybsjg(this.email, state.email) && zdlpuopuiu.eablkybsjg(this.firstName, state.firstName) && zdlpuopuiu.eablkybsjg(this.lastName, state.lastName) && zdlpuopuiu.eablkybsjg(this.emailError, state.emailError) && zdlpuopuiu.eablkybsjg(this.isFirstNameError, state.isFirstNameError) && zdlpuopuiu.eablkybsjg(this.isLastNameError, state.isLastNameError) && zdlpuopuiu.eablkybsjg(this.birthDate, state.birthDate) && this.gender == state.gender && this.sharePromoChecked == state.sharePromoChecked && this.isPolicyAccepted == state.isPolicyAccepted && this.showExitDialog == state.showExitDialog && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.tokenInfo, state.tokenInfo);
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getSharePromoChecked() {
        return this.sharePromoChecked;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final tzroggbefp getEmail() {
        return this.email;
    }

    public int hashCode() {
        int iHashCode = ((((this.email.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31;
        InputError inputError = this.emailError;
        int iHashCode2 = (iHashCode + (inputError == null ? 0 : inputError.hashCode())) * 31;
        InputError inputError2 = this.isFirstNameError;
        int iHashCode3 = (iHashCode2 + (inputError2 == null ? 0 : inputError2.hashCode())) * 31;
        InputError inputError3 = this.isLastNameError;
        int iHashCode4 = (iHashCode3 + (inputError3 == null ? 0 : inputError3.hashCode())) * 31;
        Date date = this.birthDate;
        return ((((((((((((iHashCode4 + (date != null ? date.hashCode() : 0)) * 31) + this.gender.hashCode()) * 31) + Boolean.hashCode(this.sharePromoChecked)) * 31) + Boolean.hashCode(this.isPolicyAccepted)) * 31) + Boolean.hashCode(this.showExitDialog)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.tokenInfo.hashCode();
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final InputError getIsLastNameError() {
        return this.isLastNameError;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final InputError getEmailError() {
        return this.emailError;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final tzroggbefp getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public String toString() {
        return "State(email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailError=" + this.emailError + ", isFirstNameError=" + this.isFirstNameError + ", isLastNameError=" + this.isLastNameError + ", birthDate=" + this.birthDate + ", gender=" + this.gender + ", sharePromoChecked=" + this.sharePromoChecked + ", isPolicyAccepted=" + this.isPolicyAccepted + ", showExitDialog=" + this.showExitDialog + ", isLoading=" + this.isLoading + ", tokenInfo=" + this.tokenInfo + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getShowExitDialog() {
        return this.showExitDialog;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        yr0.iobyxmoadg iobyxmoadgVar = yr0.iobyxmoadg.f126300iobyxmoadg;
        iobyxmoadgVar.zoijcleaow(this.email, dest, flags);
        iobyxmoadgVar.zoijcleaow(this.firstName, dest, flags);
        iobyxmoadgVar.zoijcleaow(this.lastName, dest, flags);
        dest.writeParcelable(this.emailError, flags);
        dest.writeParcelable(this.isFirstNameError, flags);
        dest.writeParcelable(this.isLastNameError, flags);
        dest.writeSerializable(this.birthDate);
        dest.writeString(this.gender.name());
        dest.writeInt(this.sharePromoChecked ? 1 : 0);
        dest.writeInt(this.isPolicyAccepted ? 1 : 0);
        dest.writeInt(this.showExitDialog ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeParcelable(this.tokenInfo, flags);
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final boolean getIsPolicyAccepted() {
        return this.isPolicyAccepted;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final InputError getIsFirstNameError() {
        return this.isFirstNameError;
    }

    public final State zoijcleaow(tzroggbefp email, tzroggbefp firstName, tzroggbefp lastName, InputError emailError, InputError isFirstNameError, InputError isLastNameError, Date birthDate, zoijcleaow gender, boolean sharePromoChecked, boolean isPolicyAccepted, boolean showExitDialog, boolean isLoading, TokenInfo tokenInfo) {
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(gender, "gender");
        zdlpuopuiu.btonecajqb(tokenInfo, "tokenInfo");
        return new State(email, firstName, lastName, emailError, isFirstNameError, isLastNameError, birthDate, gender, sharePromoChecked, isPolicyAccepted, showExitDialog, isLoading, tokenInfo);
    }

    public /* synthetic */ State(tzroggbefp tzroggbefpVar, tzroggbefp tzroggbefpVar2, tzroggbefp tzroggbefpVar3, InputError inputError, InputError inputError2, InputError inputError3, Date date, zoijcleaow zoijcleaowVar, boolean z13, boolean z14, boolean z15, boolean z16, TokenInfo tokenInfo, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 2) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar2, (i13 & 4) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar3, (i13 & 8) != 0 ? null : inputError, (i13 & 16) != 0 ? null : inputError2, (i13 & 32) != 0 ? null : inputError3, (i13 & 64) != 0 ? null : date, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? zoijcleaow.NONE : zoijcleaowVar, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z13, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z14, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z15, (i13 & 2048) != 0 ? false : z16, tokenInfo);
    }
}
