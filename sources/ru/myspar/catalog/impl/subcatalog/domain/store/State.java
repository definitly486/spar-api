package ru.myspar.catalog.impl.subcatalog.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.core.domain.models.ColorsModel;

/* JADX INFO: renamed from: ru.myspar.catalog.impl.subcatalog.domain.store.SubCatalogStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJp\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004HÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0015H×\u0001¢\u0006\u0004\b!\u0010\u001bJ\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H×\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b>\u0010-¨\u0006?"}, d2 = {"ru/myspar/catalog/impl/subcatalog/domain/store/SubCatalogStore$State", "Landroid/os/Parcelable;", "Lru/myspar/catalog/api/model/SubCatalogArgs;", "args", "", "Lru/myspar/core/domain/models/catalog/CatalogSection;", "items", "", "title", "titleImage", "", "isLoading", "isInitialLoading", "Lru/myspar/core/domain/models/ColorsModel;", "colorsModel", "Lru/myspar/core/domain/models/catalog/CatalogBanner;", "banners", "<init>", "(Lru/myspar/catalog/api/model/SubCatalogArgs;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLru/myspar/core/domain/models/ColorsModel;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/catalog/impl/subcatalog/domain/store/SubCatalogStore$State;", "zoijcleaow", "(Lru/myspar/catalog/api/model/SubCatalogArgs;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLru/myspar/core/domain/models/ColorsModel;Ljava/util/List;)Lru/myspar/catalog/impl/subcatalog/domain/store/SubCatalogStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/catalog/api/model/SubCatalogArgs;", "eablkybsjg", "()Lru/myspar/catalog/api/model/SubCatalogArgs;", "yggfygwlhe", "Ljava/util/List;", "nufgyqmvbu", "()Ljava/util/List;", "jyumaefscl", "Ljava/lang/String;", "dxjokdxxww", "iwizpuwonk", "btonecajqb", "cqumvgiudr", "Z", "wflxmlrfwp", "()Z", "esjtqupxsv", "gtknphoqwx", "lereixgezr", "Lru/myspar/core/domain/models/ColorsModel;", "lqeggnwhkg", "()Lru/myspar/core/domain/models/ColorsModel;", "pmvmpeiblj", "gxszxtbevo", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInitialLoading;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleImage;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final ColorsModel colorsModel;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List banners;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final List items;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubCatalogArgs args;

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.subcatalog.domain.store.SubCatalogStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            SubCatalogArgs subCatalogArgs = (SubCatalogArgs) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            ColorsModel colorsModel = (ColorsModel) parcel.readParcelable(State.class.getClassLoader());
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            return new State(subCatalogArgs, arrayList, string, string2, z13, z14, colorsModel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    public State(SubCatalogArgs args, List items, String title, String str, boolean z13, boolean z14, ColorsModel colorsModel, List banners) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(banners, "banners");
        this.args = args;
        this.items = items;
        this.title = title;
        this.titleImage = str;
        this.isLoading = z13;
        this.isInitialLoading = z14;
        this.colorsModel = colorsModel;
        this.banners = banners;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final SubCatalogArgs getArgs() {
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
        return zdlpuopuiu.eablkybsjg(this.args, state.args) && zdlpuopuiu.eablkybsjg(this.items, state.items) && zdlpuopuiu.eablkybsjg(this.title, state.title) && zdlpuopuiu.eablkybsjg(this.titleImage, state.titleImage) && this.isLoading == state.isLoading && this.isInitialLoading == state.isInitialLoading && zdlpuopuiu.eablkybsjg(this.colorsModel, state.colorsModel) && zdlpuopuiu.eablkybsjg(this.banners, state.banners);
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getIsInitialLoading() {
        return this.isInitialLoading;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final List getBanners() {
        return this.banners;
    }

    public int hashCode() {
        int iHashCode = ((((this.args.hashCode() * 31) + this.items.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.titleImage;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isInitialLoading)) * 31;
        ColorsModel colorsModel = this.colorsModel;
        return ((iHashCode2 + (colorsModel != null ? colorsModel.hashCode() : 0)) * 31) + this.banners.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final ColorsModel getColorsModel() {
        return this.colorsModel;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public String toString() {
        return "State(args=" + this.args + ", items=" + this.items + ", title=" + this.title + ", titleImage=" + this.titleImage + ", isLoading=" + this.isLoading + ", isInitialLoading=" + this.isInitialLoading + ", colorsModel=" + this.colorsModel + ", banners=" + this.banners + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.args, flags);
        List list = this.items;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeString(this.title);
        dest.writeString(this.titleImage);
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isInitialLoading ? 1 : 0);
        dest.writeParcelable(this.colorsModel, flags);
        List list2 = this.banners;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
    }

    public final State zoijcleaow(SubCatalogArgs args, List items, String title, String titleImage, boolean isLoading, boolean isInitialLoading, ColorsModel colorsModel, List banners) {
        zdlpuopuiu.btonecajqb(args, "args");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(banners, "banners");
        return new State(args, items, title, titleImage, isLoading, isInitialLoading, colorsModel, banners);
    }

    public /* synthetic */ State(SubCatalogArgs subCatalogArgs, List list, String str, String str2, boolean z13, boolean z14, ColorsModel colorsModel, List list2, int i13, gtknphoqwx gtknphoqwxVar) {
        this(subCatalogArgs, (i13 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? true : z14, (i13 & 64) == 0 ? colorsModel : null, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list2);
    }
}
