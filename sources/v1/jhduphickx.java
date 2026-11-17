package v1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class jhduphickx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static WeakHashMap f115141iobyxmoadg = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static boolean f115142ppxfxbqfkf = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static Field f115144zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int[] f115143wkgbmnqykc = {g1.ppxfxbqfkf.accessibility_custom_action_0, g1.ppxfxbqfkf.accessibility_custom_action_1, g1.ppxfxbqfkf.accessibility_custom_action_2, g1.ppxfxbqfkf.accessibility_custom_action_3, g1.ppxfxbqfkf.accessibility_custom_action_4, g1.ppxfxbqfkf.accessibility_custom_action_5, g1.ppxfxbqfkf.accessibility_custom_action_6, g1.ppxfxbqfkf.accessibility_custom_action_7, g1.ppxfxbqfkf.accessibility_custom_action_8, g1.ppxfxbqfkf.accessibility_custom_action_9, g1.ppxfxbqfkf.accessibility_custom_action_10, g1.ppxfxbqfkf.accessibility_custom_action_11, g1.ppxfxbqfkf.accessibility_custom_action_12, g1.ppxfxbqfkf.accessibility_custom_action_13, g1.ppxfxbqfkf.accessibility_custom_action_14, g1.ppxfxbqfkf.accessibility_custom_action_15, g1.ppxfxbqfkf.accessibility_custom_action_16, g1.ppxfxbqfkf.accessibility_custom_action_17, g1.ppxfxbqfkf.accessibility_custom_action_18, g1.ppxfxbqfkf.accessibility_custom_action_19, g1.ppxfxbqfkf.accessibility_custom_action_20, g1.ppxfxbqfkf.accessibility_custom_action_21, g1.ppxfxbqfkf.accessibility_custom_action_22, g1.ppxfxbqfkf.accessibility_custom_action_23, g1.ppxfxbqfkf.accessibility_custom_action_24, g1.ppxfxbqfkf.accessibility_custom_action_25, g1.ppxfxbqfkf.accessibility_custom_action_26, g1.ppxfxbqfkf.accessibility_custom_action_27, g1.ppxfxbqfkf.accessibility_custom_action_28, g1.ppxfxbqfkf.accessibility_custom_action_29, g1.ppxfxbqfkf.accessibility_custom_action_30, g1.ppxfxbqfkf.accessibility_custom_action_31};

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final jpowsppfya f115139eablkybsjg = new jpowsppfya() { // from class: v1.vipkmwdibw
        @Override // v1.jpowsppfya
        public final wkgbmnqykc onReceiveContent(wkgbmnqykc wkgbmnqykcVar) {
            return jhduphickx.sopmlzcsov(wkgbmnqykcVar);
        }
    };

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final eablkybsjg f115140gxszxtbevo = new eablkybsjg();

    private static class agtfadlqog {
        static CharSequence iobyxmoadg(View view) {
            return view.getStateDescription();
        }

        static void ppxfxbqfkf(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        public static g zoijcleaow(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return g.gxszxtbevo(windowInsetsController);
            }
            return null;
        }
    }

    static class btonecajqb {
        static void iobyxmoadg(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class draadjrbmk {
        static void eablkybsjg(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void gxszxtbevo(View view, boolean z13) {
            view.setScreenReaderFocusable(z13);
        }

        static CharSequence iobyxmoadg(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean ppxfxbqfkf(View view) {
            return view.isScreenReaderFocusable();
        }

        static void wkgbmnqykc(View view, boolean z13) {
            view.setAccessibilityHeading(z13);
        }

        static boolean zoijcleaow(View view) {
            return view.isAccessibilityHeading();
        }
    }

    private static class dxjokdxxww {
        public static skhdrjzrfn iobyxmoadg(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            skhdrjzrfn skhdrjzrfnVarEsjtqupxsv = skhdrjzrfn.esjtqupxsv(rootWindowInsets);
            skhdrjzrfnVarEsjtqupxsv.jyumaefscl(skhdrjzrfnVarEsjtqupxsv);
            skhdrjzrfnVarEsjtqupxsv.wkgbmnqykc(view.getRootView());
            return skhdrjzrfnVarEsjtqupxsv;
        }

        static void zoijcleaow(View view, int i13, int i14) {
            view.setScrollIndicators(i13, i14);
        }
    }

    static class eablkybsjg implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final WeakHashMap f115145zdlpuopuiu = new WeakHashMap();

        eablkybsjg() {
        }

        private void eablkybsjg(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        private void ppxfxbqfkf(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void zoijcleaow(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z13 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z13) {
                jhduphickx.crxdokpmqz(view, z13 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z13));
            }
        }

        void iobyxmoadg(View view) {
            this.f115145zdlpuopuiu.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                ppxfxbqfkf(view);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f115145zdlpuopuiu.entrySet().iterator();
                while (it.hasNext()) {
                    zoijcleaow((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ppxfxbqfkf(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        void wkgbmnqykc(View view) {
            this.f115145zdlpuopuiu.remove(view);
            view.removeOnAttachStateChangeListener(this);
            eablkybsjg(view);
        }
    }

    static class gtknphoqwx {
        static int iobyxmoadg(View view) {
            return view.getImportantForAutofill();
        }

        static void zoijcleaow(View view, int i13) {
            view.setImportantForAutofill(i13);
        }
    }

    static abstract class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f115146iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f115147ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f115148wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Class f115149zoijcleaow;

        gxszxtbevo(int i13, Class cls, int i14) {
            this(i13, cls, 0, i14);
        }

        private boolean zoijcleaow() {
            return Build.VERSION.SDK_INT >= this.f115147ppxfxbqfkf;
        }

        Object eablkybsjg(View view) {
            if (zoijcleaow()) {
                return ppxfxbqfkf(view);
            }
            Object tag = view.getTag(this.f115146iobyxmoadg);
            if (this.f115149zoijcleaow.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void gxszxtbevo(View view, Object obj) {
            if (zoijcleaow()) {
                wkgbmnqykc(view, obj);
            } else if (lqeggnwhkg(eablkybsjg(view), obj)) {
                jhduphickx.btonecajqb(view);
                view.setTag(this.f115146iobyxmoadg, obj);
                jhduphickx.crxdokpmqz(view, this.f115148wkgbmnqykc);
            }
        }

        boolean iobyxmoadg(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract boolean lqeggnwhkg(Object obj, Object obj2);

        abstract Object ppxfxbqfkf(View view);

        abstract void wkgbmnqykc(View view, Object obj);

        gxszxtbevo(int i13, Class cls, int i14, int i15) {
            this.f115146iobyxmoadg = i13;
            this.f115149zoijcleaow = cls;
            this.f115148wkgbmnqykc = i14;
            this.f115147ppxfxbqfkf = i15;
        }
    }

    class iobyxmoadg extends gxszxtbevo {
        iobyxmoadg(int i13, Class cls, int i14) {
            super(i13, cls, i14);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public boolean lqeggnwhkg(Boolean bool, Boolean bool2) {
            return !iobyxmoadg(bool, bool2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(View view, Boolean bool) {
            draadjrbmk.gxszxtbevo(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public Boolean ppxfxbqfkf(View view) {
            return Boolean.valueOf(draadjrbmk.ppxfxbqfkf(view));
        }
    }

    static class lqeggnwhkg {
        static WindowInsets iobyxmoadg(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static void ppxfxbqfkf(View view) {
            view.requestApplyInsets();
        }

        static WindowInsets zoijcleaow(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    private static class nufgyqmvbu {

        class iobyxmoadg implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            skhdrjzrfn f115150iobyxmoadg = null;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            final /* synthetic */ pkzmftpjix f115151ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ View f115152zoijcleaow;

            iobyxmoadg(View view, pkzmftpjix pkzmftpjixVar) {
                this.f115152zoijcleaow = view;
                this.f115151ppxfxbqfkf = pkzmftpjixVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                skhdrjzrfn skhdrjzrfnVarLereixgezr = skhdrjzrfn.lereixgezr(windowInsets, view);
                int i13 = Build.VERSION.SDK_INT;
                if (i13 < 30) {
                    nufgyqmvbu.iobyxmoadg(windowInsets, this.f115152zoijcleaow);
                    if (skhdrjzrfnVarLereixgezr.equals(this.f115150iobyxmoadg)) {
                        return this.f115151ppxfxbqfkf.iobyxmoadg(view, skhdrjzrfnVarLereixgezr).cqumvgiudr();
                    }
                }
                this.f115150iobyxmoadg = skhdrjzrfnVarLereixgezr;
                skhdrjzrfn skhdrjzrfnVarIobyxmoadg = this.f115151ppxfxbqfkf.iobyxmoadg(view, skhdrjzrfnVarLereixgezr);
                if (i13 >= 30) {
                    return skhdrjzrfnVarIobyxmoadg.cqumvgiudr();
                }
                jhduphickx.ydmasvzmpa(view);
                return skhdrjzrfnVarIobyxmoadg.cqumvgiudr();
            }
        }

        static void agtfadlqog(View view, pkzmftpjix pkzmftpjixVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(g1.ppxfxbqfkf.tag_on_apply_window_listener, pkzmftpjixVar);
            }
            if (pkzmftpjixVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(g1.ppxfxbqfkf.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new iobyxmoadg(view, pkzmftpjixVar));
            }
        }

        static void btonecajqb(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void draadjrbmk(View view, float f13) {
            view.setElevation(f13);
        }

        static boolean dxjokdxxww(View view) {
            return view.isNestedScrollingEnabled();
        }

        static float eablkybsjg(View view) {
            return view.getElevation();
        }

        static void gtknphoqwx(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static String gxszxtbevo(View view) {
            return view.getTransitionName();
        }

        static void iobyxmoadg(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(g1.ppxfxbqfkf.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static float lqeggnwhkg(View view) {
            return view.getTranslationZ();
        }

        static float nufgyqmvbu(View view) {
            return view.getZ();
        }

        static void ojitshcjhn(View view, String str) {
            view.setTransitionName(str);
        }

        static void oxmwwwfdhm(View view) {
            view.stopNestedScroll();
        }

        static ColorStateList ppxfxbqfkf(View view) {
            return view.getBackgroundTintList();
        }

        static void rgvfuqvkyq(View view, float f13) {
            view.setTranslationZ(f13);
        }

        static void vdvldrhtss(View view, float f13) {
            view.setZ(f13);
        }

        static void wflxmlrfwp(View view, boolean z13) {
            view.setNestedScrollingEnabled(z13);
        }

        static PorterDuff.Mode wkgbmnqykc(View view) {
            return view.getBackgroundTintMode();
        }

        static skhdrjzrfn zoijcleaow(View view, skhdrjzrfn skhdrjzrfnVar, Rect rect) {
            WindowInsets windowInsetsCqumvgiudr = skhdrjzrfnVar.cqumvgiudr();
            if (windowInsetsCqumvgiudr != null) {
                return skhdrjzrfn.lereixgezr(view.computeSystemWindowInsets(windowInsetsCqumvgiudr, rect), view);
            }
            rect.setEmpty();
            return skhdrjzrfnVar;
        }
    }

    private static final class ojitshcjhn {
        public static String[] iobyxmoadg(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static v1.wkgbmnqykc zoijcleaow(View view, v1.wkgbmnqykc wkgbmnqykcVar) {
            ContentInfo contentInfoGxszxtbevo = wkgbmnqykcVar.gxszxtbevo();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoGxszxtbevo);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoGxszxtbevo ? wkgbmnqykcVar : v1.wkgbmnqykc.lqeggnwhkg(contentInfoPerformReceiveContent);
        }
    }

    class ppxfxbqfkf extends gxszxtbevo {
        ppxfxbqfkf(int i13, Class cls, int i14, int i15) {
            super(i13, cls, i14, i15);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public boolean lqeggnwhkg(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(View view, CharSequence charSequence) {
            agtfadlqog.ppxfxbqfkf(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public CharSequence ppxfxbqfkf(View view) {
            return agtfadlqog.iobyxmoadg(view);
        }
    }

    static class rgvfuqvkyq {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final ArrayList f115153wkgbmnqykc = new ArrayList();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private WeakHashMap f115154iobyxmoadg = null;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private SparseArray f115156zoijcleaow = null;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private WeakReference f115155ppxfxbqfkf = null;

        rgvfuqvkyq() {
        }

        private boolean eablkybsjg(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(g1.ppxfxbqfkf.tag_unhandled_key_listeners);
            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
                return false;
            }
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(arrayList.get(size));
            throw null;
        }

        static rgvfuqvkyq iobyxmoadg(View view) {
            rgvfuqvkyq rgvfuqvkyqVar = (rgvfuqvkyq) view.getTag(g1.ppxfxbqfkf.tag_unhandled_key_event_manager);
            if (rgvfuqvkyqVar != null) {
                return rgvfuqvkyqVar;
            }
            rgvfuqvkyq rgvfuqvkyqVar2 = new rgvfuqvkyq();
            view.setTag(g1.ppxfxbqfkf.tag_unhandled_key_event_manager, rgvfuqvkyqVar2);
            return rgvfuqvkyqVar2;
        }

        private void lqeggnwhkg() {
            WeakHashMap weakHashMap = this.f115154iobyxmoadg;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f115153wkgbmnqykc;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f115154iobyxmoadg == null) {
                        this.f115154iobyxmoadg = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f115153wkgbmnqykc;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f115154iobyxmoadg.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f115154iobyxmoadg.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private View ppxfxbqfkf(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f115154iobyxmoadg;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewPpxfxbqfkf = ppxfxbqfkf(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewPpxfxbqfkf != null) {
                            return viewPpxfxbqfkf;
                        }
                    }
                }
                if (eablkybsjg(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray wkgbmnqykc() {
            if (this.f115156zoijcleaow == null) {
                this.f115156zoijcleaow = new SparseArray();
            }
            return this.f115156zoijcleaow;
        }

        boolean gxszxtbevo(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f115155ppxfxbqfkf;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f115155ppxfxbqfkf = new WeakReference(keyEvent);
            SparseArray sparseArrayWkgbmnqykc = wkgbmnqykc();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayWkgbmnqykc.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayWkgbmnqykc.valueAt(iIndexOfKey);
                sparseArrayWkgbmnqykc.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayWkgbmnqykc.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                eablkybsjg(view, keyEvent);
            }
            return true;
        }

        boolean zoijcleaow(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                lqeggnwhkg();
            }
            View viewPpxfxbqfkf = ppxfxbqfkf(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewPpxfxbqfkf != null && !KeyEvent.isModifierKey(keyCode)) {
                    wkgbmnqykc().put(keyCode, new WeakReference(viewPpxfxbqfkf));
                }
            }
            return viewPpxfxbqfkf != null;
        }
    }

    private static class wflxmlrfwp {
        static View.AccessibilityDelegate iobyxmoadg(View view) {
            return view.getAccessibilityDelegate();
        }

        static void zoijcleaow(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i13, int i14) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i13, i14);
        }
    }

    class wkgbmnqykc extends gxszxtbevo {
        wkgbmnqykc(int i13, Class cls, int i14) {
            super(i13, cls, i14);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public boolean lqeggnwhkg(Boolean bool, Boolean bool2) {
            return !iobyxmoadg(bool, bool2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(View view, Boolean bool) {
            draadjrbmk.wkgbmnqykc(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public Boolean ppxfxbqfkf(View view) {
            return Boolean.valueOf(draadjrbmk.zoijcleaow(view));
        }
    }

    class zoijcleaow extends gxszxtbevo {
        zoijcleaow(int i13, Class cls, int i14, int i15) {
            super(i13, cls, i14, i15);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
        public boolean lqeggnwhkg(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
        public void wkgbmnqykc(View view, CharSequence charSequence) {
            draadjrbmk.eablkybsjg(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // v1.jhduphickx.gxszxtbevo
        /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
        public CharSequence ppxfxbqfkf(View view) {
            return draadjrbmk.iobyxmoadg(view);
        }
    }

    public static void ageimvtcrz(View view, CharSequence charSequence) {
        ixidwrxhsl().gxszxtbevo(view, charSequence);
    }

    private static View.AccessibilityDelegate agtfadlqog(View view) {
        if (f115142ppxfxbqfkf) {
            return null;
        }
        if (f115144zoijcleaow == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f115144zoijcleaow = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f115142ppxfxbqfkf = true;
                return null;
            }
        }
        try {
            Object obj = f115144zoijcleaow.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f115142ppxfxbqfkf = true;
            return null;
        }
    }

    private static void auzgnhcxok(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void bfopjjpdmp(View view, boolean z13) {
        zoijcleaow().gxszxtbevo(view, Boolean.valueOf(z13));
    }

    static void btonecajqb(View view) {
        v1.iobyxmoadg iobyxmoadgVarDraadjrbmk = draadjrbmk(view);
        if (iobyxmoadgVarDraadjrbmk == null) {
            iobyxmoadgVarDraadjrbmk = new v1.iobyxmoadg();
        }
        oipsdeybqn(view, iobyxmoadgVarDraadjrbmk);
    }

    public static int cdpycssgdh(View view) {
        return view.getPaddingEnd();
    }

    public static boolean cllcsxoeiz(View view) {
        return wflxmlrfwp(view) != null;
    }

    public static int cqumvgiudr(View view) {
        return view.getImportantForAccessibility();
    }

    static void crxdokpmqz(View view, int i13) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z13 = ojitshcjhn(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z13) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z13 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i13);
                if (z13) {
                    accessibilityEventObtain.getText().add(ojitshcjhn(view));
                    auzgnhcxok(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i13 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i13);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(ojitshcjhn(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i13);
                } catch (AbstractMethodError e13) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e13);
                }
            }
        }
    }

    public static void czzsidtyhn(View view, int i13) {
        uwvvkdfqfp(i13, view);
        crxdokpmqz(view, 0);
    }

    public static v1.iobyxmoadg draadjrbmk(View view) {
        View.AccessibilityDelegate accessibilityDelegateWflxmlrfwp = wflxmlrfwp(view);
        if (accessibilityDelegateWflxmlrfwp == null) {
            return null;
        }
        return accessibilityDelegateWflxmlrfwp instanceof v1.iobyxmoadg.C2869iobyxmoadg ? ((v1.iobyxmoadg.C2869iobyxmoadg) accessibilityDelegateWflxmlrfwp).f115133iobyxmoadg : new v1.iobyxmoadg(accessibilityDelegateWflxmlrfwp);
    }

    public static boolean dsvhmnatus(View view) {
        return view.hasOnClickListeners();
    }

    public static void dvvnrvtcbc(View view, int i13) {
        view.setLabelFor(i13);
    }

    static boolean dxjokdxxww(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return rgvfuqvkyq.iobyxmoadg(view).gxszxtbevo(keyEvent);
    }

    public static yfnezrywwk eablkybsjg(View view) {
        if (f115141iobyxmoadg == null) {
            f115141iobyxmoadg = new WeakHashMap();
        }
        yfnezrywwk yfnezrywwkVar = (yfnezrywwk) f115141iobyxmoadg.get(view);
        if (yfnezrywwkVar != null) {
            return yfnezrywwkVar;
        }
        yfnezrywwk yfnezrywwkVar2 = new yfnezrywwk(view);
        f115141iobyxmoadg.put(view, yfnezrywwkVar2);
        return yfnezrywwkVar2;
    }

    public static int esjtqupxsv(View view) {
        return gtknphoqwx.iobyxmoadg(view);
    }

    public static void fiwbwshyhd(View view, int i13, int i14) {
        dxjokdxxww.zoijcleaow(view, i13, i14);
    }

    public static void fyldjkxazc(View view, String str) {
        nufgyqmvbu.ojitshcjhn(view, str);
    }

    public static void grlcpdaxtj(View view, bfopjjpdmp.zoijcleaow zoijcleaowVar) {
        bfopjjpdmp.eablkybsjg(view, zoijcleaowVar);
    }

    public static int gtknphoqwx() {
        return View.generateViewId();
    }

    public static skhdrjzrfn gxszxtbevo(View view, skhdrjzrfn skhdrjzrfnVar, Rect rect) {
        return nufgyqmvbu.zoijcleaow(view, skhdrjzrfnVar, rect);
    }

    public static g hcddaimhww(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return agtfadlqog.zoijcleaow(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return oipsdeybqn.iobyxmoadg(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static float hkdspvbjdz(View view) {
        return nufgyqmvbu.nufgyqmvbu(view);
    }

    public static void hszhottldk(View view, boolean z13) {
        zfvoamnweg().gxszxtbevo(view, Boolean.valueOf(z13));
    }

    public static void igdgnonuha(View view, pkzmftpjix pkzmftpjixVar) {
        nufgyqmvbu.agtfadlqog(view, pkzmftpjixVar);
    }

    private static gxszxtbevo ikoacuggdj() {
        return new zoijcleaow(g1.ppxfxbqfkf.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static ViewParent iozdgvuglv(View view) {
        return view.getParentForAccessibility();
    }

    public static void ipoelvxyzq(View view, float f13) {
        nufgyqmvbu.rgvfuqvkyq(view, f13);
    }

    public static String[] istkbnxepw(View view) {
        return Build.VERSION.SDK_INT >= 31 ? ojitshcjhn.iobyxmoadg(view) : (String[]) view.getTag(g1.ppxfxbqfkf.tag_on_receive_content_mime_types);
    }

    public static boolean iwizpuwonk(View view) {
        return view.getFitsSystemWindows();
    }

    public static void iwxlajgraz(View view, int i13) {
        gtknphoqwx.zoijcleaow(view, i13);
    }

    private static gxszxtbevo ixidwrxhsl() {
        return new ppxfxbqfkf(g1.ppxfxbqfkf.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void iyctptxqzt(View view, CharSequence charSequence) {
        ikoacuggdj().gxszxtbevo(view, charSequence);
        if (charSequence != null) {
            f115140gxszxtbevo.iobyxmoadg(view);
        } else {
            f115140gxszxtbevo.wkgbmnqykc(view);
        }
    }

    public static void jhduphickx(View view, w1.zdlpuopuiu zdlpuopuiuVar) {
        view.onInitializeAccessibilityNodeInfo(zdlpuopuiuVar.f());
    }

    public static void jlmebxxoox(View view, int i13) {
        view.offsetLeftAndRight(i13);
    }

    public static int jpowsppfya(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void jrbgnlbqoe(View view) {
        nufgyqmvbu.oxmwwwfdhm(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static jpowsppfya jyumaefscl(View view) {
        return view instanceof jpowsppfya ? (jpowsppfya) view : f115139eablkybsjg;
    }

    public static v1.wkgbmnqykc jztzpxfvev(View view, v1.wkgbmnqykc wkgbmnqykcVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + wkgbmnqykcVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ojitshcjhn.zoijcleaow(view, wkgbmnqykcVar);
        }
        hcddaimhww hcddaimhwwVar = (hcddaimhww) view.getTag(g1.ppxfxbqfkf.tag_on_receive_content_listener);
        if (hcddaimhwwVar == null) {
            return jyumaefscl(view).onReceiveContent(wkgbmnqykcVar);
        }
        v1.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = hcddaimhwwVar.iobyxmoadg(view, wkgbmnqykcVar);
        if (wkgbmnqykcVarIobyxmoadg == null) {
            return null;
        }
        return jyumaefscl(view).onReceiveContent(wkgbmnqykcVarIobyxmoadg);
    }

    public static PorterDuff.Mode kcexrzcfyt(View view) {
        return nufgyqmvbu.wkgbmnqykc(view);
    }

    public static boolean kegysxyocb(View view) {
        return view.isAttachedToWindow();
    }

    public static int lereixgezr(View view) {
        return view.getLayoutDirection();
    }

    public static skhdrjzrfn lmojexxdyd(View view) {
        return dxjokdxxww.iobyxmoadg(view);
    }

    public static skhdrjzrfn lqeggnwhkg(View view, skhdrjzrfn skhdrjzrfnVar) {
        WindowInsets windowInsetsCqumvgiudr = skhdrjzrfnVar.cqumvgiudr();
        if (windowInsetsCqumvgiudr != null) {
            WindowInsets windowInsetsIobyxmoadg = lqeggnwhkg.iobyxmoadg(view, windowInsetsCqumvgiudr);
            if (!windowInsetsIobyxmoadg.equals(windowInsetsCqumvgiudr)) {
                return skhdrjzrfn.lereixgezr(windowInsetsIobyxmoadg, view);
            }
        }
        return skhdrjzrfnVar;
    }

    public static void lrnfpwlwnk(View view, ColorStateList colorStateList) {
        nufgyqmvbu.btonecajqb(view, colorStateList);
    }

    public static void lxfrhoxuzk(View view, int i13, int i14, int i15, int i16) {
        view.setPaddingRelative(i13, i14, i15, i16);
    }

    public static boolean mbcevpiqjq(View view) {
        return nufgyqmvbu.dxjokdxxww(view);
    }

    public static void metgxyhuhe(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void mhtqkkgtqm(View view, float f13) {
        nufgyqmvbu.vdvldrhtss(view, f13);
    }

    public static boolean ntlheqmsrt(View view) {
        return view.isPaddingRelative();
    }

    static boolean nufgyqmvbu(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return rgvfuqvkyq.iobyxmoadg(view).zoijcleaow(view, keyEvent);
    }

    public static void nuxfzjnpeb(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void oipsdeybqn(View view, v1.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null && (wflxmlrfwp(view) instanceof v1.iobyxmoadg.C2869iobyxmoadg)) {
            iobyxmoadgVar = new v1.iobyxmoadg();
        }
        auzgnhcxok(view);
        view.setAccessibilityDelegate(iobyxmoadgVar == null ? null : iobyxmoadgVar.wkgbmnqykc());
    }

    public static CharSequence ojitshcjhn(View view) {
        return (CharSequence) ikoacuggdj().eablkybsjg(view);
    }

    public static boolean okpsazkaxt(View view, int i13, Bundle bundle) {
        return view.performAccessibilityAction(i13, bundle);
    }

    public static void opjhrmiecq(View view, int i13) {
        view.setAccessibilityLiveRegion(i13);
    }

    public static ColorStateList oxmwwwfdhm(View view) {
        return nufgyqmvbu.ppxfxbqfkf(view);
    }

    public static float pkzmftpjix(View view) {
        return nufgyqmvbu.lqeggnwhkg(view);
    }

    public static int pmvmpeiblj(View view) {
        return view.getMinimumHeight();
    }

    public static int ppxfxbqfkf(View view, CharSequence charSequence, w1.iwizpuwonk iwizpuwonkVar) {
        int iVdvldrhtss = vdvldrhtss(view, charSequence);
        if (iVdvldrhtss != -1) {
            wkgbmnqykc(view, new w1.zdlpuopuiu.iobyxmoadg(iVdvldrhtss, charSequence, iwizpuwonkVar));
        }
        return iVdvldrhtss;
    }

    private static List rgvfuqvkyq(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(g1.ppxfxbqfkf.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(g1.ppxfxbqfkf.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void ribwqtqdhb(View view, int i13) {
        view.offsetTopAndBottom(i13);
    }

    public static void rlfsiqarku(View view, Runnable runnable, long j13) {
        view.postOnAnimationDelayed(runnable, j13);
    }

    public static void roivzttewh(View view, boolean z13) {
        view.setFitsSystemWindows(z13);
    }

    public static void sflfametgt(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i13, int i14) {
        if (Build.VERSION.SDK_INT >= 29) {
            wflxmlrfwp.zoijcleaow(view, context, iArr, attributeSet, typedArray, i13, i14);
        }
    }

    public static void skhdrjzrfn(View view, boolean z13) {
        nufgyqmvbu.wflxmlrfwp(view, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v1.wkgbmnqykc sopmlzcsov(v1.wkgbmnqykc wkgbmnqykcVar) {
        return wkgbmnqykcVar;
    }

    public static boolean stevsuqkhv(View view) {
        Boolean bool = (Boolean) zoijcleaow().eablkybsjg(view);
        return bool != null && bool.booleanValue();
    }

    public static void tbqsvytpvh(View view, float f13) {
        nufgyqmvbu.draadjrbmk(view, f13);
    }

    public static boolean tzroggbefp(View view) {
        return view.isLaidOut();
    }

    public static void uawqvzlxes(View view, int i13) {
        view.setImportantForAccessibility(i13);
    }

    public static boolean ulzqkzuiru(View view) {
        Boolean bool = (Boolean) zfvoamnweg().eablkybsjg(view);
        return bool != null && bool.booleanValue();
    }

    private static void uwvvkdfqfp(int i13, View view) {
        List listRgvfuqvkyq = rgvfuqvkyq(view);
        for (int i14 = 0; i14 < listRgvfuqvkyq.size(); i14++) {
            if (((w1.zdlpuopuiu.iobyxmoadg) listRgvfuqvkyq.get(i14)).zoijcleaow() == i13) {
                listRgvfuqvkyq.remove(i14);
                return;
            }
        }
    }

    private static int vdvldrhtss(View view, CharSequence charSequence) {
        List listRgvfuqvkyq = rgvfuqvkyq(view);
        for (int i13 = 0; i13 < listRgvfuqvkyq.size(); i13++) {
            if (TextUtils.equals(charSequence, ((w1.zdlpuopuiu.iobyxmoadg) listRgvfuqvkyq.get(i13)).ppxfxbqfkf())) {
                return ((w1.zdlpuopuiu.iobyxmoadg) listRgvfuqvkyq.get(i13)).zoijcleaow();
            }
        }
        int i14 = -1;
        int i15 = 0;
        while (true) {
            int[] iArr = f115143wkgbmnqykc;
            if (i15 >= iArr.length || i14 != -1) {
                break;
            }
            int i16 = iArr[i15];
            boolean z13 = true;
            for (int i17 = 0; i17 < listRgvfuqvkyq.size(); i17++) {
                z13 &= ((w1.zdlpuopuiu.iobyxmoadg) listRgvfuqvkyq.get(i17)).zoijcleaow() != i16;
            }
            if (z13) {
                i14 = i16;
            }
            i15++;
        }
        return i14;
    }

    public static skhdrjzrfn vipkmwdibw(View view, skhdrjzrfn skhdrjzrfnVar) {
        WindowInsets windowInsetsCqumvgiudr = skhdrjzrfnVar.cqumvgiudr();
        if (windowInsetsCqumvgiudr != null) {
            WindowInsets windowInsetsZoijcleaow = lqeggnwhkg.zoijcleaow(view, windowInsetsCqumvgiudr);
            if (!windowInsetsZoijcleaow.equals(windowInsetsCqumvgiudr)) {
                return skhdrjzrfn.lereixgezr(windowInsetsZoijcleaow, view);
            }
        }
        return skhdrjzrfnVar;
    }

    public static void weqkydbzbr(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    private static View.AccessibilityDelegate wflxmlrfwp(View view) {
        return Build.VERSION.SDK_INT >= 29 ? wflxmlrfwp.iobyxmoadg(view) : agtfadlqog(view);
    }

    public static void wizcaqwiak(View view, cllcsxoeiz cllcsxoeizVar) {
        btonecajqb.iobyxmoadg(view, (PointerIcon) (cllcsxoeizVar != null ? cllcsxoeizVar.iobyxmoadg() : null));
    }

    private static void wkgbmnqykc(View view, w1.zdlpuopuiu.iobyxmoadg iobyxmoadgVar) {
        btonecajqb(view);
        uwvvkdfqfp(iobyxmoadgVar.zoijcleaow(), view);
        rgvfuqvkyq(view).add(iobyxmoadgVar);
        crxdokpmqz(view, 0);
    }

    public static CharSequence wwaezpbzkn(View view) {
        return (CharSequence) ixidwrxhsl().eablkybsjg(view);
    }

    public static boolean wypolnanlu(View view) {
        return view.hasTransientState();
    }

    public static void xrmfcynszj(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int yadqdtsiqt(View view) {
        return view.getPaddingStart();
    }

    public static void ydmasvzmpa(View view) {
        lqeggnwhkg.ppxfxbqfkf(view);
    }

    public static void yfnezrywwk(View view, w1.zdlpuopuiu.iobyxmoadg iobyxmoadgVar, CharSequence charSequence, w1.iwizpuwonk iwizpuwonkVar) {
        if (iwizpuwonkVar == null && charSequence == null) {
            czzsidtyhn(view, iobyxmoadgVar.zoijcleaow());
        } else {
            wkgbmnqykc(view, iobyxmoadgVar.iobyxmoadg(charSequence, iwizpuwonkVar));
        }
    }

    public static float yggfygwlhe(View view) {
        return nufgyqmvbu.eablkybsjg(view);
    }

    public static String ylkuphrtab(View view) {
        return nufgyqmvbu.gxszxtbevo(view);
    }

    public static Display zdlpuopuiu(View view) {
        return view.getDisplay();
    }

    public static void zeieaojujs(View view, PorterDuff.Mode mode) {
        nufgyqmvbu.gtknphoqwx(view, mode);
    }

    private static gxszxtbevo zfvoamnweg() {
        return new iobyxmoadg(g1.ppxfxbqfkf.tag_screen_reader_focusable, Boolean.class, 28);
    }

    private static gxszxtbevo zoijcleaow() {
        return new wkgbmnqykc(g1.ppxfxbqfkf.tag_accessibility_heading, Boolean.class, 28);
    }

    public static int zynmafqrjb(View view) {
        return view.getMinimumWidth();
    }
}
