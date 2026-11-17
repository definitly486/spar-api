package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.yggfygwlhe;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import da.gtknphoqwx;
import da.zoijcleaow;
import java.lang.ref.WeakReference;
import v1.jhduphickx;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.zoijcleaow {

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private static final int f22149zfvoamnweg = gtknphoqwx.Widget_MaterialComponents_BottomAppBar;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private static final int f22148oipsdeybqn = zoijcleaow.motionDurationLong2;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private static final int f22147bfopjjpdmp = zoijcleaow.motionEasingEmphasizedInterpolator;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f22155iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f22156jyumaefscl;

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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f22156jyumaefscl = parcel.readInt();
            this.f22155iwizpuwonk = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f22156jyumaefscl);
            parcel.writeInt(this.f22155iwizpuwonk ? 1 : 0);
        }
    }

    static /* synthetic */ int crxdokpmqz(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jlmebxxoox(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.gxszxtbevo) view.getLayoutParams()).f8331wkgbmnqykc = 17;
        throw null;
    }

    static /* synthetic */ View mbcevpiqjq(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ void sopmlzcsov(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    static /* synthetic */ void tzroggbefp(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ boolean ulzqkzuiru(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        private final Rect f22150iozdgvuglv;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        private WeakReference f22151lmojexxdyd;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        private int f22152wwaezpbzkn;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        private final View.OnLayoutChangeListener f22153ylkuphrtab;

        class iobyxmoadg implements View.OnLayoutChangeListener {
            iobyxmoadg() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
                yggfygwlhe.iobyxmoadg(Behavior.this.f22151lmojexxdyd.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f22153ylkuphrtab = new iobyxmoadg();
            this.f22150iozdgvuglv = new Rect();
        }

        public boolean mbcevpiqjq(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i13, int i14) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean rgvfuqvkyq(CoordinatorLayout coordinatorLayout, View view, int i13) {
            yggfygwlhe.iobyxmoadg(view);
            return tzroggbefp(coordinatorLayout, null, i13);
        }

        public boolean tzroggbefp(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i13) {
            this.f22151lmojexxdyd = new WeakReference(bottomAppBar);
            View viewMbcevpiqjq = BottomAppBar.mbcevpiqjq(bottomAppBar);
            if (viewMbcevpiqjq != null && !jhduphickx.tzroggbefp(viewMbcevpiqjq)) {
                BottomAppBar.jlmebxxoox(bottomAppBar, viewMbcevpiqjq);
                this.f22152wwaezpbzkn = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.gxszxtbevo) viewMbcevpiqjq.getLayoutParams())).bottomMargin;
                if (viewMbcevpiqjq instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewMbcevpiqjq;
                    if (BottomAppBar.crxdokpmqz(bottomAppBar) == 0 && BottomAppBar.ulzqkzuiru(bottomAppBar)) {
                        jhduphickx.tbqsvytpvh(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(da.iobyxmoadg.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(da.iobyxmoadg.mtrl_fab_hide_motion_spec);
                    }
                    BottomAppBar.sopmlzcsov(bottomAppBar, floatingActionButton);
                }
                viewMbcevpiqjq.addOnLayoutChangeListener(this.f22153ylkuphrtab);
                BottomAppBar.tzroggbefp(bottomAppBar);
            }
            coordinatorLayout.ylkuphrtab(bottomAppBar, i13);
            return super.rgvfuqvkyq(coordinatorLayout, bottomAppBar, i13);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.ppxfxbqfkf
        public /* bridge */ /* synthetic */ boolean yadqdtsiqt(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i13, int i14) {
            yggfygwlhe.iobyxmoadg(view);
            return mbcevpiqjq(coordinatorLayout, null, view2, view3, i13, i14);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f22153ylkuphrtab = new iobyxmoadg();
            this.f22150iozdgvuglv = new Rect();
        }
    }
}
