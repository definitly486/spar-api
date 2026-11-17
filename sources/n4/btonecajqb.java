package n4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import t3.zynmafqrjb;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
abstract class btonecajqb {
    private static h4.agtfadlqog btonecajqb(yadqdtsiqt yadqdtsiqtVar) {
        String strIobyxmoadg = h4.btonecajqb.iobyxmoadg(gxszxtbevo(yadqdtsiqtVar) - 1);
        if (strIobyxmoadg != null) {
            return new h4.agtfadlqog("TCON", null, com.google.common.collect.zdlpuopuiu.istkbnxepw(strIobyxmoadg));
        }
        y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static void draadjrbmk(int i13, zynmafqrjb zynmafqrjbVar, androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        if (i13 == 1 && zynmafqrjbVar.iobyxmoadg()) {
            zoijcleaowVar.ribwqtqdhb(zynmafqrjbVar.f109586iobyxmoadg).vipkmwdibw(zynmafqrjbVar.f109587zoijcleaow);
        }
    }

    public static z2.iobyxmoadg dxjokdxxww(yadqdtsiqt yadqdtsiqtVar, int i13, String str) {
        while (true) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            if (iGxszxtbevo >= i13) {
                return null;
            }
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (yadqdtsiqtVar.vdvldrhtss() == 1684108385) {
                int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
                int iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
                int i14 = iVdvldrhtss - 16;
                byte[] bArr = new byte[i14];
                yadqdtsiqtVar.draadjrbmk(bArr, 0, i14);
                return new z2.iobyxmoadg(str, bArr, iVdvldrhtss3, iVdvldrhtss2);
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + iVdvldrhtss);
        }
    }

    private static h4.agtfadlqog eablkybsjg(int i13, String str, yadqdtsiqt yadqdtsiqtVar) {
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (yadqdtsiqtVar.vdvldrhtss() == 1684108385 && iVdvldrhtss >= 22) {
            yadqdtsiqtVar.crxdokpmqz(10);
            int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
            if (iWypolnanlu > 0) {
                String str2 = "" + iWypolnanlu;
                int iWypolnanlu2 = yadqdtsiqtVar.wypolnanlu();
                if (iWypolnanlu2 > 0) {
                    str2 = str2 + CardDateFormatTextWatcher.DIVIDER_CHARACTER + iWypolnanlu2;
                }
                return new h4.agtfadlqog(str, null, com.google.common.collect.zdlpuopuiu.istkbnxepw(str2));
            }
        }
        y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Failed to parse index/count attribute: " + z2.ppxfxbqfkf.iobyxmoadg(i13));
        return null;
    }

    private static h4.agtfadlqog gtknphoqwx(int i13, String str, yadqdtsiqt yadqdtsiqtVar) {
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (yadqdtsiqtVar.vdvldrhtss() == 1684108385) {
            yadqdtsiqtVar.crxdokpmqz(8);
            return new h4.agtfadlqog(str, null, com.google.common.collect.zdlpuopuiu.istkbnxepw(yadqdtsiqtVar.istkbnxepw(iVdvldrhtss - 16)));
        }
        y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Failed to parse text attribute: " + z2.ppxfxbqfkf.iobyxmoadg(i13));
        return null;
    }

