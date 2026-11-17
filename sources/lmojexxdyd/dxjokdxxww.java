package lmojexxdyd;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.istkbnxepw;
import androidx.camera.core.impl.rgvfuqvkyq;
import istkbnxepw.jyumaefscl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f63632iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Rational f63633ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f63634wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f63635zoijcleaow;

    dxjokdxxww(jyumaefscl jyumaefsclVar, Rational rational) {
        this.f63632iobyxmoadg = jyumaefsclVar.iobyxmoadg();
        this.f63635zoijcleaow = jyumaefsclVar.ppxfxbqfkf();
        this.f63633ppxfxbqfkf = rational;
        boolean z13 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z13 = false;
        }
        this.f63634wkgbmnqykc = z13;
    }

    private static boolean eablkybsjg(int i13, int i14, int i15) {
        int iIobyxmoadg = cdpycssgdh.ppxfxbqfkf.iobyxmoadg(cdpycssgdh.ppxfxbqfkf.zoijcleaow(i13), i15, 1 == i14);
        return iIobyxmoadg == 90 || iIobyxmoadg == 270;
    }

    private static Size iobyxmoadg(Size size, int i13, int i14, int i15) {
        return (size == null || !eablkybsjg(i13, i14, i15)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private Rational ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, List list) {
        if (rgvfuqvkyqVar.lereixgezr()) {
            return nufgyqmvbu.agtfadlqog(rgvfuqvkyqVar.istkbnxepw(), this.f63634wkgbmnqykc);
        }
        Size sizeWkgbmnqykc = wkgbmnqykc(rgvfuqvkyqVar);
        if (sizeWkgbmnqykc != null) {
            return zoijcleaow(sizeWkgbmnqykc, list);
        }
        return null;
    }

    private Size wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar) {
        return iobyxmoadg(rgvfuqvkyqVar.cllcsxoeiz(null), rgvfuqvkyqVar.yadqdtsiqt(0), this.f63635zoijcleaow, this.f63632iobyxmoadg);
    }

    private static Rational zoijcleaow(Size size, List list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : nufgyqmvbu.gtknphoqwx(list)) {
            if (cdpycssgdh.iobyxmoadg.iobyxmoadg(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    List gxszxtbevo(List list, istkbnxepw istkbnxepwVar) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new cdpycssgdh.wkgbmnqykc(true));
        ArrayList arrayList2 = new ArrayList();
        rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) istkbnxepwVar;
        Size sizeDxjokdxxww = rgvfuqvkyqVar.dxjokdxxww(null);
        Size size = (Size) arrayList.get(0);
        if (sizeDxjokdxxww == null || hcddaimhww.ppxfxbqfkf.zoijcleaow(size) < hcddaimhww.ppxfxbqfkf.zoijcleaow(sizeDxjokdxxww)) {
            sizeDxjokdxxww = size;
        }
        Size sizeWkgbmnqykc = wkgbmnqykc(rgvfuqvkyqVar);
        Size size2 = hcddaimhww.ppxfxbqfkf.f40071ppxfxbqfkf;
        int iZoijcleaow = hcddaimhww.ppxfxbqfkf.zoijcleaow(size2);
        if (hcddaimhww.ppxfxbqfkf.zoijcleaow(sizeDxjokdxxww) < iZoijcleaow) {
            size2 = hcddaimhww.ppxfxbqfkf.f40069iobyxmoadg;
        } else if (sizeWkgbmnqykc != null && hcddaimhww.ppxfxbqfkf.zoijcleaow(sizeWkgbmnqykc) < iZoijcleaow) {
            size2 = sizeWkgbmnqykc;
        }
        for (Size size3 : arrayList) {
            if (hcddaimhww.ppxfxbqfkf.zoijcleaow(size3) <= hcddaimhww.ppxfxbqfkf.zoijcleaow(sizeDxjokdxxww) && hcddaimhww.ppxfxbqfkf.zoijcleaow(size3) >= hcddaimhww.ppxfxbqfkf.zoijcleaow(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeDxjokdxxww + "\ninitial size list: " + arrayList);
        }
        Rational rationalPpxfxbqfkf = ppxfxbqfkf(rgvfuqvkyqVar, arrayList2);
        if (sizeWkgbmnqykc == null) {
            sizeWkgbmnqykc = rgvfuqvkyqVar.pkzmftpjix(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalPpxfxbqfkf == null) {
            arrayList3.addAll(arrayList2);
            if (sizeWkgbmnqykc != null) {
                nufgyqmvbu.vdvldrhtss(arrayList3, sizeWkgbmnqykc, true);
            }
        } else {
            Map mapOjitshcjhn = nufgyqmvbu.ojitshcjhn(arrayList2);
            if (sizeWkgbmnqykc != null) {
                Iterator it = mapOjitshcjhn.keySet().iterator();
                while (it.hasNext()) {
                    nufgyqmvbu.vdvldrhtss((List) mapOjitshcjhn.get((Rational) it.next()), sizeWkgbmnqykc, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapOjitshcjhn.keySet());
            Collections.sort(arrayList4, new cdpycssgdh.iobyxmoadg.C0357iobyxmoadg(rationalPpxfxbqfkf, this.f63633ppxfxbqfkf));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : (List) mapOjitshcjhn.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
