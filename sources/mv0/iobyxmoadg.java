package mv0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.common.models.LocationData;
import zr0.ppxfxbqfkf;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lv0.iobyxmoadg f68015zoijcleaow;

    /* JADX INFO: renamed from: mv0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1454iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f68016iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f68017zoijcleaow;

        public C1454iobyxmoadg(String searchText, LocationData location) {
            zdlpuopuiu.btonecajqb(searchText, "searchText");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f68016iobyxmoadg = searchText;
            this.f68017zoijcleaow = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1454iobyxmoadg)) {
                return false;
            }
            C1454iobyxmoadg c1454iobyxmoadg = (C1454iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f68016iobyxmoadg, c1454iobyxmoadg.f68016iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f68017zoijcleaow, c1454iobyxmoadg.f68017zoijcleaow);
        }

        public int hashCode() {
            return (this.f68016iobyxmoadg.hashCode() * 31) + this.f68017zoijcleaow.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f68017zoijcleaow;
        }

        public String toString() {
            return "Params(searchText=" + this.f68016iobyxmoadg + ", location=" + this.f68017zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f68016iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lv0.iobyxmoadg searchAddressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(searchAddressRemoteSource, "searchAddressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f68015zoijcleaow = searchAddressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1454iobyxmoadg c1454iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = this.f68015zoijcleaow.iobyxmoadg(c1454iobyxmoadg.zoijcleaow(), c1454iobyxmoadg.iobyxmoadg().getLatitude(), c1454iobyxmoadg.iobyxmoadg().getLongitude(), gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : (List) objIobyxmoadg;
    }
}
