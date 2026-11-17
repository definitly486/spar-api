package ru.myspar.proloyalty.auth.impl.domain.authbysms.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.authbysms.store.AuthBySmsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jj\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010&R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u001d¨\u0006:"}, d2 = {"ru/myspar/proloyalty/auth/impl/domain/authbysms/store/AuthBySmsStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "phoneNumber", "hash", "Lp0/tzroggbefp;", "smsCode", "smsCodeInputEnabled", "smsInputError", "isResendSmsButtonEnabled", "isAcceptButtonEnabled", "timerValue", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lp0/tzroggbefp;ZZZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/auth/impl/domain/authbysms/store/AuthBySmsStore$State;", "zoijcleaow", "(ZLjava/lang/String;Ljava/lang/String;Lp0/tzroggbefp;ZZZZLjava/lang/String;)Lru/myspar/proloyalty/auth/impl/domain/authbysms/store/AuthBySmsStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "wflxmlrfwp", "()Z", "yggfygwlhe", "Ljava/lang/String;", "gxszxtbevo", "jyumaefscl", "eablkybsjg", "iwizpuwonk", "Lp0/tzroggbefp;", "lqeggnwhkg", "()Lp0/tzroggbefp;", "cqumvgiudr", "nufgyqmvbu", "esjtqupxsv", "dxjokdxxww", "lereixgezr", "oxmwwwfdhm", "pmvmpeiblj", "gtknphoqwx", "zynmafqrjb", "btonecajqb", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean smsCodeInputEnabled;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean smsInputError;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp smsCode;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String hash;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isResendSmsButtonEnabled;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAcceptButtonEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timerValue;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.authbysms.store.AuthBySmsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readInt() != 0, parcel.readString(), parcel.readString(), yr0.iobyxmoadg.f126300iobyxmoadg.iobyxmoadg(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, String phoneNumber, String hash, tzroggbefp smsCode, boolean z14, boolean z15, boolean z16, boolean z17, String timerValue) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(hash, "hash");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        this.isLoading = z13;
        this.phoneNumber = phoneNumber;
        this.hash = hash;
        this.smsCode = smsCode;
        this.smsCodeInputEnabled = z14;
        this.smsInputError = z15;
        this.isResendSmsButtonEnabled = z16;
        this.isAcceptButtonEnabled = z17;
        this.timerValue = timerValue;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getTimerValue() {
        return this.timerValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getSmsInputError() {
        return this.smsInputError;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && zdlpuopuiu.eablkybsjg(this.hash, state.hash) && zdlpuopuiu.eablkybsjg(this.smsCode, state.smsCode) && this.smsCodeInputEnabled == state.smsCodeInputEnabled && this.smsInputError == state.smsInputError && this.isResendSmsButtonEnabled == state.isResendSmsButtonEnabled && this.isAcceptButtonEnabled == state.isAcceptButtonEnabled && zdlpuopuiu.eablkybsjg(this.timerValue, state.timerValue);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsAcceptButtonEnabled() {
        return this.isAcceptButtonEnabled;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isLoading) * 31) + this.phoneNumber.hashCode()) * 31) + this.hash.hashCode()) * 31) + this.smsCode.hashCode()) * 31) + Boolean.hashCode(this.smsCodeInputEnabled)) * 31) + Boolean.hashCode(this.smsInputError)) * 31) + Boolean.hashCode(this.isResendSmsButtonEnabled)) * 31) + Boolean.hashCode(this.isAcceptButtonEnabled)) * 31) + this.timerValue.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final tzroggbefp getSmsCode() {
        return this.smsCode;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final boolean getSmsCodeInputEnabled() {
        return this.smsCodeInputEnabled;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsResendSmsButtonEnabled() {
        return this.isResendSmsButtonEnabled;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", phoneNumber=" + this.phoneNumber + ", hash=" + this.hash + ", smsCode=" + this.smsCode + ", smsCodeInputEnabled=" + this.smsCodeInputEnabled + ", smsInputError=" + this.smsInputError + ", isResendSmsButtonEnabled=" + this.isResendSmsButtonEnabled + ", isAcceptButtonEnabled=" + this.isAcceptButtonEnabled + ", timerValue=" + this.timerValue + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.hash);
        yr0.iobyxmoadg.f126300iobyxmoadg.zoijcleaow(this.smsCode, dest, flags);
        dest.writeInt(this.smsCodeInputEnabled ? 1 : 0);
        dest.writeInt(this.smsInputError ? 1 : 0);
        dest.writeInt(this.isResendSmsButtonEnabled ? 1 : 0);
        dest.writeInt(this.isAcceptButtonEnabled ? 1 : 0);
        dest.writeString(this.timerValue);
    }

    public final State zoijcleaow(boolean isLoading, String phoneNumber, String hash, tzroggbefp smsCode, boolean smsCodeInputEnabled, boolean smsInputError, boolean isResendSmsButtonEnabled, boolean isAcceptButtonEnabled, String timerValue) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        zdlpuopuiu.btonecajqb(hash, "hash");
        zdlpuopuiu.btonecajqb(smsCode, "smsCode");
        zdlpuopuiu.btonecajqb(timerValue, "timerValue");
        return new State(isLoading, phoneNumber, hash, smsCode, smsCodeInputEnabled, smsInputError, isResendSmsButtonEnabled, isAcceptButtonEnabled, timerValue);
    }

    public /* synthetic */ State(boolean z13, String str, String str2, tzroggbefp tzroggbefpVar, boolean z14, boolean z15, boolean z16, boolean z17, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 16) != 0 ? true : z14, (i13 & 32) != 0 ? false : z15, (i13 & 64) != 0 ? false : z16, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z17 : false, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str3 : "");
    }
}
