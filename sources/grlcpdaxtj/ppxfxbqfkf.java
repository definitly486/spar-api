package grlcpdaxtj;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ppxfxbqfkf extends List, zoijcleaow, ug.iobyxmoadg {

    private static final class iobyxmoadg extends hg.wkgbmnqykc implements ppxfxbqfkf {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f38364cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final int f38365iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final int f38366jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final ppxfxbqfkf f38367yggfygwlhe;

        public iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
            this.f38367yggfygwlhe = ppxfxbqfkfVar;
            this.f38366jyumaefscl = i13;
            this.f38365iwizpuwonk = i14;
            fmlbqenlif.wkgbmnqykc.ppxfxbqfkf(i13, i14, ppxfxbqfkfVar.size());
            this.f38364cqumvgiudr = i14 - i13;
        }

        @Override // hg.wkgbmnqykc, java.util.List
        public Object get(int i13) {
            fmlbqenlif.wkgbmnqykc.iobyxmoadg(i13, this.f38364cqumvgiudr);
            return this.f38367yggfygwlhe.get(this.f38366jyumaefscl + i13);
        }

        @Override // hg.zoijcleaow
        public int wkgbmnqykc() {
            return this.f38364cqumvgiudr;
        }

        @Override // hg.wkgbmnqykc, java.util.List, grlcpdaxtj.ppxfxbqfkf
        public ppxfxbqfkf subList(int i13, int i14) {
            fmlbqenlif.wkgbmnqykc.ppxfxbqfkf(i13, i14, this.f38364cqumvgiudr);
            ppxfxbqfkf ppxfxbqfkfVar = this.f38367yggfygwlhe;
            int i15 = this.f38366jyumaefscl;
            return new iobyxmoadg(ppxfxbqfkfVar, i13 + i15, i15 + i14);
        }
    }

    @Override // java.util.List
    default ppxfxbqfkf subList(int i13, int i14) {
        return new iobyxmoadg(this, i13, i14);
    }
}
