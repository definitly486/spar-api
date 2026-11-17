package b2;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
abstract class zoijcleaow {

    public interface iobyxmoadg {
        void iobyxmoadg(Object obj, Rect rect);
    }

    private static class ppxfxbqfkf implements Comparator {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final iobyxmoadg f15004iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final boolean f15005jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Rect f15007zdlpuopuiu = new Rect();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final Rect f15006yggfygwlhe = new Rect();

        ppxfxbqfkf(boolean z13, iobyxmoadg iobyxmoadgVar) {
            this.f15005jyumaefscl = z13;
            this.f15004iwizpuwonk = iobyxmoadgVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f15007zdlpuopuiu;
            Rect rect2 = this.f15006yggfygwlhe;
            this.f15004iwizpuwonk.iobyxmoadg(obj, rect);
            this.f15004iwizpuwonk.iobyxmoadg(obj2, rect2);
            int i13 = rect.top;
            int i14 = rect2.top;
            if (i13 < i14) {
                return -1;
            }
            if (i13 > i14) {
                return 1;
            }
            int i15 = rect.left;
            int i16 = rect2.left;
            if (i15 < i16) {
                return this.f15005jyumaefscl ? 1 : -1;
            }
            if (i15 > i16) {
                return this.f15005jyumaefscl ? -1 : 1;
            }
            int i17 = rect.bottom;
            int i18 = rect2.bottom;
            if (i17 < i18) {
                return -1;
            }
            if (i17 > i18) {
                return 1;
            }
            int i19 = rect.right;
            int i23 = rect2.right;
            if (i19 < i23) {
                return this.f15005jyumaefscl ? 1 : -1;
            }
            if (i19 > i23) {
                return this.f15005jyumaefscl ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: b2.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public interface InterfaceC0252zoijcleaow {
        Object iobyxmoadg(Object obj, int i13);

        int zoijcleaow(Object obj);
    }

    private static int agtfadlqog(int i13, Rect rect, Rect rect2) {
        int i14;
        int i15;
        if (i13 == 17) {
            i14 = rect.left;
            i15 = rect2.left;
        } else if (i13 == 33) {
            i14 = rect.top;
            i15 = rect2.top;
        } else if (i13 == 66) {
            i14 = rect2.right;
            i15 = rect.right;
        } else {
            if (i13 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i14 = rect2.bottom;
            i15 = rect.bottom;
        }
        return i14 - i15;
    }

    private static boolean btonecajqb(int i13, Rect rect, Rect rect2) {
        if (i13 == 17) {
            return rect.left >= rect2.right;
        }
        if (i13 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i13 == 66) {
            return rect.right <= rect2.left;
        }
        if (i13 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int draadjrbmk(int i13, Rect rect, Rect rect2) {
        int i14;
        int i15;
        if (i13 == 17) {
            i14 = rect.left;
            i15 = rect2.right;
        } else if (i13 == 33) {
            i14 = rect.top;
            i15 = rect2.bottom;
        } else if (i13 == 66) {
            i14 = rect2.left;
            i15 = rect.right;
        } else {
            if (i13 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i14 = rect2.top;
            i15 = rect.bottom;
        }
        return i14 - i15;
    }

    private static boolean dxjokdxxww(Rect rect, Rect rect2, int i13) {
        if (i13 == 17) {
            int i14 = rect.right;
            int i15 = rect2.right;
            return (i14 > i15 || rect.left >= i15) && rect.left > rect2.left;
        }
        if (i13 == 33) {
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            return (i16 > i17 || rect.top >= i17) && rect.top > rect2.top;
        }
        if (i13 == 66) {
            int i18 = rect.left;
            int i19 = rect2.left;
            return (i18 < i19 || rect.right <= i19) && rect.right < rect2.right;
        }
        if (i13 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i23 = rect.top;
        int i24 = rect2.top;
        return (i23 < i24 || rect.bottom <= i24) && rect.bottom < rect2.bottom;
    }

    private static Object eablkybsjg(Object obj, ArrayList arrayList, boolean z13) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z13 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static int gtknphoqwx(int i13, Rect rect, Rect rect2) {
        return Math.max(0, draadjrbmk(i13, rect, rect2));
    }

    private static Object gxszxtbevo(Object obj, ArrayList arrayList, boolean z13) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z13 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static boolean iobyxmoadg(int i13, Rect rect, Rect rect2, Rect rect3) {
        boolean zZoijcleaow = zoijcleaow(i13, rect, rect2);
        if (zoijcleaow(i13, rect, rect3) || !zZoijcleaow) {
            return false;
        }
        return !btonecajqb(i13, rect, rect3) || i13 == 17 || i13 == 66 || gtknphoqwx(i13, rect, rect2) < wflxmlrfwp(i13, rect, rect3);
    }

    private static int lqeggnwhkg(int i13, int i14) {
        return (i13 * 13 * i13) + (i14 * i14);
    }

    private static boolean nufgyqmvbu(int i13, Rect rect, Rect rect2, Rect rect3) {
        if (!dxjokdxxww(rect, rect2, i13)) {
            return false;
        }
        if (dxjokdxxww(rect, rect3, i13) && !iobyxmoadg(i13, rect, rect2, rect3)) {
            return !iobyxmoadg(i13, rect, rect3, rect2) && lqeggnwhkg(gtknphoqwx(i13, rect, rect2), ojitshcjhn(i13, rect, rect2)) < lqeggnwhkg(gtknphoqwx(i13, rect, rect3), ojitshcjhn(i13, rect, rect3));
        }
        return true;
    }

    private static int ojitshcjhn(int i13, Rect rect, Rect rect2) {
        if (i13 != 17) {
            if (i13 != 33) {
                if (i13 != 66) {
                    if (i13 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    public static Object ppxfxbqfkf(Object obj, InterfaceC0252zoijcleaow interfaceC0252zoijcleaow, iobyxmoadg iobyxmoadgVar, Object obj2, Rect rect, int i13) {
        Rect rect2 = new Rect(rect);
        if (i13 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i13 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i13 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i13 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iZoijcleaow = interfaceC0252zoijcleaow.zoijcleaow(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i14 = 0; i14 < iZoijcleaow; i14++) {
            Object objIobyxmoadg = interfaceC0252zoijcleaow.iobyxmoadg(obj, i14);
            if (objIobyxmoadg != obj2) {
                iobyxmoadgVar.iobyxmoadg(objIobyxmoadg, rect3);
                if (nufgyqmvbu(i13, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = objIobyxmoadg;
                }
            }
        }
        return obj3;
    }

    private static int wflxmlrfwp(int i13, Rect rect, Rect rect2) {
        return Math.max(1, agtfadlqog(i13, rect, rect2));
    }

    public static Object wkgbmnqykc(Object obj, InterfaceC0252zoijcleaow interfaceC0252zoijcleaow, iobyxmoadg iobyxmoadgVar, Object obj2, int i13, boolean z13, boolean z14) {
        int iZoijcleaow = interfaceC0252zoijcleaow.zoijcleaow(obj);
        ArrayList arrayList = new ArrayList(iZoijcleaow);
        for (int i14 = 0; i14 < iZoijcleaow; i14++) {
            arrayList.add(interfaceC0252zoijcleaow.iobyxmoadg(obj, i14));
        }
        Collections.sort(arrayList, new ppxfxbqfkf(z13, iobyxmoadgVar));
        if (i13 == 1) {
            return gxszxtbevo(obj2, arrayList, z14);
        }
        if (i13 == 2) {
            return eablkybsjg(obj2, arrayList, z14);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static boolean zoijcleaow(int i13, Rect rect, Rect rect2) {
        if (i13 != 17) {
            if (i13 != 33) {
                if (i13 != 66) {
                    if (i13 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }
}
