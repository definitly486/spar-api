package ru.myspar.proloyalty.rate.feedback.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.rate.feedback.impl.domain.store.FeedbackStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017Jn\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(¨\u00067"}, d2 = {"ru/myspar/proloyalty/rate/feedback/impl/domain/store/FeedbackStore$State", "Landroid/os/Parcelable;", "", "phone", "", "phoneIsValid", "userName", "uriString", "fileName", "reason", "reasonIsValid", "isLoggedIn", "isLoading", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/rate/feedback/impl/domain/store/FeedbackStore$State;", "zoijcleaow", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lru/myspar/proloyalty/rate/feedback/impl/domain/store/FeedbackStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "Z", "lqeggnwhkg", "()Z", "jyumaefscl", "gtknphoqwx", "iwizpuwonk", "btonecajqb", "cqumvgiudr", "eablkybsjg", "esjtqupxsv", "nufgyqmvbu", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "oxmwwwfdhm", "zynmafqrjb", "wflxmlrfwp", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fileName;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uriString;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userName;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean reasonIsValid;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoggedIn;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean phoneIsValid;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.rate.feedback.impl.domain.store.FeedbackStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String phone, boolean z13, String userName, String str, String str2, String reason, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(userName, "userName");
        zdlpuopuiu.btonecajqb(reason, "reason");
        this.phone = phone;
        this.phoneIsValid = z13;
        this.userName = userName;
        this.uriString = str;
        this.fileName = str2;
        this.reason = reason;
        this.reasonIsValid = z14;
        this.isLoggedIn = z15;
        this.isLoading = z16;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getUriString() {
        return this.uriString;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getReasonIsValid() {
        return this.reasonIsValid;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.phone, state.phone) && this.phoneIsValid == state.phoneIsValid && zdlpuopuiu.eablkybsjg(this.userName, state.userName) && zdlpuopuiu.eablkybsjg(this.uriString, state.uriString) && zdlpuopuiu.eablkybsjg(this.fileName, state.fileName) && zdlpuopuiu.eablkybsjg(this.reason, state.reason) && this.reasonIsValid == state.reasonIsValid && this.isLoggedIn == state.isLoggedIn && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int iHashCode = ((((this.phone.hashCode() * 31) + Boolean.hashCode(this.phoneIsValid)) * 31) + this.userName.hashCode()) * 31;
        String str = this.uriString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileName;
        return ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.reason.hashCode()) * 31) + Boolean.hashCode(this.reasonIsValid)) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getPhoneIsValid() {
        return this.phoneIsValid;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public String toString() {
        return "State(phone=" + this.phone + ", phoneIsValid=" + this.phoneIsValid + ", userName=" + this.userName + ", uriString=" + this.uriString + ", fileName=" + this.fileName + ", reason=" + this.reason + ", reasonIsValid=" + this.reasonIsValid + ", isLoggedIn=" + this.isLoggedIn + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.phone);
        dest.writeInt(this.phoneIsValid ? 1 : 0);
        dest.writeString(this.userName);
        dest.writeString(this.uriString);
        dest.writeString(this.fileName);
        dest.writeString(this.reason);
        dest.writeInt(this.reasonIsValid ? 1 : 0);
        dest.writeInt(this.isLoggedIn ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(String phone, boolean phoneIsValid, String userName, String uriString, String fileName, String reason, boolean reasonIsValid, boolean isLoggedIn, boolean isLoading) {
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(userName, "userName");
        zdlpuopuiu.btonecajqb(reason, "reason");
        return new State(phone, phoneIsValid, userName, uriString, fileName, reason, reasonIsValid, isLoggedIn, isLoading);
    }

    public /* synthetic */ State(String str, boolean z13, String str2, String str3, String str4, String str5, boolean z14, boolean z15, boolean z16, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) == 0 ? str4 : null, (i13 & 32) == 0 ? str5 : "", (i13 & 64) != 0 ? true : z14, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z15 : true, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z16);
    }
}
