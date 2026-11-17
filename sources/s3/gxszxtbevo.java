package s3;

import java.util.ArrayList;
import java.util.zip.Inflater;
import y2.cdpycssgdh;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
abstract class gxszxtbevo {
    private static ArrayList eablkybsjg(yadqdtsiqt yadqdtsiqtVar) {
        if (yadqdtsiqtVar.wwaezpbzkn() != 0) {
            return null;
        }
        yadqdtsiqtVar.crxdokpmqz(7);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss == 1684433976) {
            yadqdtsiqt yadqdtsiqtVar2 = new yadqdtsiqt();
            Inflater inflater = new Inflater(true);
            try {
                if (!stevsuqkhv.roivzttewh(yadqdtsiqtVar, yadqdtsiqtVar2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                yadqdtsiqtVar = yadqdtsiqtVar2;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iVdvldrhtss != 1918990112) {
            return null;
        }
        return lqeggnwhkg(yadqdtsiqtVar);
    }

    private static ArrayList gxszxtbevo(yadqdtsiqt yadqdtsiqtVar) {
        int iVdvldrhtss;
        yadqdtsiqtVar.crxdokpmqz(8);
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        while (iGxszxtbevo < iLqeggnwhkg && (iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss() + iGxszxtbevo) > iGxszxtbevo && iVdvldrhtss <= iLqeggnwhkg) {
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss2 == 2037673328 || iVdvldrhtss2 == 1836279920) {
                yadqdtsiqtVar.ulzqkzuiru(iVdvldrhtss);
                return eablkybsjg(yadqdtsiqtVar);
            }
            yadqdtsiqtVar.sopmlzcsov(iVdvldrhtss);
            iGxszxtbevo = iVdvldrhtss;
        }
        return null;
    }

    public static eablkybsjg iobyxmoadg(byte[] bArr, int i13) {
        ArrayList arrayListGxszxtbevo;
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(bArr);
        try {
            arrayListGxszxtbevo = ppxfxbqfkf(yadqdtsiqtVar) ? gxszxtbevo(yadqdtsiqtVar) : eablkybsjg(yadqdtsiqtVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListGxszxtbevo = null;
        }
        if (arrayListGxszxtbevo == null) {
            return null;
        }
        int size = arrayListGxszxtbevo.size();
        if (size == 1) {
            return new eablkybsjg((eablkybsjg.iobyxmoadg) arrayListGxszxtbevo.get(0), i13);
        }
        if (size != 2) {
            return null;
        }
        return new eablkybsjg((eablkybsjg.iobyxmoadg) arrayListGxszxtbevo.get(0), (eablkybsjg.iobyxmoadg) arrayListGxszxtbevo.get(1), i13);
    }

    private static ArrayList lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar) {
        ArrayList arrayList = new ArrayList();
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        while (iGxszxtbevo < iLqeggnwhkg) {
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss() + iGxszxtbevo;
            if (iVdvldrhtss <= iGxszxtbevo || iVdvldrhtss > iLqeggnwhkg) {
                return null;
            }
            if (yadqdtsiqtVar.vdvldrhtss() == 1835365224) {
                eablkybsjg.iobyxmoadg iobyxmoadgVarWkgbmnqykc = wkgbmnqykc(yadqdtsiqtVar);
                if (iobyxmoadgVarWkgbmnqykc == null) {
                    return null;
                }
                arrayList.add(iobyxmoadgVarWkgbmnqykc);
            }
            yadqdtsiqtVar.sopmlzcsov(iVdvldrhtss);
            iGxszxtbevo = iVdvldrhtss;
        }
        return arrayList;
    }

    private static boolean ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
        yadqdtsiqtVar.crxdokpmqz(4);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        yadqdtsiqtVar.sopmlzcsov(0);
        return iVdvldrhtss == 1886547818;
    }

    private static eablkybsjg.iobyxmoadg wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss > 10000) {
            return null;
        }
        float[] fArr = new float[iVdvldrhtss];
        for (int i13 = 0; i13 < iVdvldrhtss; i13++) {
            fArr[i13] = yadqdtsiqtVar.rgvfuqvkyq();
        }
        int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
        if (iVdvldrhtss2 > 32000) {
            return null;
        }
        double d13 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iVdvldrhtss) * 2.0d) / dLog);
        cdpycssgdh cdpycssgdhVar = new cdpycssgdh(yadqdtsiqtVar.eablkybsjg());
        int i14 = 8;
        cdpycssgdhVar.rgvfuqvkyq(yadqdtsiqtVar.gxszxtbevo() * 8);
        float[] fArr2 = new float[iVdvldrhtss2 * 5];
        int i15 = 5;
        int[] iArr = new int[5];
        int i16 = 0;
        int i17 = 0;
        while (i16 < iVdvldrhtss2) {
            int i18 = 0;
            while (i18 < i15) {
                int iZoijcleaow = iArr[i18] + zoijcleaow(cdpycssgdhVar.nufgyqmvbu(iCeil));
                if (iZoijcleaow >= iVdvldrhtss || iZoijcleaow < 0) {
                    return null;
                }
                fArr2[i17] = fArr[iZoijcleaow];
                iArr[i18] = iZoijcleaow;
                i18++;
                i17++;
                i15 = 5;
            }
            i16++;
            i15 = 5;
        }
        cdpycssgdhVar.rgvfuqvkyq((cdpycssgdhVar.eablkybsjg() + 7) & (-8));
        int i19 = 32;
        int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(32);
        eablkybsjg.zoijcleaow[] zoijcleaowVarArr = new eablkybsjg.zoijcleaow[iNufgyqmvbu];
        int i23 = 0;
        while (i23 < iNufgyqmvbu) {
            int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(i14);
            int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(i14);
            int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(i19);
            if (iNufgyqmvbu4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iVdvldrhtss2) * d13) / dLog);
            float[] fArr3 = new float[iNufgyqmvbu4 * 3];
            float[] fArr4 = new float[iNufgyqmvbu4 * 2];
            int iZoijcleaow2 = 0;
            for (int i24 = 0; i24 < iNufgyqmvbu4; i24++) {
                iZoijcleaow2 += zoijcleaow(cdpycssgdhVar.nufgyqmvbu(iCeil2));
                if (iZoijcleaow2 < 0 || iZoijcleaow2 >= iVdvldrhtss2) {
                    return null;
                }
                int i25 = i24 * 3;
                int i26 = iZoijcleaow2 * 5;
                fArr3[i25] = fArr2[i26];
                fArr3[i25 + 1] = fArr2[i26 + 1];
                fArr3[i25 + 2] = fArr2[i26 + 2];
                int i27 = i24 * 2;
                fArr4[i27] = fArr2[i26 + 3];
                fArr4[i27 + 1] = fArr2[i26 + 4];
            }
            zoijcleaowVarArr[i23] = new eablkybsjg.zoijcleaow(iNufgyqmvbu2, fArr3, fArr4, iNufgyqmvbu3);
            i23++;
            i19 = 32;
            d13 = 2.0d;
            i14 = 8;
        }
        return new eablkybsjg.iobyxmoadg(zoijcleaowVarArr);
    }

    private static int zoijcleaow(int i13) {
        return (-(i13 & 1)) ^ (i13 >> 1);
    }
}
