package spay.sdk.view.otpTextView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kk.ag0;
import kk.fh0;
import kk.ji0;
import kk.pmvmpeiblj;
import kk.xd0;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.En;
import spay.sdk.R;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lspay/sdk/view/otpTextView/SpayOtpTextView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkk/ag0;", "spayOtpChildEditText", "Lgg/wwaezpbzkn;", "setTextWatcher", "(Lkk/ag0;)V", "setFocusDetection", "length", "setFocus", "(I)V", "", "s", "setOTP", "(Ljava/lang/CharSequence;)V", "", "otp", "(Ljava/lang/String;)V", "Landroid/view/View$OnTouchListener;", "l", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Lkk/ji0;", "c", "Lkk/ji0;", "getSpayOtpListener", "()Lkk/ji0;", "setSpayOtpListener", "(Lkk/ji0;)V", "spayOtpListener", "Landroid/text/InputFilter;", "getFilter", "()Landroid/text/InputFilter;", "filter", "getOtp", "()Ljava/lang/String;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpayOtpTextView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f107891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ag0 f107892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji0 spayOtpListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f107895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f107896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayOtpTextView(Context context) {
        super(context);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f107895e = "";
        a(null);
    }

    private final InputFilter getFilter() {
        return new InputFilter() { // from class: ic2.iobyxmoadg
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
                return SpayOtpTextView.a(charSequence, i13, i14, spanned, i15, i16);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFocus(int length) {
        ArrayList arrayList = this.f107891a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (i13 == length) {
                    ag0 ag0Var = this.f107892b;
                    if (ag0Var == null || !ag0Var.isFocused()) {
                        ((fh0) arrayList.get(i13)).setViewState(0);
                    } else {
                        ((fh0) arrayList.get(i13)).setViewState(1);
                    }
                } else {
                    ((fh0) arrayList.get(i13)).setViewState(0);
                }
            }
            if (length == arrayList.size()) {
                ((fh0) arrayList.get(arrayList.size() - 1)).setViewState(1);
            }
        }
    }

    private final void setFocusDetection(ag0 spayOtpChildEditText) {
        if (spayOtpChildEditText == null) {
            return;
        }
        spayOtpChildEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ic2.zoijcleaow
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                SpayOtpTextView.a(this.f42405iobyxmoadg, view, z13);
            }
        });
    }

    private final void setTextWatcher(ag0 spayOtpChildEditText) {
        if (spayOtpChildEditText != null) {
            spayOtpChildEditText.addTextChangedListener(new pmvmpeiblj(this));
        }
    }

    public final String getOtp() {
        Editable text;
        ag0 ag0Var = this.f107892b;
        if (ag0Var == null || (text = ag0Var.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public final ji0 getSpayOtpListener() {
        return this.spayOtpListener;
    }

    public final void setOTP(CharSequence s13) {
        zdlpuopuiu.btonecajqb(s13, "s");
        ArrayList arrayList = this.f107891a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (i13 < s13.length()) {
                    if (this.f107894d) {
                        this.f107894d = false;
                    }
                    fh0.ppxfxbqfkf((fh0) arrayList.get(i13), String.valueOf(s13.charAt(i13)), i13 + 1 == s13.length(), false, this.f107895e.length() > s13.length(), 4);
                } else {
                    fh0.ppxfxbqfkf((fh0) arrayList.get(i13), "", false, this.f107894d, this.f107895e.length() > s13.length(), 2);
                }
            }
            this.f107895e = s13.toString();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener l13) {
        zdlpuopuiu.btonecajqb(l13, "l");
        super.setOnTouchListener(l13);
        ag0 ag0Var = this.f107892b;
        if (ag0Var != null) {
            ag0Var.setOnTouchListener(l13);
        }
    }

    public final void setSpayOtpListener(ji0 ji0Var) {
        this.spayOtpListener = ji0Var;
    }

    public static final CharSequence a(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
        while (i13 < i14) {
            if (!Pattern.compile("[1234567890]*").matcher(String.valueOf(charSequence.charAt(i13))).matches()) {
                return "";
            }
            i13++;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayOtpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f107895e = "";
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.SpayOtpTextView);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tyleable.SpayOtpTextView)");
        this.f107896f = typedArrayObtainStyledAttributes.getInt(R.styleable.SpayOtpTextView_spay_length, 4);
        this.f107891a = new ArrayList();
        if (this.f107896f > 0) {
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.SpayOtpTextView_spay_otp);
            int i13 = R.styleable.SpayOtpTextView_spay_width;
            Context context = getContext();
            zdlpuopuiu.dxjokdxxww(context, "context");
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(i13, xd0.iobyxmoadg(context, 48));
            int i14 = R.styleable.SpayOtpTextView_spay_height;
            Context context2 = getContext();
            zdlpuopuiu.dxjokdxxww(context2, "context");
            int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(i14, xd0.iobyxmoadg(context2, 48));
            int i15 = R.styleable.SpayOtpTextView_spay_box_margin;
            Context context3 = getContext();
            zdlpuopuiu.dxjokdxxww(context3, "context");
            int dimension3 = (int) typedArrayObtainStyledAttributes.getDimension(i15, xd0.iobyxmoadg(context3, -1));
            int i16 = R.styleable.SpayOtpTextView_spay_box_margin_left;
            Context context4 = getContext();
            zdlpuopuiu.dxjokdxxww(context4, "context");
            int dimension4 = (int) typedArrayObtainStyledAttributes.getDimension(i16, xd0.iobyxmoadg(context4, 4));
            int i17 = R.styleable.SpayOtpTextView_spay_box_margin_right;
            Context context5 = getContext();
            zdlpuopuiu.dxjokdxxww(context5, "context");
            int dimension5 = (int) typedArrayObtainStyledAttributes.getDimension(i17, xd0.iobyxmoadg(context5, 4));
            int i18 = R.styleable.SpayOtpTextView_spay_box_margin_top;
            Context context6 = getContext();
            zdlpuopuiu.dxjokdxxww(context6, "context");
            int dimension6 = (int) typedArrayObtainStyledAttributes.getDimension(i18, xd0.iobyxmoadg(context6, 4));
            int i19 = R.styleable.SpayOtpTextView_spay_box_margin_bottom;
            Context context7 = getContext();
            zdlpuopuiu.dxjokdxxww(context7, "context");
            int dimension7 = (int) typedArrayObtainStyledAttributes.getDimension(i19, xd0.iobyxmoadg(context7, 4));
            if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.SpayOtpTextView_spay_otp_box_match_parent, false)) {
                layoutParams = new LinearLayout.LayoutParams(dimension, dimension2, 1.0f);
            } else {
                layoutParams = new LinearLayout.LayoutParams(dimension, dimension2);
            }
            if (dimension3 > 0) {
                layoutParams.setMargins(dimension3, dimension3, dimension3, dimension3);
            } else {
                layoutParams.setMargins(dimension4, dimension6, dimension5, dimension7);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            Context context8 = getContext();
            zdlpuopuiu.dxjokdxxww(context8, "context");
            ag0 ag0Var = new ag0(context8);
            this.f107892b = ag0Var;
            ag0Var.setFilters(new InputFilter[]{getFilter(), new InputFilter.LengthFilter(this.f107896f)});
            setTextWatcher(this.f107892b);
            setFocusDetection(this.f107892b);
            addView(this.f107892b, layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = new LinearLayout(getContext());
            addView(linearLayout, layoutParams3);
            int i23 = this.f107896f;
            for (int i24 = 0; i24 < i23; i24++) {
                Context context9 = getContext();
                zdlpuopuiu.dxjokdxxww(context9, "context");
                fh0 fh0Var = new fh0(context9, attributeSet);
                fh0Var.setViewState(0);
                linearLayout.addView(fh0Var, i24, layoutParams);
                ArrayList arrayList = this.f107891a;
                if (arrayList != null) {
                    arrayList.add(fh0Var);
                }
            }
            if (string != null) {
                setOTP(string);
            } else {
                setOTP("");
            }
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        throw En.f70544zdlpuopuiu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpayOtpTextView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.f107895e = "";
        a(attributeSet);
    }

    public final void setOTP(String otp) {
        zdlpuopuiu.btonecajqb(otp, "otp");
        ag0 ag0Var = this.f107892b;
        if (ag0Var != null) {
            ag0Var.setText(otp);
        }
    }

    public static final void a(SpayOtpTextView this$0, View view, boolean z13) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        if (view.isFocused()) {
            String otp = this$0.getOtp();
            if (otp != null) {
                this$0.setFocus(otp.length());
                return;
            }
            return;
        }
        if (this$0.getOtp() != null) {
            this$0.setFocus(-1);
        }
    }
}
