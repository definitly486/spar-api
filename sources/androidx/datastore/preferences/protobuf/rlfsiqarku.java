package androidx.datastore.preferences.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
abstract class rlfsiqarku {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final zoijcleaow f8803iobyxmoadg;

    static final class eablkybsjg extends zoijcleaow {
        eablkybsjg() {
        }

        static boolean eablkybsjg() {
            return metgxyhuhe.istkbnxepw() && metgxyhuhe.cdpycssgdh();
        }

        private static int gxszxtbevo(byte[] bArr, long j13, int i13) {
            int iLqeggnwhkg = lqeggnwhkg(bArr, j13, i13);
            int i14 = i13 - iLqeggnwhkg;
            long j14 = j13 + ((long) iLqeggnwhkg);
            while (true) {
                byte bKcexrzcfyt = 0;
                while (i14 > 0) {
                    long j15 = j14 + 1;
                    bKcexrzcfyt = metgxyhuhe.kcexrzcfyt(bArr, j14);
                    if (bKcexrzcfyt < 0) {
                        j14 = j15;
                        break;
                    }
                    i14--;
                    j14 = j15;
                }
                if (i14 == 0) {
                    return 0;
                }
                int i15 = i14 - 1;
                if (bKcexrzcfyt < -32) {
                    if (i15 == 0) {
                        return bKcexrzcfyt;
                    }
                    i14 -= 2;
                    if (bKcexrzcfyt >= -62) {
                        long j16 = 1 + j14;
                        if (metgxyhuhe.kcexrzcfyt(bArr, j14) <= -65) {
                            j14 = j16;
                        }
                    }
                    return -1;
                }
                if (bKcexrzcfyt >= -16) {
                    if (i15 < 3) {
                        return nufgyqmvbu(bArr, bKcexrzcfyt, j14, i15);
                    }
                    i14 -= 4;
                    long j17 = 1 + j14;
                    byte bKcexrzcfyt2 = metgxyhuhe.kcexrzcfyt(bArr, j14);
                    if (bKcexrzcfyt2 <= -65 && (((bKcexrzcfyt << 28) + (bKcexrzcfyt2 + 112)) >> 30) == 0) {
                        long j18 = 2 + j14;
                        if (metgxyhuhe.kcexrzcfyt(bArr, j17) <= -65) {
                            j14 += 3;
                            if (metgxyhuhe.kcexrzcfyt(bArr, j18) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i15 < 2) {
                    return nufgyqmvbu(bArr, bKcexrzcfyt, j14, i15);
                }
                i14 -= 3;
                long j19 = 1 + j14;
                byte bKcexrzcfyt3 = metgxyhuhe.kcexrzcfyt(bArr, j14);
                if (bKcexrzcfyt3 <= -65 && ((bKcexrzcfyt != -32 || bKcexrzcfyt3 >= -96) && (bKcexrzcfyt != -19 || bKcexrzcfyt3 < -96))) {
                    j14 += 2;
                    if (metgxyhuhe.kcexrzcfyt(bArr, j19) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int lqeggnwhkg(byte[] bArr, long j13, int i13) {
            int i14 = 0;
            if (i13 < 16) {
                return 0;
            }
            while (i14 < i13) {
                long j14 = 1 + j13;
                if (metgxyhuhe.kcexrzcfyt(bArr, j13) < 0) {
                    return i14;
                }
                i14++;
                j13 = j14;
            }
            return i13;
        }

        private static int nufgyqmvbu(byte[] bArr, int i13, long j13, int i14) {
            if (i14 == 0) {
                return rlfsiqarku.dxjokdxxww(i13);
            }
            if (i14 == 1) {
                return rlfsiqarku.btonecajqb(i13, metgxyhuhe.kcexrzcfyt(bArr, j13));
            }
            if (i14 == 2) {
                return rlfsiqarku.gtknphoqwx(i13, metgxyhuhe.kcexrzcfyt(bArr, j13), metgxyhuhe.kcexrzcfyt(bArr, j13 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow
        String iobyxmoadg(byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException {
            if ((i13 | i14 | ((bArr.length - i13) - i14)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            int i15 = i13 + i14;
            char[] cArr = new char[i14];
            int i16 = 0;
            while (i13 < i15) {
                byte bKcexrzcfyt = metgxyhuhe.kcexrzcfyt(bArr, i13);
                if (!iobyxmoadg.agtfadlqog(bKcexrzcfyt)) {
                    break;
                }
                i13++;
                iobyxmoadg.dxjokdxxww(bKcexrzcfyt, cArr, i16);
                i16++;
            }
            int i17 = i16;
            while (i13 < i15) {
                int i18 = i13 + 1;
                byte bKcexrzcfyt2 = metgxyhuhe.kcexrzcfyt(bArr, i13);
                if (iobyxmoadg.agtfadlqog(bKcexrzcfyt2)) {
                    int i19 = i17 + 1;
                    iobyxmoadg.dxjokdxxww(bKcexrzcfyt2, cArr, i17);
                    while (i18 < i15) {
                        byte bKcexrzcfyt3 = metgxyhuhe.kcexrzcfyt(bArr, i18);
                        if (!iobyxmoadg.agtfadlqog(bKcexrzcfyt3)) {
                            break;
                        }
                        i18++;
                        iobyxmoadg.dxjokdxxww(bKcexrzcfyt3, cArr, i19);
                        i19++;
                    }
                    i17 = i19;
                    i13 = i18;
                } else if (iobyxmoadg.rgvfuqvkyq(bKcexrzcfyt2)) {
                    if (i18 >= i15) {
                        throw InvalidProtocolBufferException.lqeggnwhkg();
                    }
                    i13 += 2;
                    iobyxmoadg.gtknphoqwx(bKcexrzcfyt2, metgxyhuhe.kcexrzcfyt(bArr, i18), cArr, i17);
                    i17++;
                } else if (iobyxmoadg.ojitshcjhn(bKcexrzcfyt2)) {
                    if (i18 >= i15 - 1) {
                        throw InvalidProtocolBufferException.lqeggnwhkg();
                    }
                    int i23 = i13 + 2;
                    i13 += 3;
                    iobyxmoadg.btonecajqb(bKcexrzcfyt2, metgxyhuhe.kcexrzcfyt(bArr, i18), metgxyhuhe.kcexrzcfyt(bArr, i23), cArr, i17);
                    i17++;
                } else {
                    if (i18 >= i15 - 2) {
                        throw InvalidProtocolBufferException.lqeggnwhkg();
                    }
                    byte bKcexrzcfyt4 = metgxyhuhe.kcexrzcfyt(bArr, i18);
                    int i24 = i13 + 3;
                    byte bKcexrzcfyt5 = metgxyhuhe.kcexrzcfyt(bArr, i13 + 2);
                    i13 += 4;
                    iobyxmoadg.nufgyqmvbu(bKcexrzcfyt2, bKcexrzcfyt4, bKcexrzcfyt5, metgxyhuhe.kcexrzcfyt(bArr, i24), cArr, i17);
                    i17 += 2;
                }
            }
            return new String(cArr, 0, i17);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int wkgbmnqykc(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = androidx.datastore.preferences.protobuf.rlfsiqarku.iobyxmoadg(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = androidx.datastore.preferences.protobuf.rlfsiqarku.iobyxmoadg(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = androidx.datastore.preferences.protobuf.metgxyhuhe.kcexrzcfyt(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = gxszxtbevo(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.rlfsiqarku.eablkybsjg.wkgbmnqykc(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow
        int zoijcleaow(CharSequence charSequence, byte[] bArr, int i13, int i14) {
            long j13;
            String str;
            String str2;
            int i15;
            long j14;
            char cCharAt;
            long j15 = i13;
            long j16 = ((long) i14) + j15;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i14 || bArr.length - i14 < i13) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i13 + i14));
            }
            int i16 = 0;
            while (true) {
                j13 = 1;
                if (i16 >= length || (cCharAt = charSequence.charAt(i16)) >= 128) {
                    break;
                }
                metgxyhuhe.wwaezpbzkn(bArr, j15, (byte) cCharAt);
                i16++;
                j15 = 1 + j15;
            }
            if (i16 == length) {
                return (int) j15;
            }
            while (i16 < length) {
                char cCharAt2 = charSequence.charAt(i16);
                if (cCharAt2 >= 128 || j15 >= j16) {
                    if (cCharAt2 >= 2048 || j15 > j16 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j15 > j16 - 3) {
                            if (j15 > j16 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i15 = i16 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i15)))) {
                                    throw new wkgbmnqykc(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j15);
                            }
                            int i17 = i16 + 1;
                            if (i17 != length) {
                                char cCharAt3 = charSequence.charAt(i17);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j14 = 1;
                                    metgxyhuhe.wwaezpbzkn(bArr, j15, (byte) ((codePoint >>> 18) | 240));
                                    metgxyhuhe.wwaezpbzkn(bArr, j15 + 1, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    long j17 = j15 + 3;
                                    metgxyhuhe.wwaezpbzkn(bArr, j15 + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    j15 += 4;
                                    metgxyhuhe.wwaezpbzkn(bArr, j17, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                    i16 = i17;
                                } else {
                                    i16 = i17;
                                }
                            }
                            throw new wkgbmnqykc(i16 - 1, length);
                        }
                        metgxyhuhe.wwaezpbzkn(bArr, j15, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j18 = j15 + 2;
                        metgxyhuhe.wwaezpbzkn(bArr, j15 + 1, (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                        j15 += 3;
                        metgxyhuhe.wwaezpbzkn(bArr, j18, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j19 = j15 + j13;
                        metgxyhuhe.wwaezpbzkn(bArr, j15, (byte) ((cCharAt2 >>> 6) | 960));
                        j15 += 2;
                        metgxyhuhe.wwaezpbzkn(bArr, j19, (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    }
                    j14 = 1;
                } else {
                    metgxyhuhe.wwaezpbzkn(bArr, j15, (byte) cCharAt2);
                    str2 = str4;
                    j14 = j13;
                    j15 += j13;
                    str = str3;
                }
                i16++;
                str3 = str;
                str4 = str2;
                j13 = j14;
                j16 = j16;
            }
            return (int) j15;
        }
    }

    private static class iobyxmoadg {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean agtfadlqog(byte b13) {
            return b13 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void btonecajqb(byte b13, byte b14, byte b15, char[] cArr, int i13) throws InvalidProtocolBufferException {
            if (wflxmlrfwp(b14) || ((b13 == -32 && b14 < -96) || ((b13 == -19 && b14 >= -96) || wflxmlrfwp(b15)))) {
                throw InvalidProtocolBufferException.lqeggnwhkg();
            }
            cArr[i13] = (char) (((b13 & 15) << 12) | (oxmwwwfdhm(b14) << 6) | oxmwwwfdhm(b15));
        }

        private static char draadjrbmk(int i13) {
            return (char) ((i13 >>> 10) + 55232);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void dxjokdxxww(byte b13, char[] cArr, int i13) {
            cArr[i13] = (char) b13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void gtknphoqwx(byte b13, byte b14, char[] cArr, int i13) throws InvalidProtocolBufferException {
            if (b13 < -62 || wflxmlrfwp(b14)) {
                throw InvalidProtocolBufferException.lqeggnwhkg();
            }
            cArr[i13] = (char) (((b13 & 31) << 6) | oxmwwwfdhm(b14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void nufgyqmvbu(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) throws InvalidProtocolBufferException {
            if (wflxmlrfwp(b14) || (((b13 << 28) + (b14 + 112)) >> 30) != 0 || wflxmlrfwp(b15) || wflxmlrfwp(b16)) {
                throw InvalidProtocolBufferException.lqeggnwhkg();
            }
            int iOxmwwwfdhm = ((b13 & 7) << 18) | (oxmwwwfdhm(b14) << 12) | (oxmwwwfdhm(b15) << 6) | oxmwwwfdhm(b16);
            cArr[i13] = draadjrbmk(iOxmwwwfdhm);
            cArr[i13 + 1] = vdvldrhtss(iOxmwwwfdhm);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ojitshcjhn(byte b13) {
            return b13 < -16;
        }

        private static int oxmwwwfdhm(byte b13) {
            return b13 & 63;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean rgvfuqvkyq(byte b13) {
            return b13 < -32;
        }

        private static char vdvldrhtss(int i13) {
            return (char) ((i13 & 1023) + 56320);
        }

        private static boolean wflxmlrfwp(byte b13) {
            return b13 > -65;
        }
    }

    static final class ppxfxbqfkf extends zoijcleaow {
        ppxfxbqfkf() {
        }

        private static int eablkybsjg(byte[] bArr, int i13, int i14) {
            while (i13 < i14 && bArr[i13] >= 0) {
                i13++;
            }
            if (i13 >= i14) {
                return 0;
            }
            return gxszxtbevo(bArr, i13, i14);
        }

        private static int gxszxtbevo(byte[] bArr, int i13, int i14) {
            while (i13 < i14) {
                int i15 = i13 + 1;
                byte b13 = bArr[i13];
                if (b13 < 0) {
                    if (b13 < -32) {
                        if (i15 >= i14) {
                            return b13;
                        }
                        if (b13 >= -62) {
                            i13 += 2;
                            if (bArr[i15] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b13 >= -16) {
                        if (i15 >= i14 - 2) {
                            return rlfsiqarku.draadjrbmk(bArr, i15, i14);
                        }
                        int i16 = i13 + 2;
                        byte b14 = bArr[i15];
                        if (b14 <= -65 && (((b13 << 28) + (b14 + 112)) >> 30) == 0) {
                            int i17 = i13 + 3;
                            if (bArr[i16] <= -65) {
                                i13 += 4;
                                if (bArr[i17] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i15 >= i14 - 1) {
                        return rlfsiqarku.draadjrbmk(bArr, i15, i14);
                    }
                    int i18 = i13 + 2;
                    byte b15 = bArr[i15];
                    if (b15 <= -65 && ((b13 != -32 || b15 >= -96) && (b13 != -19 || b15 < -96))) {
                        i13 += 3;
                        if (bArr[i18] > -65) {
                        }
                    }
                    return -1;
                }
                i13 = i15;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow
        String iobyxmoadg(byte[] bArr, int i13, int i14) throws InvalidProtocolBufferException {
            if ((i13 | i14 | ((bArr.length - i13) - i14)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i13), Integer.valueOf(i14)));
            }
            int i15 = i13 + i14;
            char[] cArr = new char[i14];
            int i16 = 0;
            while (i13 < i15) {
                byte b13 = bArr[i13];
                if (!iobyxmoadg.agtfadlqog(b13)) {
                    break;
                }
                i13++;
                iobyxmoadg.dxjokdxxww(b13, cArr, i16);
                i16++;
            }
            int i17 = i16;
            while (i13 < i15) {
                int i18 = i13 + 1;
                byte b14 = bArr[i13];
                if (iobyxmoadg.agtfadlqog(b14)) {
                    int i19 = i17 + 1;
                    iobyxmoadg.dxjokdxxww(b14, cArr, i17);
                    while (i18 < i15) {
                        byte b15 = bArr[i18];
                        if (!iobyxmoadg.agtfadlqog(b15)) {
                            break;
                        }
                        i18++;
                        iobyxmoadg.dxjokdxxww(b15, cArr, i19);
                        i19++;
                    }
                    i17 = i19;
                    i13 = i18;
                } else if (iobyxmoadg.rgvfuqvkyq(b14)) {
                    if (i18 >= i15) {
                        throw InvalidProtocolBufferException.lqeggnwhkg();
                    }
                    i13 += 2;
                    iobyxmoadg.gtknphoqwx(b14, bArr[i18], cArr, i17);
                    i17++;
                } else if (iobyxmoadg.ojitshcjhn(b14)) {
                    if (i18 >= i15 - 1) {
                        throw InvalidProtocolBufferException.lqeggnwhkg();
                    }
                    int i23 = i13 + 2;
                    i13 += 3;
                    iobyxmoadg.btonecajqb(b14, bArr[i18], bArr[i23], cArr, i17);
                    i17++;
                } else {
                    if (i18 >= i15 - 2) {
                        throw InvalidProtocolBufferException.lqeggnwhkg();
                    }
                    byte b16 = bArr[i18];
                    int i24 = i13 + 3;
                    byte b17 = bArr[i13 + 2];
                    i13 += 4;
                    iobyxmoadg.nufgyqmvbu(b14, b16, b17, bArr[i24], cArr, i17);
                    i17 += 2;
                }
            }
            return new String(cArr, 0, i17);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int wkgbmnqykc(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.rlfsiqarku.iobyxmoadg(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.rlfsiqarku.iobyxmoadg(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = eablkybsjg(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.rlfsiqarku.ppxfxbqfkf.wkgbmnqykc(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.rlfsiqarku.zoijcleaow
        int zoijcleaow(CharSequence charSequence, byte[] bArr, int i13, int i14) {
            int i15;
            int i16;
            char cCharAt;
            int length = charSequence.length();
            int i17 = i14 + i13;
            int i18 = 0;
            while (i18 < length && (i16 = i18 + i13) < i17 && (cCharAt = charSequence.charAt(i18)) < 128) {
                bArr[i16] = (byte) cCharAt;
                i18++;
            }
            if (i18 == length) {
                return i13 + length;
            }
            int i19 = i13 + i18;
            while (i18 < length) {
                char cCharAt2 = charSequence.charAt(i18);
                if (cCharAt2 < 128 && i19 < i17) {
                    bArr[i19] = (byte) cCharAt2;
                    i19++;
                } else if (cCharAt2 < 2048 && i19 <= i17 - 2) {
                    int i23 = i19 + 1;
                    bArr[i19] = (byte) ((cCharAt2 >>> 6) | 960);
                    i19 += 2;
                    bArr[i23] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i19 > i17 - 3) {
                        if (i19 > i17 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i15 = i18 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i15)))) {
                                throw new wkgbmnqykc(i18, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i19);
                        }
                        int i24 = i18 + 1;
                        if (i24 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i24);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i19] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i19 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i25 = i19 + 3;
                                bArr[i19 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i19 += 4;
                                bArr[i25] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i18 = i24;
                            } else {
                                i18 = i24;
                            }
                        }
                        throw new wkgbmnqykc(i18 - 1, length);
                    }
                    bArr[i19] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i26 = i19 + 2;
                    bArr[i19 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i19 += 3;
                    bArr[i26] = (byte) ((cCharAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                }
                i18++;
            }
            return i19;
        }
    }

    static class wkgbmnqykc extends IllegalArgumentException {
        wkgbmnqykc(int i13, int i14) {
            super("Unpaired surrogate at index " + i13 + " of " + i14);
        }
    }

    static abstract class zoijcleaow {
        zoijcleaow() {
        }

        abstract String iobyxmoadg(byte[] bArr, int i13, int i14);

        final boolean ppxfxbqfkf(byte[] bArr, int i13, int i14) {
            return wkgbmnqykc(0, bArr, i13, i14) == 0;
        }

        abstract int wkgbmnqykc(int i13, byte[] bArr, int i14, int i15);

        abstract int zoijcleaow(CharSequence charSequence, byte[] bArr, int i13, int i14);
    }

    static {
        f8803iobyxmoadg = (!eablkybsjg.eablkybsjg() || androidx.datastore.preferences.protobuf.wkgbmnqykc.ppxfxbqfkf()) ? new ppxfxbqfkf() : new eablkybsjg();
    }

    public static boolean agtfadlqog(byte[] bArr, int i13, int i14) {
        return f8803iobyxmoadg.ppxfxbqfkf(bArr, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int btonecajqb(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int draadjrbmk(byte[] bArr, int i13, int i14) {
        byte b13 = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            return dxjokdxxww(b13);
        }
        if (i15 == 1) {
            return btonecajqb(b13, bArr[i13]);
        }
        if (i15 == 2) {
            return gtknphoqwx(b13, bArr[i13], bArr[i13 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int dxjokdxxww(int i13) {
        if (i13 > -12) {
            return -1;
        }
        return i13;
    }

    static String eablkybsjg(byte[] bArr, int i13, int i14) {
        return f8803iobyxmoadg.iobyxmoadg(bArr, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gtknphoqwx(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }

    static int gxszxtbevo(CharSequence charSequence, byte[] bArr, int i13, int i14) {
        return f8803iobyxmoadg.zoijcleaow(charSequence, bArr, i13, i14);
    }

    static int lqeggnwhkg(CharSequence charSequence) {
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < length && charSequence.charAt(i13) < 128) {
            i13++;
        }
        int iNufgyqmvbu = length;
        while (i13 < length) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt >= 2048) {
                iNufgyqmvbu += nufgyqmvbu(charSequence, i13);
                break;
            }
            iNufgyqmvbu += (127 - cCharAt) >>> 31;
            i13++;
        }
        if (iNufgyqmvbu >= length) {
            return iNufgyqmvbu;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iNufgyqmvbu) + 4294967296L));
    }

    private static int nufgyqmvbu(CharSequence charSequence, int i13) {
        int length = charSequence.length();
        int i14 = 0;
        while (i13 < length) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt < 2048) {
                i14 += (127 - cCharAt) >>> 31;
            } else {
                i14 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i13) < 65536) {
                        throw new wkgbmnqykc(i13, length);
                    }
                    i13++;
                }
            }
            i13++;
        }
        return i14;
    }

    public static boolean wflxmlrfwp(byte[] bArr) {
        return f8803iobyxmoadg.ppxfxbqfkf(bArr, 0, bArr.length);
    }
}
