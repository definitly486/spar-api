package ikoacuggdj;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class ydmasvzmpa implements yfnezrywwk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final boolean f44956ppxfxbqfkf = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final ydmasvzmpa f44957zoijcleaow = new ydmasvzmpa();

    public static class iobyxmoadg implements uwvvkdfqfp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Magnifier f44958iobyxmoadg;

        public iobyxmoadg(Magnifier magnifier) {
            this.f44958iobyxmoadg = magnifier;
        }

        @Override // ikoacuggdj.uwvvkdfqfp
        public void dismiss() {
            this.f44958iobyxmoadg.dismiss();
        }

        @Override // ikoacuggdj.uwvvkdfqfp
        public long iobyxmoadg() {
            return w0.oxmwwwfdhm.ppxfxbqfkf((((long) this.f44958iobyxmoadg.getHeight()) & 4294967295L) | (((long) this.f44958iobyxmoadg.getWidth()) << 32));
        }

        @Override // ikoacuggdj.uwvvkdfqfp
        public void ppxfxbqfkf() {
            this.f44958iobyxmoadg.update();
        }

        public final Magnifier wkgbmnqykc() {
            return this.f44958iobyxmoadg;
        }

        @Override // ikoacuggdj.uwvvkdfqfp
        public void zoijcleaow(long j13, long j14, float f13) {
            this.f44958iobyxmoadg.show(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
        }
    }

    private ydmasvzmpa() {
    }

    @Override // ikoacuggdj.yfnezrywwk
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg iobyxmoadg(View view, boolean z13, long j13, float f13, float f14, boolean z14, w0.wkgbmnqykc wkgbmnqykcVar, float f15) {
        return new iobyxmoadg(new Magnifier(view));
    }

    @Override // ikoacuggdj.yfnezrywwk
    public boolean zoijcleaow() {
        return f44956ppxfxbqfkf;
    }
}
