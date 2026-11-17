package z6;

import java.nio.ByteBuffer;
import x6.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf implements dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ByteBuffer f129210iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final e7.draadjrbmk f129211zoijcleaow;

    public static final class iobyxmoadg implements dxjokdxxww.iobyxmoadg {
        @Override // z6.dxjokdxxww.iobyxmoadg
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public dxjokdxxww iobyxmoadg(ByteBuffer byteBuffer, e7.draadjrbmk draadjrbmkVar, v6.wkgbmnqykc wkgbmnqykcVar) {
            return new ppxfxbqfkf(byteBuffer, draadjrbmkVar);
        }
    }

    public ppxfxbqfkf(ByteBuffer byteBuffer, e7.draadjrbmk draadjrbmkVar) {
        this.f129210iobyxmoadg = byteBuffer;
        this.f129211zoijcleaow = draadjrbmkVar;
    }

    @Override // z6.dxjokdxxww
    public Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        try {
            bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
            ppxfxbqfkfVar.write(this.f129210iobyxmoadg);
            return new wflxmlrfwp(ojitshcjhn.iobyxmoadg(ppxfxbqfkfVar, this.f129211zoijcleaow.lqeggnwhkg()), null, x6.wkgbmnqykc.MEMORY);
        } finally {
            this.f129210iobyxmoadg.position(0);
        }
    }
}
