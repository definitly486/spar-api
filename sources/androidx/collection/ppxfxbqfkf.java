package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
abstract class ppxfxbqfkf {
    static Object[] iobyxmoadg(Object[] objArr, int i13) {
        if (objArr.length < i13) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }
}
