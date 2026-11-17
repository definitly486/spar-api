package qf;

import zf.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static Object iobyxmoadg(Object obj, Class cls) {
        if (obj instanceof zf.iobyxmoadg) {
            return cls.cast(obj);
        }
        if (obj instanceof zoijcleaow) {
            return iobyxmoadg(((zoijcleaow) obj).ojitshcjhn(), cls);
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), zf.iobyxmoadg.class, zoijcleaow.class));
    }
}
