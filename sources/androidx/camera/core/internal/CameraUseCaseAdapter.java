package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.app.yggfygwlhe;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.agtfadlqog;
import androidx.camera.core.impl.btonecajqb;
import androidx.camera.core.impl.cdpycssgdh;
import androidx.camera.core.impl.gxszxtbevo;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.jyumaefscl;
import androidx.camera.core.impl.oxmwwwfdhm;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import cdpycssgdh.vdvldrhtss;
import istkbnxepw.hkdspvbjdz;
import istkbnxepw.iwizpuwonk;
import istkbnxepw.metgxyhuhe;
import istkbnxepw.rlfsiqarku;
import istkbnxepw.zdlpuopuiu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lereixgezr.cllcsxoeiz;
import lereixgezr.dxjokdxxww;
import lereixgezr.roivzttewh;
import lereixgezr.sopmlzcsov;
import lereixgezr.tbqsvytpvh;
import lereixgezr.uawqvzlxes;
import lereixgezr.ulzqkzuiru;
import lmojexxdyd.draadjrbmk;
import wypolnanlu.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public final class CameraUseCaseAdapter implements dxjokdxxww {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final gxszxtbevo f3894cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final ulzqkzuiru f3895cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final iobyxmoadg f3896cqumvgiudr;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final rlfsiqarku f3898hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final ulzqkzuiru f3899hkdspvbjdz;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final cdpycssgdh f3902iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final rlfsiqarku f3903jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final zdlpuopuiu f3904jyumaefscl;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final metgxyhuhe f3907pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final pmvmpeiblj.iobyxmoadg f3908pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private roivzttewh f3909wwaezpbzkn;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final iwizpuwonk f3911yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private nufgyqmvbu f3912ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final iwizpuwonk f3913zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private uawqvzlxes f3914zynmafqrjb;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final List f3897esjtqupxsv = new ArrayList();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final List f3905lereixgezr = new ArrayList();

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private List f3901istkbnxepw = Collections.emptyList();

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final Object f3910yadqdtsiqt = new Object();

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f3900iozdgvuglv = true;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private btonecajqb f3906lmojexxdyd = null;

    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(Throwable th2) {
            super(th2);
        }
    }

    public static abstract class iobyxmoadg {
        public static iobyxmoadg iobyxmoadg(String str, hkdspvbjdz hkdspvbjdzVar) {
            return new androidx.camera.core.internal.iobyxmoadg(str, hkdspvbjdzVar);
        }

        public abstract String ppxfxbqfkf();

        public abstract hkdspvbjdz zoijcleaow();
    }

    private static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        istkbnxepw f3915iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        istkbnxepw f3916zoijcleaow;

        zoijcleaow(istkbnxepw istkbnxepwVar, istkbnxepw istkbnxepwVar2) {
            this.f3915iobyxmoadg = istkbnxepwVar;
            this.f3916zoijcleaow = istkbnxepwVar2;
        }
    }

    public CameraUseCaseAdapter(iwizpuwonk iwizpuwonkVar, iwizpuwonk iwizpuwonkVar2, rlfsiqarku rlfsiqarkuVar, rlfsiqarku rlfsiqarkuVar2, ulzqkzuiru ulzqkzuiruVar, ulzqkzuiru ulzqkzuiruVar2, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, zdlpuopuiu zdlpuopuiuVar, cdpycssgdh cdpycssgdhVar) {
        this.f3913zdlpuopuiu = iwizpuwonkVar;
        this.f3911yggfygwlhe = iwizpuwonkVar2;
        this.f3899hkdspvbjdz = ulzqkzuiruVar;
        this.f3895cllcsxoeiz = ulzqkzuiruVar2;
        this.f3908pmvmpeiblj = iobyxmoadgVar;
        this.f3904jyumaefscl = zdlpuopuiuVar;
        this.f3902iwizpuwonk = cdpycssgdhVar;
        gxszxtbevo gxszxtbevoVarRgvfuqvkyq = rlfsiqarkuVar.rgvfuqvkyq();
        this.f3894cdpycssgdh = gxszxtbevoVarRgvfuqvkyq;
        this.f3907pkzmftpjix = new metgxyhuhe(iwizpuwonkVar.gxszxtbevo(), gxszxtbevoVarRgvfuqvkyq.zdlpuopuiu(null));
        this.f3898hcddaimhww = rlfsiqarkuVar;
        this.f3903jpowsppfya = rlfsiqarkuVar2;
        this.f3896cqumvgiudr = zynmafqrjb(rlfsiqarkuVar, rlfsiqarkuVar2);
    }

    private static boolean cllcsxoeiz(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            if (tzroggbefp(roivzttewhVar)) {
                istkbnxepw istkbnxepwVarBtonecajqb = roivzttewhVar.btonecajqb();
                btonecajqb.iobyxmoadg iobyxmoadgVar = agtfadlqog.f3726cllcsxoeiz;
                if (istkbnxepwVarBtonecajqb.zoijcleaow(iobyxmoadgVar) && ((Integer) u1.nufgyqmvbu.gxszxtbevo((Integer) istkbnxepwVarBtonecajqb.iobyxmoadg(iobyxmoadgVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private cllcsxoeiz cqumvgiudr() {
        return new cllcsxoeiz.zoijcleaow().ojitshcjhn("ImageCapture-Extra").eablkybsjg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void crxdokpmqz(Surface surface, SurfaceTexture surfaceTexture, tbqsvytpvh.lqeggnwhkg lqeggnwhkgVar) {
        surface.release();
        surfaceTexture.release();
    }

    private static boolean dsvhmnatus(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (sopmlzcsov((roivzttewh) it.next())) {
                return true;
            }
        }
        return false;
    }

    private lereixgezr.metgxyhuhe esjtqupxsv() {
        lereixgezr.metgxyhuhe metgxyhuheVarEablkybsjg = new lereixgezr.metgxyhuhe.iobyxmoadg().agtfadlqog("Preview-Extra").eablkybsjg();
        metgxyhuheVarEablkybsjg.yfnezrywwk(new lereixgezr.metgxyhuhe.ppxfxbqfkf() { // from class: lmojexxdyd.ppxfxbqfkf
            @Override // lereixgezr.metgxyhuhe.ppxfxbqfkf
            public final void iobyxmoadg(tbqsvytpvh tbqsvytpvhVar) {
                CameraUseCaseAdapter.jlmebxxoox(tbqsvytpvhVar);
            }
        });
        return metgxyhuheVarEablkybsjg;
    }

    private boolean hcddaimhww() {
        boolean z13;
        synchronized (this.f3910yadqdtsiqt) {
            z13 = this.f3894cdpycssgdh.zdlpuopuiu(null) != null;
        }
        return z13;
    }

    private static boolean hkdspvbjdz(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (mbcevpiqjq(((roivzttewh) it.next()).btonecajqb().lmojexxdyd())) {
                return true;
            }
        }
        return false;
    }

    private static List ikoacuggdj(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((roivzttewh) it.next()).kegysxyocb(null);
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                yggfygwlhe.iobyxmoadg(it2.next());
                throw null;
            }
        }
        return arrayList;
    }

    private static Map iozdgvuglv(Collection collection, cdpycssgdh cdpycssgdhVar, cdpycssgdh cdpycssgdhVar2) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            map.put(roivzttewhVar, new zoijcleaow(nufgyqmvbu.oipsdeybqn(roivzttewhVar) ? istkbnxepw(cdpycssgdhVar, (nufgyqmvbu) roivzttewhVar) : roivzttewhVar.gtknphoqwx(false, cdpycssgdhVar), roivzttewhVar.gtknphoqwx(true, cdpycssgdhVar2)));
        }
        return map;
    }

    private static istkbnxepw istkbnxepw(cdpycssgdh cdpycssgdhVar, nufgyqmvbu nufgyqmvbuVar) {
        istkbnxepw istkbnxepwVarGtknphoqwx = new lereixgezr.metgxyhuhe.iobyxmoadg().eablkybsjg().gtknphoqwx(false, cdpycssgdhVar);
        if (istkbnxepwVarGtknphoqwx == null) {
            return null;
        }
        oxmwwwfdhm oxmwwwfdhmVarIkoacuggdj = oxmwwwfdhm.ikoacuggdj(istkbnxepwVarGtknphoqwx);
        oxmwwwfdhmVarIkoacuggdj.okpsazkaxt(lmojexxdyd.btonecajqb.f63631lmojexxdyd);
        return nufgyqmvbuVar.lereixgezr(oxmwwwfdhmVarIkoacuggdj).wkgbmnqykc();
    }

    private void iwizpuwonk(Collection collection) {
        if (hcddaimhww()) {
            if (hkdspvbjdz(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (cllcsxoeiz(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f3910yadqdtsiqt) {
            try {
                if (!this.f3901istkbnxepw.isEmpty() && cllcsxoeiz(collection)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void jlmebxxoox(tbqsvytpvh tbqsvytpvhVar) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(tbqsvytpvhVar.ojitshcjhn().getWidth(), tbqsvytpvhVar.ojitshcjhn().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        tbqsvytpvhVar.zynmafqrjb(surface, yadqdtsiqt.iobyxmoadg.iobyxmoadg(), new u1.iobyxmoadg() { // from class: lmojexxdyd.wkgbmnqykc
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                CameraUseCaseAdapter.crxdokpmqz(surface, surfaceTexture, (tbqsvytpvh.lqeggnwhkg) obj);
            }
        });
    }

    private static boolean jpowsppfya(androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar, jyumaefscl jyumaefsclVar) {
        btonecajqb btonecajqbVarWkgbmnqykc = iwizpuwonkVar.wkgbmnqykc();
        btonecajqb btonecajqbVarGxszxtbevo = jyumaefsclVar.gxszxtbevo();
        if (btonecajqbVarWkgbmnqykc.eablkybsjg().size() != jyumaefsclVar.gxszxtbevo().eablkybsjg().size()) {
            return true;
        }
        for (btonecajqb.iobyxmoadg iobyxmoadgVar : btonecajqbVarWkgbmnqykc.eablkybsjg()) {
            if (!btonecajqbVarGxszxtbevo.zoijcleaow(iobyxmoadgVar) || !Objects.equals(btonecajqbVarGxszxtbevo.iobyxmoadg(iobyxmoadgVar), btonecajqbVarWkgbmnqykc.iobyxmoadg(iobyxmoadgVar))) {
                return true;
            }
        }
        return false;
    }

    private Map jyumaefscl(int i13, istkbnxepw.jyumaefscl jyumaefsclVar, Collection collection, Collection collection2, Map map) {
        Rect rectZoijcleaow;
        lmojexxdyd.nufgyqmvbu nufgyqmvbuVar;
        Iterator it;
        boolean z13;
        ArrayList arrayList = new ArrayList();
        String strZoijcleaow = jyumaefsclVar.zoijcleaow();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Iterator it2 = collection2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            roivzttewh roivzttewhVar = (roivzttewh) it2.next();
            androidx.camera.core.impl.iobyxmoadg iobyxmoadgVarIobyxmoadg = androidx.camera.core.impl.iobyxmoadg.iobyxmoadg(this.f3904jyumaefscl.zoijcleaow(i13, strZoijcleaow, roivzttewhVar.wflxmlrfwp(), roivzttewhVar.gxszxtbevo()), roivzttewhVar.wflxmlrfwp(), roivzttewhVar.gxszxtbevo(), ((androidx.camera.core.impl.iwizpuwonk) u1.nufgyqmvbu.gxszxtbevo(roivzttewhVar.eablkybsjg())).zoijcleaow(), nufgyqmvbu.metgxyhuhe(roivzttewhVar), roivzttewhVar.eablkybsjg().wkgbmnqykc(), roivzttewhVar.btonecajqb().esjtqupxsv(null));
            arrayList.add(iobyxmoadgVarIobyxmoadg);
            map3.put(iobyxmoadgVarIobyxmoadg, roivzttewhVar);
            map2.put(roivzttewhVar, roivzttewhVar.eablkybsjg());
        }
        if (!collection.isEmpty()) {
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            try {
                rectZoijcleaow = this.f3913zdlpuopuiu.gxszxtbevo().zoijcleaow();
                loop1: while (true) {
                    z13 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop1;
                        }
                        roivzttewh roivzttewhVar2 = (roivzttewh) it.next();
                        zoijcleaow zoijcleaowVar = (zoijcleaow) map.get(roivzttewhVar2);
                        istkbnxepw istkbnxepwVarCdpycssgdh = roivzttewhVar2.cdpycssgdh(jyumaefsclVar, zoijcleaowVar.f3915iobyxmoadg, zoijcleaowVar.f3916zoijcleaow);
                        map4.put(istkbnxepwVarCdpycssgdh, roivzttewhVar2);
                        map5.put(istkbnxepwVarCdpycssgdh, nufgyqmvbuVar.wflxmlrfwp(istkbnxepwVarCdpycssgdh));
                        if (roivzttewhVar2.btonecajqb() instanceof androidx.camera.core.impl.zdlpuopuiu) {
                            if (((androidx.camera.core.impl.zdlpuopuiu) roivzttewhVar2.btonecajqb()).cdpycssgdh() == 2) {
                                z13 = true;
                            }
                        }
                    }
                }
            } catch (NullPointerException unused) {
                rectZoijcleaow = null;
            }
            nufgyqmvbuVar = new lmojexxdyd.nufgyqmvbu(jyumaefsclVar, rectZoijcleaow != null ? vdvldrhtss.wflxmlrfwp(rectZoijcleaow) : null);
            it = collection.iterator();
            Pair pairIobyxmoadg = this.f3904jyumaefscl.iobyxmoadg(i13, strZoijcleaow, arrayList, map5, z13, dsvhmnatus(collection));
            for (Map.Entry entry : map4.entrySet()) {
                map2.put((roivzttewh) entry.getValue(), (androidx.camera.core.impl.iwizpuwonk) ((Map) pairIobyxmoadg.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) pairIobyxmoadg.second).entrySet()) {
                if (map3.containsKey(entry2.getKey())) {
                    map2.put((roivzttewh) map3.get(entry2.getKey()), (androidx.camera.core.impl.iwizpuwonk) entry2.getValue());
                }
            }
        }
        return map2;
    }

    static void jztzpxfvev(List list, Collection collection, Collection collection2) {
        List listIkoacuggdj = ikoacuggdj(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List listIkoacuggdj2 = ikoacuggdj(listIkoacuggdj, arrayList);
        if (listIkoacuggdj2.size() > 0) {
            sopmlzcsov.draadjrbmk("CameraUseCaseAdapter", "Unused effects: " + listIkoacuggdj2);
        }
    }

    static Collection kcexrzcfyt(Collection collection, roivzttewh roivzttewhVar, nufgyqmvbu nufgyqmvbuVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (roivzttewhVar != null) {
            arrayList.add(roivzttewhVar);
        }
        if (nufgyqmvbuVar != null) {
            arrayList.add(nufgyqmvbuVar);
            arrayList.removeAll(nufgyqmvbuVar.czzsidtyhn());
        }
        return arrayList;
    }

    private static boolean kegysxyocb(Collection collection) {
        Iterator it = collection.iterator();
        boolean z13 = false;
        boolean z14 = false;
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            if (ntlheqmsrt(roivzttewhVar) || nufgyqmvbu.oipsdeybqn(roivzttewhVar)) {
                z14 = true;
            } else if (tzroggbefp(roivzttewhVar)) {
                z13 = true;
            }
        }
        return z13 && !z14;
    }

    private nufgyqmvbu lereixgezr(Collection collection, boolean z13) {
        synchronized (this.f3910yadqdtsiqt) {
            try {
                Set setYlkuphrtab = ylkuphrtab(collection, z13);
                if (setYlkuphrtab.size() >= 2 || (hcddaimhww() && dsvhmnatus(setYlkuphrtab))) {
                    nufgyqmvbu nufgyqmvbuVar = this.f3912ylkuphrtab;
                    if (nufgyqmvbuVar != null && nufgyqmvbuVar.czzsidtyhn().equals(setYlkuphrtab)) {
                        nufgyqmvbu nufgyqmvbuVar2 = this.f3912ylkuphrtab;
                        Objects.requireNonNull(nufgyqmvbuVar2);
                        return nufgyqmvbuVar2;
                    }
                    if (!ulzqkzuiru(setYlkuphrtab)) {
                        return null;
                    }
                    return new nufgyqmvbu(this.f3913zdlpuopuiu, this.f3911yggfygwlhe, this.f3899hkdspvbjdz, this.f3895cllcsxoeiz, setYlkuphrtab, this.f3902iwizpuwonk);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean mbcevpiqjq(lereixgezr.iwizpuwonk iwizpuwonkVar) {
        return (iwizpuwonkVar.iobyxmoadg() == 10) || (iwizpuwonkVar.zoijcleaow() != 1 && iwizpuwonkVar.zoijcleaow() != 0);
    }

    private void metgxyhuhe(Map map, Collection collection) {
        synchronized (this.f3910yadqdtsiqt) {
            try {
                if (this.f3914zynmafqrjb != null && !collection.isEmpty()) {
                    Map mapIobyxmoadg = draadjrbmk.iobyxmoadg(this.f3913zdlpuopuiu.gxszxtbevo().zoijcleaow(), this.f3913zdlpuopuiu.wflxmlrfwp().ppxfxbqfkf() == 0, this.f3914zynmafqrjb.iobyxmoadg(), this.f3913zdlpuopuiu.wflxmlrfwp().agtfadlqog(this.f3914zynmafqrjb.ppxfxbqfkf()), this.f3914zynmafqrjb.wkgbmnqykc(), this.f3914zynmafqrjb.zoijcleaow(), map);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        roivzttewh roivzttewhVar = (roivzttewh) it.next();
                        roivzttewhVar.ntlheqmsrt((Rect) u1.nufgyqmvbu.gxszxtbevo((Rect) mapIobyxmoadg.get(roivzttewhVar)));
                    }
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    roivzttewh roivzttewhVar2 = (roivzttewh) it2.next();
                    roivzttewhVar2.tzroggbefp(yggfygwlhe(this.f3913zdlpuopuiu.gxszxtbevo().zoijcleaow(), ((androidx.camera.core.impl.iwizpuwonk) u1.nufgyqmvbu.gxszxtbevo((androidx.camera.core.impl.iwizpuwonk) map.get(roivzttewhVar2))).eablkybsjg()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean ntlheqmsrt(roivzttewh roivzttewhVar) {
        return roivzttewhVar instanceof lereixgezr.metgxyhuhe;
    }

    private void nufgyqmvbu() {
        synchronized (this.f3910yadqdtsiqt) {
            CameraControlInternal cameraControlInternalGxszxtbevo = this.f3913zdlpuopuiu.gxszxtbevo();
            this.f3906lmojexxdyd = cameraControlInternalGxszxtbevo.eablkybsjg();
            cameraControlInternalGxszxtbevo.nufgyqmvbu();
        }
    }

    private static boolean sopmlzcsov(roivzttewh roivzttewhVar) {
        if (roivzttewhVar != null) {
            if (roivzttewhVar.btonecajqb().zoijcleaow(istkbnxepw.f3802zynmafqrjb)) {
                return roivzttewhVar.btonecajqb().dsvhmnatus() == cdpycssgdh.zoijcleaow.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", roivzttewhVar + " UseCase does not have capture type.");
        }
        return false;
    }

    private static boolean stevsuqkhv(Collection collection) {
        Iterator it = collection.iterator();
        boolean z13 = false;
        boolean z14 = false;
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            if (ntlheqmsrt(roivzttewhVar) || nufgyqmvbu.oipsdeybqn(roivzttewhVar)) {
                z13 = true;
            } else if (tzroggbefp(roivzttewhVar)) {
                z14 = true;
            }
        }
        return z13 && !z14;
    }

    private static boolean tzroggbefp(roivzttewh roivzttewhVar) {
        return roivzttewhVar instanceof cllcsxoeiz;
    }

    static boolean ulzqkzuiru(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = iArr[i13];
                if (roivzttewhVar.zynmafqrjb(i14)) {
                    if (hashSet.contains(Integer.valueOf(i14))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i14));
                }
            }
        }
        return true;
    }

    private void vipkmwdibw() {
        synchronized (this.f3910yadqdtsiqt) {
            try {
                if (this.f3906lmojexxdyd != null) {
                    this.f3913zdlpuopuiu.gxszxtbevo().lqeggnwhkg(this.f3906lmojexxdyd);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int wwaezpbzkn(boolean z13) {
        int i13;
        synchronized (this.f3910yadqdtsiqt) {
            try {
                Iterator it = this.f3901istkbnxepw.iterator();
                if (it.hasNext()) {
                    yggfygwlhe.iobyxmoadg(it.next());
                    throw null;
                }
                i13 = z13 ? 3 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i13;
    }

    private boolean wypolnanlu() {
        boolean z13;
        synchronized (this.f3910yadqdtsiqt) {
            z13 = true;
            if (this.f3894cdpycssgdh.jyumaefscl() != 1) {
                z13 = false;
            }
        }
        return z13;
    }

    private int yadqdtsiqt() {
        synchronized (this.f3910yadqdtsiqt) {
            try {
                return this.f3908pmvmpeiblj.ppxfxbqfkf() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Matrix yggfygwlhe(Rect rect, Size size) {
        u1.nufgyqmvbu.zoijcleaow(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Set ylkuphrtab(Collection collection, boolean z13) {
        HashSet hashSet = new HashSet();
        int iWwaezpbzkn = wwaezpbzkn(z13);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            roivzttewh roivzttewhVar = (roivzttewh) it.next();
            u1.nufgyqmvbu.zoijcleaow(!nufgyqmvbu.oipsdeybqn(roivzttewhVar), "Only support one level of sharing for now.");
            if (roivzttewhVar.zynmafqrjb(iWwaezpbzkn)) {
                hashSet.add(roivzttewhVar);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    private roivzttewh zdlpuopuiu(Collection collection, nufgyqmvbu nufgyqmvbuVar) {
        roivzttewh roivzttewhVarCqumvgiudr;
        synchronized (this.f3910yadqdtsiqt) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (nufgyqmvbuVar != null) {
                    arrayList.add(nufgyqmvbuVar);
                    arrayList.removeAll(nufgyqmvbuVar.czzsidtyhn());
                }
                if (!wypolnanlu()) {
                    roivzttewhVarCqumvgiudr = null;
                } else if (kegysxyocb(arrayList)) {
                    roivzttewhVarCqumvgiudr = ntlheqmsrt(this.f3909wwaezpbzkn) ? this.f3909wwaezpbzkn : esjtqupxsv();
                } else if (stevsuqkhv(arrayList)) {
                    roivzttewhVarCqumvgiudr = tzroggbefp(this.f3909wwaezpbzkn) ? this.f3909wwaezpbzkn : cqumvgiudr();
                } else {
                    roivzttewhVarCqumvgiudr = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return roivzttewhVarCqumvgiudr;
    }

    public static iobyxmoadg zynmafqrjb(rlfsiqarku rlfsiqarkuVar, rlfsiqarku rlfsiqarkuVar2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(rlfsiqarkuVar.zoijcleaow());
        sb3.append(rlfsiqarkuVar2 == null ? "" : rlfsiqarkuVar2.zoijcleaow());
        return iobyxmoadg.iobyxmoadg(sb3.toString(), rlfsiqarkuVar.rgvfuqvkyq().kegysxyocb());
    }

    public void btonecajqb(boolean z13) {
        this.f3913zdlpuopuiu.btonecajqb(z13);
    }

    public iobyxmoadg cdpycssgdh() {
        return this.f3896cqumvgiudr;
    }

    public void eablkybsjg(Collection collection) {
        synchronized (this.f3910yadqdtsiqt) {
            try {
                this.f3913zdlpuopuiu.ojitshcjhn(this.f3894cdpycssgdh);
                iwizpuwonk iwizpuwonkVar = this.f3911yggfygwlhe;
                if (iwizpuwonkVar != null) {
                    iwizpuwonkVar.ojitshcjhn(this.f3894cdpycssgdh);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3897esjtqupxsv);
                linkedHashSet.addAll(collection);
                try {
                    iwizpuwonk iwizpuwonkVar2 = this.f3911yggfygwlhe;
                    xrmfcynszj(linkedHashSet, iwizpuwonkVar2 != null, iwizpuwonkVar2 != null);
                } catch (IllegalArgumentException e13) {
                    throw new CameraException(e13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lereixgezr.dxjokdxxww
    public CameraControl iobyxmoadg() {
        return this.f3907pkzmftpjix;
    }

    public void jhduphickx(List list) {
        synchronized (this.f3910yadqdtsiqt) {
            this.f3901istkbnxepw = list;
        }
    }

    public lereixgezr.agtfadlqog lmojexxdyd() {
        return this.f3903jpowsppfya;
    }

    public void lqeggnwhkg() {
        synchronized (this.f3910yadqdtsiqt) {
            try {
                if (!this.f3900iozdgvuglv) {
                    if (!this.f3905lereixgezr.isEmpty()) {
                        this.f3913zdlpuopuiu.ojitshcjhn(this.f3894cdpycssgdh);
                        iwizpuwonk iwizpuwonkVar = this.f3911yggfygwlhe;
                        if (iwizpuwonkVar != null) {
                            iwizpuwonkVar.ojitshcjhn(this.f3894cdpycssgdh);
                        }
                    }
                    this.f3913zdlpuopuiu.gtknphoqwx(this.f3905lereixgezr);
                    iwizpuwonk iwizpuwonkVar2 = this.f3911yggfygwlhe;
                    if (iwizpuwonkVar2 != null) {
                        iwizpuwonkVar2.gtknphoqwx(this.f3905lereixgezr);
                    }
                    vipkmwdibw();
                    Iterator it = this.f3905lereixgezr.iterator();
                    while (it.hasNext()) {
                        ((roivzttewh) it.next()).wwaezpbzkn();
                    }
                    this.f3900iozdgvuglv = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void okpsazkaxt(uawqvzlxes uawqvzlxesVar) {
        synchronized (this.f3910yadqdtsiqt) {
            this.f3914zynmafqrjb = uawqvzlxesVar;
        }
    }

    public List pkzmftpjix() {
        ArrayList arrayList;
        synchronized (this.f3910yadqdtsiqt) {
            arrayList = new ArrayList(this.f3897esjtqupxsv);
        }
        return arrayList;
    }

    public void pmvmpeiblj() {
        synchronized (this.f3910yadqdtsiqt) {
            try {
                if (this.f3900iozdgvuglv) {
                    this.f3913zdlpuopuiu.draadjrbmk(new ArrayList(this.f3905lereixgezr));
                    iwizpuwonk iwizpuwonkVar = this.f3911yggfygwlhe;
                    if (iwizpuwonkVar != null) {
                        iwizpuwonkVar.draadjrbmk(new ArrayList(this.f3905lereixgezr));
                    }
                    nufgyqmvbu();
                    this.f3900iozdgvuglv = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void ribwqtqdhb(Collection collection) {
        synchronized (this.f3910yadqdtsiqt) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3897esjtqupxsv);
            linkedHashSet.removeAll(collection);
            iwizpuwonk iwizpuwonkVar = this.f3911yggfygwlhe;
            xrmfcynszj(linkedHashSet, iwizpuwonkVar != null, iwizpuwonkVar != null);
        }
    }

    void xrmfcynszj(Collection collection, boolean z13, boolean z14) {
        androidx.camera.core.impl.iwizpuwonk iwizpuwonkVar;
        btonecajqb btonecajqbVarWkgbmnqykc;
        synchronized (this.f3910yadqdtsiqt) {
            try {
                iwizpuwonk(collection);
                if (!z13 && hcddaimhww() && dsvhmnatus(collection)) {
                    xrmfcynszj(collection, true, z14);
                    return;
                }
                nufgyqmvbu nufgyqmvbuVarLereixgezr = lereixgezr(collection, z13);
                roivzttewh roivzttewhVarZdlpuopuiu = zdlpuopuiu(collection, nufgyqmvbuVarLereixgezr);
                Collection collectionKcexrzcfyt = kcexrzcfyt(collection, roivzttewhVarZdlpuopuiu, nufgyqmvbuVarLereixgezr);
                ArrayList<roivzttewh> arrayList = new ArrayList(collectionKcexrzcfyt);
                arrayList.removeAll(this.f3905lereixgezr);
                ArrayList<roivzttewh> arrayList2 = new ArrayList(collectionKcexrzcfyt);
                arrayList2.retainAll(this.f3905lereixgezr);
                ArrayList<roivzttewh> arrayList3 = new ArrayList(this.f3905lereixgezr);
                arrayList3.removeAll(collectionKcexrzcfyt);
                Map mapIozdgvuglv = iozdgvuglv(arrayList, this.f3894cdpycssgdh.btonecajqb(), this.f3902iwizpuwonk);
                Map mapEmptyMap = Collections.emptyMap();
                try {
                    Map map = mapIozdgvuglv;
                    Map mapJyumaefscl = jyumaefscl(yadqdtsiqt(), this.f3913zdlpuopuiu.wflxmlrfwp(), arrayList, arrayList2, map);
                    if (this.f3911yggfygwlhe != null) {
                        int iYadqdtsiqt = yadqdtsiqt();
                        iwizpuwonk iwizpuwonkVar2 = this.f3911yggfygwlhe;
                        Objects.requireNonNull(iwizpuwonkVar2);
                        mapEmptyMap = jyumaefscl(iYadqdtsiqt, iwizpuwonkVar2.wflxmlrfwp(), arrayList, arrayList2, map);
                    }
                    Map map2 = mapEmptyMap;
                    metgxyhuhe(mapJyumaefscl, collectionKcexrzcfyt);
                    jztzpxfvev(this.f3901istkbnxepw, collectionKcexrzcfyt, collection);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((roivzttewh) it.next()).ulzqkzuiru(this.f3913zdlpuopuiu);
                    }
                    this.f3913zdlpuopuiu.draadjrbmk(arrayList3);
                    if (this.f3911yggfygwlhe != null) {
                        for (roivzttewh roivzttewhVar : arrayList3) {
                            iwizpuwonk iwizpuwonkVar3 = this.f3911yggfygwlhe;
                            Objects.requireNonNull(iwizpuwonkVar3);
                            roivzttewhVar.ulzqkzuiru(iwizpuwonkVar3);
                        }
                        iwizpuwonk iwizpuwonkVar4 = this.f3911yggfygwlhe;
                        Objects.requireNonNull(iwizpuwonkVar4);
                        iwizpuwonkVar4.draadjrbmk(arrayList3);
                    }
                    if (arrayList3.isEmpty()) {
                        for (roivzttewh roivzttewhVar2 : arrayList2) {
                            if (mapJyumaefscl.containsKey(roivzttewhVar2) && (btonecajqbVarWkgbmnqykc = (iwizpuwonkVar = (androidx.camera.core.impl.iwizpuwonk) mapJyumaefscl.get(roivzttewhVar2)).wkgbmnqykc()) != null && jpowsppfya(iwizpuwonkVar, roivzttewhVar2.iwizpuwonk())) {
                                roivzttewhVar2.jlmebxxoox(btonecajqbVarWkgbmnqykc);
                                if (this.f3900iozdgvuglv) {
                                    this.f3913zdlpuopuiu.eablkybsjg(roivzttewhVar2);
                                    iwizpuwonk iwizpuwonkVar5 = this.f3911yggfygwlhe;
                                    if (iwizpuwonkVar5 != null) {
                                        Objects.requireNonNull(iwizpuwonkVar5);
                                        iwizpuwonkVar5.eablkybsjg(roivzttewhVar2);
                                    }
                                }
                            }
                        }
                    }
                    for (roivzttewh roivzttewhVar3 : arrayList) {
                        Map map3 = map;
                        zoijcleaow zoijcleaowVar = (zoijcleaow) map3.get(roivzttewhVar3);
                        Objects.requireNonNull(zoijcleaowVar);
                        iwizpuwonk iwizpuwonkVar6 = this.f3911yggfygwlhe;
                        if (iwizpuwonkVar6 != null) {
                            iwizpuwonk iwizpuwonkVar7 = this.f3913zdlpuopuiu;
                            Objects.requireNonNull(iwizpuwonkVar6);
                            roivzttewhVar3.zoijcleaow(iwizpuwonkVar7, iwizpuwonkVar6, zoijcleaowVar.f3915iobyxmoadg, zoijcleaowVar.f3916zoijcleaow);
                            roivzttewhVar3.crxdokpmqz((androidx.camera.core.impl.iwizpuwonk) u1.nufgyqmvbu.gxszxtbevo((androidx.camera.core.impl.iwizpuwonk) mapJyumaefscl.get(roivzttewhVar3)), (androidx.camera.core.impl.iwizpuwonk) map2.get(roivzttewhVar3));
                        } else {
                            roivzttewhVar3.zoijcleaow(this.f3913zdlpuopuiu, null, zoijcleaowVar.f3915iobyxmoadg, zoijcleaowVar.f3916zoijcleaow);
                            roivzttewhVar3.crxdokpmqz((androidx.camera.core.impl.iwizpuwonk) u1.nufgyqmvbu.gxszxtbevo((androidx.camera.core.impl.iwizpuwonk) mapJyumaefscl.get(roivzttewhVar3)), null);
                        }
                        map = map3;
                    }
                    if (this.f3900iozdgvuglv) {
                        this.f3913zdlpuopuiu.gtknphoqwx(arrayList);
                        iwizpuwonk iwizpuwonkVar8 = this.f3911yggfygwlhe;
                        if (iwizpuwonkVar8 != null) {
                            Objects.requireNonNull(iwizpuwonkVar8);
                            iwizpuwonkVar8.gtknphoqwx(arrayList);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((roivzttewh) it2.next()).wwaezpbzkn();
                    }
                    this.f3897esjtqupxsv.clear();
                    this.f3897esjtqupxsv.addAll(collection);
                    this.f3905lereixgezr.clear();
                    this.f3905lereixgezr.addAll(collectionKcexrzcfyt);
                    this.f3909wwaezpbzkn = roivzttewhVarZdlpuopuiu;
                    this.f3912ylkuphrtab = nufgyqmvbuVarLereixgezr;
                } catch (IllegalArgumentException e13) {
                    if (z13 || hcddaimhww() || this.f3908pmvmpeiblj.ppxfxbqfkf() == 2) {
                        throw e13;
                    }
                    xrmfcynszj(collection, true, z14);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lereixgezr.dxjokdxxww
    public lereixgezr.agtfadlqog zoijcleaow() {
        return this.f3898hcddaimhww;
    }
}
