package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class hcddaimhww {
    static Object[] iobyxmoadg(Object[] objArr, int i13, int i14, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i13, i14, objArr2.getClass());
    }

    static Map ppxfxbqfkf(int i13) {
        return btonecajqb.ylkuphrtab(i13);
    }

    static Object[] zoijcleaow(Object[] objArr, int i13) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i13);
    }
}
