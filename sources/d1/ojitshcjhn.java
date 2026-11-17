package d1;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    static int f26625lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f26630wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f26631zoijcleaow;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    ArrayList f26628iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    boolean f26629ppxfxbqfkf = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    ArrayList f26626eablkybsjg = null;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f26627gxszxtbevo = -1;

    static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f26632eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f26633gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        WeakReference f26634iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        int f26635lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f26636ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f26637wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f26638zoijcleaow;

        iobyxmoadg(c1.eablkybsjg eablkybsjgVar, z0.wkgbmnqykc wkgbmnqykcVar, int i13) {
            this.f26634iobyxmoadg = new WeakReference(eablkybsjgVar);
            this.f26638zoijcleaow = wkgbmnqykcVar.esjtqupxsv(eablkybsjgVar.f18303stevsuqkhv);
            this.f26636ppxfxbqfkf = wkgbmnqykcVar.esjtqupxsv(eablkybsjgVar.f18275kegysxyocb);
            this.f26637wkgbmnqykc = wkgbmnqykcVar.esjtqupxsv(eablkybsjgVar.f18305tzroggbefp);
            this.f26632eablkybsjg = wkgbmnqykcVar.esjtqupxsv(eablkybsjgVar.f18281mbcevpiqjq);
            this.f26633gxszxtbevo = wkgbmnqykcVar.esjtqupxsv(eablkybsjgVar.f18284ntlheqmsrt);
            this.f26635lqeggnwhkg = i13;
        }
    }

    public ojitshcjhn(int i13) {
        int i14 = f26625lqeggnwhkg;
        f26625lqeggnwhkg = i14 + 1;
        this.f26631zoijcleaow = i14;
        this.f26630wkgbmnqykc = i13;
    }

    private int btonecajqb(z0.wkgbmnqykc wkgbmnqykcVar, ArrayList arrayList, int i13) {
        int iEsjtqupxsv;
        int iEsjtqupxsv2;
        c1.gxszxtbevo gxszxtbevoVar = (c1.gxszxtbevo) ((c1.eablkybsjg) arrayList.get(0)).hkdspvbjdz();
        wkgbmnqykcVar.yadqdtsiqt();
        gxszxtbevoVar.lqeggnwhkg(wkgbmnqykcVar, false);
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((c1.eablkybsjg) arrayList.get(i14)).lqeggnwhkg(wkgbmnqykcVar, false);
        }
        if (i13 == 0 && gxszxtbevoVar.f18346l > 0) {
            c1.zoijcleaow.zoijcleaow(gxszxtbevoVar, wkgbmnqykcVar, arrayList, 0);
        }
        if (i13 == 1 && gxszxtbevoVar.f18347m > 0) {
            c1.zoijcleaow.zoijcleaow(gxszxtbevoVar, wkgbmnqykcVar, arrayList, 1);
        }
        try {
            wkgbmnqykcVar.pmvmpeiblj();
        } catch (Exception e13) {
            System.err.println(e13.toString() + "\n" + Arrays.toString(e13.getStackTrace()).replace("[", "   at ").replace(StringUtils.COMMA, "\n   at").replace("]", ""));
        }
        this.f26626eablkybsjg = new ArrayList();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            this.f26626eablkybsjg.add(new iobyxmoadg((c1.eablkybsjg) arrayList.get(i15), wkgbmnqykcVar, i13));
        }
        if (i13 == 0) {
            iEsjtqupxsv = wkgbmnqykcVar.esjtqupxsv(gxszxtbevoVar.f18303stevsuqkhv);
            iEsjtqupxsv2 = wkgbmnqykcVar.esjtqupxsv(gxszxtbevoVar.f18305tzroggbefp);
            wkgbmnqykcVar.yadqdtsiqt();
        } else {
            iEsjtqupxsv = wkgbmnqykcVar.esjtqupxsv(gxszxtbevoVar.f18275kegysxyocb);
            iEsjtqupxsv2 = wkgbmnqykcVar.esjtqupxsv(gxszxtbevoVar.f18281mbcevpiqjq);
            wkgbmnqykcVar.yadqdtsiqt();
        }
        return iEsjtqupxsv2 - iEsjtqupxsv;
    }

    private String eablkybsjg() {
        int i13 = this.f26630wkgbmnqykc;
        if (i13 == 0) {
            return "Horizontal";
        }
        if (i13 == 1) {
            return "Vertical";
        }
        return i13 == 2 ? "Both" : "Unknown";
    }

    public void dxjokdxxww(int i13) {
        this.f26630wkgbmnqykc = i13;
    }

    public int gxszxtbevo(z0.wkgbmnqykc wkgbmnqykcVar, int i13) {
        if (this.f26628iobyxmoadg.size() == 0) {
            return 0;
        }
        return btonecajqb(wkgbmnqykcVar, this.f26628iobyxmoadg, i13);
    }

    public boolean iobyxmoadg(c1.eablkybsjg eablkybsjgVar) {
        if (this.f26628iobyxmoadg.contains(eablkybsjgVar)) {
            return false;
        }
        this.f26628iobyxmoadg.add(eablkybsjgVar);
        return true;
    }

    public void lqeggnwhkg(int i13, ojitshcjhn ojitshcjhnVar) {
        for (c1.eablkybsjg eablkybsjgVar : this.f26628iobyxmoadg) {
            ojitshcjhnVar.iobyxmoadg(eablkybsjgVar);
            if (i13 == 0) {
                eablkybsjgVar.f18323yzdjzghtvl = ojitshcjhnVar.ppxfxbqfkf();
            } else {
                eablkybsjgVar.f18247eslsurpljm = ojitshcjhnVar.ppxfxbqfkf();
            }
        }
        this.f26627gxszxtbevo = ojitshcjhnVar.f26631zoijcleaow;
    }

    public void nufgyqmvbu(boolean z13) {
        this.f26629ppxfxbqfkf = z13;
    }

    public int ppxfxbqfkf() {
        return this.f26631zoijcleaow;
    }

    public String toString() {
        String str = eablkybsjg() + " [" + this.f26631zoijcleaow + "] <";
        Iterator it = this.f26628iobyxmoadg.iterator();
        while (it.hasNext()) {
            str = str + " " + ((c1.eablkybsjg) it.next()).jyumaefscl();
        }
        return str + " >";
    }

    public int wkgbmnqykc() {
        return this.f26630wkgbmnqykc;
    }

    public void zoijcleaow(ArrayList arrayList) {
        int size = this.f26628iobyxmoadg.size();
        if (this.f26627gxszxtbevo != -1 && size > 0) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ojitshcjhn ojitshcjhnVar = (ojitshcjhn) arrayList.get(i13);
                if (this.f26627gxszxtbevo == ojitshcjhnVar.f26631zoijcleaow) {
                    lqeggnwhkg(this.f26630wkgbmnqykc, ojitshcjhnVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
