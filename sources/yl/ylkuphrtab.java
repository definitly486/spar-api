package yl;

/* JADX INFO: loaded from: classes3.dex */
abstract class ylkuphrtab {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final btonecajqb f125844iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f125845ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f125846zoijcleaow;

    public enum btonecajqb {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        XmlDecl,
        EOF
    }

    static abstract class dxjokdxxww extends ylkuphrtab {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        int f125855agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private boolean f125856btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        final boolean f125857draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final pkzmftpjix f125858dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        protected String f125859eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        final dsvhmnatus f125860gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f125861gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        xl.zoijcleaow f125862lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final pkzmftpjix f125863nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        int f125864ojitshcjhn;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        int f125865rgvfuqvkyq;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        int f125866wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        protected pkzmftpjix f125867wkgbmnqykc;

        dxjokdxxww(btonecajqb btonecajqbVar, dsvhmnatus dsvhmnatusVar) {
            super(btonecajqbVar);
            this.f125867wkgbmnqykc = new pkzmftpjix();
            this.f125861gxszxtbevo = false;
            this.f125863nufgyqmvbu = new pkzmftpjix();
            this.f125858dxjokdxxww = new pkzmftpjix();
            this.f125856btonecajqb = false;
            this.f125860gtknphoqwx = dsvhmnatusVar;
            this.f125857draadjrbmk = dsvhmnatusVar.f125748wflxmlrfwp;
        }

        private void dsvhmnatus(String str) {
            if (this.f125857draadjrbmk && ojitshcjhn()) {
                dsvhmnatus dsvhmnatusVar = eablkybsjg().f125860gtknphoqwx;
                draadjrbmk draadjrbmkVar = dsvhmnatusVar.f125750zoijcleaow;
                if (!dsvhmnatusVar.f125746nufgyqmvbu.eablkybsjg()) {
                    str = wl.gxszxtbevo.iobyxmoadg(str);
                }
                if (this.f125862lqeggnwhkg.iozdgvuglv(str).iobyxmoadg().iobyxmoadg()) {
                    return;
                }
                if (!this.f125858dxjokdxxww.eablkybsjg()) {
                    int i13 = this.f125855agtfadlqog;
                    this.f125865rgvfuqvkyq = i13;
                    this.f125864ojitshcjhn = i13;
                }
                int i14 = this.f125866wflxmlrfwp;
                xl.esjtqupxsv.zoijcleaow zoijcleaowVar = new xl.esjtqupxsv.zoijcleaow(i14, draadjrbmkVar.mhtqkkgtqm(i14), draadjrbmkVar.jyumaefscl(this.f125866wflxmlrfwp));
                int i15 = this.f125855agtfadlqog;
                xl.esjtqupxsv esjtqupxsvVar = new xl.esjtqupxsv(zoijcleaowVar, new xl.esjtqupxsv.zoijcleaow(i15, draadjrbmkVar.mhtqkkgtqm(i15), draadjrbmkVar.jyumaefscl(this.f125855agtfadlqog)));
                int i16 = this.f125864ojitshcjhn;
                xl.esjtqupxsv.zoijcleaow zoijcleaowVar2 = new xl.esjtqupxsv.zoijcleaow(i16, draadjrbmkVar.mhtqkkgtqm(i16), draadjrbmkVar.jyumaefscl(this.f125864ojitshcjhn));
                int i17 = this.f125865rgvfuqvkyq;
                this.f125862lqeggnwhkg.yadqdtsiqt(str, new xl.esjtqupxsv.iobyxmoadg(esjtqupxsvVar, new xl.esjtqupxsv(zoijcleaowVar2, new xl.esjtqupxsv.zoijcleaow(i17, draadjrbmkVar.mhtqkkgtqm(i17), draadjrbmkVar.jyumaefscl(this.f125865rgvfuqvkyq)))));
            }
        }

        private void jpowsppfya() {
            this.f125863nufgyqmvbu.gxszxtbevo();
            this.f125858dxjokdxxww.gxszxtbevo();
            this.f125856btonecajqb = false;
            if (this.f125857draadjrbmk) {
                this.f125865rgvfuqvkyq = -1;
                this.f125864ojitshcjhn = -1;
                this.f125855agtfadlqog = -1;
                this.f125866wflxmlrfwp = -1;
            }
        }

        private void pmvmpeiblj(int i13, int i14) {
            if (this.f125857draadjrbmk) {
                int i15 = this.f125866wflxmlrfwp;
                if (i15 > -1) {
                    i13 = i15;
                }
                this.f125866wflxmlrfwp = i13;
                this.f125855agtfadlqog = i14;
            }
        }

