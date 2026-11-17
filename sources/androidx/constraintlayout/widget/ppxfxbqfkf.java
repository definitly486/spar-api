package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f8129iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    wkgbmnqykc f8132zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f8130ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    int f8131wkgbmnqykc = -1;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private SparseArray f8127eablkybsjg = new SparseArray();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private SparseArray f8128gxszxtbevo = new SparseArray();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f8133iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f8134ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        wkgbmnqykc f8135wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        ArrayList f8136zoijcleaow = new ArrayList();

        iobyxmoadg(Context context, XmlPullParser xmlPullParser) {
            this.f8134ppxfxbqfkf = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), nufgyqmvbu.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.State_android_id) {
                    this.f8133iobyxmoadg = typedArrayObtainStyledAttributes.getResourceId(index, this.f8133iobyxmoadg);
                } else if (index == nufgyqmvbu.State_constraints) {
                    this.f8134ppxfxbqfkf = typedArrayObtainStyledAttributes.getResourceId(index, this.f8134ppxfxbqfkf);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8134ppxfxbqfkf);
                    context.getResources().getResourceName(this.f8134ppxfxbqfkf);
                    if ("layout".equals(resourceTypeName)) {
                        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
                        this.f8135wkgbmnqykc = wkgbmnqykcVar;
                        wkgbmnqykcVar.agtfadlqog(context, this.f8134ppxfxbqfkf);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f8136zoijcleaow.add(zoijcleaowVar);
        }

        public int zoijcleaow(float f13, float f14) {
            for (int i13 = 0; i13 < this.f8136zoijcleaow.size(); i13++) {
                if (((zoijcleaow) this.f8136zoijcleaow.get(i13)).iobyxmoadg(f13, f14)) {
                    return i13;
                }
            }
            return -1;
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f8137eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        wkgbmnqykc f8138gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float f8139iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f8140ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        float f8141wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f8142zoijcleaow;

        zoijcleaow(Context context, XmlPullParser xmlPullParser) {
            this.f8139iobyxmoadg = Float.NaN;
            this.f8142zoijcleaow = Float.NaN;
            this.f8140ppxfxbqfkf = Float.NaN;
            this.f8141wkgbmnqykc = Float.NaN;
            this.f8137eablkybsjg = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), nufgyqmvbu.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.Variant_constraints) {
                    this.f8137eablkybsjg = typedArrayObtainStyledAttributes.getResourceId(index, this.f8137eablkybsjg);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8137eablkybsjg);
                    context.getResources().getResourceName(this.f8137eablkybsjg);
                    if ("layout".equals(resourceTypeName)) {
                        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
                        this.f8138gxszxtbevo = wkgbmnqykcVar;
                        wkgbmnqykcVar.agtfadlqog(context, this.f8137eablkybsjg);
                    }
                } else if (index == nufgyqmvbu.Variant_region_heightLessThan) {
                    this.f8141wkgbmnqykc = typedArrayObtainStyledAttributes.getDimension(index, this.f8141wkgbmnqykc);
                } else if (index == nufgyqmvbu.Variant_region_heightMoreThan) {
                    this.f8142zoijcleaow = typedArrayObtainStyledAttributes.getDimension(index, this.f8142zoijcleaow);
                } else if (index == nufgyqmvbu.Variant_region_widthLessThan) {
                    this.f8140ppxfxbqfkf = typedArrayObtainStyledAttributes.getDimension(index, this.f8140ppxfxbqfkf);
                } else if (index == nufgyqmvbu.Variant_region_widthMoreThan) {
                    this.f8139iobyxmoadg = typedArrayObtainStyledAttributes.getDimension(index, this.f8139iobyxmoadg);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean iobyxmoadg(float f13, float f14) {
            if (!Float.isNaN(this.f8139iobyxmoadg) && f13 < this.f8139iobyxmoadg) {
                return false;
            }
            if (!Float.isNaN(this.f8142zoijcleaow) && f14 < this.f8142zoijcleaow) {
                return false;
            }
            if (Float.isNaN(this.f8140ppxfxbqfkf) || f13 <= this.f8140ppxfxbqfkf) {
                return Float.isNaN(this.f8141wkgbmnqykc) || f14 <= this.f8141wkgbmnqykc;
            }
            return false;
        }
    }

    ppxfxbqfkf(Context context, ConstraintLayout constraintLayout, int i13) {
        this.f8129iobyxmoadg = constraintLayout;
        iobyxmoadg(context, i13);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void iobyxmoadg(Context context, int i13) {
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            int eventType = xml.getEventType();
            iobyxmoadg iobyxmoadgVar = null;
            while (true) {
                byte b13 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b13 = -1;
                            } else {
                                b13 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b13 = -1;
                            } else {
                                b13 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b13 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b13 = -1;
                            } else {
                                b13 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b13 = -1;
                            } else {
                                b13 = 3;
                            }
                            break;
                        default:
                            b13 = -1;
                            break;
                    }
                    if (b13 == 2) {
                        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg(context, xml);
                        this.f8127eablkybsjg.put(iobyxmoadgVar2.f8133iobyxmoadg, iobyxmoadgVar2);
                        iobyxmoadgVar = iobyxmoadgVar2;
                    } else if (b13 == 3) {
                        zoijcleaow zoijcleaowVar = new zoijcleaow(context, xml);
                        if (iobyxmoadgVar != null) {
                            iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
                        }
                    } else if (b13 == 4) {
                        zoijcleaow(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e13) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i13, e13);
        } catch (XmlPullParserException e14) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i13, e14);
        }
    }

    private void zoijcleaow(Context context, XmlPullParser xmlPullParser) {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlPullParser.getAttributeName(i13);
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains(CardDateFormatTextWatcher.DIVIDER_CHARACTER) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                wkgbmnqykcVar.istkbnxepw(context, xmlPullParser);
                this.f8128gxszxtbevo.put(identifier, wkgbmnqykcVar);
                return;
            }
        }
    }

    public void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
    }

    public void wkgbmnqykc(int i13, float f13, float f14) {
        int iZoijcleaow;
        int i14 = this.f8130ppxfxbqfkf;
        if (i14 == i13) {
            iobyxmoadg iobyxmoadgVar = i13 == -1 ? (iobyxmoadg) this.f8127eablkybsjg.valueAt(0) : (iobyxmoadg) this.f8127eablkybsjg.get(i14);
            int i15 = this.f8131wkgbmnqykc;
            if ((i15 == -1 || !((zoijcleaow) iobyxmoadgVar.f8136zoijcleaow.get(i15)).iobyxmoadg(f13, f14)) && this.f8131wkgbmnqykc != (iZoijcleaow = iobyxmoadgVar.zoijcleaow(f13, f14))) {
                wkgbmnqykc wkgbmnqykcVar = iZoijcleaow == -1 ? this.f8132zoijcleaow : ((zoijcleaow) iobyxmoadgVar.f8136zoijcleaow.get(iZoijcleaow)).f8138gxszxtbevo;
                if (iZoijcleaow != -1) {
                    int i16 = ((zoijcleaow) iobyxmoadgVar.f8136zoijcleaow.get(iZoijcleaow)).f8137eablkybsjg;
                }
                if (wkgbmnqykcVar == null) {
                    return;
                }
                this.f8131wkgbmnqykc = iZoijcleaow;
                wkgbmnqykcVar.dxjokdxxww(this.f8129iobyxmoadg);
                return;
            }
            return;
        }
        this.f8130ppxfxbqfkf = i13;
        iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f8127eablkybsjg.get(i13);
        int iZoijcleaow2 = iobyxmoadgVar2.zoijcleaow(f13, f14);
        wkgbmnqykc wkgbmnqykcVar2 = iZoijcleaow2 == -1 ? iobyxmoadgVar2.f8135wkgbmnqykc : ((zoijcleaow) iobyxmoadgVar2.f8136zoijcleaow.get(iZoijcleaow2)).f8138gxszxtbevo;
        if (iZoijcleaow2 != -1) {
            int i17 = ((zoijcleaow) iobyxmoadgVar2.f8136zoijcleaow.get(iZoijcleaow2)).f8137eablkybsjg;
        }
        if (wkgbmnqykcVar2 != null) {
            this.f8131wkgbmnqykc = iZoijcleaow2;
            wkgbmnqykcVar2.dxjokdxxww(this.f8129iobyxmoadg);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i13 + ", dim =" + f13 + ", " + f14);
    }
}
