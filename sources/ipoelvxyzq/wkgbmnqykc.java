package ipoelvxyzq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    private static final void eablkybsjg(int i13, int i14) {
        throw new IndexOutOfBoundsException("toIndex (" + i13 + ") is more than than the list size (" + i14 + ')');
    }

    private static final void gxszxtbevo(int i13, int i14) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i13 + ") is greater than toIndex (" + i14 + ").");
    }

    public static final void iobyxmoadg(List list, int i13) {
        int size = list.size();
        if (i13 < 0 || i13 >= size) {
            ppxfxbqfkf(i13, size);
        }
    }

    private static final void ppxfxbqfkf(int i13, int i14) {
        throw new IndexOutOfBoundsException("Index " + i13 + " is out of bounds. The list has " + i14 + " elements.");
    }

    private static final void wkgbmnqykc(int i13) {
        throw new IndexOutOfBoundsException("fromIndex (" + i13 + ") is less than 0.");
    }

    public static final void zoijcleaow(List list, int i13, int i14) {
        if (i13 > i14) {
            gxszxtbevo(i13, i14);
        }
        if (i13 < 0) {
            wkgbmnqykc(i13);
        }
        if (i14 > list.size()) {
            eablkybsjg(i14, list.size());
        }
    }
}
