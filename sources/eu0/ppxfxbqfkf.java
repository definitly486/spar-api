package eu0;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final du0.iobyxmoadg f32058zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f32059iobyxmoadg;

        public iobyxmoadg(LocationData location) {
            zdlpuopuiu.btonecajqb(location, "location");
            this.f32059iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32059iobyxmoadg, ((iobyxmoadg) obj).f32059iobyxmoadg);
        }

        public int hashCode() {
            return this.f32059iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f32059iobyxmoadg;
        }

        public String toString() {
            return "Params(location=" + this.f32059iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(du0.iobyxmoadg geoRemoteSource, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(geoRemoteSource, "geoRemoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f32058zoijcleaow = geoRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        return this.f32058zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(), gxszxtbevoVar);
    }
}
