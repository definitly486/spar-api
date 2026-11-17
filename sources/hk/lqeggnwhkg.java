package hk;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final lqeggnwhkg f40531iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final byte[] f40532ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final char[] f40533zoijcleaow;

    static {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        f40531iobyxmoadg = lqeggnwhkgVar;
        f40533zoijcleaow = new char[117];
        f40532ppxfxbqfkf = new byte[126];
        lqeggnwhkgVar.gxszxtbevo();
        lqeggnwhkgVar.eablkybsjg();
    }

    private lqeggnwhkg() {
    }

    private final void eablkybsjg() {
        for (int i13 = 0; i13 < 33; i13++) {
            wkgbmnqykc(i13, (byte) 127);
        }
        wkgbmnqykc(9, (byte) 3);
        wkgbmnqykc(10, (byte) 3);
        wkgbmnqykc(13, (byte) 3);
        wkgbmnqykc(32, (byte) 3);
        ppxfxbqfkf(',', (byte) 4);
        ppxfxbqfkf(':', (byte) 5);
        ppxfxbqfkf('{', (byte) 6);
        ppxfxbqfkf('}', (byte) 7);
        ppxfxbqfkf('[', (byte) 8);
        ppxfxbqfkf(']', (byte) 9);
        ppxfxbqfkf('\"', (byte) 1);
        ppxfxbqfkf('\\', (byte) 2);
    }

    private final void gxszxtbevo() {
        for (int i13 = 0; i13 < 32; i13++) {
            zoijcleaow(i13, 'u');
        }
        zoijcleaow(8, 'b');
        zoijcleaow(9, 't');
        zoijcleaow(10, 'n');
        zoijcleaow(12, 'f');
        zoijcleaow(13, 'r');
        iobyxmoadg('/', '/');
        iobyxmoadg('\"', '\"');
        iobyxmoadg('\\', '\\');
    }

    private final void iobyxmoadg(char c13, char c14) {
        zoijcleaow(c13, c14);
    }

    private final void ppxfxbqfkf(char c13, byte b13) {
        wkgbmnqykc(c13, b13);
    }

    private final void wkgbmnqykc(int i13, byte b13) {
        f40532ppxfxbqfkf[i13] = b13;
    }

    private final void zoijcleaow(int i13, char c13) {
        if (c13 != 'u') {
            f40533zoijcleaow[c13] = (char) i13;
        }
    }
}
