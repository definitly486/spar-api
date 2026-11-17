package we;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f119443eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private gtknphoqwx f119444gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119445iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f119446lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final StringBuilder f119447ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f119448wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private draadjrbmk f119449zoijcleaow;

    nufgyqmvbu(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb3 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i13 = 0; i13 < length; i13++) {
            char c13 = (char) (bytes[i13] & 255);
            if (c13 == '?' && str.charAt(i13) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb3.append(c13);
        }
        this.f119445iobyxmoadg = sb3.toString();
        this.f119449zoijcleaow = draadjrbmk.FORCE_NONE;
        this.f119447ppxfxbqfkf = new StringBuilder(str.length());
        this.f119443eablkybsjg = -1;
    }

    private int nufgyqmvbu() {
        return this.f119445iobyxmoadg.length() - this.f119446lqeggnwhkg;
    }

    public void agtfadlqog(draadjrbmk draadjrbmkVar) {
        this.f119449zoijcleaow = draadjrbmkVar;
    }

    public void btonecajqb() {
        this.f119443eablkybsjg = -1;
    }

    public void draadjrbmk(com.google.zxing.zoijcleaow zoijcleaowVar, com.google.zxing.zoijcleaow zoijcleaowVar2) {
    }

    public boolean dxjokdxxww() {
        return this.f119448wkgbmnqykc < nufgyqmvbu();
    }

    public int eablkybsjg() {
        return this.f119443eablkybsjg;
    }

    public void gtknphoqwx() {
        this.f119444gxszxtbevo = null;
    }

    public int gxszxtbevo() {
        return nufgyqmvbu() - this.f119448wkgbmnqykc;
    }

    public int iobyxmoadg() {
        return this.f119447ppxfxbqfkf.length();
    }

    public void kcexrzcfyt(String str) {
        this.f119447ppxfxbqfkf.append(str);
    }

    public gtknphoqwx lqeggnwhkg() {
        return this.f119444gxszxtbevo;
    }

    public void ojitshcjhn(int i13) {
        this.f119443eablkybsjg = i13;
    }

    public void oxmwwwfdhm(char c13) {
        this.f119447ppxfxbqfkf.append(c13);
    }

    public char ppxfxbqfkf() {
        return this.f119445iobyxmoadg.charAt(this.f119448wkgbmnqykc);
    }

    public void rgvfuqvkyq() {
        vdvldrhtss(iobyxmoadg());
    }

    public void vdvldrhtss(int i13) {
        gtknphoqwx gtknphoqwxVar = this.f119444gxszxtbevo;
        if (gtknphoqwxVar == null || i13 > gtknphoqwxVar.iobyxmoadg()) {
            this.f119444gxszxtbevo = gtknphoqwx.draadjrbmk(i13, this.f119449zoijcleaow, null, null, true);
        }
    }

    public void wflxmlrfwp(int i13) {
        this.f119446lqeggnwhkg = i13;
    }

    public String wkgbmnqykc() {
        return this.f119445iobyxmoadg;
    }

    public StringBuilder zoijcleaow() {
        return this.f119447ppxfxbqfkf;
    }
}
