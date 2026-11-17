package fmlbqenlif;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final wkgbmnqykc f34415iobyxmoadg = new wkgbmnqykc();

    private wkgbmnqykc() {
    }

    public static final void iobyxmoadg(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException("index: " + i13 + ", size: " + i14);
        }
    }

    public static final void ppxfxbqfkf(int i13, int i14, int i15) {
        if (i13 < 0 || i14 > i15) {
            throw new IndexOutOfBoundsException("fromIndex: " + i13 + ", toIndex: " + i14 + ", size: " + i15);
        }
        if (i13 <= i14) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i13 + " > toIndex: " + i14);
    }

    public static final void zoijcleaow(int i13, int i14) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException("index: " + i13 + ", size: " + i14);
        }
    }
}