    private static int gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (yadqdtsiqtVar.vdvldrhtss() == 1684108385) {
            yadqdtsiqtVar.crxdokpmqz(8);
            int i13 = iVdvldrhtss - 16;
            if (i13 == 1) {
                return yadqdtsiqtVar.wwaezpbzkn();
            }
            if (i13 == 2) {
                return yadqdtsiqtVar.wypolnanlu();
            }
            if (i13 == 3) {
                return yadqdtsiqtVar.hcddaimhww();
            }
            if (i13 == 4 && (yadqdtsiqtVar.btonecajqb() & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return yadqdtsiqtVar.jpowsppfya();
            }
        }
        y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static z2.iobyxmoadg iobyxmoadg(v2.jyumaefscl jyumaefsclVar, String str) {
        for (int i13 = 0; i13 < jyumaefsclVar.eablkybsjg(); i13++) {
            v2.jyumaefscl.iobyxmoadg iobyxmoadgVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc(i13);
            if (iobyxmoadgVarWkgbmnqykc instanceof z2.iobyxmoadg) {
                z2.iobyxmoadg iobyxmoadgVar = (z2.iobyxmoadg) iobyxmoadgVarWkgbmnqykc;
                if (iobyxmoadgVar.f127690iobyxmoadg.equals(str)) {
                    return iobyxmoadgVar;
                }
            }
        }
        return null;
    }

    private static h4.dxjokdxxww lqeggnwhkg(int i13, String str, yadqdtsiqt yadqdtsiqtVar, boolean z13, boolean z14) {
        int iGxszxtbevo = gxszxtbevo(yadqdtsiqtVar);
        if (z14) {
            iGxszxtbevo = Math.min(1, iGxszxtbevo);
        }
        if (iGxszxtbevo >= 0) {
            return z13 ? new h4.agtfadlqog(str, null, com.google.common.collect.zdlpuopuiu.istkbnxepw(Integer.toString(iGxszxtbevo))) : new h4.eablkybsjg("und", str, Integer.toString(iGxszxtbevo));
        }
        y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Failed to parse uint8 attribute: " + z2.ppxfxbqfkf.iobyxmoadg(i13));
        return null;
    }

    private static h4.dxjokdxxww nufgyqmvbu(yadqdtsiqt yadqdtsiqtVar, int i13) {
        String strIstkbnxepw = null;
        String strIstkbnxepw2 = null;
        int i14 = -1;
        int i15 = -1;
        while (yadqdtsiqtVar.gxszxtbevo() < i13) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            yadqdtsiqtVar.crxdokpmqz(4);
            if (iVdvldrhtss2 == 1835360622) {
                strIstkbnxepw = yadqdtsiqtVar.istkbnxepw(iVdvldrhtss - 12);
            } else if (iVdvldrhtss2 == 1851878757) {
                strIstkbnxepw2 = yadqdtsiqtVar.istkbnxepw(iVdvldrhtss - 12);
            } else {
                if (iVdvldrhtss2 == 1684108385) {
                    i14 = iGxszxtbevo;
                    i15 = iVdvldrhtss;
                }
                yadqdtsiqtVar.crxdokpmqz(iVdvldrhtss - 12);
            }
        }
        if (strIstkbnxepw == null || strIstkbnxepw2 == null || i14 == -1) {
            return null;
        }
        yadqdtsiqtVar.sopmlzcsov(i14);
        yadqdtsiqtVar.crxdokpmqz(16);
        return new h4.gtknphoqwx(strIstkbnxepw, strIstkbnxepw2, yadqdtsiqtVar.istkbnxepw(i15 - 16));
    }

    private static h4.iobyxmoadg ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
        String str;
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (yadqdtsiqtVar.vdvldrhtss() != 1684108385) {
            y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iOjitshcjhn = zoijcleaow.ojitshcjhn(yadqdtsiqtVar.vdvldrhtss());
        if (iOjitshcjhn == 13) {
            str = "image/jpeg";
        } else {
            str = iOjitshcjhn == 14 ? "image/png" : null;
        }
        if (str == null) {
            y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Unrecognized cover art flags: " + iOjitshcjhn);
            return null;
        }
        yadqdtsiqtVar.crxdokpmqz(4);
        int i13 = iVdvldrhtss - 16;
        byte[] bArr = new byte[i13];
        yadqdtsiqtVar.draadjrbmk(bArr, 0, i13);
        return new h4.iobyxmoadg(str, null, 3, bArr);
    }

