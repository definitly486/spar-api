package ru.myspar.proloyalty.domain.feature.editreceiver.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.editreceiver.store.EditReceiverStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jj\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0012H×\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-¨\u0006:"}, d2 = {"ru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverArgs;", "args", "", "firstName", "", "firstNameError", "lastName", "lastNameError", "phone", "phoneError", "saveIsVisible", "isLoading", "<init>", "(Lru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverArgs;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverArgs;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZZZ)Lru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverArgs;", "eablkybsjg", "()Lru/myspar/proloyalty/domain/feature/editreceiver/store/EditReceiverArgs;", "yggfygwlhe", "Ljava/lang/String;", "gxszxtbevo", "jyumaefscl", "Z", "lqeggnwhkg", "()Z", "iwizpuwonk", "nufgyqmvbu", "cqumvgiudr", "dxjokdxxww", "esjtqupxsv", "btonecajqb", "lereixgezr", "gtknphoqwx", "pmvmpeiblj", "wflxmlrfwp", "zynmafqrjb", "oxmwwwfdhm", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean lastNameError;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean firstNameError;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean phoneError;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean saveIsVisible;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final EditReceiverArgs args;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.editreceiver.store.EditReceiverStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(EditReceiverArgs.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(EditReceiverArgs args, String firstName, boolean z13, String lastName, boolean z14, String phone, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(phone, "phone");
        this.args = args;
        this.firstName = firstName;
        this.firstNameError = z13;
        this.lastName = lastName;
        this.lastNameError = z14;
        this.phone = phone;
        this.phoneError = z15;
        this.saveIsVisible = z16;
        this.isLoading = z17;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getLastNameError() {
        return this.lastNameError;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final EditReceiverArgs getArgs() {
        return this.args;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.args, state.args) && zdlpuopuiu.eablkybsjg(this.firstName, state.firstName) && this.firstNameError == state.firstNameError && zdlpuopuiu.eablkybsjg(this.lastName, state.lastName) && this.lastNameError == state.lastNameError && zdlpuopuiu.eablkybsjg(this.phone, state.phone) && this.phoneError == state.phoneError && this.saveIsVisible == state.saveIsVisible && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getPhoneError() {
        return this.phoneError;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public int hashCode() {
        return (((((((((((((((this.args.hashCode() * 31) + this.firstName.hashCode()) * 31) + Boolean.hashCode(this.firstNameError)) * 31) + this.lastName.hashCode()) * 31) + Boolean.hashCode(this.lastNameError)) * 31) + this.phone.hashCode()) * 31) + Boolean.hashCode(this.phoneError)) * 31) + Boolean.hashCode(this.saveIsVisible)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getFirstNameError() {
        return this.firstNameError;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(args=" + this.args + ", firstName=" + this.firstName + ", firstNameError=" + this.firstNameError + ", lastName=" + this.lastName + ", lastNameError=" + this.lastNameError + ", phone=" + this.phone + ", phoneError=" + this.phoneError + ", saveIsVisible=" + this.saveIsVisible + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getSaveIsVisible() {
        return this.saveIsVisible;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.args.writeToParcel(dest, flags);
        dest.writeString(this.firstName);
        dest.writeInt(this.firstNameError ? 1 : 0);
        dest.writeString(this.lastName);
        dest.writeInt(this.lastNameError ? 1 : 0);
        dest.writeString(this.phone);
        dest.writeInt(this.phoneError ? 1 : 0);
        dest.writeInt(this.saveIsVisible ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(EditReceiverArgs args, String firstName, boolean firstNameError, String lastName, boolean lastNameError, String phone, boolean phoneError, boolean saveIsVisible, boolean isLoading) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(firstName, "firstName");
        zdlpuopuiu.btonecajqb(lastName, "lastName");
        zdlpuopuiu.btonecajqb(phone, "phone");
        return new State(args, firstName, firstNameError, lastName, lastNameError, phone, phoneError, saveIsVisible, isLoading);
    }

    public /* synthetic */ State(EditReceiverArgs editReceiverArgs, String str, boolean z13, String str2, boolean z14, String str3, boolean z15, boolean z16, boolean z17, int i13, gtknphoqwx gtknphoqwxVar) {
        this(editReceiverArgs, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? false : z14, (i13 & 32) == 0 ? str3 : "", (i13 & 64) != 0 ? false : z15, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z16, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? z17 : false);
    }
}
