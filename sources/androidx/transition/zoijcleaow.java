package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zoijcleaow extends gtknphoqwx {

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f13567czzsidtyhn = false;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private static final String[] f13563uwvvkdfqfp = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private static final Property f13565yfnezrywwk = new iobyxmoadg(PointF.class, "topLeft");

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private static final Property f13564ydmasvzmpa = new C0202zoijcleaow(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private static final Property f13562sflfametgt = new ppxfxbqfkf(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private static final Property f13566zfvoamnweg = new wkgbmnqykc(PointF.class, "topLeft");

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private static final Property f13561oipsdeybqn = new eablkybsjg(PointF.class, "position");

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private static final androidx.transition.dxjokdxxww f13560bfopjjpdmp = new androidx.transition.dxjokdxxww();

    private static class dxjokdxxww {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final View f13568eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f13569gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f13570iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f13571lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f13572ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f13573wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f13574zoijcleaow;

        dxjokdxxww(View view) {
            this.f13568eablkybsjg = view;
        }

        private void zoijcleaow() {
            zynmafqrjb.wkgbmnqykc(this.f13568eablkybsjg, this.f13570iobyxmoadg, this.f13574zoijcleaow, this.f13572ppxfxbqfkf, this.f13573wkgbmnqykc);
            this.f13569gxszxtbevo = 0;
            this.f13571lqeggnwhkg = 0;
        }

        void iobyxmoadg(PointF pointF) {
            this.f13572ppxfxbqfkf = Math.round(pointF.x);
            this.f13573wkgbmnqykc = Math.round(pointF.y);
            int i13 = this.f13571lqeggnwhkg + 1;
            this.f13571lqeggnwhkg = i13;
            if (this.f13569gxszxtbevo == i13) {
                zoijcleaow();
            }
        }

        void ppxfxbqfkf(PointF pointF) {
            this.f13570iobyxmoadg = Math.round(pointF.x);
            this.f13574zoijcleaow = Math.round(pointF.y);
            int i13 = this.f13569gxszxtbevo + 1;
            this.f13569gxszxtbevo = i13;
            if (i13 == this.f13571lqeggnwhkg) {
                zoijcleaow();
            }
        }
    }

    class eablkybsjg extends Property {
        eablkybsjg(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            zynmafqrjb.wkgbmnqykc(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class gxszxtbevo extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ dxjokdxxww f13575iobyxmoadg;
        private final dxjokdxxww mViewBounds;

        gxszxtbevo(dxjokdxxww dxjokdxxwwVar) {
            this.f13575iobyxmoadg = dxjokdxxwwVar;
            this.mViewBounds = dxjokdxxwwVar;
        }
    }

    class iobyxmoadg extends Property {
        iobyxmoadg(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public PointF get(dxjokdxxww dxjokdxxwwVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(dxjokdxxww dxjokdxxwwVar, PointF pointF) {
            dxjokdxxwwVar.ppxfxbqfkf(pointF);
        }
    }

    private static class lqeggnwhkg extends AnimatorListenerAdapter implements gtknphoqwx.nufgyqmvbu {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private boolean f13577agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final int f13578btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private final int f13579draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final int f13580dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f13581eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private final int f13582gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final int f13583gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final View f13584iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final int f13585lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final int f13586nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f13587ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private final int f13588wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final Rect f13589wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Rect f13590zoijcleaow;

        lqeggnwhkg(View view, Rect rect, boolean z13, Rect rect2, boolean z14, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
            this.f13584iobyxmoadg = view;
            this.f13590zoijcleaow = rect;
            this.f13587ppxfxbqfkf = z13;
            this.f13589wkgbmnqykc = rect2;
            this.f13581eablkybsjg = z14;
            this.f13583gxszxtbevo = i13;
            this.f13585lqeggnwhkg = i14;
            this.f13586nufgyqmvbu = i15;
            this.f13580dxjokdxxww = i16;
            this.f13578btonecajqb = i17;
            this.f13582gtknphoqwx = i18;
            this.f13579draadjrbmk = i19;
            this.f13588wflxmlrfwp = i23;
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
            this.f13577agtfadlqog = true;
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            this.f13584iobyxmoadg.setTag(androidx.transition.nufgyqmvbu.transition_clip, this.f13584iobyxmoadg.getClipBounds());
            this.f13584iobyxmoadg.setClipBounds(this.f13581eablkybsjg ? null : this.f13589wkgbmnqykc);
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            Rect rect = (Rect) this.f13584iobyxmoadg.getTag(androidx.transition.nufgyqmvbu.transition_clip);
            this.f13584iobyxmoadg.setTag(androidx.transition.nufgyqmvbu.transition_clip, null);
            this.f13584iobyxmoadg.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z13) {
            if (this.f13577agtfadlqog) {
                return;
            }
            Rect rect = null;
            if (z13) {
                if (!this.f13587ppxfxbqfkf) {
                    rect = this.f13590zoijcleaow;
                }
            } else if (!this.f13581eablkybsjg) {
                rect = this.f13589wkgbmnqykc;
            }
            this.f13584iobyxmoadg.setClipBounds(rect);
            if (z13) {
                zynmafqrjb.wkgbmnqykc(this.f13584iobyxmoadg, this.f13583gxszxtbevo, this.f13585lqeggnwhkg, this.f13586nufgyqmvbu, this.f13580dxjokdxxww);
            } else {
                zynmafqrjb.wkgbmnqykc(this.f13584iobyxmoadg, this.f13578btonecajqb, this.f13582gtknphoqwx, this.f13579draadjrbmk, this.f13588wflxmlrfwp);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z13) {
            int iMax = Math.max(this.f13586nufgyqmvbu - this.f13583gxszxtbevo, this.f13579draadjrbmk - this.f13578btonecajqb);
            int iMax2 = Math.max(this.f13580dxjokdxxww - this.f13585lqeggnwhkg, this.f13588wflxmlrfwp - this.f13582gtknphoqwx);
            int i13 = z13 ? this.f13578btonecajqb : this.f13583gxszxtbevo;
            int i14 = z13 ? this.f13582gtknphoqwx : this.f13585lqeggnwhkg;
            zynmafqrjb.wkgbmnqykc(this.f13584iobyxmoadg, i13, i14, iMax + i13, iMax2 + i14);
            this.f13584iobyxmoadg.setClipBounds(z13 ? this.f13589wkgbmnqykc : this.f13590zoijcleaow);
        }
    }

    private static class nufgyqmvbu extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f13591iobyxmoadg = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final ViewGroup f13592zoijcleaow;

        nufgyqmvbu(ViewGroup viewGroup) {
            this.f13592zoijcleaow = viewGroup;
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            if (!this.f13591iobyxmoadg) {
                pmvmpeiblj.zoijcleaow(this.f13592zoijcleaow, false);
            }
            gtknphoqwxVar.ikoacuggdj(this);
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
            pmvmpeiblj.zoijcleaow(this.f13592zoijcleaow, false);
            this.f13591iobyxmoadg = true;
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            pmvmpeiblj.zoijcleaow(this.f13592zoijcleaow, false);
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            pmvmpeiblj.zoijcleaow(this.f13592zoijcleaow, true);
        }
    }

    class ppxfxbqfkf extends Property {
        ppxfxbqfkf(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            zynmafqrjb.wkgbmnqykc(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class wkgbmnqykc extends Property {
        wkgbmnqykc(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            zynmafqrjb.wkgbmnqykc(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    class C0202zoijcleaow extends Property {
        C0202zoijcleaow(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public PointF get(dxjokdxxww dxjokdxxwwVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(dxjokdxxww dxjokdxxwwVar, PointF pointF) {
            dxjokdxxwwVar.iobyxmoadg(pointF);
        }
    }

    private void opjhrmiecq(cqumvgiudr cqumvgiudrVar) {
        View view = cqumvgiudrVar.f13439zoijcleaow;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        cqumvgiudrVar.f13437iobyxmoadg.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        cqumvgiudrVar.f13437iobyxmoadg.put("android:changeBounds:parent", cqumvgiudrVar.f13439zoijcleaow.getParent());
        if (this.f13567czzsidtyhn) {
            cqumvgiudrVar.f13437iobyxmoadg.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.gtknphoqwx
    public boolean cllcsxoeiz() {
        return true;
    }

    @Override // androidx.transition.gtknphoqwx
    public String[] hcddaimhww() {
        return f13563uwvvkdfqfp;
    }

    @Override // androidx.transition.gtknphoqwx
    public void nufgyqmvbu(cqumvgiudr cqumvgiudrVar) {
        opjhrmiecq(cqumvgiudrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.gtknphoqwx
    public Animator vdvldrhtss(ViewGroup viewGroup, cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        int i13;
        View view;
        int i14;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorPpxfxbqfkf;
        if (cqumvgiudrVar == null || cqumvgiudrVar2 == null) {
            return null;
        }
        Map map = cqumvgiudrVar.f13437iobyxmoadg;
        Map map2 = cqumvgiudrVar2.f13437iobyxmoadg;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = cqumvgiudrVar2.f13439zoijcleaow;
        Rect rect = (Rect) cqumvgiudrVar.f13437iobyxmoadg.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) cqumvgiudrVar2.f13437iobyxmoadg.get("android:changeBounds:bounds");
        int i15 = rect.left;
        int i16 = rect2.left;
        int i17 = rect.top;
        int i18 = rect2.top;
        int i19 = rect.right;
        int i23 = rect2.right;
        int i24 = rect.bottom;
        int i25 = rect2.bottom;
        int i26 = i19 - i15;
        int i27 = i24 - i17;
        int i28 = i23 - i16;
        int i29 = i25 - i18;
        Rect rect3 = (Rect) cqumvgiudrVar.f13437iobyxmoadg.get("android:changeBounds:clip");
        Rect rect4 = (Rect) cqumvgiudrVar2.f13437iobyxmoadg.get("android:changeBounds:clip");
        if ((i26 == 0 || i27 == 0) && (i28 == 0 || i29 == 0)) {
            i13 = 0;
        } else {
            i13 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i23 || i24 != i25) {
                i13++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i13++;
        }
        if (i13 <= 0) {
            return null;
        }
        if (this.f13567czzsidtyhn) {
            view = view2;
            zynmafqrjb.wkgbmnqykc(view, i15, i17, Math.max(i26, i28) + i15, i17 + Math.max(i27, i29));
            ObjectAnimator objectAnimatorIobyxmoadg = (i15 == i16 && i17 == i18) ? null : androidx.transition.gxszxtbevo.iobyxmoadg(view, f13561oipsdeybqn, lereixgezr().iobyxmoadg(i15, i17, i16, i18));
            boolean z13 = rect3 == null;
            if (z13) {
                i14 = 0;
                rect3 = new Rect(0, 0, i26, i27);
            } else {
                i14 = 0;
            }
            Rect rect5 = rect3;
            int i33 = rect4 == null ? 1 : i14;
            Rect rect6 = i33 != 0 ? new Rect(i14, i14, i28, i29) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect5);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f13560bfopjjpdmp, rect5, rect6);
                lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(view, rect5, z13, rect6, i33, i15, i17, i19, i24, i16, i18, i23, i25);
                objectAnimatorOfObject.addListener(lqeggnwhkgVar);
                ppxfxbqfkf(lqeggnwhkgVar);
            }
            animatorPpxfxbqfkf = iwizpuwonk.ppxfxbqfkf(objectAnimatorIobyxmoadg, objectAnimatorOfObject);
        } else {
            view = view2;
            zynmafqrjb.wkgbmnqykc(view, i15, i17, i19, i24);
            if (i13 != 2) {
                animatorPpxfxbqfkf = (i15 == i16 && i17 == i18) ? androidx.transition.gxszxtbevo.iobyxmoadg(view, f13562sflfametgt, lereixgezr().iobyxmoadg(i19, i24, i23, i25)) : androidx.transition.gxszxtbevo.iobyxmoadg(view, f13566zfvoamnweg, lereixgezr().iobyxmoadg(i15, i17, i16, i18));
            } else if (i26 == i28 && i27 == i29) {
                animatorPpxfxbqfkf = androidx.transition.gxszxtbevo.iobyxmoadg(view, f13561oipsdeybqn, lereixgezr().iobyxmoadg(i15, i17, i16, i18));
            } else {
                dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(view);
                ObjectAnimator objectAnimatorIobyxmoadg2 = androidx.transition.gxszxtbevo.iobyxmoadg(dxjokdxxwwVar, f13565yfnezrywwk, lereixgezr().iobyxmoadg(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorIobyxmoadg3 = androidx.transition.gxszxtbevo.iobyxmoadg(dxjokdxxwwVar, f13564ydmasvzmpa, lereixgezr().iobyxmoadg(i19, i24, i23, i25));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorIobyxmoadg2, objectAnimatorIobyxmoadg3);
                animatorSet.addListener(new gxszxtbevo(dxjokdxxwwVar));
                animatorPpxfxbqfkf = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            pmvmpeiblj.zoijcleaow(viewGroup4, true);
            zynmafqrjb().ppxfxbqfkf(new nufgyqmvbu(viewGroup4));
        }
        return animatorPpxfxbqfkf;
    }

    @Override // androidx.transition.gtknphoqwx
    public void wflxmlrfwp(cqumvgiudr cqumvgiudrVar) {
        Rect rect;
        opjhrmiecq(cqumvgiudrVar);
        if (!this.f13567czzsidtyhn || (rect = (Rect) cqumvgiudrVar.f13439zoijcleaow.getTag(androidx.transition.nufgyqmvbu.transition_clip)) == null) {
            return;
        }
        cqumvgiudrVar.f13437iobyxmoadg.put("android:changeBounds:clip", rect);
    }
}
