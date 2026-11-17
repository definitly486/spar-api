package ru.myspar.tipsorder.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.tipsorder.impl.domain.model.TipsOrderParams;

/* JADX INFO: renamed from: ru.myspar.tipsorder.impl.domain.store.TipsOrderStore$State, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&¨\u00061"}, d2 = {"ru/myspar/tipsorder/impl/domain/store/TipsOrderStore$State", "Landroid/os/Parcelable;", "", "orderId", "", "tipsIsSending", "Lru/myspar/tipsorder/impl/domain/model/TipsOrderParams;", "tipsOrderParams", "Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$TipsMessage;", "message", "verifyFlag", "<init>", "(Ljava/lang/String;ZLru/myspar/tipsorder/impl/domain/model/TipsOrderParams;Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$TipsMessage;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$State;", "zoijcleaow", "(Ljava/lang/String;ZLru/myspar/tipsorder/impl/domain/model/TipsOrderParams;Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$TipsMessage;Z)Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "gxszxtbevo", "yggfygwlhe", "Z", "lqeggnwhkg", "()Z", "jyumaefscl", "Lru/myspar/tipsorder/impl/domain/model/TipsOrderParams;", "nufgyqmvbu", "()Lru/myspar/tipsorder/impl/domain/model/TipsOrderParams;", "iwizpuwonk", "Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$TipsMessage;", "eablkybsjg", "()Lru/myspar/tipsorder/impl/domain/store/TipsOrderStore$TipsMessage;", "cqumvgiudr", "dxjokdxxww", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean verifyFlag;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipsOrderStore$TipsMessage message;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipsOrderParams tipsOrderParams;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tipsIsSending;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX INFO: renamed from: ru.myspar.tipsorder.impl.domain.store.TipsOrderStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : TipsOrderParams.CREATOR.createFromParcel(parcel), (TipsOrderStore$TipsMessage) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(String orderId, boolean z13, TipsOrderParams tipsOrderParams, TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage, boolean z14) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        this.orderId = orderId;
        this.tipsIsSending = z13;
        this.tipsOrderParams = tipsOrderParams;
        this.message = tipsOrderStore$TipsMessage;
        this.verifyFlag = z14;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, String str, boolean z13, TipsOrderParams tipsOrderParams, TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = state.orderId;
        }
        if ((i13 & 2) != 0) {
            z13 = state.tipsIsSending;
        }
        boolean z15 = z13;
        if ((i13 & 4) != 0) {
            tipsOrderParams = state.tipsOrderParams;
        }
        TipsOrderParams tipsOrderParams2 = tipsOrderParams;
        if ((i13 & 8) != 0) {
            tipsOrderStore$TipsMessage = state.message;
        }
        TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage2 = tipsOrderStore$TipsMessage;
        if ((i13 & 16) != 0) {
            z14 = state.verifyFlag;
        }
        return state.zoijcleaow(str, z15, tipsOrderParams2, tipsOrderStore$TipsMessage2, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final boolean getVerifyFlag() {
        return this.verifyFlag;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final TipsOrderStore$TipsMessage getMessage() {
        return this.message;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.orderId, state.orderId) && this.tipsIsSending == state.tipsIsSending && zdlpuopuiu.eablkybsjg(this.tipsOrderParams, state.tipsOrderParams) && zdlpuopuiu.eablkybsjg(this.message, state.message) && this.verifyFlag == state.verifyFlag;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        int iHashCode = ((this.orderId.hashCode() * 31) + Boolean.hashCode(this.tipsIsSending)) * 31;
        TipsOrderParams tipsOrderParams = this.tipsOrderParams;
        int iHashCode2 = (iHashCode + (tipsOrderParams == null ? 0 : tipsOrderParams.hashCode())) * 31;
        TipsOrderStore$TipsMessage tipsOrderStore$TipsMessage = this.message;
        return ((iHashCode2 + (tipsOrderStore$TipsMessage != null ? tipsOrderStore$TipsMessage.hashCode() : 0)) * 31) + Boolean.hashCode(this.verifyFlag);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getTipsIsSending() {
        return this.tipsIsSending;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final TipsOrderParams getTipsOrderParams() {
        return this.tipsOrderParams;
    }

    public String toString() {
        return "State(orderId=" + this.orderId + ", tipsIsSending=" + this.tipsIsSending + ", tipsOrderParams=" + this.tipsOrderParams + ", message=" + this.message + ", verifyFlag=" + this.verifyFlag + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeInt(this.tipsIsSending ? 1 : 0);
        TipsOrderParams tipsOrderParams = this.tipsOrderParams;
        if (tipsOrderParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tipsOrderParams.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.message, flags);
        dest.writeInt(this.verifyFlag ? 1 : 0);
    }

    public final State zoijcleaow(String orderId, boolean tipsIsSending, TipsOrderParams tipsOrderParams, TipsOrderStore$TipsMessage message, boolean verifyFlag) {
        zdlpuopuiu.btonecajqb(orderId, "orderId");
        return new State(orderId, tipsIsSending, tipsOrderParams, message, verifyFlag);
    }
}
