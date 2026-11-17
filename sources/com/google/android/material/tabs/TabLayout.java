package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.jlmebxxoox;
import androidx.core.widget.dxjokdxxww;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.draadjrbmk;
import com.google.android.material.internal.ojitshcjhn;
import da.btonecajqb;
import da.gtknphoqwx;
import da.nufgyqmvbu;
import java.util.ArrayList;
import java.util.Iterator;
import u1.lqeggnwhkg;
import v1.cllcsxoeiz;
import v1.iwizpuwonk;
import v1.jhduphickx;
import w1.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f23106cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    final int f23107cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    int f23108cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    boolean f23109crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f23110czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    int f23111dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    int f23112esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    float f23113hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    float f23114hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private com.google.android.material.tabs.ppxfxbqfkf f23115ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    ColorStateList f23116iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final int f23117istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    final wkgbmnqykc f23118iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    boolean f23119jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    boolean f23120jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    float f23121jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private eablkybsjg f23122jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private zoijcleaow f23123jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final int f23124kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    int f23125lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    ColorStateList f23126lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    int f23127mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private zoijcleaow f23128metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    int f23129ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private final TimeInterpolator f23130okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    PorterDuff.Mode f23131pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    int f23132pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    int f23133ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private ValueAnimator f23134rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    int f23135sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final int f23136stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private int f23137tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    int f23138ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private int f23139uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    int f23140vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    Drawable f23141wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final int f23142wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private final ArrayList f23143xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    ColorStateList f23144yadqdtsiqt;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private final u1.eablkybsjg f23145yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ArrayList f23146yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private int f23147ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    int f23148zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final int f23149zynmafqrjb;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private static final int f23105ydmasvzmpa = gtknphoqwx.Widget_Design_TabLayout;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private static final u1.eablkybsjg f23104sflfametgt = new lqeggnwhkg(16);

    public static class eablkybsjg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public gxszxtbevo f23151dxjokdxxww;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private View f23153gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Object f23154iobyxmoadg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public TabLayout f23156nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private CharSequence f23157ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private CharSequence f23158wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Drawable f23159zoijcleaow;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f23152eablkybsjg = -1;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f23155lqeggnwhkg = 1;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f23150btonecajqb = -1;

        public eablkybsjg agtfadlqog(int i13) {
            return ojitshcjhn(LayoutInflater.from(this.f23151dxjokdxxww.getContext()).inflate(i13, (ViewGroup) this.f23151dxjokdxxww, false));
        }

        public boolean btonecajqb() {
            TabLayout tabLayout = this.f23156nufgyqmvbu;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f23152eablkybsjg;
        }

        public void draadjrbmk() {
            TabLayout tabLayout = this.f23156nufgyqmvbu;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.jpowsppfya(this);
        }

        public CharSequence dxjokdxxww() {
            return this.f23157ppxfxbqfkf;
        }

        public View eablkybsjg() {
            return this.f23153gxszxtbevo;
        }

        void gtknphoqwx() {
            this.f23156nufgyqmvbu = null;
            this.f23151dxjokdxxww = null;
            this.f23154iobyxmoadg = null;
            this.f23159zoijcleaow = null;
            this.f23150btonecajqb = -1;
            this.f23157ppxfxbqfkf = null;
            this.f23158wkgbmnqykc = null;
            this.f23152eablkybsjg = -1;
            this.f23153gxszxtbevo = null;
        }

        public Drawable gxszxtbevo() {
            return this.f23159zoijcleaow;
        }

        void kcexrzcfyt() {
            gxszxtbevo gxszxtbevoVar = this.f23151dxjokdxxww;
            if (gxszxtbevoVar != null) {
                gxszxtbevoVar.zdlpuopuiu();
            }
        }

        public int lqeggnwhkg() {
            return this.f23152eablkybsjg;
        }

        public int nufgyqmvbu() {
            return this.f23155lqeggnwhkg;
        }

        public eablkybsjg ojitshcjhn(View view) {
            this.f23153gxszxtbevo = view;
            kcexrzcfyt();
            return this;
        }

        public eablkybsjg oxmwwwfdhm(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f23158wkgbmnqykc) && !TextUtils.isEmpty(charSequence)) {
                this.f23151dxjokdxxww.setContentDescription(charSequence);
            }
            this.f23157ppxfxbqfkf = charSequence;
            kcexrzcfyt();
            return this;
        }

        public eablkybsjg rgvfuqvkyq(Drawable drawable) {
            this.f23159zoijcleaow = drawable;
            TabLayout tabLayout = this.f23156nufgyqmvbu;
            if (tabLayout.f23127mbcevpiqjq == 1 || tabLayout.f23135sopmlzcsov == 2) {
                tabLayout.sopmlzcsov(true);
            }
            kcexrzcfyt();
            if (com.google.android.material.badge.zoijcleaow.f22116iobyxmoadg && this.f23151dxjokdxxww.draadjrbmk() && this.f23151dxjokdxxww.f23161cqumvgiudr.isVisible()) {
                this.f23151dxjokdxxww.invalidate();
            }
            return this;
        }

        void vdvldrhtss(int i13) {
            this.f23152eablkybsjg = i13;
        }

        public eablkybsjg wflxmlrfwp(CharSequence charSequence) {
            this.f23158wkgbmnqykc = charSequence;
            kcexrzcfyt();
            return this;
        }
    }

    public final class gxszxtbevo extends LinearLayout {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private com.google.android.material.badge.iobyxmoadg f23161cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private View f23162esjtqupxsv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private int f23163istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private View f23164iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private ImageView f23165jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private TextView f23166lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private ImageView f23167pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private TextView f23168yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private eablkybsjg f23169zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private Drawable f23170zynmafqrjb;

        class iobyxmoadg implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ View f23171iobyxmoadg;

            iobyxmoadg(View view) {
                this.f23171iobyxmoadg = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
                if (this.f23171iobyxmoadg.getVisibility() == 0) {
                    gxszxtbevo.this.kcexrzcfyt(this.f23171iobyxmoadg);
                }
            }
        }

        public gxszxtbevo(Context context) {
            super(context);
            this.f23163istkbnxepw = 2;
            yggfygwlhe(context);
            jhduphickx.lxfrhoxuzk(this, TabLayout.this.f23108cqumvgiudr, TabLayout.this.f23112esjtqupxsv, TabLayout.this.f23125lereixgezr, TabLayout.this.f23132pmvmpeiblj);
            setGravity(17);
            setOrientation(!TabLayout.this.f23109crxdokpmqz ? 1 : 0);
            setClickable(true);
            jhduphickx.wizcaqwiak(this, cllcsxoeiz.zoijcleaow(getContext(), 1002));
        }

        private void agtfadlqog() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.zoijcleaow.f22116iobyxmoadg) {
                FrameLayout frameLayoutDxjokdxxww = dxjokdxxww();
                addView(frameLayoutDxjokdxxww);
                viewGroup = frameLayoutDxjokdxxww;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(nufgyqmvbu.design_layout_tab_text, viewGroup, false);
            this.f23168yggfygwlhe = textView;
            viewGroup.addView(textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void btonecajqb(Canvas canvas) {
            Drawable drawable = this.f23170zynmafqrjb;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f23170zynmafqrjb.draw(canvas);
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        private void cqumvgiudr(TextView textView, ImageView imageView, boolean z13) {
            boolean z14;
            eablkybsjg eablkybsjgVar = this.f23169zdlpuopuiu;
            Drawable drawableMutate = (eablkybsjgVar == null || eablkybsjgVar.gxszxtbevo() == null) ? null : k1.iobyxmoadg.oxmwwwfdhm(this.f23169zdlpuopuiu.gxszxtbevo()).mutate();
            if (drawableMutate != null) {
                k1.iobyxmoadg.ojitshcjhn(drawableMutate, TabLayout.this.f23116iozdgvuglv);
                PorterDuff.Mode mode = TabLayout.this.f23131pkzmftpjix;
                if (mode != null) {
                    k1.iobyxmoadg.rgvfuqvkyq(drawableMutate, mode);
                }
            }
            eablkybsjg eablkybsjgVar2 = this.f23169zdlpuopuiu;
            CharSequence charSequenceDxjokdxxww = eablkybsjgVar2 != null ? eablkybsjgVar2.dxjokdxxww() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceDxjokdxxww);
            if (textView != null) {
                if (!zIsEmpty) {
                    z14 = this.f23169zdlpuopuiu.f23155lqeggnwhkg == 1;
                }
                textView.setText(!zIsEmpty ? charSequenceDxjokdxxww : null);
                textView.setVisibility(z14 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z14 = false;
            }
            if (z13 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iPpxfxbqfkf = (z14 && imageView.getVisibility() == 0) ? (int) ojitshcjhn.ppxfxbqfkf(getContext(), 8) : 0;
                if (TabLayout.this.f23109crxdokpmqz) {
                    if (iPpxfxbqfkf != iwizpuwonk.iobyxmoadg(marginLayoutParams)) {
                        iwizpuwonk.ppxfxbqfkf(marginLayoutParams, iPpxfxbqfkf);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iPpxfxbqfkf != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iPpxfxbqfkf;
                    iwizpuwonk.ppxfxbqfkf(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            eablkybsjg eablkybsjgVar3 = this.f23169zdlpuopuiu;
            CharSequence charSequence = eablkybsjgVar3 != null ? eablkybsjgVar3.f23158wkgbmnqykc : null;
            if (zIsEmpty) {
                charSequenceDxjokdxxww = charSequence;
            }
            jlmebxxoox.iobyxmoadg(this, charSequenceDxjokdxxww);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean draadjrbmk() {
            return this.f23161cqumvgiudr != null;
        }

        private FrameLayout dxjokdxxww() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        private com.google.android.material.badge.iobyxmoadg getBadge() {
            return this.f23161cqumvgiudr;
        }

        private com.google.android.material.badge.iobyxmoadg getOrCreateBadge() {
            if (this.f23161cqumvgiudr == null) {
                this.f23161cqumvgiudr = com.google.android.material.badge.iobyxmoadg.wkgbmnqykc(getContext());
            }
            oxmwwwfdhm();
            com.google.android.material.badge.iobyxmoadg iobyxmoadgVar = this.f23161cqumvgiudr;
            if (iobyxmoadgVar != null) {
                return iobyxmoadgVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private FrameLayout gtknphoqwx(View view) {
            if ((view == this.f23165jyumaefscl || view == this.f23168yggfygwlhe) && com.google.android.material.badge.zoijcleaow.f22116iobyxmoadg) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        private void gxszxtbevo(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new iobyxmoadg(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kcexrzcfyt(View view) {
            if (draadjrbmk() && view == this.f23164iwizpuwonk) {
                com.google.android.material.badge.zoijcleaow.ppxfxbqfkf(this.f23161cqumvgiudr, view, gtknphoqwx(view));
            }
        }

        private float lqeggnwhkg(Layout layout, int i13, float f13) {
            return layout.getLineWidth(i13) * (f13 / layout.getPaint().getTextSize());
        }

        private void nufgyqmvbu(boolean z13) {
            setClipChildren(z13);
            setClipToPadding(z13);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z13);
                viewGroup.setClipToPadding(z13);
            }
        }

        private void oxmwwwfdhm() {
            eablkybsjg eablkybsjgVar;
            eablkybsjg eablkybsjgVar2;
            if (draadjrbmk()) {
                if (this.f23162esjtqupxsv != null) {
                    vdvldrhtss();
                    return;
                }
                if (this.f23165jyumaefscl != null && (eablkybsjgVar2 = this.f23169zdlpuopuiu) != null && eablkybsjgVar2.gxszxtbevo() != null) {
                    View view = this.f23164iwizpuwonk;
                    ImageView imageView = this.f23165jyumaefscl;
                    if (view == imageView) {
                        kcexrzcfyt(imageView);
                        return;
                    } else {
                        vdvldrhtss();
                        rgvfuqvkyq(this.f23165jyumaefscl);
                        return;
                    }
                }
                if (this.f23168yggfygwlhe == null || (eablkybsjgVar = this.f23169zdlpuopuiu) == null || eablkybsjgVar.nufgyqmvbu() != 1) {
                    vdvldrhtss();
                    return;
                }
                View view2 = this.f23164iwizpuwonk;
                TextView textView = this.f23168yggfygwlhe;
                if (view2 == textView) {
                    kcexrzcfyt(textView);
                } else {
                    vdvldrhtss();
                    rgvfuqvkyq(this.f23168yggfygwlhe);
                }
            }
        }

        private void rgvfuqvkyq(View view) {
            if (draadjrbmk() && view != null) {
                nufgyqmvbu(false);
                com.google.android.material.badge.zoijcleaow.iobyxmoadg(this.f23161cqumvgiudr, view, gtknphoqwx(view));
                this.f23164iwizpuwonk = view;
            }
        }

        private void vdvldrhtss() {
            if (draadjrbmk()) {
                nufgyqmvbu(true);
                View view = this.f23164iwizpuwonk;
                if (view != null) {
                    com.google.android.material.badge.zoijcleaow.zoijcleaow(this.f23161cqumvgiudr, view);
                    this.f23164iwizpuwonk = null;
                }
            }
        }

        private void wflxmlrfwp() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.zoijcleaow.f22116iobyxmoadg) {
                FrameLayout frameLayoutDxjokdxxww = dxjokdxxww();
                addView(frameLayoutDxjokdxxww, 0);
                viewGroup = frameLayoutDxjokdxxww;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(nufgyqmvbu.design_layout_tab_icon, viewGroup, false);
            this.f23165jyumaefscl = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void yggfygwlhe(Context context) {
            GradientDrawable gradientDrawable;
            int i13 = TabLayout.this.f23107cllcsxoeiz;
            if (i13 != 0) {
                Drawable drawableZoijcleaow = nufgyqmvbu.iobyxmoadg.zoijcleaow(context, i13);
                this.f23170zynmafqrjb = drawableZoijcleaow;
                if (drawableZoijcleaow != null && drawableZoijcleaow.isStateful()) {
                    this.f23170zynmafqrjb.setState(getDrawableState());
                }
            } else {
                this.f23170zynmafqrjb = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f23126lmojexxdyd != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListIobyxmoadg = pa.zoijcleaow.iobyxmoadg(TabLayout.this.f23126lmojexxdyd);
                boolean z13 = TabLayout.this.f23119jhduphickx;
                if (z13) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListIobyxmoadg, gradientDrawable, z13 ? null : gradientDrawable3);
            }
            jhduphickx.weqkydbzbr(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f23170zynmafqrjb;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f23170zynmafqrjb.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f23168yggfygwlhe, this.f23165jyumaefscl, this.f23162esjtqupxsv};
            int iMax = 0;
            int iMin = 0;
            boolean z13 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z13 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z13 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z13 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f23168yggfygwlhe, this.f23165jyumaefscl, this.f23162esjtqupxsv};
            int iMax = 0;
            int iMin = 0;
            boolean z13 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z13 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z13 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z13 = true;
                }
            }
            return iMax - iMin;
        }

        public eablkybsjg getTab() {
            return this.f23169zdlpuopuiu;
        }

        final void iwizpuwonk() {
            ViewParent parent;
            eablkybsjg eablkybsjgVar = this.f23169zdlpuopuiu;
            View viewEablkybsjg = eablkybsjgVar != null ? eablkybsjgVar.eablkybsjg() : null;
            if (viewEablkybsjg != null) {
                ViewParent parent2 = viewEablkybsjg.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewEablkybsjg);
                    }
                    View view = this.f23162esjtqupxsv;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f23162esjtqupxsv);
                    }
                    addView(viewEablkybsjg);
                }
                this.f23162esjtqupxsv = viewEablkybsjg;
                TextView textView = this.f23168yggfygwlhe;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f23165jyumaefscl;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f23165jyumaefscl.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewEablkybsjg.findViewById(R.id.text1);
                this.f23166lereixgezr = textView2;
                if (textView2 != null) {
                    this.f23163istkbnxepw = dxjokdxxww.wkgbmnqykc(textView2);
                }
                this.f23167pmvmpeiblj = (ImageView) viewEablkybsjg.findViewById(R.id.icon);
            } else {
                View view2 = this.f23162esjtqupxsv;
                if (view2 != null) {
                    removeView(view2);
                    this.f23162esjtqupxsv = null;
                }
                this.f23166lereixgezr = null;
                this.f23167pmvmpeiblj = null;
            }
            if (this.f23162esjtqupxsv == null) {
                if (this.f23165jyumaefscl == null) {
                    wflxmlrfwp();
                }
                if (this.f23168yggfygwlhe == null) {
                    agtfadlqog();
                    this.f23163istkbnxepw = dxjokdxxww.wkgbmnqykc(this.f23168yggfygwlhe);
                }
                dxjokdxxww.rgvfuqvkyq(this.f23168yggfygwlhe, TabLayout.this.f23149zynmafqrjb);
                if (!isSelected() || TabLayout.this.f23106cdpycssgdh == -1) {
                    dxjokdxxww.rgvfuqvkyq(this.f23168yggfygwlhe, TabLayout.this.f23117istkbnxepw);
                } else {
                    dxjokdxxww.rgvfuqvkyq(this.f23168yggfygwlhe, TabLayout.this.f23106cdpycssgdh);
                }
                ColorStateList colorStateList = TabLayout.this.f23144yadqdtsiqt;
                if (colorStateList != null) {
                    this.f23168yggfygwlhe.setTextColor(colorStateList);
                }
                cqumvgiudr(this.f23168yggfygwlhe, this.f23165jyumaefscl, true);
                oxmwwwfdhm();
                gxszxtbevo(this.f23165jyumaefscl);
                gxszxtbevo(this.f23168yggfygwlhe);
            } else {
                TextView textView3 = this.f23166lereixgezr;
                if (textView3 != null || this.f23167pmvmpeiblj != null) {
                    cqumvgiudr(textView3, this.f23167pmvmpeiblj, false);
                }
            }
            if (eablkybsjgVar == null || TextUtils.isEmpty(eablkybsjgVar.f23158wkgbmnqykc)) {
                return;
            }
            setContentDescription(eablkybsjgVar.f23158wkgbmnqykc);
        }

        final void jyumaefscl() {
            setOrientation(!TabLayout.this.f23109crxdokpmqz ? 1 : 0);
            TextView textView = this.f23166lereixgezr;
            if (textView == null && this.f23167pmvmpeiblj == null) {
                cqumvgiudr(this.f23168yggfygwlhe, this.f23165jyumaefscl, true);
            } else {
                cqumvgiudr(textView, this.f23167pmvmpeiblj, false);
            }
        }

        void ojitshcjhn() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            zdlpuopuiu zdlpuopuiuVarG = zdlpuopuiu.g(accessibilityNodeInfo);
            com.google.android.material.badge.iobyxmoadg iobyxmoadgVar = this.f23161cqumvgiudr;
            if (iobyxmoadgVar != null && iobyxmoadgVar.isVisible()) {
                zdlpuopuiuVarG.zfvoamnweg(this.f23161cqumvgiudr.nufgyqmvbu());
            }
            zdlpuopuiuVarG.sflfametgt(zdlpuopuiu.gxszxtbevo.iobyxmoadg(0, 1, this.f23169zdlpuopuiu.lqeggnwhkg(), 1, false, isSelected()));
            if (isSelected()) {
                zdlpuopuiuVarG.yfnezrywwk(false);
                zdlpuopuiuVarG.vipkmwdibw(zdlpuopuiu.iobyxmoadg.f118517dxjokdxxww);
            }
            zdlpuopuiuVarG.ipoelvxyzq(getResources().getString(btonecajqb.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i13, int i14) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i13);
            int mode = View.MeasureSpec.getMode(i13);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i13 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f23111dsvhmnatus, Integer.MIN_VALUE);
            }
            super.onMeasure(i13, i14);
            if (this.f23168yggfygwlhe != null) {
                float f13 = TabLayout.this.f23113hcddaimhww;
                int i15 = this.f23163istkbnxepw;
                ImageView imageView = this.f23165jyumaefscl;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f23168yggfygwlhe;
                    if (textView != null && textView.getLineCount() > 1) {
                        f13 = TabLayout.this.f23114hkdspvbjdz;
                    }
                } else {
                    i15 = 1;
                }
                float textSize = this.f23168yggfygwlhe.getTextSize();
                int lineCount = this.f23168yggfygwlhe.getLineCount();
                int iWkgbmnqykc = dxjokdxxww.wkgbmnqykc(this.f23168yggfygwlhe);
                if (f13 != textSize || (iWkgbmnqykc >= 0 && i15 != iWkgbmnqykc)) {
                    if (TabLayout.this.f23135sopmlzcsov != 1 || f13 <= textSize || lineCount != 1 || ((layout = this.f23168yggfygwlhe.getLayout()) != null && lqeggnwhkg(layout, 0, f13) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f23168yggfygwlhe.setTextSize(0, f13);
                        this.f23168yggfygwlhe.setMaxLines(i15);
                        super.onMeasure(i13, i14);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f23169zdlpuopuiu == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f23169zdlpuopuiu.draadjrbmk();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z13) {
            isSelected();
            super.setSelected(z13);
            TextView textView = this.f23168yggfygwlhe;
            if (textView != null) {
                textView.setSelected(z13);
            }
            ImageView imageView = this.f23165jyumaefscl;
            if (imageView != null) {
                imageView.setSelected(z13);
            }
            View view = this.f23162esjtqupxsv;
            if (view != null) {
                view.setSelected(z13);
            }
        }

        void setTab(eablkybsjg eablkybsjgVar) {
            if (eablkybsjgVar != this.f23169zdlpuopuiu) {
                this.f23169zdlpuopuiu = eablkybsjgVar;
                zdlpuopuiu();
            }
        }

        final void zdlpuopuiu() {
            iwizpuwonk();
            eablkybsjg eablkybsjgVar = this.f23169zdlpuopuiu;
            setSelected(eablkybsjgVar != null && eablkybsjgVar.btonecajqb());
        }
    }

    class iobyxmoadg implements ValueAnimator.AnimatorUpdateListener {
        iobyxmoadg() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public interface ppxfxbqfkf extends zoijcleaow {
    }

    class wkgbmnqykc extends LinearLayout {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f23175yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        ValueAnimator f23176zdlpuopuiu;

        class iobyxmoadg implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ View f23177iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ View f23179zoijcleaow;

            iobyxmoadg(View view, View view2) {
                this.f23177iobyxmoadg = view;
                this.f23179zoijcleaow = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                wkgbmnqykc.this.btonecajqb(this.f23177iobyxmoadg, this.f23179zoijcleaow, valueAnimator.getAnimatedFraction());
            }
        }

        wkgbmnqykc(Context context) {
            super(context);
            this.f23175yggfygwlhe = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void btonecajqb(View view, View view2, float f13) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f23141wwaezpbzkn;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f23141wwaezpbzkn.getBounds().bottom);
            } else {
                com.google.android.material.tabs.ppxfxbqfkf ppxfxbqfkfVar = TabLayout.this.f23115ikoacuggdj;
                TabLayout tabLayout = TabLayout.this;
                ppxfxbqfkfVar.wkgbmnqykc(tabLayout, view, view2, f13, tabLayout.f23141wwaezpbzkn);
            }
            jhduphickx.xrmfcynszj(this);
        }

        private void eablkybsjg() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f23148zdlpuopuiu == -1) {
                tabLayout.f23148zdlpuopuiu = tabLayout.getSelectedTabPosition();
            }
            gxszxtbevo(TabLayout.this.f23148zdlpuopuiu);
        }

        private void gtknphoqwx(boolean z13, int i13, int i14) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f23148zdlpuopuiu == i13) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i13);
            if (childAt2 == null) {
                lqeggnwhkg();
                return;
            }
            TabLayout.this.f23148zdlpuopuiu = i13;
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(childAt, childAt2);
            if (!z13) {
                this.f23176zdlpuopuiu.removeAllUpdateListeners();
                this.f23176zdlpuopuiu.addUpdateListener(iobyxmoadgVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f23176zdlpuopuiu = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.f23130okpsazkaxt);
            valueAnimator.setDuration(i14);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(iobyxmoadgVar);
            valueAnimator.start();
        }

        private void gxszxtbevo(int i13) {
            if (TabLayout.this.f23139uwvvkdfqfp == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i13);
                com.google.android.material.tabs.ppxfxbqfkf ppxfxbqfkfVar = TabLayout.this.f23115ikoacuggdj;
                TabLayout tabLayout = TabLayout.this;
                ppxfxbqfkfVar.ppxfxbqfkf(tabLayout, childAt, tabLayout.f23141wwaezpbzkn);
                TabLayout.this.f23148zdlpuopuiu = i13;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lqeggnwhkg() {
            gxszxtbevo(TabLayout.this.getSelectedTabPosition());
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f23141wwaezpbzkn.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f23141wwaezpbzkn.getIntrinsicHeight();
            }
            int i13 = TabLayout.this.f23138ulzqkzuiru;
            if (i13 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i13 != 1) {
                height = 0;
                if (i13 != 2) {
                    iHeight = i13 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f23141wwaezpbzkn.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f23141wwaezpbzkn.getBounds();
                TabLayout.this.f23141wwaezpbzkn.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f23141wwaezpbzkn.draw(canvas);
            }
            super.draw(canvas);
        }

        void dxjokdxxww(int i13) {
            Rect bounds = TabLayout.this.f23141wwaezpbzkn.getBounds();
            TabLayout.this.f23141wwaezpbzkn.setBounds(bounds.left, 0, bounds.right, i13);
            requestLayout();
        }

        void nufgyqmvbu(int i13, float f13) {
            TabLayout.this.f23148zdlpuopuiu = Math.round(i13 + f13);
            ValueAnimator valueAnimator = this.f23176zdlpuopuiu;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f23176zdlpuopuiu.cancel();
            }
            btonecajqb(getChildAt(i13), getChildAt(i13 + 1), f13);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
            super.onLayout(z13, i13, i14, i15, i16);
            ValueAnimator valueAnimator = this.f23176zdlpuopuiu;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                eablkybsjg();
            } else {
                gtknphoqwx(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i13, int i14) {
            super.onMeasure(i13, i14);
            if (View.MeasureSpec.getMode(i13) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z13 = true;
            if (tabLayout.f23127mbcevpiqjq == 1 || tabLayout.f23135sopmlzcsov == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) ojitshcjhn.ppxfxbqfkf(getContext(), 16)) * 2)) {
                    boolean z14 = false;
                    for (int i16 = 0; i16 < childCount; i16++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i16).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z14 = true;
                        }
                    }
                    z13 = z14;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f23127mbcevpiqjq = 0;
                    tabLayout2.sopmlzcsov(false);
                }
                if (z13) {
                    super.onMeasure(i13, i14);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i13) {
            super.onRtlPropertiesChanged(i13);
        }

        void ppxfxbqfkf(int i13, int i14) {
            ValueAnimator valueAnimator = this.f23176zdlpuopuiu;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f23148zdlpuopuiu != i13) {
                this.f23176zdlpuopuiu.cancel();
            }
            gtknphoqwx(true, i13, i14);
        }

        boolean wkgbmnqykc() {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(eablkybsjg eablkybsjgVar);

        void ppxfxbqfkf(eablkybsjg eablkybsjgVar);

        void zoijcleaow(eablkybsjg eablkybsjgVar);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, da.zoijcleaow.tabStyle);
    }

    private void agtfadlqog(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        draadjrbmk((TabItem) view);
    }

    private void cqumvgiudr(eablkybsjg eablkybsjgVar) {
        for (int size = this.f23143xrmfcynszj.size() - 1; size >= 0; size--) {
            ((zoijcleaow) this.f23143xrmfcynszj.get(size)).ppxfxbqfkf(eablkybsjgVar);
        }
    }

    private void draadjrbmk(TabItem tabItem) {
        eablkybsjg eablkybsjgVarYadqdtsiqt = yadqdtsiqt();
        CharSequence charSequence = tabItem.f23103zdlpuopuiu;
        if (charSequence != null) {
            eablkybsjgVarYadqdtsiqt.oxmwwwfdhm(charSequence);
        }
        Drawable drawable = tabItem.f23102yggfygwlhe;
        if (drawable != null) {
            eablkybsjgVarYadqdtsiqt.rgvfuqvkyq(drawable);
        }
        int i13 = tabItem.f23101jyumaefscl;
        if (i13 != 0) {
            eablkybsjgVarYadqdtsiqt.agtfadlqog(i13);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            eablkybsjgVarYadqdtsiqt.wflxmlrfwp(tabItem.getContentDescription());
        }
        dxjokdxxww(eablkybsjgVarYadqdtsiqt);
    }

    private void esjtqupxsv(eablkybsjg eablkybsjgVar) {
        for (int size = this.f23143xrmfcynszj.size() - 1; size >= 0; size--) {
            ((zoijcleaow) this.f23143xrmfcynszj.get(size)).iobyxmoadg(eablkybsjgVar);
        }
    }

    private int getDefaultHeight() {
        int size = this.f23146yggfygwlhe.size();
        for (int i13 = 0; i13 < size; i13++) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) this.f23146yggfygwlhe.get(i13);
            if (eablkybsjgVar != null && eablkybsjgVar.gxszxtbevo() != null && !TextUtils.isEmpty(eablkybsjgVar.dxjokdxxww())) {
                if (!this.f23109crxdokpmqz) {
                    return 72;
                }
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i13 = this.f23142wypolnanlu;
        if (i13 != -1) {
            return i13;
        }
        int i14 = this.f23135sopmlzcsov;
        if (i14 == 0 || i14 == 2) {
            return this.f23124kegysxyocb;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f23118iwizpuwonk.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void hcddaimhww(int i13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) this.f23118iwizpuwonk.getChildAt(i13);
        this.f23118iwizpuwonk.removeViewAt(i13);
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.ojitshcjhn();
            this.f23145yfnezrywwk.iobyxmoadg(gxszxtbevoVar);
        }
        requestLayout();
    }

    private boolean istkbnxepw() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private gxszxtbevo iwizpuwonk(eablkybsjg eablkybsjgVar) {
        u1.eablkybsjg eablkybsjgVar2 = this.f23145yfnezrywwk;
        gxszxtbevo gxszxtbevoVar = eablkybsjgVar2 != null ? (gxszxtbevo) eablkybsjgVar2.zoijcleaow() : null;
        if (gxszxtbevoVar == null) {
            gxszxtbevoVar = new gxszxtbevo(getContext());
        }
        gxszxtbevoVar.setTab(eablkybsjgVar);
        gxszxtbevoVar.setFocusable(true);
        gxszxtbevoVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(eablkybsjgVar.f23158wkgbmnqykc)) {
            gxszxtbevoVar.setContentDescription(eablkybsjgVar.f23157ppxfxbqfkf);
        } else {
            gxszxtbevoVar.setContentDescription(eablkybsjgVar.f23158wkgbmnqykc);
        }
        return gxszxtbevoVar;
    }

    private void kcexrzcfyt(eablkybsjg eablkybsjgVar, int i13) {
        eablkybsjgVar.vdvldrhtss(i13);
        this.f23146yggfygwlhe.add(i13, eablkybsjgVar);
        int size = this.f23146yggfygwlhe.size();
        int i14 = -1;
        for (int i15 = i13 + 1; i15 < size; i15++) {
            if (((eablkybsjg) this.f23146yggfygwlhe.get(i15)).lqeggnwhkg() == this.f23148zdlpuopuiu) {
                i14 = i15;
            }
            ((eablkybsjg) this.f23146yggfygwlhe.get(i15)).vdvldrhtss(i15);
        }
        this.f23148zdlpuopuiu = i14;
    }

    private void lereixgezr(eablkybsjg eablkybsjgVar) {
        for (int size = this.f23143xrmfcynszj.size() - 1; size >= 0; size--) {
            ((zoijcleaow) this.f23143xrmfcynszj.get(size)).zoijcleaow(eablkybsjgVar);
        }
    }

    private void mbcevpiqjq(ViewPager viewPager, boolean z13, boolean z14) {
        zoijcleaow zoijcleaowVar = this.f23128metgxyhuhe;
        if (zoijcleaowVar != null) {
            ylkuphrtab(zoijcleaowVar);
            this.f23128metgxyhuhe = null;
        }
        cllcsxoeiz(null, false);
        this.f23110czzsidtyhn = z14;
    }

    private void ntlheqmsrt() {
        int size = this.f23146yggfygwlhe.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((eablkybsjg) this.f23146yggfygwlhe.get(i13)).kcexrzcfyt();
        }
    }

    private void ojitshcjhn(int i13) {
        if (i13 == -1) {
            return;
        }
        if (getWindowToken() == null || !jhduphickx.tzroggbefp(this) || this.f23118iwizpuwonk.wkgbmnqykc()) {
            dsvhmnatus(i13, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iOxmwwwfdhm = oxmwwwfdhm(i13, 0.0f);
        if (scrollX != iOxmwwwfdhm) {
            pmvmpeiblj();
            this.f23134rlfsiqarku.setIntValues(scrollX, iOxmwwwfdhm);
            this.f23134rlfsiqarku.start();
        }
        this.f23118iwizpuwonk.ppxfxbqfkf(i13, this.f23129ntlheqmsrt);
    }

    private int oxmwwwfdhm(int i13, float f13) {
        View childAt;
        int i14 = this.f23135sopmlzcsov;
        if ((i14 != 0 && i14 != 2) || (childAt = this.f23118iwizpuwonk.getChildAt(i13)) == null) {
            return 0;
        }
        int i15 = i13 + 1;
        View childAt2 = i15 < this.f23118iwizpuwonk.getChildCount() ? this.f23118iwizpuwonk.getChildAt(i15) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i16 = (int) ((width + width2) * 0.5f * f13);
        return jhduphickx.lereixgezr(this) == 0 ? left + i16 : left - i16;
    }

    private void pmvmpeiblj() {
        if (this.f23134rlfsiqarku == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f23134rlfsiqarku = valueAnimator;
            valueAnimator.setInterpolator(this.f23130okpsazkaxt);
            this.f23134rlfsiqarku.setDuration(this.f23129ntlheqmsrt);
            this.f23134rlfsiqarku.addUpdateListener(new iobyxmoadg());
        }
    }

    private void rgvfuqvkyq(int i13) {
        if (i13 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i13 == 1) {
            this.f23118iwizpuwonk.setGravity(1);
            return;
        } else if (i13 != 2) {
            return;
        }
        this.f23118iwizpuwonk.setGravity(8388611);
    }

    private void setSelectedTabView(int i13) {
        int childCount = this.f23118iwizpuwonk.getChildCount();
        if (i13 < childCount) {
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = this.f23118iwizpuwonk.getChildAt(i14);
                if ((i14 != i13 || childAt.isSelected()) && (i14 == i13 || !childAt.isSelected())) {
                    childAt.setSelected(i14 == i13);
                    childAt.setActivated(i14 == i13);
                } else {
                    childAt.setSelected(i14 == i13);
                    childAt.setActivated(i14 == i13);
                    if (childAt instanceof gxszxtbevo) {
                        ((gxszxtbevo) childAt).iwizpuwonk();
                    }
                }
                i14++;
            }
        }
    }

    private void ulzqkzuiru(LinearLayout.LayoutParams layoutParams) {
        if (this.f23135sopmlzcsov == 1 && this.f23127mbcevpiqjq == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private void vdvldrhtss() {
        int i13 = this.f23135sopmlzcsov;
        jhduphickx.lxfrhoxuzk(this.f23118iwizpuwonk, (i13 == 0 || i13 == 2) ? Math.max(0, this.f23137tzroggbefp - this.f23108cqumvgiudr) : 0, 0, 0, 0);
        int i14 = this.f23135sopmlzcsov;
        if (i14 == 0) {
            rgvfuqvkyq(this.f23127mbcevpiqjq);
        } else if (i14 == 1 || i14 == 2) {
            if (this.f23127mbcevpiqjq == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f23118iwizpuwonk.setGravity(1);
        }
        sopmlzcsov(true);
    }

    private void wflxmlrfwp(eablkybsjg eablkybsjgVar) {
        gxszxtbevo gxszxtbevoVar = eablkybsjgVar.f23151dxjokdxxww;
        gxszxtbevoVar.setSelected(false);
        gxszxtbevoVar.setActivated(false);
        this.f23118iwizpuwonk.addView(gxszxtbevoVar, eablkybsjgVar.lqeggnwhkg(), yggfygwlhe());
    }

    private LinearLayout.LayoutParams yggfygwlhe() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        ulzqkzuiru(layoutParams);
        return layoutParams;
    }

    private static ColorStateList zdlpuopuiu(int i13, int i14) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i14, i13});
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        agtfadlqog(view);
    }

    public void btonecajqb(eablkybsjg eablkybsjgVar, int i13, boolean z13) {
        if (eablkybsjgVar.f23156nufgyqmvbu != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        kcexrzcfyt(eablkybsjgVar, i13);
        wflxmlrfwp(eablkybsjgVar);
        if (z13) {
            eablkybsjgVar.draadjrbmk();
        }
    }

    public boolean cdpycssgdh() {
        return this.f23120jlmebxxoox;
    }

    void cllcsxoeiz(b6.iobyxmoadg iobyxmoadgVar, boolean z13) {
        iozdgvuglv();
    }

    void crxdokpmqz(int i13) {
        this.f23139uwvvkdfqfp = i13;
    }

    public void dsvhmnatus(int i13, float f13, boolean z13) {
        wypolnanlu(i13, f13, z13, true);
    }

    public void dxjokdxxww(eablkybsjg eablkybsjgVar) {
        gtknphoqwx(eablkybsjgVar, this.f23146yggfygwlhe.isEmpty());
    }

    public int getSelectedTabPosition() {
        eablkybsjg eablkybsjgVar = this.f23122jyumaefscl;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar.lqeggnwhkg();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f23146yggfygwlhe.size();
    }

    public int getTabGravity() {
        return this.f23127mbcevpiqjq;
    }

    public ColorStateList getTabIconTint() {
        return this.f23116iozdgvuglv;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f23140vipkmwdibw;
    }

    public int getTabIndicatorGravity() {
        return this.f23138ulzqkzuiru;
    }

    int getTabMaxWidth() {
        return this.f23111dsvhmnatus;
    }

    public int getTabMode() {
        return this.f23135sopmlzcsov;
    }

    public ColorStateList getTabRippleColor() {
        return this.f23126lmojexxdyd;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f23141wwaezpbzkn;
    }

    public ColorStateList getTabTextColors() {
        return this.f23144yadqdtsiqt;
    }

    public void gtknphoqwx(eablkybsjg eablkybsjgVar, boolean z13) {
        btonecajqb(eablkybsjgVar, this.f23146yggfygwlhe.size(), z13);
    }

    public void hkdspvbjdz(eablkybsjg eablkybsjgVar, boolean z13) {
        eablkybsjg eablkybsjgVar2 = this.f23122jyumaefscl;
        if (eablkybsjgVar2 == eablkybsjgVar) {
            if (eablkybsjgVar2 != null) {
                cqumvgiudr(eablkybsjgVar);
                ojitshcjhn(eablkybsjgVar.lqeggnwhkg());
                return;
            }
            return;
        }
        int iLqeggnwhkg = eablkybsjgVar != null ? eablkybsjgVar.lqeggnwhkg() : -1;
        if (z13) {
            if ((eablkybsjgVar2 == null || eablkybsjgVar2.lqeggnwhkg() == -1) && iLqeggnwhkg != -1) {
                dsvhmnatus(iLqeggnwhkg, 0.0f, true);
            } else {
                ojitshcjhn(iLqeggnwhkg);
            }
            if (iLqeggnwhkg != -1) {
                setSelectedTabView(iLqeggnwhkg);
            }
        }
        this.f23122jyumaefscl = eablkybsjgVar;
        if (eablkybsjgVar2 != null && eablkybsjgVar2.f23156nufgyqmvbu != null) {
            lereixgezr(eablkybsjgVar2);
        }
        if (eablkybsjgVar != null) {
            esjtqupxsv(eablkybsjgVar);
        }
    }

    void iozdgvuglv() {
        wwaezpbzkn();
    }

    public void jpowsppfya(eablkybsjg eablkybsjgVar) {
        hkdspvbjdz(eablkybsjgVar, true);
    }

    protected eablkybsjg jyumaefscl() {
        eablkybsjg eablkybsjgVar = (eablkybsjg) f23104sflfametgt.zoijcleaow();
        return eablkybsjgVar == null ? new eablkybsjg() : eablkybsjgVar;
    }

    public void kegysxyocb(int i13, int i14) {
        setTabTextColors(zdlpuopuiu(i13, i14));
    }

    protected boolean lmojexxdyd(eablkybsjg eablkybsjgVar) {
        return f23104sflfametgt.iobyxmoadg(eablkybsjgVar);
    }

    public void lqeggnwhkg(zoijcleaow zoijcleaowVar) {
        if (this.f23143xrmfcynszj.contains(zoijcleaowVar)) {
            return;
        }
        this.f23143xrmfcynszj.add(zoijcleaowVar);
    }

    public void nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar) {
        lqeggnwhkg(ppxfxbqfkfVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ra.nufgyqmvbu.eablkybsjg(this);
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f23110czzsidtyhn) {
            setupWithViewPager(null);
            this.f23110czzsidtyhn = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i13 = 0; i13 < this.f23118iwizpuwonk.getChildCount(); i13++) {
            View childAt = this.f23118iwizpuwonk.getChildAt(i13);
            if (childAt instanceof gxszxtbevo) {
                ((gxszxtbevo) childAt).btonecajqb(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        zdlpuopuiu.g(accessibilityNodeInfo).ydmasvzmpa(zdlpuopuiu.eablkybsjg.iobyxmoadg(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return istkbnxepw() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        int iRound = Math.round(ojitshcjhn.ppxfxbqfkf(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i14);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i14 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i14) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i13);
        if (View.MeasureSpec.getMode(i13) != 0) {
            int iPpxfxbqfkf = this.f23136stevsuqkhv;
            if (iPpxfxbqfkf <= 0) {
                iPpxfxbqfkf = (int) (size - ojitshcjhn.ppxfxbqfkf(getContext(), 56));
            }
            this.f23111dsvhmnatus = iPpxfxbqfkf;
        }
        super.onMeasure(i13, i14);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i15 = this.f23135sopmlzcsov;
            if (i15 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i15 != 1) {
                if (i15 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i14, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || istkbnxepw()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void pkzmftpjix(ppxfxbqfkf ppxfxbqfkfVar) {
        ylkuphrtab(ppxfxbqfkfVar);
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        ra.nufgyqmvbu.wkgbmnqykc(this, f13);
    }

    public void setInlineLabel(boolean z13) {
        if (this.f23109crxdokpmqz != z13) {
            this.f23109crxdokpmqz = z13;
            for (int i13 = 0; i13 < this.f23118iwizpuwonk.getChildCount(); i13++) {
                View childAt = this.f23118iwizpuwonk.getChildAt(i13);
                if (childAt instanceof gxszxtbevo) {
                    ((gxszxtbevo) childAt).jyumaefscl();
                }
            }
            vdvldrhtss();
        }
    }

    public void setInlineLabelResource(int i13) {
        setInlineLabel(getResources().getBoolean(i13));
    }

    @Deprecated
    public void setOnTabSelectedListener(ppxfxbqfkf ppxfxbqfkfVar) {
        setOnTabSelectedListener((zoijcleaow) ppxfxbqfkfVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        pmvmpeiblj();
        this.f23134rlfsiqarku.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
        this.f23141wwaezpbzkn = drawableMutate;
        com.google.android.material.drawable.wkgbmnqykc.gtknphoqwx(drawableMutate, this.f23147ylkuphrtab);
        int intrinsicHeight = this.f23133ribwqtqdhb;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f23141wwaezpbzkn.getIntrinsicHeight();
        }
        this.f23118iwizpuwonk.dxjokdxxww(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i13) {
        this.f23147ylkuphrtab = i13;
        com.google.android.material.drawable.wkgbmnqykc.gtknphoqwx(this.f23141wwaezpbzkn, i13);
        sopmlzcsov(false);
    }

    public void setSelectedTabIndicatorGravity(int i13) {
        if (this.f23138ulzqkzuiru != i13) {
            this.f23138ulzqkzuiru = i13;
            jhduphickx.xrmfcynszj(this.f23118iwizpuwonk);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i13) {
        this.f23133ribwqtqdhb = i13;
        this.f23118iwizpuwonk.dxjokdxxww(i13);
    }

    public void setTabGravity(int i13) {
        if (this.f23127mbcevpiqjq != i13) {
            this.f23127mbcevpiqjq = i13;
            vdvldrhtss();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f23116iozdgvuglv != colorStateList) {
            this.f23116iozdgvuglv = colorStateList;
            ntlheqmsrt();
        }
    }

    public void setTabIconTintResource(int i13) {
        setTabIconTint(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), i13));
    }

    public void setTabIndicatorAnimationMode(int i13) {
        this.f23140vipkmwdibw = i13;
        if (i13 == 0) {
            this.f23115ikoacuggdj = new com.google.android.material.tabs.ppxfxbqfkf();
            return;
        }
        if (i13 == 1) {
            this.f23115ikoacuggdj = new com.google.android.material.tabs.iobyxmoadg();
        } else {
            if (i13 == 2) {
                this.f23115ikoacuggdj = new com.google.android.material.tabs.zoijcleaow();
                return;
            }
            throw new IllegalArgumentException(i13 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z13) {
        this.f23120jlmebxxoox = z13;
        this.f23118iwizpuwonk.lqeggnwhkg();
        jhduphickx.xrmfcynszj(this.f23118iwizpuwonk);
    }

    public void setTabMode(int i13) {
        if (i13 != this.f23135sopmlzcsov) {
            this.f23135sopmlzcsov = i13;
            vdvldrhtss();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f23126lmojexxdyd != colorStateList) {
            this.f23126lmojexxdyd = colorStateList;
            for (int i13 = 0; i13 < this.f23118iwizpuwonk.getChildCount(); i13++) {
                View childAt = this.f23118iwizpuwonk.getChildAt(i13);
                if (childAt instanceof gxszxtbevo) {
                    ((gxszxtbevo) childAt).yggfygwlhe(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i13) {
        setTabRippleColor(nufgyqmvbu.iobyxmoadg.iobyxmoadg(getContext(), i13));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f23144yadqdtsiqt != colorStateList) {
            this.f23144yadqdtsiqt = colorStateList;
            ntlheqmsrt();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(b6.iobyxmoadg iobyxmoadgVar) {
        cllcsxoeiz(iobyxmoadgVar, false);
    }

    public void setUnboundedRipple(boolean z13) {
        if (this.f23119jhduphickx != z13) {
            this.f23119jhduphickx = z13;
            for (int i13 = 0; i13 < this.f23118iwizpuwonk.getChildCount(); i13++) {
                View childAt = this.f23118iwizpuwonk.getChildAt(i13);
                if (childAt instanceof gxszxtbevo) {
                    ((gxszxtbevo) childAt).yggfygwlhe(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i13) {
        setUnboundedRipple(getResources().getBoolean(i13));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        tzroggbefp(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    void sopmlzcsov(boolean z13) {
        for (int i13 = 0; i13 < this.f23118iwizpuwonk.getChildCount(); i13++) {
            View childAt = this.f23118iwizpuwonk.getChildAt(i13);
            childAt.setMinimumWidth(getTabMinWidth());
            ulzqkzuiru((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z13) {
                childAt.requestLayout();
            }
        }
    }

    void stevsuqkhv(int i13, float f13, boolean z13, boolean z14, boolean z15) {
        int iRound = Math.round(i13 + f13);
        if (iRound < 0 || iRound >= this.f23118iwizpuwonk.getChildCount()) {
            return;
        }
        if (z14) {
            this.f23118iwizpuwonk.nufgyqmvbu(i13, f13);
        }
        ValueAnimator valueAnimator = this.f23134rlfsiqarku;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f23134rlfsiqarku.cancel();
        }
        int iOxmwwwfdhm = oxmwwwfdhm(i13, f13);
        int scrollX = getScrollX();
        boolean z16 = (i13 < getSelectedTabPosition() && iOxmwwwfdhm >= scrollX) || (i13 > getSelectedTabPosition() && iOxmwwwfdhm <= scrollX) || i13 == getSelectedTabPosition();
        if (jhduphickx.lereixgezr(this) == 1) {
            z16 = (i13 < getSelectedTabPosition() && iOxmwwwfdhm <= scrollX) || (i13 > getSelectedTabPosition() && iOxmwwwfdhm >= scrollX) || i13 == getSelectedTabPosition();
        }
        if (z16 || this.f23139uwvvkdfqfp == 1 || z15) {
            if (i13 < 0) {
                iOxmwwwfdhm = 0;
            }
            scrollTo(iOxmwwwfdhm, 0);
        }
        if (z13) {
            setSelectedTabView(iRound);
        }
    }

    public void tzroggbefp(ViewPager viewPager, boolean z13) {
        mbcevpiqjq(viewPager, z13, false);
    }

    public void wwaezpbzkn() {
        for (int childCount = this.f23118iwizpuwonk.getChildCount() - 1; childCount >= 0; childCount--) {
            hcddaimhww(childCount);
        }
        Iterator it = this.f23146yggfygwlhe.iterator();
        while (it.hasNext()) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) it.next();
            it.remove();
            eablkybsjgVar.gtknphoqwx();
            lmojexxdyd(eablkybsjgVar);
        }
        this.f23122jyumaefscl = null;
    }

    public void wypolnanlu(int i13, float f13, boolean z13, boolean z14) {
        stevsuqkhv(i13, f13, z13, z14, true);
    }

    public eablkybsjg yadqdtsiqt() {
        eablkybsjg eablkybsjgVarJyumaefscl = jyumaefscl();
        eablkybsjgVarJyumaefscl.f23156nufgyqmvbu = this;
        eablkybsjgVarJyumaefscl.f23151dxjokdxxww = iwizpuwonk(eablkybsjgVarJyumaefscl);
        if (eablkybsjgVarJyumaefscl.f23150btonecajqb != -1) {
            eablkybsjgVarJyumaefscl.f23151dxjokdxxww.setId(eablkybsjgVarJyumaefscl.f23150btonecajqb);
        }
        return eablkybsjgVarJyumaefscl;
    }

    public void ylkuphrtab(zoijcleaow zoijcleaowVar) {
        this.f23143xrmfcynszj.remove(zoijcleaowVar);
    }

    public eablkybsjg zynmafqrjb(int i13) {
        if (i13 < 0 || i13 >= getTabCount()) {
            return null;
        }
        return (eablkybsjg) this.f23146yggfygwlhe.get(i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i13) {
        int i14 = f23105ydmasvzmpa;
        super(ta.iobyxmoadg.ppxfxbqfkf(context, attributeSet, i13, i14), attributeSet, i13);
        this.f23148zdlpuopuiu = -1;
        this.f23146yggfygwlhe = new ArrayList();
        this.f23106cdpycssgdh = -1;
        this.f23147ylkuphrtab = 0;
        this.f23111dsvhmnatus = Integer.MAX_VALUE;
        this.f23133ribwqtqdhb = -1;
        this.f23143xrmfcynszj = new ArrayList();
        this.f23145yfnezrywwk = new u1.gxszxtbevo(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(context2);
        this.f23118iwizpuwonk = wkgbmnqykcVar;
        super.addView(wkgbmnqykcVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayDxjokdxxww = draadjrbmk.dxjokdxxww(context2, attributeSet, da.draadjrbmk.TabLayout, i13, i14, da.draadjrbmk.TabLayout_tabTextAppearance);
        ColorStateList colorStateListGxszxtbevo = com.google.android.material.drawable.wkgbmnqykc.gxszxtbevo(getBackground());
        if (colorStateListGxszxtbevo != null) {
            ra.lqeggnwhkg lqeggnwhkgVar = new ra.lqeggnwhkg();
            lqeggnwhkgVar.crxdokpmqz(colorStateListGxszxtbevo);
            lqeggnwhkgVar.hkdspvbjdz(context2);
            lqeggnwhkgVar.sopmlzcsov(jhduphickx.yggfygwlhe(this));
            jhduphickx.weqkydbzbr(this, lqeggnwhkgVar);
        }
        setSelectedTabIndicator(oa.ppxfxbqfkf.wkgbmnqykc(context2, typedArrayDxjokdxxww, da.draadjrbmk.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayDxjokdxxww.getColor(da.draadjrbmk.TabLayout_tabIndicatorColor, 0));
        wkgbmnqykcVar.dxjokdxxww(typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayDxjokdxxww.getInt(da.draadjrbmk.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayDxjokdxxww.getInt(da.draadjrbmk.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabPadding, 0);
        this.f23132pmvmpeiblj = dimensionPixelSize;
        this.f23125lereixgezr = dimensionPixelSize;
        this.f23112esjtqupxsv = dimensionPixelSize;
        this.f23108cqumvgiudr = dimensionPixelSize;
        this.f23108cqumvgiudr = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f23112esjtqupxsv = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabPaddingTop, this.f23112esjtqupxsv);
        this.f23125lereixgezr = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabPaddingEnd, this.f23125lereixgezr);
        this.f23132pmvmpeiblj = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabPaddingBottom, this.f23132pmvmpeiblj);
        if (draadjrbmk.lqeggnwhkg(context2)) {
            this.f23149zynmafqrjb = da.zoijcleaow.textAppearanceTitleSmall;
        } else {
            this.f23149zynmafqrjb = da.zoijcleaow.textAppearanceButton;
        }
        int resourceId = typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.TabLayout_tabTextAppearance, gtknphoqwx.TextAppearance_Design_Tab);
        this.f23117istkbnxepw = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, lqeggnwhkg.btonecajqb.TextAppearance);
        try {
            this.f23113hcddaimhww = typedArrayObtainStyledAttributes.getDimensionPixelSize(lqeggnwhkg.btonecajqb.TextAppearance_android_textSize, 0);
            this.f23144yadqdtsiqt = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayObtainStyledAttributes, lqeggnwhkg.btonecajqb.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.TabLayout_tabSelectedTextAppearance)) {
                this.f23106cdpycssgdh = typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i15 = this.f23106cdpycssgdh;
            if (i15 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i15, lqeggnwhkg.btonecajqb.TextAppearance);
                try {
                    this.f23121jpowsppfya = typedArrayObtainStyledAttributes2.getDimensionPixelSize(lqeggnwhkg.btonecajqb.TextAppearance_android_textSize, (int) this.f23113hcddaimhww);
                    ColorStateList colorStateListIobyxmoadg = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayObtainStyledAttributes2, lqeggnwhkg.btonecajqb.TextAppearance_android_textColor);
                    if (colorStateListIobyxmoadg != null) {
                        this.f23144yadqdtsiqt = zdlpuopuiu(this.f23144yadqdtsiqt.getDefaultColor(), colorStateListIobyxmoadg.getColorForState(new int[]{R.attr.state_selected}, colorStateListIobyxmoadg.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
            if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.TabLayout_tabTextColor)) {
                this.f23144yadqdtsiqt = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.TabLayout_tabTextColor);
            }
            if (typedArrayDxjokdxxww.hasValue(da.draadjrbmk.TabLayout_tabSelectedTextColor)) {
                this.f23144yadqdtsiqt = zdlpuopuiu(this.f23144yadqdtsiqt.getDefaultColor(), typedArrayDxjokdxxww.getColor(da.draadjrbmk.TabLayout_tabSelectedTextColor, 0));
            }
            this.f23116iozdgvuglv = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.TabLayout_tabIconTint);
            this.f23131pkzmftpjix = ojitshcjhn.btonecajqb(typedArrayDxjokdxxww.getInt(da.draadjrbmk.TabLayout_tabIconTintMode, -1), null);
            this.f23126lmojexxdyd = oa.ppxfxbqfkf.iobyxmoadg(context2, typedArrayDxjokdxxww, da.draadjrbmk.TabLayout_tabRippleColor);
            this.f23129ntlheqmsrt = typedArrayDxjokdxxww.getInt(da.draadjrbmk.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f23130okpsazkaxt = na.nufgyqmvbu.lqeggnwhkg(context2, da.zoijcleaow.motionEasingEmphasizedInterpolator, ea.iobyxmoadg.f31023zoijcleaow);
            this.f23142wypolnanlu = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabMinWidth, -1);
            this.f23136stevsuqkhv = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabMaxWidth, -1);
            this.f23107cllcsxoeiz = typedArrayDxjokdxxww.getResourceId(da.draadjrbmk.TabLayout_tabBackground, 0);
            this.f23137tzroggbefp = typedArrayDxjokdxxww.getDimensionPixelSize(da.draadjrbmk.TabLayout_tabContentStart, 0);
            this.f23135sopmlzcsov = typedArrayDxjokdxxww.getInt(da.draadjrbmk.TabLayout_tabMode, 1);
            this.f23127mbcevpiqjq = typedArrayDxjokdxxww.getInt(da.draadjrbmk.TabLayout_tabGravity, 0);
            this.f23109crxdokpmqz = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.TabLayout_tabInlineLabel, false);
            this.f23119jhduphickx = typedArrayDxjokdxxww.getBoolean(da.draadjrbmk.TabLayout_tabUnboundedRipple, false);
            typedArrayDxjokdxxww.recycle();
            Resources resources = getResources();
            this.f23114hkdspvbjdz = resources.getDimensionPixelSize(da.wkgbmnqykc.design_tab_text_size_2line);
            this.f23124kegysxyocb = resources.getDimensionPixelSize(da.wkgbmnqykc.design_tab_scrollable_min_width);
            vdvldrhtss();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i13) {
        agtfadlqog(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(zoijcleaow zoijcleaowVar) {
        zoijcleaow zoijcleaowVar2 = this.f23123jztzpxfvev;
        if (zoijcleaowVar2 != null) {
            ylkuphrtab(zoijcleaowVar2);
        }
        this.f23123jztzpxfvev = zoijcleaowVar;
        if (zoijcleaowVar != null) {
            lqeggnwhkg(zoijcleaowVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        agtfadlqog(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        agtfadlqog(view);
    }

    public void setSelectedTabIndicator(int i13) {
        if (i13 != 0) {
            setSelectedTabIndicator(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
