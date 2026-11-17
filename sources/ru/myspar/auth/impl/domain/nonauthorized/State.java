package ru.myspar.auth.impl.domain.nonauthorized;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.auth.api.model.AuthorizationFlowResult;
import ru.myspar.auth.api.model.NonAuthorizedPayload;

/* JADX INFO: renamed from: ru.myspar.auth.impl.domain.nonauthorized.NonAuthorizedStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"ru/myspar/auth/impl/domain/nonauthorized/NonAuthorizedStore$State", "Landroid/os/Parcelable;", "", "isLoading", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "errorType", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "result", "<init>", "(ZLru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;Lru/myspar/auth/api/model/AuthorizationFlowResult;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "eablkybsjg", "()Z", "yggfygwlhe", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "zoijcleaow", "()Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "jyumaefscl", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "ppxfxbqfkf", "()Lru/myspar/auth/api/model/AuthorizationFlowResult;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuthorizationFlowResult result;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final NonAuthorizedPayload.zoijcleaow errorType;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.nonauthorized.NonAuthorizedStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, NonAuthorizedPayload.zoijcleaow.valueOf(parcel.readString()), (AuthorizationFlowResult) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, NonAuthorizedPayload.zoijcleaow errorType, AuthorizationFlowResult authorizationFlowResult) {
        zdlpuopuiu.btonecajqb(errorType, "errorType");
        this.isLoading = z13;
        this.errorType = errorType;
        this.result = authorizationFlowResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && this.errorType == state.errorType && zdlpuopuiu.eablkybsjg(this.result, state.result);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.errorType.hashCode()) * 31;
        AuthorizationFlowResult authorizationFlowResult = this.result;
        return iHashCode + (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final AuthorizationFlowResult getResult() {
        return this.result;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", errorType=" + this.errorType + ", result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.errorType.name());
        dest.writeParcelable(this.result, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final NonAuthorizedPayload.zoijcleaow getErrorType() {
        return this.errorType;
    }

    public /* synthetic */ State(boolean z13, NonAuthorizedPayload.zoijcleaow zoijcleaowVar, AuthorizationFlowResult authorizationFlowResult, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, zoijcleaowVar, authorizationFlowResult);
    }
}
