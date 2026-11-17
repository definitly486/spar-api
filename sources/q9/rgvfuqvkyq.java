package q9;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq {

    public static abstract class iobyxmoadg {
        public abstract rgvfuqvkyq iobyxmoadg();

        public abstract iobyxmoadg ppxfxbqfkf(byte[] bArr);

        public abstract iobyxmoadg wkgbmnqykc(o9.gxszxtbevo gxszxtbevoVar);

        public abstract iobyxmoadg zoijcleaow(String str);
    }

    public static iobyxmoadg iobyxmoadg() {
        return new wkgbmnqykc.zoijcleaow().wkgbmnqykc(o9.gxszxtbevo.DEFAULT);
    }

    public boolean eablkybsjg() {
        return ppxfxbqfkf() != null;
    }

    public rgvfuqvkyq gxszxtbevo(o9.gxszxtbevo gxszxtbevoVar) {
        return iobyxmoadg().zoijcleaow(zoijcleaow()).wkgbmnqykc(gxszxtbevoVar).ppxfxbqfkf(ppxfxbqfkf()).iobyxmoadg();
    }

    public abstract byte[] ppxfxbqfkf();

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", zoijcleaow(), wkgbmnqykc(), ppxfxbqfkf() == null ? "" : Base64.encodeToString(ppxfxbqfkf(), 2));
    }

    public abstract o9.gxszxtbevo wkgbmnqykc();

    public abstract String zoijcleaow();
}
