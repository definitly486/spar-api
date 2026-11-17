package we;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg implements lqeggnwhkg {
    iobyxmoadg() {
    }

    private static char zoijcleaow(char c13, char c14) {
        if (btonecajqb.gxszxtbevo(c13) && btonecajqb.gxszxtbevo(c14)) {
            return (char) (((c13 - '0') * 10) + (c14 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c13 + c14);
    }

    @Override // we.lqeggnwhkg
    public void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        if (btonecajqb.iobyxmoadg(nufgyqmvbuVar.wkgbmnqykc(), nufgyqmvbuVar.f119448wkgbmnqykc) >= 2) {
            nufgyqmvbuVar.oxmwwwfdhm(zoijcleaow(nufgyqmvbuVar.wkgbmnqykc().charAt(nufgyqmvbuVar.f119448wkgbmnqykc), nufgyqmvbuVar.wkgbmnqykc().charAt(nufgyqmvbuVar.f119448wkgbmnqykc + 1)));
            nufgyqmvbuVar.f119448wkgbmnqykc += 2;
            return;
        }
        char cPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
        int iAgtfadlqog = btonecajqb.agtfadlqog(nufgyqmvbuVar.wkgbmnqykc(), nufgyqmvbuVar.f119448wkgbmnqykc, ppxfxbqfkf());
        if (iAgtfadlqog == ppxfxbqfkf()) {
            if (!btonecajqb.lqeggnwhkg(cPpxfxbqfkf)) {
                nufgyqmvbuVar.oxmwwwfdhm((char) (cPpxfxbqfkf + 1));
                nufgyqmvbuVar.f119448wkgbmnqykc++;
                return;
            } else {
                nufgyqmvbuVar.oxmwwwfdhm((char) 235);
                nufgyqmvbuVar.oxmwwwfdhm((char) (cPpxfxbqfkf - 127));
                nufgyqmvbuVar.f119448wkgbmnqykc++;
                return;
            }
        }
        if (iAgtfadlqog == 1) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 230);
            nufgyqmvbuVar.ojitshcjhn(1);
            return;
        }
        if (iAgtfadlqog == 2) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 239);
            nufgyqmvbuVar.ojitshcjhn(2);
            return;
        }
        if (iAgtfadlqog == 3) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 238);
            nufgyqmvbuVar.ojitshcjhn(3);
        } else if (iAgtfadlqog == 4) {
            nufgyqmvbuVar.oxmwwwfdhm((char) 240);
            nufgyqmvbuVar.ojitshcjhn(4);
        } else {
            if (iAgtfadlqog != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iAgtfadlqog)));
            }
            nufgyqmvbuVar.oxmwwwfdhm((char) 231);
            nufgyqmvbuVar.ojitshcjhn(5);
        }
    }

    public int ppxfxbqfkf() {
        return 0;
    }
}
