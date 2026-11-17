package androidx.media3.decoder;

import e3.iobyxmoadg;
import e3.ppxfxbqfkf;
import java.nio.ByteBuffer;
import v2.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class DecoderInputBuffer extends iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public boolean f10019cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    public long f10020esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public ByteBuffer f10021iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final ppxfxbqfkf f10022jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    public ByteBuffer f10023lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f10024pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public androidx.media3.common.iobyxmoadg f10025yggfygwlhe;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final int f10026zynmafqrjb;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public final int f10027yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final int f10028zdlpuopuiu;

        public InsufficientCapacityException(int i13, int i14) {
            super("Buffer too small (" + i13 + " < " + i14 + ")");
            this.f10028zdlpuopuiu = i13;
            this.f10027yggfygwlhe = i14;
        }
    }

    static {
        zdlpuopuiu.iobyxmoadg("media3.decoder");
    }

    public DecoderInputBuffer(int i13) {
        this(i13, 0);
    }

    public static DecoderInputBuffer kcexrzcfyt() {
        return new DecoderInputBuffer(0);
    }

    private ByteBuffer ojitshcjhn(int i13) {
        int i14 = this.f10024pmvmpeiblj;
        if (i14 == 1) {
            return ByteBuffer.allocate(i13);
        }
        if (i14 == 2) {
            return ByteBuffer.allocateDirect(i13);
        }
        ByteBuffer byteBuffer = this.f10021iwizpuwonk;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i13);
    }

    @Override // e3.iobyxmoadg
    public void gxszxtbevo() {
        super.gxszxtbevo();
        ByteBuffer byteBuffer = this.f10021iwizpuwonk;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10023lereixgezr;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f10019cqumvgiudr = false;
    }

    public final boolean oxmwwwfdhm() {
        return lqeggnwhkg(1073741824);
    }

    public void rgvfuqvkyq(int i13) {
        int i14 = i13 + this.f10026zynmafqrjb;
        ByteBuffer byteBuffer = this.f10021iwizpuwonk;
        if (byteBuffer == null) {
            this.f10021iwizpuwonk = ojitshcjhn(i14);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i15 = i14 + iPosition;
        if (iCapacity >= i15) {
            this.f10021iwizpuwonk = byteBuffer;
            return;
        }
        ByteBuffer byteBufferOjitshcjhn = ojitshcjhn(i15);
        byteBufferOjitshcjhn.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferOjitshcjhn.put(byteBuffer);
        }
        this.f10021iwizpuwonk = byteBufferOjitshcjhn;
    }

    public final void vdvldrhtss() {
        ByteBuffer byteBuffer = this.f10021iwizpuwonk;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10023lereixgezr;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void zdlpuopuiu(int i13) {
        ByteBuffer byteBuffer = this.f10023lereixgezr;
        if (byteBuffer == null || byteBuffer.capacity() < i13) {
            this.f10023lereixgezr = ByteBuffer.allocate(i13);
        } else {
            this.f10023lereixgezr.clear();
        }
    }

    public DecoderInputBuffer(int i13, int i14) {
        this.f10022jyumaefscl = new ppxfxbqfkf();
        this.f10024pmvmpeiblj = i13;
        this.f10026zynmafqrjb = i14;
    }
}
