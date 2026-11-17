package o51;

import gg.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: o51.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1556iobyxmoadg implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f72132iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final o51.zoijcleaow f72133zoijcleaow;

        public C1556iobyxmoadg(String sectionTitle) {
            zdlpuopuiu.btonecajqb(sectionTitle, "sectionTitle");
            this.f72132iobyxmoadg = sectionTitle;
            this.f72133zoijcleaow = o51.zoijcleaow.Header;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1556iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72132iobyxmoadg, ((C1556iobyxmoadg) obj).f72132iobyxmoadg);
        }

        @Override // o51.iobyxmoadg
        public int getId() {
            return hashCode();
        }

        public int hashCode() {
            return this.f72132iobyxmoadg.hashCode();
        }

        @Override // o51.iobyxmoadg
        public o51.zoijcleaow iobyxmoadg() {
            return this.f72133zoijcleaow;
        }

        public String toString() {
            return "HeaderItem(sectionTitle=" + this.f72132iobyxmoadg + ")";
        }

        public final String zoijcleaow() {
            return this.f72132iobyxmoadg;
        }
    }

    int getId();

    o51.zoijcleaow iobyxmoadg();

    public static final class zoijcleaow implements iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f72134iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final o51.zoijcleaow f72135ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ppxfxbqfkf f72136zoijcleaow;

        public zoijcleaow(ppxfxbqfkf firstTime, ppxfxbqfkf ppxfxbqfkfVar) {
            zdlpuopuiu.btonecajqb(firstTime, "firstTime");
            this.f72134iobyxmoadg = firstTime;
            this.f72136zoijcleaow = ppxfxbqfkfVar;
            this.f72135ppxfxbqfkf = o51.zoijcleaow.Intervals;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zoijcleaow)) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return zdlpuopuiu.eablkybsjg(this.f72134iobyxmoadg, zoijcleaowVar.f72134iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f72136zoijcleaow, zoijcleaowVar.f72136zoijcleaow);
        }

        @Override // o51.iobyxmoadg
        public int getId() {
            return hashCode();
        }

        public int hashCode() {
            int iHashCode = this.f72134iobyxmoadg.hashCode() * 31;
            ppxfxbqfkf ppxfxbqfkfVar = this.f72136zoijcleaow;
            return iHashCode + (ppxfxbqfkfVar == null ? 0 : ppxfxbqfkfVar.hashCode());
        }

        @Override // o51.iobyxmoadg
        public o51.zoijcleaow iobyxmoadg() {
            return this.f72135ppxfxbqfkf;
        }

        public final ppxfxbqfkf ppxfxbqfkf() {
            return this.f72136zoijcleaow;
        }

        public String toString() {
            return "IntervalsItem(firstTime=" + this.f72134iobyxmoadg + ", secondTime=" + this.f72136zoijcleaow + ")";
        }

        public final ppxfxbqfkf zoijcleaow() {
            return this.f72134iobyxmoadg;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(vdvldrhtss pair) {
            this((ppxfxbqfkf) pair.lqeggnwhkg(), (ppxfxbqfkf) pair.nufgyqmvbu());
            zdlpuopuiu.btonecajqb(pair, "pair");
        }
    }
}
