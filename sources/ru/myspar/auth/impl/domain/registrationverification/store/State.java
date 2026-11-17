package ru.myspar.auth.impl.domain.registrationverification.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthorizationFlowResult;
import t10.ppxfxbqfkf;

/* JADX INFO: renamed from: ru.myspar.auth.impl.domain.registrationverification.store.RegistrationVerificationStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH×\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)¨\u00064"}, d2 = {"ru/myspar/auth/impl/domain/registrationverification/store/RegistrationVerificationStore$State", "Landroid/os/Parcelable;", "", "phoneNumber", Scopes.EMAIL, "", "phoneNumberErrorIsVisible", "Lt10/ppxfxbqfkf;", "emailError", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "result", "isLoading", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLt10/ppxfxbqfkf;Lru/myspar/auth/api/model/AuthorizationFlowResult;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/auth/impl/domain/registrationverification/store/RegistrationVerificationStore$State;", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;ZLt10/ppxfxbqfkf;Lru/myspar/auth/api/model/AuthorizationFlowResult;Z)Lru/myspar/auth/impl/domain/registrationverification/store/RegistrationVerificationStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "lqeggnwhkg", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "Z", "nufgyqmvbu", "()Z", "iwizpuwonk", "Lt10/ppxfxbqfkf;", "gxszxtbevo", "()Lt10/ppxfxbqfkf;", "cqumvgiudr", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "dxjokdxxww", "()Lru/myspar/auth/api/model/AuthorizationFlowResult;", "esjtqupxsv", "btonecajqb", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuthorizationFlowResult result;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf emailError;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean phoneNumberErrorIsVisible;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.registrationverification.store.RegistrationVerificationStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readInt() != 0, ppxfxbqfkf.valueOf(parcel.readString()), (AuthorizationFlowResult) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String phoneNumber, String email, boolean z13, ppxfxbqfkf emailError, AuthorizationFlowResult authorizationFlowResult, boolean z14) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(emailError, "emailError");
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.phoneNumberErrorIsVisible = z13;
        this.emailError = emailError;
        this.result = authorizationFlowResult;
        this.isLoading = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, String str, String str2, boolean z13, ppxfxbqfkf ppxfxbqfkfVar, AuthorizationFlowResult authorizationFlowResult, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = state.phoneNumber;
        }
        if ((i13 & 2) != 0) {
            str2 = state.email;
        }
        String str3 = str2;
        if ((i13 & 4) != 0) {
            z13 = state.phoneNumberErrorIsVisible;
        }
        boolean z15 = z13;
        if ((i13 & 8) != 0) {
            ppxfxbqfkfVar = state.emailError;
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        if ((i13 & 16) != 0) {
            authorizationFlowResult = state.result;
        }
        AuthorizationFlowResult authorizationFlowResult2 = authorizationFlowResult;
        if ((i13 & 32) != 0) {
            z14 = state.isLoading;
        }
        return state.zoijcleaow(str, str3, z15, ppxfxbqfkfVar2, authorizationFlowResult2, z14);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final AuthorizationFlowResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && zdlpuopuiu.eablkybsjg(this.email, state.email) && this.phoneNumberErrorIsVisible == state.phoneNumberErrorIsVisible && this.emailError == state.emailError && zdlpuopuiu.eablkybsjg(this.result, state.result) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ppxfxbqfkf getEmailError() {
        return this.emailError;
    }

    public int hashCode() {
        int iHashCode = ((((((this.phoneNumber.hashCode() * 31) + this.email.hashCode()) * 31) + Boolean.hashCode(this.phoneNumberErrorIsVisible)) * 31) + this.emailError.hashCode()) * 31;
        AuthorizationFlowResult authorizationFlowResult = this.result;
        return ((iHashCode + (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode())) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getPhoneNumberErrorIsVisible() {
        return this.phoneNumberErrorIsVisible;
    }

    public String toString() {
        return "State(phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", phoneNumberErrorIsVisible=" + this.phoneNumberErrorIsVisible + ", emailError=" + this.emailError + ", result=" + this.result + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.phoneNumber);
        dest.writeString(this.email);
        dest.writeInt(this.phoneNumberErrorIsVisible ? 1 : 0);
        dest.writeString(this.emailError.name());
        dest.writeParcelable(this.result, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(String phoneNumber, String email, boolean phoneNumberErrorIsVisible, ppxfxbqfkf emailError, AuthorizationFlowResult result, boolean isLoading) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(emailError, "emailError");
        return new State(phoneNumber, email, phoneNumberErrorIsVisible, emailError, result, isLoading);
    }

    public /* synthetic */ State(String str, String str2, boolean z13, ppxfxbqfkf ppxfxbqfkfVar, AuthorizationFlowResult authorizationFlowResult, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? ppxfxbqfkf.NONE : ppxfxbqfkfVar, authorizationFlowResult, (i13 & 32) != 0 ? false : z14);
    }
}
