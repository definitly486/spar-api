package ru.myspar.domain.feature.savedcards.store;

import android.os.Parcel;
import android.os.Parcelable;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ru.myspar.domain.feature.savedcards.store.SavedCardsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH×\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"ru/myspar/domain/feature/savedcards/store/SavedCardsStore$State", "Landroid/os/Parcelable;", "", "isLoading", "", "Lru/myspar/core/domain/models/savedcards/Card;", "cards", "", "Lq10/iobyxmoadg;", "expandedQuestions", "<init>", "(ZLjava/util/List;Ljava/util/Set;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/savedcards/store/SavedCardsStore$State;", "zoijcleaow", "(ZLjava/util/List;Ljava/util/Set;)Lru/myspar/domain/feature/savedcards/store/SavedCardsStore$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "lqeggnwhkg", "()Z", "yggfygwlhe", "Ljava/util/List;", "eablkybsjg", "()Ljava/util/List;", "jyumaefscl", "Ljava/util/Set;", "gxszxtbevo", "()Ljava/util/Set;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set expandedQuestions;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List cards;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.savedcards.store.SavedCardsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            boolean z13 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i15 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                linkedHashSet.add(q10.iobyxmoadg.valueOf(parcel.readString()));
            }
            return new State(z13, arrayList, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(boolean z13, List cards, Set expandedQuestions) {
        zdlpuopuiu.btonecajqb(cards, "cards");
        zdlpuopuiu.btonecajqb(expandedQuestions, "expandedQuestions");
        this.isLoading = z13;
        this.cards = cards;
        this.expandedQuestions = expandedQuestions;
    }

    public static /* synthetic */ State ppxfxbqfkf(State state, boolean z13, List list, Set set, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = state.isLoading;
        }
        if ((i13 & 2) != 0) {
            list = state.cards;
        }
        if ((i13 & 4) != 0) {
            set = state.expandedQuestions;
        }
        return state.zoijcleaow(z13, list, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getCards() {
        return this.cards;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.cards, state.cards) && zdlpuopuiu.eablkybsjg(this.expandedQuestions, state.expandedQuestions);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final Set getExpandedQuestions() {
        return this.expandedQuestions;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.cards.hashCode()) * 31) + this.expandedQuestions.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "State(isLoading=" + this.isLoading + ", cards=" + this.cards + ", expandedQuestions=" + this.expandedQuestions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isLoading ? 1 : 0);
        List list = this.cards;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        Set set = this.expandedQuestions;
        dest.writeInt(set.size());
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            dest.writeString(((q10.iobyxmoadg) it2.next()).name());
        }
    }

    public final State zoijcleaow(boolean isLoading, List cards, Set expandedQuestions) {
        zdlpuopuiu.btonecajqb(cards, "cards");
        zdlpuopuiu.btonecajqb(expandedQuestions, "expandedQuestions");
        return new State(isLoading, cards, expandedQuestions);
    }

    public /* synthetic */ State(boolean z13, List list, Set set, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 4) != 0 ? ikoacuggdj.eablkybsjg() : set);
    }
}
