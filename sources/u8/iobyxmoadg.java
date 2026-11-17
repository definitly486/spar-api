package u8;

import com.bumptech.glide.load.data.eablkybsjg;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ByteBuffer f113004iobyxmoadg;

    /* JADX INFO: renamed from: u8.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C2800iobyxmoadg implements eablkybsjg.iobyxmoadg {
        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        public Class iobyxmoadg() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public eablkybsjg zoijcleaow(ByteBuffer byteBuffer) {
            return new iobyxmoadg(byteBuffer);
        }
    }

    public iobyxmoadg(ByteBuffer byteBuffer) {
        this.f113004iobyxmoadg = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.eablkybsjg
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public ByteBuffer iobyxmoadg() {
        this.f113004iobyxmoadg.position(0);
        return this.f113004iobyxmoadg;
    }

    @Override // com.bumptech.glide.load.data.eablkybsjg
    public void zoijcleaow() {
    }
}
