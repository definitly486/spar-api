package dc;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends iozdgvuglv.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27465iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27466zoijcleaow;

    static final class zoijcleaow extends iozdgvuglv.ppxfxbqfkf.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f27467iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private String f27468zoijcleaow;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.ppxfxbqfkf iobyxmoadg() {
            String str;
            String str2 = this.f27467iobyxmoadg;
            if (str2 != null && (str = this.f27468zoijcleaow) != null) {
                return new eablkybsjg(str2, str);
            }
            StringBuilder sb3 = new StringBuilder();
            if (this.f27467iobyxmoadg == null) {
                sb3.append(" key");
            }
            if (this.f27468zoijcleaow == null) {
                sb3.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb3));
        }

        @Override // dc.iozdgvuglv.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.ppxfxbqfkf.iobyxmoadg ppxfxbqfkf(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f27468zoijcleaow = str;
            return this;
        }

        @Override // dc.iozdgvuglv.ppxfxbqfkf.iobyxmoadg
        public iozdgvuglv.ppxfxbqfkf.iobyxmoadg zoijcleaow(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f27467iobyxmoadg = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iozdgvuglv.ppxfxbqfkf)) {
            return false;
        }
        iozdgvuglv.ppxfxbqfkf ppxfxbqfkfVar = (iozdgvuglv.ppxfxbqfkf) obj;
        return this.f27465iobyxmoadg.equals(ppxfxbqfkfVar.zoijcleaow()) && this.f27466zoijcleaow.equals(ppxfxbqfkfVar.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((this.f27465iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27466zoijcleaow.hashCode();
    }

    @Override // dc.iozdgvuglv.ppxfxbqfkf
    public String ppxfxbqfkf() {
        return this.f27466zoijcleaow;
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f27465iobyxmoadg + ", value=" + this.f27466zoijcleaow + "}";
    }

    @Override // dc.iozdgvuglv.ppxfxbqfkf
    public String zoijcleaow() {
        return this.f27465iobyxmoadg;
    }

    private eablkybsjg(String str, String str2) {
        this.f27465iobyxmoadg = str;
        this.f27466zoijcleaow = str2;
    }
}
