package dc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo extends iozdgvuglv.wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f27490iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27491zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private List f27492iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27493zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.wkgbmnqykc.iobyxmoadg
        public iozdgvuglv.wkgbmnqykc iobyxmoadg() {
            List list = this.f27492iobyxmoadg;
            if (list != null) {
                return new gxszxtbevo(list, this.f27493zoijcleaow);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // dc.iozdgvuglv.wkgbmnqykc.iobyxmoadg
        public iozdgvuglv.wkgbmnqykc.iobyxmoadg ppxfxbqfkf(String str) {
            this.f27493zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.wkgbmnqykc.iobyxmoadg
        public iozdgvuglv.wkgbmnqykc.iobyxmoadg zoijcleaow(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f27492iobyxmoadg = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.wkgbmnqykc)) {
            return false;
        }
        iozdgvuglv.wkgbmnqykc wkgbmnqykcVar = (iozdgvuglv.wkgbmnqykc) obj;
        if (this.f27490iobyxmoadg.equals(wkgbmnqykcVar.zoijcleaow())) {
            String str = this.f27491zoijcleaow;
            if (str == null) {
                if (wkgbmnqykcVar.ppxfxbqfkf() == null) {
                    return true;
                }
            } else if (str.equals(wkgbmnqykcVar.ppxfxbqfkf())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f27490iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        String str = this.f27491zoijcleaow;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // dc.iozdgvuglv.wkgbmnqykc
    public String ppxfxbqfkf() {
        return this.f27491zoijcleaow;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f27490iobyxmoadg + ", orgId=" + this.f27491zoijcleaow + "}";
    }

    @Override // dc.iozdgvuglv.wkgbmnqykc
    public List zoijcleaow() {
        return this.f27490iobyxmoadg;
    }

    private gxszxtbevo(List list, String str) {
        this.f27490iobyxmoadg = list;
        this.f27491zoijcleaow = str;
    }
}
