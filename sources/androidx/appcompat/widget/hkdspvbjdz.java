package androidx.appcompat.widget;

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
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
abstract class hkdspvbjdz extends Resources {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Resources f3311iobyxmoadg;

    public hkdspvbjdz(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f3311iobyxmoadg = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i13) {
        return this.f3311iobyxmoadg.getAnimation(i13);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i13) {
        return this.f3311iobyxmoadg.getBoolean(i13);
    }

    @Override // android.content.res.Resources
    public int getColor(int i13) {
        return this.f3311iobyxmoadg.getColor(i13);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i13) {
        return this.f3311iobyxmoadg.getColorStateList(i13);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f3311iobyxmoadg.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i13) {
        return this.f3311iobyxmoadg.getDimension(i13);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i13) {
        return this.f3311iobyxmoadg.getDimensionPixelOffset(i13);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i13) {
        return this.f3311iobyxmoadg.getDimensionPixelSize(i13);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f3311iobyxmoadg.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i13, Resources.Theme theme) {
        return i1.nufgyqmvbu.gxszxtbevo(this.f3311iobyxmoadg, i13, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i13, int i14) {
        return i1.nufgyqmvbu.lqeggnwhkg(this.f3311iobyxmoadg, i13, i14, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i13, int i14, int i15) {
        return this.f3311iobyxmoadg.getFraction(i13, i14, i15);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f3311iobyxmoadg.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i13) {
        return this.f3311iobyxmoadg.getIntArray(i13);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i13) {
        return this.f3311iobyxmoadg.getInteger(i13);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i13) {
        return this.f3311iobyxmoadg.getLayout(i13);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i13) {
        return this.f3311iobyxmoadg.getMovie(i13);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i13, int i14, Object... objArr) {
        return this.f3311iobyxmoadg.getQuantityString(i13, i14, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i13, int i14) {
        return this.f3311iobyxmoadg.getQuantityText(i13, i14);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i13) {
        return this.f3311iobyxmoadg.getResourceEntryName(i13);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i13) {
        return this.f3311iobyxmoadg.getResourceName(i13);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i13) {
        return this.f3311iobyxmoadg.getResourcePackageName(i13);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i13) {
        return this.f3311iobyxmoadg.getResourceTypeName(i13);
    }

    @Override // android.content.res.Resources
    public String getString(int i13) {
        return this.f3311iobyxmoadg.getString(i13);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i13) {
        return this.f3311iobyxmoadg.getStringArray(i13);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i13) {
        return this.f3311iobyxmoadg.getText(i13);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i13) {
        return this.f3311iobyxmoadg.getTextArray(i13);
    }

    @Override // android.content.res.Resources
    public void getValue(int i13, TypedValue typedValue, boolean z13) {
        this.f3311iobyxmoadg.getValue(i13, typedValue, z13);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i13, int i14, TypedValue typedValue, boolean z13) {
        this.f3311iobyxmoadg.getValueForDensity(i13, i14, typedValue, z13);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i13) {
        return this.f3311iobyxmoadg.getXml(i13);
    }

    final Drawable iobyxmoadg(int i13) {
        return super.getDrawable(i13);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f3311iobyxmoadg.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i13) {
        return this.f3311iobyxmoadg.obtainTypedArray(i13);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i13) {
        return this.f3311iobyxmoadg.openRawResource(i13);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i13) {
        return this.f3311iobyxmoadg.openRawResourceFd(i13);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f3311iobyxmoadg.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f3311iobyxmoadg.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f3311iobyxmoadg;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i13, int i14, Resources.Theme theme) {
        return i1.nufgyqmvbu.lqeggnwhkg(this.f3311iobyxmoadg, i13, i14, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i13, int i14) {
        return this.f3311iobyxmoadg.getQuantityString(i13, i14);
    }

    @Override // android.content.res.Resources
    public String getString(int i13, Object... objArr) {
        return this.f3311iobyxmoadg.getString(i13, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i13, CharSequence charSequence) {
        return this.f3311iobyxmoadg.getText(i13, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z13) {
        this.f3311iobyxmoadg.getValue(str, typedValue, z13);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i13, TypedValue typedValue) {
        return this.f3311iobyxmoadg.openRawResource(i13, typedValue);
    }
}
