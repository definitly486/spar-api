package n4;

import t3.cllcsxoeiz;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f68624iobyxmoadg = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean iobyxmoadg(int i13, boolean z13) {
        if ((i13 >>> 8) == 3368816) {
            return true;
        }
        if (i13 == 1751476579 && z13) {
            return true;
        }
        for (int i14 : f68624iobyxmoadg) {
            if (i14 == i13) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x011a  */
    /* JADX WARN: Code duplicated, block: B:79:0x011d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code duplicated, block: B:83:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129 A[RETURN] */
    private static cllcsxoeiz ppxfxbqfkf(t3.vdvldrhtss vdvldrhtssVar, boolean z13, boolean z14) {
        int i13;
        int i14;
        int i15;
        boolean z15;
        int[] iArr;
        long length = vdvldrhtssVar.getLength();
        long j13 = -1;
        long j14 = 4096;
        if (length != -1 && length <= 4096) {
            j14 = length;
        }
        int i16 = (int) j14;
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(64);
        int i17 = 0;
        int i18 = 0;
        boolean z16 = false;
        while (true) {
            if (i18 < i16) {
                yadqdtsiqtVar.tzroggbefp(8);
                if (vdvldrhtssVar.ppxfxbqfkf(yadqdtsiqtVar.eablkybsjg(), i17, 8, true)) {
                    long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
                    int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
                    if (jPkzmftpjix == 1) {
                        vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 8, 8);
                        i14 = 16;
                        yadqdtsiqtVar.ulzqkzuiru(16);
                        jPkzmftpjix = yadqdtsiqtVar.pmvmpeiblj();
                    } else {
                        if (jPkzmftpjix == 0) {
                            long length2 = vdvldrhtssVar.getLength();
                            if (length2 != j13) {
                                jPkzmftpjix = (length2 - vdvldrhtssVar.nufgyqmvbu()) + ((long) 8);
                            }
                        }
                        i14 = 8;
                    }
                    long j15 = jPkzmftpjix;
                    long j16 = i14;
                    if (j15 < j16) {
                        return new iobyxmoadg(iVdvldrhtss, j15, i14);
                    }
                    i18 += i14;
                    if (iVdvldrhtss == 1836019574) {
                        i16 += (int) j15;
                        if (length != -1 && i16 > length) {
                            i16 = (int) length;
                        }
                    } else if (iVdvldrhtss == 1836019558 || iVdvldrhtss == 1836475768) {
                        i13 = 1;
                    } else {
                        long j17 = length;
                        if (iVdvldrhtss == 1835295092) {
                            z16 = true;
                        }
                        if ((((long) i18) + j15) - j16 >= i16) {
                            i13 = 0;
                        } else {
                            int i19 = (int) (j15 - j16);
                            i18 += i19;
                            if (iVdvldrhtss != 1718909296) {
                                i15 = 0;
                                if (i19 != 0) {
                                    vdvldrhtssVar.dxjokdxxww(i19);
                                }
                            } else {
                                if (i19 < 8) {
                                    return new iobyxmoadg(iVdvldrhtss, i19, 8);
                                }
                                yadqdtsiqtVar.tzroggbefp(i19);
                                i15 = 0;
                                vdvldrhtssVar.ojitshcjhn(yadqdtsiqtVar.eablkybsjg(), 0, i19);
                                int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
                                if (iobyxmoadg(iVdvldrhtss2, z14)) {
                                    z16 = true;
                                }
                                yadqdtsiqtVar.crxdokpmqz(4);
                                int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg() / 4;
                                if (!z16 && iIobyxmoadg > 0) {
                                    iArr = new int[iIobyxmoadg];
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= iIobyxmoadg) {
                                            z15 = z16;
                                            break;
                                        }
                                        int iVdvldrhtss3 = yadqdtsiqtVar.vdvldrhtss();
                                        iArr[i23] = iVdvldrhtss3;
                                        if (iobyxmoadg(iVdvldrhtss3, z14)) {
                                            z15 = true;
                                            break;
                                        }
                                        i23++;
                                    }
                                } else {
                                    z15 = z16;
                                    iArr = null;
                                }
                                if (!z15) {
                                    return new cqumvgiudr(iVdvldrhtss2, iArr);
                                }
                                z16 = z15;
                            }
                            i17 = i15;
                            length = j17;
                        }
                    }
                    j13 = -1;
                }
                if (!z16) {
                    return ojitshcjhn.f68683iobyxmoadg;
                }
                if (z13 != i13) {
                    return i13 != 0 ? dxjokdxxww.f68592zoijcleaow : dxjokdxxww.f68591ppxfxbqfkf;
                }
                return null;
            }
            i13 = i17;
            if (!z16) {
                return ojitshcjhn.f68683iobyxmoadg;
            }
            if (z13 != i13) {
                if (i13 != 0) {
                }
            }
            return null;
        }
    }

    public static cllcsxoeiz wkgbmnqykc(t3.vdvldrhtss vdvldrhtssVar, boolean z13) {
        return ppxfxbqfkf(vdvldrhtssVar, false, z13);
    }

    public static cllcsxoeiz zoijcleaow(t3.vdvldrhtss vdvldrhtssVar) {
        return ppxfxbqfkf(vdvldrhtssVar, true, false);
    }
}
