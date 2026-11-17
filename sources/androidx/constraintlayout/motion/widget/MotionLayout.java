package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.appcompat.app.yggfygwlhe;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v1.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements wwaezpbzkn {

    /* JADX INFO: renamed from: eslsurpljm, reason: collision with root package name */
    public static boolean f7530eslsurpljm;

    /* JADX INFO: renamed from: ageimvtcrz, reason: collision with root package name */
    private int f7531ageimvtcrz;

    /* JADX INFO: renamed from: auzgnhcxok, reason: collision with root package name */
    private boolean f7532auzgnhcxok;

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    boolean f7533bfopjjpdmp;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    HashMap f7534cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private float f7535cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f7536cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    int f7537crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private ArrayList f7538czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private float f7539dsvhmnatus;

    /* JADX INFO: renamed from: dvvnrvtcbc, reason: collision with root package name */
    private Runnable f7540dvvnrvtcbc;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    int f7541esjtqupxsv;

    /* JADX INFO: renamed from: ezmngbhpjk, reason: collision with root package name */
    private View f7542ezmngbhpjk;

    /* JADX INFO: renamed from: fiwbwshyhd, reason: collision with root package name */
    private int f7543fiwbwshyhd;

    /* JADX INFO: renamed from: fmlbqenlif, reason: collision with root package name */
    private RectF f7544fmlbqenlif;

    /* JADX INFO: renamed from: fyldjkxazc, reason: collision with root package name */
    private int f7545fyldjkxazc;

    /* JADX INFO: renamed from: grlcpdaxtj, reason: collision with root package name */
    private boolean f7546grlcpdaxtj;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f7547hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    boolean f7548hkdspvbjdz;

    /* JADX INFO: renamed from: hszhottldk, reason: collision with root package name */
    HashMap f7549hszhottldk;

    /* JADX INFO: renamed from: igdgnonuha, reason: collision with root package name */
    int f7550igdgnonuha;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    float f7551ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private float f7552iozdgvuglv;

    /* JADX INFO: renamed from: ipoelvxyzq, reason: collision with root package name */
    Rect f7553ipoelvxyzq;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f7554istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    float f7555iwizpuwonk;

    /* JADX INFO: renamed from: iwxlajgraz, reason: collision with root package name */
    private dxjokdxxww f7556iwxlajgraz;

    /* JADX INFO: renamed from: ixidwrxhsl, reason: collision with root package name */
    gxszxtbevo f7557ixidwrxhsl;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    int f7558iyctptxqzt;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    float f7559jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    int f7560jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    boolean f7561jpowsppfya;

    /* JADX INFO: renamed from: jrbgnlbqoe, reason: collision with root package name */
    private boolean f7562jrbgnlbqoe;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    Interpolator f7563jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    float f7564jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private boolean f7565kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f7566lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    float f7567lmojexxdyd;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    int f7568lrnfpwlwnk;

    /* JADX INFO: renamed from: lxfrhoxuzk, reason: collision with root package name */
    private boolean f7569lxfrhoxuzk;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private wkgbmnqykc f7570mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private ArrayList f7571metgxyhuhe;

    /* JADX INFO: renamed from: mhtqkkgtqm, reason: collision with root package name */
    gtknphoqwx f7572mhtqkkgtqm;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.zoijcleaow f7573ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    int f7574nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private float f7575oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    long f7576okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    protected boolean f7577opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    float f7578pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f7579pmvmpeiblj;

    /* JADX INFO: renamed from: rhgxfdycjh, reason: collision with root package name */
    private Matrix f7580rhgxfdycjh;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    int f7581ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private ArrayList f7582rlfsiqarku;

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    float f7583roivzttewh;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private float f7584sflfametgt;

    /* JADX INFO: renamed from: skhdrjzrfn, reason: collision with root package name */
    private int[] f7585skhdrjzrfn;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    int f7586sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    eablkybsjg f7587stevsuqkhv;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    int f7588tbqsvytpvh;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private e1.zoijcleaow f7589tzroggbefp;

    /* JADX INFO: renamed from: uawqvzlxes, reason: collision with root package name */
    private a1.wkgbmnqykc f7590uawqvzlxes;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    boolean f7591ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private CopyOnWriteArrayList f7592uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    boolean f7593vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    int f7594weqkydbzbr;

    /* JADX INFO: renamed from: wizcaqwiak, reason: collision with root package name */
    int f7595wizcaqwiak;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    float f7596wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    int f7597wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f7598xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private long f7599yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private long f7600ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private int f7601yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    Interpolator f7602yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private long f7603ylkuphrtab;

    /* JADX INFO: renamed from: yzdjzghtvl, reason: collision with root package name */
    ArrayList f7604yzdjzghtvl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    ojitshcjhn f7605zdlpuopuiu;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    int f7606zeieaojujs;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private int f7607zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private int f7608zynmafqrjb;

    public interface btonecajqb {
    }

    class dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float f7612iobyxmoadg = Float.NaN;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f7617zoijcleaow = Float.NaN;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        int f7615ppxfxbqfkf = -1;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        int f7616wkgbmnqykc = -1;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final String f7610eablkybsjg = "motion.progress";

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final String f7611gxszxtbevo = "motion.velocity";

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        final String f7613lqeggnwhkg = "motion.StartState";

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        final String f7614nufgyqmvbu = "motion.EndState";

        dxjokdxxww() {
        }

        public void eablkybsjg(float f13) {
            this.f7612iobyxmoadg = f13;
        }

        public void gxszxtbevo(int i13) {
            this.f7615ppxfxbqfkf = i13;
        }

        void iobyxmoadg() {
            int i13 = this.f7615ppxfxbqfkf;
            if (i13 != -1 || this.f7616wkgbmnqykc != -1) {
                if (i13 == -1) {
                    MotionLayout.this.weqkydbzbr(this.f7616wkgbmnqykc);
                } else {
                    int i14 = this.f7616wkgbmnqykc;
                    if (i14 == -1) {
                        MotionLayout.this.setState(i13, -1, -1);
                    } else {
                        MotionLayout.this.ydmasvzmpa(i13, i14);
                    }
                }
                MotionLayout.this.setState(gtknphoqwx.SETUP);
            }
            if (Float.isNaN(this.f7617zoijcleaow)) {
                if (Float.isNaN(this.f7612iobyxmoadg)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f7612iobyxmoadg);
            } else {
                MotionLayout.this.yfnezrywwk(this.f7612iobyxmoadg, this.f7617zoijcleaow);
                this.f7612iobyxmoadg = Float.NaN;
                this.f7617zoijcleaow = Float.NaN;
                this.f7615ppxfxbqfkf = -1;
                this.f7616wkgbmnqykc = -1;
            }
        }

        public void lqeggnwhkg(Bundle bundle) {
            this.f7612iobyxmoadg = bundle.getFloat("motion.progress");
            this.f7617zoijcleaow = bundle.getFloat("motion.velocity");
            this.f7615ppxfxbqfkf = bundle.getInt("motion.StartState");
            this.f7616wkgbmnqykc = bundle.getInt("motion.EndState");
        }

        public void nufgyqmvbu(float f13) {
            this.f7617zoijcleaow = f13;
        }

        public void ppxfxbqfkf() {
            this.f7616wkgbmnqykc = MotionLayout.this.f7566lereixgezr;
            this.f7615ppxfxbqfkf = MotionLayout.this.f7536cqumvgiudr;
            this.f7617zoijcleaow = MotionLayout.this.getVelocity();
            this.f7612iobyxmoadg = MotionLayout.this.getProgress();
        }

        public void wkgbmnqykc(int i13) {
            this.f7616wkgbmnqykc = i13;
        }

        public Bundle zoijcleaow() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f7612iobyxmoadg);
            bundle.putFloat("motion.velocity", this.f7617zoijcleaow);
            bundle.putInt("motion.StartState", this.f7615ppxfxbqfkf);
            bundle.putInt("motion.EndState", this.f7616wkgbmnqykc);
            return bundle;
        }
    }

    private class eablkybsjg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private float[] f7619btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        Paint f7621dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        Paint f7622eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        Paint f7624gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float[] f7625iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        Paint f7627lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        Paint f7628nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float[] f7631ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        DashPathEffect f7632rgvfuqvkyq;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        int f7633vdvldrhtss;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        Path f7635wkgbmnqykc;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f7637zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        int[] f7638zoijcleaow;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        final int f7623gtknphoqwx = -21965;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        final int f7620draadjrbmk = -2067046;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        final int f7634wflxmlrfwp = -13391360;

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        final int f7618agtfadlqog = 1996488704;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        final int f7629ojitshcjhn = 10;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        Rect f7630oxmwwwfdhm = new Rect();

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        boolean f7626kcexrzcfyt = false;

        eablkybsjg() {
            this.f7637zdlpuopuiu = 1;
            Paint paint = new Paint();
            this.f7622eablkybsjg = paint;
            paint.setAntiAlias(true);
            this.f7622eablkybsjg.setColor(-21965);
            this.f7622eablkybsjg.setStrokeWidth(2.0f);
            Paint paint2 = this.f7622eablkybsjg;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f7624gxszxtbevo = paint3;
            paint3.setAntiAlias(true);
            this.f7624gxszxtbevo.setColor(-2067046);
            this.f7624gxszxtbevo.setStrokeWidth(2.0f);
            this.f7624gxszxtbevo.setStyle(style);
            Paint paint4 = new Paint();
            this.f7627lqeggnwhkg = paint4;
            paint4.setAntiAlias(true);
            this.f7627lqeggnwhkg.setColor(-13391360);
            this.f7627lqeggnwhkg.setStrokeWidth(2.0f);
            this.f7627lqeggnwhkg.setStyle(style);
            Paint paint5 = new Paint();
            this.f7628nufgyqmvbu = paint5;
            paint5.setAntiAlias(true);
            this.f7628nufgyqmvbu.setColor(-13391360);
            this.f7628nufgyqmvbu.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f7619btonecajqb = new float[8];
            Paint paint6 = new Paint();
            this.f7621dxjokdxxww = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f7632rgvfuqvkyq = dashPathEffect;
            this.f7627lqeggnwhkg.setPathEffect(dashPathEffect);
            this.f7631ppxfxbqfkf = new float[100];
            this.f7638zoijcleaow = new int[50];
            if (this.f7626kcexrzcfyt) {
                this.f7622eablkybsjg.setStrokeWidth(8.0f);
                this.f7621dxjokdxxww.setStrokeWidth(8.0f);
                this.f7624gxszxtbevo.setStrokeWidth(8.0f);
                this.f7637zdlpuopuiu = 4;
            }
        }

        private void btonecajqb(Canvas canvas, draadjrbmk draadjrbmkVar) {
            this.f7635wkgbmnqykc.reset();
            for (int i13 = 0; i13 <= 50; i13++) {
                draadjrbmkVar.eablkybsjg(i13 / 50, this.f7619btonecajqb, 0);
                Path path = this.f7635wkgbmnqykc;
                float[] fArr = this.f7619btonecajqb;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f7635wkgbmnqykc;
                float[] fArr2 = this.f7619btonecajqb;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f7635wkgbmnqykc;
                float[] fArr3 = this.f7619btonecajqb;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f7635wkgbmnqykc;
                float[] fArr4 = this.f7619btonecajqb;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f7635wkgbmnqykc.close();
            }
            this.f7622eablkybsjg.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f7635wkgbmnqykc, this.f7622eablkybsjg);
            canvas.translate(-2.0f, -2.0f);
            this.f7622eablkybsjg.setColor(-65536);
            canvas.drawPath(this.f7635wkgbmnqykc, this.f7622eablkybsjg);
        }

        private void dxjokdxxww(Canvas canvas, float f13, float f14, int i13, int i14) {
            String str = "" + (((int) (((double) (((f13 - (i13 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i13))) + 0.5d)) / 100.0f);
            draadjrbmk(str, this.f7628nufgyqmvbu);
            canvas.drawText(str, ((f13 / 2.0f) - (this.f7630oxmwwwfdhm.width() / 2)) + 0.0f, f14 - 20.0f, this.f7628nufgyqmvbu);
            canvas.drawLine(f13, f14, Math.min(0.0f, 1.0f), f14, this.f7627lqeggnwhkg);
            String str2 = "" + (((int) (((double) (((f14 - (i14 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i14))) + 0.5d)) / 100.0f);
            draadjrbmk(str2, this.f7628nufgyqmvbu);
            canvas.drawText(str2, f13 + 5.0f, 0.0f - ((f14 / 2.0f) - (this.f7630oxmwwwfdhm.height() / 2)), this.f7628nufgyqmvbu);
            canvas.drawLine(f13, f14, f13, Math.max(0.0f, 1.0f), this.f7627lqeggnwhkg);
        }

        private void eablkybsjg(Canvas canvas) {
            float[] fArr = this.f7625iobyxmoadg;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[fArr.length - 2];
            float f16 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f13, f15), Math.max(f14, f16), Math.max(f13, f15), Math.max(f14, f16), this.f7627lqeggnwhkg);
            canvas.drawLine(Math.min(f13, f15), Math.min(f14, f16), Math.min(f13, f15), Math.max(f14, f16), this.f7627lqeggnwhkg);
        }

        private void gtknphoqwx(Canvas canvas, int i13, int i14, draadjrbmk draadjrbmkVar) {
            int width;
            int height;
            View view = draadjrbmkVar.f7739zoijcleaow;
            if (view != null) {
                width = view.getWidth();
                height = draadjrbmkVar.f7739zoijcleaow.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i15 = 1; i15 < i14 - 1; i15++) {
                if (i13 != 4 || this.f7638zoijcleaow[i15 - 1] != 0) {
                    float[] fArr = this.f7631ppxfxbqfkf;
                    int i16 = i15 * 2;
                    float f13 = fArr[i16];
                    float f14 = fArr[i16 + 1];
                    this.f7635wkgbmnqykc.reset();
                    this.f7635wkgbmnqykc.moveTo(f13, f14 + 10.0f);
                    this.f7635wkgbmnqykc.lineTo(f13 + 10.0f, f14);
                    this.f7635wkgbmnqykc.lineTo(f13, f14 - 10.0f);
                    this.f7635wkgbmnqykc.lineTo(f13 - 10.0f, f14);
                    this.f7635wkgbmnqykc.close();
                    int i17 = i15 - 1;
                    draadjrbmkVar.vdvldrhtss(i17);
                    if (i13 == 4) {
                        int i18 = this.f7638zoijcleaow[i17];
                        if (i18 == 1) {
                            nufgyqmvbu(canvas, f13 - 0.0f, f14 - 0.0f);
                        } else if (i18 == 0) {
                            gxszxtbevo(canvas, f13 - 0.0f, f14 - 0.0f);
                        } else {
                            if (i18 == 2) {
                                dxjokdxxww(canvas, f13 - 0.0f, f14 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f7635wkgbmnqykc, this.f7621dxjokdxxww);
                        }
                        canvas.drawPath(this.f7635wkgbmnqykc, this.f7621dxjokdxxww);
                    } else {
                        f14 = f14;
                        f13 = f13;
                    }
                    if (i13 == 2) {
                        nufgyqmvbu(canvas, f13 - 0.0f, f14 - 0.0f);
                    }
                    if (i13 == 3) {
                        gxszxtbevo(canvas, f13 - 0.0f, f14 - 0.0f);
                    }
                    if (i13 == 6) {
                        dxjokdxxww(canvas, f13 - 0.0f, f14 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f7635wkgbmnqykc, this.f7621dxjokdxxww);
                }
            }
            float[] fArr2 = this.f7625iobyxmoadg;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f7624gxszxtbevo);
                float[] fArr3 = this.f7625iobyxmoadg;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f7624gxszxtbevo);
            }
        }

        private void gxszxtbevo(Canvas canvas, float f13, float f14) {
            float[] fArr = this.f7625iobyxmoadg;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[fArr.length - 2];
            float f18 = fArr[fArr.length - 1];
            float fMin = Math.min(f15, f17);
            float fMax = Math.max(f16, f18);
            float fMin2 = f13 - Math.min(f15, f17);
            float fMax2 = Math.max(f16, f18) - f14;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f17 - f15))) + 0.5d)) / 100.0f);
            draadjrbmk(str, this.f7628nufgyqmvbu);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f7630oxmwwwfdhm.width() / 2)) + fMin, f14 - 20.0f, this.f7628nufgyqmvbu);
            canvas.drawLine(f13, f14, Math.min(f15, f17), f14, this.f7627lqeggnwhkg);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f18 - f16))) + 0.5d)) / 100.0f);
            draadjrbmk(str2, this.f7628nufgyqmvbu);
            canvas.drawText(str2, f13 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f7630oxmwwwfdhm.height() / 2)), this.f7628nufgyqmvbu);
            canvas.drawLine(f13, f14, f13, Math.max(f16, f18), this.f7627lqeggnwhkg);
        }

        private void lqeggnwhkg(Canvas canvas) {
            float[] fArr = this.f7625iobyxmoadg;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f7627lqeggnwhkg);
        }

        private void nufgyqmvbu(Canvas canvas, float f13, float f14) {
            float[] fArr = this.f7625iobyxmoadg;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[fArr.length - 2];
            float f18 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f15 - f17, f16 - f18);
            float f19 = f17 - f15;
            float f23 = f18 - f16;
            float f24 = (((f13 - f15) * f19) + ((f14 - f16) * f23)) / (fHypot * fHypot);
            float f25 = f15 + (f19 * f24);
            float f26 = f16 + (f24 * f23);
            Path path = new Path();
            path.moveTo(f13, f14);
            path.lineTo(f25, f26);
            float fHypot2 = (float) Math.hypot(f25 - f13, f26 - f14);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            draadjrbmk(str, this.f7628nufgyqmvbu);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f7630oxmwwwfdhm.width() / 2), -20.0f, this.f7628nufgyqmvbu);
            canvas.drawLine(f13, f14, f25, f26, this.f7627lqeggnwhkg);
        }

        private void ppxfxbqfkf(Canvas canvas) {
            canvas.drawLines(this.f7625iobyxmoadg, this.f7622eablkybsjg);
        }

        private void wkgbmnqykc(Canvas canvas) {
            boolean z13 = false;
            boolean z14 = false;
            for (int i13 = 0; i13 < this.f7633vdvldrhtss; i13++) {
                int i14 = this.f7638zoijcleaow[i13];
                if (i14 == 1) {
                    z13 = true;
                }
                if (i14 == 0) {
                    z14 = true;
                }
            }
            if (z13) {
                lqeggnwhkg(canvas);
            }
            if (z14) {
                eablkybsjg(canvas);
            }
        }

        void draadjrbmk(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f7630oxmwwwfdhm);
        }

        public void iobyxmoadg(Canvas canvas, HashMap map, int i13, int i14) {
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i14 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f7566lereixgezr) + StringUtils.PROCESS_POSTFIX_DELIMITER + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f7628nufgyqmvbu);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f7622eablkybsjg);
            }
            for (draadjrbmk draadjrbmkVar : map.values()) {
                int iWflxmlrfwp = draadjrbmkVar.wflxmlrfwp();
                if (i14 > 0 && iWflxmlrfwp == 0) {
                    iWflxmlrfwp = 1;
                }
                if (iWflxmlrfwp != 0) {
                    this.f7633vdvldrhtss = draadjrbmkVar.ppxfxbqfkf(this.f7631ppxfxbqfkf, this.f7638zoijcleaow);
                    if (iWflxmlrfwp >= 1) {
                        int i15 = i13 / 16;
                        float[] fArr = this.f7625iobyxmoadg;
                        if (fArr == null || fArr.length != i15 * 2) {
                            this.f7625iobyxmoadg = new float[i15 * 2];
                            this.f7635wkgbmnqykc = new Path();
                        }
                        int i16 = this.f7637zdlpuopuiu;
                        canvas.translate(i16, i16);
                        this.f7622eablkybsjg.setColor(1996488704);
                        this.f7621dxjokdxxww.setColor(1996488704);
                        this.f7624gxszxtbevo.setColor(1996488704);
                        this.f7627lqeggnwhkg.setColor(1996488704);
                        draadjrbmkVar.wkgbmnqykc(this.f7625iobyxmoadg, i15);
                        zoijcleaow(canvas, iWflxmlrfwp, this.f7633vdvldrhtss, draadjrbmkVar);
                        this.f7622eablkybsjg.setColor(-21965);
                        this.f7624gxszxtbevo.setColor(-2067046);
                        this.f7621dxjokdxxww.setColor(-2067046);
                        this.f7627lqeggnwhkg.setColor(-13391360);
                        int i17 = this.f7637zdlpuopuiu;
                        canvas.translate(-i17, -i17);
                        zoijcleaow(canvas, iWflxmlrfwp, this.f7633vdvldrhtss, draadjrbmkVar);
                        if (iWflxmlrfwp == 5) {
                            btonecajqb(canvas, draadjrbmkVar);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void zoijcleaow(Canvas canvas, int i13, int i14, draadjrbmk draadjrbmkVar) {
            if (i13 == 4) {
                wkgbmnqykc(canvas);
            }
            if (i13 == 2) {
                lqeggnwhkg(canvas);
            }
            if (i13 == 3) {
                eablkybsjg(canvas);
            }
            ppxfxbqfkf(canvas);
            gtknphoqwx(canvas, i13, i14, draadjrbmkVar);
        }
    }

    enum gtknphoqwx {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    class gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f7644eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        int f7645gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        c1.gxszxtbevo f7646iobyxmoadg = new c1.gxszxtbevo();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        c1.gxszxtbevo f7650zoijcleaow = new c1.gxszxtbevo();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        androidx.constraintlayout.widget.wkgbmnqykc f7648ppxfxbqfkf = null;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        androidx.constraintlayout.widget.wkgbmnqykc f7649wkgbmnqykc = null;

        gxszxtbevo() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void btonecajqb(c1.gxszxtbevo gxszxtbevoVar, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar) {
            SparseArray sparseArray = new SparseArray();
            androidx.constraintlayout.widget.eablkybsjg eablkybsjgVar = new androidx.constraintlayout.widget.eablkybsjg(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, gxszxtbevoVar);
            sparseArray.put(MotionLayout.this.getId(), gxszxtbevoVar);
            if (wkgbmnqykcVar != null && wkgbmnqykcVar.f8146eablkybsjg != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.f7650zoijcleaow, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            for (c1.eablkybsjg eablkybsjgVar2 : gxszxtbevoVar.B()) {
                eablkybsjgVar2.lxfrhoxuzk(true);
                sparseArray.put(((View) eablkybsjgVar2.yggfygwlhe()).getId(), eablkybsjgVar2);
            }
            for (c1.eablkybsjg eablkybsjgVar3 : gxszxtbevoVar.B()) {
                View view = (View) eablkybsjgVar3.yggfygwlhe();
                wkgbmnqykcVar.draadjrbmk(view.getId(), eablkybsjgVar);
                eablkybsjgVar3.u(wkgbmnqykcVar.pmvmpeiblj(view.getId()));
                eablkybsjgVar3.ezmngbhpjk(wkgbmnqykcVar.jyumaefscl(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.zoijcleaow) {
                    wkgbmnqykcVar.btonecajqb((androidx.constraintlayout.widget.zoijcleaow) view, eablkybsjgVar3, eablkybsjgVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).oxmwwwfdhm();
                    }
                }
                eablkybsjgVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, eablkybsjgVar3, eablkybsjgVar, sparseArray);
                if (wkgbmnqykcVar.lereixgezr(view.getId()) == 1) {
                    eablkybsjgVar3.t(view.getVisibility());
                } else {
                    eablkybsjgVar3.t(wkgbmnqykcVar.esjtqupxsv(view.getId()));
                }
            }
            for (c1.eablkybsjg eablkybsjgVar4 : gxszxtbevoVar.B()) {
                if (eablkybsjgVar4 instanceof c1.wflxmlrfwp) {
                    androidx.constraintlayout.widget.zoijcleaow zoijcleaowVar = (androidx.constraintlayout.widget.zoijcleaow) eablkybsjgVar4.yggfygwlhe();
                    c1.dxjokdxxww dxjokdxxwwVar = (c1.dxjokdxxww) eablkybsjgVar4;
                    zoijcleaowVar.vdvldrhtss(gxszxtbevoVar, dxjokdxxwwVar, sparseArray);
                    ((c1.wflxmlrfwp) dxjokdxxwwVar).E();
                }
            }
        }

        private void zoijcleaow(int i13, int i14) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f7541esjtqupxsv == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                c1.gxszxtbevo gxszxtbevoVar = this.f7650zoijcleaow;
                androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar = this.f7649wkgbmnqykc;
                motionLayout2.resolveSystem(gxszxtbevoVar, optimizationLevel, (wkgbmnqykcVar == null || wkgbmnqykcVar.f8146eablkybsjg == 0) ? i13 : i14, (wkgbmnqykcVar == null || wkgbmnqykcVar.f8146eablkybsjg == 0) ? i14 : i13);
                androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar2 = this.f7648ppxfxbqfkf;
                if (wkgbmnqykcVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    c1.gxszxtbevo gxszxtbevoVar2 = this.f7646iobyxmoadg;
                    int i15 = wkgbmnqykcVar2.f8146eablkybsjg;
                    int i16 = i15 == 0 ? i13 : i14;
                    if (i15 == 0) {
                        i13 = i14;
                    }
                    motionLayout3.resolveSystem(gxszxtbevoVar2, optimizationLevel, i16, i13);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar3 = this.f7648ppxfxbqfkf;
            if (wkgbmnqykcVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                c1.gxszxtbevo gxszxtbevoVar3 = this.f7646iobyxmoadg;
                int i17 = wkgbmnqykcVar3.f8146eablkybsjg;
                motionLayout4.resolveSystem(gxszxtbevoVar3, optimizationLevel, i17 == 0 ? i13 : i14, i17 == 0 ? i14 : i13);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            c1.gxszxtbevo gxszxtbevoVar4 = this.f7650zoijcleaow;
            androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar4 = this.f7649wkgbmnqykc;
            int i18 = (wkgbmnqykcVar4 == null || wkgbmnqykcVar4.f8146eablkybsjg == 0) ? i13 : i14;
            if (wkgbmnqykcVar4 == null || wkgbmnqykcVar4.f8146eablkybsjg == 0) {
                i13 = i14;
            }
            motionLayout5.resolveSystem(gxszxtbevoVar4, optimizationLevel, i18, i13);
        }

        public void dxjokdxxww(int i13, int i14) {
            this.f7644eablkybsjg = i13;
            this.f7645gxszxtbevo = i14;
        }

        void eablkybsjg(c1.gxszxtbevo gxszxtbevoVar, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar2) {
            this.f7648ppxfxbqfkf = wkgbmnqykcVar;
            this.f7649wkgbmnqykc = wkgbmnqykcVar2;
            this.f7646iobyxmoadg = new c1.gxszxtbevo();
            this.f7650zoijcleaow = new c1.gxszxtbevo();
            this.f7646iobyxmoadg.g0(((ConstraintLayout) MotionLayout.this).mLayoutWidget.T());
            this.f7650zoijcleaow.g0(((ConstraintLayout) MotionLayout.this).mLayoutWidget.T());
            this.f7646iobyxmoadg.E();
            this.f7650zoijcleaow.E();
            ppxfxbqfkf(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f7646iobyxmoadg);
            ppxfxbqfkf(((ConstraintLayout) MotionLayout.this).mLayoutWidget, this.f7650zoijcleaow);
            if (MotionLayout.this.f7596wwaezpbzkn > 0.5d) {
                if (wkgbmnqykcVar != null) {
                    btonecajqb(this.f7646iobyxmoadg, wkgbmnqykcVar);
                }
                btonecajqb(this.f7650zoijcleaow, wkgbmnqykcVar2);
            } else {
                btonecajqb(this.f7650zoijcleaow, wkgbmnqykcVar2);
                if (wkgbmnqykcVar != null) {
                    btonecajqb(this.f7646iobyxmoadg, wkgbmnqykcVar);
                }
            }
            this.f7646iobyxmoadg.j0(MotionLayout.this.isRtl());
            this.f7646iobyxmoadg.l0();
            this.f7650zoijcleaow.j0(MotionLayout.this.isRtl());
            this.f7650zoijcleaow.l0();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    c1.gxszxtbevo gxszxtbevoVar2 = this.f7646iobyxmoadg;
                    c1.eablkybsjg.zoijcleaow zoijcleaowVar = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT;
                    gxszxtbevoVar2.krqnebusok(zoijcleaowVar);
                    this.f7650zoijcleaow.krqnebusok(zoijcleaowVar);
                }
                if (layoutParams.height == -2) {
                    c1.gxszxtbevo gxszxtbevoVar3 = this.f7646iobyxmoadg;
                    c1.eablkybsjg.zoijcleaow zoijcleaowVar2 = c1.eablkybsjg.zoijcleaow.WRAP_CONTENT;
                    gxszxtbevoVar3.q(zoijcleaowVar2);
                    this.f7650zoijcleaow.q(zoijcleaowVar2);
                }
            }
        }

        public boolean gxszxtbevo(int i13, int i14) {
            return (i13 == this.f7644eablkybsjg && i14 == this.f7645gxszxtbevo) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:26:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:27:0x0109  */
        /* JADX WARN: Code duplicated, block: B:29:0x010f  */
        /* JADX WARN: Code duplicated, block: B:42:0x013d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x013d A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:29:0x010f, please report this as an issue */
        public void iobyxmoadg() {
            c1.eablkybsjg eablkybsjgVarWkgbmnqykc;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f7534cdpycssgdh.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = MotionLayout.this.getChildAt(i13);
                draadjrbmk draadjrbmkVar = new draadjrbmk(childAt);
                int id2 = childAt.getId();
                iArr[i13] = id2;
                sparseArray.put(id2, draadjrbmkVar);
                MotionLayout.this.f7534cdpycssgdh.put(childAt, draadjrbmkVar);
            }
            int i14 = 0;
            while (i14 < childCount) {
                View childAt2 = MotionLayout.this.getChildAt(i14);
                draadjrbmk draadjrbmkVar2 = (draadjrbmk) MotionLayout.this.f7534cdpycssgdh.get(childAt2);
                if (draadjrbmkVar2 == null) {
                    sparseArray = sparseArray;
                } else {
                    if (this.f7648ppxfxbqfkf != null) {
                        c1.eablkybsjg eablkybsjgVarWkgbmnqykc2 = wkgbmnqykc(this.f7646iobyxmoadg, childAt2);
                        if (eablkybsjgVarWkgbmnqykc2 != null) {
                            draadjrbmkVar2.istkbnxepw(MotionLayout.this.zfvoamnweg(eablkybsjgVarWkgbmnqykc2), this.f7648ppxfxbqfkf, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.f7597wypolnanlu != 0) {
                            Log.e("MotionLayout", androidx.constraintlayout.motion.widget.iobyxmoadg.zoijcleaow() + "no widget for  " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    } else {
                        if (MotionLayout.this.f7569lxfrhoxuzk) {
                            yggfygwlhe.iobyxmoadg(MotionLayout.this.f7549hszhottldk.get(childAt2));
                            MotionLayout motionLayout = MotionLayout.this;
                            draadjrbmkVar2.cdpycssgdh(null, childAt2, motionLayout.f7595wizcaqwiak, motionLayout.f7543fiwbwshyhd, MotionLayout.this.f7531ageimvtcrz);
                        }
                        if (this.f7649wkgbmnqykc == null) {
                            eablkybsjgVarWkgbmnqykc = wkgbmnqykc(this.f7650zoijcleaow, childAt2);
                            if (eablkybsjgVarWkgbmnqykc != null) {
                                draadjrbmkVar2.lereixgezr(MotionLayout.this.zfvoamnweg(eablkybsjgVarWkgbmnqykc), this.f7649wkgbmnqykc, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                            } else if (MotionLayout.this.f7597wypolnanlu != 0) {
                                Log.e("MotionLayout", androidx.constraintlayout.motion.widget.iobyxmoadg.zoijcleaow() + "no widget for  " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    }
                    if (this.f7649wkgbmnqykc == null) {
                        eablkybsjgVarWkgbmnqykc = wkgbmnqykc(this.f7650zoijcleaow, childAt2);
                        if (eablkybsjgVarWkgbmnqykc != null) {
                            draadjrbmkVar2.lereixgezr(MotionLayout.this.zfvoamnweg(eablkybsjgVarWkgbmnqykc), this.f7649wkgbmnqykc, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        } else if (MotionLayout.this.f7597wypolnanlu != 0) {
                            Log.e("MotionLayout", androidx.constraintlayout.motion.widget.iobyxmoadg.zoijcleaow() + "no widget for  " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i14++;
                sparseArray = sparseArray;
            }
            SparseArray sparseArray2 = sparseArray;
            int i15 = 0;
            while (i15 < childCount) {
                SparseArray sparseArray3 = sparseArray2;
                draadjrbmk draadjrbmkVar3 = (draadjrbmk) sparseArray3.get(iArr[i15]);
                int iNufgyqmvbu = draadjrbmkVar3.nufgyqmvbu();
                if (iNufgyqmvbu != -1) {
                    draadjrbmkVar3.lmojexxdyd((draadjrbmk) sparseArray3.get(iNufgyqmvbu));
                }
                i15++;
                sparseArray2 = sparseArray3;
            }
        }

        public void lqeggnwhkg(int i13, int i14) {
            int mode = View.MeasureSpec.getMode(i13);
            int mode2 = View.MeasureSpec.getMode(i14);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f7574nuxfzjnpeb = mode;
            motionLayout.f7588tbqsvytpvh = mode2;
            zoijcleaow(i13, i14);
            if (!(MotionLayout.this.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                zoijcleaow(i13, i14);
                MotionLayout.this.f7558iyctptxqzt = this.f7646iobyxmoadg.jlmebxxoox();
                MotionLayout.this.f7594weqkydbzbr = this.f7646iobyxmoadg.lereixgezr();
                MotionLayout.this.f7568lrnfpwlwnk = this.f7650zoijcleaow.jlmebxxoox();
                MotionLayout.this.f7606zeieaojujs = this.f7650zoijcleaow.lereixgezr();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.f7577opjhrmiecq = (motionLayout2.f7558iyctptxqzt == motionLayout2.f7568lrnfpwlwnk && motionLayout2.f7594weqkydbzbr == motionLayout2.f7606zeieaojujs) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i15 = motionLayout3.f7558iyctptxqzt;
            int i16 = motionLayout3.f7594weqkydbzbr;
            int i17 = motionLayout3.f7574nuxfzjnpeb;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i15 = (int) (i15 + (motionLayout3.f7583roivzttewh * (motionLayout3.f7568lrnfpwlwnk - i15)));
            }
            int i18 = i15;
            int i19 = motionLayout3.f7588tbqsvytpvh;
            if (i19 == Integer.MIN_VALUE || i19 == 0) {
                i16 = (int) (i16 + (motionLayout3.f7583roivzttewh * (motionLayout3.f7606zeieaojujs - i16)));
            }
            MotionLayout.this.resolveMeasuredDimension(i13, i14, i18, i16, this.f7646iobyxmoadg.b0() || this.f7650zoijcleaow.b0(), this.f7646iobyxmoadg.Z() || this.f7650zoijcleaow.Z());
        }

        public void nufgyqmvbu() {
            lqeggnwhkg(MotionLayout.this.f7579pmvmpeiblj, MotionLayout.this.f7608zynmafqrjb);
            MotionLayout.this.sflfametgt();
        }

        void ppxfxbqfkf(c1.gxszxtbevo gxszxtbevoVar, c1.gxszxtbevo gxszxtbevoVar2) {
            c1.eablkybsjg btonecajqbVar;
            ArrayList<c1.eablkybsjg> arrayListB = gxszxtbevoVar.B();
            HashMap map = new HashMap();
            map.put(gxszxtbevoVar, gxszxtbevoVar2);
            gxszxtbevoVar2.B().clear();
            gxszxtbevoVar2.agtfadlqog(gxszxtbevoVar, map);
            for (c1.eablkybsjg eablkybsjgVar : arrayListB) {
                if (eablkybsjgVar instanceof c1.iobyxmoadg) {
                    btonecajqbVar = new c1.iobyxmoadg();
                } else if (eablkybsjgVar instanceof c1.nufgyqmvbu) {
                    btonecajqbVar = new c1.nufgyqmvbu();
                } else if (eablkybsjgVar instanceof c1.lqeggnwhkg) {
                    btonecajqbVar = new c1.lqeggnwhkg();
                } else if (eablkybsjgVar instanceof c1.draadjrbmk) {
                    btonecajqbVar = new c1.draadjrbmk();
                } else {
                    btonecajqbVar = eablkybsjgVar instanceof c1.dxjokdxxww ? new c1.btonecajqb() : new c1.eablkybsjg();
                }
                gxszxtbevoVar2.iobyxmoadg(btonecajqbVar);
                map.put(eablkybsjgVar, btonecajqbVar);
            }
            for (c1.eablkybsjg eablkybsjgVar2 : arrayListB) {
                ((c1.eablkybsjg) map.get(eablkybsjgVar2)).agtfadlqog(eablkybsjgVar2, map);
            }
        }

        c1.eablkybsjg wkgbmnqykc(c1.gxszxtbevo gxszxtbevoVar, View view) {
            if (gxszxtbevoVar.yggfygwlhe() == view) {
                return gxszxtbevoVar;
            }
            ArrayList arrayListB = gxszxtbevoVar.B();
            int size = arrayListB.size();
            for (int i13 = 0; i13 < size; i13++) {
                c1.eablkybsjg eablkybsjgVar = (c1.eablkybsjg) arrayListB.get(i13);
                if (eablkybsjgVar.yggfygwlhe() == view) {
                    return eablkybsjgVar;
                }
            }
            return null;
        }
    }

    class iobyxmoadg implements Runnable {
        iobyxmoadg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f7556iwxlajgraz.iobyxmoadg();
        }
    }

    protected interface lqeggnwhkg {
        float eablkybsjg();

        void gxszxtbevo(int i13);

        void ppxfxbqfkf(MotionEvent motionEvent);

        float wkgbmnqykc();

        void zoijcleaow();
    }

    private static class nufgyqmvbu implements lqeggnwhkg {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private static nufgyqmvbu f7652zoijcleaow = new nufgyqmvbu();

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        VelocityTracker f7653iobyxmoadg;

        private nufgyqmvbu() {
        }

        public static nufgyqmvbu iobyxmoadg() {
            f7652zoijcleaow.f7653iobyxmoadg = VelocityTracker.obtain();
            return f7652zoijcleaow;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.lqeggnwhkg
        public float eablkybsjg() {
            VelocityTracker velocityTracker = this.f7653iobyxmoadg;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.lqeggnwhkg
        public void gxszxtbevo(int i13) {
            VelocityTracker velocityTracker = this.f7653iobyxmoadg;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i13);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.lqeggnwhkg
        public void ppxfxbqfkf(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f7653iobyxmoadg;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.lqeggnwhkg
        public float wkgbmnqykc() {
            VelocityTracker velocityTracker = this.f7653iobyxmoadg;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.lqeggnwhkg
        public void zoijcleaow() {
            VelocityTracker velocityTracker = this.f7653iobyxmoadg;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f7653iobyxmoadg = null;
            }
        }
    }

    class ppxfxbqfkf implements Runnable {
        ppxfxbqfkf() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.f7556iwxlajgraz.iobyxmoadg();
        }
    }

    class wkgbmnqykc extends wflxmlrfwp {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        float f7656ppxfxbqfkf;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        float f7655iobyxmoadg = 0.0f;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        float f7658zoijcleaow = 0.0f;

        wkgbmnqykc() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f13) {
            float f14;
            float f15;
            float f16 = this.f7655iobyxmoadg;
            if (f16 > 0.0f) {
                float f17 = this.f7656ppxfxbqfkf;
                if (f16 / f17 < f13) {
                    f13 = f16 / f17;
                }
                MotionLayout.this.f7555iwizpuwonk = f16 - (f17 * f13);
                f14 = (f16 * f13) - (((f17 * f13) * f13) / 2.0f);
                f15 = this.f7658zoijcleaow;
            } else {
                float f18 = this.f7656ppxfxbqfkf;
                if ((-f16) / f18 < f13) {
                    f13 = (-f16) / f18;
                }
                MotionLayout.this.f7555iwizpuwonk = (f18 * f13) + f16;
                f14 = (f16 * f13) + (((f18 * f13) * f13) / 2.0f);
                f15 = this.f7658zoijcleaow;
            }
            return f14 + f15;
        }

        @Override // androidx.constraintlayout.motion.widget.wflxmlrfwp
        public float iobyxmoadg() {
            return MotionLayout.this.f7555iwizpuwonk;
        }

        public void zoijcleaow(float f13, float f14, float f15) {
            this.f7655iobyxmoadg = f13;
            this.f7658zoijcleaow = f14;
            this.f7656ppxfxbqfkf = f15;
        }
    }

    class zoijcleaow implements Runnable {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ View f7660zdlpuopuiu;

        zoijcleaow(View view) {
            this.f7660zdlpuopuiu = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7660zdlpuopuiu.setNestedScrollingEnabled(true);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7563jyumaefscl = null;
        this.f7555iwizpuwonk = 0.0f;
        this.f7536cqumvgiudr = -1;
        this.f7541esjtqupxsv = -1;
        this.f7566lereixgezr = -1;
        this.f7579pmvmpeiblj = 0;
        this.f7608zynmafqrjb = 0;
        this.f7554istkbnxepw = true;
        this.f7534cdpycssgdh = new HashMap();
        this.f7599yadqdtsiqt = 0L;
        this.f7552iozdgvuglv = 1.0f;
        this.f7567lmojexxdyd = 0.0f;
        this.f7596wwaezpbzkn = 0.0f;
        this.f7578pkzmftpjix = 0.0f;
        this.f7561jpowsppfya = false;
        this.f7548hkdspvbjdz = false;
        this.f7597wypolnanlu = 0;
        this.f7565kegysxyocb = false;
        this.f7589tzroggbefp = new e1.zoijcleaow();
        this.f7570mbcevpiqjq = new wkgbmnqykc();
        this.f7591ulzqkzuiru = true;
        this.f7593vipkmwdibw = false;
        this.f7598xrmfcynszj = false;
        this.f7571metgxyhuhe = null;
        this.f7582rlfsiqarku = null;
        this.f7538czzsidtyhn = null;
        this.f7592uwvvkdfqfp = null;
        this.f7601yfnezrywwk = 0;
        this.f7600ydmasvzmpa = -1L;
        this.f7584sflfametgt = 0.0f;
        this.f7607zfvoamnweg = 0;
        this.f7575oipsdeybqn = 0.0f;
        this.f7533bfopjjpdmp = false;
        this.f7577opjhrmiecq = false;
        this.f7590uawqvzlxes = new a1.wkgbmnqykc();
        this.f7532auzgnhcxok = false;
        this.f7540dvvnrvtcbc = null;
        this.f7585skhdrjzrfn = null;
        this.f7550igdgnonuha = 0;
        this.f7569lxfrhoxuzk = false;
        this.f7595wizcaqwiak = 0;
        this.f7549hszhottldk = new HashMap();
        this.f7553ipoelvxyzq = new Rect();
        this.f7546grlcpdaxtj = false;
        this.f7572mhtqkkgtqm = gtknphoqwx.UNDEFINED;
        this.f7557ixidwrxhsl = new gxszxtbevo();
        this.f7562jrbgnlbqoe = false;
        this.f7544fmlbqenlif = new RectF();
        this.f7542ezmngbhpjk = null;
        this.f7580rhgxfdycjh = null;
        this.f7604yzdjzghtvl = new ArrayList();
        jztzpxfvev(attributeSet);
    }

    private boolean cllcsxoeiz(View view, MotionEvent motionEvent, float f13, float f14) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f13, f14);
            boolean zOnTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f13, -f14);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(f13, f14);
        if (this.f7580rhgxfdycjh == null) {
            this.f7580rhgxfdycjh = new Matrix();
        }
        matrix.invert(this.f7580rhgxfdycjh);
        motionEventObtain.transform(this.f7580rhgxfdycjh);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    private void crxdokpmqz() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7592uwvvkdfqfp;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
        }
    }

    private void czzsidtyhn() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7592uwvvkdfqfp;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        this.f7533bfopjjpdmp = false;
        for (Integer num : this.f7604yzdjzghtvl) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f7592uwvvkdfqfp;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                if (it.hasNext()) {
                    yggfygwlhe.iobyxmoadg(it.next());
                    num.intValue();
                    throw null;
                }
            }
        }
        this.f7604yzdjzghtvl.clear();
    }

    private void dsvhmnatus() {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iYadqdtsiqt = ojitshcjhnVar.yadqdtsiqt();
        ojitshcjhn ojitshcjhnVar2 = this.f7605zdlpuopuiu;
        wypolnanlu(iYadqdtsiqt, ojitshcjhnVar2.gtknphoqwx(ojitshcjhnVar2.yadqdtsiqt()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (ojitshcjhn.zoijcleaow zoijcleaowVar : this.f7605zdlpuopuiu.agtfadlqog()) {
            if (zoijcleaowVar == this.f7605zdlpuopuiu.f7852ppxfxbqfkf) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            stevsuqkhv(zoijcleaowVar);
            int iPmvmpeiblj = zoijcleaowVar.pmvmpeiblj();
            int iEsjtqupxsv = zoijcleaowVar.esjtqupxsv();
            String strPpxfxbqfkf = androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(getContext(), iPmvmpeiblj);
            String strPpxfxbqfkf2 = androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(getContext(), iEsjtqupxsv);
            if (sparseIntArray.get(iPmvmpeiblj) == iEsjtqupxsv) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strPpxfxbqfkf + "->" + strPpxfxbqfkf2);
            }
            if (sparseIntArray2.get(iEsjtqupxsv) == iPmvmpeiblj) {
                Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strPpxfxbqfkf + "->" + strPpxfxbqfkf2);
            }
            sparseIntArray.put(iPmvmpeiblj, iEsjtqupxsv);
            sparseIntArray2.put(iEsjtqupxsv, iPmvmpeiblj);
            if (this.f7605zdlpuopuiu.gtknphoqwx(iPmvmpeiblj) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + strPpxfxbqfkf);
            }
            if (this.f7605zdlpuopuiu.gtknphoqwx(iEsjtqupxsv) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + strPpxfxbqfkf);
            }
        }
    }

    private void jztzpxfvev(AttributeSet attributeSet) {
        ojitshcjhn ojitshcjhnVar;
        f7530eslsurpljm = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.nufgyqmvbu.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z13 = true;
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionLayout_layoutDescription) {
                    this.f7605zdlpuopuiu = new ojitshcjhn(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionLayout_currentState) {
                    this.f7541esjtqupxsv = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionLayout_motionProgress) {
                    this.f7578pkzmftpjix = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f7561jpowsppfya = true;
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionLayout_applyMotionScene) {
                    z13 = typedArrayObtainStyledAttributes.getBoolean(index, z13);
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionLayout_showPaths) {
                    if (this.f7597wypolnanlu == 0) {
                        this.f7597wypolnanlu = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.nufgyqmvbu.MotionLayout_motionDebug) {
                    this.f7597wypolnanlu = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f7605zdlpuopuiu == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z13) {
                this.f7605zdlpuopuiu = null;
            }
        }
        if (this.f7597wypolnanlu != 0) {
            dsvhmnatus();
        }
        if (this.f7541esjtqupxsv != -1 || (ojitshcjhnVar = this.f7605zdlpuopuiu) == null) {
            return;
        }
        this.f7541esjtqupxsv = ojitshcjhnVar.yadqdtsiqt();
        this.f7536cqumvgiudr = this.f7605zdlpuopuiu.yadqdtsiqt();
        this.f7566lereixgezr = this.f7605zdlpuopuiu.rgvfuqvkyq();
    }

    private void kegysxyocb() {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            draadjrbmk draadjrbmkVar = (draadjrbmk) this.f7534cdpycssgdh.get(childAt);
            if (draadjrbmkVar != null) {
                draadjrbmkVar.zynmafqrjb(childAt);
            }
        }
    }

    private void ntlheqmsrt() {
        boolean z13;
        float fSignum = Math.signum(this.f7578pkzmftpjix - this.f7596wwaezpbzkn);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f7602yggfygwlhe;
        float interpolation = this.f7596wwaezpbzkn + (!(interpolator instanceof e1.zoijcleaow) ? (((nanoTime - this.f7603ylkuphrtab) * fSignum) * 1.0E-9f) / this.f7552iozdgvuglv : 0.0f);
        if (this.f7547hcddaimhww) {
            interpolation = this.f7578pkzmftpjix;
        }
        if ((fSignum <= 0.0f || interpolation < this.f7578pkzmftpjix) && (fSignum > 0.0f || interpolation > this.f7578pkzmftpjix)) {
            z13 = false;
        } else {
            interpolation = this.f7578pkzmftpjix;
            z13 = true;
        }
        if (interpolator != null && !z13) {
            interpolation = this.f7565kegysxyocb ? interpolator.getInterpolation((nanoTime - this.f7599yadqdtsiqt) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f7578pkzmftpjix) || (fSignum <= 0.0f && interpolation <= this.f7578pkzmftpjix)) {
            interpolation = this.f7578pkzmftpjix;
        }
        this.f7583roivzttewh = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f7563jyumaefscl;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            draadjrbmk draadjrbmkVar = (draadjrbmk) this.f7534cdpycssgdh.get(childAt);
            if (draadjrbmkVar != null) {
                draadjrbmkVar.yggfygwlhe(childAt, interpolation, nanoTime2, this.f7590uawqvzlxes);
            }
        }
        if (this.f7577opjhrmiecq) {
            requestLayout();
        }
    }

    private boolean okpsazkaxt(float f13, float f14, View view, MotionEvent motionEvent) {
        boolean z13;
        if (!(view instanceof ViewGroup)) {
            z13 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z13 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (okpsazkaxt((childAt.getLeft() + f13) - view.getScrollX(), (childAt.getTop() + f14) - view.getScrollY(), childAt, motionEvent)) {
                z13 = true;
                break;
            }
            childCount--;
        }
        if (!z13) {
            this.f7544fmlbqenlif.set(f13, f14, (view.getRight() + f13) - view.getLeft(), (view.getBottom() + f14) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.f7544fmlbqenlif.contains(motionEvent.getX(), motionEvent.getY())) && cllcsxoeiz(view, motionEvent, -f13, -f14)) {
                return true;
            }
        }
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sflfametgt() {
        int childCount = getChildCount();
        this.f7557ixidwrxhsl.iobyxmoadg();
        this.f7561jpowsppfya = true;
        SparseArray sparseArray = new SparseArray();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            sparseArray.put(childAt.getId(), (draadjrbmk) this.f7534cdpycssgdh.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iDxjokdxxww = this.f7605zdlpuopuiu.dxjokdxxww();
        if (iDxjokdxxww != -1) {
            for (int i15 = 0; i15 < childCount; i15++) {
                draadjrbmk draadjrbmkVar = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i15));
                if (draadjrbmkVar != null) {
                    draadjrbmkVar.pmvmpeiblj(iDxjokdxxww);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f7534cdpycssgdh.size()];
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            draadjrbmk draadjrbmkVar2 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i17));
            if (draadjrbmkVar2.nufgyqmvbu() != -1) {
                sparseBooleanArray.put(draadjrbmkVar2.nufgyqmvbu(), true);
                iArr[i16] = draadjrbmkVar2.nufgyqmvbu();
                i16++;
            }
        }
        if (this.f7538czzsidtyhn != null) {
            for (int i18 = 0; i18 < i16; i18++) {
                draadjrbmk draadjrbmkVar3 = (draadjrbmk) this.f7534cdpycssgdh.get(findViewById(iArr[i18]));
                if (draadjrbmkVar3 != null) {
                    this.f7605zdlpuopuiu.kcexrzcfyt(draadjrbmkVar3);
                }
            }
            Iterator it = this.f7538czzsidtyhn.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
            for (int i19 = 0; i19 < i16; i19++) {
                draadjrbmk draadjrbmkVar4 = (draadjrbmk) this.f7534cdpycssgdh.get(findViewById(iArr[i19]));
                if (draadjrbmkVar4 != null) {
                    draadjrbmkVar4.iozdgvuglv(width, height, this.f7552iozdgvuglv, getNanoTime());
                }
            }
        } else {
            for (int i23 = 0; i23 < i16; i23++) {
                draadjrbmk draadjrbmkVar5 = (draadjrbmk) this.f7534cdpycssgdh.get(findViewById(iArr[i23]));
                if (draadjrbmkVar5 != null) {
                    this.f7605zdlpuopuiu.kcexrzcfyt(draadjrbmkVar5);
                    draadjrbmkVar5.iozdgvuglv(width, height, this.f7552iozdgvuglv, getNanoTime());
                }
            }
        }
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            draadjrbmk draadjrbmkVar6 = (draadjrbmk) this.f7534cdpycssgdh.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && draadjrbmkVar6 != null) {
                this.f7605zdlpuopuiu.kcexrzcfyt(draadjrbmkVar6);
                draadjrbmkVar6.iozdgvuglv(width, height, this.f7552iozdgvuglv, getNanoTime());
            }
        }
        float fCdpycssgdh = this.f7605zdlpuopuiu.cdpycssgdh();
        if (fCdpycssgdh != 0.0f) {
            boolean z13 = ((double) fCdpycssgdh) < 0.0d;
            float fAbs = Math.abs(fCdpycssgdh);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i25 = 0; i25 < childCount; i25++) {
                draadjrbmk draadjrbmkVar7 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i25));
                if (!Float.isNaN(draadjrbmkVar7.f7732wflxmlrfwp)) {
                    for (int i26 = 0; i26 < childCount; i26++) {
                        draadjrbmk draadjrbmkVar8 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i26));
                        if (!Float.isNaN(draadjrbmkVar8.f7732wflxmlrfwp)) {
                            fMin = Math.min(fMin, draadjrbmkVar8.f7732wflxmlrfwp);
                            fMax = Math.max(fMax, draadjrbmkVar8.f7732wflxmlrfwp);
                        }
                    }
                    while (i13 < childCount) {
                        draadjrbmk draadjrbmkVar9 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i13));
                        if (!Float.isNaN(draadjrbmkVar9.f7732wflxmlrfwp)) {
                            draadjrbmkVar9.f7725ojitshcjhn = 1.0f / (1.0f - fAbs);
                            if (z13) {
                                draadjrbmkVar9.f7703agtfadlqog = fAbs - (((fMax - draadjrbmkVar9.f7732wflxmlrfwp) / (fMax - fMin)) * fAbs);
                            } else {
                                draadjrbmkVar9.f7703agtfadlqog = fAbs - (((draadjrbmkVar9.f7732wflxmlrfwp - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i13++;
                    }
                    return;
                }
                float fAgtfadlqog = draadjrbmkVar7.agtfadlqog();
                float fOjitshcjhn = draadjrbmkVar7.ojitshcjhn();
                float f13 = z13 ? fOjitshcjhn - fAgtfadlqog : fOjitshcjhn + fAgtfadlqog;
                fMin2 = Math.min(fMin2, f13);
                fMax2 = Math.max(fMax2, f13);
            }
            while (i13 < childCount) {
                draadjrbmk draadjrbmkVar10 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i13));
                float fAgtfadlqog2 = draadjrbmkVar10.agtfadlqog();
                float fOjitshcjhn2 = draadjrbmkVar10.ojitshcjhn();
                float f14 = z13 ? fOjitshcjhn2 - fAgtfadlqog2 : fOjitshcjhn2 + fAgtfadlqog2;
                draadjrbmkVar10.f7725ojitshcjhn = 1.0f / (1.0f - fAbs);
                draadjrbmkVar10.f7703agtfadlqog = fAbs - (((f14 - fMin2) * fAbs) / (fMax2 - fMin2));
                i13++;
            }
        }
    }

    private void stevsuqkhv(ojitshcjhn.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.pmvmpeiblj() == zoijcleaowVar.esjtqupxsv()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    private static boolean uawqvzlxes(float f13, float f14, float f15) {
        if (f13 > 0.0f) {
            float f16 = f13 / f15;
            return f14 + ((f13 * f16) - (((f15 * f16) * f16) / 2.0f)) > 1.0f;
        }
        float f17 = (-f13) / f15;
        return f14 + ((f13 * f17) + (((f15 * f17) * f17) / 2.0f)) < 0.0f;
    }

    private void ulzqkzuiru() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7592uwvvkdfqfp;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty() || this.f7575oipsdeybqn == this.f7567lmojexxdyd) {
            return;
        }
        if (this.f7607zfvoamnweg != -1) {
            crxdokpmqz();
            this.f7533bfopjjpdmp = true;
        }
        this.f7607zfvoamnweg = -1;
        this.f7575oipsdeybqn = this.f7567lmojexxdyd;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f7592uwvvkdfqfp;
        if (copyOnWriteArrayList2 != null) {
            Iterator it = copyOnWriteArrayList2.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
        }
        this.f7533bfopjjpdmp = true;
    }

    private void wypolnanlu(int i13, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar) {
        String strPpxfxbqfkf = androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(getContext(), i13);
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            int id2 = childAt.getId();
            if (id2 == -1) {
                Log.w("MotionLayout", "CHECK: " + strPpxfxbqfkf + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (wkgbmnqykcVar.yggfygwlhe(id2) == null) {
                Log.w("MotionLayout", "CHECK: " + strPpxfxbqfkf + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.iobyxmoadg.wkgbmnqykc(childAt));
            }
        }
        int[] iArrIwizpuwonk = wkgbmnqykcVar.iwizpuwonk();
        for (int i15 = 0; i15 < iArrIwizpuwonk.length; i15++) {
            int i16 = iArrIwizpuwonk[i15];
            String strPpxfxbqfkf2 = androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(getContext(), i16);
            if (findViewById(iArrIwizpuwonk[i15]) == null) {
                Log.w("MotionLayout", "CHECK: " + strPpxfxbqfkf + " NO View matches id " + strPpxfxbqfkf2);
            }
            if (wkgbmnqykcVar.jyumaefscl(i16) == -1) {
                Log.w("MotionLayout", "CHECK: " + strPpxfxbqfkf + "(" + strPpxfxbqfkf2 + ") no LAYOUT_HEIGHT");
            }
            if (wkgbmnqykcVar.pmvmpeiblj(i16) == -1) {
                Log.w("MotionLayout", "CHECK: " + strPpxfxbqfkf + "(" + strPpxfxbqfkf2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect zfvoamnweg(c1.eablkybsjg eablkybsjgVar) {
        this.f7553ipoelvxyzq.top = eablkybsjgVar.vipkmwdibw();
        this.f7553ipoelvxyzq.left = eablkybsjgVar.ribwqtqdhb();
        Rect rect = this.f7553ipoelvxyzq;
        int iJlmebxxoox = eablkybsjgVar.jlmebxxoox();
        Rect rect2 = this.f7553ipoelvxyzq;
        rect.right = iJlmebxxoox + rect2.left;
        int iLereixgezr = eablkybsjgVar.lereixgezr();
        Rect rect3 = this.f7553ipoelvxyzq;
        rect2.bottom = iLereixgezr + rect3.top;
        return rect3;
    }

    @Override // v1.lmojexxdyd
    public void agtfadlqog(View view, int i13, int i14, int i15, int i16, int i17) {
    }

    public void bfopjjpdmp() {
        hkdspvbjdz(1.0f);
        this.f7540dvvnrvtcbc = null;
    }

    @Override // v1.lmojexxdyd
    public void btonecajqb(View view, int i13) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null) {
            float f13 = this.f7564jztzpxfvev;
            if (f13 == 0.0f) {
                return;
            }
            ojitshcjhnVar.wypolnanlu(this.f7559jhduphickx / f13, this.f7551ikoacuggdj / f13);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kcexrzcfyt kcexrzcfytVar;
        ArrayList arrayList = this.f7538czzsidtyhn;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
        }
        mbcevpiqjq(false);
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null && (kcexrzcfytVar = ojitshcjhnVar.f7851oxmwwwfdhm) != null) {
            kcexrzcfytVar.ppxfxbqfkf();
        }
        super.dispatchDraw(canvas);
        if (this.f7605zdlpuopuiu == null) {
            return;
        }
        if ((this.f7597wypolnanlu & 1) == 1 && !isInEditMode()) {
            this.f7601yfnezrywwk++;
            long nanoTime = getNanoTime();
            long j13 = this.f7600ydmasvzmpa;
            if (j13 != -1) {
                long j14 = nanoTime - j13;
                if (j14 > 200000000) {
                    this.f7584sflfametgt = ((int) ((this.f7601yfnezrywwk / (j14 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f7601yfnezrywwk = 0;
                    this.f7600ydmasvzmpa = nanoTime;
                }
            } else {
                this.f7600ydmasvzmpa = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.f7584sflfametgt + " fps " + androidx.constraintlayout.motion.widget.iobyxmoadg.eablkybsjg(this, this.f7536cqumvgiudr) + " -> ";
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(androidx.constraintlayout.motion.widget.iobyxmoadg.eablkybsjg(this, this.f7566lereixgezr));
            sb3.append(" (progress: ");
            sb3.append(progress);
            sb3.append(" ) state=");
            int i13 = this.f7541esjtqupxsv;
            sb3.append(i13 == -1 ? StringUtils.UNDEFINED : androidx.constraintlayout.motion.widget.iobyxmoadg.eablkybsjg(this, i13));
            String string = sb3.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f7597wypolnanlu > 1) {
            if (this.f7587stevsuqkhv == null) {
                this.f7587stevsuqkhv = new eablkybsjg();
            }
            this.f7587stevsuqkhv.iobyxmoadg(canvas, this.f7534cdpycssgdh, this.f7605zdlpuopuiu.ojitshcjhn(), this.f7597wypolnanlu);
        }
        ArrayList arrayList2 = this.f7538czzsidtyhn;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                yggfygwlhe.iobyxmoadg(it2.next());
                throw null;
            }
        }
    }

    @Override // v1.lmojexxdyd
    public void dxjokdxxww(View view, View view2, int i13, int i14) {
        this.f7576okpsazkaxt = getNanoTime();
        this.f7564jztzpxfvev = 0.0f;
        this.f7559jhduphickx = 0.0f;
        this.f7551ikoacuggdj = 0.0f;
    }

    public int[] getConstraintSetIds() {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null) {
            return null;
        }
        return ojitshcjhnVar.wflxmlrfwp();
    }

    public int getCurrentState() {
        return this.f7541esjtqupxsv;
    }

    public ArrayList<ojitshcjhn.zoijcleaow> getDefinedTransitions() {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null) {
            return null;
        }
        return ojitshcjhnVar.agtfadlqog();
    }

    public androidx.constraintlayout.motion.widget.zoijcleaow getDesignTool() {
        if (this.f7573ntlheqmsrt == null) {
            this.f7573ntlheqmsrt = new androidx.constraintlayout.motion.widget.zoijcleaow(this);
        }
        return this.f7573ntlheqmsrt;
    }

    public int getEndState() {
        return this.f7566lereixgezr;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f7596wwaezpbzkn;
    }

    public ojitshcjhn getScene() {
        return this.f7605zdlpuopuiu;
    }

    public int getStartState() {
        return this.f7536cqumvgiudr;
    }

    public float getTargetPosition() {
        return this.f7578pkzmftpjix;
    }

    public Bundle getTransitionState() {
        if (this.f7556iwxlajgraz == null) {
            this.f7556iwxlajgraz = new dxjokdxxww();
        }
        this.f7556iwxlajgraz.ppxfxbqfkf();
        return this.f7556iwxlajgraz.zoijcleaow();
    }

    public long getTransitionTimeMs() {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null) {
            this.f7552iozdgvuglv = ojitshcjhnVar.ojitshcjhn() / 1000.0f;
        }
        return (long) (this.f7552iozdgvuglv * 1000.0f);
    }

    public float getVelocity() {
        return this.f7555iwizpuwonk;
    }

    @Override // v1.lmojexxdyd
    public void gtknphoqwx(View view, int i13, int i14, int[] iArr, int i15) {
        ojitshcjhn.zoijcleaow zoijcleaowVar;
        rgvfuqvkyq rgvfuqvkyqVarZynmafqrjb;
        int iVdvldrhtss;
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null || (zoijcleaowVar = ojitshcjhnVar.f7852ppxfxbqfkf) == null || !zoijcleaowVar.istkbnxepw()) {
            return;
        }
        int i16 = -1;
        if (!zoijcleaowVar.istkbnxepw() || (rgvfuqvkyqVarZynmafqrjb = zoijcleaowVar.zynmafqrjb()) == null || (iVdvldrhtss = rgvfuqvkyqVarZynmafqrjb.vdvldrhtss()) == -1 || view.getId() == iVdvldrhtss) {
            if (ojitshcjhnVar.jyumaefscl()) {
                rgvfuqvkyq rgvfuqvkyqVarZynmafqrjb2 = zoijcleaowVar.zynmafqrjb();
                if (rgvfuqvkyqVarZynmafqrjb2 != null && (rgvfuqvkyqVarZynmafqrjb2.eablkybsjg() & 4) != 0) {
                    i16 = i14;
                }
                float f13 = this.f7567lmojexxdyd;
                if ((f13 == 1.0f || f13 == 0.0f) && view.canScrollVertically(i16)) {
                    return;
                }
            }
            if (zoijcleaowVar.zynmafqrjb() != null && (zoijcleaowVar.zynmafqrjb().eablkybsjg() & 1) != 0) {
                float fIwizpuwonk = ojitshcjhnVar.iwizpuwonk(i13, i14);
                float f14 = this.f7596wwaezpbzkn;
                if ((f14 <= 0.0f && fIwizpuwonk < 0.0f) || (f14 >= 1.0f && fIwizpuwonk > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new zoijcleaow(view));
                    return;
                }
            }
            float f15 = this.f7567lmojexxdyd;
            long nanoTime = getNanoTime();
            float f16 = i13;
            this.f7559jhduphickx = f16;
            float f17 = i14;
            this.f7551ikoacuggdj = f17;
            this.f7564jztzpxfvev = (float) ((nanoTime - this.f7576okpsazkaxt) * 1.0E-9d);
            this.f7576okpsazkaxt = nanoTime;
            ojitshcjhnVar.dsvhmnatus(f16, f17);
            if (f15 != this.f7567lmojexxdyd) {
                iArr[0] = i13;
                iArr[1] = i14;
            }
            mbcevpiqjq(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f7593vipkmwdibw = true;
        }
    }

    void hkdspvbjdz(float f13) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null) {
            return;
        }
        float f14 = this.f7596wwaezpbzkn;
        float f15 = this.f7567lmojexxdyd;
        if (f14 != f15 && this.f7547hcddaimhww) {
            this.f7596wwaezpbzkn = f15;
        }
        float f16 = this.f7596wwaezpbzkn;
        if (f16 == f13) {
            return;
        }
        this.f7565kegysxyocb = false;
        this.f7578pkzmftpjix = f13;
        this.f7552iozdgvuglv = ojitshcjhnVar.ojitshcjhn() / 1000.0f;
        setProgress(this.f7578pkzmftpjix);
        this.f7602yggfygwlhe = null;
        this.f7563jyumaefscl = this.f7605zdlpuopuiu.oxmwwwfdhm();
        this.f7547hcddaimhww = false;
        this.f7599yadqdtsiqt = getNanoTime();
        this.f7561jpowsppfya = true;
        this.f7567lmojexxdyd = f16;
        this.f7596wwaezpbzkn = f16;
        invalidate();
    }

    public ojitshcjhn.zoijcleaow ikoacuggdj(int i13) {
        return this.f7605zdlpuopuiu.iozdgvuglv(i13);
    }

    public void iyctptxqzt() {
        hkdspvbjdz(0.0f);
    }

    draadjrbmk jhduphickx(int i13) {
        return (draadjrbmk) this.f7534cdpycssgdh.get(findViewById(i13));
    }

    public void jlmebxxoox(int i13, boolean z13, float f13) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7592uwvvkdfqfp;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i13) {
        ojitshcjhn.zoijcleaow zoijcleaowVar;
        if (i13 == 0) {
            this.f7605zdlpuopuiu = null;
            return;
        }
        try {
            ojitshcjhn ojitshcjhnVar = new ojitshcjhn(getContext(), this, i13);
            this.f7605zdlpuopuiu = ojitshcjhnVar;
            if (this.f7541esjtqupxsv == -1) {
                this.f7541esjtqupxsv = ojitshcjhnVar.yadqdtsiqt();
                this.f7536cqumvgiudr = this.f7605zdlpuopuiu.yadqdtsiqt();
                this.f7566lereixgezr = this.f7605zdlpuopuiu.rgvfuqvkyq();
            }
            if (!isAttachedToWindow()) {
                this.f7605zdlpuopuiu = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.f7545fyldjkxazc = display == null ? 0 : display.getRotation();
                ojitshcjhn ojitshcjhnVar2 = this.f7605zdlpuopuiu;
                if (ojitshcjhnVar2 != null) {
                    androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = ojitshcjhnVar2.gtknphoqwx(this.f7541esjtqupxsv);
                    this.f7605zdlpuopuiu.tzroggbefp(this);
                    ArrayList arrayList = this.f7538czzsidtyhn;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            yggfygwlhe.iobyxmoadg(it.next());
                            throw null;
                        }
                    }
                    if (wkgbmnqykcVarGtknphoqwx != null) {
                        wkgbmnqykcVarGtknphoqwx.dxjokdxxww(this);
                    }
                    this.f7536cqumvgiudr = this.f7541esjtqupxsv;
                }
                rlfsiqarku();
                dxjokdxxww dxjokdxxwwVar = this.f7556iwxlajgraz;
                if (dxjokdxxwwVar != null) {
                    if (this.f7546grlcpdaxtj) {
                        post(new iobyxmoadg());
                        return;
                    } else {
                        dxjokdxxwwVar.iobyxmoadg();
                        return;
                    }
                }
                ojitshcjhn ojitshcjhnVar3 = this.f7605zdlpuopuiu;
                if (ojitshcjhnVar3 == null || (zoijcleaowVar = ojitshcjhnVar3.f7852ppxfxbqfkf) == null || zoijcleaowVar.cqumvgiudr() != 4) {
                    return;
                }
                bfopjjpdmp();
                setState(gtknphoqwx.SETUP);
                setState(gtknphoqwx.MOVING);
            } catch (Exception e13) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e13);
            }
        } catch (Exception e14) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e14);
        }
    }

    public void lrnfpwlwnk(int i13, int i14, int i15) {
        zeieaojujs(i13, i14, i15, -1);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x0222  */
    /* JADX WARN: Code duplicated, block: B:180:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ab, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0151  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:96:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    void mbcevpiqjq(boolean z13) {
        boolean z14;
        char c13;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i13;
        int i14;
        int i15;
        int i16;
        View childAt;
        draadjrbmk draadjrbmkVar;
        boolean z15;
        if (this.f7603ylkuphrtab == -1) {
            this.f7603ylkuphrtab = getNanoTime();
        }
        float f13 = this.f7596wwaezpbzkn;
        if (f13 > 0.0f && f13 < 1.0f) {
            this.f7541esjtqupxsv = -1;
        }
        boolean z16 = false;
        if (this.f7598xrmfcynszj || (this.f7561jpowsppfya && (z13 || this.f7578pkzmftpjix != f13))) {
            float fSignum = Math.signum(this.f7578pkzmftpjix - f13);
            long nanoTime2 = getNanoTime();
            Interpolator interpolator3 = this.f7602yggfygwlhe;
            float f14 = !(interpolator3 instanceof wflxmlrfwp) ? (((nanoTime2 - this.f7603ylkuphrtab) * fSignum) * 1.0E-9f) / this.f7552iozdgvuglv : 0.0f;
            float f15 = this.f7596wwaezpbzkn + f14;
            if (this.f7547hcddaimhww) {
                f15 = this.f7578pkzmftpjix;
            }
            if ((fSignum <= 0.0f || f15 < this.f7578pkzmftpjix) && (fSignum > 0.0f || f15 > this.f7578pkzmftpjix)) {
                z14 = false;
            } else {
                f15 = this.f7578pkzmftpjix;
                this.f7561jpowsppfya = false;
                z14 = true;
            }
            this.f7596wwaezpbzkn = f15;
            this.f7567lmojexxdyd = f15;
            this.f7603ylkuphrtab = nanoTime2;
            if (interpolator3 == null || z14) {
                this.f7555iwizpuwonk = f14;
            } else {
                if (this.f7565kegysxyocb) {
                    float interpolation2 = interpolator3.getInterpolation((nanoTime2 - this.f7599yadqdtsiqt) * 1.0E-9f);
                    Interpolator interpolator4 = this.f7602yggfygwlhe;
                    e1.zoijcleaow zoijcleaowVar = this.f7589tzroggbefp;
                    c13 = interpolator4 == zoijcleaowVar ? zoijcleaowVar.ppxfxbqfkf() ? (char) 2 : (char) 1 : (char) 0;
                    this.f7596wwaezpbzkn = interpolation2;
                    this.f7603ylkuphrtab = nanoTime2;
                    Interpolator interpolator5 = this.f7602yggfygwlhe;
                    if (interpolator5 instanceof wflxmlrfwp) {
                        float fIobyxmoadg = ((wflxmlrfwp) interpolator5).iobyxmoadg();
                        this.f7555iwizpuwonk = fIobyxmoadg;
                        if (Math.abs(fIobyxmoadg) * this.f7552iozdgvuglv <= 1.0E-5f && c13 == 2) {
                            this.f7561jpowsppfya = false;
                        }
                        if (fIobyxmoadg > 0.0f && interpolation2 >= 1.0f) {
                            this.f7596wwaezpbzkn = 1.0f;
                            this.f7561jpowsppfya = false;
                            interpolation2 = 1.0f;
                        }
                        if (fIobyxmoadg >= 0.0f || interpolation2 > 0.0f) {
                            f15 = interpolation2;
                        } else {
                            this.f7596wwaezpbzkn = 0.0f;
                            this.f7561jpowsppfya = false;
                            f15 = 0.0f;
                        }
                    } else {
                        f15 = interpolation2;
                    }
                } else {
                    float interpolation3 = interpolator3.getInterpolation(f15);
                    Interpolator interpolator6 = this.f7602yggfygwlhe;
                    if (interpolator6 instanceof wflxmlrfwp) {
                        this.f7555iwizpuwonk = ((wflxmlrfwp) interpolator6).iobyxmoadg();
                    } else {
                        this.f7555iwizpuwonk = ((interpolator6.getInterpolation(f15 + f14) - interpolation3) * fSignum) / f14;
                    }
                    f15 = interpolation3;
                }
                if (Math.abs(this.f7555iwizpuwonk) > 1.0E-5f) {
                    setState(gtknphoqwx.MOVING);
                }
                if (c13 != 1) {
                    if ((fSignum <= 0.0f && f15 >= this.f7578pkzmftpjix) || (fSignum <= 0.0f && f15 <= this.f7578pkzmftpjix)) {
                        f15 = this.f7578pkzmftpjix;
                        this.f7561jpowsppfya = false;
                    }
                    if (f15 < 1.0f || f15 <= 0.0f) {
                        this.f7561jpowsppfya = false;
                        setState(gtknphoqwx.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f7598xrmfcynszj = false;
                nanoTime = getNanoTime();
                this.f7583roivzttewh = f15;
                interpolator = this.f7563jyumaefscl;
                if (interpolator == null) {
                    interpolation = f15;
                } else {
                    interpolation = interpolator.getInterpolation(f15);
                }
                interpolator2 = this.f7563jyumaefscl;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f7552iozdgvuglv) + f15);
                    this.f7555iwizpuwonk = interpolation4;
                    this.f7555iwizpuwonk = interpolation4 - this.f7563jyumaefscl.getInterpolation(f15);
                }
                for (i13 = 0; i13 < childCount; i13++) {
                    childAt = getChildAt(i13);
                    draadjrbmkVar = (draadjrbmk) this.f7534cdpycssgdh.get(childAt);
                    if (draadjrbmkVar != null) {
                        this.f7598xrmfcynszj = draadjrbmkVar.yggfygwlhe(childAt, interpolation, nanoTime, this.f7590uawqvzlxes) | this.f7598xrmfcynszj;
                    }
                }
                boolean z17 = (fSignum <= 0.0f && f15 >= this.f7578pkzmftpjix) || (fSignum <= 0.0f && f15 <= this.f7578pkzmftpjix);
                if (!this.f7598xrmfcynszj && !this.f7561jpowsppfya && z17) {
                    setState(gtknphoqwx.FINISHED);
                }
                if (this.f7577opjhrmiecq) {
                    requestLayout();
                }
                this.f7598xrmfcynszj = (!z17) | this.f7598xrmfcynszj;
                if (f15 <= 0.0f && (i16 = this.f7536cqumvgiudr) != -1 && this.f7541esjtqupxsv != i16) {
                    this.f7541esjtqupxsv = i16;
                    this.f7605zdlpuopuiu.gtknphoqwx(i16).lqeggnwhkg(this);
                    setState(gtknphoqwx.FINISHED);
                    z16 = true;
                }
                if (f15 >= 1.0d) {
                    i14 = this.f7541esjtqupxsv;
                    i15 = this.f7566lereixgezr;
                    if (i14 != i15) {
                        this.f7541esjtqupxsv = i15;
                        this.f7605zdlpuopuiu.gtknphoqwx(i15).lqeggnwhkg(this);
                        setState(gtknphoqwx.FINISHED);
                        z16 = true;
                    }
                }
                if (!this.f7598xrmfcynszj || this.f7561jpowsppfya) {
                    invalidate();
                } else if ((fSignum > 0.0f && f15 == 1.0f) || (fSignum < 0.0f && f15 == 0.0f)) {
                    setState(gtknphoqwx.FINISHED);
                }
                if (!this.f7598xrmfcynszj && !this.f7561jpowsppfya && ((fSignum > 0.0f && f15 == 1.0f) || (fSignum < 0.0f && f15 == 0.0f))) {
                    rlfsiqarku();
                }
            }
            c13 = 0;
            if (Math.abs(this.f7555iwizpuwonk) > 1.0E-5f) {
                setState(gtknphoqwx.MOVING);
            }
            if (c13 != 1) {
                if (fSignum <= 0.0f) {
                    f15 = this.f7578pkzmftpjix;
                    this.f7561jpowsppfya = false;
                } else {
                    f15 = this.f7578pkzmftpjix;
                    this.f7561jpowsppfya = false;
                }
                if (f15 < 1.0f) {
                    this.f7561jpowsppfya = false;
                    setState(gtknphoqwx.FINISHED);
                } else {
                    this.f7561jpowsppfya = false;
                    setState(gtknphoqwx.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f7598xrmfcynszj = false;
            nanoTime = getNanoTime();
            this.f7583roivzttewh = f15;
            interpolator = this.f7563jyumaefscl;
            if (interpolator == null) {
                interpolation = f15;
            } else {
                interpolation = interpolator.getInterpolation(f15);
            }
            interpolator2 = this.f7563jyumaefscl;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f7552iozdgvuglv) + f15);
                this.f7555iwizpuwonk = interpolation5;
                this.f7555iwizpuwonk = interpolation5 - this.f7563jyumaefscl.getInterpolation(f15);
            }
            while (i13 < childCount) {
                childAt = getChildAt(i13);
                draadjrbmkVar = (draadjrbmk) this.f7534cdpycssgdh.get(childAt);
                if (draadjrbmkVar != null) {
                    this.f7598xrmfcynszj = draadjrbmkVar.yggfygwlhe(childAt, interpolation, nanoTime, this.f7590uawqvzlxes) | this.f7598xrmfcynszj;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f7598xrmfcynszj) {
                setState(gtknphoqwx.FINISHED);
            }
            if (this.f7577opjhrmiecq) {
                requestLayout();
            }
            this.f7598xrmfcynszj = (!z17) | this.f7598xrmfcynszj;
            if (f15 <= 0.0f) {
                this.f7541esjtqupxsv = i16;
                this.f7605zdlpuopuiu.gtknphoqwx(i16).lqeggnwhkg(this);
                setState(gtknphoqwx.FINISHED);
                z16 = true;
            }
            if (f15 >= 1.0d) {
                i14 = this.f7541esjtqupxsv;
                i15 = this.f7566lereixgezr;
                if (i14 != i15) {
                    this.f7541esjtqupxsv = i15;
                    this.f7605zdlpuopuiu.gtknphoqwx(i15).lqeggnwhkg(this);
                    setState(gtknphoqwx.FINISHED);
                    z16 = true;
                }
            }
            if (this.f7598xrmfcynszj) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f7598xrmfcynszj) {
                rlfsiqarku();
            }
        }
        float f16 = this.f7596wwaezpbzkn;
        if (f16 < 1.0f) {
            if (f16 <= 0.0f) {
                int i17 = this.f7541esjtqupxsv;
                int i18 = this.f7536cqumvgiudr;
                z15 = i17 == i18 ? z16 : true;
                this.f7541esjtqupxsv = i18;
            }
            this.f7562jrbgnlbqoe |= z16;
            if (z16 && !this.f7532auzgnhcxok) {
                requestLayout();
            }
            this.f7567lmojexxdyd = this.f7596wwaezpbzkn;
        }
        int i19 = this.f7541esjtqupxsv;
        int i23 = this.f7566lereixgezr;
        z15 = i19 == i23 ? z16 : true;
        this.f7541esjtqupxsv = i23;
        z16 = z15;
        this.f7562jrbgnlbqoe |= z16;
        if (z16) {
            requestLayout();
        }
        this.f7567lmojexxdyd = this.f7596wwaezpbzkn;
    }

    protected lqeggnwhkg metgxyhuhe() {
        return nufgyqmvbu.iobyxmoadg();
    }

    public void nuxfzjnpeb() {
        this.f7557ixidwrxhsl.eablkybsjg(this.mLayoutWidget, this.f7605zdlpuopuiu.gtknphoqwx(this.f7536cqumvgiudr), this.f7605zdlpuopuiu.gtknphoqwx(this.f7566lereixgezr));
        uwvvkdfqfp();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    public void oipsdeybqn(int i13, float f13, float f14) {
        if (this.f7605zdlpuopuiu == null || this.f7596wwaezpbzkn == f13) {
            return;
        }
        this.f7565kegysxyocb = true;
        this.f7599yadqdtsiqt = getNanoTime();
        this.f7552iozdgvuglv = this.f7605zdlpuopuiu.ojitshcjhn() / 1000.0f;
        this.f7578pkzmftpjix = f13;
        this.f7561jpowsppfya = true;
        if (i13 == 0 || i13 == 1 || i13 == 2) {
            if (i13 != 1 || i13 == 7) {
                f13 = 0.0f;
            } else if (i13 == 2 || i13 == 6) {
                f13 = 1.0f;
            }
            if (this.f7605zdlpuopuiu.btonecajqb() == 0) {
                this.f7589tzroggbefp.zoijcleaow(this.f7596wwaezpbzkn, f13, f14, this.f7552iozdgvuglv, this.f7605zdlpuopuiu.zdlpuopuiu(), this.f7605zdlpuopuiu.yggfygwlhe());
            } else {
                this.f7589tzroggbefp.wkgbmnqykc(this.f7596wwaezpbzkn, f13, f14, this.f7605zdlpuopuiu.pmvmpeiblj(), this.f7605zdlpuopuiu.zynmafqrjb(), this.f7605zdlpuopuiu.lereixgezr(), this.f7605zdlpuopuiu.istkbnxepw(), this.f7605zdlpuopuiu.esjtqupxsv());
            }
            int i14 = this.f7541esjtqupxsv;
            this.f7578pkzmftpjix = f13;
            this.f7541esjtqupxsv = i14;
            this.f7602yggfygwlhe = this.f7589tzroggbefp;
        } else if (i13 == 4) {
            this.f7570mbcevpiqjq.zoijcleaow(f14, this.f7596wwaezpbzkn, this.f7605zdlpuopuiu.zdlpuopuiu());
            this.f7602yggfygwlhe = this.f7570mbcevpiqjq;
        } else if (i13 != 5) {
            if (i13 == 6 || i13 == 7) {
                if (i13 != 1) {
                    f13 = 0.0f;
                } else {
                    f13 = 0.0f;
                }
                if (this.f7605zdlpuopuiu.btonecajqb() == 0) {
                    this.f7589tzroggbefp.zoijcleaow(this.f7596wwaezpbzkn, f13, f14, this.f7552iozdgvuglv, this.f7605zdlpuopuiu.zdlpuopuiu(), this.f7605zdlpuopuiu.yggfygwlhe());
                } else {
                    this.f7589tzroggbefp.wkgbmnqykc(this.f7596wwaezpbzkn, f13, f14, this.f7605zdlpuopuiu.pmvmpeiblj(), this.f7605zdlpuopuiu.zynmafqrjb(), this.f7605zdlpuopuiu.lereixgezr(), this.f7605zdlpuopuiu.istkbnxepw(), this.f7605zdlpuopuiu.esjtqupxsv());
                }
                int i15 = this.f7541esjtqupxsv;
                this.f7578pkzmftpjix = f13;
                this.f7541esjtqupxsv = i15;
                this.f7602yggfygwlhe = this.f7589tzroggbefp;
            }
        } else if (uawqvzlxes(f14, this.f7596wwaezpbzkn, this.f7605zdlpuopuiu.zdlpuopuiu())) {
            this.f7570mbcevpiqjq.zoijcleaow(f14, this.f7596wwaezpbzkn, this.f7605zdlpuopuiu.zdlpuopuiu());
            this.f7602yggfygwlhe = this.f7570mbcevpiqjq;
        } else {
            this.f7589tzroggbefp.zoijcleaow(this.f7596wwaezpbzkn, f13, f14, this.f7552iozdgvuglv, this.f7605zdlpuopuiu.zdlpuopuiu(), this.f7605zdlpuopuiu.yggfygwlhe());
            this.f7555iwizpuwonk = 0.0f;
            int i16 = this.f7541esjtqupxsv;
            this.f7578pkzmftpjix = f13;
            this.f7541esjtqupxsv = i16;
            this.f7602yggfygwlhe = this.f7589tzroggbefp;
        }
        this.f7547hcddaimhww = false;
        this.f7599yadqdtsiqt = getNanoTime();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ojitshcjhn.zoijcleaow zoijcleaowVar;
        int i13;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f7545fyldjkxazc = display.getRotation();
        }
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null && (i13 = this.f7541esjtqupxsv) != -1) {
            androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVarGtknphoqwx = ojitshcjhnVar.gtknphoqwx(i13);
            this.f7605zdlpuopuiu.tzroggbefp(this);
            ArrayList arrayList = this.f7538czzsidtyhn;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    yggfygwlhe.iobyxmoadg(it.next());
                    throw null;
                }
            }
            if (wkgbmnqykcVarGtknphoqwx != null) {
                wkgbmnqykcVarGtknphoqwx.dxjokdxxww(this);
            }
            this.f7536cqumvgiudr = this.f7541esjtqupxsv;
        }
        rlfsiqarku();
        dxjokdxxww dxjokdxxwwVar = this.f7556iwxlajgraz;
        if (dxjokdxxwwVar != null) {
            if (this.f7546grlcpdaxtj) {
                post(new ppxfxbqfkf());
                return;
            } else {
                dxjokdxxwwVar.iobyxmoadg();
                return;
            }
        }
        ojitshcjhn ojitshcjhnVar2 = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar2 == null || (zoijcleaowVar = ojitshcjhnVar2.f7852ppxfxbqfkf) == null || zoijcleaowVar.cqumvgiudr() != 4) {
            return;
        }
        bfopjjpdmp();
        setState(gtknphoqwx.SETUP);
        setState(gtknphoqwx.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rgvfuqvkyq rgvfuqvkyqVarZynmafqrjb;
        int iVdvldrhtss;
        RectF rectFRgvfuqvkyq;
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null && this.f7554istkbnxepw) {
            kcexrzcfyt kcexrzcfytVar = ojitshcjhnVar.f7851oxmwwwfdhm;
            if (kcexrzcfytVar != null) {
                kcexrzcfytVar.lqeggnwhkg(motionEvent);
            }
            ojitshcjhn.zoijcleaow zoijcleaowVar = this.f7605zdlpuopuiu.f7852ppxfxbqfkf;
            if (zoijcleaowVar != null && zoijcleaowVar.istkbnxepw() && (rgvfuqvkyqVarZynmafqrjb = zoijcleaowVar.zynmafqrjb()) != null && ((motionEvent.getAction() != 0 || (rectFRgvfuqvkyq = rgvfuqvkyqVarZynmafqrjb.rgvfuqvkyq(this, new RectF())) == null || rectFRgvfuqvkyq.contains(motionEvent.getX(), motionEvent.getY())) && (iVdvldrhtss = rgvfuqvkyqVarZynmafqrjb.vdvldrhtss()) != -1)) {
                View view = this.f7542ezmngbhpjk;
                if (view == null || view.getId() != iVdvldrhtss) {
                    this.f7542ezmngbhpjk = findViewById(iVdvldrhtss);
                }
                View view2 = this.f7542ezmngbhpjk;
                if (view2 != null) {
                    this.f7544fmlbqenlif.set(view2.getLeft(), this.f7542ezmngbhpjk.getTop(), this.f7542ezmngbhpjk.getRight(), this.f7542ezmngbhpjk.getBottom());
                    if (this.f7544fmlbqenlif.contains(motionEvent.getX(), motionEvent.getY()) && !okpsazkaxt(this.f7542ezmngbhpjk.getLeft(), this.f7542ezmngbhpjk.getTop(), this.f7542ezmngbhpjk, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        this.f7532auzgnhcxok = true;
        try {
            if (this.f7605zdlpuopuiu == null) {
                super.onLayout(z13, i13, i14, i15, i16);
                return;
            }
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (this.f7560jlmebxxoox != i17 || this.f7581ribwqtqdhb != i18) {
                uwvvkdfqfp();
                mbcevpiqjq(true);
            }
            this.f7560jlmebxxoox = i17;
            this.f7581ribwqtqdhb = i18;
            this.f7586sopmlzcsov = i17;
            this.f7537crxdokpmqz = i18;
        } finally {
            this.f7532auzgnhcxok = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i13, int i14) {
        if (this.f7605zdlpuopuiu == null) {
            super.onMeasure(i13, i14);
            return;
        }
        boolean z13 = false;
        boolean z14 = (this.f7579pmvmpeiblj == i13 && this.f7608zynmafqrjb == i14) ? false : true;
        if (this.f7562jrbgnlbqoe) {
            this.f7562jrbgnlbqoe = false;
            rlfsiqarku();
            czzsidtyhn();
            z14 = true;
        }
        if (this.mDirtyHierarchy) {
            z14 = true;
        }
        this.f7579pmvmpeiblj = i13;
        this.f7608zynmafqrjb = i14;
        int iYadqdtsiqt = this.f7605zdlpuopuiu.yadqdtsiqt();
        int iRgvfuqvkyq = this.f7605zdlpuopuiu.rgvfuqvkyq();
        if ((z14 || this.f7557ixidwrxhsl.gxszxtbevo(iYadqdtsiqt, iRgvfuqvkyq)) && this.f7536cqumvgiudr != -1) {
            super.onMeasure(i13, i14);
            this.f7557ixidwrxhsl.eablkybsjg(this.mLayoutWidget, this.f7605zdlpuopuiu.gtknphoqwx(iYadqdtsiqt), this.f7605zdlpuopuiu.gtknphoqwx(iRgvfuqvkyq));
            this.f7557ixidwrxhsl.nufgyqmvbu();
            this.f7557ixidwrxhsl.dxjokdxxww(iYadqdtsiqt, iRgvfuqvkyq);
        } else {
            if (z14) {
                super.onMeasure(i13, i14);
            }
            z13 = true;
        }
        if (this.f7577opjhrmiecq || z13) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iJlmebxxoox = this.mLayoutWidget.jlmebxxoox() + getPaddingLeft() + getPaddingRight();
            int iLereixgezr = this.mLayoutWidget.lereixgezr() + paddingTop;
            int i15 = this.f7574nuxfzjnpeb;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                int i16 = this.f7558iyctptxqzt;
                iJlmebxxoox = (int) (i16 + (this.f7583roivzttewh * (this.f7568lrnfpwlwnk - i16)));
                requestLayout();
            }
            int i17 = this.f7588tbqsvytpvh;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                int i18 = this.f7594weqkydbzbr;
                iLereixgezr = (int) (i18 + (this.f7583roivzttewh * (this.f7606zeieaojujs - i18)));
                requestLayout();
            }
            setMeasuredDimension(iJlmebxxoox, iLereixgezr);
        }
        ntlheqmsrt();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z13) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i13) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.ulzqkzuiru(isRtl());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null || !this.f7554istkbnxepw || !ojitshcjhnVar.vipkmwdibw()) {
            return super.onTouchEvent(motionEvent);
        }
        ojitshcjhn.zoijcleaow zoijcleaowVar = this.f7605zdlpuopuiu.f7852ppxfxbqfkf;
        if (zoijcleaowVar != null && !zoijcleaowVar.istkbnxepw()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f7605zdlpuopuiu.stevsuqkhv(motionEvent, getCurrentState(), this);
        if (this.f7605zdlpuopuiu.f7852ppxfxbqfkf.cdpycssgdh(4)) {
            return this.f7605zdlpuopuiu.f7852ppxfxbqfkf.zynmafqrjb().oxmwwwfdhm();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f7571metgxyhuhe;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f7582rlfsiqarku;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void opjhrmiecq(Runnable runnable) {
        hkdspvbjdz(1.0f);
        this.f7540dvvnrvtcbc = runnable;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int i13) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        ojitshcjhn ojitshcjhnVar;
        ojitshcjhn.zoijcleaow zoijcleaowVar;
        if (!this.f7577opjhrmiecq && this.f7541esjtqupxsv == -1 && (ojitshcjhnVar = this.f7605zdlpuopuiu) != null && (zoijcleaowVar = ojitshcjhnVar.f7852ppxfxbqfkf) != null) {
            int iLereixgezr = zoijcleaowVar.lereixgezr();
            if (iLereixgezr == 0) {
                return;
            }
            if (iLereixgezr == 2) {
                int childCount = getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    ((draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i13))).iwizpuwonk();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // v1.lmojexxdyd
    public boolean rgvfuqvkyq(View view, View view2, int i13, int i14) {
        ojitshcjhn.zoijcleaow zoijcleaowVar;
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        return (ojitshcjhnVar == null || (zoijcleaowVar = ojitshcjhnVar.f7852ppxfxbqfkf) == null || zoijcleaowVar.zynmafqrjb() == null || (this.f7605zdlpuopuiu.f7852ppxfxbqfkf.zynmafqrjb().eablkybsjg() & 2) != 0) ? false : true;
    }

    void ribwqtqdhb(int i13, float f13, float f14, float f15, float[] fArr) {
        String resourceName;
        HashMap map = this.f7534cdpycssgdh;
        View viewById = getViewById(i13);
        draadjrbmk draadjrbmkVar = (draadjrbmk) map.get(viewById);
        if (draadjrbmkVar != null) {
            draadjrbmkVar.draadjrbmk(f13, f14, f15, fArr);
            float y13 = viewById.getY();
            this.f7535cllcsxoeiz = f13;
            this.f7539dsvhmnatus = y13;
            return;
        }
        if (viewById == null) {
            resourceName = "" + i13;
        } else {
            resourceName = viewById.getContext().getResources().getResourceName(i13);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + resourceName);
    }

    void rlfsiqarku() {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null) {
            return;
        }
        if (ojitshcjhnVar.lqeggnwhkg(this, this.f7541esjtqupxsv)) {
            requestLayout();
            return;
        }
        int i13 = this.f7541esjtqupxsv;
        if (i13 != -1) {
            this.f7605zdlpuopuiu.gxszxtbevo(this, i13);
        }
        if (this.f7605zdlpuopuiu.vipkmwdibw()) {
            this.f7605zdlpuopuiu.jlmebxxoox();
        }
    }

    public void roivzttewh(int i13, View... viewArr) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.jhduphickx(i13, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    public void setDebugMode(int i13) {
        this.f7597wypolnanlu = i13;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z13) {
        this.f7546grlcpdaxtj = z13;
    }

    public void setInteractionEnabled(boolean z13) {
        this.f7554istkbnxepw = z13;
    }

    public void setInterpolatedProgress(float f13) {
        if (this.f7605zdlpuopuiu != null) {
            setState(gtknphoqwx.MOVING);
            Interpolator interpolatorOxmwwwfdhm = this.f7605zdlpuopuiu.oxmwwwfdhm();
            if (interpolatorOxmwwwfdhm != null) {
                setProgress(interpolatorOxmwwwfdhm.getInterpolation(f13));
                return;
            }
        }
        setProgress(f13);
    }

    public void setOnHide(float f13) {
        ArrayList arrayList = this.f7582rlfsiqarku;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        yggfygwlhe.iobyxmoadg(this.f7582rlfsiqarku.get(0));
        throw null;
    }

    public void setOnShow(float f13) {
        ArrayList arrayList = this.f7571metgxyhuhe;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        yggfygwlhe.iobyxmoadg(this.f7571metgxyhuhe.get(0));
        throw null;
    }

    public void setProgress(float f13) {
        if (f13 < 0.0f || f13 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f7556iwxlajgraz == null) {
                this.f7556iwxlajgraz = new dxjokdxxww();
            }
            this.f7556iwxlajgraz.eablkybsjg(f13);
            return;
        }
        if (f13 <= 0.0f) {
            if (this.f7596wwaezpbzkn == 1.0f && this.f7541esjtqupxsv == this.f7566lereixgezr) {
                setState(gtknphoqwx.MOVING);
            }
            this.f7541esjtqupxsv = this.f7536cqumvgiudr;
            if (this.f7596wwaezpbzkn == 0.0f) {
                setState(gtknphoqwx.FINISHED);
            }
        } else if (f13 >= 1.0f) {
            if (this.f7596wwaezpbzkn == 0.0f && this.f7541esjtqupxsv == this.f7536cqumvgiudr) {
                setState(gtknphoqwx.MOVING);
            }
            this.f7541esjtqupxsv = this.f7566lereixgezr;
            if (this.f7596wwaezpbzkn == 1.0f) {
                setState(gtknphoqwx.FINISHED);
            }
        } else {
            this.f7541esjtqupxsv = -1;
            setState(gtknphoqwx.MOVING);
        }
        if (this.f7605zdlpuopuiu == null) {
            return;
        }
        this.f7547hcddaimhww = true;
        this.f7578pkzmftpjix = f13;
        this.f7567lmojexxdyd = f13;
        this.f7603ylkuphrtab = -1L;
        this.f7599yadqdtsiqt = -1L;
        this.f7602yggfygwlhe = null;
        this.f7561jpowsppfya = true;
        invalidate();
    }

    public void setScene(ojitshcjhn ojitshcjhnVar) {
        this.f7605zdlpuopuiu = ojitshcjhnVar;
        ojitshcjhnVar.ulzqkzuiru(isRtl());
        uwvvkdfqfp();
    }

    void setStartState(int i13) {
        if (isAttachedToWindow()) {
            this.f7541esjtqupxsv = i13;
            return;
        }
        if (this.f7556iwxlajgraz == null) {
            this.f7556iwxlajgraz = new dxjokdxxww();
        }
        this.f7556iwxlajgraz.gxszxtbevo(i13);
        this.f7556iwxlajgraz.wkgbmnqykc(i13);
    }

    void setState(gtknphoqwx gtknphoqwxVar) {
        gtknphoqwx gtknphoqwxVar2 = gtknphoqwx.FINISHED;
        if (gtknphoqwxVar == gtknphoqwxVar2 && this.f7541esjtqupxsv == -1) {
            return;
        }
        gtknphoqwx gtknphoqwxVar3 = this.f7572mhtqkkgtqm;
        this.f7572mhtqkkgtqm = gtknphoqwxVar;
        gtknphoqwx gtknphoqwxVar4 = gtknphoqwx.MOVING;
        if (gtknphoqwxVar3 == gtknphoqwxVar4 && gtknphoqwxVar == gtknphoqwxVar4) {
            ulzqkzuiru();
        }
        int iOrdinal = gtknphoqwxVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && gtknphoqwxVar == gtknphoqwxVar2) {
                sopmlzcsov();
                return;
            }
            return;
        }
        if (gtknphoqwxVar == gtknphoqwxVar4) {
            ulzqkzuiru();
        }
        if (gtknphoqwxVar == gtknphoqwxVar2) {
            sopmlzcsov();
        }
    }

    public void setTransition(int i13) {
        float f13;
        if (this.f7605zdlpuopuiu != null) {
            ojitshcjhn.zoijcleaow zoijcleaowVarIkoacuggdj = ikoacuggdj(i13);
            this.f7536cqumvgiudr = zoijcleaowVarIkoacuggdj.pmvmpeiblj();
            this.f7566lereixgezr = zoijcleaowVarIkoacuggdj.esjtqupxsv();
            if (!isAttachedToWindow()) {
                if (this.f7556iwxlajgraz == null) {
                    this.f7556iwxlajgraz = new dxjokdxxww();
                }
                this.f7556iwxlajgraz.gxszxtbevo(this.f7536cqumvgiudr);
                this.f7556iwxlajgraz.wkgbmnqykc(this.f7566lereixgezr);
                return;
            }
            int i14 = this.f7541esjtqupxsv;
            if (i14 == this.f7536cqumvgiudr) {
                f13 = 0.0f;
            } else {
                f13 = i14 == this.f7566lereixgezr ? 1.0f : Float.NaN;
            }
            this.f7605zdlpuopuiu.crxdokpmqz(zoijcleaowVarIkoacuggdj);
            this.f7557ixidwrxhsl.eablkybsjg(this.mLayoutWidget, this.f7605zdlpuopuiu.gtknphoqwx(this.f7536cqumvgiudr), this.f7605zdlpuopuiu.gtknphoqwx(this.f7566lereixgezr));
            uwvvkdfqfp();
            if (this.f7596wwaezpbzkn != f13) {
                if (f13 == 0.0f) {
                    tzroggbefp(true);
                    this.f7605zdlpuopuiu.gtknphoqwx(this.f7536cqumvgiudr).dxjokdxxww(this);
                } else if (f13 == 1.0f) {
                    tzroggbefp(false);
                    this.f7605zdlpuopuiu.gtknphoqwx(this.f7566lereixgezr).dxjokdxxww(this);
                }
            }
            this.f7596wwaezpbzkn = Float.isNaN(f13) ? 0.0f : f13;
            if (!Float.isNaN(f13)) {
                setProgress(f13);
                return;
            }
            Log.v("MotionLayout", androidx.constraintlayout.motion.widget.iobyxmoadg.zoijcleaow() + " transitionToStart ");
            iyctptxqzt();
        }
    }

    public void setTransitionDuration(int i13) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            ojitshcjhnVar.ntlheqmsrt(i13);
        }
    }

    public void setTransitionListener(btonecajqb btonecajqbVar) {
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f7556iwxlajgraz == null) {
            this.f7556iwxlajgraz = new dxjokdxxww();
        }
        this.f7556iwxlajgraz.lqeggnwhkg(bundle);
        if (isAttachedToWindow()) {
            this.f7556iwxlajgraz.iobyxmoadg();
        }
    }

    protected void sopmlzcsov() {
        int iIntValue;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7592uwvvkdfqfp;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty() && this.f7607zfvoamnweg == -1) {
            this.f7607zfvoamnweg = this.f7541esjtqupxsv;
            if (this.f7604yzdjzghtvl.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList arrayList = this.f7604yzdjzghtvl;
                iIntValue = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
            }
            int i13 = this.f7541esjtqupxsv;
            if (iIntValue != i13 && i13 != -1) {
                this.f7604yzdjzghtvl.add(Integer.valueOf(i13));
            }
        }
        czzsidtyhn();
        Runnable runnable = this.f7540dvvnrvtcbc;
        if (runnable != null) {
            runnable.run();
            this.f7540dvvnrvtcbc = null;
        }
        int[] iArr = this.f7585skhdrjzrfn;
        if (iArr == null || this.f7550igdgnonuha <= 0) {
            return;
        }
        weqkydbzbr(iArr[0]);
        int[] iArr2 = this.f7585skhdrjzrfn;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f7550igdgnonuha--;
    }

    public void tbqsvytpvh(int i13, androidx.constraintlayout.widget.wkgbmnqykc wkgbmnqykcVar) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.mbcevpiqjq(i13, wkgbmnqykcVar);
        }
        nuxfzjnpeb();
        if (this.f7541esjtqupxsv == i13) {
            wkgbmnqykcVar.dxjokdxxww(this);
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(context, this.f7536cqumvgiudr) + "->" + androidx.constraintlayout.motion.widget.iobyxmoadg.ppxfxbqfkf(context, this.f7566lereixgezr) + " (pos:" + this.f7596wwaezpbzkn + " Dpos/Dt:" + this.f7555iwizpuwonk;
    }

    void tzroggbefp(boolean z13) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            draadjrbmk draadjrbmkVar = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i13));
            if (draadjrbmkVar != null) {
                draadjrbmkVar.gxszxtbevo(z13);
            }
        }
    }

    public void uwvvkdfqfp() {
        this.f7557ixidwrxhsl.nufgyqmvbu();
        invalidate();
    }

    public androidx.constraintlayout.widget.wkgbmnqykc vipkmwdibw(int i13) {
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar == null) {
            return null;
        }
        return ojitshcjhnVar.gtknphoqwx(i13);
    }

    public void weqkydbzbr(int i13) {
        if (isAttachedToWindow()) {
            lrnfpwlwnk(i13, -1, -1);
            return;
        }
        if (this.f7556iwxlajgraz == null) {
            this.f7556iwxlajgraz = new dxjokdxxww();
        }
        this.f7556iwxlajgraz.wkgbmnqykc(i13);
    }

    @Override // v1.wwaezpbzkn
    public void wflxmlrfwp(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (this.f7593vipkmwdibw || i13 != 0 || i14 != 0) {
            iArr[0] = iArr[0] + i15;
            iArr[1] = iArr[1] + i16;
        }
        this.f7593vipkmwdibw = false;
    }

    public boolean xrmfcynszj() {
        return this.f7554istkbnxepw;
    }

    public void ydmasvzmpa(int i13, int i14) {
        if (!isAttachedToWindow()) {
            if (this.f7556iwxlajgraz == null) {
                this.f7556iwxlajgraz = new dxjokdxxww();
            }
            this.f7556iwxlajgraz.gxszxtbevo(i13);
            this.f7556iwxlajgraz.wkgbmnqykc(i14);
            return;
        }
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null) {
            this.f7536cqumvgiudr = i13;
            this.f7566lereixgezr = i14;
            ojitshcjhnVar.sopmlzcsov(i13, i14);
            this.f7557ixidwrxhsl.eablkybsjg(this.mLayoutWidget, this.f7605zdlpuopuiu.gtknphoqwx(i13), this.f7605zdlpuopuiu.gtknphoqwx(i14));
            uwvvkdfqfp();
            this.f7596wwaezpbzkn = 0.0f;
            iyctptxqzt();
        }
    }

    public void yfnezrywwk(float f13, float f14) {
        if (!isAttachedToWindow()) {
            if (this.f7556iwxlajgraz == null) {
                this.f7556iwxlajgraz = new dxjokdxxww();
            }
            this.f7556iwxlajgraz.eablkybsjg(f13);
            this.f7556iwxlajgraz.nufgyqmvbu(f14);
            return;
        }
        setProgress(f13);
        setState(gtknphoqwx.MOVING);
        this.f7555iwizpuwonk = f14;
        if (f14 != 0.0f) {
            hkdspvbjdz(f14 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f13 == 0.0f || f13 == 1.0f) {
                return;
            }
            hkdspvbjdz(f13 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void zeieaojujs(int i13, int i14, int i15, int i16) {
        androidx.constraintlayout.widget.btonecajqb btonecajqbVar;
        int iIobyxmoadg;
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null && (btonecajqbVar = ojitshcjhnVar.f7858zoijcleaow) != null && (iIobyxmoadg = btonecajqbVar.iobyxmoadg(this.f7541esjtqupxsv, i13, i14, i15)) != -1) {
            i13 = iIobyxmoadg;
        }
        int i17 = this.f7541esjtqupxsv;
        if (i17 == i13) {
            return;
        }
        if (this.f7536cqumvgiudr == i13) {
            hkdspvbjdz(0.0f);
            if (i16 > 0) {
                this.f7552iozdgvuglv = i16 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f7566lereixgezr == i13) {
            hkdspvbjdz(1.0f);
            if (i16 > 0) {
                this.f7552iozdgvuglv = i16 / 1000.0f;
                return;
            }
            return;
        }
        this.f7566lereixgezr = i13;
        if (i17 != -1) {
            ydmasvzmpa(i17, i13);
            hkdspvbjdz(1.0f);
            this.f7596wwaezpbzkn = 0.0f;
            bfopjjpdmp();
            if (i16 > 0) {
                this.f7552iozdgvuglv = i16 / 1000.0f;
                return;
            }
            return;
        }
        this.f7565kegysxyocb = false;
        this.f7578pkzmftpjix = 1.0f;
        this.f7567lmojexxdyd = 0.0f;
        this.f7596wwaezpbzkn = 0.0f;
        this.f7603ylkuphrtab = getNanoTime();
        this.f7599yadqdtsiqt = getNanoTime();
        this.f7547hcddaimhww = false;
        this.f7602yggfygwlhe = null;
        if (i16 == -1) {
            this.f7552iozdgvuglv = this.f7605zdlpuopuiu.ojitshcjhn() / 1000.0f;
        }
        this.f7536cqumvgiudr = -1;
        this.f7605zdlpuopuiu.sopmlzcsov(-1, this.f7566lereixgezr);
        SparseArray sparseArray = new SparseArray();
        if (i16 == 0) {
            this.f7552iozdgvuglv = this.f7605zdlpuopuiu.ojitshcjhn() / 1000.0f;
        } else if (i16 > 0) {
            this.f7552iozdgvuglv = i16 / 1000.0f;
        }
        int childCount = getChildCount();
        this.f7534cdpycssgdh.clear();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            this.f7534cdpycssgdh.put(childAt, new draadjrbmk(childAt));
            sparseArray.put(childAt.getId(), (draadjrbmk) this.f7534cdpycssgdh.get(childAt));
        }
        this.f7561jpowsppfya = true;
        this.f7557ixidwrxhsl.eablkybsjg(this.mLayoutWidget, null, this.f7605zdlpuopuiu.gtknphoqwx(i13));
        uwvvkdfqfp();
        this.f7557ixidwrxhsl.iobyxmoadg();
        kegysxyocb();
        int width = getWidth();
        int height = getHeight();
        if (this.f7538czzsidtyhn != null) {
            for (int i19 = 0; i19 < childCount; i19++) {
                draadjrbmk draadjrbmkVar = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i19));
                if (draadjrbmkVar != null) {
                    this.f7605zdlpuopuiu.kcexrzcfyt(draadjrbmkVar);
                }
            }
            Iterator it = this.f7538czzsidtyhn.iterator();
            if (it.hasNext()) {
                yggfygwlhe.iobyxmoadg(it.next());
                throw null;
            }
            for (int i23 = 0; i23 < childCount; i23++) {
                draadjrbmk draadjrbmkVar2 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i23));
                if (draadjrbmkVar2 != null) {
                    draadjrbmkVar2.iozdgvuglv(width, height, this.f7552iozdgvuglv, getNanoTime());
                }
            }
        } else {
            for (int i24 = 0; i24 < childCount; i24++) {
                draadjrbmk draadjrbmkVar3 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i24));
                if (draadjrbmkVar3 != null) {
                    this.f7605zdlpuopuiu.kcexrzcfyt(draadjrbmkVar3);
                    draadjrbmkVar3.iozdgvuglv(width, height, this.f7552iozdgvuglv, getNanoTime());
                }
            }
        }
        float fCdpycssgdh = this.f7605zdlpuopuiu.cdpycssgdh();
        if (fCdpycssgdh != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i25 = 0; i25 < childCount; i25++) {
                draadjrbmk draadjrbmkVar4 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i25));
                float fOjitshcjhn = draadjrbmkVar4.ojitshcjhn() + draadjrbmkVar4.agtfadlqog();
                fMin = Math.min(fMin, fOjitshcjhn);
                fMax = Math.max(fMax, fOjitshcjhn);
            }
            for (int i26 = 0; i26 < childCount; i26++) {
                draadjrbmk draadjrbmkVar5 = (draadjrbmk) this.f7534cdpycssgdh.get(getChildAt(i26));
                float fAgtfadlqog = draadjrbmkVar5.agtfadlqog();
                float fOjitshcjhn2 = draadjrbmkVar5.ojitshcjhn();
                draadjrbmkVar5.f7725ojitshcjhn = 1.0f / (1.0f - fCdpycssgdh);
                draadjrbmkVar5.f7703agtfadlqog = fCdpycssgdh - ((((fAgtfadlqog + fOjitshcjhn2) - fMin) * fCdpycssgdh) / (fMax - fMin));
            }
        }
        this.f7567lmojexxdyd = 0.0f;
        this.f7596wwaezpbzkn = 0.0f;
        this.f7561jpowsppfya = true;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i13, int i14, int i15) {
        setState(gtknphoqwx.SETUP);
        this.f7541esjtqupxsv = i13;
        this.f7536cqumvgiudr = -1;
        this.f7566lereixgezr = -1;
        androidx.constraintlayout.widget.ppxfxbqfkf ppxfxbqfkfVar = this.mConstraintLayoutSpec;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.wkgbmnqykc(i13, i14, i15);
            return;
        }
        ojitshcjhn ojitshcjhnVar = this.f7605zdlpuopuiu;
        if (ojitshcjhnVar != null) {
            ojitshcjhnVar.gtknphoqwx(i13).dxjokdxxww(this);
        }
    }

    protected void setTransition(ojitshcjhn.zoijcleaow zoijcleaowVar) {
        this.f7605zdlpuopuiu.crxdokpmqz(zoijcleaowVar);
        setState(gtknphoqwx.SETUP);
        if (this.f7541esjtqupxsv == this.f7605zdlpuopuiu.rgvfuqvkyq()) {
            this.f7596wwaezpbzkn = 1.0f;
            this.f7567lmojexxdyd = 1.0f;
            this.f7578pkzmftpjix = 1.0f;
        } else {
            this.f7596wwaezpbzkn = 0.0f;
            this.f7567lmojexxdyd = 0.0f;
            this.f7578pkzmftpjix = 0.0f;
        }
        this.f7603ylkuphrtab = zoijcleaowVar.cdpycssgdh(1) ? -1L : getNanoTime();
        int iYadqdtsiqt = this.f7605zdlpuopuiu.yadqdtsiqt();
        int iRgvfuqvkyq = this.f7605zdlpuopuiu.rgvfuqvkyq();
        if (iYadqdtsiqt == this.f7536cqumvgiudr && iRgvfuqvkyq == this.f7566lereixgezr) {
            return;
        }
        this.f7536cqumvgiudr = iYadqdtsiqt;
        this.f7566lereixgezr = iRgvfuqvkyq;
        this.f7605zdlpuopuiu.sopmlzcsov(iYadqdtsiqt, iRgvfuqvkyq);
        this.f7557ixidwrxhsl.eablkybsjg(this.mLayoutWidget, this.f7605zdlpuopuiu.gtknphoqwx(this.f7536cqumvgiudr), this.f7605zdlpuopuiu.gtknphoqwx(this.f7566lereixgezr));
        this.f7557ixidwrxhsl.dxjokdxxww(this.f7536cqumvgiudr, this.f7566lereixgezr);
        this.f7557ixidwrxhsl.nufgyqmvbu();
        uwvvkdfqfp();
    }
}
