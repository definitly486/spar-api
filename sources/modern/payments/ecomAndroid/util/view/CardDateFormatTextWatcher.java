package modern.payments.ecomAndroid.util.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import gg.vdvldrhtss;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0002 !B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0004*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\u00020\u0004*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nR&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lmodern/payments/ecomAndroid/util/view/CardDateFormatTextWatcher;", "Landroid/text/TextWatcher;", "Lkotlin/Function2;", "", "Lgg/wwaezpbzkn;", "doOnDateChange", "<init>", "(Ltg/rgvfuqvkyq;)V", "Landroid/text/Editable;", "validateMaxLength", "(Landroid/text/Editable;)V", "formatWithDivider", "validateMonth", "getValidMonth", "(Ljava/lang/String;)Ljava/lang/String;", "", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "afterTextChanged", "Ltg/rgvfuqvkyq;", "", "internalStopFormatFlag", "Z", "lastText", "Ljava/lang/String;", "Companion", "DrawDividerSpan", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardDateFormatTextWatcher implements TextWatcher {
    public static final String DIVIDER_CHARACTER = "/";
    public static final int DIVIDER_POSITION = 2;
    private static final int MAX_LENGTH = 4;
    private final rgvfuqvkyq doOnDateChange;
    private boolean internalStopFormatFlag;
    private String lastText;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmodern/payments/ecomAndroid/util/view/CardDateFormatTextWatcher$DrawDividerSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", "x", "top", "y", "bottom", "Lgg/wwaezpbzkn;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DrawDividerSpan extends ReplacementSpan {
        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence text, int start, int end, float x13, int top, int y13, int bottom, Paint paint) {
            zdlpuopuiu.btonecajqb(canvas, "canvas");
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(paint, "paint");
            canvas.drawText(text, start, end, x13, y13, paint);
            canvas.drawText(CardDateFormatTextWatcher.DIVIDER_CHARACTER, paint.measureText(text, 0, end), (canvas.getHeight() / 2) - ((paint.descent() + paint.ascent()) / 2), paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
            zdlpuopuiu.btonecajqb(paint, "paint");
            zdlpuopuiu.btonecajqb(text, "text");
            return ((int) Math.ceil(paint.measureText(text, start, end))) + ((int) Math.ceil(paint.measureText(CardDateFormatTextWatcher.DIVIDER_CHARACTER)));
        }
    }

    public CardDateFormatTextWatcher(rgvfuqvkyq doOnDateChange) {
        zdlpuopuiu.btonecajqb(doOnDateChange, "doOnDateChange");
        this.doOnDateChange = doOnDateChange;
        this.lastText = "";
    }

    private final void formatWithDivider(Editable editable) {
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) editable.getSpans(0, editable.length(), CharacterStyle.class);
        zdlpuopuiu.lqeggnwhkg(characterStyleArr);
        for (CharacterStyle characterStyle : characterStyleArr) {
            editable.removeSpan(characterStyle);
        }
        if (editable.length() >= 2) {
            editable.setSpan(new DrawDividerSpan(), 1, 2, 33);
        }
    }

    private final String getValidMonth(String str) {
        if (str.length() == 1 && Integer.parseInt(str) < 2) {
            return str;
        }
        if (str.length() != 1 || Integer.parseInt(str) < 2) {
            if (str.length() != 2 || Integer.parseInt(str) < 12) {
                return (str.length() == 2 && Integer.parseInt(str) == 0) ? "01" : str;
            }
            return "12";
        }
        return '0' + str;
    }

    private final void validateMaxLength(Editable editable) {
        if (editable.length() > 4) {
            editable.replace(4, editable.length(), "");
        }
    }

    private final void validateMonth(Editable editable) {
        if (this.lastText.length() >= editable.length()) {
            return;
        }
        vdvldrhtss vdvldrhtssVarSplitToMonthToYear = CardDateFormatTextWatcherKt.splitToMonthToYear(editable.toString());
        String str = (String) vdvldrhtssVarSplitToMonthToYear.iobyxmoadg();
        String str2 = (String) vdvldrhtssVarSplitToMonthToYear.wkgbmnqykc();
        if (editable.length() <= 2) {
            editable.replace(0, editable.length(), getValidMonth(str));
            return;
        }
        editable.replace(0, editable.length(), getValidMonth(str) + str2);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s13) {
        zdlpuopuiu.btonecajqb(s13, "s");
        if (this.internalStopFormatFlag) {
            return;
        }
        this.internalStopFormatFlag = true;
        validateMaxLength(s13);
        validateMonth(s13);
        formatWithDivider(s13);
        this.lastText = s13.toString();
        vdvldrhtss vdvldrhtssVarSplitToMonthToYear = CardDateFormatTextWatcherKt.splitToMonthToYear(s13.toString());
        this.doOnDateChange.invoke((String) vdvldrhtssVarSplitToMonthToYear.iobyxmoadg(), (String) vdvldrhtssVarSplitToMonthToYear.wkgbmnqykc());
        this.internalStopFormatFlag = false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s13, int start, int count, int after) {
        zdlpuopuiu.btonecajqb(s13, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s13, int start, int before, int count) {
        zdlpuopuiu.btonecajqb(s13, "s");
    }
}
