package wypolnanlu;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.cdpycssgdh;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.jyumaefscl;
import androidx.camera.core.impl.rgvfuqvkyq;
import cdpycssgdh.vdvldrhtss;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import istkbnxepw.iwizpuwonk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jpowsppfya.wwaezpbzkn;
import lereixgezr.cllcsxoeiz;
import lereixgezr.metgxyhuhe;
import lereixgezr.roivzttewh;

/* JADX INFO: loaded from: classes.dex */
class draadjrbmk implements roivzttewh.zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final zoijcleaow f120738cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final cdpycssgdh f120739cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final iwizpuwonk f120740esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Map f120741istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final iwizpuwonk f120744lereixgezr;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private zoijcleaow f120746yadqdtsiqt;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final Set f120748zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final Set f120749zynmafqrjb;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final Map f120747yggfygwlhe = new HashMap();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Map f120743jyumaefscl = new HashMap();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final Map f120742iwizpuwonk = new HashMap();

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final istkbnxepw.nufgyqmvbu f120745pmvmpeiblj = zdlpuopuiu();

    class iobyxmoadg extends istkbnxepw.nufgyqmvbu {
        iobyxmoadg() {
        }

        @Override // istkbnxepw.nufgyqmvbu
        public void zoijcleaow(int i13, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
            super.zoijcleaow(i13, ojitshcjhnVar);
            Iterator it = draadjrbmk.this.f120748zdlpuopuiu.iterator();
            while (it.hasNext()) {
                draadjrbmk.hcddaimhww(ojitshcjhnVar, ((roivzttewh) it.next()).iwizpuwonk(), i13);
            }
        }
    }

    draadjrbmk(iwizpuwonk iwizpuwonkVar, iwizpuwonk iwizpuwonkVar2, Set set, cdpycssgdh cdpycssgdhVar, nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        this.f120740esjtqupxsv = iwizpuwonkVar;
        this.f120744lereixgezr = iwizpuwonkVar2;
        this.f120739cqumvgiudr = cdpycssgdhVar;
        this.f120748zdlpuopuiu = set;
        Map mapHkdspvbjdz = hkdspvbjdz(iwizpuwonkVar, set, cdpycssgdhVar);
        this.f120741istkbnxepw = mapHkdspvbjdz;
        HashSet hashSet = new HashSet(mapHkdspvbjdz.values());
        this.f120749zynmafqrjb = hashSet;
        this.f120738cdpycssgdh = new zoijcleaow(iwizpuwonkVar, hashSet);
        if (iwizpuwonkVar2 != null) {
            this.f120746yadqdtsiqt = new zoijcleaow(iwizpuwonkVar2, hashSet);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            this.f120742iwizpuwonk.put(roivzttewhVar, Boolean.FALSE);
            this.f120743jyumaefscl.put(roivzttewhVar, new gtknphoqwx(iwizpuwonkVar, this, iobyxmoadgVar));
        }
    }

    static DeferrableSurface cqumvgiudr(roivzttewh roivzttewhVar) {
        List listOjitshcjhn = roivzttewhVar instanceof cllcsxoeiz ? roivzttewhVar.iwizpuwonk().ojitshcjhn() : roivzttewhVar.iwizpuwonk().gtknphoqwx().dxjokdxxww();
        u1.nufgyqmvbu.nufgyqmvbu(listOjitshcjhn.size() <= 1);
        if (listOjitshcjhn.size() == 1) {
            return (DeferrableSurface) listOjitshcjhn.get(0);
        }
        return null;
    }

    private static int esjtqupxsv(roivzttewh roivzttewhVar) {
        if (roivzttewhVar instanceof metgxyhuhe) {
            return 1;
        }
        return roivzttewhVar instanceof cllcsxoeiz ? 4 : 2;
    }

    static void hcddaimhww(istkbnxepw.ojitshcjhn ojitshcjhnVar, jyumaefscl jyumaefsclVar, int i13) {
        Iterator it = jyumaefsclVar.btonecajqb().iterator();
        while (it.hasNext()) {
            ((istkbnxepw.nufgyqmvbu) it.next()).zoijcleaow(i13, new wflxmlrfwp(jyumaefsclVar.gtknphoqwx().btonecajqb(), ojitshcjhnVar));
        }
    }

    private static Map hkdspvbjdz(iwizpuwonk iwizpuwonkVar, Set set, cdpycssgdh cdpycssgdhVar) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            map.put(roivzttewhVar, roivzttewhVar.cdpycssgdh(iwizpuwonkVar.wflxmlrfwp(), null, roivzttewhVar.gtknphoqwx(true, cdpycssgdhVar)));
        }
        return map;
    }

    private boolean iozdgvuglv(roivzttewh roivzttewhVar) {
        Boolean bool = (Boolean) this.f120742iwizpuwonk.get(roivzttewhVar);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    private static int istkbnxepw(Set set) {
        Iterator it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((istkbnxepw) it.next()).zynmafqrjb(0));
        }
        return iMax;
    }

    private int iwizpuwonk(roivzttewh roivzttewhVar, iwizpuwonk iwizpuwonkVar) {
        return iwizpuwonkVar.zoijcleaow().agtfadlqog(((rgvfuqvkyq) roivzttewhVar.btonecajqb()).yadqdtsiqt(0));
    }

    private static int jyumaefscl(roivzttewh roivzttewhVar) {
        if (roivzttewhVar instanceof cllcsxoeiz) {
            return UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return 34;
    }

    private cllcsxoeiz.gxszxtbevo kcexrzcfyt(roivzttewh roivzttewhVar, zoijcleaow zoijcleaowVar, iwizpuwonk iwizpuwonkVar, wwaezpbzkn wwaezpbzknVar, int i13, boolean z13) {
        int iAgtfadlqog = iwizpuwonkVar.zoijcleaow().agtfadlqog(i13);
        boolean zDraadjrbmk = vdvldrhtss.draadjrbmk(wwaezpbzknVar.vdvldrhtss());
        istkbnxepw istkbnxepwVar = (istkbnxepw) this.f120741istkbnxepw.get(roivzttewhVar);
        Objects.requireNonNull(istkbnxepwVar);
        Pair pairKcexrzcfyt = zoijcleaowVar.kcexrzcfyt(istkbnxepwVar, wwaezpbzknVar.agtfadlqog(), vdvldrhtss.lqeggnwhkg(wwaezpbzknVar.vdvldrhtss()), z13);
        Rect rect = (Rect) pairKcexrzcfyt.first;
        Size size = (Size) pairKcexrzcfyt.second;
        int iIwizpuwonk = iwizpuwonk(roivzttewhVar, this.f120740esjtqupxsv);
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f120743jyumaefscl.get(roivzttewhVar);
        Objects.requireNonNull(gtknphoqwxVar);
        gtknphoqwxVar.nufgyqmvbu(iIwizpuwonk);
        int iYggfygwlhe = vdvldrhtss.yggfygwlhe((wwaezpbzknVar.rgvfuqvkyq() + iIwizpuwonk) - iAgtfadlqog);
        return cllcsxoeiz.gxszxtbevo.nufgyqmvbu(esjtqupxsv(roivzttewhVar), jyumaefscl(roivzttewhVar), rect, vdvldrhtss.ojitshcjhn(size, iYggfygwlhe), iYggfygwlhe, roivzttewhVar.istkbnxepw(iwizpuwonkVar) ^ zDraadjrbmk);
    }

    private wwaezpbzkn yadqdtsiqt(roivzttewh roivzttewhVar) {
        wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) this.f120747yggfygwlhe.get(roivzttewhVar);
        Objects.requireNonNull(wwaezpbzknVar);
        return wwaezpbzknVar;
    }

    private static void yggfygwlhe(wwaezpbzkn wwaezpbzknVar, DeferrableSurface deferrableSurface, jyumaefscl jyumaefsclVar) {
        wwaezpbzknVar.yggfygwlhe();
        try {
            wwaezpbzknVar.zynmafqrjb(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            if (jyumaefsclVar.wkgbmnqykc() != null) {
                jyumaefsclVar.wkgbmnqykc().iobyxmoadg(jyumaefsclVar, jyumaefscl.lqeggnwhkg.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    istkbnxepw.nufgyqmvbu cdpycssgdh() {
        return this.f120745pmvmpeiblj;
    }

    void cllcsxoeiz() {
        for (roivzttewh roivzttewhVar : this.f120748zdlpuopuiu) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f120743jyumaefscl.get(roivzttewhVar);
            Objects.requireNonNull(gtknphoqwxVar);
            roivzttewhVar.ulzqkzuiru(gtknphoqwxVar);
        }
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void eablkybsjg(roivzttewh roivzttewhVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (iozdgvuglv(roivzttewhVar)) {
            wwaezpbzkn wwaezpbzknVarYadqdtsiqt = yadqdtsiqt(roivzttewhVar);
            DeferrableSurface deferrableSurfaceCqumvgiudr = cqumvgiudr(roivzttewhVar);
            if (deferrableSurfaceCqumvgiudr != null) {
                yggfygwlhe(wwaezpbzknVarYadqdtsiqt, deferrableSurfaceCqumvgiudr, roivzttewhVar.iwizpuwonk());
            } else {
                wwaezpbzknVarYadqdtsiqt.wflxmlrfwp();
            }
        }
    }

    void jpowsppfya(Map map) {
        this.f120747yggfygwlhe.clear();
        this.f120747yggfygwlhe.putAll(map);
        for (Map.Entry entry : this.f120747yggfygwlhe.entrySet()) {
            roivzttewh roivzttewhVar = (roivzttewh) entry.getKey();
            wwaezpbzkn wwaezpbzknVar = (wwaezpbzkn) entry.getValue();
            roivzttewhVar.ntlheqmsrt(wwaezpbzknVar.agtfadlqog());
            roivzttewhVar.tzroggbefp(wwaezpbzknVar.vdvldrhtss());
            roivzttewhVar.crxdokpmqz(wwaezpbzknVar.oxmwwwfdhm(), null);
            roivzttewhVar.wwaezpbzkn();
        }
    }

    Set lereixgezr() {
        return this.f120748zdlpuopuiu;
    }

    void lmojexxdyd(androidx.camera.core.impl.vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.vdvldrhtss(rgvfuqvkyq.f3853kcexrzcfyt, this.f120738cdpycssgdh.ojitshcjhn(vdvldrhtssVar));
        vdvldrhtssVar.vdvldrhtss(istkbnxepw.f3793cqumvgiudr, Integer.valueOf(istkbnxepw(this.f120749zynmafqrjb)));
        lereixgezr.iwizpuwonk iwizpuwonkVarWkgbmnqykc = wypolnanlu.iobyxmoadg.wkgbmnqykc(this.f120749zynmafqrjb);
        if (iwizpuwonkVarWkgbmnqykc == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        vdvldrhtssVar.vdvldrhtss(androidx.camera.core.impl.ojitshcjhn.f3843dxjokdxxww, iwizpuwonkVarWkgbmnqykc);
        for (roivzttewh roivzttewhVar : this.f120748zdlpuopuiu) {
            if (roivzttewhVar.btonecajqb().cqumvgiudr() != 0) {
                vdvldrhtssVar.vdvldrhtss(istkbnxepw.f3792cdpycssgdh, Integer.valueOf(roivzttewhVar.btonecajqb().cqumvgiudr()));
            }
            if (roivzttewhVar.btonecajqb().cdpycssgdh() != 0) {
                vdvldrhtssVar.vdvldrhtss(istkbnxepw.f3795istkbnxepw, Integer.valueOf(roivzttewhVar.btonecajqb().cdpycssgdh()));
            }
        }
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void lqeggnwhkg(roivzttewh roivzttewhVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (iozdgvuglv(roivzttewhVar)) {
            return;
        }
        this.f120742iwizpuwonk.put(roivzttewhVar, Boolean.TRUE);
        DeferrableSurface deferrableSurfaceCqumvgiudr = cqumvgiudr(roivzttewhVar);
        if (deferrableSurfaceCqumvgiudr != null) {
            yggfygwlhe(yadqdtsiqt(roivzttewhVar), deferrableSurfaceCqumvgiudr, roivzttewhVar.iwizpuwonk());
        }
    }

    void nufgyqmvbu() {
        for (roivzttewh roivzttewhVar : this.f120748zdlpuopuiu) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f120743jyumaefscl.get(roivzttewhVar);
            Objects.requireNonNull(gtknphoqwxVar);
            roivzttewhVar.zoijcleaow(gtknphoqwxVar, null, null, roivzttewhVar.gtknphoqwx(true, this.f120739cqumvgiudr));
        }
    }

    void pkzmftpjix() {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        Iterator it = this.f120748zdlpuopuiu.iterator();
        while (it.hasNext()) {
            ppxfxbqfkf((roivzttewh) it.next());
        }
    }

    Map pmvmpeiblj(wwaezpbzkn wwaezpbzknVar, int i13, boolean z13) {
        HashMap map = new HashMap();
        for (roivzttewh roivzttewhVar : this.f120748zdlpuopuiu) {
            map.put(roivzttewhVar, kcexrzcfyt(roivzttewhVar, this.f120738cdpycssgdh, this.f120740esjtqupxsv, wwaezpbzknVar, i13, z13));
        }
        return map;
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void ppxfxbqfkf(roivzttewh roivzttewhVar) {
        DeferrableSurface deferrableSurfaceCqumvgiudr;
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        wwaezpbzkn wwaezpbzknVarYadqdtsiqt = yadqdtsiqt(roivzttewhVar);
        if (iozdgvuglv(roivzttewhVar) && (deferrableSurfaceCqumvgiudr = cqumvgiudr(roivzttewhVar)) != null) {
            yggfygwlhe(wwaezpbzknVarYadqdtsiqt, deferrableSurfaceCqumvgiudr, roivzttewhVar.iwizpuwonk());
        }
    }

    @Override // lereixgezr.roivzttewh.zoijcleaow
    public void wkgbmnqykc(roivzttewh roivzttewhVar) {
        cdpycssgdh.rgvfuqvkyq.iobyxmoadg();
        if (iozdgvuglv(roivzttewhVar)) {
            this.f120742iwizpuwonk.put(roivzttewhVar, Boolean.FALSE);
            yadqdtsiqt(roivzttewhVar).wflxmlrfwp();
        }
    }

    void wwaezpbzkn() {
        for (roivzttewh roivzttewhVar : this.f120748zdlpuopuiu) {
            roivzttewhVar.jpowsppfya();
            roivzttewhVar.pkzmftpjix();
        }
    }

    void ylkuphrtab() {
        Iterator it = this.f120748zdlpuopuiu.iterator();
        while (it.hasNext()) {
            ((roivzttewh) it.next()).hkdspvbjdz();
        }
    }

    istkbnxepw.nufgyqmvbu zdlpuopuiu() {
        return new iobyxmoadg();
    }

    Map zynmafqrjb(wwaezpbzkn wwaezpbzknVar, wwaezpbzkn wwaezpbzknVar2, int i13, boolean z13) {
        HashMap map = new HashMap();
        for (roivzttewh roivzttewhVar : this.f120748zdlpuopuiu) {
            cllcsxoeiz.gxszxtbevo gxszxtbevoVarKcexrzcfyt = kcexrzcfyt(roivzttewhVar, this.f120738cdpycssgdh, this.f120740esjtqupxsv, wwaezpbzknVar, i13, z13);
            zoijcleaow zoijcleaowVar = this.f120746yadqdtsiqt;
            iwizpuwonk iwizpuwonkVar = this.f120744lereixgezr;
            Objects.requireNonNull(iwizpuwonkVar);
            map.put(roivzttewhVar, hkdspvbjdz.wkgbmnqykc.ppxfxbqfkf(gxszxtbevoVarKcexrzcfyt, kcexrzcfyt(roivzttewhVar, zoijcleaowVar, iwizpuwonkVar, wwaezpbzknVar2, i13, z13)));
        }
        return map;
    }
}
