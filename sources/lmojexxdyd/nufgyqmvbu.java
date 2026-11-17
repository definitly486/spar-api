package lmojexxdyd;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.rgvfuqvkyq;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import istkbnxepw.jyumaefscl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final dxjokdxxww f63647eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jyumaefscl f63648iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f63649ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Rational f63650wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f63651zoijcleaow;

    public nufgyqmvbu(jyumaefscl jyumaefsclVar, Size size) {
        this.f63648iobyxmoadg = jyumaefsclVar;
        this.f63651zoijcleaow = jyumaefsclVar.iobyxmoadg();
        this.f63649ppxfxbqfkf = jyumaefsclVar.ppxfxbqfkf();
        Rational rationalNufgyqmvbu = size != null ? nufgyqmvbu(size) : dxjokdxxww(jyumaefsclVar);
        this.f63650wkgbmnqykc = rationalNufgyqmvbu;
        this.f63647eablkybsjg = new dxjokdxxww(jyumaefsclVar, rationalNufgyqmvbu);
    }

    static Rational agtfadlqog(int i13, boolean z13) {
        if (i13 != -1) {
            if (i13 == 0) {
                return z13 ? cdpycssgdh.iobyxmoadg.f19703iobyxmoadg : cdpycssgdh.iobyxmoadg.f19706zoijcleaow;
            }
            if (i13 == 1) {
                return z13 ? cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf : cdpycssgdh.iobyxmoadg.f19705wkgbmnqykc;
            }
            sopmlzcsov.ppxfxbqfkf("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i13);
        }
        return null;
    }

    private List btonecajqb(List list, int i13) {
        List listDraadjrbmk = draadjrbmk(list, i13);
        if (listDraadjrbmk == null) {
            listDraadjrbmk = this.f63648iobyxmoadg.dxjokdxxww(i13);
        }
        ArrayList arrayList = new ArrayList(listDraadjrbmk);
        Collections.sort(arrayList, new cdpycssgdh.wkgbmnqykc(true));
        if (arrayList.isEmpty()) {
            sopmlzcsov.draadjrbmk("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i13 + ".");
        }
        return arrayList;
    }

    private List draadjrbmk(List list, int i13) {
        Size[] sizeArr;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (((Integer) pair.first).intValue() == i13) {
                    sizeArr = (Size[]) pair.second;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    private Rational dxjokdxxww(jyumaefscl jyumaefsclVar) {
        List listDxjokdxxww = jyumaefsclVar.dxjokdxxww(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        if (listDxjokdxxww.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listDxjokdxxww, new cdpycssgdh.wkgbmnqykc());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static List eablkybsjg(List list, dsvhmnatus.zoijcleaow zoijcleaowVar, int i13, int i14, int i15) {
        if (zoijcleaowVar == null) {
            return list;
        }
        List listIobyxmoadg = zoijcleaowVar.iobyxmoadg(new ArrayList(list), cdpycssgdh.ppxfxbqfkf.iobyxmoadg(cdpycssgdh.ppxfxbqfkf.zoijcleaow(i13), i14, i15 == 1));
        if (list.containsAll(listIobyxmoadg)) {
            return listIobyxmoadg;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    static List gtknphoqwx(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cdpycssgdh.iobyxmoadg.f19703iobyxmoadg);
        arrayList.add(cdpycssgdh.iobyxmoadg.f19704ppxfxbqfkf);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList.add(rational);
                        break;
                    }
                } while (!cdpycssgdh.iobyxmoadg.iobyxmoadg(size, (Rational) it2.next()));
            }
        }
        return arrayList;
    }

    private static void gxszxtbevo(LinkedHashMap linkedHashMap, dsvhmnatus.wkgbmnqykc wkgbmnqykcVar) {
        if (wkgbmnqykcVar == null) {
            return;
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            lqeggnwhkg((List) linkedHashMap.get((Rational) it.next()), wkgbmnqykcVar);
        }
    }

    private static LinkedHashMap iobyxmoadg(List list, dsvhmnatus.iobyxmoadg iobyxmoadgVar, Rational rational) {
        return zoijcleaow(ojitshcjhn(list), iobyxmoadgVar, rational);
    }

    private static void kcexrzcfyt(List list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    private static void lqeggnwhkg(List list, dsvhmnatus.wkgbmnqykc wkgbmnqykcVar) {
        if (list.isEmpty()) {
            return;
        }
        int iZoijcleaow = wkgbmnqykcVar.zoijcleaow();
        if (wkgbmnqykcVar.equals(dsvhmnatus.wkgbmnqykc.f29460ppxfxbqfkf)) {
            return;
        }
        Size sizeIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
        if (iZoijcleaow == 0) {
            kcexrzcfyt(list, sizeIobyxmoadg);
            return;
        }
        if (iZoijcleaow == 1) {
            vdvldrhtss(list, sizeIobyxmoadg, true);
            return;
        }
        if (iZoijcleaow == 2) {
            vdvldrhtss(list, sizeIobyxmoadg, false);
        } else if (iZoijcleaow == 3) {
            oxmwwwfdhm(list, sizeIobyxmoadg, true);
        } else {
            if (iZoijcleaow != 4) {
                return;
            }
            oxmwwwfdhm(list, sizeIobyxmoadg, false);
        }
    }

    private Rational nufgyqmvbu(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    static Map ojitshcjhn(List list) {
        HashMap map = new HashMap();
        Iterator it = gtknphoqwx(list).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    private static void oxmwwwfdhm(List list, Size size, boolean z13) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            Size size2 = (Size) list.get(i13);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z13) {
            list.addAll(arrayList);
        }
    }

    private List ppxfxbqfkf(List list, dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVar, int i13) {
        if (ppxfxbqfkfVar.iobyxmoadg() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f63648iobyxmoadg.wkgbmnqykc(i13));
        Collections.sort(arrayList, new cdpycssgdh.wkgbmnqykc(true));
        return arrayList;
    }

    public static List rgvfuqvkyq(dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVar, List list, Size size, int i13, Rational rational, int i14, int i15) {
        LinkedHashMap linkedHashMapIobyxmoadg = iobyxmoadg(list, ppxfxbqfkfVar.zoijcleaow(), rational);
        if (size != null) {
            wkgbmnqykc(linkedHashMapIobyxmoadg, size);
        }
        gxszxtbevo(linkedHashMapIobyxmoadg, ppxfxbqfkfVar.wkgbmnqykc());
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMapIobyxmoadg.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : (List) it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return eablkybsjg(arrayList, ppxfxbqfkfVar.ppxfxbqfkf(), i13, i14, i15);
    }

    static void vdvldrhtss(List list, Size size, boolean z13) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z13) {
            list.addAll(arrayList);
        }
    }

    private static void wkgbmnqykc(LinkedHashMap linkedHashMap, Size size) {
        int iZoijcleaow = hcddaimhww.ppxfxbqfkf.zoijcleaow(size);
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = (List) linkedHashMap.get((Rational) it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (hcddaimhww.ppxfxbqfkf.zoijcleaow(size2) <= iZoijcleaow) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private static LinkedHashMap zoijcleaow(Map map, dsvhmnatus.iobyxmoadg iobyxmoadgVar, Rational rational) {
        boolean z13 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z13 = false;
        }
        Rational rationalAgtfadlqog = agtfadlqog(iobyxmoadgVar.zoijcleaow(), z13);
        if (iobyxmoadgVar.iobyxmoadg() == 0) {
            Rational rationalAgtfadlqog2 = agtfadlqog(iobyxmoadgVar.zoijcleaow(), z13);
            for (Rational rational2 : new ArrayList(map.keySet())) {
                if (!rational2.equals(rationalAgtfadlqog2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new cdpycssgdh.iobyxmoadg.C0357iobyxmoadg(rationalAgtfadlqog, rational));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Rational rational3 : arrayList) {
            linkedHashMap.put(rational3, (List) map.get(rational3));
        }
        return linkedHashMap;
    }

    public List wflxmlrfwp(istkbnxepw istkbnxepwVar) {
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) istkbnxepwVar;
        List listWwaezpbzkn = rgvfuqvkyqVar.wwaezpbzkn(null);
        if (listWwaezpbzkn != null) {
            return listWwaezpbzkn;
        }
        dsvhmnatus.ppxfxbqfkf ppxfxbqfkfVarYlkuphrtab = rgvfuqvkyqVar.ylkuphrtab(null);
        List listBtonecajqb = btonecajqb(rgvfuqvkyqVar.gtknphoqwx(null), istkbnxepwVar.wflxmlrfwp());
        if (ppxfxbqfkfVarYlkuphrtab == null) {
            return this.f63647eablkybsjg.gxszxtbevo(listBtonecajqb, istkbnxepwVar);
        }
        Size sizeDxjokdxxww = ((rgvfuqvkyq) istkbnxepwVar).dxjokdxxww(null);
        int iYadqdtsiqt = rgvfuqvkyqVar.yadqdtsiqt(0);
        if (!istkbnxepwVar.mbcevpiqjq(false)) {
            listBtonecajqb = ppxfxbqfkf(listBtonecajqb, ppxfxbqfkfVarYlkuphrtab, istkbnxepwVar.wflxmlrfwp());
        }
        return rgvfuqvkyq(rgvfuqvkyqVar.draadjrbmk(), listBtonecajqb, sizeDxjokdxxww, iYadqdtsiqt, this.f63650wkgbmnqykc, this.f63651zoijcleaow, this.f63649ppxfxbqfkf);
    }
}
