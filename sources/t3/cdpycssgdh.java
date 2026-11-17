package t3;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.yadqdtsiqt f109357iobyxmoadg = new y2.yadqdtsiqt(10);

    public v2.jyumaefscl iobyxmoadg(vdvldrhtss vdvldrhtssVar, h4.nufgyqmvbu.iobyxmoadg iobyxmoadgVar) {
        v2.jyumaefscl jyumaefsclVarEablkybsjg = null;
        int i13 = 0;
        while (true) {
            try {
                vdvldrhtssVar.ojitshcjhn(this.f109357iobyxmoadg.eablkybsjg(), 0, 10);
                this.f109357iobyxmoadg.sopmlzcsov(0);
                if (this.f109357iobyxmoadg.hcddaimhww() != 4801587) {
                    break;
                }
                this.f109357iobyxmoadg.crxdokpmqz(3);
                int iLmojexxdyd = this.f109357iobyxmoadg.lmojexxdyd();
                int i14 = iLmojexxdyd + 10;
                if (jyumaefsclVarEablkybsjg == null) {
                    byte[] bArr = new byte[i14];
                    System.arraycopy(this.f109357iobyxmoadg.eablkybsjg(), 0, bArr, 0, 10);
                    vdvldrhtssVar.ojitshcjhn(bArr, 10, iLmojexxdyd);
                    jyumaefsclVarEablkybsjg = new h4.nufgyqmvbu(iobyxmoadgVar).eablkybsjg(bArr, i14);
                } else {
                    vdvldrhtssVar.dxjokdxxww(iLmojexxdyd);
                }
                i13 += i14;
            } catch (EOFException unused) {
            }
        }
        vdvldrhtssVar.gxszxtbevo();
        vdvldrhtssVar.dxjokdxxww(i13);
        return jyumaefsclVarEablkybsjg;
    }
}
