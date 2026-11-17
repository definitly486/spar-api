package ru.myspar.auth.impl.domain.deleteaccount.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.auth.impl.domain.deleteaccount.store.DeleteAccountStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017Jj\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH×\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0003\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010$R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u0010$¨\u00067"}, d2 = {"ru/myspar/auth/impl/domain/deleteaccount/store/DeleteAccountStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "phoneNumber", "smsCode", "smsFieldIsVisible", "", "buttonTitleRes", "hintRes", "smsErrorIsVisible", "timerValue", "smsRepeatRequestIsVisible", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZIIZLjava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/auth/impl/domain/deleteaccount/store/DeleteAccountStore$State;", "zoijcleaow", "(ZLjava/lang/String;Ljava/lang/String;ZIIZLjava/lang/String;Z)Lru/myspar/auth/impl/domain/deleteaccount/store/DeleteAccountStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "()Z", "yggfygwlhe", "Ljava/lang/String;", "lqeggnwhkg", "jyumaefscl", "nufgyqmvbu", "iwizpuwonk", "btonecajqb", "cqumvgiudr", "I", "eablkybsjg", "esjtqupxsv", "gxszxtbevo", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "wflxmlrfwp", "zynmafqrjb", "gtknphoqwx", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int buttonTitleRes;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hintRes;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean smsFieldIsVisible;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String smsCode;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean smsErrorIsVisible;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timerValue;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean smsRepeatRequestIsVisible;

    /* JADX INFO: renamed from: ru.myspar.auth.impl.domain.deleteaccount.store.DeleteAccountStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, String phoneNumber, String smsCode, boolean z14, int i13, int i14, boolean z15, String timerValue, boolean z16) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        this.isLoading = z13;
        this.phoneNumber = phoneNumber;
        this.smsCode = smsCode;
        this.smsFieldIsVisible = z14;
        this.buttonTitleRes = i13;
        this.hintRes = i14;
        this.smsErrorIsVisible = z15;
        this.timerValue = timerValue;
        this.smsRepeatRequestIsVisible = z16;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getSmsFieldIsVisible() {
        return this.smsFieldIsVisible;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getSmsErrorIsVisible() {
        return this.smsErrorIsVisible;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final int getButtonTitleRes() {
        return this.buttonTitleRes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && zdlpuopuiu.eablkybsjg(this.smsCode, state.smsCode) && this.smsFieldIsVisible == state.smsFieldIsVisible && this.buttonTitleRes == state.buttonTitleRes && this.hintRes == state.hintRes && this.smsErrorIsVisible == state.smsErrorIsVisible && zdlpuopuiu.eablkybsjg(this.timerValue, state.timerValue) && this.smsRepeatRequestIsVisible == state.smsRepeatRequestIsVisible;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getSmsRepeatRequestIsVisible() {
        return this.smsRepeatRequestIsVisible;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getHintRes() {
        return this.hintRes;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isLoading) * 31) + this.phoneNumber.hashCode()) * 31) + this.smsCode.hashCode()) * 31) + Boolean.hashCode(this.smsFieldIsVisible)) * 31) + Integer.hashCode(this.buttonTitleRes)) * 31) + Integer.hashCode(this.hintRes)) * 31) + Boolean.hashCode(this.smsErrorIsVisible)) * 31) + this.timerValue.hashCode()) * 31) + Boolean.hashCode(this.smsRepeatRequestIsVisible);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getSmsCode() {
        return this.smsCode;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", phoneNumber=" + this.phoneNumber + ", smsCode=" + this.smsCode + ", smsFieldIsVisible=" + this.smsFieldIsVisible + ", buttonTitleRes=" + this.buttonTitleRes + ", hintRes=" + this.hintRes + ", smsErrorIsVisible=" + this.smsErrorIsVisible + ", timerValue=" + this.timerValue + ", smsRepeatRequestIsVisible=" + this.smsRepeatRequestIsVisible + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final String getTimerValue() {
        return this.timerValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.smsCode);
        dest.writeInt(this.smsFieldIsVisible ? 1 : 0);
        dest.writeInt(this.buttonTitleRes);
        dest.writeInt(this.hintRes);
        dest.writeInt(this.smsErrorIsVisible ? 1 : 0);
        dest.writeString(this.timerValue);
        dest.writeInt(this.smsRepeatRequestIsVisible ? 1 : 0);
    }

    public final State zoijcleaow(boolean isLoading, String phoneNumber, String smsCode, boolean smsFieldIsVisible, int buttonTitleRes, int hintRes, boolean smsErrorIsVisible, String timerValue, boolean smsRepeatRequestIsVisible) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        return new State(isLoading, phoneNumber, smsCode, smsFieldIsVisible, buttonTitleRes, hintRes, smsErrorIsVisible, timerValue, smsRepeatRequestIsVisible);
    }

    public /* synthetic */ State(boolean z13, String str, String str2, boolean z14, int i13, int i14, boolean z15, String str3, boolean z16, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? false : z13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? false : z14, (i15 & 16) != 0 ? ru.myspar.auth.impl.domain.deleteaccount.store.iobyxmoadg.f84434gtknphoqwx.iobyxmoadg() : i13, (i15 & 32) != 0 ? ru.myspar.auth.impl.domain.deleteaccount.store.iobyxmoadg.f84434gtknphoqwx.zoijcleaow() : i14, (i15 & 64) != 0 ? false : z15, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? str3 : "", (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? z16 : false);
    }
}
