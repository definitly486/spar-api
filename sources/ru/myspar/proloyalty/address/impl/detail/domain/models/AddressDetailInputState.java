package ru.myspar.proloyalty.address.impl.detail.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import j0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;
import q11.dxjokdxxww;
import yr0.iobyxmoadg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H×\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006$"}, d2 = {"Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;", "Landroid/os/Parcelable;", "Lp0/tzroggbefp;", "input", "", "error", "<init>", "(Lp0/tzroggbefp;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "ppxfxbqfkf", "(Lp0/tzroggbefp;Ljava/lang/String;)Lru/myspar/proloyalty/address/impl/detail/domain/models/AddressDetailInputState;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lp0/tzroggbefp;", "lqeggnwhkg", "()Lp0/tzroggbefp;", "yggfygwlhe", "Ljava/lang/String;", "gxszxtbevo", "jyumaefscl", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddressDetailInputState implements Parcelable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp input;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AddressDetailInputState> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final AddressDetailInputState f91919iwizpuwonk = new AddressDetailInputState(new tzroggbefp(dxjokdxxww.ppxfxbqfkf(), 0, (l) null, 6, (gtknphoqwx) null), dxjokdxxww.ppxfxbqfkf());

    /* JADX INFO: renamed from: ru.myspar.proloyalty.address.impl.detail.domain.models.AddressDetailInputState$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final AddressDetailInputState iobyxmoadg() {
            return AddressDetailInputState.f91919iwizpuwonk;
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final AddressDetailInputState createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AddressDetailInputState(iobyxmoadg.f126300iobyxmoadg.iobyxmoadg(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final AddressDetailInputState[] newArray(int i13) {
            return new AddressDetailInputState[i13];
        }
    }

    public AddressDetailInputState(tzroggbefp input, String error) {
        zdlpuopuiu.btonecajqb(input, "input");
        zdlpuopuiu.btonecajqb(error, "error");
        this.input = input;
        this.error = error;
    }

    public static /* synthetic */ AddressDetailInputState eablkybsjg(AddressDetailInputState addressDetailInputState, tzroggbefp tzroggbefpVar, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tzroggbefpVar = addressDetailInputState.input;
        }
        if ((i13 & 2) != 0) {
            str = addressDetailInputState.error;
        }
        return addressDetailInputState.ppxfxbqfkf(tzroggbefpVar, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDetailInputState)) {
            return false;
        }
        AddressDetailInputState addressDetailInputState = (AddressDetailInputState) other;
        return zdlpuopuiu.eablkybsjg(this.input, addressDetailInputState.input) && zdlpuopuiu.eablkybsjg(this.error, addressDetailInputState.error);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        return (this.input.hashCode() * 31) + this.error.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final tzroggbefp getInput() {
        return this.input;
    }

    public final AddressDetailInputState ppxfxbqfkf(tzroggbefp input, String error) {
        zdlpuopuiu.btonecajqb(input, "input");
        zdlpuopuiu.btonecajqb(error, "error");
        return new AddressDetailInputState(input, error);
    }

    public String toString() {
        return "AddressDetailInputState(input=" + this.input + ", error=" + this.error + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        iobyxmoadg.f126300iobyxmoadg.zoijcleaow(this.input, dest, flags);
        dest.writeString(this.error);
    }
}
