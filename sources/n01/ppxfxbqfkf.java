package n01;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;
import ru.myspar.proloyalty.core.domain.models.shop.Shop;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f68383ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final r11.iobyxmoadg f68384zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f68385iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f68386zoijcleaow;

        public zoijcleaow(List shops, LocationData locationData) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f68385iobyxmoadg = shops;
            this.f68386zoijcleaow = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f68385iobyxmoadg, zoijcleaowVar.f68385iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68386zoijcleaow, zoijcleaowVar.f68386zoijcleaow);
        }

        public int hashCode() {
            return (this.f68385iobyxmoadg.hashCode() * 31) + this.f68386zoijcleaow.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f68386zoijcleaow;
        }

        public String toString() {
            return "Params(shops=" + this.f68385iobyxmoadg + ", locationData=" + this.f68386zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f68385iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(r11.iobyxmoadg distanceCalculator, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(distanceCalculator, "distanceCalculator");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f68384zoijcleaow = distanceCalculator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        LocationData locationDataIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        List listZoijcleaow = zoijcleaowVar.zoijcleaow();
        Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(0.0d);
        Iterator it = listZoijcleaow.iterator();
        while (it.hasNext()) {
            dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(Math.max(dZoijcleaow.doubleValue(), ((rz0.iobyxmoadg) this.f68384zoijcleaow.iobyxmoadg(s11.zoijcleaow.iobyxmoadg(((Shop) it.next()).btonecajqb()), locationDataIobyxmoadg)).iobyxmoadg().doubleValue()));
        }
        return dZoijcleaow;
    }
}
