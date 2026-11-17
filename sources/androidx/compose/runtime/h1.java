package androidx.compose.runtime;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {
    public static final boolean btonecajqb(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    public static final Object dxjokdxxww(ArrayList arrayList) {
        return arrayList.remove(wkgbmnqykc(arrayList) - 1);
    }

    public static final boolean eablkybsjg(ArrayList arrayList) {
        return arrayList.isEmpty();
    }

    public static final Object[] gtknphoqwx(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = arrayList.get(i13);
        }
        return objArr;
    }

    public static final boolean gxszxtbevo(ArrayList arrayList) {
        return !eablkybsjg(arrayList);
    }

    public static final void iobyxmoadg(ArrayList arrayList) {
        arrayList.clear();
    }

    public static final Object lqeggnwhkg(ArrayList arrayList) {
        return arrayList.get(wkgbmnqykc(arrayList) - 1);
    }

    public static final Object nufgyqmvbu(ArrayList arrayList, int i13) {
        return arrayList.get(i13);
    }

    public static /* synthetic */ ArrayList ppxfxbqfkf(ArrayList arrayList, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return zoijcleaow(arrayList);
    }

    public static final int wkgbmnqykc(ArrayList arrayList) {
        return arrayList.size();
    }

    public static ArrayList zoijcleaow(ArrayList arrayList) {
        return arrayList;
    }
}
