package we;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo implements lqeggnwhkg {
    gxszxtbevo() {
    }

    private static void eablkybsjg(nufgyqmvbu nufgyqmvbuVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                nufgyqmvbuVar.ojitshcjhn(0);
                return;
            }
            boolean z13 = true;
            if (length == 1) {
                nufgyqmvbuVar.rgvfuqvkyq();
                int iIobyxmoadg = nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg() - nufgyqmvbuVar.iobyxmoadg();
                int iGxszxtbevo = nufgyqmvbuVar.gxszxtbevo();
                if (iGxszxtbevo > iIobyxmoadg) {
                    nufgyqmvbuVar.vdvldrhtss(nufgyqmvbuVar.iobyxmoadg() + 1);
                    iIobyxmoadg = nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg() - nufgyqmvbuVar.iobyxmoadg();
                }
                if (iGxszxtbevo <= iIobyxmoadg && iIobyxmoadg <= 2) {
                    nufgyqmvbuVar.ojitshcjhn(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i13 = length - 1;
            String strPpxfxbqfkf = ppxfxbqfkf(charSequence);
            if (nufgyqmvbuVar.dxjokdxxww() || i13 > 2) {
                z13 = false;
            }
            if (i13 <= 2) {
                nufgyqmvbuVar.vdvldrhtss(nufgyqmvbuVar.iobyxmoadg() + i13);
                if (nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg() - nufgyqmvbuVar.iobyxmoadg() >= 3) {
                    nufgyqmvbuVar.vdvldrhtss(nufgyqmvbuVar.iobyxmoadg() + strPpxfxbqfkf.length());
                    z13 = false;
                }
            }
            if (z13) {
                nufgyqmvbuVar.gtknphoqwx();
                nufgyqmvbuVar.f119448wkgbmnqykc -= i13;
            } else {
                nufgyqmvbuVar.kcexrzcfyt(strPpxfxbqfkf);
            }
            nufgyqmvbuVar.ojitshcjhn(0);
        } catch (Throwable th2) {
            nufgyqmvbuVar.ojitshcjhn(0);
            throw th2;
        }
    }

    private static String ppxfxbqfkf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c13 = (char) ((iCharAt >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c14 = (char) ((iCharAt >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c15 = (char) (iCharAt & KotlinVersion.MAX_COMPONENT_VALUE);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c13);
        if (length >= 2) {
            sb3.append(c14);
        }
        if (length >= 3) {
            sb3.append(c15);
        }
        return sb3.toString();
    }

    private static void zoijcleaow(char c13, StringBuilder sb3) {
        if (c13 >= ' ' && c13 <= '?') {
            sb3.append(c13);
        } else if (c13 < '@' || c13 > '^') {
            btonecajqb.eablkybsjg(c13);
        } else {
            sb3.append((char) (c13 - '@'));
        }
    }

    @Override // we.lqeggnwhkg
    public void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        StringBuilder sb3 = new StringBuilder();
        while (nufgyqmvbuVar.dxjokdxxww()) {
            zoijcleaow(nufgyqmvbuVar.ppxfxbqfkf(), sb3);
            nufgyqmvbuVar.f119448wkgbmnqykc++;
            if (sb3.length() >= 4) {
                nufgyqmvbuVar.kcexrzcfyt(ppxfxbqfkf(sb3));
                sb3.delete(0, 4);
                if (btonecajqb.agtfadlqog(nufgyqmvbuVar.wkgbmnqykc(), nufgyqmvbuVar.f119448wkgbmnqykc, wkgbmnqykc()) != wkgbmnqykc()) {
                    nufgyqmvbuVar.ojitshcjhn(0);
                    break;
                }
            }
        }
        sb3.append((char) 31);
        eablkybsjg(nufgyqmvbuVar, sb3);
    }

    public int wkgbmnqykc() {
        return 4;
    }
}
