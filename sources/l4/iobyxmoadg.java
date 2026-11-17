package l4;

import androidx.media3.common.ParserException;
import java.util.ArrayDeque;
import t3.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f61555eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f61556gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private long f61558lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private l4.zoijcleaow f61560wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f61557iobyxmoadg = new byte[8];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ArrayDeque f61561zoijcleaow = new ArrayDeque();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lqeggnwhkg f61559ppxfxbqfkf = new lqeggnwhkg();

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f61562iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long f61563zoijcleaow;

        private zoijcleaow(int i13, long j13) {
            this.f61562iobyxmoadg = i13;
            this.f61563zoijcleaow = j13;
        }
    }

    private double eablkybsjg(vdvldrhtss vdvldrhtssVar, int i13) {
        long jGxszxtbevo = gxszxtbevo(vdvldrhtssVar, i13);
        return i13 == 4 ? Float.intBitsToFloat((int) jGxszxtbevo) : Double.longBitsToDouble(jGxszxtbevo);
    }

    private long gxszxtbevo(vdvldrhtss vdvldrhtssVar, int i13) {
        vdvldrhtssVar.readFully(this.f61557iobyxmoadg, 0, i13);
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            j13 = (j13 << 8) | ((long) (this.f61557iobyxmoadg[i14] & 255));
        }
        return j13;
    }

    private static String lqeggnwhkg(vdvldrhtss vdvldrhtssVar, int i13) {
        if (i13 == 0) {
            return "";
        }
        byte[] bArr = new byte[i13];
        vdvldrhtssVar.readFully(bArr, 0, i13);
        while (i13 > 0 && bArr[i13 - 1] == 0) {
            i13--;
        }
        return new String(bArr, 0, i13);
    }

    private long wkgbmnqykc(vdvldrhtss vdvldrhtssVar) {
        vdvldrhtssVar.gxszxtbevo();
        while (true) {
            vdvldrhtssVar.ojitshcjhn(this.f61557iobyxmoadg, 0, 4);
            int iPpxfxbqfkf = lqeggnwhkg.ppxfxbqfkf(this.f61557iobyxmoadg[0]);
            if (iPpxfxbqfkf != -1 && iPpxfxbqfkf <= 4) {
                int iIobyxmoadg = (int) lqeggnwhkg.iobyxmoadg(this.f61557iobyxmoadg, iPpxfxbqfkf, false);
                if (this.f61560wkgbmnqykc.gxszxtbevo(iIobyxmoadg)) {
                    vdvldrhtssVar.draadjrbmk(iPpxfxbqfkf);
                    return iIobyxmoadg;
                }
            }
            vdvldrhtssVar.draadjrbmk(1);
        }
    }

    @Override // l4.ppxfxbqfkf
    public boolean iobyxmoadg(vdvldrhtss vdvldrhtssVar) throws ParserException {
        y2.iobyxmoadg.dxjokdxxww(this.f61560wkgbmnqykc);
        while (true) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f61561zoijcleaow.peek();
            if (zoijcleaowVar != null && vdvldrhtssVar.getPosition() >= zoijcleaowVar.f61563zoijcleaow) {
                this.f61560wkgbmnqykc.iobyxmoadg(((zoijcleaow) this.f61561zoijcleaow.pop()).f61562iobyxmoadg);
                return true;
            }
            if (this.f61555eablkybsjg == 0) {
                long jWkgbmnqykc = this.f61559ppxfxbqfkf.wkgbmnqykc(vdvldrhtssVar, true, false, 4);
                if (jWkgbmnqykc == -2) {
                    jWkgbmnqykc = wkgbmnqykc(vdvldrhtssVar);
                }
                if (jWkgbmnqykc == -1) {
                    return false;
                }
                this.f61556gxszxtbevo = (int) jWkgbmnqykc;
                this.f61555eablkybsjg = 1;
            }
            if (this.f61555eablkybsjg == 1) {
                this.f61558lqeggnwhkg = this.f61559ppxfxbqfkf.wkgbmnqykc(vdvldrhtssVar, false, true, 8);
                this.f61555eablkybsjg = 2;
            }
            int iEablkybsjg = this.f61560wkgbmnqykc.eablkybsjg(this.f61556gxszxtbevo);
            if (iEablkybsjg != 0) {
                if (iEablkybsjg == 1) {
                    long position = vdvldrhtssVar.getPosition();
                    this.f61561zoijcleaow.push(new zoijcleaow(this.f61556gxszxtbevo, this.f61558lqeggnwhkg + position));
                    this.f61560wkgbmnqykc.nufgyqmvbu(this.f61556gxszxtbevo, position, this.f61558lqeggnwhkg);
                    this.f61555eablkybsjg = 0;
                    return true;
                }
                if (iEablkybsjg == 2) {
                    long j13 = this.f61558lqeggnwhkg;
                    if (j13 <= 8) {
                        this.f61560wkgbmnqykc.wkgbmnqykc(this.f61556gxszxtbevo, gxszxtbevo(vdvldrhtssVar, (int) j13));
                        this.f61555eablkybsjg = 0;
                        return true;
                    }
                    throw ParserException.iobyxmoadg("Invalid integer size: " + this.f61558lqeggnwhkg, null);
                }
                if (iEablkybsjg == 3) {
                    long j14 = this.f61558lqeggnwhkg;
                    if (j14 <= 2147483647L) {
                        this.f61560wkgbmnqykc.lqeggnwhkg(this.f61556gxszxtbevo, lqeggnwhkg(vdvldrhtssVar, (int) j14));
                        this.f61555eablkybsjg = 0;
                        return true;
                    }
                    throw ParserException.iobyxmoadg("String element size: " + this.f61558lqeggnwhkg, null);
                }
                if (iEablkybsjg == 4) {
                    this.f61560wkgbmnqykc.zoijcleaow(this.f61556gxszxtbevo, (int) this.f61558lqeggnwhkg, vdvldrhtssVar);
                    this.f61555eablkybsjg = 0;
                    return true;
                }
                if (iEablkybsjg != 5) {
                    throw ParserException.iobyxmoadg("Invalid element type " + iEablkybsjg, null);
                }
                long j15 = this.f61558lqeggnwhkg;
                if (j15 == 4 || j15 == 8) {
                    this.f61560wkgbmnqykc.ppxfxbqfkf(this.f61556gxszxtbevo, eablkybsjg(vdvldrhtssVar, (int) j15));
                    this.f61555eablkybsjg = 0;
                    return true;
                }
                throw ParserException.iobyxmoadg("Invalid float size: " + this.f61558lqeggnwhkg, null);
            }
            vdvldrhtssVar.draadjrbmk((int) this.f61558lqeggnwhkg);
            this.f61555eablkybsjg = 0;
        }
    }

    @Override // l4.ppxfxbqfkf
    public void ppxfxbqfkf(l4.zoijcleaow zoijcleaowVar) {
        this.f61560wkgbmnqykc = zoijcleaowVar;
    }

    @Override // l4.ppxfxbqfkf
    public void zoijcleaow() {
        this.f61555eablkybsjg = 0;
        this.f61561zoijcleaow.clear();
        this.f61559ppxfxbqfkf.eablkybsjg();
    }
}
