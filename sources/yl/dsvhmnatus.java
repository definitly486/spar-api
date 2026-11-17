package yl;

import java.io.Reader;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dsvhmnatus {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    zl.gxszxtbevo f125738btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ylkuphrtab.lqeggnwhkg f125739draadjrbmk = new ylkuphrtab.lqeggnwhkg(this);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    wwaezpbzkn f125740dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    ArrayList f125741eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private ylkuphrtab.nufgyqmvbu f125742gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    String f125743gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected oxmwwwfdhm f125744iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    ylkuphrtab f125745lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    vdvldrhtss f125746nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    hkdspvbjdz f125747ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    boolean f125748wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    xl.gxszxtbevo f125749wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    draadjrbmk f125750zoijcleaow;

    dsvhmnatus() {
    }

    xl.wflxmlrfwp agtfadlqog() {
        xl.wflxmlrfwp wflxmlrfwpVar = (xl.wflxmlrfwp) this.f125741eablkybsjg.remove(this.f125741eablkybsjg.size() - 1);
        gtknphoqwx(wflxmlrfwpVar);
        return wflxmlrfwpVar;
    }

    abstract dsvhmnatus btonecajqb();

    void draadjrbmk(xl.zdlpuopuiu zdlpuopuiuVar) {
        iwizpuwonk(zdlpuopuiuVar, true);
        zl.gxszxtbevo gxszxtbevoVar = this.f125738btonecajqb;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.iobyxmoadg(zdlpuopuiuVar, this.f125741eablkybsjg.size());
        }
    }

    void dxjokdxxww(Reader reader, String str, oxmwwwfdhm oxmwwwfdhmVar) {
        vl.zoijcleaow.draadjrbmk(reader, "input");
        vl.zoijcleaow.draadjrbmk(str, "baseUri");
        vl.zoijcleaow.btonecajqb(oxmwwwfdhmVar);
        xl.gxszxtbevo gxszxtbevoVar = new xl.gxszxtbevo(oxmwwwfdhmVar.zoijcleaow(), str);
        this.f125749wkgbmnqykc = gxszxtbevoVar;
        gxszxtbevoVar.D(oxmwwwfdhmVar);
        this.f125744iobyxmoadg = oxmwwwfdhmVar;
        this.f125746nufgyqmvbu = oxmwwwfdhmVar.wflxmlrfwp();
        this.f125750zoijcleaow = new draadjrbmk(reader);
        this.f125748wflxmlrfwp = oxmwwwfdhmVar.lqeggnwhkg();
        this.f125750zoijcleaow.L(oxmwwwfdhmVar.gxszxtbevo() || this.f125748wflxmlrfwp);
        if (oxmwwwfdhmVar.gxszxtbevo()) {
            oxmwwwfdhmVar.ppxfxbqfkf().clear();
        }
        this.f125747ppxfxbqfkf = new hkdspvbjdz(this);
        this.f125741eablkybsjg = new ArrayList(32);
        this.f125740dxjokdxxww = oxmwwwfdhmVar.agtfadlqog();
        ylkuphrtab.nufgyqmvbu nufgyqmvbuVar = new ylkuphrtab.nufgyqmvbu(this);
        this.f125742gtknphoqwx = nufgyqmvbuVar;
        this.f125745lqeggnwhkg = nufgyqmvbuVar;
        this.f125743gxszxtbevo = str;
        draadjrbmk(this.f125749wkgbmnqykc);
    }

    String eablkybsjg() {
        return "http://www.w3.org/1999/xhtml";
    }

    void gtknphoqwx(xl.zdlpuopuiu zdlpuopuiuVar) {
        iwizpuwonk(zdlpuopuiuVar, false);
        zl.gxszxtbevo gxszxtbevoVar = this.f125738btonecajqb;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.zoijcleaow(zdlpuopuiuVar, this.f125741eablkybsjg.size());
        }
    }

    abstract vdvldrhtss gxszxtbevo();

    void iobyxmoadg() {
        draadjrbmk draadjrbmkVar = this.f125750zoijcleaow;
        if (draadjrbmkVar == null) {
            return;
        }
        draadjrbmkVar.close();
        this.f125750zoijcleaow = null;
        this.f125747ppxfxbqfkf = null;
        this.f125741eablkybsjg = null;
    }

    void iwizpuwonk(xl.zdlpuopuiu zdlpuopuiuVar, boolean z13) {
        if (this.f125748wflxmlrfwp) {
            ylkuphrtab ylkuphrtabVar = this.f125745lqeggnwhkg;
            int iVdvldrhtss = ylkuphrtabVar.vdvldrhtss();
            int iLqeggnwhkg = ylkuphrtabVar.lqeggnwhkg();
            if (zdlpuopuiuVar instanceof xl.wflxmlrfwp) {
                xl.wflxmlrfwp wflxmlrfwpVar = (xl.wflxmlrfwp) zdlpuopuiuVar;
                if (ylkuphrtabVar.wflxmlrfwp()) {
                    if (wflxmlrfwpVar.roivzttewh().iobyxmoadg()) {
                        return;
                    } else {
                        iVdvldrhtss = this.f125750zoijcleaow.w();
                    }
                } else if (!z13 ? !(wflxmlrfwpVar.n().eablkybsjg() || wflxmlrfwpVar.n().nufgyqmvbu() || (ylkuphrtabVar.agtfadlqog() && wflxmlrfwpVar.lmojexxdyd().equals(ylkuphrtabVar.wkgbmnqykc().f125859eablkybsjg))) : !(ylkuphrtabVar.ojitshcjhn() && wflxmlrfwpVar.lmojexxdyd().equals(ylkuphrtabVar.eablkybsjg().f125859eablkybsjg))) {
                }
                iLqeggnwhkg = iVdvldrhtss;
            }
            zdlpuopuiuVar.eablkybsjg().pkzmftpjix(z13 ? "jsoup.start" : "jsoup.end", new xl.esjtqupxsv(new xl.esjtqupxsv.zoijcleaow(iVdvldrhtss, this.f125750zoijcleaow.mhtqkkgtqm(iVdvldrhtss), this.f125750zoijcleaow.jyumaefscl(iVdvldrhtss)), new xl.esjtqupxsv.zoijcleaow(iLqeggnwhkg, this.f125750zoijcleaow.mhtqkkgtqm(iLqeggnwhkg), this.f125750zoijcleaow.jyumaefscl(iLqeggnwhkg))));
        }
    }

    kcexrzcfyt jyumaefscl(ylkuphrtab.dxjokdxxww dxjokdxxwwVar) {
        return this.f125740dxjokdxxww.ylkuphrtab(dxjokdxxwwVar.lmojexxdyd(), dxjokdxxwwVar.f125859eablkybsjg, eablkybsjg(), this.f125746nufgyqmvbu.gxszxtbevo());
    }

    void kcexrzcfyt() {
        while (zdlpuopuiu()) {
        }
        iobyxmoadg();
    }

    wwaezpbzkn lqeggnwhkg() {
        return wwaezpbzkn.ojitshcjhn();
    }

    void nufgyqmvbu(String str, Object... objArr) {
        rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = this.f125744iobyxmoadg.ppxfxbqfkf();
        if (rgvfuqvkyqVarPpxfxbqfkf.iobyxmoadg()) {
            rgvfuqvkyqVarPpxfxbqfkf.add(new ojitshcjhn(this.f125750zoijcleaow, str, objArr));
        }
    }

    abstract boolean ojitshcjhn(ylkuphrtab ylkuphrtabVar);

    final void oxmwwwfdhm(xl.wflxmlrfwp wflxmlrfwpVar) {
        this.f125741eablkybsjg.add(wflxmlrfwpVar);
        draadjrbmk(wflxmlrfwpVar);
    }

    boolean ppxfxbqfkf(String str) {
        xl.wflxmlrfwp wflxmlrfwpVarZoijcleaow;
        return this.f125741eablkybsjg.size() != 0 && (wflxmlrfwpVarZoijcleaow = zoijcleaow()) != null && wflxmlrfwpVarZoijcleaow.lmojexxdyd().equals(str) && wflxmlrfwpVarZoijcleaow.n().gtknphoqwx().equals("http://www.w3.org/1999/xhtml");
    }

    boolean rgvfuqvkyq(String str) {
        ylkuphrtab ylkuphrtabVar = this.f125745lqeggnwhkg;
        ylkuphrtab.lqeggnwhkg lqeggnwhkgVar = this.f125739draadjrbmk;
        return ylkuphrtabVar == lqeggnwhkgVar ? ojitshcjhn(new ylkuphrtab.lqeggnwhkg(this).wwaezpbzkn(str)) : ojitshcjhn(lqeggnwhkgVar.rgvfuqvkyq().wwaezpbzkn(str));
    }

    boolean vdvldrhtss(String str) {
        ylkuphrtab.nufgyqmvbu nufgyqmvbuVar = this.f125742gtknphoqwx;
        return this.f125745lqeggnwhkg == nufgyqmvbuVar ? ojitshcjhn(new ylkuphrtab.nufgyqmvbu(this).wwaezpbzkn(str)) : ojitshcjhn(nufgyqmvbuVar.rgvfuqvkyq().wwaezpbzkn(str));
    }

    xl.gxszxtbevo wflxmlrfwp(Reader reader, String str, oxmwwwfdhm oxmwwwfdhmVar) {
        dxjokdxxww(reader, str, oxmwwwfdhmVar);
        kcexrzcfyt();
        return this.f125749wkgbmnqykc;
    }

    boolean wkgbmnqykc(String str, String str2) {
        xl.wflxmlrfwp wflxmlrfwpVarZoijcleaow;
        return this.f125741eablkybsjg.size() != 0 && (wflxmlrfwpVarZoijcleaow = zoijcleaow()) != null && wflxmlrfwpVarZoijcleaow.lmojexxdyd().equals(str) && wflxmlrfwpVarZoijcleaow.n().gtknphoqwx().equals(str2);
    }

    kcexrzcfyt yggfygwlhe(String str, String str2, String str3, vdvldrhtss vdvldrhtssVar) {
        return this.f125740dxjokdxxww.ylkuphrtab(str, str2, str3, vdvldrhtssVar.gxszxtbevo());
    }

    boolean zdlpuopuiu() {
        if (this.f125745lqeggnwhkg.f125844iobyxmoadg != ylkuphrtab.btonecajqb.EOF) {
            ylkuphrtab ylkuphrtabVarIwizpuwonk = this.f125747ppxfxbqfkf.iwizpuwonk();
            this.f125745lqeggnwhkg = ylkuphrtabVarIwizpuwonk;
            ojitshcjhn(ylkuphrtabVarIwizpuwonk);
            ylkuphrtabVarIwizpuwonk.rgvfuqvkyq();
            return true;
        }
        ArrayList arrayList = this.f125741eablkybsjg;
        if (arrayList == null) {
            return false;
        }
        if (!arrayList.isEmpty()) {
            agtfadlqog();
            return true;
        }
        gtknphoqwx(this.f125749wkgbmnqykc);
        this.f125741eablkybsjg = null;
        return true;
    }

    xl.wflxmlrfwp zoijcleaow() {
        int size = this.f125741eablkybsjg.size();
        return size > 0 ? (xl.wflxmlrfwp) this.f125741eablkybsjg.get(size - 1) : this.f125749wkgbmnqykc;
    }
}
