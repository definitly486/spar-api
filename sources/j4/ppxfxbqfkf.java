package j4;

import java.nio.ByteBuffer;
import v2.jyumaefscl;
import y2.cdpycssgdh;
import y2.hcddaimhww;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf extends c4.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private hcddaimhww f50662ppxfxbqfkf;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f50661iobyxmoadg = new yadqdtsiqt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cdpycssgdh f50663zoijcleaow = new cdpycssgdh();

    @Override // c4.ppxfxbqfkf
    protected jyumaefscl zoijcleaow(c4.zoijcleaow zoijcleaowVar, ByteBuffer byteBuffer) {
        jyumaefscl.iobyxmoadg eablkybsjgVar;
        hcddaimhww hcddaimhwwVar = this.f50662ppxfxbqfkf;
        if (hcddaimhwwVar == null || zoijcleaowVar.f18723istkbnxepw != hcddaimhwwVar.gxszxtbevo()) {
            hcddaimhww hcddaimhwwVar2 = new hcddaimhww(zoijcleaowVar.f10020esjtqupxsv);
            this.f50662ppxfxbqfkf = hcddaimhwwVar2;
            hcddaimhwwVar2.iobyxmoadg(zoijcleaowVar.f10020esjtqupxsv - zoijcleaowVar.f18723istkbnxepw);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f50661iobyxmoadg.ntlheqmsrt(bArrArray, iLimit);
        this.f50663zoijcleaow.ojitshcjhn(bArrArray, iLimit);
        this.f50663zoijcleaow.oxmwwwfdhm(39);
        long jNufgyqmvbu = (((long) this.f50663zoijcleaow.nufgyqmvbu(1)) << 32) | ((long) this.f50663zoijcleaow.nufgyqmvbu(32));
        this.f50663zoijcleaow.oxmwwwfdhm(20);
        int iNufgyqmvbu = this.f50663zoijcleaow.nufgyqmvbu(12);
        int iNufgyqmvbu2 = this.f50663zoijcleaow.nufgyqmvbu(8);
        this.f50661iobyxmoadg.crxdokpmqz(14);
        if (iNufgyqmvbu2 == 0) {
            eablkybsjgVar = new eablkybsjg();
        } else if (iNufgyqmvbu2 == 255) {
            eablkybsjgVar = iobyxmoadg.wkgbmnqykc(this.f50661iobyxmoadg, iNufgyqmvbu, jNufgyqmvbu);
        } else if (iNufgyqmvbu2 == 4) {
            eablkybsjgVar = gxszxtbevo.wkgbmnqykc(this.f50661iobyxmoadg);
        } else if (iNufgyqmvbu2 != 5) {
            eablkybsjgVar = iNufgyqmvbu2 != 6 ? null : lqeggnwhkg.wkgbmnqykc(this.f50661iobyxmoadg, jNufgyqmvbu, this.f50662ppxfxbqfkf);
        } else {
            eablkybsjgVar = wkgbmnqykc.wkgbmnqykc(this.f50661iobyxmoadg, jNufgyqmvbu, this.f50662ppxfxbqfkf);
        }
        return eablkybsjgVar == null ? new jyumaefscl(new jyumaefscl.iobyxmoadg[0]) : new jyumaefscl(eablkybsjgVar);
    }
}
