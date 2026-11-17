package m0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb extends ReplacementSpan {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final iobyxmoadg f64810cdpycssgdh = new iobyxmoadg(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f64811yadqdtsiqt = 8;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final float f64812cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int f64813esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f64814istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f64815iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final float f64816jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private Paint.FontMetricsInt f64817lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f64818pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f64819yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f64820zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f64821zynmafqrjb;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        float f13;
        int iIobyxmoadg;
        this.f64814istkbnxepw = true;
        float textSize = paint.getTextSize();
        this.f64817lereixgezr = paint.getFontMetricsInt();
        if (!(iobyxmoadg().descent > iobyxmoadg().ascent)) {
            q0.iobyxmoadg.iobyxmoadg("Invalid fontMetrics: line height can not be negative.");
        }
        int i15 = this.f64819yggfygwlhe;
        if (i15 == 0) {
            f13 = this.f64820zdlpuopuiu * this.f64812cqumvgiudr;
        } else {
            if (i15 != 1) {
                q0.iobyxmoadg.zoijcleaow("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f13 = this.f64820zdlpuopuiu * textSize;
        }
        this.f64818pmvmpeiblj = gtknphoqwx.iobyxmoadg(f13);
        int i16 = this.f64815iwizpuwonk;
        if (i16 == 0) {
            iIobyxmoadg = gtknphoqwx.iobyxmoadg(this.f64816jyumaefscl * this.f64812cqumvgiudr);
        } else {
            if (i16 != 1) {
                q0.iobyxmoadg.zoijcleaow("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            iIobyxmoadg = gtknphoqwx.iobyxmoadg(this.f64816jyumaefscl * textSize);
        }
        this.f64821zynmafqrjb = iIobyxmoadg;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = iobyxmoadg().ascent;
            fontMetricsInt.descent = iobyxmoadg().descent;
            fontMetricsInt.leading = iobyxmoadg().leading;
            switch (this.f64813esjtqupxsv) {
                case 0:
                    if (fontMetricsInt.ascent > (-zoijcleaow())) {
                        fontMetricsInt.ascent = -zoijcleaow();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + zoijcleaow() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + zoijcleaow();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - zoijcleaow()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - zoijcleaow();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < zoijcleaow()) {
                        int iZoijcleaow = fontMetricsInt.ascent - ((zoijcleaow() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iZoijcleaow;
                        fontMetricsInt.descent = iZoijcleaow + zoijcleaow();
                    }
                    break;
                default:
                    q0.iobyxmoadg.iobyxmoadg("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(iobyxmoadg().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(iobyxmoadg().bottom, fontMetricsInt.descent);
        }
        return wkgbmnqykc();
    }

    public final Paint.FontMetricsInt iobyxmoadg() {
        Paint.FontMetricsInt fontMetricsInt = this.f64817lereixgezr;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        zdlpuopuiu.pmvmpeiblj("fontMetrics");
        return null;
    }

    public final int ppxfxbqfkf() {
        return this.f64813esjtqupxsv;
    }

    public final int wkgbmnqykc() {
        if (!this.f64814istkbnxepw) {
            q0.iobyxmoadg.ppxfxbqfkf("PlaceholderSpan is not laid out yet.");
        }
        return this.f64818pmvmpeiblj;
    }

    public final int zoijcleaow() {
        if (!this.f64814istkbnxepw) {
            q0.iobyxmoadg.ppxfxbqfkf("PlaceholderSpan is not laid out yet.");
        }
        return this.f64821zynmafqrjb;
    }
}
