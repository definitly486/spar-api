package xl;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class gxszxtbevo extends wflxmlrfwp {

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final org.jsoup.select.wkgbmnqykc f122671wwaezpbzkn = new org.jsoup.select.wkgbmnqykc.cllcsxoeiz("title");

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private iobyxmoadg f122672cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private zoijcleaow f122673iozdgvuglv;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final String f122674lmojexxdyd;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private yl.oxmwwwfdhm f122675yadqdtsiqt;

    public static class iobyxmoadg implements Cloneable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private ojitshcjhn.ppxfxbqfkf f122682zdlpuopuiu = ojitshcjhn.ppxfxbqfkf.base;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Charset f122681yggfygwlhe = vl.iobyxmoadg.f117488zoijcleaow;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f122679jyumaefscl = true;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f122678iwizpuwonk = false;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private int f122676cqumvgiudr = 1;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private int f122677esjtqupxsv = 30;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private EnumC3087iobyxmoadg f122680lereixgezr = EnumC3087iobyxmoadg.html;

        /* JADX INFO: renamed from: xl.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public enum EnumC3087iobyxmoadg {
            html,
            xml
        }

        public EnumC3087iobyxmoadg agtfadlqog() {
            return this.f122680lereixgezr;
        }

        public iobyxmoadg draadjrbmk(boolean z13) {
            this.f122679jyumaefscl = z13;
            return this;
        }

        public iobyxmoadg eablkybsjg(ojitshcjhn.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f122682zdlpuopuiu = ppxfxbqfkfVar;
            return this;
        }

        public boolean gtknphoqwx() {
            return this.f122678iwizpuwonk;
        }

        public ojitshcjhn.ppxfxbqfkf gxszxtbevo() {
            return this.f122682zdlpuopuiu;
        }

        public Charset iobyxmoadg() {
            return this.f122681yggfygwlhe;
        }

        public int lqeggnwhkg() {
            return this.f122676cqumvgiudr;
        }

        public int nufgyqmvbu() {
            return this.f122677esjtqupxsv;
        }

        public iobyxmoadg ojitshcjhn(EnumC3087iobyxmoadg enumC3087iobyxmoadg) {
            this.f122680lereixgezr = enumC3087iobyxmoadg;
            if (enumC3087iobyxmoadg == EnumC3087iobyxmoadg.xml) {
                eablkybsjg(ojitshcjhn.ppxfxbqfkf.xhtml);
            }
            return this;
        }

        public iobyxmoadg ppxfxbqfkf(Charset charset) {
            this.f122681yggfygwlhe = charset;
            return this;
        }

        public boolean wflxmlrfwp() {
            return this.f122679jyumaefscl;
        }

        /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
        public iobyxmoadg clone() {
            try {
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) super.clone();
                iobyxmoadgVar.zoijcleaow(this.f122681yggfygwlhe.name());
                iobyxmoadgVar.f122682zdlpuopuiu = ojitshcjhn.ppxfxbqfkf.valueOf(this.f122682zdlpuopuiu.name());
                return iobyxmoadgVar;
            } catch (CloneNotSupportedException e13) {
                throw new RuntimeException(e13);
            }
        }

        public iobyxmoadg zoijcleaow(String str) {
            ppxfxbqfkf(Charset.forName(str));
            return this;
        }
    }

    public enum zoijcleaow {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public gxszxtbevo(String str, String str2) {
        this(str, str2, yl.oxmwwwfdhm.eablkybsjg());
    }

    private wflxmlrfwp B() {
        for (wflxmlrfwp wflxmlrfwpVarAuzgnhcxok = auzgnhcxok(); wflxmlrfwpVarAuzgnhcxok != null; wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarAuzgnhcxok.pmvmpeiblj()) {
            if (wflxmlrfwpVarAuzgnhcxok.lereixgezr("html")) {
                return wflxmlrfwpVarAuzgnhcxok;
            }
        }
        return yfnezrywwk("html");
    }

    public wflxmlrfwp A() {
        wflxmlrfwp wflxmlrfwpVarB = B();
        for (wflxmlrfwp wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarB.auzgnhcxok(); wflxmlrfwpVarAuzgnhcxok != null; wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarAuzgnhcxok.pmvmpeiblj()) {
            if (wflxmlrfwpVarAuzgnhcxok.lereixgezr("head")) {
                return wflxmlrfwpVarAuzgnhcxok;
            }
        }
        return wflxmlrfwpVarB.eslsurpljm("head");
    }

    public iobyxmoadg C() {
        return this.f122672cdpycssgdh;
    }

    public gxszxtbevo D(yl.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f122675yadqdtsiqt = oxmwwwfdhmVar;
        return this;
    }

    public yl.oxmwwwfdhm E() {
        return this.f122675yadqdtsiqt;
    }

    public zoijcleaow F() {
        return this.f122673iozdgvuglv;
    }

    public gxszxtbevo G(zoijcleaow zoijcleaowVar) {
        this.f122673iozdgvuglv = zoijcleaowVar;
        return this;
    }

    public gxszxtbevo H() {
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(n().gtknphoqwx(), gxszxtbevo(), this.f122675yadqdtsiqt);
        xl.zoijcleaow zoijcleaowVar = this.f122731esjtqupxsv;
        if (zoijcleaowVar != null) {
            gxszxtbevoVar.f122731esjtqupxsv = zoijcleaowVar.clone();
        }
        gxszxtbevoVar.f122672cdpycssgdh = this.f122672cdpycssgdh.clone();
        return gxszxtbevoVar;
    }

    public String I() {
        wflxmlrfwp wflxmlrfwpVarJ = A().j(f122671wwaezpbzkn);
        return wflxmlrfwpVarJ != null ? wl.kcexrzcfyt.iwizpuwonk(wflxmlrfwpVarJ.s()).trim() : "";
    }

    @Override // xl.wflxmlrfwp, xl.zdlpuopuiu
    public String istkbnxepw() {
        return "#document";
    }

    public wflxmlrfwp y() {
        wflxmlrfwp wflxmlrfwpVarB = B();
        for (wflxmlrfwp wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarB.auzgnhcxok(); wflxmlrfwpVarAuzgnhcxok != null; wflxmlrfwpVarAuzgnhcxok = wflxmlrfwpVarAuzgnhcxok.pmvmpeiblj()) {
            if (wflxmlrfwpVarAuzgnhcxok.lereixgezr("body") || wflxmlrfwpVarAuzgnhcxok.lereixgezr("frameset")) {
                return wflxmlrfwpVarAuzgnhcxok;
            }
        }
        return wflxmlrfwpVarB.yfnezrywwk("body");
    }

    @Override // xl.zdlpuopuiu
    public String ylkuphrtab() {
        return super.igdgnonuha();
    }

    @Override // xl.wflxmlrfwp, xl.zdlpuopuiu
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public gxszxtbevo ojitshcjhn() {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) super.clone();
        xl.zoijcleaow zoijcleaowVar = this.f122731esjtqupxsv;
        if (zoijcleaowVar != null) {
            gxszxtbevoVar.f122731esjtqupxsv = zoijcleaowVar.clone();
        }
        gxszxtbevoVar.f122672cdpycssgdh = this.f122672cdpycssgdh.clone();
        return gxszxtbevoVar;
    }

    private gxszxtbevo(String str, String str2, yl.oxmwwwfdhm oxmwwwfdhmVar) {
        super(new yl.kcexrzcfyt("#root", str), str2);
        this.f122672cdpycssgdh = new iobyxmoadg();
        this.f122673iozdgvuglv = zoijcleaow.noQuirks;
        this.f122674lmojexxdyd = str2;
        this.f122675yadqdtsiqt = oxmwwwfdhmVar;
    }

    public gxszxtbevo(String str) {
        this("http://www.w3.org/1999/xhtml", str);
    }
}
