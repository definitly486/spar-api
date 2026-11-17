package ezmngbhpjk;

import androidx.collection.dsvhmnatus;
import androidx.collection.jhduphickx;
import androidx.collection.ribwqtqdhb;
import androidx.collection.vipkmwdibw;
import androidx.collection.wypolnanlu;
import androidx.compose.runtime.e;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.t;
import androidx.compose.runtime.u;
import androidx.compose.runtime.v;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ojitshcjhn implements t {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private ArrayList f32446btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private dsvhmnatus f32447dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ipoelvxyzq.ppxfxbqfkf f32448eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private vipkmwdibw f32449gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f32450gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Set f32451iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f32452lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private wypolnanlu f32453nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f32454ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private wypolnanlu f32455wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private krqnebusok.gxszxtbevo f32456zoijcleaow;

    public ojitshcjhn() {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new v[16], 0);
        this.f32454ppxfxbqfkf = ppxfxbqfkfVar;
        this.f32455wkgbmnqykc = jhduphickx.zoijcleaow();
        this.f32448eablkybsjg = ppxfxbqfkfVar;
        this.f32450gxszxtbevo = new ipoelvxyzq.ppxfxbqfkf(new Object[16], 0);
        this.f32452lqeggnwhkg = new ipoelvxyzq.ppxfxbqfkf(new tg.iobyxmoadg[16], 0);
    }

    private final void draadjrbmk(ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar) {
        Set set = this.f32451iobyxmoadg;
        if (set == null) {
            return;
        }
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            v vVar = (v) objArr[i13];
            u uVarZoijcleaow = vVar.zoijcleaow();
            set.remove(uVarZoijcleaow);
            try {
                uVarZoijcleaow.zoijcleaow();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                krqnebusok.gxszxtbevo gxszxtbevoVar = this.f32456zoijcleaow;
                if (gxszxtbevoVar != null) {
                    gxszxtbevoVar.zoijcleaow(th2, vVar);
                }
                throw th2;
            }
        }
    }

    private final void kcexrzcfyt(Object obj) {
        this.f32450gxszxtbevo.zoijcleaow(obj);
    }

    private static final boolean rgvfuqvkyq(v vVar, ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar) {
        Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
        int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
        for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
            u uVarZoijcleaow = ((v) objArr[i13]).zoijcleaow();
            if (uVarZoijcleaow instanceof gtknphoqwx) {
                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = ((gtknphoqwx) uVarZoijcleaow).iobyxmoadg();
                if (ppxfxbqfkfVarIobyxmoadg.rgvfuqvkyq(vVar) || rgvfuqvkyq(vVar, ppxfxbqfkfVarIobyxmoadg)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void agtfadlqog() {
        if (this.f32452lqeggnwhkg.draadjrbmk() != 0) {
            Object objIobyxmoadg = jyumaefscl.f32436iobyxmoadg.iobyxmoadg("Compose:sideeffects");
            try {
                ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f32452lqeggnwhkg;
                Object[] objArr = ppxfxbqfkfVar.f49169zdlpuopuiu;
                int iDraadjrbmk = ppxfxbqfkfVar.draadjrbmk();
                for (int i13 = 0; i13 < iDraadjrbmk; i13++) {
                    ((tg.iobyxmoadg) objArr[i13]).invoke();
                }
                this.f32452lqeggnwhkg.nufgyqmvbu();
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg);
            }
        }
    }

    public final void btonecajqb() {
        Set set = this.f32451iobyxmoadg;
        if (set == null || set.isEmpty()) {
            return;
        }
        Object objIobyxmoadg = jyumaefscl.f32436iobyxmoadg.iobyxmoadg("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                u uVar = (u) it.next();
                it.remove();
                uVar.ppxfxbqfkf();
            }
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        } finally {
            jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg);
        }
    }

    public final void dxjokdxxww() {
        this.f32451iobyxmoadg = null;
        this.f32456zoijcleaow = null;
        this.f32454ppxfxbqfkf.nufgyqmvbu();
        this.f32455wkgbmnqykc.wflxmlrfwp();
        this.f32448eablkybsjg = this.f32454ppxfxbqfkf;
        this.f32450gxszxtbevo.nufgyqmvbu();
        this.f32452lqeggnwhkg.nufgyqmvbu();
        this.f32453nufgyqmvbu = null;
        this.f32447dxjokdxxww = null;
        this.f32446btonecajqb = null;
    }

    @Override // androidx.compose.runtime.t
    public void eablkybsjg(e eVar) {
        dsvhmnatus dsvhmnatusVar = this.f32447dxjokdxxww;
        gtknphoqwx gtknphoqwxVar = dsvhmnatusVar != null ? (gtknphoqwx) dsvhmnatusVar.eablkybsjg(eVar) : null;
        if (gtknphoqwxVar != null) {
            ArrayList arrayListPpxfxbqfkf = this.f32446btonecajqb;
            if (arrayListPpxfxbqfkf == null) {
                arrayListPpxfxbqfkf = h1.ppxfxbqfkf(null, 1, null);
                this.f32446btonecajqb = arrayListPpxfxbqfkf;
            }
            h1.btonecajqb(arrayListPpxfxbqfkf, this.f32448eablkybsjg);
            this.f32448eablkybsjg = gtknphoqwxVar.iobyxmoadg();
        }
    }

    public final void gtknphoqwx(androidx.compose.runtime.dxjokdxxww dxjokdxxwwVar) {
        if (this.f32450gxszxtbevo.rgvfuqvkyq(dxjokdxxwwVar)) {
            dxjokdxxwwVar.nufgyqmvbu();
        }
    }

    @Override // androidx.compose.runtime.t
    public void gxszxtbevo(v vVar) {
        if (this.f32455wkgbmnqykc.iobyxmoadg(vVar)) {
            this.f32455wkgbmnqykc.esjtqupxsv(vVar);
            if (!this.f32448eablkybsjg.rgvfuqvkyq(vVar) && !this.f32454ppxfxbqfkf.rgvfuqvkyq(vVar)) {
                rgvfuqvkyq(vVar, this.f32454ppxfxbqfkf);
            }
            Set set = this.f32451iobyxmoadg;
            if (set == null) {
                return;
            } else {
                set.add(vVar.zoijcleaow());
            }
        }
        vipkmwdibw vipkmwdibwVar = this.f32449gtknphoqwx;
        if (vipkmwdibwVar == null || !vipkmwdibwVar.iobyxmoadg(vVar)) {
            kcexrzcfyt(vVar);
        }
    }

    @Override // androidx.compose.runtime.t
    public void iobyxmoadg(androidx.compose.runtime.dxjokdxxww dxjokdxxwwVar) {
        wypolnanlu wypolnanluVarZoijcleaow = this.f32453nufgyqmvbu;
        if (wypolnanluVarZoijcleaow == null) {
            wypolnanluVarZoijcleaow = jhduphickx.zoijcleaow();
            this.f32453nufgyqmvbu = wypolnanluVarZoijcleaow;
        }
        wypolnanluVarZoijcleaow.cqumvgiudr(dxjokdxxwwVar);
        kcexrzcfyt(dxjokdxxwwVar);
    }

    @Override // androidx.compose.runtime.t
    public void lqeggnwhkg(v vVar) {
        this.f32448eablkybsjg.zoijcleaow(vVar);
        this.f32455wkgbmnqykc.nufgyqmvbu(vVar);
    }

    @Override // androidx.compose.runtime.t
    public void nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar) {
        this.f32452lqeggnwhkg.zoijcleaow(iobyxmoadgVar);
    }

    public final vipkmwdibw ojitshcjhn() {
        if (!this.f32455wkgbmnqykc.eablkybsjg()) {
            return null;
        }
        wypolnanlu wypolnanluVar = this.f32455wkgbmnqykc;
        this.f32455wkgbmnqykc = jhduphickx.zoijcleaow();
        this.f32454ppxfxbqfkf.nufgyqmvbu();
        return wypolnanluVar;
    }

    public final void oxmwwwfdhm(Set set, krqnebusok.gxszxtbevo gxszxtbevoVar) {
        dxjokdxxww();
        this.f32451iobyxmoadg = set;
        this.f32456zoijcleaow = gxszxtbevoVar;
    }

    @Override // androidx.compose.runtime.t
    public void ppxfxbqfkf(e eVar) {
        Set set = this.f32451iobyxmoadg;
        if (set == null) {
            return;
        }
        gtknphoqwx gtknphoqwxVar = new gtknphoqwx(set);
        dsvhmnatus dsvhmnatusVarZoijcleaow = this.f32447dxjokdxxww;
        if (dsvhmnatusVarZoijcleaow == null) {
            dsvhmnatusVarZoijcleaow = ribwqtqdhb.zoijcleaow();
            this.f32447dxjokdxxww = dsvhmnatusVarZoijcleaow;
        }
        dsvhmnatusVarZoijcleaow.cqumvgiudr(eVar, gtknphoqwxVar);
        this.f32448eablkybsjg.zoijcleaow(new v(gtknphoqwxVar, null));
    }

    public final void vdvldrhtss(vipkmwdibw vipkmwdibwVar) {
        this.f32449gtknphoqwx = vipkmwdibwVar;
    }

    public final void wflxmlrfwp() {
        Set set = this.f32451iobyxmoadg;
        if (set == null) {
            return;
        }
        this.f32449gtknphoqwx = null;
        if (this.f32450gxszxtbevo.draadjrbmk() != 0) {
            Object objIobyxmoadg = jyumaefscl.f32436iobyxmoadg.iobyxmoadg("Compose:onForgotten");
            try {
                wypolnanlu wypolnanluVar = this.f32453nufgyqmvbu;
                for (int iDraadjrbmk = this.f32450gxszxtbevo.draadjrbmk() - 1; -1 < iDraadjrbmk; iDraadjrbmk--) {
                    Object obj = this.f32450gxszxtbevo.f49169zdlpuopuiu[iDraadjrbmk];
                    try {
                        if (obj instanceof v) {
                            u uVarZoijcleaow = ((v) obj).zoijcleaow();
                            set.remove(uVarZoijcleaow);
                            uVarZoijcleaow.eablkybsjg();
                        }
                        if (obj instanceof androidx.compose.runtime.dxjokdxxww) {
                            if (wypolnanluVar == null || !wypolnanluVar.iobyxmoadg(obj)) {
                                ((androidx.compose.runtime.dxjokdxxww) obj).nufgyqmvbu();
                            } else {
                                ((androidx.compose.runtime.dxjokdxxww) obj).zoijcleaow();
                            }
                        }
                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    } catch (Throwable th2) {
                        krqnebusok.gxszxtbevo gxszxtbevoVar = this.f32456zoijcleaow;
                        if (gxszxtbevoVar != null) {
                            gxszxtbevoVar.zoijcleaow(th2, obj);
                        }
                        throw th2;
                    }
                }
                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg);
            } catch (Throwable th3) {
                jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg);
                throw th3;
            }
        }
        if (this.f32454ppxfxbqfkf.draadjrbmk() != 0) {
            Object objIobyxmoadg2 = jyumaefscl.f32436iobyxmoadg.iobyxmoadg("Compose:onRemembered");
            try {
                draadjrbmk(this.f32454ppxfxbqfkf);
                wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
            } finally {
                jyumaefscl.f32436iobyxmoadg.zoijcleaow(objIobyxmoadg2);
            }
        }
    }

    @Override // androidx.compose.runtime.t
    public void wkgbmnqykc(e eVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar;
        dsvhmnatus dsvhmnatusVar = this.f32447dxjokdxxww;
        if (dsvhmnatusVar == null || ((gtknphoqwx) dsvhmnatusVar.eablkybsjg(eVar)) == null) {
            return;
        }
        ArrayList arrayList = this.f32446btonecajqb;
        if (arrayList != null && (ppxfxbqfkfVar = (ipoelvxyzq.ppxfxbqfkf) h1.dxjokdxxww(arrayList)) != null) {
            this.f32448eablkybsjg = ppxfxbqfkfVar;
        }
        dsvhmnatusVar.yggfygwlhe(eVar);
    }

    @Override // androidx.compose.runtime.t
    public void zoijcleaow(androidx.compose.runtime.dxjokdxxww dxjokdxxwwVar) {
        kcexrzcfyt(dxjokdxxwwVar);
    }
}
