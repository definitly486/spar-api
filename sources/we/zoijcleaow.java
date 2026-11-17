package we;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow implements lqeggnwhkg {
    zoijcleaow() {
    }

    private static char ppxfxbqfkf(char c13, int i13) {
        int i14 = c13 + ((i13 * 149) % KotlinVersion.MAX_COMPONENT_VALUE) + 1;
        return i14 <= 255 ? (char) i14 : (char) (i14 - 256);
    }

    @Override // we.lqeggnwhkg
    public void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 0);
        while (nufgyqmvbuVar.dxjokdxxww()) {
            sb3.append(nufgyqmvbuVar.ppxfxbqfkf());
            nufgyqmvbuVar.f119448wkgbmnqykc++;
            if (btonecajqb.agtfadlqog(nufgyqmvbuVar.wkgbmnqykc(), nufgyqmvbuVar.f119448wkgbmnqykc, zoijcleaow()) != zoijcleaow()) {
                nufgyqmvbuVar.ojitshcjhn(0);
                break;
            }
        }
        int length = sb3.length() - 1;
        int iIobyxmoadg = nufgyqmvbuVar.iobyxmoadg() + length + 1;
        nufgyqmvbuVar.vdvldrhtss(iIobyxmoadg);
        boolean z13 = nufgyqmvbuVar.lqeggnwhkg().iobyxmoadg() - iIobyxmoadg > 0;
        if (nufgyqmvbuVar.dxjokdxxww() || z13) {
            if (length <= 249) {
                sb3.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb3.setCharAt(0, (char) ((length / 250) + 249));
                sb3.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb3.length();
        for (int i13 = 0; i13 < length2; i13++) {
            nufgyqmvbuVar.oxmwwwfdhm(ppxfxbqfkf(sb3.charAt(i13), nufgyqmvbuVar.iobyxmoadg() + 1));
        }
    }

    public int zoijcleaow() {
        return 5;
    }
}
