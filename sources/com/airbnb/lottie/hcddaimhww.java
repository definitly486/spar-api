package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class hcddaimhww extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private Map f20417cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f20418cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f20419cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private Rect f20420crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private final Runnable f20421czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private ulzqkzuiru f20422dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private zoijcleaow f20423esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private boolean f20424hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private boolean f20425hkdspvbjdz;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private boolean f20426ikoacuggdj;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f20427iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private n7.iobyxmoadg f20428istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private boolean f20429iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private Matrix f20430jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private RectF f20431jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private boolean f20432jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f20433jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f20434jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private Bitmap f20435kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ArrayList f20436lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f20437lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private Rect f20438mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private Handler f20439metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private RectF f20440ntlheqmsrt;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private com.airbnb.lottie.iobyxmoadg f20441okpsazkaxt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f20442pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private n7.zoijcleaow f20443pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private RectF f20444ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private Runnable f20445rlfsiqarku;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private Rect f20446sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final Matrix f20447stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private Canvas f20448tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private Paint f20449ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private float f20450uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private Matrix f20451vipkmwdibw;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f20452wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private boolean f20453wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private final Semaphore f20454xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    String f20455yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final v7.lqeggnwhkg f20456yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private r7.ppxfxbqfkf f20457ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private btonecajqb f20458zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private String f20459zynmafqrjb;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private static final boolean f20416yfnezrywwk = false;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private static final List f20415ydmasvzmpa = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private static final Executor f20414sflfametgt = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new v7.eablkybsjg());

    /* JADX INFO: Access modifiers changed from: private */
    interface iobyxmoadg {
        void iobyxmoadg(btonecajqb btonecajqbVar);
    }

    private enum zoijcleaow {
        NONE,
        PLAY,
        RESUME
    }

    public hcddaimhww() {
        v7.lqeggnwhkg lqeggnwhkgVar = new v7.lqeggnwhkg();
        this.f20456yggfygwlhe = lqeggnwhkgVar;
        this.f20433jyumaefscl = true;
        this.f20429iwizpuwonk = false;
        this.f20419cqumvgiudr = false;
        this.f20423esjtqupxsv = zoijcleaow.NONE;
        this.f20436lereixgezr = new ArrayList();
        this.f20437lmojexxdyd = false;
        this.f20452wwaezpbzkn = true;
        this.f20442pkzmftpjix = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f20418cllcsxoeiz = false;
        this.f20422dsvhmnatus = ulzqkzuiru.AUTOMATIC;
        this.f20453wypolnanlu = false;
        this.f20447stevsuqkhv = new Matrix();
        this.f20426ikoacuggdj = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.yadqdtsiqt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20525iobyxmoadg.rlfsiqarku(valueAnimator);
            }
        };
        this.f20434jztzpxfvev = animatorUpdateListener;
        this.f20454xrmfcynszj = new Semaphore(1);
        this.f20421czzsidtyhn = new Runnable() { // from class: com.airbnb.lottie.iozdgvuglv
            @Override // java.lang.Runnable
            public final void run() {
                this.f20468zdlpuopuiu.uwvvkdfqfp();
            }
        };
        this.f20450uwvvkdfqfp = -3.4028235E38f;
        lqeggnwhkgVar.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bfopjjpdmp(float f13, btonecajqb btonecajqbVar) {
        rhgxfdycjh(f13);
    }

    private void cdpycssgdh() {
        if (this.f20448tzroggbefp != null) {
            return;
        }
        this.f20448tzroggbefp = new Canvas();
        this.f20444ribwqtqdhb = new RectF();
        this.f20451vipkmwdibw = new Matrix();
        this.f20430jhduphickx = new Matrix();
        this.f20438mbcevpiqjq = new Rect();
        this.f20440ntlheqmsrt = new RectF();
        this.f20449ulzqkzuiru = new j7.iobyxmoadg();
        this.f20446sopmlzcsov = new Rect();
        this.f20420crxdokpmqz = new Rect();
        this.f20431jlmebxxoox = new RectF();
    }

    private n7.zoijcleaow cllcsxoeiz() {
        n7.zoijcleaow zoijcleaowVar = this.f20443pmvmpeiblj;
        if (zoijcleaowVar != null && !zoijcleaowVar.zoijcleaow(hcddaimhww())) {
            this.f20443pmvmpeiblj = null;
        }
        if (this.f20443pmvmpeiblj == null) {
            this.f20443pmvmpeiblj = new n7.zoijcleaow(getCallback(), this.f20459zynmafqrjb, null, this.f20458zdlpuopuiu.btonecajqb());
        }
        return this.f20443pmvmpeiblj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void czzsidtyhn() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    private void dvvnrvtcbc(RectF rectF, float f13, float f14) {
        rectF.set(rectF.left * f13, rectF.top * f14, rectF.right * f13, rectF.bottom * f14);
    }

    private void esjtqupxsv(Canvas canvas) {
        r7.ppxfxbqfkf ppxfxbqfkfVar = this.f20457ylkuphrtab;
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (ppxfxbqfkfVar == null || btonecajqbVar == null) {
            return;
        }
        this.f20447stevsuqkhv.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.f20447stevsuqkhv.preScale(bounds.width() / btonecajqbVar.zoijcleaow().width(), bounds.height() / btonecajqbVar.zoijcleaow().height());
            this.f20447stevsuqkhv.preTranslate(bounds.left, bounds.top);
        }
        ppxfxbqfkfVar.dxjokdxxww(canvas, this.f20447stevsuqkhv, this.f20442pkzmftpjix);
    }

    private Context hcddaimhww() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private boolean ikoacuggdj() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    private void istkbnxepw(int i13, int i14) {
        Bitmap bitmap = this.f20435kegysxyocb;
        if (bitmap == null || bitmap.getWidth() < i13 || this.f20435kegysxyocb.getHeight() < i14) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.f20435kegysxyocb = bitmapCreateBitmap;
            this.f20448tzroggbefp.setBitmap(bitmapCreateBitmap);
            this.f20426ikoacuggdj = true;
            return;
        }
        if (this.f20435kegysxyocb.getWidth() > i13 || this.f20435kegysxyocb.getHeight() > i14) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f20435kegysxyocb, 0, 0, i13, i14);
            this.f20435kegysxyocb = bitmapCreateBitmap2;
            this.f20448tzroggbefp.setBitmap(bitmapCreateBitmap2);
            this.f20426ikoacuggdj = true;
        }
    }

    private void iwizpuwonk(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void iyctptxqzt(int i13, int i14, btonecajqb btonecajqbVar) {
        yzdjzghtvl(i13, i14);
    }

    private n7.iobyxmoadg jpowsppfya() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f20428istkbnxepw == null) {
            n7.iobyxmoadg iobyxmoadgVar = new n7.iobyxmoadg(getCallback(), null);
            this.f20428istkbnxepw = iobyxmoadgVar;
            String str = this.f20455yadqdtsiqt;
            if (str != null) {
                iobyxmoadgVar.ppxfxbqfkf(str);
            }
        }
        return this.f20428istkbnxepw;
    }

    private void jyumaefscl(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void kcexrzcfyt() {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            return;
        }
        r7.ppxfxbqfkf ppxfxbqfkfVar = new r7.ppxfxbqfkf(this, t7.jyumaefscl.iobyxmoadg(btonecajqbVar), btonecajqbVar.gtknphoqwx(), btonecajqbVar);
        this.f20457ylkuphrtab = ppxfxbqfkfVar;
        if (this.f20432jpowsppfya) {
            ppxfxbqfkfVar.jpowsppfya(true);
        }
        this.f20457ylkuphrtab.kegysxyocb(this.f20452wwaezpbzkn);
    }

    private o7.nufgyqmvbu kegysxyocb() {
        Iterator it = f20415ydmasvzmpa.iterator();
        o7.nufgyqmvbu nufgyqmvbuVarDraadjrbmk = null;
        while (it.hasNext()) {
            nufgyqmvbuVarDraadjrbmk = this.f20458zdlpuopuiu.draadjrbmk((String) it.next());
            if (nufgyqmvbuVarDraadjrbmk != null) {
                break;
            }
        }
        return nufgyqmvbuVarDraadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lrnfpwlwnk(String str, btonecajqb btonecajqbVar) {
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void metgxyhuhe(o7.eablkybsjg eablkybsjgVar, Object obj, w7.ppxfxbqfkf ppxfxbqfkfVar, btonecajqb btonecajqbVar) {
        vdvldrhtss(eablkybsjgVar, obj, ppxfxbqfkfVar);
    }

    private boolean n() {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            return false;
        }
        float f13 = this.f20450uwvvkdfqfp;
        float fDraadjrbmk = this.f20456yggfygwlhe.draadjrbmk();
        this.f20450uwvvkdfqfp = fDraadjrbmk;
        return Math.abs(fDraadjrbmk - f13) * btonecajqbVar.wkgbmnqykc() >= 50.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nuxfzjnpeb(float f13, btonecajqb btonecajqbVar) {
        e(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oipsdeybqn(int i13, btonecajqb btonecajqbVar) {
        fmlbqenlif(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void opjhrmiecq(String str, btonecajqb btonecajqbVar) {
        eslsurpljm(str);
    }

    private boolean oxmwwwfdhm() {
        return this.f20433jyumaefscl || this.f20429iwizpuwonk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void rlfsiqarku(ValueAnimator valueAnimator) {
        if (iozdgvuglv()) {
            invalidateSelf();
            return;
        }
        r7.ppxfxbqfkf ppxfxbqfkfVar = this.f20457ylkuphrtab;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.cllcsxoeiz(this.f20456yggfygwlhe.draadjrbmk());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sflfametgt(int i13, btonecajqb btonecajqbVar) {
        ipoelvxyzq(i13);
    }

    private void uawqvzlxes(Canvas canvas, r7.ppxfxbqfkf ppxfxbqfkfVar) {
        if (this.f20458zdlpuopuiu == null || ppxfxbqfkfVar == null) {
            return;
        }
        cdpycssgdh();
        canvas.getMatrix(this.f20451vipkmwdibw);
        canvas.getClipBounds(this.f20438mbcevpiqjq);
        jyumaefscl(this.f20438mbcevpiqjq, this.f20440ntlheqmsrt);
        this.f20451vipkmwdibw.mapRect(this.f20440ntlheqmsrt);
        iwizpuwonk(this.f20440ntlheqmsrt, this.f20438mbcevpiqjq);
        if (this.f20452wwaezpbzkn) {
            this.f20444ribwqtqdhb.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            ppxfxbqfkfVar.eablkybsjg(this.f20444ribwqtqdhb, null, false);
        }
        this.f20451vipkmwdibw.mapRect(this.f20444ribwqtqdhb);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        dvvnrvtcbc(this.f20444ribwqtqdhb, fWidth, fHeight);
        if (!ikoacuggdj()) {
            RectF rectF = this.f20444ribwqtqdhb;
            Rect rect = this.f20438mbcevpiqjq;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f20444ribwqtqdhb.width());
        int iCeil2 = (int) Math.ceil(this.f20444ribwqtqdhb.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        istkbnxepw(iCeil, iCeil2);
        if (this.f20426ikoacuggdj) {
            this.f20447stevsuqkhv.set(this.f20451vipkmwdibw);
            this.f20447stevsuqkhv.preScale(fWidth, fHeight);
            Matrix matrix = this.f20447stevsuqkhv;
            RectF rectF2 = this.f20444ribwqtqdhb;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f20435kegysxyocb.eraseColor(0);
            ppxfxbqfkfVar.dxjokdxxww(this.f20448tzroggbefp, this.f20447stevsuqkhv, this.f20442pkzmftpjix);
            this.f20451vipkmwdibw.invert(this.f20430jhduphickx);
            this.f20430jhduphickx.mapRect(this.f20431jlmebxxoox, this.f20444ribwqtqdhb);
            iwizpuwonk(this.f20431jlmebxxoox, this.f20420crxdokpmqz);
        }
        this.f20446sopmlzcsov.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f20435kegysxyocb, this.f20446sopmlzcsov, this.f20420crxdokpmqz, this.f20449ulzqkzuiru);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uwvvkdfqfp() {
        r7.ppxfxbqfkf ppxfxbqfkfVar = this.f20457ylkuphrtab;
        if (ppxfxbqfkfVar == null) {
            return;
        }
        try {
            this.f20454xrmfcynszj.acquire();
            ppxfxbqfkfVar.cllcsxoeiz(this.f20456yggfygwlhe.draadjrbmk());
            if (f20416yfnezrywwk && this.f20426ikoacuggdj) {
                if (this.f20439metgxyhuhe == null) {
                    this.f20439metgxyhuhe = new Handler(Looper.getMainLooper());
                    this.f20445rlfsiqarku = new Runnable() { // from class: com.airbnb.lottie.pmvmpeiblj
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20501zdlpuopuiu.czzsidtyhn();
                        }
                    };
                }
                this.f20439metgxyhuhe.post(this.f20445rlfsiqarku);
            }
        } catch (InterruptedException unused) {
        } finally {
            this.f20454xrmfcynszj.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void weqkydbzbr(int i13, btonecajqb btonecajqbVar) {
        krqnebusok(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ydmasvzmpa(btonecajqb btonecajqbVar) {
        iwxlajgraz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yfnezrywwk(btonecajqb btonecajqbVar) {
        roivzttewh();
    }

    private void yggfygwlhe() {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            return;
        }
        this.f20453wypolnanlu = this.f20422dsvhmnatus.wkgbmnqykc(Build.VERSION.SDK_INT, btonecajqbVar.vdvldrhtss(), btonecajqbVar.wflxmlrfwp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zeieaojujs(float f13, btonecajqb btonecajqbVar) {
        b(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zfvoamnweg(String str, btonecajqb btonecajqbVar) {
        ezmngbhpjk(str);
    }

    public void a(final String str) {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.cdpycssgdh
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar2) {
                    this.f20345iobyxmoadg.lrnfpwlwnk(str, btonecajqbVar2);
                }
            });
            return;
        }
        o7.nufgyqmvbu nufgyqmvbuVarDraadjrbmk = btonecajqbVar.draadjrbmk(str);
        if (nufgyqmvbuVarDraadjrbmk != null) {
            krqnebusok((int) nufgyqmvbuVarDraadjrbmk.f72199zoijcleaow);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void ageimvtcrz(com.airbnb.lottie.zoijcleaow zoijcleaowVar) {
        n7.iobyxmoadg iobyxmoadgVar = this.f20428istkbnxepw;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.wkgbmnqykc(zoijcleaowVar);
        }
    }

    public List auzgnhcxok(o7.eablkybsjg eablkybsjgVar) {
        if (this.f20457ylkuphrtab == null) {
            v7.wkgbmnqykc.ppxfxbqfkf("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f20457ylkuphrtab.ppxfxbqfkf(eablkybsjgVar, 0, arrayList, new o7.eablkybsjg(new String[0]));
        return arrayList;
    }

    public void b(final float f13) {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.wwaezpbzkn
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar2) {
                    this.f20521iobyxmoadg.zeieaojujs(f13, btonecajqbVar2);
                }
            });
        } else {
            krqnebusok((int) v7.dxjokdxxww.dxjokdxxww(btonecajqbVar.rgvfuqvkyq(), this.f20458zdlpuopuiu.gxszxtbevo(), f13));
        }
    }

    public void c(boolean z13) {
        if (this.f20432jpowsppfya == z13) {
            return;
        }
        this.f20432jpowsppfya = z13;
        r7.ppxfxbqfkf ppxfxbqfkfVar = this.f20457ylkuphrtab;
        if (ppxfxbqfkfVar != null) {
            ppxfxbqfkfVar.jpowsppfya(z13);
        }
    }

    public void cqumvgiudr(Canvas canvas, Matrix matrix) {
        float fStevsuqkhv;
        float fDraadjrbmk;
        r7.ppxfxbqfkf ppxfxbqfkfVar = this.f20457ylkuphrtab;
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (ppxfxbqfkfVar == null || btonecajqbVar == null) {
            return;
        }
        boolean zIozdgvuglv = iozdgvuglv();
        if (zIozdgvuglv) {
            try {
                this.f20454xrmfcynszj.acquire();
                if (n()) {
                    e(this.f20456yggfygwlhe.draadjrbmk());
                }
            } catch (InterruptedException unused) {
                if (!zIozdgvuglv) {
                    return;
                } else {
                    if ((fStevsuqkhv > fDraadjrbmk ? 1 : (fStevsuqkhv == fDraadjrbmk ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (zIozdgvuglv) {
                    this.f20454xrmfcynszj.release();
                    if (ppxfxbqfkfVar.stevsuqkhv() != this.f20456yggfygwlhe.draadjrbmk()) {
                        f20414sflfametgt.execute(this.f20421czzsidtyhn);
                    }
                }
            }
        }
        if (this.f20453wypolnanlu) {
            canvas.save();
            canvas.concat(matrix);
            uawqvzlxes(canvas, ppxfxbqfkfVar);
            canvas.restore();
        } else {
            ppxfxbqfkfVar.dxjokdxxww(canvas, matrix, this.f20442pkzmftpjix);
        }
        this.f20426ikoacuggdj = false;
    }

    public int crxdokpmqz() {
        return this.f20456yggfygwlhe.getRepeatCount();
    }

    public void d(boolean z13) {
        this.f20424hcddaimhww = z13;
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar != null) {
            btonecajqbVar.iwizpuwonk(z13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        r7.ppxfxbqfkf ppxfxbqfkfVar = this.f20457ylkuphrtab;
        if (ppxfxbqfkfVar == null) {
            return;
        }
        boolean zIozdgvuglv = iozdgvuglv();
        if (zIozdgvuglv) {
            try {
                this.f20454xrmfcynszj.acquire();
            } catch (InterruptedException unused) {
                eablkybsjg.ppxfxbqfkf("Drawable#draw");
                if (!zIozdgvuglv) {
                    return;
                }
                this.f20454xrmfcynszj.release();
                if (ppxfxbqfkfVar.stevsuqkhv() == this.f20456yggfygwlhe.draadjrbmk()) {
                    return;
                }
            } catch (Throwable th2) {
                eablkybsjg.ppxfxbqfkf("Drawable#draw");
                if (zIozdgvuglv) {
                    this.f20454xrmfcynszj.release();
                    if (ppxfxbqfkfVar.stevsuqkhv() != this.f20456yggfygwlhe.draadjrbmk()) {
                        f20414sflfametgt.execute(this.f20421czzsidtyhn);
                    }
                }
                throw th2;
            }
        }
        eablkybsjg.zoijcleaow("Drawable#draw");
        if (zIozdgvuglv && n()) {
            e(this.f20456yggfygwlhe.draadjrbmk());
        }
        if (this.f20419cqumvgiudr) {
            try {
                if (this.f20453wypolnanlu) {
                    uawqvzlxes(canvas, ppxfxbqfkfVar);
                } else {
                    esjtqupxsv(canvas);
                }
            } catch (Throwable th3) {
                v7.wkgbmnqykc.zoijcleaow("Lottie crashed in draw!", th3);
            }
        } else if (this.f20453wypolnanlu) {
            uawqvzlxes(canvas, ppxfxbqfkfVar);
        } else {
            esjtqupxsv(canvas);
        }
        this.f20426ikoacuggdj = false;
        eablkybsjg.ppxfxbqfkf("Drawable#draw");
        if (zIozdgvuglv) {
            this.f20454xrmfcynszj.release();
            if (ppxfxbqfkfVar.stevsuqkhv() == this.f20456yggfygwlhe.draadjrbmk()) {
                return;
            }
            f20414sflfametgt.execute(this.f20421czzsidtyhn);
        }
    }

    public String dsvhmnatus() {
        return this.f20459zynmafqrjb;
    }

    public void e(final float f13) {
        if (this.f20458zdlpuopuiu == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.ylkuphrtab
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20528iobyxmoadg.nuxfzjnpeb(f13, btonecajqbVar);
                }
            });
            return;
        }
        eablkybsjg.zoijcleaow("Drawable#setProgress");
        this.f20456yggfygwlhe.pmvmpeiblj(this.f20458zdlpuopuiu.nufgyqmvbu(f13));
        eablkybsjg.ppxfxbqfkf("Drawable#setProgress");
    }

    public void eslsurpljm(final String str) {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.yggfygwlhe
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar2) {
                    this.f20526iobyxmoadg.opjhrmiecq(str, btonecajqbVar2);
                }
            });
            return;
        }
        o7.nufgyqmvbu nufgyqmvbuVarDraadjrbmk = btonecajqbVar.draadjrbmk(str);
        if (nufgyqmvbuVarDraadjrbmk != null) {
            int i13 = (int) nufgyqmvbuVarDraadjrbmk.f72199zoijcleaow;
            yzdjzghtvl(i13, ((int) nufgyqmvbuVarDraadjrbmk.f72198ppxfxbqfkf) + i13);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void ezmngbhpjk(final String str) {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.istkbnxepw
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar2) {
                    this.f20469iobyxmoadg.zfvoamnweg(str, btonecajqbVar2);
                }
            });
            return;
        }
        o7.nufgyqmvbu nufgyqmvbuVarDraadjrbmk = btonecajqbVar.draadjrbmk(str);
        if (nufgyqmvbuVarDraadjrbmk != null) {
            fmlbqenlif((int) (nufgyqmvbuVarDraadjrbmk.f72199zoijcleaow + nufgyqmvbuVarDraadjrbmk.f72198ppxfxbqfkf));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void f(ulzqkzuiru ulzqkzuiruVar) {
        this.f20422dsvhmnatus = ulzqkzuiruVar;
        yggfygwlhe();
    }

    public void fiwbwshyhd(String str) {
        this.f20455yadqdtsiqt = str;
        n7.iobyxmoadg iobyxmoadgVarJpowsppfya = jpowsppfya();
        if (iobyxmoadgVarJpowsppfya != null) {
            iobyxmoadgVarJpowsppfya.ppxfxbqfkf(str);
        }
    }

    public void fmlbqenlif(final int i13) {
        if (this.f20458zdlpuopuiu == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.jyumaefscl
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20479iobyxmoadg.oipsdeybqn(i13, btonecajqbVar);
                }
            });
        } else {
            this.f20456yggfygwlhe.zynmafqrjb(i13 + 0.99f);
        }
    }

    public void fyldjkxazc(Map map) {
        if (map == this.f20417cdpycssgdh) {
            return;
        }
        this.f20417cdpycssgdh = map;
        invalidateSelf();
    }

    public void g(int i13) {
        this.f20456yggfygwlhe.setRepeatCount(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20442pkzmftpjix;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            return -1;
        }
        return btonecajqbVar.zoijcleaow().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            return -1;
        }
        return btonecajqbVar.zoijcleaow().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void grlcpdaxtj(boolean z13) {
        this.f20429iwizpuwonk = z13;
    }

    public void h(int i13) {
        this.f20456yggfygwlhe.setRepeatMode(i13);
    }

    public int hkdspvbjdz() {
        return (int) this.f20456yggfygwlhe.wflxmlrfwp();
    }

    public boolean hszhottldk(btonecajqb btonecajqbVar) {
        if (this.f20458zdlpuopuiu == btonecajqbVar) {
            return false;
        }
        this.f20426ikoacuggdj = true;
        zdlpuopuiu();
        this.f20458zdlpuopuiu = btonecajqbVar;
        kcexrzcfyt();
        this.f20456yggfygwlhe.lereixgezr(btonecajqbVar);
        e(this.f20456yggfygwlhe.getAnimatedFraction());
        Iterator it = new ArrayList(this.f20436lereixgezr).iterator();
        while (it.hasNext()) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) it.next();
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.iobyxmoadg(btonecajqbVar);
            }
            it.remove();
        }
        this.f20436lereixgezr.clear();
        btonecajqbVar.iwizpuwonk(this.f20424hcddaimhww);
        yggfygwlhe();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void i(boolean z13) {
        this.f20419cqumvgiudr = z13;
    }

    public void igdgnonuha(com.airbnb.lottie.iobyxmoadg iobyxmoadgVar) {
        this.f20441okpsazkaxt = iobyxmoadgVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f20426ikoacuggdj) {
            return;
        }
        this.f20426ikoacuggdj = true;
        if ((!f20416yfnezrywwk || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean iozdgvuglv() {
        return yadqdtsiqt() == com.airbnb.lottie.iobyxmoadg.ENABLED;
    }

    public void ipoelvxyzq(final int i13) {
        if (this.f20458zdlpuopuiu == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.pkzmftpjix
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20499iobyxmoadg.sflfametgt(i13, btonecajqbVar);
                }
            });
        } else {
            this.f20456yggfygwlhe.pmvmpeiblj(i13);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return okpsazkaxt();
    }

    public void iwxlajgraz() {
        if (this.f20457ylkuphrtab == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.zynmafqrjb
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20534iobyxmoadg.ydmasvzmpa(btonecajqbVar);
                }
            });
            return;
        }
        yggfygwlhe();
        if (oxmwwwfdhm() || crxdokpmqz() == 0) {
            if (isVisible()) {
                this.f20456yggfygwlhe.cqumvgiudr();
                this.f20423esjtqupxsv = zoijcleaow.NONE;
            } else {
                this.f20423esjtqupxsv = zoijcleaow.RESUME;
            }
        }
        if (oxmwwwfdhm()) {
            return;
        }
        ipoelvxyzq((int) (ribwqtqdhb() < 0.0f ? mbcevpiqjq() : tzroggbefp()));
        this.f20456yggfygwlhe.gtknphoqwx();
        if (isVisible()) {
            return;
        }
        this.f20423esjtqupxsv = zoijcleaow.NONE;
    }

    public void ixidwrxhsl(String str) {
        this.f20459zynmafqrjb = str;
    }

    public void j(float f13) {
        this.f20456yggfygwlhe.yadqdtsiqt(f13);
    }

    public Typeface jhduphickx(o7.ppxfxbqfkf ppxfxbqfkfVar) {
        Map map = this.f20417cdpycssgdh;
        if (map != null) {
            String strIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg();
            if (map.containsKey(strIobyxmoadg)) {
                return (Typeface) map.get(strIobyxmoadg);
            }
            String strZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
            if (map.containsKey(strZoijcleaow)) {
                return (Typeface) map.get(strZoijcleaow);
            }
            String str = ppxfxbqfkfVar.iobyxmoadg() + "-" + ppxfxbqfkfVar.ppxfxbqfkf();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        n7.iobyxmoadg iobyxmoadgVarJpowsppfya = jpowsppfya();
        if (iobyxmoadgVarJpowsppfya != null) {
            return iobyxmoadgVarJpowsppfya.zoijcleaow(ppxfxbqfkfVar);
        }
        return null;
    }

    public int jlmebxxoox() {
        return this.f20456yggfygwlhe.getRepeatMode();
    }

    public void jrbgnlbqoe(boolean z13) {
        this.f20437lmojexxdyd = z13;
    }

    boolean jztzpxfvev() {
        if (isVisible()) {
            return this.f20456yggfygwlhe.isRunning();
        }
        zoijcleaow zoijcleaowVar = this.f20423esjtqupxsv;
        return zoijcleaowVar == zoijcleaow.PLAY || zoijcleaowVar == zoijcleaow.RESUME;
    }

    public void k(Boolean bool) {
        this.f20433jyumaefscl = bool.booleanValue();
    }

    public void krqnebusok(final int i13) {
        if (this.f20458zdlpuopuiu == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.iwizpuwonk
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20471iobyxmoadg.weqkydbzbr(i13, btonecajqbVar);
                }
            });
        } else {
            this.f20456yggfygwlhe.cdpycssgdh(i13);
        }
    }

    public void l(crxdokpmqz crxdokpmqzVar) {
    }

    public void lereixgezr(boolean z13) {
        if (this.f20427iozdgvuglv == z13) {
            return;
        }
        this.f20427iozdgvuglv = z13;
        if (this.f20458zdlpuopuiu != null) {
            kcexrzcfyt();
        }
    }

    public Bitmap lmojexxdyd(String str) {
        n7.zoijcleaow zoijcleaowVarCllcsxoeiz = cllcsxoeiz();
        if (zoijcleaowVarCllcsxoeiz != null) {
            return zoijcleaowVarCllcsxoeiz.iobyxmoadg(str);
        }
        return null;
    }

    public void lxfrhoxuzk(boolean z13) {
        if (z13 != this.f20418cllcsxoeiz) {
            this.f20418cllcsxoeiz = z13;
            invalidateSelf();
        }
    }

    public void m(boolean z13) {
        this.f20456yggfygwlhe.iozdgvuglv(z13);
    }

    public float mbcevpiqjq() {
        return this.f20456yggfygwlhe.rgvfuqvkyq();
    }

    public void mhtqkkgtqm(ppxfxbqfkf ppxfxbqfkfVar) {
        n7.zoijcleaow zoijcleaowVar = this.f20443pmvmpeiblj;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.wkgbmnqykc(ppxfxbqfkfVar);
        }
    }

    public tzroggbefp ntlheqmsrt() {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar != null) {
            return btonecajqbVar.agtfadlqog();
        }
        return null;
    }

    public boolean o() {
        return this.f20417cdpycssgdh == null && this.f20458zdlpuopuiu.ppxfxbqfkf().ojitshcjhn() > 0;
    }

    public boolean okpsazkaxt() {
        v7.lqeggnwhkg lqeggnwhkgVar = this.f20456yggfygwlhe;
        if (lqeggnwhkgVar == null) {
            return false;
        }
        return lqeggnwhkgVar.isRunning();
    }

    public btonecajqb pkzmftpjix() {
        return this.f20458zdlpuopuiu;
    }

    public boolean pmvmpeiblj() {
        return this.f20427iozdgvuglv;
    }

    public void rhgxfdycjh(final float f13) {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.esjtqupxsv
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar2) {
                    this.f20407iobyxmoadg.bfopjjpdmp(f13, btonecajqbVar2);
                }
            });
        } else {
            this.f20456yggfygwlhe.zynmafqrjb(v7.dxjokdxxww.dxjokdxxww(btonecajqbVar.rgvfuqvkyq(), this.f20458zdlpuopuiu.gxszxtbevo(), f13));
        }
    }

    public float ribwqtqdhb() {
        return this.f20456yggfygwlhe.vdvldrhtss();
    }

    public void roivzttewh() {
        if (this.f20457ylkuphrtab == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.lmojexxdyd
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20491iobyxmoadg.yfnezrywwk(btonecajqbVar);
                }
            });
            return;
        }
        yggfygwlhe();
        if (oxmwwwfdhm() || crxdokpmqz() == 0) {
            if (isVisible()) {
                this.f20456yggfygwlhe.zdlpuopuiu();
                this.f20423esjtqupxsv = zoijcleaow.NONE;
            } else {
                this.f20423esjtqupxsv = zoijcleaow.PLAY;
            }
        }
        if (oxmwwwfdhm()) {
            return;
        }
        o7.nufgyqmvbu nufgyqmvbuVarKegysxyocb = kegysxyocb();
        if (nufgyqmvbuVarKegysxyocb != null) {
            ipoelvxyzq((int) nufgyqmvbuVarKegysxyocb.f72199zoijcleaow);
        } else {
            ipoelvxyzq((int) (ribwqtqdhb() < 0.0f ? mbcevpiqjq() : tzroggbefp()));
        }
        this.f20456yggfygwlhe.gtknphoqwx();
        if (isVisible()) {
            return;
        }
        this.f20423esjtqupxsv = zoijcleaow.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        this.f20442pkzmftpjix = i13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        v7.wkgbmnqykc.ppxfxbqfkf("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z13, boolean z14) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z13, z14);
        if (z13) {
            zoijcleaow zoijcleaowVar = this.f20423esjtqupxsv;
            if (zoijcleaowVar == zoijcleaow.PLAY) {
                roivzttewh();
            } else if (zoijcleaowVar == zoijcleaow.RESUME) {
                iwxlajgraz();
            }
        } else if (this.f20456yggfygwlhe.isRunning()) {
            tbqsvytpvh();
            this.f20423esjtqupxsv = zoijcleaow.RESUME;
        } else if (zIsVisible) {
            this.f20423esjtqupxsv = zoijcleaow.NONE;
        }
        return visible;
    }

    public void skhdrjzrfn(boolean z13) {
        this.f20425hkdspvbjdz = z13;
    }

    public ulzqkzuiru sopmlzcsov() {
        return this.f20453wypolnanlu ? ulzqkzuiru.SOFTWARE : ulzqkzuiru.HARDWARE;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        roivzttewh();
    }

    public boolean stevsuqkhv() {
        return this.f20437lmojexxdyd;
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        zynmafqrjb();
    }

    public void tbqsvytpvh() {
        this.f20436lereixgezr.clear();
        this.f20456yggfygwlhe.kcexrzcfyt();
        if (isVisible()) {
            return;
        }
        this.f20423esjtqupxsv = zoijcleaow.NONE;
    }

    public float tzroggbefp() {
        return this.f20456yggfygwlhe.ojitshcjhn();
    }

    public float ulzqkzuiru() {
        return this.f20456yggfygwlhe.draadjrbmk();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void vdvldrhtss(final o7.eablkybsjg eablkybsjgVar, final Object obj, final w7.ppxfxbqfkf ppxfxbqfkfVar) {
        r7.ppxfxbqfkf ppxfxbqfkfVar2 = this.f20457ylkuphrtab;
        if (ppxfxbqfkfVar2 == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.cqumvgiudr
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20349iobyxmoadg.metgxyhuhe(eablkybsjgVar, obj, ppxfxbqfkfVar, btonecajqbVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eablkybsjgVar == o7.eablkybsjg.f72189ppxfxbqfkf) {
            ppxfxbqfkfVar2.nufgyqmvbu(obj, ppxfxbqfkfVar);
        } else if (eablkybsjgVar.wkgbmnqykc() != null) {
            eablkybsjgVar.wkgbmnqykc().nufgyqmvbu(obj, ppxfxbqfkfVar);
        } else {
            List listAuzgnhcxok = auzgnhcxok(eablkybsjgVar);
            for (int i13 = 0; i13 < listAuzgnhcxok.size(); i13++) {
                ((o7.eablkybsjg) listAuzgnhcxok.get(i13)).wkgbmnqykc().nufgyqmvbu(obj, ppxfxbqfkfVar);
            }
            zIsEmpty = true ^ listAuzgnhcxok.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == dsvhmnatus.f20391yadqdtsiqt) {
                e(ulzqkzuiru());
            }
        }
    }

    public crxdokpmqz vipkmwdibw() {
        return null;
    }

    public void wizcaqwiak(boolean z13) {
        if (z13 != this.f20452wwaezpbzkn) {
            this.f20452wwaezpbzkn = z13;
            r7.ppxfxbqfkf ppxfxbqfkfVar = this.f20457ylkuphrtab;
            if (ppxfxbqfkfVar != null) {
                ppxfxbqfkfVar.kegysxyocb(z13);
            }
            invalidateSelf();
        }
    }

    public boolean wwaezpbzkn() {
        return this.f20418cllcsxoeiz;
    }

    public jpowsppfya wypolnanlu(String str) {
        btonecajqb btonecajqbVar = this.f20458zdlpuopuiu;
        if (btonecajqbVar == null) {
            return null;
        }
        return (jpowsppfya) btonecajqbVar.btonecajqb().get(str);
    }

    public boolean xrmfcynszj() {
        return this.f20425hkdspvbjdz;
    }

    public com.airbnb.lottie.iobyxmoadg yadqdtsiqt() {
        com.airbnb.lottie.iobyxmoadg iobyxmoadgVar = this.f20441okpsazkaxt;
        return iobyxmoadgVar != null ? iobyxmoadgVar : eablkybsjg.wkgbmnqykc();
    }

    public boolean ylkuphrtab() {
        return this.f20452wwaezpbzkn;
    }

    public void yzdjzghtvl(final int i13, final int i14) {
        if (this.f20458zdlpuopuiu == null) {
            this.f20436lereixgezr.add(new iobyxmoadg() { // from class: com.airbnb.lottie.lereixgezr
                @Override // com.airbnb.lottie.hcddaimhww.iobyxmoadg
                public final void iobyxmoadg(btonecajqb btonecajqbVar) {
                    this.f20488iobyxmoadg.iyctptxqzt(i13, i14, btonecajqbVar);
                }
            });
        } else {
            this.f20456yggfygwlhe.istkbnxepw(i13, i14 + 0.99f);
        }
    }

    public void zdlpuopuiu() {
        if (this.f20456yggfygwlhe.isRunning()) {
            this.f20456yggfygwlhe.cancel();
            if (!isVisible()) {
                this.f20423esjtqupxsv = zoijcleaow.NONE;
            }
        }
        this.f20458zdlpuopuiu = null;
        this.f20457ylkuphrtab = null;
        this.f20443pmvmpeiblj = null;
        this.f20450uwvvkdfqfp = -3.4028235E38f;
        this.f20456yggfygwlhe.nufgyqmvbu();
        invalidateSelf();
    }

    public void zynmafqrjb() {
        this.f20436lereixgezr.clear();
        this.f20456yggfygwlhe.gtknphoqwx();
        if (isVisible()) {
            return;
        }
        this.f20423esjtqupxsv = zoijcleaow.NONE;
    }
}
