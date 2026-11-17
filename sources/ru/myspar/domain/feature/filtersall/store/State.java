package ru.myspar.domain.feature.filtersall.store;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsModel;

/* JADX INFO: renamed from: ru.myspar.domain.feature.filtersall.store.FiltersAllStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"ru/myspar/domain/feature/filtersall/store/FiltersAllStore$State", "Landroid/os/Parcelable;", "Lru/myspar/domain/feature/filtersall/store/FiltersAllArgs;", "args", "", "titleFilterSection", "", "isEnableApplyButton", "", "Lru/myspar/core/domain/models/product/FilterValue;", "filterValues", "", "checkedFilterIds", "Lru/myspar/core/domain/models/ColorsModel;", "colorsModel", "<init>", "(Lru/myspar/domain/feature/filtersall/store/FiltersAllArgs;Ljava/lang/String;ZLjava/util/List;Ljava/util/Set;Lru/myspar/core/domain/models/ColorsModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/filtersall/store/FiltersAllStore$State;", "zoijcleaow", "(Lru/myspar/domain/feature/filtersall/store/FiltersAllArgs;Ljava/lang/String;ZLjava/util/List;Ljava/util/Set;Lru/myspar/core/domain/models/ColorsModel;)Lru/myspar/domain/feature/filtersall/store/FiltersAllStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/domain/feature/filtersall/store/FiltersAllArgs;", "eablkybsjg", "()Lru/myspar/domain/feature/filtersall/store/FiltersAllArgs;", "yggfygwlhe", "Ljava/lang/String;", "dxjokdxxww", "jyumaefscl", "Z", "btonecajqb", "()Z", "iwizpuwonk", "Ljava/util/List;", "nufgyqmvbu", "()Ljava/util/List;", "cqumvgiudr", "Ljava/util/Set;", "gxszxtbevo", "()Ljava/util/Set;", "esjtqupxsv", "Lru/myspar/core/domain/models/ColorsModel;", "lqeggnwhkg", "()Lru/myspar/core/domain/models/ColorsModel;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set checkedFilterIds;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final List filterValues;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnableApplyButton;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleFilterSection;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final FiltersAllArgs args;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.filtersall.store.FiltersAllStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            FiltersAllArgs filtersAllArgsCreateFromParcel = FiltersAllArgs.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i15 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashSet.add(parcel.readString());
            }
            return new State(filtersAllArgsCreateFromParcel, string, z13, arrayList, linkedHashSet, (ColorsModel) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(FiltersAllArgs args, String titleFilterSection, boolean z13, List filterValues, Set checkedFilterIds, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(titleFilterSection, "titleFilterSection");
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        zdlpuopuiu.btonecajqb(checkedFilterIds, "checkedFilterIds");
        this.args = args;
        this.titleFilterSection = titleFilterSection;
        this.isEnableApplyButton = z13;
        this.filterValues = filterValues;
        this.checkedFilterIds = checkedFilterIds;
        this.colorsModel = colorsModel;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, FiltersAllArgs filtersAllArgs, String str, boolean z13, List list, Set set, ColorsModel colorsModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filtersAllArgs = state.args;
        }
        if ((i13 & 2) != 0) {
            str = state.titleFilterSection;
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            z13 = state.isEnableApplyButton;
        }
        boolean z14 = z13;
        if ((i13 & 8) != 0) {
            list = state.filterValues;
        }
        List list2 = list;
        if ((i13 & 16) != 0) {
            set = state.checkedFilterIds;
        }
        Set set2 = set;
        if ((i13 & 32) != 0) {
            colorsModel = state.colorsModel;
        }
        return state.zoijcleaow(filtersAllArgs, str2, z14, list2, set2, colorsModel);
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final boolean getIsEnableApplyButton() {
        return this.isEnableApplyButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getTitleFilterSection() {
        return this.titleFilterSection;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final FiltersAllArgs getArgs() {
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
        return zdlpuopuiu.eablkybsjg(this.args, state.args) && zdlpuopuiu.eablkybsjg(this.titleFilterSection, state.titleFilterSection) && this.isEnableApplyButton == state.isEnableApplyButton && zdlpuopuiu.eablkybsjg(this.filterValues, state.filterValues) && zdlpuopuiu.eablkybsjg(this.checkedFilterIds, state.checkedFilterIds) && zdlpuopuiu.eablkybsjg(this.colorsModel, state.colorsModel);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Set getCheckedFilterIds() {
        return this.checkedFilterIds;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.args.hashCode() * 31) + this.titleFilterSection.hashCode()) * 31) + Boolean.hashCode(this.isEnableApplyButton)) * 31) + this.filterValues.hashCode()) * 31) + this.checkedFilterIds.hashCode()) * 31;
        ColorsModel colorsModel = this.colorsModel;
        return iHashCode + (colorsModel == null ? 0 : colorsModel.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getFilterValues() {
        return this.filterValues;
    }

    public String toString() {
        return "State(args=" + this.args + ", titleFilterSection=" + this.titleFilterSection + ", isEnableApplyButton=" + this.isEnableApplyButton + ", filterValues=" + this.filterValues + ", checkedFilterIds=" + this.checkedFilterIds + ", colorsModel=" + this.colorsModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        this.args.writeToParcel(dest, flags);
        dest.writeString(this.titleFilterSection);
        dest.writeInt(this.isEnableApplyButton ? 1 : 0);
        List list = this.filterValues;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        Set set = this.checkedFilterIds;
        dest.writeInt(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            dest.writeString((String) it2.next());
        }
        dest.writeParcelable(this.colorsModel, flags);
    }

    public final State zoijcleaow(FiltersAllArgs args, String titleFilterSection, boolean isEnableApplyButton, List filterValues, Set checkedFilterIds, ColorsModel colorsModel) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(titleFilterSection, "titleFilterSection");
        zdlpuopuiu.btonecajqb(filterValues, "filterValues");
        zdlpuopuiu.btonecajqb(checkedFilterIds, "checkedFilterIds");
        return new State(args, titleFilterSection, isEnableApplyButton, filterValues, checkedFilterIds, colorsModel);
    }
}
