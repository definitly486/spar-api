package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class oxmwwwfdhm {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f7883btonecajqb;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    int f7886eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private String f7887gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    gxszxtbevo f7888gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f7889iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg f7892lqeggnwhkg;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    Context f7894ojitshcjhn;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f7903zoijcleaow = -1;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f7896ppxfxbqfkf = false;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f7900wkgbmnqykc = 0;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f7893nufgyqmvbu = -1;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f7885dxjokdxxww = -1;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f7884draadjrbmk = 0;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private String f7899wflxmlrfwp = null;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f7882agtfadlqog = -1;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private int f7897rgvfuqvkyq = -1;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f7898vdvldrhtss = -1;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f7895oxmwwwfdhm = -1;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private int f7891kcexrzcfyt = -1;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f7902zdlpuopuiu = -1;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f7901yggfygwlhe = -1;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f7890jyumaefscl = -1;

    class iobyxmoadg implements Interpolator {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ a1.ppxfxbqfkf f7904iobyxmoadg;

        iobyxmoadg(a1.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f7904iobyxmoadg = ppxfxbqfkfVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f13) {
            return (float) this.f7904iobyxmoadg.iobyxmoadg(f13);
        }
    }

    static class zoijcleaow {

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        float f7908draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        Interpolator f7909dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f7910eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        float f7911gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f7912gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f7913iobyxmoadg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        kcexrzcfyt f7915nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        boolean f7916ojitshcjhn;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        long f7917ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        long f7918wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        draadjrbmk f7919wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f7920zoijcleaow;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        a1.wkgbmnqykc f7914lqeggnwhkg = new a1.wkgbmnqykc();

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        boolean f7907btonecajqb = false;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        Rect f7906agtfadlqog = new Rect();

        zoijcleaow(kcexrzcfyt kcexrzcfytVar, draadjrbmk draadjrbmkVar, int i13, int i14, int i15, Interpolator interpolator, int i16, int i17) {
            this.f7916ojitshcjhn = false;
            this.f7915nufgyqmvbu = kcexrzcfytVar;
            this.f7919wkgbmnqykc = draadjrbmkVar;
            this.f7910eablkybsjg = i13;
            this.f7912gxszxtbevo = i14;
            long jNanoTime = System.nanoTime();
            this.f7917ppxfxbqfkf = jNanoTime;
            this.f7918wflxmlrfwp = jNanoTime;
            this.f7915nufgyqmvbu.zoijcleaow(this);
            this.f7909dxjokdxxww = interpolator;
            this.f7913iobyxmoadg = i16;
            this.f7920zoijcleaow = i17;
            if (i15 == 3) {
                this.f7916ojitshcjhn = true;
            }
            this.f7908draadjrbmk = i13 == 0 ? Float.MAX_VALUE : 1.0f / i13;
            iobyxmoadg();
        }

        void eablkybsjg(boolean z13) {
            int i13;
            this.f7907btonecajqb = z13;
            if (z13 && (i13 = this.f7912gxszxtbevo) != -1) {
                this.f7908draadjrbmk = i13 == 0 ? Float.MAX_VALUE : 1.0f / i13;
            }
            this.f7915nufgyqmvbu.wkgbmnqykc();
            this.f7918wflxmlrfwp = System.nanoTime();
        }

        void iobyxmoadg() {
            if (this.f7907btonecajqb) {
                ppxfxbqfkf();
            } else {
                zoijcleaow();
            }
        }

        void ppxfxbqfkf() {
            long jNanoTime = System.nanoTime();
            long j13 = jNanoTime - this.f7918wflxmlrfwp;
            this.f7918wflxmlrfwp = jNanoTime;
            float f13 = this.f7911gtknphoqwx - (((float) (j13 * 1.0E-6d)) * this.f7908draadjrbmk);
            this.f7911gtknphoqwx = f13;
            if (f13 < 0.0f) {
                this.f7911gtknphoqwx = 0.0f;
            }
            Interpolator interpolator = this.f7909dxjokdxxww;
            float interpolation = interpolator == null ? this.f7911gtknphoqwx : interpolator.getInterpolation(this.f7911gtknphoqwx);
            draadjrbmk draadjrbmkVar = this.f7919wkgbmnqykc;
            boolean zYggfygwlhe = draadjrbmkVar.yggfygwlhe(draadjrbmkVar.f7739zoijcleaow, interpolation, jNanoTime, this.f7914lqeggnwhkg);
            if (this.f7911gtknphoqwx <= 0.0f) {
                if (this.f7913iobyxmoadg != -1) {
                    this.f7919wkgbmnqykc.kcexrzcfyt().setTag(this.f7913iobyxmoadg, Long.valueOf(System.nanoTime()));
                }
                if (this.f7920zoijcleaow != -1) {
                    this.f7919wkgbmnqykc.kcexrzcfyt().setTag(this.f7920zoijcleaow, null);
                }
                this.f7915nufgyqmvbu.gxszxtbevo(this);
            }
            if (this.f7911gtknphoqwx > 0.0f || zYggfygwlhe) {
                this.f7915nufgyqmvbu.wkgbmnqykc();
            }
        }

        public void wkgbmnqykc(int i13, float f13, float f14) {
            if (i13 == 1) {
                if (this.f7907btonecajqb) {
                    return;
                }
                eablkybsjg(true);
            } else {
                if (i13 != 2) {
                    return;
                }
                this.f7919wkgbmnqykc.kcexrzcfyt().getHitRect(this.f7906agtfadlqog);
                if (this.f7906agtfadlqog.contains((int) f13, (int) f14) || this.f7907btonecajqb) {
                    return;
                }
                eablkybsjg(true);
            }
        }

        void zoijcleaow() {
            long jNanoTime = System.nanoTime();
            long j13 = jNanoTime - this.f7918wflxmlrfwp;
            this.f7918wflxmlrfwp = jNanoTime;
            float f13 = this.f7911gtknphoqwx + (((float) (j13 * 1.0E-6d)) * this.f7908draadjrbmk);
            this.f7911gtknphoqwx = f13;
            if (f13 >= 1.0f) {
                this.f7911gtknphoqwx = 1.0f;
            }
            Interpolator interpolator = this.f7909dxjokdxxww;
            float interpolation = interpolator == null ? this.f7911gtknphoqwx : interpolator.getInterpolation(this.f7911gtknphoqwx);
            draadjrbmk draadjrbmkVar = this.f7919wkgbmnqykc;
            boolean zYggfygwlhe = draadjrbmkVar.yggfygwlhe(draadjrbmkVar.f7739zoijcleaow, interpolation, jNanoTime, this.f7914lqeggnwhkg);
            if (this.f7911gtknphoqwx >= 1.0f) {
                if (this.f7913iobyxmoadg != -1) {
                    this.f7919wkgbmnqykc.kcexrzcfyt().setTag(this.f7913iobyxmoadg, Long.valueOf(System.nanoTime()));
                }
                if (this.f7920zoijcleaow != -1) {
                    this.f7919wkgbmnqykc.kcexrzcfyt().setTag(this.f7920zoijcleaow, null);
                }
                if (!this.f7916ojitshcjhn) {
                    this.f7915nufgyqmvbu.gxszxtbevo(this);
                }
            }
            if (this.f7911gtknphoqwx < 1.0f || zYggfygwlhe) {
                this.f7915nufgyqmvbu.wkgbmnqykc();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    oxmwwwfdhm(Context context, XmlPullParser xmlPullParser) {
        byte b13;
        this.f7894ojitshcjhn = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b13 = -1;
                            } else {
                                b13 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b13 = -1;
                            } else {
                                b13 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b13 = -1;
                            } else {
                                b13 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b13 = -1;
                            } else {
                                b13 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b13 = -1;
                            } else {
                                b13 = 3;
                            }
                            break;
                        default:
                            b13 = -1;
                            break;
                    }
                    if (b13 == 0) {
                        draadjrbmk(context, xmlPullParser);
                    } else if (b13 == 1) {
                        this.f7888gxszxtbevo = new gxszxtbevo(context, xmlPullParser);
                    } else if (b13 == 2) {
                        this.f7892lqeggnwhkg = androidx.constraintlayout.widget.wkgbmnqykc.wflxmlrfwp(context, xmlPullParser);
                    } else if (b13 == 3 || b13 == 4) {
                        androidx.constraintlayout.widget.iobyxmoadg.dxjokdxxww(context, xmlPullParser, this.f7892lqeggnwhkg.f8172lqeggnwhkg);
                    } else {
                        Log.e("ViewTransition", androidx.constraintlayout.motion.widget.iobyxmoadg.iobyxmoadg() + " unknown tag " + name);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(".xml:");
                        sb3.append(xmlPullParser.getLineNumber());
                        Log.e("ViewTransition", sb3.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e13) {
            Log.e("ViewTransition", "Error parsing XML resource", e13);
        } catch (XmlPullParserException e14) {
            Log.e("ViewTransition", "Error parsing XML resource", e14);
        }
    }

    private void agtfadlqog(ojitshcjhn.zoijcleaow zoijcleaowVar, View view) {
        int i13 = this.f7893nufgyqmvbu;
        if (i13 != -1) {
            zoijcleaowVar.yadqdtsiqt(i13);
        }
        zoijcleaowVar.lmojexxdyd(this.f7900wkgbmnqykc);
        zoijcleaowVar.iozdgvuglv(this.f7884draadjrbmk, this.f7899wflxmlrfwp, this.f7882agtfadlqog);
        int id2 = view.getId();
        gxszxtbevo gxszxtbevoVar = this.f7888gxszxtbevo;
        if (gxszxtbevoVar != null) {
            ArrayList arrayListWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc(-1);
            gxszxtbevo gxszxtbevoVar2 = new gxszxtbevo();
            Iterator it = arrayListWkgbmnqykc.iterator();
            while (it.hasNext()) {
                gxszxtbevoVar2.ppxfxbqfkf(((ppxfxbqfkf) it.next()).clone().nufgyqmvbu(id2));
            }
            zoijcleaowVar.zdlpuopuiu(gxszxtbevoVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void btonecajqb(View[] viewArr) {
        if (this.f7897rgvfuqvkyq != -1) {
            for (View view : viewArr) {
                view.setTag(this.f7897rgvfuqvkyq, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f7898vdvldrhtss != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f7898vdvldrhtss, null);
            }
        }
    }

    private void draadjrbmk(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_android_id) {
                this.f7889iobyxmoadg = typedArrayObtainStyledAttributes.getResourceId(index, this.f7889iobyxmoadg);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_motionTarget) {
                if (MotionLayout.f7530eslsurpljm) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f7883btonecajqb);
                    this.f7883btonecajqb = resourceId;
                    if (resourceId == -1) {
                        this.f7887gtknphoqwx = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f7887gtknphoqwx = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f7883btonecajqb = typedArrayObtainStyledAttributes.getResourceId(index, this.f7883btonecajqb);
                }
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_onStateTransition) {
                this.f7903zoijcleaow = typedArrayObtainStyledAttributes.getInt(index, this.f7903zoijcleaow);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_transitionDisable) {
                this.f7896ppxfxbqfkf = typedArrayObtainStyledAttributes.getBoolean(index, this.f7896ppxfxbqfkf);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_pathMotionArc) {
                this.f7900wkgbmnqykc = typedArrayObtainStyledAttributes.getInt(index, this.f7900wkgbmnqykc);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_duration) {
                this.f7893nufgyqmvbu = typedArrayObtainStyledAttributes.getInt(index, this.f7893nufgyqmvbu);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_upDuration) {
                this.f7885dxjokdxxww = typedArrayObtainStyledAttributes.getInt(index, this.f7885dxjokdxxww);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_viewTransitionMode) {
                this.f7886eablkybsjg = typedArrayObtainStyledAttributes.getInt(index, this.f7886eablkybsjg);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_motionInterpolator) {
                int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i14 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f7882agtfadlqog = resourceId2;
                    if (resourceId2 != -1) {
                        this.f7884draadjrbmk = -2;
                    }
                } else if (i14 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f7899wflxmlrfwp = string;
                    if (string == null || string.indexOf(CardDateFormatTextWatcher.DIVIDER_CHARACTER) <= 0) {
                        this.f7884draadjrbmk = -1;
                    } else {
                        this.f7882agtfadlqog = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f7884draadjrbmk = -2;
                    }
                } else {
                    this.f7884draadjrbmk = typedArrayObtainStyledAttributes.getInteger(index, this.f7884draadjrbmk);
                }
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_setsTag) {
                this.f7897rgvfuqvkyq = typedArrayObtainStyledAttributes.getResourceId(index, this.f7897rgvfuqvkyq);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_clearsTag) {
                this.f7898vdvldrhtss = typedArrayObtainStyledAttributes.getResourceId(index, this.f7898vdvldrhtss);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_ifTagSet) {
                this.f7895oxmwwwfdhm = typedArrayObtainStyledAttributes.getResourceId(index, this.f7895oxmwwwfdhm);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_ifTagNotSet) {
                this.f7891kcexrzcfyt = typedArrayObtainStyledAttributes.getResourceId(index, this.f7891kcexrzcfyt);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_SharedValueId) {
                this.f7901yggfygwlhe = typedArrayObtainStyledAttributes.getResourceId(index, this.f7901yggfygwlhe);
            } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.ViewTransition_SharedValue) {
                this.f7902zdlpuopuiu = typedArrayObtainStyledAttributes.getInteger(index, this.f7902zdlpuopuiu);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public int dxjokdxxww() {
        return this.f7903zoijcleaow;
    }

    int eablkybsjg() {
        return this.f7889iobyxmoadg;
    }

    boolean gtknphoqwx(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f7883btonecajqb == -1 && this.f7887gtknphoqwx == null) || !wkgbmnqykc(view)) {
            return false;
        }
        if (view.getId() == this.f7883btonecajqb) {
            return true;
        }
        return this.f7887gtknphoqwx != null && (view.getLayoutParams() instanceof ConstraintLayout.zoijcleaow) && (str = ((ConstraintLayout.zoijcleaow) view.getLayoutParams()).f8019ikoacuggdj) != null && str.matches(this.f7887gtknphoqwx);
    }

    Interpolator gxszxtbevo(Context context) {
        int i13 = this.f7884draadjrbmk;
        if (i13 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f7882agtfadlqog);
        }
        if (i13 == -1) {
            return new iobyxmoadg(a1.ppxfxbqfkf.ppxfxbqfkf(this.f7899wflxmlrfwp));
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

    public int lqeggnwhkg() {
        return this.f7902zdlpuopuiu;
    }

    public int nufgyqmvbu() {
        return this.f7901yggfygwlhe;
    }

    void ppxfxbqfkf(kcexrzcfyt kcexrzcfytVar, MotionLayout motionLayout, int i13, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar, final View... viewArr) {
        if (this.f7896ppxfxbqfkf) {
            return;
        }
        int i14 = this.f7886eablkybsjg;
        if (i14 == 2) {
            zoijcleaow(kcexrzcfytVar, motionLayout, viewArr[0]);
            return;
        }
        if (i14 == 1) {
            for (int i15 : motionLayout.getConstraintSetIds()) {
                if (i15 != i13) {
                    androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVarVipkmwdibw = motionLayout.vipkmwdibw(i15);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg iobyxmoadgVarYggfygwlhe = wkgbmnqykcVarVipkmwdibw.yggfygwlhe(view.getId());
                        androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = this.f7892lqeggnwhkg;
                        if (iobyxmoadgVar != null) {
                            iobyxmoadgVar.zoijcleaow(iobyxmoadgVarYggfygwlhe);
                            iobyxmoadgVarYggfygwlhe.f8172lqeggnwhkg.putAll(this.f7892lqeggnwhkg.f8172lqeggnwhkg);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar2 = new androidx.constraintlayout.widget.wkgbmnqykc();
        wkgbmnqykcVar2.rgvfuqvkyq(wkgbmnqykcVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg iobyxmoadgVarYggfygwlhe2 = wkgbmnqykcVar2.yggfygwlhe(view2.getId());
            androidx.constraintlayout.widget.wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = this.f7892lqeggnwhkg;
            if (iobyxmoadgVar2 != null) {
                iobyxmoadgVar2.zoijcleaow(iobyxmoadgVarYggfygwlhe2);
                iobyxmoadgVarYggfygwlhe2.f8172lqeggnwhkg.putAll(this.f7892lqeggnwhkg.f8172lqeggnwhkg);
            }
        }
        motionLayout.tbqsvytpvh(i13, wkgbmnqykcVar2);
        motionLayout.tbqsvytpvh(androidx.constraintlayout.widget.lqeggnwhkg.view_transition, wkgbmnqykcVar);
        motionLayout.setState(androidx.constraintlayout.widget.lqeggnwhkg.view_transition, -1, -1);
        ojitshcjhn.zoijcleaow zoijcleaowVar = new ojitshcjhn.zoijcleaow(-1, motionLayout.f7605zdlpuopuiu, androidx.constraintlayout.widget.lqeggnwhkg.view_transition, i13);
        for (View view3 : viewArr) {
            agtfadlqog(zoijcleaowVar, view3);
        }
        motionLayout.setTransition(zoijcleaowVar);
        motionLayout.opjhrmiecq(new Runnable() { // from class: androidx.constraintlayout.motion.widget.vdvldrhtss
            @Override // java.lang.Runnable
            public final void run() {
                this.f7964zdlpuopuiu.btonecajqb(viewArr);
            }
        });
    }

    public String toString() {
        return "ViewTransition(" + androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(this.f7894ojitshcjhn, this.f7889iobyxmoadg) + ")";
    }

    boolean wflxmlrfwp(int i13) {
        int i14 = this.f7903zoijcleaow;
        if (i14 == 1) {
            return i13 == 0;
        }
        if (i14 == 2) {
            return i13 == 1;
        }
        return i14 == 3 && i13 == 0;
    }

    boolean wkgbmnqykc(View view) {
        int i13 = this.f7895oxmwwwfdhm;
        boolean z13 = i13 == -1 || view.getTag(i13) != null;
        int i14 = this.f7891kcexrzcfyt;
        return z13 && (i14 == -1 || view.getTag(i14) == null);
    }

    void zoijcleaow(kcexrzcfyt kcexrzcfytVar, MotionLayout motionLayout, View view) {
        draadjrbmk draadjrbmkVar = new draadjrbmk(view);
        draadjrbmkVar.esjtqupxsv(view);
        this.f7888gxszxtbevo.iobyxmoadg(draadjrbmkVar);
        draadjrbmkVar.iozdgvuglv(motionLayout.getWidth(), motionLayout.getHeight(), this.f7893nufgyqmvbu, System.nanoTime());
        new zoijcleaow(kcexrzcfytVar, draadjrbmkVar, this.f7893nufgyqmvbu, this.f7885dxjokdxxww, this.f7903zoijcleaow, gxszxtbevo(motionLayout.getContext()), this.f7897rgvfuqvkyq, this.f7898vdvldrhtss);
    }
}
