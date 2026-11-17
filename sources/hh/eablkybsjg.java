package hh;

import gg.vdvldrhtss;
import hg.cllcsxoeiz;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jh.cdpycssgdh;
import jh.iyctptxqzt;
import jh.lereixgezr;
import jh.vipkmwdibw;
import jh.wflxmlrfwp;
import jh.xrmfcynszj;
import jh.yfnezrywwk;
import kh.nufgyqmvbu;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mh.dsvhmnatus;
import mh.kcexrzcfyt;
import mh.ntlheqmsrt;
import zi.ikoacuggdj;
import zi.kegysxyocb;
import zi.mhtqkkgtqm;
import zi.wizcaqwiak;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends dsvhmnatus {

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    public static final iobyxmoadg f40293crxdokpmqz = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final iyctptxqzt zoijcleaow(eablkybsjg eablkybsjgVar, int i13, yfnezrywwk yfnezrywwkVar) {
            String lowerCase;
            String strZoijcleaow = yfnezrywwkVar.getName().zoijcleaow();
            zdlpuopuiu.dxjokdxxww(strZoijcleaow, "asString(...)");
            if (zdlpuopuiu.eablkybsjg(strZoijcleaow, "T")) {
                lowerCase = "instance";
            } else if (zdlpuopuiu.eablkybsjg(strZoijcleaow, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strZoijcleaow.toLowerCase(Locale.ROOT);
                zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
            }
            nufgyqmvbu nufgyqmvbuVarZoijcleaow = nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow();
            ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(lowerCase);
            zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
            ikoacuggdj ikoacuggdjVarOjitshcjhn = yfnezrywwkVar.ojitshcjhn();
            zdlpuopuiu.dxjokdxxww(ikoacuggdjVarOjitshcjhn, "getDefaultType(...)");
            xrmfcynszj NO_SOURCE = xrmfcynszj.f51348iobyxmoadg;
            zdlpuopuiu.dxjokdxxww(NO_SOURCE, "NO_SOURCE");
            return new ntlheqmsrt(eablkybsjgVar, null, i13, nufgyqmvbuVarZoijcleaow, gxszxtbevoVarGxszxtbevo, ikoacuggdjVarOjitshcjhn, false, false, false, null, NO_SOURCE);
        }

        public final eablkybsjg iobyxmoadg(zoijcleaow functionClass, boolean z13) {
            zdlpuopuiu.btonecajqb(functionClass, "functionClass");
            List listRgvfuqvkyq = functionClass.rgvfuqvkyq();
            eablkybsjg eablkybsjgVar = new eablkybsjg(functionClass, null, jh.zoijcleaow.iobyxmoadg.DECLARATION, z13, null);
            vipkmwdibw vipkmwdibwVarFiwbwshyhd = functionClass.fiwbwshyhd();
            List listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
            List listWflxmlrfwp2 = jyumaefscl.wflxmlrfwp();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listRgvfuqvkyq) {
                if (((yfnezrywwk) obj).draadjrbmk() != mhtqkkgtqm.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<cllcsxoeiz> iterableU = jyumaefscl.u(arrayList);
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(iterableU, 10));
            for (cllcsxoeiz cllcsxoeizVar : iterableU) {
                arrayList2.add(eablkybsjg.f40293crxdokpmqz.zoijcleaow(eablkybsjgVar, cllcsxoeizVar.ppxfxbqfkf(), (yfnezrywwk) cllcsxoeizVar.wkgbmnqykc()));
            }
            eablkybsjgVar.fmlbqenlif(null, vipkmwdibwVarFiwbwshyhd, listWflxmlrfwp, listWflxmlrfwp2, arrayList2, ((yfnezrywwk) jyumaefscl.skhdrjzrfn(listRgvfuqvkyq)).ojitshcjhn(), cdpycssgdh.ABSTRACT, jh.zdlpuopuiu.f51354eablkybsjg);
            eablkybsjgVar.c(true);
            return eablkybsjgVar;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ eablkybsjg(wflxmlrfwp wflxmlrfwpVar, eablkybsjg eablkybsjgVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, boolean z13, gtknphoqwx gtknphoqwxVar) {
        this(wflxmlrfwpVar, eablkybsjgVar, iobyxmoadgVar, z13);
    }

    private final lereixgezr s(List list) {
        ii.gxszxtbevo gxszxtbevoVar;
        int size = dxjokdxxww().size() - list.size();
        boolean z13 = true;
        if (size == 0) {
            List listDxjokdxxww = dxjokdxxww();
            zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
            List<vdvldrhtss> listW = jyumaefscl.w(list, listDxjokdxxww);
            if (listW == null || !listW.isEmpty()) {
                for (vdvldrhtss vdvldrhtssVar : listW) {
                    if (!zdlpuopuiu.eablkybsjg((ii.gxszxtbevo) vdvldrhtssVar.iobyxmoadg(), ((iyctptxqzt) vdvldrhtssVar.wkgbmnqykc()).getName())) {
                    }
                }
            }
            return this;
        }
        List<iyctptxqzt> listDxjokdxxww2 = dxjokdxxww();
        zdlpuopuiu.dxjokdxxww(listDxjokdxxww2, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listDxjokdxxww2, 10));
        for (iyctptxqzt iyctptxqztVar : listDxjokdxxww2) {
            ii.gxszxtbevo name = iyctptxqztVar.getName();
            zdlpuopuiu.dxjokdxxww(name, "getName(...)");
            int index = iyctptxqztVar.getIndex();
            int i13 = index - size;
            if (i13 >= 0 && (gxszxtbevoVar = (ii.gxszxtbevo) list.get(i13)) != null) {
                name = gxszxtbevoVar;
            }
            arrayList.add(iyctptxqztVar.stevsuqkhv(this, name, index));
        }
        kcexrzcfyt.ppxfxbqfkf ppxfxbqfkfVarEzmngbhpjk = ezmngbhpjk(wizcaqwiak.f130146zoijcleaow);
        if (list.isEmpty()) {
            z13 = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ii.gxszxtbevo) it.next()) == null) {
                }
            }
            z13 = false;
        }
        kcexrzcfyt.ppxfxbqfkf ppxfxbqfkfVarGtknphoqwx = ppxfxbqfkfVarEzmngbhpjk.lmojexxdyd(z13).ppxfxbqfkf(arrayList).gtknphoqwx(iobyxmoadg());
        zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarGtknphoqwx, "setOriginal(...)");
        lereixgezr lereixgezrVarIpoelvxyzq = super.ipoelvxyzq(ppxfxbqfkfVarGtknphoqwx);
        zdlpuopuiu.lqeggnwhkg(lereixgezrVarIpoelvxyzq);
        return lereixgezrVarIpoelvxyzq;
    }

    @Override // mh.dsvhmnatus, mh.kcexrzcfyt
    protected kcexrzcfyt fyldjkxazc(wflxmlrfwp newOwner, lereixgezr lereixgezrVar, jh.zoijcleaow.iobyxmoadg kind, ii.gxszxtbevo gxszxtbevoVar, nufgyqmvbu annotations, xrmfcynszj source) {
        zdlpuopuiu.btonecajqb(newOwner, "newOwner");
        zdlpuopuiu.btonecajqb(kind, "kind");
        zdlpuopuiu.btonecajqb(annotations, "annotations");
        zdlpuopuiu.btonecajqb(source, "source");
        return new eablkybsjg(newOwner, (eablkybsjg) lereixgezrVar, kind, isSuspend());
    }

    @Override // mh.kcexrzcfyt
    protected lereixgezr ipoelvxyzq(kcexrzcfyt.ppxfxbqfkf configuration) {
        zdlpuopuiu.btonecajqb(configuration, "configuration");
        eablkybsjg eablkybsjgVar = (eablkybsjg) super.ipoelvxyzq(configuration);
        if (eablkybsjgVar == null) {
            return null;
        }
        List listDxjokdxxww = eablkybsjgVar.dxjokdxxww();
        zdlpuopuiu.dxjokdxxww(listDxjokdxxww, "getValueParameters(...)");
        if (listDxjokdxxww != null && listDxjokdxxww.isEmpty()) {
            return eablkybsjgVar;
        }
        Iterator it = listDxjokdxxww.iterator();
        while (it.hasNext()) {
            kegysxyocb type = ((iyctptxqzt) it.next()).getType();
            zdlpuopuiu.dxjokdxxww(type, "getType(...)");
            if (gh.nufgyqmvbu.wkgbmnqykc(type) != null) {
                List listDxjokdxxww2 = eablkybsjgVar.dxjokdxxww();
                zdlpuopuiu.dxjokdxxww(listDxjokdxxww2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listDxjokdxxww2, 10));
                Iterator it2 = listDxjokdxxww2.iterator();
                while (it2.hasNext()) {
                    kegysxyocb type2 = ((iyctptxqzt) it2.next()).getType();
                    zdlpuopuiu.dxjokdxxww(type2, "getType(...)");
                    arrayList.add(gh.nufgyqmvbu.wkgbmnqykc(type2));
                }
                return eablkybsjgVar.s(arrayList);
            }
        }
        return eablkybsjgVar;
    }

    @Override // mh.kcexrzcfyt, jh.istkbnxepw
    public boolean isExternal() {
        return false;
    }

    @Override // mh.kcexrzcfyt, jh.lereixgezr
    public boolean isInline() {
        return false;
    }

    @Override // mh.kcexrzcfyt, jh.lereixgezr
    public boolean istkbnxepw() {
        return false;
    }

    private eablkybsjg(wflxmlrfwp wflxmlrfwpVar, eablkybsjg eablkybsjgVar, jh.zoijcleaow.iobyxmoadg iobyxmoadgVar, boolean z13) {
        super(wflxmlrfwpVar, eablkybsjgVar, nufgyqmvbu.f55413nufgyqmvbu.zoijcleaow(), gj.zdlpuopuiu.f37601dxjokdxxww, iobyxmoadgVar, xrmfcynszj.f51348iobyxmoadg);
        i(true);
        k(z13);
        b(false);
    }
}
