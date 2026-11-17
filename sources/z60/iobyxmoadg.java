package z60;

import gg.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: z60.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3278iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129217iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final z60.zoijcleaow f129218zoijcleaow;

        public C3278iobyxmoadg(String sectionTitle) {
            zdlpuopuiu.btonecajqb(sectionTitle, "sectionTitle");
            this.f129217iobyxmoadg = sectionTitle;
            this.f129218zoijcleaow = z60.zoijcleaow.Header;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3278iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129217iobyxmoadg, ((C3278iobyxmoadg) obj).f129217iobyxmoadg);
        }

        @Override // z60.iobyxmoadg
        public int getId() {
            return hashCode();
        }

        public int hashCode() {
            return this.f129217iobyxmoadg.hashCode();
        }

        @Override // z60.iobyxmoadg
        public z60.zoijcleaow iobyxmoadg() {
            return this.f129218zoijcleaow;
        }

        public String toString() {
            return "HeaderItem(sectionTitle=" + this.f129217iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f129217iobyxmoadg;
        }
    }

    int getId();

    z60.zoijcleaow iobyxmoadg();

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f129219iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final z60.zoijcleaow f129220ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ppxfxbqfkf f129221zoijcleaow;

        public zoijcleaow(ppxfxbqfkf firstTime, ppxfxbqfkf ppxfxbqfkfVar) {
            zdlpuopuiu.btonecajqb(firstTime, "firstTime");
            this.f129219iobyxmoadg = firstTime;
            this.f129221zoijcleaow = ppxfxbqfkfVar;
            this.f129220ppxfxbqfkf = z60.zoijcleaow.Intervals;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f129219iobyxmoadg, zoijcleaowVar.f129219iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f129221zoijcleaow, zoijcleaowVar.f129221zoijcleaow);
        }

        @Override // z60.iobyxmoadg
        public int getId() {
            return hashCode();
        }

        public int hashCode() {
            int iHashCode = this.f129219iobyxmoadg.hashCode() * 31;
            ppxfxbqfkf ppxfxbqfkfVar = this.f129221zoijcleaow;
            return iHashCode + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode());
        }

        @Override // z60.iobyxmoadg
        public z60.zoijcleaow iobyxmoadg() {
            return this.f129220ppxfxbqfkf;
        }

        public final ppxfxbqfkf ppxfxbqfkf() {
            return this.f129221zoijcleaow;
        }

        public String toString() {
            return "IntervalsItem(firstTime=" + this.f129219iobyxmoadg + ", secondTime=" + this.f129221zoijcleaow + ")";
        }

        public final ppxfxbqfkf zoijcleaow() {
            return this.f129219iobyxmoadg;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(vdvldrhtss pair) {
            this((ppxfxbqfkf) pair.lqeggnwhkg(), (ppxfxbqfkf) pair.nufgyqmvbu());
            zdlpuopuiu.btonecajqb(pair, "pair");
        }
    }
}
