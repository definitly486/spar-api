package org.xbill.DNS;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public final class xrmfcynszj {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static List f74560cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private static int f74561iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static f f74562istkbnxepw;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static jm.wkgbmnqykc f74563lmojexxdyd;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static Map f74565yadqdtsiqt;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private List f74567agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f74568btonecajqb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f74569cqumvgiudr;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f74570draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f74571dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f74572eablkybsjg;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private boolean f74573esjtqupxsv;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f74574gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f74575gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private f f74576iobyxmoadg;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f74577iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f74578jyumaefscl;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private boolean f74579kcexrzcfyt;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f74580lereixgezr;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final auzgnhcxok f74581lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f74582nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private e[] f74583ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f74584oxmwwwfdhm;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private jm.wkgbmnqykc f74585pmvmpeiblj;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f74586ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f74587rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private String f74588vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f74589wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private draadjrbmk f74590wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f74591yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private String f74592zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private List f74593zoijcleaow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final am.iobyxmoadg f74566zynmafqrjb = am.zoijcleaow.dxjokdxxww(xrmfcynszj.class);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final auzgnhcxok[] f74564wwaezpbzkn = new auzgnhcxok[0];

    static {
        draadjrbmk();
    }

    public xrmfcynszj(auzgnhcxok auzgnhcxokVar, int i13, int i14) {
        this.f74573esjtqupxsv = true;
        x2.iobyxmoadg(i13);
        rgvfuqvkyq.iobyxmoadg(i14);
        if (!x2.ppxfxbqfkf(i13) && i13 != 255) {
            throw new IllegalArgumentException("Cannot query for meta-types other than ANY");
        }
        this.f74581lqeggnwhkg = auzgnhcxokVar;
        this.f74582nufgyqmvbu = i13;
        this.f74571dxjokdxxww = i14;
        synchronized (xrmfcynszj.class) {
            this.f74576iobyxmoadg = eablkybsjg();
            this.f74593zoijcleaow = gxszxtbevo();
            this.f74590wkgbmnqykc = ppxfxbqfkf(i14);
        }
        this.f74586ppxfxbqfkf = f74561iozdgvuglv;
        this.f74575gxszxtbevo = 3;
        this.f74587rgvfuqvkyq = -1;
        this.f74580lereixgezr = Integer.parseInt(System.getProperty("dnsjava.lookup.max_iterations", "16"));
        if (Boolean.parseBoolean(System.getProperty("dnsjava.lookup.use_hosts_file", "true"))) {
            this.f74585pmvmpeiblj = wkgbmnqykc();
        }
    }

    private void agtfadlqog(auzgnhcxok auzgnhcxokVar, auzgnhcxok auzgnhcxokVar2) {
        this.f74589wflxmlrfwp = false;
        if (auzgnhcxokVar2 != null) {
            try {
                auzgnhcxokVar = auzgnhcxok.draadjrbmk(auzgnhcxokVar, auzgnhcxokVar2);
            } catch (NameTooLongException unused) {
                this.f74577iwizpuwonk = true;
                return;
            }
        }
        dxjokdxxww(auzgnhcxokVar);
    }

    private boolean btonecajqb(auzgnhcxok auzgnhcxokVar) {
        int i13;
        jm.wkgbmnqykc wkgbmnqykcVar = this.f74585pmvmpeiblj;
        if (wkgbmnqykcVar != null && ((i13 = this.f74582nufgyqmvbu) == 1 || i13 == 28)) {
            try {
                Optional optionalZoijcleaow = wkgbmnqykcVar.zoijcleaow(auzgnhcxokVar, i13);
                if (optionalZoijcleaow.isPresent()) {
                    this.f74587rgvfuqvkyq = 0;
                    this.f74570draadjrbmk = true;
                    if (this.f74582nufgyqmvbu == 1) {
                        this.f74583ojitshcjhn = new eablkybsjg[]{new eablkybsjg(auzgnhcxokVar, this.f74571dxjokdxxww, 0L, (InetAddress) optionalZoijcleaow.get())};
                    } else {
                        this.f74583ojitshcjhn = new zoijcleaow[]{new zoijcleaow(auzgnhcxokVar, this.f74571dxjokdxxww, 0L, (InetAddress) optionalZoijcleaow.get())};
                    }
                    return true;
                }
            } catch (IOException e13) {
                f74566zynmafqrjb.jyumaefscl("Local hosts database parsing failed, ignoring and using resolver", e13);
            }
        }
        return false;
    }

    public static synchronized void draadjrbmk() {
        f74562istkbnxepw = new dsvhmnatus();
        f74560cdpycssgdh = g.zoijcleaow().eablkybsjg();
        f74565yadqdtsiqt = new HashMap();
        f74561iozdgvuglv = g.zoijcleaow().ppxfxbqfkf();
        f74563lmojexxdyd = new jm.wkgbmnqykc();
    }

    private void dxjokdxxww(auzgnhcxok auzgnhcxokVar) {
        if (btonecajqb(auzgnhcxokVar)) {
            return;
        }
        z zVarWflxmlrfwp = this.f74590wkgbmnqykc.wflxmlrfwp(auzgnhcxokVar, this.f74582nufgyqmvbu, this.f74575gxszxtbevo);
        am.iobyxmoadg iobyxmoadgVar = f74566zynmafqrjb;
        iobyxmoadgVar.agtfadlqog("Lookup for {}/{}, cache answer: {}", auzgnhcxokVar, x2.wkgbmnqykc(this.f74582nufgyqmvbu), zVarWflxmlrfwp);
        gtknphoqwx(auzgnhcxokVar, zVarWflxmlrfwp);
        if (this.f74570draadjrbmk || this.f74589wflxmlrfwp) {
            return;
        }
        zfvoamnweg zfvoamnwegVarWflxmlrfwp = zfvoamnweg.wflxmlrfwp(e.istkbnxepw(auzgnhcxokVar, this.f74582nufgyqmvbu, this.f74571dxjokdxxww));
        try {
            zfvoamnweg zfvoamnwegVarPpxfxbqfkf = this.f74576iobyxmoadg.ppxfxbqfkf(zfvoamnwegVarWflxmlrfwp);
            int iNufgyqmvbu = zfvoamnwegVarPpxfxbqfkf.ppxfxbqfkf().nufgyqmvbu();
            if (iNufgyqmvbu != 0 && iNufgyqmvbu != 3) {
                this.f74579kcexrzcfyt = true;
                this.f74592zdlpuopuiu = d.zoijcleaow(iNufgyqmvbu);
            } else {
                if (!zfvoamnwegVarWflxmlrfwp.eablkybsjg().equals(zfvoamnwegVarPpxfxbqfkf.eablkybsjg())) {
                    this.f74579kcexrzcfyt = true;
                    this.f74592zdlpuopuiu = "response does not match query";
                    return;
                }
                z zVarPpxfxbqfkf = this.f74590wkgbmnqykc.ppxfxbqfkf(zfvoamnwegVarPpxfxbqfkf);
                if (zVarPpxfxbqfkf == null) {
                    zVarPpxfxbqfkf = this.f74590wkgbmnqykc.wflxmlrfwp(auzgnhcxokVar, this.f74582nufgyqmvbu, this.f74575gxszxtbevo);
                }
                iobyxmoadgVar.agtfadlqog("Queried {}/{}, id={}: {}", auzgnhcxokVar, x2.wkgbmnqykc(this.f74582nufgyqmvbu), Integer.valueOf(zfvoamnwegVarPpxfxbqfkf.ppxfxbqfkf().gxszxtbevo()), zVarPpxfxbqfkf);
                gtknphoqwx(auzgnhcxokVar, zVarPpxfxbqfkf);
            }
        } catch (IOException e13) {
            f74566zynmafqrjb.agtfadlqog("Lookup for {}/{}, id={} failed using resolver {}", auzgnhcxokVar, x2.wkgbmnqykc(zfvoamnwegVarWflxmlrfwp.eablkybsjg().zynmafqrjb()), Integer.valueOf(zfvoamnwegVarWflxmlrfwp.ppxfxbqfkf().gxszxtbevo()), this.f74576iobyxmoadg, e13);
            if (e13 instanceof InterruptedIOException) {
                this.f74578jyumaefscl = true;
            } else {
                this.f74591yggfygwlhe = true;
            }
        }
    }

    public static synchronized f eablkybsjg() {
        return f74562istkbnxepw;
    }

    private void gtknphoqwx(auzgnhcxok auzgnhcxokVar, z zVar) {
        if (zVar.btonecajqb()) {
            List listZoijcleaow = zVar.zoijcleaow();
            ArrayList arrayList = new ArrayList();
            Iterator it = listZoijcleaow.iterator();
            while (it.hasNext()) {
                arrayList.addAll(((b) it.next()).yggfygwlhe(this.f74573esjtqupxsv));
            }
            this.f74587rgvfuqvkyq = 0;
            this.f74583ojitshcjhn = (e[]) arrayList.toArray(new e[0]);
            this.f74570draadjrbmk = true;
            return;
        }
        if (zVar.nufgyqmvbu()) {
            this.f74584oxmwwwfdhm = true;
            this.f74589wflxmlrfwp = true;
            if (this.f74568btonecajqb > 0) {
                this.f74587rgvfuqvkyq = 3;
                this.f74570draadjrbmk = true;
                return;
            }
            return;
        }
        if (zVar.dxjokdxxww()) {
            this.f74587rgvfuqvkyq = 4;
            this.f74583ojitshcjhn = null;
            this.f74570draadjrbmk = true;
        } else {
            if (zVar.eablkybsjg()) {
                zoijcleaow(zVar.ppxfxbqfkf().sopmlzcsov(), auzgnhcxokVar);
                return;
            }
            if (!zVar.gxszxtbevo()) {
                if (zVar.lqeggnwhkg()) {
                    this.f74569cqumvgiudr = true;
                }
            } else {
                try {
                    zoijcleaow(auzgnhcxokVar.rgvfuqvkyq(zVar.wkgbmnqykc()), auzgnhcxokVar);
                } catch (NameTooLongException unused) {
                    this.f74587rgvfuqvkyq = 1;
                    this.f74588vdvldrhtss = "Invalid DNAME target";
                    this.f74570draadjrbmk = true;
                }
            }
        }
    }

    public static synchronized List gxszxtbevo() {
        return f74560cdpycssgdh;
    }

    private void iobyxmoadg() {
        if (!this.f74570draadjrbmk || this.f74587rgvfuqvkyq == -1) {
            StringBuilder sb3 = new StringBuilder("Lookup of " + this.f74581lqeggnwhkg + " ");
            int i13 = this.f74571dxjokdxxww;
            if (i13 != 1) {
                sb3.append(rgvfuqvkyq.zoijcleaow(i13));
                sb3.append(" ");
            }
            sb3.append(x2.wkgbmnqykc(this.f74582nufgyqmvbu));
            sb3.append(" isn't done");
            throw new IllegalStateException(sb3.toString());
        }
    }

    public static synchronized draadjrbmk ppxfxbqfkf(int i13) {
        draadjrbmk draadjrbmkVar;
        rgvfuqvkyq.iobyxmoadg(i13);
        draadjrbmkVar = (draadjrbmk) f74565yadqdtsiqt.get(Integer.valueOf(i13));
        if (draadjrbmkVar == null) {
            draadjrbmkVar = new draadjrbmk(i13);
            f74565yadqdtsiqt.put(Integer.valueOf(i13), draadjrbmkVar);
        }
        return draadjrbmkVar;
    }

    public static synchronized void rgvfuqvkyq(f fVar) {
        f74562istkbnxepw = fVar;
    }

    private void wflxmlrfwp() {
        this.f74568btonecajqb = 0;
        this.f74574gtknphoqwx = false;
        this.f74570draadjrbmk = false;
        this.f74589wflxmlrfwp = false;
        this.f74567agtfadlqog = null;
        this.f74583ojitshcjhn = null;
        this.f74587rgvfuqvkyq = -1;
        this.f74588vdvldrhtss = null;
        this.f74584oxmwwwfdhm = false;
        this.f74579kcexrzcfyt = false;
        this.f74592zdlpuopuiu = null;
        this.f74591yggfygwlhe = false;
        this.f74578jyumaefscl = false;
        this.f74577iwizpuwonk = false;
        this.f74569cqumvgiudr = false;
        if (this.f74572eablkybsjg) {
            this.f74590wkgbmnqykc.lqeggnwhkg();
        }
    }

    public static synchronized jm.wkgbmnqykc wkgbmnqykc() {
        return f74563lmojexxdyd;
    }

    private void zoijcleaow(auzgnhcxok auzgnhcxokVar, auzgnhcxok auzgnhcxokVar2) {
        this.f74574gtknphoqwx = true;
        this.f74579kcexrzcfyt = false;
        this.f74591yggfygwlhe = false;
        this.f74578jyumaefscl = false;
        this.f74584oxmwwwfdhm = false;
        this.f74569cqumvgiudr = false;
        int i13 = this.f74568btonecajqb + 1;
        this.f74568btonecajqb = i13;
        if (i13 >= this.f74580lereixgezr || auzgnhcxokVar.equals(auzgnhcxokVar2)) {
            this.f74587rgvfuqvkyq = 1;
            this.f74588vdvldrhtss = "CNAME loop";
            this.f74570draadjrbmk = true;
        } else {
            if (this.f74567agtfadlqog == null) {
                this.f74567agtfadlqog = new ArrayList();
            }
            this.f74567agtfadlqog.add(auzgnhcxokVar2);
            dxjokdxxww(auzgnhcxokVar);
        }
    }

    public String lqeggnwhkg() {
        iobyxmoadg();
        String str = this.f74588vdvldrhtss;
        if (str != null) {
            return str;
        }
        int i13 = this.f74587rgvfuqvkyq;
        if (i13 == 0) {
            return "successful";
        }
        if (i13 == 1) {
            return "unrecoverable error";
        }
        if (i13 == 2) {
            return "try again";
        }
        if (i13 == 3) {
            return "host not found";
        }
        if (i13 == 4) {
            return "type not found";
        }
        throw new IllegalStateException("unknown result");
    }

    public int nufgyqmvbu() {
        iobyxmoadg();
        return this.f74587rgvfuqvkyq;
    }

    public e[] ojitshcjhn() {
        if (this.f74570draadjrbmk) {
            wflxmlrfwp();
        }
        if (this.f74581lqeggnwhkg.zdlpuopuiu()) {
            agtfadlqog(this.f74581lqeggnwhkg, null);
        } else if (this.f74593zoijcleaow == null) {
            agtfadlqog(this.f74581lqeggnwhkg, auzgnhcxok.f74233pmvmpeiblj);
        } else {
            if (this.f74581lqeggnwhkg.jyumaefscl() > this.f74586ppxfxbqfkf) {
                agtfadlqog(this.f74581lqeggnwhkg, auzgnhcxok.f74233pmvmpeiblj);
            }
            if (this.f74570draadjrbmk) {
                return this.f74583ojitshcjhn;
            }
            Iterator it = this.f74593zoijcleaow.iterator();
            while (it.hasNext()) {
                agtfadlqog(this.f74581lqeggnwhkg, (auzgnhcxok) it.next());
                if (this.f74570draadjrbmk) {
                    return this.f74583ojitshcjhn;
                }
                if (this.f74574gtknphoqwx) {
                    break;
                }
            }
            agtfadlqog(this.f74581lqeggnwhkg, auzgnhcxok.f74233pmvmpeiblj);
        }
        if (!this.f74570draadjrbmk) {
            if (this.f74579kcexrzcfyt) {
                this.f74587rgvfuqvkyq = 2;
                this.f74588vdvldrhtss = this.f74592zdlpuopuiu;
                this.f74570draadjrbmk = true;
            } else if (this.f74578jyumaefscl) {
                this.f74587rgvfuqvkyq = 2;
                this.f74588vdvldrhtss = "timed out";
                this.f74570draadjrbmk = true;
            } else if (this.f74591yggfygwlhe) {
                this.f74587rgvfuqvkyq = 2;
                this.f74588vdvldrhtss = "network error";
                this.f74570draadjrbmk = true;
            } else if (this.f74584oxmwwwfdhm) {
                this.f74587rgvfuqvkyq = 3;
                this.f74570draadjrbmk = true;
            } else if (this.f74569cqumvgiudr) {
                this.f74587rgvfuqvkyq = 1;
                this.f74588vdvldrhtss = "referral";
                this.f74570draadjrbmk = true;
            } else if (this.f74577iwizpuwonk) {
                this.f74587rgvfuqvkyq = 1;
                this.f74588vdvldrhtss = "name too long";
                this.f74570draadjrbmk = true;
            }
        }
        return this.f74583ojitshcjhn;
    }

    public xrmfcynszj(String str, int i13) {
        this(auzgnhcxok.vdvldrhtss(str), i13, 1);
    }
}
