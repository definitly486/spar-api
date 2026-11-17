package zynmafqrjb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.internal.utils.ImageUtil;
import istkbnxepw.opjhrmiecq;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dsvhmnatus implements androidx.camera.core.agtfadlqog {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    androidx.camera.core.agtfadlqog.iobyxmoadg[] f131601cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final lereixgezr.dsvhmnatus f131602esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Rect f131603iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f131604jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f131605yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f131606zdlpuopuiu;

    class iobyxmoadg implements androidx.camera.core.agtfadlqog.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ int f131607iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f131608ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f131609zoijcleaow;

        iobyxmoadg(int i13, int i14, ByteBuffer byteBuffer) {
            this.f131607iobyxmoadg = i13;
            this.f131609zoijcleaow = i14;
            this.f131608ppxfxbqfkf = byteBuffer;
        }

        @Override // androidx.camera.core.agtfadlqog.iobyxmoadg
        public int ppxfxbqfkf() {
            return this.f131607iobyxmoadg;
        }

        @Override // androidx.camera.core.agtfadlqog.iobyxmoadg
        public int wkgbmnqykc() {
            return this.f131609zoijcleaow;
        }

        @Override // androidx.camera.core.agtfadlqog.iobyxmoadg
        public ByteBuffer zoijcleaow() {
            return this.f131608ppxfxbqfkf;
        }
    }

    class zoijcleaow implements lereixgezr.dsvhmnatus {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ long f131610iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ Matrix f131611ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ int f131612zoijcleaow;

        zoijcleaow(long j13, int i13, Matrix matrix) {
            this.f131610iobyxmoadg = j13;
            this.f131612zoijcleaow = i13;
            this.f131611ppxfxbqfkf = matrix;
        }

        @Override // lereixgezr.dsvhmnatus
        public long getTimestamp() {
            return this.f131610iobyxmoadg;
        }

        @Override // lereixgezr.dsvhmnatus
        public opjhrmiecq iobyxmoadg() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // lereixgezr.dsvhmnatus
        public int ppxfxbqfkf() {
            return this.f131612zoijcleaow;
        }

        @Override // lereixgezr.dsvhmnatus
        public void zoijcleaow(cdpycssgdh.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }
    }

    public dsvhmnatus(jpowsppfya.jyumaefscl jyumaefsclVar) {
        this((Bitmap) jyumaefsclVar.ppxfxbqfkf(), jyumaefsclVar.zoijcleaow(), jyumaefsclVar.gxszxtbevo(), jyumaefsclVar.lqeggnwhkg(), jyumaefsclVar.iobyxmoadg().getTimestamp());
    }

    private void iobyxmoadg() {
        synchronized (this.f131606zdlpuopuiu) {
            u1.nufgyqmvbu.dxjokdxxww(this.f131601cqumvgiudr != null, "The image is closed.");
        }
    }

    private static androidx.camera.core.agtfadlqog.iobyxmoadg lqeggnwhkg(ByteBuffer byteBuffer, int i13, int i14) {
        return new iobyxmoadg(i13, i14, byteBuffer);
    }

    private static lereixgezr.dsvhmnatus wkgbmnqykc(long j13, int i13, Matrix matrix) {
        return new zoijcleaow(j13, i13, matrix);
    }

    @Override // androidx.camera.core.agtfadlqog
    public lereixgezr.dsvhmnatus K() {
        lereixgezr.dsvhmnatus dsvhmnatusVar;
        synchronized (this.f131606zdlpuopuiu) {
            iobyxmoadg();
            dsvhmnatusVar = this.f131602esjtqupxsv;
        }
        return dsvhmnatusVar;
    }

    @Override // androidx.camera.core.agtfadlqog
    public Image U() {
        synchronized (this.f131606zdlpuopuiu) {
            iobyxmoadg();
        }
        return null;
    }

    @Override // androidx.camera.core.agtfadlqog, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f131606zdlpuopuiu) {
            iobyxmoadg();
            this.f131601cqumvgiudr = null;
        }
    }

    @Override // androidx.camera.core.agtfadlqog
    public androidx.camera.core.agtfadlqog.iobyxmoadg[] eslsurpljm() {
        androidx.camera.core.agtfadlqog.iobyxmoadg[] iobyxmoadgVarArr;
        synchronized (this.f131606zdlpuopuiu) {
            iobyxmoadg();
            androidx.camera.core.agtfadlqog.iobyxmoadg[] iobyxmoadgVarArr2 = this.f131601cqumvgiudr;
            Objects.requireNonNull(iobyxmoadgVarArr2);
            iobyxmoadgVarArr = iobyxmoadgVarArr2;
        }
        return iobyxmoadgVarArr;
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getFormat() {
        synchronized (this.f131606zdlpuopuiu) {
            iobyxmoadg();
        }
        return 1;
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getHeight() {
        int i13;
        synchronized (this.f131606zdlpuopuiu) {
            iobyxmoadg();
            i13 = this.f131604jyumaefscl;
        }
        return i13;
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getWidth() {
        int i13;
        synchronized (this.f131606zdlpuopuiu) {
            iobyxmoadg();
            i13 = this.f131605yggfygwlhe;
        }
        return i13;
    }

    @Override // androidx.camera.core.agtfadlqog
    public void oipsdeybqn(Rect rect) {
        synchronized (this.f131606zdlpuopuiu) {
            try {
                iobyxmoadg();
                if (rect != null) {
                    this.f131603iwizpuwonk.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public dsvhmnatus(Bitmap bitmap, Rect rect, int i13, Matrix matrix, long j13) {
        this(ImageUtil.wkgbmnqykc(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i13, matrix, j13);
    }

    public dsvhmnatus(ByteBuffer byteBuffer, int i13, int i14, int i15, Rect rect, int i16, Matrix matrix, long j13) {
        this.f131606zdlpuopuiu = new Object();
        this.f131605yggfygwlhe = i14;
        this.f131604jyumaefscl = i15;
        this.f131603iwizpuwonk = rect;
        this.f131602esjtqupxsv = wkgbmnqykc(j13, i16, matrix);
        byteBuffer.rewind();
        this.f131601cqumvgiudr = new androidx.camera.core.agtfadlqog.iobyxmoadg[]{lqeggnwhkg(byteBuffer, i14 * i13, i13)};
    }
}