        private void zynmafqrjb(int i13, int i14) {
            if (this.f125857draadjrbmk) {
                int i15 = this.f125864ojitshcjhn;
                if (i15 > -1) {
                    i13 = i15;
                }
                this.f125864ojitshcjhn = i13;
                this.f125865rgvfuqvkyq = i14;
            }
        }

        final boolean cdpycssgdh(String str) {
            xl.zoijcleaow zoijcleaowVar = this.f125862lqeggnwhkg;
            return zoijcleaowVar != null && zoijcleaowVar.kcexrzcfyt(str);
        }

        final String cllcsxoeiz() {
            String strNufgyqmvbu = this.f125867wkgbmnqykc.nufgyqmvbu();
            return strNufgyqmvbu.isEmpty() ? "[unset]" : strNufgyqmvbu;
        }

        final void cqumvgiudr(int[] iArr, int i13, int i14) {
            for (int i15 : iArr) {
                this.f125858dxjokdxxww.ppxfxbqfkf(i15);
            }
            zynmafqrjb(i13, i14);
        }

        final void esjtqupxsv(char c13) {
            lereixgezr(String.valueOf(c13));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // yl.ylkuphrtab
        /* JADX INFO: renamed from: hcddaimhww, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww rgvfuqvkyq() {
            super.rgvfuqvkyq();
            this.f125867wkgbmnqykc.gxszxtbevo();
            this.f125859eablkybsjg = null;
            this.f125861gxszxtbevo = false;
            this.f125862lqeggnwhkg = null;
            jpowsppfya();
            return this;
        }

        final void hkdspvbjdz() {
            this.f125856btonecajqb = true;
        }

        final boolean iozdgvuglv() {
            return this.f125861gxszxtbevo;
        }

        final void istkbnxepw() {
            if (this.f125863nufgyqmvbu.eablkybsjg()) {
                ylkuphrtab();
            }
        }

        final void iwizpuwonk(String str, int i13, int i14) {
            this.f125858dxjokdxxww.zoijcleaow(str);
            zynmafqrjb(i13, i14);
        }

        final void jyumaefscl(char c13, int i13, int i14) {
            this.f125858dxjokdxxww.iobyxmoadg(c13);
            zynmafqrjb(i13, i14);
        }

        final void lereixgezr(String str) {
            this.f125867wkgbmnqykc.zoijcleaow(str.replace((char) 0, (char) 65533));
            this.f125859eablkybsjg = vdvldrhtss.iobyxmoadg(this.f125867wkgbmnqykc.nufgyqmvbu());
        }

        final String lmojexxdyd() {
            return this.f125867wkgbmnqykc.nufgyqmvbu();
        }

        final String pkzmftpjix() {
            String str = this.f125859eablkybsjg;
            vl.zoijcleaow.zoijcleaow(str == null || str.isEmpty());
            return this.f125859eablkybsjg;
        }

        final dxjokdxxww wwaezpbzkn(String str) {
            this.f125867wkgbmnqykc.lqeggnwhkg(str);
            this.f125859eablkybsjg = vdvldrhtss.iobyxmoadg(this.f125867wkgbmnqykc.nufgyqmvbu());
            return this;
        }

        final boolean yadqdtsiqt() {
            return this.f125862lqeggnwhkg != null;
        }

        final void yggfygwlhe(String str, int i13, int i14) {
            this.f125863nufgyqmvbu.zoijcleaow(str.replace((char) 0, (char) 65533));
            pmvmpeiblj(i13, i14);
        }

        final void ylkuphrtab() {
            String strNufgyqmvbu;
            if (this.f125862lqeggnwhkg == null) {
                this.f125862lqeggnwhkg = new xl.zoijcleaow();
            }
            if (this.f125863nufgyqmvbu.eablkybsjg() && this.f125862lqeggnwhkg.size() < 512) {
                String strTrim = this.f125863nufgyqmvbu.nufgyqmvbu().trim();
                if (!strTrim.isEmpty()) {
                    if (this.f125858dxjokdxxww.eablkybsjg()) {
                        strNufgyqmvbu = this.f125858dxjokdxxww.nufgyqmvbu();
                    } else {
                        strNufgyqmvbu = this.f125856btonecajqb ? "" : null;
                    }
                    this.f125862lqeggnwhkg.ppxfxbqfkf(strTrim, strNufgyqmvbu);
                    dsvhmnatus(strTrim);
                }
            }
            jpowsppfya();
        }

        final void zdlpuopuiu(char c13, int i13, int i14) {
            this.f125863nufgyqmvbu.iobyxmoadg(c13);
            pmvmpeiblj(i13, i14);
        }
    }

    static final class eablkybsjg extends ylkuphrtab {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        String f125868eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final pkzmftpjix f125869gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final pkzmftpjix f125870lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        boolean f125871nufgyqmvbu;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final pkzmftpjix f125872wkgbmnqykc;

        eablkybsjg() {
            super(btonecajqb.Doctype);
            this.f125872wkgbmnqykc = new pkzmftpjix();
            this.f125868eablkybsjg = null;
            this.f125869gxszxtbevo = new pkzmftpjix();
            this.f125870lqeggnwhkg = new pkzmftpjix();
            this.f125871nufgyqmvbu = false;
        }

        public boolean cqumvgiudr() {
            return this.f125871nufgyqmvbu;
        }

        public String iwizpuwonk() {
            return this.f125870lqeggnwhkg.nufgyqmvbu();
        }

        String jyumaefscl() {
            return this.f125869gxszxtbevo.nufgyqmvbu();
        }

        @Override // yl.ylkuphrtab
        ylkuphrtab rgvfuqvkyq() {
            super.rgvfuqvkyq();
            this.f125872wkgbmnqykc.gxszxtbevo();
            this.f125868eablkybsjg = null;
            this.f125869gxszxtbevo.gxszxtbevo();
            this.f125870lqeggnwhkg.gxszxtbevo();
            this.f125871nufgyqmvbu = false;
            return this;
        }

        public String toString() {
            return "<!doctype " + zdlpuopuiu() + ">";
        }

        String yggfygwlhe() {
            return this.f125868eablkybsjg;
        }

        String zdlpuopuiu() {
            return this.f125872wkgbmnqykc.nufgyqmvbu();
        }
    }

    static final class gtknphoqwx extends dxjokdxxww {

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        boolean f125873vdvldrhtss;

        public gtknphoqwx(dsvhmnatus dsvhmnatusVar) {
            super(btonecajqb.XmlDecl, dsvhmnatusVar);
            this.f125873vdvldrhtss = true;
        }

        public String toString() {
            boolean z13 = this.f125873vdvldrhtss;
            String str = z13 ? "<!" : "<?";
            String str2 = z13 ? ">" : "?>";
            if (!yadqdtsiqt() || this.f125862lqeggnwhkg.size() <= 0) {
                return str + cllcsxoeiz() + str2;
            }
            return str + cllcsxoeiz() + " " + this.f125862lqeggnwhkg.toString() + str2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // yl.ylkuphrtab.dxjokdxxww, yl.ylkuphrtab
        /* JADX INFO: renamed from: wypolnanlu, reason: merged with bridge method [inline-methods] */
        public gtknphoqwx rgvfuqvkyq() {
            super.rgvfuqvkyq();
            this.f125873vdvldrhtss = true;
            return this;
        }
    }

