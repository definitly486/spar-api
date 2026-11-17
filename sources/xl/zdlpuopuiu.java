package xl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zdlpuopuiu implements Cloneable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    static final List f122740jyumaefscl = Collections.emptyList();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    int f122741yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    wflxmlrfwp f122742zdlpuopuiu;

    protected zdlpuopuiu() {
    }

    private void tzroggbefp(int i13) {
        int iWflxmlrfwp = wflxmlrfwp();
        if (iWflxmlrfwp == 0) {
            return;
        }
        List listKcexrzcfyt = kcexrzcfyt();
        while (i13 < iWflxmlrfwp) {
            ((zdlpuopuiu) listKcexrzcfyt.get(i13)).okpsazkaxt(i13);
            i13++;
        }
    }

    public List agtfadlqog() {
        if (wflxmlrfwp() == 0) {
            return f122740jyumaefscl;
        }
        List listKcexrzcfyt = kcexrzcfyt();
        ArrayList arrayList = new ArrayList(listKcexrzcfyt.size());
        arrayList.addAll(listKcexrzcfyt);
        return Collections.unmodifiableList(arrayList);
    }

    public Stream cdpycssgdh() {
        return jyumaefscl.wkgbmnqykc(this, zdlpuopuiu.class);
    }

    public boolean cllcsxoeiz(String str) {
        wflxmlrfwp wflxmlrfwpVar = this.f122742zdlpuopuiu;
        return wflxmlrfwpVar != null && wflxmlrfwpVar.lmojexxdyd().equals(str);
    }

    public boolean cqumvgiudr() {
        return this.f122742zdlpuopuiu != null;
    }

    public zdlpuopuiu draadjrbmk(int i13) {
        return (zdlpuopuiu) kcexrzcfyt().get(i13);
    }

    public final zdlpuopuiu dsvhmnatus() {
        return this.f122742zdlpuopuiu;
    }

    public abstract zoijcleaow eablkybsjg();

    public boolean equals(Object obj) {
        return this == obj;
    }

    public zdlpuopuiu esjtqupxsv() {
        int iWflxmlrfwp = wflxmlrfwp();
        if (iWflxmlrfwp == 0) {
            return null;
        }
        return (zdlpuopuiu) kcexrzcfyt().get(iWflxmlrfwp - 1);
    }

    public zdlpuopuiu gtknphoqwx(zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        vl.zoijcleaow.btonecajqb(this.f122742zdlpuopuiu);
        if (zdlpuopuiuVar.f122742zdlpuopuiu == this.f122742zdlpuopuiu) {
            zdlpuopuiuVar.mbcevpiqjq();
        }
        this.f122742zdlpuopuiu.zoijcleaow(this.f122741yggfygwlhe, zdlpuopuiuVar);
        return this;
    }

    public abstract String gxszxtbevo();

    public int hashCode() {
        return super.hashCode();
    }

    abstract void hcddaimhww(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar);

    public abstract zdlpuopuiu hkdspvbjdz();

    protected void ikoacuggdj(zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        wflxmlrfwp wflxmlrfwpVar = this.f122742zdlpuopuiu;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.ntlheqmsrt(this);
        }
        this.f122742zdlpuopuiu = (wflxmlrfwp) zdlpuopuiuVar;
    }

    public String iobyxmoadg(String str) {
        vl.zoijcleaow.lqeggnwhkg(str);
        return (iwizpuwonk() && eablkybsjg().kcexrzcfyt(str)) ? wl.kcexrzcfyt.pmvmpeiblj(gxszxtbevo(), eablkybsjg().rgvfuqvkyq(str)) : "";
    }

    public abstract String iozdgvuglv();

    public abstract String istkbnxepw();

    protected abstract boolean iwizpuwonk();

    public void jhduphickx(String str) {
        vl.zoijcleaow.btonecajqb(str);
        vdvldrhtss(str);
    }

    public gxszxtbevo jpowsppfya() {
        zdlpuopuiu zdlpuopuiuVarVipkmwdibw = vipkmwdibw();
        if (zdlpuopuiuVarVipkmwdibw instanceof gxszxtbevo) {
            return (gxszxtbevo) zdlpuopuiuVarVipkmwdibw;
        }
        return null;
    }

    public boolean jyumaefscl(String str) {
        vl.zoijcleaow.btonecajqb(str);
        if (!iwizpuwonk()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (eablkybsjg().kcexrzcfyt(strSubstring) && !iobyxmoadg(strSubstring).isEmpty()) {
                return true;
            }
        }
        return eablkybsjg().kcexrzcfyt(str);
    }

    public int jztzpxfvev() {
        return this.f122741yggfygwlhe;
    }

    protected abstract List kcexrzcfyt();

    public boolean lereixgezr(String str) {
        return lmojexxdyd().equals(str);
    }

    public String lmojexxdyd() {
        return istkbnxepw();
    }

    public void mbcevpiqjq() {
        wflxmlrfwp wflxmlrfwpVar = this.f122742zdlpuopuiu;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.ntlheqmsrt(this);
        }
    }

    protected void ntlheqmsrt(zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.ppxfxbqfkf(zdlpuopuiuVar.f122742zdlpuopuiu == this);
        int i13 = zdlpuopuiuVar.f122741yggfygwlhe;
        kcexrzcfyt().remove(i13);
        tzroggbefp(i13);
        zdlpuopuiuVar.f122742zdlpuopuiu = null;
    }

    @Override // 
    /* JADX INFO: renamed from: ojitshcjhn */
    public zdlpuopuiu clone() {
        zdlpuopuiu zdlpuopuiuVarRgvfuqvkyq = rgvfuqvkyq(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(zdlpuopuiuVarRgvfuqvkyq);
        while (!linkedList.isEmpty()) {
            zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) linkedList.remove();
            int iWflxmlrfwp = zdlpuopuiuVar.wflxmlrfwp();
            for (int i13 = 0; i13 < iWflxmlrfwp; i13++) {
                List listKcexrzcfyt = zdlpuopuiuVar.kcexrzcfyt();
                zdlpuopuiu zdlpuopuiuVarRgvfuqvkyq2 = ((zdlpuopuiu) listKcexrzcfyt.get(i13)).rgvfuqvkyq(zdlpuopuiuVar);
                listKcexrzcfyt.set(i13, zdlpuopuiuVarRgvfuqvkyq2);
                linkedList.add(zdlpuopuiuVarRgvfuqvkyq2);
            }
        }
        return zdlpuopuiuVarRgvfuqvkyq;
    }

    protected void okpsazkaxt(int i13) {
        this.f122741yggfygwlhe = i13;
    }

    public abstract zdlpuopuiu oxmwwwfdhm();

    protected void pkzmftpjix(wl.lqeggnwhkg lqeggnwhkgVar) {
        iwizpuwonk.dxjokdxxww(this, lqeggnwhkgVar).ppxfxbqfkf(this);
    }

    public wflxmlrfwp pmvmpeiblj() {
        zdlpuopuiu zdlpuopuiuVarZynmafqrjb = this;
        do {
            zdlpuopuiuVarZynmafqrjb = zdlpuopuiuVarZynmafqrjb.zynmafqrjb();
            if (zdlpuopuiuVarZynmafqrjb == null) {
                return null;
            }
        } while (!(zdlpuopuiuVarZynmafqrjb instanceof wflxmlrfwp));
        return (wflxmlrfwp) zdlpuopuiuVarZynmafqrjb;
    }

    public String ppxfxbqfkf(String str) {
        vl.zoijcleaow.btonecajqb(str);
        if (!iwizpuwonk()) {
            return "";
        }
        String strRgvfuqvkyq = eablkybsjg().rgvfuqvkyq(str);
        if (strRgvfuqvkyq.length() > 0) {
            return strRgvfuqvkyq;
        }
        return str.startsWith("abs:") ? iobyxmoadg(str.substring(4)) : "";
    }

    protected zdlpuopuiu rgvfuqvkyq(zdlpuopuiu zdlpuopuiuVar) {
        gxszxtbevo gxszxtbevoVarJpowsppfya;
        try {
            zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) super.clone();
            zdlpuopuiuVar2.f122742zdlpuopuiu = (wflxmlrfwp) zdlpuopuiuVar;
            zdlpuopuiuVar2.f122741yggfygwlhe = zdlpuopuiuVar == null ? 0 : this.f122741yggfygwlhe;
            if (zdlpuopuiuVar == null && !(this instanceof gxszxtbevo) && (gxszxtbevoVarJpowsppfya = jpowsppfya()) != null) {
                gxszxtbevo gxszxtbevoVarH = gxszxtbevoVarJpowsppfya.H();
                zdlpuopuiuVar2.f122742zdlpuopuiu = gxszxtbevoVarH;
                gxszxtbevoVarH.kcexrzcfyt().add(zdlpuopuiuVar2);
            }
            return zdlpuopuiuVar2;
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public void ribwqtqdhb(zdlpuopuiu zdlpuopuiuVar) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar);
        if (this.f122742zdlpuopuiu == null) {
            this.f122742zdlpuopuiu = zdlpuopuiuVar.f122742zdlpuopuiu;
        }
        vl.zoijcleaow.btonecajqb(this.f122742zdlpuopuiu);
        this.f122742zdlpuopuiu.sopmlzcsov(this, zdlpuopuiuVar);
    }

    protected void sopmlzcsov(zdlpuopuiu zdlpuopuiuVar, zdlpuopuiu zdlpuopuiuVar2) {
        vl.zoijcleaow.ppxfxbqfkf(zdlpuopuiuVar.f122742zdlpuopuiu == this);
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVar2);
        if (zdlpuopuiuVar == zdlpuopuiuVar2) {
            return;
        }
        wflxmlrfwp wflxmlrfwpVar = zdlpuopuiuVar2.f122742zdlpuopuiu;
        if (wflxmlrfwpVar != null) {
            wflxmlrfwpVar.ntlheqmsrt(zdlpuopuiuVar2);
        }
        int i13 = zdlpuopuiuVar.f122741yggfygwlhe;
        kcexrzcfyt().set(i13, zdlpuopuiuVar2);
        zdlpuopuiuVar2.f122742zdlpuopuiu = (wflxmlrfwp) this;
        zdlpuopuiuVar2.okpsazkaxt(i13);
        zdlpuopuiuVar.f122742zdlpuopuiu = null;
    }

    public zdlpuopuiu stevsuqkhv() {
        wflxmlrfwp wflxmlrfwpVar = this.f122742zdlpuopuiu;
        if (wflxmlrfwpVar != null && this.f122741yggfygwlhe > 0) {
            return (zdlpuopuiu) wflxmlrfwpVar.kcexrzcfyt().get(this.f122741yggfygwlhe - 1);
        }
        return null;
    }

    public String toString() {
        return ylkuphrtab();
    }

    protected void ulzqkzuiru(zdlpuopuiu zdlpuopuiuVar) {
        zdlpuopuiuVar.ikoacuggdj(this);
    }

    protected abstract void vdvldrhtss(String str);

    public zdlpuopuiu vipkmwdibw() {
        zdlpuopuiu zdlpuopuiuVar = this;
        while (true) {
            wflxmlrfwp wflxmlrfwpVar = zdlpuopuiuVar.f122742zdlpuopuiu;
            if (wflxmlrfwpVar == null) {
                return zdlpuopuiuVar;
            }
            zdlpuopuiuVar = wflxmlrfwpVar;
        }
    }

    public abstract int wflxmlrfwp();

    public zdlpuopuiu wkgbmnqykc(String str, String str2) {
        gxszxtbevo gxszxtbevoVarJpowsppfya = jpowsppfya();
        eablkybsjg().istkbnxepw((gxszxtbevoVarJpowsppfya != null ? gxszxtbevoVarJpowsppfya.E().wflxmlrfwp() : yl.vdvldrhtss.f125805ppxfxbqfkf).zoijcleaow(str), str2);
        return this;
    }

    public wflxmlrfwp wypolnanlu() {
        zdlpuopuiu zdlpuopuiuVarStevsuqkhv = this;
        do {
            zdlpuopuiuVarStevsuqkhv = zdlpuopuiuVarStevsuqkhv.stevsuqkhv();
            if (zdlpuopuiuVarStevsuqkhv == null) {
                return null;
            }
        } while (!(zdlpuopuiuVarStevsuqkhv instanceof wflxmlrfwp));
        return (wflxmlrfwp) zdlpuopuiuVarStevsuqkhv;
    }

    public zdlpuopuiu xrmfcynszj(zl.gxszxtbevo gxszxtbevoVar) {
        vl.zoijcleaow.btonecajqb(gxszxtbevoVar);
        gxszxtbevoVar.ppxfxbqfkf(this);
        return this;
    }

    public Stream yadqdtsiqt(Class cls) {
        return jyumaefscl.wkgbmnqykc(this, cls);
    }

    public zdlpuopuiu yggfygwlhe() {
        wflxmlrfwp wflxmlrfwpVar = this.f122742zdlpuopuiu;
        return wflxmlrfwpVar != null ? wflxmlrfwpVar.zdlpuopuiu() : this;
    }

    public String ylkuphrtab() {
        StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
        pkzmftpjix(wl.lqeggnwhkg.wkgbmnqykc(sbEablkybsjg));
        return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
    }

    public zdlpuopuiu zdlpuopuiu() {
        if (wflxmlrfwp() == 0) {
            return null;
        }
        return (zdlpuopuiu) kcexrzcfyt().get(0);
    }

    protected void zoijcleaow(int i13, zdlpuopuiu... zdlpuopuiuVarArr) {
        vl.zoijcleaow.btonecajqb(zdlpuopuiuVarArr);
        if (zdlpuopuiuVarArr.length == 0) {
            return;
        }
        List listKcexrzcfyt = kcexrzcfyt();
        zdlpuopuiu zdlpuopuiuVarHkdspvbjdz = zdlpuopuiuVarArr[0].hkdspvbjdz();
        if (zdlpuopuiuVarHkdspvbjdz != null && zdlpuopuiuVarHkdspvbjdz.wflxmlrfwp() == zdlpuopuiuVarArr.length) {
            List listKcexrzcfyt2 = zdlpuopuiuVarHkdspvbjdz.kcexrzcfyt();
            int length = zdlpuopuiuVarArr.length;
            while (true) {
                int i14 = length - 1;
                if (length <= 0) {
                    boolean z13 = wflxmlrfwp() == 0;
                    zdlpuopuiuVarHkdspvbjdz.oxmwwwfdhm();
                    listKcexrzcfyt.addAll(i13, Arrays.asList(zdlpuopuiuVarArr));
                    int length2 = zdlpuopuiuVarArr.length;
                    while (true) {
                        int i15 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        zdlpuopuiuVarArr[i15].f122742zdlpuopuiu = (wflxmlrfwp) this;
                        length2 = i15;
                    }
                    if (z13 && zdlpuopuiuVarArr[0].f122741yggfygwlhe == 0) {
                        return;
                    }
                    tzroggbefp(i13);
                    return;
                }
                if (zdlpuopuiuVarArr[i14] != listKcexrzcfyt2.get(i14)) {
                    break;
                } else {
                    length = i14;
                }
            }
        }
        vl.zoijcleaow.eablkybsjg(zdlpuopuiuVarArr);
        for (zdlpuopuiu zdlpuopuiuVar : zdlpuopuiuVarArr) {
            ulzqkzuiru(zdlpuopuiuVar);
        }
        listKcexrzcfyt.addAll(i13, Arrays.asList(zdlpuopuiuVarArr));
        tzroggbefp(i13);
    }

    public zdlpuopuiu zynmafqrjb() {
        wflxmlrfwp wflxmlrfwpVar = this.f122742zdlpuopuiu;
        if (wflxmlrfwpVar == null) {
            return null;
        }
        List listKcexrzcfyt = wflxmlrfwpVar.kcexrzcfyt();
        int i13 = this.f122741yggfygwlhe + 1;
        if (listKcexrzcfyt.size() > i13) {
            return (zdlpuopuiu) listKcexrzcfyt.get(i13);
        }
        return null;
    }
}
