package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.mbcevpiqjq;
import androidx.appcompat.widget.ribwqtqdhb;
import androidx.appcompat.widget.vipkmwdibw;
import androidx.collection.jztzpxfvev;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import v1.jhduphickx;
import v1.pkzmftpjix;
import v1.sflfametgt;
import v1.skhdrjzrfn;
import v1.yfnezrywwk;

/* JADX INFO: loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.lqeggnwhkg implements androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private androidx.appcompat.app.kcexrzcfyt f2488auzgnhcxok;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private boolean f2489bfopjjpdmp;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    final Context f2490cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    androidx.appcompat.view.zoijcleaow f2491cllcsxoeiz;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private boolean f2492crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f2493czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    ActionBarContextView f2494dsvhmnatus;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private OnBackInvokedCallback f2495dvvnrvtcbc;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private androidx.appcompat.widget.esjtqupxsv f2496hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private kcexrzcfyt f2497hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    boolean f2498ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private agtfadlqog f2499iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    final Object f2500istkbnxepw;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private OnBackInvokedDispatcher f2501iwxlajgraz;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private rgvfuqvkyq f2502iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    boolean f2503jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private boolean f2504jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private nufgyqmvbu f2505jpowsppfya;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private boolean f2506jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    yfnezrywwk f2507kegysxyocb;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    final androidx.appcompat.app.eablkybsjg f2508lmojexxdyd;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    int f2509lrnfpwlwnk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private boolean f2510mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private PanelFeatureState f2511metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    ViewGroup f2512ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private boolean f2513nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private int f2514oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    boolean f2515okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private rgvfuqvkyq f2516opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private CharSequence f2517pkzmftpjix;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    boolean f2518ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private boolean f2519rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    private Rect f2520roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private int f2521sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private View f2522sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    Runnable f2523stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private Rect f2524tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private boolean f2525tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private androidx.appcompat.app.vdvldrhtss f2526uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private TextView f2527ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f2528uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    boolean f2529vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    boolean f2530weqkydbzbr;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    androidx.appcompat.app.iobyxmoadg f2531wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    PopupWindow f2532wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private PanelFeatureState[] f2533xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    Window f2534yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private Configuration f2535ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    boolean f2536yfnezrywwk;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    MenuInflater f2537ylkuphrtab;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private final Runnable f2538zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private int f2539zfvoamnweg;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    private static final jztzpxfvev f2486skhdrjzrfn = new jztzpxfvev();

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    private static final boolean f2484igdgnonuha = false;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    private static final int[] f2485lxfrhoxuzk = {R.attr.windowBackground};

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    private static final boolean f2487wizcaqwiak = !"robolectric".equals(Build.FINGERPRINT);

    protected static final class PanelFeatureState {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        boolean f2540agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        androidx.appcompat.view.menu.eablkybsjg f2541btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        Context f2542draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        View f2543dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f2544eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        androidx.appcompat.view.menu.ppxfxbqfkf f2545gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f2546gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f2547iobyxmoadg;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        Bundle f2548kcexrzcfyt;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        ViewGroup f2549lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        View f2550nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        boolean f2551ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        boolean f2552oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f2553ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        public boolean f2554rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        boolean f2555vdvldrhtss = false;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        boolean f2556wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f2557wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int f2558zoijcleaow;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new iobyxmoadg();

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            Bundle f2559jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            boolean f2560yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f2561zdlpuopuiu;

            class iobyxmoadg implements Parcelable.ClassLoaderCreator {
                iobyxmoadg() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.zoijcleaow(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i13) {
                    return new SavedState[i13];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.zoijcleaow(parcel, classLoader);
                }
            }

            SavedState() {
            }

            static SavedState zoijcleaow(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f2561zdlpuopuiu = parcel.readInt();
                boolean z13 = parcel.readInt() == 1;
                savedState.f2560yggfygwlhe = z13;
                if (z13) {
                    savedState.f2559jyumaefscl = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i13) {
                parcel.writeInt(this.f2561zdlpuopuiu);
                parcel.writeInt(this.f2560yggfygwlhe ? 1 : 0);
                if (this.f2560yggfygwlhe) {
                    parcel.writeBundle(this.f2559jyumaefscl);
                }
            }
        }

        PanelFeatureState(int i13) {
            this.f2547iobyxmoadg = i13;
        }

        androidx.appcompat.view.menu.gtknphoqwx iobyxmoadg(androidx.appcompat.view.menu.btonecajqb.iobyxmoadg iobyxmoadgVar) {
            if (this.f2541btonecajqb == null) {
                return null;
            }
            if (this.f2545gtknphoqwx == null) {
                androidx.appcompat.view.menu.ppxfxbqfkf ppxfxbqfkfVar = new androidx.appcompat.view.menu.ppxfxbqfkf(this.f2542draadjrbmk, lqeggnwhkg.lqeggnwhkg.abc_list_menu_item_layout);
                this.f2545gtknphoqwx = ppxfxbqfkfVar;
                ppxfxbqfkfVar.eablkybsjg(iobyxmoadgVar);
                this.f2541btonecajqb.zoijcleaow(this.f2545gtknphoqwx);
            }
            return this.f2545gtknphoqwx.zoijcleaow(this.f2549lqeggnwhkg);
        }

        void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            androidx.appcompat.view.menu.ppxfxbqfkf ppxfxbqfkfVar;
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar2 = this.f2541btonecajqb;
            if (eablkybsjgVar == eablkybsjgVar2) {
                return;
            }
            if (eablkybsjgVar2 != null) {
                eablkybsjgVar2.wypolnanlu(this.f2545gtknphoqwx);
            }
            this.f2541btonecajqb = eablkybsjgVar;
            if (eablkybsjgVar == null || (ppxfxbqfkfVar = this.f2545gtknphoqwx) == null) {
                return;
            }
            eablkybsjgVar.zoijcleaow(ppxfxbqfkfVar);
        }

        void wkgbmnqykc(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarPopupTheme, typedValue, true);
            int i13 = typedValue.resourceId;
            if (i13 != 0) {
                themeNewTheme.applyStyle(i13, true);
            }
            themeNewTheme.resolveAttribute(lqeggnwhkg.iobyxmoadg.panelMenuListTheme, typedValue, true);
            int i14 = typedValue.resourceId;
            if (i14 != 0) {
                themeNewTheme.applyStyle(i14, true);
            } else {
                themeNewTheme.applyStyle(lqeggnwhkg.dxjokdxxww.Theme_AppCompat_CompactMenu, true);
            }
            androidx.appcompat.view.wkgbmnqykc wkgbmnqykcVar = new androidx.appcompat.view.wkgbmnqykc(context, 0);
            wkgbmnqykcVar.getTheme().setTo(themeNewTheme);
            this.f2542draadjrbmk = wkgbmnqykcVar;
            TypedArray typedArrayObtainStyledAttributes = wkgbmnqykcVar.obtainStyledAttributes(lqeggnwhkg.btonecajqb.AppCompatTheme);
            this.f2558zoijcleaow = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AppCompatTheme_panelBackground, 0);
            this.f2546gxszxtbevo = typedArrayObtainStyledAttributes.getResourceId(lqeggnwhkg.btonecajqb.AppCompatTheme_android_windowAnimationStyle, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean zoijcleaow() {
            if (this.f2550nufgyqmvbu == null) {
                return false;
            }
            return this.f2543dxjokdxxww != null || this.f2545gtknphoqwx.iobyxmoadg().getCount() > 0;
        }
    }

    class agtfadlqog extends androidx.appcompat.view.dxjokdxxww {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private boolean f2562cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private boolean f2564iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private boolean f2565jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private lqeggnwhkg f2566yggfygwlhe;

        agtfadlqog(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f2564iwizpuwonk) {
                return iobyxmoadg().dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.yfnezrywwk(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.fyldjkxazc(keyEvent.getKeyCode(), keyEvent);
        }

        void eablkybsjg(lqeggnwhkg lqeggnwhkgVar) {
            this.f2566yggfygwlhe = lqeggnwhkgVar;
        }

        final ActionMode gxszxtbevo(ActionMode.Callback callback) {
            androidx.appcompat.view.gxszxtbevo.iobyxmoadg iobyxmoadgVar = new androidx.appcompat.view.gxszxtbevo.iobyxmoadg(AppCompatDelegateImpl.this.f2490cdpycssgdh, callback);
            androidx.appcompat.view.zoijcleaow zoijcleaowVarTzroggbefp = AppCompatDelegateImpl.this.tzroggbefp(iobyxmoadgVar);
            if (zoijcleaowVarTzroggbefp != null) {
                return iobyxmoadgVar.eablkybsjg(zoijcleaowVarTzroggbefp);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f2565jyumaefscl) {
                iobyxmoadg().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i13, Menu menu) {
            if (i13 != 0 || (menu instanceof androidx.appcompat.view.menu.eablkybsjg)) {
                return super.onCreatePanelMenu(i13, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public View onCreatePanelView(int i13) {
            View viewOnCreatePanelView;
            lqeggnwhkg lqeggnwhkgVar = this.f2566yggfygwlhe;
            return (lqeggnwhkgVar == null || (viewOnCreatePanelView = lqeggnwhkgVar.onCreatePanelView(i13)) == null) ? super.onCreatePanelView(i13) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public boolean onMenuOpened(int i13, Menu menu) {
            super.onMenuOpened(i13, menu);
            AppCompatDelegateImpl.this.mhtqkkgtqm(i13);
            return true;
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public void onPanelClosed(int i13, Menu menu) {
            if (this.f2562cqumvgiudr) {
                iobyxmoadg().onPanelClosed(i13, menu);
            } else {
                super.onPanelClosed(i13, menu);
                AppCompatDelegateImpl.this.ixidwrxhsl(i13);
            }
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public boolean onPreparePanel(int i13, View view, Menu menu) {
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = menu instanceof androidx.appcompat.view.menu.eablkybsjg ? (androidx.appcompat.view.menu.eablkybsjg) menu : null;
            if (i13 == 0 && eablkybsjgVar == null) {
                return false;
            }
            if (eablkybsjgVar != null) {
                eablkybsjgVar.jhduphickx(true);
            }
            lqeggnwhkg lqeggnwhkgVar = this.f2566yggfygwlhe;
            boolean zOnPreparePanel = lqeggnwhkgVar != null && lqeggnwhkgVar.iobyxmoadg(i13);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i13, view, menu);
            }
            if (eablkybsjgVar != null) {
                eablkybsjgVar.jhduphickx(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i13) {
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar;
            PanelFeatureState panelFeatureStateTbqsvytpvh = AppCompatDelegateImpl.this.tbqsvytpvh(0, true);
            if (panelFeatureStateTbqsvytpvh == null || (eablkybsjgVar = panelFeatureStateTbqsvytpvh.f2541btonecajqb) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i13);
            } else {
                super.onProvideKeyboardShortcuts(list, eablkybsjgVar, i13);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public void ppxfxbqfkf(Window.Callback callback) {
            try {
                this.f2565jyumaefscl = true;
                callback.onContentChanged();
            } finally {
                this.f2565jyumaefscl = false;
            }
        }

        public void wkgbmnqykc(Window.Callback callback, int i13, Menu menu) {
            try {
                this.f2562cqumvgiudr = true;
                callback.onPanelClosed(i13, menu);
            } finally {
                this.f2562cqumvgiudr = false;
            }
        }

        public boolean zoijcleaow(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f2564iwizpuwonk = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f2564iwizpuwonk = false;
            }
        }

        @Override // androidx.appcompat.view.dxjokdxxww, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i13) {
            return (AppCompatDelegateImpl.this.lxfrhoxuzk() && i13 == 0) ? gxszxtbevo(callback) : super.onWindowStartingActionMode(callback, i13);
        }
    }

    static class btonecajqb {
        static boolean iobyxmoadg(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String zoijcleaow(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class draadjrbmk {
        static void iobyxmoadg(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i13 = configuration.colorMode & 3;
            int i14 = configuration2.colorMode;
            if (i13 != (i14 & 3)) {
                configuration3.colorMode |= i14 & 3;
            }
            int i15 = configuration.colorMode & 12;
            int i16 = configuration2.colorMode;
            if (i15 != (i16 & 12)) {
                configuration3.colorMode |= i16 & 12;
            }
        }
    }

    class dxjokdxxww implements androidx.appcompat.view.zoijcleaow.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private androidx.appcompat.view.zoijcleaow.iobyxmoadg f2567iobyxmoadg;

        class iobyxmoadg extends sflfametgt {
            iobyxmoadg() {
            }

            @Override // v1.ydmasvzmpa
            public void zoijcleaow(View view) {
                AppCompatDelegateImpl.this.f2494dsvhmnatus.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f2532wypolnanlu;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f2494dsvhmnatus.getParent() instanceof View) {
                    jhduphickx.ydmasvzmpa((View) AppCompatDelegateImpl.this.f2494dsvhmnatus.getParent());
                }
                AppCompatDelegateImpl.this.f2494dsvhmnatus.gtknphoqwx();
                AppCompatDelegateImpl.this.f2507kegysxyocb.nufgyqmvbu(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f2507kegysxyocb = null;
                jhduphickx.ydmasvzmpa(appCompatDelegateImpl2.f2512ntlheqmsrt);
            }
        }

        public dxjokdxxww(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
            this.f2567iobyxmoadg = iobyxmoadgVar;
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public void iobyxmoadg(androidx.appcompat.view.zoijcleaow zoijcleaowVar) {
            this.f2567iobyxmoadg.iobyxmoadg(zoijcleaowVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f2532wypolnanlu != null) {
                appCompatDelegateImpl.f2534yadqdtsiqt.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f2523stevsuqkhv);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f2494dsvhmnatus != null) {
                appCompatDelegateImpl2.sflfametgt();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f2507kegysxyocb = jhduphickx.eablkybsjg(appCompatDelegateImpl3.f2494dsvhmnatus).zoijcleaow(0.0f);
                AppCompatDelegateImpl.this.f2507kegysxyocb.nufgyqmvbu(new iobyxmoadg());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            androidx.appcompat.app.eablkybsjg eablkybsjgVar = appCompatDelegateImpl4.f2508lmojexxdyd;
            if (eablkybsjgVar != null) {
                eablkybsjgVar.onSupportActionModeFinished(appCompatDelegateImpl4.f2491cllcsxoeiz);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f2491cllcsxoeiz = null;
            jhduphickx.ydmasvzmpa(appCompatDelegateImpl5.f2512ntlheqmsrt);
            AppCompatDelegateImpl.this.k();
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public boolean ppxfxbqfkf(androidx.appcompat.view.zoijcleaow zoijcleaowVar, MenuItem menuItem) {
            return this.f2567iobyxmoadg.ppxfxbqfkf(zoijcleaowVar, menuItem);
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public boolean wkgbmnqykc(androidx.appcompat.view.zoijcleaow zoijcleaowVar, Menu menu) {
            jhduphickx.ydmasvzmpa(AppCompatDelegateImpl.this.f2512ntlheqmsrt);
            return this.f2567iobyxmoadg.wkgbmnqykc(zoijcleaowVar, menu);
        }

        @Override // androidx.appcompat.view.zoijcleaow.iobyxmoadg
        public boolean zoijcleaow(androidx.appcompat.view.zoijcleaow zoijcleaowVar, Menu menu) {
            return this.f2567iobyxmoadg.zoijcleaow(zoijcleaowVar, menu);
        }
    }

    class eablkybsjg extends sflfametgt {
        eablkybsjg() {
        }

        @Override // v1.sflfametgt, v1.ydmasvzmpa
        public void ppxfxbqfkf(View view) {
            AppCompatDelegateImpl.this.f2494dsvhmnatus.setVisibility(0);
            if (AppCompatDelegateImpl.this.f2494dsvhmnatus.getParent() instanceof View) {
                jhduphickx.ydmasvzmpa((View) AppCompatDelegateImpl.this.f2494dsvhmnatus.getParent());
            }
        }

        @Override // v1.ydmasvzmpa
        public void zoijcleaow(View view) {
            AppCompatDelegateImpl.this.f2494dsvhmnatus.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f2507kegysxyocb.nufgyqmvbu(null);
            AppCompatDelegateImpl.this.f2507kegysxyocb = null;
        }
    }

    static class gtknphoqwx {
        static void iobyxmoadg(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static void ppxfxbqfkf(q1.nufgyqmvbu nufgyqmvbuVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(nufgyqmvbuVar.lqeggnwhkg()));
        }

        static void wkgbmnqykc(Configuration configuration, q1.nufgyqmvbu nufgyqmvbuVar) {
            configuration.setLocales(LocaleList.forLanguageTags(nufgyqmvbuVar.lqeggnwhkg()));
        }

        static q1.nufgyqmvbu zoijcleaow(Configuration configuration) {
            return q1.nufgyqmvbu.zoijcleaow(configuration.getLocales().toLanguageTags());
        }
    }

    private class gxszxtbevo implements androidx.appcompat.app.zoijcleaow {
        gxszxtbevo() {
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f2509lrnfpwlwnk & 1) != 0) {
                appCompatDelegateImpl.ydmasvzmpa(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f2509lrnfpwlwnk & 4096) != 0) {
                appCompatDelegateImpl2.ydmasvzmpa(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f2530weqkydbzbr = false;
            appCompatDelegateImpl3.f2509lrnfpwlwnk = 0;
        }
    }

    private final class kcexrzcfyt implements androidx.appcompat.view.menu.btonecajqb.iobyxmoadg {
        kcexrzcfyt() {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, boolean z13) {
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVarCdpycssgdh = eablkybsjgVar.cdpycssgdh();
            boolean z14 = eablkybsjgVarCdpycssgdh != eablkybsjgVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z14) {
                eablkybsjgVar = eablkybsjgVarCdpycssgdh;
            }
            PanelFeatureState panelFeatureStateBfopjjpdmp = appCompatDelegateImpl.bfopjjpdmp(eablkybsjgVar);
            if (panelFeatureStateBfopjjpdmp != null) {
                if (!z14) {
                    AppCompatDelegateImpl.this.xrmfcynszj(panelFeatureStateBfopjjpdmp, z13);
                } else {
                    AppCompatDelegateImpl.this.jhduphickx(panelFeatureStateBfopjjpdmp.f2547iobyxmoadg, panelFeatureStateBfopjjpdmp, eablkybsjgVarCdpycssgdh);
                    AppCompatDelegateImpl.this.xrmfcynszj(panelFeatureStateBfopjjpdmp, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public boolean wkgbmnqykc(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            Window.Callback callbackUawqvzlxes;
            if (eablkybsjgVar != eablkybsjgVar.cdpycssgdh()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f2518ribwqtqdhb || (callbackUawqvzlxes = appCompatDelegateImpl.uawqvzlxes()) == null || AppCompatDelegateImpl.this.f2536yfnezrywwk) {
                return true;
            }
            callbackUawqvzlxes.onMenuOpened(108, eablkybsjgVar);
            return true;
        }
    }

    interface lqeggnwhkg {
        boolean iobyxmoadg(int i13);

        View onCreatePanelView(int i13);
    }

    private final class nufgyqmvbu implements androidx.appcompat.view.menu.btonecajqb.iobyxmoadg {
        nufgyqmvbu() {
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public void ppxfxbqfkf(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, boolean z13) {
            AppCompatDelegateImpl.this.ikoacuggdj(eablkybsjgVar);
        }

        @Override // androidx.appcompat.view.menu.btonecajqb.iobyxmoadg
        public boolean wkgbmnqykc(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
            Window.Callback callbackUawqvzlxes = AppCompatDelegateImpl.this.uawqvzlxes();
            if (callbackUawqvzlxes == null) {
                return true;
            }
            callbackUawqvzlxes.onMenuOpened(108, eablkybsjgVar);
            return true;
        }
    }

    private class ojitshcjhn extends rgvfuqvkyq {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final PowerManager f2575ppxfxbqfkf;

        ojitshcjhn(Context context) {
            super();
            this.f2575ppxfxbqfkf = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.rgvfuqvkyq
        public int ppxfxbqfkf() {
            return btonecajqb.iobyxmoadg(this.f2575ppxfxbqfkf) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.rgvfuqvkyq
        public void wkgbmnqykc() {
            AppCompatDelegateImpl.this.gxszxtbevo();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.rgvfuqvkyq
        IntentFilter zoijcleaow() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    private class oxmwwwfdhm extends ContentFrameLayout {
        public oxmwwwfdhm(Context context) {
            super(context);
        }

        private boolean zoijcleaow(int i13, int i14) {
            return i13 < -5 || i14 < -5 || i13 > getWidth() + 5 || i14 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.yfnezrywwk(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !zoijcleaow((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.jztzpxfvev(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i13) {
            setBackgroundDrawable(nufgyqmvbu.iobyxmoadg.zoijcleaow(getContext(), i13));
        }
    }

    class ppxfxbqfkf implements ContentFrameLayout.iobyxmoadg {
        ppxfxbqfkf() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.iobyxmoadg
        public void iobyxmoadg() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.iobyxmoadg
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.uwvvkdfqfp();
        }
    }

    abstract class rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private BroadcastReceiver f2579iobyxmoadg;

        class iobyxmoadg extends BroadcastReceiver {
            iobyxmoadg() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                rgvfuqvkyq.this.wkgbmnqykc();
            }
        }

        rgvfuqvkyq() {
        }

        void eablkybsjg() {
            iobyxmoadg();
            IntentFilter intentFilterZoijcleaow = zoijcleaow();
            if (intentFilterZoijcleaow == null || intentFilterZoijcleaow.countActions() == 0) {
                return;
            }
            if (this.f2579iobyxmoadg == null) {
                this.f2579iobyxmoadg = new iobyxmoadg();
            }
            AppCompatDelegateImpl.this.f2490cdpycssgdh.registerReceiver(this.f2579iobyxmoadg, intentFilterZoijcleaow);
        }

        void iobyxmoadg() {
            BroadcastReceiver broadcastReceiver = this.f2579iobyxmoadg;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f2490cdpycssgdh.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2579iobyxmoadg = null;
            }
        }

        abstract int ppxfxbqfkf();

        abstract void wkgbmnqykc();

        abstract IntentFilter zoijcleaow();
    }

    private class vdvldrhtss extends rgvfuqvkyq {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final cqumvgiudr f2582ppxfxbqfkf;

        vdvldrhtss(cqumvgiudr cqumvgiudrVar) {
            super();
            this.f2582ppxfxbqfkf = cqumvgiudrVar;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.rgvfuqvkyq
        public int ppxfxbqfkf() {
            return this.f2582ppxfxbqfkf.wkgbmnqykc() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.rgvfuqvkyq
        public void wkgbmnqykc() {
            AppCompatDelegateImpl.this.gxszxtbevo();
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.rgvfuqvkyq
        IntentFilter zoijcleaow() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    static class wflxmlrfwp {
        static OnBackInvokedDispatcher iobyxmoadg(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static void ppxfxbqfkf(Object obj, Object obj2) {
            androidx.appcompat.app.btonecajqb.iobyxmoadg(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.dxjokdxxww.iobyxmoadg(obj2));
        }

        static OnBackInvokedCallback zoijcleaow(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.agtfadlqog
                public final void onBackInvoked() {
                    appCompatDelegateImpl.hszhottldk();
                }
            };
            androidx.appcompat.app.btonecajqb.iobyxmoadg(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }
    }

    class wkgbmnqykc implements Runnable {

        class iobyxmoadg extends sflfametgt {
            iobyxmoadg() {
            }

            @Override // v1.sflfametgt, v1.ydmasvzmpa
            public void ppxfxbqfkf(View view) {
                AppCompatDelegateImpl.this.f2494dsvhmnatus.setVisibility(0);
            }

            @Override // v1.ydmasvzmpa
            public void zoijcleaow(View view) {
                AppCompatDelegateImpl.this.f2494dsvhmnatus.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f2507kegysxyocb.nufgyqmvbu(null);
                AppCompatDelegateImpl.this.f2507kegysxyocb = null;
            }
        }

        wkgbmnqykc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f2532wypolnanlu.showAtLocation(appCompatDelegateImpl.f2494dsvhmnatus, 55, 0, 0);
            AppCompatDelegateImpl.this.sflfametgt();
            if (!AppCompatDelegateImpl.this.c()) {
                AppCompatDelegateImpl.this.f2494dsvhmnatus.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f2494dsvhmnatus.setVisibility(0);
            } else {
                AppCompatDelegateImpl.this.f2494dsvhmnatus.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f2507kegysxyocb = jhduphickx.eablkybsjg(appCompatDelegateImpl2.f2494dsvhmnatus).zoijcleaow(1.0f);
                AppCompatDelegateImpl.this.f2507kegysxyocb.nufgyqmvbu(new iobyxmoadg());
            }
        }
    }

    class zoijcleaow implements pkzmftpjix {
        zoijcleaow() {
        }

        @Override // v1.pkzmftpjix
        public skhdrjzrfn iobyxmoadg(View view, skhdrjzrfn skhdrjzrfnVar) {
            int iWflxmlrfwp = skhdrjzrfnVar.wflxmlrfwp();
            int iM = AppCompatDelegateImpl.this.m(skhdrjzrfnVar, null);
            if (iWflxmlrfwp != iM) {
                skhdrjzrfnVar = skhdrjzrfnVar.kcexrzcfyt(skhdrjzrfnVar.gtknphoqwx(), iM, skhdrjzrfnVar.draadjrbmk(), skhdrjzrfnVar.btonecajqb());
            }
            return jhduphickx.vipkmwdibw(view, skhdrjzrfnVar);
        }
    }

    AppCompatDelegateImpl(Activity activity, androidx.appcompat.app.eablkybsjg eablkybsjgVar) {
        this(activity, null, eablkybsjgVar, activity);
    }

    private boolean ageimvtcrz(int i13, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(i13, true);
        if (panelFeatureStateTbqsvytpvh.f2551ojitshcjhn) {
            return false;
        }
        return yzdjzghtvl(panelFeatureStateTbqsvytpvh, keyEvent);
    }

    private void auzgnhcxok() {
        zfvoamnweg();
        if (this.f2518ribwqtqdhb && this.f2531wwaezpbzkn == null) {
            Object obj = this.f2500istkbnxepw;
            if (obj instanceof Activity) {
                this.f2531wwaezpbzkn = new esjtqupxsv((Activity) this.f2500istkbnxepw, this.f2529vipkmwdibw);
            } else if (obj instanceof Dialog) {
                this.f2531wwaezpbzkn = new esjtqupxsv((Dialog) this.f2500istkbnxepw);
            }
            androidx.appcompat.app.iobyxmoadg iobyxmoadgVar = this.f2531wwaezpbzkn;
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.oxmwwwfdhm(this.f2513nuxfzjnpeb);
            }
        }
    }

    private void crxdokpmqz() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f2512ntlheqmsrt.findViewById(R.id.content);
        View decorView = this.f2534yadqdtsiqt.getDecorView();
        contentFrameLayout.iobyxmoadg(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f2490cdpycssgdh.obtainStyledAttributes(lqeggnwhkg.btonecajqb.AppCompatTheme);
        typedArrayObtainStyledAttributes.getValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes.getValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes.getValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes.getValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes.getValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private boolean d(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f2534yadqdtsiqt.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean dvvnrvtcbc(PanelFeatureState panelFeatureState) {
        panelFeatureState.wkgbmnqykc(iyctptxqzt());
        panelFeatureState.f2549lqeggnwhkg = new oxmwwwfdhm(panelFeatureState.f2542draadjrbmk);
        panelFeatureState.f2553ppxfxbqfkf = 81;
        return true;
    }

    private void eslsurpljm(boolean z13) {
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar = this.f2496hcddaimhww;
        if (esjtqupxsvVar == null || !esjtqupxsvVar.iobyxmoadg() || (ViewConfiguration.get(this.f2490cdpycssgdh).hasPermanentMenuKey() && !this.f2496hcddaimhww.lqeggnwhkg())) {
            PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(0, true);
            panelFeatureStateTbqsvytpvh.f2555vdvldrhtss = true;
            xrmfcynszj(panelFeatureStateTbqsvytpvh, false);
            fmlbqenlif(panelFeatureStateTbqsvytpvh, null);
            return;
        }
        Window.Callback callbackUawqvzlxes = uawqvzlxes();
        if (this.f2496hcddaimhww.eablkybsjg() && z13) {
            this.f2496hcddaimhww.zoijcleaow();
            if (this.f2536yfnezrywwk) {
                return;
            }
            callbackUawqvzlxes.onPanelClosed(108, tbqsvytpvh(0, true).f2541btonecajqb);
            return;
        }
        if (callbackUawqvzlxes == null || this.f2536yfnezrywwk) {
            return;
        }
        if (this.f2530weqkydbzbr && (this.f2509lrnfpwlwnk & 1) != 0) {
            this.f2534yadqdtsiqt.getDecorView().removeCallbacks(this.f2538zeieaojujs);
            this.f2538zeieaojujs.run();
        }
        PanelFeatureState panelFeatureStateTbqsvytpvh2 = tbqsvytpvh(0, true);
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = panelFeatureStateTbqsvytpvh2.f2541btonecajqb;
        if (eablkybsjgVar == null || panelFeatureStateTbqsvytpvh2.f2552oxmwwwfdhm || !callbackUawqvzlxes.onPreparePanel(0, panelFeatureStateTbqsvytpvh2.f2543dxjokdxxww, eablkybsjgVar)) {
            return;
        }
        callbackUawqvzlxes.onMenuOpened(108, panelFeatureStateTbqsvytpvh2.f2541btonecajqb);
        this.f2496hcddaimhww.ppxfxbqfkf();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    private void fmlbqenlif(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i13;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.f2551ojitshcjhn || this.f2536yfnezrywwk) {
            return;
        }
        if (panelFeatureState.f2547iobyxmoadg == 0 && (this.f2490cdpycssgdh.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackUawqvzlxes = uawqvzlxes();
        if (callbackUawqvzlxes != null && !callbackUawqvzlxes.onMenuOpened(panelFeatureState.f2547iobyxmoadg, panelFeatureState.f2541btonecajqb)) {
            xrmfcynszj(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2490cdpycssgdh.getSystemService("window");
        if (windowManager != null && yzdjzghtvl(panelFeatureState, keyEvent)) {
            ViewGroup viewGroup = panelFeatureState.f2549lqeggnwhkg;
            if (viewGroup != null && !panelFeatureState.f2555vdvldrhtss) {
                View view = panelFeatureState.f2543dxjokdxxww;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i13 = -1;
                }
                panelFeatureState.f2540agtfadlqog = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i13, -2, panelFeatureState.f2557wkgbmnqykc, panelFeatureState.f2544eablkybsjg, 1002, 8519680, -3);
                layoutParams2.gravity = panelFeatureState.f2553ppxfxbqfkf;
                layoutParams2.windowAnimations = panelFeatureState.f2546gxszxtbevo;
                windowManager.addView(panelFeatureState.f2549lqeggnwhkg, layoutParams2);
                panelFeatureState.f2551ojitshcjhn = true;
                if (panelFeatureState.f2547iobyxmoadg == 0) {
                    k();
                }
            }
            if (viewGroup == null) {
                if (!dvvnrvtcbc(panelFeatureState) || panelFeatureState.f2549lqeggnwhkg == null) {
                    return;
                }
            } else if (panelFeatureState.f2555vdvldrhtss && viewGroup.getChildCount() > 0) {
                panelFeatureState.f2549lqeggnwhkg.removeAllViews();
            }
            if (!iwxlajgraz(panelFeatureState) || !panelFeatureState.zoijcleaow()) {
                panelFeatureState.f2555vdvldrhtss = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f2550nufgyqmvbu.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            panelFeatureState.f2549lqeggnwhkg.setBackgroundResource(panelFeatureState.f2558zoijcleaow);
            ViewParent parent = panelFeatureState.f2550nufgyqmvbu.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(panelFeatureState.f2550nufgyqmvbu);
            }
            panelFeatureState.f2549lqeggnwhkg.addView(panelFeatureState.f2550nufgyqmvbu, layoutParams3);
            if (!panelFeatureState.f2550nufgyqmvbu.hasFocus()) {
                panelFeatureState.f2550nufgyqmvbu.requestFocus();
            }
            i13 = -2;
            panelFeatureState.f2540agtfadlqog = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i13, -2, panelFeatureState.f2557wkgbmnqykc, panelFeatureState.f2544eablkybsjg, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f2553ppxfxbqfkf;
            layoutParams4.windowAnimations = panelFeatureState.f2546gxszxtbevo;
            windowManager.addView(panelFeatureState.f2549lqeggnwhkg, layoutParams4);
            panelFeatureState.f2551ojitshcjhn = true;
            if (panelFeatureState.f2547iobyxmoadg == 0) {
                k();
            }
        }
    }

    private void g() {
        if (this.f2510mbcevpiqjq) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean grlcpdaxtj(int i13, KeyEvent keyEvent) {
        boolean zYzdjzghtvl;
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar;
        if (this.f2491cllcsxoeiz != null) {
            return false;
        }
        boolean zZoijcleaow = true;
        PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(i13, true);
        if (i13 != 0 || (esjtqupxsvVar = this.f2496hcddaimhww) == null || !esjtqupxsvVar.iobyxmoadg() || ViewConfiguration.get(this.f2490cdpycssgdh).hasPermanentMenuKey()) {
            boolean z13 = panelFeatureStateTbqsvytpvh.f2551ojitshcjhn;
            if (z13 || panelFeatureStateTbqsvytpvh.f2540agtfadlqog) {
                xrmfcynszj(panelFeatureStateTbqsvytpvh, true);
                zZoijcleaow = z13;
            } else if (panelFeatureStateTbqsvytpvh.f2556wflxmlrfwp) {
                if (panelFeatureStateTbqsvytpvh.f2552oxmwwwfdhm) {
                    panelFeatureStateTbqsvytpvh.f2556wflxmlrfwp = false;
                    zYzdjzghtvl = yzdjzghtvl(panelFeatureStateTbqsvytpvh, keyEvent);
                } else {
                    zYzdjzghtvl = true;
                }
                if (zYzdjzghtvl) {
                    fmlbqenlif(panelFeatureStateTbqsvytpvh, keyEvent);
                } else {
                    zZoijcleaow = false;
                }
            } else {
                zZoijcleaow = false;
            }
        } else if (this.f2496hcddaimhww.eablkybsjg()) {
            zZoijcleaow = this.f2496hcddaimhww.zoijcleaow();
        } else if (this.f2536yfnezrywwk || !yzdjzghtvl(panelFeatureStateTbqsvytpvh, keyEvent)) {
            zZoijcleaow = false;
        } else {
            zZoijcleaow = this.f2496hcddaimhww.ppxfxbqfkf();
        }
        if (zZoijcleaow) {
            AudioManager audioManager = (AudioManager) this.f2490cdpycssgdh.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zZoijcleaow;
    }

    private androidx.appcompat.app.wkgbmnqykc h() {
        for (Context baseContext = this.f2490cdpycssgdh; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.wkgbmnqykc) {
                return (androidx.appcompat.app.wkgbmnqykc) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i(Configuration configuration) {
        Activity activity = (Activity) this.f2500istkbnxepw;
        if (activity instanceof androidx.lifecycle.vdvldrhtss) {
            if (((androidx.lifecycle.vdvldrhtss) activity).getLifecycle().zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f2528uwvvkdfqfp || this.f2536yfnezrywwk) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    private void igdgnonuha(int i13) {
        this.f2509lrnfpwlwnk = (1 << i13) | this.f2509lrnfpwlwnk;
        if (this.f2530weqkydbzbr) {
            return;
        }
        jhduphickx.metgxyhuhe(this.f2534yadqdtsiqt.getDecorView(), this.f2538zeieaojujs);
        this.f2530weqkydbzbr = true;
    }

    private boolean iwxlajgraz(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f2543dxjokdxxww;
        if (view != null) {
            panelFeatureState.f2550nufgyqmvbu = view;
            return true;
        }
        if (panelFeatureState.f2541btonecajqb == null) {
            return false;
        }
        if (this.f2497hkdspvbjdz == null) {
            this.f2497hkdspvbjdz = new kcexrzcfyt();
        }
        View view2 = (View) panelFeatureState.iobyxmoadg(this.f2497hkdspvbjdz);
        panelFeatureState.f2550nufgyqmvbu = view2;
        return view2 != null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    private boolean j(int i13, q1.nufgyqmvbu nufgyqmvbuVar, boolean z13) {
        boolean z14;
        Configuration configurationMetgxyhuhe = metgxyhuhe(this.f2490cdpycssgdh, i13, nufgyqmvbuVar, null, false);
        int iWeqkydbzbr = weqkydbzbr(this.f2490cdpycssgdh);
        Configuration configuration = this.f2535ydmasvzmpa;
        if (configuration == null) {
            configuration = this.f2490cdpycssgdh.getResources().getConfiguration();
        }
        int i14 = configuration.uiMode & 48;
        int i15 = configurationMetgxyhuhe.uiMode & 48;
        q1.nufgyqmvbu nufgyqmvbuVarNuxfzjnpeb = nuxfzjnpeb(configuration);
        q1.nufgyqmvbu nufgyqmvbuVarNuxfzjnpeb2 = nufgyqmvbuVar == null ? null : nuxfzjnpeb(configurationMetgxyhuhe);
        int i16 = i14 != i15 ? UserVerificationMethods.USER_VERIFY_NONE : 0;
        if (nufgyqmvbuVarNuxfzjnpeb2 != null && !nufgyqmvbuVarNuxfzjnpeb.equals(nufgyqmvbuVarNuxfzjnpeb2)) {
            i16 |= 8196;
        }
        boolean z15 = true;
        if (((~iWeqkydbzbr) & i16) != 0 && z13 && this.f2493czzsidtyhn && (f2487wizcaqwiak || this.f2528uwvvkdfqfp)) {
            Object obj = this.f2500istkbnxepw;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z14 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i16 & 8192) != 0) {
                    ((Activity) this.f2500istkbnxepw).getWindow().getDecorView().setLayoutDirection(configurationMetgxyhuhe.getLayoutDirection());
                }
                androidx.core.app.zoijcleaow.gxszxtbevo((Activity) this.f2500istkbnxepw);
                z14 = true;
            }
        } else {
            z14 = false;
        }
        if (z14 || i16 == 0) {
            z15 = z14;
        } else {
            l(i15, nufgyqmvbuVarNuxfzjnpeb2, (i16 & iWeqkydbzbr) == i16, null);
        }
        if (z15) {
            Object obj2 = this.f2500istkbnxepw;
            if (obj2 instanceof androidx.appcompat.app.wkgbmnqykc) {
                if ((i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    ((androidx.appcompat.app.wkgbmnqykc) obj2).onNightModeChanged(i13);
                }
                if ((i16 & 4) != 0) {
                    ((androidx.appcompat.app.wkgbmnqykc) this.f2500istkbnxepw).onLocalesChanged(nufgyqmvbuVar);
                }
            }
        }
        if (nufgyqmvbuVarNuxfzjnpeb2 != null) {
            b(nuxfzjnpeb(this.f2490cdpycssgdh.getResources().getConfiguration()));
        }
        return z15;
    }

    private void jlmebxxoox(Window window) {
        if (this.f2534yadqdtsiqt != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof agtfadlqog) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        agtfadlqog agtfadlqogVar = new agtfadlqog(callback);
        this.f2499iozdgvuglv = agtfadlqogVar;
        window.setCallback(agtfadlqogVar);
        mbcevpiqjq mbcevpiqjqVarYggfygwlhe = mbcevpiqjq.yggfygwlhe(this.f2490cdpycssgdh, null, f2485lxfrhoxuzk);
        Drawable drawableNufgyqmvbu = mbcevpiqjqVarYggfygwlhe.nufgyqmvbu(0);
        if (drawableNufgyqmvbu != null) {
            window.setBackgroundDrawable(drawableNufgyqmvbu);
        }
        mbcevpiqjqVarYggfygwlhe.cqumvgiudr();
        this.f2534yadqdtsiqt = window;
        if (Build.VERSION.SDK_INT < 33 || this.f2501iwxlajgraz != null) {
            return;
        }
        dsvhmnatus(null);
    }

    private int krqnebusok(int i13) {
        if (i13 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i13 != 9) {
            return i13;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private void l(int i13, q1.nufgyqmvbu nufgyqmvbuVar, boolean z13, Configuration configuration) {
        Resources resources = this.f2490cdpycssgdh.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i13 | (resources.getConfiguration().uiMode & (-49));
        if (nufgyqmvbuVar != null) {
            a(configuration2, nufgyqmvbuVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i14 = this.f2539zfvoamnweg;
        if (i14 != 0) {
            this.f2490cdpycssgdh.setTheme(i14);
            this.f2490cdpycssgdh.getTheme().applyStyle(this.f2539zfvoamnweg, true);
        }
        if (z13 && (this.f2500istkbnxepw instanceof Activity)) {
            i(configuration2);
        }
    }

    private rgvfuqvkyq lrnfpwlwnk(Context context) {
        if (this.f2502iyctptxqzt == null) {
            this.f2502iyctptxqzt = new ojitshcjhn(context);
        }
        return this.f2502iyctptxqzt;
    }

    private Configuration metgxyhuhe(Context context, int i13, q1.nufgyqmvbu nufgyqmvbuVar, Configuration configuration, boolean z13) {
        int i14;
        if (i13 == 1) {
            i14 = 16;
        } else if (i13 != 2) {
            i14 = z13 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i14 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i14 | (configuration2.uiMode & (-49));
        if (nufgyqmvbuVar != null) {
            a(configuration2, nufgyqmvbuVar);
        }
        return configuration2;
    }

    private void n(View view) {
        view.setBackgroundColor((jhduphickx.jpowsppfya(view) & 8192) != 0 ? androidx.core.content.iobyxmoadg.getColor(this.f2490cdpycssgdh, lqeggnwhkg.ppxfxbqfkf.abc_decor_view_status_guard_light) : androidx.core.content.iobyxmoadg.getColor(this.f2490cdpycssgdh, lqeggnwhkg.ppxfxbqfkf.abc_decor_view_status_guard));
    }

    private void oipsdeybqn() {
        if (this.f2534yadqdtsiqt == null) {
            Object obj = this.f2500istkbnxepw;
            if (obj instanceof Activity) {
                jlmebxxoox(((Activity) obj).getWindow());
            }
        }
        if (this.f2534yadqdtsiqt == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void okpsazkaxt() {
        rgvfuqvkyq rgvfuqvkyqVar = this.f2516opjhrmiecq;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.iobyxmoadg();
        }
        rgvfuqvkyq rgvfuqvkyqVar2 = this.f2502iyctptxqzt;
        if (rgvfuqvkyqVar2 != null) {
            rgvfuqvkyqVar2.iobyxmoadg();
        }
    }

    private static Configuration opjhrmiecq(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f13 = configuration.fontScale;
            float f14 = configuration2.fontScale;
            if (f13 != f14) {
                configuration3.fontScale = f14;
            }
            int i13 = configuration.mcc;
            int i14 = configuration2.mcc;
            if (i13 != i14) {
                configuration3.mcc = i14;
            }
            int i15 = configuration.mnc;
            int i16 = configuration2.mnc;
            if (i15 != i16) {
                configuration3.mnc = i16;
            }
            gtknphoqwx.iobyxmoadg(configuration, configuration2, configuration3);
            int i17 = configuration.touchscreen;
            int i18 = configuration2.touchscreen;
            if (i17 != i18) {
                configuration3.touchscreen = i18;
            }
            int i19 = configuration.keyboard;
            int i23 = configuration2.keyboard;
            if (i19 != i23) {
                configuration3.keyboard = i23;
            }
            int i24 = configuration.keyboardHidden;
            int i25 = configuration2.keyboardHidden;
            if (i24 != i25) {
                configuration3.keyboardHidden = i25;
            }
            int i26 = configuration.navigation;
            int i27 = configuration2.navigation;
            if (i26 != i27) {
                configuration3.navigation = i27;
            }
            int i28 = configuration.navigationHidden;
            int i29 = configuration2.navigationHidden;
            if (i28 != i29) {
                configuration3.navigationHidden = i29;
            }
            int i33 = configuration.orientation;
            int i34 = configuration2.orientation;
            if (i33 != i34) {
                configuration3.orientation = i34;
            }
            int i35 = configuration.screenLayout & 15;
            int i36 = configuration2.screenLayout;
            if (i35 != (i36 & 15)) {
                configuration3.screenLayout |= i36 & 15;
            }
            int i37 = configuration.screenLayout & 192;
            int i38 = configuration2.screenLayout;
            if (i37 != (i38 & 192)) {
                configuration3.screenLayout |= i38 & 192;
            }
            int i39 = configuration.screenLayout & 48;
            int i43 = configuration2.screenLayout;
            if (i39 != (i43 & 48)) {
                configuration3.screenLayout |= i43 & 48;
            }
            int i44 = configuration.screenLayout & 768;
            int i45 = configuration2.screenLayout;
            if (i44 != (i45 & 768)) {
                configuration3.screenLayout |= i45 & 768;
            }
            draadjrbmk.iobyxmoadg(configuration, configuration2, configuration3);
            int i46 = configuration.uiMode & 15;
            int i47 = configuration2.uiMode;
            if (i46 != (i47 & 15)) {
                configuration3.uiMode |= i47 & 15;
            }
            int i48 = configuration.uiMode & 48;
            int i49 = configuration2.uiMode;
            if (i48 != (i49 & 48)) {
                configuration3.uiMode |= i49 & 48;
            }
            int i53 = configuration.screenWidthDp;
            int i54 = configuration2.screenWidthDp;
            if (i53 != i54) {
                configuration3.screenWidthDp = i54;
            }
            int i55 = configuration.screenHeightDp;
            int i56 = configuration2.screenHeightDp;
            if (i55 != i56) {
                configuration3.screenHeightDp = i56;
            }
            int i57 = configuration.smallestScreenWidthDp;
            int i58 = configuration2.smallestScreenWidthDp;
            if (i57 != i58) {
                configuration3.smallestScreenWidthDp = i58;
            }
            int i59 = configuration.densityDpi;
            int i63 = configuration2.densityDpi;
            if (i59 != i63) {
                configuration3.densityDpi = i63;
            }
        }
        return configuration3;
    }

    private boolean rhgxfdycjh(PanelFeatureState panelFeatureState, int i13, KeyEvent keyEvent, int i14) {
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f2556wflxmlrfwp || yzdjzghtvl(panelFeatureState, keyEvent)) && (eablkybsjgVar = panelFeatureState.f2541btonecajqb) != null) {
            zPerformShortcut = eablkybsjgVar.performShortcut(i13, keyEvent, i14);
        }
        if (zPerformShortcut && (i14 & 1) == 0 && this.f2496hcddaimhww == null) {
            xrmfcynszj(panelFeatureState, true);
        }
        return zPerformShortcut;
    }

    private ViewGroup rlfsiqarku() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f2490cdpycssgdh.obtainStyledAttributes(lqeggnwhkg.btonecajqb.AppCompatTheme);
        if (!typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AppCompatTheme_windowNoTitle, false)) {
            pkzmftpjix(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AppCompatTheme_windowActionBar, false)) {
            pkzmftpjix(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AppCompatTheme_windowActionBarOverlay, false)) {
            pkzmftpjix(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AppCompatTheme_windowActionModeOverlay, false)) {
            pkzmftpjix(10);
        }
        this.f2498ikoacuggdj = typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        oipsdeybqn();
        this.f2534yadqdtsiqt.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2490cdpycssgdh);
        if (this.f2515okpsazkaxt) {
            viewGroup = this.f2503jhduphickx ? (ViewGroup) layoutInflaterFrom.inflate(lqeggnwhkg.lqeggnwhkg.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(lqeggnwhkg.lqeggnwhkg.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2498ikoacuggdj) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(lqeggnwhkg.lqeggnwhkg.abc_dialog_title_material, (ViewGroup) null);
            this.f2529vipkmwdibw = false;
            this.f2518ribwqtqdhb = false;
        } else if (this.f2518ribwqtqdhb) {
            TypedValue typedValue = new TypedValue();
            this.f2490cdpycssgdh.getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.wkgbmnqykc(this.f2490cdpycssgdh, typedValue.resourceId) : this.f2490cdpycssgdh).inflate(lqeggnwhkg.lqeggnwhkg.abc_screen_toolbar, (ViewGroup) null);
            androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar = (androidx.appcompat.widget.esjtqupxsv) viewGroup.findViewById(lqeggnwhkg.gxszxtbevo.decor_content_parent);
            this.f2496hcddaimhww = esjtqupxsvVar;
            esjtqupxsvVar.setWindowCallback(uawqvzlxes());
            if (this.f2529vipkmwdibw) {
                this.f2496hcddaimhww.nufgyqmvbu(109);
            }
            if (this.f2492crxdokpmqz) {
                this.f2496hcddaimhww.nufgyqmvbu(2);
            }
            if (this.f2504jlmebxxoox) {
                this.f2496hcddaimhww.nufgyqmvbu(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2518ribwqtqdhb + ", windowActionBarOverlay: " + this.f2529vipkmwdibw + ", android:windowIsFloating: " + this.f2498ikoacuggdj + ", windowActionModeOverlay: " + this.f2503jhduphickx + ", windowNoTitle: " + this.f2515okpsazkaxt + " }");
        }
        jhduphickx.igdgnonuha(viewGroup, new zoijcleaow());
        if (this.f2496hcddaimhww == null) {
            this.f2527ulzqkzuiru = (TextView) viewGroup.findViewById(lqeggnwhkg.gxszxtbevo.title);
        }
        vipkmwdibw.ppxfxbqfkf(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(lqeggnwhkg.gxszxtbevo.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2534yadqdtsiqt.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f2534yadqdtsiqt.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ppxfxbqfkf());
        return viewGroup;
    }

    private boolean skhdrjzrfn(PanelFeatureState panelFeatureState) {
        Resources.Theme themeNewTheme;
        Context context = this.f2490cdpycssgdh;
        int i13 = panelFeatureState.f2547iobyxmoadg;
        if ((i13 == 0 || i13 == 108) && this.f2496hcddaimhww != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarWidgetTheme, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.wkgbmnqykc wkgbmnqykcVar = new androidx.appcompat.view.wkgbmnqykc(context, 0);
                wkgbmnqykcVar.getTheme().setTo(themeNewTheme);
                context = wkgbmnqykcVar;
            }
        }
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = new androidx.appcompat.view.menu.eablkybsjg(context);
        eablkybsjgVar.tzroggbefp(this);
        panelFeatureState.ppxfxbqfkf(eablkybsjgVar);
        return true;
    }

    private boolean sopmlzcsov(boolean z13, boolean z14) {
        if (this.f2536yfnezrywwk) {
            return false;
        }
        int iVipkmwdibw = vipkmwdibw();
        int iWizcaqwiak = wizcaqwiak(this.f2490cdpycssgdh, iVipkmwdibw);
        q1.nufgyqmvbu nufgyqmvbuVarRibwqtqdhb = Build.VERSION.SDK_INT < 33 ? ribwqtqdhb(this.f2490cdpycssgdh) : null;
        if (!z14 && nufgyqmvbuVarRibwqtqdhb != null) {
            nufgyqmvbuVarRibwqtqdhb = nuxfzjnpeb(this.f2490cdpycssgdh.getResources().getConfiguration());
        }
        boolean zJ = j(iWizcaqwiak, nufgyqmvbuVarRibwqtqdhb, z13);
        if (iVipkmwdibw == 0) {
            zeieaojujs(this.f2490cdpycssgdh).eablkybsjg();
        } else {
            rgvfuqvkyq rgvfuqvkyqVar = this.f2516opjhrmiecq;
            if (rgvfuqvkyqVar != null) {
                rgvfuqvkyqVar.iobyxmoadg();
            }
        }
        if (iVipkmwdibw == 3) {
            lrnfpwlwnk(this.f2490cdpycssgdh).eablkybsjg();
        } else {
            rgvfuqvkyq rgvfuqvkyqVar2 = this.f2502iyctptxqzt;
            if (rgvfuqvkyqVar2 != null) {
                rgvfuqvkyqVar2.iobyxmoadg();
            }
        }
        return zJ;
    }

    private boolean ulzqkzuiru(boolean z13) {
        return sopmlzcsov(z13, true);
    }

    private int vipkmwdibw() {
        int i13 = this.f2521sflfametgt;
        return i13 != -100 ? i13 : androidx.appcompat.app.lqeggnwhkg.ojitshcjhn();
    }

    private int weqkydbzbr(Context context) {
        if (!this.f2489bfopjjpdmp && (this.f2500istkbnxepw instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f2500istkbnxepw.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f2514oipsdeybqn = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e13) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e13);
                this.f2514oipsdeybqn = 0;
            }
        }
        this.f2489bfopjjpdmp = true;
        return this.f2514oipsdeybqn;
    }

    private boolean yzdjzghtvl(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar;
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar2;
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar3;
        if (this.f2536yfnezrywwk) {
            return false;
        }
        if (panelFeatureState.f2556wflxmlrfwp) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f2511metgxyhuhe;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            xrmfcynszj(panelFeatureState2, false);
        }
        Window.Callback callbackUawqvzlxes = uawqvzlxes();
        if (callbackUawqvzlxes != null) {
            panelFeatureState.f2543dxjokdxxww = callbackUawqvzlxes.onCreatePanelView(panelFeatureState.f2547iobyxmoadg);
        }
        int i13 = panelFeatureState.f2547iobyxmoadg;
        boolean z13 = i13 == 0 || i13 == 108;
        if (z13 && (esjtqupxsvVar3 = this.f2496hcddaimhww) != null) {
            esjtqupxsvVar3.gxszxtbevo();
        }
        if (panelFeatureState.f2543dxjokdxxww == null && (!z13 || !(ezmngbhpjk() instanceof jyumaefscl))) {
            androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = panelFeatureState.f2541btonecajqb;
            if (eablkybsjgVar == null || panelFeatureState.f2552oxmwwwfdhm) {
                if (eablkybsjgVar == null && (!skhdrjzrfn(panelFeatureState) || panelFeatureState.f2541btonecajqb == null)) {
                    return false;
                }
                if (z13 && this.f2496hcddaimhww != null) {
                    if (this.f2505jpowsppfya == null) {
                        this.f2505jpowsppfya = new nufgyqmvbu();
                    }
                    this.f2496hcddaimhww.wkgbmnqykc(panelFeatureState.f2541btonecajqb, this.f2505jpowsppfya);
                }
                panelFeatureState.f2541btonecajqb.jztzpxfvev();
                if (!callbackUawqvzlxes.onCreatePanelMenu(panelFeatureState.f2547iobyxmoadg, panelFeatureState.f2541btonecajqb)) {
                    panelFeatureState.ppxfxbqfkf(null);
                    if (z13 && (esjtqupxsvVar = this.f2496hcddaimhww) != null) {
                        esjtqupxsvVar.wkgbmnqykc(null, this.f2505jpowsppfya);
                    }
                    return false;
                }
                panelFeatureState.f2552oxmwwwfdhm = false;
            }
            panelFeatureState.f2541btonecajqb.jztzpxfvev();
            Bundle bundle = panelFeatureState.f2548kcexrzcfyt;
            if (bundle != null) {
                panelFeatureState.f2541btonecajqb.stevsuqkhv(bundle);
                panelFeatureState.f2548kcexrzcfyt = null;
            }
            if (!callbackUawqvzlxes.onPreparePanel(0, panelFeatureState.f2543dxjokdxxww, panelFeatureState.f2541btonecajqb)) {
                if (z13 && (esjtqupxsvVar2 = this.f2496hcddaimhww) != null) {
                    esjtqupxsvVar2.wkgbmnqykc(null, this.f2505jpowsppfya);
                }
                panelFeatureState.f2541btonecajqb.okpsazkaxt();
                return false;
            }
            boolean z14 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f2554rgvfuqvkyq = z14;
            panelFeatureState.f2541btonecajqb.setQwertyMode(z14);
            panelFeatureState.f2541btonecajqb.okpsazkaxt();
        }
        panelFeatureState.f2556wflxmlrfwp = true;
        panelFeatureState.f2540agtfadlqog = false;
        this.f2511metgxyhuhe = panelFeatureState;
        return true;
    }

    private rgvfuqvkyq zeieaojujs(Context context) {
        if (this.f2516opjhrmiecq == null) {
            this.f2516opjhrmiecq = new vdvldrhtss(cqumvgiudr.iobyxmoadg(context));
        }
        return this.f2516opjhrmiecq;
    }

    private void zfvoamnweg() {
        if (this.f2510mbcevpiqjq) {
            return;
        }
        this.f2512ntlheqmsrt = rlfsiqarku();
        CharSequence charSequenceRoivzttewh = roivzttewh();
        if (!TextUtils.isEmpty(charSequenceRoivzttewh)) {
            androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar = this.f2496hcddaimhww;
            if (esjtqupxsvVar != null) {
                esjtqupxsvVar.setWindowTitle(charSequenceRoivzttewh);
            } else if (ezmngbhpjk() != null) {
                ezmngbhpjk().zdlpuopuiu(charSequenceRoivzttewh);
            } else {
                TextView textView = this.f2527ulzqkzuiru;
                if (textView != null) {
                    textView.setText(charSequenceRoivzttewh);
                }
            }
        }
        crxdokpmqz();
        jrbgnlbqoe(this.f2512ntlheqmsrt);
        this.f2510mbcevpiqjq = true;
        PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(0, false);
        if (this.f2536yfnezrywwk) {
            return;
        }
        if (panelFeatureStateTbqsvytpvh == null || panelFeatureStateTbqsvytpvh.f2541btonecajqb == null) {
            igdgnonuha(108);
        }
    }

    void a(Configuration configuration, q1.nufgyqmvbu nufgyqmvbuVar) {
        gtknphoqwx.wkgbmnqykc(configuration, nufgyqmvbuVar);
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public Context agtfadlqog() {
        return this.f2490cdpycssgdh;
    }

    void b(q1.nufgyqmvbu nufgyqmvbuVar) {
        gtknphoqwx.ppxfxbqfkf(nufgyqmvbuVar);
    }

    PanelFeatureState bfopjjpdmp(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f2533xrmfcynszj;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i13 = 0; i13 < length; i13++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i13];
            if (panelFeatureState != null && panelFeatureState.f2541btonecajqb == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    final boolean c() {
        ViewGroup viewGroup;
        return this.f2510mbcevpiqjq && (viewGroup = this.f2512ntlheqmsrt) != null && viewGroup.isLaidOut();
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void cdpycssgdh() {
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
        if (iobyxmoadgVarYggfygwlhe != null) {
            iobyxmoadgVarYggfygwlhe.kcexrzcfyt(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View czzsidtyhn(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z13;
        if (this.f2526uawqvzlxes == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f2490cdpycssgdh.obtainStyledAttributes(lqeggnwhkg.btonecajqb.AppCompatTheme);
            String string = typedArrayObtainStyledAttributes.getString(lqeggnwhkg.btonecajqb.AppCompatTheme_viewInflaterClass);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f2526uawqvzlxes = new androidx.appcompat.app.vdvldrhtss();
            } else {
                try {
                    this.f2526uawqvzlxes = (androidx.appcompat.app.vdvldrhtss) this.f2490cdpycssgdh.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f2526uawqvzlxes = new androidx.appcompat.app.vdvldrhtss();
                }
            }
        }
        boolean z14 = f2484igdgnonuha;
        boolean zD = false;
        if (z14) {
            if (this.f2488auzgnhcxok == null) {
                this.f2488auzgnhcxok = new androidx.appcompat.app.kcexrzcfyt();
            }
            if (this.f2488auzgnhcxok.iobyxmoadg(attributeSet)) {
                z13 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zD = d((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zD = true;
                }
                z13 = zD;
            }
        } else {
            z13 = zD;
        }
        return this.f2526uawqvzlxes.oxmwwwfdhm(view, str, context, attributeSet, z13, z14, true, ribwqtqdhb.ppxfxbqfkf());
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public View draadjrbmk(int i13) {
        zfvoamnweg();
        return this.f2534yadqdtsiqt.findViewById(i13);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // androidx.appcompat.app.lqeggnwhkg
    public void dsvhmnatus(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.dsvhmnatus(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f2501iwxlajgraz;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f2495dvvnrvtcbc) != null) {
            wflxmlrfwp.ppxfxbqfkf(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f2495dvvnrvtcbc = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f2500istkbnxepw;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f2501iwxlajgraz = onBackInvokedDispatcher;
            } else {
                this.f2501iwxlajgraz = wflxmlrfwp.iobyxmoadg((Activity) this.f2500istkbnxepw);
            }
        } else {
            this.f2501iwxlajgraz = onBackInvokedDispatcher;
        }
        k();
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public Context dxjokdxxww(Context context) {
        this.f2493czzsidtyhn = true;
        int iWizcaqwiak = wizcaqwiak(context, vipkmwdibw());
        if (androidx.appcompat.app.lqeggnwhkg.cqumvgiudr(context)) {
            androidx.appcompat.app.lqeggnwhkg.ntlheqmsrt(context);
        }
        q1.nufgyqmvbu nufgyqmvbuVarRibwqtqdhb = ribwqtqdhb(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(metgxyhuhe(context, iWizcaqwiak, nufgyqmvbuVarRibwqtqdhb, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.wkgbmnqykc) {
            try {
                ((androidx.appcompat.view.wkgbmnqykc) context).iobyxmoadg(metgxyhuhe(context, iWizcaqwiak, nufgyqmvbuVarRibwqtqdhb, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2487wizcaqwiak) {
            return super.dxjokdxxww(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationMetgxyhuhe = metgxyhuhe(context, iWizcaqwiak, nufgyqmvbuVarRibwqtqdhb, !configuration2.equals(configuration3) ? opjhrmiecq(configuration2, configuration3) : null, true);
        androidx.appcompat.view.wkgbmnqykc wkgbmnqykcVar = new androidx.appcompat.view.wkgbmnqykc(context, lqeggnwhkg.dxjokdxxww.Theme_AppCompat_Empty);
        wkgbmnqykcVar.iobyxmoadg(configurationMetgxyhuhe);
        try {
            if (context.getTheme() != null) {
                i1.nufgyqmvbu.lqeggnwhkg.iobyxmoadg(wkgbmnqykcVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.dxjokdxxww(wkgbmnqykcVar);
    }

    boolean e() {
        if (this.f2501iwxlajgraz == null) {
            return false;
        }
        PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(0, false);
        return (panelFeatureStateTbqsvytpvh != null && panelFeatureStateTbqsvytpvh.f2551ojitshcjhn) || this.f2491cllcsxoeiz != null;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void eablkybsjg(View view, ViewGroup.LayoutParams layoutParams) {
        zfvoamnweg();
        ((ViewGroup) this.f2512ntlheqmsrt.findViewById(R.id.content)).addView(view, layoutParams);
        this.f2499iozdgvuglv.ppxfxbqfkf(this.f2534yadqdtsiqt.getCallback());
    }

    final androidx.appcompat.app.iobyxmoadg ezmngbhpjk() {
        return this.f2531wwaezpbzkn;
    }

    androidx.appcompat.view.zoijcleaow f(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        androidx.appcompat.view.zoijcleaow zoijcleaowVarOnWindowStartingSupportActionMode;
        Context wkgbmnqykcVar;
        androidx.appcompat.app.eablkybsjg eablkybsjgVar;
        sflfametgt();
        androidx.appcompat.view.zoijcleaow zoijcleaowVar = this.f2491cllcsxoeiz;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.ppxfxbqfkf();
        }
        if (!(iobyxmoadgVar instanceof dxjokdxxww)) {
            iobyxmoadgVar = new dxjokdxxww(iobyxmoadgVar);
        }
        androidx.appcompat.app.eablkybsjg eablkybsjgVar2 = this.f2508lmojexxdyd;
        if (eablkybsjgVar2 == null || this.f2536yfnezrywwk) {
            zoijcleaowVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                zoijcleaowVarOnWindowStartingSupportActionMode = eablkybsjgVar2.onWindowStartingSupportActionMode(iobyxmoadgVar);
            } catch (AbstractMethodError unused) {
                zoijcleaowVarOnWindowStartingSupportActionMode = null;
            }
        }
        if (zoijcleaowVarOnWindowStartingSupportActionMode != null) {
            this.f2491cllcsxoeiz = zoijcleaowVarOnWindowStartingSupportActionMode;
        } else {
            if (this.f2494dsvhmnatus == null) {
                if (this.f2498ikoacuggdj) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f2490cdpycssgdh.getTheme();
                    theme.resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f2490cdpycssgdh.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        wkgbmnqykcVar = new androidx.appcompat.view.wkgbmnqykc(this.f2490cdpycssgdh, 0);
                        wkgbmnqykcVar.getTheme().setTo(themeNewTheme);
                    } else {
                        wkgbmnqykcVar = this.f2490cdpycssgdh;
                    }
                    this.f2494dsvhmnatus = new ActionBarContextView(wkgbmnqykcVar);
                    PopupWindow popupWindow = new PopupWindow(wkgbmnqykcVar, (AttributeSet) null, lqeggnwhkg.iobyxmoadg.actionModePopupWindowStyle);
                    this.f2532wypolnanlu = popupWindow;
                    androidx.core.widget.nufgyqmvbu.zoijcleaow(popupWindow, 2);
                    this.f2532wypolnanlu.setContentView(this.f2494dsvhmnatus);
                    this.f2532wypolnanlu.setWidth(-1);
                    wkgbmnqykcVar.getTheme().resolveAttribute(lqeggnwhkg.iobyxmoadg.actionBarSize, typedValue, true);
                    this.f2494dsvhmnatus.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, wkgbmnqykcVar.getResources().getDisplayMetrics()));
                    this.f2532wypolnanlu.setHeight(-2);
                    this.f2523stevsuqkhv = new wkgbmnqykc();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2512ntlheqmsrt.findViewById(lqeggnwhkg.gxszxtbevo.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(iyctptxqzt()));
                        this.f2494dsvhmnatus = (ActionBarContextView) viewStubCompat.iobyxmoadg();
                    }
                }
            }
            if (this.f2494dsvhmnatus != null) {
                sflfametgt();
                this.f2494dsvhmnatus.gtknphoqwx();
                androidx.appcompat.view.eablkybsjg eablkybsjgVar3 = new androidx.appcompat.view.eablkybsjg(this.f2494dsvhmnatus.getContext(), this.f2494dsvhmnatus, iobyxmoadgVar, this.f2532wypolnanlu == null);
                if (iobyxmoadgVar.zoijcleaow(eablkybsjgVar3, eablkybsjgVar3.eablkybsjg())) {
                    eablkybsjgVar3.gtknphoqwx();
                    this.f2494dsvhmnatus.nufgyqmvbu(eablkybsjgVar3);
                    this.f2491cllcsxoeiz = eablkybsjgVar3;
                    if (c()) {
                        this.f2494dsvhmnatus.setAlpha(0.0f);
                        yfnezrywwk yfnezrywwkVarZoijcleaow = jhduphickx.eablkybsjg(this.f2494dsvhmnatus).zoijcleaow(1.0f);
                        this.f2507kegysxyocb = yfnezrywwkVarZoijcleaow;
                        yfnezrywwkVarZoijcleaow.nufgyqmvbu(new eablkybsjg());
                    } else {
                        this.f2494dsvhmnatus.setAlpha(1.0f);
                        this.f2494dsvhmnatus.setVisibility(0);
                        if (this.f2494dsvhmnatus.getParent() instanceof View) {
                            jhduphickx.ydmasvzmpa((View) this.f2494dsvhmnatus.getParent());
                        }
                    }
                    if (this.f2532wypolnanlu != null) {
                        this.f2534yadqdtsiqt.getDecorView().post(this.f2523stevsuqkhv);
                    }
                } else {
                    this.f2491cllcsxoeiz = null;
                }
            }
        }
        androidx.appcompat.view.zoijcleaow zoijcleaowVar2 = this.f2491cllcsxoeiz;
        if (zoijcleaowVar2 != null && (eablkybsjgVar = this.f2508lmojexxdyd) != null) {
            eablkybsjgVar.onSupportActionModeStarted(zoijcleaowVar2);
        }
        k();
        return this.f2491cllcsxoeiz;
    }

    boolean fiwbwshyhd(int i13, KeyEvent keyEvent) {
        if (i13 == 4) {
            this.f2519rlfsiqarku = (keyEvent.getFlags() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        } else if (i13 == 82) {
            ageimvtcrz(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean fyldjkxazc(int i13, KeyEvent keyEvent) {
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
        if (iobyxmoadgVarYggfygwlhe != null && iobyxmoadgVarYggfygwlhe.ojitshcjhn(i13, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f2511metgxyhuhe;
        if (panelFeatureState != null && rhgxfdycjh(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f2511metgxyhuhe;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f2540agtfadlqog = true;
            }
            return true;
        }
        if (this.f2511metgxyhuhe == null) {
            PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(0, true);
            yzdjzghtvl(panelFeatureStateTbqsvytpvh, keyEvent);
            boolean zRhgxfdycjh = rhgxfdycjh(panelFeatureStateTbqsvytpvh, keyEvent.getKeyCode(), keyEvent, 1);
            panelFeatureStateTbqsvytpvh.f2556wflxmlrfwp = false;
            if (zRhgxfdycjh) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public boolean gxszxtbevo() {
        return ulzqkzuiru(true);
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void hcddaimhww(int i13) {
        zfvoamnweg();
        ViewGroup viewGroup = (ViewGroup) this.f2512ntlheqmsrt.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2490cdpycssgdh).inflate(i13, viewGroup);
        this.f2499iozdgvuglv.ppxfxbqfkf(this.f2534yadqdtsiqt.getCallback());
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void hkdspvbjdz(View view, ViewGroup.LayoutParams layoutParams) {
        zfvoamnweg();
        ViewGroup viewGroup = (ViewGroup) this.f2512ntlheqmsrt.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2499iozdgvuglv.ppxfxbqfkf(this.f2534yadqdtsiqt.getCallback());
    }

    boolean hszhottldk() {
        boolean z13 = this.f2519rlfsiqarku;
        this.f2519rlfsiqarku = false;
        PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(0, false);
        if (panelFeatureStateTbqsvytpvh != null && panelFeatureStateTbqsvytpvh.f2551ojitshcjhn) {
            if (!z13) {
                xrmfcynszj(panelFeatureStateTbqsvytpvh, true);
            }
            return true;
        }
        androidx.appcompat.view.zoijcleaow zoijcleaowVar = this.f2491cllcsxoeiz;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.ppxfxbqfkf();
            return true;
        }
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
        return iobyxmoadgVarYggfygwlhe != null && iobyxmoadgVarYggfygwlhe.nufgyqmvbu();
    }

    void ikoacuggdj(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
        if (this.f2506jztzpxfvev) {
            return;
        }
        this.f2506jztzpxfvev = true;
        this.f2496hcddaimhww.draadjrbmk();
        Window.Callback callbackUawqvzlxes = uawqvzlxes();
        if (callbackUawqvzlxes != null && !this.f2536yfnezrywwk) {
            callbackUawqvzlxes.onPanelClosed(108, eablkybsjgVar);
        }
        this.f2506jztzpxfvev = false;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
    public boolean iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar, MenuItem menuItem) {
        PanelFeatureState panelFeatureStateBfopjjpdmp;
        Window.Callback callbackUawqvzlxes = uawqvzlxes();
        if (callbackUawqvzlxes == null || this.f2536yfnezrywwk || (panelFeatureStateBfopjjpdmp = bfopjjpdmp(eablkybsjgVar.cdpycssgdh())) == null) {
            return false;
        }
        return callbackUawqvzlxes.onMenuItemSelected(panelFeatureStateBfopjjpdmp.f2547iobyxmoadg, menuItem);
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void iozdgvuglv() {
        sopmlzcsov(true, false);
    }

    boolean ipoelvxyzq(int i13, KeyEvent keyEvent) {
        if (i13 != 4) {
            if (i13 == 82) {
                grlcpdaxtj(0, keyEvent);
                return true;
            }
        } else if (hszhottldk()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void istkbnxepw(Bundle bundle) {
        zfvoamnweg();
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void iwizpuwonk() {
        if (ezmngbhpjk() == null || yggfygwlhe().draadjrbmk()) {
            return;
        }
        igdgnonuha(0);
    }

    void ixidwrxhsl(int i13) {
        if (i13 == 108) {
            androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
            if (iobyxmoadgVarYggfygwlhe != null) {
                iobyxmoadgVarYggfygwlhe.dxjokdxxww(false);
                return;
            }
            return;
        }
        if (i13 == 0) {
            PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(i13, true);
            if (panelFeatureStateTbqsvytpvh.f2551ojitshcjhn) {
                xrmfcynszj(panelFeatureStateTbqsvytpvh, false);
            }
        }
    }

    final Context iyctptxqzt() {
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
        Context contextGtknphoqwx = iobyxmoadgVarYggfygwlhe != null ? iobyxmoadgVarYggfygwlhe.gtknphoqwx() : null;
        return contextGtknphoqwx == null ? this.f2490cdpycssgdh : contextGtknphoqwx;
    }

    void jhduphickx(int i13, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i13 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f2533xrmfcynszj;
                if (i13 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i13];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f2541btonecajqb;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f2551ojitshcjhn) && !this.f2536yfnezrywwk) {
            this.f2499iozdgvuglv.wkgbmnqykc(this.f2534yadqdtsiqt.getCallback(), i13, menu);
        }
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void jpowsppfya(View view) {
        zfvoamnweg();
        ViewGroup viewGroup = (ViewGroup) this.f2512ntlheqmsrt.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2499iozdgvuglv.ppxfxbqfkf(this.f2534yadqdtsiqt.getCallback());
    }

    void jrbgnlbqoe(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void jyumaefscl() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2490cdpycssgdh);
        if (layoutInflaterFrom.getFactory() == null) {
            v1.jyumaefscl.iobyxmoadg(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    void jztzpxfvev(int i13) {
        xrmfcynszj(tbqsvytpvh(i13, true), true);
    }

    void k() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zE = e();
            if (zE && this.f2495dvvnrvtcbc == null) {
                this.f2495dvvnrvtcbc = wflxmlrfwp.zoijcleaow(this.f2501iwxlajgraz, this);
            } else {
                if (zE || (onBackInvokedCallback = this.f2495dvvnrvtcbc) == null) {
                    return;
                }
                wflxmlrfwp.ppxfxbqfkf(this.f2501iwxlajgraz, onBackInvokedCallback);
                this.f2495dvvnrvtcbc = null;
            }
        }
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public MenuInflater kcexrzcfyt() {
        if (this.f2537ylkuphrtab == null) {
            auzgnhcxok();
            androidx.appcompat.app.iobyxmoadg iobyxmoadgVar = this.f2531wwaezpbzkn;
            this.f2537ylkuphrtab = new androidx.appcompat.view.lqeggnwhkg(iobyxmoadgVar != null ? iobyxmoadgVar.gtknphoqwx() : this.f2490cdpycssgdh);
        }
        return this.f2537ylkuphrtab;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public final void kegysxyocb(CharSequence charSequence) {
        this.f2517pkzmftpjix = charSequence;
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar = this.f2496hcddaimhww;
        if (esjtqupxsvVar != null) {
            esjtqupxsvVar.setWindowTitle(charSequence);
            return;
        }
        if (ezmngbhpjk() != null) {
            ezmngbhpjk().zdlpuopuiu(charSequence);
            return;
        }
        TextView textView = this.f2527ulzqkzuiru;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void lereixgezr(Configuration configuration) {
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe;
        if (this.f2518ribwqtqdhb && this.f2510mbcevpiqjq && (iobyxmoadgVarYggfygwlhe = yggfygwlhe()) != null) {
            iobyxmoadgVarYggfygwlhe.wflxmlrfwp(configuration);
        }
        androidx.appcompat.widget.nufgyqmvbu.zoijcleaow().lqeggnwhkg(this.f2490cdpycssgdh);
        this.f2535ydmasvzmpa = new Configuration(this.f2490cdpycssgdh.getResources().getConfiguration());
        sopmlzcsov(false, false);
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void lmojexxdyd() {
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
        if (iobyxmoadgVarYggfygwlhe != null) {
            iobyxmoadgVarYggfygwlhe.kcexrzcfyt(false);
        }
    }

    public boolean lxfrhoxuzk() {
        return this.f2525tzroggbefp;
    }

    final int m(skhdrjzrfn skhdrjzrfnVar, Rect rect) {
        int iWflxmlrfwp;
        boolean z13;
        boolean z14;
        if (skhdrjzrfnVar != null) {
            iWflxmlrfwp = skhdrjzrfnVar.wflxmlrfwp();
        } else {
            iWflxmlrfwp = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f2494dsvhmnatus;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z13 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2494dsvhmnatus.getLayoutParams();
            boolean z15 = true;
            if (this.f2494dsvhmnatus.isShown()) {
                if (this.f2524tbqsvytpvh == null) {
                    this.f2524tbqsvytpvh = new Rect();
                    this.f2520roivzttewh = new Rect();
                }
                Rect rect2 = this.f2524tbqsvytpvh;
                Rect rect3 = this.f2520roivzttewh;
                if (skhdrjzrfnVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(skhdrjzrfnVar.gtknphoqwx(), skhdrjzrfnVar.wflxmlrfwp(), skhdrjzrfnVar.draadjrbmk(), skhdrjzrfnVar.btonecajqb());
                }
                vipkmwdibw.iobyxmoadg(this.f2512ntlheqmsrt, rect2, rect3);
                int i13 = rect2.top;
                int i14 = rect2.left;
                int i15 = rect2.right;
                skhdrjzrfn skhdrjzrfnVarLmojexxdyd = jhduphickx.lmojexxdyd(this.f2512ntlheqmsrt);
                int iGtknphoqwx = skhdrjzrfnVarLmojexxdyd == null ? 0 : skhdrjzrfnVarLmojexxdyd.gtknphoqwx();
                int iDraadjrbmk = skhdrjzrfnVarLmojexxdyd == null ? 0 : skhdrjzrfnVarLmojexxdyd.draadjrbmk();
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    z14 = false;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    z14 = true;
                }
                if (i13 <= 0 || this.f2522sopmlzcsov != null) {
                    View view = this.f2522sopmlzcsov;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != iGtknphoqwx || marginLayoutParams2.rightMargin != iDraadjrbmk) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = iGtknphoqwx;
                            marginLayoutParams2.rightMargin = iDraadjrbmk;
                            this.f2522sopmlzcsov.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f2490cdpycssgdh);
                    this.f2522sopmlzcsov = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iGtknphoqwx;
                    layoutParams.rightMargin = iDraadjrbmk;
                    this.f2512ntlheqmsrt.addView(this.f2522sopmlzcsov, -1, layoutParams);
                }
                View view3 = this.f2522sopmlzcsov;
                z15 = view3 != null;
                if (z15 && view3.getVisibility() != 0) {
                    n(this.f2522sopmlzcsov);
                }
                if (!this.f2503jhduphickx && z15) {
                    iWflxmlrfwp = 0;
                }
                z13 = z15;
                z15 = z14;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z13 = false;
            } else {
                z13 = false;
                z15 = false;
            }
            if (z15) {
                this.f2494dsvhmnatus.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f2522sopmlzcsov;
        if (view4 != null) {
            view4.setVisibility(z13 ? 0 : 8);
        }
        return iWflxmlrfwp;
    }

    void mhtqkkgtqm(int i13) {
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe;
        if (i13 != 108 || (iobyxmoadgVarYggfygwlhe = yggfygwlhe()) == null) {
            return;
        }
        iobyxmoadgVarYggfygwlhe.dxjokdxxww(true);
    }

    q1.nufgyqmvbu nuxfzjnpeb(Configuration configuration) {
        return gtknphoqwx.zoijcleaow(configuration);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return czzsidtyhn(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public boolean pkzmftpjix(int i13) {
        int iKrqnebusok = krqnebusok(i13);
        if (this.f2515okpsazkaxt && iKrqnebusok == 108) {
            return false;
        }
        if (this.f2518ribwqtqdhb && iKrqnebusok == 1) {
            this.f2518ribwqtqdhb = false;
        }
        if (iKrqnebusok == 1) {
            g();
            this.f2515okpsazkaxt = true;
            return true;
        }
        if (iKrqnebusok == 2) {
            g();
            this.f2492crxdokpmqz = true;
            return true;
        }
        if (iKrqnebusok == 5) {
            g();
            this.f2504jlmebxxoox = true;
            return true;
        }
        if (iKrqnebusok == 10) {
            g();
            this.f2503jhduphickx = true;
            return true;
        }
        if (iKrqnebusok == 108) {
            g();
            this.f2518ribwqtqdhb = true;
            return true;
        }
        if (iKrqnebusok != 109) {
            return this.f2534yadqdtsiqt.requestFeature(iKrqnebusok);
        }
        g();
        this.f2529vipkmwdibw = true;
        return true;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void pmvmpeiblj(Bundle bundle) {
        String strPpxfxbqfkf;
        this.f2493czzsidtyhn = true;
        ulzqkzuiru(false);
        oipsdeybqn();
        Object obj = this.f2500istkbnxepw;
        if (obj instanceof Activity) {
            try {
                strPpxfxbqfkf = androidx.core.app.gtknphoqwx.ppxfxbqfkf((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strPpxfxbqfkf = null;
            }
            if (strPpxfxbqfkf != null) {
                androidx.appcompat.app.iobyxmoadg iobyxmoadgVarEzmngbhpjk = ezmngbhpjk();
                if (iobyxmoadgVarEzmngbhpjk == null) {
                    this.f2513nuxfzjnpeb = true;
                } else {
                    iobyxmoadgVarEzmngbhpjk.oxmwwwfdhm(true);
                }
            }
            androidx.appcompat.app.lqeggnwhkg.wkgbmnqykc(this);
        }
        this.f2535ydmasvzmpa = new Configuration(this.f2490cdpycssgdh.getResources().getConfiguration());
        this.f2528uwvvkdfqfp = true;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public final androidx.appcompat.app.zoijcleaow rgvfuqvkyq() {
        return new gxszxtbevo();
    }

    q1.nufgyqmvbu ribwqtqdhb(Context context) {
        q1.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu;
        if (Build.VERSION.SDK_INT >= 33 || (nufgyqmvbuVarZdlpuopuiu = androidx.appcompat.app.lqeggnwhkg.zdlpuopuiu()) == null) {
            return null;
        }
        q1.nufgyqmvbu nufgyqmvbuVarNuxfzjnpeb = nuxfzjnpeb(context.getApplicationContext().getResources().getConfiguration());
        q1.nufgyqmvbu nufgyqmvbuVarZoijcleaow = zdlpuopuiu.zoijcleaow(nufgyqmvbuVarZdlpuopuiu, nufgyqmvbuVarNuxfzjnpeb);
        return nufgyqmvbuVarZoijcleaow.eablkybsjg() ? nufgyqmvbuVarNuxfzjnpeb : nufgyqmvbuVarZoijcleaow;
    }

    final CharSequence roivzttewh() {
        Object obj = this.f2500istkbnxepw;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2517pkzmftpjix;
    }

    void sflfametgt() {
        yfnezrywwk yfnezrywwkVar = this.f2507kegysxyocb;
        if (yfnezrywwkVar != null) {
            yfnezrywwkVar.ppxfxbqfkf();
        }
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void stevsuqkhv(int i13) {
        this.f2539zfvoamnweg = i13;
    }

    protected PanelFeatureState tbqsvytpvh(int i13, boolean z13) {
        PanelFeatureState[] panelFeatureStateArr = this.f2533xrmfcynszj;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i13) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i13 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f2533xrmfcynszj = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i13];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i13);
        panelFeatureStateArr[i13] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public androidx.appcompat.view.zoijcleaow tzroggbefp(androidx.appcompat.view.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        androidx.appcompat.app.eablkybsjg eablkybsjgVar;
        if (iobyxmoadgVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.zoijcleaow zoijcleaowVar = this.f2491cllcsxoeiz;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.ppxfxbqfkf();
        }
        dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(iobyxmoadgVar);
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
        if (iobyxmoadgVarYggfygwlhe != null) {
            androidx.appcompat.view.zoijcleaow zoijcleaowVarYggfygwlhe = iobyxmoadgVarYggfygwlhe.yggfygwlhe(dxjokdxxwwVar);
            this.f2491cllcsxoeiz = zoijcleaowVarYggfygwlhe;
            if (zoijcleaowVarYggfygwlhe != null && (eablkybsjgVar = this.f2508lmojexxdyd) != null) {
                eablkybsjgVar.onSupportActionModeStarted(zoijcleaowVarYggfygwlhe);
            }
        }
        if (this.f2491cllcsxoeiz == null) {
            this.f2491cllcsxoeiz = f(dxjokdxxwwVar);
        }
        k();
        return this.f2491cllcsxoeiz;
    }

    final Window.Callback uawqvzlxes() {
        return this.f2534yadqdtsiqt.getCallback();
    }

    void uwvvkdfqfp() {
        androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar;
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar = this.f2496hcddaimhww;
        if (esjtqupxsvVar != null) {
            esjtqupxsvVar.draadjrbmk();
        }
        if (this.f2532wypolnanlu != null) {
            this.f2534yadqdtsiqt.getDecorView().removeCallbacks(this.f2523stevsuqkhv);
            if (this.f2532wypolnanlu.isShowing()) {
                try {
                    this.f2532wypolnanlu.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f2532wypolnanlu = null;
        }
        sflfametgt();
        PanelFeatureState panelFeatureStateTbqsvytpvh = tbqsvytpvh(0, false);
        if (panelFeatureStateTbqsvytpvh == null || (eablkybsjgVar = panelFeatureStateTbqsvytpvh.f2541btonecajqb) == null) {
            return;
        }
        eablkybsjgVar.close();
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public int vdvldrhtss() {
        return this.f2521sflfametgt;
    }

    int wizcaqwiak(Context context, int i13) {
        if (i13 == -100) {
            return -1;
        }
        if (i13 != -1) {
            if (i13 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return zeieaojujs(context).ppxfxbqfkf();
            }
            if (i13 != 1 && i13 != 2) {
                if (i13 == 3) {
                    return lrnfpwlwnk(context).ppxfxbqfkf();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i13;
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void wypolnanlu(Toolbar toolbar) {
        if (this.f2500istkbnxepw instanceof Activity) {
            androidx.appcompat.app.iobyxmoadg iobyxmoadgVarYggfygwlhe = yggfygwlhe();
            if (iobyxmoadgVarYggfygwlhe instanceof esjtqupxsv) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f2537ylkuphrtab = null;
            if (iobyxmoadgVarYggfygwlhe != null) {
                iobyxmoadgVarYggfygwlhe.agtfadlqog();
            }
            this.f2531wwaezpbzkn = null;
            if (toolbar != null) {
                jyumaefscl jyumaefsclVar = new jyumaefscl(toolbar, roivzttewh(), this.f2499iozdgvuglv);
                this.f2531wwaezpbzkn = jyumaefsclVar;
                this.f2499iozdgvuglv.eablkybsjg(jyumaefsclVar.f2645ppxfxbqfkf);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f2499iozdgvuglv.eablkybsjg(null);
            }
            iwizpuwonk();
        }
    }

    void xrmfcynszj(PanelFeatureState panelFeatureState, boolean z13) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.esjtqupxsv esjtqupxsvVar;
        if (z13 && panelFeatureState.f2547iobyxmoadg == 0 && (esjtqupxsvVar = this.f2496hcddaimhww) != null && esjtqupxsvVar.eablkybsjg()) {
            ikoacuggdj(panelFeatureState.f2541btonecajqb);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2490cdpycssgdh.getSystemService("window");
        if (windowManager != null && panelFeatureState.f2551ojitshcjhn && (viewGroup = panelFeatureState.f2549lqeggnwhkg) != null) {
            windowManager.removeView(viewGroup);
            if (z13) {
                jhduphickx(panelFeatureState.f2547iobyxmoadg, panelFeatureState, null);
            }
        }
        panelFeatureState.f2556wflxmlrfwp = false;
        panelFeatureState.f2540agtfadlqog = false;
        panelFeatureState.f2551ojitshcjhn = false;
        panelFeatureState.f2550nufgyqmvbu = null;
        panelFeatureState.f2555vdvldrhtss = true;
        if (this.f2511metgxyhuhe == panelFeatureState) {
            this.f2511metgxyhuhe = null;
        }
        if (panelFeatureState.f2547iobyxmoadg == 0) {
            k();
        }
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public void yadqdtsiqt(Bundle bundle) {
    }

    void ydmasvzmpa(int i13) {
        PanelFeatureState panelFeatureStateTbqsvytpvh;
        PanelFeatureState panelFeatureStateTbqsvytpvh2 = tbqsvytpvh(i13, true);
        if (panelFeatureStateTbqsvytpvh2.f2541btonecajqb != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateTbqsvytpvh2.f2541btonecajqb.kegysxyocb(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateTbqsvytpvh2.f2548kcexrzcfyt = bundle;
            }
            panelFeatureStateTbqsvytpvh2.f2541btonecajqb.jztzpxfvev();
            panelFeatureStateTbqsvytpvh2.f2541btonecajqb.clear();
        }
        panelFeatureStateTbqsvytpvh2.f2552oxmwwwfdhm = true;
        panelFeatureStateTbqsvytpvh2.f2555vdvldrhtss = true;
        if ((i13 != 108 && i13 != 0) || this.f2496hcddaimhww == null || (panelFeatureStateTbqsvytpvh = tbqsvytpvh(0, false)) == null) {
            return;
        }
        panelFeatureStateTbqsvytpvh.f2556wflxmlrfwp = false;
        yzdjzghtvl(panelFeatureStateTbqsvytpvh, null);
    }

    boolean yfnezrywwk(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f2500istkbnxepw;
        if (((obj instanceof v1.yggfygwlhe.iobyxmoadg) || (obj instanceof androidx.appcompat.app.rgvfuqvkyq)) && (decorView = this.f2534yadqdtsiqt.getDecorView()) != null && v1.yggfygwlhe.wkgbmnqykc(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f2499iozdgvuglv.zoijcleaow(this.f2534yadqdtsiqt.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? fiwbwshyhd(keyCode, keyEvent) : ipoelvxyzq(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.lqeggnwhkg
    public androidx.appcompat.app.iobyxmoadg yggfygwlhe() {
        auzgnhcxok();
        return this.f2531wwaezpbzkn;
    }

    @Override // androidx.appcompat.view.menu.eablkybsjg.iobyxmoadg
    public void zoijcleaow(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
        eslsurpljm(true);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // androidx.appcompat.app.lqeggnwhkg
    public void zynmafqrjb() {
        if (this.f2500istkbnxepw instanceof Activity) {
            androidx.appcompat.app.lqeggnwhkg.wwaezpbzkn(this);
        }
        if (this.f2530weqkydbzbr) {
            this.f2534yadqdtsiqt.getDecorView().removeCallbacks(this.f2538zeieaojujs);
        }
        this.f2536yfnezrywwk = true;
        if (this.f2521sflfametgt != -100) {
            Object obj = this.f2500istkbnxepw;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2486skhdrjzrfn.put(this.f2500istkbnxepw.getClass().getName(), Integer.valueOf(this.f2521sflfametgt));
            } else {
                f2486skhdrjzrfn.remove(this.f2500istkbnxepw.getClass().getName());
            }
        } else {
            f2486skhdrjzrfn.remove(this.f2500istkbnxepw.getClass().getName());
        }
        androidx.appcompat.app.iobyxmoadg iobyxmoadgVar = this.f2531wwaezpbzkn;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.agtfadlqog();
        }
        okpsazkaxt();
    }

    AppCompatDelegateImpl(Dialog dialog, androidx.appcompat.app.eablkybsjg eablkybsjgVar) {
        this(dialog.getContext(), dialog.getWindow(), eablkybsjgVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.eablkybsjg eablkybsjgVar, Object obj) {
        androidx.appcompat.app.wkgbmnqykc wkgbmnqykcVarH;
        this.f2507kegysxyocb = null;
        this.f2525tzroggbefp = true;
        this.f2521sflfametgt = -100;
        this.f2538zeieaojujs = new iobyxmoadg();
        this.f2490cdpycssgdh = context;
        this.f2508lmojexxdyd = eablkybsjgVar;
        this.f2500istkbnxepw = obj;
        if (this.f2521sflfametgt == -100 && (obj instanceof Dialog) && (wkgbmnqykcVarH = h()) != null) {
            this.f2521sflfametgt = wkgbmnqykcVarH.getDelegate().vdvldrhtss();
        }
        if (this.f2521sflfametgt == -100) {
            jztzpxfvev jztzpxfvevVar = f2486skhdrjzrfn;
            Integer num = (Integer) jztzpxfvevVar.get(obj.getClass().getName());
            if (num != null) {
                this.f2521sflfametgt = num.intValue();
                jztzpxfvevVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            jlmebxxoox(window);
        }
        androidx.appcompat.widget.nufgyqmvbu.nufgyqmvbu();
    }
}
