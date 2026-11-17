package ru.myspar.proloyalty.auth.impl.domain.authorization.store;

import android.os.Parcel;
import android.os.Parcelable;
import j0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.authorization.store.AuthorizationStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"ru/myspar/proloyalty/auth/impl/domain/authorization/store/AuthorizationStore$State", "Landroid/os/Parcelable;", "Lp0/tzroggbefp;", "phoneNumber", "", "isLoading", "<init>", "(Lp0/tzroggbefp;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/auth/impl/domain/authorization/store/AuthorizationStore$State;", "zoijcleaow", "(Lp0/tzroggbefp;Z)Lru/myspar/proloyalty/auth/impl/domain/authorization/store/AuthorizationStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lp0/tzroggbefp;", "eablkybsjg", "()Lp0/tzroggbefp;", "yggfygwlhe", "Z", "gxszxtbevo", "()Z", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final tzroggbefp phoneNumber;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.auth.impl.domain.authorization.store.AuthorizationStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(yr0.iobyxmoadg.f126300iobyxmoadg.iobyxmoadg(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(tzroggbefp phoneNumber, boolean z13) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        this.isLoading = z13;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, tzroggbefp tzroggbefpVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tzroggbefpVar = state.phoneNumber;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isLoading;
        }
        return state.zoijcleaow(tzroggbefpVar, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final tzroggbefp getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.phoneNumber, state.phoneNumber) && this.isLoading == state.isLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return (this.phoneNumber.hashCode() * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "State(phoneNumber=" + this.phoneNumber + ", isLoading=" + this.isLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        yr0.iobyxmoadg.f126300iobyxmoadg.zoijcleaow(this.phoneNumber, dest, flags);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public final State zoijcleaow(tzroggbefp phoneNumber, boolean isLoading) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        return new State(phoneNumber, isLoading);
    }

    public /* synthetic */ State(tzroggbefp tzroggbefpVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new tzroggbefp((String) null, 0L, (l) null, 7, (gtknphoqwx) null) : tzroggbefpVar, (i13 & 2) != 0 ? false : z13);
    }
}
