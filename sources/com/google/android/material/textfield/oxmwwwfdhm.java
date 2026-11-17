package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.mbcevpiqjq;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
class oxmwwwfdhm extends LinearLayout {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private ColorStateList f23336cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private w1.ppxfxbqfkf.zoijcleaow f23337cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private PorterDuff.Mode f23338cqumvgiudr;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final TextWatcher f23339dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private View.OnLongClickListener f23340esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f23341hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final AccessibilityManager f23342hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f23343iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final LinkedHashSet f23344istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private ColorStateList f23345iwizpuwonk;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private EditText f23346jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final CheckableImageButton f23347jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final CheckableImageButton f23348lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private ImageView.ScaleType f23349lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final TextView f23350pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final wkgbmnqykc f23351pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private View.OnLongClickListener f23352wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final TextInputLayout.gxszxtbevo f23353wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private PorterDuff.Mode f23354yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final FrameLayout f23355yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private CharSequence f23356ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final TextInputLayout f23357zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f23358zynmafqrjb;

    class iobyxmoadg extends com.google.android.material.internal.gtknphoqwx {
        iobyxmoadg() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            oxmwwwfdhm.this.wflxmlrfwp().iobyxmoadg(editable);
        }

        @Override // com.google.android.material.internal.gtknphoqwx, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            oxmwwwfdhm.this.wflxmlrfwp().zoijcleaow(charSequence, i13, i14, i15);
        }
    }

    class ppxfxbqfkf implements View.OnAttachStateChangeListener {
        ppxfxbqfkf() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            oxmwwwfdhm.this.lqeggnwhkg();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            oxmwwwfdhm.this.hkdspvbjdz();
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final SparseArray f23361iobyxmoadg = new SparseArray();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f23362ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f23363wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final oxmwwwfdhm f23364zoijcleaow;

        wkgbmnqykc(oxmwwwfdhm oxmwwwfdhmVar, mbcevpiqjq mbcevpiqjqVar) {
            this.f23364zoijcleaow = oxmwwwfdhmVar;
            this.f23362ppxfxbqfkf = mbcevpiqjqVar.agtfadlqog(da.draadjrbmk.TextInputLayout_endIconDrawable, 0);
            this.f23363wkgbmnqykc = mbcevpiqjqVar.agtfadlqog(da.draadjrbmk.TextInputLayout_passwordToggleDrawable, 0);
        }

        private kcexrzcfyt zoijcleaow(int i13) {
            if (i13 == -1) {
                return new lqeggnwhkg(this.f23364zoijcleaow);
            }
            if (i13 == 0) {
                return new iwizpuwonk(this.f23364zoijcleaow);
            }
            if (i13 == 1) {
                return new esjtqupxsv(this.f23364zoijcleaow, this.f23363wkgbmnqykc);
            }
            if (i13 == 2) {
                return new gxszxtbevo(this.f23364zoijcleaow);
            }
            if (i13 == 3) {
                return new rgvfuqvkyq(this.f23364zoijcleaow);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i13);
        }

        kcexrzcfyt ppxfxbqfkf(int i13) {
            kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) this.f23361iobyxmoadg.get(i13);
            if (kcexrzcfytVar != null) {
                return kcexrzcfytVar;
            }
            kcexrzcfyt kcexrzcfytVarZoijcleaow = zoijcleaow(i13);
            this.f23361iobyxmoadg.append(i13, kcexrzcfytVarZoijcleaow);
            return kcexrzcfytVarZoijcleaow;
        }
    }

    class zoijcleaow implements TextInputLayout.gxszxtbevo {
        zoijcleaow() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.gxszxtbevo
        public void iobyxmoadg(TextInputLayout textInputLayout) {
            if (oxmwwwfdhm.this.f23346jpowsppfya == textInputLayout.getEditText()) {
                return;
            }
            if (oxmwwwfdhm.this.f23346jpowsppfya != null) {
                oxmwwwfdhm.this.f23346jpowsppfya.removeTextChangedListener(oxmwwwfdhm.this.f23339dsvhmnatus);
                if (oxmwwwfdhm.this.f23346jpowsppfya.getOnFocusChangeListener() == oxmwwwfdhm.this.wflxmlrfwp().eablkybsjg()) {
                    oxmwwwfdhm.this.f23346jpowsppfya.setOnFocusChangeListener(null);
                }
            }
            oxmwwwfdhm.this.f23346jpowsppfya = textInputLayout.getEditText();
            if (oxmwwwfdhm.this.f23346jpowsppfya != null) {
                oxmwwwfdhm.this.f23346jpowsppfya.addTextChangedListener(oxmwwwfdhm.this.f23339dsvhmnatus);
            }
            oxmwwwfdhm.this.wflxmlrfwp().agtfadlqog(oxmwwwfdhm.this.f23346jpowsppfya);
            oxmwwwfdhm oxmwwwfdhmVar = oxmwwwfdhm.this;
            oxmwwwfdhmVar.rlfsiqarku(oxmwwwfdhmVar.wflxmlrfwp());
        }
    }

    oxmwwwfdhm(TextInputLayout textInputLayout, mbcevpiqjq mbcevpiqjqVar) {
        super(textInputLayout.getContext());
        this.f23358zynmafqrjb = 0;
        this.f23344istkbnxepw = new LinkedHashSet();
        this.f23339dsvhmnatus = new iobyxmoadg();
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f23353wypolnanlu = zoijcleaowVar;
        this.f23342hkdspvbjdz = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f23357zdlpuopuiu = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f23355yggfygwlhe = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonDxjokdxxww = dxjokdxxww(this, layoutInflaterFrom, da.gxszxtbevo.text_input_error_icon);
        this.f23347jyumaefscl = checkableImageButtonDxjokdxxww;
        CheckableImageButton checkableImageButtonDxjokdxxww2 = dxjokdxxww(frameLayout, layoutInflaterFrom, da.gxszxtbevo.text_input_end_icon);
        this.f23348lereixgezr = checkableImageButtonDxjokdxxww2;
        this.f23351pmvmpeiblj = new wkgbmnqykc(this, mbcevpiqjqVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f23350pkzmftpjix = appCompatTextView;
        istkbnxepw(mbcevpiqjqVar);
        zynmafqrjb(mbcevpiqjqVar);
        cdpycssgdh(mbcevpiqjqVar);
        frameLayout.addView(checkableImageButtonDxjokdxxww2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonDxjokdxxww);
        textInputLayout.dxjokdxxww(zoijcleaowVar);
        addOnAttachStateChangeListener(new ppxfxbqfkf());
    }

    private void btonecajqb(int i13) {
        Iterator it = this.f23344istkbnxepw.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(it.next());
            throw null;
        }
    }

    private void cdpycssgdh(mbcevpiqjq mbcevpiqjqVar) {
        this.f23350pkzmftpjix.setVisibility(8);
        this.f23350pkzmftpjix.setId(da.gxszxtbevo.textinput_suffix_text);
        this.f23350pkzmftpjix.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        jhduphickx.opjhrmiecq(this.f23350pkzmftpjix, 1);
        opjhrmiecq(mbcevpiqjqVar.agtfadlqog(da.draadjrbmk.TextInputLayout_suffixTextAppearance, 0));
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_suffixTextColor)) {
            iyctptxqzt(mbcevpiqjqVar.ppxfxbqfkf(da.draadjrbmk.TextInputLayout_suffixTextColor));
        }
        bfopjjpdmp(mbcevpiqjqVar.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_suffixText));
    }

    private CheckableImageButton dxjokdxxww(ViewGroup viewGroup, LayoutInflater layoutInflater, int i13) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(da.nufgyqmvbu.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i13);
        zdlpuopuiu.eablkybsjg(checkableImageButton);
        if (oa.ppxfxbqfkf.nufgyqmvbu(getContext())) {
            v1.iwizpuwonk.wkgbmnqykc((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hkdspvbjdz() {
        AccessibilityManager accessibilityManager;
        w1.ppxfxbqfkf.zoijcleaow zoijcleaowVar = this.f23337cllcsxoeiz;
        if (zoijcleaowVar == null || (accessibilityManager = this.f23342hkdspvbjdz) == null) {
            return;
        }
        w1.ppxfxbqfkf.ppxfxbqfkf(accessibilityManager, zoijcleaowVar);
    }

    private void istkbnxepw(mbcevpiqjq mbcevpiqjqVar) {
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_errorIconTint)) {
            this.f23345iwizpuwonk = oa.ppxfxbqfkf.zoijcleaow(getContext(), mbcevpiqjqVar, da.draadjrbmk.TextInputLayout_errorIconTint);
        }
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_errorIconTintMode)) {
            this.f23338cqumvgiudr = com.google.android.material.internal.ojitshcjhn.btonecajqb(mbcevpiqjqVar.gtknphoqwx(da.draadjrbmk.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_errorIconDrawable)) {
            ikoacuggdj(mbcevpiqjqVar.lqeggnwhkg(da.draadjrbmk.TextInputLayout_errorIconDrawable));
        }
        this.f23347jyumaefscl.setContentDescription(getResources().getText(da.btonecajqb.error_icon_content_description));
        jhduphickx.uawqvzlxes(this.f23347jyumaefscl, 2);
        this.f23347jyumaefscl.setClickable(false);
        this.f23347jyumaefscl.setPressable(false);
        this.f23347jyumaefscl.setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lqeggnwhkg() {
        if (this.f23337cllcsxoeiz == null || this.f23342hkdspvbjdz == null || !jhduphickx.kegysxyocb(this)) {
            return;
        }
        w1.ppxfxbqfkf.iobyxmoadg(this.f23342hkdspvbjdz, this.f23337cllcsxoeiz);
    }

    private void lrnfpwlwnk(kcexrzcfyt kcexrzcfytVar) {
        hkdspvbjdz();
        this.f23337cllcsxoeiz = null;
        kcexrzcfytVar.yggfygwlhe();
    }

    private void nuxfzjnpeb() {
        this.f23355yggfygwlhe.setVisibility((this.f23348lereixgezr.getVisibility() != 0 || lmojexxdyd()) ? 8 : 0);
        setVisibility((iozdgvuglv() || lmojexxdyd() || ((this.f23356ylkuphrtab == null || this.f23341hcddaimhww) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rlfsiqarku(kcexrzcfyt kcexrzcfytVar) {
        if (this.f23346jpowsppfya == null) {
            return;
        }
        if (kcexrzcfytVar.eablkybsjg() != null) {
            this.f23346jpowsppfya.setOnFocusChangeListener(kcexrzcfytVar.eablkybsjg());
        }
        if (kcexrzcfytVar.lqeggnwhkg() != null) {
            this.f23348lereixgezr.setOnFocusChangeListener(kcexrzcfytVar.lqeggnwhkg());
        }
    }

    private void tbqsvytpvh() {
        this.f23347jyumaefscl.setVisibility(kcexrzcfyt() != null && this.f23357zdlpuopuiu.cllcsxoeiz() && this.f23357zdlpuopuiu.okpsazkaxt() ? 0 : 8);
        nuxfzjnpeb();
        roivzttewh();
        if (pmvmpeiblj()) {
            return;
        }
        this.f23357zdlpuopuiu.oipsdeybqn();
    }

    private void uawqvzlxes() {
        int visibility = this.f23350pkzmftpjix.getVisibility();
        int i13 = (this.f23356ylkuphrtab == null || this.f23341hcddaimhww) ? 8 : 0;
        if (visibility != i13) {
            wflxmlrfwp().vdvldrhtss(i13 == 0);
        }
        nuxfzjnpeb();
        this.f23350pkzmftpjix.setVisibility(i13);
        this.f23357zdlpuopuiu.oipsdeybqn();
    }

    private void weqkydbzbr(kcexrzcfyt kcexrzcfytVar) {
        kcexrzcfytVar.kcexrzcfyt();
        this.f23337cllcsxoeiz = kcexrzcfytVar.nufgyqmvbu();
        lqeggnwhkg();
    }

    private int zdlpuopuiu(kcexrzcfyt kcexrzcfytVar) {
        int i13 = this.f23351pmvmpeiblj.f23362ppxfxbqfkf;
        return i13 == 0 ? kcexrzcfytVar.wkgbmnqykc() : i13;
    }

    private void zeieaojujs(boolean z13) {
        if (!z13 || agtfadlqog() == null) {
            zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23348lereixgezr, this.f23336cdpycssgdh, this.f23354yadqdtsiqt);
            return;
        }
        Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(agtfadlqog()).mutate();
        k1.iobyxmoadg.agtfadlqog(drawableMutate, this.f23357zdlpuopuiu.getErrorCurrentTextColors());
        this.f23348lereixgezr.setImageDrawable(drawableMutate);
    }

    private void zynmafqrjb(mbcevpiqjq mbcevpiqjqVar) {
        if (!mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_passwordToggleEnabled)) {
            if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_endIconTint)) {
                this.f23336cdpycssgdh = oa.ppxfxbqfkf.zoijcleaow(getContext(), mbcevpiqjqVar, da.draadjrbmk.TextInputLayout_endIconTint);
            }
            if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_endIconTintMode)) {
                this.f23354yadqdtsiqt = com.google.android.material.internal.ojitshcjhn.btonecajqb(mbcevpiqjqVar.gtknphoqwx(da.draadjrbmk.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_endIconMode)) {
            ntlheqmsrt(mbcevpiqjqVar.gtknphoqwx(da.draadjrbmk.TextInputLayout_endIconMode, 0));
            if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_endIconContentDescription)) {
                stevsuqkhv(mbcevpiqjqVar.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_endIconContentDescription));
            }
            dsvhmnatus(mbcevpiqjqVar.iobyxmoadg(da.draadjrbmk.TextInputLayout_endIconCheckable, true));
        } else if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_passwordToggleEnabled)) {
            if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_passwordToggleTint)) {
                this.f23336cdpycssgdh = oa.ppxfxbqfkf.zoijcleaow(getContext(), mbcevpiqjqVar, da.draadjrbmk.TextInputLayout_passwordToggleTint);
            }
            if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_passwordToggleTintMode)) {
                this.f23354yadqdtsiqt = com.google.android.material.internal.ojitshcjhn.btonecajqb(mbcevpiqjqVar.gtknphoqwx(da.draadjrbmk.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            ntlheqmsrt(mbcevpiqjqVar.iobyxmoadg(da.draadjrbmk.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            stevsuqkhv(mbcevpiqjqVar.rgvfuqvkyq(da.draadjrbmk.TextInputLayout_passwordToggleContentDescription));
        }
        mbcevpiqjq(mbcevpiqjqVar.gxszxtbevo(da.draadjrbmk.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(da.wkgbmnqykc.mtrl_min_touch_target_size)));
        if (mbcevpiqjqVar.kcexrzcfyt(da.draadjrbmk.TextInputLayout_endIconScaleType)) {
            crxdokpmqz(zdlpuopuiu.zoijcleaow(mbcevpiqjqVar.gtknphoqwx(da.draadjrbmk.TextInputLayout_endIconScaleType, -1)));
        }
    }

    Drawable agtfadlqog() {
        return this.f23348lereixgezr.getDrawable();
    }

    void bfopjjpdmp(CharSequence charSequence) {
        this.f23356ylkuphrtab = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f23350pkzmftpjix.setText(charSequence);
        uawqvzlxes();
    }

    void cllcsxoeiz(boolean z13) {
        this.f23348lereixgezr.setActivated(z13);
    }

    ColorStateList cqumvgiudr() {
        return this.f23350pkzmftpjix.getTextColors();
    }

    void crxdokpmqz(ImageView.ScaleType scaleType) {
        this.f23349lmojexxdyd = scaleType;
        zdlpuopuiu.btonecajqb(this.f23348lereixgezr, scaleType);
        zdlpuopuiu.btonecajqb(this.f23347jyumaefscl, scaleType);
    }

    void czzsidtyhn(int i13) {
        uwvvkdfqfp(i13 != 0 ? getResources().getText(i13) : null);
    }

    CharSequence draadjrbmk() {
        return this.f23348lereixgezr.getContentDescription();
    }

    void dsvhmnatus(boolean z13) {
        this.f23348lereixgezr.setCheckable(z13);
    }

    int esjtqupxsv() {
        return jhduphickx.cdpycssgdh(this) + jhduphickx.cdpycssgdh(this.f23350pkzmftpjix) + ((iozdgvuglv() || lmojexxdyd()) ? this.f23348lereixgezr.getMeasuredWidth() + v1.iwizpuwonk.zoijcleaow((ViewGroup.MarginLayoutParams) this.f23348lereixgezr.getLayoutParams()) : 0);
    }

    CheckableImageButton gtknphoqwx() {
        if (lmojexxdyd()) {
            return this.f23347jyumaefscl;
        }
        if (pmvmpeiblj() && iozdgvuglv()) {
            return this.f23348lereixgezr;
        }
        return null;
    }

    void hcddaimhww() {
        zdlpuopuiu.wkgbmnqykc(this.f23357zdlpuopuiu, this.f23347jyumaefscl, this.f23345iwizpuwonk);
    }

    void ikoacuggdj(Drawable drawable) {
        this.f23347jyumaefscl.setImageDrawable(drawable);
        tbqsvytpvh();
        zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23347jyumaefscl, this.f23345iwizpuwonk, this.f23338cqumvgiudr);
    }

    boolean iozdgvuglv() {
        return this.f23355yggfygwlhe.getVisibility() == 0 && this.f23348lereixgezr.getVisibility() == 0;
    }

    CharSequence iwizpuwonk() {
        return this.f23356ylkuphrtab;
    }

    void iyctptxqzt(ColorStateList colorStateList) {
        this.f23350pkzmftpjix.setTextColor(colorStateList);
    }

    void jhduphickx(int i13) {
        ikoacuggdj(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
        hcddaimhww();
    }

    void jlmebxxoox(ColorStateList colorStateList) {
        if (this.f23336cdpycssgdh != colorStateList) {
            this.f23336cdpycssgdh = colorStateList;
            zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23348lereixgezr, colorStateList, this.f23354yadqdtsiqt);
        }
    }

    void jpowsppfya(boolean z13) {
        boolean z14;
        boolean zIsActivated;
        boolean zIsChecked;
        kcexrzcfyt kcexrzcfytVarWflxmlrfwp = wflxmlrfwp();
        boolean z15 = true;
        if (!kcexrzcfytVarWflxmlrfwp.draadjrbmk() || (zIsChecked = this.f23348lereixgezr.isChecked()) == kcexrzcfytVarWflxmlrfwp.wflxmlrfwp()) {
            z14 = false;
        } else {
            this.f23348lereixgezr.setChecked(!zIsChecked);
            z14 = true;
        }
        if (!kcexrzcfytVarWflxmlrfwp.btonecajqb() || (zIsActivated = this.f23348lereixgezr.isActivated()) == kcexrzcfytVarWflxmlrfwp.gtknphoqwx()) {
            z15 = z14;
        } else {
            cllcsxoeiz(!zIsActivated);
        }
        if (z13 || z15) {
            pkzmftpjix();
        }
    }

    Drawable jyumaefscl() {
        return this.f23348lereixgezr.getDrawable();
    }

    void jztzpxfvev(View.OnLongClickListener onLongClickListener) {
        this.f23340esjtqupxsv = onLongClickListener;
        zdlpuopuiu.dxjokdxxww(this.f23347jyumaefscl, onLongClickListener);
    }

    Drawable kcexrzcfyt() {
        return this.f23347jyumaefscl.getDrawable();
    }

    void kegysxyocb(int i13) {
        tzroggbefp(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
    }

    TextView lereixgezr() {
        return this.f23350pkzmftpjix;
    }

    boolean lmojexxdyd() {
        return this.f23347jyumaefscl.getVisibility() == 0;
    }

    void mbcevpiqjq(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i13 != this.f23343iozdgvuglv) {
            this.f23343iozdgvuglv = i13;
            zdlpuopuiu.lqeggnwhkg(this.f23348lereixgezr, i13);
            zdlpuopuiu.lqeggnwhkg(this.f23347jyumaefscl, i13);
        }
    }

    void metgxyhuhe(PorterDuff.Mode mode) {
        if (this.f23338cqumvgiudr != mode) {
            this.f23338cqumvgiudr = mode;
            zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23347jyumaefscl, this.f23345iwizpuwonk, mode);
        }
    }

    void ntlheqmsrt(int i13) {
        if (this.f23358zynmafqrjb == i13) {
            return;
        }
        lrnfpwlwnk(wflxmlrfwp());
        int i14 = this.f23358zynmafqrjb;
        this.f23358zynmafqrjb = i13;
        btonecajqb(i14);
        vipkmwdibw(i13 != 0);
        kcexrzcfyt kcexrzcfytVarWflxmlrfwp = wflxmlrfwp();
        kegysxyocb(zdlpuopuiu(kcexrzcfytVarWflxmlrfwp));
        wypolnanlu(kcexrzcfytVarWflxmlrfwp.ppxfxbqfkf());
        dsvhmnatus(kcexrzcfytVarWflxmlrfwp.draadjrbmk());
        if (!kcexrzcfytVarWflxmlrfwp.dxjokdxxww(this.f23357zdlpuopuiu.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f23357zdlpuopuiu.getBoxBackgroundMode() + " is not supported by the end icon mode " + i13);
        }
        weqkydbzbr(kcexrzcfytVarWflxmlrfwp);
        ulzqkzuiru(kcexrzcfytVarWflxmlrfwp.gxszxtbevo());
        EditText editText = this.f23346jpowsppfya;
        if (editText != null) {
            kcexrzcfytVarWflxmlrfwp.agtfadlqog(editText);
            rlfsiqarku(kcexrzcfytVarWflxmlrfwp);
        }
        zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23348lereixgezr, this.f23336cdpycssgdh, this.f23354yadqdtsiqt);
        jpowsppfya(true);
    }

    void nufgyqmvbu() {
        this.f23348lereixgezr.performClick();
        this.f23348lereixgezr.jumpDrawablesToCurrentState();
    }

    void oipsdeybqn(PorterDuff.Mode mode) {
        this.f23354yadqdtsiqt = mode;
        zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23348lereixgezr, this.f23336cdpycssgdh, mode);
    }

    int ojitshcjhn() {
        return this.f23343iozdgvuglv;
    }

    void okpsazkaxt(View.OnClickListener onClickListener) {
        zdlpuopuiu.nufgyqmvbu(this.f23347jyumaefscl, onClickListener, this.f23340esjtqupxsv);
    }

    void opjhrmiecq(int i13) {
        androidx.core.widget.dxjokdxxww.rgvfuqvkyq(this.f23350pkzmftpjix, i13);
    }

    CheckableImageButton oxmwwwfdhm() {
        return this.f23348lereixgezr;
    }

    void pkzmftpjix() {
        zdlpuopuiu.wkgbmnqykc(this.f23357zdlpuopuiu, this.f23348lereixgezr, this.f23336cdpycssgdh);
    }

    boolean pmvmpeiblj() {
        return this.f23358zynmafqrjb != 0;
    }

    int rgvfuqvkyq() {
        return this.f23358zynmafqrjb;
    }

    void ribwqtqdhb(PorterDuff.Mode mode) {
        if (this.f23354yadqdtsiqt != mode) {
            this.f23354yadqdtsiqt = mode;
            zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23348lereixgezr, this.f23336cdpycssgdh, mode);
        }
    }

    void roivzttewh() {
        if (this.f23357zdlpuopuiu.f23224iwizpuwonk == null) {
            return;
        }
        jhduphickx.lxfrhoxuzk(this.f23350pkzmftpjix, getContext().getResources().getDimensionPixelSize(da.wkgbmnqykc.material_input_text_to_prefix_suffix_padding), this.f23357zdlpuopuiu.f23224iwizpuwonk.getPaddingTop(), (iozdgvuglv() || lmojexxdyd()) ? 0 : jhduphickx.cdpycssgdh(this.f23357zdlpuopuiu.f23224iwizpuwonk), this.f23357zdlpuopuiu.f23224iwizpuwonk.getPaddingBottom());
    }

    void sflfametgt(boolean z13) {
        if (z13 && this.f23358zynmafqrjb != 1) {
            ntlheqmsrt(1);
        } else {
            if (z13) {
                return;
            }
            ntlheqmsrt(0);
        }
    }

    void sopmlzcsov(View.OnLongClickListener onLongClickListener) {
        this.f23352wwaezpbzkn = onLongClickListener;
        zdlpuopuiu.dxjokdxxww(this.f23348lereixgezr, onLongClickListener);
    }

    void stevsuqkhv(CharSequence charSequence) {
        if (draadjrbmk() != charSequence) {
            this.f23348lereixgezr.setContentDescription(charSequence);
        }
    }

    void tzroggbefp(Drawable drawable) {
        this.f23348lereixgezr.setImageDrawable(drawable);
        if (drawable != null) {
            zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23348lereixgezr, this.f23336cdpycssgdh, this.f23354yadqdtsiqt);
            pkzmftpjix();
        }
    }

    void ulzqkzuiru(View.OnClickListener onClickListener) {
        zdlpuopuiu.nufgyqmvbu(this.f23348lereixgezr, onClickListener, this.f23352wwaezpbzkn);
    }

    void uwvvkdfqfp(CharSequence charSequence) {
        this.f23348lereixgezr.setContentDescription(charSequence);
    }

    ImageView.ScaleType vdvldrhtss() {
        return this.f23349lmojexxdyd;
    }

    void vipkmwdibw(boolean z13) {
        if (iozdgvuglv() != z13) {
            this.f23348lereixgezr.setVisibility(z13 ? 0 : 8);
            nuxfzjnpeb();
            roivzttewh();
            this.f23357zdlpuopuiu.oipsdeybqn();
        }
    }

    kcexrzcfyt wflxmlrfwp() {
        return this.f23351pmvmpeiblj.ppxfxbqfkf(this.f23358zynmafqrjb);
    }

    void wwaezpbzkn(boolean z13) {
        this.f23341hcddaimhww = z13;
        uawqvzlxes();
    }

    void wypolnanlu(int i13) {
        stevsuqkhv(i13 != 0 ? getResources().getText(i13) : null);
    }

    void xrmfcynszj(ColorStateList colorStateList) {
        if (this.f23345iwizpuwonk != colorStateList) {
            this.f23345iwizpuwonk = colorStateList;
            zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23347jyumaefscl, colorStateList, this.f23338cqumvgiudr);
        }
    }

    boolean yadqdtsiqt() {
        return pmvmpeiblj() && this.f23348lereixgezr.isChecked();
    }

    void ydmasvzmpa(Drawable drawable) {
        this.f23348lereixgezr.setImageDrawable(drawable);
    }

    void yfnezrywwk(int i13) {
        ydmasvzmpa(i13 != 0 ? nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13) : null);
    }

    CharSequence yggfygwlhe() {
        return this.f23348lereixgezr.getContentDescription();
    }

    void ylkuphrtab() {
        tbqsvytpvh();
        hcddaimhww();
        pkzmftpjix();
        if (wflxmlrfwp().zdlpuopuiu()) {
            zeieaojujs(this.f23357zdlpuopuiu.okpsazkaxt());
        }
    }

    void zfvoamnweg(ColorStateList colorStateList) {
        this.f23336cdpycssgdh = colorStateList;
        zdlpuopuiu.iobyxmoadg(this.f23357zdlpuopuiu, this.f23348lereixgezr, colorStateList, this.f23354yadqdtsiqt);
    }
}
