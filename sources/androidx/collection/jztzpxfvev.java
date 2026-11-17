package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jztzpxfvev {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f4311jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private Object[] f4312yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int[] f4313zdlpuopuiu;

    public jztzpxfvev() {
        this(0, 1, null);
    }

    private final int eablkybsjg() {
        int i13 = this.f4311jyumaefscl;
        if (i13 == 0) {
            return -1;
        }
        int iIobyxmoadg = jlmebxxoox.iobyxmoadg.iobyxmoadg(this.f4313zdlpuopuiu, i13, 0);
        if (iIobyxmoadg < 0 || this.f4312yggfygwlhe[iIobyxmoadg << 1] == null) {
            return iIobyxmoadg;
        }
        int i14 = iIobyxmoadg + 1;
        while (i14 < i13 && this.f4313zdlpuopuiu[i14] == 0) {
            if (this.f4312yggfygwlhe[i14 << 1] == null) {
                return i14;
            }
            i14++;
        }
        for (int i15 = iIobyxmoadg - 1; i15 >= 0 && this.f4313zdlpuopuiu[i15] == 0; i15--) {
            if (this.f4312yggfygwlhe[i15 << 1] == null) {
                return i15;
            }
        }
        return ~i14;
    }

    private final int ppxfxbqfkf(Object obj, int i13) {
        int i14 = this.f4311jyumaefscl;
        if (i14 == 0) {
            return -1;
        }
        int iIobyxmoadg = jlmebxxoox.iobyxmoadg.iobyxmoadg(this.f4313zdlpuopuiu, i14, i13);
        if (iIobyxmoadg < 0 || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f4312yggfygwlhe[iIobyxmoadg << 1])) {
            return iIobyxmoadg;
        }
        int i15 = iIobyxmoadg + 1;
        while (i15 < i14 && this.f4313zdlpuopuiu[i15] == i13) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f4312yggfygwlhe[i15 << 1])) {
                return i15;
            }
            i15++;
        }
        for (int i16 = iIobyxmoadg - 1; i16 >= 0 && this.f4313zdlpuopuiu[i16] == i13; i16--) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, this.f4312yggfygwlhe[i16 << 1])) {
                return i16;
            }
        }
        return ~i15;
    }

    public Object btonecajqb(int i13, Object obj) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f4311jyumaefscl) {
            z13 = true;
        }
        if (!z13) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Expected index to be within 0..size()-1, but was " + i13);
        }
        int i14 = (i13 << 1) + 1;
        Object[] objArr = this.f4312yggfygwlhe;
        Object obj2 = objArr[i14];
        objArr[i14] = obj;
        return obj2;
    }

    public void clear() {
        if (this.f4311jyumaefscl > 0) {
            this.f4313zdlpuopuiu = jlmebxxoox.iobyxmoadg.f51694iobyxmoadg;
            this.f4312yggfygwlhe = jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf;
            this.f4311jyumaefscl = 0;
        }
        if (this.f4311jyumaefscl > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return wkgbmnqykc(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return iobyxmoadg(obj) >= 0;
    }

    public Object dxjokdxxww(int i13) {
        if (!(i13 >= 0 && i13 < this.f4311jyumaefscl)) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Expected index to be within 0..size()-1, but was " + i13);
        }
        Object[] objArr = this.f4312yggfygwlhe;
        int i14 = i13 << 1;
        Object obj = objArr[i14 + 1];
        int i15 = this.f4311jyumaefscl;
        if (i15 <= 1) {
            clear();
        } else {
            int i16 = i15 - 1;
            int[] iArr = this.f4313zdlpuopuiu;
            if (iArr.length <= 8 || i15 >= iArr.length / 3) {
                if (i13 < i16) {
                    int i17 = i13 + 1;
                    hg.agtfadlqog.draadjrbmk(iArr, iArr, i13, i17, i15);
                    Object[] objArr2 = this.f4312yggfygwlhe;
                    hg.agtfadlqog.agtfadlqog(objArr2, objArr2, i14, i17 << 1, i15 << 1);
                }
                Object[] objArr3 = this.f4312yggfygwlhe;
                int i18 = i16 << 1;
                objArr3[i18] = null;
                objArr3[i18 + 1] = null;
            } else {
                int i19 = i15 > 8 ? i15 + (i15 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i19);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
                this.f4313zdlpuopuiu = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f4312yggfygwlhe, i19 << 1);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                this.f4312yggfygwlhe = objArrCopyOf;
                if (i15 != this.f4311jyumaefscl) {
                    throw new ConcurrentModificationException();
                }
                if (i13 > 0) {
                    hg.agtfadlqog.draadjrbmk(iArr, this.f4313zdlpuopuiu, 0, 0, i13);
                    hg.agtfadlqog.agtfadlqog(objArr, this.f4312yggfygwlhe, 0, 0, i14);
                }
                if (i13 < i16) {
                    int i23 = i13 + 1;
                    hg.agtfadlqog.draadjrbmk(iArr, this.f4313zdlpuopuiu, i13, i23, i15);
                    hg.agtfadlqog.agtfadlqog(objArr, this.f4312yggfygwlhe, i14, i23 << 1, i15 << 1);
                }
            }
            if (i15 != this.f4311jyumaefscl) {
                throw new ConcurrentModificationException();
            }
            this.f4311jyumaefscl = i16;
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof jztzpxfvev) {
                if (size() != ((jztzpxfvev) obj).size()) {
                    return false;
                }
                jztzpxfvev jztzpxfvevVar = (jztzpxfvev) obj;
                int i13 = this.f4311jyumaefscl;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object objGxszxtbevo = gxszxtbevo(i14);
                    Object objGtknphoqwx = gtknphoqwx(i14);
                    Object obj2 = jztzpxfvevVar.get(objGxszxtbevo);
                    if (objGtknphoqwx == null) {
                        if (obj2 != null || !jztzpxfvevVar.containsKey(objGxszxtbevo)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objGtknphoqwx, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i15 = this.f4311jyumaefscl;
            for (int i16 = 0; i16 < i15; i16++) {
                Object objGxszxtbevo2 = gxszxtbevo(i16);
                Object objGtknphoqwx2 = gtknphoqwx(i16);
                Object obj3 = ((Map) obj).get(objGxszxtbevo2);
                if (objGtknphoqwx2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objGxszxtbevo2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(objGtknphoqwx2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iWkgbmnqykc = wkgbmnqykc(obj);
        if (iWkgbmnqykc >= 0) {
            return this.f4312yggfygwlhe[(iWkgbmnqykc << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iWkgbmnqykc = wkgbmnqykc(obj);
        return iWkgbmnqykc >= 0 ? this.f4312yggfygwlhe[(iWkgbmnqykc << 1) + 1] : obj2;
    }

    public Object gtknphoqwx(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f4311jyumaefscl) {
            z13 = true;
        }
        if (!z13) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Expected index to be within 0..size()-1, but was " + i13);
        }
        return this.f4312yggfygwlhe[(i13 << 1) + 1];
    }

    public Object gxszxtbevo(int i13) {
        boolean z13 = false;
        if (i13 >= 0 && i13 < this.f4311jyumaefscl) {
            z13 = true;
        }
        if (!z13) {
            jlmebxxoox.wkgbmnqykc.iobyxmoadg("Expected index to be within 0..size()-1, but was " + i13);
        }
        return this.f4312yggfygwlhe[i13 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f4313zdlpuopuiu;
        Object[] objArr = this.f4312yggfygwlhe;
        int i13 = this.f4311jyumaefscl;
        int i14 = 1;
        int i15 = 0;
        int iHashCode = 0;
        while (i15 < i13) {
            Object obj = objArr[i14];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i15];
            i15++;
            i14 += 2;
        }
        return iHashCode;
    }

    public final int iobyxmoadg(Object obj) {
        int i13 = this.f4311jyumaefscl * 2;
        Object[] objArr = this.f4312yggfygwlhe;
        if (obj == null) {
            for (int i14 = 1; i14 < i13; i14 += 2) {
                if (objArr[i14] == null) {
                    return i14 >> 1;
                }
            }
            return -1;
        }
        for (int i15 = 1; i15 < i13; i15 += 2) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, objArr[i15])) {
                return i15 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f4311jyumaefscl <= 0;
    }

    public void lqeggnwhkg(jztzpxfvev map) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(map, "map");
        int i13 = map.f4311jyumaefscl;
        zoijcleaow(this.f4311jyumaefscl + i13);
        if (this.f4311jyumaefscl != 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                put(map.gxszxtbevo(i14), map.gtknphoqwx(i14));
            }
        } else if (i13 > 0) {
            hg.agtfadlqog.draadjrbmk(map.f4313zdlpuopuiu, this.f4313zdlpuopuiu, 0, 0, i13);
            hg.agtfadlqog.agtfadlqog(map.f4312yggfygwlhe, this.f4312yggfygwlhe, 0, 0, i13 << 1);
            this.f4311jyumaefscl = i13;
        }
    }

    public Object put(Object obj, Object obj2) {
        int i13 = this.f4311jyumaefscl;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iPpxfxbqfkf = obj != null ? ppxfxbqfkf(obj, iHashCode) : eablkybsjg();
        if (iPpxfxbqfkf >= 0) {
            int i14 = (iPpxfxbqfkf << 1) + 1;
            Object[] objArr = this.f4312yggfygwlhe;
            Object obj3 = objArr[i14];
            objArr[i14] = obj2;
            return obj3;
        }
        int i15 = ~iPpxfxbqfkf;
        int[] iArr = this.f4313zdlpuopuiu;
        if (i13 >= iArr.length) {
            int i16 = 8;
            if (i13 >= 8) {
                i16 = (i13 >> 1) + i13;
            } else if (i13 < 4) {
                i16 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f4313zdlpuopuiu = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4312yggfygwlhe, i16 << 1);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            this.f4312yggfygwlhe = objArrCopyOf;
            if (i13 != this.f4311jyumaefscl) {
                throw new ConcurrentModificationException();
            }
        }
        if (i15 < i13) {
            int[] iArr2 = this.f4313zdlpuopuiu;
            int i17 = i15 + 1;
            hg.agtfadlqog.draadjrbmk(iArr2, iArr2, i17, i15, i13);
            Object[] objArr2 = this.f4312yggfygwlhe;
            hg.agtfadlqog.agtfadlqog(objArr2, objArr2, i17 << 1, i15 << 1, this.f4311jyumaefscl << 1);
        }
        int i18 = this.f4311jyumaefscl;
        if (i13 == i18) {
            int[] iArr3 = this.f4313zdlpuopuiu;
            if (i15 < iArr3.length) {
                iArr3[i15] = iHashCode;
                Object[] objArr3 = this.f4312yggfygwlhe;
                int i19 = i15 << 1;
                objArr3[i19] = obj;
                objArr3[i19 + 1] = obj2;
                this.f4311jyumaefscl = i18 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iWkgbmnqykc = wkgbmnqykc(obj);
        if (iWkgbmnqykc >= 0) {
            return dxjokdxxww(iWkgbmnqykc);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iWkgbmnqykc = wkgbmnqykc(obj);
        if (iWkgbmnqykc >= 0) {
            return btonecajqb(iWkgbmnqykc, obj2);
        }
        return null;
    }

    public int size() {
        return this.f4311jyumaefscl;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb3 = new StringBuilder(this.f4311jyumaefscl * 28);
        sb3.append('{');
        int i13 = this.f4311jyumaefscl;
        for (int i14 = 0; i14 < i13; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            Object objGxszxtbevo = gxszxtbevo(i14);
            if (objGxszxtbevo != sb3) {
                sb3.append(objGxszxtbevo);
            } else {
                sb3.append("(this Map)");
            }
            sb3.append('=');
            Object objGtknphoqwx = gtknphoqwx(i14);
            if (objGtknphoqwx != sb3) {
                sb3.append(objGtknphoqwx);
            } else {
                sb3.append("(this Map)");
            }
        }
        sb3.append('}');
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public int wkgbmnqykc(Object obj) {
        return obj == null ? eablkybsjg() : ppxfxbqfkf(obj, obj.hashCode());
    }

    public void zoijcleaow(int i13) {
        int i14 = this.f4311jyumaefscl;
        int[] iArr = this.f4313zdlpuopuiu;
        if (iArr.length < i13) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(iArrCopyOf, "copyOf(...)");
            this.f4313zdlpuopuiu = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f4312yggfygwlhe, i13 * 2);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
            this.f4312yggfygwlhe = objArrCopyOf;
        }
        if (this.f4311jyumaefscl != i14) {
            throw new ConcurrentModificationException();
        }
    }

    public jztzpxfvev(int i13) {
        this.f4313zdlpuopuiu = i13 == 0 ? jlmebxxoox.iobyxmoadg.f51694iobyxmoadg : new int[i13];
        this.f4312yggfygwlhe = i13 == 0 ? jlmebxxoox.iobyxmoadg.f51695ppxfxbqfkf : new Object[i13 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iWkgbmnqykc = wkgbmnqykc(obj);
        if (iWkgbmnqykc < 0 || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, gtknphoqwx(iWkgbmnqykc))) {
            return false;
        }
        dxjokdxxww(iWkgbmnqykc);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iWkgbmnqykc = wkgbmnqykc(obj);
        if (iWkgbmnqykc < 0 || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj2, gtknphoqwx(iWkgbmnqykc))) {
            return false;
        }
        btonecajqb(iWkgbmnqykc, obj3);
        return true;
    }

    public /* synthetic */ jztzpxfvev(int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13);
    }

    public jztzpxfvev(jztzpxfvev jztzpxfvevVar) {
        this(0, 1, null);
        if (jztzpxfvevVar != null) {
            lqeggnwhkg(jztzpxfvevVar);
        }
    }
}
