package ru.myspar.proloyalty.scan.impl.scan_screen.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scan.api.model.ScanScreenPayload;

/* JADX INFO: renamed from: ru.myspar.proloyalty.scan.impl.scan_screen.domain.ScanScreenStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"ru/myspar/proloyalty/scan/impl/scan_screen/domain/ScanScreenStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/scan/api/model/ScanScreenPayload;", "args", "", "isFlashVisibility", "isFlashEnabled", "<init>", "(Lru/myspar/proloyalty/scan/api/model/ScanScreenPayload;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/scan/impl/scan_screen/domain/ScanScreenStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/scan/api/model/ScanScreenPayload;ZZ)Lru/myspar/proloyalty/scan/impl/scan_screen/domain/ScanScreenStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/scan/api/model/ScanScreenPayload;", "eablkybsjg", "()Lru/myspar/proloyalty/scan/api/model/ScanScreenPayload;", "yggfygwlhe", "Z", "lqeggnwhkg", "()Z", "jyumaefscl", "gxszxtbevo", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFlashEnabled;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFlashVisibility;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanScreenPayload args;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scan.impl.scan_screen.domain.ScanScreenStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((ScanScreenPayload) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(ScanScreenPayload args, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(args, "args");
        this.args = args;
        this.isFlashVisibility = z13;
        this.isFlashEnabled = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, ScanScreenPayload scanScreenPayload, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            scanScreenPayload = state.args;
        }
        if ((i13 & 2) != 0) {
            z13 = state.isFlashVisibility;
        }
        if ((i13 & 4) != 0) {
            z14 = state.isFlashEnabled;
        }
        return state.zoijcleaow(scanScreenPayload, z13, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ScanScreenPayload getArgs() {
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
        return zdlpuopuiu.eablkybsjg(this.args, state.args) && this.isFlashVisibility == state.isFlashVisibility && this.isFlashEnabled == state.isFlashEnabled;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsFlashEnabled() {
        return this.isFlashEnabled;
    }

    public int hashCode() {
        return (((this.args.hashCode() * 31) + Boolean.hashCode(this.isFlashVisibility)) * 31) + Boolean.hashCode(this.isFlashEnabled);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsFlashVisibility() {
        return this.isFlashVisibility;
    }

    public String toString() {
        return "State(args=" + this.args + ", isFlashVisibility=" + this.isFlashVisibility + ", isFlashEnabled=" + this.isFlashEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.args, flags);
        dest.writeInt(this.isFlashVisibility ? 1 : 0);
        dest.writeInt(this.isFlashEnabled ? 1 : 0);
    }

    public final State zoijcleaow(ScanScreenPayload args, boolean isFlashVisibility, boolean isFlashEnabled) {
        zdlpuopuiu.btonecajqb(args, "args");
        return new State(args, isFlashVisibility, isFlashEnabled);
    }

    public /* synthetic */ State(ScanScreenPayload scanScreenPayload, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        this(scanScreenPayload, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14);
    }
}
