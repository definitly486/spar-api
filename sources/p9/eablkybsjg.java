package p9;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn.zoijcleaow f76052iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final p9.iobyxmoadg f76053zoijcleaow;

    static final class zoijcleaow extends ojitshcjhn.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private ojitshcjhn.zoijcleaow f76054iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private p9.iobyxmoadg f76055zoijcleaow;

        zoijcleaow() {
        }

        @Override // p9.ojitshcjhn.iobyxmoadg
        public ojitshcjhn iobyxmoadg() {
            return new eablkybsjg(this.f76054iobyxmoadg, this.f76055zoijcleaow);
        }

        @Override // p9.ojitshcjhn.iobyxmoadg
        public ojitshcjhn.iobyxmoadg ppxfxbqfkf(ojitshcjhn.zoijcleaow zoijcleaowVar) {
            this.f76054iobyxmoadg = zoijcleaowVar;
            return this;
        }

        @Override // p9.ojitshcjhn.iobyxmoadg
        public ojitshcjhn.iobyxmoadg zoijcleaow(p9.iobyxmoadg iobyxmoadgVar) {
            this.f76055zoijcleaow = iobyxmoadgVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ojitshcjhn)) {
            return false;
        }
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) obj;
        ojitshcjhn.zoijcleaow zoijcleaowVar = this.f76052iobyxmoadg;
        if (zoijcleaowVar != null ? zoijcleaowVar.equals(ojitshcjhnVar.ppxfxbqfkf()) : ojitshcjhnVar.ppxfxbqfkf() == null) {
            p9.iobyxmoadg iobyxmoadgVar = this.f76053zoijcleaow;
            if (iobyxmoadgVar == null) {
                if (ojitshcjhnVar.zoijcleaow() == null) {
                    return true;
                }
            } else if (iobyxmoadgVar.equals(ojitshcjhnVar.zoijcleaow())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        ojitshcjhn.zoijcleaow zoijcleaowVar = this.f76052iobyxmoadg;
        int iHashCode = ((zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode()) ^ 1000003) * 1000003;
        p9.iobyxmoadg iobyxmoadgVar = this.f76053zoijcleaow;
        return iHashCode ^ (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
    }

    @Override // p9.ojitshcjhn
    public ojitshcjhn.zoijcleaow ppxfxbqfkf() {
        return this.f76052iobyxmoadg;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f76052iobyxmoadg + ", androidClientInfo=" + this.f76053zoijcleaow + "}";
    }

    @Override // p9.ojitshcjhn
    public p9.iobyxmoadg zoijcleaow() {
        return this.f76053zoijcleaow;
    }

    private eablkybsjg(ojitshcjhn.zoijcleaow zoijcleaowVar, p9.iobyxmoadg iobyxmoadgVar) {
        this.f76052iobyxmoadg = zoijcleaowVar;
        this.f76053zoijcleaow = iobyxmoadgVar;
    }
}
