package ru.myspar.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/myspar/auth/api/model/RegistrationArgs;", "Landroid/os/Parcelable;", "", "phoneNumber", Scopes.EMAIL, "loymaxToken", "", "hasCard", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/auth/api/model/AuthorizationFlowResult;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Z", "ppxfxbqfkf", "()Z", "cqumvgiudr", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "lqeggnwhkg", "()Lru/myspar/auth/api/model/AuthorizationFlowResult;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RegistrationArgs implements Parcelable {
    public static final Parcelable.Creator<RegistrationArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuthorizationFlowResult result;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasCard;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String loymaxToken;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final RegistrationArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new RegistrationArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (AuthorizationFlowResult) parcel.readParcelable(RegistrationArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final RegistrationArgs[] newArray(int i13) {
            return new RegistrationArgs[i13];
        }
    }

    public RegistrationArgs(String phoneNumber, String email, String str, boolean z13, AuthorizationFlowResult authorizationFlowResult) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(email, "email");
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.loymaxToken = str;
        this.hasCard = z13;
        this.result = authorizationFlowResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getLoymaxToken() {
        return this.loymaxToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationArgs)) {
            return false;
        }
        RegistrationArgs registrationArgs = (RegistrationArgs) other;
        return zdlpuopuiu.eablkybsjg(this.phoneNumber, registrationArgs.phoneNumber) && zdlpuopuiu.eablkybsjg(this.email, registrationArgs.email) && zdlpuopuiu.eablkybsjg(this.loymaxToken, registrationArgs.loymaxToken) && this.hasCard == registrationArgs.hasCard && zdlpuopuiu.eablkybsjg(this.result, registrationArgs.result);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        int iHashCode = ((this.phoneNumber.hashCode() * 31) + this.email.hashCode()) * 31;
        String str = this.loymaxToken;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.hasCard)) * 31;
        AuthorizationFlowResult authorizationFlowResult = this.result;
        return iHashCode2 + (authorizationFlowResult != null ? authorizationFlowResult.hashCode() : 0);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final AuthorizationFlowResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final boolean getHasCard() {
        return this.hasCard;
    }

    public String toString() {
        return "RegistrationArgs(phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", loymaxToken=" + this.loymaxToken + ", hasCard=" + this.hasCard + ", result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.phoneNumber);
        dest.writeString(this.email);
        dest.writeString(this.loymaxToken);
        dest.writeInt(this.hasCard ? 1 : 0);
        dest.writeParcelable(this.result, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getEmail() {
        return this.email;
    }
}
