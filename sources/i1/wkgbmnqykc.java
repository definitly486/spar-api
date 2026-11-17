package i1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Shader f41680iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f41681ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ColorStateList f41682zoijcleaow;

    private wkgbmnqykc(Shader shader, ColorStateList colorStateList, int i13) {
        this.f41680iobyxmoadg = shader;
        this.f41682zoijcleaow = colorStateList;
        this.f41681ppxfxbqfkf = i13;
    }

    private static wkgbmnqykc iobyxmoadg(Resources resources, int i13, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i13);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return wkgbmnqykc(gxszxtbevo.zoijcleaow(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return ppxfxbqfkf(ppxfxbqfkf.zoijcleaow(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static wkgbmnqykc lqeggnwhkg(Resources resources, int i13, Resources.Theme theme) {
        try {
            return iobyxmoadg(resources, i13, theme);
        } catch (Exception e13) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e13);
            return null;
        }
    }

    static wkgbmnqykc ppxfxbqfkf(ColorStateList colorStateList) {
        return new wkgbmnqykc(null, colorStateList, colorStateList.getDefaultColor());
    }

    static wkgbmnqykc wkgbmnqykc(Shader shader) {
        return new wkgbmnqykc(shader, null, 0);
    }

    static wkgbmnqykc zoijcleaow(int i13) {
        return new wkgbmnqykc(null, null, i13);
    }

    public boolean btonecajqb(int[] iArr) {
        if (dxjokdxxww()) {
            ColorStateList colorStateList = this.f41682zoijcleaow;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f41681ppxfxbqfkf) {
                this.f41681ppxfxbqfkf = colorForState;
                return true;
            }
        }
        return false;
    }

    public boolean draadjrbmk() {
        return nufgyqmvbu() || this.f41681ppxfxbqfkf != 0;
    }

    public boolean dxjokdxxww() {
        ColorStateList colorStateList;
        return this.f41680iobyxmoadg == null && (colorStateList = this.f41682zoijcleaow) != null && colorStateList.isStateful();
    }

    public int eablkybsjg() {
        return this.f41681ppxfxbqfkf;
    }

    public void gtknphoqwx(int i13) {
        this.f41681ppxfxbqfkf = i13;
    }

    public Shader gxszxtbevo() {
        return this.f41680iobyxmoadg;
    }

    public boolean nufgyqmvbu() {
        return this.f41680iobyxmoadg != null;
    }
}
