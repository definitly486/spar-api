package qk;

import kotlin.jvm.internal.zdlpuopuiu;
import lk.jyumaefscl;

/* JADX INFO: loaded from: classes3.dex */
public interface agtfadlqog {

    public interface zoijcleaow {
        void cancel();

        dxjokdxxww iobyxmoadg();

        zoijcleaow lqeggnwhkg();

        iobyxmoadg nufgyqmvbu();

        boolean ppxfxbqfkf();

        iobyxmoadg wkgbmnqykc();
    }

    static /* synthetic */ boolean wkgbmnqykc(agtfadlqog agtfadlqogVar, dxjokdxxww dxjokdxxwwVar, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i13 & 1) != 0) {
            dxjokdxxwwVar = null;
        }
        return agtfadlqogVar.gxszxtbevo(dxjokdxxwwVar);
    }

    boolean btonecajqb();

    boolean eablkybsjg(jyumaefscl jyumaefsclVar);

    boolean gxszxtbevo(dxjokdxxww dxjokdxxwwVar);

    lk.iobyxmoadg iobyxmoadg();

    zoijcleaow ppxfxbqfkf();

    hg.wflxmlrfwp zoijcleaow();

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zoijcleaow f78950iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Throwable f78951ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final zoijcleaow f78952zoijcleaow;

        public iobyxmoadg(zoijcleaow plan, zoijcleaow zoijcleaowVar, Throwable th2) {
            zdlpuopuiu.btonecajqb(plan, "plan");
            this.f78950iobyxmoadg = plan;
            this.f78952zoijcleaow = zoijcleaowVar;
            this.f78951ppxfxbqfkf = th2;
        }

        public final Throwable eablkybsjg() {
            return this.f78951ppxfxbqfkf;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f78950iobyxmoadg, iobyxmoadgVar.f78950iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f78952zoijcleaow, iobyxmoadgVar.f78952zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f78951ppxfxbqfkf, iobyxmoadgVar.f78951ppxfxbqfkf);
        }

        public final boolean gxszxtbevo() {
            return this.f78952zoijcleaow == null && this.f78951ppxfxbqfkf == null;
        }

        public int hashCode() {
            int iHashCode = this.f78950iobyxmoadg.hashCode() * 31;
            zoijcleaow zoijcleaowVar = this.f78952zoijcleaow;
            int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
            Throwable th2 = this.f78951ppxfxbqfkf;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        public final zoijcleaow iobyxmoadg() {
            return this.f78952zoijcleaow;
        }

        public final zoijcleaow ppxfxbqfkf() {
            return this.f78952zoijcleaow;
        }

        public String toString() {
            return "ConnectResult(plan=" + this.f78950iobyxmoadg + ", nextPlan=" + this.f78952zoijcleaow + ", throwable=" + this.f78951ppxfxbqfkf + ')';
        }

        public final zoijcleaow wkgbmnqykc() {
            return this.f78950iobyxmoadg;
        }

        public final Throwable zoijcleaow() {
            return this.f78951ppxfxbqfkf;
        }

        public /* synthetic */ iobyxmoadg(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2, Throwable th2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this(zoijcleaowVar, (i13 & 2) != 0 ? null : zoijcleaowVar2, (i13 & 4) != 0 ? null : th2);
        }
    }
}
