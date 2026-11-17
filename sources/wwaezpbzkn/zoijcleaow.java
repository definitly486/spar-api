package wwaezpbzkn;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
abstract class zoijcleaow {
    static void iobyxmoadg(ImageWriter imageWriter) {
        imageWriter.close();
    }

    static ImageWriter ppxfxbqfkf(Surface surface, int i13) {
        return ImageWriter.newInstance(surface, i13);
    }

    static void wkgbmnqykc(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    static Image zoijcleaow(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }
}
