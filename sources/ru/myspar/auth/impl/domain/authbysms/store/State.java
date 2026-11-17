package ru.myspar.auth.impl.domain.authbysms.store;

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

/* JADX INFO: renamed from: ru.myspar.auth.impl.domain.authbysms.store.AuthBySmsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJx\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H×\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"ru/myspar/auth/impl/domain/authbysms/store/AuthBySmsStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "phoneNumber", "token", "Lp0/tzroggbefp;", "smsCode", "isError", "errorText", "continueBtnIsEnabled", "timerValue", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "result", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "errorType", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lp0/tzroggbefp;ZLjava/lang/String;ZLjava/lang/String;Lru/myspar/auth/api/model/AuthorizationFlowResult;Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/auth/impl/domain/authbysms/store/AuthBySmsStore$State;", "zoijcleaow", "(ZLjava/lang/String;Ljava/lang/String;Lp0/tzroggbefp;ZLjava/lang/String;ZLjava/lang/String;Lru/myspar/auth/api/model/AuthorizationFlowResult;Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;)Lru/myspar/auth/impl/domain/authbysms/store/AuthBySmsStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "yggfygwlhe", "()Z", "Ljava/lang/String;", "nufgyqmvbu", "jyumaefscl", "wflxmlrfwp", "iwizpuwonk", "Lp0/tzroggbefp;", "btonecajqb", "()Lp0/tzroggbefp;", "cqumvgiudr", "oxmwwwfdhm", "esjtqupxsv", "gxszxtbevo", "lereixgezr", "eablkybsjg", "pmvmpeiblj", "gtknphoqwx", "zynmafqrjb", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "dxjokdxxww", "()Lru/myspar/auth/api/model/AuthorizationFlowResult;", "istkbnxepw", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "lqeggnwhkg", "()Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isError;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorText;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final NonAuthorizedPayload.zoijcleaow errorType;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp smsCode;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean continueBtnIsEnabled;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timerValue;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuthorizationFlowResult result;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.authbysms.store.AuthBySmsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, parcel.readString(), parcel.readString(), et.iobyxmoadg.f31924iobyxmoadg.iobyxmoadg(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), (AuthorizationFlowResult) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() == 0 ? null : NonAuthorizedPayload.zoijcleaow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, String phoneNumber, String token, tzroggbefp smsCode, boolean z14, String errorText, boolean z15, String timerValue, AuthorizationFlowResult authorizationFlowResult, NonAuthorizedPayload.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(token, "token");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(errorText, "errorText");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        this.isLoading = z13;
        this.phoneNumber = phoneNumber;
        this.token = token;
        this.smsCode = smsCode;
        this.isError = z14;
        this.errorText = errorText;
        this.continueBtnIsEnabled = z15;
        this.timerValue = timerValue;
        this.result = authorizationFlowResult;
        this.errorType = zoijcleaowVar;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final tzroggbefp getSmsCode() {
        return this.smsCode;
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
    public final boolean getContinueBtnIsEnabled() {
        return this.continueBtnIsEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && zdlpuopuiu.eablkybsjg(this.token, state.token) && zdlpuopuiu.eablkybsjg(this.smsCode, state.smsCode) && this.isError == state.isError && zdlpuopuiu.eablkybsjg(this.errorText, state.errorText) && this.continueBtnIsEnabled == state.continueBtnIsEnabled && zdlpuopuiu.eablkybsjg(this.timerValue, state.timerValue) && zdlpuopuiu.eablkybsjg(this.result, state.result) && this.errorType == state.errorType;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getTimerValue() {
        return this.timerValue;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((Boolean.hashCode(this.isLoading) * 31) + this.phoneNumber.hashCode()) * 31) + this.token.hashCode()) * 31) + this.smsCode.hashCode()) * 31) + Boolean.hashCode(this.isError)) * 31) + this.errorText.hashCode()) * 31) + Boolean.hashCode(this.continueBtnIsEnabled)) * 31) + this.timerValue.hashCode()) * 31;
        AuthorizationFlowResult authorizationFlowResult = this.result;
        int iHashCode2 = (iHashCode + (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode())) * 31;
        NonAuthorizedPayload.zoijcleaow zoijcleaowVar = this.errorType;
        return iHashCode2 + (zoijcleaowVar != null ? zoijcleaowVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final NonAuthorizedPayload.zoijcleaow getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", phoneNumber=" + this.phoneNumber + ", token=" + this.token + ", smsCode=" + this.smsCode + ", isError=" + this.isError + ", errorText=" + this.errorText + ", continueBtnIsEnabled=" + this.continueBtnIsEnabled + ", timerValue=" + this.timerValue + ", result=" + this.result + ", errorType=" + this.errorType + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.token);
        et.iobyxmoadg.f31924iobyxmoadg.zoijcleaow(this.smsCode, dest, flags);
        dest.writeInt(this.isError ? 1 : 0);
        dest.writeString(this.errorText);
        dest.writeInt(this.continueBtnIsEnabled ? 1 : 0);
        dest.writeString(this.timerValue);
        dest.writeParcelable(this.result, flags);
        NonAuthorizedPayload.zoijcleaow zoijcleaowVar = this.errorType;
        if (zoijcleaowVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zoijcleaowVar.name());
        }
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final State zoijcleaow(boolean isLoading, String phoneNumber, String token, tzroggbefp smsCode, boolean isError, String errorText, boolean continueBtnIsEnabled, String timerValue, AuthorizationFlowResult result, NonAuthorizedPayload.zoijcleaow errorType) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(token, "token");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(errorText, "errorText");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        return new State(isLoading, phoneNumber, token, smsCode, isError, errorText, continueBtnIsEnabled, timerValue, result, errorType);
    }

    public /* synthetic */ State(boolean z13, String str, String str2, tzroggbefp tzroggbefpVar, boolean z14, String str3, boolean z15, String str4, AuthorizationFlowResult authorizationFlowResult, NonAuthorizedPayload.zoijcleaow zoijcleaowVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? false : z15, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str4, authorizationFlowResult, zoijcleaowVar);
    }
}