    static final class gxszxtbevo extends ylkuphrtab {
        gxszxtbevo() {
            super(btonecajqb.EOF);
        }

        @Override // yl.ylkuphrtab
        ylkuphrtab rgvfuqvkyq() {
            super.rgvfuqvkyq();
            return this;
        }

        public String toString() {
            return "";
        }
    }

    static final class lqeggnwhkg extends dxjokdxxww {
        lqeggnwhkg(dsvhmnatus dsvhmnatusVar) {
            super(btonecajqb.EndTag, dsvhmnatusVar);
        }

        public String toString() {
            return "</" + cllcsxoeiz() + ">";
        }
    }

    static final class nufgyqmvbu extends dxjokdxxww {
        nufgyqmvbu(dsvhmnatus dsvhmnatusVar) {
            super(btonecajqb.StartTag, dsvhmnatusVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // yl.ylkuphrtab.dxjokdxxww, yl.ylkuphrtab
        /* JADX INFO: renamed from: hcddaimhww */
        public dxjokdxxww rgvfuqvkyq() {
            super.rgvfuqvkyq();
            this.f125862lqeggnwhkg = null;
            return this;
        }

        public String toString() {
            String str = iozdgvuglv() ? "/>" : ">";
            if (!yadqdtsiqt() || this.f125862lqeggnwhkg.size() <= 0) {
                return "<" + cllcsxoeiz() + str;
            }
            return "<" + cllcsxoeiz() + " " + this.f125862lqeggnwhkg.toString() + str;
        }
    }

    static final class wkgbmnqykc extends ylkuphrtab {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        boolean f125875eablkybsjg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final pkzmftpjix f125876wkgbmnqykc;

        wkgbmnqykc() {
            super(btonecajqb.Comment);
            this.f125876wkgbmnqykc = new pkzmftpjix();
            this.f125875eablkybsjg = false;
        }

        String jyumaefscl() {
            return this.f125876wkgbmnqykc.nufgyqmvbu();
        }

        @Override // yl.ylkuphrtab
        ylkuphrtab rgvfuqvkyq() {
            super.rgvfuqvkyq();
            this.f125876wkgbmnqykc.gxszxtbevo();
            this.f125875eablkybsjg = false;
            return this;
        }

        public String toString() {
            return "<!--" + jyumaefscl() + "-->";
        }

        wkgbmnqykc yggfygwlhe(String str) {
            this.f125876wkgbmnqykc.zoijcleaow(str);
            return this;
        }

        wkgbmnqykc zdlpuopuiu(char c13) {
            this.f125876wkgbmnqykc.iobyxmoadg(c13);
            return this;
        }
    }

    static final class zoijcleaow extends ppxfxbqfkf {
        zoijcleaow(String str) {
            yggfygwlhe(str);
        }

        @Override // yl.ylkuphrtab.ppxfxbqfkf
        public String toString() {
            return "<![CDATA[" + jyumaefscl() + "]]>";
        }
    }

    final boolean agtfadlqog() {
        return this.f125844iobyxmoadg == btonecajqb.EndTag;
    }

    final boolean btonecajqb() {
        return this.f125844iobyxmoadg == btonecajqb.Character;
    }

    final boolean draadjrbmk() {
        return this.f125844iobyxmoadg == btonecajqb.Doctype;
    }

    final boolean dxjokdxxww() {
        return this instanceof zoijcleaow;
    }

    final nufgyqmvbu eablkybsjg() {
        return (nufgyqmvbu) this;
    }

    final boolean gtknphoqwx() {
        return this.f125844iobyxmoadg == btonecajqb.Comment;
    }

    final gtknphoqwx gxszxtbevo() {
        return (gtknphoqwx) this;
    }

    final ppxfxbqfkf iobyxmoadg() {
        return (ppxfxbqfkf) this;
    }

    String kcexrzcfyt() {
        return getClass().getSimpleName();
    }

    int lqeggnwhkg() {
        return this.f125845ppxfxbqfkf;
    }

    void nufgyqmvbu(int i13) {
        this.f125845ppxfxbqfkf = i13;
    }

    final boolean ojitshcjhn() {
        return this.f125844iobyxmoadg == btonecajqb.StartTag;
    }

    void oxmwwwfdhm(int i13) {
        this.f125846zoijcleaow = i13;
    }

    final eablkybsjg ppxfxbqfkf() {
        return (eablkybsjg) this;
    }

    ylkuphrtab rgvfuqvkyq() {
        this.f125846zoijcleaow = -1;
        this.f125845ppxfxbqfkf = -1;
        return this;
    }

    int vdvldrhtss() {
        return this.f125846zoijcleaow;
    }

    final boolean wflxmlrfwp() {
        return this.f125844iobyxmoadg == btonecajqb.EOF;
    }

    final lqeggnwhkg wkgbmnqykc() {
        return (lqeggnwhkg) this;
    }

    final wkgbmnqykc zoijcleaow() {
        return (wkgbmnqykc) this;
    }

    static class ppxfxbqfkf extends ylkuphrtab {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final pkzmftpjix f125874wkgbmnqykc;

        ppxfxbqfkf() {
            super(btonecajqb.Character);
            this.f125874wkgbmnqykc = new pkzmftpjix();
        }

        String jyumaefscl() {
            return this.f125874wkgbmnqykc.nufgyqmvbu();
        }

        @Override // yl.ylkuphrtab
        ylkuphrtab rgvfuqvkyq() {
            super.rgvfuqvkyq();
            this.f125874wkgbmnqykc.gxszxtbevo();
            return this;
        }

        public String toString() {
            return jyumaefscl();
        }

        ppxfxbqfkf yggfygwlhe(String str) {
            this.f125874wkgbmnqykc.lqeggnwhkg(str);
            return this;
        }

        ppxfxbqfkf zdlpuopuiu(String str) {
            this.f125874wkgbmnqykc.zoijcleaow(str);
            return this;
        }

        ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar) {
            super(btonecajqb.Character);
            pkzmftpjix pkzmftpjixVar = new pkzmftpjix();
            this.f125874wkgbmnqykc = pkzmftpjixVar;
            this.f125846zoijcleaow = ppxfxbqfkfVar.f125846zoijcleaow;
            this.f125845ppxfxbqfkf = ppxfxbqfkfVar.f125845ppxfxbqfkf;
            pkzmftpjixVar.lqeggnwhkg(ppxfxbqfkfVar.f125874wkgbmnqykc.nufgyqmvbu());
        }
    }

    private ylkuphrtab(btonecajqb btonecajqbVar) {
        this.f125845ppxfxbqfkf = -1;
        this.f125844iobyxmoadg = btonecajqbVar;
    }
}
