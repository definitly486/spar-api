package ig;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String btonecajqb(Object[] objArr, int i13, int i14, Collection collection) {
        StringBuilder sb3 = new StringBuilder((i14 * 3) + 2);
        sb3.append("[");
        for (int i15 = 0; i15 < i14; i15++) {
            if (i15 > 0) {
                sb3.append(", ");
            }
            Object obj = objArr[i13 + i15];
            if (obj == collection) {
                sb3.append("(this Collection)");
            } else {
                sb3.append(obj);
            }
        }
        sb3.append("]");
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dxjokdxxww(Object[] objArr, int i13, int i14) {
        int iHashCode = 1;
        for (int i15 = 0; i15 < i14; i15++) {
            Object obj = objArr[i13 + i15];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final Object[] eablkybsjg(Object[] objArr, int i13) {
        zdlpuopuiu.btonecajqb(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
        zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void gxszxtbevo(Object[] objArr, int i13) {
        zdlpuopuiu.btonecajqb(objArr, "<this>");
        objArr[i13] = null;
    }

    public static final void lqeggnwhkg(Object[] objArr, int i13, int i14) {
        zdlpuopuiu.btonecajqb(objArr, "<this>");
        while (i13 < i14) {
            gxszxtbevo(objArr, i13);
            i13++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nufgyqmvbu(Object[] objArr, int i13, int i14, List list) {
        if (i14 != list.size()) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (!zdlpuopuiu.eablkybsjg(objArr[i13 + i15], list.get(i15))) {
                return false;
            }
        }
        return true;
    }

    public static final Object[] wkgbmnqykc(int i13) {
        if (i13 >= 0) {
            return new Object[i13];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
