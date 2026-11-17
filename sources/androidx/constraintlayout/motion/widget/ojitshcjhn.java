package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final MotionLayout f7846iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    float f7847kcexrzcfyt;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    final kcexrzcfyt f7851oxmwwwfdhm;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private MotionLayout.lqeggnwhkg f7853rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f7854vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private MotionEvent f7855wflxmlrfwp;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    float f7857zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    androidx.constraintlayout.widget.btonecajqb f7858zoijcleaow = null;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    zoijcleaow f7852ppxfxbqfkf = null;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f7856wkgbmnqykc = false;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ArrayList f7843eablkybsjg = new ArrayList();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private zoijcleaow f7845gxszxtbevo = null;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private ArrayList f7848lqeggnwhkg = new ArrayList();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private SparseArray f7849nufgyqmvbu = new SparseArray();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private HashMap f7842dxjokdxxww = new HashMap();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private SparseIntArray f7840btonecajqb = new SparseIntArray();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f7844gtknphoqwx = OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f7841draadjrbmk = 0;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f7839agtfadlqog = false;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f7850ojitshcjhn = false;

    class iobyxmoadg implements Interpolator {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ a1.ppxfxbqfkf f7859iobyxmoadg;

        iobyxmoadg(a1.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f7859iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f13) {
            return (float) this.f7859iobyxmoadg.iobyxmoadg(f13);
        }
    }

    ojitshcjhn(Context context, MotionLayout motionLayout, int i13) {
        this.f7846iobyxmoadg = motionLayout;
        this.f7851oxmwwwfdhm = new kcexrzcfyt(motionLayout);
        pkzmftpjix(context, i13);
        this.f7849nufgyqmvbu.put(androidx.constraintlayout.widget.lqeggnwhkg.motion_base, new androidx.constraintlayout.widget.wkgbmnqykc());
        this.f7842dxjokdxxww.put("motion_base", Integer.valueOf(androidx.constraintlayout.widget.lqeggnwhkg.motion_base));
    }

    private void cllcsxoeiz(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.nufgyqmvbu.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionScene_defaultDuration) {
                int i14 = typedArrayObtainStyledAttributes.getInt(index, this.f7844gtknphoqwx);
                this.f7844gtknphoqwx = i14;
                if (i14 < 8) {
                    this.f7844gtknphoqwx = 8;
                }
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionScene_layoutDuringTransition) {
                this.f7841draadjrbmk = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private int cqumvgiudr(int i13) {
        int iPpxfxbqfkf;
        androidx.constraintlayout.widget.btonecajqb btonecajqbVar = this.f7858zoijcleaow;
        return (btonecajqbVar == null || (iPpxfxbqfkf = btonecajqbVar.ppxfxbqfkf(i13, -1, -1)) == -1) ? i13 : iPpxfxbqfkf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:6:0x002e  */
    private int hcddaimhww(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar = new androidx.constraintlayout.widget.wkgbmnqykc();
        wkgbmnqykcVar.wypolnanlu(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iVdvldrhtss = -1;
        int iVdvldrhtss2 = -1;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlPullParser.getAttributeName(i13);
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iVdvldrhtss2 = vdvldrhtss(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        wkgbmnqykcVar.f8146eablkybsjg = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "x_left":
                                wkgbmnqykcVar.f8146eablkybsjg = 4;
                                break;
                            case "left":
                                wkgbmnqykcVar.f8146eablkybsjg = 2;
                                break;
                            case "none":
                                wkgbmnqykcVar.f8146eablkybsjg = 0;
                                break;
                            case "right":
                                wkgbmnqykcVar.f8146eablkybsjg = 1;
                                break;
                            case "x_right":
                                wkgbmnqykcVar.f8146eablkybsjg = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iVdvldrhtss = vdvldrhtss(context, attributeValue);
                    this.f7842dxjokdxxww.put(ribwqtqdhb(attributeValue), Integer.valueOf(iVdvldrhtss));
                    wkgbmnqykcVar.f8153zoijcleaow = androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(context, iVdvldrhtss);
                    break;
                case "stateLabels":
                    wkgbmnqykcVar.stevsuqkhv(attributeValue);
                    break;
            }
        }
        if (iVdvldrhtss != -1) {
            if (this.f7846iobyxmoadg.f7597wypolnanlu != 0) {
                wkgbmnqykcVar.kegysxyocb(true);
            }
            wkgbmnqykcVar.istkbnxepw(context, xmlPullParser);
            if (iVdvldrhtss2 != -1) {
                this.f7840btonecajqb.put(iVdvldrhtss, iVdvldrhtss2);
            }
            this.f7849nufgyqmvbu.put(iVdvldrhtss, wkgbmnqykcVar);
        }
        return iVdvldrhtss;
    }

    private void hkdspvbjdz(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.nufgyqmvbu.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.nufgyqmvbu.include_constraintSet) {
                jpowsppfya(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int jpowsppfya(Context context, int i13) {
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return hcddaimhww(context, xml);
                }
            }
            return -1;
        } catch (IOException e13) {
            Log.e("MotionScene", "Error parsing resource: " + i13, e13);
            return -1;
        } catch (XmlPullParserException e14) {
            Log.e("MotionScene", "Error parsing resource: " + i13, e14);
            return -1;
        }
    }

    private void kegysxyocb(int i13, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar = (androidx.constraintlayout.widget.wkgbmnqykc) this.f7849nufgyqmvbu.get(i13);
        wkgbmnqykcVar.f8151ppxfxbqfkf = wkgbmnqykcVar.f8153zoijcleaow;
        int i14 = this.f7840btonecajqb.get(i13);
        if (i14 > 0) {
            kegysxyocb(i14, motionLayout);
            androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar2 = (androidx.constraintlayout.widget.wkgbmnqykc) this.f7849nufgyqmvbu.get(i14);
            if (wkgbmnqykcVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(this.f7846iobyxmoadg.getContext(), i14));
                return;
            }
            wkgbmnqykcVar.f8151ppxfxbqfkf += CardDateFormatTextWatcher.DIVIDER_CHARACTER + wkgbmnqykcVar2.f8151ppxfxbqfkf;
            wkgbmnqykcVar.hcddaimhww(wkgbmnqykcVar2);
        } else {
            wkgbmnqykcVar.f8151ppxfxbqfkf += "  layout";
            wkgbmnqykcVar.pkzmftpjix(motionLayout);
        }
        wkgbmnqykcVar.nufgyqmvbu(wkgbmnqykcVar);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    private void pkzmftpjix(Context context, int i13) {
        XmlResourceParser xml = context.getResources().getXml(i13);
        try {
            int eventType = xml.getEventType();
            zoijcleaow zoijcleaowVar = null;
            while (true) {
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    switch (xml.getName()) {
                        case "MotionScene":
                            cllcsxoeiz(context, xml);
                            break;
                        case "Transition":
                            ArrayList arrayList = this.f7843eablkybsjg;
                            zoijcleaowVar = new zoijcleaow(this, context, xml);
                            arrayList.add(zoijcleaowVar);
                            if (this.f7852ppxfxbqfkf == null && !zoijcleaowVar.f7878zoijcleaow) {
                                this.f7852ppxfxbqfkf = zoijcleaowVar;
                                if (zoijcleaowVar.f7863draadjrbmk != null) {
                                    this.f7852ppxfxbqfkf.f7863draadjrbmk.cqumvgiudr(this.f7854vdvldrhtss);
                                }
                            }
                            if (!zoijcleaowVar.f7878zoijcleaow) {
                                break;
                            } else {
                                if (zoijcleaowVar.f7873ppxfxbqfkf == -1) {
                                    this.f7845gxszxtbevo = zoijcleaowVar;
                                } else {
                                    this.f7848lqeggnwhkg.add(zoijcleaowVar);
                                }
                                this.f7843eablkybsjg.remove(zoijcleaowVar);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (zoijcleaowVar == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i13) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (zoijcleaowVar == null) {
                                break;
                            } else {
                                zoijcleaowVar.f7863draadjrbmk = new rgvfuqvkyq(context, this.f7846iobyxmoadg, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (zoijcleaowVar != null && !this.f7846iobyxmoadg.isInEditMode()) {
                                zoijcleaowVar.yggfygwlhe(context, xml);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "StateSet":
                            this.f7858zoijcleaow = new androidx.constraintlayout.widget.btonecajqb(context, xml);
                            break;
                        case "ConstraintSet":
                            hcddaimhww(context, xml);
                            break;
                        case "include":
                        case "Include":
                            hkdspvbjdz(context, xml);
                            break;
                        case "KeyFrameSet":
                            gxszxtbevo gxszxtbevoVar = new gxszxtbevo(context, xml);
                            if (zoijcleaowVar == null) {
                                break;
                            } else {
                                zoijcleaowVar.f7866gtknphoqwx.add(gxszxtbevoVar);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            this.f7851oxmwwwfdhm.iobyxmoadg(new oxmwwwfdhm(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e13) {
            Log.e("MotionScene", "Error parsing resource: " + i13, e13);
        } catch (XmlPullParserException e14) {
            Log.e("MotionScene", "Error parsing resource: " + i13, e14);
        }
    }

    public static String ribwqtqdhb(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    private int vdvldrhtss(Context context, String str) {
        int identifier;
        if (str.contains(CardDateFormatTextWatcher.DIVIDER_CHARACTER)) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    private boolean wwaezpbzkn(int i13) {
        int i14 = this.f7840btonecajqb.get(i13);
        int size = this.f7840btonecajqb.size();
        while (i14 > 0) {
            if (i14 == i13) {
                return true;
            }
            int i15 = size - 1;
            if (size < 0) {
                return true;
            }
            i14 = this.f7840btonecajqb.get(i14);
            size = i15;
        }
        return false;
    }

    private boolean ylkuphrtab() {
        return this.f7853rgvfuqvkyq != null;
    }

    public ArrayList agtfadlqog() {
        return this.f7843eablkybsjg;
    }

    int btonecajqb() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.wkgbmnqykc();
    }

    public float cdpycssgdh() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar.f7864dxjokdxxww;
        }
        return 0.0f;
    }

    public void crxdokpmqz(zoijcleaow zoijcleaowVar) {
        this.f7852ppxfxbqfkf = zoijcleaowVar;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return;
        }
        this.f7852ppxfxbqfkf.f7863draadjrbmk.cqumvgiudr(this.f7854vdvldrhtss);
    }

    androidx.constraintlayout.widget.wkgbmnqykc draadjrbmk(int i13, int i14, int i15) {
        int iPpxfxbqfkf;
        androidx.constraintlayout.widget.btonecajqb btonecajqbVar = this.f7858zoijcleaow;
        if (btonecajqbVar != null && (iPpxfxbqfkf = btonecajqbVar.ppxfxbqfkf(i13, i14, i15)) != -1) {
            i13 = iPpxfxbqfkf;
        }
        if (this.f7849nufgyqmvbu.get(i13) != null) {
            return (androidx.constraintlayout.widget.wkgbmnqykc) this.f7849nufgyqmvbu.get(i13);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(this.f7846iobyxmoadg.getContext(), i13) + " In MotionScene");
        SparseArray sparseArray = this.f7849nufgyqmvbu;
        return (androidx.constraintlayout.widget.wkgbmnqykc) sparseArray.get(sparseArray.keyAt(0));
    }

    void dsvhmnatus(float f13, float f14) {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return;
        }
        this.f7852ppxfxbqfkf.f7863draadjrbmk.yggfygwlhe(f13, f14);
    }

    public int dxjokdxxww() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar.f7874rgvfuqvkyq;
        }
        return -1;
    }

    int esjtqupxsv() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.gtknphoqwx();
    }

    androidx.constraintlayout.widget.wkgbmnqykc gtknphoqwx(int i13) {
        return draadjrbmk(i13, -1, -1);
    }

    public void gxszxtbevo(MotionLayout motionLayout, int i13) {
        for (zoijcleaow zoijcleaowVar : this.f7843eablkybsjg) {
            if (zoijcleaowVar.f7876wflxmlrfwp.size() > 0) {
                Iterator it = zoijcleaowVar.f7876wflxmlrfwp.iterator();
                while (it.hasNext()) {
                    ((zoijcleaow.iobyxmoadg) it.next()).ppxfxbqfkf(motionLayout);
                }
            }
        }
        for (zoijcleaow zoijcleaowVar2 : this.f7848lqeggnwhkg) {
            if (zoijcleaowVar2.f7876wflxmlrfwp.size() > 0) {
                Iterator it2 = zoijcleaowVar2.f7876wflxmlrfwp.iterator();
                while (it2.hasNext()) {
                    ((zoijcleaow.iobyxmoadg) it2.next()).ppxfxbqfkf(motionLayout);
                }
            }
        }
        for (zoijcleaow zoijcleaowVar3 : this.f7843eablkybsjg) {
            if (zoijcleaowVar3.f7876wflxmlrfwp.size() > 0) {
                Iterator it3 = zoijcleaowVar3.f7876wflxmlrfwp.iterator();
                while (it3.hasNext()) {
                    ((zoijcleaow.iobyxmoadg) it3.next()).iobyxmoadg(motionLayout, i13, zoijcleaowVar3);
                }
            }
        }
        for (zoijcleaow zoijcleaowVar4 : this.f7848lqeggnwhkg) {
            if (zoijcleaowVar4.f7876wflxmlrfwp.size() > 0) {
                Iterator it4 = zoijcleaowVar4.f7876wflxmlrfwp.iterator();
                while (it4.hasNext()) {
                    ((zoijcleaow.iobyxmoadg) it4.next()).iobyxmoadg(motionLayout, i13, zoijcleaowVar4);
                }
            }
        }
    }

    public zoijcleaow iozdgvuglv(int i13) {
        for (zoijcleaow zoijcleaowVar : this.f7843eablkybsjg) {
            if (zoijcleaowVar.f7868iobyxmoadg == i13) {
                return zoijcleaowVar;
            }
        }
        return null;
    }

    float istkbnxepw() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0.0f;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.ojitshcjhn();
    }

    float iwizpuwonk(float f13, float f14) {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0.0f;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.btonecajqb(f13, f14);
    }

    public void jhduphickx(int i13, View... viewArr) {
        this.f7851oxmwwwfdhm.nufgyqmvbu(i13, viewArr);
    }

    void jlmebxxoox() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return;
        }
        this.f7852ppxfxbqfkf.f7863draadjrbmk.lereixgezr();
    }

    boolean jyumaefscl() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return false;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.dxjokdxxww();
    }

    public void kcexrzcfyt(draadjrbmk draadjrbmkVar) {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar != null) {
            Iterator it = zoijcleaowVar.f7866gtknphoqwx.iterator();
            while (it.hasNext()) {
                ((gxszxtbevo) it.next()).zoijcleaow(draadjrbmkVar);
            }
        } else {
            zoijcleaow zoijcleaowVar2 = this.f7845gxszxtbevo;
            if (zoijcleaowVar2 != null) {
                Iterator it2 = zoijcleaowVar2.f7866gtknphoqwx.iterator();
                while (it2.hasNext()) {
                    ((gxszxtbevo) it2.next()).zoijcleaow(draadjrbmkVar);
                }
            }
        }
    }

    float lereixgezr() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0.0f;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.draadjrbmk();
    }

    public List lmojexxdyd(int i13) {
        int iCqumvgiudr = cqumvgiudr(i13);
        ArrayList arrayList = new ArrayList();
        for (zoijcleaow zoijcleaowVar : this.f7843eablkybsjg) {
            if (zoijcleaowVar.f7877wkgbmnqykc == iCqumvgiudr || zoijcleaowVar.f7873ppxfxbqfkf == iCqumvgiudr) {
                arrayList.add(zoijcleaowVar);
            }
        }
        return arrayList;
    }

    boolean lqeggnwhkg(MotionLayout motionLayout, int i13) {
        zoijcleaow zoijcleaowVar;
        if (ylkuphrtab() || this.f7856wkgbmnqykc) {
            return false;
        }
        for (zoijcleaow zoijcleaowVar2 : this.f7843eablkybsjg) {
            if (zoijcleaowVar2.f7861agtfadlqog != 0 && ((zoijcleaowVar = this.f7852ppxfxbqfkf) != zoijcleaowVar2 || !zoijcleaowVar.cdpycssgdh(2))) {
                if (i13 == zoijcleaowVar2.f7877wkgbmnqykc && (zoijcleaowVar2.f7861agtfadlqog == 4 || zoijcleaowVar2.f7861agtfadlqog == 2)) {
                    MotionLayout.gtknphoqwx gtknphoqwxVar = MotionLayout.gtknphoqwx.FINISHED;
                    motionLayout.setState(gtknphoqwxVar);
                    motionLayout.setTransition(zoijcleaowVar2);
                    if (zoijcleaowVar2.f7861agtfadlqog == 4) {
                        motionLayout.bfopjjpdmp();
                        motionLayout.setState(MotionLayout.gtknphoqwx.SETUP);
                        motionLayout.setState(MotionLayout.gtknphoqwx.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.mbcevpiqjq(true);
                        motionLayout.setState(MotionLayout.gtknphoqwx.SETUP);
                        motionLayout.setState(MotionLayout.gtknphoqwx.MOVING);
                        motionLayout.setState(gtknphoqwxVar);
                        motionLayout.rlfsiqarku();
                    }
                    return true;
                }
                if (i13 == zoijcleaowVar2.f7873ppxfxbqfkf && (zoijcleaowVar2.f7861agtfadlqog == 3 || zoijcleaowVar2.f7861agtfadlqog == 1)) {
                    MotionLayout.gtknphoqwx gtknphoqwxVar2 = MotionLayout.gtknphoqwx.FINISHED;
                    motionLayout.setState(gtknphoqwxVar2);
                    motionLayout.setTransition(zoijcleaowVar2);
                    if (zoijcleaowVar2.f7861agtfadlqog == 3) {
                        motionLayout.iyctptxqzt();
                        motionLayout.setState(MotionLayout.gtknphoqwx.SETUP);
                        motionLayout.setState(MotionLayout.gtknphoqwx.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.mbcevpiqjq(true);
                        motionLayout.setState(MotionLayout.gtknphoqwx.SETUP);
                        motionLayout.setState(MotionLayout.gtknphoqwx.MOVING);
                        motionLayout.setState(gtknphoqwxVar2);
                        motionLayout.rlfsiqarku();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void mbcevpiqjq(int i13, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar) {
        this.f7849nufgyqmvbu.put(i13, wkgbmnqykcVar);
    }

    public void ntlheqmsrt(int i13) {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.yadqdtsiqt(i13);
        } else {
            this.f7844gtknphoqwx = i13;
        }
    }

    public zoijcleaow nufgyqmvbu(int i13, float f13, float f14, MotionEvent motionEvent) {
        if (i13 == -1) {
            return this.f7852ppxfxbqfkf;
        }
        List<zoijcleaow> listLmojexxdyd = lmojexxdyd(i13);
        RectF rectF = new RectF();
        float f15 = 0.0f;
        zoijcleaow zoijcleaowVar = null;
        for (zoijcleaow zoijcleaowVar2 : listLmojexxdyd) {
            if (!zoijcleaowVar2.f7871ojitshcjhn && zoijcleaowVar2.f7863draadjrbmk != null) {
                zoijcleaowVar2.f7863draadjrbmk.cqumvgiudr(this.f7854vdvldrhtss);
                RectF rectFRgvfuqvkyq = zoijcleaowVar2.f7863draadjrbmk.rgvfuqvkyq(this.f7846iobyxmoadg, rectF);
                if (rectFRgvfuqvkyq == null || motionEvent == null || rectFRgvfuqvkyq.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFGxszxtbevo = zoijcleaowVar2.f7863draadjrbmk.gxszxtbevo(this.f7846iobyxmoadg, rectF);
                    if (rectFGxszxtbevo == null || motionEvent == null || rectFGxszxtbevo.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fIobyxmoadg = zoijcleaowVar2.f7863draadjrbmk.iobyxmoadg(f13, f14);
                        if (zoijcleaowVar2.f7863draadjrbmk.f7933draadjrbmk && motionEvent != null) {
                            float x13 = motionEvent.getX() - zoijcleaowVar2.f7863draadjrbmk.f7934dxjokdxxww;
                            float y13 = motionEvent.getY() - zoijcleaowVar2.f7863draadjrbmk.f7930btonecajqb;
                            fIobyxmoadg = ((float) (Math.atan2(f14 + y13, f13 + x13) - Math.atan2(x13, y13))) * 10.0f;
                        }
                        float f16 = fIobyxmoadg * (zoijcleaowVar2.f7873ppxfxbqfkf == i13 ? -1.0f : 1.1f);
                        if (f16 > f15) {
                            zoijcleaowVar = zoijcleaowVar2;
                            f15 = f16;
                        }
                    }
                }
            }
        }
        return zoijcleaowVar;
    }

    public int ojitshcjhn() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        return zoijcleaowVar != null ? zoijcleaowVar.f7870nufgyqmvbu : this.f7844gtknphoqwx;
    }

    public Interpolator oxmwwwfdhm() {
        int i13 = this.f7852ppxfxbqfkf.f7865eablkybsjg;
        if (i13 == -2) {
            return AnimationUtils.loadInterpolator(this.f7846iobyxmoadg.getContext(), this.f7852ppxfxbqfkf.f7869lqeggnwhkg);
        }
        if (i13 == -1) {
            return new iobyxmoadg(a1.ppxfxbqfkf.ppxfxbqfkf(this.f7852ppxfxbqfkf.f7867gxszxtbevo));
        }
        if (i13 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i13 == 1) {
            return new AccelerateInterpolator();
        }
        if (i13 == 2) {
            return new DecelerateInterpolator();
        }
        if (i13 == 4) {
            return new BounceInterpolator();
        }
        if (i13 == 5) {
            return new OvershootInterpolator();
        }
        if (i13 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    float pmvmpeiblj() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0.0f;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.wflxmlrfwp();
    }

    int rgvfuqvkyq() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null) {
            return -1;
        }
        return zoijcleaowVar.f7873ppxfxbqfkf;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0075 A[SYNTHETIC] */
    void sopmlzcsov(int i13, int i14) {
        int iPpxfxbqfkf;
        int iPpxfxbqfkf2;
        zoijcleaow zoijcleaowVar;
        Iterator it;
        zoijcleaow zoijcleaowVar2;
        zoijcleaow zoijcleaowVar3;
        zoijcleaow zoijcleaowVar4;
        androidx.constraintlayout.widget.btonecajqb btonecajqbVar = this.f7858zoijcleaow;
        if (btonecajqbVar != null) {
            iPpxfxbqfkf = btonecajqbVar.ppxfxbqfkf(i13, -1, -1);
            if (iPpxfxbqfkf == -1) {
                iPpxfxbqfkf = i13;
            }
            iPpxfxbqfkf2 = this.f7858zoijcleaow.ppxfxbqfkf(i14, -1, -1);
            if (iPpxfxbqfkf2 == -1) {
            }
            zoijcleaowVar = this.f7852ppxfxbqfkf;
            if (zoijcleaowVar == null && zoijcleaowVar.f7873ppxfxbqfkf == i14 && this.f7852ppxfxbqfkf.f7877wkgbmnqykc == i13) {
                return;
            }
            it = this.f7843eablkybsjg.iterator();
            while (true) {
                if (it.hasNext()) {
                    zoijcleaowVar2 = this.f7845gxszxtbevo;
                    for (zoijcleaow zoijcleaowVar5 : this.f7848lqeggnwhkg) {
                        if (zoijcleaowVar5.f7873ppxfxbqfkf == i14) {
                            zoijcleaowVar2 = zoijcleaowVar5;
                        }
                    }
                    zoijcleaowVar3 = new zoijcleaow(this, zoijcleaowVar2);
                    zoijcleaowVar3.f7877wkgbmnqykc = iPpxfxbqfkf;
                    zoijcleaowVar3.f7873ppxfxbqfkf = iPpxfxbqfkf2;
                    if (iPpxfxbqfkf != -1) {
                        this.f7843eablkybsjg.add(zoijcleaowVar3);
                    }
                    this.f7852ppxfxbqfkf = zoijcleaowVar3;
                    return;
                }
                zoijcleaowVar4 = (zoijcleaow) it.next();
                if ((zoijcleaowVar4.f7873ppxfxbqfkf != iPpxfxbqfkf2 && zoijcleaowVar4.f7877wkgbmnqykc == iPpxfxbqfkf) || (zoijcleaowVar4.f7873ppxfxbqfkf == i14 && zoijcleaowVar4.f7877wkgbmnqykc == i13)) {
                    break;
                }
            }
            this.f7852ppxfxbqfkf = zoijcleaowVar4;
            if (zoijcleaowVar4 != null || zoijcleaowVar4.f7863draadjrbmk == null) {
            }
            this.f7852ppxfxbqfkf.f7863draadjrbmk.cqumvgiudr(this.f7854vdvldrhtss);
            return;
        }
        iPpxfxbqfkf = i13;
        iPpxfxbqfkf2 = i14;
        zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null) {
        }
        it = this.f7843eablkybsjg.iterator();
        while (true) {
            if (it.hasNext()) {
                zoijcleaowVar2 = this.f7845gxszxtbevo;
                while (r3.hasNext()) {
                    if (zoijcleaowVar5.f7873ppxfxbqfkf == i14) {
                        zoijcleaowVar2 = zoijcleaowVar5;
                    }
                }
                zoijcleaowVar3 = new zoijcleaow(this, zoijcleaowVar2);
                zoijcleaowVar3.f7877wkgbmnqykc = iPpxfxbqfkf;
                zoijcleaowVar3.f7873ppxfxbqfkf = iPpxfxbqfkf2;
                if (iPpxfxbqfkf != -1) {
                    this.f7843eablkybsjg.add(zoijcleaowVar3);
                }
                this.f7852ppxfxbqfkf = zoijcleaowVar3;
                return;
            }
            zoijcleaowVar4 = (zoijcleaow) it.next();
            if (zoijcleaowVar4.f7873ppxfxbqfkf != iPpxfxbqfkf2) {
            }
        }
        this.f7852ppxfxbqfkf = zoijcleaowVar4;
        if (zoijcleaowVar4 != null) {
        }
    }

    void stevsuqkhv(MotionEvent motionEvent, int i13, MotionLayout motionLayout) {
        MotionLayout.lqeggnwhkg lqeggnwhkgVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f7853rgvfuqvkyq == null) {
            this.f7853rgvfuqvkyq = this.f7846iobyxmoadg.metgxyhuhe();
        }
        this.f7853rgvfuqvkyq.ppxfxbqfkf(motionEvent);
        if (i13 != -1) {
            int action = motionEvent.getAction();
            boolean z13 = false;
            if (action == 0) {
                this.f7847kcexrzcfyt = motionEvent.getRawX();
                this.f7857zdlpuopuiu = motionEvent.getRawY();
                this.f7855wflxmlrfwp = motionEvent;
                this.f7839agtfadlqog = false;
                if (this.f7852ppxfxbqfkf.f7863draadjrbmk != null) {
                    RectF rectFGxszxtbevo = this.f7852ppxfxbqfkf.f7863draadjrbmk.gxszxtbevo(this.f7846iobyxmoadg, rectF);
                    if (rectFGxszxtbevo != null && !rectFGxszxtbevo.contains(this.f7855wflxmlrfwp.getX(), this.f7855wflxmlrfwp.getY())) {
                        this.f7855wflxmlrfwp = null;
                        this.f7839agtfadlqog = true;
                        return;
                    }
                    RectF rectFRgvfuqvkyq = this.f7852ppxfxbqfkf.f7863draadjrbmk.rgvfuqvkyq(this.f7846iobyxmoadg, rectF);
                    if (rectFRgvfuqvkyq == null || rectFRgvfuqvkyq.contains(this.f7855wflxmlrfwp.getX(), this.f7855wflxmlrfwp.getY())) {
                        this.f7850ojitshcjhn = false;
                    } else {
                        this.f7850ojitshcjhn = true;
                    }
                    this.f7852ppxfxbqfkf.f7863draadjrbmk.iwizpuwonk(this.f7847kcexrzcfyt, this.f7857zdlpuopuiu);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f7839agtfadlqog) {
                float rawY = motionEvent.getRawY() - this.f7857zdlpuopuiu;
                float rawX = motionEvent.getRawX() - this.f7847kcexrzcfyt;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f7855wflxmlrfwp) == null) {
                    return;
                }
                zoijcleaow zoijcleaowVarNufgyqmvbu = nufgyqmvbu(i13, rawX, rawY, motionEvent2);
                if (zoijcleaowVarNufgyqmvbu != null) {
                    motionLayout.setTransition(zoijcleaowVarNufgyqmvbu);
                    RectF rectFRgvfuqvkyq2 = this.f7852ppxfxbqfkf.f7863draadjrbmk.rgvfuqvkyq(this.f7846iobyxmoadg, rectF);
                    if (rectFRgvfuqvkyq2 != null && !rectFRgvfuqvkyq2.contains(this.f7855wflxmlrfwp.getX(), this.f7855wflxmlrfwp.getY())) {
                        z13 = true;
                    }
                    this.f7850ojitshcjhn = z13;
                    this.f7852ppxfxbqfkf.f7863draadjrbmk.esjtqupxsv(this.f7847kcexrzcfyt, this.f7857zdlpuopuiu);
                }
            }
        }
        if (this.f7839agtfadlqog) {
            return;
        }
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar != null && zoijcleaowVar.f7863draadjrbmk != null && !this.f7850ojitshcjhn) {
            this.f7852ppxfxbqfkf.f7863draadjrbmk.kcexrzcfyt(motionEvent, this.f7853rgvfuqvkyq, i13, this);
        }
        this.f7847kcexrzcfyt = motionEvent.getRawX();
        this.f7857zdlpuopuiu = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (lqeggnwhkgVar = this.f7853rgvfuqvkyq) == null) {
            return;
        }
        lqeggnwhkgVar.zoijcleaow();
        this.f7853rgvfuqvkyq = null;
        int i14 = motionLayout.f7541esjtqupxsv;
        if (i14 != -1) {
            lqeggnwhkg(motionLayout, i14);
        }
    }

    void tzroggbefp(MotionLayout motionLayout) {
        for (int i13 = 0; i13 < this.f7849nufgyqmvbu.size(); i13++) {
            int iKeyAt = this.f7849nufgyqmvbu.keyAt(i13);
            if (wwaezpbzkn(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            kegysxyocb(iKeyAt, motionLayout);
        }
    }

    public void ulzqkzuiru(boolean z13) {
        this.f7854vdvldrhtss = z13;
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return;
        }
        this.f7852ppxfxbqfkf.f7863draadjrbmk.cqumvgiudr(this.f7854vdvldrhtss);
    }

    boolean vipkmwdibw() {
        Iterator it = this.f7843eablkybsjg.iterator();
        while (it.hasNext()) {
            if (((zoijcleaow) it.next()).f7863draadjrbmk != null) {
                return true;
            }
        }
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        return (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) ? false : true;
    }

    public int[] wflxmlrfwp() {
        int size = this.f7849nufgyqmvbu.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = this.f7849nufgyqmvbu.keyAt(i13);
        }
        return iArr;
    }

    void wypolnanlu(float f13, float f14) {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return;
        }
        this.f7852ppxfxbqfkf.f7863draadjrbmk.jyumaefscl(f13, f14);
    }

    int yadqdtsiqt() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null) {
            return -1;
        }
        return zoijcleaowVar.f7877wkgbmnqykc;
    }

    float yggfygwlhe() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0.0f;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.nufgyqmvbu();
    }

    float zdlpuopuiu() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0.0f;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.lqeggnwhkg();
    }

    float zynmafqrjb() {
        zoijcleaow zoijcleaowVar = this.f7852ppxfxbqfkf;
        if (zoijcleaowVar == null || zoijcleaowVar.f7863draadjrbmk == null) {
            return 0.0f;
        }
        return this.f7852ppxfxbqfkf.f7863draadjrbmk.agtfadlqog();
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private int f7861agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private final ojitshcjhn f7862btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private rgvfuqvkyq f7863draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private float f7864dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f7865eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private ArrayList f7866gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private String f7867gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f7868iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f7869lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f7870nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        private boolean f7871ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        private int f7872oxmwwwfdhm;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f7873ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        private int f7874rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        private int f7875vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private ArrayList f7876wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f7877wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f7878zoijcleaow;

        public static class iobyxmoadg implements View.OnClickListener {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            int f7879jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f7880yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final zoijcleaow f7881zdlpuopuiu;

            public iobyxmoadg(Context context, zoijcleaow zoijcleaowVar, XmlPullParser xmlPullParser) {
                this.f7880yggfygwlhe = -1;
                this.f7879jyumaefscl = 17;
                this.f7881zdlpuopuiu = zoijcleaowVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.nufgyqmvbu.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i13 = 0; i13 < indexCount; i13++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i13);
                    if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnClick_targetId) {
                        this.f7880yggfygwlhe = typedArrayObtainStyledAttributes.getResourceId(index, this.f7880yggfygwlhe);
                    } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.OnClick_clickAction) {
                        this.f7879jyumaefscl = typedArrayObtainStyledAttributes.getInt(index, this.f7879jyumaefscl);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void iobyxmoadg(MotionLayout motionLayout, int i13, zoijcleaow zoijcleaowVar) {
                boolean z13;
                View viewFindViewById;
                int i14 = this.f7880yggfygwlhe;
                View view = motionLayout;
                if (i14 != -1) {
                    viewFindViewById = motionLayout.findViewById(i14);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", "OnClick could not find id " + this.f7880yggfygwlhe);
                    return;
                }
                int i15 = zoijcleaowVar.f7877wkgbmnqykc;
                int i16 = zoijcleaowVar.f7873ppxfxbqfkf;
                if (i15 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i17 = this.f7879jyumaefscl;
                boolean z14 = false;
                if ((i17 & 1) == 0 || i13 != i15) {
                    view = viewFindViewById;
                    z13 = false;
                } else {
                    z13 = true;
                }
                boolean z15 = ((i17 & 1) != 0 && i13 == i15) | z13 | ((i17 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 && i13 == i15) | ((i17 & 16) != 0 && i13 == i16);
                if ((i17 & 4096) != 0 && i13 == i16) {
                    z14 = true;
                }
                if (z15 || z14) {
                    view.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f7881zdlpuopuiu.f7862btonecajqb.f7846iobyxmoadg;
                if (motionLayout.xrmfcynszj()) {
                    if (this.f7881zdlpuopuiu.f7877wkgbmnqykc == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.weqkydbzbr(this.f7881zdlpuopuiu.f7873ppxfxbqfkf);
                            return;
                        }
                        zoijcleaow zoijcleaowVar = new zoijcleaow(this.f7881zdlpuopuiu.f7862btonecajqb, this.f7881zdlpuopuiu);
                        zoijcleaowVar.f7877wkgbmnqykc = currentState;
                        zoijcleaowVar.f7873ppxfxbqfkf = this.f7881zdlpuopuiu.f7873ppxfxbqfkf;
                        motionLayout.setTransition(zoijcleaowVar);
                        motionLayout.bfopjjpdmp();
                        return;
                    }
                    zoijcleaow zoijcleaowVar2 = this.f7881zdlpuopuiu.f7862btonecajqb.f7852ppxfxbqfkf;
                    int i13 = this.f7879jyumaefscl;
                    boolean z13 = false;
                    boolean z14 = ((i13 & 1) == 0 && (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) ? false : true;
                    boolean z15 = ((i13 & 16) == 0 && (i13 & 4096) == 0) ? false : true;
                    if (z14 && z15) {
                        zoijcleaow zoijcleaowVar3 = this.f7881zdlpuopuiu.f7862btonecajqb.f7852ppxfxbqfkf;
                        zoijcleaow zoijcleaowVar4 = this.f7881zdlpuopuiu;
                        if (zoijcleaowVar3 != zoijcleaowVar4) {
                            motionLayout.setTransition(zoijcleaowVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z15 = false;
                            z13 = z14;
                        }
                    } else {
                        z13 = z14;
                    }
                    if (zoijcleaow(zoijcleaowVar2, motionLayout)) {
                        if (z13 && (this.f7879jyumaefscl & 1) != 0) {
                            motionLayout.setTransition(this.f7881zdlpuopuiu);
                            motionLayout.bfopjjpdmp();
                            return;
                        }
                        if (z15 && (this.f7879jyumaefscl & 16) != 0) {
                            motionLayout.setTransition(this.f7881zdlpuopuiu);
                            motionLayout.iyctptxqzt();
                        } else if (z13 && (this.f7879jyumaefscl & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                            motionLayout.setTransition(this.f7881zdlpuopuiu);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z15 || (this.f7879jyumaefscl & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f7881zdlpuopuiu);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }

            public void ppxfxbqfkf(MotionLayout motionLayout) {
                int i13 = this.f7880yggfygwlhe;
                if (i13 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i13);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f7880yggfygwlhe);
            }

            boolean zoijcleaow(zoijcleaow zoijcleaowVar, MotionLayout motionLayout) {
                zoijcleaow zoijcleaowVar2 = this.f7881zdlpuopuiu;
                if (zoijcleaowVar2 == zoijcleaowVar) {
                    return true;
                }
                int i13 = zoijcleaowVar2.f7873ppxfxbqfkf;
                int i14 = this.f7881zdlpuopuiu.f7877wkgbmnqykc;
                if (i14 == -1) {
                    return motionLayout.f7541esjtqupxsv != i13;
                }
                int i15 = motionLayout.f7541esjtqupxsv;
                return i15 == i14 || i15 == i13;
            }
        }

        zoijcleaow(ojitshcjhn ojitshcjhnVar, zoijcleaow zoijcleaowVar) {
            this.f7868iobyxmoadg = -1;
            this.f7878zoijcleaow = false;
            this.f7873ppxfxbqfkf = -1;
            this.f7877wkgbmnqykc = -1;
            this.f7865eablkybsjg = 0;
            this.f7867gxszxtbevo = null;
            this.f7869lqeggnwhkg = -1;
            this.f7870nufgyqmvbu = OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST;
            this.f7864dxjokdxxww = 0.0f;
            this.f7866gtknphoqwx = new ArrayList();
            this.f7863draadjrbmk = null;
            this.f7876wflxmlrfwp = new ArrayList();
            this.f7861agtfadlqog = 0;
            this.f7871ojitshcjhn = false;
            this.f7874rgvfuqvkyq = -1;
            this.f7875vdvldrhtss = 0;
            this.f7872oxmwwwfdhm = 0;
            this.f7862btonecajqb = ojitshcjhnVar;
            this.f7870nufgyqmvbu = ojitshcjhnVar.f7844gtknphoqwx;
            if (zoijcleaowVar != null) {
                this.f7874rgvfuqvkyq = zoijcleaowVar.f7874rgvfuqvkyq;
                this.f7865eablkybsjg = zoijcleaowVar.f7865eablkybsjg;
                this.f7867gxszxtbevo = zoijcleaowVar.f7867gxszxtbevo;
                this.f7869lqeggnwhkg = zoijcleaowVar.f7869lqeggnwhkg;
                this.f7870nufgyqmvbu = zoijcleaowVar.f7870nufgyqmvbu;
                this.f7866gtknphoqwx = zoijcleaowVar.f7866gtknphoqwx;
                this.f7864dxjokdxxww = zoijcleaowVar.f7864dxjokdxxww;
                this.f7875vdvldrhtss = zoijcleaowVar.f7875vdvldrhtss;
            }
        }

        private void iwizpuwonk(ojitshcjhn ojitshcjhnVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.Transition);
            jyumaefscl(ojitshcjhnVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        private void jyumaefscl(ojitshcjhn ojitshcjhnVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArray.getIndex(i13);
                if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_constraintSetEnd) {
                    this.f7873ppxfxbqfkf = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7873ppxfxbqfkf);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar = new androidx.constraintlayout.widget.wkgbmnqykc();
                        wkgbmnqykcVar.zynmafqrjb(context, this.f7873ppxfxbqfkf);
                        ojitshcjhnVar.f7849nufgyqmvbu.append(this.f7873ppxfxbqfkf, wkgbmnqykcVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f7873ppxfxbqfkf = ojitshcjhnVar.jpowsppfya(context, this.f7873ppxfxbqfkf);
                    }
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_constraintSetStart) {
                    this.f7877wkgbmnqykc = typedArray.getResourceId(index, this.f7877wkgbmnqykc);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f7877wkgbmnqykc);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar2 = new androidx.constraintlayout.widget.wkgbmnqykc();
                        wkgbmnqykcVar2.zynmafqrjb(context, this.f7877wkgbmnqykc);
                        ojitshcjhnVar.f7849nufgyqmvbu.append(this.f7877wkgbmnqykc, wkgbmnqykcVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f7877wkgbmnqykc = ojitshcjhnVar.jpowsppfya(context, this.f7877wkgbmnqykc);
                    }
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_motionInterpolator) {
                    int i14 = typedArray.peekValue(index).type;
                    if (i14 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f7869lqeggnwhkg = resourceId;
                        if (resourceId != -1) {
                            this.f7865eablkybsjg = -2;
                        }
                    } else if (i14 == 3) {
                        String string = typedArray.getString(index);
                        this.f7867gxszxtbevo = string;
                        if (string != null) {
                            if (string.indexOf(CardDateFormatTextWatcher.DIVIDER_CHARACTER) > 0) {
                                this.f7869lqeggnwhkg = typedArray.getResourceId(index, -1);
                                this.f7865eablkybsjg = -2;
                            } else {
                                this.f7865eablkybsjg = -1;
                            }
                        }
                    } else {
                        this.f7865eablkybsjg = typedArray.getInteger(index, this.f7865eablkybsjg);
                    }
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_duration) {
                    int i15 = typedArray.getInt(index, this.f7870nufgyqmvbu);
                    this.f7870nufgyqmvbu = i15;
                    if (i15 < 8) {
                        this.f7870nufgyqmvbu = 8;
                    }
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_staggered) {
                    this.f7864dxjokdxxww = typedArray.getFloat(index, this.f7864dxjokdxxww);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_autoTransition) {
                    this.f7861agtfadlqog = typedArray.getInteger(index, this.f7861agtfadlqog);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_android_id) {
                    this.f7868iobyxmoadg = typedArray.getResourceId(index, this.f7868iobyxmoadg);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_transitionDisable) {
                    this.f7871ojitshcjhn = typedArray.getBoolean(index, this.f7871ojitshcjhn);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_pathMotionArc) {
                    this.f7874rgvfuqvkyq = typedArray.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_layoutDuringTransition) {
                    this.f7875vdvldrhtss = typedArray.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.Transition_transitionFlags) {
                    this.f7872oxmwwwfdhm = typedArray.getInteger(index, 0);
                }
            }
            if (this.f7877wkgbmnqykc == -1) {
                this.f7878zoijcleaow = true;
            }
        }

        public boolean cdpycssgdh(int i13) {
            return (i13 & this.f7872oxmwwwfdhm) != 0;
        }

        public int cqumvgiudr() {
            return this.f7861agtfadlqog;
        }

        public int esjtqupxsv() {
            return this.f7873ppxfxbqfkf;
        }

        public void iozdgvuglv(int i13, String str, int i14) {
            this.f7865eablkybsjg = i13;
            this.f7867gxszxtbevo = str;
            this.f7869lqeggnwhkg = i14;
        }

        public boolean istkbnxepw() {
            return !this.f7871ojitshcjhn;
        }

        public int lereixgezr() {
            return this.f7875vdvldrhtss;
        }

        public void lmojexxdyd(int i13) {
            this.f7874rgvfuqvkyq = i13;
        }

        public int pmvmpeiblj() {
            return this.f7877wkgbmnqykc;
        }

        public void yadqdtsiqt(int i13) {
            this.f7870nufgyqmvbu = Math.max(i13, 8);
        }

        public void yggfygwlhe(Context context, XmlPullParser xmlPullParser) {
            this.f7876wflxmlrfwp.add(new iobyxmoadg(context, this, xmlPullParser));
        }

        public void zdlpuopuiu(gxszxtbevo gxszxtbevoVar) {
            this.f7866gtknphoqwx.add(gxszxtbevoVar);
        }

        public rgvfuqvkyq zynmafqrjb() {
            return this.f7863draadjrbmk;
        }

        public zoijcleaow(int i13, ojitshcjhn ojitshcjhnVar, int i14, int i15) {
            this.f7868iobyxmoadg = -1;
            this.f7878zoijcleaow = false;
            this.f7873ppxfxbqfkf = -1;
            this.f7877wkgbmnqykc = -1;
            this.f7865eablkybsjg = 0;
            this.f7867gxszxtbevo = null;
            this.f7869lqeggnwhkg = -1;
            this.f7870nufgyqmvbu = OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST;
            this.f7864dxjokdxxww = 0.0f;
            this.f7866gtknphoqwx = new ArrayList();
            this.f7863draadjrbmk = null;
            this.f7876wflxmlrfwp = new ArrayList();
            this.f7861agtfadlqog = 0;
            this.f7871ojitshcjhn = false;
            this.f7874rgvfuqvkyq = -1;
            this.f7875vdvldrhtss = 0;
            this.f7872oxmwwwfdhm = 0;
            this.f7868iobyxmoadg = i13;
            this.f7862btonecajqb = ojitshcjhnVar;
            this.f7877wkgbmnqykc = i14;
            this.f7873ppxfxbqfkf = i15;
            this.f7870nufgyqmvbu = ojitshcjhnVar.f7844gtknphoqwx;
            this.f7875vdvldrhtss = ojitshcjhnVar.f7841draadjrbmk;
        }

        zoijcleaow(ojitshcjhn ojitshcjhnVar, Context context, XmlPullParser xmlPullParser) {
            this.f7868iobyxmoadg = -1;
            this.f7878zoijcleaow = false;
            this.f7873ppxfxbqfkf = -1;
            this.f7877wkgbmnqykc = -1;
            this.f7865eablkybsjg = 0;
            this.f7867gxszxtbevo = null;
            this.f7869lqeggnwhkg = -1;
            this.f7870nufgyqmvbu = OkHttpErrorHandlerImpl.HTTP_BAD_REQUEST;
            this.f7864dxjokdxxww = 0.0f;
            this.f7866gtknphoqwx = new ArrayList();
            this.f7863draadjrbmk = null;
            this.f7876wflxmlrfwp = new ArrayList();
            this.f7861agtfadlqog = 0;
            this.f7871ojitshcjhn = false;
            this.f7874rgvfuqvkyq = -1;
            this.f7875vdvldrhtss = 0;
            this.f7872oxmwwwfdhm = 0;
            this.f7870nufgyqmvbu = ojitshcjhnVar.f7844gtknphoqwx;
            this.f7875vdvldrhtss = ojitshcjhnVar.f7841draadjrbmk;
            this.f7862btonecajqb = ojitshcjhnVar;
            iwizpuwonk(ojitshcjhnVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
