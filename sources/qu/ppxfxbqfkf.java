package qu;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf implements pu.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f80660zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: qu.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1793ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final qu.iobyxmoadg f80661yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1793ppxfxbqfkf(qu.iobyxmoadg comboSet) {
            super(null);
            zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f80661yggfygwlhe = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1793ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f80661yggfygwlhe, ((C1793ppxfxbqfkf) obj).f80661yggfygwlhe);
        }

        public int hashCode() {
            return this.f80661yggfygwlhe.hashCode();
        }

        public final qu.iobyxmoadg iobyxmoadg() {
            return this.f80661yggfygwlhe;
        }

        public String toString() {
            return "FilledSingle(comboSet=" + this.f80661yggfygwlhe + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final wkgbmnqykc f80662yggfygwlhe = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final List f80663yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List comboSetList) {
            super(null);
            zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
            this.f80663yggfygwlhe = comboSetList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f80663yggfygwlhe, ((zoijcleaow) obj).f80663yggfygwlhe);
        }

        public int hashCode() {
            return this.f80663yggfygwlhe.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f80663yggfygwlhe;
        }

        public String toString() {
            return "FilledList(comboSetList=" + this.f80663yggfygwlhe + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
