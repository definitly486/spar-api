package h30;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.shop.Shop;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l30.iobyxmoadg f39297zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f39298eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f39299iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f39300ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final LocationData f39301wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f39302zoijcleaow;

        public iobyxmoadg(List shops, LocationData locationData, LocationData startPoint, LocationData endPoint, List selectedServices) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(startPoint, "startPoint");
            zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f39299iobyxmoadg = shops;
            this.f39302zoijcleaow = locationData;
            this.f39300ppxfxbqfkf = startPoint;
            this.f39301wkgbmnqykc = endPoint;
            this.f39298eablkybsjg = selectedServices;
        }

        public final LocationData eablkybsjg() {
            return this.f39300ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f39299iobyxmoadg, iobyxmoadgVar.f39299iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39302zoijcleaow, iobyxmoadgVar.f39302zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f39300ppxfxbqfkf, iobyxmoadgVar.f39300ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f39301wkgbmnqykc, iobyxmoadgVar.f39301wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f39298eablkybsjg, iobyxmoadgVar.f39298eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f39299iobyxmoadg.hashCode() * 31;
            LocationData locationData = this.f39302zoijcleaow;
            return ((((((iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31) + this.f39300ppxfxbqfkf.hashCode()) * 31) + this.f39301wkgbmnqykc.hashCode()) * 31) + this.f39298eablkybsjg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f39301wkgbmnqykc;
        }

        public final List ppxfxbqfkf() {
            return this.f39299iobyxmoadg;
        }

        public String toString() {
            return "Params(shops=" + this.f39299iobyxmoadg + ", sortingPoint=" + this.f39302zoijcleaow + ", startPoint=" + this.f39300ppxfxbqfkf + ", endPoint=" + this.f39301wkgbmnqykc + ", selectedServices=" + this.f39298eablkybsjg + ")";
        }

        public final LocationData wkgbmnqykc() {
            return this.f39302zoijcleaow;
        }

        public final List zoijcleaow() {
            return this.f39298eablkybsjg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(l30.iobyxmoadg distanceCalculator, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(distanceCalculator, "distanceCalculator");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f39297zoijcleaow = distanceCalculator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int btonecajqb(Shop shop, Shop shop2) {
        return shop.getAddress().compareTo(shop2.getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int draadjrbmk(wkgbmnqykc wkgbmnqykcVar, LocationData locationData, Shop shop, Shop shop2) {
        l30.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f39297zoijcleaow;
        return Double.compare(((a10.iobyxmoadg) iobyxmoadgVar.iobyxmoadg(m30.zoijcleaow.iobyxmoadg(shop.btonecajqb()), locationData)).iobyxmoadg().doubleValue(), ((a10.iobyxmoadg) iobyxmoadgVar.iobyxmoadg(m30.zoijcleaow.iobyxmoadg(shop2.btonecajqb()), locationData)).iobyxmoadg().doubleValue());
    }

    private final Comparator dxjokdxxww() {
        return new Comparator() { // from class: h30.ppxfxbqfkf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wkgbmnqykc.btonecajqb((Shop) obj, (Shop) obj2);
            }
        };
    }

    private final Comparator gtknphoqwx(final LocationData locationData) {
        return new Comparator() { // from class: h30.zoijcleaow
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wkgbmnqykc.draadjrbmk(this.f39304zdlpuopuiu, locationData, (Shop) obj, (Shop) obj2);
            }
        };
    }

    private final List gxszxtbevo(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((Shop) obj).getServices().containsAll(list)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final zg.gxszxtbevo lqeggnwhkg(double d13, double d14) {
        return gtknphoqwx.zoijcleaow(Math.min(d13, d14), Math.max(d13, d14));
    }

    private final List nufgyqmvbu(List list, List list2) {
        return gxszxtbevo(list2, list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        Comparator comparatorDxjokdxxww;
        List listNufgyqmvbu = nufgyqmvbu(iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.zoijcleaow());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listNufgyqmvbu) {
            Shop shop = (Shop) obj;
            if (lqeggnwhkg(iobyxmoadgVar.eablkybsjg().getLatitude(), iobyxmoadgVar.iobyxmoadg().getLatitude()).iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(shop.getLat())) && lqeggnwhkg(iobyxmoadgVar.eablkybsjg().getLongitude(), iobyxmoadgVar.iobyxmoadg().getLongitude()).iobyxmoadg(kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(shop.getLng()))) {
                arrayList.add(obj);
            }
        }
        if (iobyxmoadgVar.wkgbmnqykc() == null || (comparatorDxjokdxxww = gtknphoqwx(iobyxmoadgVar.wkgbmnqykc())) == null) {
            comparatorDxjokdxxww = dxjokdxxww();
        }
        return jyumaefscl.d(arrayList, comparatorDxjokdxxww);
    }
}
