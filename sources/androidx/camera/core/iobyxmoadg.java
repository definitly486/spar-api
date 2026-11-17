package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import istkbnxepw.opjhrmiecq;
import java.nio.ByteBuffer;
import lereixgezr.dsvhmnatus;
import lereixgezr.ntlheqmsrt;

/* JADX INFO: loaded from: classes.dex */
final class iobyxmoadg implements agtfadlqog {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final dsvhmnatus f3930jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final C0073iobyxmoadg[] f3931yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Image f3932zdlpuopuiu;

    /* JADX INFO: renamed from: androidx.camera.core.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0073iobyxmoadg implements agtfadlqog.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Image.Plane f3933iobyxmoadg;

        C0073iobyxmoadg(Image.Plane plane) {
            this.f3933iobyxmoadg = plane;
        }

        @Override // androidx.camera.core.agtfadlqog.iobyxmoadg
        public int ppxfxbqfkf() {
            return this.f3933iobyxmoadg.getRowStride();
        }

        @Override // androidx.camera.core.agtfadlqog.iobyxmoadg
        public int wkgbmnqykc() {
            return this.f3933iobyxmoadg.getPixelStride();
        }

        @Override // androidx.camera.core.agtfadlqog.iobyxmoadg
        public ByteBuffer zoijcleaow() {
            return this.f3933iobyxmoadg.getBuffer();
        }
    }

    iobyxmoadg(Image image) {
        this.f3932zdlpuopuiu = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f3931yggfygwlhe = new C0073iobyxmoadg[planes.length];
            for (int i13 = 0; i13 < planes.length; i13++) {
                this.f3931yggfygwlhe[i13] = new C0073iobyxmoadg(planes[i13]);
            }
        } else {
            this.f3931yggfygwlhe = new C0073iobyxmoadg[0];
        }
        this.f3930jyumaefscl = ntlheqmsrt.wkgbmnqykc(opjhrmiecq.zoijcleaow(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.agtfadlqog
    public dsvhmnatus K() {
        return this.f3930jyumaefscl;
    }

    @Override // androidx.camera.core.agtfadlqog
    public Image U() {
        return this.f3932zdlpuopuiu;
    }

    @Override // androidx.camera.core.agtfadlqog, java.lang.AutoCloseable
    public void close() {
        this.f3932zdlpuopuiu.close();
    }

    @Override // androidx.camera.core.agtfadlqog
    public agtfadlqog.iobyxmoadg[] eslsurpljm() {
        return this.f3931yggfygwlhe;
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getFormat() {
        return this.f3932zdlpuopuiu.getFormat();
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getHeight() {
        return this.f3932zdlpuopuiu.getHeight();
    }

    @Override // androidx.camera.core.agtfadlqog
    public int getWidth() {
        return this.f3932zdlpuopuiu.getWidth();
    }

    @Override // androidx.camera.core.agtfadlqog
    public void oipsdeybqn(Rect rect) {
        this.f3932zdlpuopuiu.setCropRect(rect);
    }
}
