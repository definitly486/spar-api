package wypolnanlu;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.rgvfuqvkyq;
import cdpycssgdh.vdvldrhtss;
import istkbnxepw.iwizpuwonk;
import istkbnxepw.jyumaefscl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final double f120782nufgyqmvbu = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lmojexxdyd.nufgyqmvbu f120783eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final jyumaefscl f120784gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Size f120785iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Map f120786lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Rational f120787ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Set f120788wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Rational f120789zoijcleaow;

    private static class iobyxmoadg implements Comparator {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f120790yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Rational f120791zdlpuopuiu;

        iobyxmoadg(Rational rational, boolean z13) {
            this.f120791zdlpuopuiu = rational;
            this.f120790yggfygwlhe = z13;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fPpxfxbqfkf = zoijcleaow.ppxfxbqfkf(rational, this.f120791zdlpuopuiu);
            float fPpxfxbqfkf2 = zoijcleaow.ppxfxbqfkf(rational2, this.f120791zdlpuopuiu);
            return this.f120790yggfygwlhe ? Float.compare(fPpxfxbqfkf2, fPpxfxbqfkf) : Float.compare(fPpxfxbqfkf, fPpxfxbqfkf2);
        }
    }

    zoijcleaow(iwizpuwonk iwizpuwonkVar, Set set) {
        this(vdvldrhtss.wflxmlrfwp(iwizpuwonkVar.gxszxtbevo().zoijcleaow()), iwizpuwonkVar.wflxmlrfwp(), set);
    }

    private static Rational agtfadlqog(Rational rational) {
        Rational rational2 = cdpycssgdh.iobyxmoadg.f19703iobyxmoadg;
        if (rational.equals(rational2)) {
            return cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf;
        }
        if (rational.equals(cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    private List btonecajqb() {
        return this.f120784gxszxtbevo.dxjokdxxww(34);
    }

    private boolean cdpycssgdh() {
        Iterator it = draadjrbmk().iterator();
        while (it.hasNext()) {
            if (!cdpycssgdh.iobyxmoadg.iobyxmoadg((Size) it.next(), this.f120787ppxfxbqfkf)) {
                return true;
            }
        }
        return false;
    }

    private static Rational cllcsxoeiz(Size size) {
        Rational rational = cdpycssgdh.iobyxmoadg.f19703iobyxmoadg;
        if (cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational)) {
            return rational;
        }
        Rational rational2 = cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf;
        return cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational2) ? rational2 : hkdspvbjdz(size);
    }

    private Map cqumvgiudr(List list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = cdpycssgdh.iobyxmoadg.f19703iobyxmoadg;
        map.put(rational, new ArrayList());
        Rational rational2 = cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalHkdspvbjdz = hkdspvbjdz(size);
                    arrayList2.add(rationalHkdspvbjdz);
                    map.put(rationalHkdspvbjdz, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    private Set draadjrbmk() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f120788wkgbmnqykc.iterator();
        while (it.hasNext()) {
            hashSet.addAll(jyumaefscl((istkbnxepw) it.next()));
        }
        return hashSet;
    }

    private List dxjokdxxww() {
        return this.f120784gxszxtbevo.wkgbmnqykc(34);
    }

    private static List eablkybsjg(List list) {
        Rational rationalHkdspvbjdz;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = map.keySet().iterator();
            do {
                if (!it2.hasNext()) {
                    rationalHkdspvbjdz = null;
                    break;
                }
                rationalHkdspvbjdz = (Rational) it2.next();
            } while (!cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rationalHkdspvbjdz));
            if (rationalHkdspvbjdz != null) {
                Size size2 = (Size) map.get(rationalHkdspvbjdz);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalHkdspvbjdz = hkdspvbjdz(size);
            }
            arrayList.add(size);
            map.put(rationalHkdspvbjdz, size);
        }
        return arrayList;
    }

    static boolean esjtqupxsv(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static Rect gtknphoqwx(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalHkdspvbjdz = hkdspvbjdz(size);
        if (rational.floatValue() == rationalHkdspvbjdz.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalHkdspvbjdz.floatValue()) {
                float f13 = width;
                float fFloatValue = f13 / rational.floatValue();
                float f14 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f14, f13, fFloatValue + f14);
            } else {
                float f15 = height;
                float fFloatValue2 = rational.floatValue() * f15;
                float f16 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f16, 0.0f, fFloatValue2 + f16, f15);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    static List gxszxtbevo(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (pmvmpeiblj(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private void hcddaimhww(List list) {
        Collections.sort(list, new iobyxmoadg(hkdspvbjdz(this.f120785iobyxmoadg), true));
    }

    private static Rational hkdspvbjdz(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    static Rect iozdgvuglv(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    private boolean istkbnxepw(Size size, Size size2) {
        return zynmafqrjb(cllcsxoeiz(size), size2);
    }

    private static List iwizpuwonk(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    static void jpowsppfya(List list) {
        Collections.sort(list, new cdpycssgdh.wkgbmnqykc(true));
    }

    private List jyumaefscl(istkbnxepw istkbnxepwVar) {
        if (!this.f120788wkgbmnqykc.contains(istkbnxepwVar)) {
            throw new IllegalArgumentException("Invalid child config: " + istkbnxepwVar);
        }
        if (this.f120786lqeggnwhkg.containsKey(istkbnxepwVar)) {
            List list = (List) this.f120786lqeggnwhkg.get(istkbnxepwVar);
            Objects.requireNonNull(list);
            return list;
        }
        List listEablkybsjg = eablkybsjg(this.f120783eablkybsjg.wflxmlrfwp(istkbnxepwVar));
        this.f120786lqeggnwhkg.put(istkbnxepwVar, listEablkybsjg);
        return listEablkybsjg;
    }

    private static boolean lereixgezr(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (esjtqupxsv((Size) it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    private List lmojexxdyd(List list, boolean z13) {
        Map mapCqumvgiudr = cqumvgiudr(list);
        ArrayList<Rational> arrayList = new ArrayList(mapCqumvgiudr.keySet());
        hcddaimhww(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Rational rational : arrayList) {
            if (!rational.equals(cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf) && !rational.equals(cdpycssgdh.iobyxmoadg.f19703iobyxmoadg)) {
                List list2 = (List) mapCqumvgiudr.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(ylkuphrtab(rational, list2, z13));
            }
        }
        return arrayList2;
    }

    static List lqeggnwhkg(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private static Rational nufgyqmvbu(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f120782nufgyqmvbu ? cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf : cdpycssgdh.iobyxmoadg.f19703iobyxmoadg;
    }

    private boolean pkzmftpjix() {
        boolean z13;
        dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVarYlkuphrtab;
        Iterator it = this.f120788wkgbmnqykc.iterator();
        while (true) {
            z13 = false;
            if (!it.hasNext()) {
                break;
            }
            istkbnxepw istkbnxepwVar = (istkbnxepw) it.next();
            if (!istkbnxepwVar.mbcevpiqjq(false) && (istkbnxepwVar instanceof rgvfuqvkyq) && (ppxfxbqfkfVarYlkuphrtab = ((rgvfuqvkyq) istkbnxepwVar).ylkuphrtab(null)) != null) {
                z13 = true;
                if (ppxfxbqfkfVarYlkuphrtab.iobyxmoadg() == 1) {
                    break;
                }
            }
        }
        return z13;
    }

    private static boolean pmvmpeiblj(Collection collection, Size size) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!esjtqupxsv((Size) it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float ppxfxbqfkf(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    static List rgvfuqvkyq(Collection collection, List list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listYadqdtsiqt = yadqdtsiqt(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listYadqdtsiqt) {
            if (lereixgezr(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    static Rect wflxmlrfwp(Size size, Size size2) {
        return gtknphoqwx(hkdspvbjdz(size2), size);
    }

    private List wkgbmnqykc(Rational rational, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!zynmafqrjb(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private List wwaezpbzkn(List list) {
        ArrayList arrayList = new ArrayList();
        if (cdpycssgdh()) {
            arrayList.addAll(ylkuphrtab(this.f120789zoijcleaow, list, false));
        }
        arrayList.addAll(ylkuphrtab(this.f120787ppxfxbqfkf, list, false));
        arrayList.addAll(lmojexxdyd(list, false));
        if (arrayList.isEmpty()) {
            sopmlzcsov.draadjrbmk("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(lmojexxdyd(list, true));
        }
        sopmlzcsov.iobyxmoadg("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    private static List yadqdtsiqt(List list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    private static Rational yggfygwlhe(Size size) {
        Rational rationalNufgyqmvbu = nufgyqmvbu(size);
        sopmlzcsov.iobyxmoadg("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalNufgyqmvbu + ".");
        return rationalNufgyqmvbu;
    }

    private List ylkuphrtab(Rational rational, List list, boolean z13) {
        List<Size> listLqeggnwhkg = lqeggnwhkg(rational, list);
        jpowsppfya(listLqeggnwhkg);
        HashSet hashSet = new HashSet(listLqeggnwhkg);
        Iterator it = this.f120788wkgbmnqykc.iterator();
        while (it.hasNext()) {
            List listJyumaefscl = jyumaefscl((istkbnxepw) it.next());
            if (!z13) {
                listJyumaefscl = wkgbmnqykc(rational, listJyumaefscl);
            }
            if (listJyumaefscl.isEmpty()) {
                return new ArrayList();
            }
            listLqeggnwhkg = gxszxtbevo(listJyumaefscl, listLqeggnwhkg);
            hashSet.retainAll(rgvfuqvkyq(listJyumaefscl, listLqeggnwhkg));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listLqeggnwhkg) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    private Pair zdlpuopuiu(Rect rect, istkbnxepw istkbnxepwVar, boolean z13) {
        Size sizeVdvldrhtss;
        if (z13) {
            sizeVdvldrhtss = oxmwwwfdhm(vdvldrhtss.wflxmlrfwp(rect), istkbnxepwVar);
        } else {
            Size sizeWflxmlrfwp = vdvldrhtss.wflxmlrfwp(rect);
            sizeVdvldrhtss = vdvldrhtss(sizeWflxmlrfwp, istkbnxepwVar);
            rect = wflxmlrfwp(sizeWflxmlrfwp, sizeVdvldrhtss);
        }
        return new Pair(rect, sizeVdvldrhtss);
    }

    private boolean zoijcleaow(float f13, float f14, float f15) {
        if (f13 == f14 || f14 == f15) {
            return false;
        }
        if (f13 > f14) {
            return f14 < f15;
        }
        return f14 > f15;
    }

    private boolean zynmafqrjb(Rational rational, Size size) {
        if (this.f120789zoijcleaow.equals(rational) || cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational)) {
            return false;
        }
        return zoijcleaow(this.f120789zoijcleaow.floatValue(), rational.floatValue(), cllcsxoeiz(size).floatValue());
    }

    Pair kcexrzcfyt(istkbnxepw istkbnxepwVar, Rect rect, int i13, boolean z13) {
        boolean z14;
        if (vdvldrhtss.dxjokdxxww(i13)) {
            rect = iozdgvuglv(rect);
            z14 = true;
        } else {
            z14 = false;
        }
        Pair pairZdlpuopuiu = zdlpuopuiu(rect, istkbnxepwVar, z13);
        Rect rectIozdgvuglv = (Rect) pairZdlpuopuiu.first;
        Size sizeAgtfadlqog = (Size) pairZdlpuopuiu.second;
        if (z14) {
            sizeAgtfadlqog = vdvldrhtss.agtfadlqog(sizeAgtfadlqog);
            rectIozdgvuglv = iozdgvuglv(rectIozdgvuglv);
        }
        return new Pair(rectIozdgvuglv, sizeAgtfadlqog);
    }

    List ojitshcjhn(androidx.camera.core.impl.vdvldrhtss vdvldrhtssVar) {
        List listBtonecajqb = btonecajqb();
        if (pkzmftpjix()) {
            ArrayList arrayList = new ArrayList(listBtonecajqb);
            arrayList.addAll(dxjokdxxww());
            listBtonecajqb = arrayList;
        }
        List list = (List) vdvldrhtssVar.lqeggnwhkg(rgvfuqvkyq.f3857vdvldrhtss, null);
        if (list != null) {
            listBtonecajqb = iwizpuwonk(list);
        }
        return wwaezpbzkn(listBtonecajqb);
    }

    Size oxmwwwfdhm(Size size, istkbnxepw istkbnxepwVar) {
        Iterator it = jyumaefscl(istkbnxepwVar).iterator();
        while (it.hasNext()) {
            Size sizeWflxmlrfwp = vdvldrhtss.wflxmlrfwp(wflxmlrfwp((Size) it.next(), size));
            if (!esjtqupxsv(sizeWflxmlrfwp, size)) {
                return sizeWflxmlrfwp;
            }
        }
        return size;
    }

    Size vdvldrhtss(Size size, istkbnxepw istkbnxepwVar) {
        List<Size> listJyumaefscl = jyumaefscl(istkbnxepwVar);
        for (Size size2 : listJyumaefscl) {
            if (!istkbnxepw(size, size2) && !esjtqupxsv(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listJyumaefscl) {
            if (!esjtqupxsv(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    private zoijcleaow(Size size, jyumaefscl jyumaefsclVar, Set set) {
        this(size, jyumaefsclVar, set, new lmojexxdyd.nufgyqmvbu(jyumaefsclVar, size));
    }

    zoijcleaow(Size size, jyumaefscl jyumaefsclVar, Set set, lmojexxdyd.nufgyqmvbu nufgyqmvbuVar) {
        this.f120786lqeggnwhkg = new HashMap();
        this.f120785iobyxmoadg = size;
        Rational rationalYggfygwlhe = yggfygwlhe(size);
        this.f120789zoijcleaow = rationalYggfygwlhe;
        this.f120787ppxfxbqfkf = agtfadlqog(rationalYggfygwlhe);
        this.f120784gxszxtbevo = jyumaefsclVar;
        this.f120788wkgbmnqykc = set;
        this.f120783eablkybsjg = nufgyqmvbuVar;
    }
}
