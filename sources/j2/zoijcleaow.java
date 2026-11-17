package j2;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends Editable.Factory {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f50561iobyxmoadg = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static Class f50562ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static volatile Editable.Factory f50563zoijcleaow;

    private zoijcleaow() {
        try {
            f50562ppxfxbqfkf = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, zoijcleaow.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f50563zoijcleaow == null) {
            synchronized (f50561iobyxmoadg) {
                try {
                    if (f50563zoijcleaow == null) {
                        f50563zoijcleaow = new zoijcleaow();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50563zoijcleaow;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f50562ppxfxbqfkf;
        return cls != null ? i2.wkgbmnqykc.zoijcleaow(cls, charSequence) : super.newEditable(charSequence);
    }
}
