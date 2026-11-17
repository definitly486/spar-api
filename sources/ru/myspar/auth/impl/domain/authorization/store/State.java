package ru.myspar.auth.impl.domain.authorization.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import ru.myspar.auth.api.model.AuthorizationFlowResult;
import ru.myspar.auth.api.model.NonAuthorizedPayload;

/* JADX INFO: renamed from: ru.myspar.auth.impl.domain.authorization.store.AuthorizationStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jd\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 H×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'¨\u0006<"}, d2 = {"ru/myspar/auth/impl/domain/authorization/store/AuthorizationStore$State", "Landroid/os/Parcelable;", "", "phoneNumberErrorIsVisible", "agreementErrorIsVisible", "Lp0/tzroggbefp;", "phoneNumber", "agreementIsChecked", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "waitingResult", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "errorType", "showAuthErrorDialog", "isLoading", "<init>", "(ZZLp0/tzroggbefp;ZLru/myspar/auth/api/model/AuthorizationFlowResult;Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/auth/impl/domain/authorization/store/AuthorizationStore$State;", "zoijcleaow", "(ZZLp0/tzroggbefp;ZLru/myspar/auth/api/model/AuthorizationFlowResult;Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;ZZ)Lru/myspar/auth/impl/domain/authorization/store/AuthorizationStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "dxjokdxxww", "()Z", "yggfygwlhe", "eablkybsjg", "jyumaefscl", "Lp0/tzroggbefp;", "nufgyqmvbu", "()Lp0/tzroggbefp;", "iwizpuwonk", "gxszxtbevo", "cqumvgiudr", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "gtknphoqwx", "()Lru/myspar/auth/api/model/AuthorizationFlowResult;", "esjtqupxsv", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "lqeggnwhkg", "()Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "lereixgezr", "btonecajqb", "pmvmpeiblj", "wflxmlrfwp", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuthorizationFlowResult waitingResult;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final NonAuthorizedPayload.zoijcleaow errorType;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean agreementIsChecked;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp phoneNumber;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showAuthErrorDialog;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean agreementErrorIsVisible;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean phoneNumberErrorIsVisible;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.authorization.store.AuthorizationStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, parcel.readInt() != 0, et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel), parcel.readInt() != 0, (AuthorizationFlowResult) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() == 0 ? null : NonAuthorizedPayload.zoijcleaow.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, boolean z14, tzroggbefp phoneNumber, boolean z15, AuthorizationFlowResult authorizationFlowResult, NonAuthorizedPayload.zoijcleaow zoijcleaowVar, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        this.phoneNumberErrorIsVisible = z13;
        this.agreementErrorIsVisible = z14;
        this.phoneNumber = phoneNumber;
        this.agreementIsChecked = z15;
        this.waitingResult = authorizationFlowResult;
        this.errorType = zoijcleaowVar;
        this.showAuthErrorDialog = z16;
        this.isLoading = z17;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getShowAuthErrorDialog() {
        return this.showAuthErrorDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getPhoneNumberErrorIsVisible() {
        return this.phoneNumberErrorIsVisible;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getAgreementErrorIsVisible() {
        return this.agreementErrorIsVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.phoneNumberErrorIsVisible == state.phoneNumberErrorIsVisible && this.agreementErrorIsVisible == state.agreementErrorIsVisible && zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && this.agreementIsChecked == state.agreementIsChecked && zdlpuopuiu.eablkybsjg(this.waitingResult, state.waitingResult) && this.errorType == state.errorType && this.showAuthErrorDialog == state.showAuthErrorDialog && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final AuthorizationFlowResult getWaitingResult() {
        return this.waitingResult;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getAgreementIsChecked() {
        return this.agreementIsChecked;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.phoneNumberErrorIsVisible) * 31) + Boolean.hashCode(this.agreementErrorIsVisible)) * 31) + this.phoneNumber.hashCode()) * 31) + Boolean.hashCode(this.agreementIsChecked)) * 31;
        AuthorizationFlowResult authorizationFlowResult = this.waitingResult;
        int iHashCode2 = (iHashCode + (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode())) * 31;
        NonAuthorizedPayload.zoijcleaow zoijcleaowVar = this.errorType;
        return ((((iHashCode2 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.showAuthErrorDialog)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final NonAuthorizedPayload.zoijcleaow getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final tzroggbefp getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString() {
        return "State(phoneNumberErrorIsVisible=" + this.phoneNumberErrorIsVisible + ", agreementErrorIsVisible=" + this.agreementErrorIsVisible + ", phoneNumber=" + this.phoneNumber + ", agreementIsChecked=" + this.agreementIsChecked + ", waitingResult=" + this.waitingResult + ", errorType=" + this.errorType + ", showAuthErrorDialog=" + this.showAuthErrorDialog + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.phoneNumberErrorIsVisible ? 1 : 0);
        dest.writeInt(this.agreementErrorIsVisible ? 1 : 0);
        et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.phoneNumber, dest, flags);
        dest.writeInt(this.agreementIsChecked ? 1 : 0);
        dest.writeParcelable(this.waitingResult, flags);
        NonAuthorizedPayload.zoijcleaow zoijcleaowVar = this.errorType;
        if (zoijcleaowVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zoijcleaowVar.name());
        }
        dest.writeInt(this.showAuthErrorDialog ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(boolean phoneNumberErrorIsVisible, boolean agreementErrorIsVisible, tzroggbefp phoneNumber, boolean agreementIsChecked, AuthorizationFlowResult waitingResult, NonAuthorizedPayload.zoijcleaow errorType, boolean showAuthErrorDialog, boolean isLoading) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        return new State(phoneNumberErrorIsVisible, agreementErrorIsVisible, phoneNumber, agreementIsChecked, waitingResult, errorType, showAuthErrorDialog, isLoading);
    }

    public /* synthetic */ State(boolean z13, boolean z14, tzroggbefp tzroggbefpVar, boolean z15, AuthorizationFlowResult authorizationFlowResult, NonAuthorizedPayload.zoijcleaow zoijcleaowVar, boolean z16, boolean z17, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 8) != 0 ? false : z15, authorizationFlowResult, zoijcleaowVar, (i13 & 64) != 0 ? false : z16, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z17);
    }
}
