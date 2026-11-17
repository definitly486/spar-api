package d9;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {
    public btonecajqb iobyxmoadg(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new zoijcleaow(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new eablkybsjg(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
