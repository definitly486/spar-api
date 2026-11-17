package u7;

import bl.gxszxtbevo;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
final class eablkybsjg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private long f112873cdpycssgdh;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private String f112874iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private int f112875istkbnxepw = 0;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final bl.eablkybsjg f112876pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f112877yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final bl.ppxfxbqfkf f112878zynmafqrjb;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private static final gxszxtbevo f112869lmojexxdyd = gxszxtbevo.dxjokdxxww("'\\");

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private static final gxszxtbevo f112871wwaezpbzkn = gxszxtbevo.dxjokdxxww("\"\\");

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private static final gxszxtbevo f112872ylkuphrtab = gxszxtbevo.dxjokdxxww("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private static final gxszxtbevo f112870pkzmftpjix = gxszxtbevo.dxjokdxxww("\n\r");

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private static final gxszxtbevo f112868hcddaimhww = gxszxtbevo.dxjokdxxww("*/");

    eablkybsjg(bl.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f112876pmvmpeiblj = eablkybsjgVar;
        this.f112878zynmafqrjb = eablkybsjgVar.iozdgvuglv();
        jyumaefscl(6);
    }

    private void cdpycssgdh() throws zoijcleaow {
        if (!this.f112880cqumvgiudr) {
            throw istkbnxepw("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private char crxdokpmqz() throws EOFException, zoijcleaow {
        int i13;
        if (!this.f112876pmvmpeiblj.lrnfpwlwnk(1L)) {
            throw istkbnxepw("Unterminated escape sequence");
        }
        byte b13 = this.f112878zynmafqrjb.readByte();
        if (b13 == 10 || b13 == 34 || b13 == 39 || b13 == 47 || b13 == 92) {
            return (char) b13;
        }
        if (b13 == 98) {
            return '\b';
        }
        if (b13 == 102) {
            return '\f';
        }
        if (b13 == 110) {
            return '\n';
        }
        if (b13 == 114) {
            return '\r';
        }
        if (b13 == 116) {
            return '\t';
        }
        if (b13 != 117) {
            if (this.f112880cqumvgiudr) {
                return (char) b13;
            }
            throw istkbnxepw("Invalid escape sequence: \\" + ((char) b13));
        }
        if (!this.f112876pmvmpeiblj.lrnfpwlwnk(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + gxszxtbevo());
        }
        char c13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            byte bAgtfadlqog = this.f112878zynmafqrjb.agtfadlqog(i14);
            char c14 = (char) (c13 << 4);
            if (bAgtfadlqog >= 48 && bAgtfadlqog <= 57) {
                i13 = bAgtfadlqog - 48;
            } else if (bAgtfadlqog >= 97 && bAgtfadlqog <= 102) {
                i13 = bAgtfadlqog - 87;
            } else {
                if (bAgtfadlqog < 65 || bAgtfadlqog > 70) {
                    throw istkbnxepw("\\u" + this.f112878zynmafqrjb.yzdjzghtvl(4L));
                }
                i13 = bAgtfadlqog - 55;
            }
            c13 = (char) (c14 + i13);
        }
        this.f112878zynmafqrjb.wflxmlrfwp(4L);
        return c13;
    }

    private boolean dsvhmnatus(int i13) throws zoijcleaow {
        if (i13 == 9 || i13 == 10 || i13 == 12 || i13 == 13 || i13 == 32) {
            return false;
        }
        if (i13 != 35) {
            if (i13 == 44) {
                return false;
            }
            if (i13 != 47 && i13 != 61) {
                if (i13 == 123 || i13 == 125 || i13 == 58) {
                    return false;
                }
                if (i13 != 59) {
                    switch (i13) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        cdpycssgdh();
        return false;
    }

    private int hkdspvbjdz(String str, ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) {
        int length = iobyxmoadgVar.f112886iobyxmoadg.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(iobyxmoadgVar.f112886iobyxmoadg[i13])) {
                this.f112875istkbnxepw = 0;
                this.f112883jyumaefscl[this.f112885zdlpuopuiu - 1] = str;
                return i13;
            }
        }
        return -1;
    }

    private void jlmebxxoox(gxszxtbevo gxszxtbevoVar) throws EOFException, zoijcleaow {
        while (true) {
            long jQ = this.f112876pmvmpeiblj.Q(gxszxtbevoVar);
            if (jQ == -1) {
                throw istkbnxepw("Unterminated string");
            }
            if (this.f112878zynmafqrjb.agtfadlqog(jQ) != 92) {
                this.f112878zynmafqrjb.wflxmlrfwp(jQ + 1);
                return;
            } else {
                this.f112878zynmafqrjb.wflxmlrfwp(jQ + 1);
                crxdokpmqz();
            }
        }
    }

    private String kegysxyocb(gxszxtbevo gxszxtbevoVar) throws EOFException, zoijcleaow {
        StringBuilder sb3 = null;
        while (true) {
            long jQ = this.f112876pmvmpeiblj.Q(gxszxtbevoVar);
            if (jQ == -1) {
                throw istkbnxepw("Unterminated string");
            }
            if (this.f112878zynmafqrjb.agtfadlqog(jQ) != 92) {
                if (sb3 == null) {
                    String strYzdjzghtvl = this.f112878zynmafqrjb.yzdjzghtvl(jQ);
                    this.f112878zynmafqrjb.readByte();
                    return strYzdjzghtvl;
                }
                sb3.append(this.f112878zynmafqrjb.yzdjzghtvl(jQ));
                this.f112878zynmafqrjb.readByte();
                return sb3.toString();
            }
            if (sb3 == null) {
                sb3 = new StringBuilder();
            }
            sb3.append(this.f112878zynmafqrjb.yzdjzghtvl(jQ));
            this.f112878zynmafqrjb.readByte();
            sb3.append(crxdokpmqz());
        }
    }

    private String mbcevpiqjq() {
        long jQ = this.f112876pmvmpeiblj.Q(f112872ylkuphrtab);
        return jQ != -1 ? this.f112878zynmafqrjb.yzdjzghtvl(jQ) : this.f112878zynmafqrjb.istkbnxepw();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int ntlheqmsrt() throws EOFException {
        String str;
        String str2;
        int i13;
        byte bAgtfadlqog = this.f112878zynmafqrjb.agtfadlqog(0L);
        if (bAgtfadlqog == 116 || bAgtfadlqog == 84) {
            str = "true";
            str2 = "TRUE";
            i13 = 5;
        } else if (bAgtfadlqog == 102 || bAgtfadlqog == 70) {
            str = "false";
            str2 = "FALSE";
            i13 = 6;
        } else {
            if (bAgtfadlqog != 110 && bAgtfadlqog != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i13 = 7;
        }
        int length = str.length();
        int i14 = 1;
        while (i14 < length) {
            int i15 = i14 + 1;
            if (!this.f112876pmvmpeiblj.lrnfpwlwnk(i15)) {
                return 0;
            }
            byte bAgtfadlqog2 = this.f112878zynmafqrjb.agtfadlqog(i14);
            if (bAgtfadlqog2 != str.charAt(i14) && bAgtfadlqog2 != str2.charAt(i14)) {
                return 0;
            }
            i14 = i15;
        }
        if (this.f112876pmvmpeiblj.lrnfpwlwnk(length + 1) && dsvhmnatus(this.f112878zynmafqrjb.agtfadlqog(length))) {
            return 0;
        }
        this.f112878zynmafqrjb.wflxmlrfwp(length);
        this.f112875istkbnxepw = i13;
        return i13;
    }

    private boolean okpsazkaxt() throws EOFException {
        bl.eablkybsjg eablkybsjgVar = this.f112876pmvmpeiblj;
        gxszxtbevo gxszxtbevoVar = f112868hcddaimhww;
        long jH = eablkybsjgVar.H(gxszxtbevoVar);
        boolean z13 = jH != -1;
        bl.ppxfxbqfkf ppxfxbqfkfVar = this.f112878zynmafqrjb;
        ppxfxbqfkfVar.wflxmlrfwp(z13 ? jH + ((long) gxszxtbevoVar.hcddaimhww()) : ppxfxbqfkfVar.dsvhmnatus());
        return z13;
    }

    private void rlfsiqarku() throws EOFException {
        long jQ = this.f112876pmvmpeiblj.Q(f112872ylkuphrtab);
        bl.ppxfxbqfkf ppxfxbqfkfVar = this.f112878zynmafqrjb;
        if (jQ == -1) {
            jQ = ppxfxbqfkfVar.dsvhmnatus();
        }
        ppxfxbqfkfVar.wflxmlrfwp(jQ);
    }

    private int ulzqkzuiru() throws EOFException {
        char c13;
        boolean z13 = true;
        long j13 = 0;
        int i13 = 0;
        char c14 = 0;
        boolean z14 = false;
        boolean z15 = true;
        while (true) {
            int i14 = i13 + 1;
            if (!this.f112876pmvmpeiblj.lrnfpwlwnk(i14)) {
                break;
            }
            byte bAgtfadlqog = this.f112878zynmafqrjb.agtfadlqog(i13);
            if (bAgtfadlqog != 43) {
                if (bAgtfadlqog == 69 || bAgtfadlqog == 101) {
                    if (c14 != 2 && c14 != 4) {
                        return 0;
                    }
                    c14 = 5;
                } else if (bAgtfadlqog == 45) {
                    c13 = 6;
                    if (c14 == 0) {
                        c14 = 1;
                        z14 = true;
                    } else if (c14 != 5) {
                        return 0;
                    }
                } else if (bAgtfadlqog != 46) {
                    if (bAgtfadlqog < 48 || bAgtfadlqog > 57) {
                        if (!dsvhmnatus(bAgtfadlqog)) {
                            break;
                        }
                        return 0;
                    }
                    if (c14 == z13 || c14 == 0) {
                        j13 = -(bAgtfadlqog - 48);
                        c14 = 2;
                    } else if (c14 == 2) {
                        if (j13 == 0) {
                            return 0;
                        }
                        long j14 = (10 * j13) - ((long) (bAgtfadlqog - 48));
                        z15 &= j13 > -922337203685477580L || (j13 == -922337203685477580L && j14 < j13);
                        j13 = j14;
                    } else if (c14 == 3) {
                        c14 = 4;
                    } else if (c14 == 5 || c14 == 6) {
                        c14 = 7;
                    }
                } else {
                    if (c14 != 2) {
                        return 0;
                    }
                    c14 = 3;
                }
                i13 = i14;
                z13 = true;
            } else {
                c13 = 6;
                if (c14 != 5) {
                    return 0;
                }
            }
            c14 = c13;
            i13 = i14;
            z13 = true;
        }
        if (c14 == 2 && z15 && ((j13 != Long.MIN_VALUE || z14) && (j13 != 0 || !z14))) {
            if (!z14) {
                j13 = -j13;
            }
            this.f112873cdpycssgdh = j13;
            this.f112878zynmafqrjb.wflxmlrfwp(i13);
            this.f112875istkbnxepw = 16;
            return 16;
        }
        if (c14 != 2 && c14 != 4 && c14 != 7) {
            return 0;
        }
        this.f112877yadqdtsiqt = i13;
        this.f112875istkbnxepw = 17;
        return 17;
    }

    private int wwaezpbzkn() throws EOFException, zoijcleaow {
        int[] iArr = this.f112884yggfygwlhe;
        int i13 = this.f112885zdlpuopuiu;
        int i14 = iArr[i13 - 1];
        if (i14 == 1) {
            iArr[i13 - 1] = 2;
        } else if (i14 == 2) {
            int iWypolnanlu = wypolnanlu(true);
            this.f112878zynmafqrjb.readByte();
            if (iWypolnanlu != 44) {
                if (iWypolnanlu != 59) {
                    if (iWypolnanlu != 93) {
                        throw istkbnxepw("Unterminated array");
                    }
                    this.f112875istkbnxepw = 4;
                    return 4;
                }
                cdpycssgdh();
            }
        } else {
            if (i14 == 3 || i14 == 5) {
                iArr[i13 - 1] = 4;
                if (i14 == 5) {
                    int iWypolnanlu2 = wypolnanlu(true);
                    this.f112878zynmafqrjb.readByte();
                    if (iWypolnanlu2 != 44) {
                        if (iWypolnanlu2 != 59) {
                            if (iWypolnanlu2 != 125) {
                                throw istkbnxepw("Unterminated object");
                            }
                            this.f112875istkbnxepw = 2;
                            return 2;
                        }
                        cdpycssgdh();
                    }
                }
                int iWypolnanlu3 = wypolnanlu(true);
                if (iWypolnanlu3 == 34) {
                    this.f112878zynmafqrjb.readByte();
                    this.f112875istkbnxepw = 13;
                    return 13;
                }
                if (iWypolnanlu3 == 39) {
                    this.f112878zynmafqrjb.readByte();
                    cdpycssgdh();
                    this.f112875istkbnxepw = 12;
                    return 12;
                }
                if (iWypolnanlu3 != 125) {
                    cdpycssgdh();
                    if (!dsvhmnatus((char) iWypolnanlu3)) {
                        throw istkbnxepw("Expected name");
                    }
                    this.f112875istkbnxepw = 14;
                    return 14;
                }
                if (i14 == 5) {
                    throw istkbnxepw("Expected name");
                }
                this.f112878zynmafqrjb.readByte();
                this.f112875istkbnxepw = 2;
                return 2;
            }
            if (i14 == 4) {
                iArr[i13 - 1] = 5;
                int iWypolnanlu4 = wypolnanlu(true);
                this.f112878zynmafqrjb.readByte();
                if (iWypolnanlu4 != 58) {
                    if (iWypolnanlu4 != 61) {
                        throw istkbnxepw("Expected ':'");
                    }
                    cdpycssgdh();
                    if (this.f112876pmvmpeiblj.lrnfpwlwnk(1L) && this.f112878zynmafqrjb.agtfadlqog(0L) == 62) {
                        this.f112878zynmafqrjb.readByte();
                    }
                }
            } else if (i14 == 6) {
                iArr[i13 - 1] = 7;
            } else if (i14 == 7) {
                if (wypolnanlu(false) == -1) {
                    this.f112875istkbnxepw = 18;
                    return 18;
                }
                cdpycssgdh();
            } else if (i14 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iWypolnanlu5 = wypolnanlu(true);
        if (iWypolnanlu5 == 34) {
            this.f112878zynmafqrjb.readByte();
            this.f112875istkbnxepw = 9;
            return 9;
        }
        if (iWypolnanlu5 == 39) {
            cdpycssgdh();
            this.f112878zynmafqrjb.readByte();
            this.f112875istkbnxepw = 8;
            return 8;
        }
        if (iWypolnanlu5 != 44 && iWypolnanlu5 != 59) {
            if (iWypolnanlu5 == 91) {
                this.f112878zynmafqrjb.readByte();
                this.f112875istkbnxepw = 3;
                return 3;
            }
            if (iWypolnanlu5 != 93) {
                if (iWypolnanlu5 == 123) {
                    this.f112878zynmafqrjb.readByte();
                    this.f112875istkbnxepw = 1;
                    return 1;
                }
                int iNtlheqmsrt = ntlheqmsrt();
                if (iNtlheqmsrt != 0) {
                    return iNtlheqmsrt;
                }
                int iUlzqkzuiru = ulzqkzuiru();
                if (iUlzqkzuiru != 0) {
                    return iUlzqkzuiru;
                }
                if (!dsvhmnatus(this.f112878zynmafqrjb.agtfadlqog(0L))) {
                    throw istkbnxepw("Expected value");
                }
                cdpycssgdh();
                this.f112875istkbnxepw = 10;
                return 10;
            }
            if (i14 == 1) {
                this.f112878zynmafqrjb.readByte();
                this.f112875istkbnxepw = 4;
                return 4;
            }
        }
        if (i14 != 1 && i14 != 2) {
            throw istkbnxepw("Unexpected value");
        }
        cdpycssgdh();
        this.f112875istkbnxepw = 7;
        return 7;
    }

    private int wypolnanlu(boolean z13) throws EOFException, zoijcleaow {
        byte bAgtfadlqog;
        while (true) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                if (!this.f112876pmvmpeiblj.lrnfpwlwnk(i14)) {
                    if (z13) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bAgtfadlqog = this.f112878zynmafqrjb.agtfadlqog(i13);
                if (bAgtfadlqog == 10 || bAgtfadlqog == 32 || bAgtfadlqog == 13 || bAgtfadlqog == 9) {
                    i13 = i14;
                }
            }
            this.f112878zynmafqrjb.wflxmlrfwp(i13);
            if (bAgtfadlqog == 47) {
                if (!this.f112876pmvmpeiblj.lrnfpwlwnk(2L)) {
                    return bAgtfadlqog;
                }
                cdpycssgdh();
                byte bAgtfadlqog2 = this.f112878zynmafqrjb.agtfadlqog(1L);
                if (bAgtfadlqog2 == 42) {
                    this.f112878zynmafqrjb.readByte();
                    this.f112878zynmafqrjb.readByte();
                    if (!okpsazkaxt()) {
                        throw istkbnxepw("Unterminated comment");
                    }
                } else {
                    if (bAgtfadlqog2 != 47) {
                        return bAgtfadlqog;
                    }
                    this.f112878zynmafqrjb.readByte();
                    this.f112878zynmafqrjb.readByte();
                    xrmfcynszj();
                }
            } else {
                if (bAgtfadlqog != 35) {
                    return bAgtfadlqog;
                }
                cdpycssgdh();
                xrmfcynszj();
            }
        }
    }

    private void xrmfcynszj() throws EOFException {
        long jQ = this.f112876pmvmpeiblj.Q(f112870pkzmftpjix);
        bl.ppxfxbqfkf ppxfxbqfkfVar = this.f112878zynmafqrjb;
        ppxfxbqfkfVar.wflxmlrfwp(jQ != -1 ? jQ + 1 : ppxfxbqfkfVar.dsvhmnatus());
    }

    @Override // u7.ppxfxbqfkf
    public double agtfadlqog() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 16) {
            this.f112875istkbnxepw = 0;
            int[] iArr = this.f112882iwizpuwonk;
            int i13 = this.f112885zdlpuopuiu - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f112873cdpycssgdh;
        }
        if (iWwaezpbzkn == 17) {
            this.f112874iozdgvuglv = this.f112878zynmafqrjb.yzdjzghtvl(this.f112877yadqdtsiqt);
        } else if (iWwaezpbzkn == 9) {
            this.f112874iozdgvuglv = kegysxyocb(f112871wwaezpbzkn);
        } else if (iWwaezpbzkn == 8) {
            this.f112874iozdgvuglv = kegysxyocb(f112869lmojexxdyd);
        } else if (iWwaezpbzkn == 10) {
            this.f112874iozdgvuglv = mbcevpiqjq();
        } else if (iWwaezpbzkn != 11) {
            throw new iobyxmoadg("Expected a double but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
        }
        this.f112875istkbnxepw = 11;
        try {
            double d13 = Double.parseDouble(this.f112874iozdgvuglv);
            if (this.f112880cqumvgiudr || !(Double.isNaN(d13) || Double.isInfinite(d13))) {
                this.f112874iozdgvuglv = null;
                this.f112875istkbnxepw = 0;
                int[] iArr2 = this.f112882iwizpuwonk;
                int i14 = this.f112885zdlpuopuiu - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return d13;
            }
            throw new zoijcleaow("JSON forbids NaN and infinities: " + d13 + " at path " + gxszxtbevo());
        } catch (NumberFormatException unused) {
            throw new iobyxmoadg("Expected a double but was " + this.f112874iozdgvuglv + " at path " + gxszxtbevo());
        }
    }

    @Override // u7.ppxfxbqfkf
    public boolean btonecajqb() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        return (iWwaezpbzkn == 2 || iWwaezpbzkn == 4 || iWwaezpbzkn == 18) ? false : true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f112875istkbnxepw = 0;
        this.f112884yggfygwlhe[0] = 8;
        this.f112885zdlpuopuiu = 1;
        this.f112878zynmafqrjb.iobyxmoadg();
        this.f112876pmvmpeiblj.close();
    }

    @Override // u7.ppxfxbqfkf
    public int cqumvgiudr(ppxfxbqfkf.iobyxmoadg iobyxmoadgVar) throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn < 12 || iWwaezpbzkn > 15) {
            return -1;
        }
        if (iWwaezpbzkn == 15) {
            return hkdspvbjdz(this.f112874iozdgvuglv, iobyxmoadgVar);
        }
        int iYggfygwlhe = this.f112876pmvmpeiblj.yggfygwlhe(iobyxmoadgVar.f112887zoijcleaow);
        if (iYggfygwlhe != -1) {
            this.f112875istkbnxepw = 0;
            this.f112883jyumaefscl[this.f112885zdlpuopuiu - 1] = iobyxmoadgVar.f112886iobyxmoadg[iYggfygwlhe];
            return iYggfygwlhe;
        }
        String str = this.f112883jyumaefscl[this.f112885zdlpuopuiu - 1];
        String strRgvfuqvkyq = rgvfuqvkyq();
        int iHkdspvbjdz = hkdspvbjdz(strRgvfuqvkyq, iobyxmoadgVar);
        if (iHkdspvbjdz == -1) {
            this.f112875istkbnxepw = 15;
            this.f112874iozdgvuglv = strRgvfuqvkyq;
            this.f112883jyumaefscl[this.f112885zdlpuopuiu - 1] = str;
        }
        return iHkdspvbjdz;
    }

    @Override // u7.ppxfxbqfkf
    public boolean draadjrbmk() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 5) {
            this.f112875istkbnxepw = 0;
            int[] iArr = this.f112882iwizpuwonk;
            int i13 = this.f112885zdlpuopuiu - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (iWwaezpbzkn == 6) {
            this.f112875istkbnxepw = 0;
            int[] iArr2 = this.f112882iwizpuwonk;
            int i14 = this.f112885zdlpuopuiu - 1;
            iArr2[i14] = iArr2[i14] + 1;
            return false;
        }
        throw new iobyxmoadg("Expected a boolean but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
    }

    @Override // u7.ppxfxbqfkf
    public void dxjokdxxww() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn != 2) {
            throw new iobyxmoadg("Expected END_OBJECT but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
        }
        int i13 = this.f112885zdlpuopuiu;
        int i14 = i13 - 1;
        this.f112885zdlpuopuiu = i14;
        this.f112883jyumaefscl[i14] = null;
        int[] iArr = this.f112882iwizpuwonk;
        int i15 = i13 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f112875istkbnxepw = 0;
    }

    @Override // u7.ppxfxbqfkf
    public void lereixgezr() throws EOFException, zoijcleaow {
        if (this.f112881esjtqupxsv) {
            throw new iobyxmoadg("Cannot skip unexpected " + zdlpuopuiu() + " at " + gxszxtbevo());
        }
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 14) {
            rlfsiqarku();
        } else if (iWwaezpbzkn == 13) {
            jlmebxxoox(f112871wwaezpbzkn);
        } else if (iWwaezpbzkn == 12) {
            jlmebxxoox(f112869lmojexxdyd);
        } else if (iWwaezpbzkn != 15) {
            throw new iobyxmoadg("Expected a name but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
        }
        this.f112875istkbnxepw = 0;
        this.f112883jyumaefscl[this.f112885zdlpuopuiu - 1] = "null";
    }

    @Override // u7.ppxfxbqfkf
    public void lqeggnwhkg() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 1) {
            jyumaefscl(3);
            this.f112875istkbnxepw = 0;
            return;
        }
        throw new iobyxmoadg("Expected BEGIN_OBJECT but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
    }

    @Override // u7.ppxfxbqfkf
    public void nufgyqmvbu() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn != 4) {
            throw new iobyxmoadg("Expected END_ARRAY but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
        }
        int i13 = this.f112885zdlpuopuiu;
        this.f112885zdlpuopuiu = i13 - 1;
        int[] iArr = this.f112882iwizpuwonk;
        int i14 = i13 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f112875istkbnxepw = 0;
    }

    @Override // u7.ppxfxbqfkf
    public int ojitshcjhn() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 16) {
            long j13 = this.f112873cdpycssgdh;
            int i13 = (int) j13;
            if (j13 == i13) {
                this.f112875istkbnxepw = 0;
                int[] iArr = this.f112882iwizpuwonk;
                int i14 = this.f112885zdlpuopuiu - 1;
                iArr[i14] = iArr[i14] + 1;
                return i13;
            }
            throw new iobyxmoadg("Expected an int but was " + this.f112873cdpycssgdh + " at path " + gxszxtbevo());
        }
        if (iWwaezpbzkn == 17) {
            this.f112874iozdgvuglv = this.f112878zynmafqrjb.yzdjzghtvl(this.f112877yadqdtsiqt);
        } else if (iWwaezpbzkn == 9 || iWwaezpbzkn == 8) {
            String strKegysxyocb = iWwaezpbzkn == 9 ? kegysxyocb(f112871wwaezpbzkn) : kegysxyocb(f112869lmojexxdyd);
            this.f112874iozdgvuglv = strKegysxyocb;
            try {
                int i15 = Integer.parseInt(strKegysxyocb);
                this.f112875istkbnxepw = 0;
                int[] iArr2 = this.f112882iwizpuwonk;
                int i16 = this.f112885zdlpuopuiu - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return i15;
            } catch (NumberFormatException unused) {
            }
        } else if (iWwaezpbzkn != 11) {
            throw new iobyxmoadg("Expected an int but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
        }
        this.f112875istkbnxepw = 11;
        try {
            double d13 = Double.parseDouble(this.f112874iozdgvuglv);
            int i17 = (int) d13;
            if (i17 == d13) {
                this.f112874iozdgvuglv = null;
                this.f112875istkbnxepw = 0;
                int[] iArr3 = this.f112882iwizpuwonk;
                int i18 = this.f112885zdlpuopuiu - 1;
                iArr3[i18] = iArr3[i18] + 1;
                return i17;
            }
            throw new iobyxmoadg("Expected an int but was " + this.f112874iozdgvuglv + " at path " + gxszxtbevo());
        } catch (NumberFormatException unused2) {
            throw new iobyxmoadg("Expected an int but was " + this.f112874iozdgvuglv + " at path " + gxszxtbevo());
        }
    }

    @Override // u7.ppxfxbqfkf
    public void pmvmpeiblj() throws EOFException, zoijcleaow {
        if (this.f112881esjtqupxsv) {
            throw new iobyxmoadg("Cannot skip unexpected " + zdlpuopuiu() + " at " + gxszxtbevo());
        }
        int i13 = 0;
        do {
            int iWwaezpbzkn = this.f112875istkbnxepw;
            if (iWwaezpbzkn == 0) {
                iWwaezpbzkn = wwaezpbzkn();
            }
            if (iWwaezpbzkn == 3) {
                jyumaefscl(1);
            } else {
                if (iWwaezpbzkn == 1) {
                    jyumaefscl(3);
                } else if (iWwaezpbzkn == 4) {
                    i13--;
                    if (i13 < 0) {
                        throw new iobyxmoadg("Expected a value but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
                    }
                    this.f112885zdlpuopuiu--;
                } else if (iWwaezpbzkn == 2) {
                    i13--;
                    if (i13 < 0) {
                        throw new iobyxmoadg("Expected a value but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
                    }
                    this.f112885zdlpuopuiu--;
                } else if (iWwaezpbzkn == 14 || iWwaezpbzkn == 10) {
                    rlfsiqarku();
                } else if (iWwaezpbzkn == 9 || iWwaezpbzkn == 13) {
                    jlmebxxoox(f112871wwaezpbzkn);
                } else if (iWwaezpbzkn == 8 || iWwaezpbzkn == 12) {
                    jlmebxxoox(f112869lmojexxdyd);
                } else if (iWwaezpbzkn == 17) {
                    this.f112878zynmafqrjb.wflxmlrfwp(this.f112877yadqdtsiqt);
                } else if (iWwaezpbzkn == 18) {
                    throw new iobyxmoadg("Expected a value but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
                }
                this.f112875istkbnxepw = 0;
            }
            i13++;
            this.f112875istkbnxepw = 0;
        } while (i13 != 0);
        int[] iArr = this.f112882iwizpuwonk;
        int i14 = this.f112885zdlpuopuiu;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f112883jyumaefscl[i14 - 1] = "null";
    }

    @Override // u7.ppxfxbqfkf
    public String rgvfuqvkyq() throws EOFException, zoijcleaow {
        String strKegysxyocb;
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 14) {
            strKegysxyocb = mbcevpiqjq();
        } else if (iWwaezpbzkn == 13) {
            strKegysxyocb = kegysxyocb(f112871wwaezpbzkn);
        } else if (iWwaezpbzkn == 12) {
            strKegysxyocb = kegysxyocb(f112869lmojexxdyd);
        } else {
            if (iWwaezpbzkn != 15) {
                throw new iobyxmoadg("Expected a name but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
            }
            strKegysxyocb = this.f112874iozdgvuglv;
        }
        this.f112875istkbnxepw = 0;
        this.f112883jyumaefscl[this.f112885zdlpuopuiu - 1] = strKegysxyocb;
        return strKegysxyocb;
    }

    public String toString() {
        return "JsonReader(" + this.f112876pmvmpeiblj + ")";
    }

    @Override // u7.ppxfxbqfkf
    public String vdvldrhtss() throws EOFException, zoijcleaow {
        String strYzdjzghtvl;
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 10) {
            strYzdjzghtvl = mbcevpiqjq();
        } else if (iWwaezpbzkn == 9) {
            strYzdjzghtvl = kegysxyocb(f112871wwaezpbzkn);
        } else if (iWwaezpbzkn == 8) {
            strYzdjzghtvl = kegysxyocb(f112869lmojexxdyd);
        } else if (iWwaezpbzkn == 11) {
            strYzdjzghtvl = this.f112874iozdgvuglv;
            this.f112874iozdgvuglv = null;
        } else if (iWwaezpbzkn == 16) {
            strYzdjzghtvl = Long.toString(this.f112873cdpycssgdh);
        } else {
            if (iWwaezpbzkn != 17) {
                throw new iobyxmoadg("Expected a string but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
            }
            strYzdjzghtvl = this.f112878zynmafqrjb.yzdjzghtvl(this.f112877yadqdtsiqt);
        }
        this.f112875istkbnxepw = 0;
        int[] iArr = this.f112882iwizpuwonk;
        int i13 = this.f112885zdlpuopuiu - 1;
        iArr[i13] = iArr[i13] + 1;
        return strYzdjzghtvl;
    }

    @Override // u7.ppxfxbqfkf
    public void wkgbmnqykc() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        if (iWwaezpbzkn == 3) {
            jyumaefscl(1);
            this.f112882iwizpuwonk[this.f112885zdlpuopuiu - 1] = 0;
            this.f112875istkbnxepw = 0;
        } else {
            throw new iobyxmoadg("Expected BEGIN_ARRAY but was " + zdlpuopuiu() + " at path " + gxszxtbevo());
        }
    }

    @Override // u7.ppxfxbqfkf
    public ppxfxbqfkf.zoijcleaow zdlpuopuiu() throws EOFException, zoijcleaow {
        int iWwaezpbzkn = this.f112875istkbnxepw;
        if (iWwaezpbzkn == 0) {
            iWwaezpbzkn = wwaezpbzkn();
        }
        switch (iWwaezpbzkn) {
            case 1:
                return ppxfxbqfkf.zoijcleaow.BEGIN_OBJECT;
            case 2:
                return ppxfxbqfkf.zoijcleaow.END_OBJECT;
            case 3:
                return ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY;
            case 4:
                return ppxfxbqfkf.zoijcleaow.END_ARRAY;
            case 5:
            case 6:
                return ppxfxbqfkf.zoijcleaow.BOOLEAN;
            case 7:
                return ppxfxbqfkf.zoijcleaow.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return ppxfxbqfkf.zoijcleaow.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return ppxfxbqfkf.zoijcleaow.NAME;
            case 16:
            case 17:
                return ppxfxbqfkf.zoijcleaow.NUMBER;
            case 18:
                return ppxfxbqfkf.zoijcleaow.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
