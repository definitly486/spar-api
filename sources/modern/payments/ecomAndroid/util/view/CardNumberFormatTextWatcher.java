package modern.payments.ecomAndroid.util.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/util/view/CardNumberFormatTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/TextView;", "textView", "Lkotlin/Function1;", "", "Lgg/wwaezpbzkn;", "doOnCardNumberModified", "<init>", "(Landroid/widget/TextView;Ltg/draadjrbmk;)V", "setLetterPadding", "(Landroid/widget/TextView;)V", "Landroid/text/Editable;", "ccNumber", "", "paddingPx", "maxLength", "formatCardNumber", "(Landroid/text/Editable;II)V", "setMaxLength", "(I)V", "", "s", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "afterTextChanged", "(Landroid/text/Editable;)V", "Ltg/draadjrbmk;", "I", "", "internalStopFormatFlag", "Z", "Companion", "PaddingRightSpan", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardNumberFormatTextWatcher implements TextWatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NO_MAX_LENGTH = -1;
    private final draadjrbmk doOnCardNumberModified;
    private boolean internalStopFormatFlag;
    private int maxLength;
    private int paddingPx;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/util/view/CardNumberFormatTextWatcher$Companion;", "", "()V", "NO_MAX_LENGTH", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJW\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/util/view/CardNumberFormatTextWatcher$PaddingRightSpan;", "Landroid/text/style/ReplacementSpan;", "", "mPadding", "<init>", "(I)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "Lgg/wwaezpbzkn;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "I", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PaddingRightSpan extends ReplacementSpan {
        private final int mPadding;

        public PaddingRightSpan(int i13) {
            this.mPadding = i13;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x13, int top, int y13, int bottom, Paint paint) {
            zdlpuopuiu.btonecajqb(canvas, "canvas");
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(paint, "paint");
            canvas.drawText(text, start, end, x13, y13, paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
            zdlpuopuiu.btonecajqb(paint, "paint");
            zdlpuopuiu.btonecajqb(text, "text");
            int i13 = end - start;
            float[] fArr = new float[i13];
            paint.getTextWidths(text, start, end, fArr);
            int i14 = this.mPadding;
            for (int i15 = 0; i15 < i13; i15++) {
                i14 = (int) (i14 + fArr[i15]);
            }
            return i14;
        }
    }

    public CardNumberFormatTextWatcher(TextView textView, draadjrbmk doOnCardNumberModified) {
        zdlpuopuiu.btonecajqb(textView, "textView");
        zdlpuopuiu.btonecajqb(doOnCardNumberModified, "doOnCardNumberModified");
        this.doOnCardNumberModified = doOnCardNumberModified;
        this.maxLength = -1;
        setLetterPadding(textView);
    }

    private final void formatCardNumber(Editable ccNumber, int paddingPx, int maxLength) {
        int length = ccNumber.length();
        if (maxLength > 0 && length > maxLength - 1) {
            ccNumber.replace(maxLength, length, "");
        }
        PaddingRightSpan[] paddingRightSpanArr = (PaddingRightSpan[]) ccNumber.getSpans(0, ccNumber.length(), PaddingRightSpan.class);
        zdlpuopuiu.lqeggnwhkg(paddingRightSpanArr);
        for (PaddingRightSpan paddingRightSpan : paddingRightSpanArr) {
            ccNumber.removeSpan(paddingRightSpan);
        }
        int i13 = 1;
        int iBtonecajqb = zg.gtknphoqwx.btonecajqb((length - 1) / 4, 3);
        if (1 > iBtonecajqb) {
            return;
        }
        while (true) {
            int i14 = i13 * 4;
            ccNumber.setSpan(new PaddingRightSpan(paddingPx), i14 - 1, i14, 33);
            if (i13 == iBtonecajqb) {
                return;
            } else {
                i13++;
            }
        }
    }

    static /* synthetic */ void formatCardNumber$default(CardNumberFormatTextWatcher cardNumberFormatTextWatcher, Editable editable, int i13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            i14 = -1;
        }
        cardNumberFormatTextWatcher.formatCardNumber(editable, i13, i14);
    }

    private final void setLetterPadding(TextView textView) {
        this.paddingPx = (int) textView.getPaint().measureText("x");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s13) {
        zdlpuopuiu.btonecajqb(s13, "s");
        if (this.internalStopFormatFlag) {
            return;
        }
        this.internalStopFormatFlag = true;
        formatCardNumber(s13, this.paddingPx, this.maxLength);
        this.internalStopFormatFlag = false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s13, int start, int count, int after) {
        zdlpuopuiu.btonecajqb(s13, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s13, int start, int before, int count) {
        zdlpuopuiu.btonecajqb(s13, "s");
        this.doOnCardNumberModified.invoke(s13.toString());
    }

    public final void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
