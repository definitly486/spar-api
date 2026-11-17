package ru.myspar.domain.feature.shops.store;

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
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.CameraPosition;
import ru.myspar.core.domain.models.VisibleRegion;

/* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.ShopsStore$State, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+Bå\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020#H\u0007¢\u0006\u0004\b(\u0010)Jî\u0001\u0010+\u001a\u00020*2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020#H×\u0001¢\u0006\u0004\b/\u0010)J\u001a\u00102\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000100H×\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010.R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010GR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\b?\u0010GR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010GR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010GR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006¢\u0006\f\n\u0004\bM\u0010F\u001a\u0004\bN\u0010GR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bO\u0010B\u001a\u0004\bP\u0010DR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bC\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bW\u0010;R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\b8\u0010YR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bZ\u0010B\u001a\u0004\b[\u0010DR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bW\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u00109\u001a\u0004\bZ\u0010;¨\u0006`"}, d2 = {"ru/myspar/domain/feature/shops/store/ShopsStore$State", "Landroid/os/Parcelable;", "Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;", "flow", "", "isLoading", "", "bannerId", "blockId", "Lru/myspar/common/models/LocationData;", "userLocation", "", "Lru/myspar/core/domain/models/shop/ShopService;", "services", "selectedServices", "Lru/myspar/core/domain/models/shop/Shop;", "allShops", "mapShops", "visibleShops", "sortingPoint", "Lru/myspar/core/domain/models/VisibleRegion;", "lastFocusRegion", "Lru/myspar/core/domain/models/CameraPosition;", "lastCameraPosition", "isPositionCentered", "Lru/myspar/domain/feature/shops/store/ShopsStore$State$zoijcleaow;", "pageType", "centralPosition", "", "maxDistance", "isNeedScrollToTop", "<init>", "(Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;ZLjava/lang/String;Ljava/lang/String;Lru/myspar/common/models/LocationData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/myspar/common/models/LocationData;Lru/myspar/core/domain/models/VisibleRegion;Lru/myspar/core/domain/models/CameraPosition;ZLru/myspar/domain/feature/shops/store/ShopsStore$State$zoijcleaow;Lru/myspar/common/models/LocationData;Ljava/lang/Double;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lru/myspar/domain/feature/shops/store/ShopsStore$State;", "zoijcleaow", "(Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;ZLjava/lang/String;Ljava/lang/String;Lru/myspar/common/models/LocationData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/myspar/common/models/LocationData;Lru/myspar/core/domain/models/VisibleRegion;Lru/myspar/core/domain/models/CameraPosition;ZLru/myspar/domain/feature/shops/store/ShopsStore$State$zoijcleaow;Lru/myspar/common/models/LocationData;Ljava/lang/Double;Z)Lru/myspar/domain/feature/shops/store/ShopsStore$State;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;", "dxjokdxxww", "()Lru/myspar/domain/feature/shops/store/ShopsArgs$zoijcleaow;", "yggfygwlhe", "Z", "wwaezpbzkn", "()Z", "jyumaefscl", "Ljava/lang/String;", "gxszxtbevo", "iwizpuwonk", "lqeggnwhkg", "cqumvgiudr", "Lru/myspar/common/models/LocationData;", "iozdgvuglv", "()Lru/myspar/common/models/LocationData;", "esjtqupxsv", "Ljava/util/List;", "()Ljava/util/List;", "lereixgezr", "pmvmpeiblj", "eablkybsjg", "zynmafqrjb", "wflxmlrfwp", "istkbnxepw", "lmojexxdyd", "cdpycssgdh", "yadqdtsiqt", "Lru/myspar/core/domain/models/VisibleRegion;", "gtknphoqwx", "()Lru/myspar/core/domain/models/VisibleRegion;", "Lru/myspar/core/domain/models/CameraPosition;", "btonecajqb", "()Lru/myspar/core/domain/models/CameraPosition;", "pkzmftpjix", "Lru/myspar/domain/feature/shops/store/ShopsStore$State$zoijcleaow;", "()Lru/myspar/domain/feature/shops/store/ShopsStore$State$zoijcleaow;", "ylkuphrtab", "nufgyqmvbu", "Ljava/lang/Double;", "oxmwwwfdhm", "()Ljava/lang/Double;", "hcddaimhww", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData sortingPoint;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData userLocation;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final List services;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNeedScrollToTop;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata and from toString */
    private final CameraPosition lastCameraPosition;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata and from toString */
    private final List visibleShops;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blockId;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerId;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final List selectedServices;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPositionCentered;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double maxDistance;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final List allShops;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow pageType;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata and from toString */
    private final VisibleRegion lastFocusRegion;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationData centralPosition;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopsArgs.zoijcleaow flow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final List mapShops;

    /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.ShopsStore$State$iobyxmoadg */
    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final State createFromParcel(Parcel parcel) {
            Parcelable parcelable;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            ShopsArgs.zoijcleaow zoijcleaowVarValueOf = ShopsArgs.zoijcleaow.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            LocationData locationData = (LocationData) parcel.readParcelable(State.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i17 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList3.add(parcel.readParcelable(State.class.getClassLoader()));
            }
            int i19 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i19);
            int i23 = 0;
            while (true) {
                parcelable = parcel.readParcelable(State.class.getClassLoader());
                if (i23 == i19) {
                    break;
                }
                arrayList4.add(parcelable);
                i23++;
            }
            return new State(zoijcleaowVarValueOf, z13, string, string2, locationData, arrayList, arrayListCreateStringArrayList, arrayList2, arrayList3, arrayList4, (LocationData) parcelable, (VisibleRegion) parcel.readParcelable(State.class.getClassLoader()), (CameraPosition) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, zoijcleaow.valueOf(parcel.readString()), (LocationData) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final State[] newArray(int i13) {
            return new State[i13];
        }
    }

    /* JADX INFO: renamed from: ru.myspar.domain.feature.shops.store.ShopsStore$State$zoijcleaow */
    public enum zoijcleaow {
        MAP,
        LIST;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f87916iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public State(ShopsArgs.zoijcleaow flow, boolean z13, String bannerId, String blockId, LocationData locationData, List services, List selectedServices, List allShops, List mapShops, List visibleShops, LocationData locationData2, VisibleRegion visibleRegion, CameraPosition cameraPosition, boolean z14, zoijcleaow pageType, LocationData locationData3, Double d13, boolean z15) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        zdlpuopuiu.btonecajqb(services, "services");
        zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
        zdlpuopuiu.btonecajqb(allShops, "allShops");
        zdlpuopuiu.btonecajqb(mapShops, "mapShops");
        zdlpuopuiu.btonecajqb(visibleShops, "visibleShops");
        zdlpuopuiu.btonecajqb(pageType, "pageType");
        this.flow = flow;
        this.isLoading = z13;
        this.bannerId = bannerId;
        this.blockId = blockId;
        this.userLocation = locationData;
        this.services = services;
        this.selectedServices = selectedServices;
        this.allShops = allShops;
        this.mapShops = mapShops;
        this.visibleShops = visibleShops;
        this.sortingPoint = locationData2;
        this.lastFocusRegion = visibleRegion;
        this.lastCameraPosition = cameraPosition;
        this.isPositionCentered = z14;
        this.pageType = pageType;
        this.centralPosition = locationData3;
        this.maxDistance = d13;
        this.isNeedScrollToTop = z15;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final CameraPosition getLastCameraPosition() {
        return this.lastCameraPosition;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final ShopsArgs.zoijcleaow getFlow() {
        return this.flow;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final List getAllShops() {
        return this.allShops;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.flow == state.flow && this.isLoading == state.isLoading && zdlpuopuiu.eablkybsjg(this.bannerId, state.bannerId) && zdlpuopuiu.eablkybsjg(this.blockId, state.blockId) && zdlpuopuiu.eablkybsjg(this.userLocation, state.userLocation) && zdlpuopuiu.eablkybsjg(this.services, state.services) && zdlpuopuiu.eablkybsjg(this.selectedServices, state.selectedServices) && zdlpuopuiu.eablkybsjg(this.allShops, state.allShops) && zdlpuopuiu.eablkybsjg(this.mapShops, state.mapShops) && zdlpuopuiu.eablkybsjg(this.visibleShops, state.visibleShops) && zdlpuopuiu.eablkybsjg(this.sortingPoint, state.sortingPoint) && zdlpuopuiu.eablkybsjg(this.lastFocusRegion, state.lastFocusRegion) && zdlpuopuiu.eablkybsjg(this.lastCameraPosition, state.lastCameraPosition) && this.isPositionCentered == state.isPositionCentered && this.pageType == state.pageType && zdlpuopuiu.eablkybsjg(this.centralPosition, state.centralPosition) && zdlpuopuiu.eablkybsjg(this.maxDistance, state.maxDistance) && this.isNeedScrollToTop == state.isNeedScrollToTop;
    }

    /* JADX INFO: renamed from: esjtqupxsv, reason: from getter */
    public final List getServices() {
        return this.services;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final VisibleRegion getLastFocusRegion() {
        return this.lastFocusRegion;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getBannerId() {
        return this.bannerId;
    }

    public int hashCode() {
        int iHashCode = ((((((this.flow.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.bannerId.hashCode()) * 31) + this.blockId.hashCode()) * 31;
        LocationData locationData = this.userLocation;
        int iHashCode2 = (((((((((((iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31) + this.services.hashCode()) * 31) + this.selectedServices.hashCode()) * 31) + this.allShops.hashCode()) * 31) + this.mapShops.hashCode()) * 31) + this.visibleShops.hashCode()) * 31;
        LocationData locationData2 = this.sortingPoint;
        int iHashCode3 = (iHashCode2 + (locationData2 == null ? 0 : locationData2.hashCode())) * 31;
        VisibleRegion visibleRegion = this.lastFocusRegion;
        int iHashCode4 = (iHashCode3 + (visibleRegion == null ? 0 : visibleRegion.hashCode())) * 31;
        CameraPosition cameraPosition = this.lastCameraPosition;
        int iHashCode5 = (((((iHashCode4 + (cameraPosition == null ? 0 : cameraPosition.hashCode())) * 31) + Boolean.hashCode(this.isPositionCentered)) * 31) + this.pageType.hashCode()) * 31;
        LocationData locationData3 = this.centralPosition;
        int iHashCode6 = (iHashCode5 + (locationData3 == null ? 0 : locationData3.hashCode())) * 31;
        Double d13 = this.maxDistance;
        return ((iHashCode6 + (d13 != null ? d13.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNeedScrollToTop);
    }

    /* JADX INFO: renamed from: iozdgvuglv, reason: from getter */
    public final LocationData getUserLocation() {
        return this.userLocation;
    }

    /* JADX INFO: renamed from: iwizpuwonk, reason: from getter */
    public final List getSelectedServices() {
        return this.selectedServices;
    }

    /* JADX INFO: renamed from: lmojexxdyd, reason: from getter */
    public final List getVisibleShops() {
        return this.visibleShops;
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getBlockId() {
        return this.blockId;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final LocationData getCentralPosition() {
        return this.centralPosition;
    }

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: from getter */
    public final Double getMaxDistance() {
        return this.maxDistance;
    }

    /* JADX INFO: renamed from: pkzmftpjix, reason: from getter */
    public final boolean getIsPositionCentered() {
        return this.isPositionCentered;
    }

    public String toString() {
        return "State(flow=" + this.flow + ", isLoading=" + this.isLoading + ", bannerId=" + this.bannerId + ", blockId=" + this.blockId + ", userLocation=" + this.userLocation + ", services=" + this.services + ", selectedServices=" + this.selectedServices + ", allShops=" + this.allShops + ", mapShops=" + this.mapShops + ", visibleShops=" + this.visibleShops + ", sortingPoint=" + this.sortingPoint + ", lastFocusRegion=" + this.lastFocusRegion + ", lastCameraPosition=" + this.lastCameraPosition + ", isPositionCentered=" + this.isPositionCentered + ", pageType=" + this.pageType + ", centralPosition=" + this.centralPosition + ", maxDistance=" + this.maxDistance + ", isNeedScrollToTop=" + this.isNeedScrollToTop + ")";
    }

    /* JADX INFO: renamed from: wflxmlrfwp, reason: from getter */
    public final List getMapShops() {
        return this.mapShops;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeString(this.bannerId);
        dest.writeString(this.blockId);
        dest.writeParcelable(this.userLocation, flags);
        List list = this.services;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), flags);
        }
        dest.writeStringList(this.selectedServices);
        List list2 = this.allShops;
        dest.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), flags);
        }
        List list3 = this.mapShops;
        dest.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable((Parcelable) it3.next(), flags);
        }
        List list4 = this.visibleShops;
        dest.writeInt(list4.size());
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            dest.writeParcelable((Parcelable) it4.next(), flags);
        }
        dest.writeParcelable(this.sortingPoint, flags);
        dest.writeParcelable(this.lastFocusRegion, flags);
        dest.writeParcelable(this.lastCameraPosition, flags);
        dest.writeInt(this.isPositionCentered ? 1 : 0);
        dest.writeString(this.pageType.name());
        dest.writeParcelable(this.centralPosition, flags);
        Double d13 = this.maxDistance;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        dest.writeInt(this.isNeedScrollToTop ? 1 : 0);
    }

    /* JADX INFO: renamed from: wwaezpbzkn, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: yadqdtsiqt, reason: from getter */
    public final LocationData getSortingPoint() {
        return this.sortingPoint;
    }

    /* JADX INFO: renamed from: yggfygwlhe, reason: from getter */
    public final zoijcleaow getPageType() {
        return this.pageType;
    }

    /* JADX INFO: renamed from: ylkuphrtab, reason: from getter */
    public final boolean getIsNeedScrollToTop() {
        return this.isNeedScrollToTop;
    }

    public final State zoijcleaow(ShopsArgs.zoijcleaow flow, boolean isLoading, String bannerId, String blockId, LocationData userLocation, List services, List selectedServices, List allShops, List mapShops, List visibleShops, LocationData sortingPoint, VisibleRegion lastFocusRegion, CameraPosition lastCameraPosition, boolean isPositionCentered, zoijcleaow pageType, LocationData centralPosition, Double maxDistance, boolean isNeedScrollToTop) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        zdlpuopuiu.btonecajqb(services, "services");
        zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
        zdlpuopuiu.btonecajqb(allShops, "allShops");
        zdlpuopuiu.btonecajqb(mapShops, "mapShops");
        zdlpuopuiu.btonecajqb(visibleShops, "visibleShops");
        zdlpuopuiu.btonecajqb(pageType, "pageType");
        return new State(flow, isLoading, bannerId, blockId, userLocation, services, selectedServices, allShops, mapShops, visibleShops, sortingPoint, lastFocusRegion, lastCameraPosition, isPositionCentered, pageType, centralPosition, maxDistance, isNeedScrollToTop);
    }

    public /* synthetic */ State(ShopsArgs.zoijcleaow zoijcleaowVar, boolean z13, String str, String str2, LocationData locationData, List list, List list2, List list3, List list4, List list5, LocationData locationData2, VisibleRegion visibleRegion, CameraPosition cameraPosition, boolean z14, zoijcleaow zoijcleaowVar2, LocationData locationData3, Double d13, boolean z15, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? ShopsArgs.zoijcleaow.DEFAULT : zoijcleaowVar, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? "" : str, (i13 & 8) == 0 ? str2 : "", (i13 & 16) != 0 ? null : locationData, (i13 & 32) != 0 ? jyumaefscl.wflxmlrfwp() : list, (i13 & 64) != 0 ? jyumaefscl.wflxmlrfwp() : list2, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jyumaefscl.wflxmlrfwp() : list3, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jyumaefscl.wflxmlrfwp() : list4, (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jyumaefscl.wflxmlrfwp() : list5, (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : locationData2, (i13 & 2048) != 0 ? null : visibleRegion, (i13 & 4096) != 0 ? null : cameraPosition, (i13 & 8192) != 0 ? false : z14, (i13 & 16384) != 0 ? zoijcleaow.MAP : zoijcleaowVar2, (i13 & 32768) != 0 ? null : locationData3, (i13 & 65536) != 0 ? null : d13, (i13 & 131072) != 0 ? false : z15);
    }
}
