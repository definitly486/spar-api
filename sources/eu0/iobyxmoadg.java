package eu0;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.common.models.LocationData;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final du0.iobyxmoadg f32056zoijcleaow;

    /* JADX INFO: renamed from: eu0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0692iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final LocationData f32057iobyxmoadg;

        public C0692iobyxmoadg(LocationData location) {
            zdlpuopuiu.btonecajqb(location, "location");
            this.f32057iobyxmoadg = location;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0692iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f32057iobyxmoadg, ((C0692iobyxmoadg) obj).f32057iobyxmoadg);
        }

        public int hashCode() {
            return this.f32057iobyxmoadg.hashCode();
        }

        public final LocationData iobyxmoadg() {
            return this.f32057iobyxmoadg;
        }

        public String toString() {
            return "Params(location=" + this.f32057iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(du0.iobyxmoadg geoRemoteSource, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.zoijcleaow());
        zdlpuopuiu.btonecajqb(geoRemoteSource, "geoRemoteSource");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f32056zoijcleaow = geoRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(C0692iobyxmoadg c0692iobyxmoadg, gxszxtbevo gxszxtbevoVar) {
        return this.f32056zoijcleaow.ppxfxbqfkf(c0692iobyxmoadg.iobyxmoadg(), gxszxtbevoVar);
    }
}
