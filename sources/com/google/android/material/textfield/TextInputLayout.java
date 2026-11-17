package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.mbcevpiqjq;
import androidx.appcompat.widget.yadqdtsiqt;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
    private int f23200ageimvtcrz;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private ColorStateList f23201auzgnhcxok;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private final Rect f23202bfopjjpdmp;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    boolean f23203cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private ColorStateList f23204cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private CharSequence f23205cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private boolean f23206crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private int f23207czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private int f23208dsvhmnatus;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private int f23209dvvnrvtcbc;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private int f23210esjtqupxsv;

    /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
    private boolean f23211ezmngbhpjk;

    /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
    private int f23212fiwbwshyhd;

    /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
    private boolean f23213fmlbqenlif;

    /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
    int f23214fyldjkxazc;

    /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
    final com.google.android.material.internal.iobyxmoadg f23215grlcpdaxtj;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private CharSequence f23216hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private TextView f23217hkdspvbjdz;

    /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
    private int f23218hszhottldk;

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    private ColorStateList f23219igdgnonuha;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private ra.lqeggnwhkg f23220ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f23221iozdgvuglv;

    /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
    private boolean f23222ipoelvxyzq;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final yggfygwlhe f23223istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    EditText f23224iwizpuwonk;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private int f23225iwxlajgraz;

    /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
    private boolean f23226ixidwrxhsl;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private Typeface f23227iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private boolean f23228jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private ra.lqeggnwhkg f23229jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f23230jpowsppfya;

    /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
    private ValueAnimator f23231jrbgnlbqoe;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final oxmwwwfdhm f23232jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private ra.gtknphoqwx f23233jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private ColorStateList f23234kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f23235lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private eablkybsjg f23236lmojexxdyd;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private int f23237lrnfpwlwnk;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    private int f23238lxfrhoxuzk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private ColorStateList f23239mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private final int f23240metgxyhuhe;

    /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
    private boolean f23241mhtqkkgtqm;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private ColorStateList f23242ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private Drawable f23243nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private final Rect f23244oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private ra.lqeggnwhkg f23245okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private final RectF f23246opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f23247pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f23248pmvmpeiblj;

    /* JADX INFO: renamed from: rhgxfdycjh, reason: collision with root package name */
    private boolean f23249rhgxfdycjh;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private ra.lqeggnwhkg f23250ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private int f23251rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    private Drawable f23252roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private int f23253sflfametgt;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    private int f23254skhdrjzrfn;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private CharSequence f23255sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private androidx.transition.ppxfxbqfkf f23256stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private int f23257tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private ColorStateList f23258tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private ColorStateList f23259uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private boolean f23260ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private int f23261uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private StateListDrawable f23262vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private Drawable f23263weqkydbzbr;

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    private int f23264wizcaqwiak;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private TextView f23265wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private androidx.transition.ppxfxbqfkf f23266wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f23267xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f23268yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private int f23269ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private int f23270yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lereixgezr f23271yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f23272ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final FrameLayout f23273zdlpuopuiu;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private final LinkedHashSet f23274zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private int f23275zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f23276zynmafqrjb;

    /* JADX INFO: renamed from: yzdjzghtvl, reason: collision with root package name */
    private static final int f23199yzdjzghtvl = da.gtknphoqwx.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: eslsurpljm, reason: collision with root package name */
    private static final int[][] f23198eslsurpljm = {new int[]{R.attr.state_pressed}, new int[0]};

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f23277iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        CharSequence f23278jyumaefscl;

        class iobyxmoadg implements Parcelable.ClassLoaderCreator {
            iobyxmoadg() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i13) {
                return new SavedState[i13];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f23278jyumaefscl) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            TextUtils.writeToParcel(this.f23278jyumaefscl, parcel, i13);
            parcel.writeInt(this.f23277iwizpuwonk ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23278jyumaefscl = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f23277iwizpuwonk = parcel.readInt() == 1;
        }
    }

    public interface eablkybsjg {
        int iobyxmoadg(Editable editable);
    }

    public interface gxszxtbevo {
        void iobyxmoadg(TextInputLayout textInputLayout);
    }

    class iobyxmoadg implements TextWatcher {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ EditText f23280yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f23281zdlpuopuiu;

        iobyxmoadg(EditText editText) {
            this.f23280yggfygwlhe = editText;
            this.f23281zdlpuopuiu = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.zeieaojujs(!textInputLayout.f23211ezmngbhpjk);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f23203cdpycssgdh) {
                textInputLayout2.yfnezrywwk(editable);
            }
            if (TextInputLayout.this.f23230jpowsppfya) {
                TextInputLayout.this.uawqvzlxes(editable);
            }
            int lineCount = this.f23280yggfygwlhe.getLineCount();
            int i13 = this.f23281zdlpuopuiu;
            if (lineCount != i13) {
                if (lineCount < i13) {
                    int iPmvmpeiblj = jhduphickx.pmvmpeiblj(this.f23280yggfygwlhe);
                    int i14 = TextInputLayout.this.f23214fyldjkxazc;
                    if (iPmvmpeiblj != i14) {
                        this.f23280yggfygwlhe.setMinimumHeight(i14);
                    }
                }
                this.f23281zdlpuopuiu = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }
    }

    class ppxfxbqfkf implements ValueAnimator.AnimatorUpdateListener {
        ppxfxbqfkf() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f23215grlcpdaxtj.uawqvzlxes(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class wkgbmnqykc extends v1.iobyxmoadg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final TextInputLayout f23283wkgbmnqykc;

        public wkgbmnqykc(TextInputLayout textInputLayout) {
            this.f23283wkgbmnqykc = textInputLayout;
        }

        @Override // v1.iobyxmoadg
        public void lqeggnwhkg(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
            super.lqeggnwhkg(view, zdlpuopuiuVar);
            EditText editText = this.f23283wkgbmnqykc.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f23283wkgbmnqykc.getHint();
            CharSequence error = this.f23283wkgbmnqykc.getError();
            CharSequence placeholderText = this.f23283wkgbmnqykc.getPlaceholderText();
            int counterMaxLength = this.f23283wkgbmnqykc.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f23283wkgbmnqykc.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zWypolnanlu = this.f23283wkgbmnqykc.wypolnanlu();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z13 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f23283wkgbmnqykc.f23271yggfygwlhe.pmvmpeiblj(zdlpuopuiuVar);
            if (!zIsEmpty) {
                zdlpuopuiuVar.yzdjzghtvl(text);
            } else if (!TextUtils.isEmpty(string)) {
                zdlpuopuiuVar.yzdjzghtvl(string);
                if (!zWypolnanlu && placeholderText != null) {
                    zdlpuopuiuVar.yzdjzghtvl(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                zdlpuopuiuVar.yzdjzghtvl(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                zdlpuopuiuVar.roivzttewh(string);
                zdlpuopuiuVar.jrbgnlbqoe(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            zdlpuopuiuVar.skhdrjzrfn(counterMaxLength);
            if (z13) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                zdlpuopuiuVar.lrnfpwlwnk(error);
            }
            View viewZdlpuopuiu = this.f23283wkgbmnqykc.f23223istkbnxepw.zdlpuopuiu();
            if (viewZdlpuopuiu != null) {
                zdlpuopuiuVar.auzgnhcxok(viewZdlpuopuiu);
            }
            this.f23283wkgbmnqykc.f23232jyumaefscl.wflxmlrfwp().ojitshcjhn(view, zdlpuopuiuVar);
        }

        @Override // v1.iobyxmoadg
        public void nufgyqmvbu(View view, AccessibilityEvent accessibilityEvent) {
            super.nufgyqmvbu(view, accessibilityEvent);
            this.f23283wkgbmnqykc.f23232jyumaefscl.wflxmlrfwp().rgvfuqvkyq(view, accessibilityEvent);
        }
    }

    class zoijcleaow implements Runnable {
        zoijcleaow() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f23232jyumaefscl.nufgyqmvbu();
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.textInputStyle);
    }

    private void agtfadlqog() {
        if (this.f23220ikoacuggdj == null || this.f23245okpsazkaxt == null) {
            return;
        }
        if (cqumvgiudr()) {
            this.f23220ikoacuggdj.crxdokpmqz(this.f23224iwizpuwonk.isFocused() ? ColorStateList.valueOf(this.f23225iwxlajgraz) : ColorStateList.valueOf(this.f23253sflfametgt));
            this.f23245okpsazkaxt.crxdokpmqz(ColorStateList.valueOf(this.f23253sflfametgt));
        }
        invalidate();
    }

    private void auzgnhcxok(boolean z13, boolean z14) {
        int defaultColor = this.f23219igdgnonuha.getDefaultColor();
        int colorForState = this.f23219igdgnonuha.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f23219igdgnonuha.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z13) {
            this.f23253sflfametgt = colorForState2;
        } else if (z14) {
            this.f23253sflfametgt = colorForState;
        } else {
            this.f23253sflfametgt = defaultColor;
        }
    }

    private void btonecajqb() {
        TextView textView = this.f23217hkdspvbjdz;
        if (textView != null) {
            this.f23273zdlpuopuiu.addView(textView);
            this.f23217hkdspvbjdz.setVisibility(0);
        }
    }

    private void cdpycssgdh(Canvas canvas) {
        ra.lqeggnwhkg lqeggnwhkgVar;
        if (this.f23245okpsazkaxt == null || (lqeggnwhkgVar = this.f23220ikoacuggdj) == null) {
            return;
        }
        lqeggnwhkgVar.draw(canvas);
        if (this.f23224iwizpuwonk.isFocused()) {
            Rect bounds = this.f23245okpsazkaxt.getBounds();
            Rect bounds2 = this.f23220ikoacuggdj.getBounds();
            float fIozdgvuglv = this.f23215grlcpdaxtj.iozdgvuglv();
            int iCenterX = bounds2.centerX();
            bounds.left = ea.iobyxmoadg.ppxfxbqfkf(iCenterX, bounds2.left, fIozdgvuglv);
            bounds.right = ea.iobyxmoadg.ppxfxbqfkf(iCenterX, bounds2.right, fIozdgvuglv);
            this.f23245okpsazkaxt.draw(canvas);
        }
    }

    private boolean cqumvgiudr() {
        return this.f23261uwvvkdfqfp > -1 && this.f23253sflfametgt != 0;
    }

    private void crxdokpmqz() {
        if (!zynmafqrjb() || this.f23222ipoelvxyzq) {
            return;
        }
        esjtqupxsv();
        sopmlzcsov();
    }

    private void czzsidtyhn(Rect rect) {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f23220ikoacuggdj;
        if (lqeggnwhkgVar != null) {
            int i13 = rect.bottom;
            lqeggnwhkgVar.setBounds(rect.left, i13 - this.f23270yfnezrywwk, rect.right, i13);
        }
        ra.lqeggnwhkg lqeggnwhkgVar2 = this.f23245okpsazkaxt;
        if (lqeggnwhkgVar2 != null) {
            int i14 = rect.bottom;
            lqeggnwhkgVar2.setBounds(rect.left, i14 - this.f23269ydmasvzmpa, rect.right, i14);
        }
    }

    private void esjtqupxsv() {
        if (zynmafqrjb()) {
            ((nufgyqmvbu) this.f23229jlmebxxoox).bfopjjpdmp();
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f23224iwizpuwonk;
        if (!(editText instanceof AutoCompleteTextView) || vdvldrhtss.iobyxmoadg(editText)) {
            return this.f23229jlmebxxoox;
        }
        int iWkgbmnqykc = ia.iobyxmoadg.wkgbmnqykc(this.f23224iwizpuwonk, da.zoijcleaow.colorControlHighlight);
        int i13 = this.f23251rlfsiqarku;
        if (i13 == 2) {
            return hcddaimhww(getContext(), this.f23229jlmebxxoox, iWkgbmnqykc, f23198eslsurpljm);
        }
        if (i13 == 1) {
            return wwaezpbzkn(this.f23229jlmebxxoox, this.f23275zfvoamnweg, iWkgbmnqykc, f23198eslsurpljm);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f23262vipkmwdibw == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f23262vipkmwdibw = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f23262vipkmwdibw.addState(new int[0], lmojexxdyd(false));
        }
        return this.f23262vipkmwdibw;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f23250ribwqtqdhb == null) {
            this.f23250ribwqtqdhb = lmojexxdyd(true);
        }
        return this.f23250ribwqtqdhb;
    }

    private void gtknphoqwx() {
        if (this.f23224iwizpuwonk == null || this.f23251rlfsiqarku != 1) {
            return;
        }
        if (oa.ppxfxbqfkf.dxjokdxxww(getContext())) {
            EditText editText = this.f23224iwizpuwonk;
            jhduphickx.lxfrhoxuzk(editText, jhduphickx.yadqdtsiqt(editText), getResources().getDimensionPixelSize(da.wkgbmnqykc.material_filled_edittext_font_2_0_padding_top), jhduphickx.cdpycssgdh(this.f23224iwizpuwonk), getResources().getDimensionPixelSize(da.wkgbmnqykc.material_filled_edittext_font_2_0_padding_bottom));
        } else if (oa.ppxfxbqfkf.nufgyqmvbu(getContext())) {
            EditText editText2 = this.f23224iwizpuwonk;
            jhduphickx.lxfrhoxuzk(editText2, jhduphickx.yadqdtsiqt(editText2), getResources().getDimensionPixelSize(da.wkgbmnqykc.material_filled_edittext_font_1_3_padding_top), jhduphickx.cdpycssgdh(this.f23224iwizpuwonk), getResources().getDimensionPixelSize(da.wkgbmnqykc.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private static Drawable hcddaimhww(Context context, ra.lqeggnwhkg lqeggnwhkgVar, int i13, int[][] iArr) {
        int iPpxfxbqfkf = ia.iobyxmoadg.ppxfxbqfkf(context, da.zoijcleaow.colorSurface, "TextInputLayout");
        ra.lqeggnwhkg lqeggnwhkgVar2 = new ra.lqeggnwhkg(lqeggnwhkgVar.cdpycssgdh());
        int iBtonecajqb = ia.iobyxmoadg.btonecajqb(i13, iPpxfxbqfkf, 0.1f);
        lqeggnwhkgVar2.crxdokpmqz(new ColorStateList(iArr, new int[]{iBtonecajqb, 0}));
        lqeggnwhkgVar2.setTint(iPpxfxbqfkf);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iBtonecajqb, iPpxfxbqfkf});
        ra.lqeggnwhkg lqeggnwhkgVar3 = new ra.lqeggnwhkg(lqeggnwhkgVar.cdpycssgdh());
        lqeggnwhkgVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, lqeggnwhkgVar2, lqeggnwhkgVar3), lqeggnwhkgVar});
    }

    private void iozdgvuglv(boolean z13) {
        ValueAnimator valueAnimator = this.f23231jrbgnlbqoe;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23231jrbgnlbqoe.cancel();
        }
        if (z13 && this.f23226ixidwrxhsl) {
            draadjrbmk(0.0f);
        } else {
            this.f23215grlcpdaxtj.uawqvzlxes(0.0f);
        }
        if (zynmafqrjb() && ((nufgyqmvbu) this.f23229jlmebxxoox).oipsdeybqn()) {
            esjtqupxsv();
        }
        this.f23222ipoelvxyzq = true;
        jpowsppfya();
        this.f23271yggfygwlhe.draadjrbmk(true);
        this.f23232jyumaefscl.wwaezpbzkn(true);
    }

    private void istkbnxepw() {
        Iterator it = this.f23274zeieaojujs.iterator();
        while (it.hasNext()) {
            ((gxszxtbevo) it.next()).iobyxmoadg(this);
        }
    }

    private boolean iwizpuwonk() {
        return this.f23251rlfsiqarku == 2 && cqumvgiudr();
    }

    private void jhduphickx() {
        EditText editText = this.f23224iwizpuwonk;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i13 = this.f23251rlfsiqarku;
                if (i13 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i13 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private static void jlmebxxoox(ViewGroup viewGroup, boolean z13) {
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            childAt.setEnabled(z13);
            if (childAt instanceof ViewGroup) {
                jlmebxxoox((ViewGroup) childAt, z13);
            }
        }
    }

    private void jpowsppfya() {
        TextView textView = this.f23217hkdspvbjdz;
        if (textView == null || !this.f23230jpowsppfya) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.kcexrzcfyt.iobyxmoadg(this.f23273zdlpuopuiu, this.f23256stevsuqkhv);
        this.f23217hkdspvbjdz.setVisibility(4);
    }

    private int jyumaefscl() {
        float fOxmwwwfdhm;
        if (!this.f23260ulzqkzuiru) {
            return 0;
        }
        int i13 = this.f23251rlfsiqarku;
        if (i13 == 0) {
            fOxmwwwfdhm = this.f23215grlcpdaxtj.oxmwwwfdhm();
        } else {
            if (i13 != 2) {
                return 0;
            }
            fOxmwwwfdhm = this.f23215grlcpdaxtj.oxmwwwfdhm() / 2.0f;
        }
        return (int) fOxmwwwfdhm;
    }

    private boolean jztzpxfvev() {
        return (this.f23232jyumaefscl.lmojexxdyd() || ((this.f23232jyumaefscl.pmvmpeiblj() && hkdspvbjdz()) || this.f23232jyumaefscl.iwizpuwonk() != null)) && this.f23232jyumaefscl.getMeasuredWidth() > 0;
    }

    private int kcexrzcfyt(Rect rect, Rect rect2, float f13) {
        return tzroggbefp() ? (int) (rect2.top + f13) : rect.bottom - this.f23224iwizpuwonk.getCompoundPaddingBottom();
    }

    private void lereixgezr(boolean z13) {
        ValueAnimator valueAnimator = this.f23231jrbgnlbqoe;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23231jrbgnlbqoe.cancel();
        }
        if (z13 && this.f23226ixidwrxhsl) {
            draadjrbmk(1.0f);
        } else {
            this.f23215grlcpdaxtj.uawqvzlxes(1.0f);
        }
        this.f23222ipoelvxyzq = false;
        if (zynmafqrjb()) {
            sopmlzcsov();
        }
        roivzttewh();
        this.f23271yggfygwlhe.draadjrbmk(false);
        this.f23232jyumaefscl.wwaezpbzkn(false);
    }

    private ra.lqeggnwhkg lmojexxdyd(boolean z13) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(da.wkgbmnqykc.mtrl_shape_corner_size_small_component);
        float f13 = z13 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f23224iwizpuwonk;
        float popupElevation = editText instanceof jyumaefscl ? ((jyumaefscl) editText).getPopupElevation() : getResources().getDimensionPixelOffset(da.wkgbmnqykc.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(da.wkgbmnqykc.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ra.gtknphoqwx gtknphoqwxVarWflxmlrfwp = ra.gtknphoqwx.iobyxmoadg().istkbnxepw(f13).lmojexxdyd(f13).yggfygwlhe(dimensionPixelOffset).esjtqupxsv(dimensionPixelOffset).wflxmlrfwp();
        EditText editText2 = this.f23224iwizpuwonk;
        ra.lqeggnwhkg lqeggnwhkgVarWflxmlrfwp = ra.lqeggnwhkg.wflxmlrfwp(getContext(), popupElevation, editText2 instanceof jyumaefscl ? ((jyumaefscl) editText2).getDropDownBackgroundTintList() : null);
        lqeggnwhkgVarWflxmlrfwp.setShapeAppearanceModel(gtknphoqwxVarWflxmlrfwp);
        lqeggnwhkgVarWflxmlrfwp.ribwqtqdhb(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return lqeggnwhkgVarWflxmlrfwp;
    }

    private void lrnfpwlwnk() {
        if (this.f23251rlfsiqarku != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f23273zdlpuopuiu.getLayoutParams();
            int iJyumaefscl = jyumaefscl();
            if (iJyumaefscl != layoutParams.topMargin) {
                layoutParams.topMargin = iJyumaefscl;
                this.f23273zdlpuopuiu.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int mbcevpiqjq(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void metgxyhuhe() {
        if (this.f23217hkdspvbjdz == null || !this.f23230jpowsppfya || TextUtils.isEmpty(this.f23216hcddaimhww)) {
            return;
        }
        this.f23217hkdspvbjdz.setText(this.f23216hcddaimhww);
        androidx.transition.kcexrzcfyt.iobyxmoadg(this.f23273zdlpuopuiu, this.f23266wypolnanlu);
        this.f23217hkdspvbjdz.setVisibility(0);
        this.f23217hkdspvbjdz.bringToFront();
        announceForAccessibility(this.f23216hcddaimhww);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ntlheqmsrt() {
        this.f23224iwizpuwonk.requestLayout();
    }

    private void nuxfzjnpeb(boolean z13, boolean z14) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f23224iwizpuwonk;
        boolean z15 = false;
        boolean z16 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f23224iwizpuwonk;
        if (editText2 != null && editText2.hasFocus()) {
            z15 = true;
        }
        ColorStateList colorStateList2 = this.f23259uawqvzlxes;
        if (colorStateList2 != null) {
            this.f23215grlcpdaxtj.okpsazkaxt(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f23259uawqvzlxes;
            this.f23215grlcpdaxtj.okpsazkaxt(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f23200ageimvtcrz) : this.f23200ageimvtcrz));
        } else if (okpsazkaxt()) {
            this.f23215grlcpdaxtj.okpsazkaxt(this.f23223istkbnxepw.oxmwwwfdhm());
        } else if (this.f23221iozdgvuglv && (textView = this.f23265wwaezpbzkn) != null) {
            this.f23215grlcpdaxtj.okpsazkaxt(textView.getTextColors());
        } else if (z15 && (colorStateList = this.f23201auzgnhcxok) != null) {
            this.f23215grlcpdaxtj.czzsidtyhn(colorStateList);
        }
        if (z16 || !this.f23241mhtqkkgtqm || (isEnabled() && z15)) {
            if (z14 || this.f23222ipoelvxyzq) {
                lereixgezr(z13);
                return;
            }
            return;
        }
        if (z14 || !this.f23222ipoelvxyzq) {
            iozdgvuglv(z13);
        }
    }

    private void ojitshcjhn(RectF rectF) {
        float f13 = rectF.left;
        int i13 = this.f23240metgxyhuhe;
        rectF.left = f13 - i13;
        rectF.right += i13;
    }

    private void opjhrmiecq() {
        jhduphickx.weqkydbzbr(this.f23224iwizpuwonk, getEditTextBoxBackground());
    }

    private Rect oxmwwwfdhm(Rect rect) {
        if (this.f23224iwizpuwonk == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f23202bfopjjpdmp;
        boolean zNufgyqmvbu = com.google.android.material.internal.ojitshcjhn.nufgyqmvbu(this);
        rect2.bottom = rect.bottom;
        int i13 = this.f23251rlfsiqarku;
        if (i13 == 1) {
            rect2.left = ylkuphrtab(rect.left, zNufgyqmvbu);
            rect2.top = rect.top + this.f23207czzsidtyhn;
            rect2.right = pkzmftpjix(rect.right, zNufgyqmvbu);
            return rect2;
        }
        if (i13 != 2) {
            rect2.left = ylkuphrtab(rect.left, zNufgyqmvbu);
            rect2.top = getPaddingTop();
            rect2.right = pkzmftpjix(rect.right, zNufgyqmvbu);
            return rect2;
        }
        rect2.left = rect.left + this.f23224iwizpuwonk.getPaddingLeft();
        rect2.top = rect.top - jyumaefscl();
        rect2.right = rect.right - this.f23224iwizpuwonk.getPaddingRight();
        return rect2;
    }

    private int pkzmftpjix(int i13, boolean z13) {
        int compoundPaddingRight;
        if (z13 || getSuffixText() == null) {
            compoundPaddingRight = (!z13 || getPrefixText() == null) ? this.f23224iwizpuwonk.getCompoundPaddingRight() : this.f23271yggfygwlhe.ppxfxbqfkf();
        } else {
            compoundPaddingRight = this.f23232jyumaefscl.esjtqupxsv();
        }
        return i13 - compoundPaddingRight;
    }

    private androidx.transition.ppxfxbqfkf pmvmpeiblj() {
        androidx.transition.ppxfxbqfkf ppxfxbqfkfVar = new androidx.transition.ppxfxbqfkf();
        ppxfxbqfkfVar.czzsidtyhn(na.nufgyqmvbu.gxszxtbevo(getContext(), da.zoijcleaow.motionDurationShort2, 87));
        ppxfxbqfkfVar.yfnezrywwk(na.nufgyqmvbu.lqeggnwhkg(getContext(), da.zoijcleaow.motionEasingLinearInterpolator, ea.iobyxmoadg.f31020iobyxmoadg));
        return ppxfxbqfkfVar;
    }

    private void rgvfuqvkyq() {
        int i13 = this.f23251rlfsiqarku;
        if (i13 == 0) {
            this.f23229jlmebxxoox = null;
            this.f23220ikoacuggdj = null;
            this.f23245okpsazkaxt = null;
            return;
        }
        if (i13 == 1) {
            this.f23229jlmebxxoox = new ra.lqeggnwhkg(this.f23233jztzpxfvev);
            this.f23220ikoacuggdj = new ra.lqeggnwhkg();
            this.f23245okpsazkaxt = new ra.lqeggnwhkg();
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException(this.f23251rlfsiqarku + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f23260ulzqkzuiru || (this.f23229jlmebxxoox instanceof nufgyqmvbu)) {
                this.f23229jlmebxxoox = new ra.lqeggnwhkg(this.f23233jztzpxfvev);
            } else {
                this.f23229jlmebxxoox = nufgyqmvbu.zfvoamnweg(this.f23233jztzpxfvev);
            }
            this.f23220ikoacuggdj = null;
            this.f23245okpsazkaxt = null;
        }
    }

    private void rlfsiqarku() {
        if (this.f23251rlfsiqarku == 1) {
            if (oa.ppxfxbqfkf.dxjokdxxww(getContext())) {
                this.f23207czzsidtyhn = getResources().getDimensionPixelSize(da.wkgbmnqykc.material_font_2_0_box_collapsed_padding_top);
            } else if (oa.ppxfxbqfkf.nufgyqmvbu(getContext())) {
                this.f23207czzsidtyhn = getResources().getDimensionPixelSize(da.wkgbmnqykc.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void roivzttewh() {
        EditText editText = this.f23224iwizpuwonk;
        uawqvzlxes(editText == null ? null : editText.getText());
    }

    private void setEditText(EditText editText) {
        if (this.f23224iwizpuwonk != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f23224iwizpuwonk = editText;
        int i13 = this.f23210esjtqupxsv;
        if (i13 != -1) {
            setMinEms(i13);
        } else {
            setMinWidth(this.f23248pmvmpeiblj);
        }
        int i14 = this.f23235lereixgezr;
        if (i14 != -1) {
            setMaxEms(i14);
        } else {
            setMaxWidth(this.f23276zynmafqrjb);
        }
        this.f23228jhduphickx = false;
        ulzqkzuiru();
        setTextInputAccessibilityDelegate(new wkgbmnqykc(this));
        this.f23215grlcpdaxtj.ixidwrxhsl(this.f23224iwizpuwonk.getTypeface());
        this.f23215grlcpdaxtj.nuxfzjnpeb(this.f23224iwizpuwonk.getTextSize());
        int i15 = Build.VERSION.SDK_INT;
        this.f23215grlcpdaxtj.opjhrmiecq(this.f23224iwizpuwonk.getLetterSpacing());
        int gravity = this.f23224iwizpuwonk.getGravity();
        this.f23215grlcpdaxtj.uwvvkdfqfp((gravity & (-113)) | 48);
        this.f23215grlcpdaxtj.zeieaojujs(gravity);
        this.f23214fyldjkxazc = jhduphickx.pmvmpeiblj(editText);
        this.f23224iwizpuwonk.addTextChangedListener(new iobyxmoadg(editText));
        if (this.f23259uawqvzlxes == null) {
            this.f23259uawqvzlxes = this.f23224iwizpuwonk.getHintTextColors();
        }
        if (this.f23260ulzqkzuiru) {
            if (TextUtils.isEmpty(this.f23255sopmlzcsov)) {
                CharSequence hint = this.f23224iwizpuwonk.getHint();
                this.f23205cqumvgiudr = hint;
                setHint(hint);
                this.f23224iwizpuwonk.setHint((CharSequence) null);
            }
            this.f23206crxdokpmqz = true;
        }
        if (i15 >= 29) {
            zfvoamnweg();
        }
        if (this.f23265wwaezpbzkn != null) {
            yfnezrywwk(this.f23224iwizpuwonk.getText());
        }
        bfopjjpdmp();
        this.f23223istkbnxepw.gxszxtbevo();
        this.f23271yggfygwlhe.bringToFront();
        this.f23232jyumaefscl.bringToFront();
        istkbnxepw();
        this.f23232jyumaefscl.roivzttewh();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        nuxfzjnpeb(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f23255sopmlzcsov)) {
            return;
        }
        this.f23255sopmlzcsov = charSequence;
        this.f23215grlcpdaxtj.ipoelvxyzq(charSequence);
        if (this.f23222ipoelvxyzq) {
            return;
        }
        sopmlzcsov();
    }

    private void setPlaceholderTextEnabled(boolean z13) {
        if (this.f23230jpowsppfya == z13) {
            return;
        }
        if (z13) {
            btonecajqb();
        } else {
            vipkmwdibw();
            this.f23217hkdspvbjdz = null;
        }
        this.f23230jpowsppfya = z13;
    }

    private void sflfametgt() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f23265wwaezpbzkn;
        if (textView != null) {
            ikoacuggdj(textView, this.f23221iozdgvuglv ? this.f23272ylkuphrtab : this.f23247pkzmftpjix);
            if (!this.f23221iozdgvuglv && (colorStateList2 = this.f23234kegysxyocb) != null) {
                this.f23265wwaezpbzkn.setTextColor(colorStateList2);
            }
            if (!this.f23221iozdgvuglv || (colorStateList = this.f23258tzroggbefp) == null) {
                return;
            }
            this.f23265wwaezpbzkn.setTextColor(colorStateList);
        }
    }

    private void sopmlzcsov() {
        if (zynmafqrjb()) {
            RectF rectF = this.f23246opjhrmiecq;
            this.f23215grlcpdaxtj.ojitshcjhn(rectF, this.f23224iwizpuwonk.getWidth(), this.f23224iwizpuwonk.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            ojitshcjhn(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f23261uwvvkdfqfp);
            ((nufgyqmvbu) this.f23229jlmebxxoox).iyctptxqzt(rectF);
        }
    }

    private boolean stevsuqkhv() {
        return okpsazkaxt() || (this.f23265wwaezpbzkn != null && this.f23221iozdgvuglv);
    }

    private void tbqsvytpvh() {
        EditText editText;
        if (this.f23217hkdspvbjdz == null || (editText = this.f23224iwizpuwonk) == null) {
            return;
        }
        this.f23217hkdspvbjdz.setGravity(editText.getGravity());
        this.f23217hkdspvbjdz.setPadding(this.f23224iwizpuwonk.getCompoundPaddingLeft(), this.f23224iwizpuwonk.getCompoundPaddingTop(), this.f23224iwizpuwonk.getCompoundPaddingRight(), this.f23224iwizpuwonk.getCompoundPaddingBottom());
    }

    private boolean tzroggbefp() {
        return this.f23251rlfsiqarku == 1 && this.f23224iwizpuwonk.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uawqvzlxes(Editable editable) {
        if (this.f23236lmojexxdyd.iobyxmoadg(editable) != 0 || this.f23222ipoelvxyzq) {
            jpowsppfya();
        } else {
            metgxyhuhe();
        }
    }

    private void ulzqkzuiru() {
        rgvfuqvkyq();
        iyctptxqzt();
        iwxlajgraz();
        rlfsiqarku();
        gtknphoqwx();
        if (this.f23251rlfsiqarku != 0) {
            lrnfpwlwnk();
        }
        jhduphickx();
    }

    private void uwvvkdfqfp() {
        if (this.f23265wwaezpbzkn != null) {
            EditText editText = this.f23224iwizpuwonk;
            yfnezrywwk(editText == null ? null : editText.getText());
        }
    }

    private int vdvldrhtss() {
        return this.f23251rlfsiqarku == 1 ? ia.iobyxmoadg.dxjokdxxww(ia.iobyxmoadg.eablkybsjg(this, da.zoijcleaow.colorSurface, 0), this.f23275zfvoamnweg) : this.f23275zfvoamnweg;
    }

    private void vipkmwdibw() {
        TextView textView = this.f23217hkdspvbjdz;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private boolean weqkydbzbr() {
        int iMax;
        if (this.f23224iwizpuwonk == null || this.f23224iwizpuwonk.getMeasuredHeight() >= (iMax = Math.max(this.f23232jyumaefscl.getMeasuredHeight(), this.f23271yggfygwlhe.getMeasuredHeight()))) {
            return false;
        }
        this.f23224iwizpuwonk.setMinimumHeight(iMax);
        return true;
    }

    private void wflxmlrfwp() {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f23229jlmebxxoox;
        if (lqeggnwhkgVar == null) {
            return;
        }
        ra.gtknphoqwx gtknphoqwxVarCdpycssgdh = lqeggnwhkgVar.cdpycssgdh();
        ra.gtknphoqwx gtknphoqwxVar = this.f23233jztzpxfvev;
        if (gtknphoqwxVarCdpycssgdh != gtknphoqwxVar) {
            this.f23229jlmebxxoox.setShapeAppearanceModel(gtknphoqwxVar);
        }
        if (iwizpuwonk()) {
            this.f23229jlmebxxoox.jztzpxfvev(this.f23261uwvvkdfqfp, this.f23253sflfametgt);
        }
        int iVdvldrhtss = vdvldrhtss();
        this.f23275zfvoamnweg = iVdvldrhtss;
        this.f23229jlmebxxoox.crxdokpmqz(ColorStateList.valueOf(iVdvldrhtss));
        agtfadlqog();
        iyctptxqzt();
    }

    private static Drawable wwaezpbzkn(ra.lqeggnwhkg lqeggnwhkgVar, int i13, int i14, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{ia.iobyxmoadg.btonecajqb(i14, i13, 0.1f), i13}), lqeggnwhkgVar, lqeggnwhkgVar);
    }

    private boolean xrmfcynszj() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f23271yggfygwlhe.getMeasuredWidth() > 0;
    }

    private void yadqdtsiqt(Canvas canvas) {
        if (this.f23260ulzqkzuiru) {
            this.f23215grlcpdaxtj.draadjrbmk(canvas);
        }
    }

    private static void ydmasvzmpa(Context context, TextView textView, int i13, int i14, boolean z13) {
        textView.setContentDescription(context.getString(z13 ? da.btonecajqb.character_counter_overflowed_content_description : da.btonecajqb.character_counter_content_description, Integer.valueOf(i13), Integer.valueOf(i14)));
    }

    private Rect yggfygwlhe(Rect rect) {
        if (this.f23224iwizpuwonk == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f23202bfopjjpdmp;
        float fIstkbnxepw = this.f23215grlcpdaxtj.istkbnxepw();
        rect2.left = rect.left + this.f23224iwizpuwonk.getCompoundPaddingLeft();
        rect2.top = zdlpuopuiu(rect, fIstkbnxepw);
        rect2.right = rect.right - this.f23224iwizpuwonk.getCompoundPaddingRight();
        rect2.bottom = kcexrzcfyt(rect, rect2, fIstkbnxepw);
        return rect2;
    }

    private int ylkuphrtab(int i13, boolean z13) {
        int compoundPaddingLeft;
        if (z13 || getPrefixText() == null) {
            compoundPaddingLeft = (!z13 || getSuffixText() == null) ? this.f23224iwizpuwonk.getCompoundPaddingLeft() : this.f23232jyumaefscl.esjtqupxsv();
        } else {
            compoundPaddingLeft = this.f23271yggfygwlhe.ppxfxbqfkf();
        }
        return i13 + compoundPaddingLeft;
    }

    private int zdlpuopuiu(Rect rect, float f13) {
        return tzroggbefp() ? (int) (rect.centerY() - (f13 / 2.0f)) : rect.top + this.f23224iwizpuwonk.getCompoundPaddingTop();
    }

    private void zfvoamnweg() {
        ColorStateList colorStateList;
        ColorStateList colorStateListLqeggnwhkg = this.f23239mbcevpiqjq;
        if (colorStateListLqeggnwhkg == null) {
            colorStateListLqeggnwhkg = ia.iobyxmoadg.lqeggnwhkg(getContext(), da.zoijcleaow.colorControlActivated);
        }
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(this.f23224iwizpuwonk.getTextCursorDrawable()).mutate();
        if (stevsuqkhv() && (colorStateList = this.f23242ntlheqmsrt) != null) {
            colorStateListLqeggnwhkg = colorStateList;
        }
        k1.iobyxmoadg.ojitshcjhn(drawableMutate, colorStateListLqeggnwhkg);
    }

    private boolean zynmafqrjb() {
        return this.f23260ulzqkzuiru && !TextUtils.isEmpty(this.f23255sopmlzcsov) && (this.f23229jlmebxxoox instanceof nufgyqmvbu);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i13, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f23273zdlpuopuiu.addView(view, layoutParams2);
        this.f23273zdlpuopuiu.setLayoutParams(layoutParams);
        lrnfpwlwnk();
        setEditText((EditText) view);
    }

    void bfopjjpdmp() {
        Drawable background;
        TextView textView;
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null || this.f23251rlfsiqarku != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (yadqdtsiqt.iobyxmoadg(background)) {
            background = background.mutate();
        }
        if (okpsazkaxt()) {
            background.setColorFilter(androidx.appcompat.widget.nufgyqmvbu.eablkybsjg(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f23221iozdgvuglv && (textView = this.f23265wwaezpbzkn) != null) {
            background.setColorFilter(androidx.appcompat.widget.nufgyqmvbu.eablkybsjg(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            k1.iobyxmoadg.ppxfxbqfkf(background);
            this.f23224iwizpuwonk.refreshDrawableState();
        }
    }

    public boolean cllcsxoeiz() {
        return this.f23223istkbnxepw.pmvmpeiblj();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i13) {
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i13);
            return;
        }
        if (this.f23205cqumvgiudr != null) {
            boolean z13 = this.f23206crxdokpmqz;
            this.f23206crxdokpmqz = false;
            CharSequence hint = editText.getHint();
            this.f23224iwizpuwonk.setHint(this.f23205cqumvgiudr);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i13);
                return;
            } finally {
                this.f23224iwizpuwonk.setHint(hint);
                this.f23206crxdokpmqz = z13;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i13);
        onProvideAutofillVirtualStructure(viewStructure, i13);
        viewStructure.setChildCount(this.f23273zdlpuopuiu.getChildCount());
        for (int i14 = 0; i14 < this.f23273zdlpuopuiu.getChildCount(); i14++) {
            View childAt = this.f23273zdlpuopuiu.getChildAt(i14);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i14);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i13);
            if (childAt == this.f23224iwizpuwonk) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f23211ezmngbhpjk = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f23211ezmngbhpjk = false;
    }

    void draadjrbmk(float f13) {
        if (this.f23215grlcpdaxtj.iozdgvuglv() == f13) {
            return;
        }
        if (this.f23231jrbgnlbqoe == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f23231jrbgnlbqoe = valueAnimator;
            valueAnimator.setInterpolator(na.nufgyqmvbu.lqeggnwhkg(getContext(), da.zoijcleaow.motionEasingEmphasizedInterpolator, ea.iobyxmoadg.f31023zoijcleaow));
            this.f23231jrbgnlbqoe.setDuration(na.nufgyqmvbu.gxszxtbevo(getContext(), da.zoijcleaow.motionDurationMedium4, 167));
            this.f23231jrbgnlbqoe.addUpdateListener(new ppxfxbqfkf());
        }
        this.f23231jrbgnlbqoe.setFloatValues(this.f23215grlcpdaxtj.iozdgvuglv(), f13);
        this.f23231jrbgnlbqoe.start();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        yadqdtsiqt(canvas);
        cdpycssgdh(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f23213fmlbqenlif) {
            return;
        }
        this.f23213fmlbqenlif = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.iobyxmoadg iobyxmoadgVar = this.f23215grlcpdaxtj;
        boolean zAgeimvtcrz = iobyxmoadgVar != null ? iobyxmoadgVar.ageimvtcrz(drawableState) : false;
        if (this.f23224iwizpuwonk != null) {
            zeieaojujs(jhduphickx.tzroggbefp(this) && isEnabled());
        }
        bfopjjpdmp();
        iwxlajgraz();
        if (zAgeimvtcrz) {
            invalidate();
        }
        this.f23213fmlbqenlif = false;
    }

    public boolean dsvhmnatus() {
        return this.f23223istkbnxepw.zynmafqrjb();
    }

    public void dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        this.f23274zeieaojujs.add(gxszxtbevoVar);
        if (this.f23224iwizpuwonk != null) {
            gxszxtbevoVar.iobyxmoadg(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f23224iwizpuwonk;
        return editText != null ? editText.getBaseline() + getPaddingTop() + jyumaefscl() : super.getBaseline();
    }

    ra.lqeggnwhkg getBoxBackground() {
        int i13 = this.f23251rlfsiqarku;
        if (i13 == 1 || i13 == 2) {
            return this.f23229jlmebxxoox;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f23275zfvoamnweg;
    }

    public int getBoxBackgroundMode() {
        return this.f23251rlfsiqarku;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f23207czzsidtyhn;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.ojitshcjhn.nufgyqmvbu(this) ? this.f23233jztzpxfvev.btonecajqb().iobyxmoadg(this.f23246opjhrmiecq) : this.f23233jztzpxfvev.draadjrbmk().iobyxmoadg(this.f23246opjhrmiecq);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.ojitshcjhn.nufgyqmvbu(this) ? this.f23233jztzpxfvev.draadjrbmk().iobyxmoadg(this.f23246opjhrmiecq) : this.f23233jztzpxfvev.btonecajqb().iobyxmoadg(this.f23246opjhrmiecq);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.ojitshcjhn.nufgyqmvbu(this) ? this.f23233jztzpxfvev.oxmwwwfdhm().iobyxmoadg(this.f23246opjhrmiecq) : this.f23233jztzpxfvev.zdlpuopuiu().iobyxmoadg(this.f23246opjhrmiecq);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.ojitshcjhn.nufgyqmvbu(this) ? this.f23233jztzpxfvev.zdlpuopuiu().iobyxmoadg(this.f23246opjhrmiecq) : this.f23233jztzpxfvev.oxmwwwfdhm().iobyxmoadg(this.f23246opjhrmiecq);
    }

    public int getBoxStrokeColor() {
        return this.f23254skhdrjzrfn;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f23219igdgnonuha;
    }

    public int getBoxStrokeWidth() {
        return this.f23270yfnezrywwk;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f23269ydmasvzmpa;
    }

    public int getCounterMaxLength() {
        return this.f23268yadqdtsiqt;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f23203cdpycssgdh && this.f23221iozdgvuglv && (textView = this.f23265wwaezpbzkn) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f23258tzroggbefp;
    }

    public ColorStateList getCounterTextColor() {
        return this.f23234kegysxyocb;
    }

    public ColorStateList getCursorColor() {
        return this.f23239mbcevpiqjq;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f23242ntlheqmsrt;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f23259uawqvzlxes;
    }

    public EditText getEditText() {
        return this.f23224iwizpuwonk;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f23232jyumaefscl.draadjrbmk();
    }

    public Drawable getEndIconDrawable() {
        return this.f23232jyumaefscl.agtfadlqog();
    }

    public int getEndIconMinSize() {
        return this.f23232jyumaefscl.ojitshcjhn();
    }

    public int getEndIconMode() {
        return this.f23232jyumaefscl.rgvfuqvkyq();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f23232jyumaefscl.vdvldrhtss();
    }

    CheckableImageButton getEndIconView() {
        return this.f23232jyumaefscl.oxmwwwfdhm();
    }

    public CharSequence getError() {
        if (this.f23223istkbnxepw.pmvmpeiblj()) {
            return this.f23223istkbnxepw.rgvfuqvkyq();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f23223istkbnxepw.agtfadlqog();
    }

    public CharSequence getErrorContentDescription() {
        return this.f23223istkbnxepw.ojitshcjhn();
    }

    public int getErrorCurrentTextColors() {
        return this.f23223istkbnxepw.vdvldrhtss();
    }

    public Drawable getErrorIconDrawable() {
        return this.f23232jyumaefscl.kcexrzcfyt();
    }

    public CharSequence getHelperText() {
        if (this.f23223istkbnxepw.zynmafqrjb()) {
            return this.f23223istkbnxepw.kcexrzcfyt();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f23223istkbnxepw.yggfygwlhe();
    }

    public CharSequence getHint() {
        if (this.f23260ulzqkzuiru) {
            return this.f23255sopmlzcsov;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f23215grlcpdaxtj.oxmwwwfdhm();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f23215grlcpdaxtj.iwizpuwonk();
    }

    public ColorStateList getHintTextColor() {
        return this.f23201auzgnhcxok;
    }

    public eablkybsjg getLengthCounter() {
        return this.f23236lmojexxdyd;
    }

    public int getMaxEms() {
        return this.f23235lereixgezr;
    }

    public int getMaxWidth() {
        return this.f23276zynmafqrjb;
    }

    public int getMinEms() {
        return this.f23210esjtqupxsv;
    }

    public int getMinWidth() {
        return this.f23248pmvmpeiblj;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f23232jyumaefscl.yggfygwlhe();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f23232jyumaefscl.jyumaefscl();
    }

    public CharSequence getPlaceholderText() {
        if (this.f23230jpowsppfya) {
            return this.f23216hcddaimhww;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f23208dsvhmnatus;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f23204cllcsxoeiz;
    }

    public CharSequence getPrefixText() {
        return this.f23271yggfygwlhe.iobyxmoadg();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f23271yggfygwlhe.zoijcleaow();
    }

    public TextView getPrefixTextView() {
        return this.f23271yggfygwlhe.wkgbmnqykc();
    }

    public ra.gtknphoqwx getShapeAppearanceModel() {
        return this.f23233jztzpxfvev;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f23271yggfygwlhe.eablkybsjg();
    }

    public Drawable getStartIconDrawable() {
        return this.f23271yggfygwlhe.gxszxtbevo();
    }

    public int getStartIconMinSize() {
        return this.f23271yggfygwlhe.lqeggnwhkg();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f23271yggfygwlhe.nufgyqmvbu();
    }

    public CharSequence getSuffixText() {
        return this.f23232jyumaefscl.iwizpuwonk();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f23232jyumaefscl.cqumvgiudr();
    }

    public TextView getSuffixTextView() {
        return this.f23232jyumaefscl.lereixgezr();
    }

    public Typeface getTypeface() {
        return this.f23227iyctptxqzt;
    }

    public boolean hkdspvbjdz() {
        return this.f23232jyumaefscl.iozdgvuglv();
    }

    void ikoacuggdj(TextView textView, int i13) {
        try {
            androidx.core.widget.dxjokdxxww.rgvfuqvkyq(textView, i13);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.dxjokdxxww.rgvfuqvkyq(textView, da.gtknphoqwx.TextAppearance_AppCompat_Caption);
        textView.setTextColor(androidx.core.content.iobyxmoadg.getColor(getContext(), da.ppxfxbqfkf.design_error));
    }

    void iwxlajgraz() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f23229jlmebxxoox == null || this.f23251rlfsiqarku == 0) {
            return;
        }
        boolean z13 = false;
        boolean z14 = isFocused() || ((editText2 = this.f23224iwizpuwonk) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f23224iwizpuwonk) != null && editText.isHovered())) {
            z13 = true;
        }
        if (!isEnabled()) {
            this.f23253sflfametgt = this.f23200ageimvtcrz;
        } else if (okpsazkaxt()) {
            if (this.f23219igdgnonuha != null) {
                auzgnhcxok(z14, z13);
            } else {
                this.f23253sflfametgt = getErrorCurrentTextColors();
            }
        } else if (!this.f23221iozdgvuglv || (textView = this.f23265wwaezpbzkn) == null) {
            if (z14) {
                this.f23253sflfametgt = this.f23254skhdrjzrfn;
            } else if (z13) {
                this.f23253sflfametgt = this.f23209dvvnrvtcbc;
            } else {
                this.f23253sflfametgt = this.f23225iwxlajgraz;
            }
        } else if (this.f23219igdgnonuha != null) {
            auzgnhcxok(z14, z13);
        } else {
            this.f23253sflfametgt = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            zfvoamnweg();
        }
        this.f23232jyumaefscl.ylkuphrtab();
        ribwqtqdhb();
        if (this.f23251rlfsiqarku == 2) {
            int i13 = this.f23261uwvvkdfqfp;
            if (z14 && isEnabled()) {
                this.f23261uwvvkdfqfp = this.f23269ydmasvzmpa;
            } else {
                this.f23261uwvvkdfqfp = this.f23270yfnezrywwk;
            }
            if (this.f23261uwvvkdfqfp != i13) {
                crxdokpmqz();
            }
        }
        if (this.f23251rlfsiqarku == 1) {
            if (!isEnabled()) {
                this.f23275zfvoamnweg = this.f23264wizcaqwiak;
            } else if (z13 && !z14) {
                this.f23275zfvoamnweg = this.f23212fiwbwshyhd;
            } else if (z14) {
                this.f23275zfvoamnweg = this.f23218hszhottldk;
            } else {
                this.f23275zfvoamnweg = this.f23238lxfrhoxuzk;
            }
        }
        wflxmlrfwp();
    }

    void iyctptxqzt() {
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null || this.f23229jlmebxxoox == null) {
            return;
        }
        if ((this.f23228jhduphickx || editText.getBackground() == null) && this.f23251rlfsiqarku != 0) {
            opjhrmiecq();
            this.f23228jhduphickx = true;
        }
    }

    public boolean kegysxyocb() {
        return this.f23206crxdokpmqz;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    boolean oipsdeybqn() {
        boolean z13;
        if (this.f23224iwizpuwonk == null) {
            return false;
        }
        boolean z14 = true;
        if (xrmfcynszj()) {
            int measuredWidth = this.f23271yggfygwlhe.getMeasuredWidth() - this.f23224iwizpuwonk.getPaddingLeft();
            if (this.f23263weqkydbzbr == null || this.f23237lrnfpwlwnk != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f23263weqkydbzbr = colorDrawable;
                this.f23237lrnfpwlwnk = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrIobyxmoadg = androidx.core.widget.dxjokdxxww.iobyxmoadg(this.f23224iwizpuwonk);
            Drawable drawable = drawableArrIobyxmoadg[0];
            Drawable drawable2 = this.f23263weqkydbzbr;
            if (drawable != drawable2) {
                androidx.core.widget.dxjokdxxww.btonecajqb(this.f23224iwizpuwonk, drawable2, drawableArrIobyxmoadg[1], drawableArrIobyxmoadg[2], drawableArrIobyxmoadg[3]);
                z13 = true;
            } else {
                z13 = false;
            }
        } else if (this.f23263weqkydbzbr != null) {
            Drawable[] drawableArrIobyxmoadg2 = androidx.core.widget.dxjokdxxww.iobyxmoadg(this.f23224iwizpuwonk);
            androidx.core.widget.dxjokdxxww.btonecajqb(this.f23224iwizpuwonk, null, drawableArrIobyxmoadg2[1], drawableArrIobyxmoadg2[2], drawableArrIobyxmoadg2[3]);
            this.f23263weqkydbzbr = null;
            z13 = true;
        } else {
            z13 = false;
        }
        if (jztzpxfvev()) {
            int measuredWidth2 = this.f23232jyumaefscl.lereixgezr().getMeasuredWidth() - this.f23224iwizpuwonk.getPaddingRight();
            CheckableImageButton checkableImageButtonGtknphoqwx = this.f23232jyumaefscl.gtknphoqwx();
            if (checkableImageButtonGtknphoqwx != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonGtknphoqwx.getMeasuredWidth() + v1.iwizpuwonk.zoijcleaow((ViewGroup.MarginLayoutParams) checkableImageButtonGtknphoqwx.getLayoutParams());
            }
            Drawable[] drawableArrIobyxmoadg3 = androidx.core.widget.dxjokdxxww.iobyxmoadg(this.f23224iwizpuwonk);
            Drawable drawable3 = this.f23243nuxfzjnpeb;
            if (drawable3 == null || this.f23257tbqsvytpvh == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f23243nuxfzjnpeb = colorDrawable2;
                    this.f23257tbqsvytpvh = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrIobyxmoadg3[2];
                Drawable drawable5 = this.f23243nuxfzjnpeb;
                if (drawable4 != drawable5) {
                    this.f23252roivzttewh = drawable4;
                    androidx.core.widget.dxjokdxxww.btonecajqb(this.f23224iwizpuwonk, drawableArrIobyxmoadg3[0], drawableArrIobyxmoadg3[1], drawable5, drawableArrIobyxmoadg3[3]);
                } else {
                    z14 = z13;
                }
            } else {
                this.f23257tbqsvytpvh = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.dxjokdxxww.btonecajqb(this.f23224iwizpuwonk, drawableArrIobyxmoadg3[0], drawableArrIobyxmoadg3[1], this.f23243nuxfzjnpeb, drawableArrIobyxmoadg3[3]);
            }
        } else {
            if (this.f23243nuxfzjnpeb == null) {
                return z13;
            }
            Drawable[] drawableArrIobyxmoadg4 = androidx.core.widget.dxjokdxxww.iobyxmoadg(this.f23224iwizpuwonk);
            if (drawableArrIobyxmoadg4[2] == this.f23243nuxfzjnpeb) {
                androidx.core.widget.dxjokdxxww.btonecajqb(this.f23224iwizpuwonk, drawableArrIobyxmoadg4[0], drawableArrIobyxmoadg4[1], this.f23252roivzttewh, drawableArrIobyxmoadg4[3]);
            } else {
                z14 = z13;
            }
            this.f23243nuxfzjnpeb = null;
        }
        return z14;
    }

    boolean okpsazkaxt() {
        return this.f23223istkbnxepw.draadjrbmk();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f23215grlcpdaxtj.jlmebxxoox(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f23232jyumaefscl.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f23249rhgxfdycjh = false;
        boolean zWeqkydbzbr = weqkydbzbr();
        boolean zOipsdeybqn = oipsdeybqn();
        if (zWeqkydbzbr || zOipsdeybqn) {
            this.f23224iwizpuwonk.post(new Runnable() { // from class: com.google.android.material.textfield.zynmafqrjb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23420zdlpuopuiu.ntlheqmsrt();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        EditText editText = this.f23224iwizpuwonk;
        if (editText != null) {
            Rect rect = this.f23244oipsdeybqn;
            com.google.android.material.internal.zoijcleaow.iobyxmoadg(this, editText, rect);
            czzsidtyhn(rect);
            if (this.f23260ulzqkzuiru) {
                this.f23215grlcpdaxtj.nuxfzjnpeb(this.f23224iwizpuwonk.getTextSize());
                int gravity = this.f23224iwizpuwonk.getGravity();
                this.f23215grlcpdaxtj.uwvvkdfqfp((gravity & (-113)) | 48);
                this.f23215grlcpdaxtj.zeieaojujs(gravity);
                this.f23215grlcpdaxtj.xrmfcynszj(oxmwwwfdhm(rect));
                this.f23215grlcpdaxtj.bfopjjpdmp(yggfygwlhe(rect));
                this.f23215grlcpdaxtj.vipkmwdibw();
                if (!zynmafqrjb() || this.f23222ipoelvxyzq) {
                    return;
                }
                sopmlzcsov();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (!this.f23249rhgxfdycjh) {
            this.f23232jyumaefscl.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f23249rhgxfdycjh = true;
        }
        tbqsvytpvh();
        this.f23232jyumaefscl.roivzttewh();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.zoijcleaow());
        setError(savedState.f23278jyumaefscl);
        if (savedState.f23277iwizpuwonk) {
            post(new zoijcleaow());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        boolean z13 = i13 == 1;
        if (z13 != this.f23267xrmfcynszj) {
            float fIobyxmoadg = this.f23233jztzpxfvev.oxmwwwfdhm().iobyxmoadg(this.f23246opjhrmiecq);
            float fIobyxmoadg2 = this.f23233jztzpxfvev.zdlpuopuiu().iobyxmoadg(this.f23246opjhrmiecq);
            ra.gtknphoqwx gtknphoqwxVarWflxmlrfwp = ra.gtknphoqwx.iobyxmoadg().zynmafqrjb(this.f23233jztzpxfvev.kcexrzcfyt()).iozdgvuglv(this.f23233jztzpxfvev.vdvldrhtss()).zdlpuopuiu(this.f23233jztzpxfvev.gtknphoqwx()).cqumvgiudr(this.f23233jztzpxfvev.dxjokdxxww()).istkbnxepw(fIobyxmoadg2).lmojexxdyd(fIobyxmoadg).yggfygwlhe(this.f23233jztzpxfvev.draadjrbmk().iobyxmoadg(this.f23246opjhrmiecq)).esjtqupxsv(this.f23233jztzpxfvev.btonecajqb().iobyxmoadg(this.f23246opjhrmiecq)).wflxmlrfwp();
            this.f23267xrmfcynszj = z13;
            setShapeAppearanceModel(gtknphoqwxVarWflxmlrfwp);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (okpsazkaxt()) {
            savedState.f23278jyumaefscl = getError();
        }
        savedState.f23277iwizpuwonk = this.f23232jyumaefscl.yadqdtsiqt();
        return savedState;
    }

    public void ribwqtqdhb() {
        this.f23271yggfygwlhe.wflxmlrfwp();
    }

    public void setBoxBackgroundColor(int i13) {
        if (this.f23275zfvoamnweg != i13) {
            this.f23275zfvoamnweg = i13;
            this.f23238lxfrhoxuzk = i13;
            this.f23218hszhottldk = i13;
            this.f23212fiwbwshyhd = i13;
            wflxmlrfwp();
        }
    }

    public void setBoxBackgroundColorResource(int i13) {
        setBoxBackgroundColor(androidx.core.content.iobyxmoadg.getColor(getContext(), i13));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f23238lxfrhoxuzk = defaultColor;
        this.f23275zfvoamnweg = defaultColor;
        this.f23264wizcaqwiak = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f23218hszhottldk = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f23212fiwbwshyhd = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        wflxmlrfwp();
    }

    public void setBoxBackgroundMode(int i13) {
        if (i13 == this.f23251rlfsiqarku) {
            return;
        }
        this.f23251rlfsiqarku = i13;
        if (this.f23224iwizpuwonk != null) {
            ulzqkzuiru();
        }
    }

    public void setBoxCollapsedPaddingTop(int i13) {
        this.f23207czzsidtyhn = i13;
    }

    public void setBoxCornerFamily(int i13) {
        this.f23233jztzpxfvev = this.f23233jztzpxfvev.jyumaefscl().pmvmpeiblj(i13, this.f23233jztzpxfvev.oxmwwwfdhm()).yadqdtsiqt(i13, this.f23233jztzpxfvev.zdlpuopuiu()).kcexrzcfyt(i13, this.f23233jztzpxfvev.btonecajqb()).iwizpuwonk(i13, this.f23233jztzpxfvev.draadjrbmk()).wflxmlrfwp();
        wflxmlrfwp();
    }

    public void setBoxStrokeColor(int i13) {
        if (this.f23254skhdrjzrfn != i13) {
            this.f23254skhdrjzrfn = i13;
            iwxlajgraz();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f23225iwxlajgraz = colorStateList.getDefaultColor();
            this.f23200ageimvtcrz = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f23209dvvnrvtcbc = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f23254skhdrjzrfn = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f23254skhdrjzrfn != colorStateList.getDefaultColor()) {
            this.f23254skhdrjzrfn = colorStateList.getDefaultColor();
        }
        iwxlajgraz();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f23219igdgnonuha != colorStateList) {
            this.f23219igdgnonuha = colorStateList;
            iwxlajgraz();
        }
    }

    public void setBoxStrokeWidth(int i13) {
        this.f23270yfnezrywwk = i13;
        iwxlajgraz();
    }

    public void setBoxStrokeWidthFocused(int i13) {
        this.f23269ydmasvzmpa = i13;
        iwxlajgraz();
    }

    public void setBoxStrokeWidthFocusedResource(int i13) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i13));
    }

    public void setBoxStrokeWidthResource(int i13) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i13));
    }

    public void setCounterEnabled(boolean z13) {
        if (this.f23203cdpycssgdh != z13) {
            if (z13) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f23265wwaezpbzkn = appCompatTextView;
                appCompatTextView.setId(da.gxszxtbevo.textinput_counter);
                Typeface typeface = this.f23227iyctptxqzt;
                if (typeface != null) {
                    this.f23265wwaezpbzkn.setTypeface(typeface);
                }
                this.f23265wwaezpbzkn.setMaxLines(1);
                this.f23223istkbnxepw.eablkybsjg(this.f23265wwaezpbzkn, 2);
                v1.iwizpuwonk.wkgbmnqykc((ViewGroup.MarginLayoutParams) this.f23265wwaezpbzkn.getLayoutParams(), getResources().getDimensionPixelOffset(da.wkgbmnqykc.mtrl_textinput_counter_margin_start));
                sflfametgt();
                uwvvkdfqfp();
            } else {
                this.f23223istkbnxepw.istkbnxepw(this.f23265wwaezpbzkn, 2);
                this.f23265wwaezpbzkn = null;
            }
            this.f23203cdpycssgdh = z13;
        }
    }

    public void setCounterMaxLength(int i13) {
        if (this.f23268yadqdtsiqt != i13) {
            if (i13 > 0) {
                this.f23268yadqdtsiqt = i13;
            } else {
                this.f23268yadqdtsiqt = -1;
            }
            if (this.f23203cdpycssgdh) {
                uwvvkdfqfp();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i13) {
        if (this.f23272ylkuphrtab != i13) {
            this.f23272ylkuphrtab = i13;
            sflfametgt();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f23258tzroggbefp != colorStateList) {
            this.f23258tzroggbefp = colorStateList;
            sflfametgt();
        }
    }

    public void setCounterTextAppearance(int i13) {
        if (this.f23247pkzmftpjix != i13) {
            this.f23247pkzmftpjix = i13;
            sflfametgt();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f23234kegysxyocb != colorStateList) {
            this.f23234kegysxyocb = colorStateList;
            sflfametgt();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f23239mbcevpiqjq != colorStateList) {
            this.f23239mbcevpiqjq = colorStateList;
            zfvoamnweg();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f23242ntlheqmsrt != colorStateList) {
            this.f23242ntlheqmsrt = colorStateList;
            if (stevsuqkhv()) {
                zfvoamnweg();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f23259uawqvzlxes = colorStateList;
        this.f23201auzgnhcxok = colorStateList;
        if (this.f23224iwizpuwonk != null) {
            zeieaojujs(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        jlmebxxoox(this, z13);
        super.setEnabled(z13);
    }

    public void setEndIconActivated(boolean z13) {
        this.f23232jyumaefscl.cllcsxoeiz(z13);
    }

    public void setEndIconCheckable(boolean z13) {
        this.f23232jyumaefscl.dsvhmnatus(z13);
    }

    public void setEndIconContentDescription(int i13) {
        this.f23232jyumaefscl.wypolnanlu(i13);
    }

    public void setEndIconDrawable(int i13) {
        this.f23232jyumaefscl.kegysxyocb(i13);
    }

    public void setEndIconMinSize(int i13) {
        this.f23232jyumaefscl.mbcevpiqjq(i13);
    }

    public void setEndIconMode(int i13) {
        this.f23232jyumaefscl.ntlheqmsrt(i13);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f23232jyumaefscl.ulzqkzuiru(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f23232jyumaefscl.sopmlzcsov(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f23232jyumaefscl.crxdokpmqz(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f23232jyumaefscl.jlmebxxoox(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f23232jyumaefscl.ribwqtqdhb(mode);
    }

    public void setEndIconVisible(boolean z13) {
        this.f23232jyumaefscl.vipkmwdibw(z13);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f23223istkbnxepw.pmvmpeiblj()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f23223istkbnxepw.iwizpuwonk();
        } else {
            this.f23223istkbnxepw.stevsuqkhv(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i13) {
        this.f23223istkbnxepw.yadqdtsiqt(i13);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f23223istkbnxepw.iozdgvuglv(charSequence);
    }

    public void setErrorEnabled(boolean z13) {
        this.f23223istkbnxepw.lmojexxdyd(z13);
    }

    public void setErrorIconDrawable(int i13) {
        this.f23232jyumaefscl.jhduphickx(i13);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f23232jyumaefscl.okpsazkaxt(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f23232jyumaefscl.jztzpxfvev(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f23232jyumaefscl.xrmfcynszj(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f23232jyumaefscl.metgxyhuhe(mode);
    }

    public void setErrorTextAppearance(int i13) {
        this.f23223istkbnxepw.wwaezpbzkn(i13);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f23223istkbnxepw.ylkuphrtab(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z13) {
        if (this.f23241mhtqkkgtqm != z13) {
            this.f23241mhtqkkgtqm = z13;
            zeieaojujs(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (dsvhmnatus()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!dsvhmnatus()) {
                setHelperTextEnabled(true);
            }
            this.f23223istkbnxepw.kegysxyocb(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f23223istkbnxepw.jpowsppfya(colorStateList);
    }

    public void setHelperTextEnabled(boolean z13) {
        this.f23223istkbnxepw.hcddaimhww(z13);
    }

    public void setHelperTextTextAppearance(int i13) {
        this.f23223istkbnxepw.pkzmftpjix(i13);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f23260ulzqkzuiru) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z13) {
        this.f23226ixidwrxhsl = z13;
    }

    public void setHintEnabled(boolean z13) {
        if (z13 != this.f23260ulzqkzuiru) {
            this.f23260ulzqkzuiru = z13;
            if (z13) {
                CharSequence hint = this.f23224iwizpuwonk.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f23255sopmlzcsov)) {
                        setHint(hint);
                    }
                    this.f23224iwizpuwonk.setHint((CharSequence) null);
                }
                this.f23206crxdokpmqz = true;
            } else {
                this.f23206crxdokpmqz = false;
                if (!TextUtils.isEmpty(this.f23255sopmlzcsov) && TextUtils.isEmpty(this.f23224iwizpuwonk.getHint())) {
                    this.f23224iwizpuwonk.setHint(this.f23255sopmlzcsov);
                }
                setHintInternal(null);
            }
            if (this.f23224iwizpuwonk != null) {
                lrnfpwlwnk();
            }
        }
    }

    public void setHintTextAppearance(int i13) {
        this.f23215grlcpdaxtj.metgxyhuhe(i13);
        this.f23201auzgnhcxok = this.f23215grlcpdaxtj.rgvfuqvkyq();
        if (this.f23224iwizpuwonk != null) {
            zeieaojujs(false);
            lrnfpwlwnk();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f23201auzgnhcxok != colorStateList) {
            if (this.f23259uawqvzlxes == null) {
                this.f23215grlcpdaxtj.czzsidtyhn(colorStateList);
            }
            this.f23201auzgnhcxok = colorStateList;
            if (this.f23224iwizpuwonk != null) {
                zeieaojujs(false);
            }
        }
    }

    public void setLengthCounter(eablkybsjg eablkybsjgVar) {
        this.f23236lmojexxdyd = eablkybsjgVar;
    }

    public void setMaxEms(int i13) {
        this.f23235lereixgezr = i13;
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMaxEms(i13);
    }

    public void setMaxWidth(int i13) {
        this.f23276zynmafqrjb = i13;
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMaxWidth(i13);
    }

    public void setMaxWidthResource(int i13) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i13));
    }

    public void setMinEms(int i13) {
        this.f23210esjtqupxsv = i13;
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMinEms(i13);
    }

    public void setMinWidth(int i13) {
        this.f23248pmvmpeiblj = i13;
        EditText editText = this.f23224iwizpuwonk;
        if (editText == null || i13 == -1) {
            return;
        }
        editText.setMinWidth(i13);
    }

    public void setMinWidthResource(int i13) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i13));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i13) {
        this.f23232jyumaefscl.czzsidtyhn(i13);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i13) {
        this.f23232jyumaefscl.yfnezrywwk(i13);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z13) {
        this.f23232jyumaefscl.sflfametgt(z13);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f23232jyumaefscl.zfvoamnweg(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f23232jyumaefscl.oipsdeybqn(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f23217hkdspvbjdz == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f23217hkdspvbjdz = appCompatTextView;
            appCompatTextView.setId(da.gxszxtbevo.textinput_placeholder);
            jhduphickx.uawqvzlxes(this.f23217hkdspvbjdz, 2);
            androidx.transition.ppxfxbqfkf ppxfxbqfkfVarPmvmpeiblj = pmvmpeiblj();
            this.f23266wypolnanlu = ppxfxbqfkfVarPmvmpeiblj;
            ppxfxbqfkfVarPmvmpeiblj.zfvoamnweg(67L);
            this.f23256stevsuqkhv = pmvmpeiblj();
            setPlaceholderTextAppearance(this.f23208dsvhmnatus);
            setPlaceholderTextColor(this.f23204cllcsxoeiz);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f23230jpowsppfya) {
                setPlaceholderTextEnabled(true);
            }
            this.f23216hcddaimhww = charSequence;
        }
        roivzttewh();
    }

    public void setPlaceholderTextAppearance(int i13) {
        this.f23208dsvhmnatus = i13;
        TextView textView = this.f23217hkdspvbjdz;
        if (textView != null) {
            androidx.core.widget.dxjokdxxww.rgvfuqvkyq(textView, i13);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f23204cllcsxoeiz != colorStateList) {
            this.f23204cllcsxoeiz = colorStateList;
            TextView textView = this.f23217hkdspvbjdz;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f23271yggfygwlhe.agtfadlqog(charSequence);
    }

    public void setPrefixTextAppearance(int i13) {
        this.f23271yggfygwlhe.ojitshcjhn(i13);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f23271yggfygwlhe.rgvfuqvkyq(colorStateList);
    }

    public void setShapeAppearanceModel(ra.gtknphoqwx gtknphoqwxVar) {
        ra.lqeggnwhkg lqeggnwhkgVar = this.f23229jlmebxxoox;
        if (lqeggnwhkgVar == null || lqeggnwhkgVar.cdpycssgdh() == gtknphoqwxVar) {
            return;
        }
        this.f23233jztzpxfvev = gtknphoqwxVar;
        wflxmlrfwp();
    }

    public void setStartIconCheckable(boolean z13) {
        this.f23271yggfygwlhe.vdvldrhtss(z13);
    }

    public void setStartIconContentDescription(int i13) {
        setStartIconContentDescription(i13 != 0 ? getResources().getText(i13) : null);
    }

    public void setStartIconDrawable(int i13) {
        setStartIconDrawable(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
    }

    public void setStartIconMinSize(int i13) {
        this.f23271yggfygwlhe.zdlpuopuiu(i13);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f23271yggfygwlhe.yggfygwlhe(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f23271yggfygwlhe.jyumaefscl(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f23271yggfygwlhe.iwizpuwonk(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f23271yggfygwlhe.cqumvgiudr(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f23271yggfygwlhe.esjtqupxsv(mode);
    }

    public void setStartIconVisible(boolean z13) {
        this.f23271yggfygwlhe.lereixgezr(z13);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f23232jyumaefscl.bfopjjpdmp(charSequence);
    }

    public void setSuffixTextAppearance(int i13) {
        this.f23232jyumaefscl.opjhrmiecq(i13);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f23232jyumaefscl.iyctptxqzt(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(wkgbmnqykc wkgbmnqykcVar) {
        EditText editText = this.f23224iwizpuwonk;
        if (editText != null) {
            jhduphickx.oipsdeybqn(editText, wkgbmnqykcVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f23227iyctptxqzt) {
            this.f23227iyctptxqzt = typeface;
            this.f23215grlcpdaxtj.ixidwrxhsl(typeface);
            this.f23223istkbnxepw.cllcsxoeiz(typeface);
            TextView textView = this.f23265wwaezpbzkn;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    final boolean wypolnanlu() {
        return this.f23222ipoelvxyzq;
    }

    void yfnezrywwk(Editable editable) {
        int iIobyxmoadg = this.f23236lmojexxdyd.iobyxmoadg(editable);
        boolean z13 = this.f23221iozdgvuglv;
        int i13 = this.f23268yadqdtsiqt;
        if (i13 == -1) {
            this.f23265wwaezpbzkn.setText(String.valueOf(iIobyxmoadg));
            this.f23265wwaezpbzkn.setContentDescription(null);
            this.f23221iozdgvuglv = false;
        } else {
            this.f23221iozdgvuglv = iIobyxmoadg > i13;
            ydmasvzmpa(getContext(), this.f23265wwaezpbzkn, iIobyxmoadg, this.f23268yadqdtsiqt, this.f23221iozdgvuglv);
            if (z13 != this.f23221iozdgvuglv) {
                sflfametgt();
            }
            this.f23265wwaezpbzkn.setText(t1.iobyxmoadg.ppxfxbqfkf().btonecajqb(getContext().getString(da.btonecajqb.character_counter_pattern, Integer.valueOf(iIobyxmoadg), Integer.valueOf(this.f23268yadqdtsiqt))));
        }
        if (this.f23224iwizpuwonk == null || z13 == this.f23221iozdgvuglv) {
            return;
        }
        zeieaojujs(false);
        iwxlajgraz();
        bfopjjpdmp();
    }

    void zeieaojujs(boolean z13) {
        nuxfzjnpeb(z13, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f23199yzdjzghtvl;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f23210esjtqupxsv = -1;
        this.f23235lereixgezr = -1;
        this.f23248pmvmpeiblj = -1;
        this.f23276zynmafqrjb = -1;
        this.f23223istkbnxepw = new yggfygwlhe(this);
        this.f23236lmojexxdyd = new eablkybsjg() { // from class: com.google.android.material.textfield.istkbnxepw
            @Override // com.google.android.material.textfield.TextInputLayout.eablkybsjg
            public final int iobyxmoadg(Editable editable) {
                return TextInputLayout.mbcevpiqjq(editable);
            }
        };
        this.f23244oipsdeybqn = new Rect();
        this.f23202bfopjjpdmp = new Rect();
        this.f23246opjhrmiecq = new RectF();
        this.f23274zeieaojujs = new LinkedHashSet();
        com.google.android.material.internal.iobyxmoadg iobyxmoadgVar = new com.google.android.material.internal.iobyxmoadg(this);
        this.f23215grlcpdaxtj = iobyxmoadgVar;
        this.f23249rhgxfdycjh = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f23273zdlpuopuiu = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = ea.iobyxmoadg.f31020iobyxmoadg;
        iobyxmoadgVar.grlcpdaxtj(timeInterpolator);
        iobyxmoadgVar.hszhottldk(timeInterpolator);
        iobyxmoadgVar.uwvvkdfqfp(8388659);
        mbcevpiqjq mbcevpiqjqVarBtonecajqb = com.google.android.material.internal.draadjrbmk.btonecajqb(context2, attributeSet, da.draadjrbmk.TextInputLayout, i13, i14, da.draadjrbmk.TextInputLayout_counterTextAppearance, da.draadjrbmk.TextInputLayout_counterOverflowTextAppearance, da.draadjrbmk.TextInputLayout_errorTextAppearance, da.draadjrbmk.TextInputLayout_helperTextTextAppearance, da.draadjrbmk.TextInputLayout_hintTextAppearance);
        lereixgezr lereixgezrVar = new lereixgezr(this, mbcevpiqjqVarBtonecajqb);
        this.f23271yggfygwlhe = lereixgezrVar;
        this.f23260ulzqkzuiru = mbcevpiqjqVarBtonecajqb.iobyxmoadg(da.draadjrbmk.TextInputLayout_hintEnabled, true);
        setHint(mbcevpiqjqVarBtonecajqb.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_android_hint));
        this.f23226ixidwrxhsl = mbcevpiqjqVarBtonecajqb.iobyxmoadg(da.draadjrbmk.TextInputLayout_hintAnimationEnabled, true);
        this.f23241mhtqkkgtqm = mbcevpiqjqVarBtonecajqb.iobyxmoadg(da.draadjrbmk.TextInputLayout_expandedHintEnabled, true);
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_android_minEms)) {
            setMinEms(mbcevpiqjqVarBtonecajqb.gtknphoqwx(da.draadjrbmk.TextInputLayout_android_minEms, -1));
        } else if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_android_minWidth)) {
            setMinWidth(mbcevpiqjqVarBtonecajqb.gxszxtbevo(da.draadjrbmk.TextInputLayout_android_minWidth, -1));
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_android_maxEms)) {
            setMaxEms(mbcevpiqjqVarBtonecajqb.gtknphoqwx(da.draadjrbmk.TextInputLayout_android_maxEms, -1));
        } else if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_android_maxWidth)) {
            setMaxWidth(mbcevpiqjqVarBtonecajqb.gxszxtbevo(da.draadjrbmk.TextInputLayout_android_maxWidth, -1));
        }
        this.f23233jztzpxfvev = ra.gtknphoqwx.eablkybsjg(context2, attributeSet, i13, i14).wflxmlrfwp();
        this.f23240metgxyhuhe = context2.getResources().getDimensionPixelOffset(da.wkgbmnqykc.mtrl_textinput_box_label_cutout_padding);
        this.f23207czzsidtyhn = mbcevpiqjqVarBtonecajqb.eablkybsjg(da.draadjrbmk.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f23270yfnezrywwk = mbcevpiqjqVarBtonecajqb.gxszxtbevo(da.draadjrbmk.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(da.wkgbmnqykc.mtrl_textinput_box_stroke_width_default));
        this.f23269ydmasvzmpa = mbcevpiqjqVarBtonecajqb.gxszxtbevo(da.draadjrbmk.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(da.wkgbmnqykc.mtrl_textinput_box_stroke_width_focused));
        this.f23261uwvvkdfqfp = this.f23270yfnezrywwk;
        float fWkgbmnqykc = mbcevpiqjqVarBtonecajqb.wkgbmnqykc(da.draadjrbmk.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fWkgbmnqykc2 = mbcevpiqjqVarBtonecajqb.wkgbmnqykc(da.draadjrbmk.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fWkgbmnqykc3 = mbcevpiqjqVarBtonecajqb.wkgbmnqykc(da.draadjrbmk.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fWkgbmnqykc4 = mbcevpiqjqVarBtonecajqb.wkgbmnqykc(da.draadjrbmk.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ra.gtknphoqwx.zoijcleaow zoijcleaowVarJyumaefscl = this.f23233jztzpxfvev.jyumaefscl();
        if (fWkgbmnqykc >= 0.0f) {
            zoijcleaowVarJyumaefscl.istkbnxepw(fWkgbmnqykc);
        }
        if (fWkgbmnqykc2 >= 0.0f) {
            zoijcleaowVarJyumaefscl.lmojexxdyd(fWkgbmnqykc2);
        }
        if (fWkgbmnqykc3 >= 0.0f) {
            zoijcleaowVarJyumaefscl.esjtqupxsv(fWkgbmnqykc3);
        }
        if (fWkgbmnqykc4 >= 0.0f) {
            zoijcleaowVarJyumaefscl.yggfygwlhe(fWkgbmnqykc4);
        }
        this.f23233jztzpxfvev = zoijcleaowVarJyumaefscl.wflxmlrfwp();
        ColorStateList colorStateListZoijcleaow = oa.ppxfxbqfkf.zoijcleaow(context2, mbcevpiqjqVarBtonecajqb, da.draadjrbmk.TextInputLayout_boxBackgroundColor);
        if (colorStateListZoijcleaow != null) {
            int defaultColor = colorStateListZoijcleaow.getDefaultColor();
            this.f23238lxfrhoxuzk = defaultColor;
            this.f23275zfvoamnweg = defaultColor;
            if (colorStateListZoijcleaow.isStateful()) {
                this.f23264wizcaqwiak = colorStateListZoijcleaow.getColorForState(new int[]{-16842910}, -1);
                this.f23218hszhottldk = colorStateListZoijcleaow.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f23212fiwbwshyhd = colorStateListZoijcleaow.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f23218hszhottldk = this.f23238lxfrhoxuzk;
                ColorStateList colorStateListIobyxmoadg = nufgyqmvbu.iobyxmoadg.iobyxmoadg(context2, da.ppxfxbqfkf.mtrl_filled_background_color);
                this.f23264wizcaqwiak = colorStateListIobyxmoadg.getColorForState(new int[]{-16842910}, -1);
                this.f23212fiwbwshyhd = colorStateListIobyxmoadg.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f23275zfvoamnweg = 0;
            this.f23238lxfrhoxuzk = 0;
            this.f23264wizcaqwiak = 0;
            this.f23218hszhottldk = 0;
            this.f23212fiwbwshyhd = 0;
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListPpxfxbqfkf = mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_android_textColorHint);
            this.f23201auzgnhcxok = colorStateListPpxfxbqfkf;
            this.f23259uawqvzlxes = colorStateListPpxfxbqfkf;
        }
        ColorStateList colorStateListZoijcleaow2 = oa.ppxfxbqfkf.zoijcleaow(context2, mbcevpiqjqVarBtonecajqb, da.draadjrbmk.TextInputLayout_boxStrokeColor);
        this.f23254skhdrjzrfn = mbcevpiqjqVarBtonecajqb.zoijcleaow(da.draadjrbmk.TextInputLayout_boxStrokeColor, 0);
        this.f23225iwxlajgraz = androidx.core.content.iobyxmoadg.getColor(context2, da.ppxfxbqfkf.mtrl_textinput_default_box_stroke_color);
        this.f23200ageimvtcrz = androidx.core.content.iobyxmoadg.getColor(context2, da.ppxfxbqfkf.mtrl_textinput_disabled_color);
        this.f23209dvvnrvtcbc = androidx.core.content.iobyxmoadg.getColor(context2, da.ppxfxbqfkf.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListZoijcleaow2 != null) {
            setBoxStrokeColorStateList(colorStateListZoijcleaow2);
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(oa.ppxfxbqfkf.zoijcleaow(context2, mbcevpiqjqVarBtonecajqb, da.draadjrbmk.TextInputLayout_boxStrokeErrorColor));
        }
        if (mbcevpiqjqVarBtonecajqb.agtfadlqog(da.draadjrbmk.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(mbcevpiqjqVarBtonecajqb.agtfadlqog(da.draadjrbmk.TextInputLayout_hintTextAppearance, 0));
        }
        this.f23239mbcevpiqjq = mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_cursorColor);
        this.f23242ntlheqmsrt = mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_cursorErrorColor);
        int iAgtfadlqog = mbcevpiqjqVarBtonecajqb.agtfadlqog(da.draadjrbmk.TextInputLayout_errorTextAppearance, 0);
        CharSequence charSequenceRgvfuqvkyq = mbcevpiqjqVarBtonecajqb.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_errorContentDescription);
        int iGtknphoqwx = mbcevpiqjqVarBtonecajqb.gtknphoqwx(da.draadjrbmk.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean zIobyxmoadg = mbcevpiqjqVarBtonecajqb.iobyxmoadg(da.draadjrbmk.TextInputLayout_errorEnabled, false);
        int iAgtfadlqog2 = mbcevpiqjqVarBtonecajqb.agtfadlqog(da.draadjrbmk.TextInputLayout_helperTextTextAppearance, 0);
        boolean zIobyxmoadg2 = mbcevpiqjqVarBtonecajqb.iobyxmoadg(da.draadjrbmk.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceRgvfuqvkyq2 = mbcevpiqjqVarBtonecajqb.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_helperText);
        int iAgtfadlqog3 = mbcevpiqjqVarBtonecajqb.agtfadlqog(da.draadjrbmk.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceRgvfuqvkyq3 = mbcevpiqjqVarBtonecajqb.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_placeholderText);
        boolean zIobyxmoadg3 = mbcevpiqjqVarBtonecajqb.iobyxmoadg(da.draadjrbmk.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(mbcevpiqjqVarBtonecajqb.gtknphoqwx(da.draadjrbmk.TextInputLayout_counterMaxLength, -1));
        this.f23247pkzmftpjix = mbcevpiqjqVarBtonecajqb.agtfadlqog(da.draadjrbmk.TextInputLayout_counterTextAppearance, 0);
        this.f23272ylkuphrtab = mbcevpiqjqVarBtonecajqb.agtfadlqog(da.draadjrbmk.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(mbcevpiqjqVarBtonecajqb.gtknphoqwx(da.draadjrbmk.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceRgvfuqvkyq);
        setErrorAccessibilityLiveRegion(iGtknphoqwx);
        setCounterOverflowTextAppearance(this.f23272ylkuphrtab);
        setHelperTextTextAppearance(iAgtfadlqog2);
        setErrorTextAppearance(iAgtfadlqog);
        setCounterTextAppearance(this.f23247pkzmftpjix);
        setPlaceholderText(charSequenceRgvfuqvkyq3);
        setPlaceholderTextAppearance(iAgtfadlqog3);
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_errorTextColor)) {
            setErrorTextColor(mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_errorTextColor));
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_helperTextTextColor));
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_hintTextColor)) {
            setHintTextColor(mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_hintTextColor));
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_counterTextColor)) {
            setCounterTextColor(mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_counterTextColor));
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_counterOverflowTextColor));
        }
        if (mbcevpiqjqVarBtonecajqb.kcexrzcfyt(da.draadjrbmk.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(mbcevpiqjqVarBtonecajqb.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_placeholderTextColor));
        }
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(this, mbcevpiqjqVarBtonecajqb);
        this.f23232jyumaefscl = oxmwwwfdhmVar;
        boolean zIobyxmoadg4 = mbcevpiqjqVarBtonecajqb.iobyxmoadg(da.draadjrbmk.TextInputLayout_android_enabled, true);
        mbcevpiqjqVarBtonecajqb.cqumvgiudr();
        jhduphickx.uawqvzlxes(this, 2);
        jhduphickx.iwxlajgraz(this, 1);
        frameLayout.addView(lereixgezrVar);
        frameLayout.addView(oxmwwwfdhmVar);
        addView(frameLayout);
        setEnabled(zIobyxmoadg4);
        setHelperTextEnabled(zIobyxmoadg2);
        setErrorEnabled(zIobyxmoadg);
        setCounterEnabled(zIobyxmoadg3);
        setHelperText(charSequenceRgvfuqvkyq2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f23232jyumaefscl.stevsuqkhv(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f23232jyumaefscl.tzroggbefp(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f23232jyumaefscl.ikoacuggdj(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f23232jyumaefscl.uwvvkdfqfp(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f23232jyumaefscl.ydmasvzmpa(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f23271yggfygwlhe.oxmwwwfdhm(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f23271yggfygwlhe.kcexrzcfyt(drawable);
    }

    public void setHint(int i13) {
        setHint(i13 != 0 ? getResources().getText(i13) : null);
    }
}