    public static void wflxmlrfwp(int i13, v2.jyumaefscl jyumaefsclVar, androidx.media3.common.iobyxmoadg.zoijcleaow zoijcleaowVar, v2.jyumaefscl jyumaefsclVar2, v2.jyumaefscl... jyumaefsclVarArr) {
        if (jyumaefsclVar2 == null) {
            jyumaefsclVar2 = new v2.jyumaefscl(new v2.jyumaefscl.iobyxmoadg[0]);
        }
        if (jyumaefsclVar != null) {
            for (int i14 = 0; i14 < jyumaefsclVar.eablkybsjg(); i14++) {
                v2.jyumaefscl.iobyxmoadg iobyxmoadgVarWkgbmnqykc = jyumaefsclVar.wkgbmnqykc(i14);
                if (iobyxmoadgVarWkgbmnqykc instanceof z2.iobyxmoadg) {
                    z2.iobyxmoadg iobyxmoadgVar = (z2.iobyxmoadg) iobyxmoadgVarWkgbmnqykc;
                    if (!iobyxmoadgVar.f127690iobyxmoadg.equals("com.android.capture.fps")) {
                        jyumaefsclVar2 = jyumaefsclVar2.iobyxmoadg(iobyxmoadgVar);
                    } else if (i13 == 2) {
                        jyumaefsclVar2 = jyumaefsclVar2.iobyxmoadg(iobyxmoadgVar);
                    }
                }
            }
        }
        for (v2.jyumaefscl jyumaefsclVar3 : jyumaefsclVarArr) {
            jyumaefsclVar2 = jyumaefsclVar2.zoijcleaow(jyumaefsclVar3);
        }
        if (jyumaefsclVar2.eablkybsjg() > 0) {
            zoijcleaowVar.zfvoamnweg(jyumaefsclVar2);
        }
    }

