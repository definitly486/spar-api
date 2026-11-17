package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.yggfygwlhe;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import da.draadjrbmk;
import da.gtknphoqwx;
import java.util.List;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final int f22733zdlpuopuiu = gtknphoqwx.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    static final Property f22732yggfygwlhe = new iobyxmoadg(Float.class, "width");

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    static final Property f22731jyumaefscl = new zoijcleaow(Float.class, "height");

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static final Property f22730iwizpuwonk = new ppxfxbqfkf(Float.class, "paddingStart");

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    static final Property f22729cqumvgiudr = new wkgbmnqykc(Float.class, "paddingEnd");

    public static abstract class eablkybsjg {
    }

    class iobyxmoadg extends Property {
        iobyxmoadg(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f13) {
            view.getLayoutParams().width = f13.intValue();
            view.requestLayout();
        }
    }

    class ppxfxbqfkf extends Property {
        ppxfxbqfkf(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(jhduphickx.yadqdtsiqt(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f13) {
            jhduphickx.lxfrhoxuzk(view, f13.intValue(), view.getPaddingTop(), jhduphickx.cdpycssgdh(view), view.getPaddingBottom());
        }
    }

    class wkgbmnqykc extends Property {
        wkgbmnqykc(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(jhduphickx.cdpycssgdh(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f13) {
            jhduphickx.lxfrhoxuzk(view, jhduphickx.yadqdtsiqt(view), view.getPaddingTop(), f13.intValue(), view.getPaddingBottom());
        }
    }

    class zoijcleaow extends Property {
        zoijcleaow(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f13) {
            view.getLayoutParams().height = f13.intValue();
            view.requestLayout();
        }
    }

    static /* synthetic */ void dxjokdxxww(ExtendedFloatingActionButton extendedFloatingActionButton, int i13, eablkybsjg eablkybsjgVar) {
        throw null;
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.ppxfxbqfkf {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f22734jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f22735yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Rect f22736zdlpuopuiu;

        public ExtendedFloatingActionButtonBehavior() {
            this.f22735yggfygwlhe = false;
            this.f22734jyumaefscl = true;
        }

        private boolean cllcsxoeiz(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private static boolean hcddaimhww(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.gxszxtbevo) {
                return ((CoordinatorLayout.gxszxtbevo) layoutParams).gxszxtbevo() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean stevsuqkhv(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (cllcsxoeiz(view, extendedFloatingActionButton)) {
                throw null;
            }
            return false;
        }

        private boolean wypolnanlu(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!cllcsxoeiz(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f22736zdlpuopuiu == null) {
                this.f22736zdlpuopuiu = new Rect();
            }
            Rect rect = this.f22736zdlpuopuiu;
            com.google.android.material.internal.zoijcleaow.iobyxmoadg(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                dsvhmnatus(extendedFloatingActionButton);
                return true;
            }
            ylkuphrtab(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean draadjrbmk(CoordinatorLayout coordinatorLayout, View view, View view2) {
            yggfygwlhe.iobyxmoadg(view);
            return jpowsppfya(coordinatorLayout, null, view2);
        }

        protected void dsvhmnatus(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.dxjokdxxww(extendedFloatingActionButton, this.f22734jyumaefscl ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public void gtknphoqwx(CoordinatorLayout.gxszxtbevo gxszxtbevoVar) {
            if (gxszxtbevoVar.f8324nufgyqmvbu == 0) {
                gxszxtbevoVar.f8324nufgyqmvbu = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean gxszxtbevo(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            yggfygwlhe.iobyxmoadg(view);
            return pkzmftpjix(coordinatorLayout, null, rect);
        }

        public boolean hkdspvbjdz(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i13) {
            List listOxmwwwfdhm = coordinatorLayout.oxmwwwfdhm(extendedFloatingActionButton);
            int size = listOxmwwwfdhm.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = (View) listOxmwwwfdhm.get(i14);
                if (!(view instanceof AppBarLayout)) {
                    if (hcddaimhww(view) && stevsuqkhv(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (wypolnanlu(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.ylkuphrtab(extendedFloatingActionButton, i13);
            return true;
        }

        public boolean jpowsppfya(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                wypolnanlu(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!hcddaimhww(view)) {
                return false;
            }
            stevsuqkhv(view, extendedFloatingActionButton);
            return false;
        }

        public boolean pkzmftpjix(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.gxszxtbevo(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
            yggfygwlhe.iobyxmoadg(view);
            return hkdspvbjdz(coordinatorLayout, null, i13);
        }

        protected void ylkuphrtab(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton.dxjokdxxww(extendedFloatingActionButton, this.f22734jyumaefscl ? 3 : 0, null);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, draadjrbmk.ExtendedFloatingActionButton_Behavior_Layout);
            this.f22735yggfygwlhe = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f22734jyumaefscl = typedArrayObtainStyledAttributes.getBoolean(draadjrbmk.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
