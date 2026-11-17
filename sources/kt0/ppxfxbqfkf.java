package kt0;

import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ppxfxbqfkf implements jt0.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final iobyxmoadg f60552zdlpuopuiu = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: kt0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    public static final class C1213ppxfxbqfkf extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final kt0.iobyxmoadg f60553yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1213ppxfxbqfkf(kt0.iobyxmoadg comboSet) {
            super(null);
            zdlpuopuiu.btonecajqb(comboSet, "comboSet");
            this.f60553yggfygwlhe = comboSet;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1213ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f60553yggfygwlhe, ((C1213ppxfxbqfkf) obj).f60553yggfygwlhe);
        }

        public int hashCode() {
            return this.f60553yggfygwlhe.hashCode();
        }

        public final kt0.iobyxmoadg iobyxmoadg() {
            return this.f60553yggfygwlhe;
        }

        public String toString() {
            return "FilledSingle(comboSet=" + this.f60553yggfygwlhe + ")";
        }
    }

    public static final class wkgbmnqykc extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final wkgbmnqykc f60554yggfygwlhe = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(null);
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final List f60555yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(List comboSetList) {
            super(null);
            zdlpuopuiu.btonecajqb(comboSetList, "comboSetList");
            this.f60555yggfygwlhe = comboSetList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f60555yggfygwlhe, ((zoijcleaow) obj).f60555yggfygwlhe);
        }

        public int hashCode() {
            return this.f60555yggfygwlhe.hashCode();
        }

        public final List iobyxmoadg() {
            return this.f60555yggfygwlhe;
        }

        public String toString() {
            return "FilledList(comboSetList=" + this.f60555yggfygwlhe + ")";
        }
    }

    public /* synthetic */ ppxfxbqfkf(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private ppxfxbqfkf() {
    }
}
