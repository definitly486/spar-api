package kv;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.common.models.LocationData;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jv.iobyxmoadg f60666zoijcleaow;

    /* JADX INFO: renamed from: kv.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1217iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f60667iobyxmoadg;

        public C1217iobyxmoadg(LocationData location) {
            zdlpuopuiu.btonecajqb(location, "location");
            this.f60667iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1217iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f60667iobyxmoadg, ((C1217iobyxmoadg) obj).f60667iobyxmoadg);
        }

        public int hashCode() {
            return this.f60667iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f60667iobyxmoadg;
        }

        public String toString() {
            return "Params(location=" + this.f60667iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(jv.iobyxmoadg geoRemoteSource, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(geoRemoteSource, "geoRemoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f60666zoijcleaow = geoRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C1217iobyxmoadg c1217iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f60666zoijcleaow.zoijcleaow(c1217iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
