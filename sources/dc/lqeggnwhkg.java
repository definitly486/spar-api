package dc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg extends iozdgvuglv.wkgbmnqykc.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27679iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final byte[] f27680zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27681iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private byte[] f27682zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg
        public iozdgvuglv.wkgbmnqykc.zoijcleaow iobyxmoadg() {
            byte[] bArr;
            String str = this.f27681iobyxmoadg;
            if (str != null && (bArr = this.f27682zoijcleaow) != null) {
                return new lqeggnwhkg(str, bArr);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27681iobyxmoadg == null) {
                sb3.append(" filename");
            }
            if (this.f27682zoijcleaow == null) {
                sb3.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg
        public iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f27681iobyxmoadg = str;
            return this;
        }

        @Override // dc.iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg
        public iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg zoijcleaow(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f27682zoijcleaow = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.wkgbmnqykc.zoijcleaow)) {
            return false;
        }
        iozdgvuglv.wkgbmnqykc.zoijcleaow zoijcleaowVar = (iozdgvuglv.wkgbmnqykc.zoijcleaow) obj;
        if (this.f27679iobyxmoadg.equals(zoijcleaowVar.ppxfxbqfkf())) {
            if (Arrays.equals(this.f27680zoijcleaow, zoijcleaowVar instanceof lqeggnwhkg ? ((lqeggnwhkg) zoijcleaowVar).f27680zoijcleaow : zoijcleaowVar.zoijcleaow())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f27679iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f27680zoijcleaow);
    }

    @Override // dc.iozdgvuglv.wkgbmnqykc.zoijcleaow
    public String ppxfxbqfkf() {
        return this.f27679iobyxmoadg;
    }

    public String toString() {
        return "File{filename=" + this.f27679iobyxmoadg + ", contents=" + Arrays.toString(this.f27680zoijcleaow) + "}";
    }

    @Override // dc.iozdgvuglv.wkgbmnqykc.zoijcleaow
    public byte[] zoijcleaow() {
        return this.f27680zoijcleaow;
    }

    private lqeggnwhkg(String str, byte[] bArr) {
        this.f27679iobyxmoadg = str;
        this.f27680zoijcleaow = bArr;
    }
}
