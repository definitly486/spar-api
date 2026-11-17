package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes2.dex */
class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f21676iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float[] f21675zoijcleaow = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final float[] f21674ppxfxbqfkf = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    wkgbmnqykc() {
    }

    int iobyxmoadg() {
        return this.f21676iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x008a A[EDGE_INSN: B:108:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0032->B:41:0x0080], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0100 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    float zoijcleaow(String str, int i13, int i14) {
        boolean z13;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        int i23;
        int i24;
        float f13;
        char cCharAt;
        int i25;
        char cCharAt2;
        boolean z15;
        boolean z16;
        int i26;
        int i27;
        int i28;
        char cCharAt3;
        char cCharAt4;
        this.f21676iobyxmoadg = i13;
        if (i13 >= i14) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i13);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z13 = false;
            } else {
                z13 = true;
            }
            int i29 = this.f21676iobyxmoadg;
            long j13 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            z14 = false;
            i18 = 0;
            while (true) {
                i19 = this.f21676iobyxmoadg;
                if (i19 >= i14) {
                    break;
                }
                cCharAt4 = str.charAt(i19);
                if (cCharAt4 != '0') {
                    if (i15 == 0) {
                        i17++;
                    } else {
                        i16++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i33 = i15 + i16;
                    while (i16 > 0) {
                        if (j13 > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j13 *= 10;
                        i16--;
                    }
                    if (j13 > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j13 = (j13 * 10) + ((long) (cCharAt4 - '0'));
                    i15 = i33 + 1;
                    if (j13 < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z14) {
                        break;
                    }
                    i18 = this.f21676iobyxmoadg - i29;
                    z14 = true;
                }
                this.f21676iobyxmoadg++;
            }
            if (!z14 && this.f21676iobyxmoadg == i18 + 1) {
                return Float.NaN;
            }
            if (i15 == 0) {
                if (i17 == 0) {
                    return Float.NaN;
                }
                i15 = 1;
            }
            if (z14) {
                i16 = (i18 - i17) - i15;
            }
            i23 = this.f21676iobyxmoadg;
            if (i23 < i14 && ((cCharAt = str.charAt(i23)) == 'E' || cCharAt == 'e')) {
                i25 = this.f21676iobyxmoadg + 1;
                this.f21676iobyxmoadg = i25;
                if (i25 == i14) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i25);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z15 = false;
                                z16 = false;
                                break;
                            default:
                                this.f21676iobyxmoadg--;
                                z16 = true;
                                z15 = false;
                                break;
                        }
                    } else {
                        z15 = true;
                    }
                    if (!z16) {
                        i26 = this.f21676iobyxmoadg;
                        i27 = 0;
                        while (true) {
                            i28 = this.f21676iobyxmoadg;
                            if (i28 >= i14 && (cCharAt3 = str.charAt(i28)) >= '0' && cCharAt3 <= '9') {
                                if (i27 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i27 = (i27 * 10) + (cCharAt3 - '0');
                                this.f21676iobyxmoadg++;
                            }
                        }
                        if (this.f21676iobyxmoadg == i26) {
                            return Float.NaN;
                        }
                        if (z15) {
                            i16 -= i27;
                        } else {
                            i16 += i27;
                        }
                    }
                } else {
                    z15 = false;
                }
                this.f21676iobyxmoadg++;
                z16 = false;
                if (!z16) {
                    i26 = this.f21676iobyxmoadg;
                    i27 = 0;
                    while (true) {
                        i28 = this.f21676iobyxmoadg;
                        if (i28 >= i14) {
                        }
                        i27 = (i27 * 10) + (cCharAt3 - '0');
                        this.f21676iobyxmoadg++;
                    }
                    if (this.f21676iobyxmoadg == i26) {
                        return Float.NaN;
                    }
                    if (z15) {
                        i16 -= i27;
                    } else {
                        i16 += i27;
                    }
                }
            }
            i24 = i15 + i16;
            if (i24 <= 39 || i24 < -44) {
                return Float.NaN;
            }
            long j14 = j13;
            float f14 = j14;
            if (j14 != 0) {
                if (i16 > 0) {
                    f13 = f21675zoijcleaow[i16];
                } else if (i16 < 0) {
                    if (i16 < -38) {
                        f14 = (float) (((double) f14) * 1.0E-20d);
                        i16 += 20;
                    }
                    f13 = f21674ppxfxbqfkf[-i16];
                }
                f14 *= f13;
            }
            return z13 ? -f14 : f14;
        }
        z13 = false;
        this.f21676iobyxmoadg++;
        int i210 = this.f21676iobyxmoadg;
        long j15 = 0;
        i15 = 0;
        i16 = 0;
        i17 = 0;
        z14 = false;
        i18 = 0;
        while (true) {
            i19 = this.f21676iobyxmoadg;
            if (i19 >= i14) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i19);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i15 == 0) {
                i17++;
            } else {
                i16++;
            }
            this.f21676iobyxmoadg++;
        }
        if (!z14) {
        }
        if (i15 == 0) {
            if (i17 == 0) {
                return Float.NaN;
            }
            i15 = 1;
        }
        if (z14) {
            i16 = (i18 - i17) - i15;
        }
        i23 = this.f21676iobyxmoadg;
        if (i23 < i14) {
            i25 = this.f21676iobyxmoadg + 1;
            this.f21676iobyxmoadg = i25;
            if (i25 == i14) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i25);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z15 = false;
                            z16 = false;
                            break;
                        default:
                            this.f21676iobyxmoadg--;
                            z16 = true;
                            z15 = false;
                            break;
                    }
                } else {
                    z15 = true;
                }
                if (!z16) {
                    i26 = this.f21676iobyxmoadg;
                    i27 = 0;
                    while (true) {
                        i28 = this.f21676iobyxmoadg;
                        if (i28 >= i14) {
                        }
                        i27 = (i27 * 10) + (cCharAt3 - '0');
                        this.f21676iobyxmoadg++;
                    }
                    if (this.f21676iobyxmoadg == i26) {
                        return Float.NaN;
                    }
                    if (z15) {
                        i16 -= i27;
                    } else {
                        i16 += i27;
                    }
                }
            } else {
                z15 = false;
            }
            this.f21676iobyxmoadg++;
            z16 = false;
            if (!z16) {
                i26 = this.f21676iobyxmoadg;
                i27 = 0;
                while (true) {
                    i28 = this.f21676iobyxmoadg;
                    if (i28 >= i14) {
                    }
                    i27 = (i27 * 10) + (cCharAt3 - '0');
                    this.f21676iobyxmoadg++;
                }
                if (this.f21676iobyxmoadg == i26) {
                    return Float.NaN;
                }
                if (z15) {
                    i16 -= i27;
                } else {
                    i16 += i27;
                }
            }
        }
        i24 = i15 + i16;
        if (i24 <= 39) {
        }
        return Float.NaN;
    }
}
