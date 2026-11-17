package ru.myspar.catalog.impl.hint.dialog.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.api.model.HintDialogArgs;
import ru.myspar.common.view.hint.model.HintUiModel;

/* JADX INFO: renamed from: ru.myspar.catalog.impl.hint.dialog.domain.store.HintDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"ru/myspar/catalog/impl/hint/dialog/domain/store/HintDialogStore$State", "Landroid/os/Parcelable;", "Lru/myspar/catalog/api/model/HintDialogArgs;", "args", "Lru/myspar/common/view/hint/model/HintUiModel;", "hintUiModel", "<init>", "(Lru/myspar/catalog/api/model/HintDialogArgs;Lru/myspar/common/view/hint/model/HintUiModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/catalog/api/model/HintDialogArgs;", "zoijcleaow", "()Lru/myspar/catalog/api/model/HintDialogArgs;", "yggfygwlhe", "Lru/myspar/common/view/hint/model/HintUiModel;", "ppxfxbqfkf", "()Lru/myspar/common/view/hint/model/HintUiModel;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final HintUiModel hintUiModel;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final HintDialogArgs args;

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.hint.dialog.domain.store.HintDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((HintDialogArgs) parcel.readParcelable(State.class.getClassLoader()), (HintUiModel) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(HintDialogArgs args, HintUiModel hintUiModel) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(hintUiModel, "hintUiModel");
        this.args = args;
        this.hintUiModel = hintUiModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.args, state.args) && zdlpuopuiu.eablkybsjg(this.hintUiModel, state.hintUiModel);
    }

    public int hashCode() {
        return (this.args.hashCode() * 31) + this.hintUiModel.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final HintUiModel getHintUiModel() {
        return this.hintUiModel;
    }

    public String toString() {
        return "State(args=" + this.args + ", hintUiModel=" + this.hintUiModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.args, flags);
        dest.writeParcelable(this.hintUiModel, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final HintDialogArgs getArgs() {
        return this.args;
    }
}
