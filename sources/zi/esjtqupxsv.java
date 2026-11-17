package zi;

/* JADX INFO: loaded from: classes3.dex */
public final class esjtqupxsv extends pmvmpeiblj implements iwizpuwonk, dj.eablkybsjg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final iobyxmoadg f130025iwizpuwonk = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean f130026jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ikoacuggdj f130027yggfygwlhe;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final boolean iobyxmoadg(grlcpdaxtj grlcpdaxtjVar) {
            grlcpdaxtjVar.grlcpdaxtj();
            return (grlcpdaxtjVar.grlcpdaxtj().ylkuphrtab() instanceof jh.yfnezrywwk) || (grlcpdaxtjVar instanceof aj.dxjokdxxww);
        }

        public static /* synthetic */ esjtqupxsv ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, grlcpdaxtj grlcpdaxtjVar, boolean z13, boolean z14, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                z13 = false;
            }
            if ((i13 & 4) != 0) {
                z14 = false;
            }
            return iobyxmoadgVar.zoijcleaow(grlcpdaxtjVar, z13, z14);
        }

        private final boolean wkgbmnqykc(grlcpdaxtj grlcpdaxtjVar, boolean z13) {
            if (!iobyxmoadg(grlcpdaxtjVar)) {
                return false;
            }
            jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = grlcpdaxtjVar.grlcpdaxtj().ylkuphrtab();
            mh.mbcevpiqjq mbcevpiqjqVar = nufgyqmvbuVarWkgbmnqykc instanceof mh.mbcevpiqjq ? (mh.mbcevpiqjq) nufgyqmvbuVarWkgbmnqykc : null;
            if (mbcevpiqjqVar == null || mbcevpiqjqVar.rhgxfdycjh()) {
                return (z13 && (grlcpdaxtjVar.grlcpdaxtj().ylkuphrtab() instanceof jh.yfnezrywwk)) ? ageimvtcrz.draadjrbmk(grlcpdaxtjVar) : !aj.oxmwwwfdhm.f2069iobyxmoadg.iobyxmoadg(grlcpdaxtjVar);
            }
            return true;
        }

        public final esjtqupxsv zoijcleaow(grlcpdaxtj type, boolean z13, boolean z14) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
            if (type instanceof esjtqupxsv) {
                return (esjtqupxsv) type;
            }
            kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar = null;
            if (!z14 && !wkgbmnqykc(type, z13)) {
                return null;
            }
            if (type instanceof ylkuphrtab) {
                ylkuphrtab ylkuphrtabVar = (ylkuphrtab) type;
                kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ylkuphrtabVar.eslsurpljm().grlcpdaxtj(), ylkuphrtabVar.krqnebusok().grlcpdaxtj());
            }
            return new esjtqupxsv(jpowsppfya.ppxfxbqfkf(type).fmlbqenlif(false), z13, gtknphoqwxVar);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ esjtqupxsv(ikoacuggdj ikoacuggdjVar, boolean z13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(ikoacuggdjVar, z13);
    }

    public final ikoacuggdj c() {
        return this.f130027yggfygwlhe;
    }

    @Override // zi.pmvmpeiblj
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public esjtqupxsv b(ikoacuggdj delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        return new esjtqupxsv(delegate, this.f130026jyumaefscl);
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: eslsurpljm */
    public ikoacuggdj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return new esjtqupxsv(krqnebusok().rhgxfdycjh(newAttributes), this.f130026jyumaefscl);
    }

    @Override // zi.iwizpuwonk
    public boolean igdgnonuha() {
        krqnebusok().grlcpdaxtj();
        return krqnebusok().grlcpdaxtj().ylkuphrtab() instanceof jh.yfnezrywwk;
    }

    @Override // zi.pmvmpeiblj
    protected ikoacuggdj krqnebusok() {
        return this.f130027yggfygwlhe;
    }

    @Override // zi.pmvmpeiblj, zi.kegysxyocb
    public boolean mhtqkkgtqm() {
        return false;
    }

    @Override // zi.ikoacuggdj
    public String toString() {
        return krqnebusok() + " & Any";
    }

    @Override // zi.iwizpuwonk
    public kegysxyocb uawqvzlxes(kegysxyocb replacement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(replacement, "replacement");
        return metgxyhuhe.eablkybsjg(replacement.jrbgnlbqoe(), this.f130026jyumaefscl);
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: yzdjzghtvl */
    public ikoacuggdj fmlbqenlif(boolean z13) {
        return z13 ? krqnebusok().fmlbqenlif(z13) : this;
    }

    private esjtqupxsv(ikoacuggdj ikoacuggdjVar, boolean z13) {
        this.f130027yggfygwlhe = ikoacuggdjVar;
        this.f130026jyumaefscl = z13;
    }
}
