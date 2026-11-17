package com.google.zxing;

import java.util.Map;
import xe.btonecajqb;
import xe.draadjrbmk;
import xe.gtknphoqwx;
import xe.gxszxtbevo;
import xe.kcexrzcfyt;
import xe.nufgyqmvbu;
import xe.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements eablkybsjg {

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f25269iobyxmoadg;

        static {
            int[] iArr = new int[com.google.zxing.iobyxmoadg.values().length];
            f25269iobyxmoadg = iArr;
            try {
                iArr[com.google.zxing.iobyxmoadg.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25269iobyxmoadg[com.google.zxing.iobyxmoadg.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // com.google.zxing.eablkybsjg
    public te.zoijcleaow iobyxmoadg(String str, com.google.zxing.iobyxmoadg iobyxmoadgVar, int i13, int i14, Map map) {
        eablkybsjg gtknphoqwxVar;
        switch (iobyxmoadg.f25269iobyxmoadg[iobyxmoadgVar.ordinal()]) {
            case 1:
                gtknphoqwxVar = new gtknphoqwx();
                break;
            case 2:
                gtknphoqwxVar = new kcexrzcfyt();
                break;
            case 3:
                gtknphoqwxVar = new btonecajqb();
                break;
            case 4:
                gtknphoqwxVar = new ojitshcjhn();
                break;
            case 5:
                gtknphoqwxVar = new af.iobyxmoadg();
                break;
            case 6:
                gtknphoqwxVar = new gxszxtbevo();
                break;
            case 7:
                gtknphoqwxVar = new nufgyqmvbu();
                break;
            case 8:
                gtknphoqwxVar = new xe.wkgbmnqykc();
                break;
            case 9:
                gtknphoqwxVar = new draadjrbmk();
                break;
            case 10:
                gtknphoqwxVar = new ye.iobyxmoadg();
                break;
            case 11:
                gtknphoqwxVar = new xe.zoijcleaow();
                break;
            case 12:
                gtknphoqwxVar = new ve.iobyxmoadg();
                break;
            case 13:
                gtknphoqwxVar = new re.iobyxmoadg();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(iobyxmoadgVar)));
        }
        return gtknphoqwxVar.iobyxmoadg(str, iobyxmoadgVar, i13, i14, map);
    }
}
