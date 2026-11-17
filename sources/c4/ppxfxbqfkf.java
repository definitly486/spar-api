package c4;

import java.nio.ByteBuffer;
import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf implements iobyxmoadg {
    @Override // c4.iobyxmoadg
    public final jyumaefscl iobyxmoadg(zoijcleaow zoijcleaowVar) {
        ByteBuffer byteBuffer = (ByteBuffer) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar.f10021iwizpuwonk);
        y2.iobyxmoadg.iobyxmoadg(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return zoijcleaow(zoijcleaowVar, byteBuffer);
    }

    protected abstract jyumaefscl zoijcleaow(zoijcleaow zoijcleaowVar, ByteBuffer byteBuffer);
}
