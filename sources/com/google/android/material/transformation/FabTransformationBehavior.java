package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ea.gxszxtbevo;
import ea.lqeggnwhkg;
import ea.nufgyqmvbu;
import ea.ppxfxbqfkf;
import java.util.ArrayList;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final RectF f23559cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int[] f23560esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final RectF f23561iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Rect f23562jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private float f23563lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private float f23564pmvmpeiblj;

    class iobyxmoadg extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ boolean f23565iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ View f23566ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ View f23568zoijcleaow;

        iobyxmoadg(boolean z13, View view, View view2) {
            this.f23565iobyxmoadg = z13;
            this.f23568zoijcleaow = view;
            this.f23566ppxfxbqfkf = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f23565iobyxmoadg) {
                return;
            }
            this.f23568zoijcleaow.setVisibility(4);
            this.f23566ppxfxbqfkf.setAlpha(1.0f);
            this.f23566ppxfxbqfkf.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f23565iobyxmoadg) {
                this.f23568zoijcleaow.setVisibility(0);
                this.f23566ppxfxbqfkf.setAlpha(0.0f);
                this.f23566ppxfxbqfkf.setVisibility(4);
            }
        }
    }

    protected static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public gxszxtbevo f23569iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public nufgyqmvbu f23570zoijcleaow;

        protected zoijcleaow() {
        }
    }

    public FabTransformationBehavior() {
        this.f23562jyumaefscl = new Rect();
        this.f23561iwizpuwonk = new RectF();
        this.f23559cqumvgiudr = new RectF();
        this.f23560esjtqupxsv = new int[2];
    }

    private void crxdokpmqz(View view, View view2, boolean z13, boolean z14, zoijcleaow zoijcleaowVar, List list, List list2) {
    }

    private ViewGroup dsvhmnatus(View view) {
        View viewFindViewById = view.findViewById(da.gxszxtbevo.mtrl_child_content_container);
        return viewFindViewById != null ? jztzpxfvev(viewFindViewById) : jztzpxfvev(view);
    }

    private void ikoacuggdj(View view, View view2, boolean z13, boolean z14, zoijcleaow zoijcleaowVar, List list, List list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fTzroggbefp = tzroggbefp(view, view2, zoijcleaowVar.f23570zoijcleaow);
        float fMbcevpiqjq = mbcevpiqjq(view, view2, zoijcleaowVar.f23570zoijcleaow);
        Pair pairKegysxyocb = kegysxyocb(fTzroggbefp, fMbcevpiqjq, z13, zoijcleaowVar);
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) pairKegysxyocb.first;
        lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) pairKegysxyocb.second;
        if (z13) {
            if (!z14) {
                view2.setTranslationX(-fTzroggbefp);
                view2.setTranslationY(-fMbcevpiqjq);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            wypolnanlu(view2, zoijcleaowVar, lqeggnwhkgVar, lqeggnwhkgVar2, -fTzroggbefp, -fMbcevpiqjq, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fTzroggbefp);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fMbcevpiqjq);
        }
        lqeggnwhkgVar.iobyxmoadg(objectAnimatorOfFloat);
        lqeggnwhkgVar2.iobyxmoadg(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void jhduphickx(View view, View view2, boolean z13, boolean z14, zoijcleaow zoijcleaowVar, List list, List list2) {
    }

    private void jlmebxxoox(View view, View view2, boolean z13, zoijcleaow zoijcleaowVar, List list) {
        float fTzroggbefp = tzroggbefp(view, view2, zoijcleaowVar.f23570zoijcleaow);
        float fMbcevpiqjq = mbcevpiqjq(view, view2, zoijcleaowVar.f23570zoijcleaow);
        Pair pairKegysxyocb = kegysxyocb(fTzroggbefp, fMbcevpiqjq, z13, zoijcleaowVar);
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) pairKegysxyocb.first;
        lqeggnwhkg lqeggnwhkgVar2 = (lqeggnwhkg) pairKegysxyocb.second;
        Property property = View.TRANSLATION_X;
        if (!z13) {
            fTzroggbefp = this.f23563lereixgezr;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fTzroggbefp);
        Property property2 = View.TRANSLATION_Y;
        if (!z13) {
            fMbcevpiqjq = this.f23564pmvmpeiblj;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fMbcevpiqjq);
        lqeggnwhkgVar.iobyxmoadg(objectAnimatorOfFloat);
        lqeggnwhkgVar2.iobyxmoadg(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private ViewGroup jztzpxfvev(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    private Pair kegysxyocb(float f13, float f14, boolean z13, zoijcleaow zoijcleaowVar) {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg;
        lqeggnwhkg lqeggnwhkgVarEablkybsjg2;
        if (f13 == 0.0f || f14 == 0.0f) {
            lqeggnwhkgVarEablkybsjg = zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("translationXLinear");
            lqeggnwhkgVarEablkybsjg2 = zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("translationYLinear");
        } else if ((!z13 || f14 >= 0.0f) && (z13 || f14 <= 0.0f)) {
            lqeggnwhkgVarEablkybsjg = zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("translationXCurveDownwards");
            lqeggnwhkgVarEablkybsjg2 = zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("translationYCurveDownwards");
        } else {
            lqeggnwhkgVarEablkybsjg = zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("translationXCurveUpwards");
            lqeggnwhkgVarEablkybsjg2 = zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("translationYCurveUpwards");
        }
        return new Pair(lqeggnwhkgVarEablkybsjg, lqeggnwhkgVarEablkybsjg2);
    }

    private float mbcevpiqjq(View view, View view2, nufgyqmvbu nufgyqmvbuVar) {
        float fCenterY;
        float fCenterY2;
        float f13;
        RectF rectF = this.f23561iwizpuwonk;
        RectF rectF2 = this.f23559cqumvgiudr;
        stevsuqkhv(view, rectF);
        ulzqkzuiru(view2, rectF2);
        int i13 = nufgyqmvbuVar.f31029iobyxmoadg & 112;
        if (i13 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else {
            if (i13 != 48) {
                if (i13 != 80) {
                    f13 = 0.0f;
                } else {
                    fCenterY = rectF2.bottom;
                    fCenterY2 = rectF.bottom;
                }
                return f13 + nufgyqmvbuVar.f31030ppxfxbqfkf;
            }
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        }
        f13 = fCenterY - fCenterY2;
        return f13 + nufgyqmvbuVar.f31030ppxfxbqfkf;
    }

    private float ntlheqmsrt(zoijcleaow zoijcleaowVar, lqeggnwhkg lqeggnwhkgVar, float f13, float f14) {
        long jPpxfxbqfkf = lqeggnwhkgVar.ppxfxbqfkf();
        long jWkgbmnqykc = lqeggnwhkgVar.wkgbmnqykc();
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("expansion");
        return ea.iobyxmoadg.iobyxmoadg(f13, f14, lqeggnwhkgVar.eablkybsjg().getInterpolation((((lqeggnwhkgVarEablkybsjg.ppxfxbqfkf() + lqeggnwhkgVarEablkybsjg.wkgbmnqykc()) + 17) - jPpxfxbqfkf) / jWkgbmnqykc));
    }

    private void ribwqtqdhb(View view, View view2, boolean z13, boolean z14, zoijcleaow zoijcleaowVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fYggfygwlhe = jhduphickx.yggfygwlhe(view2) - jhduphickx.yggfygwlhe(view);
        if (z13) {
            if (!z14) {
                view2.setTranslationZ(-fYggfygwlhe);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fYggfygwlhe);
        }
        zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("elevation").iobyxmoadg(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private void sopmlzcsov(View view, View view2, boolean z13, boolean z14, zoijcleaow zoijcleaowVar, List list, List list2) {
        ViewGroup viewGroupDsvhmnatus;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupDsvhmnatus = dsvhmnatus(view2)) != null) {
            if (z13) {
                if (!z14) {
                    ppxfxbqfkf.f31032iobyxmoadg.set(viewGroupDsvhmnatus, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupDsvhmnatus, (Property<ViewGroup, Float>) ppxfxbqfkf.f31032iobyxmoadg, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupDsvhmnatus, (Property<ViewGroup, Float>) ppxfxbqfkf.f31032iobyxmoadg, 0.0f);
            }
            zoijcleaowVar.f23569iobyxmoadg.eablkybsjg("contentFade").iobyxmoadg(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    private void stevsuqkhv(View view, RectF rectF) {
        ulzqkzuiru(view, rectF);
        rectF.offset(this.f23563lereixgezr, this.f23564pmvmpeiblj);
    }

    private float tzroggbefp(View view, View view2, nufgyqmvbu nufgyqmvbuVar) {
        float fCenterX;
        float fCenterX2;
        float f13;
        RectF rectF = this.f23561iwizpuwonk;
        RectF rectF2 = this.f23559cqumvgiudr;
        stevsuqkhv(view, rectF);
        ulzqkzuiru(view2, rectF2);
        int i13 = nufgyqmvbuVar.f31029iobyxmoadg & 7;
        if (i13 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else {
            if (i13 != 3) {
                if (i13 != 5) {
                    f13 = 0.0f;
                } else {
                    fCenterX = rectF2.right;
                    fCenterX2 = rectF.right;
                }
                return f13 + nufgyqmvbuVar.f31031zoijcleaow;
            }
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        }
        f13 = fCenterX - fCenterX2;
        return f13 + nufgyqmvbuVar.f31031zoijcleaow;
    }

    private void ulzqkzuiru(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f23560esjtqupxsv;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void vipkmwdibw(View view, View view2, boolean z13, boolean z14, zoijcleaow zoijcleaowVar, float f13, float f14, List list, List list2) {
    }

    private void wypolnanlu(View view, zoijcleaow zoijcleaowVar, lqeggnwhkg lqeggnwhkgVar, lqeggnwhkg lqeggnwhkgVar2, float f13, float f14, float f15, float f16, RectF rectF) {
        float fNtlheqmsrt = ntlheqmsrt(zoijcleaowVar, lqeggnwhkgVar, f13, f15);
        float fNtlheqmsrt2 = ntlheqmsrt(zoijcleaowVar, lqeggnwhkgVar2, f14, f16);
        Rect rect = this.f23562jyumaefscl;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f23561iwizpuwonk;
        rectF2.set(rect);
        RectF rectF3 = this.f23559cqumvgiudr;
        ulzqkzuiru(view, rectF3);
        rectF3.offset(fNtlheqmsrt, fNtlheqmsrt2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet cllcsxoeiz(View view, View view2, boolean z13, boolean z14) {
        zoijcleaow zoijcleaowVarOkpsazkaxt = okpsazkaxt(view2.getContext(), z13);
        if (z13) {
            this.f23563lereixgezr = view.getTranslationX();
            this.f23564pmvmpeiblj = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ribwqtqdhb(view, view2, z13, z14, zoijcleaowVarOkpsazkaxt, arrayList, arrayList2);
        RectF rectF = this.f23561iwizpuwonk;
        ikoacuggdj(view, view2, z13, z14, zoijcleaowVarOkpsazkaxt, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        jlmebxxoox(view, view2, z13, zoijcleaowVarOkpsazkaxt, arrayList);
        jhduphickx(view, view2, z13, z14, zoijcleaowVarOkpsazkaxt, arrayList, arrayList2);
        vipkmwdibw(view, view2, z13, z14, zoijcleaowVarOkpsazkaxt, fWidth, fHeight, arrayList, arrayList2);
        crxdokpmqz(view, view2, z13, z14, zoijcleaowVarOkpsazkaxt, arrayList, arrayList2);
        sopmlzcsov(view, view2, z13, z14, zoijcleaowVarOkpsazkaxt, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        ea.zoijcleaow.iobyxmoadg(animatorSet, arrayList);
        animatorSet.addListener(new iobyxmoadg(z13, view2, view));
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i13));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public boolean dxjokdxxww(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
    public void gtknphoqwx(CoordinatorLayout.gxszxtbevo gxszxtbevoVar) {
        if (gxszxtbevoVar.f8324nufgyqmvbu == 0) {
            gxszxtbevoVar.f8324nufgyqmvbu = 80;
        }
    }

    protected abstract zoijcleaow okpsazkaxt(Context context, boolean z13);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23562jyumaefscl = new Rect();
        this.f23561iwizpuwonk = new RectF();
        this.f23559cqumvgiudr = new RectF();
        this.f23560esjtqupxsv = new int[2];
    }
}
