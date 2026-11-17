package ikoacuggdj;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class sflfametgt implements yfnezrywwk {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final sflfametgt f44913zoijcleaow = new sflfametgt();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final boolean f44912ppxfxbqfkf = true;

    public static final class iobyxmoadg extends ydmasvzmpa.iobyxmoadg {
        public iobyxmoadg(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // ikoacuggdj.ydmasvzmpa.iobyxmoadg, ikoacuggdj.uwvvkdfqfp
        public void zoijcleaow(long j13, long j14, float f13) {
            if (!Float.isNaN(f13)) {
                wkgbmnqykc().setZoom(f13);
            }
            if ((9223372034707292159L & j14) != 9205357640488583168L) {
                wkgbmnqykc().show(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
            } else {
                wkgbmnqykc().show(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
            }
        }
    }

    private sflfametgt() {
    }

    @Override // ikoacuggdj.yfnezrywwk
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg iobyxmoadg(View view, boolean z13, long j13, float f13, float f14, boolean z14, w0.wkgbmnqykc wkgbmnqykcVar, float f15) {
        if (z13) {
            return new iobyxmoadg(new Magnifier(view));
        }
        long jV = wkgbmnqykcVar.V(j13);
        float fI = wkgbmnqykcVar.I(f13);
        float fI2 = wkgbmnqykcVar.I(f14);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jV != 9205357640488583168L) {
            builder.setSize(vg.iobyxmoadg.wkgbmnqykc(Float.intBitsToFloat((int) (jV >> 32))), vg.iobyxmoadg.wkgbmnqykc(Float.intBitsToFloat((int) (jV & 4294967295L))));
        }
        if (!Float.isNaN(fI)) {
            builder.setCornerRadius(fI);
        }
        if (!Float.isNaN(fI2)) {
            builder.setElevation(fI2);
        }
        if (!Float.isNaN(f15)) {
            builder.setInitialZoom(f15);
        }
        builder.setClippingEnabled(z14);
        return new iobyxmoadg(builder.build());
    }

    @Override // ikoacuggdj.yfnezrywwk
    public boolean zoijcleaow() {
        return f44912ppxfxbqfkf;
    }
}
