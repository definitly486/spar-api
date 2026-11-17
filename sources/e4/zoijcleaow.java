package e4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import v2.jyumaefscl;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends c4.ppxfxbqfkf {
    public iobyxmoadg ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
        return new iobyxmoadg((String) y2.iobyxmoadg.eablkybsjg(yadqdtsiqtVar.zynmafqrjb()), (String) y2.iobyxmoadg.eablkybsjg(yadqdtsiqtVar.zynmafqrjb()), yadqdtsiqtVar.pmvmpeiblj(), yadqdtsiqtVar.pmvmpeiblj(), Arrays.copyOfRange(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo(), yadqdtsiqtVar.lqeggnwhkg()));
    }

    @Override // c4.ppxfxbqfkf
    protected jyumaefscl zoijcleaow(c4.zoijcleaow zoijcleaowVar, ByteBuffer byteBuffer) {
        return new jyumaefscl(ppxfxbqfkf(new yadqdtsiqt(byteBuffer.array(), byteBuffer.limit())));
    }
}
