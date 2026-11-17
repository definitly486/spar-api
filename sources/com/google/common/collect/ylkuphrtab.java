package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ylkuphrtab {
    static Object iobyxmoadg(Object obj, int i13) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i13);
    }

    static Object[] ppxfxbqfkf(Object[] objArr, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            iobyxmoadg(objArr[i14], i14);
        }
        return objArr;
    }

    public static Object[] wkgbmnqykc(Object[] objArr, int i13) {
        return hcddaimhww.zoijcleaow(objArr, i13);
    }

    static Object[] zoijcleaow(Object... objArr) {
        ppxfxbqfkf(objArr, objArr.length);
        return objArr;
    }
}
