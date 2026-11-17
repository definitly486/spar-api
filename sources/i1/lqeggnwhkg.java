package i1;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
abstract class lqeggnwhkg {
    public static int[] iobyxmoadg(int[] iArr, int i13, int i14) {
        if (i13 + 1 > iArr.length) {
            int[] iArr2 = new int[ppxfxbqfkf(i13)];
            System.arraycopy(iArr, 0, iArr2, 0, i13);
            iArr = iArr2;
        }
        iArr[i13] = i14;
        return iArr;
    }

    public static int ppxfxbqfkf(int i13) {
        if (i13 <= 4) {
            return 8;
        }
        return i13 * 2;
    }

    public static Object[] zoijcleaow(Object[] objArr, int i13, Object obj) {
        if (i13 + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), ppxfxbqfkf(i13));
            System.arraycopy(objArr, 0, objArr2, 0, i13);
            objArr = objArr2;
        }
        objArr[i13] = obj;
        return objArr;
    }
}
