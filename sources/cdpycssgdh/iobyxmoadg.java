package cdpycssgdh;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final Rational f19703iobyxmoadg = new Rational(4, 3);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final Rational f19706zoijcleaow = new Rational(3, 4);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final Rational f19704ppxfxbqfkf = new Rational(16, 9);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final Rational f19705wkgbmnqykc = new Rational(9, 16);

    /* JADX INFO: renamed from: cdpycssgdh.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0357iobyxmoadg implements Comparator {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Rational f19707jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final RectF f19708yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Rational f19709zdlpuopuiu;

        public C0357iobyxmoadg(Rational rational, Rational rational2) {
            this.f19709zdlpuopuiu = rational;
            this.f19707jyumaefscl = rational2 == null ? new Rational(4, 3) : rational2;
            this.f19708yggfygwlhe = wkgbmnqykc(rational);
        }

        private boolean eablkybsjg(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }

        private float ppxfxbqfkf(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        private RectF wkgbmnqykc(Rational rational) {
            if (rational.floatValue() == this.f19707jyumaefscl.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f19707jyumaefscl.getNumerator(), this.f19707jyumaefscl.getDenominator());
            }
            return rational.floatValue() > this.f19707jyumaefscl.floatValue() ? new RectF(0.0f, 0.0f, this.f19707jyumaefscl.getNumerator(), (rational.getDenominator() * this.f19707jyumaefscl.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f19707jyumaefscl.getDenominator()) / rational.getDenominator(), this.f19707jyumaefscl.getDenominator());
        }

        private float zoijcleaow(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF rectFWkgbmnqykc = wkgbmnqykc(rational);
            RectF rectFWkgbmnqykc2 = wkgbmnqykc(rational2);
            boolean zEablkybsjg = eablkybsjg(rectFWkgbmnqykc, this.f19708yggfygwlhe);
            boolean zEablkybsjg2 = eablkybsjg(rectFWkgbmnqykc2, this.f19708yggfygwlhe);
            if (zEablkybsjg && zEablkybsjg2) {
                return (int) Math.signum(zoijcleaow(rectFWkgbmnqykc) - zoijcleaow(rectFWkgbmnqykc2));
            }
            if (zEablkybsjg) {
                return -1;
            }
            if (zEablkybsjg2) {
                return 1;
            }
            return -((int) Math.signum(ppxfxbqfkf(rectFWkgbmnqykc, this.f19708yggfygwlhe) - ppxfxbqfkf(rectFWkgbmnqykc2, this.f19708yggfygwlhe)));
        }
    }

    public static boolean iobyxmoadg(Size size, Rational rational) {
        return zoijcleaow(size, rational, hcddaimhww.ppxfxbqfkf.f40071ppxfxbqfkf);
    }

    private static boolean ppxfxbqfkf(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i13 = width % 16;
        if (i13 == 0 && height % 16 == 0) {
            return wkgbmnqykc(Math.max(0, height + (-16)), width, rational) || wkgbmnqykc(Math.max(0, width + (-16)), height, rational2);
        }
        if (i13 == 0) {
            return wkgbmnqykc(height, width, rational);
        }
        if (height % 16 == 0) {
            return wkgbmnqykc(width, height, rational2);
        }
        return false;
    }

    private static boolean wkgbmnqykc(int i13, int i14, Rational rational) {
        u1.nufgyqmvbu.iobyxmoadg(i14 % 16 == 0);
        double numerator = ((double) (i13 * rational.getNumerator())) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i14 + (-16))) && numerator < ((double) (i14 + 16));
    }

    public static boolean zoijcleaow(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (hcddaimhww.ppxfxbqfkf.zoijcleaow(size) >= hcddaimhww.ppxfxbqfkf.zoijcleaow(size2)) {
            return ppxfxbqfkf(size, rational);
        }
        return false;
    }
}
