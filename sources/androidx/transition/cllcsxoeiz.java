package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cllcsxoeiz extends gtknphoqwx {

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private static final String[] f13418uwvvkdfqfp = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private int f13419czzsidtyhn = 3;

    private static class iobyxmoadg extends AnimatorListenerAdapter implements gtknphoqwx.nufgyqmvbu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f13420eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f13421gxszxtbevo = false;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final View f13422iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ViewGroup f13423ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final boolean f13424wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f13425zoijcleaow;

        iobyxmoadg(View view, int i13, boolean z13) {
            this.f13422iobyxmoadg = view;
            this.f13425zoijcleaow = i13;
            this.f13423ppxfxbqfkf = (ViewGroup) view.getParent();
            this.f13424wkgbmnqykc = z13;
            wkgbmnqykc(true);
        }

        private void ppxfxbqfkf() {
            if (!this.f13421gxszxtbevo) {
                zynmafqrjb.gxszxtbevo(this.f13422iobyxmoadg, this.f13425zoijcleaow);
                ViewGroup viewGroup = this.f13423ppxfxbqfkf;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            wkgbmnqykc(false);
        }

        private void wkgbmnqykc(boolean z13) {
            ViewGroup viewGroup;
            if (!this.f13424wkgbmnqykc || this.f13420eablkybsjg == z13 || (viewGroup = this.f13423ppxfxbqfkf) == null) {
                return;
            }
            this.f13420eablkybsjg = z13;
            pmvmpeiblj.zoijcleaow(viewGroup, z13);
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            gtknphoqwxVar.ikoacuggdj(this);
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            wkgbmnqykc(false);
            if (this.f13421gxszxtbevo) {
                return;
            }
            zynmafqrjb.gxszxtbevo(this.f13422iobyxmoadg, this.f13425zoijcleaow);
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            wkgbmnqykc(true);
            if (this.f13421gxszxtbevo) {
                return;
            }
            zynmafqrjb.gxszxtbevo(this.f13422iobyxmoadg, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13421gxszxtbevo = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ppxfxbqfkf();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z13) {
            if (z13) {
                return;
            }
            ppxfxbqfkf();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z13) {
            if (z13) {
                zynmafqrjb.gxszxtbevo(this.f13422iobyxmoadg, 0);
                ViewGroup viewGroup = this.f13423ppxfxbqfkf;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        ViewGroup f13426eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        ViewGroup f13427gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        boolean f13428iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f13429ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f13430wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        boolean f13431zoijcleaow;

        ppxfxbqfkf() {
        }
    }

    private class zoijcleaow extends AnimatorListenerAdapter implements gtknphoqwx.nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ViewGroup f13433iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final View f13434ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f13435wkgbmnqykc = true;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final View f13436zoijcleaow;

        zoijcleaow(ViewGroup viewGroup, View view, View view2) {
            this.f13433iobyxmoadg = viewGroup;
            this.f13436zoijcleaow = view;
            this.f13434ppxfxbqfkf = view2;
        }

        private void ppxfxbqfkf() {
            this.f13434ppxfxbqfkf.setTag(nufgyqmvbu.save_overlay_view, null);
            this.f13433iobyxmoadg.getOverlay().remove(this.f13436zoijcleaow);
            this.f13435wkgbmnqykc = false;
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            gtknphoqwxVar.ikoacuggdj(this);
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
            if (this.f13435wkgbmnqykc) {
                ppxfxbqfkf();
            }
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ppxfxbqfkf();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f13433iobyxmoadg.getOverlay().remove(this.f13436zoijcleaow);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f13436zoijcleaow.getParent() == null) {
                this.f13433iobyxmoadg.getOverlay().add(this.f13436zoijcleaow);
            } else {
                cllcsxoeiz.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z13) {
            if (z13) {
                this.f13434ppxfxbqfkf.setTag(nufgyqmvbu.save_overlay_view, this.f13436zoijcleaow);
                this.f13433iobyxmoadg.getOverlay().add(this.f13436zoijcleaow);
                this.f13435wkgbmnqykc = true;
            }
        }

        @Override // androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z13) {
            if (z13) {
                return;
            }
            ppxfxbqfkf();
        }
    }

    private ppxfxbqfkf iyctptxqzt(cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf();
        ppxfxbqfkfVar.f13428iobyxmoadg = false;
        ppxfxbqfkfVar.f13431zoijcleaow = false;
        if (cqumvgiudrVar == null || !cqumvgiudrVar.f13437iobyxmoadg.containsKey("android:visibility:visibility")) {
            ppxfxbqfkfVar.f13429ppxfxbqfkf = -1;
            ppxfxbqfkfVar.f13426eablkybsjg = null;
        } else {
            ppxfxbqfkfVar.f13429ppxfxbqfkf = ((Integer) cqumvgiudrVar.f13437iobyxmoadg.get("android:visibility:visibility")).intValue();
            ppxfxbqfkfVar.f13426eablkybsjg = (ViewGroup) cqumvgiudrVar.f13437iobyxmoadg.get("android:visibility:parent");
        }
        if (cqumvgiudrVar2 == null || !cqumvgiudrVar2.f13437iobyxmoadg.containsKey("android:visibility:visibility")) {
            ppxfxbqfkfVar.f13430wkgbmnqykc = -1;
            ppxfxbqfkfVar.f13427gxszxtbevo = null;
        } else {
            ppxfxbqfkfVar.f13430wkgbmnqykc = ((Integer) cqumvgiudrVar2.f13437iobyxmoadg.get("android:visibility:visibility")).intValue();
            ppxfxbqfkfVar.f13427gxszxtbevo = (ViewGroup) cqumvgiudrVar2.f13437iobyxmoadg.get("android:visibility:parent");
        }
        if (cqumvgiudrVar != null && cqumvgiudrVar2 != null) {
            int i13 = ppxfxbqfkfVar.f13429ppxfxbqfkf;
            int i14 = ppxfxbqfkfVar.f13430wkgbmnqykc;
            if (i13 == i14 && ppxfxbqfkfVar.f13426eablkybsjg == ppxfxbqfkfVar.f13427gxszxtbevo) {
                return ppxfxbqfkfVar;
            }
            if (i13 != i14) {
                if (i13 == 0) {
                    ppxfxbqfkfVar.f13431zoijcleaow = false;
                    ppxfxbqfkfVar.f13428iobyxmoadg = true;
                } else if (i14 == 0) {
                    ppxfxbqfkfVar.f13431zoijcleaow = true;
                    ppxfxbqfkfVar.f13428iobyxmoadg = true;
                }
            } else if (ppxfxbqfkfVar.f13427gxszxtbevo == null) {
                ppxfxbqfkfVar.f13431zoijcleaow = false;
                ppxfxbqfkfVar.f13428iobyxmoadg = true;
            } else if (ppxfxbqfkfVar.f13426eablkybsjg == null) {
                ppxfxbqfkfVar.f13431zoijcleaow = true;
                ppxfxbqfkfVar.f13428iobyxmoadg = true;
            }
        } else if (cqumvgiudrVar == null && ppxfxbqfkfVar.f13430wkgbmnqykc == 0) {
            ppxfxbqfkfVar.f13431zoijcleaow = true;
            ppxfxbqfkfVar.f13428iobyxmoadg = true;
        } else if (cqumvgiudrVar2 == null && ppxfxbqfkfVar.f13429ppxfxbqfkf == 0) {
            ppxfxbqfkfVar.f13431zoijcleaow = false;
            ppxfxbqfkfVar.f13428iobyxmoadg = true;
        }
        return ppxfxbqfkfVar;
    }

    private void opjhrmiecq(cqumvgiudr cqumvgiudrVar) {
        cqumvgiudrVar.f13437iobyxmoadg.put("android:visibility:visibility", Integer.valueOf(cqumvgiudrVar.f13439zoijcleaow.getVisibility()));
        cqumvgiudrVar.f13437iobyxmoadg.put("android:visibility:parent", cqumvgiudrVar.f13439zoijcleaow.getParent());
        int[] iArr = new int[2];
        cqumvgiudrVar.f13439zoijcleaow.getLocationOnScreen(iArr);
        cqumvgiudrVar.f13437iobyxmoadg.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.gtknphoqwx
    public boolean dsvhmnatus(cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        if (cqumvgiudrVar == null && cqumvgiudrVar2 == null) {
            return false;
        }
        if (cqumvgiudrVar != null && cqumvgiudrVar2 != null && cqumvgiudrVar2.f13437iobyxmoadg.containsKey("android:visibility:visibility") != cqumvgiudrVar.f13437iobyxmoadg.containsKey("android:visibility:visibility")) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVarIyctptxqzt = iyctptxqzt(cqumvgiudrVar, cqumvgiudrVar2);
        if (ppxfxbqfkfVarIyctptxqzt.f13428iobyxmoadg) {
            return ppxfxbqfkfVarIyctptxqzt.f13429ppxfxbqfkf == 0 || ppxfxbqfkfVarIyctptxqzt.f13430wkgbmnqykc == 0;
        }
        return false;
    }

    @Override // androidx.transition.gtknphoqwx
    public String[] hcddaimhww() {
        return f13418uwvvkdfqfp;
    }

    public Animator lrnfpwlwnk(ViewGroup viewGroup, cqumvgiudr cqumvgiudrVar, int i13, cqumvgiudr cqumvgiudrVar2, int i14) {
        if ((this.f13419czzsidtyhn & 1) != 1 || cqumvgiudrVar2 == null) {
            return null;
        }
        if (cqumvgiudrVar == null) {
            View view = (View) cqumvgiudrVar2.f13439zoijcleaow.getParent();
            if (iyctptxqzt(cqumvgiudr(view, false), jpowsppfya(view, false)).f13428iobyxmoadg) {
                return null;
            }
        }
        return weqkydbzbr(viewGroup, cqumvgiudrVar2.f13439zoijcleaow, cqumvgiudrVar, cqumvgiudrVar2);
    }

    @Override // androidx.transition.gtknphoqwx
    public void nufgyqmvbu(cqumvgiudr cqumvgiudrVar) {
        opjhrmiecq(cqumvgiudrVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator nuxfzjnpeb(ViewGroup viewGroup, cqumvgiudr cqumvgiudrVar, int i13, cqumvgiudr cqumvgiudrVar2, int i14) {
        View view;
        boolean z13;
        boolean z14;
        View view2;
        if ((this.f13419czzsidtyhn & 2) != 2 || cqumvgiudrVar == null) {
            return null;
        }
        View view3 = cqumvgiudrVar.f13439zoijcleaow;
        View viewIobyxmoadg = cqumvgiudrVar2 != null ? cqumvgiudrVar2.f13439zoijcleaow : null;
        View view4 = (View) view3.getTag(nufgyqmvbu.save_overlay_view);
        if (view4 != null) {
            view2 = null;
            z14 = true;
        } else {
            if (viewIobyxmoadg == null || viewIobyxmoadg.getParent() == null) {
                if (viewIobyxmoadg != null) {
                    view = null;
                    z13 = false;
                } else {
                    viewIobyxmoadg = null;
                    view = null;
                    z13 = true;
                }
            } else if (i14 == 4 || view3 == viewIobyxmoadg) {
                view = viewIobyxmoadg;
                z13 = false;
                viewIobyxmoadg = null;
            } else {
                viewIobyxmoadg = null;
                view = null;
                z13 = true;
            }
            if (z13) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (iyctptxqzt(jpowsppfya(view5, true), cqumvgiudr(view5, true)).f13428iobyxmoadg) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f13497wypolnanlu) {
                            }
                        } else {
                            viewIobyxmoadg = iwizpuwonk.iobyxmoadg(viewGroup, view3, view5);
                        }
                    }
                    z14 = false;
                    View view6 = view;
                    view4 = viewIobyxmoadg;
                    view2 = view6;
                }
                view2 = view;
                z14 = false;
                view4 = view3;
            } else {
                z14 = false;
                View view7 = view;
                view4 = viewIobyxmoadg;
                view2 = view7;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            zynmafqrjb.gxszxtbevo(view2, 0);
            Animator animatorZeieaojujs = zeieaojujs(viewGroup, view2, cqumvgiudrVar, cqumvgiudrVar2);
            if (animatorZeieaojujs != null) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(view2, i14, true);
                animatorZeieaojujs.addListener(iobyxmoadgVar);
                zynmafqrjb().ppxfxbqfkf(iobyxmoadgVar);
            } else {
                zynmafqrjb.gxszxtbevo(view2, visibility);
            }
            return animatorZeieaojujs;
        }
        if (!z14) {
            int[] iArr = (int[]) cqumvgiudrVar.f13437iobyxmoadg.get("android:visibility:screenLocation");
            int i15 = iArr[0];
            int i16 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i15 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i16 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorZeieaojujs2 = zeieaojujs(viewGroup, view4, cqumvgiudrVar, cqumvgiudrVar2);
        if (!z14) {
            if (animatorZeieaojujs2 == null) {
                viewGroup.getOverlay().remove(view4);
            } else {
                view3.setTag(nufgyqmvbu.save_overlay_view, view4);
                zoijcleaow zoijcleaowVar = new zoijcleaow(viewGroup, view4, view3);
                animatorZeieaojujs2.addListener(zoijcleaowVar);
                animatorZeieaojujs2.addPauseListener(zoijcleaowVar);
                zynmafqrjb().ppxfxbqfkf(zoijcleaowVar);
            }
        }
        return animatorZeieaojujs2;
    }

    public void tbqsvytpvh(int i13) {
        if ((i13 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f13419czzsidtyhn = i13;
    }

    @Override // androidx.transition.gtknphoqwx
    public Animator vdvldrhtss(ViewGroup viewGroup, cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2) {
        ppxfxbqfkf ppxfxbqfkfVarIyctptxqzt = iyctptxqzt(cqumvgiudrVar, cqumvgiudrVar2);
        if (!ppxfxbqfkfVarIyctptxqzt.f13428iobyxmoadg) {
            return null;
        }
        if (ppxfxbqfkfVarIyctptxqzt.f13426eablkybsjg == null && ppxfxbqfkfVarIyctptxqzt.f13427gxszxtbevo == null) {
            return null;
        }
        return ppxfxbqfkfVarIyctptxqzt.f13431zoijcleaow ? lrnfpwlwnk(viewGroup, cqumvgiudrVar, ppxfxbqfkfVarIyctptxqzt.f13429ppxfxbqfkf, cqumvgiudrVar2, ppxfxbqfkfVarIyctptxqzt.f13430wkgbmnqykc) : nuxfzjnpeb(viewGroup, cqumvgiudrVar, ppxfxbqfkfVarIyctptxqzt.f13429ppxfxbqfkf, cqumvgiudrVar2, ppxfxbqfkfVarIyctptxqzt.f13430wkgbmnqykc);
    }

    public abstract Animator weqkydbzbr(ViewGroup viewGroup, View view, cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2);

    @Override // androidx.transition.gtknphoqwx
    public void wflxmlrfwp(cqumvgiudr cqumvgiudrVar) {
        opjhrmiecq(cqumvgiudrVar);
    }

    public abstract Animator zeieaojujs(ViewGroup viewGroup, View view, cqumvgiudr cqumvgiudrVar, cqumvgiudr cqumvgiudrVar2);
}
