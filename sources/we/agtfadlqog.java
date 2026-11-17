package we;

/* JADX INFO: loaded from: classes2.dex */
final class agtfadlqog extends ppxfxbqfkf {
    agtfadlqog() {
    }

    @Override // we.ppxfxbqfkf
    public int eablkybsjg() {
        return 3;
    }

    @Override // we.ppxfxbqfkf
    void gxszxtbevo(nufgyqmvbu nufgyqmvbuVar, StringBuilder sb3) {
        nufgyqmvbuVar.rgvfuqvkyq();
        int iIobyxmoadg = nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg() - nufgyqmvbuVar.iobyxmoadg();
        nufgyqmvbuVar.f119448wkgbmnqykc -= sb3.length();
        if (nufgyqmvbuVar.gxszxtbevo() > 1 || iIobyxmoadg > 1 || nufgyqmvbuVar.gxszxtbevo() != iIobyxmoadg) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 254);
        }
        if (nufgyqmvbuVar.eablkybsjg() < 0) {
            nufgyqmvbuVar.ojitshcjhn(0);
        }
    }

    @Override // we.ppxfxbqfkf, we.lqeggnwhkg
    public void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        StringBuilder sb3 = new StringBuilder();
        while (nufgyqmvbuVar.dxjokdxxww()) {
            char cPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
            nufgyqmvbuVar.f119448wkgbmnqykc++;
            ppxfxbqfkf(cPpxfxbqfkf, sb3);
            if (sb3.length() % 3 == 0) {
                ppxfxbqfkf.lqeggnwhkg(nufgyqmvbuVar, sb3);
                if (btonecajqb.agtfadlqog(nufgyqmvbuVar.wkgbmnqykc(), nufgyqmvbuVar.f119448wkgbmnqykc, eablkybsjg()) != eablkybsjg()) {
                    nufgyqmvbuVar.ojitshcjhn(0);
                    break;
                }
            }
        }
        gxszxtbevo(nufgyqmvbuVar, sb3);
    }

    @Override // we.ppxfxbqfkf
    int ppxfxbqfkf(char c13, StringBuilder sb3) {
        if (c13 == '\r') {
            sb3.append((char) 0);
        } else if (c13 == ' ') {
            sb3.append((char) 3);
        } else if (c13 == '*') {
            sb3.append((char) 1);
        } else if (c13 == '>') {
            sb3.append((char) 2);
        } else if (c13 >= '0' && c13 <= '9') {
            sb3.append((char) (c13 - ','));
        } else if (c13 < 'A' || c13 > 'Z') {
            btonecajqb.eablkybsjg(c13);
        } else {
            sb3.append((char) (c13 - '3'));
        }
        return 1;
    }
}
