package istkbnxepw;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: loaded from: classes.dex */
public interface ojitshcjhn {

    public static final class iobyxmoadg implements ojitshcjhn {
        public static ojitshcjhn nufgyqmvbu() {
            return new iobyxmoadg();
        }

        @Override // istkbnxepw.ojitshcjhn
        public draadjrbmk eablkybsjg() {
            return draadjrbmk.UNKNOWN;
        }

        @Override // istkbnxepw.ojitshcjhn
        public long getTimestamp() {
            return -1L;
        }

        @Override // istkbnxepw.ojitshcjhn
        public wflxmlrfwp gxszxtbevo() {
            return wflxmlrfwp.UNKNOWN;
        }

        @Override // istkbnxepw.ojitshcjhn
        public opjhrmiecq iobyxmoadg() {
            return opjhrmiecq.zoijcleaow();
        }

        @Override // istkbnxepw.ojitshcjhn
        public gtknphoqwx lqeggnwhkg() {
            return gtknphoqwx.UNKNOWN;
        }

        @Override // istkbnxepw.ojitshcjhn
        public agtfadlqog ppxfxbqfkf() {
            return agtfadlqog.UNKNOWN;
        }

        @Override // istkbnxepw.ojitshcjhn
        public CaptureResult wkgbmnqykc() {
            return null;
        }
    }

    draadjrbmk eablkybsjg();

    long getTimestamp();

    wflxmlrfwp gxszxtbevo();

    opjhrmiecq iobyxmoadg();

    gtknphoqwx lqeggnwhkg();

    agtfadlqog ppxfxbqfkf();

    default CaptureResult wkgbmnqykc() {
        return null;
    }

    default void zoijcleaow(cdpycssgdh.nufgyqmvbu.zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.lqeggnwhkg(ppxfxbqfkf());
    }
}
