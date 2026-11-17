package qg;

import xg.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg extends pg.iobyxmoadg {

    /* JADX INFO: renamed from: qg.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1762iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C1762iobyxmoadg f78764iobyxmoadg = new C1762iobyxmoadg();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final Integer f78765zoijcleaow;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f78765zoijcleaow = num2;
        }

        private C1762iobyxmoadg() {
        }
    }

    private final boolean wkgbmnqykc(int i13) {
        Integer num = C1762iobyxmoadg.f78765zoijcleaow;
        return num == null || num.intValue() >= i13;
    }

    @Override // og.iobyxmoadg
    public ppxfxbqfkf zoijcleaow() {
        return wkgbmnqykc(34) ? new yg.iobyxmoadg() : super.zoijcleaow();
    }
}
