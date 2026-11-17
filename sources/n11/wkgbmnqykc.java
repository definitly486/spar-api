package n11;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.shop.Shop;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final r11.iobyxmoadg f68424zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f68425eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f68426iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final LocationData f68427ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final LocationData f68428wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f68429zoijcleaow;

        public iobyxmoadg(List shops, LocationData locationData, LocationData startPoint, LocationData endPoint, List selectedServices) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(startPoint, "startPoint");
            zdlpuopuiu.btonecajqb(endPoint, "endPoint");
            zdlpuopuiu.btonecajqb(selectedServices, "selectedServices");
            this.f68426iobyxmoadg = shops;
            this.f68429zoijcleaow = locationData;
            this.f68427ppxfxbqfkf = startPoint;
            this.f68428wkgbmnqykc = endPoint;
            this.f68425eablkybsjg = selectedServices;
        }

        public final LocationData eablkybsjg() {
            return this.f68427ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f68426iobyxmoadg, iobyxmoadgVar.f68426iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68429zoijcleaow, iobyxmoadgVar.f68429zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f68427ppxfxbqfkf, iobyxmoadgVar.f68427ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f68428wkgbmnqykc, iobyxmoadgVar.f68428wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f68425eablkybsjg, iobyxmoadgVar.f68425eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f68426iobyxmoadg.hashCode() * 31;
            LocationData locationData = this.f68429zoijcleaow;
            return ((((((iHashCode + (locationData == null ? 0 : locationData.hashCode())) * 31) + this.f68427ppxfxbqfkf.hashCode()) * 31) + this.f68428wkgbmnqykc.hashCode()) * 31) + this.f68425eablkybsjg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f68428wkgbmnqykc;
        }

        public final List ppxfxbqfkf() {
            return this.f68426iobyxmoadg;
        }

        public String toString() {
            return "Params(shops=" + this.f68426iobyxmoadg + ", sortingPoint=" + this.f68429zoijcleaow + ", startPoint=" + this.f68427ppxfxbqfkf + ", endPoint=" + this.f68428wkgbmnqykc + ", selectedServices=" + this.f68425eablkybsjg + ")";
        }

        public final LocationData wkgbmnqykc() {
            return this.f68429zoijcleaow;
        }

        public final List zoijcleaow() {
            return this.f68425eablkybsjg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(r11.iobyxmoadg distanceCalculator, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(distanceCalculator, "distanceCalculator");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f68424zoijcleaow = distanceCalculator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int btonecajqb(Shop shop, Shop shop2) {
        return shop.getAddress().compareTo(shop2.getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int draadjrbmk(wkgbmnqykc wkgbmnqykcVar, LocationData locationData, Shop shop, Shop shop2) {
        r11.iobyxmoadg iobyxmoadgVar = wkgbmnqykcVar.f68424zoijcleaow;
        return Double.compare(((rz0.iobyxmoadg) iobyxmoadgVar.iobyxmoadg(s11.zoijcleaow.iobyxmoadg(shop.btonecajqb()), locationData)).iobyxmoadg().doubleValue(), ((rz0.iobyxmoadg) iobyxmoadgVar.iobyxmoadg(s11.zoijcleaow.iobyxmoadg(shop2.btonecajqb()), locationData)).iobyxmoadg().doubleValue());
    }

    private final Comparator dxjokdxxww() {
        return new Comparator() { // from class: n11.ppxfxbqfkf
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wkgbmnqykc.btonecajqb((Shop) obj, (Shop) obj2);
            }
        };
    }

    private final Comparator gtknphoqwx(final LocationData locationData) {
        return new Comparator() { // from class: n11.zoijcleaow
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return wkgbmnqykc.draadjrbmk(this.f68431zdlpuopuiu, locationData, (Shop) obj, (Shop) obj2);
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
    @Override // zr0.ppxfxbqfkf
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
