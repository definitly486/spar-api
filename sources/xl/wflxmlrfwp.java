package xl;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jsoup.select.Selector;

/* JADX INFO: loaded from: classes3.dex */
public class wflxmlrfwp extends zdlpuopuiu implements Iterable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    iobyxmoadg f122730cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    xl.zoijcleaow f122731esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    yl.kcexrzcfyt f122732iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final List f122727lereixgezr = Collections.emptyList();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final iobyxmoadg f122728pmvmpeiblj = new iobyxmoadg(0);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final Pattern f122729zynmafqrjb = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final String f122726istkbnxepw = xl.zoijcleaow.cqumvgiudr("baseUri");

    static final class iobyxmoadg extends ArrayList {
        public iobyxmoadg(int i13) {
            super(i13);
        }

        int iobyxmoadg() {
            return ((ArrayList) this).modCount;
        }
    }

    private static class zoijcleaow implements zl.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final StringBuilder f122733iobyxmoadg;

        public zoijcleaow(StringBuilder sb3) {
            this.f122733iobyxmoadg = sb3;
        }

        @Override // zl.gxszxtbevo
        public void iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, int i13) {
            if (zdlpuopuiuVar instanceof lereixgezr) {
                wflxmlrfwp.sflfametgt(this.f122733iobyxmoadg, (lereixgezr) zdlpuopuiuVar);
            } else if (zdlpuopuiuVar instanceof wflxmlrfwp) {
                wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) zdlpuopuiuVar;
                if (this.f122733iobyxmoadg.length() > 0) {
                    if ((wflxmlrfwpVar.ageimvtcrz() || wflxmlrfwpVar.lereixgezr("br")) && !lereixgezr.zfvoamnweg(this.f122733iobyxmoadg)) {
                        this.f122733iobyxmoadg.append(' ');
                    }
                }
            }
        }

        @Override // zl.gxszxtbevo
        public void zoijcleaow(zdlpuopuiu zdlpuopuiuVar, int i13) {
            if (zdlpuopuiuVar instanceof wflxmlrfwp) {
                wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) zdlpuopuiuVar;
                zdlpuopuiu zdlpuopuiuVarZynmafqrjb = zdlpuopuiuVar.zynmafqrjb();
                if (wflxmlrfwpVar.f122732iwizpuwonk.gxszxtbevo()) {
                    return;
                }
                if (((zdlpuopuiuVarZynmafqrjb instanceof lereixgezr) || ((zdlpuopuiuVarZynmafqrjb instanceof wflxmlrfwp) && ((wflxmlrfwp) zdlpuopuiuVarZynmafqrjb).f122732iwizpuwonk.gxszxtbevo())) && !lereixgezr.zfvoamnweg(this.f122733iobyxmoadg)) {
                    this.f122733iobyxmoadg.append(' ');
                }
            }
        }
    }

    public wflxmlrfwp(yl.kcexrzcfyt kcexrzcfytVar, String str, xl.zoijcleaow zoijcleaowVar) {
        vl.zoijcleaow.btonecajqb(kcexrzcfytVar);
        this.f122730cqumvgiudr = f122728pmvmpeiblj;
        this.f122731esjtqupxsv = zoijcleaowVar;
        this.f122732iwizpuwonk = kcexrzcfytVar;
        if (str != null) {
            jhduphickx(str);
        }
    }

    static boolean c(zdlpuopuiu zdlpuopuiuVar) {
        if (zdlpuopuiuVar instanceof wflxmlrfwp) {
            wflxmlrfwp wflxmlrfwpVarHkdspvbjdz = (wflxmlrfwp) zdlpuopuiuVar;
            int i13 = 0;
            while (!wflxmlrfwpVarHkdspvbjdz.f122732iwizpuwonk.wflxmlrfwp()) {
                wflxmlrfwpVarHkdspvbjdz = wflxmlrfwpVarHkdspvbjdz.hkdspvbjdz();
                i13++;
                if (i13 >= 6 || wflxmlrfwpVarHkdspvbjdz == null) {
                }
            }
            return true;
        }
        return false;
    }

    private String e(gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg enumC3087iobyxmoadg) {
        return enumC3087iobyxmoadg == gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.xml ? wl.gxszxtbevo.wkgbmnqykc(o()) : o();
    }

    private static int fiwbwshyhd(wflxmlrfwp wflxmlrfwpVar, List list) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (list.get(i13) == wflxmlrfwpVar) {
                return i13;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void fmlbqenlif(StringBuilder sb3) {
        for (int i13 = 0; i13 < wflxmlrfwp(); i13++) {
            zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f122730cqumvgiudr.get(i13);
            if (zdlpuopuiuVar instanceof lereixgezr) {
                sflfametgt(sb3, (lereixgezr) zdlpuopuiuVar);
            } else if (zdlpuopuiuVar.lereixgezr("br") && !lereixgezr.zfvoamnweg(sb3)) {
                sb3.append(" ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void fyldjkxazc(StringBuilder sb3, zdlpuopuiu zdlpuopuiuVar, int i13) {
        if (zdlpuopuiuVar instanceof eablkybsjg) {
            sb3.append(((eablkybsjg) zdlpuopuiuVar).ydmasvzmpa());
        } else if (zdlpuopuiuVar instanceof wkgbmnqykc) {
            sb3.append(((wkgbmnqykc) zdlpuopuiuVar).ydmasvzmpa());
        } else if (zdlpuopuiuVar instanceof ppxfxbqfkf) {
            sb3.append(((ppxfxbqfkf) zdlpuopuiuVar).ydmasvzmpa());
        }
    }

    private static String g(wflxmlrfwp wflxmlrfwpVar, String str) {
        while (wflxmlrfwpVar != null) {
            xl.zoijcleaow zoijcleaowVar = wflxmlrfwpVar.f122731esjtqupxsv;
            if (zoijcleaowVar != null && zoijcleaowVar.oxmwwwfdhm(str)) {
                return wflxmlrfwpVar.f122731esjtqupxsv.ojitshcjhn(str);
            }
            wflxmlrfwpVar = wflxmlrfwpVar.hkdspvbjdz();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String ipoelvxyzq(zdlpuopuiu zdlpuopuiuVar) {
        if (zdlpuopuiuVar instanceof lereixgezr) {
            return ((lereixgezr) zdlpuopuiuVar).ydmasvzmpa();
        }
        return zdlpuopuiuVar.lereixgezr("br") ? "\n" : "";
    }

    private void l(List list) {
        Map mapYlkuphrtab = eablkybsjg().ylkuphrtab();
        mapYlkuphrtab.put("jsoup.childEls", new WeakReference(list));
        mapYlkuphrtab.put("jsoup.childElsMod", Integer.valueOf(this.f122730cqumvgiudr.iobyxmoadg()));
    }

    private List oipsdeybqn() {
        List list;
        Integer num;
        Map mapYlkuphrtab = eablkybsjg().ylkuphrtab();
        WeakReference weakReference = (WeakReference) mapYlkuphrtab.get("jsoup.childEls");
        if (weakReference == null || (list = (List) weakReference.get()) == null || (num = (Integer) mapYlkuphrtab.get("jsoup.childElsMod")) == null || num.intValue() != this.f122730cqumvgiudr.iobyxmoadg()) {
            return null;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sflfametgt(StringBuilder sb3, lereixgezr lereixgezrVar) {
        String strYdmasvzmpa = lereixgezrVar.ydmasvzmpa();
        if (c(lereixgezrVar.f122742zdlpuopuiu) || (lereixgezrVar instanceof ppxfxbqfkf)) {
            sb3.append(strYdmasvzmpa);
        } else {
            wl.kcexrzcfyt.wkgbmnqykc(sb3, strYdmasvzmpa, lereixgezr.zfvoamnweg(sb3));
        }
    }

    private List uawqvzlxes(final Class cls) {
        Stream<E> stream = this.f122730cqumvgiudr.stream();
        Objects.requireNonNull(cls);
        return (List) stream.filter(new Predicate() { // from class: xl.nufgyqmvbu
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((zdlpuopuiu) obj);
            }
        }).map(new Function() { // from class: xl.dxjokdxxww
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cls.cast((zdlpuopuiu) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new Function() { // from class: xl.btonecajqb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        }));
    }

    private static String x(Stream stream) {
        return (String) stream.map(new Function() { // from class: xl.draadjrbmk
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wflxmlrfwp.ipoelvxyzq((zdlpuopuiu) obj);
            }
        }).collect(wl.kcexrzcfyt.kcexrzcfyt(""));
    }

    public boolean ageimvtcrz() {
        return this.f122732iwizpuwonk.wkgbmnqykc();
    }

    public wflxmlrfwp auzgnhcxok() {
        for (zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiu(); zdlpuopuiuVarZdlpuopuiu != null; zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVarZdlpuopuiu.zynmafqrjb()) {
            if (zdlpuopuiuVarZdlpuopuiu instanceof wflxmlrfwp) {
                return (wflxmlrfwp) zdlpuopuiuVarZdlpuopuiu;
            }
        }
        return null;
    }

    public wflxmlrfwp b(String str, String str2) {
        yl.oxmwwwfdhm oxmwwwfdhmVarZoijcleaow = jyumaefscl.zoijcleaow(this);
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(oxmwwwfdhmVarZoijcleaow.agtfadlqog().pkzmftpjix(str, str2, oxmwwwfdhmVarZoijcleaow.wflxmlrfwp()), gxszxtbevo());
        yzdjzghtvl(wflxmlrfwpVar);
        return wflxmlrfwpVar;
    }

    List bfopjjpdmp() {
        if (wflxmlrfwp() == 0) {
            return f122727lereixgezr;
        }
        List listOipsdeybqn = oipsdeybqn();
        if (listOipsdeybqn != null) {
            return listOipsdeybqn;
        }
        List listUawqvzlxes = uawqvzlxes(wflxmlrfwp.class);
        l(listUawqvzlxes);
        return listUawqvzlxes;
    }

    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp vipkmwdibw() {
        return (wflxmlrfwp) super.vipkmwdibw();
    }

    public boolean dvvnrvtcbc(String str) {
        xl.zoijcleaow zoijcleaowVar = this.f122731esjtqupxsv;
        if (zoijcleaowVar == null) {
            return false;
        }
        String strRgvfuqvkyq = zoijcleaowVar.rgvfuqvkyq("class");
        int length = strRgvfuqvkyq.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strRgvfuqvkyq);
            }
            boolean z13 = false;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                if (Character.isWhitespace(strRgvfuqvkyq.charAt(i14))) {
                    if (!z13) {
                        continue;
                    } else {
                        if (i14 - i13 == length2 && strRgvfuqvkyq.regionMatches(true, i13, str, 0, length2)) {
                            return true;
                        }
                        z13 = false;
                    }
                } else if (!z13) {
                    i13 = i14;
                    z13 = true;
                }
            }
            if (z13 && length - i13 == length2) {
                return strRgvfuqvkyq.regionMatches(true, i13, str, 0, length2);
            }
        }
        return false;
    }

    @Override // xl.zdlpuopuiu
    public xl.zoijcleaow eablkybsjg() {
        if (this.f122731esjtqupxsv == null) {
            this.f122731esjtqupxsv = new xl.zoijcleaow();
        }
        return this.f122731esjtqupxsv;
    }

    public wflxmlrfwp eslsurpljm(String str) {
        return b(str, this.f122732iwizpuwonk.gtknphoqwx());
    }

    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: ezmngbhpjk, reason: merged with bridge method [inline-methods] */
    public final wflxmlrfwp hkdspvbjdz() {
        return this.f122742zdlpuopuiu;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer consumer) {
        stream().forEach(consumer);
    }

    public wflxmlrfwp grlcpdaxtj() {
        for (zdlpuopuiu zdlpuopuiuVarEsjtqupxsv = esjtqupxsv(); zdlpuopuiuVarEsjtqupxsv != null; zdlpuopuiuVarEsjtqupxsv = zdlpuopuiuVarEsjtqupxsv.stevsuqkhv()) {
            if (zdlpuopuiuVarEsjtqupxsv instanceof wflxmlrfwp) {
                return (wflxmlrfwp) zdlpuopuiuVarEsjtqupxsv;
            }
        }
        return null;
    }

    @Override // xl.zdlpuopuiu
    public String gxszxtbevo() {
        return g(this, f122726istkbnxepw);
    }

    public zl.zoijcleaow h(String str) {
        return Selector.zoijcleaow(str, this);
    }

    @Override // xl.zdlpuopuiu
    void hcddaimhww(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        String strE = e(iobyxmoadgVar.agtfadlqog());
        lqeggnwhkgVar.iobyxmoadg('<').zoijcleaow(strE);
        xl.zoijcleaow zoijcleaowVar = this.f122731esjtqupxsv;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.yggfygwlhe(lqeggnwhkgVar, iobyxmoadgVar);
        }
        if (!this.f122730cqumvgiudr.isEmpty()) {
            lqeggnwhkgVar.iobyxmoadg('>');
            return;
        }
        boolean z13 = iobyxmoadgVar.agtfadlqog() == gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.xml || !this.f122732iwizpuwonk.gtknphoqwx().equals("http://www.w3.org/1999/xhtml");
        if (z13 && (this.f122732iwizpuwonk.ppxfxbqfkf(yl.kcexrzcfyt.f125782istkbnxepw) || (this.f122732iwizpuwonk.lqeggnwhkg() && (this.f122732iwizpuwonk.eablkybsjg() || this.f122732iwizpuwonk.nufgyqmvbu())))) {
            lqeggnwhkgVar.zoijcleaow(" />");
        } else if (z13 || !this.f122732iwizpuwonk.eablkybsjg()) {
            lqeggnwhkgVar.zoijcleaow("></").zoijcleaow(strE).iobyxmoadg('>');
        } else {
            lqeggnwhkgVar.iobyxmoadg('>');
        }
    }

    public String hszhottldk() {
        xl.zoijcleaow zoijcleaowVar = this.f122731esjtqupxsv;
        return zoijcleaowVar != null ? zoijcleaowVar.rgvfuqvkyq("id") : "";
    }

    public String igdgnonuha() {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        skhdrjzrfn(sbEablkybsjg);
        String strEsjtqupxsv = wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
        return jyumaefscl.iobyxmoadg(this).wflxmlrfwp() ? strEsjtqupxsv.trim() : strEsjtqupxsv;
    }

    @Override // xl.zdlpuopuiu
    public String iozdgvuglv() {
        return v();
    }

    @Override // xl.zdlpuopuiu
    public String istkbnxepw() {
        return this.f122732iwizpuwonk.zoijcleaow();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new yggfygwlhe(this, wflxmlrfwp.class);
    }

    @Override // xl.zdlpuopuiu
    protected boolean iwizpuwonk() {
        return this.f122731esjtqupxsv != null;
    }

    public wflxmlrfwp iwxlajgraz() {
        return hkdspvbjdz() != null ? hkdspvbjdz().auzgnhcxok() : this;
    }

    void ixidwrxhsl(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        if (this.f122730cqumvgiudr.isEmpty()) {
            return;
        }
        lqeggnwhkgVar.zoijcleaow("</").zoijcleaow(e(iobyxmoadgVar.agtfadlqog())).iobyxmoadg('>');
    }

    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public wflxmlrfwp clone() {
        return (wflxmlrfwp) super.clone();
    }

    public wflxmlrfwp j(org.jsoup.select.wkgbmnqykc wkgbmnqykcVar) {
        return org.jsoup.select.iobyxmoadg.zoijcleaow(wkgbmnqykcVar, this);
    }

    public String jrbgnlbqoe() {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        fmlbqenlif(sbEablkybsjg);
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg).trim();
    }

    public zl.zoijcleaow k() {
        if (this.f122742zdlpuopuiu == null) {
            return new zl.zoijcleaow(0);
        }
        List<wflxmlrfwp> listBfopjjpdmp = hkdspvbjdz().bfopjjpdmp();
        zl.zoijcleaow zoijcleaowVar = new zl.zoijcleaow(listBfopjjpdmp.size() - 1);
        for (wflxmlrfwp wflxmlrfwpVar : listBfopjjpdmp) {
            if (wflxmlrfwpVar != this) {
                zoijcleaowVar.add(wflxmlrfwpVar);
            }
        }
        return zoijcleaowVar;
    }

    @Override // xl.zdlpuopuiu
    protected List kcexrzcfyt() {
        if (this.f122730cqumvgiudr == f122728pmvmpeiblj) {
            this.f122730cqumvgiudr = new iobyxmoadg(4);
        }
        return this.f122730cqumvgiudr;
    }

    @Override // xl.zdlpuopuiu
    public String lmojexxdyd() {
        return this.f122732iwizpuwonk.draadjrbmk();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: lrnfpwlwnk, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp rgvfuqvkyq(zdlpuopuiu zdlpuopuiuVar) {
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) super.rgvfuqvkyq(zdlpuopuiuVar);
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f122730cqumvgiudr.size());
        wflxmlrfwpVar.f122730cqumvgiudr = iobyxmoadgVar;
        iobyxmoadgVar.addAll(this.f122730cqumvgiudr);
        xl.zoijcleaow zoijcleaowVar = this.f122731esjtqupxsv;
        if (zoijcleaowVar != null) {
            xl.zoijcleaow zoijcleaowVarClone = zoijcleaowVar.clone();
            wflxmlrfwpVar.f122731esjtqupxsv = zoijcleaowVarClone;
            zoijcleaowVarClone.pkzmftpjix("jsoup.childEls", null);
        }
        return wflxmlrfwpVar;
    }

    public yl.kcexrzcfyt n() {
        return this.f122732iwizpuwonk;
    }

    public int nuxfzjnpeb() {
        if (hkdspvbjdz() == null) {
            return 0;
        }
        return fiwbwshyhd(this, hkdspvbjdz().bfopjjpdmp());
    }

    public String o() {
        return this.f122732iwizpuwonk.zoijcleaow();
    }

    public int opjhrmiecq() {
        return bfopjjpdmp().size();
    }

    public wflxmlrfwp p(String str) {
        return q(str, this.f122732iwizpuwonk.gtknphoqwx());
    }

    public wflxmlrfwp q(String str, String str2) {
        vl.zoijcleaow.dxjokdxxww(str, "tagName");
        vl.zoijcleaow.dxjokdxxww(str2, "namespace");
        yl.oxmwwwfdhm oxmwwwfdhmVarZoijcleaow = jyumaefscl.zoijcleaow(this);
        this.f122732iwizpuwonk = oxmwwwfdhmVarZoijcleaow.agtfadlqog().pkzmftpjix(str, str2, oxmwwwfdhmVarZoijcleaow.wflxmlrfwp());
        return this;
    }

    public esjtqupxsv roivzttewh() {
        return esjtqupxsv.zoijcleaow(this, false);
    }

    public String s() {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        new zoijcleaow(sbEablkybsjg).ppxfxbqfkf(this);
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg).trim();
    }

    public Appendable skhdrjzrfn(Appendable appendable) {
        zdlpuopuiu zdlpuopuiuVarZdlpuopuiu = zdlpuopuiu();
        if (zdlpuopuiuVarZdlpuopuiu != null) {
            iwizpuwonk iwizpuwonkVarDxjokdxxww = iwizpuwonk.dxjokdxxww(zdlpuopuiuVarZdlpuopuiu, wl.lqeggnwhkg.wkgbmnqykc(appendable));
            while (zdlpuopuiuVarZdlpuopuiu != null) {
                iwizpuwonkVarDxjokdxxww.ppxfxbqfkf(zdlpuopuiuVarZdlpuopuiu);
                zdlpuopuiuVarZdlpuopuiu = zdlpuopuiuVarZdlpuopuiu.zynmafqrjb();
            }
        }
        return appendable;
    }

    public Stream stream() {
        return jyumaefscl.wkgbmnqykc(this, wflxmlrfwp.class);
    }

    public List t() {
        return uawqvzlxes(lereixgezr.class);
    }

    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: tbqsvytpvh, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp oxmwwwfdhm() {
        Iterator<E> it = this.f122730cqumvgiudr.iterator();
        while (it.hasNext()) {
            ((zdlpuopuiu) it.next()).f122742zdlpuopuiu = null;
        }
        this.f122730cqumvgiudr.clear();
        return this;
    }

    public wflxmlrfwp u(zl.gxszxtbevo gxszxtbevoVar) {
        return (wflxmlrfwp) super.xrmfcynszj(gxszxtbevoVar);
    }

    public wflxmlrfwp uwvvkdfqfp(zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        ulzqkzuiru(zdlpuopuiuVar);
        kcexrzcfyt();
        this.f122730cqumvgiudr.add(zdlpuopuiuVar);
        zdlpuopuiuVar.okpsazkaxt(this.f122730cqumvgiudr.size() - 1);
        return this;
    }

    public String v() {
        return x(this.f122730cqumvgiudr.stream());
    }

    @Override // xl.zdlpuopuiu
    protected void vdvldrhtss(String str) {
        eablkybsjg().pmvmpeiblj(f122726istkbnxepw, str);
    }

    public String w() {
        return x(cdpycssgdh());
    }

    public String weqkydbzbr() {
        final StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        u(new zl.gxszxtbevo() { // from class: xl.gtknphoqwx
            @Override // zl.gxszxtbevo
            public final void iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, int i13) {
                wflxmlrfwp.fyldjkxazc(sbEablkybsjg, zdlpuopuiuVar, i13);
            }
        });
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    @Override // xl.zdlpuopuiu
    public int wflxmlrfwp() {
        return this.f122730cqumvgiudr.size();
    }

    public wflxmlrfwp ydmasvzmpa(String str, String str2) {
        yl.oxmwwwfdhm oxmwwwfdhmVarZoijcleaow = jyumaefscl.zoijcleaow(this);
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(oxmwwwfdhmVarZoijcleaow.agtfadlqog().pkzmftpjix(str, str2, oxmwwwfdhmVarZoijcleaow.wflxmlrfwp()), gxszxtbevo());
        uwvvkdfqfp(wflxmlrfwpVar);
        return wflxmlrfwpVar;
    }

    public wflxmlrfwp yfnezrywwk(String str) {
        return ydmasvzmpa(str, this.f122732iwizpuwonk.gtknphoqwx());
    }

    public wflxmlrfwp yzdjzghtvl(zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        zoijcleaow(0, zdlpuopuiuVar);
        return this;
    }

    public boolean zeieaojujs(String str, String str2) {
        return this.f122732iwizpuwonk.draadjrbmk().equals(str) && this.f122732iwizpuwonk.gtknphoqwx().equals(str2);
    }

    public wflxmlrfwp zfvoamnweg(zdlpuopuiu zdlpuopuiuVar) {
        return (wflxmlrfwp) super.gtknphoqwx(zdlpuopuiuVar);
    }

    public wflxmlrfwp(yl.kcexrzcfyt kcexrzcfytVar, String str) {
        this(kcexrzcfytVar, str, null);
    }
}
