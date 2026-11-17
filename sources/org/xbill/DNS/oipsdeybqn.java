package org.xbill.DNS;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class oipsdeybqn {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private String f74483eablkybsjg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f74486lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f74487ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f74488wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HashMap f74485iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final HashMap f74489zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f74484gxszxtbevo = Integer.MAX_VALUE;

    public oipsdeybqn(String str, int i13) {
        this.f74487ppxfxbqfkf = str;
        this.f74488wkgbmnqykc = i13;
    }

    private String eablkybsjg(String str) {
        int i13 = this.f74488wkgbmnqykc;
        if (i13 == 2) {
            return str.toUpperCase();
        }
        return i13 == 3 ? str.toLowerCase() : str;
    }

    public void gxszxtbevo(int i13) {
        this.f74484gxszxtbevo = i13;
    }

    public void iobyxmoadg(int i13, String str) {
        ppxfxbqfkf(i13);
        String strEablkybsjg = eablkybsjg(str);
        this.f74485iobyxmoadg.put(strEablkybsjg, Integer.valueOf(i13));
        this.f74489zoijcleaow.put(Integer.valueOf(i13), strEablkybsjg);
    }

    public void lqeggnwhkg(boolean z13) {
        this.f74486lqeggnwhkg = z13;
    }

    public void nufgyqmvbu(String str) {
        this.f74483eablkybsjg = eablkybsjg(str);
    }

    public void ppxfxbqfkf(int i13) {
        if (i13 < 0 || i13 > this.f74484gxszxtbevo) {
            throw new IllegalArgumentException(this.f74487ppxfxbqfkf + " " + i13 + " is out of range");
        }
    }

    public String wkgbmnqykc(int i13) {
        ppxfxbqfkf(i13);
        String str = (String) this.f74489zoijcleaow.get(Integer.valueOf(i13));
        if (str != null) {
            return str;
        }
        String string = Integer.toString(i13);
        if (this.f74483eablkybsjg == null) {
            return string;
        }
        return this.f74483eablkybsjg + string;
    }

    public void zoijcleaow(int i13, String str) {
        ppxfxbqfkf(i13);
        this.f74485iobyxmoadg.put(eablkybsjg(str), Integer.valueOf(i13));
    }
}
