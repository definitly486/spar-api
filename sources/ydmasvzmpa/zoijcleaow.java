package ydmasvzmpa;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface zoijcleaow {

    public static final class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f124641iobyxmoadg;

        public iobyxmoadg(int i13) {
            this.f124641iobyxmoadg = i13;
            if (i13 > 0) {
                return;
            }
            rlfsiqarku.eablkybsjg.iobyxmoadg("Provided count should be larger than zero");
        }

        public boolean equals(Object obj) {
            return (obj instanceof iobyxmoadg) && this.f124641iobyxmoadg == ((iobyxmoadg) obj).f124641iobyxmoadg;
        }

        public int hashCode() {
            return -this.f124641iobyxmoadg;
        }

        @Override // ydmasvzmpa.zoijcleaow
        public List iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int i14) {
            return dxjokdxxww.gxszxtbevo(i13, this.f124641iobyxmoadg, i14);
        }
    }

    List iobyxmoadg(w0.wkgbmnqykc wkgbmnqykcVar, int i13, int i14);
}
