package mk;

import io.appmetrica.analytics.BuildConfig;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.yggfygwlhe;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    public static final String btonecajqb(lk.wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        String strIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
        if (strIobyxmoadg != null) {
            return strIobyxmoadg;
        }
        StringBuilder sb3 = new StringBuilder();
        if (wkgbmnqykcVar.dxjokdxxww()) {
            sb3.append("no-cache, ");
        }
        if (wkgbmnqykcVar.btonecajqb()) {
            sb3.append("no-store, ");
        }
        if (wkgbmnqykcVar.eablkybsjg() != -1) {
            sb3.append("max-age=");
            sb3.append(wkgbmnqykcVar.eablkybsjg());
            sb3.append(", ");
        }
        if (wkgbmnqykcVar.wflxmlrfwp() != -1) {
            sb3.append("s-maxage=");
            sb3.append(wkgbmnqykcVar.wflxmlrfwp());
            sb3.append(", ");
        }
        if (wkgbmnqykcVar.ppxfxbqfkf()) {
            sb3.append("private, ");
        }
        if (wkgbmnqykcVar.wkgbmnqykc()) {
            sb3.append("public, ");
        }
        if (wkgbmnqykcVar.nufgyqmvbu()) {
            sb3.append("must-revalidate, ");
        }
        if (wkgbmnqykcVar.gxszxtbevo() != -1) {
            sb3.append("max-stale=");
            sb3.append(wkgbmnqykcVar.gxszxtbevo());
            sb3.append(", ");
        }
        if (wkgbmnqykcVar.lqeggnwhkg() != -1) {
            sb3.append("min-fresh=");
            sb3.append(wkgbmnqykcVar.lqeggnwhkg());
            sb3.append(", ");
        }
        if (wkgbmnqykcVar.draadjrbmk()) {
            sb3.append("only-if-cached, ");
        }
        if (wkgbmnqykcVar.gtknphoqwx()) {
            sb3.append("no-transform, ");
        }
        if (wkgbmnqykcVar.zoijcleaow()) {
            sb3.append("immutable, ");
        }
        if (sb3.length() == 0) {
            return "";
        }
        zdlpuopuiu.dxjokdxxww(sb3.delete(sb3.length() - 2, sb3.length()), "this.delete(startIndex, endIndex)");
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        wkgbmnqykcVar.agtfadlqog(string);
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x016c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    public static final lk.wkgbmnqykc dxjokdxxww(lk.wkgbmnqykc.zoijcleaow zoijcleaowVar, yggfygwlhe yggfygwlheVar) {
        int iGtknphoqwx;
        int iGtknphoqwx2;
        String string;
        int i13;
        String string2;
        yggfygwlhe headers = yggfygwlheVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        zdlpuopuiu.btonecajqb(headers, "headers");
        int size = yggfygwlheVar.size();
        boolean z13 = true;
        boolean z14 = true;
        int i14 = 0;
        String str = null;
        boolean z15 = false;
        boolean z16 = false;
        int iYadqdtsiqt = -1;
        int iYadqdtsiqt2 = -1;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        int iYadqdtsiqt3 = -1;
        int iYadqdtsiqt4 = -1;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        while (i14 < size) {
            String strWkgbmnqykc = headers.wkgbmnqykc(i14);
            String strBtonecajqb = headers.btonecajqb(i14);
            if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Cache-Control", z13)) {
                if (str == null) {
                    str = strBtonecajqb;
                }
                iGtknphoqwx = 0;
                while (iGtknphoqwx < strBtonecajqb.length()) {
                    iGtknphoqwx2 = gtknphoqwx(strBtonecajqb, "=,;", iGtknphoqwx);
                    String strSubstring = strBtonecajqb.substring(iGtknphoqwx, iGtknphoqwx2);
                    zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = kcexrzcfyt.p(strSubstring).toString();
                    if (iGtknphoqwx2 != strBtonecajqb.length()) {
                        i13 = size;
                        if (strBtonecajqb.charAt(iGtknphoqwx2) == ',' && strBtonecajqb.charAt(iGtknphoqwx2) != ';') {
                            int iJyumaefscl = wflxmlrfwp.jyumaefscl(strBtonecajqb, iGtknphoqwx2 + 1);
                            if (iJyumaefscl >= strBtonecajqb.length() || strBtonecajqb.charAt(iJyumaefscl) != '\"') {
                                iGtknphoqwx = gtknphoqwx(strBtonecajqb, ",;", iJyumaefscl);
                                String strSubstring2 = strBtonecajqb.substring(iJyumaefscl, iGtknphoqwx);
                                zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = kcexrzcfyt.p(strSubstring2).toString();
                            } else {
                                int i15 = iJyumaefscl + 1;
                                int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(strBtonecajqb, '\"', i15, false, 4, null);
                                string2 = strBtonecajqb.substring(i15, iYfnezrywwk);
                                zdlpuopuiu.dxjokdxxww(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                iGtknphoqwx = iYfnezrywwk + 1;
                            }
                        }
                        z13 = true;
                        if (kcexrzcfyt.istkbnxepw("no-cache", string, true)) {
                            z15 = true;
                        } else if (kcexrzcfyt.istkbnxepw("no-store", string, true)) {
                            z16 = true;
                        } else if (kcexrzcfyt.istkbnxepw("max-age", string, true)) {
                            iYadqdtsiqt = wflxmlrfwp.yadqdtsiqt(string2, -1);
                        } else if (kcexrzcfyt.istkbnxepw("s-maxage", string, true)) {
                            iYadqdtsiqt2 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                        } else if (kcexrzcfyt.istkbnxepw("private", string, true)) {
                            z17 = true;
                        } else if (kcexrzcfyt.istkbnxepw(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                            z18 = true;
                        } else if (kcexrzcfyt.istkbnxepw("must-revalidate", string, true)) {
                            z19 = true;
                        } else if (kcexrzcfyt.istkbnxepw("max-stale", string, true)) {
                            iYadqdtsiqt3 = wflxmlrfwp.yadqdtsiqt(string2, Integer.MAX_VALUE);
                        } else if (kcexrzcfyt.istkbnxepw("min-fresh", string, true)) {
                            iYadqdtsiqt4 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                        } else if (kcexrzcfyt.istkbnxepw("only-if-cached", string, true)) {
                            z23 = true;
                        } else if (kcexrzcfyt.istkbnxepw("no-transform", string, true)) {
                            z24 = true;
                        } else if (kcexrzcfyt.istkbnxepw("immutable", string, true)) {
                            z25 = true;
                        }
                        size = i13;
                    } else {
                        i13 = size;
                    }
                    iGtknphoqwx = iGtknphoqwx2 + 1;
                    string2 = null;
                    z13 = true;
                    if (kcexrzcfyt.istkbnxepw("no-cache", string, true)) {
                        z15 = true;
                    } else if (kcexrzcfyt.istkbnxepw("no-store", string, true)) {
                        z16 = true;
                    } else if (kcexrzcfyt.istkbnxepw("max-age", string, true)) {
                        iYadqdtsiqt = wflxmlrfwp.yadqdtsiqt(string2, -1);
                    } else if (kcexrzcfyt.istkbnxepw("s-maxage", string, true)) {
                        iYadqdtsiqt2 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                    } else if (kcexrzcfyt.istkbnxepw("private", string, true)) {
                        z17 = true;
                    } else if (kcexrzcfyt.istkbnxepw(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                        z18 = true;
                    } else if (kcexrzcfyt.istkbnxepw("must-revalidate", string, true)) {
                        z19 = true;
                    } else if (kcexrzcfyt.istkbnxepw("max-stale", string, true)) {
                        iYadqdtsiqt3 = wflxmlrfwp.yadqdtsiqt(string2, Integer.MAX_VALUE);
                    } else if (kcexrzcfyt.istkbnxepw("min-fresh", string, true)) {
                        iYadqdtsiqt4 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                    } else if (kcexrzcfyt.istkbnxepw("only-if-cached", string, true)) {
                        z23 = true;
                    } else if (kcexrzcfyt.istkbnxepw("no-transform", string, true)) {
                        z24 = true;
                    } else if (kcexrzcfyt.istkbnxepw("immutable", string, true)) {
                        z25 = true;
                    }
                    size = i13;
                }
                i14++;
                headers = yggfygwlheVar;
                size = size;
            } else {
                if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Pragma", z13)) {
                }
                i14++;
                headers = yggfygwlheVar;
                size = size;
            }
            z14 = false;
            iGtknphoqwx = 0;
            while (iGtknphoqwx < strBtonecajqb.length()) {
                iGtknphoqwx2 = gtknphoqwx(strBtonecajqb, "=,;", iGtknphoqwx);
                String strSubstring3 = strBtonecajqb.substring(iGtknphoqwx, iGtknphoqwx2);
                zdlpuopuiu.dxjokdxxww(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                string = kcexrzcfyt.p(strSubstring3).toString();
                if (iGtknphoqwx2 != strBtonecajqb.length()) {
                    i13 = size;
                    if (strBtonecajqb.charAt(iGtknphoqwx2) == ',') {
                    }
                    z13 = true;
                    if (kcexrzcfyt.istkbnxepw("no-cache", string, true)) {
                        z15 = true;
                    } else if (kcexrzcfyt.istkbnxepw("no-store", string, true)) {
                        z16 = true;
                    } else if (kcexrzcfyt.istkbnxepw("max-age", string, true)) {
                        iYadqdtsiqt = wflxmlrfwp.yadqdtsiqt(string2, -1);
                    } else if (kcexrzcfyt.istkbnxepw("s-maxage", string, true)) {
                        iYadqdtsiqt2 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                    } else if (kcexrzcfyt.istkbnxepw("private", string, true)) {
                        z17 = true;
                    } else if (kcexrzcfyt.istkbnxepw(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                        z18 = true;
                    } else if (kcexrzcfyt.istkbnxepw("must-revalidate", string, true)) {
                        z19 = true;
                    } else if (kcexrzcfyt.istkbnxepw("max-stale", string, true)) {
                        iYadqdtsiqt3 = wflxmlrfwp.yadqdtsiqt(string2, Integer.MAX_VALUE);
                    } else if (kcexrzcfyt.istkbnxepw("min-fresh", string, true)) {
                        iYadqdtsiqt4 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                    } else if (kcexrzcfyt.istkbnxepw("only-if-cached", string, true)) {
                        z23 = true;
                    } else if (kcexrzcfyt.istkbnxepw("no-transform", string, true)) {
                        z24 = true;
                    } else if (kcexrzcfyt.istkbnxepw("immutable", string, true)) {
                        z25 = true;
                    }
                    size = i13;
                } else {
                    i13 = size;
                }
                iGtknphoqwx = iGtknphoqwx2 + 1;
                string2 = null;
                z13 = true;
                if (kcexrzcfyt.istkbnxepw("no-cache", string, true)) {
                    z15 = true;
                } else if (kcexrzcfyt.istkbnxepw("no-store", string, true)) {
                    z16 = true;
                } else if (kcexrzcfyt.istkbnxepw("max-age", string, true)) {
                    iYadqdtsiqt = wflxmlrfwp.yadqdtsiqt(string2, -1);
                } else if (kcexrzcfyt.istkbnxepw("s-maxage", string, true)) {
                    iYadqdtsiqt2 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                } else if (kcexrzcfyt.istkbnxepw("private", string, true)) {
                    z17 = true;
                } else if (kcexrzcfyt.istkbnxepw(BuildConfig.SDK_BUILD_FLAVOR, string, true)) {
                    z18 = true;
                } else if (kcexrzcfyt.istkbnxepw("must-revalidate", string, true)) {
                    z19 = true;
                } else if (kcexrzcfyt.istkbnxepw("max-stale", string, true)) {
                    iYadqdtsiqt3 = wflxmlrfwp.yadqdtsiqt(string2, Integer.MAX_VALUE);
                } else if (kcexrzcfyt.istkbnxepw("min-fresh", string, true)) {
                    iYadqdtsiqt4 = wflxmlrfwp.yadqdtsiqt(string2, -1);
                } else if (kcexrzcfyt.istkbnxepw("only-if-cached", string, true)) {
                    z23 = true;
                } else if (kcexrzcfyt.istkbnxepw("no-transform", string, true)) {
                    z24 = true;
                } else if (kcexrzcfyt.istkbnxepw("immutable", string, true)) {
                    z25 = true;
                }
                size = i13;
            }
            i14++;
            headers = yggfygwlheVar;
            size = size;
        }
        return new lk.wkgbmnqykc(z15, z16, iYadqdtsiqt, iYadqdtsiqt2, z17, z18, z19, iYadqdtsiqt3, iYadqdtsiqt4, z23, z24, z25, !z14 ? null : str);
    }

    public static final lk.wkgbmnqykc.iobyxmoadg eablkybsjg(lk.wkgbmnqykc.iobyxmoadg iobyxmoadgVar, int i13, nj.wkgbmnqykc timeUnit) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(timeUnit, "timeUnit");
        if (i13 >= 0) {
            iobyxmoadgVar.agtfadlqog(zoijcleaow(nj.iobyxmoadg.oxmwwwfdhm(nj.ppxfxbqfkf.kcexrzcfyt(i13, timeUnit))));
            return iobyxmoadgVar;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + i13).toString());
    }

    private static final int gtknphoqwx(String str, String str2, int i13) {
        int length = str.length();
        while (i13 < length) {
            if (kcexrzcfyt.ulzqkzuiru(str2, str.charAt(i13), false, 2, null)) {
                return i13;
            }
            i13++;
        }
        return str.length();
    }

    public static final lk.wkgbmnqykc.iobyxmoadg gxszxtbevo(lk.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        iobyxmoadgVar.ojitshcjhn(true);
        return iobyxmoadgVar;
    }

    public static final lk.wkgbmnqykc iobyxmoadg(lk.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return new lk.wkgbmnqykc(iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.lqeggnwhkg(), iobyxmoadgVar.ppxfxbqfkf(), -1, false, false, false, iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.dxjokdxxww(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.zoijcleaow(), null);
    }

    public static final lk.wkgbmnqykc.iobyxmoadg lqeggnwhkg(lk.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        iobyxmoadgVar.rgvfuqvkyq(true);
        return iobyxmoadgVar;
    }

    public static final lk.wkgbmnqykc.iobyxmoadg nufgyqmvbu(lk.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        iobyxmoadgVar.vdvldrhtss(true);
        return iobyxmoadgVar;
    }

    public static final lk.wkgbmnqykc ppxfxbqfkf(lk.wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        return new lk.wkgbmnqykc.iobyxmoadg().wflxmlrfwp().btonecajqb(Integer.MAX_VALUE, nj.wkgbmnqykc.SECONDS).iobyxmoadg();
    }

    public static final lk.wkgbmnqykc wkgbmnqykc(lk.wkgbmnqykc.zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        return new lk.wkgbmnqykc.iobyxmoadg().gtknphoqwx().iobyxmoadg();
    }

    public static final int zoijcleaow(long j13) {
        if (j13 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j13;
    }
}
