package d20;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.shop.Shop;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f26830ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l30.iobyxmoadg f26831zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f26832iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f26833zoijcleaow;

        public zoijcleaow(List shops, LocationData locationData) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            zdlpuopuiu.btonecajqb(locationData, "locationData");
            this.f26832iobyxmoadg = shops;
            this.f26833zoijcleaow = locationData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f26832iobyxmoadg, zoijcleaowVar.f26832iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f26833zoijcleaow, zoijcleaowVar.f26833zoijcleaow);
        }

        public int hashCode() {
            return (this.f26832iobyxmoadg.hashCode() * 31) + this.f26833zoijcleaow.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f26833zoijcleaow;
        }

        public String toString() {
            return "Params(shops=" + this.f26832iobyxmoadg + ", locationData=" + this.f26833zoijcleaow + ")";
        }

        public final List zoijcleaow() {
            return this.f26832iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(l30.iobyxmoadg distanceCalculator, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(distanceCalculator, "distanceCalculator");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f26831zoijcleaow = distanceCalculator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        LocationData locationDataIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        List listZoijcleaow = zoijcleaowVar.zoijcleaow();
        Double dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(0.0d);
        Iterator it = listZoijcleaow.iterator();
        while (it.hasNext()) {
            dZoijcleaow = kotlin.coroutines.jvm.internal.zoijcleaow.zoijcleaow(Math.max(dZoijcleaow.doubleValue(), ((a10.iobyxmoadg) this.f26831zoijcleaow.iobyxmoadg(m30.zoijcleaow.iobyxmoadg(((Shop) it.next()).btonecajqb()), locationDataIobyxmoadg)).iobyxmoadg().doubleValue()));
        }
        return dZoijcleaow;
    }
}
