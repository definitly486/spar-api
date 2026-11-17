package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import t1.draadjrbmk;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {

    private static class eablkybsjg implements ActionMode.Callback {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f8539eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f8540gxszxtbevo = false;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ActionMode.Callback f8541iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Class f8542ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Method f8543wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final TextView f8544zoijcleaow;

        eablkybsjg(ActionMode.Callback callback, TextView textView) {
            this.f8541iobyxmoadg = callback;
            this.f8544zoijcleaow = textView;
        }

        private boolean eablkybsjg(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean gxszxtbevo(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private Intent iobyxmoadg() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private void lqeggnwhkg(Menu menu) {
            Context context = this.f8544zoijcleaow.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f8540gxszxtbevo) {
                this.f8540gxszxtbevo = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f8542ppxfxbqfkf = cls;
                    this.f8543wkgbmnqykc = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f8539eablkybsjg = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f8542ppxfxbqfkf = null;
                    this.f8543wkgbmnqykc = null;
                    this.f8539eablkybsjg = false;
                }
            }
            try {
                Method declaredMethod = (this.f8539eablkybsjg && this.f8542ppxfxbqfkf.isInstance(menu)) ? this.f8543wkgbmnqykc : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listPpxfxbqfkf = ppxfxbqfkf(context, packageManager);
                for (int i13 = 0; i13 < listPpxfxbqfkf.size(); i13++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listPpxfxbqfkf.get(i13);
                    menu.add(0, 0, i13 + 100, resolveInfo.loadLabel(packageManager)).setIntent(zoijcleaow(resolveInfo, this.f8544zoijcleaow)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private List ppxfxbqfkf(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(iobyxmoadg(), 0)) {
                if (gxszxtbevo(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private Intent zoijcleaow(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = iobyxmoadg().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !eablkybsjg(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f8541iobyxmoadg.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f8541iobyxmoadg.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f8541iobyxmoadg.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            lqeggnwhkg(menu);
            return this.f8541iobyxmoadg.onPrepareActionMode(actionMode, menu);
        }

        ActionMode.Callback wkgbmnqykc() {
            return this.f8541iobyxmoadg;
        }
    }

    static class iobyxmoadg {
        static void eablkybsjg(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void gxszxtbevo(TextView textView, int i13) {
            textView.setHyphenationFrequency(i13);
        }

        static int iobyxmoadg(TextView textView) {
            return textView.getBreakStrategy();
        }

        static void ppxfxbqfkf(TextView textView, int i13) {
            textView.setBreakStrategy(i13);
        }

        static void wkgbmnqykc(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static int zoijcleaow(TextView textView) {
            return textView.getHyphenationFrequency();
        }
    }

    static class ppxfxbqfkf {
        static String[] iobyxmoadg(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static void ppxfxbqfkf(TextView textView, int i13) {
            textView.setFirstBaselineToTopHeight(i13);
        }

        static PrecomputedText.Params zoijcleaow(TextView textView) {
            return textView.getTextMetricsParams();
        }
    }

    static class wkgbmnqykc {
        public static void iobyxmoadg(TextView textView, int i13, float f13) {
            textView.setLineHeight(i13, f13);
        }
    }

    static class zoijcleaow {
        static DecimalFormatSymbols iobyxmoadg(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    public static void agtfadlqog(TextView textView, int i13, float f13) {
        if (Build.VERSION.SDK_INT >= 34) {
            wkgbmnqykc.iobyxmoadg(textView, i13, f13);
        } else {
            wflxmlrfwp(textView, Math.round(TypedValue.applyDimension(i13, f13, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void btonecajqb(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void draadjrbmk(TextView textView, int i13) {
        u1.nufgyqmvbu.wkgbmnqykc(i13);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i14 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i13 > Math.abs(i14)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i13 - i14);
        }
    }

    public static void dxjokdxxww(TextView textView, PorterDuff.Mode mode) {
        u1.nufgyqmvbu.gxszxtbevo(textView);
        iobyxmoadg.eablkybsjg(textView, mode);
    }

    private static int eablkybsjg(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static void gtknphoqwx(TextView textView, int i13) {
        u1.nufgyqmvbu.wkgbmnqykc(i13);
        if (Build.VERSION.SDK_INT >= 28) {
            ppxfxbqfkf.ppxfxbqfkf(textView, i13);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i14 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i13 > Math.abs(i14)) {
            textView.setPadding(textView.getPaddingLeft(), i13 + i14, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    private static TextDirectionHeuristic gxszxtbevo(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(ppxfxbqfkf.iobyxmoadg(zoijcleaow.iobyxmoadg(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z13 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z13 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static Drawable[] iobyxmoadg(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static ActionMode.Callback kcexrzcfyt(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof eablkybsjg) || callback == null) ? callback : new eablkybsjg(callback, textView);
    }

    public static draadjrbmk.iobyxmoadg lqeggnwhkg(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new draadjrbmk.iobyxmoadg(ppxfxbqfkf.zoijcleaow(textView));
        }
        draadjrbmk.iobyxmoadg.C2682iobyxmoadg c2682iobyxmoadg = new draadjrbmk.iobyxmoadg.C2682iobyxmoadg(new TextPaint(textView.getPaint()));
        c2682iobyxmoadg.zoijcleaow(iobyxmoadg.iobyxmoadg(textView));
        c2682iobyxmoadg.ppxfxbqfkf(iobyxmoadg.zoijcleaow(textView));
        c2682iobyxmoadg.wkgbmnqykc(gxszxtbevo(textView));
        return c2682iobyxmoadg.iobyxmoadg();
    }

    public static void nufgyqmvbu(TextView textView, ColorStateList colorStateList) {
        u1.nufgyqmvbu.gxszxtbevo(textView);
        iobyxmoadg.wkgbmnqykc(textView, colorStateList);
    }

    public static void ojitshcjhn(TextView textView, draadjrbmk draadjrbmkVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        lqeggnwhkg(textView);
        throw null;
    }

    public static ActionMode.Callback oxmwwwfdhm(ActionMode.Callback callback) {
        return callback instanceof eablkybsjg ? ((eablkybsjg) callback).wkgbmnqykc() : callback;
    }

    public static int ppxfxbqfkf(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void rgvfuqvkyq(TextView textView, int i13) {
        textView.setTextAppearance(i13);
    }

    public static void vdvldrhtss(TextView textView, draadjrbmk.iobyxmoadg iobyxmoadgVar) {
        textView.setTextDirection(eablkybsjg(iobyxmoadgVar.wkgbmnqykc()));
        textView.getPaint().set(iobyxmoadgVar.eablkybsjg());
        iobyxmoadg.ppxfxbqfkf(textView, iobyxmoadgVar.zoijcleaow());
        iobyxmoadg.gxszxtbevo(textView, iobyxmoadgVar.ppxfxbqfkf());
    }

    public static void wflxmlrfwp(TextView textView, int i13) {
        u1.nufgyqmvbu.wkgbmnqykc(i13);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i13 != fontMetricsInt) {
            textView.setLineSpacing(i13 - fontMetricsInt, 1.0f);
        }
    }

    public static int wkgbmnqykc(TextView textView) {
        return textView.getMaxLines();
    }

    public static int zoijcleaow(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }
}
