package sw;

import ft.ppxfxbqfkf;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final rw.iobyxmoadg f108578zoijcleaow;

    /* JADX INFO: renamed from: sw.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2669iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f108579iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final LocationData f108580zoijcleaow;

        public C2669iobyxmoadg(String searchText, LocationData location) {
            zdlpuopuiu.btonecajqb(searchText, "searchText");
            zdlpuopuiu.btonecajqb(location, "location");
            this.f108579iobyxmoadg = searchText;
            this.f108580zoijcleaow = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2669iobyxmoadg)) {
                return false;
            }
            C2669iobyxmoadg c2669iobyxmoadg = (C2669iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f108579iobyxmoadg, c2669iobyxmoadg.f108579iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f108580zoijcleaow, c2669iobyxmoadg.f108580zoijcleaow);
        }

        public int hashCode() {
            return (this.f108579iobyxmoadg.hashCode() * 31) + this.f108580zoijcleaow.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f108580zoijcleaow;
        }

        public String toString() {
            return "Params(searchText=" + this.f108579iobyxmoadg + ", location=" + this.f108580zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f108579iobyxmoadg;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(rw.iobyxmoadg searchAddressRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(searchAddressRemoteSource, "searchAddressRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f108578zoijcleaow = searchAddressRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C2669iobyxmoadg c2669iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        Object objIobyxmoadg = this.f108578zoijcleaow.iobyxmoadg(c2669iobyxmoadg.zoijcleaow(), c2669iobyxmoadg.iobyxmoadg().getLatitude(), c2669iobyxmoadg.iobyxmoadg().getLongitude(), gxszxtbevoVar);
        return objIobyxmoadg == mg.zoijcleaow.gxszxtbevo() ? objIobyxmoadg : (List) objIobyxmoadg;
    }
}
