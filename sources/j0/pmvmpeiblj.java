package j0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pmvmpeiblj {
    public static final int eablkybsjg(List list, float f13) {
        byte b13;
        if (f13 <= 0.0f) {
            return 0;
        }
        if (f13 >= ((cdpycssgdh) hg.jyumaefscl.skhdrjzrfn(list)).iobyxmoadg()) {
            return hg.jyumaefscl.ojitshcjhn(list);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list.get(i14);
            if (cdpycssgdhVar.nufgyqmvbu() > f13) {
                b13 = 1;
            } else {
                b13 = cdpycssgdhVar.iobyxmoadg() <= f13 ? (byte) -1 : (byte) 0;
            }
            if (b13 < 0) {
                i13 = i14 + 1;
            } else {
                if (b13 <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static final void gxszxtbevo(List list, long j13, tg.draadjrbmk draadjrbmkVar) {
        int size = list.size();
        for (int iZoijcleaow = zoijcleaow(list, l.draadjrbmk(j13)); iZoijcleaow < size; iZoijcleaow++) {
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list.get(iZoijcleaow);
            if (cdpycssgdhVar.gxszxtbevo() >= l.gtknphoqwx(j13)) {
                return;
            }
            if (cdpycssgdhVar.gxszxtbevo() != cdpycssgdhVar.zoijcleaow()) {
                draadjrbmkVar.invoke(cdpycssgdhVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence ppxfxbqfkf(cdpycssgdh cdpycssgdhVar) {
        return '[' + cdpycssgdhVar.gxszxtbevo() + ", " + cdpycssgdhVar.zoijcleaow() + ')';
    }

    public static final int wkgbmnqykc(List list, int i13) {
        byte b13;
        int size = list.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list.get(i15);
            if (cdpycssgdhVar.lqeggnwhkg() > i13) {
                b13 = 1;
            } else {
                b13 = cdpycssgdhVar.ppxfxbqfkf() <= i13 ? (byte) -1 : (byte) 0;
            }
            if (b13 < 0) {
                i14 = i15 + 1;
            } else {
                if (b13 <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static final int zoijcleaow(List list, int i13) {
        int i14;
        byte b13;
        int iZoijcleaow = ((cdpycssgdh) hg.jyumaefscl.skhdrjzrfn(list)).zoijcleaow();
        boolean z13 = false;
        if (!(i13 <= ((cdpycssgdh) hg.jyumaefscl.skhdrjzrfn(list)).zoijcleaow())) {
            q0.iobyxmoadg.iobyxmoadg("Index " + i13 + " should be less or equal than last line's end " + iZoijcleaow);
        }
        int size = list.size() - 1;
        int i15 = 0;
        while (true) {
            if (i15 > size) {
                i14 = -(i15 + 1);
                break;
            }
            i14 = (i15 + size) >>> 1;
            cdpycssgdh cdpycssgdhVar = (cdpycssgdh) list.get(i14);
            if (cdpycssgdhVar.gxszxtbevo() > i13) {
                b13 = 1;
            } else {
                b13 = cdpycssgdhVar.zoijcleaow() <= i13 ? (byte) -1 : (byte) 0;
            }
            if (b13 >= 0) {
                if (b13 <= 0) {
                    break;
                }
                size = i14 - 1;
            } else {
                i15 = i14 + 1;
            }
        }
        if (i14 >= 0 && i14 < list.size()) {
            z13 = true;
        }
        if (!z13) {
            q0.iobyxmoadg.iobyxmoadg("Found paragraph index " + i14 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i13 + ", paragraphs=[" + y0.ppxfxbqfkf.eablkybsjg(list, null, null, null, 0, null, new tg.draadjrbmk() { // from class: j0.lereixgezr
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return pmvmpeiblj.ppxfxbqfkf((cdpycssgdh) obj);
                }
            }, 31, null) + ']');
        }
        return i14;
    }
}
