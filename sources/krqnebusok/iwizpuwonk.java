package krqnebusok;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {
    public static final jyumaefscl eablkybsjg(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return gxszxtbevo(str);
        } catch (kcexrzcfyt e13) {
            ezmngbhpjk.iwizpuwonk.iobyxmoadg(e13.getMessage(), e13);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0086 A[SYNTHETIC] */
    public static final jyumaefscl gxszxtbevo(String str) throws kcexrzcfyt {
        boolean z13;
        boolean z14;
        String str2;
        List listWflxmlrfwp;
        List listWflxmlrfwp2;
        String strGtknphoqwx;
        String str3;
        char cWkgbmnqykc;
        int i13;
        boolean z15;
        yggfygwlhe yggfygwlheVar = new yggfygwlhe(str);
        String strDraadjrbmk = null;
        if (yggfygwlheVar.nufgyqmvbu('C')) {
            yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
            if (yggfygwlheVar.nufgyqmvbu('C')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                z15 = true;
            } else {
                z15 = false;
            }
            if (yggfygwlheVar.nufgyqmvbu('(')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                String strGtknphoqwx2 = yggfygwlheVar.gtknphoqwx(")");
                yggfygwlheVar.eablkybsjg(')');
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                z14 = z15;
                str2 = strGtknphoqwx2;
                z13 = true;
            } else {
                z14 = z15;
                z13 = true;
            }
            listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
            while (iobyxmoadg(yggfygwlheVar)) {
                cWkgbmnqykc = yggfygwlheVar.wkgbmnqykc();
                if (cWkgbmnqykc != 'N') {
                    listWflxmlrfwp = wkgbmnqykc(yggfygwlheVar);
                } else if (cWkgbmnqykc != 'P') {
                    yggfygwlheVar.iobyxmoadg(2);
                    i13 = 0;
                    while (true) {
                        if (i13 > 0 && yggfygwlheVar.nufgyqmvbu(')')) {
                            yggfygwlheVar.eablkybsjg(')');
                            yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                            break;
                        }
                        if (!yggfygwlheVar.ppxfxbqfkf()) {
                            yggfygwlheVar.wflxmlrfwp("unexpected end");
                            throw new KotlinNothingValueException();
                        }
                        if (yggfygwlheVar.nufgyqmvbu('(')) {
                            i13++;
                        } else if (yggfygwlheVar.nufgyqmvbu(')')) {
                            i13--;
                        }
                        yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                    }
                } else {
                    listWflxmlrfwp = ppxfxbqfkf(yggfygwlheVar);
                }
            }
            listWflxmlrfwp2 = hg.jyumaefscl.wflxmlrfwp();
            if (yggfygwlheVar.nufgyqmvbu(':')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
            } else {
                listWflxmlrfwp2 = zoijcleaow(yggfygwlheVar);
            }
            List list = listWflxmlrfwp2;
            strGtknphoqwx = yggfygwlheVar.gtknphoqwx("#");
            if (strGtknphoqwx.length() > 0) {
                str3 = strGtknphoqwx;
            } else {
                str3 = null;
            }
            if (yggfygwlheVar.nufgyqmvbu('#')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                strDraadjrbmk = yggfygwlheVar.draadjrbmk();
            }
            return new jyumaefscl(z13, z14, str2, str3, listWflxmlrfwp, strDraadjrbmk, list, str);
        }
        z13 = false;
        z14 = false;
        str2 = null;
        listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        while (iobyxmoadg(yggfygwlheVar)) {
            cWkgbmnqykc = yggfygwlheVar.wkgbmnqykc();
            if (cWkgbmnqykc != 'N') {
                listWflxmlrfwp = wkgbmnqykc(yggfygwlheVar);
            } else if (cWkgbmnqykc != 'P') {
                yggfygwlheVar.iobyxmoadg(2);
                i13 = 0;
                while (true) {
                    if (i13 > 0) {
                    }
                    if (!yggfygwlheVar.ppxfxbqfkf()) {
                        yggfygwlheVar.wflxmlrfwp("unexpected end");
                        throw new KotlinNothingValueException();
                    }
                    if (yggfygwlheVar.nufgyqmvbu('(')) {
                        i13++;
                    } else if (yggfygwlheVar.nufgyqmvbu(')')) {
                        i13--;
                    }
                    yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                }
            } else {
                listWflxmlrfwp = ppxfxbqfkf(yggfygwlheVar);
            }
        }
        listWflxmlrfwp2 = hg.jyumaefscl.wflxmlrfwp();
        if (yggfygwlheVar.nufgyqmvbu(':')) {
            listWflxmlrfwp2 = zoijcleaow(yggfygwlheVar);
        } else {
            yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
        }
        List list2 = listWflxmlrfwp2;
        strGtknphoqwx = yggfygwlheVar.gtknphoqwx("#");
        if (strGtknphoqwx.length() > 0) {
            str3 = strGtknphoqwx;
        } else {
            str3 = null;
        }
        if (yggfygwlheVar.nufgyqmvbu('#')) {
            yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
            strDraadjrbmk = yggfygwlheVar.draadjrbmk();
        }
        return new jyumaefscl(z13, z14, str2, str3, listWflxmlrfwp, strDraadjrbmk, list2, str);
    }

    private static final boolean iobyxmoadg(yggfygwlhe yggfygwlheVar) {
        return yggfygwlheVar.lqeggnwhkg() < yggfygwlheVar.gxszxtbevo().length() - 1 && Character.isLetter(yggfygwlheVar.gxszxtbevo().charAt(yggfygwlheVar.lqeggnwhkg())) && yggfygwlheVar.gxszxtbevo().charAt(yggfygwlheVar.lqeggnwhkg() + 1) == '(';
    }

    private static final String lqeggnwhkg(String str) {
        return mj.kcexrzcfyt.hkdspvbjdz(str, "c#", "androidx.compose.", false, 4, null);
    }

    private static final List ppxfxbqfkf(yggfygwlhe yggfygwlheVar) throws kcexrzcfyt {
        String strLqeggnwhkg;
        yggfygwlheVar.iobyxmoadg(2);
        ArrayList arrayList = new ArrayList();
        boolean z13 = false;
        while (!yggfygwlheVar.ppxfxbqfkf() && !yggfygwlheVar.nufgyqmvbu(')')) {
            if (yggfygwlheVar.nufgyqmvbu('!')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                String strGtknphoqwx = yggfygwlheVar.gtknphoqwx("!,)");
                if (strGtknphoqwx.length() != 0) {
                    int i13 = Integer.parseInt(strGtknphoqwx);
                    int i14 = 0;
                    while (i13 > 0) {
                        int size = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size) {
                                arrayList.add(new oxmwwwfdhm(i14, null, null, 6, null));
                                i13--;
                                break;
                            }
                            if (((oxmwwwfdhm) arrayList.get(i15)).iobyxmoadg() == i14) {
                                i14++;
                                break;
                            }
                            i15++;
                        }
                    }
                } else {
                    z13 = true;
                }
            } else {
                int iBtonecajqb = yggfygwlheVar.btonecajqb("!:,)");
                if (yggfygwlheVar.nufgyqmvbu(':')) {
                    yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                    strLqeggnwhkg = lqeggnwhkg(yggfygwlheVar.gtknphoqwx("!,)"));
                } else {
                    strLqeggnwhkg = null;
                }
                if (z13) {
                    int i16 = 0;
                    while (i16 < iBtonecajqb) {
                        int size2 = arrayList.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size2) {
                                arrayList.add(new oxmwwwfdhm(i16, null, null, 6, null));
                                break;
                            }
                            if (((oxmwwwfdhm) arrayList.get(i17)).iobyxmoadg() == i16) {
                                i16++;
                                break;
                            }
                            i17++;
                        }
                    }
                    z13 = false;
                }
                arrayList.add(new oxmwwwfdhm(iBtonecajqb, null, strLqeggnwhkg, 2, null));
            }
            if (yggfygwlheVar.nufgyqmvbu(',')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
            }
        }
        yggfygwlheVar.eablkybsjg(')');
        yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
        return arrayList;
    }

    private static final List wkgbmnqykc(yggfygwlhe yggfygwlheVar) throws kcexrzcfyt {
        String strLqeggnwhkg;
        yggfygwlheVar.iobyxmoadg(2);
        ArrayList arrayList = new ArrayList();
        while (!yggfygwlheVar.ppxfxbqfkf() && !yggfygwlheVar.nufgyqmvbu(')')) {
            String strGtknphoqwx = yggfygwlheVar.gtknphoqwx(":,)");
            if (yggfygwlheVar.nufgyqmvbu(':')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                strLqeggnwhkg = lqeggnwhkg(yggfygwlheVar.gtknphoqwx(",)"));
            } else {
                strLqeggnwhkg = null;
            }
            arrayList.add(new oxmwwwfdhm(arrayList.size(), strGtknphoqwx, strLqeggnwhkg));
            if (yggfygwlheVar.nufgyqmvbu(',')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
            }
        }
        yggfygwlheVar.eablkybsjg(')');
        yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
        return arrayList;
    }

    private static final List zoijcleaow(yggfygwlhe yggfygwlheVar) throws kcexrzcfyt {
        boolean z13;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!yggfygwlheVar.ppxfxbqfkf() && !yggfygwlheVar.nufgyqmvbu(':')) {
            if (yggfygwlheVar.nufgyqmvbu('*')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                z13 = true;
            } else {
                z13 = false;
            }
            Integer numValueOf2 = !yggfygwlheVar.nufgyqmvbu('@') ? Integer.valueOf(yggfygwlheVar.btonecajqb("@") + 1) : null;
            yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
            int iBtonecajqb = yggfygwlheVar.btonecajqb("L,:");
            if (yggfygwlheVar.nufgyqmvbu('L')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
                numValueOf = Integer.valueOf(yggfygwlheVar.btonecajqb(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new ojitshcjhn(numValueOf2 != null ? numValueOf2.intValue() : -1, iBtonecajqb, numValueOf != null ? numValueOf.intValue() : -1, z13));
            if (yggfygwlheVar.nufgyqmvbu(',')) {
                yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
            }
        }
        yggfygwlhe.zoijcleaow(yggfygwlheVar, 0, 1, null);
        return arrayList;
    }
}
