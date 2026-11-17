package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import lereixgezr.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public interface agtfadlqog extends AutoCloseable {

    public interface iobyxmoadg {
        int ppxfxbqfkf();

        int wkgbmnqykc();

        ByteBuffer zoijcleaow();
    }

    dsvhmnatus K();

    Image U();

    @Override // java.lang.AutoCloseable
    void close();

    iobyxmoadg[] eslsurpljm();

    int getFormat();

    int getHeight();

    int getWidth();

    void oipsdeybqn(Rect rect);
}
