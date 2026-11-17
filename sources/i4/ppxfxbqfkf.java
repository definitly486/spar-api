package i4;

import com.google.common.collect.wflxmlrfwp;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import v2.jyumaefscl;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f41950iobyxmoadg;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final Comparator f41951wkgbmnqykc = new Comparator() { // from class: i4.zoijcleaow
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ppxfxbqfkf.iobyxmoadg.zoijcleaow((ppxfxbqfkf.iobyxmoadg) obj, (ppxfxbqfkf.iobyxmoadg) obj2);
            }
        };

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final long f41952iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f41953ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f41954zoijcleaow;

        public iobyxmoadg(long j13, long j14, int i13) {
            y2.iobyxmoadg.iobyxmoadg(j13 < j14);
            this.f41952iobyxmoadg = j13;
            this.f41954zoijcleaow = j14;
            this.f41953ppxfxbqfkf = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int zoijcleaow(iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
            return wflxmlrfwp.btonecajqb().eablkybsjg(iobyxmoadgVar.f41952iobyxmoadg, iobyxmoadgVar2.f41952iobyxmoadg).eablkybsjg(iobyxmoadgVar.f41954zoijcleaow, iobyxmoadgVar2.f41954zoijcleaow).wkgbmnqykc(iobyxmoadgVar.f41953ppxfxbqfkf, iobyxmoadgVar2.f41953ppxfxbqfkf).dxjokdxxww();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || iobyxmoadg.class != obj.getClass()) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return this.f41952iobyxmoadg == iobyxmoadgVar.f41952iobyxmoadg && this.f41954zoijcleaow == iobyxmoadgVar.f41954zoijcleaow && this.f41953ppxfxbqfkf == iobyxmoadgVar.f41953ppxfxbqfkf;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f41952iobyxmoadg), Long.valueOf(this.f41954zoijcleaow), Integer.valueOf(this.f41953ppxfxbqfkf));
        }

        public String toString() {
            return stevsuqkhv.iozdgvuglv("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f41952iobyxmoadg), Long.valueOf(this.f41954zoijcleaow), Integer.valueOf(this.f41953ppxfxbqfkf));
        }
    }

    public ppxfxbqfkf(List list) {
        this.f41950iobyxmoadg = list;
        y2.iobyxmoadg.iobyxmoadg(!wkgbmnqykc(list));
    }

    private static boolean wkgbmnqykc(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j13 = ((iobyxmoadg) list.get(0)).f41954zoijcleaow;
        for (int i13 = 1; i13 < list.size(); i13++) {
            if (((iobyxmoadg) list.get(i13)).f41952iobyxmoadg < j13) {
                return true;
            }
            j13 = ((iobyxmoadg) list.get(i13)).f41954zoijcleaow;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ppxfxbqfkf.class != obj.getClass()) {
            return false;
        }
        return this.f41950iobyxmoadg.equals(((ppxfxbqfkf) obj).f41950iobyxmoadg);
    }

    public int hashCode() {
        return this.f41950iobyxmoadg.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f41950iobyxmoadg;
    }
}