    public static v2.jyumaefscl.iobyxmoadg wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo() + yadqdtsiqtVar.vdvldrhtss();
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        int i13 = (iVdvldrhtss >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        try {
            if (i13 == 169 || i13 == 253) {
                int i14 = 16777215 & iVdvldrhtss;
                if (i14 == 6516084) {
                    h4.eablkybsjg eablkybsjgVarZoijcleaow = zoijcleaow(iVdvldrhtss, yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return eablkybsjgVarZoijcleaow;
                }
                if (i14 == 7233901 || i14 == 7631467) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx = gtknphoqwx(iVdvldrhtss, "TIT2", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx;
                }
                if (i14 == 6516589 || i14 == 7828084) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx2 = gtknphoqwx(iVdvldrhtss, "TCOM", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx2;
                }
                if (i14 == 6578553) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx3 = gtknphoqwx(iVdvldrhtss, "TDRC", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx3;
                }
                if (i14 == 4280916) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx4 = gtknphoqwx(iVdvldrhtss, "TPE1", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx4;
                }
                if (i14 == 7630703) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx5 = gtknphoqwx(iVdvldrhtss, "TSSE", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx5;
                }
                if (i14 == 6384738) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx6 = gtknphoqwx(iVdvldrhtss, "TALB", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx6;
                }
                if (i14 == 7108978) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx7 = gtknphoqwx(iVdvldrhtss, "USLT", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx7;
                }
                if (i14 == 6776174) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx8 = gtknphoqwx(iVdvldrhtss, "TCON", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx8;
                }
                if (i14 == 6779504) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx9 = gtknphoqwx(iVdvldrhtss, "TIT1", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx9;
                }
            } else {
                if (iVdvldrhtss == 1735291493) {
                    h4.agtfadlqog agtfadlqogVarBtonecajqb = btonecajqb(yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarBtonecajqb;
                }
                if (iVdvldrhtss == 1684632427) {
                    h4.agtfadlqog agtfadlqogVarEablkybsjg = eablkybsjg(iVdvldrhtss, "TPOS", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarEablkybsjg;
                }
                if (iVdvldrhtss == 1953655662) {
                    h4.agtfadlqog agtfadlqogVarEablkybsjg2 = eablkybsjg(iVdvldrhtss, "TRCK", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarEablkybsjg2;
                }
                if (iVdvldrhtss == 1953329263) {
                    h4.dxjokdxxww dxjokdxxwwVarLqeggnwhkg = lqeggnwhkg(iVdvldrhtss, "TBPM", yadqdtsiqtVar, true, false);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return dxjokdxxwwVarLqeggnwhkg;
                }
                if (iVdvldrhtss == 1668311404) {
                    h4.dxjokdxxww dxjokdxxwwVarLqeggnwhkg2 = lqeggnwhkg(iVdvldrhtss, "TCMP", yadqdtsiqtVar, true, true);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return dxjokdxxwwVarLqeggnwhkg2;
                }
                if (iVdvldrhtss == 1668249202) {
                    h4.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return iobyxmoadgVarPpxfxbqfkf;
                }
                if (iVdvldrhtss == 1631670868) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx10 = gtknphoqwx(iVdvldrhtss, "TPE2", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx10;
                }
                if (iVdvldrhtss == 1936682605) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx11 = gtknphoqwx(iVdvldrhtss, "TSOT", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx11;
                }
                if (iVdvldrhtss == 1936679276) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx12 = gtknphoqwx(iVdvldrhtss, "TSOA", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx12;
                }
                if (iVdvldrhtss == 1936679282) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx13 = gtknphoqwx(iVdvldrhtss, "TSOP", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx13;
                }
                if (iVdvldrhtss == 1936679265) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx14 = gtknphoqwx(iVdvldrhtss, "TSO2", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx14;
                }
                if (iVdvldrhtss == 1936679791) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx15 = gtknphoqwx(iVdvldrhtss, "TSOC", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx15;
                }
                if (iVdvldrhtss == 1920233063) {
                    h4.dxjokdxxww dxjokdxxwwVarLqeggnwhkg3 = lqeggnwhkg(iVdvldrhtss, "ITUNESADVISORY", yadqdtsiqtVar, false, false);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return dxjokdxxwwVarLqeggnwhkg3;
                }
                if (iVdvldrhtss == 1885823344) {
                    h4.dxjokdxxww dxjokdxxwwVarLqeggnwhkg4 = lqeggnwhkg(iVdvldrhtss, "ITUNESGAPLESS", yadqdtsiqtVar, false, true);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return dxjokdxxwwVarLqeggnwhkg4;
                }
                if (iVdvldrhtss == 1936683886) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx16 = gtknphoqwx(iVdvldrhtss, "TVSHOWSORT", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx16;
                }
                if (iVdvldrhtss == 1953919848) {
                    h4.agtfadlqog agtfadlqogVarGtknphoqwx17 = gtknphoqwx(iVdvldrhtss, "TVSHOW", yadqdtsiqtVar);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return agtfadlqogVarGtknphoqwx17;
                }
                if (iVdvldrhtss == 757935405) {
                    h4.dxjokdxxww dxjokdxxwwVarNufgyqmvbu = nufgyqmvbu(yadqdtsiqtVar, iGxszxtbevo);
                    yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                    return dxjokdxxwwVarNufgyqmvbu;
                }
            }
            y2.kcexrzcfyt.zoijcleaow("MetadataUtil", "Skipped unknown metadata entry: " + z2.ppxfxbqfkf.iobyxmoadg(iVdvldrhtss));
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            return null;
        } catch (Throwable th2) {
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            throw th2;
        }
    }

    private static h4.eablkybsjg zoijcleaow(int i13, yadqdtsiqt yadqdtsiqtVar) {
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (yadqdtsiqtVar.vdvldrhtss() == 1684108385) {
            yadqdtsiqtVar.crxdokpmqz(8);
            String strIstkbnxepw = yadqdtsiqtVar.istkbnxepw(iVdvldrhtss - 16);
            return new h4.eablkybsjg("und", strIstkbnxepw, strIstkbnxepw);
        }
        y2.kcexrzcfyt.nufgyqmvbu("MetadataUtil", "Failed to parse comment attribute: " + z2.ppxfxbqfkf.iobyxmoadg(i13));
        return null;
    }
}
