package ru.myspar.proloyalty.catalog.impl.choosesort.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mz0.ppxfxbqfkf;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;

/* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.choosesort.domain.ChooseSortDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fH×\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"ru/myspar/proloyalty/catalog/impl/choosesort/domain/ChooseSortDialogStore$State", "Landroid/os/Parcelable;", "Lmz0/ppxfxbqfkf;", "selected", "", "supportedTypes", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorsModel", "<init>", "(Lmz0/ppxfxbqfkf;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/ColorsModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lmz0/ppxfxbqfkf;", "ppxfxbqfkf", "()Lmz0/ppxfxbqfkf;", "yggfygwlhe", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "zoijcleaow", "()Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List supportedTypes;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf selected;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.choosesort.domain.ChooseSortDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ppxfxbqfkf ppxfxbqfkfVarValueOf = ppxfxbqfkf.valueOf(parcel.readString());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(ppxfxbqfkf.valueOf(parcel.readString()));
            }
            return new State(ppxfxbqfkfVarValueOf, arrayList, (ColorsModel) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(ppxfxbqfkf selected, List supportedTypes, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(selected, "selected");
        zdlpuopuiu.btonecajqb(supportedTypes, "supportedTypes");
        this.selected = selected;
        this.supportedTypes = supportedTypes;
        this.colorsModel = colorsModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getSupportedTypes() {
        return this.supportedTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.selected == state.selected && zdlpuopuiu.eablkybsjg(this.supportedTypes, state.supportedTypes) && zdlpuopuiu.eablkybsjg(this.colorsModel, state.colorsModel);
    }

    public int hashCode() {
        int iHashCode = ((this.selected.hashCode() * 31) + this.supportedTypes.hashCode()) * 31;
        ColorsModel colorsModel = this.colorsModel;
        return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final ppxfxbqfkf getSelected() {
        return this.selected;
    }

    public String toString() {
        return "State(selected=" + this.selected + ", supportedTypes=" + this.supportedTypes + ", colorsModel=" + this.colorsModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.selected.name());
        List list = this.supportedTypes;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(((ppxfxbqfkf) it.next()).name());
        }
        dest.writeParcelable(this.colorsModel, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }
}
