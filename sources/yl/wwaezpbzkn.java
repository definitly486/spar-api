package yl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class wwaezpbzkn {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final wwaezpbzkn f125838wkgbmnqykc = kcexrzcfyt();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f125839iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private ArrayList f125840ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wwaezpbzkn f125841zoijcleaow;

    public wwaezpbzkn() {
        this.f125839iobyxmoadg = new HashMap();
        this.f125841zoijcleaow = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void cdpycssgdh(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125786yadqdtsiqt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void esjtqupxsv(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125781iozdgvuglv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void iozdgvuglv(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125784lmojexxdyd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void istkbnxepw(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125778cdpycssgdh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void iwizpuwonk(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125783lereixgezr);
    }

    static wwaezpbzkn kcexrzcfyt() {
        String[] strArr = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", AdRevenueConstants.SOURCE_KEY, "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", AdRevenueConstants.SOURCE_KEY, "track", "data", "bdi", "s", "strike", "nobr", "rb"};
        String[] strArr2 = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", AdRevenueConstants.SOURCE_KEY, "track"};
        return new wwaezpbzkn().wwaezpbzkn("http://www.w3.org/1999/xhtml", new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "br", "button", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "center", "template", "dir", "applet", "marquee", "listing", "#root"}, new Consumer() { // from class: yl.esjtqupxsv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.yggfygwlhe((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1999/xhtml", strArr, new Consumer() { // from class: yl.istkbnxepw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((kcexrzcfyt) obj).agtfadlqog(0);
            }
        }).wwaezpbzkn("http://www.w3.org/1999/xhtml", new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s", "button"}, new Consumer() { // from class: yl.cdpycssgdh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.pmvmpeiblj((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1999/xhtml", strArr2, new Consumer() { // from class: yl.yadqdtsiqt
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.zynmafqrjb((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1999/xhtml", new String[]{"pre", "plaintext", "title", "textarea", "script"}, new Consumer() { // from class: yl.iozdgvuglv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.istkbnxepw((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1999/xhtml", new String[]{"title", "textarea"}, new Consumer() { // from class: yl.lmojexxdyd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.cdpycssgdh((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1999/xhtml", new String[]{"iframe", "noembed", "noframes", "script", "style", "xmp"}, new Consumer() { // from class: yl.yggfygwlhe
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.yadqdtsiqt((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1999/xhtml", wl.gtknphoqwx.f120174iobyxmoadg, new Consumer() { // from class: yl.jyumaefscl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.iozdgvuglv((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1998/Math/MathML", new String[]{"math"}, new Consumer() { // from class: yl.iwizpuwonk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.lmojexxdyd((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/1998/Math/MathML", new String[]{"mi", "mo", "msup", "mn", "mtext"}, new Consumer() { // from class: yl.cqumvgiudr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((kcexrzcfyt) obj).agtfadlqog(0);
            }
        }).wwaezpbzkn("http://www.w3.org/2000/svg", new String[]{"svg", "femerge", "femergenode"}, new Consumer() { // from class: yl.lereixgezr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.iwizpuwonk((kcexrzcfyt) obj);
            }
        }).wwaezpbzkn("http://www.w3.org/2000/svg", new String[]{"text"}, new Consumer() { // from class: yl.pmvmpeiblj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((kcexrzcfyt) obj).agtfadlqog(0);
            }
        }).wwaezpbzkn("http://www.w3.org/2000/svg", new String[]{"script"}, new Consumer() { // from class: yl.zynmafqrjb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wwaezpbzkn.esjtqupxsv((kcexrzcfyt) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lmojexxdyd(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125783lereixgezr);
    }

    public static wwaezpbzkn ojitshcjhn() {
        return new wwaezpbzkn(f125838wkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void pmvmpeiblj(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125785pmvmpeiblj);
    }

    private void vdvldrhtss(kcexrzcfyt kcexrzcfytVar) {
        ArrayList arrayList = this.f125840ppxfxbqfkf;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(kcexrzcfytVar);
            }
        }
        ((Map) this.f125839iobyxmoadg.computeIfAbsent(kcexrzcfytVar.f125791zdlpuopuiu, new Function() { // from class: yl.zdlpuopuiu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return wwaezpbzkn.zdlpuopuiu((String) obj);
            }
        })).put(kcexrzcfytVar.f125790yggfygwlhe, kcexrzcfytVar);
    }

    private wwaezpbzkn wwaezpbzkn(String str, String[] strArr, Consumer consumer) {
        for (String str2 : strArr) {
            kcexrzcfyt kcexrzcfytVarOxmwwwfdhm = oxmwwwfdhm(str2, str);
            if (kcexrzcfytVarOxmwwwfdhm == null) {
                kcexrzcfytVarOxmwwwfdhm = new kcexrzcfyt(str2, str2, str);
                kcexrzcfytVarOxmwwwfdhm.f125788iwizpuwonk = 0;
                rgvfuqvkyq(kcexrzcfytVarOxmwwwfdhm);
            }
            consumer.accept(kcexrzcfytVarOxmwwwfdhm);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void yadqdtsiqt(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125781iozdgvuglv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void yggfygwlhe(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125783lereixgezr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map zdlpuopuiu(String str) {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zynmafqrjb(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125780esjtqupxsv);
    }

    public boolean equals(Object obj) {
        if (obj instanceof wwaezpbzkn) {
            return Objects.equals(this.f125839iobyxmoadg, ((wwaezpbzkn) obj).f125839iobyxmoadg);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f125839iobyxmoadg);
    }

    public kcexrzcfyt oxmwwwfdhm(String str, String str2) {
        kcexrzcfyt kcexrzcfytVarOxmwwwfdhm;
        kcexrzcfyt kcexrzcfytVar;
        vl.zoijcleaow.btonecajqb(str);
        vl.zoijcleaow.btonecajqb(str2);
        Map map = (Map) this.f125839iobyxmoadg.get(str2);
        if (map != null && (kcexrzcfytVar = (kcexrzcfyt) map.get(str)) != null) {
            return kcexrzcfytVar;
        }
        wwaezpbzkn wwaezpbzknVar = this.f125841zoijcleaow;
        if (wwaezpbzknVar == null || (kcexrzcfytVarOxmwwwfdhm = wwaezpbzknVar.oxmwwwfdhm(str, str2)) == null) {
            return null;
        }
        kcexrzcfyt kcexrzcfytVarIobyxmoadg = kcexrzcfytVarOxmwwwfdhm.clone();
        vdvldrhtss(kcexrzcfytVarIobyxmoadg);
        return kcexrzcfytVarIobyxmoadg;
    }

    public kcexrzcfyt pkzmftpjix(String str, String str2, vdvldrhtss vdvldrhtssVar) {
        return ylkuphrtab(str, vdvldrhtss.iobyxmoadg(str), str2, vdvldrhtssVar.gxszxtbevo());
    }

    public wwaezpbzkn rgvfuqvkyq(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.agtfadlqog(kcexrzcfyt.f125779cqumvgiudr);
        vdvldrhtss(kcexrzcfytVar);
        return this;
    }

    kcexrzcfyt ylkuphrtab(String str, String str2, String str3, boolean z13) {
        vl.zoijcleaow.btonecajqb(str);
        vl.zoijcleaow.btonecajqb(str3);
        String strTrim = str.trim();
        vl.zoijcleaow.lqeggnwhkg(strTrim);
        kcexrzcfyt kcexrzcfytVarOxmwwwfdhm = oxmwwwfdhm(strTrim, str3);
        if (kcexrzcfytVarOxmwwwfdhm != null) {
            return kcexrzcfytVarOxmwwwfdhm;
        }
        if (!z13) {
            strTrim = str2;
        }
        kcexrzcfyt kcexrzcfytVarOxmwwwfdhm2 = oxmwwwfdhm(str2, str3);
        if (kcexrzcfytVarOxmwwwfdhm2 == null) {
            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(strTrim, str2, str3);
            vdvldrhtss(kcexrzcfytVar);
            return kcexrzcfytVar;
        }
        if (!z13 || strTrim.equals(str2)) {
            return kcexrzcfytVarOxmwwwfdhm2;
        }
        kcexrzcfyt kcexrzcfytVarIobyxmoadg = kcexrzcfytVarOxmwwwfdhm2.clone();
        kcexrzcfytVarIobyxmoadg.f125790yggfygwlhe = strTrim;
        vdvldrhtss(kcexrzcfytVarIobyxmoadg);
        return kcexrzcfytVarIobyxmoadg;
    }

    public wwaezpbzkn(wwaezpbzkn wwaezpbzknVar) {
        this.f125839iobyxmoadg = new HashMap();
        this.f125841zoijcleaow = wwaezpbzknVar;
    }
}
