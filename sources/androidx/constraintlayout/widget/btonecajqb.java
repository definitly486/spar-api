package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    int f8079iobyxmoadg = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    int f8082zoijcleaow = -1;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    int f8080ppxfxbqfkf = -1;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private SparseArray f8081wkgbmnqykc = new SparseArray();

    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        int f8083iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f8084ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        boolean f8085wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        ArrayList f8086zoijcleaow = new ArrayList();

        iobyxmoadg(Context context, XmlPullParser xmlPullParser) {
            this.f8084ppxfxbqfkf = -1;
            this.f8085wkgbmnqykc = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), nufgyqmvbu.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.State_android_id) {
                    this.f8083iobyxmoadg = typedArrayObtainStyledAttributes.getResourceId(index, this.f8083iobyxmoadg);
                } else if (index == nufgyqmvbu.State_constraints) {
                    this.f8084ppxfxbqfkf = typedArrayObtainStyledAttributes.getResourceId(index, this.f8084ppxfxbqfkf);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8084ppxfxbqfkf);
                    context.getResources().getResourceName(this.f8084ppxfxbqfkf);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8085wkgbmnqykc = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void iobyxmoadg(zoijcleaow zoijcleaowVar) {
            this.f8086zoijcleaow.add(zoijcleaowVar);
        }

        public int zoijcleaow(float f13, float f14) {
            for (int i13 = 0; i13 < this.f8086zoijcleaow.size(); i13++) {
                if (((zoijcleaow) this.f8086zoijcleaow.get(i13)).iobyxmoadg(f13, f14)) {
                    return i13;
                }
            }
            return -1;
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f8087eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f8088gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float f8089iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f8090ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        float f8091wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f8092zoijcleaow;

        zoijcleaow(Context context, XmlPullParser xmlPullParser) {
            this.f8089iobyxmoadg = Float.NaN;
            this.f8092zoijcleaow = Float.NaN;
            this.f8090ppxfxbqfkf = Float.NaN;
            this.f8091wkgbmnqykc = Float.NaN;
            this.f8087eablkybsjg = -1;
            this.f8088gxszxtbevo = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), nufgyqmvbu.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == nufgyqmvbu.Variant_constraints) {
                    this.f8087eablkybsjg = typedArrayObtainStyledAttributes.getResourceId(index, this.f8087eablkybsjg);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8087eablkybsjg);
                    context.getResources().getResourceName(this.f8087eablkybsjg);
                    if ("layout".equals(resourceTypeName)) {
                        this.f8088gxszxtbevo = true;
                    }
                } else if (index == nufgyqmvbu.Variant_region_heightLessThan) {
                    this.f8091wkgbmnqykc = typedArrayObtainStyledAttributes.getDimension(index, this.f8091wkgbmnqykc);
                } else if (index == nufgyqmvbu.Variant_region_heightMoreThan) {
                    this.f8092zoijcleaow = typedArrayObtainStyledAttributes.getDimension(index, this.f8092zoijcleaow);
                } else if (index == nufgyqmvbu.Variant_region_widthLessThan) {
                    this.f8090ppxfxbqfkf = typedArrayObtainStyledAttributes.getDimension(index, this.f8090ppxfxbqfkf);
                } else if (index == nufgyqmvbu.Variant_region_widthMoreThan) {
                    this.f8089iobyxmoadg = typedArrayObtainStyledAttributes.getDimension(index, this.f8089iobyxmoadg);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean iobyxmoadg(float f13, float f14) {
            if (!Float.isNaN(this.f8089iobyxmoadg) && f13 < this.f8089iobyxmoadg) {
                return false;
            }
            if (!Float.isNaN(this.f8092zoijcleaow) && f14 < this.f8092zoijcleaow) {
                return false;
            }
            if (Float.isNaN(this.f8090ppxfxbqfkf) || f13 <= this.f8090ppxfxbqfkf) {
                return Float.isNaN(this.f8091wkgbmnqykc) || f14 <= this.f8091wkgbmnqykc;
            }
            return false;
        }
    }

    public btonecajqb(Context context, XmlPullParser xmlPullParser) {
        zoijcleaow(context, xmlPullParser);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void zoijcleaow(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), nufgyqmvbu.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == nufgyqmvbu.StateSet_defaultState) {
                this.f8079iobyxmoadg = typedArrayObtainStyledAttributes.getResourceId(index, this.f8079iobyxmoadg);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            iobyxmoadg iobyxmoadgVar = null;
            while (true) {
                byte b13 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b13 = 2;
                            } else {
                                b13 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b13 = 0;
                            } else {
                                b13 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b13 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b13 = 3;
                            } else {
                                b13 = -1;
                            }
                            break;
                        default:
                            b13 = -1;
                            break;
                    }
                    if (b13 == 2) {
                        iobyxmoadgVar = new iobyxmoadg(context, xmlPullParser);
                        this.f8081wkgbmnqykc.put(iobyxmoadgVar.f8083iobyxmoadg, iobyxmoadgVar);
                    } else if (b13 == 3) {
                        zoijcleaow zoijcleaowVar = new zoijcleaow(context, xmlPullParser);
                        if (iobyxmoadgVar != null) {
                            iobyxmoadgVar.iobyxmoadg(zoijcleaowVar);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e13) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e13);
        } catch (XmlPullParserException e14) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e14);
        }
    }

    public int iobyxmoadg(int i13, int i14, float f13, float f14) {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8081wkgbmnqykc.get(i14);
        if (iobyxmoadgVar == null) {
            return i14;
        }
        if (f13 == -1.0f || f14 == -1.0f) {
            if (iobyxmoadgVar.f8084ppxfxbqfkf == i13) {
                return i13;
            }
            Iterator it = iobyxmoadgVar.f8086zoijcleaow.iterator();
            while (it.hasNext()) {
                if (i13 == ((zoijcleaow) it.next()).f8087eablkybsjg) {
                    return i13;
                }
            }
            return iobyxmoadgVar.f8084ppxfxbqfkf;
        }
        zoijcleaow zoijcleaowVar = null;
        for (zoijcleaow zoijcleaowVar2 : iobyxmoadgVar.f8086zoijcleaow) {
            if (zoijcleaowVar2.iobyxmoadg(f13, f14)) {
                if (i13 == zoijcleaowVar2.f8087eablkybsjg) {
                    return i13;
                }
                zoijcleaowVar = zoijcleaowVar2;
            }
        }
        return zoijcleaowVar != null ? zoijcleaowVar.f8087eablkybsjg : iobyxmoadgVar.f8084ppxfxbqfkf;
    }

    public int ppxfxbqfkf(int i13, int i14, int i15) {
        return wkgbmnqykc(-1, i13, i14, i15);
    }

    public int wkgbmnqykc(int i13, int i14, float f13, float f14) {
        int iZoijcleaow;
        if (i13 != i14) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8081wkgbmnqykc.get(i14);
            if (iobyxmoadgVar == null) {
                return -1;
            }
            int iZoijcleaow2 = iobyxmoadgVar.zoijcleaow(f13, f14);
            return iZoijcleaow2 == -1 ? iobyxmoadgVar.f8084ppxfxbqfkf : ((zoijcleaow) iobyxmoadgVar.f8086zoijcleaow.get(iZoijcleaow2)).f8087eablkybsjg;
        }
        iobyxmoadg iobyxmoadgVar2 = i14 == -1 ? (iobyxmoadg) this.f8081wkgbmnqykc.valueAt(0) : (iobyxmoadg) this.f8081wkgbmnqykc.get(this.f8082zoijcleaow);
        if (iobyxmoadgVar2 == null) {
            return -1;
        }
        if ((this.f8080ppxfxbqfkf == -1 || !((zoijcleaow) iobyxmoadgVar2.f8086zoijcleaow.get(i13)).iobyxmoadg(f13, f14)) && i13 != (iZoijcleaow = iobyxmoadgVar2.zoijcleaow(f13, f14))) {
            return iZoijcleaow == -1 ? iobyxmoadgVar2.f8084ppxfxbqfkf : ((zoijcleaow) iobyxmoadgVar2.f8086zoijcleaow.get(iZoijcleaow)).f8087eablkybsjg;
        }
        return i13;
    }
}
