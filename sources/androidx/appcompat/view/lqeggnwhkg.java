package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.mbcevpiqjq;
import androidx.appcompat.widget.yadqdtsiqt;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import lqeggnwhkg.btonecajqb;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v1.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
public class lqeggnwhkg extends MenuInflater {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final Class[] f2705eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    static final Class[] f2706gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final Object[] f2707iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    Context f2708ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Object f2709wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Object[] f2710zoijcleaow;

    private static class iobyxmoadg implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private static final Class[] f2711jyumaefscl = {MenuItem.class};

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Method f2712yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Object f2713zdlpuopuiu;

        public iobyxmoadg(Object obj, String str) {
            this.f2713zdlpuopuiu = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f2712yggfygwlhe = cls.getMethod(str, f2711jyumaefscl);
            } catch (Exception e13) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e13);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2712yggfygwlhe.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2712yggfygwlhe.invoke(this.f2713zdlpuopuiu, menuItem)).booleanValue();
                }
                this.f2712yggfygwlhe.invoke(this.f2713zdlpuopuiu, menuItem);
                return true;
            } catch (Exception e13) {
                throw new RuntimeException(e13);
            }
        }
    }

    private class zoijcleaow {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private char f2714agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private int f2715btonecajqb;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private String f2717cqumvgiudr;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private CharSequence f2718draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f2719dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f2720eablkybsjg;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private String f2721esjtqupxsv;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private CharSequence f2722gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f2723gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private Menu f2724iobyxmoadg;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private CharSequence f2726istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private int f2727iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f2728jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        private boolean f2729kcexrzcfyt;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private String f2730lereixgezr;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f2731lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private boolean f2732nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private int f2733ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private int f2734oxmwwwfdhm;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        v1.zoijcleaow f2735pmvmpeiblj;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f2736ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private char f2737rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private int f2738vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private int f2739wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f2740wkgbmnqykc;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f2742yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private boolean f2743zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f2744zoijcleaow;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private CharSequence f2745zynmafqrjb;

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        private ColorStateList f2716cdpycssgdh = null;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        private PorterDuff.Mode f2741yadqdtsiqt = null;

        public zoijcleaow(Menu menu) {
            this.f2724iobyxmoadg = menu;
            nufgyqmvbu();
        }

        private void dxjokdxxww(MenuItem menuItem) {
            boolean z13 = false;
            menuItem.setChecked(this.f2729kcexrzcfyt).setVisible(this.f2743zdlpuopuiu).setEnabled(this.f2742yggfygwlhe).setCheckable(this.f2734oxmwwwfdhm >= 1).setTitleCondensed(this.f2718draadjrbmk).setIcon(this.f2739wflxmlrfwp);
            int i13 = this.f2728jyumaefscl;
            if (i13 >= 0) {
                menuItem.setShowAsAction(i13);
            }
            if (this.f2730lereixgezr != null) {
                if (lqeggnwhkg.this.f2708ppxfxbqfkf.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new iobyxmoadg(lqeggnwhkg.this.zoijcleaow(), this.f2730lereixgezr));
            }
            if (this.f2734oxmwwwfdhm >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.lqeggnwhkg) {
                    ((androidx.appcompat.view.menu.lqeggnwhkg) menuItem).zdlpuopuiu(true);
                } else if (menuItem instanceof draadjrbmk.ppxfxbqfkf) {
                    ((draadjrbmk.ppxfxbqfkf) menuItem).nufgyqmvbu(true);
                }
            }
            String str = this.f2717cqumvgiudr;
            if (str != null) {
                menuItem.setActionView((View) eablkybsjg(str, lqeggnwhkg.f2705eablkybsjg, lqeggnwhkg.this.f2707iobyxmoadg));
                z13 = true;
            }
            int i14 = this.f2727iwizpuwonk;
            if (i14 > 0) {
                if (z13) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i14);
                }
            }
            v1.zoijcleaow zoijcleaowVar = this.f2735pmvmpeiblj;
            if (zoijcleaowVar != null) {
                zynmafqrjb.iobyxmoadg(menuItem, zoijcleaowVar);
            }
            zynmafqrjb.ppxfxbqfkf(menuItem, this.f2745zynmafqrjb);
            zynmafqrjb.lqeggnwhkg(menuItem, this.f2726istkbnxepw);
            zynmafqrjb.zoijcleaow(menuItem, this.f2714agtfadlqog, this.f2733ojitshcjhn);
            zynmafqrjb.gxszxtbevo(menuItem, this.f2737rgvfuqvkyq, this.f2738vdvldrhtss);
            PorterDuff.Mode mode = this.f2741yadqdtsiqt;
            if (mode != null) {
                zynmafqrjb.eablkybsjg(menuItem, mode);
            }
            ColorStateList colorStateList = this.f2716cdpycssgdh;
            if (colorStateList != null) {
                zynmafqrjb.wkgbmnqykc(menuItem, colorStateList);
            }
        }

        private Object eablkybsjg(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, lqeggnwhkg.this.f2708ppxfxbqfkf.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e13) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e13);
                return null;
            }
        }

        private char ppxfxbqfkf(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public void gxszxtbevo(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = lqeggnwhkg.this.f2708ppxfxbqfkf.obtainStyledAttributes(attributeSet, btonecajqb.MenuGroup);
            this.f2744zoijcleaow = typedArrayObtainStyledAttributes.getResourceId(btonecajqb.MenuGroup_android_id, 0);
            this.f2736ppxfxbqfkf = typedArrayObtainStyledAttributes.getInt(btonecajqb.MenuGroup_android_menuCategory, 0);
            this.f2740wkgbmnqykc = typedArrayObtainStyledAttributes.getInt(btonecajqb.MenuGroup_android_orderInCategory, 0);
            this.f2720eablkybsjg = typedArrayObtainStyledAttributes.getInt(btonecajqb.MenuGroup_android_checkableBehavior, 0);
            this.f2723gxszxtbevo = typedArrayObtainStyledAttributes.getBoolean(btonecajqb.MenuGroup_android_visible, true);
            this.f2731lqeggnwhkg = typedArrayObtainStyledAttributes.getBoolean(btonecajqb.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void iobyxmoadg() {
            this.f2732nufgyqmvbu = true;
            dxjokdxxww(this.f2724iobyxmoadg.add(this.f2744zoijcleaow, this.f2719dxjokdxxww, this.f2715btonecajqb, this.f2722gtknphoqwx));
        }

        public void lqeggnwhkg(AttributeSet attributeSet) {
            mbcevpiqjq mbcevpiqjqVarYggfygwlhe = mbcevpiqjq.yggfygwlhe(lqeggnwhkg.this.f2708ppxfxbqfkf, attributeSet, btonecajqb.MenuItem);
            this.f2719dxjokdxxww = mbcevpiqjqVarYggfygwlhe.agtfadlqog(btonecajqb.MenuItem_android_id, 0);
            this.f2715btonecajqb = (mbcevpiqjqVarYggfygwlhe.gtknphoqwx(btonecajqb.MenuItem_android_menuCategory, this.f2736ppxfxbqfkf) & (-65536)) | (mbcevpiqjqVarYggfygwlhe.gtknphoqwx(btonecajqb.MenuItem_android_orderInCategory, this.f2740wkgbmnqykc) & 65535);
            this.f2722gtknphoqwx = mbcevpiqjqVarYggfygwlhe.rgvfuqvkyq(btonecajqb.MenuItem_android_title);
            this.f2718draadjrbmk = mbcevpiqjqVarYggfygwlhe.rgvfuqvkyq(btonecajqb.MenuItem_android_titleCondensed);
            this.f2739wflxmlrfwp = mbcevpiqjqVarYggfygwlhe.agtfadlqog(btonecajqb.MenuItem_android_icon, 0);
            this.f2714agtfadlqog = ppxfxbqfkf(mbcevpiqjqVarYggfygwlhe.ojitshcjhn(btonecajqb.MenuItem_android_alphabeticShortcut));
            this.f2733ojitshcjhn = mbcevpiqjqVarYggfygwlhe.gtknphoqwx(btonecajqb.MenuItem_alphabeticModifiers, 4096);
            this.f2737rgvfuqvkyq = ppxfxbqfkf(mbcevpiqjqVarYggfygwlhe.ojitshcjhn(btonecajqb.MenuItem_android_numericShortcut));
            this.f2738vdvldrhtss = mbcevpiqjqVarYggfygwlhe.gtknphoqwx(btonecajqb.MenuItem_numericModifiers, 4096);
            if (mbcevpiqjqVarYggfygwlhe.kcexrzcfyt(btonecajqb.MenuItem_android_checkable)) {
                this.f2734oxmwwwfdhm = mbcevpiqjqVarYggfygwlhe.iobyxmoadg(btonecajqb.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f2734oxmwwwfdhm = this.f2720eablkybsjg;
            }
            this.f2729kcexrzcfyt = mbcevpiqjqVarYggfygwlhe.iobyxmoadg(btonecajqb.MenuItem_android_checked, false);
            this.f2743zdlpuopuiu = mbcevpiqjqVarYggfygwlhe.iobyxmoadg(btonecajqb.MenuItem_android_visible, this.f2723gxszxtbevo);
            this.f2742yggfygwlhe = mbcevpiqjqVarYggfygwlhe.iobyxmoadg(btonecajqb.MenuItem_android_enabled, this.f2731lqeggnwhkg);
            this.f2728jyumaefscl = mbcevpiqjqVarYggfygwlhe.gtknphoqwx(btonecajqb.MenuItem_showAsAction, -1);
            this.f2730lereixgezr = mbcevpiqjqVarYggfygwlhe.ojitshcjhn(btonecajqb.MenuItem_android_onClick);
            this.f2727iwizpuwonk = mbcevpiqjqVarYggfygwlhe.agtfadlqog(btonecajqb.MenuItem_actionLayout, 0);
            this.f2717cqumvgiudr = mbcevpiqjqVarYggfygwlhe.ojitshcjhn(btonecajqb.MenuItem_actionViewClass);
            String strOjitshcjhn = mbcevpiqjqVarYggfygwlhe.ojitshcjhn(btonecajqb.MenuItem_actionProviderClass);
            this.f2721esjtqupxsv = strOjitshcjhn;
            boolean z13 = strOjitshcjhn != null;
            if (z13 && this.f2727iwizpuwonk == 0 && this.f2717cqumvgiudr == null) {
                this.f2735pmvmpeiblj = (v1.zoijcleaow) eablkybsjg(strOjitshcjhn, lqeggnwhkg.f2706gxszxtbevo, lqeggnwhkg.this.f2710zoijcleaow);
            } else {
                if (z13) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2735pmvmpeiblj = null;
            }
            this.f2745zynmafqrjb = mbcevpiqjqVarYggfygwlhe.rgvfuqvkyq(btonecajqb.MenuItem_contentDescription);
            this.f2726istkbnxepw = mbcevpiqjqVarYggfygwlhe.rgvfuqvkyq(btonecajqb.MenuItem_tooltipText);
            if (mbcevpiqjqVarYggfygwlhe.kcexrzcfyt(btonecajqb.MenuItem_iconTintMode)) {
                this.f2741yadqdtsiqt = yadqdtsiqt.eablkybsjg(mbcevpiqjqVarYggfygwlhe.gtknphoqwx(btonecajqb.MenuItem_iconTintMode, -1), this.f2741yadqdtsiqt);
            } else {
                this.f2741yadqdtsiqt = null;
            }
            if (mbcevpiqjqVarYggfygwlhe.kcexrzcfyt(btonecajqb.MenuItem_iconTint)) {
                this.f2716cdpycssgdh = mbcevpiqjqVarYggfygwlhe.ppxfxbqfkf(btonecajqb.MenuItem_iconTint);
            } else {
                this.f2716cdpycssgdh = null;
            }
            mbcevpiqjqVarYggfygwlhe.cqumvgiudr();
            this.f2732nufgyqmvbu = false;
        }

        public void nufgyqmvbu() {
            this.f2744zoijcleaow = 0;
            this.f2736ppxfxbqfkf = 0;
            this.f2740wkgbmnqykc = 0;
            this.f2720eablkybsjg = 0;
            this.f2723gxszxtbevo = true;
            this.f2731lqeggnwhkg = true;
        }

        public boolean wkgbmnqykc() {
            return this.f2732nufgyqmvbu;
        }

        public SubMenu zoijcleaow() {
            this.f2732nufgyqmvbu = true;
            SubMenu subMenuAddSubMenu = this.f2724iobyxmoadg.addSubMenu(this.f2744zoijcleaow, this.f2719dxjokdxxww, this.f2715btonecajqb, this.f2722gtknphoqwx);
            dxjokdxxww(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f2705eablkybsjg = clsArr;
        f2706gxszxtbevo = clsArr;
    }

    public lqeggnwhkg(Context context) {
        super(context);
        this.f2708ppxfxbqfkf = context;
        Object[] objArr = {context};
        this.f2707iobyxmoadg = objArr;
        this.f2710zoijcleaow = objArr;
    }

    private Object iobyxmoadg(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? iobyxmoadg(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void ppxfxbqfkf(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        zoijcleaow zoijcleaowVar = new zoijcleaow(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z13 = false;
        boolean z14 = false;
        String str = null;
        while (!z13) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z14 && name2.equals(str)) {
                        z14 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        zoijcleaowVar.nufgyqmvbu();
                    } else if (name2.equals("item")) {
                        if (!zoijcleaowVar.wkgbmnqykc()) {
                            v1.zoijcleaow zoijcleaowVar2 = zoijcleaowVar.f2735pmvmpeiblj;
                            if (zoijcleaowVar2 == null || !zoijcleaowVar2.iobyxmoadg()) {
                                zoijcleaowVar.iobyxmoadg();
                            } else {
                                zoijcleaowVar.zoijcleaow();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z13 = true;
                    }
                }
            } else if (!z14) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    zoijcleaowVar.gxszxtbevo(attributeSet);
                } else if (name3.equals("item")) {
                    zoijcleaowVar.lqeggnwhkg(attributeSet);
                } else if (name3.equals("menu")) {
                    ppxfxbqfkf(xmlPullParser, attributeSet, zoijcleaowVar.zoijcleaow());
                } else {
                    str = name3;
                    z14 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i13, Menu menu) {
        if (!(menu instanceof m1.iobyxmoadg)) {
            super.inflate(i13, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z13 = false;
        try {
            try {
                layout = this.f2708ppxfxbqfkf.getResources().getLayout(i13);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.eablkybsjg) {
                    androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar = (androidx.appcompat.view.menu.eablkybsjg) menu;
                    if (eablkybsjgVar.iozdgvuglv()) {
                        eablkybsjgVar.jztzpxfvev();
                        z13 = true;
                    }
                }
                ppxfxbqfkf(layout, attributeSetAsAttributeSet, menu);
                if (z13) {
                    ((androidx.appcompat.view.menu.eablkybsjg) menu).okpsazkaxt();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e13) {
                throw new InflateException("Error inflating menu XML", e13);
            } catch (XmlPullParserException e14) {
                throw new InflateException("Error inflating menu XML", e14);
            }
        } catch (Throwable th2) {
            if (z13) {
                ((androidx.appcompat.view.menu.eablkybsjg) menu).okpsazkaxt();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }

    Object zoijcleaow() {
        if (this.f2709wkgbmnqykc == null) {
            this.f2709wkgbmnqykc = iobyxmoadg(this.f2708ppxfxbqfkf);
        }
        return this.f2709wkgbmnqykc;
    }
}
