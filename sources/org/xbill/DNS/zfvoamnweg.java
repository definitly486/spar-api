package org.xbill.DNS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zfvoamnweg implements Cloneable {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final e[] f74613istkbnxepw = new e[0];

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private j0 f74614cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private f f74615esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private j0 f74616iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f74617jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    int f74618lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    int f74619pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private List[] f74620yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private jlmebxxoox f74621zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    int f74622zynmafqrjb;

    private zfvoamnweg(jlmebxxoox jlmebxxooxVar) {
        this.f74620yggfygwlhe = new List[4];
        this.f74621zdlpuopuiu = jlmebxxooxVar;
    }

    private void kcexrzcfyt(jyumaefscl jyumaefsclVar, int i13) {
        byte[] bArrWypolnanlu;
        if (i13 < 12) {
            return;
        }
        fmlbqenlif fmlbqenlifVarWkgbmnqykc = wkgbmnqykc();
        if (fmlbqenlifVarWkgbmnqykc != null) {
            bArrWypolnanlu = fmlbqenlifVarWkgbmnqykc.wypolnanlu(3);
            i13 -= bArrWypolnanlu.length;
        } else {
            bArrWypolnanlu = null;
        }
        int iZoijcleaow = jyumaefsclVar.zoijcleaow();
        this.f74621zdlpuopuiu.vdvldrhtss(jyumaefsclVar);
        agtfadlqog agtfadlqogVar = new agtfadlqog();
        int iEablkybsjg = this.f74621zdlpuopuiu.eablkybsjg();
        int iPpxfxbqfkf = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            if (this.f74620yggfygwlhe[i14] != null) {
                int iVdvldrhtss = vdvldrhtss(jyumaefsclVar, i14, agtfadlqogVar, i13);
                if (iVdvldrhtss != 0 && i14 != 3) {
                    iEablkybsjg = jlmebxxoox.wflxmlrfwp(iEablkybsjg, 6, true);
                    int iPpxfxbqfkf2 = this.f74621zdlpuopuiu.ppxfxbqfkf(i14) - iVdvldrhtss;
                    int i15 = iZoijcleaow + 4;
                    jyumaefsclVar.btonecajqb(iPpxfxbqfkf2, (i14 * 2) + i15);
                    for (int i16 = i14 + 1; i16 < 3; i16++) {
                        jyumaefsclVar.btonecajqb(0, (i16 * 2) + i15);
                    }
                    break;
                }
                if (i14 == 3) {
                    iPpxfxbqfkf = this.f74621zdlpuopuiu.ppxfxbqfkf(i14) - iVdvldrhtss;
                }
            }
        }
        if (bArrWypolnanlu != null) {
            jyumaefsclVar.gxszxtbevo(bArrWypolnanlu);
            iPpxfxbqfkf++;
        }
        if (iEablkybsjg != this.f74621zdlpuopuiu.eablkybsjg()) {
            jyumaefsclVar.btonecajqb(iEablkybsjg, iZoijcleaow + 2);
        }
        if (iPpxfxbqfkf != this.f74621zdlpuopuiu.ppxfxbqfkf(3)) {
            jyumaefsclVar.btonecajqb(iPpxfxbqfkf, iZoijcleaow + 10);
        }
    }

    private static boolean ojitshcjhn(e eVar, e eVar2) {
        return eVar.lereixgezr() == eVar2.lereixgezr() && eVar.zdlpuopuiu() == eVar2.zdlpuopuiu() && eVar.cqumvgiudr().equals(eVar2.cqumvgiudr());
    }

    private void rgvfuqvkyq(StringBuilder sb3, int i13) {
        if (i13 > 3) {
            return;
        }
        for (e eVar : lqeggnwhkg(i13)) {
            if (i13 == 0) {
                sb3.append(";;\t");
                sb3.append(eVar.f74323zdlpuopuiu);
                sb3.append(", type = ");
                sb3.append(x2.wkgbmnqykc(eVar.f74322yggfygwlhe));
                sb3.append(", class = ");
                sb3.append(rgvfuqvkyq.zoijcleaow(eVar.f74321jyumaefscl));
            } else if (!(eVar instanceof fmlbqenlif)) {
                sb3.append(eVar);
            }
            sb3.append("\n");
        }
    }

    private int vdvldrhtss(jyumaefscl jyumaefsclVar, int i13, agtfadlqog agtfadlqogVar, int i14) {
        int size = this.f74620yggfygwlhe[i13].size();
        int iZoijcleaow = jyumaefsclVar.zoijcleaow();
        int i15 = 0;
        e eVar = null;
        int i16 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            e eVar2 = (e) this.f74620yggfygwlhe[i13].get(i17);
            if (i13 != 3 || !(eVar2 instanceof fmlbqenlif)) {
                if (eVar != null && !ojitshcjhn(eVar2, eVar)) {
                    iZoijcleaow = jyumaefsclVar.zoijcleaow();
                    i15 = i16;
                }
                eVar2.dsvhmnatus(jyumaefsclVar, i13, agtfadlqogVar);
                if (jyumaefsclVar.zoijcleaow() > i14) {
                    jyumaefsclVar.ppxfxbqfkf(iZoijcleaow);
                    return size - i15;
                }
                i16++;
                eVar = eVar2;
            }
        }
        return size - i16;
    }

    public static zfvoamnweg wflxmlrfwp(e eVar) {
        zfvoamnweg zfvoamnwegVar = new zfvoamnweg();
        zfvoamnwegVar.f74621zdlpuopuiu.ojitshcjhn(0);
        zfvoamnwegVar.f74621zdlpuopuiu.agtfadlqog(7);
        zfvoamnwegVar.iobyxmoadg(eVar, 0);
        return zfvoamnwegVar;
    }

    public int agtfadlqog() {
        return this.f74617jyumaefscl;
    }

    public boolean draadjrbmk() {
        return this.f74619pmvmpeiblj == 1;
    }

    public e eablkybsjg() {
        List list = this.f74620yggfygwlhe[0];
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (e) list.get(0);
    }

    public boolean gtknphoqwx() {
        int i13 = this.f74619pmvmpeiblj;
        return i13 == 3 || i13 == 1 || i13 == 4;
    }

    public int gxszxtbevo() {
        int iNufgyqmvbu = this.f74621zdlpuopuiu.nufgyqmvbu();
        fmlbqenlif fmlbqenlifVarWkgbmnqykc = wkgbmnqykc();
        return fmlbqenlifVarWkgbmnqykc != null ? iNufgyqmvbu + (fmlbqenlifVarWkgbmnqykc.ulzqkzuiru() << 4) : iNufgyqmvbu;
    }

    public void iobyxmoadg(e eVar, int i13) {
        List[] listArr = this.f74620yggfygwlhe;
        if (listArr[i13] == null) {
            listArr[i13] = new LinkedList();
        }
        this.f74621zdlpuopuiu.gtknphoqwx(i13);
        this.f74620yggfygwlhe[i13].add(eVar);
    }

    public List lqeggnwhkg(int i13) {
        List list = this.f74620yggfygwlhe[i13];
        return list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public List nufgyqmvbu(int i13) {
        if (this.f74620yggfygwlhe[i13] == null) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        for (e eVar : lqeggnwhkg(i13)) {
            auzgnhcxok auzgnhcxokVarCqumvgiudr = eVar.cqumvgiudr();
            if (hashSet.contains(auzgnhcxokVarCqumvgiudr)) {
                int size = linkedList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        b bVar = (b) linkedList.get(size);
                        if (bVar.getType() == eVar.lereixgezr() && bVar.rgvfuqvkyq() == eVar.zdlpuopuiu() && bVar.vdvldrhtss().equals(auzgnhcxokVarCqumvgiudr)) {
                            bVar.lqeggnwhkg(eVar);
                            break;
                        }
                        size--;
                    }
                }
            }
            linkedList.add(new b(eVar));
            hashSet.add(auzgnhcxokVarCqumvgiudr);
        }
        return linkedList;
    }

    public void oxmwwwfdhm(f fVar) {
        this.f74615esjtqupxsv = fVar;
    }

    public jlmebxxoox ppxfxbqfkf() {
        return this.f74621zdlpuopuiu;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        fmlbqenlif fmlbqenlifVarWkgbmnqykc = wkgbmnqykc();
        if (fmlbqenlifVarWkgbmnqykc != null) {
            sb3.append(this.f74621zdlpuopuiu.rgvfuqvkyq(gxszxtbevo()));
            sb3.append("\n\n");
            fmlbqenlifVarWkgbmnqykc.ribwqtqdhb(sb3);
            sb3.append('\n');
        } else {
            sb3.append(this.f74621zdlpuopuiu);
            sb3.append('\n');
        }
        if (gtknphoqwx()) {
            sb3.append(";; TSIG ");
            if (draadjrbmk()) {
                sb3.append("ok");
            } else {
                sb3.append("invalid");
            }
            sb3.append('\n');
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if (this.f74621zdlpuopuiu.lqeggnwhkg() != 5) {
                sb3.append(";; ");
                sb3.append(x.iobyxmoadg(i13));
                sb3.append(":\n");
            } else {
                sb3.append(";; ");
                sb3.append(x.ppxfxbqfkf(i13));
                sb3.append(":\n");
            }
            rgvfuqvkyq(sb3, i13);
            sb3.append("\n");
        }
        sb3.append(";; Message size: ");
        sb3.append(agtfadlqog());
        sb3.append(" bytes");
        return sb3.toString();
    }

    public fmlbqenlif wkgbmnqykc() {
        for (e eVar : lqeggnwhkg(3)) {
            if (eVar instanceof fmlbqenlif) {
                return (fmlbqenlif) eVar;
            }
        }
        return null;
    }

    public byte[] zdlpuopuiu(int i13) {
        jyumaefscl jyumaefsclVar = new jyumaefscl();
        kcexrzcfyt(jyumaefsclVar, i13);
        this.f74617jyumaefscl = jyumaefsclVar.zoijcleaow();
        return jyumaefsclVar.eablkybsjg();
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public zfvoamnweg clone() {
        zfvoamnweg zfvoamnwegVar = (zfvoamnweg) super.clone();
        zfvoamnwegVar.f74620yggfygwlhe = new List[this.f74620yggfygwlhe.length];
        int i13 = 0;
        while (true) {
            List[] listArr = this.f74620yggfygwlhe;
            if (i13 >= listArr.length) {
                break;
            }
            if (listArr[i13] != null) {
                zfvoamnwegVar.f74620yggfygwlhe[i13] = new LinkedList(this.f74620yggfygwlhe[i13]);
            }
            i13++;
        }
        zfvoamnwegVar.f74621zdlpuopuiu = this.f74621zdlpuopuiu.clone();
        j0 j0Var = this.f74614cqumvgiudr;
        if (j0Var != null) {
            zfvoamnwegVar.f74614cqumvgiudr = (j0) j0Var.agtfadlqog();
        }
        j0 j0Var2 = this.f74616iwizpuwonk;
        if (j0Var2 != null) {
            zfvoamnwegVar.f74616iwizpuwonk = (j0) j0Var2.agtfadlqog();
        }
        return zfvoamnwegVar;
    }

    public zfvoamnweg(int i13) {
        this(new jlmebxxoox(i13));
    }

    public zfvoamnweg() {
        this(new jlmebxxoox());
    }

    zfvoamnweg(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this(new jlmebxxoox(zdlpuopuiuVar));
        boolean z13 = this.f74621zdlpuopuiu.lqeggnwhkg() == 5;
        boolean zWkgbmnqykc = this.f74621zdlpuopuiu.wkgbmnqykc(6);
        for (int i13 = 0; i13 < 4; i13++) {
            try {
                int iPpxfxbqfkf = this.f74621zdlpuopuiu.ppxfxbqfkf(i13);
                if (iPpxfxbqfkf > 0) {
                    this.f74620yggfygwlhe[i13] = new ArrayList(iPpxfxbqfkf);
                }
                for (int i14 = 0; i14 < iPpxfxbqfkf; i14++) {
                    int iZoijcleaow = zdlpuopuiuVar.zoijcleaow();
                    e eVarRgvfuqvkyq = e.rgvfuqvkyq(zdlpuopuiuVar, i13, z13);
                    this.f74620yggfygwlhe[i13].add(eVarRgvfuqvkyq);
                    if (i13 == 3) {
                        if (eVarRgvfuqvkyq.zynmafqrjb() == 250) {
                            this.f74618lereixgezr = iZoijcleaow;
                            if (i14 != iPpxfxbqfkf - 1) {
                                throw new WireParseException("TSIG is not the last record in the message");
                            }
                        }
                        if (eVarRgvfuqvkyq.zynmafqrjb() == 24 && ((i) eVarRgvfuqvkyq).ulzqkzuiru() == 0) {
                            this.f74622zynmafqrjb = iZoijcleaow;
                        }
                    }
                }
            } catch (WireParseException e13) {
                if (!zWkgbmnqykc) {
                    throw e13;
                }
            }
        }
        this.f74617jyumaefscl = zdlpuopuiuVar.zoijcleaow();
    }

    public zfvoamnweg(byte[] bArr) {
        this(new zdlpuopuiu(bArr));
    }
}
