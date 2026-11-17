package zi;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh extends igdgnonuha {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f130009eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final igdgnonuha f130010ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final igdgnonuha f130011wkgbmnqykc;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final igdgnonuha iobyxmoadg(igdgnonuha first, igdgnonuha second) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(first, "first");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(second, "second");
            if (first.gxszxtbevo()) {
                return second;
            }
            return second.gxszxtbevo() ? first : new cdpycssgdh(first, second, null);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ cdpycssgdh(igdgnonuha igdgnonuhaVar, igdgnonuha igdgnonuhaVar2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(igdgnonuhaVar, igdgnonuhaVar2);
    }

    public static final igdgnonuha dxjokdxxww(igdgnonuha igdgnonuhaVar, igdgnonuha igdgnonuhaVar2) {
        return f130009eablkybsjg.iobyxmoadg(igdgnonuhaVar, igdgnonuhaVar2);
    }

    @Override // zi.igdgnonuha
    public iwxlajgraz eablkybsjg(kegysxyocb key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        iwxlajgraz iwxlajgrazVarEablkybsjg = this.f130010ppxfxbqfkf.eablkybsjg(key);
        return iwxlajgrazVarEablkybsjg == null ? this.f130011wkgbmnqykc.eablkybsjg(key) : iwxlajgrazVarEablkybsjg;
    }

    @Override // zi.igdgnonuha
    public boolean gxszxtbevo() {
        return false;
    }

    @Override // zi.igdgnonuha
    public boolean iobyxmoadg() {
        return this.f130010ppxfxbqfkf.iobyxmoadg() || this.f130011wkgbmnqykc.iobyxmoadg();
    }

    @Override // zi.igdgnonuha
    public kegysxyocb lqeggnwhkg(kegysxyocb topLevelType, mhtqkkgtqm position) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(topLevelType, "topLevelType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(position, "position");
        return this.f130011wkgbmnqykc.lqeggnwhkg(this.f130010ppxfxbqfkf.lqeggnwhkg(topLevelType, position), position);
    }

    @Override // zi.igdgnonuha
    public kh.nufgyqmvbu wkgbmnqykc(kh.nufgyqmvbu annotations) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(annotations, "annotations");
        return this.f130011wkgbmnqykc.wkgbmnqykc(this.f130010ppxfxbqfkf.wkgbmnqykc(annotations));
    }

    @Override // zi.igdgnonuha
    public boolean zoijcleaow() {
        return this.f130010ppxfxbqfkf.zoijcleaow() || this.f130011wkgbmnqykc.zoijcleaow();
    }

    private cdpycssgdh(igdgnonuha igdgnonuhaVar, igdgnonuha igdgnonuhaVar2) {
        this.f130010ppxfxbqfkf = igdgnonuhaVar;
        this.f130011wkgbmnqykc = igdgnonuhaVar2;
    }
}
