package p9;

/* JADX INFO: loaded from: classes2.dex */
final class dxjokdxxww extends kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f76050iobyxmoadg;

    static final class zoijcleaow extends kcexrzcfyt.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private oxmwwwfdhm f76051iobyxmoadg;

        zoijcleaow() {
        }

        @Override // p9.kcexrzcfyt.iobyxmoadg
        public kcexrzcfyt iobyxmoadg() {
            return new dxjokdxxww(this.f76051iobyxmoadg);
        }

        @Override // p9.kcexrzcfyt.iobyxmoadg
        public kcexrzcfyt.iobyxmoadg zoijcleaow(oxmwwwfdhm oxmwwwfdhmVar) {
            this.f76051iobyxmoadg = oxmwwwfdhmVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        oxmwwwfdhm oxmwwwfdhmVar = this.f76050iobyxmoadg;
        oxmwwwfdhm oxmwwwfdhmVarZoijcleaow = ((kcexrzcfyt) obj).zoijcleaow();
        if (oxmwwwfdhmVar == null) {
            return oxmwwwfdhmVarZoijcleaow == null;
        }
        return oxmwwwfdhmVar.equals(oxmwwwfdhmVarZoijcleaow);
    }

    public int hashCode() {
        oxmwwwfdhm oxmwwwfdhmVar = this.f76050iobyxmoadg;
        return (oxmwwwfdhmVar == null ? 0 : oxmwwwfdhmVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f76050iobyxmoadg + "}";
    }

    @Override // p9.kcexrzcfyt
    public oxmwwwfdhm zoijcleaow() {
        return this.f76050iobyxmoadg;
    }

    private dxjokdxxww(oxmwwwfdhm oxmwwwfdhmVar) {
        this.f76050iobyxmoadg = oxmwwwfdhmVar;
    }
}
