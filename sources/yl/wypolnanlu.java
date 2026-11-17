package yl;

import java.io.Reader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class wypolnanlu extends dsvhmnatus {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ArrayDeque f125842agtfadlqog = new ArrayDeque();

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f125843iobyxmoadg;

        static {
            int[] iArr = new int[ylkuphrtab.btonecajqb.values().length];
            f125843iobyxmoadg = iArr;
            try {
                iArr[ylkuphrtab.btonecajqb.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125843iobyxmoadg[ylkuphrtab.btonecajqb.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125843iobyxmoadg[ylkuphrtab.btonecajqb.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125843iobyxmoadg[ylkuphrtab.btonecajqb.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125843iobyxmoadg[ylkuphrtab.btonecajqb.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125843iobyxmoadg[ylkuphrtab.btonecajqb.XmlDecl.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f125843iobyxmoadg[ylkuphrtab.btonecajqb.EOF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static void cqumvgiudr(xl.zoijcleaow zoijcleaowVar, HashMap map) {
        String str;
        HashMap map2 = new HashMap();
        Iterator it = zoijcleaowVar.iterator();
        while (it.hasNext()) {
            String strAgtfadlqog = ((xl.iobyxmoadg) it.next()).agtfadlqog();
            if (!strAgtfadlqog.isEmpty() && !strAgtfadlqog.equals("xmlns") && (str = (String) map.get(strAgtfadlqog)) != null) {
                map2.put("jsoup.xmlns-" + strAgtfadlqog, str);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            zoijcleaowVar.pkzmftpjix((String) entry.getKey(), entry.getValue());
        }
    }

    private static void lmojexxdyd(xl.zoijcleaow zoijcleaowVar, HashMap map) {
        Iterator it = zoijcleaowVar.iterator();
        while (it.hasNext()) {
            xl.iobyxmoadg iobyxmoadgVar = (xl.iobyxmoadg) it.next();
            String strZoijcleaow = iobyxmoadgVar.getKey();
            String strWkgbmnqykc = iobyxmoadgVar.getValue();
            if (strZoijcleaow.equals("xmlns")) {
                map.put("", strWkgbmnqykc);
            } else if (strZoijcleaow.startsWith("xmlns:")) {
                map.put(strZoijcleaow.substring(6), strWkgbmnqykc);
            }
        }
    }

    private static String wwaezpbzkn(String str, HashMap map) {
        String str2 = (String) map.get("");
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0) {
            return str2;
        }
        String strSubstring = str.substring(0, iIndexOf);
        return map.containsKey(strSubstring) ? (String) map.get(strSubstring) : str2;
    }

    @Override // yl.dsvhmnatus
    xl.wflxmlrfwp agtfadlqog() {
        this.f125842agtfadlqog.pop();
        return super.agtfadlqog();
    }

    void cdpycssgdh(ylkuphrtab.gtknphoqwx gtknphoqwxVar) {
        xl.pmvmpeiblj pmvmpeibljVar = new xl.pmvmpeiblj(gtknphoqwxVar.lmojexxdyd(), gtknphoqwxVar.f125873vdvldrhtss);
        if (gtknphoqwxVar.f125862lqeggnwhkg != null) {
            pmvmpeibljVar.eablkybsjg().wkgbmnqykc(gtknphoqwxVar.f125862lqeggnwhkg);
        }
        istkbnxepw(pmvmpeibljVar);
    }

    @Override // yl.dsvhmnatus
    protected void dxjokdxxww(Reader reader, String str, oxmwwwfdhm oxmwwwfdhmVar) {
        super.dxjokdxxww(reader, str, oxmwwwfdhmVar);
        this.f125749wkgbmnqykc.C().ojitshcjhn(xl.gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.xml).eablkybsjg(xl.ojitshcjhn.ppxfxbqfkf.xhtml).draadjrbmk(false);
        this.f125842agtfadlqog.clear();
        HashMap map = new HashMap();
        map.put("xml", "http://www.w3.org/XML/1998/namespace");
        map.put("", "http://www.w3.org/XML/1998/namespace");
        this.f125842agtfadlqog.push(map);
    }

    @Override // yl.dsvhmnatus
    public String eablkybsjg() {
        return "http://www.w3.org/XML/1998/namespace";
    }

    void esjtqupxsv(ylkuphrtab.ppxfxbqfkf ppxfxbqfkfVar) {
        xl.kcexrzcfyt eablkybsjgVar;
        String strJyumaefscl = ppxfxbqfkfVar.jyumaefscl();
        if (ppxfxbqfkfVar.dxjokdxxww()) {
            eablkybsjgVar = new xl.ppxfxbqfkf(strJyumaefscl);
        } else {
            eablkybsjgVar = zoijcleaow().n().ppxfxbqfkf(kcexrzcfyt.f125781iozdgvuglv) ? new xl.eablkybsjg(strJyumaefscl) : new xl.lereixgezr(strJyumaefscl);
        }
        istkbnxepw(eablkybsjgVar);
    }

    @Override // yl.dsvhmnatus
    vdvldrhtss gxszxtbevo() {
        return vdvldrhtss.f125806wkgbmnqykc;
    }

    protected void iozdgvuglv(ylkuphrtab.lqeggnwhkg lqeggnwhkgVar) {
        xl.wflxmlrfwp wflxmlrfwpVar;
        String strWkgbmnqykc = this.f125746nufgyqmvbu.wkgbmnqykc(lqeggnwhkgVar.lmojexxdyd());
        int size = this.f125741eablkybsjg.size();
        int i13 = size + (-1) >= 256 ? size - 257 : 0;
        int size2 = this.f125741eablkybsjg.size() - 1;
        while (true) {
            if (size2 < i13) {
                wflxmlrfwpVar = null;
                break;
            }
            wflxmlrfwpVar = (xl.wflxmlrfwp) this.f125741eablkybsjg.get(size2);
            if (wflxmlrfwpVar.istkbnxepw().equals(strWkgbmnqykc)) {
                break;
            } else {
                size2--;
            }
        }
        if (wflxmlrfwpVar == null) {
            return;
        }
        for (int size3 = this.f125741eablkybsjg.size() - 1; size3 >= 0 && agtfadlqog() != wflxmlrfwpVar; size3--) {
        }
    }

    void istkbnxepw(xl.kcexrzcfyt kcexrzcfytVar) {
        zoijcleaow().uwvvkdfqfp(kcexrzcfytVar);
        draadjrbmk(kcexrzcfytVar);
    }

    void lereixgezr(ylkuphrtab.wkgbmnqykc wkgbmnqykcVar) {
        istkbnxepw(new xl.wkgbmnqykc(wkgbmnqykcVar.jyumaefscl()));
    }

    @Override // yl.dsvhmnatus
    wwaezpbzkn lqeggnwhkg() {
        return new wwaezpbzkn();
    }

    @Override // yl.dsvhmnatus
    protected boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar) {
        this.f125745lqeggnwhkg = ylkuphrtabVar;
        switch (iobyxmoadg.f125843iobyxmoadg[ylkuphrtabVar.f125844iobyxmoadg.ordinal()]) {
            case 1:
                zynmafqrjb(ylkuphrtabVar.eablkybsjg());
                break;
            case 2:
                iozdgvuglv(ylkuphrtabVar.wkgbmnqykc());
                break;
            case 3:
                lereixgezr(ylkuphrtabVar.zoijcleaow());
                break;
            case 4:
                esjtqupxsv(ylkuphrtabVar.iobyxmoadg());
                break;
            case 5:
                pmvmpeiblj(ylkuphrtabVar.ppxfxbqfkf());
                break;
            case 6:
                cdpycssgdh(ylkuphrtabVar.gxszxtbevo());
                break;
            case 7:
                break;
            default:
                vl.zoijcleaow.iobyxmoadg("Unexpected token type: " + ylkuphrtabVar.f125844iobyxmoadg);
                break;
        }
        return true;
    }

    void pmvmpeiblj(ylkuphrtab.eablkybsjg eablkybsjgVar) {
        xl.lqeggnwhkg lqeggnwhkgVar = new xl.lqeggnwhkg(this.f125746nufgyqmvbu.wkgbmnqykc(eablkybsjgVar.zdlpuopuiu()), eablkybsjgVar.jyumaefscl(), eablkybsjgVar.iwizpuwonk());
        lqeggnwhkgVar.zfvoamnweg(eablkybsjgVar.yggfygwlhe());
        istkbnxepw(lqeggnwhkgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // yl.dsvhmnatus
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public wypolnanlu btonecajqb() {
        return new wypolnanlu();
    }

    void zynmafqrjb(ylkuphrtab.nufgyqmvbu nufgyqmvbuVar) {
        HashMap map = new HashMap((Map) this.f125842agtfadlqog.peek());
        this.f125842agtfadlqog.push(map);
        xl.zoijcleaow zoijcleaowVar = nufgyqmvbuVar.f125862lqeggnwhkg;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.agtfadlqog(this.f125746nufgyqmvbu);
            lmojexxdyd(zoijcleaowVar, map);
            cqumvgiudr(zoijcleaowVar, map);
        }
        String strNufgyqmvbu = nufgyqmvbuVar.f125867wkgbmnqykc.nufgyqmvbu();
        kcexrzcfyt kcexrzcfytVarYggfygwlhe = yggfygwlhe(strNufgyqmvbu, nufgyqmvbuVar.f125859eablkybsjg, wwaezpbzkn(strNufgyqmvbu, map), this.f125746nufgyqmvbu);
        xl.wflxmlrfwp wflxmlrfwpVar = new xl.wflxmlrfwp(kcexrzcfytVarYggfygwlhe, null, this.f125746nufgyqmvbu.ppxfxbqfkf(zoijcleaowVar));
        zoijcleaow().uwvvkdfqfp(wflxmlrfwpVar);
        oxmwwwfdhm(wflxmlrfwpVar);
        if (nufgyqmvbuVar.iozdgvuglv()) {
            kcexrzcfytVarYggfygwlhe.ojitshcjhn();
            agtfadlqog();
        } else {
            if (kcexrzcfytVarYggfygwlhe.eablkybsjg()) {
                agtfadlqog();
                return;
            }
            cllcsxoeiz cllcsxoeizVarRgvfuqvkyq = kcexrzcfytVarYggfygwlhe.rgvfuqvkyq();
            if (cllcsxoeizVarRgvfuqvkyq != null) {
                this.f125747ppxfxbqfkf.cqumvgiudr(cllcsxoeizVarRgvfuqvkyq);
            }
        }
    }
}
