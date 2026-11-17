package d20;

import gg.vdvldrhtss;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;
import ru.myspar.core.domain.models.shop.Shop;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C0485iobyxmoadg f26828zoijcleaow = new C0485iobyxmoadg(null);

    /* JADX INFO: renamed from: d20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0485iobyxmoadg {
        public /* synthetic */ C0485iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0485iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f26829iobyxmoadg;

        public zoijcleaow(List shops) {
            zdlpuopuiu.btonecajqb(shops, "shops");
            this.f26829iobyxmoadg = shops;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f26829iobyxmoadg, ((zoijcleaow) obj).f26829iobyxmoadg);
        }

        public int hashCode() {
            return this.f26829iobyxmoadg.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f26829iobyxmoadg;
        }

        public String toString() {
            return "Params(shops=" + this.f26829iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        List<Shop> listIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        vdvldrhtss vdvldrhtssVar = new vdvldrhtss(new LocationData(0.0d, 0.0d), new LocationData(0.0d, 0.0d));
        for (Shop shop : listIobyxmoadg) {
            vdvldrhtssVar = new vdvldrhtss(new LocationData(Math.max(((LocationData) vdvldrhtssVar.lqeggnwhkg()).getLatitude(), shop.getLat()), Math.min(((LocationData) vdvldrhtssVar.lqeggnwhkg()).getLongitude() == 0.0d ? shop.getLng() : ((LocationData) vdvldrhtssVar.lqeggnwhkg()).getLongitude(), shop.getLng())), new LocationData(Math.min(((LocationData) vdvldrhtssVar.nufgyqmvbu()).getLatitude() == 0.0d ? shop.getLat() : ((LocationData) vdvldrhtssVar.nufgyqmvbu()).getLatitude(), shop.getLat()), Math.max(((LocationData) vdvldrhtssVar.nufgyqmvbu()).getLongitude(), shop.getLng())));
        }
        LocationData locationData = (LocationData) vdvldrhtssVar.iobyxmoadg();
        LocationData locationData2 = (LocationData) vdvldrhtssVar.wkgbmnqykc();
        double d13 = 2;
        return new LocationData(locationData.getLatitude() - ((locationData.getLatitude() - locationData2.getLatitude()) / d13), locationData.getLongitude() + ((locationData2.getLongitude() - locationData.getLongitude()) / d13));
    }
}
