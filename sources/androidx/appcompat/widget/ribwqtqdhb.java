package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ribwqtqdhb extends hkdspvbjdz {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static boolean f3391ppxfxbqfkf = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final WeakReference f3392zoijcleaow;

    public ribwqtqdhb(Context context, Resources resources) {
        super(resources);
        this.f3392zoijcleaow = new WeakReference(context);
    }

    public static boolean ppxfxbqfkf() {
        zoijcleaow();
        return false;
    }

    public static boolean zoijcleaow() {
        return f3391ppxfxbqfkf;
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i13) {
        return super.getAnimation(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i13) {
        return super.getBoolean(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i13) {
        return super.getColor(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i13) {
        return super.getColorStateList(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i13) {
        return super.getDimension(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i13) {
        return super.getDimensionPixelOffset(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i13) {
        return super.getDimensionPixelSize(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i13, Resources.Theme theme) {
        return super.getDrawable(i13, theme);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i13, int i14) {
        return super.getDrawableForDensity(i13, i14);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i13, int i14, int i15) {
        return super.getFraction(i13, i14, i15);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i13) {
        return super.getIntArray(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i13) {
        return super.getInteger(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i13) {
        return super.getLayout(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i13) {
        return super.getMovie(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i13, int i14) {
        return super.getQuantityString(i13, i14);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i13, int i14) {
        return super.getQuantityText(i13, i14);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i13) {
        return super.getResourceEntryName(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i13) {
        return super.getResourceName(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i13) {
        return super.getResourcePackageName(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i13) {
        return super.getResourceTypeName(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i13) {
        return super.getString(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i13) {
        return super.getStringArray(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i13) {
        return super.getText(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i13) {
        return super.getTextArray(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i13, TypedValue typedValue, boolean z13) {
        super.getValue(i13, typedValue, z13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i13, int i14, TypedValue typedValue, boolean z13) {
        super.getValueForDensity(i13, i14, typedValue, z13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i13) {
        return super.getXml(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i13) {
        return super.obtainTypedArray(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i13) {
        return super.openRawResource(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i13) {
        return super.openRawResourceFd(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i13) {
        Context context = (Context) this.f3392zoijcleaow.get();
        return context != null ? jpowsppfya.lqeggnwhkg().kcexrzcfyt(context, this, i13) : iobyxmoadg(i13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i13, int i14, Resources.Theme theme) {
        return super.getDrawableForDensity(i13, i14, theme);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i13, int i14, Object[] objArr) {
        return super.getQuantityString(i13, i14, objArr);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i13, Object[] objArr) {
        return super.getString(i13, objArr);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i13, CharSequence charSequence) {
        return super.getText(i13, charSequence);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z13) {
        super.getValue(str, typedValue, z13);
    }

    @Override // androidx.appcompat.widget.hkdspvbjdz, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i13, TypedValue typedValue) {
        return super.openRawResource(i13, typedValue);
    }
}
