package t1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class draadjrbmk implements Spannable {

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final PrecomputedText.Params f109261eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TextPaint f109262iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f109263ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f109264wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final TextDirectionHeuristic f109265zoijcleaow;

        /* JADX INFO: renamed from: t1.draadjrbmk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static class C2682iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final TextPaint f109266iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private int f109267ppxfxbqfkf = 1;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            private int f109268wkgbmnqykc = 1;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private TextDirectionHeuristic f109269zoijcleaow = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C2682iobyxmoadg(TextPaint textPaint) {
                this.f109266iobyxmoadg = textPaint;
            }

            public iobyxmoadg iobyxmoadg() {
                return new iobyxmoadg(this.f109266iobyxmoadg, this.f109269zoijcleaow, this.f109267ppxfxbqfkf, this.f109268wkgbmnqykc);
            }

            public C2682iobyxmoadg ppxfxbqfkf(int i13) {
                this.f109268wkgbmnqykc = i13;
                return this;
            }

            public C2682iobyxmoadg wkgbmnqykc(TextDirectionHeuristic textDirectionHeuristic) {
                this.f109269zoijcleaow = textDirectionHeuristic;
                return this;
            }

            public C2682iobyxmoadg zoijcleaow(int i13) {
                this.f109267ppxfxbqfkf = i13;
                return this;
            }
        }

        iobyxmoadg(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i13, int i14) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f109261eablkybsjg = gtknphoqwx.iobyxmoadg(textPaint).setBreakStrategy(i13).setHyphenationFrequency(i14).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f109261eablkybsjg = null;
            }
            this.f109262iobyxmoadg = textPaint;
            this.f109265zoijcleaow = textDirectionHeuristic;
            this.f109263ppxfxbqfkf = i13;
            this.f109264wkgbmnqykc = i14;
        }

        public TextPaint eablkybsjg() {
            return this.f109262iobyxmoadg;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return iobyxmoadg(iobyxmoadgVar) && this.f109265zoijcleaow == iobyxmoadgVar.wkgbmnqykc();
        }

        public int hashCode() {
            return u1.zoijcleaow.zoijcleaow(Float.valueOf(this.f109262iobyxmoadg.getTextSize()), Float.valueOf(this.f109262iobyxmoadg.getTextScaleX()), Float.valueOf(this.f109262iobyxmoadg.getTextSkewX()), Float.valueOf(this.f109262iobyxmoadg.getLetterSpacing()), Integer.valueOf(this.f109262iobyxmoadg.getFlags()), this.f109262iobyxmoadg.getTextLocales(), this.f109262iobyxmoadg.getTypeface(), Boolean.valueOf(this.f109262iobyxmoadg.isElegantTextHeight()), this.f109265zoijcleaow, Integer.valueOf(this.f109263ppxfxbqfkf), Integer.valueOf(this.f109264wkgbmnqykc));
        }

        public boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            if (this.f109263ppxfxbqfkf != iobyxmoadgVar.zoijcleaow() || this.f109264wkgbmnqykc != iobyxmoadgVar.ppxfxbqfkf() || this.f109262iobyxmoadg.getTextSize() != iobyxmoadgVar.eablkybsjg().getTextSize() || this.f109262iobyxmoadg.getTextScaleX() != iobyxmoadgVar.eablkybsjg().getTextScaleX() || this.f109262iobyxmoadg.getTextSkewX() != iobyxmoadgVar.eablkybsjg().getTextSkewX() || this.f109262iobyxmoadg.getLetterSpacing() != iobyxmoadgVar.eablkybsjg().getLetterSpacing() || !TextUtils.equals(this.f109262iobyxmoadg.getFontFeatureSettings(), iobyxmoadgVar.eablkybsjg().getFontFeatureSettings()) || this.f109262iobyxmoadg.getFlags() != iobyxmoadgVar.eablkybsjg().getFlags() || !this.f109262iobyxmoadg.getTextLocales().equals(iobyxmoadgVar.eablkybsjg().getTextLocales())) {
                return false;
            }
            if (this.f109262iobyxmoadg.getTypeface() == null) {
                return iobyxmoadgVar.eablkybsjg().getTypeface() == null;
            }
            return this.f109262iobyxmoadg.getTypeface().equals(iobyxmoadgVar.eablkybsjg().getTypeface());
        }

        public int ppxfxbqfkf() {
            return this.f109264wkgbmnqykc;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("{");
            sb3.append("textSize=" + this.f109262iobyxmoadg.getTextSize());
            sb3.append(", textScaleX=" + this.f109262iobyxmoadg.getTextScaleX());
            sb3.append(", textSkewX=" + this.f109262iobyxmoadg.getTextSkewX());
            sb3.append(", letterSpacing=" + this.f109262iobyxmoadg.getLetterSpacing());
            sb3.append(", elegantTextHeight=" + this.f109262iobyxmoadg.isElegantTextHeight());
            sb3.append(", textLocale=" + this.f109262iobyxmoadg.getTextLocales());
            sb3.append(", typeface=" + this.f109262iobyxmoadg.getTypeface());
            sb3.append(", variationSettings=" + this.f109262iobyxmoadg.getFontVariationSettings());
            sb3.append(", textDir=" + this.f109265zoijcleaow);
            sb3.append(", breakStrategy=" + this.f109263ppxfxbqfkf);
            sb3.append(", hyphenationFrequency=" + this.f109264wkgbmnqykc);
            sb3.append("}");
            return sb3.toString();
        }

        public TextDirectionHeuristic wkgbmnqykc() {
            return this.f109265zoijcleaow;
        }

        public int zoijcleaow() {
            return this.f109263ppxfxbqfkf;
        }

        public iobyxmoadg(PrecomputedText.Params params) {
            this.f109262iobyxmoadg = params.getTextPaint();
            this.f109265zoijcleaow = params.getTextDirection();
            this.f109263ppxfxbqfkf = params.getBreakStrategy();
            this.f109264wkgbmnqykc = params.getHyphenationFrequency();
            this.f109261eablkybsjg = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
