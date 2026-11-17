package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface ImageOutput {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final ImageOutput f10578iobyxmoadg = new iobyxmoadg();

    class iobyxmoadg implements ImageOutput {
        iobyxmoadg() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void iobyxmoadg() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j13, Bitmap bitmap) {
        }
    }

    void iobyxmoadg();

    void onImageAvailable(long j13, Bitmap bitmap);
}
