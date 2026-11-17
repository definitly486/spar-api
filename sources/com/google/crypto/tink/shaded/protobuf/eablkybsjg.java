package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg {

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public int f23919iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public Object f23920ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final ojitshcjhn f23921wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public long f23922zoijcleaow;

        iobyxmoadg(ojitshcjhn ojitshcjhnVar) {
            ojitshcjhnVar.getClass();
            this.f23921wkgbmnqykc = ojitshcjhnVar;
        }
    }

    static int agtfadlqog(jhduphickx jhduphickxVar, int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        int i16 = (i13 & (-8)) | 4;
        int iWflxmlrfwp = wflxmlrfwp(jhduphickxVar, bArr, i14, i15, i16, iobyxmoadgVar);
        wkgbmnqykcVar.add(iobyxmoadgVar.f23920ppxfxbqfkf);
        while (iWflxmlrfwp < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, iWflxmlrfwp, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iWflxmlrfwp = wflxmlrfwp(jhduphickxVar, bArr, iWwaezpbzkn, i15, i16, iobyxmoadgVar);
            wkgbmnqykcVar.add(iobyxmoadgVar.f23920ppxfxbqfkf);
        }
        return iWflxmlrfwp;
    }

    static int btonecajqb(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) wkgbmnqykcVar;
        cdpycssgdhVar.addLong(dxjokdxxww(bArr, i14));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, i16, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            cdpycssgdhVar.addLong(dxjokdxxww(bArr, iWwaezpbzkn));
            i16 = iWwaezpbzkn + 8;
        }
        return i16;
    }

    static int cdpycssgdh(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iWwaezpbzkn = wwaezpbzkn(bArr, i14, iobyxmoadgVar);
        int i16 = iobyxmoadgVar.f23919iobyxmoadg;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        if (i16 == 0) {
            wkgbmnqykcVar.add("");
        } else {
            int i17 = iWwaezpbzkn + i16;
            if (!ydmasvzmpa.agtfadlqog(bArr, iWwaezpbzkn, i17)) {
                throw InvalidProtocolBufferException.nufgyqmvbu();
            }
            wkgbmnqykcVar.add(new String(bArr, iWwaezpbzkn, i16, esjtqupxsv.f23928zoijcleaow));
            iWwaezpbzkn = i17;
        }
        while (iWwaezpbzkn < i15) {
            int iWwaezpbzkn2 = wwaezpbzkn(bArr, iWwaezpbzkn, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iWwaezpbzkn = wwaezpbzkn(bArr, iWwaezpbzkn2, iobyxmoadgVar);
            int i18 = iobyxmoadgVar.f23919iobyxmoadg;
            if (i18 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            if (i18 == 0) {
                wkgbmnqykcVar.add("");
            } else {
                int i19 = iWwaezpbzkn + i18;
                if (!ydmasvzmpa.agtfadlqog(bArr, iWwaezpbzkn, i19)) {
                    throw InvalidProtocolBufferException.nufgyqmvbu();
                }
                wkgbmnqykcVar.add(new String(bArr, iWwaezpbzkn, i18, esjtqupxsv.f23928zoijcleaow));
                iWwaezpbzkn = i19;
            }
        }
        return iWwaezpbzkn;
    }

    static int cllcsxoeiz(Object obj, jhduphickx jhduphickxVar, byte[] bArr, int i13, int i14, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iLmojexxdyd = i13 + 1;
        int i15 = bArr[i13];
        if (i15 < 0) {
            iLmojexxdyd = lmojexxdyd(i15, bArr, iLmojexxdyd, iobyxmoadgVar);
            i15 = iobyxmoadgVar.f23919iobyxmoadg;
        }
        int i16 = iLmojexxdyd;
        if (i15 < 0 || i15 > i14 - i16) {
            throw InvalidProtocolBufferException.zdlpuopuiu();
        }
        int i17 = i15 + i16;
        jhduphickxVar.iobyxmoadg(obj, bArr, i16, i17, iobyxmoadgVar);
        iobyxmoadgVar.f23920ppxfxbqfkf = obj;
        return i17;
    }

    static int cqumvgiudr(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            iWwaezpbzkn = wwaezpbzkn(bArr, iWwaezpbzkn, iobyxmoadgVar);
            cqumvgiudrVar.addInt(iobyxmoadgVar.f23919iobyxmoadg);
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int draadjrbmk(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) wkgbmnqykcVar;
        yggfygwlheVar.addFloat(gtknphoqwx(bArr, i14));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, i16, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            yggfygwlheVar.addFloat(gtknphoqwx(bArr, iWwaezpbzkn));
            i16 = iWwaezpbzkn + 4;
        }
        return i16;
    }

    static long dxjokdxxww(byte[] bArr, int i13) {
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    static int eablkybsjg(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        draadjrbmk draadjrbmkVar = (draadjrbmk) wkgbmnqykcVar;
        draadjrbmkVar.addDouble(wkgbmnqykc(bArr, i14));
        int i16 = i14 + 8;
        while (i16 < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, i16, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            draadjrbmkVar.addDouble(wkgbmnqykc(bArr, iWwaezpbzkn));
            i16 = iWwaezpbzkn + 8;
        }
        return i16;
    }

    static int esjtqupxsv(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            iWwaezpbzkn = hcddaimhww(bArr, iWwaezpbzkn, iobyxmoadgVar);
            cdpycssgdhVar.addLong(iobyxmoadgVar.f23922zoijcleaow);
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static float gtknphoqwx(byte[] bArr, int i13) {
        return Float.intBitsToFloat(lqeggnwhkg(bArr, i13));
    }

    static int gxszxtbevo(int i13, byte[] bArr, int i14, int i15, Object obj, hkdspvbjdz hkdspvbjdzVar, metgxyhuhe metgxyhuheVar, iobyxmoadg iobyxmoadgVar) {
        iobyxmoadgVar.f23921wkgbmnqykc.iobyxmoadg(hkdspvbjdzVar, i13 >>> 3);
        return iozdgvuglv(i13, bArr, i14, i15, wypolnanlu.ojitshcjhn(obj), iobyxmoadgVar);
    }

    static int hcddaimhww(byte[] bArr, int i13, iobyxmoadg iobyxmoadgVar) {
        int i14 = i13 + 1;
        long j13 = bArr[i13];
        if (j13 < 0) {
            return pkzmftpjix(j13, bArr, i14, iobyxmoadgVar);
        }
        iobyxmoadgVar.f23922zoijcleaow = j13;
        return i14;
    }

    static int hkdspvbjdz(Object obj, jhduphickx jhduphickxVar, byte[] bArr, int i13, int i14, int i15, iobyxmoadg iobyxmoadgVar) {
        int iJlmebxxoox = ((wypolnanlu) jhduphickxVar).jlmebxxoox(obj, bArr, i13, i14, i15, iobyxmoadgVar);
        iobyxmoadgVar.f23920ppxfxbqfkf = obj;
        return iJlmebxxoox;
    }

    static int iobyxmoadg(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) wkgbmnqykcVar;
        int iHcddaimhww = hcddaimhww(bArr, i14, iobyxmoadgVar);
        gxszxtbevoVar.addBoolean(iobyxmoadgVar.f23922zoijcleaow != 0);
        while (iHcddaimhww < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, iHcddaimhww, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iHcddaimhww = hcddaimhww(bArr, iWwaezpbzkn, iobyxmoadgVar);
            gxszxtbevoVar.addBoolean(iobyxmoadgVar.f23922zoijcleaow != 0);
        }
        return iHcddaimhww;
    }

    static int iozdgvuglv(int i13, byte[] bArr, int i14, int i15, rlfsiqarku rlfsiqarkuVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        if (sflfametgt.iobyxmoadg(i13) == 0) {
            throw InvalidProtocolBufferException.lqeggnwhkg();
        }
        int iZoijcleaow = sflfametgt.zoijcleaow(i13);
        if (iZoijcleaow == 0) {
            int iHcddaimhww = hcddaimhww(bArr, i14, iobyxmoadgVar);
            rlfsiqarkuVar.agtfadlqog(i13, Long.valueOf(iobyxmoadgVar.f23922zoijcleaow));
            return iHcddaimhww;
        }
        if (iZoijcleaow == 1) {
            rlfsiqarkuVar.agtfadlqog(i13, Long.valueOf(dxjokdxxww(bArr, i14)));
            return i14 + 8;
        }
        if (iZoijcleaow == 2) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, i14, iobyxmoadgVar);
            int i16 = iobyxmoadgVar.f23919iobyxmoadg;
            if (i16 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            if (i16 > bArr.length - iWwaezpbzkn) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            if (i16 == 0) {
                rlfsiqarkuVar.agtfadlqog(i13, nufgyqmvbu.f23969yggfygwlhe);
            } else {
                rlfsiqarkuVar.agtfadlqog(i13, nufgyqmvbu.agtfadlqog(bArr, iWwaezpbzkn, i16));
            }
            return iWwaezpbzkn + i16;
        }
        if (iZoijcleaow != 3) {
            if (iZoijcleaow != 5) {
                throw InvalidProtocolBufferException.lqeggnwhkg();
            }
            rlfsiqarkuVar.agtfadlqog(i13, Integer.valueOf(lqeggnwhkg(bArr, i14)));
            return i14 + 4;
        }
        rlfsiqarku rlfsiqarkuVarGtknphoqwx = rlfsiqarku.gtknphoqwx();
        int i17 = (i13 & (-8)) | 4;
        int i18 = 0;
        while (i14 < i15) {
            int iWwaezpbzkn2 = wwaezpbzkn(bArr, i14, iobyxmoadgVar);
            int i19 = iobyxmoadgVar.f23919iobyxmoadg;
            if (i19 == i17) {
                i18 = i19;
                i14 = iWwaezpbzkn2;
                break;
            }
            i18 = i19;
            i14 = iozdgvuglv(i19, bArr, iWwaezpbzkn2, i15, rlfsiqarkuVarGtknphoqwx, iobyxmoadgVar);
        }
        if (i14 > i15 || i18 != i17) {
            throw InvalidProtocolBufferException.agtfadlqog();
        }
        rlfsiqarkuVar.agtfadlqog(i13, rlfsiqarkuVarGtknphoqwx);
        return i14;
    }

    static int istkbnxepw(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iWwaezpbzkn = wwaezpbzkn(bArr, i14, iobyxmoadgVar);
        int i16 = iobyxmoadgVar.f23919iobyxmoadg;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        if (i16 == 0) {
            wkgbmnqykcVar.add("");
        } else {
            wkgbmnqykcVar.add(new String(bArr, iWwaezpbzkn, i16, esjtqupxsv.f23928zoijcleaow));
            iWwaezpbzkn += i16;
        }
        while (iWwaezpbzkn < i15) {
            int iWwaezpbzkn2 = wwaezpbzkn(bArr, iWwaezpbzkn, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iWwaezpbzkn = wwaezpbzkn(bArr, iWwaezpbzkn2, iobyxmoadgVar);
            int i17 = iobyxmoadgVar.f23919iobyxmoadg;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            if (i17 == 0) {
                wkgbmnqykcVar.add("");
            } else {
                wkgbmnqykcVar.add(new String(bArr, iWwaezpbzkn, i17, esjtqupxsv.f23928zoijcleaow));
                iWwaezpbzkn += i17;
            }
        }
        return iWwaezpbzkn;
    }

    static int iwizpuwonk(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            iWwaezpbzkn = hcddaimhww(bArr, iWwaezpbzkn, iobyxmoadgVar);
            cdpycssgdhVar.addLong(dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.f23922zoijcleaow));
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int jpowsppfya(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) wkgbmnqykcVar;
        int iHcddaimhww = hcddaimhww(bArr, i14, iobyxmoadgVar);
        cdpycssgdhVar.addLong(iobyxmoadgVar.f23922zoijcleaow);
        while (iHcddaimhww < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, iHcddaimhww, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iHcddaimhww = hcddaimhww(bArr, iWwaezpbzkn, iobyxmoadgVar);
            cdpycssgdhVar.addLong(iobyxmoadgVar.f23922zoijcleaow);
        }
        return iHcddaimhww;
    }

    static int jyumaefscl(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            iWwaezpbzkn = wwaezpbzkn(bArr, iWwaezpbzkn, iobyxmoadgVar);
            cqumvgiudrVar.addInt(dxjokdxxww.zoijcleaow(iobyxmoadgVar.f23919iobyxmoadg));
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int kcexrzcfyt(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            cqumvgiudrVar.addInt(lqeggnwhkg(bArr, iWwaezpbzkn));
            iWwaezpbzkn += 4;
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int lereixgezr(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i14, iobyxmoadgVar);
        cqumvgiudrVar.addInt(dxjokdxxww.zoijcleaow(iobyxmoadgVar.f23919iobyxmoadg));
        while (iWwaezpbzkn < i15) {
            int iWwaezpbzkn2 = wwaezpbzkn(bArr, iWwaezpbzkn, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iWwaezpbzkn = wwaezpbzkn(bArr, iWwaezpbzkn2, iobyxmoadgVar);
            cqumvgiudrVar.addInt(dxjokdxxww.zoijcleaow(iobyxmoadgVar.f23919iobyxmoadg));
        }
        return iWwaezpbzkn;
    }

    static int lmojexxdyd(int i13, byte[] bArr, int i14, iobyxmoadg iobyxmoadgVar) {
        int i15 = i13 & 127;
        int i16 = i14 + 1;
        byte b13 = bArr[i14];
        if (b13 >= 0) {
            iobyxmoadgVar.f23919iobyxmoadg = i15 | (b13 << 7);
            return i16;
        }
        int i17 = i15 | ((b13 & 127) << 7);
        int i18 = i14 + 2;
        byte b14 = bArr[i16];
        if (b14 >= 0) {
            iobyxmoadgVar.f23919iobyxmoadg = i17 | (b14 << 14);
            return i18;
        }
        int i19 = i17 | ((b14 & 127) << 14);
        int i23 = i14 + 3;
        byte b15 = bArr[i18];
        if (b15 >= 0) {
            iobyxmoadgVar.f23919iobyxmoadg = i19 | (b15 << 21);
            return i23;
        }
        int i24 = i19 | ((b15 & 127) << 21);
        int i25 = i14 + 4;
        byte b16 = bArr[i23];
        if (b16 >= 0) {
            iobyxmoadgVar.f23919iobyxmoadg = i24 | (b16 << 28);
            return i25;
        }
        int i26 = i24 | ((b16 & 127) << 28);
        while (true) {
            int i27 = i25 + 1;
            if (bArr[i25] >= 0) {
                iobyxmoadgVar.f23919iobyxmoadg = i26;
                return i27;
            }
            i25 = i27;
        }
    }

    static int lqeggnwhkg(byte[] bArr, int i13) {
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    static int nufgyqmvbu(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) wkgbmnqykcVar;
        cqumvgiudrVar.addInt(lqeggnwhkg(bArr, i14));
        int i16 = i14 + 4;
        while (i16 < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, i16, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            cqumvgiudrVar.addInt(lqeggnwhkg(bArr, iWwaezpbzkn));
            i16 = iWwaezpbzkn + 4;
        }
        return i16;
    }

    static int ojitshcjhn(jhduphickx jhduphickxVar, byte[] bArr, int i13, int i14, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        Object objNewInstance = jhduphickxVar.newInstance();
        int iCllcsxoeiz = cllcsxoeiz(objNewInstance, jhduphickxVar, bArr, i13, i14, iobyxmoadgVar);
        jhduphickxVar.makeImmutable(objNewInstance);
        iobyxmoadgVar.f23920ppxfxbqfkf = objNewInstance;
        return iCllcsxoeiz;
    }

    static int oxmwwwfdhm(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        draadjrbmk draadjrbmkVar = (draadjrbmk) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            draadjrbmkVar.addDouble(wkgbmnqykc(bArr, iWwaezpbzkn));
            iWwaezpbzkn += 8;
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int pkzmftpjix(long j13, byte[] bArr, int i13, iobyxmoadg iobyxmoadgVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        long j14 = (j13 & 127) | (((long) (b13 & 127)) << 7);
        int i15 = 7;
        while (b13 < 0) {
            int i16 = i14 + 1;
            byte b14 = bArr[i14];
            i15 += 7;
            j14 |= ((long) (b14 & 127)) << i15;
            i14 = i16;
            b13 = b14;
        }
        iobyxmoadgVar.f23922zoijcleaow = j14;
        return i14;
    }

    static int pmvmpeiblj(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) wkgbmnqykcVar;
        int iHcddaimhww = hcddaimhww(bArr, i14, iobyxmoadgVar);
        cdpycssgdhVar.addLong(dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.f23922zoijcleaow));
        while (iHcddaimhww < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, iHcddaimhww, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iHcddaimhww = hcddaimhww(bArr, iWwaezpbzkn, iobyxmoadgVar);
            cdpycssgdhVar.addLong(dxjokdxxww.ppxfxbqfkf(iobyxmoadgVar.f23922zoijcleaow));
        }
        return iHcddaimhww;
    }

    static int ppxfxbqfkf(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iWwaezpbzkn = wwaezpbzkn(bArr, i14, iobyxmoadgVar);
        int i16 = iobyxmoadgVar.f23919iobyxmoadg;
        if (i16 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        if (i16 > bArr.length - iWwaezpbzkn) {
            throw InvalidProtocolBufferException.zdlpuopuiu();
        }
        if (i16 == 0) {
            wkgbmnqykcVar.add(nufgyqmvbu.f23969yggfygwlhe);
        } else {
            wkgbmnqykcVar.add(nufgyqmvbu.agtfadlqog(bArr, iWwaezpbzkn, i16));
            iWwaezpbzkn += i16;
        }
        while (iWwaezpbzkn < i15) {
            int iWwaezpbzkn2 = wwaezpbzkn(bArr, iWwaezpbzkn, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iWwaezpbzkn = wwaezpbzkn(bArr, iWwaezpbzkn2, iobyxmoadgVar);
            int i17 = iobyxmoadgVar.f23919iobyxmoadg;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.draadjrbmk();
            }
            if (i17 > bArr.length - iWwaezpbzkn) {
                throw InvalidProtocolBufferException.zdlpuopuiu();
            }
            if (i17 == 0) {
                wkgbmnqykcVar.add(nufgyqmvbu.f23969yggfygwlhe);
            } else {
                wkgbmnqykcVar.add(nufgyqmvbu.agtfadlqog(bArr, iWwaezpbzkn, i17));
                iWwaezpbzkn += i17;
            }
        }
        return iWwaezpbzkn;
    }

    static int rgvfuqvkyq(jhduphickx jhduphickxVar, int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iOjitshcjhn = ojitshcjhn(jhduphickxVar, bArr, i14, i15, iobyxmoadgVar);
        wkgbmnqykcVar.add(iobyxmoadgVar.f23920ppxfxbqfkf);
        while (iOjitshcjhn < i15) {
            int iWwaezpbzkn = wwaezpbzkn(bArr, iOjitshcjhn, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iOjitshcjhn = ojitshcjhn(jhduphickxVar, bArr, iWwaezpbzkn, i15, iobyxmoadgVar);
            wkgbmnqykcVar.add(iobyxmoadgVar.f23920ppxfxbqfkf);
        }
        return iOjitshcjhn;
    }

    static int vdvldrhtss(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            iWwaezpbzkn = hcddaimhww(bArr, iWwaezpbzkn, iobyxmoadgVar);
            gxszxtbevoVar.addBoolean(iobyxmoadgVar.f23922zoijcleaow != 0);
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int wflxmlrfwp(jhduphickx jhduphickxVar, byte[] bArr, int i13, int i14, int i15, iobyxmoadg iobyxmoadgVar) {
        Object objNewInstance = jhduphickxVar.newInstance();
        int iHkdspvbjdz = hkdspvbjdz(objNewInstance, jhduphickxVar, bArr, i13, i14, i15, iobyxmoadgVar);
        jhduphickxVar.makeImmutable(objNewInstance);
        iobyxmoadgVar.f23920ppxfxbqfkf = objNewInstance;
        return iHkdspvbjdz;
    }

    static double wkgbmnqykc(byte[] bArr, int i13) {
        return Double.longBitsToDouble(dxjokdxxww(bArr, i13));
    }

    static int wwaezpbzkn(byte[] bArr, int i13, iobyxmoadg iobyxmoadgVar) {
        int i14 = i13 + 1;
        byte b13 = bArr[i13];
        if (b13 < 0) {
            return lmojexxdyd(b13, bArr, i14, iobyxmoadgVar);
        }
        iobyxmoadgVar.f23919iobyxmoadg = b13;
        return i14;
    }

    static int yadqdtsiqt(byte[] bArr, int i13, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        if (i14 == 0) {
            iobyxmoadgVar.f23920ppxfxbqfkf = "";
            return iWwaezpbzkn;
        }
        iobyxmoadgVar.f23920ppxfxbqfkf = ydmasvzmpa.eablkybsjg(bArr, iWwaezpbzkn, i14);
        return iWwaezpbzkn + i14;
    }

    static int yggfygwlhe(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        yggfygwlhe yggfygwlheVar = (yggfygwlhe) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            yggfygwlheVar.addFloat(gtknphoqwx(bArr, iWwaezpbzkn));
            iWwaezpbzkn += 4;
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int ylkuphrtab(int i13, byte[] bArr, int i14, int i15, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) {
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i14, iobyxmoadgVar);
        cqumvgiudrVar.addInt(iobyxmoadgVar.f23919iobyxmoadg);
        while (iWwaezpbzkn < i15) {
            int iWwaezpbzkn2 = wwaezpbzkn(bArr, iWwaezpbzkn, iobyxmoadgVar);
            if (i13 != iobyxmoadgVar.f23919iobyxmoadg) {
                break;
            }
            iWwaezpbzkn = wwaezpbzkn(bArr, iWwaezpbzkn2, iobyxmoadgVar);
            cqumvgiudrVar.addInt(iobyxmoadgVar.f23919iobyxmoadg);
        }
        return iWwaezpbzkn;
    }

    static int zdlpuopuiu(byte[] bArr, int i13, esjtqupxsv.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        cdpycssgdh cdpycssgdhVar = (cdpycssgdh) wkgbmnqykcVar;
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg + iWwaezpbzkn;
        while (iWwaezpbzkn < i14) {
            cdpycssgdhVar.addLong(dxjokdxxww(bArr, iWwaezpbzkn));
            iWwaezpbzkn += 8;
        }
        if (iWwaezpbzkn == i14) {
            return iWwaezpbzkn;
        }
        throw InvalidProtocolBufferException.zdlpuopuiu();
    }

    static int zoijcleaow(byte[] bArr, int i13, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        if (i14 > bArr.length - iWwaezpbzkn) {
            throw InvalidProtocolBufferException.zdlpuopuiu();
        }
        if (i14 == 0) {
            iobyxmoadgVar.f23920ppxfxbqfkf = nufgyqmvbu.f23969yggfygwlhe;
            return iWwaezpbzkn;
        }
        iobyxmoadgVar.f23920ppxfxbqfkf = nufgyqmvbu.agtfadlqog(bArr, iWwaezpbzkn, i14);
        return iWwaezpbzkn + i14;
    }

    static int zynmafqrjb(byte[] bArr, int i13, iobyxmoadg iobyxmoadgVar) throws InvalidProtocolBufferException {
        int iWwaezpbzkn = wwaezpbzkn(bArr, i13, iobyxmoadgVar);
        int i14 = iobyxmoadgVar.f23919iobyxmoadg;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.draadjrbmk();
        }
        if (i14 == 0) {
            iobyxmoadgVar.f23920ppxfxbqfkf = "";
            return iWwaezpbzkn;
        }
        iobyxmoadgVar.f23920ppxfxbqfkf = new String(bArr, iWwaezpbzkn, i14, esjtqupxsv.f23928zoijcleaow);
        return iWwaezpbzkn + i14;
    }
}
