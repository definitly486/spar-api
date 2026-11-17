package ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;

/* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"ru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogStore$State", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;", "selectedProductFirst", "selectedProductSecond", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "comboSet", "<init>", "(Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogStore$State;", "zoijcleaow", "(Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;)Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;", "gxszxtbevo", "()Lru/myspar/proloyalty/core/domain/models/comboset/ComboSetProduct;", "yggfygwlhe", "lqeggnwhkg", "jyumaefscl", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "eablkybsjg", "()Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboSet comboSet;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboSetProduct selectedProductSecond;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboSetProduct selectedProductFirst;

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new State((ComboSetProduct) parcel.readParcelable(State.class.getClassLoader()), (ComboSetProduct) parcel.readParcelable(State.class.getClassLoader()), (ComboSet) parcel.readParcelable(State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(ComboSetProduct selectedProductFirst, ComboSetProduct selectedProductSecond, ComboSet comboSet) {
        zdlpuopuiu.btonecajqb(selectedProductFirst, "selectedProductFirst");
        zdlpuopuiu.btonecajqb(selectedProductSecond, "selectedProductSecond");
        zdlpuopuiu.btonecajqb(comboSet, "comboSet");
        this.selectedProductFirst = selectedProductFirst;
        this.selectedProductSecond = selectedProductSecond;
        this.comboSet = comboSet;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, ComboSetProduct comboSetProduct, ComboSetProduct comboSetProduct2, ComboSet comboSet, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            comboSetProduct = state.selectedProductFirst;
        }
        if ((i13 & 2) != 0) {
            comboSetProduct2 = state.selectedProductSecond;
        }
        if ((i13 & 4) != 0) {
            comboSet = state.comboSet;
        }
        return state.zoijcleaow(comboSetProduct, comboSetProduct2, comboSet);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final ComboSet getComboSet() {
        return this.comboSet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return zdlpuopuiu.eablkybsjg(this.selectedProductFirst, state.selectedProductFirst) && zdlpuopuiu.eablkybsjg(this.selectedProductSecond, state.selectedProductSecond) && zdlpuopuiu.eablkybsjg(this.comboSet, state.comboSet);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final ComboSetProduct getSelectedProductFirst() {
        return this.selectedProductFirst;
    }

    public int hashCode() {
        return (((this.selectedProductFirst.hashCode() * 31) + this.selectedProductSecond.hashCode()) * 31) + this.comboSet.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ComboSetProduct getSelectedProductSecond() {
        return this.selectedProductSecond;
    }

    public String toString() {
        return "State(selectedProductFirst=" + this.selectedProductFirst + ", selectedProductSecond=" + this.selectedProductSecond + ", comboSet=" + this.comboSet + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.selectedProductFirst, flags);
        dest.writeParcelable(this.selectedProductSecond, flags);
        dest.writeParcelable(this.comboSet, flags);
    }

    public final State zoijcleaow(ComboSetProduct selectedProductFirst, ComboSetProduct selectedProductSecond, ComboSet comboSet) {
        zdlpuopuiu.btonecajqb(selectedProductFirst, "selectedProductFirst");
        zdlpuopuiu.btonecajqb(selectedProductSecond, "selectedProductSecond");
        zdlpuopuiu.btonecajqb(comboSet, "comboSet");
        return new State(selectedProductFirst, selectedProductSecond, comboSet);
    }
}
