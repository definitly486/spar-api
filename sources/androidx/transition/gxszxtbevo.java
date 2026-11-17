package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
abstract class gxszxtbevo {

    static class iobyxmoadg {
        static <T, V> ObjectAnimator iobyxmoadg(T t13, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t13, property, (TypeConverter) null, path);
        }
    }

    static ObjectAnimator iobyxmoadg(Object obj, Property property, Path path) {
        return iobyxmoadg.iobyxmoadg(obj, property, path);
    }
}
