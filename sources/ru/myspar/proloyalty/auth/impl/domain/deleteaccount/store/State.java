package ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.DeleteAccountStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jt\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0003\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0018R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010%R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010%R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010\u001d¨\u0006:"}, d2 = {"ru/myspar/proloyalty/auth/impl/domain/deleteaccount/store/DeleteAccountStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "phoneNumber", "smsCode", "smsFieldIsVisible", "", "buttonTitleRes", "hintRes", "smsErrorIsVisible", "timerValue", "smsRepeatRequestIsVisible", "smsHash", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZIIZLjava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/auth/impl/domain/deleteaccount/store/DeleteAccountStore$State;", "zoijcleaow", "(ZLjava/lang/String;Ljava/lang/String;ZIIZLjava/lang/String;ZLjava/lang/String;)Lru/myspar/proloyalty/auth/impl/domain/deleteaccount/store/DeleteAccountStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "()Z", "yggfygwlhe", "Ljava/lang/String;", "lqeggnwhkg", "jyumaefscl", "nufgyqmvbu", "iwizpuwonk", "btonecajqb", "cqumvgiudr", "I", "eablkybsjg", "esjtqupxsv", "gxszxtbevo", "lereixgezr", "dxjokdxxww", "pmvmpeiblj", "oxmwwwfdhm", "zynmafqrjb", "wflxmlrfwp", "istkbnxepw", "gtknphoqwx", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final int buttonTitleRes;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hintRes;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final String smsHash;

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

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.DeleteAccountStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, String phoneNumber, String smsCode, boolean z14, int i13, int i14, boolean z15, String timerValue, boolean z16, String smsHash) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        zdlpuopuiu.btonecajqb(smsHash, "smsHash");
        this.isLoading = z13;
        this.phoneNumber = phoneNumber;
        this.smsCode = smsCode;
        this.smsFieldIsVisible = z14;
        this.buttonTitleRes = i13;
        this.hintRes = i14;
        this.smsErrorIsVisible = z15;
        this.timerValue = timerValue;
        this.smsRepeatRequestIsVisible = z16;
        this.smsHash = smsHash;
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
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && zdlpuopuiu.eablkybsjg(this.smsCode, state.smsCode) && this.smsFieldIsVisible == state.smsFieldIsVisible && this.buttonTitleRes == state.buttonTitleRes && this.hintRes == state.hintRes && this.smsErrorIsVisible == state.smsErrorIsVisible && zdlpuopuiu.eablkybsjg(this.timerValue, state.timerValue) && this.smsRepeatRequestIsVisible == state.smsRepeatRequestIsVisible && zdlpuopuiu.eablkybsjg(this.smsHash, state.smsHash);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final String getSmsHash() {
        return this.smsHash;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final int getHintRes() {
        return this.hintRes;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.isLoading) * 31) + this.phoneNumber.hashCode()) * 31) + this.smsCode.hashCode()) * 31) + Boolean.hashCode(this.smsFieldIsVisible)) * 31) + Integer.hashCode(this.buttonTitleRes)) * 31) + Integer.hashCode(this.hintRes)) * 31) + Boolean.hashCode(this.smsErrorIsVisible)) * 31) + this.timerValue.hashCode()) * 31) + Boolean.hashCode(this.smsRepeatRequestIsVisible)) * 31) + this.smsHash.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getSmsCode() {
        return this.smsCode;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final String getTimerValue() {
        return this.timerValue;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", phoneNumber=" + this.phoneNumber + ", smsCode=" + this.smsCode + ", smsFieldIsVisible=" + this.smsFieldIsVisible + ", buttonTitleRes=" + this.buttonTitleRes + ", hintRes=" + this.hintRes + ", smsErrorIsVisible=" + this.smsErrorIsVisible + ", timerValue=" + this.timerValue + ", smsRepeatRequestIsVisible=" + this.smsRepeatRequestIsVisible + ", smsHash=" + this.smsHash + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getSmsRepeatRequestIsVisible() {
        return this.smsRepeatRequestIsVisible;
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
        dest.writeString(this.smsHash);
    }

    public final State zoijcleaow(boolean isLoading, String phoneNumber, String smsCode, boolean smsFieldIsVisible, int buttonTitleRes, int hintRes, boolean smsErrorIsVisible, String timerValue, boolean smsRepeatRequestIsVisible, String smsHash) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        zdlpuopuiu.btonecajqb(smsHash, "smsHash");
        return new State(isLoading, phoneNumber, smsCode, smsFieldIsVisible, buttonTitleRes, hintRes, smsErrorIsVisible, timerValue, smsRepeatRequestIsVisible, smsHash);
    }

    public /* synthetic */ State(boolean z13, String str, String str2, boolean z14, int i13, int i14, boolean z15, String str3, boolean z16, String str4, int i15, gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? false : z13, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? "" : str2, (i15 & 8) != 0 ? false : z14, (i15 & 16) != 0 ? ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.iobyxmoadg.f92438gtknphoqwx.iobyxmoadg() : i13, (i15 & 32) != 0 ? ru.myspar.proloyalty.auth.impl.domain.deleteaccount.store.iobyxmoadg.f92438gtknphoqwx.zoijcleaow() : i14, (i15 & 64) != 0 ? false : z15, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "" : str3, (i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? z16 : false, (i15 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? str4 : "");
    }
}
