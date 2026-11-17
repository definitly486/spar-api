package we;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes2.dex */
class ppxfxbqfkf implements lqeggnwhkg {
    ppxfxbqfkf() {
    }

    static void lqeggnwhkg(nufgyqmvbu nufgyqmvbuVar, StringBuilder sb3) {
        nufgyqmvbuVar.kcexrzcfyt(wkgbmnqykc(sb3));
        sb3.delete(0, 3);
    }

    private static String wkgbmnqykc(CharSequence charSequence) {
        int iCharAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (iCharAt / UserVerificationMethods.USER_VERIFY_HANDPRINT), (char) (iCharAt % UserVerificationMethods.USER_VERIFY_HANDPRINT)});
    }

    private int zoijcleaow(nufgyqmvbu nufgyqmvbuVar, StringBuilder sb3, StringBuilder sb4, int i13) {
        int length = sb3.length();
        sb3.delete(length - i13, length);
        nufgyqmvbuVar.f119448wkgbmnqykc--;
        int iPpxfxbqfkf = ppxfxbqfkf(nufgyqmvbuVar.ppxfxbqfkf(), sb4);
        nufgyqmvbuVar.gtknphoqwx();
        return iPpxfxbqfkf;
    }

    public int eablkybsjg() {
        return 1;
    }

    void gxszxtbevo(nufgyqmvbu nufgyqmvbuVar, StringBuilder sb3) {
        int length = (sb3.length() / 3) << 1;
        int length2 = sb3.length() % 3;
        int iIobyxmoadg = nufgyqmvbuVar.iobyxmoadg() + length;
        nufgyqmvbuVar.vdvldrhtss(iIobyxmoadg);
        int iIobyxmoadg2 = nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg() - iIobyxmoadg;
        if (length2 == 2) {
            sb3.append((char) 0);
            while (sb3.length() >= 3) {
                lqeggnwhkg(nufgyqmvbuVar, sb3);
            }
            if (nufgyqmvbuVar.dxjokdxxww()) {
                nufgyqmvbuVar.oxmwwwfdhm((char) 254);
            }
        } else if (iIobyxmoadg2 == 1 && length2 == 1) {
            while (sb3.length() >= 3) {
                lqeggnwhkg(nufgyqmvbuVar, sb3);
            }
            if (nufgyqmvbuVar.dxjokdxxww()) {
                nufgyqmvbuVar.oxmwwwfdhm((char) 254);
            }
            nufgyqmvbuVar.f119448wkgbmnqykc--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb3.length() >= 3) {
                lqeggnwhkg(nufgyqmvbuVar, sb3);
            }
            if (iIobyxmoadg2 > 0 || nufgyqmvbuVar.dxjokdxxww()) {
                nufgyqmvbuVar.oxmwwwfdhm((char) 254);
            }
        }
        nufgyqmvbuVar.ojitshcjhn(0);
    }

    @Override // we.lqeggnwhkg
    public void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        StringBuilder sb3 = new StringBuilder();
        while (nufgyqmvbuVar.dxjokdxxww()) {
            char cPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
            nufgyqmvbuVar.f119448wkgbmnqykc++;
            int iPpxfxbqfkf = ppxfxbqfkf(cPpxfxbqfkf, sb3);
            int iIobyxmoadg = nufgyqmvbuVar.iobyxmoadg() + ((sb3.length() / 3) << 1);
            nufgyqmvbuVar.vdvldrhtss(iIobyxmoadg);
            int iIobyxmoadg2 = nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg() - iIobyxmoadg;
            if (!nufgyqmvbuVar.dxjokdxxww()) {
                StringBuilder sb4 = new StringBuilder();
                if (sb3.length() % 3 == 2 && iIobyxmoadg2 != 2) {
                    iPpxfxbqfkf = zoijcleaow(nufgyqmvbuVar, sb3, sb4, iPpxfxbqfkf);
                }
                while (sb3.length() % 3 == 1 && (iPpxfxbqfkf > 3 || iIobyxmoadg2 != 1)) {
                    iPpxfxbqfkf = zoijcleaow(nufgyqmvbuVar, sb3, sb4, iPpxfxbqfkf);
                }
                break;
            }
            if (sb3.length() % 3 == 0 && btonecajqb.agtfadlqog(nufgyqmvbuVar.wkgbmnqykc(), nufgyqmvbuVar.f119448wkgbmnqykc, eablkybsjg()) != eablkybsjg()) {
                nufgyqmvbuVar.ojitshcjhn(0);
                break;
            }
        }
        gxszxtbevo(nufgyqmvbuVar, sb3);
    }

    int ppxfxbqfkf(char c13, StringBuilder sb3) {
        if (c13 == ' ') {
            sb3.append((char) 3);
            return 1;
        }
        if (c13 >= '0' && c13 <= '9') {
            sb3.append((char) (c13 - ','));
            return 1;
        }
        if (c13 >= 'A' && c13 <= 'Z') {
            sb3.append((char) (c13 - '3'));
            return 1;
        }
        if (c13 < ' ') {
            sb3.append((char) 0);
            sb3.append(c13);
            return 2;
        }
        if (c13 <= '/') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - '!'));
            return 2;
        }
        if (c13 <= '@') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - '+'));
            return 2;
        }
        if (c13 <= '_') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - 'E'));
            return 2;
        }
        if (c13 > 127) {
            sb3.append("\u0001\u001e");
            return ppxfxbqfkf((char) (c13 - 128), sb3) + 2;
        }
        sb3.append((char) 2);
        sb3.append((char) (c13 - '`'));
        return 2;
    }
}
