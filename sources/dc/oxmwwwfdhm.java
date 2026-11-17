package dc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class oxmwwwfdhm extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27717iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f27718ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f27719zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27720iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private List f27721ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private byte f27722wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f27723zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg iobyxmoadg() {
            String str;
            List list;
            if (this.f27722wkgbmnqykc == 1 && (str = this.f27720iobyxmoadg) != null && (list = this.f27721ppxfxbqfkf) != null) {
                return new oxmwwwfdhm(str, this.f27723zoijcleaow, list);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27720iobyxmoadg == null) {
                sb3.append(" name");
            }
            if ((1 & this.f27722wkgbmnqykc) == 0) {
                sb3.append(" importance");
            }
            if (this.f27721ppxfxbqfkf == null) {
                sb3.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg ppxfxbqfkf(int i13) {
            this.f27723zoijcleaow = i13;
            this.f27722wkgbmnqykc = (byte) (this.f27722wkgbmnqykc | 1);
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg wkgbmnqykc(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f27720iobyxmoadg = str;
            return this;
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg zoijcleaow(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f27721ppxfxbqfkf = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg)) {
            return false;
        }
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg abstractC0516eablkybsjg = (iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg) obj;
        return this.f27717iobyxmoadg.equals(abstractC0516eablkybsjg.wkgbmnqykc()) && this.f27719zoijcleaow == abstractC0516eablkybsjg.ppxfxbqfkf() && this.f27718ppxfxbqfkf.equals(abstractC0516eablkybsjg.zoijcleaow());
    }

    public int hashCode() {
        return ((((this.f27717iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27719zoijcleaow) * 1000003) ^ this.f27718ppxfxbqfkf.hashCode();
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg
    public int ppxfxbqfkf() {
        return this.f27719zoijcleaow;
    }

    public String toString() {
        return "Thread{name=" + this.f27717iobyxmoadg + ", importance=" + this.f27719zoijcleaow + ", frames=" + this.f27718ppxfxbqfkf + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg
    public String wkgbmnqykc() {
        return this.f27717iobyxmoadg;
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg
    public List zoijcleaow() {
        return this.f27718ppxfxbqfkf;
    }

    private oxmwwwfdhm(String str, int i13, List list) {
        this.f27717iobyxmoadg = str;
        this.f27719zoijcleaow = i13;
        this.f27718ppxfxbqfkf = list;
    }
}
