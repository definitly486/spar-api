package h;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public abstract class bfopjjpdmp {
    public static final long eablkybsjg(long j13, long j14) {
        long jGtknphoqwx = oipsdeybqn.gtknphoqwx(j13, oipsdeybqn.oxmwwwfdhm(j14));
        float fRgvfuqvkyq = oipsdeybqn.rgvfuqvkyq(j14);
        float fRgvfuqvkyq2 = oipsdeybqn.rgvfuqvkyq(jGtknphoqwx);
        float f13 = 1.0f - fRgvfuqvkyq2;
        float f14 = (fRgvfuqvkyq * f13) + fRgvfuqvkyq2;
        return wkgbmnqykc(f14 == 0.0f ? 0.0f : ((oipsdeybqn.zdlpuopuiu(jGtknphoqwx) * fRgvfuqvkyq2) + ((oipsdeybqn.zdlpuopuiu(j14) * fRgvfuqvkyq) * f13)) / f14, f14 == 0.0f ? 0.0f : ((oipsdeybqn.kcexrzcfyt(jGtknphoqwx) * fRgvfuqvkyq2) + ((oipsdeybqn.kcexrzcfyt(j14) * fRgvfuqvkyq) * f13)) / f14, f14 != 0.0f ? ((oipsdeybqn.vdvldrhtss(jGtknphoqwx) * fRgvfuqvkyq2) + ((oipsdeybqn.vdvldrhtss(j14) * fRgvfuqvkyq) * f13)) / f14 : 0.0f, f14, oipsdeybqn.oxmwwwfdhm(j14));
    }

    public static final long gxszxtbevo(long j13, long j14, float f13) {
        i.ppxfxbqfkf ppxfxbqfkfVarCdpycssgdh = i.gtknphoqwx.f41496iobyxmoadg.cdpycssgdh();
        long jGtknphoqwx = oipsdeybqn.gtknphoqwx(j13, ppxfxbqfkfVarCdpycssgdh);
        long jGtknphoqwx2 = oipsdeybqn.gtknphoqwx(j14, ppxfxbqfkfVarCdpycssgdh);
        float fRgvfuqvkyq = oipsdeybqn.rgvfuqvkyq(jGtknphoqwx);
        float fZdlpuopuiu = oipsdeybqn.zdlpuopuiu(jGtknphoqwx);
        float fKcexrzcfyt = oipsdeybqn.kcexrzcfyt(jGtknphoqwx);
        float fVdvldrhtss = oipsdeybqn.vdvldrhtss(jGtknphoqwx);
        float fRgvfuqvkyq2 = oipsdeybqn.rgvfuqvkyq(jGtknphoqwx2);
        float fZdlpuopuiu2 = oipsdeybqn.zdlpuopuiu(jGtknphoqwx2);
        float fKcexrzcfyt2 = oipsdeybqn.kcexrzcfyt(jGtknphoqwx2);
        float fVdvldrhtss2 = oipsdeybqn.vdvldrhtss(jGtknphoqwx2);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        return oipsdeybqn.gtknphoqwx(wkgbmnqykc(y0.wkgbmnqykc.zoijcleaow(fZdlpuopuiu, fZdlpuopuiu2, f13), y0.wkgbmnqykc.zoijcleaow(fKcexrzcfyt, fKcexrzcfyt2, f13), y0.wkgbmnqykc.zoijcleaow(fVdvldrhtss, fVdvldrhtss2, f13), y0.wkgbmnqykc.zoijcleaow(fRgvfuqvkyq, fRgvfuqvkyq2, f13), ppxfxbqfkfVarCdpycssgdh), oipsdeybqn.oxmwwwfdhm(j14));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0182  */
    /* JADX WARN: Code duplicated, block: B:123:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x019d  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final long iobyxmoadg(float f13, float f14, float f15, float f16, i.ppxfxbqfkf ppxfxbqfkfVar) {
        int i13;
        int i14;
        int i15;
        float fWkgbmnqykc;
        float fPpxfxbqfkf;
        int iFloatToRawIntBits;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        float fWkgbmnqykc2;
        float fPpxfxbqfkf2;
        int iFloatToRawIntBits2;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        float f17;
        if (ppxfxbqfkfVar.lqeggnwhkg()) {
            float f18 = f16 < 0.0f ? 0.0f : f16;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            int i38 = ((int) ((f18 * 255.0f) + 0.5f)) << 24;
            float f19 = f13 < 0.0f ? 0.0f : f13;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            int i39 = i38 | (((int) ((f19 * 255.0f) + 0.5f)) << 16);
            float f23 = f14 < 0.0f ? 0.0f : f14;
            if (f23 > 1.0f) {
                f23 = 1.0f;
            }
            int i43 = i39 | (((int) ((f23 * 255.0f) + 0.5f)) << 8);
            f17 = f15 >= 0.0f ? f15 : 0.0f;
            return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(i43 | ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 255.0f) + 0.5f))) << 32));
        }
        if (!(ppxfxbqfkfVar.iobyxmoadg() == 3)) {
            lxfrhoxuzk.iobyxmoadg("Color only works with ColorSpaces with 3 components");
        }
        int iZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
        if (!(iZoijcleaow != -1)) {
            lxfrhoxuzk.iobyxmoadg("Unknown color space, please use a color space in ColorSpaces");
        }
        float fWkgbmnqykc3 = ppxfxbqfkfVar.wkgbmnqykc(0);
        float fPpxfxbqfkf3 = ppxfxbqfkfVar.ppxfxbqfkf(0);
        if (f13 >= fWkgbmnqykc3) {
            fWkgbmnqykc3 = f13;
        }
        if (fWkgbmnqykc3 <= fPpxfxbqfkf3) {
            fPpxfxbqfkf3 = fWkgbmnqykc3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fPpxfxbqfkf3);
        int i44 = iFloatToRawIntBits3 >>> 31;
        int i45 = (iFloatToRawIntBits3 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i46 = iFloatToRawIntBits3 & 8388607;
        int i47 = UserVerificationMethods.USER_VERIFY_NONE;
        int i48 = 31;
        if (i45 == 255) {
            i14 = i46 != 0 ? 512 : 0;
            i13 = 31;
        } else {
            i13 = i45 - 112;
            if (i13 >= 31) {
                i13 = 49;
                i14 = 0;
            } else {
                if (i13 > 0) {
                    int i49 = i46 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i15 = (((i13 << 10) | i49) + 1) | (i44 << 15);
                    } else {
                        i14 = i49;
                    }
                    short s13 = (short) i15;
                    fWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc(1);
                    fPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf(1);
                    if (f14 >= fWkgbmnqykc) {
                        fWkgbmnqykc = f14;
                    }
                    if (fWkgbmnqykc <= fPpxfxbqfkf) {
                        fPpxfxbqfkf = fWkgbmnqykc;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fPpxfxbqfkf);
                    i16 = iFloatToRawIntBits >>> 31;
                    i17 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i18 = iFloatToRawIntBits & 8388607;
                    if (i17 == 255) {
                        if (i18 != 0) {
                            i24 = 512;
                        } else {
                            i24 = 0;
                        }
                        i19 = 31;
                    } else {
                        i19 = i17 - 112;
                        if (i19 >= 31) {
                            i19 = 49;
                            i24 = 0;
                        } else {
                            if (i19 <= 0) {
                                i23 = i18 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i25 = (((i19 << 10) | i23) + 1) | (i16 << 15);
                                } else {
                                    i24 = i23;
                                }
                                short s14 = (short) i25;
                                fWkgbmnqykc2 = ppxfxbqfkfVar.wkgbmnqykc(2);
                                fPpxfxbqfkf2 = ppxfxbqfkfVar.ppxfxbqfkf(2);
                                if (f15 >= fWkgbmnqykc2) {
                                    fWkgbmnqykc2 = f15;
                                }
                                if (fWkgbmnqykc2 <= fPpxfxbqfkf2) {
                                    fPpxfxbqfkf2 = fWkgbmnqykc2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fPpxfxbqfkf2);
                                i27 = iFloatToRawIntBits2 >>> 31;
                                i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                                i29 = 8388607 & iFloatToRawIntBits2;
                                if (i28 == 255) {
                                    if (i29 == 0) {
                                        i47 = 0;
                                    }
                                    i35 = i47;
                                } else {
                                    i33 = i28 - 112;
                                    if (i33 >= 31) {
                                        i48 = 49;
                                    } else {
                                        if (i33 <= 0) {
                                            i34 = i29 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i36 = (((i33 << 10) | i34) + 1) | (i27 << 15);
                                            } else {
                                                i35 = i34;
                                                i48 = i33;
                                            }
                                            short s15 = (short) i36;
                                            f17 = f16 >= 0.0f ? f16 : 0.0f;
                                            return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s15)) << 16)));
                                        }
                                        if (i33 >= -10) {
                                            i37 = (i29 | 8388608) >> (1 - i33);
                                            if ((i37 & 4096) != 0) {
                                                i37 += 8192;
                                            }
                                            i35 = i37 >> 13;
                                            i48 = 0;
                                        } else {
                                            i48 = 0;
                                        }
                                    }
                                    i35 = 0;
                                }
                                i36 = (i27 << 15) | (i48 << 10) | i35;
                                short s16 = (short) i36;
                                if (f16 >= 0.0f) {
                                }
                                return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s13) & 65535) << 48) | ((((long) s14) & 65535) << 32) | ((65535 & ((long) s16)) << 16)));
                            }
                            if (i19 >= -10) {
                                i26 = (i18 | 8388608) >> (1 - i19);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i24 = i26 >> 13;
                            } else {
                                i24 = 0;
                            }
                            i19 = 0;
                        }
                    }
                    i25 = i24 | (i16 << 15) | (i19 << 10);
                    short s17 = (short) i25;
                    fWkgbmnqykc2 = ppxfxbqfkfVar.wkgbmnqykc(2);
                    fPpxfxbqfkf2 = ppxfxbqfkfVar.ppxfxbqfkf(2);
                    if (f15 >= fWkgbmnqykc2) {
                        fWkgbmnqykc2 = f15;
                    }
                    if (fWkgbmnqykc2 <= fPpxfxbqfkf2) {
                        fPpxfxbqfkf2 = fWkgbmnqykc2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fPpxfxbqfkf2);
                    i27 = iFloatToRawIntBits2 >>> 31;
                    i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i29 = 8388607 & iFloatToRawIntBits2;
                    if (i28 == 255) {
                        if (i29 == 0) {
                            i47 = 0;
                        }
                        i35 = i47;
                    } else {
                        i33 = i28 - 112;
                        if (i33 >= 31) {
                            i48 = 49;
                        } else {
                            if (i33 <= 0) {
                                i34 = i29 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i36 = (((i33 << 10) | i34) + 1) | (i27 << 15);
                                } else {
                                    i35 = i34;
                                    i48 = i33;
                                }
                                short s18 = (short) i36;
                                if (f16 >= 0.0f) {
                                }
                                return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s13) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s18)) << 16)));
                            }
                            if (i33 >= -10) {
                                i37 = (i29 | 8388608) >> (1 - i33);
                                if ((i37 & 4096) != 0) {
                                    i37 += 8192;
                                }
                                i35 = i37 >> 13;
                                i48 = 0;
                            } else {
                                i48 = 0;
                            }
                        }
                        i35 = 0;
                    }
                    i36 = (i27 << 15) | (i48 << 10) | i35;
                    short s19 = (short) i36;
                    if (f16 >= 0.0f) {
                    }
                    return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s13) & 65535) << 48) | ((((long) s17) & 65535) << 32) | ((65535 & ((long) s19)) << 16)));
                }
                if (i13 >= -10) {
                    int i53 = (i46 | 8388608) >> (1 - i13);
                    if ((i53 & 4096) != 0) {
                        i53 += 8192;
                    }
                    i14 = i53 >> 13;
                } else {
                    i14 = 0;
                }
                i13 = 0;
            }
        }
        i15 = i14 | (i44 << 15) | (i13 << 10);
        short s110 = (short) i15;
        fWkgbmnqykc = ppxfxbqfkfVar.wkgbmnqykc(1);
        fPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf(1);
        if (f14 >= fWkgbmnqykc) {
            fWkgbmnqykc = f14;
        }
        if (fWkgbmnqykc <= fPpxfxbqfkf) {
            fPpxfxbqfkf = fWkgbmnqykc;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fPpxfxbqfkf);
        i16 = iFloatToRawIntBits >>> 31;
        i17 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            if (i18 != 0) {
                i24 = 512;
            } else {
                i24 = 0;
            }
            i19 = 31;
        } else {
            i19 = i17 - 112;
            if (i19 >= 31) {
                i19 = 49;
                i24 = 0;
            } else {
                if (i19 <= 0) {
                    i23 = i18 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i25 = (((i19 << 10) | i23) + 1) | (i16 << 15);
                    } else {
                        i24 = i23;
                    }
                    short s111 = (short) i25;
                    fWkgbmnqykc2 = ppxfxbqfkfVar.wkgbmnqykc(2);
                    fPpxfxbqfkf2 = ppxfxbqfkfVar.ppxfxbqfkf(2);
                    if (f15 >= fWkgbmnqykc2) {
                        fWkgbmnqykc2 = f15;
                    }
                    if (fWkgbmnqykc2 <= fPpxfxbqfkf2) {
                        fPpxfxbqfkf2 = fWkgbmnqykc2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fPpxfxbqfkf2);
                    i27 = iFloatToRawIntBits2 >>> 31;
                    i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i29 = 8388607 & iFloatToRawIntBits2;
                    if (i28 == 255) {
                        if (i29 == 0) {
                            i47 = 0;
                        }
                        i35 = i47;
                    } else {
                        i33 = i28 - 112;
                        if (i33 >= 31) {
                            i48 = 49;
                        } else {
                            if (i33 <= 0) {
                                i34 = i29 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i36 = (((i33 << 10) | i34) + 1) | (i27 << 15);
                                } else {
                                    i35 = i34;
                                    i48 = i33;
                                }
                                short s112 = (short) i36;
                                if (f16 >= 0.0f) {
                                }
                                return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s110) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s112)) << 16)));
                            }
                            if (i33 >= -10) {
                                i37 = (i29 | 8388608) >> (1 - i33);
                                if ((i37 & 4096) != 0) {
                                    i37 += 8192;
                                }
                                i35 = i37 >> 13;
                                i48 = 0;
                            } else {
                                i48 = 0;
                            }
                        }
                        i35 = 0;
                    }
                    i36 = (i27 << 15) | (i48 << 10) | i35;
                    short s113 = (short) i36;
                    if (f16 >= 0.0f) {
                    }
                    return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s110) & 65535) << 48) | ((((long) s111) & 65535) << 32) | ((65535 & ((long) s113)) << 16)));
                }
                if (i19 >= -10) {
                    i26 = (i18 | 8388608) >> (1 - i19);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i24 = i26 >> 13;
                } else {
                    i24 = 0;
                }
                i19 = 0;
            }
        }
        i25 = i24 | (i16 << 15) | (i19 << 10);
        short s114 = (short) i25;
        fWkgbmnqykc2 = ppxfxbqfkfVar.wkgbmnqykc(2);
        fPpxfxbqfkf2 = ppxfxbqfkfVar.ppxfxbqfkf(2);
        if (f15 >= fWkgbmnqykc2) {
            fWkgbmnqykc2 = f15;
        }
        if (fWkgbmnqykc2 <= fPpxfxbqfkf2) {
            fPpxfxbqfkf2 = fWkgbmnqykc2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fPpxfxbqfkf2);
        i27 = iFloatToRawIntBits2 >>> 31;
        i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i29 = 8388607 & iFloatToRawIntBits2;
        if (i28 == 255) {
            if (i29 == 0) {
                i47 = 0;
            }
            i35 = i47;
        } else {
            i33 = i28 - 112;
            if (i33 >= 31) {
                i48 = 49;
            } else {
                if (i33 <= 0) {
                    i34 = i29 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i36 = (((i33 << 10) | i34) + 1) | (i27 << 15);
                    } else {
                        i35 = i34;
                        i48 = i33;
                    }
                    short s115 = (short) i36;
                    if (f16 >= 0.0f) {
                    }
                    return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s110) & 65535) << 48) | ((((long) s114) & 65535) << 32) | ((65535 & ((long) s115)) << 16)));
                }
                if (i33 >= -10) {
                    i37 = (i29 | 8388608) >> (1 - i33);
                    if ((i37 & 4096) != 0) {
                        i37 += 8192;
                    }
                    i35 = i37 >> 13;
                    i48 = 0;
                } else {
                    i48 = 0;
                }
            }
            i35 = 0;
        }
        i36 = (i27 << 15) | (i48 << 10) | i35;
        short s116 = (short) i36;
        if (f16 >= 0.0f) {
        }
        return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow((((long) iZoijcleaow) & 63) | ((((long) ((int) (((f17 <= 1.0f ? f17 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s110) & 65535) << 48) | ((((long) s114) & 65535) << 32) | ((65535 & ((long) s116)) << 16)));
    }

    public static final float lqeggnwhkg(long j13) {
        i.ppxfxbqfkf ppxfxbqfkfVarOxmwwwfdhm = oipsdeybqn.oxmwwwfdhm(j13);
        if (!i.zoijcleaow.eablkybsjg(ppxfxbqfkfVarOxmwwwfdhm.eablkybsjg(), i.zoijcleaow.f41585iobyxmoadg.zoijcleaow())) {
            lxfrhoxuzk.iobyxmoadg("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) i.zoijcleaow.nufgyqmvbu(ppxfxbqfkfVarOxmwwwfdhm.eablkybsjg())));
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVarOxmwwwfdhm, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        i.agtfadlqog agtfadlqogVarIwizpuwonk = ((i.iozdgvuglv) ppxfxbqfkfVarOxmwwwfdhm).iwizpuwonk();
        float fIobyxmoadg = (float) ((agtfadlqogVarIwizpuwonk.iobyxmoadg(oipsdeybqn.zdlpuopuiu(j13)) * 0.2126d) + (agtfadlqogVarIwizpuwonk.iobyxmoadg(oipsdeybqn.kcexrzcfyt(j13)) * 0.7152d) + (agtfadlqogVarIwizpuwonk.iobyxmoadg(oipsdeybqn.vdvldrhtss(j13)) * 0.0722d));
        if (fIobyxmoadg < 0.0f) {
            fIobyxmoadg = 0.0f;
        }
        if (fIobyxmoadg > 1.0f) {
            return 1.0f;
        }
        return fIobyxmoadg;
    }

    public static final int nufgyqmvbu(long j13) {
        return (int) gg.istkbnxepw.zoijcleaow(oipsdeybqn.gtknphoqwx(j13, i.gtknphoqwx.f41496iobyxmoadg.lmojexxdyd()) >>> 32);
    }

    public static final long ppxfxbqfkf(long j13) {
        return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(j13 << 32));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    public static final long wkgbmnqykc(float f13, float f14, float f15, float f16, i.ppxfxbqfkf ppxfxbqfkfVar) {
        int i13;
        int i14;
        int i15;
        int iFloatToRawIntBits;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int iFloatToRawIntBits2;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35;
        if (ppxfxbqfkfVar.lqeggnwhkg()) {
            return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow((((((int) ((f16 * 255.0f) + 0.5f)) << 24) | (((int) ((f13 * 255.0f) + 0.5f)) << 16)) | (((int) ((f14 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f15) + 0.5f))) << 32));
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f13);
        int i36 = iFloatToRawIntBits3 >>> 31;
        int i37 = (iFloatToRawIntBits3 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i38 = iFloatToRawIntBits3 & 8388607;
        int i39 = UserVerificationMethods.USER_VERIFY_NONE;
        int i43 = 0;
        if (i37 == 255) {
            i14 = i38 != 0 ? 512 : 0;
            i13 = 31;
        } else {
            i13 = i37 - 112;
            if (i13 >= 31) {
                i14 = 0;
                i13 = 49;
            } else {
                if (i13 > 0) {
                    int i44 = i38 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i15 = (((i13 << 10) | i44) + 1) | (i36 << 15);
                    } else {
                        i14 = i44;
                    }
                    short s13 = (short) i15;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f14);
                    i16 = iFloatToRawIntBits >>> 31;
                    i17 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i18 = iFloatToRawIntBits & 8388607;
                    if (i17 == 255) {
                        if (i18 != 0) {
                            i24 = 512;
                        } else {
                            i24 = 0;
                        }
                        i19 = 31;
                    } else {
                        i19 = i17 - 112;
                        if (i19 >= 31) {
                            i24 = 0;
                            i19 = 49;
                        } else {
                            if (i19 <= 0) {
                                i23 = i18 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i25 = (((i19 << 10) | i23) + 1) | (i16 << 15);
                                } else {
                                    i24 = i23;
                                }
                                short s14 = (short) i25;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
                                i27 = iFloatToRawIntBits2 >>> 31;
                                i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                                i29 = 8388607 & iFloatToRawIntBits2;
                                if (i28 == 255) {
                                    if (i29 == 0) {
                                        i39 = 0;
                                    }
                                    i43 = i39;
                                    i33 = 31;
                                } else {
                                    i33 = i28 - 112;
                                    if (i33 >= 31) {
                                        i33 = 49;
                                    } else {
                                        if (i33 <= 0) {
                                            i43 = i29 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i34 = (((i33 << 10) | i43) + 1) | (i27 << 15);
                                            }
                                            return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s14) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
                                        }
                                        if (i33 >= -10) {
                                            i35 = (i29 | 8388608) >> (1 - i33);
                                            if ((i35 & 4096) != 0) {
                                                i35 += 8192;
                                            }
                                            i33 = 0;
                                            i43 = i35 >> 13;
                                        } else {
                                            i33 = 0;
                                        }
                                    }
                                }
                                i34 = (i27 << 15) | (i33 << 10) | i43;
                                return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s14) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
                            }
                            if (i19 >= -10) {
                                i26 = (i18 | 8388608) >> (1 - i19);
                                if ((i26 & 4096) != 0) {
                                    i26 += 8192;
                                }
                                i24 = i26 >> 13;
                                i19 = 0;
                            } else {
                                i24 = 0;
                                i19 = 0;
                            }
                        }
                    }
                    i25 = i24 | (i16 << 15) | (i19 << 10);
                    short s15 = (short) i25;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
                    i27 = iFloatToRawIntBits2 >>> 31;
                    i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i29 = 8388607 & iFloatToRawIntBits2;
                    if (i28 == 255) {
                        if (i29 == 0) {
                            i39 = 0;
                        }
                        i43 = i39;
                        i33 = 31;
                    } else {
                        i33 = i28 - 112;
                        if (i33 >= 31) {
                            i33 = 49;
                        } else {
                            if (i33 <= 0) {
                                i43 = i29 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i34 = (((i33 << 10) | i43) + 1) | (i27 << 15);
                                }
                                return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s15) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
                            }
                            if (i33 >= -10) {
                                i35 = (i29 | 8388608) >> (1 - i33);
                                if ((i35 & 4096) != 0) {
                                    i35 += 8192;
                                }
                                i33 = 0;
                                i43 = i35 >> 13;
                            } else {
                                i33 = 0;
                            }
                        }
                    }
                    i34 = (i27 << 15) | (i33 << 10) | i43;
                    return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s15) & 65535) << 32) | ((((long) s13) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
                }
                if (i13 >= -10) {
                    int i45 = (i38 | 8388608) >> (1 - i13);
                    if ((i45 & 4096) != 0) {
                        i45 += 8192;
                    }
                    i14 = i45 >> 13;
                    i13 = 0;
                } else {
                    i14 = 0;
                    i13 = 0;
                }
            }
        }
        i15 = i14 | (i36 << 15) | (i13 << 10);
        short s16 = (short) i15;
        iFloatToRawIntBits = Float.floatToRawIntBits(f14);
        i16 = iFloatToRawIntBits >>> 31;
        i17 = (iFloatToRawIntBits >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i18 = iFloatToRawIntBits & 8388607;
        if (i17 == 255) {
            if (i18 != 0) {
                i24 = 512;
            } else {
                i24 = 0;
            }
            i19 = 31;
        } else {
            i19 = i17 - 112;
            if (i19 >= 31) {
                i24 = 0;
                i19 = 49;
            } else {
                if (i19 <= 0) {
                    i23 = i18 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i25 = (((i19 << 10) | i23) + 1) | (i16 << 15);
                    } else {
                        i24 = i23;
                    }
                    short s17 = (short) i25;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
                    i27 = iFloatToRawIntBits2 >>> 31;
                    i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
                    i29 = 8388607 & iFloatToRawIntBits2;
                    if (i28 == 255) {
                        if (i29 == 0) {
                            i39 = 0;
                        }
                        i43 = i39;
                        i33 = 31;
                    } else {
                        i33 = i28 - 112;
                        if (i33 >= 31) {
                            i33 = 49;
                        } else {
                            if (i33 <= 0) {
                                i43 = i29 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i34 = (((i33 << 10) | i43) + 1) | (i27 << 15);
                                }
                                return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s17) & 65535) << 32) | ((((long) s16) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
                            }
                            if (i33 >= -10) {
                                i35 = (i29 | 8388608) >> (1 - i33);
                                if ((i35 & 4096) != 0) {
                                    i35 += 8192;
                                }
                                i33 = 0;
                                i43 = i35 >> 13;
                            } else {
                                i33 = 0;
                            }
                        }
                    }
                    i34 = (i27 << 15) | (i33 << 10) | i43;
                    return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s17) & 65535) << 32) | ((((long) s16) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
                }
                if (i19 >= -10) {
                    i26 = (i18 | 8388608) >> (1 - i19);
                    if ((i26 & 4096) != 0) {
                        i26 += 8192;
                    }
                    i24 = i26 >> 13;
                    i19 = 0;
                } else {
                    i24 = 0;
                    i19 = 0;
                }
            }
        }
        i25 = i24 | (i16 << 15) | (i19 << 10);
        short s18 = (short) i25;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f15);
        i27 = iFloatToRawIntBits2 >>> 31;
        i28 = (iFloatToRawIntBits2 >>> 23) & KotlinVersion.MAX_COMPONENT_VALUE;
        i29 = 8388607 & iFloatToRawIntBits2;
        if (i28 == 255) {
            if (i29 == 0) {
                i39 = 0;
            }
            i43 = i39;
            i33 = 31;
        } else {
            i33 = i28 - 112;
            if (i33 >= 31) {
                i33 = 49;
            } else {
                if (i33 <= 0) {
                    i43 = i29 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i34 = (((i33 << 10) | i43) + 1) | (i27 << 15);
                    }
                    return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s18) & 65535) << 32) | ((((long) s16) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
                }
                if (i33 >= -10) {
                    i35 = (i29 | 8388608) >> (1 - i33);
                    if ((i35 & 4096) != 0) {
                        i35 += 8192;
                    }
                    i33 = 0;
                    i43 = i35 >> 13;
                } else {
                    i33 = 0;
                }
            }
        }
        i34 = (i27 << 15) | (i33 << 10) | i43;
        return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(((((long) s18) & 65535) << 32) | ((((long) s16) & 65535) << 48) | ((((long) ((short) i34)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f16, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) ppxfxbqfkfVar.zoijcleaow()) & 63)));
    }

    public static final long zoijcleaow(int i13) {
        return oipsdeybqn.btonecajqb(gg.istkbnxepw.zoijcleaow(gg.istkbnxepw.zoijcleaow(i13) << 32));
    }
}
